package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.compose.txDetails.TxDetailsCommonWidgetKt$TxDetailsStatusContent$6$1$1$1", f = "TxDetailsCommonWidget.kt", l = {244, 249, 254}, m = "invokeSuspend", v = 2)
public final class r2h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ wd0<Float, ij0> d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Function0<Unit> f;
    public final /* synthetic */ long i;
    public final /* synthetic */ ytw<Boolean> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2h0(boolean z, Function0<Unit> function0, wd0<Float, ij0> wd0Var, int i, Function0<Unit> function1, long j, ytw<Boolean> ytwVar, v1b<? super r2h0> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = function0;
        this.d = wd0Var;
        this.e = i;
        this.f = function1;
        this.i = j;
        this.v = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new r2h0(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r2h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067 A[PHI: r7
      0x0067: PHI (r7v3 r2h0) = (r7v0 r2h0), (r7v2 r2h0), (r7v6 r2h0) binds: [B:20:0x0061, B:18:0x005e, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (defpackage.hkd.b(r7.i, r7) == r0) goto L23;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r11.a
            wd0<java.lang.Float, ij0> r2 = r11.d
            r3 = 0
            r9 = 3
            r10 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L22
            if (r1 == r10) goto L1d
            if (r1 != r9) goto L17
            defpackage.uj50.b(r12)
            r7 = r11
            goto L72
        L17:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r3
        L1d:
            defpackage.uj50.b(r12)
            r7 = r11
            goto L67
        L22:
            defpackage.uj50.b(r12)
            r7 = r11
            goto L52
        L27:
            defpackage.uj50.b(r12)
            boolean r12 = r11.b
            if (r12 == 0) goto L61
            kotlin.jvm.functions.Function0<kotlin.Unit> r12 = r11.c
            r12.invoke()
            r12 = r3
            java.lang.Float r3 = new java.lang.Float
            r1 = 1135869952(0x43b40000, float:360.0)
            r3.<init>(r1)
            r1 = 0
            r5 = 6
            int r6 = r11.e
            gzg0 r12 = defpackage.yi0.e(r6, r1, r12, r5)
            r11.a = r4
            r5 = 0
            r6 = 0
            r8 = 12
            r7 = r11
            r4 = r12
            java.lang.Object r11 = defpackage.wd0.a(r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L52
            goto L71
        L52:
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r7.a = r10
            java.lang.Object r11 = r2.f(r7, r11)
            if (r11 != r0) goto L67
            goto L71
        L61:
            r7 = r11
            kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r7.f
            r11.invoke()
        L67:
            r7.a = r9
            long r11 = r7.i
            java.lang.Object r11 = defpackage.hkd.b(r11, r7)
            if (r11 != r0) goto L72
        L71:
            return r0
        L72:
            ytw<java.lang.Boolean> r11 = r7.v
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r11.setValue(r12)
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r2h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
