package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d190 {
    public static rbn a;

    public static final rbn a() {
        rbn rbnVar = a;
        if (rbnVar != null) {
            return rbnVar;
        }
        rbn.a aVar = new rbn.a("Filled.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        m2g m2gVar = lwh0.a;
        soa0 soa0Var = new soa0(j58.b);
        fxz fxzVar = new fxz();
        fxzVar.f(18.0f, 16.08f);
        fxzVar.b(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
        fxzVar.d(8.91f, 12.7f);
        fxzVar.b(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        fxzVar.g(-0.04f, -0.47f, -0.09f, -0.7f);
        fxzVar.e(7.05f, -4.11f);
        fxzVar.b(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        fxzVar.b(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        fxzVar.g(-1.34f, -3.0f, -3.0f, -3.0f);
        fxzVar.g(-3.0f, 1.34f, -3.0f, 3.0f);
        fxzVar.b(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        fxzVar.d(8.04f, 9.81f);
        qxz.c cVar = new qxz.c(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        ArrayList<qxz> arrayList = fxzVar.a;
        arrayList.add(cVar);
        fxzVar.b(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        fxzVar.g(1.34f, 3.0f, 3.0f, 3.0f);
        fxzVar.b(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
        fxzVar.e(7.12f, 4.16f);
        fxzVar.b(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        fxzVar.b(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        fxzVar.b(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
        fxzVar.g(-1.31f, -2.92f, -2.92f, -2.92f);
        fxzVar.a();
        rbn.a.a(aVar, arrayList, soa0Var);
        rbn rbnVarB = aVar.b();
        a = rbnVarB;
        return rbnVarB;
    }
}
