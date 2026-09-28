package com.sportybet.android.instantwin.presentation.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class c implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ OutcomeSpinnerLayout a;

    public c(OutcomeSpinnerLayout outcomeSpinnerLayout) {
        this.a = outcomeSpinnerLayout;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        OutcomeSpinnerLayout outcomeSpinnerLayout = this.a;
        outcomeSpinnerLayout.i = i;
        OutcomeSpinnerLayout.c cVar = outcomeSpinnerLayout.d;
        if (cVar != null) {
            cVar.a(i);
        }
        outcomeSpinnerLayout.setSelectOutcome((OutcomeSpinnerLayout.d) outcomeSpinnerLayout.b.get(i));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
