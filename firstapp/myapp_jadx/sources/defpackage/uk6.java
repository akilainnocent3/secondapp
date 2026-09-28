package defpackage;

import com.sporty.android.core.model.cashout.CashoutJsData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class uk6 implements lyh<Boolean> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ com.sportybet.android.cashoutphase3.b b;

    @c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$observeCcfState$$inlined$filter$1", f = "CashOutFragment.kt", l = {109}, m = "collect", v = 2)
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
            return uk6.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ com.sportybet.android.cashoutphase3.b b;

        @c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$observeCcfState$$inlined$filter$1$2", f = "CashOutFragment.kt", l = {50}, m = "emit", v = 2)
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
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, com.sportybet.android.cashoutphase3.b bVar) {
            this.a = myhVar;
            this.b = bVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            Boolean zeroMarginCashOutEnabled;
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
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj2);
                ((Boolean) obj).getClass();
                CashoutJsData cashoutJsDataA = this.b.s0().A.a();
                if ((cashoutJsDataA == null || (zeroMarginCashOutEnabled = cashoutJsDataA.getZeroMarginCashOutEnabled()) == null) ? false : zeroMarginCashOutEnabled.booleanValue()) {
                    aVar.b = 1;
                    if (this.a.emit(obj, aVar) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public uk6(lyh lyhVar, com.sportybet.android.cashoutphase3.b bVar) {
        this.a = lyhVar;
        this.b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
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
