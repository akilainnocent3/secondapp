package com.sportybet.android.instantwin.presentation.widget.viewholder;

import android.view.View;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout;
import defpackage.bs3;
import defpackage.h8z;
import defpackage.mpg;
import defpackage.ogo;
import defpackage.spu;
import defpackage.uho;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MatchEventViewHolder extends BaseViewHolder {
    private final OutcomeGeneralLayout<bs3> outcomeGeneralLayout;

    public class a implements OutcomeGeneralLayout.a<bs3> {
        public mpg.a a;

        @Override // com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout.a
        public final void a(bs3 bs3Var) {
            bs3 bs3Var2 = bs3Var;
            mpg.a aVar = this.a;
            if (aVar != null) {
                aVar.f(bs3Var2);
            }
        }

        @Override // com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout.a
        public final void b(bs3 bs3Var) {
            bs3 bs3Var2 = bs3Var;
            mpg.a aVar = this.a;
            if (aVar != null) {
                aVar.g(bs3Var2);
            }
        }
    }

    public class b implements View.OnClickListener {
        public mpg a;

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            mpg mpgVar = this.a;
            mpg.a aVar = mpgVar.m;
            if (aVar != null) {
                aVar.h(mpgVar);
            }
        }
    }

    public MatchEventViewHolder(View view) {
        super(view);
        this.outcomeGeneralLayout = (OutcomeGeneralLayout) view.findViewById(R.id.outcome_layout);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void setData(mpg mpgVar, ogo ogoVar) {
        ArrayList arrayList = new ArrayList();
        spu spuVar = mpgVar.k;
        if (spuVar != null) {
            for (h8z h8zVar : spuVar.f.values()) {
                bs3 bs3Var = new bs3(mpgVar.c, mpgVar.k.a, h8zVar.a);
                String str = h8zVar.b;
                arrayList.add(new OutcomeGeneralLayout.b(bs3Var, str, h8zVar.g, h8zVar.c, h8zVar.d, h8zVar.e, h8zVar.f, uho.b(str, ogoVar) && h8zVar.d));
            }
        }
        OutcomeGeneralLayout<bs3> outcomeGeneralLayout = this.outcomeGeneralLayout;
        a aVar = new a();
        mpg.a aVar2 = mpgVar.m;
        if (aVar2 != null) {
            aVar.a = aVar2;
        }
        outcomeGeneralLayout.setData("event_list", arrayList, aVar);
        View view = this.itemView;
        b bVar = new b();
        bVar.a = mpgVar;
        view.setOnClickListener(bVar);
    }
}
