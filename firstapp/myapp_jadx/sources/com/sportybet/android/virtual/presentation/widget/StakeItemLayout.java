package com.sportybet.android.virtual.presentation.widget;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout;
import com.sportybet.android.virtual.presentation.widget.StakeItemLayout;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;
import defpackage.bjb0;
import defpackage.dsd0;
import defpackage.i5s;
import defpackage.izw;
import defpackage.m4d;
import defpackage.n4p;
import defpackage.o4p;
import defpackage.r4m;
import defpackage.sn5;
import defpackage.sqo;
import defpackage.uy0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class StakeItemLayout extends r4m {
    public static final /* synthetic */ int D = 0;
    public n4p A;
    public uy0 B;
    public i5s C;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final EditText i;
    public final KeyboardView v;
    public InstantWinFooterLayout.a w;
    public int y;
    public String z;

    public class a implements KeyboardView.b {
        public a() {
        }

        @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
        public final void a() {
            int i = StakeItemLayout.D;
            StakeItemLayout.this.e();
        }

        @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
        public final void b() {
            int i = StakeItemLayout.D;
            StakeItemLayout.this.e();
        }

        @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
        public final void c() {
            int i = StakeItemLayout.D;
            StakeItemLayout.this.e();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            StakeItemLayout stakeItemLayout = StakeItemLayout.this;
            String string = stakeItemLayout.i.getText().toString();
            stakeItemLayout.g();
            InstantWinFooterLayout.a aVar = stakeItemLayout.w;
            if (aVar != null) {
                aVar.T(stakeItemLayout.y, string, false);
            }
            stakeItemLayout.b(false);
            izw.a.a().d(true);
        }
    }

    public StakeItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((dsd0) generatedComponent()).e(this);
        }
        View.inflate(context, R.layout.iwqk_stake_item, this);
        setOrientation(1);
        this.c = (TextView) findViewById(R.id.title);
        this.d = (TextView) findViewById(R.id.currency);
        this.f = (TextView) findViewById(R.id.number);
        this.e = (TextView) findViewById(R.id.msg);
        this.i = (EditText) findViewById(R.id.edit_text);
        this.v = (KeyboardView) findViewById(R.id.custom_number_keyboard);
    }

    private String getInputData() {
        return ".".equals(this.i.getText().toString().trim()) ? "" : this.i.getText().toString();
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.C.a(getContext(), getInputData(), this.B.c(), this.z));
    }

    public final void b(boolean z) {
        if (!z) {
            g();
        } else if (!a()) {
            this.e.setVisibility(this.y > 0 ? 0 : 8);
            this.i.setActivated(false);
        }
        this.v.E();
        this.i.clearFocus();
        this.i.setCursorVisible(false);
    }

    public final boolean c() {
        if (!TextUtils.isEmpty(getInputData())) {
            return false;
        }
        this.i.setActivated(false);
        this.e.setVisibility(8);
        return true;
    }

    public final void d(int i, String str) {
        TextView textView = this.e;
        textView.setText(str);
        if (i != 0) {
            textView.setTextColor(i);
        } else {
            this.i.setActivated(false);
            textView.setTextColor(getContext().getColor(R.color.text_type1_secondary));
        }
        textView.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public final void e() {
        d(0, "");
        String string = this.i.getText().toString();
        g();
        InstantWinFooterLayout.a aVar = this.w;
        if (aVar != null) {
            aVar.T(this.y, string, false);
        }
    }

    public final void f(o4p o4pVar) {
        String strL;
        int i = this.y;
        TextView textView = this.e;
        if (i > 0) {
            o4p.d dVar = o4pVar.i.get(i);
            BigDecimal bigDecimal = dVar.a;
            BigDecimal bigDecimal2 = dVar.b;
            BigDecimal bigDecimal3 = this.A.l;
            BigDecimal bigDecimal4 = sqo.a;
            BigDecimal bigDecimalMin = bigDecimal.min(bigDecimal3);
            BigDecimal bigDecimalMin2 = bigDecimal2.min(bigDecimal3);
            if (bigDecimalMin.compareTo(bigDecimalMin2) == 0 || bigDecimalMin.compareTo(BigDecimal.ZERO) == 0) {
                strL = bjb0.L(bigDecimalMin2, Locale.US);
            } else {
                Locale locale = Locale.US;
                strL = bjb0.L(bigDecimalMin, locale) + " ~ " + bjb0.L(bigDecimalMin2, locale);
            }
            textView.setText(sn5.c(this, R.string.page_instant_virtual__to_win, strL));
            textView.setTextColor(getContext().getColor(R.color.text_type1_secondary));
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        this.i.setActivated(false);
    }

    public final void g() {
        String strA = this.C.a(getContext(), getInputData(), this.B.c(), this.z);
        boolean zIsEmpty = TextUtils.isEmpty(strA);
        EditText editText = this.i;
        if (!zIsEmpty) {
            editText.setActivated(true);
            d(getContext().getColor(R.color.warning_primary), strA);
        } else {
            editText.setActivated(false);
            this.e.setTextColor(getContext().getColor(R.color.text_type1_secondary));
        }
    }

    public final void h(String str) {
        if (TextUtils.equals(str, "0")) {
            String inputData = getInputData();
            if (!TextUtils.isEmpty(inputData)) {
                try {
                    if (Double.parseDouble(inputData) > 0.0d) {
                        return;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            str = "";
        }
        EditText editText = this.i;
        editText.setText(str);
        if (str != null) {
            editText.setSelection(str.length());
        }
    }

    public void setData(String str, String str2, String str3, String str4, int i, o4p o4pVar, InstantWinFooterLayout.a aVar) {
        this.z = o4pVar.a;
        this.c.setText(str);
        this.d.setText(str2);
        EditText editText = this.i;
        editText.setText(str3);
        TextView textView = this.f;
        textView.setText(str4);
        textView.setVisibility(TextUtils.isEmpty(str4) ? 8 : 0);
        this.y = i;
        this.w = aVar;
        editText.setFilters(new InputFilter[]{new m4d(String.valueOf(this.A.k).length())});
        editText.setHint(sn5.c(this, R.string.component_betslip__min_vstake, bjb0.Z(this.A.j, RoundingMode.CEILING)));
        editText.setCursorVisible(false);
        editText.setLongClickable(false);
        editText.setTextIsSelectable(false);
        editText.setImeOptions(268435456);
        if (TextUtils.equals(str3, "0")) {
            str3 = "";
        }
        editText.setText(str3);
        editText.setInputType(0);
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: bsd0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i2 = StakeItemLayout.D;
                StakeItemLayout stakeItemLayout = this.a;
                stakeItemLayout.v.N(stakeItemLayout.A);
                stakeItemLayout.v.L(stakeItemLayout.i, 3);
                stakeItemLayout.i.requestFocus();
                stakeItemLayout.i.setCursorVisible(true);
                if (motionEvent.getActionMasked() == 1) {
                    stakeItemLayout.i.post(new csd0(stakeItemLayout));
                }
                InstantWinFooterLayout.a aVar2 = stakeItemLayout.w;
                if (aVar2 == null) {
                    return false;
                }
                aVar2.J(stakeItemLayout.y);
                return false;
            }
        });
        a aVar2 = new a();
        KeyboardView keyboardView = this.v;
        keyboardView.setOnValueChangeListener(aVar2);
        keyboardView.setOnDoneButtonClickListener(new b());
        keyboardView.E();
        editText.clearFocus();
        editText.setCursorVisible(false);
    }

    public StakeItemLayout(Context context) {
        this(context, null);
    }

    public StakeItemLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
