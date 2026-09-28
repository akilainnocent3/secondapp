package defpackage;

import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawViewModelLegacy$makeWithdraw$1", f = "WithdrawViewModelLegacy.kt", l = {133}, m = "invokeSuspend", v = 2)
public final class krj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nrj0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c100 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    @c0d(c = "com.sportybet.android.basepay.viewModel.WithdrawViewModelLegacy$makeWithdraw$1$result$1", f = "WithdrawViewModelLegacy.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<ygj0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ nrj0 b;
        public final /* synthetic */ c100 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nrj0 nrj0Var, c100 c100Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = nrj0Var;
            this.c = c100Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ygj0 ygj0Var, v1b<? super Unit> v1bVar) {
            return ((a) create(ygj0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ygj0 ygj0Var = (ygj0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            nrj0 nrj0Var = this.b;
            nrj0Var.i.a(this.c, nrj0Var.H, ygj0Var);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krj0(nrj0 nrj0Var, String str, c100 c100Var, String str2, String str3, v1b<? super krj0> v1bVar) {
        super(2, v1bVar);
        this.b = nrj0Var;
        this.c = str;
        this.d = c100Var;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new krj0(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((krj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String strA;
        Object objA;
        y5b y5bVar = y5b.a;
        int i = this.a;
        nrj0 nrj0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            nrj0Var.C.setValue(lk50.b.a);
            boolean z = nrj0Var.E;
            BigDecimal bigDecimal = new BigDecimal(Double.parseDouble(this.c) * 10000.0d);
            c100 c100Var = this.d;
            if (c100Var == null) {
                return Unit.a;
            }
            int i2 = c100Var.a;
            String phoneNumber = nrj0Var.a.getPhoneNumber();
            String strB = nrj0Var.b.B();
            String str = nrj0Var.F;
            String str2 = nrj0Var.G;
            if (str2 != null) {
                nrj0Var.e.getClass();
                strA = nel.a(str2);
            } else {
                strA = null;
            }
            WithdrawRequest withdrawRequest = new WithdrawRequest(z ? 1 : 0, bigDecimal, i2, this.e, null, strB, null, null, this.f, null, phoneNumber, null, null, str, strA, null, null, null, null, null, null, null, 4168400, null);
            brj0 brj0Var = nrj0Var.d;
            a aVar = new a(nrj0Var, c100Var, null);
            this.a = 1;
            objA = brj0Var.a(withdrawRequest, aVar, Boolean.FALSE, this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = obj;
        }
        xoj0 xoj0Var = (xoj0) objA;
        nrj0Var.E = xoj0Var instanceof xoj0.b.a;
        wwd0 wwd0Var = nrj0Var.C;
        lk50.c cVar = new lk50.c(xoj0Var);
        wwd0Var.getClass();
        wwd0Var.k(null, cVar);
        return Unit.a;
    }
}
