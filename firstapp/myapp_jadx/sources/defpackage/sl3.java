package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetslipButtonOverlayKt$BetslipButtonOverlay$1$2$1", f = "BetslipButtonOverlay.kt", l = {180, 185, 187}, m = "invokeSuspend", v = 2)
public final class sl3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ gm3 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ wd0<Float, ij0> f;
    public final /* synthetic */ ytw<Boolean> i;
    public final /* synthetic */ ytw<g7f> v;
    public final /* synthetic */ isw w;
    public final /* synthetic */ xsw y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl3(gm3 gm3Var, float f, float f2, float f3, wd0<Float, ij0> wd0Var, ytw<Boolean> ytwVar, ytw<g7f> ytwVar2, isw iswVar, xsw xswVar, v1b<? super sl3> v1bVar) {
        super(2, v1bVar);
        this.b = gm3Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = wd0Var;
        this.i = ytwVar;
        this.v = ytwVar2;
        this.w = iswVar;
        this.y = xswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sl3(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sl3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r1.f(r11, r12) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (defpackage.fm3.b(r4, r11.y, r11.w, r7, r8, 180, r11) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (r4.f(r11, r11) == r0) goto L29;
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
            r2 = 0
            isw r3 = r11.w
            ytw<g7f> r7 = r11.v
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L29
            if (r1 == r6) goto L25
            if (r1 == r5) goto L20
            if (r1 != r4) goto L19
            defpackage.uj50.b(r12)
            goto La1
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            r11 = 0
            return r11
        L20:
            defpackage.uj50.b(r12)
            goto Lac
        L25:
            defpackage.uj50.b(r12)
            goto L5e
        L29:
            defpackage.uj50.b(r12)
            gm3 r12 = r11.b
            ykf r12 = r12.b()
            ykf r1 = defpackage.ykf.a
            float r8 = r11.c
            if (r12 != r1) goto L39
            goto L40
        L39:
            float r12 = r11.d
            float r1 = r11.e
            float r12 = r12 - r1
            float r8 = r12 - r8
        L40:
            ytw<java.lang.Boolean> r12 = r11.i
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            wd0<java.lang.Float, ij0> r1 = r11.f
            if (r12 != 0) goto L6a
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r8)
            r11.a = r6
            java.lang.Object r11 = r1.f(r11, r12)
            if (r11 != r0) goto L5e
            goto La0
        L5e:
            g7f r11 = new g7f
            r11.<init>(r2)
            r7.setValue(r11)
            r3.A(r2)
            goto Lac
        L6a:
            java.lang.Object r12 = r1.d()
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            float r12 = r12 - r8
            float r12 = java.lang.Math.abs(r12)
            r1 = 1056964608(0x3f000000, float:0.5)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r1 = r4
            wd0<java.lang.Float, ij0> r4 = r11.f
            if (r12 <= 0) goto L92
            r11.a = r5
            xsw r5 = r11.y
            isw r6 = r11.w
            r9 = 180(0xb4, float:2.52E-43)
            r10 = r11
            java.lang.Object r11 = defpackage.fm3.b(r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto Lac
            goto La0
        L92:
            r10 = r11
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r8)
            r10.a = r1
            java.lang.Object r11 = r4.f(r10, r11)
            if (r11 != r0) goto La1
        La0:
            return r0
        La1:
            g7f r11 = new g7f
            r11.<init>(r2)
            r7.setValue(r11)
            r3.A(r2)
        Lac:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
