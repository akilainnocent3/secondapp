package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zqn implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zqn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v5 java.lang.Object, still in use, count: 2, list:
          (r0v5 java.lang.Object) from 0x008e: PHI (r0 I:??) = (r0v2 java.lang.Object), (r0v5 java.lang.Object) binds: [B:22:0x008d, B:31:0x008e] A[DONT_GENERATE, DONT_INLINE]
          (r0v5 java.lang.Object) from 0x0082: CHECK_CAST (dsn) (r0v5 java.lang.Object)
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
    public final java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.a
            java.lang.Object r9 = r9.b
            switch(r0) {
                case 0: goto L69;
                default: goto L7;
            }
        L7:
            eww r9 = (defpackage.eww) r9
            hqc r10 = (defpackage.hqc) r10
            h2x r0 = r9.i
            boolean r1 = r10 instanceof defpackage.lqc
            if (r1 == 0) goto L1c
            ssw r9 = new ssw
            lqc r10 = new lqc
            r10.<init>()
            r9.<init>(r10)
            goto L68
        L1c:
            boolean r1 = r10 instanceof defpackage.nqc
            if (r1 == 0) goto L5e
            nqc r10 = (defpackage.nqc) r10
            T r10 = r10.a
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L2f:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r10.next()
            r5 = r2
            com.sportybet.plugin.realsports.data.MyFavoriteTeam r5 = (com.sportybet.plugin.realsports.data.MyFavoriteTeam) r5
            rww r3 = new rww
            com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum r4 = com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum.ACTION_BAR_SEARCH_TEAM
            java.lang.String r6 = r5.competitorId
            java.lang.String r2 = r5.tournamentId
            boolean r7 = r9.F1(r2, r6)
            java.lang.String r8 = r5.competitorName
            r3.<init>(r4, r5, r6, r7, r8)
            r1.add(r3)
            goto L2f
        L51:
            r0.d = r1
            ssw r9 = new ssw
            nqc r10 = new nqc
            r10.<init>(r0)
            r9.<init>(r10)
            goto L68
        L5e:
            ssw r9 = new ssw
            kqc r10 = new kqc
            r10.<init>()
            r9.<init>(r10)
        L68:
            return r9
        L69:
            java.util.List r9 = (java.util.List) r9
            hrn r10 = (defpackage.hrn) r10
            r10.getClass()
            java.lang.String r10 = r10.b
            java.util.Iterator r9 = r9.iterator()
        L76:
            boolean r0 = r9.hasNext()
            r1 = 0
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r9.next()
            r2 = r0
            dsn r2 = (defpackage.dsn) r2
            java.lang.String r2 = r2.a
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L76
            goto L8e
        L8d:
            r0 = r1
        L8e:
            dsn r0 = (defpackage.dsn) r0
            if (r0 == 0) goto L94
            java.lang.String r1 = r0.c
        L94:
            if (r1 != 0) goto L98
            java.lang.String r1 = ""
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqn.invoke(java.lang.Object):java.lang.Object");
    }
}
