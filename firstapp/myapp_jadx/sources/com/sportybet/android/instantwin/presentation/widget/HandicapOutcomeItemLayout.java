package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bs3;
import defpackage.dqu;
import defpackage.h8z;
import defpackage.ogo;
import defpackage.spu;
import defpackage.uho;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class HandicapOutcomeItemLayout extends LinearLayout {
    public final OutcomeGeneralLayout<bs3> a;

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

    public HandicapOutcomeItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.iwqk_layout_handicap_outcome_item, this);
        setOrientation(0);
        this.a = (OutcomeGeneralLayout) findViewById(R.id.ou_outcome_layout);
    }

    public void setData(String str, spu spuVar, dqu.b bVar, ogo ogoVar) {
        String str2;
        spu spuVar2 = spuVar;
        ArrayList arrayList = new ArrayList();
        for (h8z h8zVar : spuVar2.f.values()) {
            String str3 = spuVar2.a;
            String str4 = h8zVar.a;
            String str5 = h8zVar.c;
            bs3 bs3Var = new bs3(str, str3, str4);
            String str6 = h8zVar.b;
            String str7 = h8zVar.g;
            String strGroup = str5 == null ? "" : str5;
            if (!TextUtils.isEmpty(str5)) {
                Matcher matcher = Pattern.compile("\\(([^)]+)\\)").matcher(str5);
                if (matcher.find()) {
                    strGroup = matcher.group(1);
                }
            }
            boolean z = h8zVar.d;
            boolean z2 = h8zVar.e;
            boolean z3 = true;
            boolean z4 = h8zVar.f;
            if (uho.b(h8zVar.b, ogoVar) && h8zVar.d) {
                str2 = strGroup;
            } else {
                str2 = strGroup;
                z3 = false;
            }
            arrayList.add(new OutcomeGeneralLayout.b(bs3Var, str6, str7, str2, z, z2, z4, z3));
            spuVar2 = spuVar;
        }
        a aVar = new a();
        if (bVar != null) {
            aVar.a = bVar;
        }
        this.a.setData("event_detail", arrayList, aVar);
    }

    public HandicapOutcomeItemLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HandicapOutcomeItemLayout(Context context) {
        this(context, null);
    }
}
