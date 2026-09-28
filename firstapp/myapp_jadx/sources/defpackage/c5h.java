package defpackage;

import com.sportygames.newcms.b;

/* JADX INFO: loaded from: classes7.dex */
public final class c5h<T> implements myh {
    public final /* synthetic */ e5h a;

    @c0d(c = "com.sportygames.fbg_dialog.FBGDialogViewModel$downloadCmsData$5", f = "FBGDialogViewModel.kt", l = {79, 80}, m = "emit", v = 1)
    public static final class a extends x1b {
        public e5h a;
        public b b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ c5h<T> e;
        public int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c5h<? super T> c5hVar, v1b<? super a> v1bVar) {
            super(v1bVar);
            this.e = c5hVar;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return this.e.emit(null, this);
        }
    }

    public c5h(e5h e5hVar) {
        this.a = e5hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (kotlin.Unit.a == r1) goto L24;
     */
    @Override // defpackage.myh
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(defpackage.xxs<com.sportygames.newcms.b> r7, defpackage.v1b<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof c5h.a
            if (r0 == 0) goto L13
            r0 = r8
            c5h$a r0 = (c5h.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            c5h$a r0 = new c5h$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            y5b r1 = defpackage.y5b.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            e5h r6 = r0.a
            com.sportygames.newcms.b r6 = (com.sportygames.newcms.b) r6
            defpackage.uj50.b(r8)
            goto L75
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L35:
            int r6 = r0.c
            com.sportygames.newcms.b r7 = r0.b
            e5h r2 = r0.a
            defpackage.uj50.b(r8)
            goto L61
        L3f:
            defpackage.uj50.b(r8)
            T r7 = r7.b
            com.sportygames.newcms.b r7 = (com.sportygames.newcms.b) r7
            if (r7 == 0) goto L75
            e5h r2 = r6.a
            wwd0 r6 = r2.f
            r0.a = r2
            r0.b = r7
            r8 = 0
            r0.c = r8
            r0.f = r4
            r6.getClass()
            r6.k(r5, r7)
            kotlin.Unit r6 = kotlin.Unit.a
            if (r6 != r1) goto L60
            goto L74
        L60:
            r6 = r8
        L61:
            t4h r8 = r2.b
            r0.a = r5
            r0.b = r5
            r0.c = r6
            r0.f = r3
            wwd0 r6 = r8.a
            r6.setValue(r7)
            kotlin.Unit r6 = kotlin.Unit.a
            if (r6 != r1) goto L75
        L74:
            return r1
        L75:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5h.emit(xxs, v1b):java.lang.Object");
    }
}
