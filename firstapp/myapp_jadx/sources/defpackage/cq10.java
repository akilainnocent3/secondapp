package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class cq10 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Event event, final Market market, final List<? extends Outcome> list, final jaj<? super Event, ? super Market, ? super Outcome, ? super Boolean, ? super Boolean, Boolean> jajVar, final gaj<? super Event, ? super Market, ? super Outcome, f8z> gajVar, a aVar, final int i) {
        b bVar;
        a.C0041a.C0042a c0042a;
        Object next;
        Outcome outcome;
        event.getClass();
        list.getClass();
        jajVar.getClass();
        gajVar.getClass();
        b bVarI = aVar.i(1936618349);
        int i2 = i | (bVarI.A(event) ? 4 : 2) | (bVarI.A(market) ? 32 : 16) | (bVarI.M(list) ? 256 : 128) | (bVarI.A(jajVar) ? 2048 : 1024) | (bVarI.A(gajVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (z || objY == c0042a2) {
                c0042a = c0042a2;
                objY = CollectionsKt.a0(list, "|", null, null, new w3a(1), 30);
                bVarI.r(objY);
            } else {
                c0042a = c0042a2;
            }
            Object[] objArr = {market.id, (String) objY};
            boolean z2 = i3 == 256;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: vp10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.b(((Outcome) CollectionsKt.T(list)).id);
                    }
                };
                bVarI.r(objY2);
            }
            final ytw ytwVar = (ytw) o350.e(objArr, (Function0) objY2, bVarI, 0);
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((Outcome) next).id, (String) ytwVar.getValue()));
            Outcome outcome2 = (Outcome) next;
            if (outcome2 == null) {
                outcome2 = (Outcome) CollectionsKt.T(list);
            }
            d dVarG = j.g(d.a.b, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (list.size() > 1) {
                bVarI.N(-2127978536);
                boolean zM = bVarI.M(ytwVar);
                Object objY3 = bVarI.y();
                if (zM || objY3 == c0042a) {
                    objY3 = new Function1() { // from class: wp10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Outcome outcome3 = (Outcome) obj;
                            outcome3.getClass();
                            ytwVar.setValue(outcome3.id);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                Function1 function1 = (Function1) objY3;
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                int i4 = i2 << 6;
                Outcome outcome3 = outcome2;
                jq10.a(event, market, list, outcome3, function1, jajVar, gajVar, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), bVarI, (i2 & 1022) | (458752 & i4) | (i4 & 3670016));
                outcome = outcome3;
                bVar = bVarI;
                bVar.X(false);
            } else {
                outcome = outcome2;
                bVar = bVarI;
                bVar.N(-2127554735);
                bVar.X(false);
            }
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            b(event, market, outcome, jajVar, gajVar, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), bVar, i2 & 64638);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(market, list, jajVar, gajVar, i) { // from class: xp10
                public final /* synthetic */ Market b;
                public final /* synthetic */ List c;
                public final /* synthetic */ jaj d;
                public final /* synthetic */ gaj e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    cq10.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final Event event, final Market market, final Outcome outcome, final jaj jajVar, final gaj gajVar, final d dVar, a aVar, final int i) {
        b bVarI = aVar.i(-633382959);
        int i2 = i | (bVarI.A(event) ? 4 : 2) | (bVarI.A(market) ? 32 : 16) | (bVarI.A(outcome) ? 256 : 128) | (bVarI.A(jajVar) ? 2048 : 1024) | (bVarI.A(gajVar) ? 16384 : 8192) | (bVarI.M(dVar) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            d dVarI = j.i(dVar, 34.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new yp10();
                bVarI.r(objY);
            }
            Function1 function1 = (Function1) objY;
            boolean zA = ((i2 & 57344) == 16384) | bVarI.A(market) | bVarI.A(outcome) | bVarI.A(event) | ((i2 & 7168) == 2048);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                Function1 function2 = new Function1() { // from class: zp10
                    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean z;
                        final OutcomeButton outcomeButton = (OutcomeButton) obj;
                        outcomeButton.getClass();
                        final Market market2 = market;
                        int i3 = market2.status;
                        final Outcome outcome2 = outcome;
                        if (i3 == 0 && outcome2.isActive == 1) {
                            String str = outcome2.odds;
                            str.getClass();
                            if (str.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        final Event event2 = event;
                        outcomeButton.setTag(new Selection(event2, market2, outcome2));
                        outcomeButton.setEnabled(z);
                        if (z) {
                            String str2 = outcome2.odds;
                            str2.getClass();
                            outcomeButton.setOdds(str2);
                            int i4 = outcome2.flag;
                            if (i4 == 1) {
                                outcomeButton.g();
                            } else if (i4 == 2) {
                                outcomeButton.c();
                            }
                            outcome2.flag = 0;
                        } else {
                            OutcomeButton.setImage$default(outcomeButton, R.drawable.spr_ic_prematch_lock, false, 2, null);
                        }
                        outcomeButton.b();
                        final f8z f8zVar = (f8z) gajVar.invoke(event2, market2, outcome2);
                        outcomeButton.setChecked(f8zVar.a);
                        final jaj jajVar2 = jajVar;
                        outcomeButton.setOnClickListener(new View.OnClickListener() { // from class: bq10
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                OutcomeButton outcomeButton2 = outcomeButton;
                                if (((Boolean) jajVar2.l(event2, market2, outcome2, Boolean.valueOf(outcomeButton2.isChecked()), Boolean.valueOf(f8zVar.b != null))).booleanValue()) {
                                    return;
                                }
                                outcomeButton2.setChecked(!outcomeButton2.isChecked());
                            }
                        });
                        return Unit.a;
                    }
                };
                bVarI.r(function2);
                objY2 = function2;
            }
            androidx.compose.ui.viewinterop.b.a(function1, dVarI, (Function1) objY2, bVarI, 6, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(market, outcome, jajVar, gajVar, dVar, i) { // from class: aq10
                public final /* synthetic */ Market b;
                public final /* synthetic */ Outcome c;
                public final /* synthetic */ jaj d;
                public final /* synthetic */ gaj e;
                public final /* synthetic */ d f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    cq10.b(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
