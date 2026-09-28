package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class im60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ im60(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v6 java.lang.Object, still in use, count: 2, list:
          (r0v6 java.lang.Object) from 0x003a: PHI (r0 I:??) = (r0v3 java.lang.Object), (r0v6 java.lang.Object) binds: [B:10:0x0039, B:19:0x003a] A[DONT_GENERATE, DONT_INLINE]
          (r0v6 java.lang.Object) from 0x0026: CHECK_CAST (aoe0) (r0v6 java.lang.Object)
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
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
        /*
            r3 = this;
            int r4 = r3.a
            android.view.View$OnCreateContextMenuListener r3 = r3.b
            switch(r4) {
                case 0: goto L4d;
                default: goto L7;
            }
        L7:
            loe0 r3 = (defpackage.loe0) r3
            xne0 r4 = r3.m0()
            wwd0 r4 = r4.c
            java.lang.Object r4 = r4.getValue()
            wne0 r4 = (defpackage.wne0) r4
            java.util.List<aoe0> r4 = r4.a
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r4.next()
            r1 = r0
            aoe0 r1 = (defpackage.aoe0) r1
            java.lang.Object r1 = r1.getId()
            xne0 r2 = r3.m0()
            java.lang.Object r2 = r2.i
            boolean r1 = kotlin.jvm.internal.Intrinsics.g(r1, r2)
            if (r1 == 0) goto L1b
            goto L3a
        L39:
            r0 = 0
        L3a:
            aoe0 r0 = (defpackage.aoe0) r0
            if (r0 == 0) goto L45
            xne0 r4 = r3.m0()
            r4.z1(r0)
        L45:
            xne0 r3 = r3.m0()
            r3.A1()
            return
        L4d:
            jm60 r3 = (defpackage.jm60) r3
            java.lang.String r4 = r3.f
            r0 = 0
            java.lang.String r0 = androidx.window.layout.oKr.TEFcJcMqR.YWHiP
            defpackage.jm60.a(r4, r0)
            r3.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im60.onClick(android.view.View):void");
    }
}
