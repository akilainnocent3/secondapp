package com.sportybet.plugin.myfavorite.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.widget.DefaultStakeLayout;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;
import defpackage.a8b;
import defpackage.b6y;
import defpackage.hrd0;
import defpackage.m4d;
import defpackage.ppl;
import defpackage.rgd;
import defpackage.sn5;
import defpackage.yrh0;

/* JADX INFO: loaded from: classes6.dex */
public class DefaultStakeLayout extends ppl {
    public static final /* synthetic */ int z = 0;
    public TextView c;
    public EditText d;
    public View e;
    public KeyboardView f;
    public RelativeLayout i;
    public hrd0 v;
    public final Drawable w;
    public final Drawable y;

    public class a implements KeyboardView.b {
        public a() {
        }

        @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
        public final void a() {
        }

        @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
        public final void b() {
        }

        @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
        public final void c() {
            DefaultStakeLayout defaultStakeLayout = DefaultStakeLayout.this;
            defaultStakeLayout.d.setText((CharSequence) null);
            defaultStakeLayout.b(null, false);
        }
    }

    public DefaultStakeLayout(Context context) {
        super(context);
        if (!isInEditMode()) {
            a();
        }
        this.w = getContext().getDrawable(R.drawable.my_stake_bg);
        this.y = getContext().getDrawable(R.drawable.my_stake_error_bg);
    }

    public final void b(String str, boolean z2) {
        this.c.setText(str);
        this.c.setVisibility(z2 ? 0 : 8);
        this.i.setBackground(z2 ? this.y : this.w);
    }

    public final void c() {
        this.e.setVisibility(8);
        this.f.E();
        this.d.clearFocus();
    }

    public final boolean d() {
        String stake = getStake();
        if (TextUtils.isEmpty(stake)) {
            c();
            return true;
        }
        if (stake.endsWith(".") && stake.length() > 1) {
            stake = stake.substring(0, stake.indexOf("."));
            this.d.setText(stake);
        }
        String str = "0";
        if (stake.startsWith(".") && stake.length() > 1) {
            stake = "0".concat(stake);
            this.d.setText(stake);
        }
        if (stake.startsWith(".") && stake.length() == 1) {
            this.d.setText("0");
        } else {
            str = stake;
        }
        double d = Double.parseDouble(str);
        StakeConfig stakeConfigY = this.v.y();
        if (d > stakeConfigY.getMaxStake().doubleValue()) {
            b(sn5.c(this, R.string.component_betslip__default_stake_cannot_exceed, a8b.e() + " " + b6y.b(stakeConfigY.getMaxStake())), true);
            return false;
        }
        if (d >= stakeConfigY.getMinStake().doubleValue()) {
            b(null, false);
            c();
            return true;
        }
        b(sn5.c(this, R.string.component_betslip__default_stake_cannot_be_less_than, a8b.e() + " " + b6y.b(stakeConfigY.getMinStake())), true);
        return false;
    }

    public String getStake() {
        EditText editText = this.d;
        if (editText == null) {
            return "";
        }
        if (!TextUtils.isEmpty(editText.getText())) {
            String string = this.d.getText().toString();
            AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
            if (string.matches("-?\\d+(\\.\\d+)?")) {
                return this.d.getText().toString();
            }
        }
        this.d.setText("");
        return "";
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.currency);
        this.c = (TextView) findViewById(R.id.err_msg);
        this.d = (EditText) findViewById(R.id.input_stake);
        this.e = findViewById(R.id.keyboard_container);
        this.f = (KeyboardView) findViewById(R.id.custom_number_keyboard);
        this.i = (RelativeLayout) findViewById(R.id.edit_container);
        textView.setText(a8b.e() + ":");
        this.f.setOnDoneButtonClickListener(new rgd(this, 0));
        this.f.setOnValueChangeListener(new a());
        StakeConfig stakeConfigY = this.v.y();
        this.d.setFilters(new InputFilter[]{new m4d(String.valueOf(stakeConfigY.getMaxStake()).length())});
        this.d.setHint(sn5.c(this, R.string.component_betslip__min_vstake, b6y.b(stakeConfigY.getMinStake())));
        this.d.setShowSoftInputOnFocus(false);
        this.d.setOnTouchListener(new View.OnTouchListener() { // from class: sgd
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = DefaultStakeLayout.z;
                DefaultStakeLayout defaultStakeLayout = this.a;
                EditText editText = defaultStakeLayout.d;
                editText.setSelection(editText.getText().length());
                defaultStakeLayout.d.requestFocus();
                defaultStakeLayout.e.setVisibility(0);
                defaultStakeLayout.f.L(defaultStakeLayout.d, 2);
                return false;
            }
        });
    }

    public void setDefaultStake(String str) {
        this.d.setText(str);
    }

    public DefaultStakeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            a();
        }
        this.w = getContext().getDrawable(R.drawable.my_stake_bg);
        this.y = getContext().getDrawable(R.drawable.my_stake_error_bg);
    }

    public DefaultStakeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = getContext().getDrawable(R.drawable.my_stake_bg);
        this.y = getContext().getDrawable(R.drawable.my_stake_error_bg);
    }
}
