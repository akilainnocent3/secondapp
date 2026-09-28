package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class iae0 {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    @Deprecated
    public static String a(String str, String str2, String str3) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || str3 == null) {
            return str;
        }
        kae0.a aVar = kae0.a;
        int i = 0;
        int iA = aVar.a(str, str2, 0);
        if (iA == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
        int i2 = -1;
        while (iA != -1) {
            sb.append((CharSequence) str, i, iA);
            sb.append(str3);
            i = iA + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            iA = aVar.a(str, str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }
}
