package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class le50 {
    public static final /* synthetic */ int a = 0;

    public static dwz a(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        str.getClass();
        boolean z5 = str.length() >= 8;
        boolean z6 = str.length() <= 64;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = false;
                break;
            }
            if (Character.isDigit(str.charAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                z2 = false;
                break;
            }
            if (Character.isUpperCase(str.charAt(i2))) {
                z2 = true;
                break;
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= str.length()) {
                z3 = false;
                break;
            }
            if (Character.isLowerCase(str.charAt(i3))) {
                z3 = true;
                break;
            }
            i3++;
        }
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (!Character.isDigit(cCharAt) && !Character.isLetter(cCharAt)) {
                z4 = true;
                return new dwz(z5, z6, z, z2, z3, z4, 8, 64);
            }
        }
        z4 = false;
        return new dwz(z5, z6, z, z2, z3, z4, 8, 64);
    }
}
