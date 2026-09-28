package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ln0z;", "Lihb0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n0z extends ihb0 {
    public final ssw A;
    public jvd0 B;
    public final wwd0 C;
    public final v340 D;
    public final ssw<Boolean> E;
    public final ssw<Boolean> F;
    public final ssw<Integer> G;
    public final ssw<yzy> H;
    public final ssw I;
    public final ssw<wvs> J;
    public final ssw K;
    public final x4k d;
    public final vyy e;
    public final qqe0 f;
    public final jrm i;
    public final iv1 v;
    public final b1z w;
    public final v340 y;
    public final ssw<wyy> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0z(x4k x4kVar, vyy vyyVar, qqe0 qqe0Var, jrm jrmVar, iv1 iv1Var, b1z b1zVar, mgb0 mgb0Var, uy0 uy0Var) {
        super(0);
        jrmVar.getClass();
        iv1Var.getClass();
        b1zVar.getClass();
        mgb0Var.getClass();
        uy0Var.getClass();
        this.d = x4kVar;
        this.e = vyyVar;
        this.f = qqe0Var;
        this.i = jrmVar;
        this.v = iv1Var;
        this.w = b1zVar;
        this.y = e1i.e(r1i.a(uy0Var.h(pu0.b.a), mgb0Var.isShowingBalanceFlow(), mgb0Var.isLoginFlow(), new l0z(this, null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), "");
        ssw<wyy> sswVar = new ssw<>();
        this.z = sswVar;
        this.A = sswVar;
        wwd0 wwd0VarA = xwd0.a(f1z.OpenBets);
        this.C = wwd0VarA;
        this.D = e1i.b(wwd0VarA);
        this.E = new ssw<>();
        this.F = new ssw<>();
        this.G = new ssw<>();
        ssw<yzy> sswVar2 = new ssw<>();
        this.H = sswVar2;
        this.I = sswVar2;
        ssw<wvs> sswVar3 = new ssw<>();
        this.J = sswVar3;
        this.K = sswVar3;
    }

    public final void A1() {
        jvd0 jvd0Var = this.B;
        if (jvd0Var == null || !jvd0Var.isActive() || jvd0Var.isCompleted()) {
            vl50 vl50VarA = this.e.a.a();
            pfd pfdVar = fse.a;
            this.B = kzh.d(new yzh(new g1i(new i0z(ozh.c(vl50VarA, odd.b), this), new j0z(this, null)), new k0z(3, null)), o8i0.d(this));
        }
    }

    public final wvs.d z1(BookingData bookingData, boolean z, boolean z2) {
        if (z) {
            this.i.G(true);
        }
        List<Event> list = bookingData.outcomes;
        LinkedHashMap linkedHashMapA = apg.a(list);
        for (Event event : list) {
            if (event.markets != null && !event.isBetBuilderChild()) {
                for (Market market : event.markets) {
                    List<Outcome> list2 = market.outcomes;
                    if (list2 != null && market.status != 3) {
                        Iterator<Outcome> it = list2.iterator();
                        while (it.hasNext()) {
                            if (this.i.a1(event, market, it.next(), (List) linkedHashMapA.get(market.id), bookingData.shareCode, null) == 3) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return new wvs.d(z2);
    }
}
