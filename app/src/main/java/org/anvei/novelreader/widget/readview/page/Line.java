package org.anvei.novelreader.widget.readview.page;

import java.util.ArrayList;
import java.util.List;

public class Line {

    private final List<Character> charList;

    private boolean isParaEndLine = false;       // 是否为段落最后一行

    public Line() {
        charList = new ArrayList<>();
    }

    public Character get(int index) {
        return charList.get(index);
    }

    public void set(int index, Character aChar) {
        charList.set(index, aChar);
    }

    public void add(Character ch) {
        charList.add(ch);
    }

    public void add(String string) {
        for (int i = 0; i < string.length(); i++) {
            Character ch = (char) i;
            add(ch);
        }
    }
    private String lineStr = null;
    public String getLineStr() {
        if (lineStr == null) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Character c : charList) {
                stringBuilder.append(c);
            }
            lineStr = stringBuilder.toString();
        }
        return lineStr;
    }

    public int size() {
        return charList.size();
    }

    public boolean isParaEndLine() {
        return isParaEndLine;
    }

    public void setIsParaEndLine(boolean paraEndLine) {
        isParaEndLine = paraEndLine;
    }
}
