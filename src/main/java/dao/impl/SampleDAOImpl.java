package dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import beans.MessageBean;
import dao.SampleDAO;

@Repository
@Qualifier("dao1")
public class SampleDAOImpl implements SampleDAO {

	@Autowired
	private MessageBean data;
	
	public SampleDAOImpl(MessageBean data) {
		this.data = data;
	}
	
	public MessageBean loadData() {
		System.out.println("[DAO 1] - Obteniendo datos de BD");
		return data;
	}

}
