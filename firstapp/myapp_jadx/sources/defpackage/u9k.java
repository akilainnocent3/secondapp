package defpackage;

import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class u9k implements lyh<NonFtdEngagement> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ x9k b;

    @c0d(c = "com.sporty.android.platform.features.welcomereward.domain.usecase.GetNonFtdCacheDataUseCase$invoke$$inlined$map$1", f = "GetNonFtdCacheDataUseCase.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return u9k.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ x9k b;

        @c0d(c = "com.sporty.android.platform.features.welcomereward.domain.usecase.GetNonFtdCacheDataUseCase$invoke$$inlined$map$1$2", f = "GetNonFtdCacheDataUseCase.kt", l = {51, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, x9k x9kVar) {
            this.a = myhVar;
            this.b = x9kVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r7.emit(r9, r0) == r1) goto L22;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, defpackage.v1b r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof u9k.b.a
                if (r0 == 0) goto L13
                r0 = r9
                u9k$b$a r0 = (u9k.b.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                u9k$b$a r0 = new u9k$b$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L37
                if (r2 == r4) goto L31
                if (r2 != r3) goto L2b
                defpackage.uj50.b(r9)
                goto L59
            L2b:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r5
            L31:
                myh r7 = r0.d
                defpackage.uj50.b(r9)
                goto L4e
            L37:
                defpackage.uj50.b(r9)
                java.lang.String r8 = (java.lang.String) r8
                myh r9 = r7.a
                r0.d = r9
                r0.b = r4
                x9k r7 = r7.b
                java.lang.Object r7 = r7.b(r8, r0)
                if (r7 != r1) goto L4b
                goto L58
            L4b:
                r6 = r9
                r9 = r7
                r7 = r6
            L4e:
                r0.d = r5
                r0.b = r3
                java.lang.Object r7 = r7.emit(r9, r0)
                if (r7 != r1) goto L59
            L58:
                return r1
            L59:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: u9k.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public u9k(lyh lyhVar, x9k x9kVar) {
        this.a = lyhVar;
        this.b = x9kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super NonFtdEngagement> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
