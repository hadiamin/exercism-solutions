class ReverseString {

    String reverse(String inputString) {
        int stringLength = inputString.length() - 1;
        StringBuilder reversedString = new StringBuilder();
        for (int string = stringLength; string >= 0; string--) {
            reversedString.append(inputString.charAt(string));
        }
        return reversedString.toString();
    }

}
