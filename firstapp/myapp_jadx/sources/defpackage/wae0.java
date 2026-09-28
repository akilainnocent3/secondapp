package defpackage;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.text.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class wae0 extends f {
    public static ArrayList C(int i, String str) {
        str.getClass();
        sqi.b(i, i);
        int length = str.length();
        int i2 = 0;
        ArrayList arrayList = new ArrayList((length / i) + (length % i == 0 ? 0 : 1));
        while (i2 >= 0 && i2 < length) {
            int i3 = i2 + i;
            CharSequence charSequenceSubSequence = str.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3);
            charSequenceSubSequence.getClass();
            arrayList.add(charSequenceSubSequence.toString());
            i2 = i3;
        }
        return arrayList;
    }

    public static String D(int i, String str) {
        str.getClass();
        if (i < 0) {
            kb5.a(pe4.b(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static String E(String str) {
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return K(length, str);
    }

    public static char F(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        ibh0.a("Char sequence is empty.");
        return (char) 0;
    }

    public static Character G(String str) {
        str.getClass();
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static Character H(CharSequence charSequence) {
        charSequence.getClass();
        if (1 < charSequence.length()) {
            return Character.valueOf(charSequence.charAt(1));
        }
        return null;
    }

    public static char I(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        ibh0.a("Char sequence is empty.");
        return (char) 0;
    }

    public static Character J(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static String K(int i, String str) {
        str.getClass();
        if (i < 0) {
            kb5.a(pe4.b(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static String L(int i, String str) {
        str.getClass();
        if (i < 0) {
            kb5.a(pe4.b(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(length - i);
    }
}
