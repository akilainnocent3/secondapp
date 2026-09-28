package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ct7 {
    public static rbn a;

    public static final rbn a() {
        rbn rbnVar = a;
        if (rbnVar != null) {
            return rbnVar;
        }
        rbn.a aVar = new rbn.a("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        m2g m2gVar = lwh0.a;
        soa0 soa0Var = new soa0(j58.b);
        fxz fxzVar = new fxz();
        fxzVar.f(19.0f, 6.41f);
        fxzVar.d(17.59f, 5.0f);
        fxzVar.d(12.0f, 10.59f);
        fxzVar.d(6.41f, 5.0f);
        fxzVar.d(5.0f, 6.41f);
        fxzVar.d(10.59f, 12.0f);
        fxzVar.d(5.0f, 17.59f);
        fxzVar.d(6.41f, 19.0f);
        fxzVar.d(12.0f, 13.41f);
        fxzVar.d(17.59f, 19.0f);
        fxzVar.d(19.0f, 17.59f);
        fxzVar.d(13.41f, 12.0f);
        fxzVar.a();
        rbn.a.a(aVar, fxzVar.a, soa0Var);
        rbn rbnVarB = aVar.b();
        a = rbnVarB;
        return rbnVarB;
    }
}
