package com.sportybet.android.user.selfexclusion;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.fragment.NavHostFragment;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.selfexclusion.SelfExclusionSetupFragment;
import defpackage.psm;
import defpackage.r2m;
import defpackage.sn5;
import defpackage.t6i0;
import defpackage.yfx;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class SelfExclusionSetupFragment extends r2m implements View.OnClickListener {
    public TextView B;
    public TextView C;
    public TextView D;
    public ImageView E;
    public Button F;
    public ListPopupWindow G;
    public ImageView H;
    public TextView I;
    public ConstraintLayout J;
    public ConstraintLayout K;
    public ConstraintLayout L;
    public Calendar M;
    public long N;
    public final SimpleDateFormat O = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
    public psm P;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            SelfExclusionSetupFragment selfExclusionSetupFragment = SelfExclusionSetupFragment.this;
            if (selfExclusionSetupFragment.J.getHeight() <= 0 || selfExclusionSetupFragment.J.getWidth() <= 0) {
                return;
            }
            selfExclusionSetupFragment.n0();
            selfExclusionSetupFragment.J.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            SelfExclusionSetupFragment selfExclusionSetupFragment = SelfExclusionSetupFragment.this;
            String string = selfExclusionSetupFragment.B.getText().toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if (string.equals(sn5.d(selfExclusionSetupFragment, R.string.self_exclusion__custom, new Object[0]))) {
                selfExclusionSetupFragment.o0(true);
                selfExclusionSetupFragment.F.setEnabled(false);
                return;
            }
            selfExclusionSetupFragment.L.setVisibility(8);
            selfExclusionSetupFragment.I.setVisibility(8);
            selfExclusionSetupFragment.H.setVisibility(8);
            selfExclusionSetupFragment.o0(false);
            selfExclusionSetupFragment.F.setEnabled(true);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            SelfExclusionSetupFragment selfExclusionSetupFragment = SelfExclusionSetupFragment.this;
            selfExclusionSetupFragment.F.setEnabled(!TextUtils.isEmpty(selfExclusionSetupFragment.D.getText()));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class d extends ArrayAdapter<String> {
        public d(t6i0.a aVar, List list) {
            super(aVar, R.layout.self_exclusion_period_item, list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            TextView textView = (TextView) view2;
            String string = SelfExclusionSetupFragment.this.B.getText().toString();
            if (TextUtils.isEmpty(string) || !string.equals(textView.getText().toString())) {
                textView.setBackgroundResource(R.drawable.spinner_unselected_item_bg);
                textView.setTextColor(textView.getContext().getResources().getColor(R.color.text_type1_primary));
                return view2;
            }
            textView.setBackgroundResource(R.drawable.spinner_selected_item_bg);
            textView.setTextColor(textView.getContext().getResources().getColor(R.color.text_type1_primary));
            return view2;
        }
    }

    public final void n0() {
        List listE = sn5.e(this, R.array.self_exclusion_period);
        ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
        this.G = listPopupWindow;
        listPopupWindow.setBackgroundDrawable(getContext().getDrawable(R.drawable.spinner_bg));
        this.G.setAdapter(new d((t6i0.a) getContext(), listE));
        this.G.setWidth(this.J.getWidth());
        this.G.setHeight((int) getContext().getResources().getDimension(R.dimen.period_window_height));
        this.G.setAnchorView(this.J);
        this.G.setModal(true);
        this.G.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ia80
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                String string = ((TextView) view).getText().toString();
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                SelfExclusionSetupFragment selfExclusionSetupFragment = this.a;
                selfExclusionSetupFragment.B.setText(string);
                selfExclusionSetupFragment.G.dismiss();
            }
        });
    }

    public final void o0(boolean z) {
        int i = z ? 0 : 8;
        this.K.setVisibility(i);
        this.C.setVisibility(i);
        this.E.setVisibility(i);
        this.D.setText("");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.period_container) {
            ListPopupWindow listPopupWindow = this.G;
            if (listPopupWindow != null) {
                listPopupWindow.show();
                return;
            }
            return;
        }
        int i = 2;
        if (id == R.id.img_calendar) {
            if (this.M == null) {
                Calendar calendar = Calendar.getInstance();
                this.M = calendar;
                calendar.add(5, 1);
                this.N = this.M.getTimeInMillis();
            }
            DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), R.style.datePicker, new DatePickerDialog.OnDateSetListener() { // from class: ja80
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(i2, i3, i4);
                    if (gregorianCalendar.compareTo((Calendar) new GregorianCalendar()) > 0) {
                        Date time = gregorianCalendar.getTime();
                        SelfExclusionSetupFragment selfExclusionSetupFragment = this.a;
                        selfExclusionSetupFragment.M.setTime(time);
                        selfExclusionSetupFragment.D.setText(selfExclusionSetupFragment.O.format(time));
                    }
                }
            }, this.M.get(1), this.M.get(2), this.M.get(5));
            datePickerDialog.getDatePicker().setMinDate(this.N);
            datePickerDialog.show();
            return;
        }
        if (id != R.id.btn_continue) {
            if (id == R.id.img_question) {
                this.L.setVisibility(0);
                this.I.setVisibility(0);
                this.H.setVisibility(0);
                return;
            } else {
                if (id == R.id.close_question) {
                    this.L.setVisibility(8);
                    this.I.setVisibility(8);
                    this.H.setVisibility(8);
                    return;
                }
                return;
            }
        }
        String string = this.B.getText().toString();
        String string2 = this.D.getText().toString();
        if (!TextUtils.isEmpty(string2)) {
            yfx yfxVarA = NavHostFragment.a.a(this);
            yfxVarA.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("periodEndDate", string2);
            bundle.putInt("periodDay", 0);
            yfxVarA.f(R.id.action_setup_to_confirm, bundle);
            return;
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        yfx yfxVarA2 = NavHostFragment.a.a(this);
        List listE = sn5.e(this, R.array.self_exclusion_period);
        if (string.equals(listE.get(0))) {
            i = 1;
        } else if (!string.equals(listE.get(1))) {
            if (string.equals(listE.get(2))) {
                i = 7;
            } else {
                i = string.equals(listE.get(3)) ? 30 : 90;
            }
        }
        yfxVarA2.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putString("periodEndDate", null);
        bundle2.putInt("periodDay", i);
        yfxVarA2.f(R.id.action_setup_to_confirm, bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_self_exclusion_setup, viewGroup, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.period_title);
        this.B = (TextView) viewInflate.findViewById(R.id.period_selection);
        this.D = (TextView) viewInflate.findViewById(R.id.period_end_date);
        this.C = (TextView) viewInflate.findViewById(R.id.period_end);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.img_calendar);
        this.F = (Button) viewInflate.findViewById(R.id.btn_continue);
        this.H = (ImageView) viewInflate.findViewById(R.id.close_question);
        this.E = (ImageView) viewInflate.findViewById(R.id.img_question);
        this.J = (ConstraintLayout) viewInflate.findViewById(R.id.period_container);
        this.K = (ConstraintLayout) viewInflate.findViewById(R.id.period_end_container);
        this.L = (ConstraintLayout) viewInflate.findViewById(R.id.question_container);
        this.I = (TextView) viewInflate.findViewById(R.id.question_content);
        textView.setText(sn5.d(this, this.P.O() ? R.string.self_exclusion__self_exclusion_period__ZA : R.string.self_exclusion__self_exclusion_period, new Object[0]));
        imageView.setOnClickListener(this);
        this.F.setOnClickListener(this);
        this.E.setOnClickListener(this);
        this.J.setOnClickListener(this);
        this.H.setOnClickListener(this);
        this.J.getViewTreeObserver().addOnGlobalLayoutListener(new a());
        b bVar = new b();
        c cVar = new c();
        this.B.addTextChangedListener(bVar);
        this.D.addTextChangedListener(cVar);
        n0();
        return viewInflate;
    }
}
