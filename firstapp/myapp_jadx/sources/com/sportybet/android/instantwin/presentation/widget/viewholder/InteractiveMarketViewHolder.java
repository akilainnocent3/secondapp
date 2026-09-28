package com.sportybet.android.instantwin.presentation.widget.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.InteractiveMarketPanel;
import defpackage.dqu;
import defpackage.o0v;
import defpackage.ogo;
import defpackage.spu;
import defpackage.y1v;

/* JADX INFO: loaded from: classes.dex */
public class InteractiveMarketViewHolder extends BaseViewHolder {
    private static final float ARROW_ROTATION_COLLAPSED = 0.0f;
    private static final float ARROW_ROTATION_EXPANDED = 90.0f;
    private final ImageView arrow;
    private final InteractiveMarketPanel interactiveMarket;
    private final ImageView marketInfo;
    private final TextView marketName;
    private o0v matchEventDetailCollapseListener;
    private y1v matchEventDetailMarketInfoClickListener;
    private final LinearLayout outcomeLayout;
    private final LinearLayout titleLayout;

    public InteractiveMarketViewHolder(View view) {
        super(view);
        this.matchEventDetailCollapseListener = null;
        this.matchEventDetailMarketInfoClickListener = null;
        this.marketName = (TextView) view.findViewById(R.id.market_title);
        this.titleLayout = (LinearLayout) view.findViewById(R.id.title_layout);
        this.arrow = (ImageView) view.findViewById(R.id.arrow);
        this.outcomeLayout = (LinearLayout) view.findViewById(R.id.outcome_layout);
        this.interactiveMarket = (InteractiveMarketPanel) view.findViewById(R.id.interactive_market);
        this.marketInfo = (ImageView) view.findViewById(R.id.market_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setData$0(boolean z, String str, String str2, View view) {
        y1v y1vVar;
        if (!z || (y1vVar = this.matchEventDetailMarketInfoClickListener) == null) {
            return;
        }
        y1vVar.a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setData$1(dqu dquVar, View view) {
        LinearLayout linearLayout = this.outcomeLayout;
        linearLayout.setVisibility(linearLayout.getVisibility() == 8 ? 0 : 8);
        this.arrow.setRotation(this.outcomeLayout.getVisibility() == 0 ? ARROW_ROTATION_EXPANDED : ARROW_ROTATION_COLLAPSED);
        o0v o0vVar = this.matchEventDetailCollapseListener;
        if (o0vVar != null) {
            o0vVar.a(dquVar.c, this.outcomeLayout.getVisibility() != 0);
        }
    }

    public void setData(final dqu dquVar, InteractiveMarketPanel.a aVar, ogo ogoVar) {
        final String str;
        String str2;
        spu spuVar = dquVar.d;
        final String str3 = "";
        if (spuVar == null || (str = spuVar.d) == null) {
            str = "";
        }
        if (spuVar != null && (str2 = spuVar.g) != null) {
            str3 = str2;
        }
        boolean zIsEmpty = str3.trim().isEmpty();
        final boolean z = !zIsEmpty;
        this.marketName.setText(str);
        this.outcomeLayout.setVisibility(!dquVar.i.booleanValue() ? 0 : 8);
        this.arrow.setRotation(!dquVar.i.booleanValue() ? ARROW_ROTATION_EXPANDED : ARROW_ROTATION_COLLAPSED);
        this.marketInfo.setVisibility(zIsEmpty ? 4 : 0);
        this.marketInfo.setOnClickListener(new View.OnClickListener() { // from class: byo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$setData$0(z, str, str3, view);
            }
        });
        this.titleLayout.setOnClickListener(new View.OnClickListener() { // from class: cyo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$setData$1(dquVar, view);
            }
        });
        this.interactiveMarket.setMarketData(dquVar, dquVar.f, aVar, ogoVar);
    }

    public void setMatchEventDetailCollapseListener(o0v o0vVar) {
        this.matchEventDetailCollapseListener = o0vVar;
    }

    public void setMatchEventDetailMarketInfoClickListener(y1v y1vVar) {
        this.matchEventDetailMarketInfoClickListener = y1vVar;
    }
}
