package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bkg0 {
    public static final bkg0 b;
    public final pcn<a> a;

    public static final class a {
        public final int a;
        public final jjg0 b;
        public final boolean c;
        public final int[] d;
        public final boolean[] e;

        static {
            jrh0.J(0);
            jrh0.J(1);
            jrh0.J(3);
            jrh0.J(4);
        }

        public a(jjg0 jjg0Var, boolean z, int[] iArr, boolean[] zArr) {
            int i = jjg0Var.a;
            this.a = i;
            boolean z2 = false;
            ly0.b(i == iArr.length && i == zArr.length);
            this.b = jjg0Var;
            if (z && i > 1) {
                z2 = true;
            }
            this.c = z2;
            this.d = (int[]) iArr.clone();
            this.e = (boolean[]) zArr.clone();
        }

        public final boolean a(int i) {
            return this.d[i] == 4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.b.equals(aVar.b) && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.e, aVar.e);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        pcn.b bVar = pcn.b;
        b = new bkg0(c150.e);
        jrh0.J(0);
    }

    public bkg0(c150 c150Var) {
        this.a = pcn.j(c150Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            pcn<a> pcnVar = this.a;
            if (i2 >= pcnVar.size()) {
                return false;
            }
            a aVar = pcnVar.get(i2);
            for (boolean z : aVar.e) {
                if (z) {
                    if (aVar.b.c != i) {
                        break;
                    }
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bkg0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((bkg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
