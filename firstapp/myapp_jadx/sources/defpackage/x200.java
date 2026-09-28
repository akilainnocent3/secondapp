package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.globalpay.data.FullSummaryData;
import com.sportybet.android.globalpay.data.KycLimitData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x200 {
    public final qxd0<gtp> a;
    public final et7 b;
    public final jak c;
    public final psm d;
    public final va00 e;
    public final h400 f;
    public final c100 g;
    public final uqm h;
    public final gip i;
    public int j;
    public Integer k;
    public KycLimitData l;
    public FullSummaryData m;
    public final mpe0 n;
    public final mpe0 o;
    public final mpe0 p;

    @c0d(c = "com.sportybet.android.globalpay.base.delegates.limits.PayLimitsBaseDelegate$updateKycTierView$1", f = "PayLimitsBaseDelegate.kt", l = {109}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return x200.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objPutBoolean;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                x200 x200Var = x200.this;
                gip gipVar = x200Var.i;
                int i2 = x200Var.j;
                this.a = 1;
                if (gipVar.b.F() && i2 == 3) {
                    objPutBoolean = gipVar.a.putBoolean("show_tier_level_3", Boolean.TRUE, this);
                } else {
                    objPutBoolean = Unit.a;
                }
                if (objPutBoolean == y5bVar) {
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

    public x200(qxd0 qxd0Var, et7 et7Var, jak jakVar, psm psmVar, va00 va00Var, h400 h400Var, c100 c100Var, uqm uqmVar, gip gipVar) {
        v4c v4cVar = v4c.a;
        psmVar.getClass();
        uqmVar.getClass();
        this.a = qxd0Var;
        this.b = et7Var;
        this.c = jakVar;
        this.d = psmVar;
        this.e = va00Var;
        this.f = h400Var;
        this.g = c100Var;
        this.h = uqmVar;
        this.i = gipVar;
        this.n = hwr.b(new s200(this, 0));
        this.o = hwr.b(new Function0() { // from class: t200
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return String.valueOf(this.a.g.a);
            }
        });
        this.p = hwr.b(new Function0() { // from class: u200
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return String.valueOf(this.a.f.a);
            }
        });
    }

    public final boolean a() {
        Integer numD = d();
        if (numD == null) {
            return true;
        }
        int iIntValue = numD.intValue();
        KycLimitData kycLimitData = this.l;
        if ((kycLimitData != null ? Integer.valueOf(kycLimitData.getCurrentLevel()) : null) == null) {
            return false;
        }
        KycLimitData kycLimitData2 = this.l;
        kycLimitData2.getClass();
        return kycLimitData2.getCurrentLevel() >= iIntValue;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(boolean z, x1b x1bVar) {
        v200 v200Var;
        if (x1bVar instanceof v200) {
            v200Var = (v200) x1bVar;
            int i = v200Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v200Var.c = i - Integer.MIN_VALUE;
            } else {
                v200Var = new v200(this, x1bVar);
            }
        } else {
            v200Var = new v200(this, x1bVar);
        }
        Object objD = v200Var.a;
        y5b y5bVar = y5b.a;
        int i2 = v200Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            ga00 ga00VarF = f();
            jak.a aVar = z ? new jak.a(this.f, this.g) : null;
            v200Var.c = 1;
            objD = w5b.d(new kak(null, aVar, this.c, ga00VarF), v200Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        jak.b bVar = (jak.b) objD;
        Object obj = bVar.a;
        Object obj2 = bVar.b;
        Throwable thA = zi50.a(obj);
        if (thA != null) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_INT);
            aVar2.e(thA);
            Unit unit = Unit.a;
        }
        if (obj instanceof zi50.b) {
            obj = null;
        }
        this.m = (FullSummaryData) obj;
        Throwable thA2 = zi50.a(obj2);
        if (thA2 != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_INT);
            aVar3.e(thA2);
            Unit unit2 = Unit.a;
        }
        boolean z2 = obj2 instanceof zi50.b;
        this.l = (KycLimitData) (z2 ? null : obj2);
        return Boolean.valueOf(((bVar.a instanceof zi50.b) || z2) ? false : true);
    }

    public final f0l c() {
        return (f0l) this.n.getValue();
    }

    public Integer d() {
        return this.k;
    }

    public abstract gtp.a e(int i);

    public abstract ga00 f();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(boolean z, x1b x1bVar) {
        w200 w200Var;
        if (x1bVar instanceof w200) {
            w200Var = (w200) x1bVar;
            int i = w200Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w200Var.c = i - Integer.MIN_VALUE;
            } else {
                w200Var = new w200(this, x1bVar);
            }
        } else {
            w200Var = new w200(this, x1bVar);
        }
        Object objB = w200Var.a;
        Object obj = y5b.a;
        int i2 = w200Var.c;
        if (i2 == 0) {
            uj50.b(objB);
            w200Var.c = 1;
            objB = b(z, w200Var);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objB);
        }
        Boolean bool = (Boolean) objB;
        if (bool.booleanValue()) {
            i();
            c().a(f(), this.m, this.l, (String) this.o.getValue(), (String) this.p.getValue(), this.h.getUserCertStatus());
        }
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    public final void h(String str) {
        Integer numD;
        int iIntValue;
        str.getClass();
        if (this.d.O()) {
            return;
        }
        j(str);
        ej5.c(this.b, null, null, new a(null), 3);
        qxd0<gtp> qxd0Var = this.a;
        if (qxd0Var != null) {
            Function0<gtp> function0 = qxd0Var.a;
            KycLimitData kycLimitData = this.l;
            if (kycLimitData != null) {
                int i = this.j;
                if ((kycLimitData != null ? Integer.valueOf(kycLimitData.getCurrentLevel()) : null) != null) {
                    KycLimitData kycLimitData2 = this.l;
                    kycLimitData2.getClass();
                    if (kycLimitData2.getCurrentLevel() < i || !a()) {
                        if (!StringsKt.U(str) && !(k(str) instanceof g0l.b)) {
                            numD = d();
                            if (numD == null) {
                                iIntValue = this.j;
                            } else {
                                if (a()) {
                                    numD = null;
                                }
                                if (numD != null) {
                                    iIntValue = numD.intValue();
                                } else {
                                    iIntValue = this.j;
                                }
                            }
                            gtp gtpVarInvoke = function0.invoke();
                            gtpVarInvoke.getClass();
                            qxd0Var.a(gtp.a(gtpVarInvoke, false, null, false, 3));
                            gtp.a aVarE = e(iIntValue);
                            gtp gtpVarInvoke2 = function0.invoke();
                            gtpVarInvoke2.getClass();
                            qxd0Var.a(gtp.a(gtpVarInvoke2, true, aVarE, false, 4));
                            return;
                        }
                    }
                } else if (!StringsKt.U(str)) {
                    numD = d();
                    if (numD == null) {
                        iIntValue = this.j;
                    } else {
                        if (a()) {
                            numD = null;
                        }
                        if (numD != null) {
                            iIntValue = numD.intValue();
                        } else {
                            iIntValue = this.j;
                        }
                    }
                    gtp gtpVarInvoke3 = function0.invoke();
                    gtpVarInvoke3.getClass();
                    qxd0Var.a(gtp.a(gtpVarInvoke3, false, null, false, 3));
                    gtp.a aVarE2 = e(iIntValue);
                    gtp gtpVarInvoke4 = function0.invoke();
                    gtpVarInvoke4.getClass();
                    qxd0Var.a(gtp.a(gtpVarInvoke4, true, aVarE2, false, 4));
                    return;
                }
            }
        }
        if (qxd0Var != null) {
            gtp gtpVarInvoke5 = qxd0Var.a.invoke();
            gtpVarInvoke5.getClass();
            qxd0Var.a(gtp.a(gtpVarInvoke5, false, null, false, 6));
        }
    }

    public abstract void i();

    public final void j(String str) {
        str.getClass();
        this.j = !StringsKt.U(str) ? o1l.a(this.l, this.m, String.valueOf(this.f.a), String.valueOf(this.g.a), v4c.a.c(str) * 10000.0d, f()) : 0;
    }

    public abstract g0l k(String str);
}
