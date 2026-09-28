package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class od9 {
    public static final op8 a = new op8(-56881574, new nd9(), false);

    public static String a(int i, String str) {
        str.getClass();
        if (i <= 0) {
            hb5.a("groupSize must be positive");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder((string.length() / i) + string.length());
        int i4 = 0;
        while (i2 < string.length()) {
            char cCharAt2 = string.charAt(i2);
            int i5 = i4 + 1;
            if (i4 > 0 && i4 % i == 0) {
                sb2.append(' ');
            }
            sb2.append(cCharAt2);
            i2++;
            i4 = i5;
        }
        return sb2.toString();
    }

    public static /* synthetic */ String b(od9 od9Var, String str) {
        od9Var.getClass();
        return a(4, str);
    }
}
