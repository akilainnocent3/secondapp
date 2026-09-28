package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.CashOutLoadingButton;
import com.sporty.android.core.model.cashout.AutoCashOut;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final class uyg extends gi6 {
    public final sgd0 b;
    public final zzy c;
    public final zh6 d;
    public final xo6 e;
    public pl6 f;
    public boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    public uyg(sgd0 sgd0Var, ek6 ek6Var, ArrayList arrayList, zh6 zh6Var, xo6 xo6Var) {
        ek6Var.getClass();
        arrayList.getClass();
        xo6Var.getClass();
        ConstraintLayout constraintLayout = sgd0Var.a;
        constraintLayout.getClass();
        super(constraintLayout, arrayList);
        this.b = sgd0Var;
        this.c = ek6Var;
        this.d = zh6Var;
        this.e = xo6Var;
        this.i = true;
        qyg qygVar = new qyg(this, 0);
        sgd0Var.f.setOnClickListener(new syg(new cq40(), this));
        sgd0Var.I.setOnClickListener(new tyg(new cq40(), this));
        sgd0Var.A.setOnClickListener(new View.OnClickListener() { // from class: ryg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pl6 pl6Var;
                Bet bet;
                String str;
                uyg uygVar = this.a;
                boolean z = uygVar.i;
                sgd0 sgd0Var2 = uygVar.b;
                pl6 pl6Var2 = uygVar.f;
                boolean z2 = false;
                if (z) {
                    if (pl6Var2 != null) {
                        qq6 qq6Var = pl6Var2.B;
                        pl6Var2.B = qq6Var != null ? qq6.a(qq6Var, false, false, null, null, 14) : null;
                    }
                    sgd0Var2.A.setVisibility(8);
                    zh6 zh6Var2 = uygVar.d;
                    int bindingAdapterPosition = uygVar.getBindingAdapterPosition();
                    xh6 xh6Var = zh6Var2.a;
                    if (bindingAdapterPosition == -1 || (pl6Var = (pl6) CollectionsKt.V(bindingAdapterPosition, xh6Var.A)) == null || (bet = pl6Var.a) == null || (str = bet.id) == null) {
                        return;
                    }
                    qq6 qq6Var2 = pl6Var.B;
                    qq6 qq6Var3 = new qq6(false, false, qq6Var2.c, qq6Var2.d);
                    pl6Var.B = qq6Var3;
                    xh6Var.I.put(str, qq6Var3);
                    return;
                }
                if (pl6Var2 != null) {
                    qq6 qq6Var4 = pl6Var2.B;
                    qq6Var4.getClass();
                    pl6Var2.B = qq6.a(qq6Var4, false, !pl6Var2.B.b, null, null, 13);
                    TextView textView = sgd0Var2.D;
                    TextView textView2 = sgd0Var2.C;
                    CharSequence text = textView.getText();
                    text.getClass();
                    boolean z3 = text.length() > 0;
                    boolean z4 = pl6Var2.B.b;
                    c8i0.o(textView2, z4);
                    TextView textView3 = sgd0Var2.D;
                    if (z4 && z3) {
                        z2 = true;
                    }
                    c8i0.o(textView3, z2);
                    c8i0.o(sgd0Var2.y, z4);
                    ImageView imageView = sgd0Var2.v;
                    if (z4) {
                        imageView.setImageResource(R.drawable.ic_icon_arrow_1_up);
                    } else {
                        imageView.setImageResource(R.drawable.ic_icon_arrow_1_down);
                    }
                    textView2.setMaxLines(sgd0Var2.D.getVisibility() != 0 ? 3 : 1);
                    uygVar.c(pl6Var2.B.b);
                }
            }
        });
        sgd0Var.F.setOnClickListener(qygVar);
        sgd0Var.G.setOnClickListener(qygVar);
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0366  */
    /* JADX WARN: Code duplicated, block: B:127:0x0368  */
    @Override // defpackage.gi6
    public final void a(int i) {
        sgd0 sgd0Var;
        Bet bet;
        qq6 qq6Var;
        int i2;
        Bet bet2;
        BetSelection betSelectionC;
        int i3;
        String string;
        pl6 pl6VarB = b(i);
        if (pl6VarB != null) {
            this.f = pl6VarB;
            boolean z = pl6VarB.w;
            pl6VarB.w = false;
            boolean z2 = pl6VarB.a.isFallbackCashOut && !pl6VarB.v;
            sgd0 sgd0Var2 = this.b;
            AppCompatTextView appCompatTextView = sgd0Var2.F;
            TextView textView = sgd0Var2.H;
            TextView textView2 = sgd0Var2.I;
            TextView textView3 = sgd0Var2.d;
            ImageView imageView = sgd0Var2.e;
            Group group = sgd0Var2.c;
            CashOutLoadingButton cashOutLoadingButton = sgd0Var2.i;
            appCompatTextView.setVisibility(z2 ? 0 : 8);
            sgd0Var2.G.setVisibility(z2 ? 0 : 8);
            boolean z3 = pl6VarB.v;
            xo6 xo6Var = this.e;
            if (z3) {
                cashOutLoadingButton.setEnabled(false);
                View view = this.itemView;
                view.getClass();
                CashOutLoadingButton.setCashOutText$default(cashOutLoadingButton, sn5.c(view, R.string.cashout__cashout_succeeded, new Object[0]), null, 2, null);
                sgd0Var = sgd0Var2;
            } else {
                Bet bet3 = pl6VarB.a;
                pl6 pl6Var = this.f;
                this.c.d(cashOutLoadingButton, (pl6Var == null || (bet = pl6Var.a) == null) ? false : bet.isFallbackCashOut);
                boolean z4 = bet3.isCalcByFE ? bet3.isCashAbleJS : bet3.isCashable;
                this.i = false;
                cashOutLoadingButton.setVisibility(0);
                Bet bet4 = pl6VarB.a;
                if (bet4.isJsCalcFailed || bet4.isCashoutAmountNotAcquired) {
                    cashOutLoadingButton.setEnabled(true);
                    sgd0Var2.i.setBtnClickedShowPopupListener(new Function0() { // from class: pyg
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            uyg uygVar = this.a;
                            pl6 pl6Var2 = uygVar.f;
                            if (pl6Var2 != null) {
                                uygVar.d.a(pl6Var2);
                            }
                            return Unit.a;
                        }
                    });
                    Context context = this.itemView.getContext();
                    context.getClass();
                    cashOutLoadingButton.setCashOutText(sn5.b(context, R.string.cashout__cashout, new Object[0]), bet3.maxCashOutAmount);
                    this.i = true;
                    sgd0Var = sgd0Var2;
                } else if (z4) {
                    sgd0Var = sgd0Var2;
                    textView.setVisibility(8);
                    if (rm2.e(bet3, xo6Var)) {
                        sgd0Var.i.setDisabledStyleClickable(xo6Var.u, new pj8(2, this, bet3.id));
                        View view2 = this.itemView;
                        view2.getClass();
                        CashOutLoadingButton.setCashOutText$default(cashOutLoadingButton, sn5.c(view2, R.string.bet_history__cashout_unavailable, new Object[0]), null, 2, null);
                    } else {
                        cashOutLoadingButton.setEnabled(true);
                        sgd0Var.i.setBtnClickedShowPopupListener(new Function0() { // from class: pyg
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                uyg uygVar = this.a;
                                pl6 pl6Var2 = uygVar.f;
                                if (pl6Var2 != null) {
                                    uygVar.d.a(pl6Var2);
                                }
                                return Unit.a;
                            }
                        });
                        boolean zG = rm2.g(bet3, xo6Var);
                        View view3 = this.itemView;
                        if (zG) {
                            Context context2 = view3.getContext();
                            context2.getClass();
                            cashOutLoadingButton.setCashOutText(sn5.b(context2, R.string.cashout__cashout, new Object[0]), bet3.maxCashOutAmount);
                            this.i = true;
                        } else {
                            Context context3 = view3.getContext();
                            context3.getClass();
                            String strB = sn5.b(context3, R.string.cashout__cashout_amount_card, a8b.d(), bjb0.P(bet3.maxCashOutAmount, Locale.US));
                            String str = bet3.maxCashOutAmount;
                            if (z) {
                                cashOutLoadingButton.setCashOutTextWithBg(strB, str);
                            } else {
                                cashOutLoadingButton.setCashOutText(strB, str);
                            }
                            this.i = true;
                        }
                    }
                } else {
                    sgd0Var = sgd0Var2;
                    sgd0Var2.i.setDisabledStyleClickable(xo6Var.u, new pj8(2, this, bet3.id));
                    View view4 = this.itemView;
                    view4.getClass();
                    CashOutLoadingButton.setCashOutText$default(cashOutLoadingButton, sn5.c(view4, R.string.bet_history__cashout_unavailable, new Object[0]), null, 2, null);
                    if (TextUtils.isEmpty(bet3.notCashableReason)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                        String str2 = bet3.notCashableReason;
                        textView.setText(str2 != null ? c.p(str2, ".", "", false) : null);
                    }
                }
                pl6 pl6Var2 = this.f;
                pl6Var2.getClass();
                AutoCashOut autoCashOut = pl6Var2.b;
                if (autoCashOut != null && autoCashOut.isAutoCashoutSuccessful()) {
                    group.setVisibility(0);
                    imageView.setVisibility(8);
                    sn5.f(textView3, R.string.cashout__auto_cashout_successful, new Object[0]);
                } else if (autoCashOut == null || !autoCashOut.isAutoCashoutCreated()) {
                    group.setVisibility(8);
                } else {
                    group.setVisibility(0);
                    imageView.setVisibility(0);
                    sn5.f(textView3, R.string.bet_history__auto_cashout_rule_is_on, new Object[0]);
                }
                textView2.setTag(bet3.orderId);
                c8i0.o(textView2, bet3.hasEditBetHistory);
            }
            pl6 pl6Var3 = this.f;
            if (pl6Var3 == null || (qq6Var = pl6Var3.B) == null) {
                return;
            }
            UiText uiText = qq6Var.d;
            boolean z5 = qq6Var.b;
            Bet bet5 = pl6Var3.a;
            boolean zContainsBetBuilderSelection = bet5 != null ? bet5.containsBetBuilderSelection() : false;
            TextView textView4 = sgd0Var.w;
            ImageView imageView2 = sgd0Var.y;
            TextView textView5 = sgd0Var.D;
            ImageView imageView3 = sgd0Var.z;
            TextView textView6 = sgd0Var.B;
            ImageView imageView4 = sgd0Var.v;
            ConstraintLayout constraintLayout = sgd0Var.A;
            TextView textView7 = sgd0Var.C;
            if (textView.getVisibility() == 0 || zContainsBetBuilderSelection) {
                constraintLayout.setVisibility(8);
                return;
            }
            if (this.i) {
                c8i0.o(constraintLayout, qq6Var.a);
                constraintLayout.setBackgroundResource(R.drawable.bg_filled_brand_secondary_disable_4_radius);
                imageView4.setImageResource(R.drawable.ic_icon_cancel_1);
                imageView4.setColorFilter(this.itemView.getContext().getColor(R.color.text_color_text_type1_primary));
                sn5.f(textView6, R.string.cashout__cashout_available_now, new Object[0]);
                textView6.setTextColor(this.itemView.getContext().getColor(R.color.text_color_text_type1_primary));
                imageView3.setImageResource(R.drawable.ic_icon_successful);
                imageView3.clearColorFilter();
                textView7.setVisibility(8);
                textView5.setVisibility(8);
                imageView2.setVisibility(8);
                c8i0.o(textView4, z5);
            } else {
                constraintLayout.setVisibility(0);
                constraintLayout.setBackgroundResource(R.drawable.bg_filled_background_hint_15_alpha_4_radius);
                pl6 pl6Var4 = this.f;
                if (pl6Var4 != null) {
                    qq6 qq6Var2 = pl6Var4.B;
                    pl6Var4.B = qq6Var2 != null ? qq6.a(qq6Var2, true, false, null, null, 14) : null;
                }
                if (z5) {
                    imageView4.setImageResource(R.drawable.ic_icon_arrow_1_up);
                } else {
                    imageView4.setImageResource(R.drawable.ic_icon_arrow_1_down);
                }
                boolean z6 = uiText != null;
                c8i0.o(textView7, z5);
                c8i0.o(textView5, z5 && z6);
                c8i0.o(imageView2, z5);
                textView4.setVisibility(8);
                UiText uiText2 = qq6Var.c;
                if (uiText2 != null) {
                    Context context4 = this.itemView.getContext();
                    context4.getClass();
                    textView7.setText(uiText2.e(context4).toString());
                    if (uiText != null) {
                        Context context5 = this.itemView.getContext();
                        context5.getClass();
                        string = uiText.e(context5).toString();
                    } else {
                        string = null;
                    }
                    textView5.setText(string);
                } else {
                    pl6 pl6Var5 = this.f;
                    if (pl6Var5 == null || (bet2 = pl6Var5.a) == null || (betSelectionC = rm2.c(bet2, xo6Var)) == null) {
                        Context context6 = this.itemView.getContext();
                        context6.getClass();
                        i2 = 0;
                        textView7.setText(sn5.b(context6, R.string.cashout__cashout_unavailable_reason_00, new Object[0]));
                    } else {
                        Context context7 = this.itemView.getContext();
                        context7.getClass();
                        textView7.setText(sn5.b(context7, R.string.cashout__cashout_unavailable_reason_02, new Object[0]));
                        c8i0.o(textView5, z5);
                        textView5.setText(dz2.d(betSelectionC));
                    }
                    sn5.f(textView6, R.string.cashout__cashout_unavailable, new Object[i2]);
                    textView6.setTextColor(this.itemView.getContext().getColor(R.color.hint));
                    imageView3.setImageResource(R.drawable.ic_icon_tip_2);
                    imageView3.setColorFilter(this.itemView.getContext().getColor(R.color.hint));
                    imageView4.setColorFilter(this.itemView.getContext().getColor(R.color.hint));
                    if (sgd0Var.D.getVisibility() == 0) {
                        i3 = 1;
                    } else {
                        i3 = 3;
                    }
                    textView7.setMaxLines(i3);
                }
                i2 = 0;
                sn5.f(textView6, R.string.cashout__cashout_unavailable, new Object[i2]);
                textView6.setTextColor(this.itemView.getContext().getColor(R.color.hint));
                imageView3.setImageResource(R.drawable.ic_icon_tip_2);
                imageView3.setColorFilter(this.itemView.getContext().getColor(R.color.hint));
                imageView4.setColorFilter(this.itemView.getContext().getColor(R.color.hint));
                if (sgd0Var.D.getVisibility() == 0) {
                    i3 = 1;
                } else {
                    i3 = 3;
                }
                textView7.setMaxLines(i3);
            }
            c(z5);
        }
    }

    public final void c(boolean z) {
        sgd0 sgd0Var = this.b;
        if (z) {
            sgd0Var.A.getLayoutParams().height = bqe.a(88.0f);
        } else {
            sgd0Var.A.getLayoutParams().height = bqe.a(44.0f);
        }
    }
}
