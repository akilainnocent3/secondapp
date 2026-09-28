package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class snf0 {
    public final mw0<b> a = new mw0<>();
    public final mw0<c> b = new mw0<>();

    public interface a<T> {
        void a(T t);
    }

    public static class b {
        public ckh a;
        public oc0 b;
        public int c = 1;
    }

    public static class c {
        public b a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public float g;
        public float h;
        public int i;
        public int j;
        public int k;
        public boolean l;
        public int m = -1;
    }

    public static int a(String str, String[] strArr) {
        int iIndexOf;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.length() != 0 && (iIndexOf = strTrim.indexOf(58)) != -1) {
                strArr[0] = strTrim.substring(0, iIndexOf).trim();
                int i = 1;
                int i2 = iIndexOf + 1;
                while (true) {
                    int iIndexOf2 = strTrim.indexOf(44, i2);
                    if (iIndexOf2 == -1) {
                        strArr[i] = strTrim.substring(i2).trim();
                        return i;
                    }
                    strArr[i] = strTrim.substring(i2, iIndexOf2).trim();
                    i2 = iIndexOf2 + 1;
                    if (i == 4) {
                        return 4;
                    }
                    i++;
                }
            }
        }
        return 0;
    }
}
