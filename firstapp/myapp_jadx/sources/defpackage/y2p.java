package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.gridlayout.widget.GridLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.event.LiveTimerTextView;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.LiveEventData;
import com.sportybet.plugin.realsports.prematch.data.SpinnerMeta;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class y2p extends e64<fid0> {
    public final LiveEventData d;
    public final int e = bqe.a(7.0f);
    public final int f = bqe.a(17.0f);
    public u8z i;
    public List<OutcomeButton> v;

    public y2p(LiveEventData liveEventData) {
        this.d = liveEventData;
    }

    public static TextView k(Context context, int i, String str, int i2, int i3) {
        TextView textView = new TextView(context);
        textView.setMinWidth(i);
        textView.setText(str);
        textView.setTextSize(12.0f);
        if (i2 >= 0 && i2 < 2) {
            i3 = -1;
        }
        textView.setTextColor(i3);
        return textView;
    }

    public static void l(OutcomeButton outcomeButton) {
        outcomeButton.setTextOnAndOff(zch0.h(outcomeButton.getContext()));
        outcomeButton.setTag(null);
        outcomeButton.setChecked(false);
        outcomeButton.setEnabled(false);
    }

    /* JADX WARN: Code duplicated, block: B:157:0x0492  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.Object] */
    @Override // defpackage.e64
    public final void f(g6i0 g6i0Var, int i) throws Throwable {
        Throwable th;
        T t;
        Object objPrevious;
        Object bVar;
        Category category;
        Tournament tournament;
        Category category2;
        fid0 fid0Var = (fid0) g6i0Var;
        fid0Var.getClass();
        ConstraintLayout constraintLayout = fid0Var.a;
        ImageView imageView = fid0Var.F;
        ImageView imageView2 = fid0Var.z;
        AppCompatImageView appCompatImageView = fid0Var.N;
        LiveEventData liveEventData = this.d;
        constraintLayout.setTag(liveEventData.getEvent());
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: s2p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object tag = view.getTag();
                if (!(tag instanceof Event)) {
                    tag = null;
                }
                Event event = (Event) tag;
                if (event != null) {
                    this.a.d.getListener().b(event);
                }
            }
        });
        fid0Var.O.setText(liveEventData.getEvent().homeTeamName);
        fid0Var.P.setText(liveEventData.getEvent().awayTeamName);
        TextView textView = fid0Var.V;
        b3.H(textView, R.color.text_type2_tertiary);
        Event event = liveEventData.getEvent();
        liveEventData.getSelectedMarket();
        textView.setText(b3.M(event));
        TextView textView2 = fid0Var.c;
        if (liveEventData.getEvent().commentsNum > 0) {
            Context context = textView2.getContext();
            context.getClass();
            textView2.setText(sn5.b(context, R.string.live__chat_count, String.valueOf(Math.min(liveEventData.getEvent().commentsNum, 999))));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        LiveTimerTextView liveTimerTextView = fid0Var.Q;
        mfb0 sport = liveEventData.getSport();
        String str = liveEventData.getEvent().playedSeconds;
        String str2 = liveEventData.getEvent().period;
        liveTimerTextView.setText(sport.p(str, liveEventData.getEvent().remainingTimeInPeriod, liveEventData.getEvent().matchStatus));
        TextView textView3 = fid0Var.i;
        Context context2 = constraintLayout.getContext();
        context2.getClass();
        Sport sport2 = liveEventData.getEvent().sport;
        Throwable th2 = null;
        String str3 = (sport2 == null || (category2 = sport2.category) == null) ? null : category2.name;
        Sport sport3 = liveEventData.getEvent().sport;
        textView3.setText(sn5.b(context2, R.string.app_common__league_title, str3, (sport3 == null || (category = sport3.category) == null || (tournament = category.tournament) == null) ? null : tournament.name));
        boolean zA = nkd0.a.a.a(liveEventData.getEvent());
        Context context3 = imageView.getContext();
        context3.getClass();
        imageView.setImageDrawable(gug0.e(context3));
        imageView.setVisibility(zA ? 0 : 8);
        if (Intrinsics.g(liveEventData.getSport().getId(), "sr:sport:202120001")) {
            imageView2.setVisibility(liveEventData.getEvent().showLiveTracker() ? 0 : 8);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: t2p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveEventData liveEventData2 = this.a.d;
                    liveEventData2.getListener().c(liveEventData2.getEvent());
                }
            });
            appCompatImageView.setVisibility(8);
            appCompatImageView.setOnClickListener(null);
        } else {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(null);
            appCompatImageView.setVisibility(liveEventData.getEvent().showStats() ? 0 : 8);
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: u2p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveEventData liveEventData2 = this.a.d;
                    liveEventData2.getListener().a(liveEventData2.getEvent());
                }
            });
        }
        ImageView imageView3 = fid0Var.b;
        Context context4 = imageView3.getContext();
        context4.getClass();
        imageView3.setImageDrawable(gug0.a(context4));
        if (liveEventData.getShowBoost()) {
            imageView3.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                int i2 = this.e;
                layoutParams2.setMargins(-(zA ? i2 : this.f), i2, 0, 0);
                imageView3.setLayoutParams(layoutParams2);
            }
        } else {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = fid0Var.f;
        imageView4.setVisibility(liveEventData.getEvent().topTeam ? 0 : 8);
        Context context5 = imageView4.getContext();
        context5.getClass();
        imageView4.setImageDrawable(gug0.f(context5));
        ImageView imageView5 = fid0Var.v;
        imageView5.setVisibility(b3.S(liveEventData.getEvent().eventId) ? 0 : 8);
        Context context6 = imageView5.getContext();
        context6.getClass();
        imageView5.setImageDrawable(gug0.g(context6));
        fid0Var.M.setVisibility(liveEventData.getEvent().hasLiveStream() ? 0 : 8);
        fid0Var.L.setVisibility(liveEventData.getEvent().hasGift() ? 0 : 8);
        ArrayList arrayListA = liveEventData.getSport().A(liveEventData.getEvent().setScore, liveEventData.getEvent().pointScore, liveEventData.getEvent().gameScore);
        GridLayout gridLayout = fid0Var.E;
        gridLayout.removeAllViews();
        gridLayout.setRowCount(2);
        gridLayout.setColumnCount(arrayListA.size() / 2);
        int dimensionPixelSize = gridLayout.getContext().getResources().getDimensionPixelSize(R.dimen.spr_score_min_width);
        int color = gridLayout.getContext().getColor(R.color.spr_gray3);
        int iA = sbz.a(0, arrayListA.size() - 1, 2);
        if (iA >= 0) {
            int i3 = 0;
            while (true) {
                Context context7 = gridLayout.getContext();
                context7.getClass();
                Object obj = arrayListA.get(i3);
                obj.getClass();
                gridLayout.addView(k(context7, dimensionPixelSize, (String) obj, i3, color));
                if (i3 == iA) {
                    break;
                } else {
                    i3 += 2;
                }
            }
        }
        c cVarL = f.l(2, f.n(1, arrayListA.size()));
        int i4 = cVarL.a;
        int i5 = cVarL.b;
        int i6 = cVarL.c;
        if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
            while (true) {
                Context context8 = gridLayout.getContext();
                context8.getClass();
                Object obj2 = arrayListA.get(i4);
                obj2.getClass();
                th = th2;
                gridLayout.addView(k(context8, dimensionPixelSize, (String) obj2, i4, color));
                if (i4 == i5) {
                    break;
                }
                i4 += i6;
                th2 = th;
            }
        } else {
            th = null;
        }
        List<OutcomeButton> listK = b.k(fid0Var.A, fid0Var.B, fid0Var.C, fid0Var.D);
        for (final OutcomeButton outcomeButton : listK) {
            outcomeButton.setOnClickListener(new View.OnClickListener() { // from class: v2p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OutcomeButton outcomeButton2 = outcomeButton;
                    outcomeButton2.getClass();
                    this.a.m(outcomeButton2);
                }
            });
        }
        this.v = listK;
        dq40 dq40Var = new dq40();
        OutcomeButton outcomeButton2 = fid0Var.I;
        ListenableSpinner listenableSpinner = fid0Var.G;
        outcomeButton2.setVisibility(8);
        if (liveEventData.getSelectedMarket().c) {
            ArrayList arrayListD = gjs.d(liveEventData.getEvent(), liveEventData.getSelectedMarket().a);
            ArrayList arrayListE = gjs.e(arrayListD);
            try {
                zi50.a aVar = zi50.b;
                u8z u8zVar = this.i;
                if (u8zVar == null) {
                    u8zVar = new u8z(listenableSpinner, fid0Var.H, new ArrayList(), true);
                    this.i = u8zVar;
                }
                u8zVar.f = new w2p(this);
                listenableSpinner.setOnItemSelectedListener(new x2p(fid0Var, this));
                u8z u8zVar2 = this.i;
                if (u8zVar2 != null) {
                    u8zVar2.f(liveEventData.getEvent(), arrayListD);
                }
                u8z u8zVar3 = this.i;
                if (u8zVar3 != null) {
                    u8zVar3.clear();
                }
                u8z u8zVar4 = this.i;
                if (u8zVar4 != null) {
                    u8zVar4.addAll(tru.i(arrayListE));
                    bVar = Unit.a;
                } else {
                    bVar = th;
                }
            } catch (Throwable th3) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th3);
            }
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar3 = itf0.a;
                aVar3.a(e40.a(aVar3, "ItemLiveSectionEvent", "[bindOutcomes] : ", thA), new Object[0]);
            }
            listenableSpinner.setVisibility(0);
            listenableSpinner.setAdapter((SpinnerAdapter) this.i);
            listenableSpinner.setEnabled(!arrayListD.isEmpty());
            if (!listenableSpinner.isEnabled()) {
                l(outcomeButton2);
                outcomeButton2.setVisibility(0);
            }
            Event event2 = liveEventData.getEvent();
            String str4 = liveEventData.getSelectedMarket().a;
            bts listener = liveEventData.getListener();
            String str5 = liveEventData.getSelectedMarket().a;
            str5.getClass();
            listenableSpinner.setSelection(Math.max(arrayListE.indexOf(event2.getSelectedSpecifier(str4, listener.e(str5))), 0), false);
            int selectedItemPosition = listenableSpinner.getSelectedItemPosition();
            String str6 = liveEventData.getEvent().eventId;
            str6.getClass();
            listenableSpinner.setTag(new SpinnerMeta(selectedItemPosition, str6, i, arrayListE));
            int size = arrayListD.size();
            int selectedItemPosition2 = listenableSpinner.getSelectedItemPosition();
            if (selectedItemPosition2 >= 0 && selectedItemPosition2 < size) {
                dq40Var.a = arrayListD.get(listenableSpinner.getSelectedItemPosition());
            }
        } else {
            listenableSpinner.setVisibility(8);
            List<Market> list = liveEventData.getEvent().markets;
            if (list != null) {
                ListIterator<Market> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = th;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    Market market = (Market) objPrevious;
                    if (Intrinsics.g(market.id, liveEventData.getSelectedMarket().a) && market.status == 0) {
                        break;
                    }
                }
                t = (Market) objPrevious;
            } else {
                t = th;
            }
            dq40Var.a = t;
        }
        Market market2 = (Market) dq40Var.a;
        int length = liveEventData.getSelectedMarket().d.length;
        List<OutcomeButton> list2 = this.v;
        if (list2 != null) {
            int i7 = 0;
            for (Object obj3 : list2) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    b.q();
                    throw th;
                }
                OutcomeButton outcomeButton3 = (OutcomeButton) obj3;
                if (i7 < length) {
                    c8i0.n(outcomeButton3);
                    if ((market2 != null ? market2.outcomes : th) == null || i7 >= market2.outcomes.size()) {
                        l(outcomeButton3);
                    } else {
                        Outcome outcome = market2.outcomes.get(i7);
                        if (market2.status == 0 && outcome.isActive == 1) {
                            String str7 = outcome.odds;
                            str7.getClass();
                            if (StringsKt.U(str7)) {
                                l(outcomeButton3);
                                outcome.flag = 0;
                            } else {
                                outcomeButton3.setTag(new Selection(liveEventData.getEvent(), market2, outcome));
                                String str8 = outcome.odds;
                                str8.getClass();
                                outcomeButton3.setOdds(str8);
                                outcomeButton3.setChecked(iu2.n(liveEventData.getEvent(), market2, outcome));
                                outcomeButton3.setEnabled(true);
                                PreMatchSportActivity.c0.add(outcomeButton3);
                                int i9 = outcome.flag;
                                if (i9 == 1) {
                                    outcomeButton3.g();
                                } else if (i9 == 2) {
                                    outcomeButton3.c();
                                }
                                outcome.flag = 0;
                            }
                        } else {
                            l(outcomeButton3);
                            outcome.flag = 0;
                        }
                    }
                } else {
                    c8i0.f(outcomeButton3);
                }
                i7 = i8;
            }
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.e64
    public final int h() {
        return R.layout.spr_live_item;
    }

    @Override // defpackage.e64
    public final g6i0 i(View view) {
        view.getClass();
        return fid0.a(view);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    public final void m(OutcomeButton outcomeButton) {
        Object tag = outcomeButton.getTag();
        if (!(tag instanceof Selection)) {
            tag = null;
        }
        Selection selection = (Selection) tag;
        if (selection == null) {
            return;
        }
        this.d.getListener().d(selection, outcomeButton.isChecked());
        Context context = outcomeButton.getContext();
        context.getClass();
        if (!iu2.t(selection.a, selection.b, selection.c, outcomeButton.isChecked(), false, null, 16368)) {
            outcomeButton.setChecked(false);
            if (kni0.m()) {
                iu2.r(wc.b(context));
            } else {
                if (iu2.l()) {
                    qz3.p(wc.b(context));
                }
                if (iu2.f(selection)) {
                    qz3.m(wc.b(context));
                } else {
                    Event event = selection.a;
                    event.getClass();
                    if (iu2.g(event)) {
                        qz3.m(wc.b(context));
                    }
                }
            }
        }
        if (iu2.p() && outcomeButton.isChecked() && !iu2.o(selection)) {
            Context context2 = outcomeButton.getContext();
            context2.getClass();
            iu2.e(wc.b(context2), selection);
        }
    }
}
