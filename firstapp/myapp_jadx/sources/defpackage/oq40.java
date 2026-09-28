package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class oq40 implements cbs {
    public final hbs a;
    public final iq7.a b;

    public oq40(hbs hbsVar) {
        this.a = hbsVar;
        iq7 iq7Var = iq7.c;
        Class<?> cls = hbsVar.getClass();
        iq7.a aVar = (iq7.a) iq7Var.a.get(cls);
        this.b = aVar == null ? iq7Var.a(cls, null) : aVar;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        HashMap map = this.b.a;
        List list = (List) map.get(aVar);
        hbs hbsVar = this.a;
        iq7.a.a(list, ibsVar, aVar, hbsVar);
        iq7.a.a((List) map.get(s9s.a.ON_ANY), ibsVar, aVar, hbsVar);
    }
}
