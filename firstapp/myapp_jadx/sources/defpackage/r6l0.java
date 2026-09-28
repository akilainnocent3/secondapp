package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class r6l0 extends s4u {
    public final /* synthetic */ e7l0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6l0(e7l0 e7l0Var) {
        super(20);
        this.g = e7l0Var;
    }

    @Override // defpackage.s4u
    public final Object a(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        hm20.e(str);
        e7l0 e7l0Var = this.g;
        e7l0Var.h();
        hm20.e(str);
        lqk0 lqk0Var = e7l0Var.b.c;
        iol0.U(lqk0Var);
        rpk0 rpk0VarM0 = lqk0Var.m0(str);
        if (rpk0VarM0 == null) {
            return null;
        }
        y4l0 y4l0Var = e7l0Var.a.f;
        k8l0.m(y4l0Var);
        y4l0Var.n.b(str, "Populate EES config from database on cache miss. appId");
        e7l0Var.o(str, e7l0Var.p(str, rpk0VarM0.a));
        r6l0 r6l0Var = e7l0Var.j;
        synchronized (r6l0Var.c) {
            Set setEntrySet = r6l0Var.b.a.entrySet();
            setEntrySet.getClass();
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = r6l0Var.b.a.entrySet();
            setEntrySet2.getClass();
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (muk0) linkedHashMap.get(str);
    }
}
