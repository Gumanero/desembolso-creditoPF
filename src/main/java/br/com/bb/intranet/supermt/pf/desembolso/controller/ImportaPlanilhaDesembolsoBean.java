/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bb.intranet.supermt.pf.desembolso.controller;

import br.com.bb.intranet.supermt.pf.desembolso.service.ImportaDados;
import br.com.bb.intranet.supermt.pf.desembolso.service.NegocioException;
import br.com.bb.intranet.supermt.pf.desembolso.service.Planilha;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author Olliver
 */
@Named(value = "importaDadosPlanilha")
@ViewScoped
public class ImportaPlanilhaDesembolsoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private ImportaDados importa;
    private Planilha planilha;

    public void preparaPlanilha() {
        this.planilha = new Planilha();
    }

    public void processaPlanilha(FileUploadEvent event) {
        try {

            planilha.setFile(event.getFile().getInputstream());

            System.out.println(planilha.toString());
            this.importa.processaPlanilha(planilha);

            //CHAMAR O METODO PRA PERSISTIR A TABELA
            FacesMessage message = new FacesMessage("Tudo Certo!", "Os dados foram armazenados.");
            FacesContext.getCurrentInstance().addMessage(null, message);

        } catch (NegocioException ex) {
            FacesMessage message = new FacesMessage(ex.getMessage());
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext.getCurrentInstance().addMessage(null, message);

        } catch (IOException ex) {
            FacesMessage message = new FacesMessage(ex.getMessage());
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }

    public Planilha getPlanilha() {
        return planilha;
    }

    public void setPlanilha(Planilha planilha) {
        this.planilha = planilha;
    }

    
    
    
}
