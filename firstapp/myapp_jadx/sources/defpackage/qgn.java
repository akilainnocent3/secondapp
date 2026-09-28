package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qgn {
    public static rbn a;

    public static final rbn a() {
        rbn rbnVar = a;
        if (rbnVar != null) {
            return rbnVar;
        }
        rbn.a aVar = new rbn.a("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        m2g m2gVar = lwh0.a;
        soa0 soa0Var = new soa0(j58.b);
        fxz fxzVar = new fxz();
        fxzVar.f(12.0f, 2.0f);
        qxz.c cVar = new qxz.c(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        ArrayList<qxz> arrayList = fxzVar.a;
        arrayList.add(cVar);
        fxzVar.g(4.48f, 10.0f, 10.0f, 10.0f);
        fxzVar.g(10.0f, -4.48f, 10.0f, -10.0f);
        arrayList.add(new qxz.h(17.52f, 2.0f, 12.0f, 2.0f));
        fxzVar.a();
        fxzVar.f(13.0f, 17.0f);
        fxzVar.c(-2.0f);
        fxzVar.h(-6.0f);
        fxzVar.c(2.0f);
        fxzVar.h(6.0f);
        fxzVar.a();
        fxzVar.f(13.0f, 9.0f);
        fxzVar.c(-2.0f);
        fxzVar.d(11.0f, 7.0f);
        fxzVar.c(2.0f);
        fxzVar.h(2.0f);
        fxzVar.a();
        rbn.a.a(aVar, arrayList, soa0Var);
        rbn rbnVarB = aVar.b();
        a = rbnVarB;
        return rbnVarB;
    }
}
