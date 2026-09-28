package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class eop {
    public static rbn a;

    public static final rbn a() {
        rbn rbnVar = a;
        if (rbnVar != null) {
            return rbnVar;
        }
        rbn.a aVar = new rbn.a("Filled.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        m2g m2gVar = lwh0.a;
        soa0 soa0Var = new soa0(j58.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new qxz.f(7.41f, 15.41f));
        arrayList.add(new qxz.e(12.0f, 10.83f));
        arrayList.add(new qxz.m(4.59f, 4.58f));
        arrayList.add(new qxz.e(18.0f, 14.0f));
        arrayList.add(new qxz.m(-6.0f, -6.0f));
        arrayList.add(new qxz.m(-6.0f, 6.0f));
        arrayList.add(qxz.b.c);
        rbn.a.a(aVar, arrayList, soa0Var);
        rbn rbnVarB = aVar.b();
        a = rbnVarB;
        return rbnVarB;
    }
}
