package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class oyh implements lyh<Object> {
    public final /* synthetic */ gaj a;

    public oyh(gaj gajVar) {
        this.a = gajVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b<? super Unit> v1bVar) {
        pyh pyhVar = new pyh(this.a, myhVar, null);
        nyh nyhVar = new nyh(v1bVar, v1bVar.getContext());
        Object objA = mdh0.a(nyhVar, true, nyhVar, pyhVar);
        return objA == y5b.a ? objA : Unit.a;
    }
}
