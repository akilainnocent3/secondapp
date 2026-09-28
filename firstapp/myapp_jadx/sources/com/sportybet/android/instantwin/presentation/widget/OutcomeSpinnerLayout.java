package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.viewholder.MatchEventSpinnerViewHolder;
import defpackage.b5v;
import defpackage.bqe;
import defpackage.bs3;
import defpackage.n4p;
import defpackage.sqo;
import defpackage.tlo;
import defpackage.u4v;
import defpackage.ucb0;
import defpackage.y4v;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class OutcomeSpinnerLayout<T> extends LinearLayout {
    public final OutcomeGeneralLayout<T> a;
    public List<d<T>> b;
    public b<T> c;
    public c d;
    public final ucb0 e;
    public final ArrayList f;
    public int i;

    public class a implements OutcomeGeneralLayout.a<T> {
        public b<T> a;

        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout.a
        public final void a(T t) {
            b<T> bVar = this.a;
            int i = OutcomeSpinnerLayout.this.i;
            MatchEventSpinnerViewHolder.a aVar = (MatchEventSpinnerViewHolder.a) bVar;
            aVar.getClass();
            bs3 bs3Var = (bs3) t;
            u4v u4vVar = aVar.a;
            if (u4vVar != null) {
                bs3Var.d = i;
                u4vVar.a.q0(bs3Var);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout.a
        public final void b(T t) {
            b<T> bVar = this.a;
            int i = OutcomeSpinnerLayout.this.i;
            MatchEventSpinnerViewHolder.a aVar = (MatchEventSpinnerViewHolder.a) bVar;
            aVar.getClass();
            bs3 bs3Var = (bs3) t;
            u4v u4vVar = aVar.a;
            if (u4vVar != null) {
                bs3Var.d = i;
                y4v y4vVar = u4vVar.a;
                tlo tloVarP0 = y4vVar.p0();
                BigDecimal bigDecimal = sqo.a;
                ((n4p) tloVarP0).I(sqo.b(bs3Var.a, bs3Var.b, bs3Var.c));
                y4vVar.t0(bs3Var, false);
                b5v b5vVar = y4vVar.B;
                if (b5vVar != null) {
                    b5vVar.u0();
                }
            }
        }
    }

    public interface b<T> {
    }

    public interface c {
        void a(int i);
    }

    public static class d<T> {
        public ArrayList a;
        public ArrayList b;
        public ArrayList c;
        public ArrayList d;
        public ArrayList e;
        public ArrayList f;
        public ArrayList g;
        public String h;

        public d() {
            throw null;
        }
    }

    public OutcomeSpinnerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.i = 0;
        View.inflate(context, R.layout.iwqk_layout_outcome_spinner, this);
        setOrientation(0);
        OutcomeGeneralLayout<T> outcomeGeneralLayout = (OutcomeGeneralLayout) findViewById(R.id.outcome_general_layout);
        this.a = outcomeGeneralLayout;
        outcomeGeneralLayout.getSpinner().setVisibility(0);
        this.e = new ucb0(this.a.getSpinner(), getSpinnerWidth(), arrayList);
        this.a.getSpinner().setAdapter((SpinnerAdapter) this.e);
    }

    private int getSpinnerWidth() {
        return bqe.d() - (bqe.a(30.0f) + ((int) getResources().getDimension(R.dimen.iwqk_match_event_info_width)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectOutcome(d<T> dVar) {
        ArrayList arrayList = new ArrayList();
        int size = dVar.a.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new OutcomeGeneralLayout.b(dVar.a.get(i), (String) dVar.b.get(i), (String) dVar.c.get(i), "", ((Boolean) dVar.d.get(i)).booleanValue(), ((Boolean) dVar.e.get(i)).booleanValue(), ((Boolean) dVar.f.get(i)).booleanValue(), ((Boolean) dVar.g.get(i)).booleanValue()));
        }
        OutcomeGeneralLayout<T> outcomeGeneralLayout = this.a;
        if (outcomeGeneralLayout != null) {
            a aVar = new a();
            b<T> bVar = this.c;
            if (bVar != null) {
                aVar.a = bVar;
            }
            outcomeGeneralLayout.setData("event_list_spinner", arrayList, aVar);
        }
    }

    public void setData(int i, List<d<T>> list, b<T> bVar) {
        this.i = i;
        this.b = list;
        ucb0 ucb0Var = this.e;
        ucb0Var.getClass();
        if (list == null) {
            list = null;
        }
        ucb0Var.b = list;
        this.c = bVar;
        ArrayList arrayList = this.f;
        arrayList.clear();
        Iterator<d<T>> it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().h);
        }
        ucb0Var.notifyDataSetChanged();
        com.sportybet.android.instantwin.presentation.widget.b bVar2 = new com.sportybet.android.instantwin.presentation.widget.b(this);
        ucb0Var.getClass();
        ucb0Var.c = bVar2;
        OutcomeGeneralLayout<T> outcomeGeneralLayout = this.a;
        outcomeGeneralLayout.getSpinner().setOnItemSelectedListener(new com.sportybet.android.instantwin.presentation.widget.c(this));
        outcomeGeneralLayout.getSpinner().setSelection(this.i);
        if (this.b.isEmpty()) {
            return;
        }
        int i2 = this.i;
        if (i2 < 0 || i2 >= this.b.size()) {
            this.i = 0;
        }
        setSelectOutcome(this.b.get(this.i));
    }

    public void setSpannerListener(c cVar) {
        this.d = cVar;
    }

    public OutcomeSpinnerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OutcomeSpinnerLayout(Context context) {
        this(context, null);
    }
}
