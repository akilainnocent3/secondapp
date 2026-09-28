package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class rhj0 implements lyh<vw<BigDecimal>> {
    public final /* synthetic */ zl50 a;
    public final /* synthetic */ y300 b;
    public final /* synthetic */ shj0 c;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.domain.usecase.WithdrawAmountRangeUseCase$invoke$$inlined$map$1", f = "WithdrawAmountRangeUseCase.kt", l = {109}, m = "collect", v = 2)
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
            return rhj0.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ y300 b;
        public final /* synthetic */ shj0 c;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.domain.usecase.WithdrawAmountRangeUseCase$invoke$$inlined$map$1$2", f = "WithdrawAmountRangeUseCase.kt", l = {54, 67, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public vw e;

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

        public b(myh myhVar, y300 y300Var, shj0 shj0Var) {
            this.a = myhVar;
            this.b = y300Var;
            this.c = shj0Var;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0071  */
        /* JADX WARN: Code duplicated, block: B:27:0x0076  */
        /* JADX WARN: Code duplicated, block: B:29:0x0079  */
        /* JADX WARN: Code duplicated, block: B:30:0x007e  */
        /* JADX WARN: Code duplicated, block: B:34:0x0089  */
        /* JADX WARN: Code duplicated, block: B:36:0x008c  */
        /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:63:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:70:0x0109  */
        /* JADX WARN: Code duplicated, block: B:72:0x010c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0121, code lost:
        
            if (r11.emit(r3, r1) == r2) goto L75;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r12, defpackage.v1b r13) {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rhj0.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public rhj0(zl50 zl50Var, y300 y300Var, shj0 shj0Var) {
        this.a = zl50Var;
        this.b = y300Var;
        this.c = shj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super vw<BigDecimal>> myhVar, v1b v1bVar) {
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
