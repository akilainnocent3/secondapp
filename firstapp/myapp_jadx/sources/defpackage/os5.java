package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {104}, m = "invokeSuspend")
public final class os5 extends tje0 implements gaj<fmw<Object>, fmw<Object>, v1b<? super fmw<Object>>, Object> {
    public int a;
    public /* synthetic */ fmw b;
    public /* synthetic */ fmw c;

    @Override // defpackage.gaj
    public final Object invoke(fmw<Object> fmwVar, fmw<Object> fmwVar2, v1b<? super fmw<Object>> v1bVar) {
        os5 os5Var = new os5(3, v1bVar);
        os5Var.b = fmwVar;
        os5Var.c = fmwVar2;
        return os5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fmw fmwVar = this.b;
            uj50.b(obj);
            return fmwVar;
        }
        uj50.b(obj);
        fmw fmwVar2 = this.b;
        fmw fmwVar3 = this.c;
        this.b = fmwVar3;
        this.a = 1;
        fmwVar2.b.d.cancel((CancellationException) null);
        return Unit.a == y5bVar ? y5bVar : fmwVar3;
    }
}
