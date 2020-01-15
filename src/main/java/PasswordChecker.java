public class PasswordChecker {
        boolean existence = true, longer = true, lowerCase = true, upperCase = true, digit = true, character = true;

        int c = 6;

        PasswordValidation validations = new PasswordValidation();

        void passwordIsValid (String password){

            if (!validations.existence(password)) {
                System.out.println("1. Password should exist.");
                existence = false;
                c--;
            }
            if (!validations.longer(password)) {
                System.out.println("2. Password should be longer than than 8 characters.");
                longer = false;
                c--;
            }
            if (!validations.lowerCase(password)) {
                System.out.println("3. Password should have at least one lowercase letter.");
                lowerCase = false;
                c--;
            }
            if (!validations.upperCase(password)) {
                System.out.println("4. Password should have at least one uppercase letter.");
                upperCase = false;
                c--;
            }
            if (!validations.digit(password)) {
                System.out.println("5. Password should have at least have one digit.");
                digit = false;
                c--;
            }
            if (!validations.character(password)) {
                System.out.println("6. Password should have at least one special character.");
                character = false;
                c--;
            }
            if (existence && longer && lowerCase && upperCase && digit && character) {
                System.out.println("Password meets all the minimum requirements.");
            }
        }

        boolean passwordIsOk () {

            boolean results = true;
            if (c < 3) {
                results = false;
            }
            return results;
        }

    }
