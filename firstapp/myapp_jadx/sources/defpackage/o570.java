package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.component.ScheduledFootballEventScoreKt$ScheduledFootballEventScore$2$1", f = "ScheduledFootballEventScore.kt", l = {82, 83}, m = "invokeSuspend", v = 2)
public final class o570 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fmt c;
    public final /* synthetic */ xmt d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ytw<String> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o570(boolean z, fmt fmtVar, xmt xmtVar, String str, ytw<String> ytwVar, v1b<? super o570> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = fmtVar;
        this.d = xmtVar;
        this.e = str;
        this.f = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o570(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o570) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (fmt.a.a(r12.c, r12.d, 0, false, 0.0f, null, 0.0f, r10, 2046) == r0) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r12.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L11
            defpackage.uj50.b(r13)
            r10 = r12
            goto L46
        L11:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            r12 = 0
            return r12
        L18:
            defpackage.uj50.b(r13)
            goto L31
        L1c:
            defpackage.uj50.b(r13)
            boolean r13 = r12.b
            if (r13 != 0) goto L26
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        L26:
            r12.a = r3
            fmt r13 = r12.c
            java.lang.Object r13 = defpackage.lmt.b(r13, r12)
            if (r13 != r0) goto L31
            goto L45
        L31:
            r12.a = r2
            fmt r3 = r12.c
            xmt r4 = r12.d
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 2046(0x7fe, float:2.867E-42)
            r10 = r12
            java.lang.Object r12 = fmt.a.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r12 != r0) goto L46
        L45:
            return r0
        L46:
            ytw<java.lang.String> r12 = r10.f
            java.lang.String r13 = r10.e
            r12.setValue(r13)
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o570.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
