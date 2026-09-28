package defpackage;

import android.os.Parcelable;
import android.os.SystemClock;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class q1f implements h1f {
    public final g0f a;
    public final c2f b;
    public final afj0 c;
    public final j3f d;
    public final psm e;
    public final wwd0 f;
    public final wwd0 g;
    public final wwd0 h;
    public final wwd0 i;
    public final wwd0 j;
    public final wwd0 k;
    public final wwd0 l;
    public int m;
    public jvd0 n;
    public final ku90<x5f> o;
    public final wwd0 p;
    public et7 q;

    @c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.DoubleOrNothingFlowHandlerImpl$requestInfo$1", f = "DoubleOrNothingFlowHandlerImpl.kt", l = {194}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return q1f.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Object value2;
            Object value3;
            w1f w1fVar;
            q1f q1fVar = q1f.this;
            wwd0 wwd0Var = q1fVar.g;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, k4f.b.a));
                j3f j3fVar = q1fVar.d;
                this.a = 1;
                obj = j3fVar.c(this.c, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            x1f x1fVar = (x1f) obj;
            if (x1fVar instanceof x1f.f) {
                do {
                    value3 = wwd0Var.getValue();
                    w1fVar = ((x1f.f) x1fVar).a;
                } while (!wwd0Var.g(value3, new k4f.c(new j4f(w1fVar.a, w1fVar.b, w1fVar.c, w1fVar.d, w1fVar.e, w1fVar.f, w1fVar.g, w1fVar.h, w1fVar.i))));
            } else {
                if (!(x1fVar instanceof x1f.b)) {
                    uhc.a();
                    return null;
                }
                q1fVar.m++;
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, new k4f.a(q1fVar.m)));
            }
            return Unit.a;
        }
    }

    public q1f(g0f g0fVar, c2f c2fVar, afj0 afj0Var, j3f j3fVar, psm psmVar) {
        psmVar.getClass();
        this.a = g0fVar;
        this.b = c2fVar;
        this.c = afj0Var;
        this.d = j3fVar;
        this.e = psmVar;
        this.f = xwd0.a(null);
        this.g = xwd0.a(k4f.b.a);
        this.h = xwd0.a(null);
        this.i = xwd0.a(m4f.b.a);
        this.j = xwd0.a(null);
        this.k = xwd0.a(vch0.a);
        this.l = xwd0.a(Boolean.FALSE);
        this.o = new ku90<>();
        this.p = xwd0.a(null);
    }

    @Override // defpackage.h1f
    public final void a(et7 et7Var) {
        this.q = et7Var;
        afj0 afj0Var = this.c;
        v7k v7kVar = afj0Var.a;
        wwd0 wwd0Var = (wwd0) v7kVar.b;
        efj0 efj0Var = new efj0(v7kVar, null);
        wwd0 wwd0Var2 = this.f;
        kzh.d(new g1i(new n1i(wwd0Var2, wwd0Var, efj0Var), new ffj0(v7kVar, null)), et7Var);
        wwd0 wwd0Var3 = this.g;
        pej0 pej0Var = new pej0(new nej0(wwd0Var3));
        idj0 idj0Var = afj0Var.b;
        kzh.d(new g1i(uzh.b(pej0Var), new fdj0(idj0Var, null)), et7Var);
        kzh.d(new g1i(r1i.a(pej0Var, idj0Var.c, idj0Var.d, new gdj0(idj0Var, null)), new hdj0(idj0Var, null)), et7Var);
        vcj0 vcj0Var = afj0Var.c;
        wwd0 wwd0Var4 = afj0Var.j;
        vcj0Var.b = et7Var;
        kzh.d(new g1i(uzh.b(new n1i(wwd0Var4, pej0Var, scj0.v)), new tcj0(vcj0Var, null)), et7Var);
        ccj0 ccj0Var = afj0Var.d;
        wwd0 wwd0Var5 = idj0Var.b;
        ccj0Var.f = wwd0Var2;
        ccj0Var.h = wwd0Var5;
        kzh.d(new g1i(uzh.b(pej0Var), new ybj0(ccj0Var, null)), et7Var);
        kzh.d(new g1i(new n1i(ccj0Var.d, ccj0Var.e, zbj0.v), new acj0(ccj0Var, null)), et7Var);
        kzh.d(new g1i(new n1i(new f1i(wwd0Var2), afj0Var.h, new tej0(3, null)), new uej0(null, afj0Var)), et7Var);
        wwd0 wwd0Var6 = afj0Var.m;
        kzh.d(new g1i(uzh.b(new f1i(wwd0Var6)), new vej0(null, afj0Var)), et7Var);
        f1i f1iVar = new f1i(wwd0Var6);
        wwd0 wwd0Var7 = (wwd0) v7kVar.a;
        wwd0 wwd0Var8 = afj0Var.i;
        kzh.d(new g1i(r1i.b(f1iVar, wwd0Var7, wwd0Var8, this.l, new wej0(null, afj0Var)), new xej0(null, afj0Var)), et7Var);
        wwd0 wwd0Var9 = afj0Var.k;
        wwd0 wwd0Var10 = vcj0Var.a;
        wwd0 wwd0Var11 = ccj0Var.c;
        wwd0 wwd0Var12 = afj0Var.l;
        kzh.d(new g1i(new mej0(new lyh[]{wwd0Var3, wwd0Var9, wwd0Var10, wwd0Var11, wwd0Var5, wwd0Var7, wwd0Var12, new f1i(wwd0Var2)}, afj0Var), new yej0(null, afj0Var)), et7Var);
        kzh.d(new g1i(new oej0(wwd0Var3), new zej0(null, afj0Var)), et7Var);
        kzh.d(new g1i(new n1i(uzh.b(new qej0(wwd0Var3)), wwd0Var12, new rej0(3, null)), new sej0(null, afj0Var)), et7Var);
        wwd0 wwd0Var13 = afj0Var.n;
        kzh.d(new g1i(new i0i(new f1i(new n1i(wwd0Var2, new fej0(wwd0Var13), new jej0(3, null)))), new kej0(null, afj0Var)), et7Var);
        kzh.d(new g1i(new gej0(uzh.b(new iej0(new hej0(wwd0Var8)))), new lej0(afj0Var, wwd0Var2, null)), et7Var);
        g0f g0fVar = this.a;
        wwd0 wwd0Var14 = g0fVar.b;
        e0f e0fVar = new e0f(4, g0fVar, g0f.class, "createUiState", "createUiState(Lcom/sportybet/android/instantwin/model/doubleornothing/DoubleOrNothingCreateAndSettleResult;Lcom/sportybet/android/instantwin/presentation/doubleornothing/model/DoubleOrNothingStage;Lcom/sportybet/android/instantwin/presentation/doubleornothing/model/DoubleOrNothingKickPointsState;)Lcom/sportybet/android/instantwin/presentation/doubleornothing/model/DoubleOrNothingAnimationState;", 4);
        wwd0 wwd0Var15 = this.h;
        wwd0 wwd0Var16 = this.i;
        kzh.d(new g1i(r1i.a(wwd0Var15, wwd0Var16, wwd0Var14, e0fVar), new f0f(g0fVar, null)), et7Var);
        c2f c2fVar = this.b;
        c2fVar.f = et7Var;
        kzh.d(new g1i(r1i.a(wwd0Var16, c2fVar.d, c2fVar.e, new y1f(4, null)), new z1f(c2fVar, null)), et7Var);
        kzh.d(new g1i(wwd0Var16, new a2f(c2fVar, null)), et7Var);
        kzh.d(new g1i(new l1f(new lyh[]{wwd0Var16, c2fVar.b, g0fVar.a, wwd0Var13, this.j, this.k}), new n1f(this, null)), et7Var);
        kzh.d(new g1i(c2fVar.c, new o1f(this, null)), et7Var);
        kzh.d(new g1i(new m1f(wwd0Var16), new p1f(this, null)), et7Var);
    }

    @Override // defpackage.h1f
    public final ku90 b() {
        return this.o;
    }

    @Override // defpackage.h1f
    public final wwd0 c() {
        return this.p;
    }

    @Override // defpackage.h1f
    public final void d(v1f v1fVar) {
        wwd0 wwd0Var;
        Object value;
        Object value2;
        if (this.q == null) {
            return;
        }
        wwd0 wwd0Var2 = this.i;
        if (Intrinsics.g(wwd0Var2.getValue(), m4f.b.a)) {
            do {
                wwd0Var = this.f;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, v1fVar));
            do {
                value2 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value2, m4f.e.a));
            if (v1fVar.f != null) {
                j();
            }
        }
    }

    @Override // defpackage.h1f
    public final void e(w5f w5fVar) {
        wwd0 wwd0Var;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        lcj0 lcj0Var;
        Object value6;
        Object value7;
        Object value8;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        wwd0 wwd0Var2;
        Object value9;
        if (w5fVar instanceof w5f.d) {
            k(((w5f.d) w5fVar).a);
            return;
        }
        boolean z = w5fVar instanceof w5f.f;
        ku90<x5f> ku90Var = this.o;
        if (z) {
            String str = ((w5f.f) w5fVar).a;
            String str2 = StringsKt.U(str) ? null : str;
            if (str2 != null) {
                ku90Var.a(new x5f.b(str2));
                return;
            }
            return;
        }
        if (w5fVar.equals(w5f.e.a)) {
            x0f x0fVar = (x0f) this.h.getValue();
            if (x0fVar == null) {
                return;
            }
            y0f y0fVar = x0fVar.e;
            if (y0fVar != null && (bigDecimal2 = y0fVar.a) != null && bigDecimal2.compareTo(BigDecimal.ZERO) > 0 && x0fVar.f != null) {
                do {
                    wwd0Var2 = this.i;
                    value9 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value9, m4f.e.a));
                return;
            }
            if (y0fVar == null || (bigDecimal = y0fVar.a) == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            int i = x0fVar.b;
            bigDecimal.getClass();
            l(h(i, z2f.a(x0fVar.c, x0fVar.d), bigDecimal, bigDecimal.compareTo(BigDecimal.ZERO) > 0));
            return;
        }
        if (!(w5fVar instanceof w5f.g)) {
            if (w5fVar.equals(w5f.a.a)) {
                do {
                    wwd0Var = this.k;
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, vch0.a));
                return;
            }
            if (w5fVar.equals(w5f.c.a)) {
                i();
                return;
            } else if (w5fVar.equals(w5f.b.a)) {
                ku90Var.a(new x5f.a(null));
                return;
            } else {
                uhc.a();
                return;
            }
        }
        rfj0 rfj0Var = ((w5f.g) w5fVar).a;
        afj0 afj0Var = this.c;
        idj0 idj0Var = afj0Var.b;
        if (rfj0Var.equals(rfj0.e.a)) {
            wwd0 wwd0Var3 = (wwd0) afj0Var.a.b;
            do {
                value8 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value8, Boolean.valueOf(!((Boolean) value8).booleanValue())));
            return;
        }
        if (rfj0Var.equals(rfj0.f.a)) {
            i();
            return;
        }
        if (rfj0Var.equals(rfj0.a.a)) {
            ku90Var.a(new x5f.a(null));
            return;
        }
        if (rfj0Var.equals(rfj0.b.a)) {
            et7 et7Var = this.q;
            if (et7Var != null) {
                ej5.c(et7Var, null, null, new j1f(this, null), 3);
                return;
            }
            return;
        }
        if (rfj0Var.equals(rfj0.d.a)) {
            et7 et7Var2 = this.q;
            if (et7Var2 != null) {
                ej5.c(et7Var2, null, null, new k1f(this, null), 3);
                return;
            }
            return;
        }
        if (rfj0Var.equals(rfj0.c.a)) {
            wwd0 wwd0Var4 = idj0Var.c;
            do {
                value7 = wwd0Var4.getValue();
                ((Boolean) value7).getClass();
            } while (!wwd0Var4.g(value7, Boolean.TRUE));
            return;
        }
        if (rfj0Var.equals(sfj0.a)) {
            wwd0 wwd0Var5 = afj0Var.k;
            int iOrdinal = ((lcj0) wwd0Var5.getValue()).ordinal();
            if (iOrdinal == 0) {
                lcj0Var = lcj0.b;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return;
                }
                lcj0Var = lcj0.a;
            }
            lcj0 lcj0Var2 = lcj0Var;
            do {
                value6 = wwd0Var5.getValue();
            } while (!wwd0Var5.g(value6, lcj0Var2));
            return;
        }
        if (rfj0Var.equals(tfj0.a)) {
            j();
            return;
        }
        if (rfj0Var.equals(ufj0.a)) {
            wwd0 wwd0Var6 = idj0Var.d;
            do {
                value5 = wwd0Var6.getValue();
            } while (!wwd0Var6.g(value5, ""));
            return;
        }
        if (rfj0Var.equals(vfj0.a)) {
            wwd0 wwd0Var7 = idj0Var.d;
            do {
                value4 = wwd0Var7.getValue();
            } while (!wwd0Var7.g(value4, wae0.E((String) value4)));
        } else {
            if (rfj0Var instanceof wfj0) {
                wwd0 wwd0Var8 = idj0Var.c;
                do {
                    value3 = wwd0Var8.getValue();
                    ((Boolean) value3).getClass();
                } while (!wwd0Var8.g(value3, Boolean.FALSE));
                return;
            }
            if (!(rfj0Var instanceof xfj0)) {
                uhc.a();
                return;
            }
            String str3 = ((xfj0) rfj0Var).a;
            str3.getClass();
            wwd0 wwd0Var9 = idj0Var.d;
            do {
                value2 = wwd0Var9.getValue();
            } while (!wwd0Var9.g(value2, kn5.a((String) value2, str3)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(x1b x1bVar) throws Throwable {
        i1f i1fVar;
        ResourceUiText resourceUiText;
        String str;
        if (x1bVar instanceof i1f) {
            i1fVar = (i1f) x1bVar;
            int i = i1fVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i1fVar.c = i - Integer.MIN_VALUE;
            } else {
                i1fVar = new i1f(this, x1bVar);
            }
        } else {
            i1fVar = new i1f(this, x1bVar);
        }
        Object objA = i1fVar.a;
        y5b y5bVar = y5b.a;
        int i2 = i1fVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            i1fVar.c = 1;
            objA = this.c.d.a(i1fVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        s0f s0fVar = (s0f) objA;
        if (s0fVar == null) {
            return Unit.a;
        }
        if (this.h.getValue() == null) {
            v1f v1fVar = (v1f) this.f.getValue();
            if (v1fVar == null || (str = v1fVar.b) == null) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.cashout__cashout_successful);
            } else {
                String str2 = StringsKt.U(str) ? null : str;
                if (str2 != null) {
                    Object[] objArr = {"#".concat(str2)};
                    StringUiText stringUiText2 = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.page_instant_virtual__don_ticket_vnum_cashout_successfully, ay0.S(objArr));
                } else {
                    StringUiText stringUiText3 = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.cashout__cashout_successful);
                }
            }
            this.o.a(new x5f.a(resourceUiText));
        } else {
            l(h(s0fVar.a, z2f.a(s0fVar.c, s0fVar.d), s0fVar.b, true));
        }
        return Unit.a;
    }

    public final String g(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        bigDecimal.getClass();
        return this.e.N(bigDecimal);
    }

    public final g1f h(int i, qcn qcnVar, BigDecimal bigDecimal, boolean z) {
        ResourceUiText resourceUiText;
        if (z) {
            Object[] objArr = {Integer.valueOf(i)};
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_instant_virtual__don_round_vnum_won_you_did_it, ay0.S(objArr));
        } else {
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.page_instant_virtual__don_try_again_next_time);
        }
        return new g1f(z, resourceUiText, z ? R.drawable.ic__feature__match_status_won : R.drawable.ic__feature__match_status_lost, z ? new ResourceUiText(R.string.page_instant_virtual__total_win_with_stake, ay0.S(new Object[]{g(s5y.a(bigDecimal))})) : new ResourceUiText(R.string.page_instant_virtual__don_round_won_vamount, ay0.S(new Object[]{g(s5y.a(bigDecimal))})), new u4f(qcnVar, i, z ? u4f.a.b : u4f.a.c));
    }

    public final void i() {
        v1f v1fVar = (v1f) this.f.getValue();
        if (v1fVar == null) {
            return;
        }
        String str = v1fVar.a;
        if (StringsKt.U("sr:sport:3") || StringsKt.U(str)) {
            return;
        }
        this.o.a(new x5f.c(new InstantWinTicketDetailInput("sr:sport:3", str)));
    }

    public final void j() {
        String str;
        v1f v1fVar = (v1f) this.f.getValue();
        if (v1fVar == null || (str = v1fVar.f) == null) {
            return;
        }
        jvd0 jvd0Var = this.n;
        if (jvd0Var == null || !jvd0Var.isActive()) {
            et7 et7Var = this.q;
            this.n = et7Var != null ? ej5.c(et7Var, null, null, new a(str, null), 3) : null;
        }
    }

    public final void k(d2f d2fVar) {
        x0f x0fVar;
        Object value;
        Object value2;
        wwd0 wwd0Var = this.i;
        if (Intrinsics.g(wwd0Var.getValue(), m4f.d.a) && (x0fVar = (x0f) this.h.getValue()) != null) {
            int i = x0fVar.b;
            d2fVar.getClass();
            wwd0 wwd0Var2 = this.a.b;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, new l2f(i, d2fVar, ((l2f) value).c)));
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, m4f.c.a));
        }
    }

    public final void l(g1f g1fVar) {
        wwd0 wwd0Var;
        Object value;
        wwd0 wwd0Var2;
        Object value2;
        do {
            wwd0Var = this.j;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, g1fVar));
        do {
            wwd0Var2 = this.i;
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, m4f.a.a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(x1b x1bVar) throws Throwable {
        r1f r1fVar;
        wwd0 wwd0Var;
        Object value;
        Parcelable resourceUiText;
        wwd0 wwd0Var2;
        Object value2;
        wwd0 wwd0Var3;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        wwd0 wwd0Var4;
        Object value7;
        if (x1bVar instanceof r1f) {
            r1fVar = (r1f) x1bVar;
            int i = r1fVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r1fVar.c = i - Integer.MIN_VALUE;
            } else {
                r1fVar = new r1f(this, x1bVar);
            }
        } else {
            r1fVar = new r1f(this, x1bVar);
        }
        Object objD = r1fVar.a;
        y5b y5bVar = y5b.a;
        int i2 = r1fVar.c;
        if (i2 == 0) {
            uj50.b(objD);
            r1fVar.c = 1;
            objD = this.c.d.d(r1fVar);
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
        dej0 dej0Var = (dej0) objD;
        if (dej0Var == null) {
            return Unit.a;
        }
        x0f x0fVar = dej0Var.a;
        BigDecimal bigDecimal = dej0Var.c;
        do {
            wwd0Var = this.k;
            value = wwd0Var.getValue();
            if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
                Object[] objArr = {g(dej0Var.b), g(bigDecimal)};
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.page_instant_virtual__don_vinplay_in_play_vcashedout_cashed_out, ay0.S(objArr));
            } else {
                resourceUiText = vch0.a;
            }
        } while (!wwd0Var.g(value, resourceUiText));
        do {
            wwd0Var2 = this.h;
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, x0fVar));
        do {
            wwd0Var3 = this.i;
            value3 = wwd0Var3.getValue();
        } while (!wwd0Var3.g(value3, m4f.d.a));
        a3f a3fVar = x0fVar.f;
        j4f j4fVar = a3fVar != null ? new j4f(x0fVar.a, a3fVar.a, x0fVar.c, x0fVar.d, a3fVar.b, a3fVar.c, a3fVar.d, a3fVar.e, a3fVar.f) : null;
        if (j4fVar != null) {
            do {
                wwd0Var4 = this.g;
                value7 = wwd0Var4.getValue();
            } while (!wwd0Var4.g(value7, new k4f.c(j4fVar)));
        }
        int i3 = dej0Var.d;
        c2f c2fVar = this.b;
        wwd0 wwd0Var5 = c2fVar.e;
        if (c2fVar.f != null) {
            c2fVar.a();
            do {
                value4 = wwd0Var5.getValue();
                ((Number) value4).floatValue();
            } while (!wwd0Var5.g(value4, Float.valueOf(1.0f)));
            if (i3 <= 0) {
                do {
                    value6 = wwd0Var5.getValue();
                    ((Number) value6).floatValue();
                } while (!wwd0Var5.g(value6, Float.valueOf(0.0f)));
                c2fVar.c.a(Unit.a);
            } else {
                wwd0 wwd0Var6 = c2fVar.d;
                do {
                    value5 = wwd0Var6.getValue();
                    ((Boolean) value5).getClass();
                } while (!wwd0Var6.g(value5, Boolean.TRUE));
                long j = ((long) i3) * 1000;
                long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
                et7 et7Var = c2fVar.f;
                c2fVar.g = et7Var != null ? ej5.c(et7Var, null, null, new b2f(jElapsedRealtime, c2fVar, j, null), 3) : null;
            }
        }
        return Unit.a;
    }
}
