package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class f0i implements lyh<Object> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ Function2 b;

    public f0i(lyh lyhVar, Function2 function2) {
        this.a = lyhVar;
        this.b = function2;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b<? super Unit> v1bVar) {
        Object objCollect = this.a.collect(new g0i(new yp40(), myhVar, this.b), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
