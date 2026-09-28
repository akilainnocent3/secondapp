package defpackage;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes8.dex */
public final class ejd {

    public interface a {
        c a();
    }

    public interface b {
        c a();
    }

    public static final class c {
        public final wtr a;
        public final qmc b;

        public c(wtr wtrVar, qmc qmcVar) {
            this.a = wtrVar;
            this.b = qmcVar;
        }
    }

    public static all a(fq0 fq0Var, r8i0.c cVar) {
        c cVarA = ((a) jm2.a(fq0Var, a.class)).a();
        wtr wtrVar = cVarA.a;
        cVar.getClass();
        return new all(wtrVar, cVar, cVarA.b);
    }

    public static all b(Fragment fragment, r8i0.c cVar) {
        c cVarA = ((b) jm2.a(fragment, b.class)).a();
        wtr wtrVar = cVarA.a;
        cVar.getClass();
        return new all(wtrVar, cVar, cVarA.b);
    }
}
