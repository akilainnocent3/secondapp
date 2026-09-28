package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.handler.MatchEventDetailTeamInfoHeaderStateHandlerImpl$countDownForTooltipDismiss$1", f = "MatchEventDetailTeamInfoHeaderStateHandlerImpl.kt", l = {WebSocketProtocol.B0_FLAG_RSV1, 65}, m = "invokeSuspend", v = 2)
public final class o2v extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ v2v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2v(v2v v2vVar, v1b<? super o2v> v1bVar) {
        super(2, v1bVar);
        this.b = v2vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o2v(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o2v) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r6.g(r5, r1) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            defpackage.uj50.b(r6)
            goto L44
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L17:
            defpackage.uj50.b(r6)
            goto L29
        L1b:
            defpackage.uj50.b(r6)
            r5.a = r3
            r3 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r6 = defpackage.hkd.b(r3, r5)
            if (r6 != r0) goto L29
            goto L43
        L29:
            v2v r6 = r5.b
            yho r6 = r6.a
            rkd r1 = r6.m
            ohp<java.lang.Object>[] r3 = defpackage.yho.o
            r4 = 12
            r3 = r3[r4]
            wm20 r6 = r1.a(r6, r3)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.a = r2
            java.lang.Object r5 = r6.g(r5, r1)
            if (r5 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
