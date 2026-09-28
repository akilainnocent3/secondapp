package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class s78 implements lyh<Object> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ lyh b;
    public final /* synthetic */ gaj c;

    public s78(lyh lyhVar, lyh lyhVar2, gaj gajVar) {
        this.a = lyhVar;
        this.b = lyhVar2;
        this.c = gajVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b<? super Unit> v1bVar) {
        Object objD = w5b.d(new t78(this.a, this.b, myhVar, this.c, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
