package defpackage;

import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel$clickNext$1", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {319, 324, 332}, m = "invokeSuspend", v = 2)
public final class mpd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fqd b;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel$clickNext$1$1", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {320}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super ds>, Object> {
        public int a;
        public final /* synthetic */ fqd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fqd fqdVar, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.b = fqdVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super ds> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            fqd fqdVar = this.b;
            DepositDropAlertStatus depositDropAlertStatus = (DepositDropAlertStatus) fqdVar.K0.a.getValue();
            this.a = 1;
            Object objM = fqdVar.s0.M(depositDropAlertStatus, this);
            return objM == y5bVar ? y5bVar : objM;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel$clickNext$1$2", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {325}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function1<v1b<? super ds>, Object> {
        public int a;
        public final /* synthetic */ fqd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fqd fqdVar, v1b<? super b> v1bVar) {
            super(1, v1bVar);
            this.b = fqdVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super ds> v1bVar) {
            return ((b) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            fqd fqdVar = this.b;
            xi7 xi7Var = (xi7) fqdVar.N0.a.getValue();
            this.a = 1;
            Object objL1 = fqdVar.L1(xi7Var, this);
            return objL1 == y5bVar ? y5bVar : objL1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpd(fqd fqdVar, v1b<? super mpd> v1bVar) {
        super(2, v1bVar);
        this.b = fqdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mpd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mpd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r6.O1(r7) == r0) goto L32;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            fqd r6 = r7.b
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L17
            defpackage.uj50.b(r8)
            goto L89
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L1d:
            defpackage.uj50.b(r8)
            goto L6c
        L21:
            defpackage.uj50.b(r8)
            goto L51
        L25:
            defpackage.uj50.b(r8)
            v340 r8 = r6.J0
            uwd0<T> r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L3b
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L3b:
            r6.M1()
            r6.K1()
            mpd$a r8 = new mpd$a
            r8.<init>(r6, r2)
            r7.a = r5
            java.lang.String r1 = "system_maintenance"
            java.lang.Object r8 = r6.G1(r1, r8, r7)
            if (r8 != r0) goto L51
            goto L88
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5c
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L5c:
            mpd$b r8 = new mpd$b
            r8.<init>(r6, r2)
            r7.a = r4
            java.lang.String r1 = "insufficient_fund"
            java.lang.Object r8 = r6.G1(r1, r8, r7)
            if (r8 != r0) goto L6c
            goto L88
        L6c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L77
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L77:
            q900 r8 = r6.t0
            et7 r1 = defpackage.o8i0.d(r6)
            r8.d(r1)
            r7.a = r3
            java.lang.Object r7 = r6.O1(r7)
            if (r7 != r0) goto L89
        L88:
            return r0
        L89:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
