package com.sportygames.sportysoccer.widget;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.sportysoccer.activities.GameActivity;
import com.sportygames.sportysoccer.model.GameSessionBaseline;
import com.sportygames.sportysoccer.model.StakeData;
import com.sportygames.sportysoccer.virtualkeyboard.KeyboardView;
import com.sportygames.sportysoccer.widget.StakeLayout;
import defpackage.b3;
import defpackage.b5j;
import defpackage.c5j;
import defpackage.e5j;
import defpackage.f5j;
import defpackage.hpa0;
import defpackage.l4d;
import defpackage.qke;
import defpackage.xsd0;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class StakeLayout extends ConstraintLayout {
    public static final /* synthetic */ int S = 0;
    public TextView[] F;
    public TextView G;
    public TextView H;
    public GameActivity.c I;
    public HashMap<Integer, Integer> J;
    public List<StakeData> K;
    public KeyboardView L;
    public EditText M;
    public TextView N;
    public FullButtonLayout O;
    public GameSessionBaseline P;
    public float Q;
    public boolean R;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String string = charSequence.toString();
            int i4 = StakeLayout.S;
            StakeLayout stakeLayout = StakeLayout.this;
            stakeLayout.F(string);
            int length = charSequence.length();
            EditText editText = stakeLayout.M;
            if (length == 0) {
                editText.setTextSize(13.0f);
            } else {
                editText.setTextSize(23.0f);
            }
        }
    }

    public StakeLayout(Context context) {
        super(context);
        this.R = true;
    }

    private String getBetAmount() {
        return new DecimalFormat("0.##").format(Float.parseFloat(getStakeInputValue()));
    }

    private String getStakeInputValue() {
        return ".".equals(this.M.getText().toString().trim()) ? "" : this.M.getText().toString();
    }

    public final void E(Integer num) {
        String stakeInputValue = getStakeInputValue();
        this.M.setText(new DecimalFormat("0.##").format((TextUtils.isEmpty(stakeInputValue) ? 0.0f : Float.parseFloat(stakeInputValue)) + num.intValue()));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    public final void F(String str) {
        float f;
        String string;
        boolean z;
        if (this.P == null) {
            this.O.setEnabled(false);
            this.N.setVisibility(4);
            return;
        }
        try {
            f = Float.parseFloat(str);
        } catch (Exception unused) {
            f = -1.0f;
        }
        if (f > this.Q) {
            string = getContext().getString(R.string.sg_sporty_soccer_please_enter_a_value_less_than_your_balance);
        } else {
            GameSessionBaseline gameSessionBaseline = this.P;
            if (f <= gameSessionBaseline.maxStake) {
                if (f < gameSessionBaseline.minStake) {
                    string = getContext().getString(R.string.sg_component_betslip_please_enter_a_value_no_less_than_vmount, String.format(Locale.US, "%,.0f", BigDecimal.valueOf(this.P.minStake)));
                } else {
                    string = "";
                    z = true;
                }
                if (!z) {
                    this.N.setText(string);
                }
                this.O.setEnabled(z);
                this.N.setVisibility(z ? 4 : 0);
            }
            string = getContext().getString(R.string.sg_sporty_soccer_the_stake_cannot_exceed, String.format(Locale.US, "%,.0f", BigDecimal.valueOf(this.P.maxStake)));
        }
        z = false;
        if (!z) {
            this.N.setText(string);
        }
        this.O.setEnabled(z);
        this.N.setVisibility(z ? 4 : 0);
    }

    public final void G() {
        if (this.I == null || this.P == null) {
            return;
        }
        String stakeInputValue = getStakeInputValue();
        final float f = TextUtils.isEmpty(stakeInputValue) ? 0.0f : Float.parseFloat(stakeInputValue) * this.P.getPayout();
        final GameActivity.c cVar = this.I;
        final String betAmount = getBetAmount();
        cVar.getClass();
        GameActivity gameActivity = GameActivity.this;
        final Dialog dialog = new Dialog(gameActivity.F);
        hpa0 hpa0Var = gameActivity.B;
        if (hpa0Var != null) {
            hpa0Var.a(120, false, false);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: mhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameActivity.c cVar2 = cVar;
                GameActivity gameActivity2 = GameActivity.this;
                gameActivity2.G = false;
                hpa0 hpa0Var2 = gameActivity2.B;
                if (hpa0Var2 != null) {
                    hpa0Var2.b();
                }
                dialog.dismiss();
                if (cVar2.b) {
                    return;
                }
                StakeLayout stakeLayout = gameActivity2.v;
                if (stakeLayout.L.getVisibility() == 0) {
                    stakeLayout.L.setVisibility(8);
                }
                cVar2.b = true;
                cVar2.a = true;
                lmj lmjVar = gameActivity2.z;
                lmjVar.getClass();
                lmjVar.f = Collections.singletonList(Float.valueOf(f));
                lmjVar.h.f(betAmount, lmjVar);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: nhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameActivity.c cVar2 = cVar;
                cVar2.getClass();
                dialog.dismiss();
                hpa0 hpa0Var2 = GameActivity.this.B;
                if (hpa0Var2 != null) {
                    hpa0Var2.b();
                }
            }
        };
        GameActivity gameActivity2 = gameActivity.F;
        qke.a(gameActivity2.getString(R.string.sg_common_functions__ok), gameActivity2.getString(R.string.sg_common_functions__cancel), gameActivity2.getString(R.string.sg_sporty_soccer_bet_confirm), gameActivity2.getString(R.string.sg_sporty_soccer_place_bet, SportyGamesManager.getInstance().getCountryCurrency().trim() + " ", betAmount), onClickListener, onClickListener2, true, dialog, R.drawable.sg_pos_dia_bg, onClickListener2, 0);
    }

    public final void H() {
        float payout;
        String stakeInputValue = getStakeInputValue();
        if (TextUtils.isEmpty(stakeInputValue)) {
            this.H.setText("- - -");
            return;
        }
        if (TextUtils.isEmpty(stakeInputValue)) {
            payout = 0.0f;
        } else {
            float f = Float.parseFloat(stakeInputValue);
            GameSessionBaseline gameSessionBaseline = this.P;
            payout = f * (gameSessionBaseline == null ? 1.0f : gameSessionBaseline.getPayout());
        }
        this.H.setText(b3.K(String.valueOf(Float.valueOf(payout))));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.G = (TextView) findViewById(R.id.balance);
        this.H = (TextView) findViewById(R.id.ss_stake_next_win_amount);
        ((ImageView) findViewById(R.id.back_button)).setOnClickListener(new View.OnClickListener() { // from class: vsd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = StakeLayout.S;
                GameActivity.c cVar = this.a.I;
                if (cVar != null) {
                    GameActivity.this.finish();
                }
            }
        });
        TextView[] textViewArr = {(TextView) findViewById(R.id.bet_coin_1), (TextView) findViewById(R.id.bet_coin_2), (TextView) findViewById(R.id.bet_coin_3)};
        this.F = textViewArr;
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= 3) {
                FullButtonLayout fullButtonLayout = (FullButtonLayout) findViewById(R.id.btn_place_bet);
                this.O = fullButtonLayout;
                fullButtonLayout.a.setText(getResources().getString(R.string.sg_component_betslip_place_bet));
                this.O.setOnClickListener(new c5j(this, i2));
                this.J = new HashMap<>();
                KeyboardView keyboardView = (KeyboardView) findViewById(R.id.custom_number_keyboard);
                this.L = keyboardView;
                keyboardView.setOnKeyBoardClickListener(new xsd0(this, keyboardView.getDatas()));
                keyboardView.setVisibility(8);
                keyboardView.setOnDoneButtonClickListener(new f5j(this, 2));
                EditText editText = (EditText) findViewById(R.id.ed_stakes_input);
                this.M = editText;
                editText.setInputType(0);
                EditText editText2 = this.M;
                l4d l4dVar = new l4d();
                l4dVar.a = Pattern.compile("[0-9]{0,5}+((\\.[0-9]{0,1})?)||(\\.)?");
                editText2.setFilters(new InputFilter[]{l4dVar});
                this.M.setOnTouchListener(new View.OnTouchListener() { // from class: wsd0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int i3 = StakeLayout.S;
                        if (motionEvent.getAction() == 1) {
                            StakeLayout stakeLayout = this.a;
                            if (stakeLayout.L.getVisibility() == 0) {
                                return false;
                            }
                            stakeLayout.L.setVisibility(0);
                        }
                        return false;
                    }
                });
                this.M.addTextChangedListener(new a());
                findViewById(R.id.btn_clear).setOnClickListener(new e5j(this, i2));
                this.N = (TextView) findViewById(R.id.tv_error_msg);
                this.F[0].setBackgroundResource(R.drawable.sg_chip_yellow);
                this.F[1].setBackgroundResource(R.drawable.sg_chip_red);
                this.F[2].setBackgroundResource(R.drawable.sg_chip_blue);
                return;
            }
            textViewArr[i].setOnClickListener(new b5j(this, i2));
            i++;
        }
    }

    public void setPayoutBaseline(GameSessionBaseline gameSessionBaseline) {
        if (gameSessionBaseline.isValid) {
            this.P = gameSessionBaseline;
            this.M.setHint(getContext().getString(R.string.sg_common_functions_spr_min_money, String.valueOf(this.P.minStake)));
            TextView textView = (TextView) findViewById(R.id.tv_currency);
            textView.setText(SportyGamesManager.getInstance().getCountryCurrency());
            textView.setVisibility(0);
            F(getStakeInputValue());
            if (this.R) {
                this.M.setText("");
                H();
                E(Integer.valueOf(this.P.defaultStake));
                H();
                this.R = false;
            }
        }
    }

    public StakeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = true;
    }

    public StakeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.R = true;
    }
}
