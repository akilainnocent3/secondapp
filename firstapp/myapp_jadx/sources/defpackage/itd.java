package defpackage;

import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$clickNext$1", f = "DepositCardViewModel.kt", l = {697, 702, 721, 726}, m = "invokeSuspend", v = 2)
public final class itd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tud b;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$clickNext$1$1", f = "DepositCardViewModel.kt", l = {698}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super ds>, Object> {
        public int a;
        public final /* synthetic */ tud b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tud tudVar, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.b = tudVar;
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
            tud tudVar = this.b;
            DepositDropAlertStatus depositDropAlertStatus = (DepositDropAlertStatus) tudVar.C0.a.getValue();
            this.a = 1;
            Object objM = tudVar.z0.M(depositDropAlertStatus, this);
            return objM == y5bVar ? y5bVar : objM;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositCardViewModel$clickNext$1$2", f = "DepositCardViewModel.kt", l = {703}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function1<v1b<? super ds>, Object> {
        public int a;
        public final /* synthetic */ tud b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tud tudVar, v1b<? super b> v1bVar) {
            super(1, v1bVar);
            this.b = tudVar;
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
            tud tudVar = this.b;
            xi7 xi7Var = (xi7) tudVar.q1.a.getValue();
            this.a = 1;
            Object objL1 = tudVar.L1(xi7Var, this);
            return objL1 == y5bVar ? y5bVar : objL1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itd(tud tudVar, v1b<? super itd> v1bVar) {
        super(2, v1bVar);
        this.b = tudVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new itd(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((itd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        if (r11 == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f8, code lost:
    
        if (r11 == r0) goto L55;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
