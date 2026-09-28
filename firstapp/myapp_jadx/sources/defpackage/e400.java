package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Le400;", "Lj8i0;", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e400 extends j8i0 {
    public final eak a;
    public final b700 b;
    public final psm c;
    public final i390 d;
    public log0 e;
    public final mpe0 f;
    public final wwd0 i;
    public final wwd0 v;
    public final mpe0 w;
    public final wwd0 y;
    public final wwd0 z;

    @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.PayMethodsViewModel$showTabLayoutScrollBtnPromotedFlow$2$2", f = "PayMethodsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<z200, Boolean, v1b<? super Boolean>, Object> {
        public /* synthetic */ boolean a;

        @Override // defpackage.gaj
        public final Object invoke(z200 z200Var, Boolean bool, v1b<? super Boolean> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(3, v1bVar);
            aVar.a = zBooleanValue;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(z);
        }
    }

    public static final class b implements lyh<z200> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.PayMethodsViewModel$showTabLayoutScrollBtnPromotedFlow_delegate$lambda$0$$inlined$filter$1", f = "PayMethodsViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: e400$b$b, reason: collision with other inner class name */
        public static final class C0513b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: e400$b$b$a */
            @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.PayMethodsViewModel$showTabLayoutScrollBtnPromotedFlow_delegate$lambda$0$$inlined$filter$1$2", f = "PayMethodsViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C0513b.this.emit(null, this);
                }
            }

            public C0513b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                List<y200> list;
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
                    z200 z200Var = (z200) obj;
                    if (z200Var != null && (list = z200Var.a) != null && (!list.isEmpty())) {
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

        public b(uwd0 uwd0Var) {
            this.a = uwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super z200> myhVar, v1b v1bVar) {
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
                C0513b c0513b = new C0513b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0513b, aVar) == y5bVar) {
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

    public static final class c implements lyh<Boolean> {
        public final /* synthetic */ n1i a;

        @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.PayMethodsViewModel$showTabLayoutScrollBtnPromotedFlow_delegate$lambda$0$$inlined$filter$2", f = "PayMethodsViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.payment.impl.common.presentation.viewmodel.PayMethodsViewModel$showTabLayoutScrollBtnPromotedFlow_delegate$lambda$0$$inlined$filter$2$2", f = "PayMethodsViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar) {
                this.a = myhVar;
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
                    if (((Boolean) obj).booleanValue()) {
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

        public c(n1i n1iVar) {
            this.a = n1iVar;
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
                b bVar = new b(myhVar);
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

    public e400(eak eakVar, b700 b700Var, psm psmVar, i390 i390Var) {
        b700Var.getClass();
        psmVar.getClass();
        i390Var.getClass();
        this.a = eakVar;
        this.b = b700Var;
        this.c = psmVar;
        this.d = i390Var;
        this.f = hwr.b(new Function0() { // from class: a400
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                b200 b200VarW;
                lyh lyhVarB;
                List listK;
                List listK2;
                List listK3;
                e400 e400Var = this.a;
                eak eakVar2 = e400Var.a;
                log0 log0Var = e400Var.e;
                if (log0Var == null) {
                    Intrinsics.n("tradeType");
                    throw null;
                }
                rak rakVar = eakVar2.e;
                sr10 sr10Var = eakVar2.a;
                CountryCodeName countryCode = eakVar2.d.getCountryCode();
                int i = eak.a.a[countryCode.ordinal()];
                if (i == 1 || i == 2) {
                    d100 d100Var = eakVar2.b;
                    int iOrdinal = log0Var.ordinal();
                    if (iOrdinal == 0) {
                        b200VarW = d100Var.w();
                    } else {
                        if (iOrdinal != 1) {
                            uhc.a();
                            return null;
                        }
                        b200VarW = d100Var.O();
                    }
                    lyhVarB = r1i.b(b200VarW, d100Var.c(log0Var), d100Var.E(log0Var), new i0i(sr10Var.a(log0Var)), new fak(log0Var, countryCode, eakVar2, null));
                } else if (i == 3) {
                    int iOrdinal2 = log0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        lyhVarB = r1i.a(new gzh(a300.c.a(countryCode)), bm50.f(sr10Var.W(pu0.b.a)), bm50.f(rakVar.a(log0Var, null)), new hak(4, null));
                    } else {
                        if (iOrdinal2 != 1) {
                            uhc.a();
                            return null;
                        }
                        switch (z300.a[countryCode.ordinal()]) {
                            case 1:
                                listK = b.k(new y300.b(countryCode), new y300.a(countryCode));
                                break;
                            case 2:
                                listK = b.k(new y300.a(countryCode), new y300.c(countryCode), new y300.d(countryCode));
                                break;
                            case 3:
                                listK = a.c(new y300.a(countryCode));
                                break;
                            case 4:
                            case 5:
                            case 6:
                                listK = a.c(new y300.b(countryCode));
                                break;
                            default:
                                listK = m2g.a;
                                break;
                        }
                        lyhVarB = new gzh(new z200(listK, m2g.a, null));
                    }
                } else if (i == 4) {
                    int iOrdinal3 = log0Var.ordinal();
                    if (iOrdinal3 == 0) {
                        lyhVarB = new n1i(new gzh(a300.c.a(countryCode)), sr10Var.g(pu0.b.a), new iak(3, null));
                    } else {
                        if (iOrdinal3 != 1) {
                            uhc.a();
                            return null;
                        }
                        switch (z300.a[countryCode.ordinal()]) {
                            case 1:
                                listK2 = b.k(new y300.b(countryCode), new y300.a(countryCode));
                                break;
                            case 2:
                                listK2 = b.k(new y300.a(countryCode), new y300.c(countryCode), new y300.d(countryCode));
                                break;
                            case 3:
                                listK2 = a.c(new y300.a(countryCode));
                                break;
                            case 4:
                            case 5:
                            case 6:
                                listK2 = a.c(new y300.b(countryCode));
                                break;
                            default:
                                listK2 = m2g.a;
                                break;
                        }
                        lyhVarB = new gzh(new z200(listK2, m2g.a, null));
                    }
                } else {
                    if (i != 5) {
                        nrh0.a(countryCode, "Unsupported country code: ", " for trade type: ", log0Var);
                        return null;
                    }
                    String phoneNumber = eakVar2.f.getPhoneNumber();
                    int iOrdinal4 = log0Var.ordinal();
                    if (iOrdinal4 == 0) {
                        lyhVarB = new n1i(new gzh(a300.c.a(countryCode)), bm50.f(rakVar.a(log0Var, phoneNumber)), new gak(3, null));
                    } else {
                        if (iOrdinal4 != 1) {
                            uhc.a();
                            return null;
                        }
                        switch (z300.a[countryCode.ordinal()]) {
                            case 1:
                                listK3 = b.k(new y300.b(countryCode), new y300.a(countryCode));
                                break;
                            case 2:
                                listK3 = b.k(new y300.a(countryCode), new y300.c(countryCode), new y300.d(countryCode));
                                break;
                            case 3:
                                listK3 = a.c(new y300.a(countryCode));
                                break;
                            case 4:
                            case 5:
                            case 6:
                                listK3 = a.c(new y300.b(countryCode));
                                break;
                            default:
                                listK3 = m2g.a;
                                break;
                        }
                        lyhVarB = new gzh(new z200(listK3, m2g.a, null));
                    }
                }
                return e1i.e(szh.a(lyhVarB, 100L), o8i0.d(e400Var), q490.a.a, null);
            }
        });
        wwd0 wwd0VarA = xwd0.a(null);
        this.i = wwd0VarA;
        this.v = wwd0VarA;
        this.w = hwr.b(new vf3(this, 1));
        wwd0 wwd0VarA2 = xwd0.a(tzs.a.a);
        this.y = wwd0VarA2;
        this.z = wwd0VarA2;
    }

    public final uwd0<z200> x1() {
        return (uwd0) this.f.getValue();
    }

    public final List<c9p> y1() {
        ngs ngsVarB = kotlin.collections.a.b();
        psm psmVar = this.c;
        boolean zO = psmVar.o();
        i390 i390Var = this.d;
        if (zO) {
            et7 et7VarD = o8i0.d(this);
            log0 log0Var = this.e;
            if (log0Var == null) {
                Intrinsics.n("tradeType");
                throw null;
            }
            ngsVarB.add(i390Var.c(et7VarD, log0Var));
            et7 et7VarD2 = o8i0.d(this);
            log0 log0Var2 = this.e;
            if (log0Var2 == null) {
                Intrinsics.n("tradeType");
                throw null;
            }
            ngsVarB.add(i390Var.b(et7VarD2, log0Var2));
        }
        if (psmVar.G()) {
            ngsVarB.add(i390Var.a(o8i0.d(this)));
        }
        if (psmVar.S()) {
            et7 et7VarD3 = o8i0.d(this);
            log0 log0Var3 = this.e;
            if (log0Var3 == null) {
                Intrinsics.n("tradeType");
                throw null;
            }
            ngsVarB.add(i390Var.c(et7VarD3, log0Var3));
        }
        return kotlin.collections.a.a(ngsVarB);
    }

    public final void z1(y200 y200Var) {
        wwd0 wwd0Var = this.i;
        wwd0Var.getClass();
        wwd0Var.k(null, y200Var);
        z200 value = x1().getValue();
        if (value != null && value.b.contains(y200Var)) {
            ej5.c(o8i0.d(this), null, null, new c400(y200Var, this, null), 3);
        }
    }
}
