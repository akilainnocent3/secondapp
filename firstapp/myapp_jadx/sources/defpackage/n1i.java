package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class n1i implements lyh<Object> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ lyh b;
    public final /* synthetic */ gaj c;

    public n1i(lyh lyhVar, lyh lyhVar2, gaj gajVar) {
        this.a = lyhVar;
        this.b = lyhVar2;
        this.c = gajVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b<? super Unit> v1bVar) {
        Object objA = r78.a(v1bVar, myhVar, new o1i(this.c, null), q1i.a, new lyh[]{this.a, this.b});
        return objA == y5b.a ? objA : Unit.a;
    }
}
