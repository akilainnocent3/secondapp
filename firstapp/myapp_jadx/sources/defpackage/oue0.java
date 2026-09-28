package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class oue0 implements lyh<Unit> {
    public final /* synthetic */ gzh a;
    public final /* synthetic */ long b;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ long b;

        /* JADX INFO: renamed from: oue0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.goldmine.usecase.TGBetUseCase$invoke$$inlined$map$2$2", f = "TGBetUseCase.kt", l = {51, 50}, m = "emit", v = 1)
        public static final class C0949a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public int e;

            public C0949a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, long j) {
            this.a = myhVar;
            this.b = j;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (r9.emit(r10, r0) == r1) goto L22;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r9, defpackage.v1b r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof oue0.a.C0949a
                if (r0 == 0) goto L13
                r0 = r10
                oue0$a$a r0 = (oue0.a.C0949a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                oue0$a$a r0 = new oue0$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L39
                if (r2 == r4) goto L31
                if (r2 != r3) goto L2b
                defpackage.uj50.b(r10)
                goto L60
            L2b:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r5
            L31:
                int r8 = r0.e
                myh r9 = r0.d
                defpackage.uj50.b(r10)
                goto L51
            L39:
                defpackage.uj50.b(r10)
                kotlin.Unit r9 = (kotlin.Unit) r9
                myh r9 = r8.a
                r0.d = r9
                r10 = 0
                r0.e = r10
                r0.b = r4
                long r6 = r8.b
                java.lang.Object r8 = defpackage.hkd.b(r6, r0)
                if (r8 != r1) goto L50
                goto L5f
            L50:
                r8 = r10
            L51:
                kotlin.Unit r10 = kotlin.Unit.a
                r0.d = r5
                r0.e = r8
                r0.b = r3
                java.lang.Object r8 = r9.emit(r10, r0)
                if (r8 != r1) goto L60
            L5f:
                return r1
            L60:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: oue0.a.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public oue0(gzh gzhVar, long j) {
        this.a = gzhVar;
        this.b = j;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
