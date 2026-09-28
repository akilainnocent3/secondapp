package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class lta0 {
    public static final int a(String str) {
        str.getClass();
        int i = 0;
        if (str.length() == 0) {
            return 0;
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        characterInstance.first();
        while (characterInstance.next() != -1) {
            i++;
        }
        return i;
    }
}
