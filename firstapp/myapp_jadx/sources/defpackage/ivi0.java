package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.wheelanddeal.WDViewModel$fetch$2", f = "WDViewModel.kt", l = {693, 694, 698, 702}, m = "invokeSuspend", v = 1)
public final class ivi0 extends tje0 implements Function2<an8<? extends Float>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yui0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivi0(yui0 yui0Var, v1b<? super ivi0> v1bVar) {
        super(2, v1bVar);
        this.c = yui0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ivi0 ivi0Var = new ivi0(this.c, v1bVar);
        ivi0Var.b = obj;
        return ivi0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(an8<? extends Float> an8Var, v1b<? super Unit> v1bVar) {
        return ((ivi0) create(an8Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (kotlin.Unit.a == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (kotlin.Unit.a == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r0.B1(r11, r10) == r3) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            yui0 r0 = r10.c
            wwd0 r1 = r0.J
            java.lang.Object r2 = r10.b
            an8 r2 = (defpackage.an8) r2
            y5b r3 = defpackage.y5b.a
            int r4 = r10.a
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L2b
            if (r4 == r8) goto L27
            if (r4 == r7) goto L23
            if (r4 == r6) goto L23
            if (r4 != r5) goto L1c
            goto L23
        L1c:
            r10 = 0
            java.lang.String r10 = com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw.HTUDoCEmJBEQD
            defpackage.ib5.a(r10)
            return r9
        L23:
            defpackage.uj50.b(r11)
            goto L92
        L27:
            defpackage.uj50.b(r11)
            goto L4b
        L2b:
            defpackage.uj50.b(r11)
            an8$c r11 = an8.c.a
            boolean r11 = kotlin.jvm.internal.Intrinsics.g(r2, r11)
            if (r11 != 0) goto L92
            an8$a r11 = an8.a.a
            boolean r11 = kotlin.jvm.internal.Intrinsics.g(r2, r11)
            if (r11 == 0) goto L59
            r10.b = r9
            r10.a = r8
            r4 = 300(0x12c, double:1.48E-321)
            java.lang.Object r11 = defpackage.hkd.b(r4, r10)
            if (r11 != r3) goto L4b
            goto L8d
        L4b:
            hzs$a r11 = hzs.a.a
            r10.b = r9
            r10.a = r7
            r1.setValue(r11)
            kotlin.Unit r10 = kotlin.Unit.a
            if (r10 != r3) goto L92
            goto L8d
        L59:
            boolean r11 = r2 instanceof an8.d
            if (r11 == 0) goto L7b
            hzs$b r11 = new hzs$b
            an8$d r2 = (an8.d) r2
            T r0 = r2.a
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r11.<init>(r0)
            r10.b = r9
            r10.a = r6
            r1.getClass()
            r1.k(r9, r11)
            kotlin.Unit r10 = kotlin.Unit.a
            if (r10 != r3) goto L92
            goto L8d
        L7b:
            boolean r11 = r2 instanceof an8.b
            if (r11 == 0) goto L8e
            an8$b r2 = (an8.b) r2
            java.lang.Throwable r11 = r2.a
            r10.b = r9
            r10.a = r5
            java.lang.Object r10 = r0.B1(r11, r10)
            if (r10 != r3) goto L92
        L8d:
            return r3
        L8e:
            defpackage.uhc.a()
            return r9
        L92:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivi0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
