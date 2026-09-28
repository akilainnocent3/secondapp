package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vi7 {
    public static rbn a;

    public static final rbn a() {
        rbn rbnVar = a;
        if (rbnVar != null) {
            return rbnVar;
        }
        rbn.a aVar = new rbn.a("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        m2g m2gVar = lwh0.a;
        soa0 soa0Var = new soa0(j58.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new qxz.f(9.0f, 16.17f));
        arrayList.add(new qxz.e(4.83f, 12.0f));
        arrayList.add(new qxz.m(-1.42f, 1.41f));
        arrayList.add(new qxz.e(9.0f, 19.0f));
        arrayList.add(new qxz.e(21.0f, 7.0f));
        arrayList.add(new qxz.m(-1.41f, -1.41f));
        arrayList.add(qxz.b.c);
        rbn.a.a(aVar, arrayList, soa0Var);
        rbn rbnVarB = aVar.b();
        a = rbnVarB;
        return rbnVarB;
    }
}
