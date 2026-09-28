package com.google.android.material.datepicker;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import defpackage.dzc;
import defpackage.ku5;
import defpackage.rqh0;
import defpackage.zt5;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends RecyclerView.f<a> {
    public final c<?> a;

    public static class a extends RecyclerView.d0 {
        public final TextView a;

        public a(TextView textView) {
            super(textView);
            this.a = textView;
        }
    }

    public l(c<?> cVar) {
        this.a = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.d.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        c<?> cVar = this.a;
        int i2 = cVar.d.a.c + i;
        aVar.a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        TextView textView = aVar.a;
        Context context = textView.getContext();
        textView.setContentDescription(rqh0.f().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        ku5 ku5Var = cVar.v;
        Calendar calendarF = rqh0.f();
        zt5 zt5Var = calendarF.get(1) == i2 ? ku5Var.f : ku5Var.d;
        ArrayList arrayListT1 = cVar.c.t1();
        int size = arrayListT1.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListT1.get(i3);
            i3++;
            calendarF.setTimeInMillis(((Long) obj).longValue());
            if (calendarF.get(1) == i2) {
                zt5Var = ku5Var.e;
            }
        }
        zt5Var.b(textView);
        textView.setSelected(zt5Var == ku5Var.e);
        textView.setOnClickListener(new k(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a((TextView) dzc.a(viewGroup, R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
