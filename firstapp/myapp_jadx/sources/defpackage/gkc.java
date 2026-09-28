package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gkc {
    public String a;
    public int b;
    public int c;
    public float d;

    public final String toString() {
        String strA = j26.a(new StringBuilder(), this.a, ':');
        switch (this.b) {
            case 900:
                return strA + this.c;
            case 901:
                return strA + this.d;
            case 902:
                String str = "00000000" + Integer.toHexString(this.c);
                return strA.concat("#".concat(str.substring(str.length() - 8)));
            case 903:
                return strA.concat("null");
            default:
                return strA.concat("????");
        }
    }
}
