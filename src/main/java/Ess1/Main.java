package Ess1;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");

        Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.JUNE, 18);  // 18 giugno 2000
        info.DataDiNascita(cal.getTime());

        InfoAdapter adapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(adapter);

        System.out.println(userData);
    }
}

