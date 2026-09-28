package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class trp extends qlr implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ trp(Object obj, int i) {
        super(1);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v5 cny, still in use, count: 2, list:
          (r1v5 cny) from 0x002b: PHI (r1 I:??) = (r1v2 cny), (r1v5 cny) binds: [B:10:0x002a, B:22:0x002b] A[DONT_GENERATE, DONT_INLINE]
          (r1v5 cny) from 0x0025: IGET (r1v5 cny) A[WRAPPED] (LINE:38) cny.a boolean
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
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.a
            java.lang.Object r3 = r3.b
            switch(r0) {
                case 0: goto L3e;
                default: goto L7;
            }
        L7:
            sr1 r4 = (defpackage.sr1) r4
            r4.getClass()
            iny r3 = (defpackage.iny) r3
            gx0<cny> r0 = r3.b
            int r1 = r0.getB()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L18:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.previous()
            r2 = r1
            cny r2 = (defpackage.cny) r2
            boolean r2 = r2.a
            if (r2 == 0) goto L18
            goto L2b
        L2a:
            r1 = 0
        L2b:
            cny r1 = (defpackage.cny) r1
            cny r0 = r3.c
            if (r0 == 0) goto L34
            r3.c()
        L34:
            r3.c = r1
            if (r1 == 0) goto L3b
            r1.d(r4)
        L3b:
            kotlin.Unit r3 = kotlin.Unit.a
            return r3
        L3e:
            kuz r4 = (defpackage.kuz) r4
            r4.getClass()
            guz r4 = r4.a
            guz r3 = (defpackage.guz) r3
            boolean r3 = r4.equals(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trp.invoke(java.lang.Object):java.lang.Object");
    }
}
