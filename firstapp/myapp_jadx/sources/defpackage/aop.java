package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aop {
    public static rbn a;

    public static final rbn a() {
        rbn rbnVar = a;
        if (rbnVar != null) {
            return rbnVar;
        }
        rbn.a aVar = new rbn.a("Rounded.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        m2g m2gVar = lwh0.a;
        soa0 soa0Var = new soa0(j58.b);
        fxz fxzVar = new fxz();
        fxzVar.f(8.12f, 9.29f);
        fxzVar.d(12.0f, 13.17f);
        fxzVar.e(3.88f, -3.88f);
        fxzVar.b(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        fxzVar.b(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        fxzVar.e(-4.59f, 4.59f);
        fxzVar.b(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        fxzVar.d(6.7f, 10.7f);
        fxzVar.b(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        fxzVar.b(0.39f, -0.38f, 1.03f, -0.39f, 1.42f, 0.0f);
        fxzVar.a();
        rbn.a.a(aVar, fxzVar.a, soa0Var);
        rbn rbnVarB = aVar.b();
        a = rbnVarB;
        return rbnVarB;
    }
}
