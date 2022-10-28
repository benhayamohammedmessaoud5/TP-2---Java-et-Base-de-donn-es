package daaw;

import java.util.ArrayList;

public class Control {

	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
//		User myUser = new User("zak","zak","Oran","0777889966","zak","123");
//		
		UserDAO myDAO = new UserDAO();
//		
//		try {
//			
//			myDAO.addUser(myUser);
//			
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		User myUser = new User();
//		myUser = myDAO.getUser(1);
//		
//		System.out.println(myUser.getFirstname());
//		System.out.println(myUser.getLastname());
//		System.out.println(myUser.getAdress());
//		System.out.println(myUser.getPhone());
		
		
		ArrayList<User> usersList = new ArrayList<User>();
		
		usersList = myDAO.getUsers();
		
		for(int i = 0 ; i < usersList.size(); i++)
			   System.out.println(usersList.get(i).getFirstname()+"  "+usersList.get(i).getLastname());

	}

}
