package com.sportybet.android.instantwin.presentation.widget.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout;
import defpackage.bs3;
import defpackage.dqu;
import defpackage.h8z;
import defpackage.o0v;
import defpackage.ogo;
import defpackage.spu;
import defpackage.uho;
import defpackage.v1v;
import defpackage.y1v;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class GeneralMarketViewHolder extends BaseViewHolder {
    private static final float ARROW_ROTATION_COLLAPSED = 0.0f;
    private static final float ARROW_ROTATION_EXPANDED = 90.0f;
    private final ImageView arrow;
    private final ImageView marketInfo;
    private final TextView marketName;
    private o0v matchEventDetailCollapseListener;
    private y1v matchEventDetailMarketInfoClickListener;
    private final OutcomeGeneralLayout<bs3> outcomeGeneralLayout;
    private final LinearLayout titleLayout;

    public class a implements View.OnClickListener {
        public final /* synthetic */ dqu a;

        public a(dqu dquVar) {
            this.a = dquVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            GeneralMarketViewHolder generalMarketViewHolder = GeneralMarketViewHolder.this;
            generalMarketViewHolder.outcomeGeneralLayout.setVisibility(generalMarketViewHolder.outcomeGeneralLayout.getVisibility() == 8 ? 0 : 8);
            generalMarketViewHolder.arrow.setRotation(generalMarketViewHolder.outcomeGeneralLayout.getVisibility() == 0 ? GeneralMarketViewHolder.ARROW_ROTATION_EXPANDED : GeneralMarketViewHolder.ARROW_ROTATION_COLLAPSED);
            if (generalMarketViewHolder.matchEventDetailCollapseListener != null) {
                generalMarketViewHolder.matchEventDetailCollapseListener.a(this.a.c, generalMarketViewHolder.outcomeGeneralLayout.getVisibility() != 0);
            }
        }
    }

    public class b implements OutcomeGeneralLayout.a<bs3> {
        public v1v a;

        @Override // com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout.a
        public final void a(bs3 bs3Var) {
            bs3 bs3Var2 = bs3Var;
            v1v v1vVar = this.a;
            if (v1vVar != null) {
                v1vVar.f(bs3Var2);
            }
        }

        @Override // com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout.a
        public final void b(bs3 bs3Var) {
            bs3 bs3Var2 = bs3Var;
            v1v v1vVar = this.a;
            if (v1vVar != null) {
                v1vVar.g(bs3Var2);
            }
        }
    }

    public GeneralMarketViewHolder(View view) {
        super(view);
        this.matchEventDetailCollapseListener = null;
        this.matchEventDetailMarketInfoClickListener = null;
        this.marketName = (TextView) view.findViewById(R.id.market_title);
        this.titleLayout = (LinearLayout) view.findViewById(R.id.title_layout);
        this.arrow = (ImageView) view.findViewById(R.id.arrow);
        this.outcomeGeneralLayout = (OutcomeGeneralLayout) view.findViewById(R.id.outcome_layout);
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

    public void setData(dqu dquVar, ogo ogoVar) {
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
        this.outcomeGeneralLayout.setVisibility(!dquVar.i.booleanValue() ? 0 : 8);
        this.arrow.setRotation(!dquVar.i.booleanValue() ? ARROW_ROTATION_EXPANDED : ARROW_ROTATION_COLLAPSED);
        this.marketInfo.setVisibility(!zIsEmpty ? 0 : 4);
        this.marketInfo.setOnClickListener(new View.OnClickListener() { // from class: l0k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$setData$0(z, str, str3, view);
            }
        });
        this.titleLayout.setOnClickListener(new a(dquVar));
        ArrayList arrayList = new ArrayList();
        for (h8z h8zVar : spuVar.f.values()) {
            bs3 bs3Var = new bs3(dquVar.b, spuVar.a, h8zVar.a);
            String str4 = h8zVar.b;
            arrayList.add(new OutcomeGeneralLayout.b(bs3Var, str4, h8zVar.g, h8zVar.c, h8zVar.d, h8zVar.e, h8zVar.f, uho.b(str4, ogoVar) && h8zVar.d));
        }
        OutcomeGeneralLayout<bs3> outcomeGeneralLayout = this.outcomeGeneralLayout;
        b bVar = new b();
        v1v v1vVar = dquVar.f;
        if (v1vVar != null) {
            bVar.a = v1vVar;
        }
        outcomeGeneralLayout.setData("event_detail", arrayList, bVar);
    }

    public void setMatchEventDetailCollapseListener(o0v o0vVar) {
        this.matchEventDetailCollapseListener = o0vVar;
    }

    public void setMatchEventDetailMarketInfoClickListener(y1v y1vVar) {
        this.matchEventDetailMarketInfoClickListener = y1vVar;
    }
}
