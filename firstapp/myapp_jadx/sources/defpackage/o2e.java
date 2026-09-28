package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class o2e implements lyh<Boolean> {
    public final /* synthetic */ wwd0 a;
    public final /* synthetic */ r2e b;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$special$$inlined$map$1", f = "DepositMomoViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return o2e.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ r2e b;

        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$special$$inlined$map$1$2", f = "DepositMomoViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, r2e r2eVar) {
            this.a = myhVar;
            this.b = r2eVar;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0060  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) throws Exception {
            a aVar;
            boolean z;
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
                ChannelAsset.Channel channel = (ChannelAsset.Channel) obj;
                CountryCodeName countryCodeName = this.b.B0.a;
                int i3 = a300.f.a.a[countryCodeName.ordinal()];
                if (i3 == 1) {
                    z = true;
                } else {
                    if (i3 != 2 && i3 != 3 && i3 != 4) {
                        throw new Exception(l4j0.a("`isSwitchChannelAfter1stDepositAllowed` undefine for ", countryCodeName, " in PayMethodWithdraw.Momo"));
                    }
                    if (channel == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                aVar.b = 1;
                if (this.a.emit(boolValueOf, aVar) == y5bVar) {
                    return y5bVar;
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

    public o2e(wwd0 wwd0Var, r2e r2eVar) {
        this.a = wwd0Var;
        this.b = r2eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) throws Throwable {
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
