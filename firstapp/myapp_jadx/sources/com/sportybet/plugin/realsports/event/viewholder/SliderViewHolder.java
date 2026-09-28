package com.sportybet.plugin.realsports.event.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.seekbar.RangeSeekBar;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.event.viewholder.SliderViewHolder;
import com.sportybet.plugin.realsports.event.widget.SliderMarketPanel;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.o0b;
import defpackage.rhd0;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/sportybet/plugin/realsports/event/viewholder/SliderViewHolder;", "Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder;", "Lcom/sportybet/plugin/realsports/event/widget/SliderMarketPanel$a;", "Landroid/view/View;", "itemView", "Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder$a;", "callback", "", "", "outcomesInVerticalOrientation", "Lcom/sportybet/plugin/realsports/event/widget/SliderMarketPanel$b;", "sliderDelegate", "<init>", "(Landroid/view/View;Lcom/sportybet/plugin/realsports/event/viewholder/VisibleMarketViewHolder$a;Ljava/util/Set;Lcom/sportybet/plugin/realsports/event/widget/SliderMarketPanel$b;)V", "", "setTheFirstUI", "()V", "onBindView", "outcomeView", "Lcom/sportybet/plugin/realsports/betslip/Selection;", "data", "", AnalyticsParam.EVENT_PARAM_IS_CHECKED, "onChildViewClick", "(Landroid/view/View;Lcom/sportybet/plugin/realsports/betslip/Selection;Z)V", "Lcom/sportybet/plugin/realsports/event/widget/SliderMarketPanel$b;", "Lrhd0;", "binding", "Lrhd0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SliderViewHolder extends VisibleMarketViewHolder implements SliderMarketPanel.a {
    public static final int $stable = 8;
    private final rhd0 binding;
    private final SliderMarketPanel.b sliderDelegate;

    public static final class a implements SliderMarketPanel.a {
        public a() {
        }

        @Override // com.sportybet.plugin.realsports.event.widget.SliderMarketPanel.a
        public final void onChildViewClick(View view, Selection selection, boolean z) {
            VisibleMarketViewHolder.a aVar = SliderViewHolder.this.callback;
            if (aVar != null) {
                aVar.j(view, z, selection);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderViewHolder(View view, final VisibleMarketViewHolder.a aVar, Set<String> set, SliderMarketPanel.b bVar) {
        super(view, aVar, set);
        view.getClass();
        bVar.getClass();
        this.sliderDelegate = bVar;
        int i = R.id.boost_sign;
        ImageView imageView = (ImageView) h5e.a(R.id.boost_sign, view);
        if (imageView != null) {
            i = R.id.divider;
            View viewA = h5e.a(R.id.divider, view);
            if (viewA != null) {
                i = R.id.fav;
                ImageButton imageButton = (ImageButton) h5e.a(R.id.fav, view);
                if (imageButton != null) {
                    i = R.id.info;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.info, view);
                    if (appCompatImageView != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i = R.id.slider_market;
                        SliderMarketPanel sliderMarketPanel = (SliderMarketPanel) h5e.a(R.id.slider_market, view);
                        if (sliderMarketPanel != null) {
                            i = R.id.title;
                            TextView textView = (TextView) h5e.a(R.id.title, view);
                            if (textView != null) {
                                i = R.id.title_container;
                                RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.title_container, view);
                                if (relativeLayout != null) {
                                    this.binding = new rhd0(linearLayout, imageView, viewA, imageButton, appCompatImageView, linearLayout, sliderMarketPanel, textView, relativeLayout);
                                    imageButton.setOnClickListener(new View.OnClickListener() { // from class: y0a0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            SliderViewHolder.lambda$0$0(aVar, this, view2);
                                        }
                                    });
                                    appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: z0a0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            SliderViewHolder.lambda$0$1(aVar, view2);
                                        }
                                    });
                                    imageView.setOnClickListener(new View.OnClickListener() { // from class: a1a0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            this.a.openOddsBoostPage();
                                        }
                                    });
                                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: b1a0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            SliderViewHolder.lambda$0$3(aVar, this, view2);
                                        }
                                    });
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$0(VisibleMarketViewHolder.a aVar, SliderViewHolder sliderViewHolder, View view) {
        if (aVar != null) {
            aVar.q(sliderViewHolder.market);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$1(VisibleMarketViewHolder.a aVar, View view) {
        if (aVar != null) {
            Object tag = view.getTag();
            aVar.o(tag instanceof Market ? (Market) tag : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$3(VisibleMarketViewHolder.a aVar, SliderViewHolder sliderViewHolder, View view) {
        if (aVar != null) {
            aVar.F(sliderViewHolder.market, sliderViewHolder.getAdapterPosition());
        }
    }

    private final void setTheFirstUI() {
        rhd0 rhd0Var = this.binding;
        LinearLayout linearLayout = rhd0Var.f;
        TextView textView = rhd0Var.v;
        SliderMarketPanel sliderMarketPanel = rhd0Var.i;
        this.layoutConfig.getClass();
        linearLayout.setBackgroundColor(0);
        rhd0Var.c.setVisibility(this.market.isPreMatch() ? 0 : 8);
        Market market = this.market;
        market.getClass();
        Event event = this.event;
        event.getClass();
        sliderMarketPanel.setMarketData(market, event, this.sliderDelegate);
        sliderMarketPanel.setOnOutcomeClickListener(new a());
        OutcomeButton outcomeButton = (OutcomeButton) sliderMarketPanel.findViewById(R.id.outcome_btn);
        outcomeButton.setBackgroundResource(this.layoutConfig.g);
        outcomeButton.setTextColor(o0b.b(this.ctx, this.layoutConfig.f));
        ((RangeSeekBar) sliderMarketPanel.findViewById(R.id.range_slider)).setTickMarkTextColor(this.layoutConfig.h);
        textView.setTextColor(this.layoutConfig.a);
        textView.setText(this.market.desc);
        ImageButton imageButton = rhd0Var.d;
        imageButton.setVisibility(!this.event.isVirtualSoccer() ? 0 : 8);
        VisibleMarketViewHolder.b bVar = this.layoutConfig;
        Context context = this.ctx;
        boolean zA = this.callback.A(this.market);
        bVar.getClass();
        imageButton.setImageDrawable(VisibleMarketViewHolder.b.a(context, zA));
        rhd0Var.b.setVisibility((this.callback.B() && VisibleMarketViewHolder.isBoostEvent(this.event, this.market, this.callback.D(), false)) ? 0 : 8);
        rhd0Var.e.setTag(this.market);
        boolean zY = this.callback.y(this.market);
        textView.setCompoundDrawablesWithIntrinsicBounds(zY ? getCollapsedStatusDrawable(true) : getCollapsedStatusDrawable(false), (Drawable) null, (Drawable) null, (Drawable) null);
        sliderMarketPanel.setVisibility(zY ? 8 : 0);
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder
    public void onBindView() {
        setTheFirstUI();
    }

    @Override // com.sportybet.plugin.realsports.event.widget.SliderMarketPanel.a
    public void onChildViewClick(View outcomeView, Selection data, boolean isChecked) {
        outcomeView.getClass();
        data.getClass();
        VisibleMarketViewHolder.a aVar = this.callback;
        if (aVar != null) {
            aVar.j(outcomeView, isChecked, data);
        }
    }
}
