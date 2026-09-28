package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SearchPreMatchPanel;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class yw70 extends x<zf20, RecyclerView.d0> implements k0e0.a {
    public final /* synthetic */ vfh0 b;
    public final SearchPreMatchPanel c;
    public ity d;

    public static final class a extends n.e<zf20> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(zf20 zf20Var, zf20 zf20Var2) {
            zf20 zf20Var3 = zf20Var;
            zf20 zf20Var4 = zf20Var2;
            zf20Var3.getClass();
            zf20Var4.getClass();
            return Intrinsics.g(zf20Var3, zf20Var4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(zf20 zf20Var, zf20 zf20Var2) {
            zf20 zf20Var3 = zf20Var;
            zf20 zf20Var4 = zf20Var2;
            zf20Var3.getClass();
            zf20Var4.getClass();
            jpc jpcVar = zf20Var4.b;
            jpc jpcVar2 = zf20Var3.b;
            if ((jpcVar2 instanceof ing) && (jpcVar instanceof ing)) {
                return Intrinsics.g(((ing) jpcVar2).a.eventId, ((ing) jpcVar).a.eventId);
            }
            if ((jpcVar2 instanceof rru) && (jpcVar instanceof rru)) {
                return ((rru) jpcVar2).a == ((rru) jpcVar).a;
            }
            return Intrinsics.g(zf20Var3.a.a, zf20Var4.a.a);
        }
    }

    public static final class b implements sw70 {
        public b() {
        }

        @Override // defpackage.sw70
        public final void a(int i, String str) {
            str.getClass();
            yw70 yw70Var = yw70.this;
            yw70Var.b.h(i, str, new gvb(2, yw70Var, str));
        }

        @Override // defpackage.sw70
        public final int b(String str) {
            str.getClass();
            return yw70.this.b.f(str);
        }

        @Override // defpackage.sw70
        public final List<String> c() {
            return yw70.this.b.g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw70(Context context, SearchPreMatchPanel searchPreMatchPanel) {
        super(new a());
        context.getClass();
        this.b = new vfh0(context, "search/prematch");
        this.c = searchPreMatchPanel;
    }

    @Override // k0e0.a
    public final boolean d(int i) {
        return getItemViewType(i) == 8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        if (i < 0 || i >= getItemCount()) {
            return -1;
        }
        return getItem(i).b.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        String strB;
        int iIndexOf;
        String str;
        String str2;
        RecyclerView.d0 d0Var2 = d0Var;
        d0Var2.getClass();
        zf20 item = getItem(i);
        if (item == null) {
            return;
        }
        jpc jpcVar = item.b;
        if (jpcVar.a() != 2) {
            if (!(d0Var2 instanceof lg20)) {
                d0Var2 = null;
            }
            final lg20 lg20Var = (lg20) d0Var2;
            if (lg20Var != null) {
                mpe0 mpe0Var = lg20Var.d;
                b bVar = lg20Var.b;
                tjd0 tjd0Var = lg20Var.a;
                rru rruVar = jpcVar instanceof rru ? (rru) jpcVar : null;
                if (rruVar == null) {
                    return;
                }
                final RegularMarketRule regularMarketRule = item.a;
                TextView textView = tjd0Var.b;
                ListenableSpinner listenableSpinner = tjd0Var.v;
                textView.setText(bwf0.c(rruVar.a, yw70.this.c.getLanguageCode()));
                if (!regularMarketRule.c) {
                    listenableSpinner.setVisibility(8);
                    String[] strArr = regularMarketRule.d;
                    strArr.getClass();
                    int i2 = 0;
                    for (String str3 : strArr) {
                        TextView textView2 = lg20Var.a().get(i2);
                        textView2.setText(str3);
                        textView2.setVisibility(0);
                        i2++;
                    }
                    while (i2 < lg20Var.a().size()) {
                        TextView textView3 = lg20Var.a().get(i2);
                        textView3.getClass();
                        textView3.setVisibility(8);
                        i2++;
                    }
                    return;
                }
                listenableSpinner.setVisibility(0);
                listenableSpinner.setOnItemSelectedListener(null);
                ((eru) mpe0Var.getValue()).clear();
                ((eru) mpe0Var.getValue()).addAll(bVar.c());
                String str4 = regularMarketRule.a;
                str4.getClass();
                listenableSpinner.setSelection(bVar.b(str4));
                listenableSpinner.setOnItemSelectedListener(new fpy() { // from class: jg20
                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j) {
                        yw70.b bVar2 = lg20Var.b;
                        String str5 = regularMarketRule.a;
                        str5.getClass();
                        bVar2.a(i3, str5);
                    }
                });
                TextView textView4 = lg20Var.a().get(0);
                textView4.getClass();
                textView4.setVisibility(8);
                String[] strArr2 = regularMarketRule.d;
                strArr2.getClass();
                int i3 = 1;
                for (String str5 : strArr2) {
                    TextView textView5 = lg20Var.a().get(i3);
                    textView5.setText(str5);
                    textView5.setVisibility(0);
                    i3++;
                }
                while (i3 < lg20Var.a().size()) {
                    TextView textView6 = lg20Var.a().get(i3);
                    textView6.getClass();
                    textView6.setVisibility(8);
                    i3++;
                }
                return;
            }
            return;
        }
        if (!(d0Var2 instanceof te20)) {
            d0Var2 = null;
        }
        final te20 te20Var = (te20) d0Var2;
        if (te20Var == null) {
            return;
        }
        lty ltyVar = te20Var.v;
        Context context = te20Var.i;
        List<OutcomeButton> list = te20Var.d;
        final sjd0 sjd0Var = te20Var.a;
        ltyVar.a();
        te20Var.f = item;
        ing ingVar = jpcVar instanceof ing ? (ing) jpcVar : null;
        if (ingVar == null) {
            return;
        }
        final Event event = ingVar.a;
        te20Var.c.a(ltyVar, event, item.a, null);
        LinearLayout linearLayout = sjd0Var.i;
        AppCompatImageView appCompatImageView = sjd0Var.J;
        TextView textView7 = sjd0Var.d;
        AppCompatImageView appCompatImageView2 = sjd0Var.L;
        ImageView imageView = sjd0Var.N;
        ImageView imageView2 = sjd0Var.B;
        ImageView imageView3 = sjd0Var.O;
        TextView textView8 = sjd0Var.c;
        ListenableSpinner listenableSpinner2 = sjd0Var.F;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: de20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ag20 ag20Var = te20Var.b;
                Event event2 = event;
                event2.getClass();
                ag20Var.b(event2);
            }
        });
        sjd0Var.E.setVisibility(!ingVar.c ? 0 : 8);
        sjd0Var.D.setVisibility(nkd0.a.a.a(event) ? 0 : 8);
        Context context2 = imageView3.getContext();
        context2.getClass();
        imageView3.setImageDrawable(gug0.g(context2));
        imageView3.setVisibility(event.isVirtualSoccer() ? 0 : 8);
        Context context3 = sjd0Var.a.getContext();
        context3.getClass();
        imageView2.setImageDrawable(gug0.b(context3));
        imageView2.setVisibility(event.oddsBoost ? 0 : 8);
        imageView.setVisibility(event.topTeam ? 0 : 8);
        Context context4 = imageView.getContext();
        context4.getClass();
        imageView.setImageDrawable(gug0.f(context4));
        appCompatImageView2.setVisibility(event.showStats() ? 0 : 8);
        appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: fe20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                te20Var.b.a(event);
            }
        });
        sjd0Var.M.setText(bwf0.a.s(event.estimateStartTime, false));
        sjd0Var.f.setText(b3.P(event));
        int i4 = event.commentsNum;
        textView7.setText("Comments " + (i4 > 999 ? "999+" : Integer.valueOf(i4)));
        textView7.setVisibility(i4 > 0 ? 0 : 8);
        if (ingVar.v || (str = ingVar.f) == null || str.length() == 0 || (str2 = ingVar.i) == null || str2.length() == 0) {
            textView8.setVisibility(8);
        } else {
            textView8.setVisibility(0);
            context.getClass();
            textView8.setText(sn5.b(context, R.string.app_common__var_to_var, ingVar.f, ingVar.i));
        }
        sjd0Var.e.setText(event.homeTeamName);
        sjd0Var.b.setText(event.awayTeamName);
        sjd0Var.v.setText(b3.M(event));
        sjd0Var.i.setTag(event);
        sjd0Var.K.setVisibility(event.hasLiveStream() ? 0 : 8);
        sjd0Var.H.setVisibility(ingVar.d ? 0 : 8);
        appCompatImageView.setVisibility(event.hasGift() ? 0 : 8);
        if (appCompatImageView.getVisibility() == 0) {
            LinkedHashSet linkedHashSet = mlk.a;
            String str6 = event.eventId;
            str6.getClass();
            if (mlk.b(str6)) {
                f00 f00Var = vgb0.a;
                vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_SHOWN);
            }
        }
        RegularMarketRule regularMarketRule2 = item.a;
        if (regularMarketRule2.c) {
            String str7 = regularMarketRule2.a;
            ag20 ag20Var = te20Var.b;
            str7.getClass();
            String strE = ag20Var.e(str7);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            strB = ingVar.b(str7, strE, bigDecimal, bigDecimal);
        } else {
            strB = null;
        }
        Market market = ingVar.a.getMarket(item.a.a, strB);
        if (!item.a.c) {
            int i5 = 8;
            listenableSpinner2.setVisibility(8);
            int length = item.a.d.length;
            while (length < list.size()) {
                OutcomeButton outcomeButton = list.get(length);
                outcomeButton.getClass();
                outcomeButton.setVisibility(i5);
                length++;
                i5 = 8;
            }
            if (market == null) {
                int length2 = item.a.d.length;
                for (int i6 = 0; i6 < length2; i6++) {
                    OutcomeButton outcomeButton2 = list.get(i6);
                    outcomeButton2.getClass();
                    OutcomeButton outcomeButton3 = outcomeButton2;
                    outcomeButton3.setVisibility(0);
                    outcomeButton3.setTextOnAndOff(zch0.h(context));
                    outcomeButton3.setChecked(false);
                    outcomeButton3.setEnabled(false);
                }
                return;
            }
            int i7 = 0;
            while (i7 < market.outcomes.size()) {
                OutcomeButton outcomeButton4 = list.get(i7);
                outcomeButton4.getClass();
                Outcome outcome = market.outcomes.get(i7);
                outcome.getClass();
                te20Var.a(outcomeButton4, market, outcome, event);
                i7++;
            }
            while (i7 < list.size()) {
                OutcomeButton outcomeButton5 = list.get(i7);
                outcomeButton5.getClass();
                outcomeButton5.setVisibility(8);
                i7++;
            }
            return;
        }
        listenableSpinner2.setVisibility(0);
        listenableSpinner2.setOnItemSelectedListener(null);
        OutcomeButton outcomeButton6 = list.get(0);
        outcomeButton6.getClass();
        outcomeButton6.setVisibility(8);
        List<Market> marketList = ingVar.a.getMarketList(item.a.a);
        List<String> specifierList = ingVar.a.getSpecifierList(marketList);
        u8z u8zVar = te20Var.e;
        if (u8zVar == null) {
            u8z u8zVar2 = new u8z(listenableSpinner2, sjd0Var.G, tru.i(specifierList), false);
            te20Var.e = u8zVar2;
            marketList.getClass();
            u8zVar2.f(event, marketList);
            listenableSpinner2.setAdapter((SpinnerAdapter) te20Var.e);
        } else {
            marketList.getClass();
            u8zVar.f(event, marketList);
            u8z u8zVar3 = te20Var.e;
            if (u8zVar3 != null) {
                u8zVar3.clear();
            }
            u8z u8zVar4 = te20Var.e;
            if (u8zVar4 != null) {
                u8zVar4.addAll(tru.i(specifierList));
            }
        }
        u8z u8zVar5 = te20Var.e;
        if (u8zVar5 != null) {
            u8zVar5.f = new pe20(te20Var);
        }
        if (strB == null || (iIndexOf = specifierList.indexOf(strB)) < 0) {
            listenableSpinner2.setSelection(0, false);
        } else {
            listenableSpinner2.setSelection(iIndexOf, false);
        }
        listenableSpinner2.post(new Runnable() { // from class: ge20
            @Override // java.lang.Runnable
            public final void run() {
                sjd0Var.F.setOnItemSelectedListener(te20Var.w);
            }
        });
        int length3 = item.a.d.length;
        while (true) {
            length3++;
            if (length3 >= list.size()) {
                break;
            }
            OutcomeButton outcomeButton7 = list.get(length3);
            outcomeButton7.getClass();
            outcomeButton7.setVisibility(8);
        }
        if (market != null && !specifierList.isEmpty()) {
            int i8 = 1;
            while (i8 <= market.outcomes.size()) {
                OutcomeButton outcomeButton8 = list.get(i8);
                outcomeButton8.getClass();
                Outcome outcome2 = market.outcomes.get(i8 - 1);
                outcome2.getClass();
                te20Var.a(outcomeButton8, market, outcome2, event);
                i8++;
            }
            while (i8 < list.size()) {
                OutcomeButton outcomeButton9 = list.get(i8);
                outcomeButton9.getClass();
                outcomeButton9.setVisibility(8);
                i8++;
            }
            return;
        }
        listenableSpinner2.setVisibility(8);
        int length4 = item.a.d.length;
        if (length4 < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            OutcomeButton outcomeButton10 = list.get(i9);
            outcomeButton10.getClass();
            OutcomeButton outcomeButton11 = outcomeButton10;
            outcomeButton11.setVisibility(0);
            outcomeButton11.setTextOnAndOff(zch0.h(context));
            outcomeButton11.setEnabled(false);
            outcomeButton11.setChecked(false);
            if (i9 == length4) {
                return;
            } else {
                i9++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 2) {
            return new lg20(tjd0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_sport_event_market_title, viewGroup, false)), new b());
        }
        sjd0 sjd0VarA = sjd0.a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        ity ityVar = this.d;
        if (ityVar != null) {
            return new te20(sjd0VarA, this.c, ityVar);
        }
        Intrinsics.n("oneUpPromoPresenter");
        throw null;
    }
}
