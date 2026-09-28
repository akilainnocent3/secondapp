package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lmdo;", "Lj8i0;", "Ljpk;", "Ljdo;", "Les3;", "Ljh2;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mdo extends j8i0 implements jpk, jdo, es3, jh2 {
    public final c4p a;
    public final jpk b;
    public final jdo c;
    public final grm d;
    public final eqn e;
    public final es3 f;
    public final jh2 i;
    public final int v;
    public final ssw<hqc> w;
    public final ssw y;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.SOUTH_AFRICA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.InstantWinBetslipViewModel$createTicket$1", f = "InstantWinBetslipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lk50<? extends xho>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ TicketParameter c;
        public final /* synthetic */ BigDecimal d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TicketParameter ticketParameter, BigDecimal bigDecimal, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = ticketParameter;
            this.d = bigDecimal;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = mdo.this.new b(this.c, this.d, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends xho> lk50Var, v1b<? super Unit> v1bVar) {
            return ((b) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            hqc lqcVar;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            mdo mdoVar = mdo.this;
            grm grmVar = mdoVar.d;
            jpk jpkVar = mdoVar.b;
            ssw<hqc> sswVar = mdoVar.w;
            if (lk50Var instanceof lk50.c) {
                jpkVar.b0();
                TicketParameter ticketParameter = this.c;
                jpkVar.T0(ticketParameter.getSportId());
                xho xhoVar = (xho) ((lk50.c) lk50Var).a;
                xhoVar.getClass();
                if (Intrinsics.g(ticketParameter.getSportId(), "sr:sport:2")) {
                    if (grmVar.c.n()) {
                        jvd0 jvd0Var = grmVar.d;
                        if (jvd0Var != null) {
                            jvd0Var.cancel((CancellationException) null);
                        }
                        grmVar.d = ej5.c(grmVar.f, null, null, new frm(grmVar, null), 3);
                    }
                    String plainString = this.d.toPlainString();
                    plainString.getClass();
                    grmVar.getClass();
                    if (grmVar.c.n()) {
                        jvd0 jvd0Var2 = grmVar.e;
                        if (jvd0Var2 != null) {
                            jvd0Var2.cancel((CancellationException) null);
                        }
                        grmVar.e = ej5.c(grmVar.f, null, null, new erm(grmVar, plainString, null), 3);
                    }
                }
                lqcVar = new nqc(xhoVar);
            } else if (lk50Var instanceof lk50.a) {
                yy50.a.m(new jqc());
                lqcVar = mdo.y1(((lk50.a) lk50Var).a);
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                lqcVar = new lqc();
            }
            sswVar.m(lqcVar);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.InstantWinBetslipViewModel$createTicket$2", f = "InstantWinBetslipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super lk50<? extends xho>>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        public c(v1b<? super c> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends xho>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            c cVar = mdo.this.new c(v1bVar);
            cVar.a = th;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            yy50.a.m(new jqc());
            mdo.this.w.m(mdo.y1(th));
            return Unit.a;
        }
    }

    public mdo(c4p c4pVar, jpk jpkVar, jdo jdoVar, psm psmVar, grm grmVar, eqn eqnVar, es3 es3Var, jh2 jh2Var) {
        jpkVar.getClass();
        jdoVar.getClass();
        psmVar.getClass();
        grmVar.getClass();
        eqnVar.getClass();
        es3Var.getClass();
        jh2Var.getClass();
        this.a = c4pVar;
        this.b = jpkVar;
        this.c = jdoVar;
        this.d = grmVar;
        this.e = eqnVar;
        this.f = es3Var;
        this.i = jh2Var;
        this.v = a.a[psmVar.getCountryCode().ordinal()] == 1 ? R.string.page_instant_virtual__the_instant_virtuals_is_unavailable_now_tip__ZA : R.string.page_instant_virtual__the_instant_virtuals_is_unavailable_now_tip;
        ssw<hqc> sswVar = new ssw<>();
        this.w = sswVar;
        this.y = sswVar;
    }

    public static kqc y1(Throwable th) {
        String message;
        ResponseBody responseBody;
        try {
            if (th instanceof tom) {
                bi50<?> bi50Var = ((tom) th).c;
                message = (bi50Var == null || (responseBody = bi50Var.c) == null) ? null : ci50.a(responseBody);
            } else {
                message = th.getMessage();
            }
            if (message == null) {
                return new kqc();
            }
            kqc kqcVar = new kqc();
            kqcVar.d = message;
            return kqcVar;
        } catch (Exception unused) {
            return new kqc();
        }
    }

    @Override // defpackage.es3
    public final void A() {
        this.f.A();
    }

    @Override // defpackage.jh2
    public final boolean B(String str) {
        str.getClass();
        return this.i.B(str);
    }

    @Override // defpackage.jpk
    public final void E(String str) {
        this.b.E(str);
    }

    @Override // defpackage.jdo
    public final lyh<Integer> F(String str) {
        str.getClass();
        return this.c.F(str);
    }

    @Override // defpackage.jpk
    public final lyh<m780> G0(String str) {
        return this.b.G0(str);
    }

    @Override // defpackage.jpk
    public final void H0() {
        this.b.H0();
    }

    @Override // defpackage.jpk
    public final void I(String str, String str2, String str3) {
        this.b.I(str, str2, str3);
    }

    @Override // defpackage.jdo
    public final void I0(String str) {
        str.getClass();
        this.c.I0(str);
    }

    @Override // defpackage.jdo
    public final void O(String str) {
        this.c.O(str);
    }

    @Override // defpackage.jdo
    public final void R(String str, String str2, Collection<? extends BetSlipData> collection) {
        this.c.R(str, str2, collection);
    }

    @Override // defpackage.jpk
    public final void R0(boolean z) {
        this.b.R0(z);
    }

    @Override // defpackage.jpk
    public final void T0(String str) {
        str.getClass();
        this.b.T0(str);
    }

    @Override // defpackage.es3
    public final boolean V() {
        return this.f.V();
    }

    @Override // defpackage.jh2
    public final void W0(String str, boolean z) {
        str.getClass();
        this.i.W0(str, z);
    }

    @Override // defpackage.jpk
    public final boolean a0() {
        return this.b.a0();
    }

    @Override // defpackage.jpk
    public final void b0() {
        this.b.b0();
    }

    @Override // defpackage.es3
    public final void d1(String str, String str2) {
        str.getClass();
        this.f.d1(str, str2);
    }

    @Override // defpackage.jdo
    public final void j0(int i, String str) {
        str.getClass();
        this.c.j0(i, str);
    }

    @Override // defpackage.jpk
    public final void j1(ArrayList arrayList) {
        this.b.j1(arrayList);
    }

    @Override // defpackage.jdo
    public final Object l1(String str, String str2, b6v b6vVar) {
        return this.c.l1(str, str2, b6vVar);
    }

    @Override // defpackage.jdo
    public final void o() {
        this.c.o();
    }

    @Override // defpackage.es3
    public final void p0() {
        this.f.p0();
    }

    @Override // defpackage.jpk
    public final uwd0<List<GiftDetails>> p1() {
        return this.b.p1();
    }

    @Override // defpackage.jdo
    public final void q0(String str) {
        this.c.q0(str);
    }

    @Override // defpackage.es3
    public final a390<Unit> s0() {
        return this.f.s0();
    }

    @Override // defpackage.jpk
    public final m780 t0(String str) {
        return this.b.t0(str);
    }

    @Override // defpackage.jpk
    public final void t1() {
        this.b.t1();
    }

    @Override // defpackage.jdo
    public final a390<Unit> v0() {
        return this.c.v0();
    }

    @Override // defpackage.es3
    public final gs3 w1(String str) {
        return this.f.w1(str);
    }

    @Override // defpackage.jdo
    public final uwd0<Set<String>> x() {
        return this.c.x();
    }

    public final void x1(TicketParameter ticketParameter, BigDecimal bigDecimal, InstantWinBetSource instantWinBetSource) {
        bigDecimal.getClass();
        instantWinBetSource.getClass();
        eqn eqnVar = this.e;
        if (eqnVar.f) {
            jvd0 jvd0Var = eqnVar.d;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            eqnVar.d = ej5.c(eqnVar.e, null, null, new fqn(null, eqnVar), 3);
        }
        c4p c4pVar = this.a;
        c4pVar.getClass();
        kzh.d(new yzh(new g1i(new wl50(bm50.a(c4pVar.a.o(ticketParameter, instantWinBetSource)), new li6(2)), new b(ticketParameter, bigDecimal, null)), new c(null)), o8i0.d(this));
    }

    @Override // defpackage.es3
    public final uwd0<lt3> y() {
        return this.f.y();
    }

    @Override // defpackage.es3
    public final void y0(String str, boolean z) {
        str.getClass();
        this.f.y0(str, z);
    }
}
