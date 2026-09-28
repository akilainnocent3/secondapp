package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
public final class pdh0 extends tje0 implements iaj<myh<? super Boolean>, Throwable, Long, v1b<? super Boolean>, Object> {
    public int a;
    public /* synthetic */ Throwable b;
    public /* synthetic */ long c;

    @Override // defpackage.iaj
    public final Object d(myh<? super Boolean> myhVar, Throwable th, Long l, v1b<? super Boolean> v1bVar) {
        long jLongValue = l.longValue();
        pdh0 pdh0Var = new pdh0(4, v1bVar);
        pdh0Var.b = th;
        pdh0Var.c = jLongValue;
        return pdh0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            Throwable th = this.b;
            long j = this.c;
            jgt.e().d(rdh0.a, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * 30000, rdh0.b);
            this.a = 1;
            if (hkd.b(jMin, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Boolean.TRUE;
    }
}
