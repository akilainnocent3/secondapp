package defpackage;

import com.sporty.android.core.model.pocket.deposit.DepositRequest;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.DepositViewModelLegacy$makeDeposit$1", f = "DepositViewModelLegacy.kt", l = {129}, m = "invokeSuspend", v = 2)
public final class n9e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r9e c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;

    @c0d(c = "com.sportybet.android.basepay.viewModel.DepositViewModelLegacy$makeDeposit$1$1", f = "DepositViewModelLegacy.kt", l = {119}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ r9e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r9e r9eVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = r9eVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ba50 ba50Var = this.b.y;
                this.a = 1;
                if (ba50Var.a(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.DepositViewModelLegacy$makeDeposit$1$result$1", f = "DepositViewModelLegacy.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<qnd, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ r9e b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r9e r9eVar, int i, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = r9eVar;
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.b, this.c, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qnd qndVar, v1b<? super Unit> v1bVar) {
            return ((b) create(qndVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qnd qndVar = (qnd) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            r9e r9eVar = this.b;
            r9eVar.w.a(this.c, r9eVar.J, qndVar, t3g.a);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9e(r9e r9eVar, int i, String str, String str2, String str3, v1b<? super n9e> v1bVar) {
        super(2, v1bVar);
        this.c = r9eVar;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.i = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n9e n9eVar = new n9e(this.c, this.d, this.e, this.f, this.i, v1bVar);
        n9eVar.b = obj;
        return n9eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n9e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        r9e r9eVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            r9eVar.F.setValue(lk50.b.a);
            int i2 = this.d;
            r9eVar.I = i2;
            ej5.c(v5bVar, null, null, new a(r9eVar, null), 3);
            BigDecimal bigDecimal = new BigDecimal(Double.parseDouble(this.e) * 10000.0d);
            String phoneNumber = this.f;
            if (phoneNumber == null) {
                phoneNumber = r9eVar.b.getPhoneNumber();
            }
            DepositRequest depositRequest = new DepositRequest(0, bigDecimal, this.d, phoneNumber, null, r9eVar.c.B(), null, null, null, null, null, null, null, null, null, null, null, null, null, this.i, null, null, null, null, 16252880, null);
            k9e k9eVar = r9eVar.d;
            b bVar = new b(r9eVar, i2, null);
            this.b = null;
            this.a = 1;
            objA = k9eVar.a(depositRequest, bVar, this);
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
        wwd0 wwd0Var = r9eVar.F;
        lk50.c cVar = new lk50.c((x7e) objA);
        wwd0Var.getClass();
        wwd0Var.k(null, cVar);
        return Unit.a;
    }
}
