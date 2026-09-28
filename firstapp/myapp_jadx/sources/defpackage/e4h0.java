package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class e4h0 implements lyh<lk50<? extends Unit>> {
    public final /* synthetic */ lyh[] a;

    @c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$init$$inlined$combine$2", f = "TxDetailsV2ViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return e4h0.this.collect(null, this);
        }
    }

    public static final class b implements Function0<lk50<? extends Object>[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final lk50<? extends Object>[] invoke() {
            return new lk50[this.a.length];
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxDetailsV2ViewModel$init$$inlined$combine$2$3", f = "TxDetailsV2ViewModel.kt", l = {288}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super lk50<? extends Unit>>, lk50<? extends Object>[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends Unit>> myhVar, lk50<? extends Object>[] lk50VarArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(3, v1bVar);
            cVar.b = myhVar;
            cVar.c = lk50VarArr;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var;
            lk50 cVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                lk50[] lk50VarArr = (lk50[]) this.c;
                int length = lk50VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        lk50Var = null;
                        break;
                    }
                    lk50Var = lk50VarArr[i3];
                    if (lk50Var instanceof lk50.a) {
                        break;
                    }
                    i3++;
                }
                lk50.a aVar = lk50Var instanceof lk50.a ? (lk50.a) lk50Var : null;
                int length2 = lk50VarArr.length;
                while (true) {
                    if (i2 >= length2) {
                        if (aVar == null) {
                            cVar = new lk50.c(Unit.a);
                            break;
                        }
                        cVar = new lk50.a(aVar.a);
                        break;
                    }
                    if (lk50VarArr[i2] instanceof lk50.b) {
                        cVar = lk50.b.a;
                        break;
                    }
                    i2++;
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(cVar, this) == y5bVar) {
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

    public e4h0(lyh[] lyhVarArr) {
        this.a = lyhVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super lk50<? extends Unit>> myhVar, v1b v1bVar) {
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
            c cVar = new c(3, null);
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
