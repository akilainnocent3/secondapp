package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.SpinnerMeta;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class ue20 extends RecyclerView.d0 {
    public final sjd0 a;
    public final tf20.d b;
    public final ity c;
    public final Context d;
    public final mpe0 e;
    public final lty f;
    public final mpe0 i;

    /* JADX WARN: Illegal instructions before constructor call */
    public ue20(final sjd0 sjd0Var, tf20.d dVar, ity ityVar) {
        ityVar.getClass();
        FrameLayout frameLayout = sjd0Var.a;
        super(frameLayout);
        this.a = sjd0Var;
        this.b = dVar;
        this.c = ityVar;
        this.d = frameLayout.getContext();
        this.e = hwr.b(new but(this, 1));
        this.f = ityVar.b(sjd0Var.C);
        mpe0 mpe0VarB = hwr.b(new Function0() { // from class: he20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                sjd0 sjd0Var2 = this.a.a;
                return new u8z(sjd0Var2.F, sjd0Var2.G, new ArrayList(), false);
            }
        });
        this.i = mpe0VarB;
        b3.H(sjd0Var.v, R.color.cmn_cool_grey);
        sjd0Var.H.setVisibility(8);
        ListenableSpinner listenableSpinner = sjd0Var.F;
        listenableSpinner.setAdapter((SpinnerAdapter) mpe0VarB.getValue());
        listenableSpinner.setOnItemSelectedListener(new ne20(listenableSpinner, this));
        sjd0Var.i.setOnClickListener(new View.OnClickListener() { // from class: je20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object tag = view.getTag();
                if (!(tag instanceof Event)) {
                    tag = null;
                }
                Event event = (Event) tag;
                if (event == null) {
                    return;
                }
                PreMatchSportActivity.f fVar = tf20.this.w;
                fVar.getClass();
                PreMatchSportActivity preMatchSportActivity = PreMatchSportActivity.this;
                Intent intent = new Intent(preMatchSportActivity, (Class<?>) PreMatchEventActivity.class);
                intent.putExtra("EXTRA_EVENT", apg.f(event));
                intent.putExtra("EXTRA_EVENT_LABEL", nkd0.a.a.a(event) ? 1 : 0);
                yrh0.s(preMatchSportActivity, intent, true);
            }
        });
        ImageView imageView = sjd0Var.B;
        Context context = frameLayout.getContext();
        context.getClass();
        imageView.setImageDrawable(gug0.b(context));
        ImageView imageView2 = sjd0Var.O;
        Context context2 = frameLayout.getContext();
        context2.getClass();
        imageView2.setImageDrawable(gug0.g(context2));
        ImageView imageView3 = sjd0Var.N;
        Context context3 = frameLayout.getContext();
        context3.getClass();
        imageView3.setImageDrawable(gug0.f(context3));
        sjd0Var.J.setOnClickListener(new View.OnClickListener() { // from class: le20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object tag = sjd0Var.i.getTag();
                if (!(tag instanceof Event)) {
                    tag = null;
                }
                Event event = (Event) tag;
                if (event == null) {
                    return;
                }
                FragmentManager supportFragmentManager = PreMatchSportActivity.this.getSupportFragmentManager();
                supportFragmentManager.getClass();
                ilk ilkVar = new ilk();
                a aVar = new a(supportFragmentManager);
                aVar.e(0, ilkVar, "GiftGrabPromotionDialogFragment", 1);
                aVar.c("GiftGrabPromotionDialogFragment");
                aVar.d();
                LinkedHashSet linkedHashSet = mlk.a;
                String str = event.eventId;
                str.getClass();
                if (mlk.a(str)) {
                    vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_CLICK);
                }
            }
        });
        for (final OutcomeButton outcomeButton : c()) {
            outcomeButton.setOnClickListener(new View.OnClickListener() { // from class: me20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OutcomeButton outcomeButton2 = outcomeButton;
                    outcomeButton2.getClass();
                    this.a.d(outcomeButton2);
                }
            });
        }
    }

    public final void a(OutcomeButton outcomeButton, Event event, Market market, Outcome outcome, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        outcomeButton.b();
        outcomeButton.setVisibility(0);
        if (market.status != 0) {
            outcomeButton.setText(zch0.h(this.d));
            outcomeButton.setEnabled(false);
            return;
        }
        outcomeButton.setEnabled(outcome.isActive == 1);
        if (!outcomeButton.isEnabled()) {
            outcomeButton.setTextOnAndOff(zch0.h(outcomeButton.getContext()));
            outcomeButton.setTag(null);
            outcomeButton.setChecked(false);
            outcomeButton.setEnabled(false);
            outcome.flag = 0;
            return;
        }
        String str = outcome.odds;
        str.getClass();
        outcomeButton.setOdds(str);
        String str2 = outcome.odds;
        str2.getClass();
        outcomeButton.setActivated(zog.i(str2, bigDecimal, bigDecimal2));
        tf20.d dVar = this.b;
        dVar.getClass();
        tf20 tf20Var = tf20.this;
        event.getClass();
        z7z z7zVarA = tf20Var.i.a(event, market, outcome);
        String str3 = outcome.odds;
        str3.getClass();
        kuh.c(outcomeButton, z7zVarA, str3, this.a.a, false, 48);
        this.f.a.a(!(z7zVarA instanceof z7z.c));
        z7zVarA.getClass();
        if (z7zVarA instanceof z7z.b) {
            tf20Var.v.a(apg.b(event, market), brg.SPORTS_PAGE);
        }
        PreMatchSportActivity.d0.add(outcomeButton);
        int i = outcome.flag;
        if (i == 1) {
            outcomeButton.g();
            outcome.flag = 0;
        } else if (i == 2) {
            outcomeButton.c();
            outcome.flag = 0;
        }
        outcomeButton.setTag(new Selection(event, market, outcome));
        outcomeButton.setChecked(iu2.n(event, market, outcome));
    }

    public final void b(Event event, List<? extends Market> list, RegularMarketRule regularMarketRule, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i) {
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            ((OutcomeButton) it.next()).b();
        }
        String str = regularMarketRule.a;
        str.getClass();
        String str2 = event.eventId;
        str2.getClass();
        str.getClass();
        tf20.d dVar = this.b;
        dVar.getClass();
        String strE = zog.e(list, str, str2, 3, tf20.this.b.e(str), bigDecimal, bigDecimal2);
        Market marketC = zog.c(str, strE, list);
        sjd0 sjd0Var = this.a;
        LinearLayout linearLayout = sjd0Var.i;
        ListenableSpinner listenableSpinner = sjd0Var.F;
        linearLayout.setTag(event);
        boolean z = regularMarketRule.c;
        Context context = this.d;
        if (!z) {
            listenableSpinner.setVisibility(8);
            for (int length = regularMarketRule.d.length; length < c().size(); length++) {
                OutcomeButton outcomeButton = c().get(length);
                outcomeButton.getClass();
                outcomeButton.setVisibility(8);
            }
            if (marketC == null) {
                int length2 = regularMarketRule.d.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    OutcomeButton outcomeButton2 = c().get(i2);
                    outcomeButton2.getClass();
                    outcomeButton2.setVisibility(0);
                    outcomeButton2.setTextOnAndOff(zch0.h(context));
                    outcomeButton2.setChecked(false);
                    outcomeButton2.setEnabled(false);
                }
                return;
            }
            int i3 = 0;
            while (i3 < marketC.outcomes.size()) {
                OutcomeButton outcomeButton3 = c().get(i3);
                outcomeButton3.getClass();
                OutcomeButton outcomeButton4 = outcomeButton3;
                Outcome outcome = marketC.outcomes.get(i3);
                outcome.getClass();
                a(outcomeButton4, event, marketC, outcome, bigDecimal, bigDecimal2);
                i3++;
            }
            while (i3 < c().size()) {
                OutcomeButton outcomeButton5 = c().get(i3);
                outcomeButton5.getClass();
                outcomeButton5.setVisibility(8);
                i3++;
            }
            return;
        }
        listenableSpinner.setVisibility(0);
        OutcomeButton outcomeButton6 = c().get(0);
        outcomeButton6.getClass();
        outcomeButton6.setVisibility(8);
        List<? extends Market> listD = zog.d(str, list);
        ArrayList arrayListF = zog.f(listD);
        mpe0 mpe0Var = this.i;
        ((u8z) mpe0Var.getValue()).f(event, listD);
        ((u8z) mpe0Var.getValue()).clear();
        ((u8z) mpe0Var.getValue()).addAll(arrayListF);
        listenableSpinner.setSelection(Math.max(arrayListF.indexOf(strE), 0), false);
        int selectedItemPosition = listenableSpinner.getSelectedItemPosition();
        String str3 = event.eventId;
        str3.getClass();
        listenableSpinner.setTag(new SpinnerMeta(selectedItemPosition, str3, i, arrayListF));
        int i4 = 1;
        for (int length3 = regularMarketRule.d.length + 1; length3 < c().size(); length3++) {
            OutcomeButton outcomeButton7 = c().get(length3);
            outcomeButton7.getClass();
            outcomeButton7.setVisibility(8);
        }
        if (marketC == null || arrayListF.isEmpty()) {
            listenableSpinner.setVisibility(8);
            int length4 = regularMarketRule.d.length + 1;
            for (int i5 = 0; i5 < length4; i5++) {
                OutcomeButton outcomeButton8 = c().get(i5);
                outcomeButton8.getClass();
                outcomeButton8.setVisibility(0);
                outcomeButton8.setTextOnAndOff(zch0.h(context));
                outcomeButton8.setEnabled(false);
                outcomeButton8.setChecked(false);
            }
            return;
        }
        while (i4 <= marketC.outcomes.size()) {
            OutcomeButton outcomeButton9 = c().get(i4);
            outcomeButton9.getClass();
            OutcomeButton outcomeButton10 = outcomeButton9;
            Outcome outcome2 = marketC.outcomes.get(i4 - 1);
            outcome2.getClass();
            a(outcomeButton10, event, marketC, outcome2, bigDecimal, bigDecimal2);
            i4++;
        }
        while (i4 < c().size()) {
            OutcomeButton outcomeButton11 = c().get(i4);
            outcomeButton11.getClass();
            outcomeButton11.setVisibility(8);
            i4++;
        }
    }

    public final List<OutcomeButton> c() {
        return (List) this.e.getValue();
    }

    public final void d(OutcomeButton outcomeButton) {
        Object tag = outcomeButton.getTag();
        if (!(tag instanceof Selection)) {
            tag = null;
        }
        Selection selection = (Selection) tag;
        if (selection == null) {
            return;
        }
        Context context = this.d;
        context.getClass();
        if (!zog.a(context, selection, outcomeButton.isChecked())) {
            outcomeButton.setChecked(false);
        }
        boolean zIsChecked = outcomeButton.isChecked();
        PreMatchSportActivity preMatchSportActivity = PreMatchSportActivity.this;
        auy auyVar = auy.c;
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        preMatchSportActivity.A1(selection, zIsChecked, auyVar, preMatchSportActivity.L1());
        q8i0 q8i0Var = preMatchSportActivity.v;
        if (zIsChecked) {
            ((of20) q8i0Var.getValue()).z1(selection);
        } else {
            ((of20) q8i0Var.getValue()).C.a(selection);
        }
        preMatchSportActivity.S1(selection, zIsChecked, brg.SPORTS_PAGE);
    }
}
