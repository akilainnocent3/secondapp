package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import com.sporty.android.core.model.pocket.transaction.TransactionProgressDetail;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class d4h0 implements lyh<Unit> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ r4h0 b;

    @c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$init$$inlined$combine$1", f = "TxDetailsV2ViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return d4h0.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[this.a.length];
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$init$$inlined$combine$1$3", f = "TxDetailsV2ViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super Unit>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ r4h0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, r4h0 r4h0Var) {
            super(3, v1bVar);
            this.d = r4h0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Unit> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            AssetsInfo assetsInfo;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                Transaction transaction = (Transaction) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                t8h0 t8h0Var = (t8h0) obj3;
                Object obj4 = objArr[2];
                obj4.getClass();
                f1h0 f1h0Var = (f1h0) obj4;
                Object obj5 = objArr[3];
                obj5.getClass();
                lk50 lk50Var = (lk50) obj5;
                Object obj6 = objArr[4];
                obj6.getClass();
                boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                Object obj7 = objArr[5];
                obj7.getClass();
                boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
                if (cVar == null || (assetsInfo = (AssetsInfo) cVar.a) == null) {
                    unit = Unit.a;
                } else {
                    int i2 = assetsInfo.auditStatus;
                    r4h0 r4h0Var = this.d;
                    if (zBooleanValue2) {
                        r4h0.A1(r4h0Var, new xpg0.b(0), g4h0.a, 2);
                    }
                    ArrayList<TransactionProgressDetail> arrayList = transaction.transactionProgressDetailList;
                    r4h0Var.y1().setValue((t3h0) new h4h0(!(arrayList == null || arrayList.isEmpty()), transaction, r4h0Var, zBooleanValue2, t8h0Var, f1h0Var, zBooleanValue, i2).invoke(r4h0Var.y1().getValue()));
                    unit = Unit.a;
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(unit, this) == y5bVar) {
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

    public d4h0(lyh[] lyhVarArr, r4h0 r4h0Var) {
        this.a = lyhVarArr;
        this.b = r4h0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
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
            lyh[] lyhVarArr = this.a;
            b bVar = new b(lyhVarArr);
            c cVar = new c(null, this.b);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
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
