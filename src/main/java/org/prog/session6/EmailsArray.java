package org.prog.session6;

public class EmailsArray {

    // TODO: from these emails, print only valid ones:
// String[] emails = new String[]{"test"};
// only one @
// at least 3 symbols before @
// at least one dot (.) after @
// @ and . must not be next to each other
// at least 5 symbols after @


    public static void main(String[] args) {

        String[] emails = new String[]{
                "test@test.com",
                "ab@bcde.com",
                "fgh@.bheg",
                "kkl@@malinator.com",
                "kool.mail.com",
                "some@email.com"
        };

        for (String email : emails) {

            boolean valid = true;

            int at = email.indexOf("@");
            int dot = email.indexOf(".");

            if (at == -1) {
                valid = false;
            }

            if (at < 3) {
                valid = false;
            }

            if (at != -1 && at != email.lastIndexOf("@")) {
                valid = false;
            }

            if (at != -1 && (dot == -1 || dot < at)) {
                valid = false;
            }

            if (at != -1 && dot == at + 1) {
                valid = false;
            }

            if (at != -1 && email.length() - at - 1 < 5) {
                valid = false;
            }

            if (valid) {
                System.out.println(email);
            }



        }
    }
}
