package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class o0i implements lyh<Object> {
    public final /* synthetic */ lyh a;

    public o0i(lyh lyhVar) {
        this.a = lyhVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b<? super Unit> v1bVar) {
        Object objCollect = this.a.collect(new p0i(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
