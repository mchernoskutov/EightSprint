package ya.practikum.account;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length()<3 || name.length()>19) {
            return false;
        } else {
                List<String> nameList = new ArrayList<>();
                int spaceCount = 0;
                for (int i=0; i<name.length(); i++) {
                    nameList.add(name.substring(i,i+1));
                    if (nameList.get(i).equals(" ")) {
                        spaceCount++;
                    }
                }

                if (nameList.get(0).equals(" ") || spaceCount!=1 || nameList.get(nameList.size()-1).equals(" ") ) {
                    return false;
                } else {
                    return true;
                }
            }
    }
}
