package dip.bad;

public class UserService {

    UserDAO dao;

    public UserService(UserDAO userdao){//se injecta el DAO que convenga
        this.dao=userdao;

    }// tipo concreto - alto acoplamiento
    
    void findOne(Long id) {
    	
    	// dao.findOne(Long id);
    	
    }
}
