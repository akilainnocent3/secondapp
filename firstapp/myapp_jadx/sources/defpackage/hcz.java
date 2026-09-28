package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.outrights.SearchMarketView;
import com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.outrights.detail.OutrightsActivity$observeOutright$1", f = "OutrightsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hcz extends tje0 implements Function2<lk50<? extends Event>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ OutrightsActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcz(OutrightsActivity outrightsActivity, v1b<? super hcz> v1bVar) {
        super(2, v1bVar);
        this.b = outrightsActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hcz hczVar = new hcz(this.b, v1bVar);
        hczVar.a = obj;
        return hczVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Event> lk50Var, v1b<? super Unit> v1bVar) {
        return ((hcz) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        OutrightsActivity outrightsActivity = this.b;
        int i = OutrightsActivity.F;
        if (Intrinsics.g(lk50Var, lk50.b.a)) {
            ld ldVar = outrightsActivity.b;
            if (ldVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ldVar.e.K();
        } else if (lk50Var instanceof lk50.a) {
            ld ldVar2 = outrightsActivity.b;
            if (ldVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ldVar2.e.E();
            if (outrightsActivity.B) {
                ld ldVar3 = outrightsActivity.b;
                if (ldVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ldVar3.e.I();
            } else {
                zaz zazVar = outrightsActivity.c;
                if (zazVar == null) {
                    Intrinsics.n("outrightAdapter");
                    throw null;
                }
                zazVar.i(m2g.a);
                outrightsActivity.D1(false);
            }
        } else {
            if (!(lk50Var instanceof lk50.c)) {
                uhc.a();
                return null;
            }
            ld ldVar4 = outrightsActivity.b;
            if (ldVar4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ldVar4.e.E();
            ((br3) mmc.a(hp0.A, br3.class)).U().a(outrightsActivity, true);
            outrightsActivity.i = (Event) ((lk50.c) lk50Var).a;
            ld ldVar5 = outrightsActivity.b;
            if (ldVar5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            View view = ldVar5.f;
            View view2 = ldVar5.d;
            SearchMarketView searchMarketView = ldVar5.y;
            ldVar5.c.setVisibility(0);
            searchMarketView.setVisibility(0);
            view2.setVisibility(0);
            view.setVisibility(0);
            Event event = outrightsActivity.i;
            if (event != null) {
                String str = event.sport.category.tournament.name;
                str.getClass();
                OutrightsActivity.C1(outrightsActivity, str);
            }
            Event event2 = outrightsActivity.i;
            List<Market> list = event2 != null ? event2.markets : null;
            if (list == null) {
                outrightsActivity.D1(false);
            } else if (list.isEmpty()) {
                outrightsActivity.D1(false);
                zaz zazVar2 = outrightsActivity.c;
                if (zazVar2 == null) {
                    Intrinsics.n("outrightAdapter");
                    throw null;
                }
                zazVar2.i(m2g.a);
            } else {
                outrightsActivity.B = false;
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                int i3 = 0;
                for (Object obj2 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        b.q();
                        throw null;
                    }
                    Market market = (Market) obj2;
                    if (Intrinsics.g(market.id, outrightsActivity.w) && Intrinsics.g(market.specifier, outrightsActivity.z)) {
                        i2 = i3;
                    }
                    arrayList.add(new gqu(market));
                    i3 = i4;
                }
                ((gqu) arrayList.get(i2)).b = true;
                k48.a(outrightsActivity.A1().i, arrayList);
                rpu rpuVar = outrightsActivity.d;
                if (rpuVar == null) {
                    Intrinsics.n("marketAdapter");
                    throw null;
                }
                rpuVar.i(arrayList);
                outrightsActivity.A = list.get(i2);
                String str2 = list.get(i2).desc;
                str2.getClass();
                ld ldVar6 = outrightsActivity.b;
                if (ldVar6 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                SearchMarketView searchMarketView2 = ldVar6.y;
                ibz ibzVar = searchMarketView2.F;
                AppCompatEditText appCompatEditText = ibzVar.c;
                TextView textView = ibzVar.b;
                appCompatEditText.setText("");
                searchMarketView2.clearFocus();
                searchMarketView2.J = str2;
                textView.setVisibility(0);
                textView.setText(str2);
                outrightsActivity.E1(false);
                outrightsActivity.B1(list.get(i2));
            }
        }
        return Unit.a;
    }
}
