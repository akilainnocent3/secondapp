package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$initTxDetails$1", f = "TxDetailsV2ViewModel.kt", l = {246}, m = "invokeSuspend", v = 2)
public final class o4h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r4h0 b;

    @c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$initTxDetails$1$1", f = "TxDetailsV2ViewModel.kt", l = {245}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super Transaction>, Object> {
        public int a;
        public final /* synthetic */ r4h0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, r4h0 r4h0Var) {
            super(1, v1bVar);
            this.b = r4h0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Transaction> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                r4h0 r4h0Var = this.b;
                sr10 sr10Var = r4h0Var.a;
                String str = r4h0Var.w;
                if (str == null) {
                    Intrinsics.n("tradeId");
                    throw null;
                }
                int i2 = r4h0Var.y;
                this.a = 1;
                obj = sr10Var.J(i2, this, str);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return n52.b((BaseResponse) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4h0(v1b v1bVar, r4h0 r4h0Var) {
        super(2, v1bVar);
        this.b = r4h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o4h0(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o4h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            r4h0 r4h0Var = this.b;
            lyh lyhVarA = su0.a(r4h0Var.N, pu0.c.a, new a(null, r4h0Var));
            this.a = 1;
            if (bm50.p(lyhVarA, this) == y5bVar) {
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
