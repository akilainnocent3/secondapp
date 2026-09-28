package defpackage;

import com.sporty.android.core.model.pocket.common.ClabeType;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzwa0;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zwa0 extends j8i0 {
    public final i4k A;
    public final vwb B;
    public final dhj0.a C;
    public final mpe0 D;
    public final wwd0 E;
    public final v340 F;
    public final v340 G;
    public final wwd0 H;
    public final v340 I;
    public final v340 J;
    public final wwd0 K;
    public final v340 L;
    public final ku90<xwa0> M;
    public final ku90 N;
    public final wwd0 O;
    public final v340 P;
    public final wwd0 Q;
    public final v340 R;
    public boolean S;
    public String T;
    public boolean U;
    public boolean V;
    public final c100 W;
    public final w9e a;
    public final xsm b;
    public final psm c;
    public final ha00 d;
    public final mgb0 e;
    public final uy0 f;
    public final rxo i;
    public final m800 v;
    public final q8d0 w;
    public final bmj0 y;
    public final od9 z;

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.SpeiByStpWithdrawViewModel$emitSideEffect$1", f = "SpeiByStpWithdrawViewModel.kt", l = {302}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ xwa0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xwa0 xwa0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = xwa0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zwa0.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ku90<xwa0> ku90Var = zwa0.this.M;
                this.a = 1;
                if (ku90Var.a.emit(this.c, this) == y5bVar) {
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

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.SpeiByStpWithdrawViewModel$requestWithdrawal$2", f = "SpeiByStpWithdrawViewModel.kt", l = {359, 364, 371}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public String a;
        public ArrayList b;
        public Object c;
        public int d;
        public int e;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zwa0.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0092  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f2, code lost:
        
            if (r5.z1(r7, r9) == r0) goto L44;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zwa0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public zwa0(vu60 vu60Var, w9e w9eVar, psm psmVar, ha00 ha00Var, mgb0 mgb0Var, uy0 uy0Var, rxo rxoVar, m800 m800Var, bmj0 bmj0Var, od9 od9Var, i4k i4kVar, vwb vwbVar, dhj0.a aVar) {
        c100 c100VarA;
        Object value;
        v4c v4cVar = v4c.a;
        vu60Var.getClass();
        w9eVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        uy0Var.getClass();
        bmj0Var.getClass();
        this.a = w9eVar;
        this.b = v4cVar;
        this.c = psmVar;
        this.d = ha00Var;
        this.e = mgb0Var;
        this.f = uy0Var;
        this.i = rxoVar;
        this.v = m800Var;
        this.w = q8d0.a;
        this.y = bmj0Var;
        this.z = od9Var;
        this.A = i4kVar;
        this.B = vwbVar;
        this.C = aVar;
        mpe0 mpe0VarB = hwr.b(new bht(this, 2));
        this.D = mpe0VarB;
        wwd0 wwd0VarA = xwd0.a(new wwa0(0));
        this.E = wwd0VarA;
        this.F = e1i.b(wwd0VarA);
        this.G = w9eVar.l;
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.H = wwd0VarA2;
        this.I = e1i.b(wwd0VarA2);
        wwd0 wwd0VarA3 = xwd0.a("");
        this.J = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a(null);
        this.K = wwd0VarA4;
        this.L = e1i.b(wwd0VarA4);
        ku90<xwa0> ku90Var = new ku90<>();
        this.M = ku90Var;
        this.N = ku90Var;
        wwd0 wwd0VarA5 = xwd0.a(new ykj0(false, false));
        this.O = wwd0VarA5;
        this.P = e1i.b(wwd0VarA5);
        wwd0 wwd0VarA6 = xwd0.a(new yf40(0));
        this.Q = wwd0VarA6;
        this.R = e1i.b(wwd0VarA6);
        this.T = "";
        this.W = c100.e;
        w9eVar.a = o8i0.d(this);
        kzh.d(new g1i((lyh) ((dhj0) mpe0VarB.getValue()).d.getValue(), new fxa0(this, null)), o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new exa0(this, null), 3);
        Integer num = (Integer) vu60Var.b("SPEI_BY_STP_CHANNEL_ID");
        if (num == null || (c100VarA = sg8.a(num.intValue())) == null) {
            y1(xwa0.e.a);
        } else {
            this.W = c100VarA;
            ej5.c(o8i0.d(this), null, null, new dxa0(this, null), 3);
            ej5.c(o8i0.d(this), null, null, new axa0(this, String.valueOf(this.W.a), null), 3);
            ej5.c(o8i0.d(this), null, null, new bxa0(this, null), 3);
            ha00Var.b(o8i0.d(this), new ywa0(this));
            do {
                value = wwd0VarA3.getValue();
            } while (!wwd0VarA3.g(value, this.c.f()));
        }
        ej5.c(o8i0.d(this), null, null, new cxa0(this, null), 3);
    }

    public final void A1() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.O;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ykj0.a((ykj0) value, false, true, 1)));
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }

    public final void B1() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.O;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ykj0.a((ykj0) value, this.S && this.U, false, 2)));
    }

    public final void C1(ArrayList arrayList) {
        wwd0 wwd0Var;
        Object value;
        yf40 yf40Var;
        ArrayList arrayList2;
        do {
            wwd0Var = this.Q;
            value = wwd0Var.getValue();
            yf40Var = (yf40) value;
            String str = ((wwa0) this.E.getValue()).c.a.b;
            arrayList2 = new ArrayList(l48.r(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str2 = (String) obj;
                arrayList2.add(new zf40(Intrinsics.g(str2, str), str2, od9.b(this.z, str2)));
            }
        } while (!wwd0Var.g(value, yf40.a(yf40Var, false, arrayList2, 1)));
    }

    public final void D1(String str) {
        wwd0 wwd0Var;
        Object value;
        yf40 yf40Var;
        ArrayList arrayList;
        this.i.getClass();
        this.U = rxo.c(str);
        B1();
        do {
            wwd0Var = this.Q;
            value = wwd0Var.getValue();
            yf40Var = (yf40) value;
            List<zf40> list = yf40Var.b;
            arrayList = new ArrayList(l48.r(list, 10));
            for (zf40 zf40Var : list) {
                arrayList.add(new zf40(zf40Var.b.equals(str), zf40Var.b, zf40Var.c));
            }
        } while (!wwd0Var.g(value, yf40.a(yf40Var, false, arrayList, 1)));
    }

    public final xwa0.n x1(String str) {
        String strB = this.b.b(this.T, false);
        String strB2 = od9.b(this.z, ((wwa0) this.E.getValue()).c.a.b);
        if (str == null) {
            str = "";
        }
        return new xwa0.n(strB, strB2, str);
    }

    public final void y1(xwa0 xwa0Var) {
        ej5.c(o8i0.d(this), null, null, new a(xwa0Var, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z1(String str, x1b x1bVar) {
        hxa0 hxa0Var;
        Object objA;
        wwd0 wwd0Var;
        Object value;
        xwa0 xwa0VarX1;
        xwa0 iVar;
        if (x1bVar instanceof hxa0) {
            hxa0Var = (hxa0) x1bVar;
            int i = hxa0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hxa0Var.c = i - Integer.MIN_VALUE;
            } else {
                hxa0Var = new hxa0(this, x1bVar);
            }
        } else {
            hxa0Var = new hxa0(this, x1bVar);
        }
        Object obj = hxa0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = hxa0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            msj0.d dVar = new msj0.d(this.T, this.W, ClabeType.PERSONAL, str);
            hxa0Var.c = 1;
            objA = this.y.a(dVar, hxa0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a(UccrWswQGaIj.TsJ);
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        do {
            wwd0Var = this.O;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ykj0.a((ykj0) value, false, false, 1)));
        zi50.a aVar = zi50.b;
        if (!(objA instanceof zi50.b)) {
            xoj0 xoj0Var = (xoj0) objA;
            boolean z = xoj0Var instanceof xoj0.d.j;
            if (z || (xoj0Var instanceof xoj0.d.h)) {
                this.f.g();
                this.d.b(o8i0.d(this), new ywa0(this));
            }
            if (xoj0Var instanceof xoj0.d.h) {
                xwa0VarX1 = x1(((xoj0.d.h) xoj0Var).b);
            } else if (xoj0Var instanceof xoj0.b.g) {
                xwa0VarX1 = x1(((xoj0.b.g) xoj0Var).b);
            } else {
                if (z) {
                    String str2 = ((xoj0.d.j) xoj0Var).c;
                    String strB = this.b.b(this.T, false);
                    if (str2 == null) {
                        str2 = "";
                    }
                    iVar = new xwa0.p(strB, str2);
                } else if (xoj0Var instanceof xoj0.d.f) {
                    xwa0VarX1 = xwa0.f.a;
                } else if (xoj0Var instanceof xoj0.d.a0) {
                    xwa0VarX1 = xwa0.c.a;
                } else if (xoj0Var instanceof xoj0.d.w) {
                    xwa0VarX1 = xwa0.b.a;
                } else if (xoj0Var instanceof xoj0.d.y) {
                    xwa0VarX1 = xwa0.k.a;
                } else if (xoj0Var instanceof xoj0.d.z) {
                    xwa0VarX1 = xwa0.l.a;
                } else if (xoj0Var instanceof xoj0.d.x) {
                    iVar = new xwa0.d(((xoj0.d.x) xoj0Var).a);
                } else if (xoj0Var instanceof xoj0.d.v) {
                    iVar = new xwa0.j(((xoj0.d.v) xoj0Var).a);
                } else if (xoj0Var instanceof xoj0.d.t) {
                    iVar = new xwa0.i(((xoj0.d.t) xoj0Var).a);
                } else {
                    xwa0VarX1 = xwa0.h.a;
                }
                xwa0VarX1 = iVar;
            }
            y1(xwa0VarX1);
        }
        if (zi50.a(objA) != null) {
            y1(xwa0.h.a);
        }
        return Unit.a;
    }
}
