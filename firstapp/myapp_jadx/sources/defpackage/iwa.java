package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwa {
    public final im5 a;
    public int b;
    public final int c;
    public int d;

    public static final class a {
        public final Object a;
        public final int b;
        public final ftr c;

        public a(Object obj, int i, ftr ftrVar) {
            this.a = obj;
            this.b = i;
            this.c = ftrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "HorizontalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
        }
    }

    public static final class b {
        public final Object a;
        public final int b;
        public final ftr c;

        public b(Object obj, int i, ftr ftrVar) {
            this.a = obj;
            this.b = i;
            this.c = ftrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "VerticalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
        }
    }

    public iwa(int i) {
        new ArrayList();
        this.a = new im5(new char[0]);
        this.c = 1000;
        this.d = 1000;
    }

    public final im5 a(ftr ftrVar) throws jm5 {
        String string = ftrVar.a().toString();
        im5 im5Var = this.a;
        fm5 fm5VarN = im5Var.n(string);
        if ((fm5VarN instanceof im5 ? (im5) fm5VarN : null) == null) {
            im5Var.t(string, new im5(new char[0]));
        }
        fm5 fm5VarK = im5Var.k(string);
        if (fm5VarK instanceof im5) {
            return (im5) fm5VarK;
        }
        StringBuilder sbA = he.a("no object found for key <", string, ">, found [");
        sbA.append(fm5VarK.e());
        sbA.append("] : ");
        sbA.append(fm5VarK);
        throw new jm5(sbA.toString(), im5Var);
    }

    public final void b(ftr[] ftrVarArr) throws jm5 {
        int i = this.d;
        this.d = i + 1;
        pjm pjmVar = new pjm(Integer.valueOf(i));
        cm5 cm5Var = new cm5(new char[0]);
        for (ftr ftrVar : ftrVarArr) {
            Object obj = ftrVar.b.get(jq40.a(fw6.class).k());
            if (!(obj instanceof fw6)) {
                obj = null;
            }
            if (((fw6) obj) != null) {
                new ArrayList().add(lm5.h(ftrVar.a().toString()));
                throw null;
            }
            cm5Var.h(lm5.h(ftrVar.a().toString()));
        }
        cm5 cm5Var2 = new cm5(new char[0]);
        cm5Var2.h(lm5.h("packed"));
        cm5Var2.h(new hm5(0.5f));
        im5 im5VarA = a(pjmVar);
        im5VarA.w("hChain");
        im5VarA.t("contains", cm5Var);
        im5VarA.t("style", cm5Var2);
        c(16);
        for (ftr ftrVar2 : ftrVarArr) {
            c(ftrVar2.hashCode());
        }
        c(iw6.a.hashCode());
    }

    public final void c(int i) {
        this.b = ((this.b * 1009) + i) % 1000000007;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwa)) {
            return false;
        }
        return Intrinsics.g(this.a, ((iwa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
