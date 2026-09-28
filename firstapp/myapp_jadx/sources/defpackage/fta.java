package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fta implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fta(aq40 aq40Var) {
        this.a = 1;
        i3z i3zVar = i3z.a;
        this.b = aq40Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v15 java.lang.Object, still in use, count: 2, list:
          (r0v15 java.lang.Object) from 0x0055: PHI (r0 I:??) = (r0v13 java.lang.Object), (r0v15 java.lang.Object) binds: [B:12:0x0054, B:28:0x0055] A[DONT_GENERATE, DONT_INLINE]
          (r0v15 java.lang.Object) from 0x004d: CHECK_CAST (aoe0) (r0v15 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.a
            java.lang.Object r4 = r4.b
            switch(r0) {
                case 0: goto L86;
                case 1: goto L67;
                case 2: goto L1e;
                default: goto L7;
            }
        L7:
            wd0 r4 = (defpackage.wd0) r4
            a7l r5 = (defpackage.a7l) r5
            r5.getClass()
            java.lang.Object r4 = r4.d()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5.b(r4)
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        L1e:
            loe0 r4 = (defpackage.loe0) r4
            android.view.View r5 = (android.view.View) r5
            r5.getClass()
            xne0 r5 = r4.m0()
            ku90<vne0> r5 = r5.d
            vne0$a r0 = vne0.a.a
            r5.a(r0)
            xne0 r5 = r4.m0()
            wwd0 r5 = r5.c
            java.lang.Object r5 = r5.getValue()
            wne0 r5 = (defpackage.wne0) r5
            java.util.List<aoe0> r5 = r5.a
            java.util.Iterator r5 = r5.iterator()
        L42:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r5.next()
            r1 = r0
            aoe0 r1 = (defpackage.aoe0) r1
            boolean r1 = r1 instanceof aoe0.g
            if (r1 == 0) goto L42
            goto L55
        L54:
            r0 = 0
        L55:
            if (r0 == 0) goto L64
            q8i0 r4 = r4.B
            java.lang.Object r4 = r4.getValue()
            au7 r4 = (defpackage.au7) r4
            j6c r5 = defpackage.j6c.BIND_PHONE_PRIMARY
            r4.x1(r5)
        L64:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        L67:
            aq40 r4 = (defpackage.aq40) r4
            i3z r0 = defpackage.i3z.a
            urr r5 = (defpackage.urr) r5
            r5.getClass()
            r0 = 0
            long r0 = r5.i0(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r5 = (int) r0
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r4.a = r5
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        L86:
            com.sportybet.plugin.realsports.betslip.widget.d r4 = (com.sportybet.plugin.realsports.betslip.widget.d) r4
            wik r5 = (defpackage.wik) r5
            zsb r0 = com.sportybet.plugin.realsports.betslip.widget.d.v0
            boolean r0 = r4.l0
            if (r0 != 0) goto L93
            kotlin.Unit r4 = kotlin.Unit.a
            goto Lb0
        L93:
            boolean r0 = r5 instanceof wik.a
            if (r0 == 0) goto Lae
            wik$a r5 = (wik.a) r5
            svk r5 = r5.a
            com.sporty.android.core.model.gift.GiftDetails r0 = r5.d
            java.lang.String r1 = r5.b
            boolean r5 = r5.c
            com.sporty.android.core.model.gift.SelectedGiftData r5 = defpackage.l780.a(r0, r1, r5)
            up3 r0 = r4.o0()
            com.sporty.android.core.model.gift.SelectedGiftData r0 = r0.C
            r4.p0(r5, r0)
        Lae:
            kotlin.Unit r4 = kotlin.Unit.a
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fta.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ fta(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
