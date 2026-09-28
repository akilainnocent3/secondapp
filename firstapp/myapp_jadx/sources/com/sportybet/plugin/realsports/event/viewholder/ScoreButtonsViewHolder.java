package com.sportybet.plugin.realsports.event.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.gridlayout.widget.GridLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.event.viewholder.ScoreButtonsViewHolder;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import com.sportybet.plugin.realsports.widget.OutcomeView;
import defpackage.ane0;
import defpackage.ko70;
import defpackage.kuh;
import defpackage.op8;
import defpackage.sn5;
import defpackage.tru;
import defpackage.z7z;
import defpackage.za90;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J!\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010*R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/sportybet/plugin/realsports/event/viewholder/ScoreButtonsViewHolder;", "Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "Landroid/view/View;", "itemView", "Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder$a;", "callback", "", "", "outcomesInVerticalOrientations", "<init>", "(Landroid/view/View;Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder$a;Ljava/util/Set;)V", "", "columnTitles", "", "addColumnTitles", "(Ljava/util/List;)V", "Lcom/sportybet/plugin/realsports/data/Outcome;", "outcomes", "", "column", "", "addScoreOutcomes", "(Ljava/util/List;I)Z", "otherOutcomes", "addOtherOutcomes", "outcome", "Landroid/text/Layout$Alignment;", "alignment", "Lcom/sportybet/plugin/realsports/widget/OutcomeView;", "generateOutcomeView", "(Lcom/sportybet/plugin/realsports/data/Outcome;Landroid/text/Layout$Alignment;)Lcom/sportybet/plugin/realsports/widget/OutcomeView;", "onBindView", "()V", "v", "onClick", "(Landroid/view/View;)V", "onLongClick", "(Landroid/view/View;)Z", "Landroidx/constraintlayout/widget/ConstraintLayout;", "titleContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/TextView;", "title", "Landroid/widget/TextView;", "Landroid/widget/ImageButton;", "favour", "Landroid/widget/ImageButton;", "Landroidx/gridlayout/widget/GridLayout;", "grid", "Landroidx/gridlayout/widget/GridLayout;", "Landroid/widget/ImageView;", "descImg", "Landroid/widget/ImageView;", "boostSignView", "Landroidx/compose/ui/platform/ComposeView;", "switchModeButton", "Landroidx/compose/ui/platform/ComposeView;", "showMoreButton", "boreDrawContainer", "Landroidx/appcompat/widget/AppCompatImageView;", "boreDrawInfo", "Landroidx/appcompat/widget/AppCompatImageView;", "Companion", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ScoreButtonsViewHolder extends VisibleMarketViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public static final int $stable = 8;
    private static final int COLLAPSED_ROW_LIMIT = 3;
    private final ImageView boostSignView;
    private final ConstraintLayout boreDrawContainer;
    private final AppCompatImageView boreDrawInfo;
    private final ImageView descImg;
    private final ImageButton favour;
    private final GridLayout grid;
    private final ComposeView showMoreButton;
    private final ComposeView switchModeButton;
    private final TextView title;
    private final ConstraintLayout titleContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoreButtonsViewHolder(View view, VisibleMarketViewHolder.a aVar, Set<String> set) {
        super(view, aVar, set);
        view.getClass();
        aVar.getClass();
        set.getClass();
        View viewFindViewById = view.findViewById(R.id.title_container);
        viewFindViewById.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        this.titleContainer = constraintLayout;
        constraintLayout.setOnClickListener(this);
        constraintLayout.setOnLongClickListener(this);
        View viewFindViewById2 = view.findViewById(R.id.title);
        viewFindViewById2.getClass();
        this.title = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.fav);
        viewFindViewById3.getClass();
        ImageButton imageButton = (ImageButton) viewFindViewById3;
        this.favour = imageButton;
        imageButton.setOnClickListener(this);
        View viewFindViewById4 = view.findViewById(R.id.info);
        viewFindViewById4.getClass();
        ImageView imageView = (ImageView) viewFindViewById4;
        this.descImg = imageView;
        imageView.setOnClickListener(this);
        View viewFindViewById5 = view.findViewById(R.id.grid);
        viewFindViewById5.getClass();
        this.grid = (GridLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.boost_sign);
        viewFindViewById6.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById6;
        this.boostSignView = imageView2;
        imageView2.setOnClickListener(this);
        View viewFindViewById7 = view.findViewById(R.id.switch_mode_button);
        viewFindViewById7.getClass();
        this.switchModeButton = (ComposeView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.show_more_button);
        viewFindViewById8.getClass();
        this.showMoreButton = (ComposeView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.score_button_bore_draw_label_container);
        viewFindViewById9.getClass();
        this.boreDrawContainer = (ConstraintLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.score_button_bore_draw_info);
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById10;
        appCompatImageView.setOnClickListener(this);
        viewFindViewById10.getClass();
        this.boreDrawInfo = appCompatImageView;
    }

    private final void addColumnTitles(List<String> columnTitles) {
        for (String str : columnTitles) {
            GridLayout gridLayout = this.grid;
            View viewInflate = View.inflate(this.ctx, R.layout.spr_event_score_item_team, null);
            viewInflate.getClass();
            TextView textView = (TextView) viewInflate;
            textView.setTextColor(this.layoutConfig.d);
            textView.setBackgroundColor(this.layoutConfig.e);
            textView.setText(str);
            GridLayout.g gVar = GridLayout.O;
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(GridLayout.l(Integer.MIN_VALUE, 1, gVar, 0.0f), GridLayout.l(Integer.MIN_VALUE, 1, gVar, 1.0f));
            ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
            Unit unit = Unit.a;
            gridLayout.addView(textView, layoutParams);
        }
    }

    private final void addOtherOutcomes(List<? extends Outcome> otherOutcomes) {
        for (Outcome outcome : otherOutcomes) {
            OutcomeView outcomeViewGenerateOutcomeView = generateOutcomeView(outcome, Layout.Alignment.ALIGN_CENTER);
            GridLayout gridLayout = this.grid;
            GridLayout.g gVar = GridLayout.O;
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(GridLayout.l(Integer.MIN_VALUE, 1, gVar, 0.0f), GridLayout.l(0, 3, gVar, 0.0f));
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.topMargin;
            Unit unit = Unit.a;
            gridLayout.addView(outcomeViewGenerateOutcomeView, layoutParams);
            z7z z7zVarG = this.callback.g(this.event, this.market, outcome);
            OutcomeButton ob2 = outcomeViewGenerateOutcomeView.getOb2();
            z7zVarG.getClass();
            String str = outcome.odds;
            str.getClass();
            ViewParent parent = this.grid.getParent();
            kuh.c(ob2, z7zVarG, str, parent instanceof ViewGroup ? (ViewGroup) parent : null, this.market.isLive(), 16);
            this.callback.f(this.event, this.market, z7zVarG);
        }
    }

    private final boolean addScoreOutcomes(List<? extends Outcome> outcomes, int column) {
        int i = 0;
        for (Object obj : outcomes) {
            int i2 = i + 1;
            ViewGroup viewGroup = null;
            if (i < 0) {
                b.q();
                throw null;
            }
            Outcome outcome = (Outcome) obj;
            if (!this.callback.u(this.market) && i >= 3) {
                return false;
            }
            OutcomeView outcomeViewGenerateOutcomeView$default = generateOutcomeView$default(this, outcome, null, 2, null);
            GridLayout gridLayout = this.grid;
            GridLayout.g gVar = GridLayout.O;
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(GridLayout.l(i2, 1, gVar, 0.0f), GridLayout.l(column, 1, gVar, 1.0f));
            ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.topMargin;
            if (column == 1) {
                int i3 = this.leftMargin;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i3;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i3;
            }
            Unit unit = Unit.a;
            gridLayout.addView(outcomeViewGenerateOutcomeView$default, layoutParams);
            z7z z7zVarG = this.callback.g(this.event, this.market, outcome);
            z7zVarG.getClass();
            String str = outcome.odds;
            str.getClass();
            ViewParent parent = this.grid.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            kuh.d(outcomeViewGenerateOutcomeView$default, z7zVarG, str, viewGroup, this.market.isLive(), 16);
            this.callback.f(this.event, this.market, z7zVarG);
            i = i2;
        }
        return true;
    }

    private final OutcomeView generateOutcomeView(Outcome outcome, Layout.Alignment alignment) {
        OutcomeView outcomeViewCreateOutcomeView = createOutcomeView(this.ctx, this.layoutConfig, this.event, this.sportRule, this.market, outcome, false, this, null, false);
        if (alignment == Layout.Alignment.ALIGN_NORMAL) {
            outcomeViewCreateOutcomeView.getOb1().setGravity(19);
            outcomeViewCreateOutcomeView.getOb2().setGravity(21);
        } else if (alignment == Layout.Alignment.ALIGN_CENTER) {
            outcomeViewCreateOutcomeView.getOb1().setGravity(21);
            outcomeViewCreateOutcomeView.getOb2().setGravity(19);
        }
        refreshOddsChangedFlag(outcomeViewCreateOutcomeView, outcome);
        outcomeViewCreateOutcomeView.getClass();
        return outcomeViewCreateOutcomeView;
    }

    public static /* synthetic */ OutcomeView generateOutcomeView$default(ScoreButtonsViewHolder scoreButtonsViewHolder, Outcome outcome, Layout.Alignment alignment, int i, Object obj) {
        if ((i & 2) != 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        return scoreButtonsViewHolder.generateOutcomeView(outcome, alignment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindView$lambda$1(ScoreButtonsViewHolder scoreButtonsViewHolder) {
        scoreButtonsViewHolder.callback.t(scoreButtonsViewHolder.market, scoreButtonsViewHolder.getAdapterPosition());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindView$lambda$5$0(ScoreButtonsViewHolder scoreButtonsViewHolder) {
        scoreButtonsViewHolder.callback.C(scoreButtonsViewHolder.market, scoreButtonsViewHolder.getAdapterPosition());
        return Unit.a;
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder
    public void onBindView() {
        int i;
        ConstraintLayout constraintLayout = this.titleContainer;
        this.layoutConfig.getClass();
        constraintLayout.setBackgroundColor(0);
        TextView textView = this.title;
        textView.setTextColor(this.layoutConfig.a);
        Market market = this.market;
        ko70.a aVar = ko70.b;
        HashSet hashSet = tru.a;
        textView.setText(market.desc);
        ComposeView composeView = this.switchModeButton;
        Context context = this.ctx;
        context.getClass();
        String strB = sn5.b(context, R.string.common_functions__counters, new Object[0]);
        Function0 function0 = new Function0() { // from class: fo70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScoreButtonsViewHolder.onBindView$lambda$1(this.a);
            }
        };
        composeView.getClass();
        int i2 = 1;
        composeView.setContent(new op8(1583744059, new ane0(strB, function0), true));
        ImageButton imageButton = this.favour;
        imageButton.setVisibility(this.event.isVirtualSoccer() ? 8 : 0);
        VisibleMarketViewHolder.b bVar = this.layoutConfig;
        Context context2 = this.ctx;
        boolean zA = this.callback.A(this.market);
        bVar.getClass();
        imageButton.setImageDrawable(VisibleMarketViewHolder.b.a(context2, zA));
        this.boostSignView.setVisibility((this.callback.B() && VisibleMarketViewHolder.isBoostEvent(this.event, this.market, this.callback.D(), false)) ? 0 : 8);
        this.descImg.setTag(this.market);
        if (this.callback.y(this.market)) {
            this.title.setCompoundDrawablesWithIntrinsicBounds(getCollapsedStatusDrawable(true), (Drawable) null, (Drawable) null, (Drawable) null);
            this.grid.setVisibility(8);
            this.showMoreButton.setVisibility(8);
            return;
        }
        String str = this.event.homeTeamName;
        Context context3 = this.ctx;
        context3.getClass();
        List<String> listK = b.k(str, sn5.b(context3, R.string.common_functions__draw, new Object[0]), this.event.awayTeamName);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        List<Outcome> list = this.market.outcomes;
        list.getClass();
        ArrayList arrayListR = CollectionsKt.R(list);
        int size = arrayListR.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListR.get(i3);
            i3++;
            Outcome outcome = (Outcome) obj;
            String str2 = outcome.desc;
            str2.getClass();
            List listSplit$default = StringsKt__StringsKt.split$default(str2, new String[]{":"}, false, 0, 6, null);
            String str3 = (String) CollectionsKt.V(0, listSplit$default);
            Integer intOrNull = str3 != null ? StringsKt.toIntOrNull(str3) : null;
            String str4 = (String) CollectionsKt.V(i2, listSplit$default);
            Integer intOrNull2 = str4 != null ? StringsKt.toIntOrNull(str4) : null;
            if (intOrNull == null || intOrNull2 == null) {
                i = i2;
            } else {
                i = i2;
                if (intOrNull.intValue() > intOrNull2.intValue()) {
                    arrayList.add(outcome);
                }
                i2 = i;
            }
            if (intOrNull != null && intOrNull2 != null && intOrNull.equals(intOrNull2)) {
                arrayList2.add(outcome);
            } else if (intOrNull == null || intOrNull2 == null || intOrNull.intValue() >= intOrNull2.intValue()) {
                arrayList4.add(outcome);
            } else {
                arrayList3.add(outcome);
            }
            i2 = i;
        }
        this.title.setCompoundDrawablesWithIntrinsicBounds(getCollapsedStatusDrawable(false), (Drawable) null, (Drawable) null, (Drawable) null);
        GridLayout gridLayout = this.grid;
        gridLayout.setVisibility(0);
        gridLayout.removeAllViews();
        gridLayout.setColumnCount(3);
        gridLayout.setRowCount(arrayList4.size() + Math.max(arrayList.size(), Math.max(arrayList2.size(), arrayList3.size())) + 1);
        addColumnTitles(listK);
        addScoreOutcomes(arrayList, 0);
        addScoreOutcomes(arrayList2, i2);
        boolean zAddScoreOutcomes = addScoreOutcomes(arrayList3, 2);
        if (zAddScoreOutcomes) {
            addOtherOutcomes(arrayList4);
        }
        ComposeView composeView2 = this.showMoreButton;
        composeView2.setVisibility((this.callback.u(this.market) || !zAddScoreOutcomes) ? 0 : 8);
        za90.b(composeView2, this.callback.u(this.market), this.market.isLive(), new Function0() { // from class: go70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScoreButtonsViewHolder.onBindView$lambda$5$0(this.a);
            }
        });
        this.boreDrawContainer.setVisibility(this.callback.m(this.market) ? 0 : 8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        v.getClass();
        if (v instanceof OutcomeView) {
            onOutcomeViewClick((OutcomeView) v);
            return;
        }
        int id = v.getId();
        if (id == R.id.title_container) {
            this.callback.F(this.market, getAdapterPosition());
            return;
        }
        if (id == R.id.info) {
            this.callback.o((Market) v.getTag());
            return;
        }
        if (id == R.id.boost_sign) {
            openOddsBoostPage();
        } else if (id == R.id.fav) {
            this.callback.q(this.market);
        } else if (id == R.id.score_button_bore_draw_info) {
            showBoreDrawInfo(this.boreDrawInfo);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View v) {
        v.getClass();
        return true;
    }
}
