package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class z100 implements lyh<String> {
    public final /* synthetic */ vl50 a;
    public final /* synthetic */ log0 b;
    public final /* synthetic */ k200 c;

    @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$getMethodsOrder$$inlined$map$1", f = "PayConfigRepositoryImpl.kt", l = {109}, m = "collect", v = 2)
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
            return z100.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ log0 b;
        public final /* synthetic */ k200 c;

        @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$getMethodsOrder$$inlined$map$1$2", f = "PayConfigRepositoryImpl.kt", l = {91, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public String e;

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

        public b(myh myhVar, log0 log0Var, k200 k200Var) {
            this.a = myhVar;
            this.b = log0Var;
            this.c = k200Var;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x007b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0144, code lost:
        
            if (r10.emit(r9, r0) == r1) goto L95;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, defpackage.v1b r11) {
            /*
                Method dump skipped, instruction units count: 330
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z100.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public z100(vl50 vl50Var, log0 log0Var, k200 k200Var) {
        this.a = vl50Var;
        this.b = log0Var;
        this.c = k200Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b, this.c);
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
