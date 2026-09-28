package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cruxlab.sectionedrecyclerview.lib.a;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.live.data.LiveEventData;
import com.sportybet.plugin.realsports.live.data.LiveSpinnerMeta;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class yms extends a.b {
    public final fid0 b;
    public final jts c;
    public final xss.i d;
    public final Context e;
    public final List<OutcomeButton> f;
    public final List<TextView> g;
    public final ArrayList h;
    public final mpe0 i;
    public final mpe0 j;
    public final mpe0 k;

    /* JADX WARN: Illegal instructions before constructor call */
    public yms(fid0 fid0Var, jts jtsVar, xss.i iVar) {
        ConstraintLayout constraintLayout = fid0Var.a;
        super(constraintLayout);
        this.b = fid0Var;
        this.c = jtsVar;
        this.d = iVar;
        Context context = constraintLayout.getContext();
        context.getClass();
        this.e = context;
        List<OutcomeButton> listK = b.k(fid0Var.A, fid0Var.B, fid0Var.C, fid0Var.D);
        this.f = listK;
        this.g = b.k(fid0Var.R, fid0Var.S, fid0Var.T, fid0Var.U);
        this.h = new ArrayList();
        this.i = hwr.b(new Function0() { // from class: hms
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.a.e.getResources().getDimensionPixelSize(R.dimen.spr_score_min_width));
            }
        });
        this.j = hwr.b(new ja5(this, 1));
        mpe0 mpe0VarB = hwr.b(new wwd(this, 1));
        this.k = mpe0VarB;
        b3.H(fid0Var.V, R.color.text_type2_tertiary);
        fid0Var.E.setRowCount(2);
        ListenableSpinner listenableSpinner = fid0Var.G;
        listenableSpinner.setAdapter((SpinnerAdapter) mpe0VarB.getValue());
        u8z u8zVar = (u8z) mpe0VarB.getValue();
        vms vmsVar = new vms(this);
        u8zVar.getClass();
        u8zVar.f = vmsVar;
        listenableSpinner.setOnItemSelectedListener(new wms(fid0Var, this));
        for (final OutcomeButton outcomeButton : listK) {
            outcomeButton.setOnClickListener(new View.OnClickListener() { // from class: oms
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OutcomeButton outcomeButton2 = outcomeButton;
                    outcomeButton2.getClass();
                    this.a.g(outcomeButton2);
                }
            });
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: qms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jts jtsVar2;
                Object tag = view.getTag();
                if (!(tag instanceof Event)) {
                    tag = null;
                }
                Event event = (Event) tag;
                if (event == null || (jtsVar2 = this.a.c) == null) {
                    return;
                }
                jtsVar2.b(event);
            }
        });
    }

    public static void b(OutcomeButton outcomeButton) {
        outcomeButton.setTextOnAndOff(zch0.h(outcomeButton.getContext()));
        outcomeButton.setTag(null);
        outcomeButton.setChecked(false);
        outcomeButton.setEnabled(false);
    }

    public static Activity c(Context context) {
        do {
            Activity activity = (Activity) (!(context instanceof Activity) ? null : context);
            if (activity != null) {
                return activity;
            }
            if (!(context instanceof ContextWrapper)) {
                context = null;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        } while (context != null);
        return null;
    }

    public final TextView a(int i, String str) {
        TextView textView = new TextView(this.e);
        textView.setMinWidth(((Number) this.i.getValue()).intValue());
        textView.setText(str);
        textView.setTextSize(12.0f);
        textView.setTextColor((i < 0 || i >= 2) ? ((Number) this.j.getValue()).intValue() : -1);
        return textView;
    }

    public final void d(LiveEventData liveEventData, RegularMarketRule regularMarketRule, Market market, List<? extends Market> list, int i) {
        ArrayList arrayListU;
        String str = market.id;
        if (str == null) {
            str = "0";
        }
        Object obj = null;
        RegularMarketRule regularMarketRuleA = RegularMarketRule.a(str, null);
        if (regularMarketRuleA == null) {
            e();
            Event event = liveEventData.getEvent();
            String[] strArr = regularMarketRule.d;
            strArr.getClass();
            h(event, market, strArr);
            return;
        }
        fid0 fid0Var = this.b;
        TextView textView = fid0Var.w;
        TextView textView2 = fid0Var.J;
        String str2 = market.name;
        if (str2 == null) {
            str2 = regularMarketRuleA.b;
            str2.getClass();
        }
        textView.setText(str2);
        String[] titles = market.getTitles();
        if (titles == null || titles.length == 0) {
            String[] strArr2 = regularMarketRuleA.d;
            strArr2.getClass();
            arrayListU = ay0.U(strArr2);
        } else {
            String[] titles2 = market.getTitles();
            titles2.getClass();
            arrayListU = ay0.U(titles2);
        }
        String[] titles3 = market.getTitles();
        titles3.getClass();
        String str3 = (String) CollectionsKt.firstOrNull(ay0.U(titles3));
        if (str3 == null) {
            str3 = regularMarketRuleA.e;
        }
        if (regularMarketRuleA.c) {
            str3.getClass();
            textView2.setVisibility(0);
            textView2.setText(str3);
            arrayListU.remove(str3);
        } else {
            fid0Var.J.setVisibility(8);
            fid0Var.G.setVisibility(8);
            fid0Var.I.setVisibility(8);
        }
        int size = arrayListU.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            List<TextView> list2 = this.g;
            if (i3 >= size) {
                int size2 = list2.size();
                for (int size3 = arrayListU.size(); size3 < size2; size3++) {
                    TextView textView3 = list2.get(size3);
                    textView3.getClass();
                    textView3.setVisibility(8);
                }
                for (Object obj2 : list2) {
                    TextView textView4 = (TextView) obj2;
                    textView4.getClass();
                    if (textView4.getVisibility() == 0) {
                        obj = obj2;
                        break;
                    }
                }
                if (((TextView) obj) != null) {
                    fid0Var.e.setVisibility(0);
                    fid0Var.d.setVisibility(0);
                }
                fid0Var.y.setOnClickListener(new View.OnClickListener() { // from class: sms
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        jts jtsVar = this.a.c;
                        if (jtsVar != null) {
                            jtsVar.e();
                        }
                    }
                });
                if (!regularMarketRuleA.c) {
                    Event event2 = liveEventData.getEvent();
                    String[] strArr3 = regularMarketRuleA.d;
                    strArr3.getClass();
                    h(event2, market, strArr3);
                    return;
                }
                Event event3 = liveEventData.getEvent();
                Market marketF = f(gjs.b(regularMarketRuleA.a, list), liveEventData.getEvent(), regularMarketRuleA, i);
                String[] strArr4 = regularMarketRuleA.d;
                strArr4.getClass();
                h(event3, marketF, strArr4);
                return;
            }
            Object obj3 = arrayListU.get(i3);
            i3++;
            int i4 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            String str4 = (String) obj3;
            if (i2 < list2.size()) {
                list2.get(i2).setText(str4);
                TextView textView5 = list2.get(i2);
                textView5.getClass();
                textView5.setVisibility(0);
            }
            i2 = i4;
        }
    }

    public final void e() {
        fid0 fid0Var = this.b;
        fid0Var.d.setVisibility(8);
        fid0Var.J.setVisibility(8);
        fid0Var.e.setVisibility(8);
        for (TextView textView : this.g) {
            textView.getClass();
            textView.setVisibility(8);
        }
    }

    public final Market f(ArrayList arrayList, Event event, RegularMarketRule regularMarketRule, int i) {
        Object bVar;
        mpe0 mpe0Var = this.k;
        ArrayList arrayListE = gjs.e(arrayList);
        try {
            zi50.a aVar = zi50.b;
            ((u8z) mpe0Var.getValue()).f(event, arrayList);
            ((u8z) mpe0Var.getValue()).clear();
            ((u8z) mpe0Var.getValue()).addAll(tru.i(arrayListE));
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_LIVE_PAGE);
            aVar3.b(thA);
        }
        fid0 fid0Var = this.b;
        ListenableSpinner listenableSpinner = fid0Var.G;
        OutcomeButton outcomeButton = fid0Var.I;
        listenableSpinner.setVisibility(0);
        listenableSpinner.setEnabled(!arrayList.isEmpty());
        if (!listenableSpinner.isEnabled()) {
            b(outcomeButton);
            outcomeButton.setVisibility(0);
        }
        String str = regularMarketRule.a;
        str.getClass();
        xss.i iVar = this.d;
        iVar.getClass();
        String selectedSpecifier = event.getSelectedSpecifier(str, xss.this.e.e(str));
        listenableSpinner.setSelection(selectedSpecifier != null ? Math.max(arrayListE.indexOf(selectedSpecifier), 0) : 0, false);
        int selectedItemPosition = listenableSpinner.getSelectedItemPosition();
        String str2 = regularMarketRule.a;
        str2.getClass();
        listenableSpinner.setTag(new LiveSpinnerMeta(selectedItemPosition, i, str2, arrayListE));
        int size = arrayList.size();
        int selectedItemPosition2 = listenableSpinner.getSelectedItemPosition();
        if (selectedItemPosition2 < 0 || selectedItemPosition2 >= size) {
            return null;
        }
        return (Market) arrayList.get(listenableSpinner.getSelectedItemPosition());
    }

    public final void g(OutcomeButton outcomeButton) {
        Object tag = outcomeButton.getTag();
        if (!(tag instanceof Selection)) {
            tag = null;
        }
        Selection selection = (Selection) tag;
        if (selection == null) {
            return;
        }
        if (!iu2.t(selection.a, selection.b, selection.c, outcomeButton.isChecked(), false, null, 16368)) {
            outcomeButton.setChecked(false);
            boolean zM = kni0.m();
            Context context = this.e;
            if (zM) {
                iu2.r(c(context));
            } else {
                if (iu2.l()) {
                    qz3.p(c(context));
                }
                if (iu2.f(selection)) {
                    qz3.m(c(context));
                }
            }
        }
        if (iu2.p() && outcomeButton.isChecked() && !iu2.o(selection)) {
            Context context2 = outcomeButton.getContext();
            context2.getClass();
            iu2.e(c(context2), selection);
        }
        jts jtsVar = this.c;
        if (jtsVar != null) {
            jtsVar.d(selection, outcomeButton.isChecked());
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    public final void h(Event event, Market market, String[] strArr) {
        int length = strArr.length;
        List<OutcomeButton> list = this.f;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 < length) {
                OutcomeButton outcomeButton = list.get(i2);
                outcomeButton.getClass();
                OutcomeButton outcomeButton2 = outcomeButton;
                outcomeButton2.setVisibility(i);
                if ((market != null ? market.outcomes : null) == null || i2 >= market.outcomes.size()) {
                    b(outcomeButton2);
                } else {
                    Outcome outcome = market.outcomes.get(i2);
                    if (market.status == 0 && outcome.isActive == 1) {
                        String str = outcome.odds;
                        str.getClass();
                        if (StringsKt.U(str)) {
                            b(outcomeButton2);
                            outcome.flag = i;
                        } else {
                            outcomeButton2.setTag(new Selection(event, market, outcome));
                            String str2 = outcome.odds;
                            str2.getClass();
                            outcomeButton2.setOdds(str2);
                            outcomeButton2.setChecked(iu2.n(event, market, outcome));
                            outcomeButton2.setEnabled(true);
                            xss.i iVar = this.d;
                            iVar.getClass();
                            xss xssVar = xss.this;
                            z7z z7zVarA = xssVar.m.a(event, market, outcome);
                            String str3 = outcome.odds;
                            str3.getClass();
                            kuh.c(outcomeButton2, z7zVarA, str3, null, true, 24);
                            z7zVarA.getClass();
                            if (z7zVarA instanceof z7z.b) {
                                xssVar.n.a(apg.b(event, market), brg.LIVE_PAGE);
                            }
                            xss.M.add(outcomeButton2);
                            int i3 = outcome.flag;
                            if (i3 == 1) {
                                outcomeButton2.g();
                            } else if (i3 == 2) {
                                outcomeButton2.c();
                            }
                            if (outcome.flag != 0) {
                                this.h.add(outcomeButton2);
                            }
                            i = 0;
                            outcome.flag = 0;
                        }
                    } else {
                        b(outcomeButton2);
                        outcome.flag = i;
                    }
                }
            } else {
                OutcomeButton outcomeButton3 = list.get(i2);
                outcomeButton3.getClass();
                outcomeButton3.setVisibility(8);
            }
        }
    }
}
