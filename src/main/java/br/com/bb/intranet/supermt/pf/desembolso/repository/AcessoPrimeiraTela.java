package br.com.bb.intranet.supermt.pf.desembolso.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import br.com.bb.intranet.supermt.pf.desembolso.model.DesembolsoCreditoPFeContatos;

public class AcessoPrimeiraTela implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	@SuppressWarnings("unchecked")
	public List<DesembolsoCreditoPFeContatos> filtrados(FiltroPrimeiraTela filtro) {
		Criteria criteria = criarCriteriaParaFiltro(filtro);

		criteria.setFirstResult(filtro.getPrimeiroRegistro());
		criteria.setMaxResults(filtro.getQuantidadeRegistros());

		if (filtro.isAscendente() && filtro.getPropriedadeOrdenacao() != null) {
			criteria.addOrder(Order.asc(filtro.getPropriedadeOrdenacao()));
		} else if (filtro.getPropriedadeOrdenacao() != null) {
			criteria.addOrder(Order.desc(filtro.getPropriedadeOrdenacao()));
		}

		return criteria.list();
	}

	public int quantidadeFiltraods(FiltroPrimeiraTela filtro) {
		Criteria criteria = criarCriteriaParaFiltro(filtro);

		criteria.setProjection(Projections.rowCount());

		return ((Number) criteria.uniqueResult()).intValue();
	}

	private Criteria criarCriteriaParaFiltro(FiltroPrimeiraTela filtro) {
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(DesembolsoCreditoPFeContatos.class);

		if (this.comparaGrupo(filtro.getGrupo())) {
			criteria.add(Restrictions.ilike("grupo", filtro.getGrupo()));
		}

		return criteria;
	}

	private boolean comparaGrupo(char caracter) {
		caracter = Character.toUpperCase(caracter);

		return caracter == 'A' || caracter == 'B' || caracter == 'C' || caracter == 'D';
	}

}
