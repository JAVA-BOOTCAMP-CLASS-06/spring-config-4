package dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import beans.MessageBean;
import dao.SampleDAO;

@Repository
@Qualifier("dao2")
public class SampleDAOImpl2 implements SampleDAO {

	@Autowired
	private MessageBean data;
	
	public MessageBean loadData() {
		System.out.println("[DAO] - Obteniendo datos de BD");
		return data;
	}

}
