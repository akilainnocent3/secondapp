package com.sportybet.plugin.realsports.event.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import defpackage.ane0;
import defpackage.io70;
import defpackage.jo70;
import defpackage.ko70;
import defpackage.kuh;
import defpackage.op8;
import defpackage.qdg;
import defpackage.rdg;
import defpackage.s6b;
import defpackage.sdg;
import defpackage.sn5;
import defpackage.tru;
import defpackage.vpu;
import defpackage.z6b;
import defpackage.z7z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0018R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/sportybet/plugin/realsports/event/viewholder/ScoreCountersViewHolder;", "Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "Landroid/view/View;", "itemView", "Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder$a;", "callback", "", "", "outcomesInVerticalOrientations", "<init>", "(Landroid/view/View;Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder$a;Ljava/util/Set;)V", "", "onBindView", "()V", "v", "onClick", "(Landroid/view/View;)V", "", "onLongClick", "(Landroid/view/View;)Z", "Landroidx/constraintlayout/widget/ConstraintLayout;", "titleContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/TextView;", "title", "Landroid/widget/TextView;", "Landroid/widget/ImageButton;", "favour", "Landroid/widget/ImageButton;", "Landroidx/gridlayout/widget/GridLayout;", "grid", "Landroidx/gridlayout/widget/GridLayout;", "Landroid/widget/ImageView;", "descImg", "Landroid/widget/ImageView;", "boostSignView", "Landroidx/compose/ui/platform/ComposeView;", "switchModeButton", "Landroidx/compose/ui/platform/ComposeView;", "homeScoreCounter", "awayScoreCounter", "Lcom/sportybet/plugin/realsports/widget/OutcomeButton;", "outcomeButton", "Lcom/sportybet/plugin/realsports/widget/OutcomeButton;", "boreDrawContainer", "Landroidx/appcompat/widget/AppCompatImageView;", "boreDrawInfo", "Landroidx/appcompat/widget/AppCompatImageView;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ScoreCountersViewHolder extends VisibleMarketViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public static final int $stable = 8;
    private final ComposeView awayScoreCounter;
    private final ImageView boostSignView;
    private final ConstraintLayout boreDrawContainer;
    private final AppCompatImageView boreDrawInfo;
    private final ImageView descImg;
    private final ImageButton favour;
    private final GridLayout grid;
    private final ComposeView homeScoreCounter;
    private final OutcomeButton outcomeButton;
    private final ComposeView switchModeButton;
    private final TextView title;
    private final ConstraintLayout titleContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScoreCountersViewHolder(View view, VisibleMarketViewHolder.a aVar, Set<String> set) {
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
        View viewFindViewById8 = view.findViewById(R.id.home_score_counter);
        viewFindViewById8.getClass();
        this.homeScoreCounter = (ComposeView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.away_score_counter);
        viewFindViewById9.getClass();
        this.awayScoreCounter = (ComposeView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.outcome_button);
        viewFindViewById10.getClass();
        this.outcomeButton = (OutcomeButton) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.score_counters_bore_draw_label_container);
        viewFindViewById11.getClass();
        this.boreDrawContainer = (ConstraintLayout) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.score_counters_bore_draw_info);
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById12;
        appCompatImageView.setOnClickListener(this);
        viewFindViewById12.getClass();
        this.boreDrawInfo = appCompatImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindView$lambda$1(ScoreCountersViewHolder scoreCountersViewHolder) {
        scoreCountersViewHolder.callback.t(scoreCountersViewHolder.market, scoreCountersViewHolder.getAdapterPosition());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindView$lambda$3(ScoreCountersViewHolder scoreCountersViewHolder) {
        scoreCountersViewHolder.callback.l(scoreCountersViewHolder.market, s6b.b, scoreCountersViewHolder.getAdapterPosition());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindView$lambda$4(ScoreCountersViewHolder scoreCountersViewHolder) {
        scoreCountersViewHolder.callback.l(scoreCountersViewHolder.market, s6b.a, scoreCountersViewHolder.getAdapterPosition());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindView$lambda$5(ScoreCountersViewHolder scoreCountersViewHolder) {
        scoreCountersViewHolder.callback.l(scoreCountersViewHolder.market, s6b.d, scoreCountersViewHolder.getAdapterPosition());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindView$lambda$6(ScoreCountersViewHolder scoreCountersViewHolder) {
        scoreCountersViewHolder.callback.l(scoreCountersViewHolder.market, s6b.c, scoreCountersViewHolder.getAdapterPosition());
        return Unit.a;
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder
    public void onBindView() {
        ConstraintLayout constraintLayout = this.titleContainer;
        this.layoutConfig.getClass();
        int i = 0;
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
        String strB = sn5.b(context, R.string.common_functions__buttons, new Object[0]);
        io70 io70Var = new io70(this, i);
        composeView.getClass();
        int i2 = 1;
        composeView.setContent(new op8(1583744059, new ane0(strB, io70Var), true));
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
            return;
        }
        String strP = this.callback.p(this.market);
        strP.getClass();
        int i3 = Integer.parseInt((String) StringsKt__StringsKt.split$default(strP, new String[]{":"}, false, 0, 6, null).get(0));
        int i4 = Integer.parseInt((String) StringsKt__StringsKt.split$default(strP, new String[]{":"}, false, 0, 6, null).get(1));
        this.title.setCompoundDrawablesWithIntrinsicBounds(getCollapsedStatusDrawable(false), (Drawable) null, (Drawable) null, (Drawable) null);
        this.grid.setVisibility(0);
        ComposeView composeView2 = this.homeScoreCounter;
        String str = this.event.homeTeamName;
        str.getClass();
        boolean zIsLive = this.market.isLive();
        Market market2 = this.market;
        market2.getClass();
        z6b.b(composeView2, str, i3, vpu.e(market2, true, i4), zIsLive, new jo70(this, i), new qdg(this, i2));
        ComposeView composeView3 = this.awayScoreCounter;
        String str2 = this.event.awayTeamName;
        str2.getClass();
        boolean zIsLive2 = this.market.isLive();
        Market market3 = this.market;
        market3.getClass();
        int i5 = 2;
        z6b.b(composeView3, str2, i4, vpu.e(market3, false, i3), zIsLive2, new rdg(this, i5), new sdg(this, i5));
        List<Outcome> list = this.market.outcomes;
        list.getClass();
        Iterator<T> it = list.iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                } else {
                    break;
                }
            } else {
                Object next = it.next();
                if (Intrinsics.g(((Outcome) next).desc, strP)) {
                    if (!z) {
                        z = true;
                        obj = next;
                    }
                }
            }
            obj = null;
            break;
        }
        Outcome outcome = (Outcome) obj;
        stylizeOutcomeButton(this.outcomeButton, this.layoutConfig, this.event, this.sportRule, this.market, outcome, false, this);
        if (outcome != null) {
            z7z z7zVarG = this.callback.g(this.event, this.market, outcome);
            OutcomeButton outcomeButton = this.outcomeButton;
            z7zVarG.getClass();
            String str3 = outcome.odds;
            str3.getClass();
            ViewParent parent = this.grid.getParent();
            kuh.c(outcomeButton, z7zVarG, str3, parent instanceof ViewGroup ? (ViewGroup) parent : null, this.market.isLive(), 16);
            this.callback.f(this.event, this.market, z7zVarG);
        }
        this.boreDrawContainer.setVisibility(this.callback.m(this.market) ? 0 : 8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        v.getClass();
        if (v instanceof OutcomeButton) {
            onOutcomeButtonClick((OutcomeButton) v);
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
        } else if (id == R.id.score_counters_bore_draw_info) {
            showBoreDrawInfo(this.boreDrawInfo);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View v) {
        v.getClass();
        return true;
    }
}
