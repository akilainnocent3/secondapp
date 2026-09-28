package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.bs3;
import defpackage.dqu;
import defpackage.h8z;
import defpackage.ogo;
import defpackage.spu;
import defpackage.uho;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ComboOutcomeItemLayout extends LinearLayout {
    public final TextView a;
    public final OutcomeGeneralLayout<bs3> b;

    public class a implements OutcomeGeneralLayout.a<bs3> {
        public dqu.b a;

        @Override // com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout.a
        public final void a(bs3 bs3Var) {
            bs3 bs3Var2 = bs3Var;
            dqu.b bVar = this.a;
            if (bVar != null) {
                bVar.f(bs3Var2);
            }
        }

        @Override // com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout.a
        public final void b(bs3 bs3Var) {
            bs3 bs3Var2 = bs3Var;
            dqu.b bVar = this.a;
            if (bVar != null) {
                bVar.g(bs3Var2);
            }
        }
    }

    public ComboOutcomeItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.iwqk_layout_combo_outcome_item, this);
        setOrientation(0);
        this.a = (TextView) findViewById(R.id.ou_outcome_title);
        this.b = (OutcomeGeneralLayout) findViewById(R.id.ou_outcome_layout);
    }

    public void setData(String str, spu spuVar, dqu.b bVar, ogo ogoVar) {
        String[] strArrSplit;
        try {
            strArrSplit = spuVar.e.split(";");
        } catch (Exception unused) {
            strArrSplit = null;
        }
        if (strArrSplit != null && strArrSplit.length > 0) {
            this.a.setText(strArrSplit[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (h8z h8zVar : spuVar.f.values()) {
            bs3 bs3Var = new bs3(str, spuVar.a, h8zVar.a);
            String str2 = h8zVar.b;
            arrayList.add(new OutcomeGeneralLayout.b(bs3Var, str2, h8zVar.g, "", h8zVar.d, h8zVar.e, h8zVar.f, uho.b(str2, ogoVar) && h8zVar.d));
        }
        a aVar = new a();
        if (bVar != null) {
            aVar.a = bVar;
        }
        this.b.setData("event_detail", arrayList, aVar);
    }

    public ComboOutcomeItemLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ComboOutcomeItemLayout(Context context) {
        this(context, null);
    }
}
