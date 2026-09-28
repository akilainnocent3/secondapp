package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class dop {
    public static rbn a;

    public static final rbn a() {
        rbn rbnVar = a;
        if (rbnVar != null) {
            return rbnVar;
        }
        rbn.a aVar = new rbn.a("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        m2g m2gVar = lwh0.a;
        soa0 soa0Var = new soa0(j58.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new qxz.f(8.59f, 16.59f));
        arrayList.add(new qxz.e(13.17f, 12.0f));
        arrayList.add(new qxz.e(8.59f, 7.41f));
        arrayList.add(new qxz.e(10.0f, 6.0f));
        arrayList.add(new qxz.m(6.0f, 6.0f));
        arrayList.add(new qxz.m(-6.0f, 6.0f));
        arrayList.add(new qxz.m(-1.41f, -1.41f));
        arrayList.add(qxz.b.c);
        rbn.a.a(aVar, arrayList, soa0Var);
        rbn rbnVarB = aVar.b();
        a = rbnVarB;
        return rbnVarB;
    }
}
