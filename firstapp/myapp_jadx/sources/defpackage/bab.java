package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bab implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bab(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v5 java.lang.Object, still in use, count: 2, list:
          (r7v5 java.lang.Object) from 0x0053: PHI (r7 I:??) = (r7v1 java.lang.Object), (r7v5 java.lang.Object) binds: [B:17:0x0052, B:33:0x0053] A[DONT_GENERATE, DONT_INLINE]
          (r7v5 java.lang.Object) from 0x0047: CHECK_CAST (jw1) (r7v5 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.a
            java.lang.Object r0 = r0.b
            switch(r1) {
                case 0: goto L80;
                default: goto L9;
            }
        L9:
            java.util.List r0 = (java.util.List) r0
            r1 = r22
            com.sporty.android.core.model.pocket.common.AssetData r1 = (com.sporty.android.core.model.pocket.common.AssetData) r1
            java.util.List r2 = r1.getAccounts()
            r3 = 0
            if (r2 == 0) goto L77
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.l48.r(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r2.next()
            r6 = r5
            com.sporty.android.core.model.pocket.common.AssetData$AccountsBean r6 = (com.sporty.android.core.model.pocket.common.AssetData.AccountsBean) r6
            java.lang.String r5 = r6.getBankIconUrl()
            if (r5 != 0) goto L72
            java.util.Iterator r5 = r0.iterator()
        L3c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L52
            java.lang.Object r7 = r5.next()
            r8 = r7
            jw1 r8 = (defpackage.jw1) r8
            int r8 = r8.a
            int r9 = r6.getBankId()
            if (r8 != r9) goto L3c
            goto L53
        L52:
            r7 = r3
        L53:
            jw1 r7 = (defpackage.jw1) r7
            if (r7 == 0) goto L5b
            java.lang.String r5 = r7.d
            r13 = r5
            goto L5c
        L5b:
            r13 = r3
        L5c:
            r19 = 4031(0xfbf, float:5.649E-42)
            r20 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.sporty.android.core.model.pocket.common.AssetData$AccountsBean r6 = com.sporty.android.core.model.pocket.common.AssetData.AccountsBean.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L72:
            r4.add(r6)
            goto L25
        L76:
            r3 = r4
        L77:
            r5 = 5
            r6 = 0
            r2 = 0
            r4 = 0
            com.sporty.android.core.model.pocket.common.AssetData r0 = com.sporty.android.core.model.pocket.common.AssetData.copy$default(r1, r2, r3, r4, r5, r6)
            return r0
        L80:
            fgb r0 = (defpackage.fgb) r0
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
            java.util.LinkedHashSet r3 = r0.h0
            r3.add(r1)
            androidx.compose.runtime.snapshots.SnapshotStateList<ps6> r0 = r0.g0
            ibb r1 = new ibb
            r1.<init>()
            defpackage.p48.A(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bab.invoke(java.lang.Object):java.lang.Object");
    }
}
