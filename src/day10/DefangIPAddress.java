package day10;

// 1108. Defanging an IP Address
public class DefangIPAddress {
	
	public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (char c : address.toCharArray()) {
            if (c == '.') {
                sb.append('[').append(c).append(']');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
	

}
