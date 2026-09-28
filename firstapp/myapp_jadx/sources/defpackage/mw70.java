package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.SearchLiveEventMeta;
import com.sportybet.plugin.realsports.search.a;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class mw70 extends RecyclerView.d0 {
    public final fid0 a;
    public final lmg b;
    public final dw70 c;
    public final Context d;
    public final List<OutcomeButton> e;
    public final ArrayList f;
    public final mpe0 i;
    public final mpe0 v;
    public final mpe0 w;

    /* JADX WARN: Illegal instructions before constructor call */
    public mw70(fid0 fid0Var, a aVar, dw70 dw70Var) {
        ConstraintLayout constraintLayout = fid0Var.a;
        super(constraintLayout);
        this.a = fid0Var;
        this.b = aVar;
        this.c = dw70Var;
        Context context = constraintLayout.getContext();
        context.getClass();
        this.d = context;
        List<OutcomeButton> listK = b.k(fid0Var.A, fid0Var.B, fid0Var.C, fid0Var.D);
        this.e = listK;
        this.f = new ArrayList();
        int i = 3;
        this.i = hwr.b(new sub(this, i));
        this.v = hwr.b(new swu(this, 1));
        mpe0 mpe0VarB = hwr.b(new g13(this, i));
        this.w = mpe0VarB;
        b3.H(fid0Var.V, R.color.text_type2_tertiary);
        fid0Var.E.setRowCount(2);
        ListenableSpinner listenableSpinner = fid0Var.G;
        listenableSpinner.setAdapter((SpinnerAdapter) mpe0VarB.getValue());
        u8z u8zVar = (u8z) mpe0VarB.getValue();
        kw70 kw70Var = new kw70(this);
        u8zVar.getClass();
        u8zVar.f = kw70Var;
        listenableSpinner.setOnItemSelectedListener(new lw70(fid0Var, this));
        for (final OutcomeButton outcomeButton : listK) {
            outcomeButton.setOnClickListener(new View.OnClickListener() { // from class: iw70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OutcomeButton outcomeButton2 = outcomeButton;
                    outcomeButton2.getClass();
                    this.a.e(outcomeButton2);
                }
            });
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: jw70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lmg lmgVar;
                Object tag = view.getTag();
                Event event = tag instanceof Event ? (Event) tag : null;
                if (event == null || (lmgVar = this.a.b) == null) {
                    return;
                }
                lmgVar.b(event);
            }
        });
    }

    public static void c(OutcomeButton outcomeButton) {
        outcomeButton.setTextOnAndOff(zch0.h(outcomeButton.getContext()));
        outcomeButton.setTag(null);
        outcomeButton.setChecked(false);
        outcomeButton.setEnabled(false);
    }

    public static Activity d(Context context) {
        do {
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                return activity;
            }
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        } while (context != null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:57:0x0186  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(Event event, SearchLiveEventMeta searchLiveEventMeta, int i) {
        Market market;
        Object next;
        event.getClass();
        searchLiveEventMeta.getClass();
        RegularMarketRule marketRule = searchLiveEventMeta.getMarketRule();
        if (marketRule == null) {
            return;
        }
        String str = marketRule.a;
        fid0 fid0Var = this.a;
        OutcomeButton outcomeButton = fid0Var.I;
        ListenableSpinner listenableSpinner = fid0Var.G;
        outcomeButton.setVisibility(8);
        if (marketRule.c) {
            ArrayList arrayListD = gjs.d(event, str);
            ArrayList arrayListE = gjs.e(arrayListD);
            mpe0 mpe0Var = this.w;
            ((u8z) mpe0Var.getValue()).f(event, arrayListD);
            ((u8z) mpe0Var.getValue()).clear();
            ((u8z) mpe0Var.getValue()).addAll(tru.i(arrayListE));
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SEARCH_RESULT);
            aVar.a("[bindView] get market list: %s, eventId: %s", arrayListE.toString(), event.eventId);
            listenableSpinner.setVisibility(0);
            listenableSpinner.setEnabled(!arrayListD.isEmpty());
            if (!listenableSpinner.isEnabled()) {
                c(outcomeButton);
                outcomeButton.setVisibility(0);
            }
            str.getClass();
            dw70 dw70Var = this.c;
            dw70Var.getClass();
            listenableSpinner.setSelection(Math.max(arrayListE.indexOf(event.getSelectedSpecifier(str, dw70Var.a.b.e(str))), 0), false);
            listenableSpinner.setTag(R.id.live_event_pos, Integer.valueOf(i));
            listenableSpinner.setTag(R.id.live_event_specifiers, arrayListE);
            listenableSpinner.setTag(R.id.spinner_prev_selected_pos, Integer.valueOf(listenableSpinner.getSelectedItemPosition()));
            if (arrayListD.isEmpty() || listenableSpinner.getSelectedItemPosition() < 0) {
                market = null;
            } else {
                market = (Market) arrayListD.get(listenableSpinner.getSelectedItemPosition());
            }
        } else {
            listenableSpinner.setVisibility(8);
            market = (Market) cw70.f.get(event);
            if (market == null) {
                List<Market> list = event.markets;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.g(str, ((Market) next).id));
                    Market market2 = (Market) next;
                    if (market2 != null) {
                        cw70.f.put(event, market2);
                        market = market2;
                    } else {
                        market = null;
                    }
                } else {
                    market = null;
                }
            }
        }
        String[] strArr = marketRule.d;
        strArr.getClass();
        int length = strArr.length;
        List<OutcomeButton> list2 = this.e;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 < length) {
                OutcomeButton outcomeButton2 = list2.get(i2);
                outcomeButton2.getClass();
                OutcomeButton outcomeButton3 = outcomeButton2;
                outcomeButton3.setVisibility(0);
                if ((market != null ? market.outcomes : null) == null || i2 >= market.outcomes.size()) {
                    c(outcomeButton3);
                } else {
                    Outcome outcome = market.outcomes.get(i2);
                    if (market.status == 0 && outcome.isActive == 1) {
                        String str2 = outcome.odds;
                        str2.getClass();
                        if (StringsKt.U(str2)) {
                            c(outcomeButton3);
                            outcome.flag = 0;
                        } else {
                            outcomeButton3.setTag(new Selection(event, market, outcome));
                            String str3 = outcome.odds;
                            str3.getClass();
                            outcomeButton3.setOdds(str3);
                            outcomeButton3.setChecked(iu2.n(event, market, outcome));
                            outcomeButton3.setEnabled(true);
                            cw70.i.add(outcomeButton3);
                            int i3 = outcome.flag;
                            if (i3 == 1) {
                                outcomeButton3.g();
                            } else if (i3 == 2) {
                                outcomeButton3.c();
                            }
                            if (outcome.flag != 0) {
                                this.f.add(outcomeButton3);
                            }
                            outcome.flag = 0;
                        }
                    } else {
                        c(outcomeButton3);
                        outcome.flag = 0;
                    }
                }
            } else {
                OutcomeButton outcomeButton4 = list2.get(i2);
                outcomeButton4.getClass();
                outcomeButton4.setVisibility(8);
            }
        }
    }

    public final TextView b(int i, String str) {
        TextView textView = new TextView(this.d);
        textView.setMinWidth(((Number) this.i.getValue()).intValue());
        textView.setText(str);
        textView.setTextSize(12.0f);
        textView.setTextColor((i < 0 || i >= 2) ? ((Number) this.v.getValue()).intValue() : -1);
        return textView;
    }

    public final void e(OutcomeButton outcomeButton) {
        Object tag = outcomeButton.getTag();
        Selection selection = tag instanceof Selection ? (Selection) tag : null;
        if (selection == null) {
            return;
        }
        boolean zIsChecked = outcomeButton.isChecked();
        boolean zT = iu2.t(selection.a, selection.b, selection.c, outcomeButton.isChecked(), false, null, 16368);
        if (!zT) {
            outcomeButton.setChecked(false);
            boolean zM = kni0.m();
            Context context = this.d;
            if (zM) {
                iu2.r(d(context));
            } else {
                if (iu2.l()) {
                    qz3.p(d(context));
                }
                if (iu2.f(selection)) {
                    qz3.m(d(context));
                }
            }
        }
        lmg lmgVar = this.b;
        if (lmgVar != null) {
            lmgVar.c(selection, zIsChecked, zT);
        }
        if (iu2.p() && outcomeButton.isChecked() && !iu2.o(selection)) {
            Context context2 = outcomeButton.getContext();
            context2.getClass();
            iu2.e(d(context2), selection);
        }
    }
}
