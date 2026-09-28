package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {73, 78}, m = "invokeSuspend")
public final class af0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ fmt d;
    public final /* synthetic */ xmt e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ float v;
    public final /* synthetic */ wmt w;
    public final /* synthetic */ ytw<Boolean> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af0(boolean z, boolean z2, fmt fmtVar, xmt xmtVar, int i, boolean z3, float f, wmt wmtVar, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        umt umtVar = umt.a;
        this.b = z;
        this.c = z2;
        this.d = fmtVar;
        this.e = xmtVar;
        this.f = i;
        this.i = z3;
        this.v = f;
        this.w = wmtVar;
        this.y = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        umt umtVar = umt.a;
        return new af0(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((af0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (fmt.a.a(r2, r11.e, r11.f, r11.i, r11.v, r11.w, r8, r11, 514) == r0) goto L25;
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
            fmt r2 = r11.d
            ytw<java.lang.Boolean> r3 = r11.y
            r4 = 2
            r5 = 1
            boolean r6 = r11.b
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L16
            defpackage.uj50.b(r12)
            goto L67
        L16:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            r11 = 0
            return r11
        L1d:
            defpackage.uj50.b(r12)
            goto L3f
        L21:
            defpackage.uj50.b(r12)
            if (r6 == 0) goto L3f
            java.lang.Object r12 = r3.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L3f
            boolean r12 = r11.c
            if (r12 == 0) goto L3f
            r11.a = r5
            java.lang.Object r12 = defpackage.lmt.b(r2, r11)
            if (r12 != r0) goto L3f
            goto L66
        L3f:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            r3.setValue(r12)
            if (r6 != 0) goto L4b
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L4b:
            float r8 = r2.g()
            umt r12 = defpackage.umt.a
            r11.a = r4
            xmt r3 = r11.e
            int r4 = r11.f
            boolean r5 = r11.i
            float r6 = r11.v
            wmt r7 = r11.w
            r10 = 514(0x202, float:7.2E-43)
            r9 = r11
            java.lang.Object r11 = fmt.a.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L67
        L66:
            return r0
        L67:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
