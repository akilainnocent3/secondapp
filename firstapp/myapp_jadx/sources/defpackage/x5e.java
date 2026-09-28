package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lx5e;", "Lm02;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class x5e extends m02 {
    public final l5k l0;
    public final psm m0;
    public final i390 n0;
    public final log0 o0;
    public final a300.i p0;
    public final wwd0 q0;
    public final wwd0 r0;
    public final wwd0 s0;
    public final List<lyh<lk50<Object>>> t0;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositPaybillViewModel$2", f = "DepositPaybillViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends AssetData>, v1b<? super Unit>, Object> {
        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return x5e.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends AssetData> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            x5e x5eVar = x5e.this;
            ej5.c(o8i0.d(x5eVar), null, null, new y5e(x5eVar, null), 3);
            return Unit.a;
        }
    }

    public static final class b implements lyh<lk50<? extends AssetData>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ x5e b;

        @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositPaybillViewModel$special$$inlined$filter$1", f = "DepositPaybillViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: x5e$b$b, reason: collision with other inner class name */
        public static final class C1276b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ x5e b;

            /* JADX INFO: renamed from: x5e$b$b$a */
            @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositPaybillViewModel$special$$inlined$filter$1$2", f = "DepositPaybillViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C1276b.this.emit(null, this);
                }
            }

            public C1276b(myh myhVar, x5e x5eVar) {
                this.a = myhVar;
                this.b = x5eVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
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
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    if (this.b.m0.o()) {
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

        public b(lyh lyhVar, x5e x5eVar) {
            this.a = lyhVar;
            this.b = x5eVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lk50<? extends AssetData>> myhVar, v1b v1bVar) {
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
                C1276b c1276b = new C1276b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(c1276b, aVar) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5e(wl wlVar, uy0 uy0Var, cbg cbgVar, l5k l5kVar, uqm uqmVar, psm psmVar, uyx uyxVar, lyz lyzVar, d100 d100Var, sr10 sr10Var, vu60 vu60Var, u290 u290Var, i390 i390Var, mgb0 mgb0Var, rdd0 rdd0Var, eth0 eth0Var) {
        super(uyxVar, eth0Var, rdd0Var, uy0Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, uqmVar, u290Var, cbgVar, vu60Var);
        rdd0Var.getClass();
        sr10Var.getClass();
        uy0Var.getClass();
        d100Var.getClass();
        lyzVar.getClass();
        wlVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        uqmVar.getClass();
        i390Var.getClass();
        u290Var.getClass();
        cbgVar.getClass();
        vu60Var.getClass();
        this.l0 = l5kVar;
        this.m0 = psmVar;
        this.n0 = i390Var;
        this.o0 = log0.a;
        this.p0 = new a300.i(psmVar.getCountryCode());
        wwd0 wwd0VarA = xwd0.a(m2g.a);
        this.q0 = wwd0VarA;
        this.r0 = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(lk50.b.a);
        this.s0 = wwd0VarA2;
        pu0.b bVar = pu0.b.a;
        this.t0 = kotlin.collections.b.k(wwd0VarA2, d100Var.a(bVar));
        kzh.d(new g1i(new b(sr10Var.W(bVar), this), new a(null)), o8i0.d(this));
    }

    @Override // defpackage.k72
    public final List<lyh<lk50<Object>>> A1() {
        return this.t0;
    }

    @Override // defpackage.m02, defpackage.k72
    public final y200 B1() {
        return this.p0;
    }

    @Override // defpackage.m02, defpackage.k72
    /* JADX INFO: renamed from: C1, reason: from getter */
    public final log0 getT0() {
        return this.o0;
    }

    @Override // defpackage.k72
    public final List<c9p> E1() throws Exception {
        ngs ngsVarB = kotlin.collections.a.b();
        ngsVarB.add(ej5.c(o8i0.d(this), null, null, new y5e(this, null), 3));
        boolean zO = this.m0.o();
        i390 i390Var = this.n0;
        if (zO) {
            et7 et7VarD = o8i0.d(this);
            log0 log0Var = this.o0;
            log0Var.getClass();
            ngsVarB.add(i390Var.b(et7VarD, log0Var));
            ngsVarB.add(i390Var.c(o8i0.d(this), log0Var));
        }
        CountryCodeName countryCodeName = this.p0.a;
        int i = a300.i.a.a[countryCodeName.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                ngsVarB.add(i390Var.a(o8i0.d(this)));
            } else if (i != 4) {
                throw new Exception(l4j0.a("`isDefaultChannelNeeded` undefine for ", countryCodeName, " in PayMethodDeposit.Paybill"));
            }
        }
        return kotlin.collections.a.a(ngsVarB);
    }

    @Override // defpackage.m02
    /* JADX INFO: renamed from: J1 */
    public final a300 B1() {
        return this.p0;
    }
}
