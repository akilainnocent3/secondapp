package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class wcn {
    public static final wcn c;
    public static final wcn d;
    public final String a;
    public final byte b;

    static {
        wcn[] wcnVarArr = new wcn[256];
        for (int i = 0; i < 256; i++) {
            wcnVarArr[i] = new wcn((byte) i);
        }
        c = wcnVarArr[0];
        d = wcnVarArr[1];
    }

    public wcn(byte b) {
        char[] cArr = new char[2];
        l3z.b(b, cArr, 0);
        this.a = new String(cArr);
        this.b = b;
    }

    public final String toString() {
        return this.a;
    }
}
