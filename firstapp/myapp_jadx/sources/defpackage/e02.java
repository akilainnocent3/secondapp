package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e02 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e02(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v5 java.lang.Object, still in use, count: 2, list:
          (r0v5 java.lang.Object) from 0x0065: PHI (r0 I:??) = (r0v2 java.lang.Object), (r0v5 java.lang.Object) binds: [B:20:0x0064, B:27:0x0065] A[DONT_GENERATE, DONT_INLINE]
          (r0v5 java.lang.Object) from 0x005b: CHECK_CAST (com.sporty.android.common_ui.widgets.ClearEditText) (r0v5 java.lang.Object)
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
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        /*
            r2 = this;
            int r0 = r2.a
            java.lang.Object r2 = r2.b
            switch(r0) {
                case 0: goto L46;
                case 1: goto L38;
                case 2: goto L30;
                case 3: goto L1d;
                case 4: goto L11;
                default: goto L7;
            }
        L7:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            h0f0 r0 = defpackage.h0f0.a
            r2.invoke(r0)
            kotlin.Unit r2 = kotlin.Unit.a
            return r2
        L11:
            kab0 r2 = (defpackage.kab0) r2
            androidx.fragment.app.e r2 = r2.requireActivity()
            r2.finish()
            kotlin.Unit r2 = kotlin.Unit.a
            return r2
        L1d:
            hjd0 r2 = (defpackage.hjd0) r2
            java.util.LinkedHashSet r0 = com.sportybet.plugin.realsports.prematch.PreMatchSportActivity.c0
            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.a
            android.content.Context r2 = r2.getContext()
            r2.getClass()
            defpackage.gby.c(r2)
            kotlin.Unit r2 = kotlin.Unit.a
            return r2
        L30:
            yop r2 = (defpackage.yop) r2
            xop r0 = new xop
            r0.<init>()
            return r0
        L38:
            nnf r2 = (defpackage.nnf) r2
            ytw<java.lang.Boolean> r2 = r2.b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            x5a0 r2 = (defpackage.x5a0) r2
            r2.setValue(r0)
            kotlin.Unit r2 = kotlin.Unit.a
            return r2
        L46:
            g02 r2 = (defpackage.g02) r2
            java.util.List r2 = r2.m0()
            java.util.Iterator r2 = r2.iterator()
        L50:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r2.next()
            r1 = r0
            com.sporty.android.common_ui.widgets.ClearEditText r1 = (com.sporty.android.common_ui.widgets.ClearEditText) r1
            int r1 = r1.getHeight()
            if (r1 <= 0) goto L50
            goto L65
        L64:
            r0 = 0
        L65:
            com.sporty.android.common_ui.widgets.ClearEditText r0 = (com.sporty.android.common_ui.widgets.ClearEditText) r0
            if (r0 == 0) goto L6c
            defpackage.ow.c(r0)
        L6c:
            kotlin.Unit r2 = kotlin.Unit.a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e02.invoke():java.lang.Object");
    }
}
