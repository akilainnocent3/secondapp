package com.sportybet.android.cashoutphase3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.cashoutphase3.AutoCashoutSettingView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.CashOut;
import com.sportybet.plugin.realsports.widget.DancingNumber2;
import defpackage.b6y;
import defpackage.c8i0;
import defpackage.hrd0;
import defpackage.itf0;
import defpackage.iwh0;
import defpackage.jc1;
import defpackage.pl6;
import defpackage.rc1;
import defpackage.rrh0;
import defpackage.sn5;
import defpackage.yll;
import defpackage.yrh0;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class AutoCashoutSettingView extends yll {
    public static final /* synthetic */ int M = 0;
    public DancingNumber2 A;
    public TextView B;
    public SeekBar C;
    public TextView D;
    public TextView E;
    public EditText F;
    public View G;
    public KeyboardView H;
    public View I;
    public BigDecimal J;
    public boolean K;
    public TextView L;
    public hrd0 c;
    public pl6 d;
    public int e;
    public View f;
    public View i;
    public View v;
    public TextView w;
    public TextView y;
    public TextView z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(AutoCashoutSettingView.this.getContext());
            aVar.a(R.string.cashout__partial_cashout_rule);
            aVar.setPositiveButton(R.string.common_functions__ok, null).f();
        }
    }

    public class b implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ e a;
        public final /* synthetic */ pl6 b;

        public b(e eVar, pl6 pl6Var) {
            this.a = eVar;
            this.b = pl6Var;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                AutoCashoutSettingView autoCashoutSettingView = AutoCashoutSettingView.this;
                autoCashoutSettingView.e = i;
                TextView textView = autoCashoutSettingView.y;
                if (i != 1000000) {
                    Context context = autoCashoutSettingView.getContext();
                    BigDecimal minCashout = autoCashoutSettingView.c.y().getMinCashout();
                    DecimalFormat decimalFormat = b6y.a;
                    double dDoubleValue = minCashout.doubleValue();
                    DecimalFormat decimalFormat2 = b6y.a;
                    textView.setText(sn5.b(context, R.string.cashout__min_vmin, decimalFormat2.format(dDoubleValue)));
                    autoCashoutSettingView.z.setText(sn5.b(autoCashoutSettingView.getContext(), R.string.cashout__max_vmax, decimalFormat2.format(new BigDecimal(autoCashoutSettingView.F.getText().toString()).doubleValue())));
                } else {
                    textView.setText("");
                    autoCashoutSettingView.z.setText("");
                }
                e eVar = this.a;
                if (eVar != null) {
                    eVar.d(autoCashoutSettingView.e);
                }
                autoCashoutSettingView.d(this.b.a.cashOut, false);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public class c implements KeyboardView.b {
        public c() {
        }

        @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
        public final void a() {
            int i = AutoCashoutSettingView.M;
            AutoCashoutSettingView.this.h();
        }

        @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
        public final void b() {
            int i = AutoCashoutSettingView.M;
            AutoCashoutSettingView.this.h();
        }

        @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
        public final void c() {
            int i = AutoCashoutSettingView.M;
            AutoCashoutSettingView.this.h();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = AutoCashoutSettingView.M;
            AutoCashoutSettingView autoCashoutSettingView = AutoCashoutSettingView.this;
            autoCashoutSettingView.h();
            autoCashoutSettingView.G.setVisibility(8);
            autoCashoutSettingView.H.E();
            autoCashoutSettingView.F.clearFocus();
            autoCashoutSettingView.F.setCursorVisible(false);
            autoCashoutSettingView.F.setBackgroundResource(R.drawable.spr_bg_input_normal);
        }
    }

    public interface e {
        void a(pl6 pl6Var, boolean z);

        void b();

        void d(int i);
    }

    public AutoCashoutSettingView(Context context) {
        super(context);
        if (!isInEditMode()) {
            a();
        }
        this.e = CashOut.BIG_NUMBER;
    }

    public final void b(boolean z) {
        boolean z2 = this.d.a.isFallbackCashOut;
        this.v.setVisibility((z2 || z) ? 8 : 0);
        if (z2) {
            this.e = CashOut.BIG_NUMBER;
            this.C.setProgress(CashOut.BIG_NUMBER);
        }
    }

    public final boolean c(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        if (bigDecimal.compareTo(bigDecimal2) == 0) {
            this.F.setBackgroundResource(R.drawable.spr_bg_input_invalid);
            this.E.setText(sn5.c(this, R.string.cashout__please_enter_a_value_not_equal_to_current_offer, new Object[0]));
            this.E.setVisibility(0);
            return false;
        }
        if (bigDecimal.compareTo(bigDecimal3) > 0) {
            this.F.setBackgroundResource(R.drawable.spr_bg_input_invalid);
            this.E.setText(sn5.c(this, R.string.common_feedback__the_value_cannot_exceed_vmax, b6y.b(bigDecimal3)));
            this.E.setVisibility(0);
            return false;
        }
        if (bigDecimal.compareTo(bigDecimal4) >= 0) {
            return true;
        }
        this.F.setBackgroundResource(R.drawable.spr_bg_input_invalid);
        this.E.setText(sn5.c(this, R.string.component_betslip__please_enter_a_value_no_less_than_vmount, b6y.b(bigDecimal4)));
        this.E.setVisibility(0);
        return false;
    }

    public final void d(CashOut cashOut, boolean z) {
        boolean zEquals = cashOut.getAutoCashOutAmount(this.e).setScale(2).equals(new BigDecimal(cashOut.mMaxAutoCashOutAmount).setScale(2));
        DancingNumber2 dancingNumber2 = this.A;
        if (zEquals) {
            dancingNumber2.setPlainText(sn5.c(this, R.string.cashout__full_cashout, new Object[0]).concat(sn5.c(this, R.string.app_common__blank_space, new Object[0])));
        } else {
            dancingNumber2.setNumber(sn5.c(this, R.string.cashout__partial_cashout, new Object[0]).concat(sn5.c(this, R.string.app_common__blank_space, new Object[0])), cashOut.getAutoCashOutAmount(this.e).setScale(2).toString(), z);
        }
    }

    public final void e() {
        this.F.setBackgroundResource(R.drawable.spr_bg_input_green);
    }

    public final void f() {
        Bet bet = this.d.a;
        this.w.setText(sn5.c(this, R.string.cashout__current_offer_voffer, jc1.b(this.J.toPlainString())));
        this.B.setText(sn5.c(this, R.string.cashout__create_rule, new Object[0]));
        this.B.setEnabled(false);
        int i = bet.combinationNum;
        TextView textView = this.D;
        if (i > 1) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        CashOut cashOut = bet.cashOut;
        if (!cashOut.isSupportPartial || cashOut.remainCount <= 0) {
            b(true);
            this.v.setVisibility(8);
            if (!bet.cashOut.isCashoutAvailable()) {
                this.A.setPlainText(sn5.c(this, R.string.cashout__auto_cashout_unavailable, new Object[0]));
                g(8, false);
                this.f.setVisibility(4);
                this.i.setVisibility(4);
                return;
            }
            if (TextUtils.isEmpty(this.F.getText().toString())) {
                this.E.setVisibility(8);
                e();
                return;
            } else {
                d(bet.cashOut, this.K);
                g(0, true);
                this.f.setVisibility(0);
                this.i.setVisibility(0);
                return;
            }
        }
        b(false);
        if (!bet.cashOut.isCashoutAvailable()) {
            this.A.setPlainText(sn5.c(this, R.string.cashout__auto_cashout_unavailable, new Object[0]));
            this.v.setVisibility(8);
            g(8, false);
            this.f.setVisibility(4);
            this.i.setVisibility(4);
            return;
        }
        String string = this.F.getText().toString();
        if (TextUtils.isEmpty(string)) {
            this.E.setVisibility(8);
            e();
            return;
        }
        BigDecimal bigDecimal = TextUtils.equals(".", string) ? BigDecimal.ZERO : new BigDecimal(string);
        StakeConfig stakeConfigY = this.c.y();
        if (!c(bigDecimal, this.J, new BigDecimal(this.d.a.remainPotentialWinnings).min(stakeConfigY.getMaxCashout()), stakeConfigY.getMinCashout())) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT);
            aVar.a("CashOut amount: %s %s", bigDecimal, this.J);
            return;
        }
        this.E.setVisibility(8);
        e();
        d(bet.cashOut, this.K);
        this.C.setEnabled(true);
        this.C.setProgress(this.e);
        g(0, true);
        this.z.setText(sn5.c(this, R.string.cashout__max_vmax, jc1.b(string)));
        this.d.a.cashOut.setMaxAutoCashOutAmount(string);
        this.f.setVisibility(0);
        this.i.setVisibility(0);
    }

    public final void g(int i, boolean z) {
        this.B.setEnabled(z);
        this.L.setVisibility(i);
    }

    public final void h() {
        String string = this.F.getText().toString();
        if (TextUtils.isEmpty(string)) {
            this.E.setVisibility(8);
            e();
        } else {
            BigDecimal bigDecimal = TextUtils.equals(".", string) ? BigDecimal.ZERO : new BigDecimal(string);
            StakeConfig stakeConfigY = this.c.y();
            BigDecimal bigDecimalMin = new BigDecimal(this.d.a.remainPotentialWinnings).min(stakeConfigY.getMaxCashout());
            BigDecimal minCashout = stakeConfigY.getMinCashout();
            if (c(bigDecimal, this.J, bigDecimalMin, minCashout)) {
                if (this.d.a.cashOut.isSupportPartial) {
                    this.v.setVisibility(bigDecimal.compareTo(minCashout) > 0 ? 0 : 8);
                }
                if (this.d.a.isFallbackCashOut) {
                    this.v.setVisibility(8);
                }
                this.E.setVisibility(8);
                e();
                this.d.a.cashOut.setMaxAutoCashOutAmount(string);
                this.C.setEnabled(true);
                this.C.setProgress(this.e);
                g(0, true);
                d(this.d.a.cashOut, false);
                this.z.setText(sn5.c(this, R.string.cashout__max_vmax, jc1.b(string)));
                return;
            }
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT);
            aVar.a("CashOut amount: %s %s", bigDecimal, this.J);
        }
        this.d.a.cashOut.setMaxAutoCashOutAmount(this.c.y().getMaxCashout().toPlainString());
        this.C.setEnabled(false);
        this.e = CashOut.BIG_NUMBER;
        this.C.setProgress(CashOut.BIG_NUMBER);
        g(8, false);
        this.y.setText("");
        this.z.setText("");
        d(this.d.a.cashOut, false);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.A = (DancingNumber2) findViewById(R.id.spr_cash_out_auto_middle);
        this.B = (TextView) findViewById(R.id.spr_cash_out_auto_cash_out);
        this.f = findViewById(R.id.spr_cash_out_auto_info_container);
        this.i = findViewById(R.id.spr_cash_ot_auto_divider_line);
        this.C = (SeekBar) findViewById(R.id.spr_cash_out_auto_seek);
        this.y = (TextView) findViewById(R.id.spr_cash_out_auto_min);
        this.z = (TextView) findViewById(R.id.spr_cash_out_auto_max);
        this.w = (TextView) findViewById(R.id.current_reach_value);
        this.v = findViewById(R.id.spr_cash_out_auto_seek_container);
        this.D = (TextView) findViewById(R.id.spr_cash_out_auto_no_p_why);
        this.F = (EditText) findViewById(R.id.amount_edit_text);
        this.E = (TextView) findViewById(R.id.error_msg);
        this.G = findViewById(R.id.keyboard_container);
        this.H = (KeyboardView) findViewById(R.id.custom_number_keyboard);
        this.I = findViewById(R.id.auto_cashout_tip_icon);
        this.L = (TextView) findViewById(R.id.tax_msg);
        this.H.setOnValueChangeListener(new c());
        this.H.setOnDoneButtonClickListener(new d());
    }

    public void setup(final pl6 pl6Var, final e eVar, TaxConfig taxConfig, boolean z) {
        this.d = pl6Var;
        this.K = z;
        int i = 0;
        if (taxConfig != null && taxConfig.hasRate()) {
            this.L.setText(taxConfig.isNetType() ? R.string.cashout__star_cashout_winnings_exceeding_origin_stake : R.string.cashout__star_all_cashout_is_considered_a_win);
            this.L.setVisibility(this.B.isEnabled() ? 0 : 8);
        }
        boolean zIsCashoutAvailable = pl6Var.a.cashOut.isCashoutAvailable();
        StakeConfig stakeConfigY = this.c.y();
        EditText editText = this.F;
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(stakeConfigY.getMaxCashout().toPlainString().length());
        AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
        editText.setFilters(new InputFilter[]{lengthFilter, new rrh0()});
        this.F.setHint(sn5.c(this, R.string.cashout__min_vmin, b6y.b(stakeConfigY.getMinCashout())));
        this.F.setCursorVisible(false);
        this.F.setLongClickable(false);
        this.F.setTextIsSelectable(false);
        this.F.setImeOptions(268435456);
        this.F.setText("");
        this.F.setInputType(0);
        this.F.setBackgroundResource(R.drawable.spr_bg_input_normal);
        EditText editText2 = this.F;
        if (zIsCashoutAvailable) {
            editText2.setOnTouchListener(new View.OnTouchListener() { // from class: sc1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int i2 = AutoCashoutSettingView.M;
                    final AutoCashoutSettingView autoCashoutSettingView = this.a;
                    autoCashoutSettingView.G.setVisibility(0);
                    autoCashoutSettingView.H.L(autoCashoutSettingView.F, 1);
                    autoCashoutSettingView.F.requestFocus();
                    autoCashoutSettingView.e();
                    autoCashoutSettingView.F.setCursorVisible(true);
                    if (motionEvent.getActionMasked() != 1) {
                        return false;
                    }
                    autoCashoutSettingView.F.post(new Runnable() { // from class: tc1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = AutoCashoutSettingView.M;
                            EditText editText3 = autoCashoutSettingView.F;
                            editText3.setSelection(editText3.getText().length());
                        }
                    });
                    return false;
                }
            });
        } else {
            editText2.setOnTouchListener(null);
        }
        h();
        this.G.setVisibility(8);
        this.H.E();
        this.F.clearFocus();
        this.F.setCursorVisible(false);
        this.F.setBackgroundResource(R.drawable.spr_bg_input_normal);
        this.J = pl6Var.a.cashOut.getMaxCashOutAmount(BigDecimal.ZERO);
        this.C.setMax(CashOut.BIG_NUMBER);
        this.D.setCompoundDrawablesWithIntrinsicBounds(iwh0.a(getContext(), R.drawable.spr_ic_info_blue_24dp, getContext().getColor(R.color.brand_secondary)), (Drawable) null, (Drawable) null, (Drawable) null);
        this.D.setOnClickListener(new a());
        this.C.setOnSeekBarChangeListener(new b(eVar, pl6Var));
        f();
        c8i0.b(this.B, 500L, new Function1() { // from class: qc1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = AutoCashoutSettingView.M;
                AutoCashoutSettingView.e eVar2 = eVar;
                if (eVar2 == null) {
                    return null;
                }
                eVar2.a(pl6Var, this.a.e != 1000000);
                return null;
            }
        });
        c8i0.b(this.I, 500L, new rc1(eVar, i));
    }

    public AutoCashoutSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            a();
        }
        this.e = CashOut.BIG_NUMBER;
    }

    public AutoCashoutSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = CashOut.BIG_NUMBER;
    }
}
