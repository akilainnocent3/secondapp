package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.datasource.OverrideLocalDataSource$getOverrides$1", f = "OverrideLocalDataSource.kt", l = {52}, m = "invokeSuspend", v = 2)
public final class jfz extends tje0 implements gaj<myh<? super List<? extends mvh0>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super List<? extends mvh0>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        jfz jfzVar = new jfz(3, v1bVar);
        jfzVar.b = myhVar;
        jfzVar.c = th;
        return jfzVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (th instanceof CancellationException) {
                throw th;
            }
            itf0.a aVar = itf0.a;
            aVar.q("SB_AN_TEST");
            aVar.f(th, "overrides read failed", new Object[0]);
            m2g m2gVar = m2g.a;
            this.b = null;
            this.c = null;
            this.a = 1;
            if (myhVar.emit(m2gVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
