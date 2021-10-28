package ass06;

public class PasswordMain {
    public static void main(String[] args) {
        PasswordInfo info;
        PasswordDAO passwordDAO = new PasswordDAOImpl();

        System.out.println("--- inserting...");
        info = new PasswordInfo("https://www.smu.ac.kr", "smu", "abcde");
        passwordDAO.insert(info);

        info = new PasswordInfo("https://www.smu2.ac.kr", "smu2", "abcde");
        passwordDAO.insert(info);

        System.out.println("--- finding all...");
        for (PasswordInfo p : passwordDAO.findAll()) {
            System.out.println("reading... " + p);
        }

        System.out.println("--- updating...");
        info = passwordDAO.findAll().get(1);
        info.setId("smu1");
        passwordDAO.update(info);

        System.out.println("--- see if updated...");
        info = passwordDAO.findAll().get(1);
        if (info != null) {
            System.out.println(info);
        }

        System.out.println("--- deleting...");
        passwordDAO.delete("https://www.smu2.ac.kr");

        System.out.println("--- finding all...");
        for (PasswordInfo p : passwordDAO.findAll()) {
            System.out.println("reading... " + p);
        }
    }
}
