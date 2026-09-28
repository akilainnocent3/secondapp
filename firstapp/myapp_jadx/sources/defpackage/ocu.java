package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeConfigResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Locu;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ocu extends j8i0 {
    public final b390 A;
    public final t340 B;
    public final wwd0 C;
    public final v340 D;
    public final ku90<u9w> E;
    public final t340 F;
    public boolean G;
    public String H;
    public String I;
    public String J;
    public int K;
    public final mpe0 L;
    public final v340 M;
    public final v340 N;
    public final gcu a;
    public final fe6 b;
    public final mgb0 c;
    public final m2l d;
    public final psm e;
    public final oyf f;
    public final rdd0 i;
    public final ga v;
    public final b390 w;
    public final t340 y;
    public final xdy z;

    @c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel$1", f = "MFAViewModel.kt", l = {156}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: ocu$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel$1$1", f = "MFAViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0929a extends tje0 implements gaj<EmailChangeConfigResponse, Boolean, v1b<? super Unit>, Object> {
            public /* synthetic */ EmailChangeConfigResponse a;
            public /* synthetic */ boolean b;
            public final /* synthetic */ ocu c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0929a(ocu ocuVar, v1b<? super C0929a> v1bVar) {
                super(3, v1bVar);
                this.c = ocuVar;
            }

            @Override // defpackage.gaj
            public final Object invoke(EmailChangeConfigResponse emailChangeConfigResponse, Boolean bool, v1b<? super Unit> v1bVar) {
                boolean zBooleanValue = bool.booleanValue();
                C0929a c0929a = new C0929a(this.c, v1bVar);
                c0929a.a = emailChangeConfigResponse;
                c0929a.b = zBooleanValue;
                return c0929a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object value;
                oaw oawVar;
                String email;
                EmailChangeConfigResponse emailChangeConfigResponse = this.a;
                boolean z = this.b;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                ocu ocuVar = this.c;
                wwd0 wwd0Var = ocuVar.C;
                do {
                    value = wwd0Var.getValue();
                    oawVar = (oaw) value;
                    AccountInfo accountInfoLastAccountInfo = ocuVar.c.lastAccountInfo();
                    if (accountInfoLastAccountInfo == null || (email = accountInfoLastAccountInfo.getEmail()) == null) {
                        email = "";
                    }
                } while (!wwd0Var.g(value, oaw.a(oawVar, email, false, z, emailChangeConfigResponse, null, 18)));
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ocu.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object obj2 = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ocu ocuVar = ocu.this;
                v340 v340Var = ocuVar.M;
                v340 v340Var2 = ocuVar.N;
                C0929a c0929a = new C0929a(ocuVar, null);
                this.a = 1;
                Object objA = r78.a(this, gyx.a, new o1i(c0929a, null), q1i.a, new lyh[]{v340Var, v340Var2});
                if (objA != obj2) {
                    objA = Unit.a;
                }
                if (objA != obj2) {
                    objA = Unit.a;
                }
                if (objA == obj2) {
                    return obj2;
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

    public ocu(gcu gcuVar, fe6 fe6Var, mgb0 mgb0Var, final oc4 oc4Var, m2l m2lVar, psm psmVar, oyf oyfVar, rdd0 rdd0Var, ga gaVar) {
        gcuVar.getClass();
        fe6Var.getClass();
        mgb0Var.getClass();
        oc4Var.getClass();
        m2lVar.getClass();
        psmVar.getClass();
        oyfVar.getClass();
        rdd0Var.getClass();
        this.a = gcuVar;
        this.b = fe6Var;
        this.c = mgb0Var;
        this.d = m2lVar;
        this.e = psmVar;
        this.f = oyfVar;
        this.i = rdd0Var;
        this.v = gaVar;
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.w = b390VarB;
        t340 t340VarA = e1i.a(b390VarB);
        this.y = t340VarA;
        ycy ycyVar = new ycy(new j760(t340VarA, e.a));
        qm70 qm70Var = wm70.c;
        qm70Var.getClass();
        this.z = ycyVar.h(qm70Var).f(va0.a());
        b390 b390VarB2 = d390.b(0, 0, null, 7);
        this.A = b390VarB2;
        this.B = e1i.a(b390VarB2);
        wwd0 wwd0VarA = xwd0.a(new oaw(0));
        this.C = wwd0VarA;
        this.D = e1i.b(wwd0VarA);
        ku90<u9w> ku90Var = new ku90<>();
        this.E = ku90Var;
        this.F = e1i.a(ku90Var);
        this.H = "";
        this.I = "";
        this.J = "";
        this.L = hwr.b(new Function0() { // from class: ncu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return oc4Var.c();
            }
        });
        this.M = e1i.e(bm50.f(bm50.a(oyfVar.f())), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), new EmailChangeConfigResponse(0, false, false, false, false, 31, null));
        this.N = e1i.e(bm50.f(bm50.a(oyfVar.h())), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), Boolean.FALSE);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public static void z1(ocu ocuVar, String str, String str2, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) == 0;
        if ((i & 8) != 0) {
            str2 = "";
        }
        ocuVar.getClass();
        str.getClass();
        ocuVar.I = str;
        ocuVar.G = z;
        ocuVar.H = str2;
        ocuVar.a.c(ocuVar.b, str, z, new mcu(ocuVar, z2));
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        this.a.a();
        super.onCleared();
    }

    public final void x1(b9w b9wVar) {
        Object value;
        b9wVar.getClass();
        if (b9wVar.equals(b9w.a.a)) {
            ej5.c(o8i0.d(this), null, null, new pcu(this, null), 3);
            return;
        }
        boolean zEquals = b9wVar.equals(c9w.a);
        wwd0 wwd0Var = this.C;
        if (zEquals) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, oaw.a((oaw) value, null, false, false, null, null, 15)));
            return;
        }
        boolean zEquals2 = b9wVar.equals(b9w.b.a);
        ku90<u9w> ku90Var = this.E;
        if (zEquals2) {
            if (!((oaw) wwd0Var.getValue()).c) {
                ku90Var.a(s9w.a);
                return;
            } else {
                if (((oaw) wwd0Var.getValue()).d.getMainSwitchEnabled()) {
                    ej5.c(o8i0.d(this), null, null, new vcu(this, null), 3);
                    return;
                }
                return;
            }
        }
        if (!b9wVar.equals(b9w.c.a)) {
            if (b9wVar.equals(d9w.a)) {
                ej5.c(o8i0.d(this), null, null, new wcu(this, null), 3);
                return;
            } else {
                uhc.a();
                return;
            }
        }
        ku90Var.a(t9w.a);
        ej5.c(o8i0.d(this), null, null, new bdu(this, null), 3);
        this.i.a(new smw(0), k00.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y1(fcu fcuVar, x1b x1bVar) {
        ycu ycuVar;
        if (x1bVar instanceof ycu) {
            ycuVar = (ycu) x1bVar;
            int i = ycuVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ycuVar.d = i - Integer.MIN_VALUE;
            } else {
                ycuVar = new ycu(this, x1bVar);
            }
        } else {
            ycuVar = new ycu(this, x1bVar);
        }
        Object obj = ycuVar.b;
        y5b y5bVar = y5b.a;
        int i2 = ycuVar.d;
        b390 b390Var = this.w;
        if (i2 == 0) {
            uj50.b(obj);
            f0i f0iVar = new f0i(b390Var.b(), new zcu(2, null));
            ycuVar.a = fcuVar;
            ycuVar.d = 1;
            if (s0i.a(f0iVar, ycuVar) != y5bVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fcuVar = ycuVar.a;
        uj50.b(obj);
        ycuVar.a = null;
        ycuVar.d = 2;
        Object objEmit = b390Var.emit(fcuVar, ycuVar);
        return objEmit == y5bVar ? y5bVar : objEmit;
    }
}
