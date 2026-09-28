package com.sportybet.android.virtual.presentation.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.NextButtonLayout;
import com.sportybet.android.virtual.presentation.adapter.BetslipAdapter;
import com.sportybet.android.virtual.presentation.component.BetslipViewHolder;
import com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.a78;
import defpackage.bjb0;
import defpackage.bmo;
import defpackage.bq3;
import defpackage.bqe;
import defpackage.gky;
import defpackage.j7g;
import defpackage.ji2;
import defpackage.jp3;
import defpackage.jpk;
import defpackage.m4d;
import defpackage.m780;
import defpackage.n4p;
import defpackage.o4p;
import defpackage.r4p;
import defpackage.s0b;
import defpackage.sn5;
import defpackage.sqo;
import defpackage.tlo;
import defpackage.uy0;
import defpackage.y03;
import defpackage.zch0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Locale;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public class BetslipViewHolder extends BaseViewHolder {
    private final EditText amount;
    private final TextView awayTeam;
    private final View betSlipItem;
    private final View bottomLine;
    private final LinearLayout delete;
    private final TextView homeTeam;
    private final KeyboardView keyboardView;
    private final TextView marketTitle;
    private final TextView odds;
    private final TextView oddsDesc;
    private final ImageView sportsIcon;
    private final TextView warningMsg;

    public class a implements KeyboardView.b {
        public final /* synthetic */ bq3 a;
        public final /* synthetic */ uy0 b;
        public final /* synthetic */ tlo c;
        public final /* synthetic */ jpk d;

        public a(bq3 bq3Var, uy0 uy0Var, tlo tloVar, jpk jpkVar) {
            this.a = bq3Var;
            this.b = uy0Var;
            this.c = tloVar;
            this.d = jpkVar;
        }

        @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
        public final void a() {
            BetslipViewHolder.this.showAmount(this.a, true, this.b, this.c, this.d);
        }

        @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
        public final void b() {
            BetslipViewHolder.this.showAmount(this.a, true, this.b, this.c, this.d);
        }

        @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView.b
        public final void c() {
            BetslipViewHolder.this.showAmount(this.a, false, this.b, this.c, this.d);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ View a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public b(View view, int i, int i2) {
            this.a = view;
            this.b = i;
            this.c = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            final View view = this.a;
            final int i = this.b;
            final int i2 = this.c;
            view.postDelayed(new Runnable() { // from class: xz3
                @Override // java.lang.Runnable
                public final void run() {
                    ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
                    valueAnimatorOfObject.setDuration(500L);
                    final View view2 = view;
                    valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yz3
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            view2.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    });
                    valueAnimatorOfObject.start();
                }
            }, 3000L);
        }
    }

    public BetslipViewHolder(View view) {
        super(view);
        this.oddsDesc = (TextView) view.findViewById(R.id.match_outcome_desc);
        this.marketTitle = (TextView) view.findViewById(R.id.market_title);
        this.homeTeam = (TextView) view.findViewById(R.id.home_team);
        this.awayTeam = (TextView) view.findViewById(R.id.away_team);
        this.odds = (TextView) view.findViewById(R.id.odds_value);
        this.amount = (EditText) view.findViewById(R.id.amount_edit_text);
        this.warningMsg = (TextView) view.findViewById(R.id.warning_msg);
        this.delete = (LinearLayout) view.findViewById(R.id.delete);
        this.keyboardView = (KeyboardView) view.findViewById(R.id.custom_number_keyboard);
        this.bottomLine = view.findViewById(R.id.bottom_line);
        this.betSlipItem = view.findViewById(R.id.betslip_item);
        this.sportsIcon = (ImageView) view.findViewById(R.id.sports_icon);
    }

    private void animateColorChange(final View view, int i, int i2) {
        if (view == null) {
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        valueAnimatorOfObject.setDuration(500L);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rz3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BetslipViewHolder.lambda$animateColorChange$5(view, valueAnimator);
            }
        });
        valueAnimatorOfObject.addListener(new b(view, i2, i));
        valueAnimatorOfObject.start();
    }

    private void checkWarningMsg(bq3 bq3Var, uy0 uy0Var, tlo tloVar, jpk jpkVar) {
        Context context = this.itemView.getContext();
        String inputData = getInputData();
        AssetsInfo assetsInfoC = uy0Var.c();
        m780 m780VarT0 = jpkVar.t0(bq3Var.a);
        BigDecimal bigDecimal = sqo.a;
        String strB = "";
        if (!TextUtils.isEmpty(inputData) && !inputData.equals("0")) {
            String strReplaceAll = inputData.trim().replaceAll(",", "");
            double d = assetsInfoC != null ? assetsInfoC.balance * 1.0E-4d : 0.0d;
            if (".".equals(strReplaceAll)) {
                strB = sn5.b(context, R.string.component_betslip__please_enter_a_value_no_less_than_vmount, bjb0.Z(tloVar.a(), RoundingMode.CEILING));
            } else {
                double d2 = Double.parseDouble(strReplaceAll);
                if (m780VarT0 == null || bjb0.d0(m780VarT0.a) + d < d2) {
                    if (d2 < tloVar.a()) {
                        strB = sn5.b(context, R.string.component_betslip__please_enter_a_value_no_less_than_vmount, bjb0.Z(tloVar.a(), RoundingMode.CEILING));
                    } else if (d2 > tloVar.b()) {
                        strB = sn5.b(context, R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, bjb0.Z(tloVar.b(), RoundingMode.FLOOR));
                    } else if (d2 > d && assetsInfoC != null) {
                        strB = sn5.b(context, R.string.page_instant_virtual__less_balanc, new Object[0]);
                    }
                }
            }
        }
        if (TextUtils.isEmpty(strB)) {
            setWarningMsg(strB, 0);
        } else {
            setWarningMsg(strB, this.itemView.getContext().getColor(R.color.warning_primary));
            this.amount.setActivated(true);
        }
    }

    private void dismissKeyBoard() {
        this.keyboardView.post(new Runnable() { // from class: sz3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$dismissKeyBoard$4();
            }
        });
    }

    private String getInputData() {
        String string = this.amount.getText().toString();
        return ".".equals(string.trim()) ? "" : string;
    }

    private void initInputAmount(final bq3 bq3Var, tlo tloVar, uy0 uy0Var, jpk jpkVar) {
        this.amount.setFilters(new InputFilter[]{new m4d(String.valueOf(tloVar.b()).length())});
        this.amount.setHint(sn5.c(this.itemView, R.string.component_betslip__min_vstake, bjb0.Z(tloVar.a(), RoundingMode.CEILING)));
        this.amount.setCursorVisible(false);
        this.amount.setLongClickable(false);
        this.amount.setTextIsSelectable(false);
        this.amount.setImeOptions(268435456);
        String str = bq3Var.g;
        if (TextUtils.equals(str, "0")) {
            str = "";
        }
        this.amount.setText(str);
        this.amount.setVisibility(TextUtils.equals(bq3Var.a, SimulateBetConsts.BetslipType.SINGLE) ? 0 : 8);
        this.amount.setInputType(0);
        if (this.amount.getVisibility() == 0) {
            checkWarningMsg(bq3Var, uy0Var, tloVar, jpkVar);
        }
        if (bq3Var.m) {
            this.amount.setActivated(false);
            this.warningMsg.setVisibility(8);
        } else {
            checkWarningMsg(bq3Var, uy0Var, tloVar, jpkVar);
        }
        this.amount.setOnTouchListener(new View.OnTouchListener() { // from class: vz3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return BetslipViewHolder.lambda$initInputAmount$2(bq3Var, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$animateColorChange$5(View view, ValueAnimator valueAnimator) {
        view.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dismissKeyBoard$4() {
        this.keyboardView.E();
        this.amount.clearFocus();
        this.amount.setCursorVisible(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$initInputAmount$2(bq3 bq3Var, View view, MotionEvent motionEvent) {
        List<bq3> data;
        int iIndexOf;
        jp3 jp3Var = bq3Var.o;
        jp3Var.q0().e.c.S.b(true);
        BetslipAdapter betslipAdapter = jp3Var.w;
        if (betslipAdapter == null) {
            betslipAdapter = null;
        }
        if (betslipAdapter == null || (iIndexOf = (data = betslipAdapter.getData()).indexOf(bq3Var)) < 0) {
            return false;
        }
        jp3Var.v0(betslipAdapter);
        data.get(iIndexOf).k = true;
        BetslipAdapter betslipAdapter2 = jp3Var.w;
        if (betslipAdapter2 != null) {
            betslipAdapter2.notifyItemChanged(iIndexOf, BetslipAdapter.PAYLOAD_KEYBOARD);
        }
        jp3Var.X = iIndexOf;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setData$0(bq3 bq3Var, View view) {
        jp3 jp3Var = bq3Var.o;
        if (((n4p) jp3Var.s0()).d.size() > 1 || ((n4p) jp3Var.s0()).s()) {
            BigDecimal bigDecimal = sqo.a;
            ((n4p) jp3Var.s0()).I(sqo.b(bq3Var.b, bq3Var.c, bq3Var.d));
            y03 y03Var = jp3Var.B;
            if (y03Var != null) {
                y03Var.n0();
            }
        } else {
            e activity = jp3Var.getActivity();
            if (activity != null) {
                sqo.o(activity, jp3Var.s0(), jp3Var.r0().b, null);
            }
        }
        int size = ((n4p) jp3Var.s0()).d.size();
        y03 y03Var2 = jp3Var.B;
        if (y03Var2 != null) {
            y03Var2.M0(jp3Var.m0(size), jp3Var.v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setData$1(bq3 bq3Var, uy0 uy0Var, tlo tloVar, jpk jpkVar, View view) {
        updateAmount(bq3Var, uy0Var, tloVar, jpkVar);
        dismissKeyBoard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showKeyboard$3() {
        EditText editText = this.amount;
        editText.setSelection(editText.getText().length());
        this.amount.setCursorVisible(true);
    }

    private void setWarningMsg(String str, int i) {
        this.warningMsg.setText(str);
        if (i != 0) {
            this.warningMsg.setTextColor(i);
        } else {
            this.amount.setActivated(false);
            this.warningMsg.setTextColor(this.itemView.getContext().getColor(R.color.text_type1_secondary));
        }
        this.warningMsg.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAmount(bq3 bq3Var, boolean z, uy0 uy0Var, tlo tloVar, jpk jpkVar) {
        if (z) {
            setWarningMsg("", 0);
        }
        updateAmount(bq3Var, uy0Var, tloVar, jpkVar);
    }

    private void showKeyboard() {
        this.keyboardView.L(this.amount, 2);
        this.amount.requestFocus();
        this.amount.post(new Runnable() { // from class: wz3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$showKeyboard$3();
            }
        });
    }

    private void updateAmount(bq3 bq3Var, uy0 uy0Var, tlo tloVar, jpk jpkVar) {
        BigDecimal bigDecimalG;
        checkWarningMsg(bq3Var, uy0Var, tloVar, jpkVar);
        jp3 jp3Var = bq3Var.o;
        bq3Var.g = getInputData();
        jp3 jp3Var2 = bq3Var.o;
        r4p r4pVarQ0 = jp3Var2.q0();
        String str = bq3Var.g;
        String str2 = bq3Var.d;
        String str3 = bq3Var.c;
        String str4 = bq3Var.b;
        if (str == null || (bigDecimalG = kotlin.text.b.g(str)) == null) {
            bigDecimalG = BigDecimal.ZERO;
            bigDecimalG.getClass();
        }
        o4p o4pVar = jp3Var2.z;
        o4pVar.getClass();
        if (TextUtils.equals(o4pVar.a, SimulateBetConsts.BetslipType.SINGLE) && TextUtils.equals(((n4p) jp3Var2.s0()).C(), sqo.b(str4, str3, str2))) {
            ((n4p) jp3Var2.s0()).L(new Pair<>(sqo.b(str4, str3, str2), bigDecimalG.toPlainString()));
        }
        o4p o4pVar2 = jp3Var2.z;
        o4pVar2.getClass();
        if (TextUtils.equals(o4pVar2.a, SimulateBetConsts.BetslipType.SINGLE)) {
            tlo tloVarS0 = jp3Var2.s0();
            ((n4p) tloVarS0).O(bigDecimalG.compareTo(BigDecimal.ZERO) == 0 ? jp3Var2.i : bigDecimalG, sqo.b(str4, str3, str2));
        }
        NextButtonLayout nextButtonLayout = r4pVarQ0.c;
        InstantWinFooterLayout instantWinFooterLayout = r4pVarQ0.e;
        nextButtonLayout.setEnabled(bigDecimalG.compareTo(BigDecimal.valueOf(((n4p) jp3Var2.s0()).j)) >= 0 && bigDecimalG.compareTo(BigDecimal.valueOf(((n4p) jp3Var2.s0()).k)) <= 0);
        bq3Var.g = bigDecimalG.toPlainString();
        jp3Var2.Q0(bq3Var);
        o4p o4pVar3 = jp3Var2.z;
        if (o4pVar3 != null) {
            instantWinFooterLayout.s(o4pVar3, "", 0, jp3Var2.D, jp3Var2.t0());
        }
        jp3Var2.O0();
        if (jp3Var2.u0() != null) {
            jp3Var2.N0();
        } else {
            jp3Var2.r0().E(jp3Var2.v);
        }
        o4p o4pVar4 = jp3Var2.z;
        instantWinFooterLayout.g(o4pVar4 != null ? o4pVar4.a : null, bigDecimalG, new BigDecimal(String.valueOf(((n4p) jp3Var2.s0()).j)), false);
    }

    public void setData(final bq3 bq3Var, int i, int i2, ji2 ji2Var, final tlo tloVar, final uy0 uy0Var, final jpk jpkVar, bmo bmoVar) {
        initInputAmount(bq3Var, tloVar, uy0Var, jpkVar);
        this.odds.setText(gky.a.a(bjb0.P(bq3Var.h, Locale.US), false));
        this.oddsDesc.setText(bq3Var.i);
        Integer numA = bmoVar.a(tloVar.c());
        this.sportsIcon.setImageDrawable(numA != null ? s0b.a(this.itemView.getContext(), numA.intValue(), new a78.c(R.color.text_type1_primary)) : null);
        TextView textView = this.marketTitle;
        boolean zB = ji2Var.b(bq3Var.c);
        CharSequence charSequence = bq3Var.j;
        if (zB) {
            charSequence.getClass();
            j7g j7gVar = new j7g();
            int i3 = 6;
            String[] strArr = (String[]) StringsKt__StringsKt.split$default(charSequence, new String[]{"::"}, false, 0, 6, null).toArray(new String[0]);
            int length = strArr.length;
            int i4 = 0;
            while (i4 < length) {
                if (i4 != 0) {
                    j7gVar.a("\n");
                }
                String[] strArr2 = (String[]) StringsKt__StringsKt.split$default(strArr[i4], new String[]{"---"}, false, 0, i3, null).toArray(new String[0]);
                int length2 = strArr2.length;
                for (int i5 = 0; i5 < length2; i5++) {
                    if (i5 == 0) {
                        j7gVar.l(bqe.a(14.0f), strArr2[i5]);
                        j7gVar.a("  ");
                    } else {
                        j7gVar.l(bqe.a(12.0f), strArr2[i5]);
                    }
                }
                i4++;
                i3 = 6;
            }
            charSequence = j7gVar;
        }
        textView.setText(charSequence);
        this.homeTeam.setText(bq3Var.e);
        this.awayTeam.setText(bq3Var.f);
        this.delete.setOnClickListener(new View.OnClickListener() { // from class: tz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BetslipViewHolder.lambda$setData$0(bq3Var, view);
            }
        });
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.bottomLine.getLayoutParams();
        if (getPosition() == (i2 - i) - 1) {
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.height = (int) this.itemView.getResources().getDimension(R.dimen.iwqk_bh_line_height_4_dp);
            this.bottomLine.setBackgroundColor(this.itemView.getContext().getColor(R.color.background_type1_secondary));
        } else {
            layoutParams.setMargins(zch0.a(this.itemView.getContext(), 40), 0, 0, 0);
            layoutParams.height = (int) this.itemView.getResources().getDimension(R.dimen.iwqk_bh_line_height_1_dp);
            this.bottomLine.setBackgroundColor(this.itemView.getContext().getColor(R.color.line_type1_primary));
        }
        this.bottomLine.setLayoutParams(layoutParams);
        this.keyboardView.setOnValueChangeListener(new a(bq3Var, uy0Var, tloVar, jpkVar));
        this.keyboardView.setOnDoneButtonClickListener(new View.OnClickListener() { // from class: uz3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$setData$1(bq3Var, uy0Var, tloVar, jpkVar, view);
            }
        });
        if (bq3Var.n) {
            bq3Var.n = false;
            animateColorChange(this.betSlipItem, this.itemView.getContext().getColor(R.color.virtual_betslip_rebet_selection_start), this.itemView.getContext().getColor(R.color.virtual_betslip_rebet_selection_end));
        }
        updateKeyboardVisibility(bq3Var.k);
    }

    public void updateAmountOnly(bq3 bq3Var, tlo tloVar, uy0 uy0Var, jpk jpkVar) {
        initInputAmount(bq3Var, tloVar, uy0Var, jpkVar);
    }

    public void updateKeyboardVisibility(boolean z) {
        if (z) {
            showKeyboard();
        } else {
            dismissKeyBoard();
        }
    }
}
