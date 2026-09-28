package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class b5h0 implements lyh<f1h0> {
    public final /* synthetic */ vl50 a;
    public final /* synthetic */ e5h0 b;

    @c0d(c = "com.sportybet.android.transaction.ui.txdetails.TxDetailsViewModel$special$$inlined$map$1", f = "TxDetailsViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return b5h0.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ e5h0 b;

        @c0d(c = "com.sportybet.android.transaction.ui.txdetails.TxDetailsViewModel$special$$inlined$map$1$2", f = "TxDetailsViewModel.kt", l = {62, 68, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public q8h0 e;

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

        public b(myh myhVar, e5h0 e5h0Var) {
            this.a = myhVar;
            this.b = e5h0Var;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:48:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00e2, code lost:
        
            if (r9.emit(r10, r1) == r2) goto L53;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, defpackage.v1b r11) {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b5h0.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public b5h0(vl50 vl50Var, e5h0 e5h0Var) {
        this.a = vl50Var;
        this.b = e5h0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super f1h0> myhVar, v1b v1bVar) {
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
