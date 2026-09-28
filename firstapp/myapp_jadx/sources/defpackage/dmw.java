package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", l = {53}, m = "invokeSuspend")
public final class dmw extends tje0 implements gaj<myh<? super xmz<Object>>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ fmw<Object> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmw(fmw<Object> fmwVar, v1b<? super dmw> v1bVar) {
        super(3, v1bVar);
        this.a = fmwVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super xmz<Object>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new dmw(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Unit.a;
    }
}
