package com.sportybet.android.bvn.widget;

import android.app.DatePickerDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.bvn.widget.DatePickerLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bwf0;
import defpackage.e5;
import defpackage.gr0;
import defpackage.sn5;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class DatePickerLayout extends ConstraintLayout {
    public static final /* synthetic */ int K = 0;
    public ConstraintLayout F;
    public TextView G;
    public TextView H;
    public e5 I;
    public Date J;

    public DatePickerLayout(Context context) {
        super(context);
    }

    private void setContent(Date date) {
        if (date != null) {
            TextView textView = this.H;
            Locale locale = Locale.US;
            locale.getClass();
            textView.setText(bwf0.l(date, "dd/MM/yyyy", locale, 0, 0));
        }
    }

    public final void E(Date date, e5 e5Var) {
        this.F.setBackground(gr0.a(getContext(), R.drawable.comb_edit_text_bg));
        this.J = date;
        this.I = e5Var;
        this.F.setOnClickListener(new View.OnClickListener() { // from class: uwc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = DatePickerLayout.K;
                final DatePickerLayout datePickerLayout = this.a;
                Context context = datePickerLayout.getContext();
                DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: vwc
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                        int i5 = DatePickerLayout.K;
                        datePickerLayout.F(i2, i3, i4);
                    }
                };
                Date date2 = datePickerLayout.J;
                Calendar calendarB = yt5.b(Calendar.getInstance());
                if (date2 != null) {
                    calendarB.setTime(date2);
                }
                DatePickerDialog datePickerDialogA = ztc.a(context, onDateSetListener, calendarB);
                datePickerDialogA.getDatePicker().setMaxDate(yt5.b(Calendar.getInstance()).getTimeInMillis());
                datePickerDialogA.show();
            }
        });
        TextView textView = this.G;
        textView.setText(sn5.c(textView, R.string.page_withdraw__dob, new Object[0]));
        setContent(date);
    }

    public final void F(int i, int i2, int i3) {
        Date time = new GregorianCalendar(i, i2, i3).getTime();
        setContent(time);
        e5 e5Var = this.I;
        if (e5Var != null) {
            time.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            bwf0.l(time, "yyyy-MM-dd", locale, 0, 0);
            e5Var.z1();
        }
    }

    public String getDate() {
        return this.H.getText() != null ? this.H.getText().toString() : "";
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.F = (ConstraintLayout) findViewById(R.id.date_picker_container);
        this.G = (TextView) findViewById(R.id.date_picker_title);
        this.H = (TextView) findViewById(R.id.date_picker_tv);
    }

    public DatePickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DatePickerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
