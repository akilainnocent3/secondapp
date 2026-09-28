package com.sportybet.plugin.realsports.event.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.gridlayout.widget.GridLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import com.sportybet.plugin.realsports.widget.OutcomeView;
import defpackage.ku1;
import defpackage.kuh;
import defpackage.tru;
import defpackage.z7z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class SimpleViewHolder extends VisibleMarketViewHolder implements View.OnClickListener, View.OnLongClickListener {
    private final ImageView boostSignView;
    private final ConstraintLayout boreDrawContainer;
    private final AppCompatImageView boreDrawInfo;
    private final RelativeLayout container;
    private final ImageView descImg;
    private final ImageButton favour;
    private final GridLayout grid;
    private final TextView title;

    public SimpleViewHolder(View view, VisibleMarketViewHolder.a aVar, Set<String> set) {
        super(view, aVar, set);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.title_container);
        this.container = relativeLayout;
        relativeLayout.setOnClickListener(this);
        relativeLayout.setOnLongClickListener(this);
        this.title = (TextView) view.findViewById(R.id.title);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.fav);
        this.favour = imageButton;
        imageButton.setOnClickListener(this);
        ImageView imageView = (ImageView) view.findViewById(R.id.info);
        this.descImg = imageView;
        imageView.setOnClickListener(this);
        this.grid = (GridLayout) view.findViewById(R.id.grid);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.boost_sign);
        this.boostSignView = imageView2;
        imageView2.setOnClickListener(this);
        this.boreDrawContainer = (ConstraintLayout) view.findViewById(R.id.simple_bore_draw_label_container);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.simple_bore_draw_info);
        this.boreDrawInfo = appCompatImageView;
        appCompatImageView.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindView$0() {
        Iterator<Outcome> it = this.market.outcomes.iterator();
        while (it.hasNext()) {
            this.outcomesInVerticalOrientation.add(it.next().id);
        }
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            View childAt = this.grid.getChildAt(i);
            if (childAt instanceof OutcomeView) {
                ((OutcomeView) childAt).setupWithVerticalOrientation();
            }
        }
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder
    public void onBindView() {
        RelativeLayout relativeLayout = this.container;
        this.layoutConfig.getClass();
        relativeLayout.setBackgroundColor(0);
        this.title.setTextColor(this.layoutConfig.a);
        TextView textView = this.title;
        Market market = this.market;
        HashSet hashSet = tru.a;
        textView.setText(market.desc);
        boolean zM = this.callback.m(this.market);
        ConstraintLayout constraintLayout = this.boreDrawContainer;
        if (zM) {
            constraintLayout.setVisibility(0);
        } else {
            constraintLayout.setVisibility(8);
        }
        boolean zIsVirtualSoccer = this.event.isVirtualSoccer();
        ImageButton imageButton = this.favour;
        if (zIsVirtualSoccer) {
            imageButton.setVisibility(8);
        } else {
            imageButton.setVisibility(0);
        }
        ImageButton imageButton2 = this.favour;
        VisibleMarketViewHolder.b bVar = this.layoutConfig;
        Context context = this.ctx;
        boolean zA = this.callback.A(this.market);
        bVar.getClass();
        imageButton2.setImageDrawable(VisibleMarketViewHolder.b.a(context, zA));
        this.boostSignView.setVisibility((this.callback.B() && VisibleMarketViewHolder.isBoostEvent(this.event, this.market, this.callback.D(), false)) ? 0 : 8);
        this.descImg.setTag(this.market);
        int i = (this.market.hasJokerOutcome() && this.callback.n()) ? 1 : 0;
        boolean zY = this.callback.y(this.market);
        TextView textView2 = this.title;
        if (zY) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(getCollapsedStatusDrawable(true), (Drawable) null, (Drawable) null, (Drawable) null);
            this.grid.setVisibility(8);
            return;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(getCollapsedStatusDrawable(false), (Drawable) null, (Drawable) null, (Drawable) null);
        this.grid.setVisibility(0);
        this.grid.removeAllViews();
        int size = this.market.outcomes.size();
        if (size == 2 || size == 3) {
            this.grid.setRowCount(i + 1);
            this.grid.setColumnCount(size);
        } else {
            GridLayout gridLayout = this.grid;
            if (size != 4) {
                gridLayout.setRowCount(((int) Math.ceil(size / 3.0f)) + i);
                this.grid.setColumnCount(3);
            } else {
                gridLayout.setRowCount(i + 2);
                this.grid.setColumnCount(2);
            }
        }
        for (Outcome outcome : this.market.outcomes) {
            OutcomeView outcomeViewCreateOutcomeView = createOutcomeView(this.ctx, this.layoutConfig, this.event, this.sportRule, this.market, outcome, false, this, new OutcomeView.a() { // from class: uk90
                @Override // com.sportybet.plugin.realsports.widget.OutcomeView.a
                public final void a() {
                    this.a.lambda$onBindView$0();
                }
            }, this.outcomesInVerticalOrientation.contains(outcome.id));
            refreshOddsChangedFlag(outcomeViewCreateOutcomeView, outcome);
            GridLayout.g gVar = GridLayout.O;
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(GridLayout.l(Integer.MIN_VALUE, 1, gVar, 0.0f), GridLayout.l(Integer.MIN_VALUE, 1, gVar, 1.0f));
            ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
            if (this.grid.getChildCount() % this.grid.getColumnCount() > 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.leftMargin;
            }
            if (this.grid.getChildCount() >= this.grid.getColumnCount()) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.topMargin;
            }
            z7z z7zVarG = this.callback.g(this.event, this.market, outcome);
            if (((z7zVarG instanceof z7z.b) || (z7zVarG instanceof z7z.a)) && !this.outcomesInVerticalOrientation.contains(outcome.id)) {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = this.itemView.getResources().getDimensionPixelSize(R.dimen.flash_boost_simple_market_outcome_height);
                OutcomeButton outcomeButton = outcomeViewCreateOutcomeView.ob1;
                outcomeButton.setPadding(outcomeButton.getPaddingLeft(), 0, outcomeViewCreateOutcomeView.ob1.getPaddingRight(), 0);
                OutcomeButton outcomeButton2 = outcomeViewCreateOutcomeView.ob2;
                outcomeButton2.setPadding(outcomeButton2.getPaddingLeft(), 0, outcomeViewCreateOutcomeView.ob2.getPaddingRight(), 0);
            }
            kuh.b(outcomeViewCreateOutcomeView, z7zVarG, outcome.odds, this.grid.getRootView() instanceof ViewGroup ? (ViewGroup) this.grid.getRootView() : null, ku1.b, this.market.isLive());
            this.callback.f(this.event, this.market, z7zVarG);
            this.grid.addView(outcomeViewCreateOutcomeView, layoutParams);
        }
        if (i != 0) {
            boolean zB = this.callback.b();
            Context context2 = this.ctx;
            VisibleMarketViewHolder.b bVar2 = this.layoutConfig;
            Event event = this.event;
            Market market2 = this.market;
            OutcomeView outcomeViewCreateJokerOutcomeView = createJokerOutcomeView(context2, bVar2, event, market2, market2.jokerOutcome, zB, this);
            GridLayout.g gVar2 = GridLayout.O;
            GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams(GridLayout.l(Integer.MIN_VALUE, 1, gVar2, 0.0f), GridLayout.l(0, this.market.outcomes.size(), gVar2, 1.0f));
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
            if (this.grid.getChildCount() % this.grid.getColumnCount() > 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = this.leftMargin;
            }
            if (this.grid.getChildCount() >= this.grid.getColumnCount()) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = this.topMargin;
            }
            this.grid.addView(outcomeViewCreateJokerOutcomeView, layoutParams2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view instanceof OutcomeView) {
            onOutcomeViewClick((OutcomeView) view);
            return;
        }
        int id = view.getId();
        if (id == R.id.title_container) {
            this.callback.F(this.market, getAdapterPosition());
            return;
        }
        if (id == R.id.info) {
            this.callback.o((Market) view.getTag());
            return;
        }
        if (id == R.id.boost_sign) {
            openOddsBoostPage();
        } else if (id == R.id.fav) {
            this.callback.q(this.market);
        } else if (id == R.id.simple_bore_draw_info) {
            showBoreDrawInfo(this.boreDrawInfo);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return true;
    }
}
