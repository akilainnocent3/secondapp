package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class d5e implements lyh<Integer> {
    public final /* synthetic */ wwd0 a;
    public final /* synthetic */ f5e b;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositOtherBanksViewModel$special$$inlined$map$1", f = "DepositOtherBanksViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return d5e.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ f5e b;

        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositOtherBanksViewModel$special$$inlined$map$1$2", f = "DepositOtherBanksViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, f5e f5eVar) {
            this.a = myhVar;
            this.b = f5eVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) throws Exception {
            a aVar;
            int i;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i2 = aVar.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.b = i2 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i3 = aVar.b;
            if (i3 == 0) {
                uj50.b(obj2);
                if (((AssetData.AccountsBean) obj) != null) {
                    c100 c100Var = c100.e;
                    i = 1;
                } else {
                    this.b.u0.e();
                    i = 21;
                }
                Integer num = new Integer(i);
                aVar.b = 1;
                if (this.a.emit(num, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public d5e(wwd0 wwd0Var, f5e f5eVar) {
        this.a = wwd0Var;
        this.b = f5eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Integer> myhVar, v1b v1bVar) throws Throwable {
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
        if (i2 != 0) {
            if (i2 == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        b bVar = new b(myhVar, this.b);
        aVar.b = 1;
        this.a.collect(bVar, aVar);
        return y5bVar;
    }
}
