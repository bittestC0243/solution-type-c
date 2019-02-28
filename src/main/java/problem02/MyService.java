package problem02;

public class MyService extends BaseService {

	public String afternoon() {
		return null;
	}
	
//	@Override
//	public void service(String state) {
//		// TODO Auto-generated method stub
//		super.service(state);		
//	}
	
	@Override
	public String day() {
		return super.day()+ "서비스시작";
	}
	
	@Override
	public String night() {		
//			
		return super.night() + "서비스시작";
	}
	
}
