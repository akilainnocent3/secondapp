package defpackage;

import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class k200 implements d100 {
    public final lq1 a;
    public final b700 b;
    public final xeh0 c;
    public final a d;

    public static final class a implements lyh<Integer> {
        public final /* synthetic */ vl50 a;

        /* JADX INFO: renamed from: k200$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$special$$inlined$mapNotNull$1", f = "PayConfigRepositoryImpl.kt", l = {109}, m = "collect", v = 2)
        public static final class C0747a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0747a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: k200$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes6.dex */
            @c0d(c = "com.sportybet.feature.payment.impl.common.data.repository.PayConfigRepositoryImpl$special$$inlined$mapNotNull$1$2", f = "PayConfigRepositoryImpl.kt", l = {88}, m = "emit", v = 2)
            public static final class C0748a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0748a(v1b v1bVar) {
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

            /* JADX WARN: Code duplicated, block: B:35:0x0084  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0748a c0748a;
                Integer intOrNull;
                if (v1bVar instanceof C0748a) {
                    c0748a = (C0748a) v1bVar;
                    int i = c0748a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0748a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0748a = new C0748a(v1bVar);
                    }
                } else {
                    c0748a = new C0748a(v1bVar);
                }
                Object obj2 = c0748a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0748a.b;
                Object obj3 = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    BOConfigValueWrapper response = ((BOConfigValueBundle) obj).getResponse(qg4.DepositDedicatedAccountsNumberLimit.a);
                    Object configValue = response != null ? response.getConfigValue() : null;
                    dq7 dq7VarA = jq40.a(Integer.class);
                    if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                        if (configValue instanceof Integer) {
                            obj3 = (Integer) configValue;
                        } else if ((configValue instanceof String) && (intOrNull = StringsKt.toIntOrNull((String) configValue)) != null) {
                            obj3 = intOrNull;
                        }
                    } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                        if (configValue instanceof Long) {
                            if (configValue instanceof Integer) {
                                obj3 = configValue;
                            }
                            obj3 = (Integer) obj3;
                        } else if (configValue instanceof String) {
                            StringsKt.s0((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                        if (configValue instanceof Float) {
                            if (configValue instanceof Integer) {
                                obj3 = configValue;
                            }
                            obj3 = (Integer) obj3;
                        } else if (configValue instanceof String) {
                            kotlin.text.b.i((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                        if (configValue instanceof Double) {
                            if (configValue instanceof Integer) {
                                obj3 = configValue;
                            }
                            obj3 = (Integer) obj3;
                        } else if (configValue instanceof String) {
                            kotlin.text.b.h((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                        if (configValue instanceof Boolean) {
                            if (configValue instanceof Integer) {
                                obj3 = configValue;
                            }
                            obj3 = (Integer) obj3;
                        } else if (configValue instanceof String) {
                            StringsKt.r0((String) configValue);
                        }
                    } else if (dq7VarA.equals(jq40.a(String.class))) {
                        if (configValue != null) {
                            configValue.toString();
                        }
                    } else if (configValue != null) {
                        if (configValue instanceof Integer) {
                            obj3 = configValue;
                        }
                        obj3 = (Integer) obj3;
                    }
                    if (obj3 != null) {
                        c0748a.b = 1;
                        if (this.a.emit(obj3, c0748a) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a(yFmFZvuWxAYfEj.Ltn);
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(vl50 vl50Var) {
            this.a = vl50Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Integer> myhVar, v1b v1bVar) {
            C0747a c0747a;
            if (v1bVar instanceof C0747a) {
                c0747a = (C0747a) v1bVar;
                int i = c0747a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0747a.b = i - Integer.MIN_VALUE;
                } else {
                    c0747a = new C0747a(v1bVar);
                }
            } else {
                c0747a = new C0747a(v1bVar);
            }
            Object obj = c0747a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0747a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0747a.b = 1;
                if (this.a.collect(bVar, c0747a) == y5bVar) {
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

    public k200(lq1 lq1Var, b700 b700Var, xeh0 xeh0Var) {
        lq1Var.getClass();
        b700Var.getClass();
        xeh0Var.getClass();
        this.a = lq1Var;
        this.b = b700Var;
        this.c = xeh0Var;
        this.d = new a(bm50.f(a(pu0.b.a)));
    }

    @Override // defpackage.d100
    public final wl50 A() {
        return new wl50(a(pu0.b.a), new n100(0));
    }

    @Override // defpackage.d100
    public final e77 E(log0 log0Var) {
        log0Var.getClass();
        return r0i.e(new gzh(Boolean.FALSE), new g200(bm50.f(a(pu0.b.a)), log0Var));
    }

    @Override // defpackage.d100
    public final wl50 G() {
        return new wl50(a(pu0.b.a), new k100(0));
    }

    @Override // defpackage.d100
    public final wl50 H(log0 log0Var) {
        log0Var.getClass();
        return new wl50(a(pu0.b.a), new f100(log0Var, 0));
    }

    @Override // defpackage.d100
    public final e77 I() {
        return r0i.e(new gzh(30), new m200(bm50.f(a(pu0.b.a))));
    }

    @Override // defpackage.d100
    public final r100 J(log0 log0Var) {
        qg4 qg4Var;
        int iOrdinal = log0Var.ordinal();
        if (iOrdinal == 0) {
            qg4Var = qg4.DepositAllowDecimalParam;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return null;
            }
            qg4Var = qg4.WithdrawAllowDecimalParam;
        }
        return new r100(new zl50(a(pu0.b.a)), qg4Var);
    }

    @Override // defpackage.d100
    public final wl50 L() {
        return new wl50(a(pu0.b.a), new q100());
    }

    @Override // defpackage.d100
    public final e77 M() {
        return r0i.e(new gzh(1000), this.d);
    }

    @Override // defpackage.d100
    public final b200 O() {
        return T(log0.b);
    }

    @Override // defpackage.d100
    public final u100 Q() {
        return new u100(new t100(new s100(new v100(bm50.f(a(pu0.b.a))))));
    }

    @Override // defpackage.d100
    public final wl50 R() {
        return new wl50(a(pu0.b.a), new i100(0));
    }

    public final b200 T(log0 log0Var) {
        List<String> list;
        List<String> list2;
        uag uagVar;
        int iOrdinal = log0Var.ordinal();
        if (iOrdinal == 0) {
            rg4.c.getClass();
            list = rg4.e;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return null;
            }
            sg4.c.getClass();
            list = sg4.e;
        }
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.j(log0Var, (String) it.next()));
        }
        h200 h200Var = new h200((lyh[]) CollectionsKt.A0(arrayList).toArray(new lyh[0]), list);
        int iOrdinal2 = log0Var.ordinal();
        if (iOrdinal2 == 0) {
            rg4.c.getClass();
            list2 = rg4.e;
        } else {
            if (iOrdinal2 != 1) {
                uhc.a();
                return null;
            }
            sg4.c.getClass();
            list2 = sg4.e;
        }
        List<String> list3 = list2;
        int iOrdinal3 = log0Var.ordinal();
        if (iOrdinal3 == 0) {
            uagVar = rg4.i;
        } else {
            if (iOrdinal3 != 1) {
                uhc.a();
                return null;
            }
            uagVar = sg4.i;
        }
        i200 i200Var = new i200(bm50.f(a(pu0.b.a)), uagVar, this, log0Var, list3);
        Integer numA = this.c.a();
        return new b200(r0i.e(h200Var, i200Var), numA != null ? numA.intValue() : 100);
    }

    @Override // defpackage.jq1
    public final lyh<lk50<BOConfigValueBundle>> a(pu0 pu0Var) {
        pu0Var.getClass();
        return this.a.a(pu0Var);
    }

    @Override // defpackage.d100
    public final y100 b() {
        return new y100(r0i.e(this.b.b(), new x100(bm50.f(a(pu0.b.a)), this)));
    }

    @Override // defpackage.d100
    public final a200 c(log0 log0Var) {
        log0Var.getClass();
        return new a200(r0i.e(this.b.c(log0Var), new z100(bm50.f(a(pu0.b.a)), log0Var, this)));
    }

    @Override // defpackage.d100
    public final w100 d() {
        return new w100(new zl50(new wl50(a(pu0.b.a), new g100())));
    }

    @Override // defpackage.d100
    public final c200 e() {
        return new c200(bm50.f(a(pu0.b.a)));
    }

    @Override // defpackage.d100
    public final wl50 f() {
        return new wl50(a(pu0.b.a), new h100());
    }

    @Override // defpackage.d100
    public final wl50 h() {
        return bm50.e(new wl50(a(pu0.b.a), new e100()));
    }

    @Override // defpackage.d100
    public final f200 i() {
        return new f200(bm50.f(a(pu0.b.a)));
    }

    @Override // defpackage.d100
    public final wl50 j() {
        return new wl50(a(pu0.b.a), new m100());
    }

    @Override // defpackage.d100
    public final wl50 k() {
        return new wl50(a(pu0.b.a), new o100(0));
    }

    @Override // defpackage.d100
    public final e77 l() {
        r5e.b.getClass();
        return r0i.e(new gzh(b.k(r5e.OPAY, r5e.PALM_PAY, r5e.KUDA, r5e.GT, r5e.ZENITH, r5e.ACCESS, r5e.MONIEPOINT, r5e.FAIRMONEY, r5e.CORAL_PAY, r5e.QUICKTELLER)), new l200(bm50.f(a(pu0.b.a))));
    }

    @Override // defpackage.d100
    public final wl50 n() {
        return new wl50(a(pu0.b.a), new p100());
    }

    @Override // defpackage.d100
    public final j200 o() {
        return new j200(bm50.f(a(pu0.b.a)));
    }

    @Override // defpackage.d100
    public final d200 q() {
        return new d200(bm50.f(a(pu0.b.a)));
    }

    @Override // defpackage.d100
    public final wl50 r() {
        return bm50.e(new wl50(a(pu0.b.a), new etq(1)));
    }

    @Override // defpackage.d100
    public final wl50 t() {
        return bm50.e(new wl50(a(pu0.b.a), new l100()));
    }

    @Override // defpackage.d100
    public final wl50 v() {
        return new wl50(a(pu0.b.a), new j100());
    }

    @Override // defpackage.d100
    public final b200 w() {
        return T(log0.a);
    }

    @Override // defpackage.d100
    public final e200 z() {
        return new e200(bm50.f(a(pu0.b.a)));
    }
}
