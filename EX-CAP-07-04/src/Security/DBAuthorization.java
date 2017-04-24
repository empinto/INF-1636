package Security;

import Validation.*;

public class DBAuthorization {
	
	static IAuthorization[] list;
	
	public static IAuthorization getAuthorization(int code) {
		if (list == null)
			return null;
		
		for (int i = 0; i < list.length; i++) {
			if (list[i].getCode() != code)
				continue;
			
			return list[i];
		}
		
		return null;
	}
	
	public static void carregaBD() {
		list = new IAuthorization[5];
		list[0] = new Authorization(1111, "aaaa");
		list[1] = new Authorization(2222, "bbbb");
		list[2] = new Authorization(3333, "cccc");
		list[3] = new Authorization(4444, "dddd");
		list[4] = new Authorization(5555, "eeee");
	}
}
