package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class d0i implements lyh<Object> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ int b;

    public d0i(lyh lyhVar, int i) {
        this.a = lyhVar;
        this.b = i;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b<? super Unit> v1bVar) {
        Object objCollect = this.a.collect(new e0i(new bq40(), this.b, myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
