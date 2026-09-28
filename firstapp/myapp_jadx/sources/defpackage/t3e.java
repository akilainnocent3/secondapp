package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class t3e implements lyh<List<? extends String>> {
    public final /* synthetic */ lyh a;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositNewCardDialogFragment$initViewModel$lambda$0$$inlined$map$1", f = "DepositNewCardDialogFragment.kt", l = {109}, m = "collect", v = 2)
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
            return t3e.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositNewCardDialogFragment$initViewModel$lambda$0$$inlined$map$1$2", f = "DepositNewCardDialogFragment.kt", l = {51, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public List e;

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

        public b(myh myhVar) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        
            if (r10.emit(r9, r0) == r1) goto L22;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, defpackage.v1b r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof t3e.b.a
                if (r0 == 0) goto L13
                r0 = r11
                t3e$b$a r0 = (t3e.b.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                t3e$b$a r0 = new t3e$b$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L39
                if (r2 == r4) goto L31
                if (r2 != r3) goto L2b
                defpackage.uj50.b(r11)
                goto L5f
            L2b:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r9)
                return r5
            L31:
                java.util.List r9 = r0.e
                myh r10 = r0.d
                defpackage.uj50.b(r11)
                goto L52
            L39:
                defpackage.uj50.b(r11)
                java.util.List r10 = (java.util.List) r10
                myh r9 = r9.a
                r0.d = r9
                r0.e = r10
                r0.b = r4
                r6 = 100
                java.lang.Object r11 = defpackage.hkd.b(r6, r0)
                if (r11 != r1) goto L4f
                goto L5e
            L4f:
                r8 = r10
                r10 = r9
                r9 = r8
            L52:
                r0.d = r5
                r0.e = r5
                r0.b = r3
                java.lang.Object r9 = r10.emit(r9, r0)
                if (r9 != r1) goto L5f
            L5e:
                return r1
            L5f:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: t3e.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public t3e(lyh lyhVar) {
        this.a = lyhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super List<? extends String>> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar);
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
