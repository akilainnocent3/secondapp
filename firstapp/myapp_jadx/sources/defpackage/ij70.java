package defpackage;

import com.sportybet.android.instantwin.model.scheduledfootball.ScheduledFootballServerTime;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$3$1", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {116, 118}, m = "invokeSuspend", v = 2)
public final class ij70 extends tje0 implements Function2<myh<? super Long>, v1b<? super Unit>, Object> {
    public ScheduledFootballServerTime a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rj70 d;
    public final /* synthetic */ pj70 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij70(rj70 rj70Var, pj70 pj70Var, v1b<? super ij70> v1bVar) {
        super(2, v1bVar);
        this.d = rj70Var;
        this.e = pj70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ij70 ij70Var = new ij70(this.d, this.e, v1bVar);
        ij70Var.c = obj;
        return ij70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Long> myhVar, v1b<? super Unit> v1bVar) {
        return ((ij70) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006a -> B:7:0x0015). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r9.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L24
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L17
            com.sportybet.android.instantwin.model.scheduledfootball.ScheduledFootballServerTime r2 = r9.a
            defpackage.uj50.b(r10)
        L15:
            r10 = r2
            goto L2f
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            r9 = 0
            return r9
        L1e:
            com.sportybet.android.instantwin.model.scheduledfootball.ScheduledFootballServerTime r2 = r9.a
            defpackage.uj50.b(r10)
            goto L51
        L24:
            defpackage.uj50.b(r10)
            rj70 r10 = r9.d
            rj70$c r10 = (rj70.c) r10
            ni70 r10 = r10.a
            com.sportybet.android.instantwin.model.scheduledfootball.ScheduledFootballServerTime r10 = r10.b
        L2f:
            kotlin.coroutines.CoroutineContext r2 = r9.getContext()
            boolean r2 = defpackage.i9p.h(r2)
            if (r2 == 0) goto L6d
            kotlin.time.b$a r2 = kotlin.time.b.b
            r5 = 50
            rgf r2 = defpackage.rgf.MILLISECONDS
            long r5 = kotlin.time.c.i(r5, r2)
            r9.c = r0
            r9.a = r10
            r9.b = r4
            java.lang.Object r2 = defpackage.hkd.c(r5, r9)
            if (r2 != r1) goto L50
            goto L6c
        L50:
            r2 = r10
        L51:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r7 = r2.b
            long r7 = r7 + r5
            long r5 = r2.a
            long r7 = r7 - r5
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r7)
            r9.c = r0
            r9.a = r2
            r9.b = r3
            java.lang.Object r10 = r0.emit(r10, r9)
            if (r10 != r1) goto L15
        L6c:
            return r1
        L6d:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
