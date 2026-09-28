package com.sportybet.plugin.realsports.event.viewholder;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import com.sportybet.plugin.realsports.widget.OutcomeView;
import defpackage.apg;
import defpackage.bjb0;
import defpackage.c2p;
import defpackage.d9f0;
import defpackage.f00;
import defpackage.fqu;
import defpackage.gr0;
import defpackage.h5e;
import defpackage.hb5;
import defpackage.hp0;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.iwh0;
import defpackage.kni0;
import defpackage.mfb0;
import defpackage.nni0;
import defpackage.o0b;
import defpackage.oni0;
import defpackage.qz3;
import defpackage.s6b;
import defpackage.sh8;
import defpackage.th50;
import defpackage.tru;
import defpackage.vgb0;
import defpackage.vpu;
import defpackage.w1k;
import defpackage.wga;
import defpackage.z78;
import defpackage.z7z;
import defpackage.zch0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public abstract class VisibleMarketViewHolder extends ViewHolder {
    private static final int OUTCOME_PADDING = zch0.a(hp0.A, 9);
    protected a callback;
    protected z78 combinedMarkets;
    protected Context ctx;
    protected Event event;
    protected b layoutConfig;
    protected final int leftMargin;
    protected Market market;
    private final LinkedList<OutcomeView> outcomeViewsToResetFlag;
    protected final Set<String> outcomesInVerticalOrientation;
    protected final int padding;
    protected mfb0 sportRule;
    protected final int topMargin;

    public interface a {
        boolean A(Market market);

        boolean B();

        void C(Market market, int i);

        List<Map<String, String>> D();

        d9f0 E(String str);

        void F(Market market, int i);

        boolean G(Outcome outcome);

        void a(String str, d9f0 d9f0Var);

        boolean b();

        void c(String str, String str2, int i);

        int d(String str, String str2);

        boolean e(Selection selection);

        void f(Event event, Market market, z7z z7zVar);

        z7z g(Event event, Market market, Outcome outcome);

        boolean h(Market market, String str);

        Market i(List<Market> list);

        void j(View view, boolean z, Selection selection);

        List<List<Outcome>> k(List<List<Outcome>> list, String str, int i);

        void l(Market market, s6b s6bVar, int i);

        boolean m(Market market);

        boolean n();

        void o(Market market);

        String p(Market market);

        void q(Market market);

        List r(String str, ArrayList arrayList);

        boolean s(Market market);

        void t(Market market, int i);

        boolean u(Market market);

        mfb0 v();

        boolean w();

        boolean x(Market market);

        boolean y(Market market);

        Event z();
    }

    public static class b {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        public static Drawable a(Context context, boolean z) {
            return iwh0.a(context, R.drawable.spr_ic_grade_yellow_16dp, Color.parseColor(z ? "#ffb404" : "#9ca0ab"));
        }
    }

    public VisibleMarketViewHolder(View view, a aVar, Set<String> set) {
        super(view);
        this.outcomeViewsToResetFlag = new LinkedList<>();
        this.callback = aVar;
        this.leftMargin = view.getResources().getDimensionPixelSize(R.dimen.spr_cell_left);
        this.topMargin = view.getResources().getDimensionPixelSize(R.dimen.spr_cell_top);
        this.padding = view.getResources().getDimensionPixelSize(R.dimen.spr_cell_padding);
        this.outcomesInVerticalOrientation = set;
    }

    private void addSelection(OutcomeButton outcomeButton, Selection selection) {
        if (selection != null) {
            Outcome outcome = selection.c;
            Market market = selection.b;
            Event event = selection.a;
            if (iu2.s(event, market, outcome, outcomeButton.isChecked())) {
                return;
            }
            outcomeButton.setChecked(false);
            if (kni0.m()) {
                iu2.r(outcomeButton.getContext());
                return;
            }
            if (iu2.l()) {
                qz3.p(outcomeButton.getContext());
                return;
            }
            if (iu2.f(selection) || iu2.g(event)) {
                qz3.m(outcomeButton.getContext());
            } else if (iu2.h(event, market, outcome)) {
                qz3.o(outcomeButton.getContext());
            }
        }
    }

    private b getLayoutConfig(boolean z) {
        b bVar = new b();
        bVar.a = z ? -1 : this.ctx.getColor(R.color.text_type1_tertiary);
        bVar.b = this.ctx.getColor(z ? R.color.text_type2_tertiary : R.color.text_type1_secondary);
        bVar.c = z ? R.drawable.spr_bg_live : R.drawable.spr_bg_gray;
        bVar.d = this.ctx.getColor(z ? R.color.brand_secondary_disable : R.color.text_type1_primary);
        bVar.e = this.ctx.getColor(z ? R.color.custom_background_type2_secondary_type1 : R.color.background_type1_tertiary);
        bVar.f = z ? R.color.text_color_custom_brand_secondary_variable_type3_type2_with_absolute_type1 : R.color.text_color_custom_brand_secondary_variable_type2_type3_with_brand_tertiary;
        bVar.g = z ? R.drawable.bg_filled_custom_brand_secondary_variable_type1_opacity_type1_with_brand_quinary : R.drawable.bg_filled_brand_secondary_variable_type1_with_brand_secondary;
        bVar.h = z ? -1 : this.ctx.getColor(R.color.text_type1_primary);
        return bVar;
    }

    public static boolean isBoostEvent(Event event, Market market, List<Map<String, String>> list, boolean z) {
        Category category;
        Sport sport = event.sport;
        if (sport == null || (category = sport.category) == null || category.tournament == null || list == null) {
            return false;
        }
        for (Map<String, String> map : list) {
            if (map != null && matchString(map.get("tournamentId"), event.sport.category.tournament.id) && matchString(map.get("marketId"), market.id) && matchString(map.get("productId"), String.valueOf(market.product)) && (!z || matchString(map.get("specifier"), market.specifier))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$showBoreDrawInfo$0(View view, MotionEvent motionEvent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showBoreDrawInfo$1(PopupWindow popupWindow) {
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
    }

    private static boolean matchString(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && str.equals(str2);
    }

    private void onToggleOutcome(View view, boolean z, Selection selection) {
        this.callback.j(view, z, selection);
        f00 f00Var = vgb0.a;
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("type", selection.b.isLive() ? "live" : "prematch")};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (w1k.a(key, entry, map, key) != null) {
            hb5.a(wga.a(key, "duplicate key: "));
            return;
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        mapUnmodifiableMap.getClass();
        vgb0.c("Select_IN_Event", mapUnmodifiableMap, false);
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.ViewHolder
    public final void bind(c2p c2pVar) {
        boolean z = c2pVar instanceof fqu;
        if (z || (c2pVar instanceof z78)) {
            Context context = this.itemView.getContext();
            this.ctx = context;
            if (context == null) {
                return;
            }
            if (z) {
                Market market = ((fqu) c2pVar).a;
                this.market = market;
                this.layoutConfig = getLayoutConfig(market.isLive());
            } else {
                z78 z78Var = (z78) c2pVar;
                this.combinedMarkets = z78Var;
                this.layoutConfig = getLayoutConfig(((Boolean) z78Var.b.stream().findFirst().map(new nni0()).orElse(Boolean.FALSE)).booleanValue());
            }
            a aVar = this.callback;
            if (aVar == null) {
                return;
            }
            Event eventZ = aVar.z();
            this.event = eventZ;
            if (eventZ == null) {
                return;
            }
            mfb0 mfb0VarV = this.callback.v();
            this.sportRule = mfb0VarV;
            if (mfb0VarV == null) {
                return;
            }
            onBindView();
        }
    }

    public final OutcomeView createJokerOutcomeView(Context context, b bVar, Event event, Market market, Outcome outcome, boolean z, View.OnClickListener onClickListener) {
        OutcomeView outcomeView = new OutcomeView(context);
        itf0.a.d("createJokerOutcomeView", new Object[0]);
        outcomeView.setTextSize(12.0f, 14.0f);
        outcomeView.setBg(bVar.g, market.isLive() ? R.drawable.bg_filled_brand_quinary : R.drawable.bg_filled_brand_secondary_plain, market.isLive() ? R.drawable.bg_filled_background_disable_type2_primary : R.drawable.bg_filled_custom_brand_secondary_disable);
        outcomeView.setTextColor(o0b.b(context, bVar.f));
        outcomeView.setButtonFullWidth(false, true);
        OutcomeButton outcomeButton = outcomeView.ob1;
        OutcomeButton outcomeButton2 = outcomeView.ob2;
        outcomeButton2.setGravity(17);
        Selection selection = new Selection(apg.f(event), market, outcome);
        if (market.status != 0 || outcome.isActive != 1 || TextUtils.isEmpty(outcome.odds)) {
            outcomeButton.setImage(R.drawable.ic_joker_16dp, true);
            outcomeButton2.setTextOnAndOff(zch0.h(context));
            outcomeView.setTag(null);
            outcomeView.setChecked(false);
            outcomeView.setEnabled(false);
            outcomeView.setOnClickListener(null);
            return outcomeView;
        }
        outcomeButton.setImage(R.drawable.ic_joker_16dp, true);
        outcomeButton2.setOdds(outcome.odds);
        outcomeButton2.getContext();
        HashSet hashSet = tru.a;
        outcomeButton2.setContentDescription(vpu.f(outcome, market.desc));
        outcomeView.setTag(selection);
        outcomeView.setChecked(this.callback.e(selection));
        outcomeView.setOnClickListener(onClickListener);
        if (z) {
            outcomeView.getShimmer().setVisibility(0);
            outcomeView.getShimmer().a();
        }
        if (!outcomeView.com.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_IS_CHECKED java.lang.String) {
            boolean zH = this.callback.h(market, outcome.id);
            outcomeView.setEnabled(zH);
            if (zH) {
                outcomeView.setHighlighted(this.callback.G(outcome));
            }
        }
        return outcomeView;
    }

    public final OutcomeButton createOutcomeButton(Context context, b bVar, Event event, mfb0 mfb0Var, Market market, Outcome outcome, boolean z, View.OnClickListener onClickListener) {
        OutcomeButton outcomeButton = new OutcomeButton(context);
        stylizeOutcomeButton(outcomeButton, bVar, event, mfb0Var, market, outcome, z, onClickListener);
        return outcomeButton;
    }

    public final OutcomeView createOutcomeView(Context context, b bVar, Event event, mfb0 mfb0Var, Market market, Outcome outcome, boolean z, View.OnClickListener onClickListener, OutcomeView.a aVar, boolean z2) {
        OutcomeView outcomeView = new OutcomeView(context, z2);
        outcomeView.setListener(aVar);
        outcomeView.setTextSize(12.0f, 14.0f);
        outcomeView.setBg(bVar.g, market.isLive() ? R.drawable.bg_filled_brand_quinary : R.drawable.bg_filled_brand_secondary_plain, market.isLive() ? R.drawable.bg_filled_background_disable_type2_primary : R.drawable.bg_filled_custom_brand_secondary_disable);
        outcomeView.setTextColor(th50.a(bVar.f, context.getTheme(), context.getResources()));
        OutcomeButton outcomeButton = outcomeView.ob1;
        OutcomeButton outcomeButton2 = outcomeView.ob2;
        if (z) {
            outcomeButton.setTextColor(th50.a(market.isLive() ? R.color.spr_toggle_txt_default_live : R.color.spr_toggle_txt_default, context.getTheme(), context.getResources()));
        }
        Selection selection = new Selection(apg.f(event), market, outcome);
        if (market.status != 0 || outcome.isActive != 1 || TextUtils.isEmpty(outcome.odds)) {
            outcomeButton.setTextOnAndOff(z ? tru.d(mfb0Var, market.id, outcome) : outcome.desc);
            outcomeButton2.setImage(R.drawable.spr_ic_prematch_lock, false);
            outcomeView.setTag(null);
            outcomeView.setChecked(false);
            outcomeView.setEnabled(false);
            outcomeView.setOnClickListener(null);
            return outcomeView;
        }
        outcomeButton.setTextOnAndOff(z ? tru.d(mfb0Var, market.id, outcome) : outcome.desc);
        outcomeButton2.setOdds(outcome.odds);
        outcomeButton2.setContentDescription(vpu.f(outcome, tru.c(market, z, mfb0Var, outcomeButton2.getContext())));
        outcomeView.setTag(selection);
        outcomeView.setChecked(this.callback.e(selection));
        outcomeView.setOnClickListener(onClickListener);
        if (!outcomeView.com.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_IS_CHECKED java.lang.String) {
            boolean zH = this.callback.h(market, outcome.id);
            outcomeView.setEnabled(zH);
            if (zH) {
                outcomeView.setHighlighted(this.callback.G(outcome));
            }
        }
        return outcomeView;
    }

    public Drawable getCollapsedStatusDrawable(boolean z) {
        Drawable drawableA = gr0.a(this.ctx, z ? R.drawable.spr_ic_arrow_right_black_24dp : R.drawable.spr_ic_arrow_drop_down_black_24dp);
        drawableA.setTint(this.ctx.getColor(R.color.brand_secondary_variable_type3));
        return drawableA;
    }

    public Event getEvent() {
        return this.event;
    }

    public Market getMarket() {
        return this.market;
    }

    public abstract void onBindView();

    public void onOutcomeButtonClick(OutcomeButton outcomeButton) {
        Selection selection = (Selection) outcomeButton.getTag();
        if (!this.callback.w()) {
            addSelection(outcomeButton, selection);
            if (iu2.p() && outcomeButton.isChecked() && !iu2.o(selection)) {
                iu2.e(outcomeButton.getContext(), selection);
            }
        }
        onToggleOutcome(outcomeButton, outcomeButton.isChecked(), selection);
    }

    public void onOutcomeViewClick(OutcomeView outcomeView) {
        outcomeView.setChecked(!outcomeView.com.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_IS_CHECKED java.lang.String);
        Selection selection = (Selection) outcomeView.getTag();
        if (!this.callback.w()) {
            addSelection(outcomeView, selection);
            if (iu2.p() && outcomeView.com.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_IS_CHECKED java.lang.String && !iu2.o(selection)) {
                iu2.e(outcomeView.getContext(), selection);
            }
        }
        onToggleOutcome(outcomeView, outcomeView.com.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_IS_CHECKED java.lang.String, selection);
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.ViewHolder
    public void onViewRecycled() {
        while (!this.outcomeViewsToResetFlag.isEmpty()) {
            this.outcomeViewsToResetFlag.removeFirst().E();
        }
    }

    public void openOddsBoostPage() {
        sh8.c().e(bjb0.S("/m/promotions/content/live-odds-boost"));
    }

    public void refreshOddsChangedFlag(OutcomeView outcomeView, Outcome outcome) {
        int i = outcome.flag;
        if (i == 1) {
            outcomeView.getOb2().g();
            this.outcomeViewsToResetFlag.add(outcomeView);
            outcome.flag = 0;
        } else if (i == 2) {
            outcomeView.getOb2().c();
            this.outcomeViewsToResetFlag.add(outcomeView);
            outcome.flag = 0;
        }
    }

    public void showBoreDrawInfo(AppCompatImageView appCompatImageView) {
        try {
            View viewInflate = LayoutInflater.from(this.ctx).inflate(R.layout.layout_bore_draw_tip, (ViewGroup) null, false);
            TextView textView = (TextView) h5e.a(R.id.bore_draw_tip, viewInflate);
            if (textView == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.bore_draw_tip)));
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            final PopupWindow popupWindow = new PopupWindow((View) constraintLayout, -2, -2, true);
            popupWindow.setTouchable(true);
            popupWindow.setTouchInterceptor(new oni0());
            int[] iArr = new int[2];
            appCompatImageView.getLocationOnScreen(iArr);
            popupWindow.showAtLocation(appCompatImageView, 0, Math.round((-textView.getPaint().measureText(textView.getText().toString())) * 0.5f), iArr[1] + appCompatImageView.getHeight());
            constraintLayout.postDelayed(new Runnable() { // from class: pni0
                @Override // java.lang.Runnable
                public final void run() {
                    VisibleMarketViewHolder.lambda$showBoreDrawInfo$1(popupWindow);
                }
            }, 5000L);
        } catch (Throwable th) {
            itf0.a.d("PopupWindow error: %s", th.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    public final OutcomeButton stylizeOutcomeButton(OutcomeButton outcomeButton, b bVar, Event event, mfb0 mfb0Var, Market market, Outcome outcome, boolean z, View.OnClickListener onClickListener) {
        CharSequence charSequence;
        outcomeButton.setTextSize(14.0f);
        int i = OUTCOME_PADDING;
        outcomeButton.setPadding(0, i, 0, i);
        outcomeButton.setBackgroundResource(bVar.g);
        outcomeButton.setTextColor(o0b.b(outcomeButton.getContext(), bVar.f));
        Selection selection = new Selection(apg.f(event), market, outcome);
        if (outcome == null || market.status != 0 || outcome.isActive != 1 || TextUtils.isEmpty(outcome.odds)) {
            outcomeButton.setTag(null);
            outcomeButton.setImage(R.drawable.spr_ic_prematch_lock, false);
            outcomeButton.setChecked(false);
            outcomeButton.setEnabled(false);
            outcomeButton.setOnClickListener(null);
            return outcomeButton;
        }
        outcomeButton.setTag(selection);
        outcomeButton.setContentDescription(vpu.f(outcome, tru.c(market, z, mfb0Var, outcomeButton.getContext())));
        if (z) {
            String str = market.id;
            if (mfb0Var.m(str) || mfb0Var.i(str)) {
                try {
                    String[] strArrSplit = outcome.desc.split("\\s+");
                    if (strArrSplit.length > 1) {
                        charSequence = strArrSplit[1] + " " + outcome.odds;
                    } else {
                        charSequence = outcome.odds;
                    }
                } catch (Exception unused) {
                }
            } else {
                charSequence = outcome.odds;
            }
            outcomeButton.setOdds(charSequence);
        } else {
            outcomeButton.setOdds(outcome.odds);
        }
        outcomeButton.setChecked(this.callback.e(selection));
        outcomeButton.setOnClickListener(onClickListener);
        if (!outcomeButton.isChecked()) {
            boolean zH = this.callback.h(market, outcome.id);
            outcomeButton.setEnabled(zH);
            if (zH && this.callback.G(outcome)) {
                outcomeButton.setBackgroundResource(R.drawable.spr_outcomeview_highlighted_bg);
            }
        }
        return outcomeButton;
    }

    private void addSelection(OutcomeView outcomeView, Selection selection) {
        if (selection != null) {
            Outcome outcome = selection.c;
            Market market = selection.b;
            Event event = selection.a;
            if (iu2.s(event, market, outcome, outcomeView.com.sporty.android.core.model.tracking.AnalyticsParam.EVENT_PARAM_IS_CHECKED java.lang.String)) {
                return;
            }
            outcomeView.setChecked(false);
            if (kni0.m()) {
                iu2.r(outcomeView.getContext());
                return;
            }
            if (iu2.l()) {
                qz3.p(outcomeView.getContext());
                return;
            }
            if (!iu2.f(selection) && !iu2.g(event)) {
                if (iu2.h(event, market, outcome)) {
                    qz3.o(outcomeView.getContext());
                    return;
                }
                return;
            }
            qz3.m(outcomeView.getContext());
        }
    }
}
