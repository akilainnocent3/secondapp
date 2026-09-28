package com.sportybet.android.instantwin.presentation.widget.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout;
import defpackage.bqe;
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
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MultipleRowsMarketViewHolder extends BaseViewHolder {
    private static final float ARROW_ROTATION_COLLAPSED = 0.0f;
    private static final float ARROW_ROTATION_EXPANDED = 90.0f;
    private final ImageView arrow;
    private final ImageView marketInfo;
    private final TextView marketName;
    public o0v matchEventDetailCollapseListener;
    public y1v matchEventDetailMarketInfoClickListener;
    private final LinearLayout outcomeLayout;
    private final LinearLayout titleLayout;

    public class a implements OutcomeGeneralLayout.a<bs3> {
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

    public MultipleRowsMarketViewHolder(View view) {
        super(view);
        this.matchEventDetailCollapseListener = null;
        this.matchEventDetailMarketInfoClickListener = null;
        this.marketName = (TextView) view.findViewById(R.id.market_title);
        this.titleLayout = (LinearLayout) view.findViewById(R.id.title_layout);
        this.arrow = (ImageView) view.findViewById(R.id.arrow);
        this.outcomeLayout = (LinearLayout) view.findViewById(R.id.outcome_layout);
        this.marketInfo = (ImageView) view.findViewById(R.id.market_info);
    }

    private OutcomeGeneralLayout<bs3> generateOutcomeRow(dqu dquVar, List<h8z> list, ogo ogoVar) {
        ArrayList arrayList = new ArrayList();
        for (h8z h8zVar : list) {
            bs3 bs3Var = new bs3(dquVar.b, dquVar.d.a, h8zVar.a);
            String str = h8zVar.b;
            arrayList.add(new OutcomeGeneralLayout.b(bs3Var, str, h8zVar.g, h8zVar.c, h8zVar.d, h8zVar.e, h8zVar.f, uho.b(str, ogoVar) && h8zVar.d));
        }
        a aVar = new a();
        v1v v1vVar = dquVar.f;
        if (v1vVar != null) {
            aVar.a = v1vVar;
        }
        OutcomeGeneralLayout<bs3> outcomeGeneralLayout = new OutcomeGeneralLayout<>(this.itemView.getContext());
        outcomeGeneralLayout.setData("event_detail", arrayList, aVar, getOutcomePerRow(dquVar.d));
        return outcomeGeneralLayout;
    }

    private int getOutcomePerRow(spu spuVar) {
        return spuVar.f.size() == 4 ? 2 : 3;
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

    public void setData(final dqu dquVar, ogo ogoVar) {
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
        int i = 0;
        this.outcomeLayout.setVisibility(!dquVar.i.booleanValue() ? 0 : 8);
        this.arrow.setRotation(!dquVar.i.booleanValue() ? ARROW_ROTATION_EXPANDED : ARROW_ROTATION_COLLAPSED);
        this.marketInfo.setVisibility(!zIsEmpty ? 0 : 4);
        this.marketInfo.setOnClickListener(new View.OnClickListener() { // from class: mnw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$setData$0(z, str, str3, view);
            }
        });
        this.titleLayout.setOnClickListener(new View.OnClickListener() { // from class: nnw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$setData$1(dquVar, view);
            }
        });
        this.outcomeLayout.removeAllViews();
        if (spuVar != null) {
            LinkedHashMap linkedHashMap = spuVar.f;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int outcomePerRow = getOutcomePerRow(spuVar);
            int size = linkedHashMap.size();
            int i2 = size % outcomePerRow == 0 ? size / outcomePerRow : (size / outcomePerRow) + 1;
            ArrayList arrayList = new ArrayList(linkedHashMap.values());
            while (i < i2) {
                if (i != 0) {
                    View view = new View(this.itemView.getContext());
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, bqe.a(12.0f)));
                    this.outcomeLayout.addView(view);
                }
                int i3 = i * outcomePerRow;
                i++;
                int size2 = i * outcomePerRow;
                if (size2 >= arrayList.size()) {
                    size2 = arrayList.size();
                }
                this.outcomeLayout.addView(generateOutcomeRow(dquVar, arrayList.subList(i3, size2), ogoVar));
            }
        }
    }

    public void setMatchEventDetailCollapseListener(o0v o0vVar) {
        this.matchEventDetailCollapseListener = o0vVar;
    }

    public void setMatchEventDetailMarketInfoClickListener(y1v y1vVar) {
        this.matchEventDetailMarketInfoClickListener = y1vVar;
    }
}
