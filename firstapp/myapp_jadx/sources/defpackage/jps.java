package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jps implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jps(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                LivePageActivity livePageActivity = (LivePageActivity) obj2;
                e880 e880Var = (e880) obj;
                if (e880Var != null) {
                    djh0 djh0Var = livePageActivity.R;
                    if (djh0Var != null) {
                        Selection selection = e880Var.a;
                        String str = selection.a.eventId;
                        Market market = selection.b;
                        ArrayList arrayList = djh0Var.m;
                        int size = arrayList.size();
                        int i2 = 0;
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj3 = arrayList.get(i3);
                            i3++;
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                b.q();
                                throw null;
                            }
                            jpc jpcVar = (jpc) obj3;
                            if (jpcVar instanceof ing) {
                                Event event = ((ing) jpcVar).a;
                                if (Intrinsics.g(str, event.eventId)) {
                                    List<Market> list = event.markets;
                                    list.getClass();
                                    for (Market market2 : list) {
                                        if (Intrinsics.g(market2.id, market.id) && Intrinsics.g(market2.specifier, market.specifier)) {
                                            market2.update(e880Var.b);
                                            djh0Var.d(i2);
                                        }
                                    }
                                }
                            }
                            i2 = i4;
                        }
                    }
                } else {
                    int i5 = LivePageActivity.b0;
                }
                return Unit.a;
            default:
                final List list2 = (List) obj2;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szr.f(szrVar, list2.size(), null, new op8(2015055346, new iaj() { // from class: zaa0
                    @Override // defpackage.iaj
                    public final Object d(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int iIntValue = ((Integer) obj5).intValue();
                        a aVar = (a) obj6;
                        int iIntValue2 = ((Integer) obj7).intValue();
                        ((gwr) obj4).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= aVar.d(iIntValue) ? 32 : 16;
                        }
                        if (aVar.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                            d dVarG = j.g(d.a.b, 1.0f);
                            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.j, aVar, 54);
                            int iHashCode = Long.hashCode(aVar.m());
                            ne00 ne00VarO = aVar.o();
                            d dVarC = c.c(aVar, dVarG);
                            yka.k.getClass();
                            tsr.a aVar2 = yka.a.b;
                            if (aVar.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar.D();
                            if (aVar.g()) {
                                aVar.F(aVar2);
                            } else {
                                aVar.p();
                            }
                            hlh0.a(aVar, d160VarA, yka.a.f);
                            hlh0.a(aVar, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar, iHashCode, c1350a);
                            }
                            hlh0.a(aVar, dVarC, yka.a.d);
                            lkf0.d(m58.a(iIntValue + 1, "."), null, c68.a(R.color.text_type1_tertiary, aVar), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar), aVar, 0, 0, 130042);
                            lkf0.d((String) list2.get(iIntValue), new LayoutWeightElement(1.0f, true), c68.a(R.color.text_type1_tertiary, aVar), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar), aVar, 0, 0, 130040);
                            aVar.s();
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true), 6);
                return Unit.a;
        }
    }
}
