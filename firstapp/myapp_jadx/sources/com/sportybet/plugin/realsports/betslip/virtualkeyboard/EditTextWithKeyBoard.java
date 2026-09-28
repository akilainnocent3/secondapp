package com.sportybet.plugin.realsports.betslip.virtualkeyboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard;
import defpackage.a78;
import defpackage.a8b;
import defpackage.b6y;
import defpackage.bqe;
import defpackage.c8i0;
import defpackage.iu2;
import defpackage.j800;
import defpackage.oql;
import defpackage.p8k;
import defpackage.rk30;
import defpackage.rrh0;
import defpackage.s0b;
import defpackage.sn5;
import defpackage.xtf;
import defpackage.y8k;
import defpackage.yrh0;
import defpackage.ytf;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public class EditTextWithKeyBoard extends oql {
    public static final /* synthetic */ int M = 0;
    public final KeyboardView A;
    public final ProgressBar B;
    public final LinearLayout C;
    public final CheckBox D;
    public final TextView E;
    public a F;
    public int G;
    public final int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public j800 c;
    public y8k d;
    public p8k e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final TextView w;
    public final View y;
    public final EditText z;

    public interface a {
        void a();

        void b();

        void c(boolean z);

        void f();

        void g(String str);

        void k(String str);
    }

    public EditTextWithKeyBoard(Context context, AttributeSet attributeSet) {
        Drawable drawableB;
        super(context, attributeSet);
        this.G = 1;
        this.H = 0;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.n);
        String strA = sn5.a(1, context, typedArrayObtainStyledAttributes);
        String strA2 = sn5.a(2, context, typedArrayObtainStyledAttributes);
        this.H = typedArrayObtainStyledAttributes.getInt(0, 0);
        LayoutInflater.from(context).inflate(R.layout.spr_edittext_keyboard, this);
        this.f = (TextView) findViewById(R.id.stake);
        this.v = (TextView) findViewById(R.id.ksh_text);
        this.i = (TextView) findViewById(R.id.match_number);
        this.w = (TextView) findViewById(R.id.additional_msg);
        View viewFindViewById = findViewById(R.id.go_to_deposit_btn);
        this.y = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: utf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = EditTextWithKeyBoard.M;
                this.a.c.b(null);
            }
        });
        this.B = (ProgressBar) findViewById(R.id.gift_progress_bar);
        this.C = (LinearLayout) findViewById(R.id.gift_layout);
        this.E = (TextView) findViewById(R.id.tv_gift);
        this.D = (CheckBox) findViewById(R.id.checkbox_gift);
        if (getContext() != null && (drawableB = s0b.b(getContext(), R.drawable.ic__gift, new a78.c(R.color.icon_brand_sub_primary_d_lighter), 20)) != null) {
            this.D.setCompoundDrawablesRelative(drawableB, null, null, null);
        }
        this.D.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vtf
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = EditTextWithKeyBoard.M;
                EditTextWithKeyBoard editTextWithKeyBoard = this.a;
                EditTextWithKeyBoard.a aVar = editTextWithKeyBoard.F;
                if (aVar == null || editTextWithKeyBoard.I) {
                    return;
                }
                aVar.c(z);
            }
        });
        SpannableString spannableString = new SpannableString(sn5.c(this, R.string.gift__l_gift, new Object[0]));
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        this.E.setText(spannableString);
        this.E.setOnClickListener(new View.OnClickListener() { // from class: wtf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = EditTextWithKeyBoard.M;
                this.a.F.b();
            }
        });
        if (strA != null) {
            this.f.setText(strA);
        }
        if (strA2 != null) {
            this.v.setText(strA2);
        }
        this.v.setText(a8b.e());
        c();
        this.z = (EditText) findViewById(R.id.edit_text_ksh);
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(this.e.a().toPlainString().length());
        EditText editText = this.z;
        AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
        editText.setFilters(new InputFilter[]{lengthFilter, new rrh0()});
        this.z.setCursorVisible(false);
        this.z.setLongClickable(false);
        this.z.setTextIsSelectable(false);
        this.z.setImeOptions(268435456);
        this.z.setOnTouchListener(new com.sportybet.plugin.realsports.betslip.virtualkeyboard.a(this));
        this.z.addTextChangedListener(new b(this));
        setMinStakeHint();
        Class cls = Boolean.TYPE;
        try {
            Method method = EditText.class.getMethod("setShowSoftInputOnFocus", cls);
            method.setAccessible(true);
            method.invoke(this.z, Boolean.FALSE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Method method2 = EditText.class.getMethod("setSoftInputShownOnFocus", cls);
            method2.setAccessible(true);
            method2.invoke(this.z, Boolean.FALSE);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.z.setCustomSelectionActionModeCallback(new ytf());
        KeyboardView keyboardView = (KeyboardView) findViewById(R.id.custom_number_keyboard);
        this.A = keyboardView;
        keyboardView.setOnDoneButtonClickListener(new xtf(this));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b() {
        this.A.E();
        EditText editText = this.z;
        editText.clearFocus();
        editText.setCursorVisible(false);
        a aVar = this.F;
        if (aVar != null) {
            aVar.k(editText.getText().toString().replaceFirst("^0*", ""));
        }
    }

    public final void c() {
        int i;
        boolean z = false;
        boolean z2 = this.H == 1;
        boolean z3 = this.K || this.L;
        boolean z4 = this.J && !(z2 && z3);
        int i2 = this.L ? 0 : 8;
        ProgressBar progressBar = this.B;
        progressBar.setVisibility(i2);
        int i3 = (!this.K || this.L) ? 8 : 0;
        LinearLayout linearLayout = this.C;
        linearLayout.setVisibility(i3);
        int i4 = z4 ? 0 : 8;
        TextView textView = this.i;
        textView.setVisibility(i4);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.t = -1;
        if (z2 || !z3) {
            i = R.id.stake;
        } else {
            i = this.L ? R.id.gift_progress_bar : R.id.gift_layout;
        }
        layoutParams.s = i;
        int i5 = R.id.match_number_end_guideline;
        layoutParams.u = z2 ? R.id.input_area_start_guideline : R.id.match_number_end_guideline;
        layoutParams.E = z2 ? 0.0f : 1.0f;
        layoutParams.setMarginStart(z2 ? bqe.b(12.0f, getContext()) : 0);
        layoutParams.setMarginEnd(z2 ? bqe.b(12.0f, getContext()) : 0);
        textView.setLayoutParams(layoutParams);
        boolean z5 = !z2 && z4;
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams2.u = z5 ? R.id.match_number : R.id.ksh_text;
        linearLayout.setLayoutParams(layoutParams2);
        if (!z2 && z4) {
            z = true;
        }
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) progressBar.getLayoutParams();
        if (z) {
            i5 = R.id.match_number;
        }
        layoutParams3.u = i5;
        progressBar.setLayoutParams(layoutParams3);
    }

    public int getAdditionalMsgHeight() {
        TextView textView = this.w;
        if (textView != null) {
            return textView.getHeight();
        }
        return 0;
    }

    public EditText getEditInput() {
        return this.z;
    }

    public String getInputData() {
        return ".".equals(this.z.getText().toString().trim()) ? "" : this.z.getText().toString();
    }

    public KeyboardView getKeyBoard() {
        return this.A;
    }

    public String getStakeText() {
        return this.f.getText().toString();
    }

    public int getStart() {
        return this.z.getSelectionStart();
    }

    public void setAdditionalMsg(CharSequence charSequence, int i) {
        this.w.setText(charSequence);
        if (i != 0) {
            this.w.setTextColor(i);
        } else {
            this.z.setActivated(false);
            this.w.setTextColor(getContext().getColor(R.color.text_disable_type1_primary));
        }
        this.w.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setBackgroundWarning(boolean z) {
        this.z.setActivated(z);
    }

    public void setGiftChecked(boolean z) {
        CheckBox checkBox = this.D;
        if (checkBox == null) {
            return;
        }
        this.I = true;
        checkBox.setChecked(z);
        this.I = false;
    }

    public void setGiftShow(boolean z) {
        this.K = z;
        c();
    }

    public void setGiftText(String str) {
        TextView textView = this.E;
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = sn5.c(this, R.string.gift__l_gift, new Object[0]);
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
    }

    public void setGoToDepositBtnVisibleOrGone(boolean z) {
        c8i0.o(this.y, z);
    }

    public void setInputData(String str) {
        if (this.z.getText().toString().equals(str)) {
            return;
        }
        this.z.setText(str);
    }

    public void setListener(a aVar) {
        this.F = aVar;
    }

    public void setMinStakeHint() {
        this.z.setHint(sn5.c(this, R.string.component_betslip__min_vstake, b6y.b(this.d.a())));
    }

    public void setNumberSingleText(long j) {
        TextView textView = this.i;
        if (j > 1) {
            textView.setText(sn5.c(this, R.string.component_betslip__num_bets, String.valueOf(j)));
            this.J = true;
            c();
        } else {
            textView.setText("");
            this.J = false;
            c();
        }
    }

    public void setNumberText(long j) {
        TextView textView = this.i;
        if (j == 0 || iu2.p()) {
            textView.setText("");
            this.J = false;
            c();
        } else {
            textView.setText(sn5.c(this, R.string.app_common__variable_x, Long.valueOf(j)));
            this.J = true;
            c();
        }
    }

    public void setQuickStakeToolStatus(int i) {
        this.G = i;
    }

    public void setRedBackground() {
        this.z.setActivated(true);
    }

    public void setStakeText(String str) {
        this.f.setText(str);
    }

    public EditTextWithKeyBoard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            a();
        }
        this.G = 1;
        this.H = 0;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
    }

    public EditTextWithKeyBoard(Context context) {
        super(context);
        if (!isInEditMode()) {
            a();
        }
        this.G = 1;
        this.H = 0;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
    }
}
