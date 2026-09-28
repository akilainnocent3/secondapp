package com.sportybet.android.instantwin.presentation.widget.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.ComboOutcomeItemLayout;
import defpackage.dqu;
import defpackage.o0v;
import defpackage.ogo;
import defpackage.sn5;
import defpackage.spu;
import defpackage.y1v;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ComboMarketViewHolder extends BaseViewHolder {
    private static final float ARROW_ROTATION_COLLAPSED = 0.0f;
    private static final float ARROW_ROTATION_EXPANDED = 90.0f;
    private final ImageView arrow;
    private final ImageView marketInfo;
    private final TextView marketName;
    private o0v matchEventDetailCollapseListener;
    private y1v matchEventDetailMarketInfoClickListener;
    private final LinearLayout outComeLayout;
    private final ConstraintLayout subTitleLayout;
    private final LinearLayout titleLayout;
    private final List<TextView> tvOutcomeTitles;

    public ComboMarketViewHolder(View view) {
        super(view);
        ArrayList arrayList = new ArrayList();
        this.tvOutcomeTitles = arrayList;
        this.matchEventDetailCollapseListener = null;
        this.matchEventDetailMarketInfoClickListener = null;
        this.marketName = (TextView) view.findViewById(R.id.market_title);
        this.titleLayout = (LinearLayout) view.findViewById(R.id.title_layout);
        this.arrow = (ImageView) view.findViewById(R.id.arrow);
        arrayList.add((TextView) view.findViewById(R.id.outcome1_des_title));
        arrayList.add((TextView) view.findViewById(R.id.outcome2_des_title));
        arrayList.add((TextView) view.findViewById(R.id.outcome3_des_title));
        arrayList.add((TextView) view.findViewById(R.id.outcome4_des_title));
        this.subTitleLayout = (ConstraintLayout) view.findViewById(R.id.subtitle_layout);
        this.outComeLayout = (LinearLayout) view.findViewById(R.id.outcome_layout);
        this.marketInfo = (ImageView) view.findViewById(R.id.market_info);
    }

    private static String[] getSubTitles(String str) {
        try {
            return str.split(";");
        } catch (Exception unused) {
            return null;
        }
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
        ConstraintLayout constraintLayout = this.subTitleLayout;
        constraintLayout.setVisibility(constraintLayout.getVisibility() == 8 ? 0 : 8);
        LinearLayout linearLayout = this.outComeLayout;
        linearLayout.setVisibility(linearLayout.getVisibility() == 8 ? 0 : 8);
        this.arrow.setRotation(this.outComeLayout.getVisibility() == 0 ? ARROW_ROTATION_EXPANDED : ARROW_ROTATION_COLLAPSED);
        o0v o0vVar = this.matchEventDetailCollapseListener;
        if (o0vVar != null) {
            o0vVar.a(dquVar.c, this.subTitleLayout.getVisibility() != 0);
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
        this.outComeLayout.setVisibility(!dquVar.i.booleanValue() ? 0 : 8);
        this.subTitleLayout.setVisibility(!dquVar.i.booleanValue() ? 0 : 8);
        this.arrow.setRotation(!dquVar.i.booleanValue() ? ARROW_ROTATION_EXPANDED : ARROW_ROTATION_COLLAPSED);
        this.marketInfo.setVisibility(!zIsEmpty ? 0 : 4);
        this.marketInfo.setOnClickListener(new View.OnClickListener() { // from class: b88
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$setData$0(z, str, str3, view);
            }
        });
        this.titleLayout.setOnClickListener(new View.OnClickListener() { // from class: c88
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$setData$1(dquVar, view);
            }
        });
        String str4 = dquVar.e.get(0).e;
        String[] subTitles = TextUtils.equals(dquVar.d.b, "hd") ? new String[]{str4, sn5.c(this.itemView, R.string.common_functions__home, new Object[0]), sn5.c(this.itemView, R.string.common_functions__draw, new Object[0]), sn5.c(this.itemView, R.string.common_functions__away, new Object[0])} : getSubTitles(str4);
        if (subTitles == null || subTitles.length <= 1) {
            for (int i = 0; i < this.tvOutcomeTitles.size(); i++) {
                this.tvOutcomeTitles.get(i).setVisibility(8);
            }
        } else {
            for (int i2 = 0; i2 < this.tvOutcomeTitles.size(); i2++) {
                int length = subTitles.length - 1;
                List<TextView> list = this.tvOutcomeTitles;
                if (i2 < length) {
                    list.get(i2).setText(subTitles[i2 + 1]);
                    this.tvOutcomeTitles.get(i2).setVisibility(0);
                } else {
                    list.get(i2).setVisibility(8);
                }
            }
        }
        this.outComeLayout.removeAllViews();
        for (spu spuVar2 : dquVar.e) {
            ComboOutcomeItemLayout comboOutcomeItemLayout = new ComboOutcomeItemLayout(this.itemView.getContext());
            comboOutcomeItemLayout.setData(dquVar.b, spuVar2, dquVar.f, ogoVar);
            this.outComeLayout.addView(comboOutcomeItemLayout);
        }
    }

    public void setMatchEventDetailCollapseListener(o0v o0vVar) {
        this.matchEventDetailCollapseListener = o0vVar;
    }

    public void setMatchEventDetailMarketInfoClickListener(y1v y1vVar) {
        this.matchEventDetailMarketInfoClickListener = y1vVar;
    }
}
