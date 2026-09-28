package com.sportybet.android.cashoutphase3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sporty.android.core.model.realsports.StakeConfig;
import com.sportybet.android.cashoutphase3.InstantCashoutView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.CashOut;
import com.sportybet.plugin.realsports.widget.DancingNumber2;
import defpackage.a78;
import defpackage.bjb0;
import defpackage.cq40;
import defpackage.hrd0;
import defpackage.hwr;
import defpackage.j7g;
import defpackage.jc1;
import defpackage.mpe0;
import defpackage.ms6;
import defpackage.pl6;
import defpackage.ppn;
import defpackage.psm;
import defpackage.rm2;
import defpackage.rpn;
import defpackage.s0b;
import defpackage.sn5;
import defpackage.spn;
import defpackage.uji;
import defpackage.vgd0;
import defpackage.yo6;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001ZB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001d\u0010F\u001a\u0004\u0018\u00010A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001b\u0010J\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010IR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010\u0012\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010\u0018R\u0013\u0010Y\u001a\u0004\u0018\u00010V8F¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006["}, d2 = {"Lcom/sportybet/android/cashoutphase3/InstantCashoutView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lpl6;", "wrapper", "Lcom/sportybet/android/cashoutphase3/InstantCashoutView$a;", "listener", "Lcom/sporty/android/core/model/config/tax/TaxConfig;", "realSportTaxConfig", "", "animate", "shouldShowForceUpdateApp", "", "setup", "(Lpl6;Lcom/sportybet/android/cashoutphase3/InstantCashoutView$a;Lcom/sporty/android/core/model/config/tax/TaxConfig;ZZ)V", "enabled", "setConfirmButtonEnabled", "(Z)V", "Lyo6;", "c", "Lyo6;", "getCashoutConfigManager", "()Lyo6;", "setCashoutConfigManager", "(Lyo6;)V", "cashoutConfigManager", "Lpsm;", "d", "Lpsm;", "getCountryManager", "()Lpsm;", "setCountryManager", "(Lpsm;)V", "countryManager", "Lhrd0;", "e", "Lhrd0;", "getStakeConfigRepository", "()Lhrd0;", "setStakeConfigRepository", "(Lhrd0;)V", "stakeConfigRepository", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "getConfirmButton", "()Landroid/widget/TextView;", "setConfirmButton", "(Landroid/widget/TextView;)V", "confirmButton", "Lcom/sportybet/android/widget/ProgressButton;", "v", "Lcom/sportybet/android/widget/ProgressButton;", "getConfirmProgressBtn", "()Lcom/sportybet/android/widget/ProgressButton;", "setConfirmProgressBtn", "(Lcom/sportybet/android/widget/ProgressButton;)V", "confirmProgressBtn", "Landroid/graphics/drawable/Drawable;", "E", "Lttr;", "getUnavailableStyleBg", "()Landroid/graphics/drawable/Drawable;", "unavailableStyleBg", "F", "getUnavailableStyleTextColor", "()I", "unavailableStyleTextColor", "H", "Lcom/sportybet/android/cashoutphase3/InstantCashoutView$a;", "getListener", "()Lcom/sportybet/android/cashoutphase3/InstantCashoutView$a;", "setListener", "(Lcom/sportybet/android/cashoutphase3/InstantCashoutView$a;)V", "I", "Z", "getShouldShowForceUpdateApp", "()Z", "setShouldShowForceUpdateApp", "", "getBetId", "()Ljava/lang/String;", "betId", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InstantCashoutView extends Hilt_InstantCashoutView {
    public static final /* synthetic */ int J = 0;
    public int A;
    public int B;
    public Drawable C;
    public ColorStateList D;
    public final mpe0 E;
    public final mpe0 F;
    public boolean G;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public a listener;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public boolean shouldShowForceUpdateApp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public yo6 cashoutConfigManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public psm countryManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public hrd0 stakeConfigRepository;
    public vgd0 f;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public TextView confirmButton;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public ProgressButton confirmProgressBtn;
    public Bet w;
    public boolean y;
    public TaxConfig z;

    public interface a {
        void a(pl6 pl6Var, boolean z);

        void b();

        void c(String str);

        void d(int i);

        void e(pl6 pl6Var);
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ a b;

        public b(cq40 cq40Var, a aVar) {
            this.a = cq40Var;
            this.b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 500) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            this.b.b();
        }
    }

    public static final class c implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ a b;
        public final /* synthetic */ pl6 c;

        public c(cq40 cq40Var, a aVar, pl6 pl6Var) {
            this.a = cq40Var;
            this.b = aVar;
            this.c = pl6Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 500) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            this.b.e(this.c);
        }
    }

    public static final class d implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ a b;

        public d(a aVar) {
            this.b = aVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            seekBar.getClass();
            if (z) {
                InstantCashoutView instantCashoutView = InstantCashoutView.this;
                instantCashoutView.A = i;
                this.b.d(i);
                Bet bet = instantCashoutView.w;
                if (bet == null) {
                    Intrinsics.n("betItem");
                    throw null;
                }
                CashOut cashOut = bet.cashOut;
                cashOut.getClass();
                instantCashoutView.b(cashOut, false);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantCashoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        int i2 = 1;
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((spn) generatedComponent()).r(this);
        }
        this.A = CashOut.BIG_NUMBER;
        this.B = -1;
        this.E = hwr.b(new uji(context, i2));
        this.F = hwr.b(new rpn(context, 0));
    }

    private final Drawable getUnavailableStyleBg() {
        return (Drawable) this.E.getValue();
    }

    private final int getUnavailableStyleTextColor() {
        return ((Number) this.F.getValue()).intValue();
    }

    private final void setConfirmButtonEnabled(boolean enabled) {
        this.G = false;
        getConfirmButton().setEnabled(enabled);
        getConfirmButton().setBackground(this.C);
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            getConfirmButton().setTextColor(colorStateList);
        }
    }

    public final void a(boolean z) {
        Bet bet = this.w;
        if (bet == null) {
            Intrinsics.n("betItem");
            throw null;
        }
        boolean z2 = bet.isFallbackCashOut;
        boolean z3 = bet.isCashoutAmountNotAcquired;
        boolean z4 = this.shouldShowForceUpdateApp;
        vgd0 vgd0Var = this.f;
        int i = 8;
        if (z4) {
            if (vgd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var.I.setVisibility(0);
            vgd0 vgd0Var2 = this.f;
            if (vgd0Var2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var2.y.setVisibility(8);
            getConfirmButton().setVisibility(8);
        } else {
            if (vgd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var.y.setVisibility((z2 || z3) ? 0 : 8);
        }
        vgd0 vgd0Var3 = this.f;
        if (vgd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = vgd0Var3.E;
        if (!z2 && !z3 && !z) {
            i = 0;
        }
        constraintLayout.setVisibility(i);
        vgd0 vgd0Var4 = this.f;
        if (vgd0Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var4.d.setText(sn5.c(this, z3 ? R.string.cashout__cashout_calculate_something_went_wrong : R.string.cashout__fallback_cashout_confirm_popup_hint, new Object[0]));
        if (z2 || z3) {
            this.A = CashOut.BIG_NUMBER;
            vgd0 vgd0Var5 = this.f;
            if (vgd0Var5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var5.D.setProgress(CashOut.BIG_NUMBER);
            a aVar = this.listener;
            if (aVar != null) {
                aVar.d(this.A);
            }
        }
    }

    public final void b(CashOut cashOut, boolean z) {
        BigDecimal bigDecimalG;
        String str = cashOut.maxCashOutAmount;
        BigDecimal scale = (str == null || (bigDecimalG = kotlin.text.b.g(str)) == null) ? null : bigDecimalG.setScale(2, RoundingMode.HALF_UP);
        if (scale == null) {
            String strC = sn5.c(this, R.string.cashout__cashout_unavailable, new Object[0]);
            vgd0 vgd0Var = this.f;
            if (vgd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var.A.setPlainText(strC);
            f();
            getConfirmButton().setText(strC);
            c();
            return;
        }
        BigDecimal instantCashOutAmount = cashOut.getInstantCashOutAmount(this.A);
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        if (Intrinsics.g(instantCashOutAmount.setScale(2, roundingMode), scale)) {
            vgd0 vgd0Var2 = this.f;
            if (vgd0Var2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var2.A.setNumber(sn5.c(this, R.string.cashout__full_cashout, new Object[0]).concat(sn5.c(this, R.string.app_common__blank_space, new Object[0])), jc1.b(cashOut.maxCashOutAmount), z);
            vgd0 vgd0Var3 = this.f;
            if (vgd0Var3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var3.e.setVisibility(8);
            getConfirmButton().setText(sn5.c(this, R.string.cashout__confirm_amount, getCountryManager().b(), jc1.b(cashOut.maxCashOutAmount)));
        } else {
            scale = cashOut.getInstantCashOutAmount(this.A).setScale(2, roundingMode);
            scale.getClass();
            String string = scale.toString();
            string.getClass();
            vgd0 vgd0Var4 = this.f;
            if (vgd0Var4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var4.A.setNumber(sn5.c(this, R.string.cashout__partial_cashout, new Object[0]).concat(sn5.c(this, R.string.app_common__blank_space, new Object[0])), string, z);
            vgd0 vgd0Var5 = this.f;
            if (vgd0Var5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var5.e.setNumber(sn5.c(this, R.string.cashout__remaining_stake, new Object[0]).concat(sn5.c(this, R.string.app_common__blank_space, new Object[0])), cashOut.getRemainStake(this.A).setScale(2, roundingMode).toString(), z);
            getConfirmButton().setText(sn5.c(this, R.string.cashout__confirm_amount, getCountryManager().b(), string));
        }
        g(scale);
        vgd0 vgd0Var6 = this.f;
        if (vgd0Var6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var6.I.setVisibility(this.shouldShowForceUpdateApp ? 0 : 8);
        vgd0 vgd0Var7 = this.f;
        if (vgd0Var7 != null) {
            vgd0Var7.b.setVisibility(this.shouldShowForceUpdateApp ? 8 : 0);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void c() {
        this.G = true;
        getConfirmButton().setEnabled(true);
        getConfirmButton().setBackground(getUnavailableStyleBg());
        getConfirmButton().setTextColor(getUnavailableStyleTextColor());
    }

    /* JADX WARN: Code duplicated, block: B:186:0x0409  */
    /* JADX WARN: Code duplicated, block: B:188:0x040d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0430  */
    /* JADX WARN: Code duplicated, block: B:191:0x045e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0462  */
    public final void d() {
        boolean z;
        vgd0 vgd0Var;
        vgd0 vgd0Var2;
        Bet bet = this.w;
        if (bet == null) {
            Intrinsics.n("betItem");
            throw null;
        }
        vgd0 vgd0Var3 = this.f;
        if (vgd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var3.v.setVisibility(bet.shouldShowRefreshButton ? 0 : 8);
        if (bet.isCalcByFE) {
            z = bet.isCashAbleJS && bet.isCashable;
        } else {
            z = bet.isCashable;
        }
        boolean z2 = (!bet.isHugeCombo || !bet.shouldShowRefreshButton || bet.cashOut.status() == 0 || bet.isCashoutAmountNotAcquired) && rm2.e(bet, getCashoutConfigManager().d());
        Boolean boolAmountIsEmpty = bet.cashOut.amountIsEmpty();
        if (!z || z2 || boolAmountIsEmpty.booleanValue() || bet.isCashoutAmountNotAcquired) {
            String strC = sn5.c(this, R.string.cashout__cashout_unavailable, new Object[0]);
            vgd0 vgd0Var4 = this.f;
            if (vgd0Var4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var4.A.setPlainText(strC);
            f();
            vgd0 vgd0Var5 = this.f;
            if (vgd0Var5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var5.E.setVisibility(8);
            getConfirmButton().setText(strC);
            c();
            a(true);
            h();
            return;
        }
        getConfirmButton().setText(sn5.c(this, R.string.cashout__cashout_amount_card, getCountryManager().b(), bjb0.P(bet.cashOut.maxCashOutAmount, Locale.US)));
        setConfirmButtonEnabled(false);
        StakeConfig stakeConfigY = getStakeConfigRepository().y();
        String plainString = stakeConfigY.getMinCashout().toPlainString();
        String plainString2 = stakeConfigY.getMaxCashout().toPlainString();
        CashOut cashOut = bet.cashOut;
        if (!cashOut.isSupportPartial || cashOut.remainCount <= 0) {
            vgd0 vgd0Var6 = this.f;
            if (vgd0Var6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var6.E.setVisibility(8);
            a(true);
            int iStatus = bet.cashOut.status();
            if (iStatus == 0) {
                vgd0 vgd0Var7 = this.f;
                if (vgd0Var7 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var7.A.setPlainText(sn5.c(this, R.string.cashout__cashout_unavailable, new Object[0]));
                f();
                c();
                Unit unit = Unit.a;
            } else if (iStatus == 1) {
                vgd0Var = this.f;
                if (vgd0Var != null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var.A.setNumber(sn5.c(this, R.string.cashout__full_cashout, new Object[0]).concat(sn5.c(this, R.string.app_common__blank_space, new Object[0])), jc1.b(bet.cashOut.maxCashOutAmount), this.y);
                vgd0Var2 = this.f;
                if (vgd0Var2 != null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                DancingNumber2 dancingNumber2 = vgd0Var2.e;
                j7g j7gVar = new j7g();
                j7gVar.e(getContext().getColor(R.color.text_danger), sn5.c(this, R.string.cashout__cashout_only_available_between_vcurrency_vmin_vmax, getCountryManager().B(), plainString, plainString2));
                dancingNumber2.setPlainText(j7gVar);
                setConfirmButtonEnabled(false);
                Unit unit2 = Unit.a;
            } else {
                if (iStatus == 2 || iStatus == 3) {
                    vgd0 vgd0Var8 = this.f;
                    if (vgd0Var8 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    vgd0Var8.A.setNumber(sn5.c(this, R.string.cashout__full_cashout, new Object[0]).concat(sn5.c(this, R.string.app_common__blank_space, new Object[0])), jc1.b(bet.cashOut.maxCashOutAmount), this.y);
                    vgd0 vgd0Var9 = this.f;
                    if (vgd0Var9 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    vgd0Var9.e.setVisibility(8);
                    setConfirmButtonEnabled(true);
                    g(new BigDecimal(bet.cashOut.maxCashOutAmount));
                } else if (iStatus == 4) {
                    vgd0Var = this.f;
                    if (vgd0Var != null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    vgd0Var.A.setNumber(sn5.c(this, R.string.cashout__full_cashout, new Object[0]).concat(sn5.c(this, R.string.app_common__blank_space, new Object[0])), jc1.b(bet.cashOut.maxCashOutAmount), this.y);
                    vgd0Var2 = this.f;
                    if (vgd0Var2 != null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    DancingNumber2 dancingNumber3 = vgd0Var2.e;
                    j7g j7gVar2 = new j7g();
                    j7gVar2.e(getContext().getColor(R.color.text_danger), sn5.c(this, R.string.cashout__cashout_only_available_between_vcurrency_vmin_vmax, getCountryManager().B(), plainString, plainString2));
                    dancingNumber3.setPlainText(j7gVar2);
                    setConfirmButtonEnabled(false);
                    Unit unit3 = Unit.a;
                }
                Unit unit4 = Unit.a;
            }
        } else {
            vgd0 vgd0Var10 = this.f;
            if (vgd0Var10 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var10.B.setText(sn5.c(this, R.string.cashout__min_vmin, jc1.b(plainString)));
            vgd0 vgd0Var11 = this.f;
            if (vgd0Var11 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var11.z.setText(sn5.c(this, R.string.cashout__max_vmax, jc1.b(bet.cashOut.maxCashOutAmount)));
            a(false);
            int iStatus2 = bet.cashOut.status();
            if (iStatus2 == 0) {
                vgd0 vgd0Var12 = this.f;
                if (vgd0Var12 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var12.A.setPlainText(sn5.c(this, R.string.cashout__cashout_unavailable, new Object[0]));
                f();
                vgd0 vgd0Var13 = this.f;
                if (vgd0Var13 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var13.E.setVisibility(8);
                c();
                Unit unit5 = Unit.a;
            } else if (iStatus2 == 1) {
                vgd0 vgd0Var14 = this.f;
                if (vgd0Var14 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var14.A.setNumber(sn5.c(this, R.string.cashout__full_cashout, new Object[0]).concat(sn5.c(this, R.string.app_common__blank_space, new Object[0])), jc1.b(bet.cashOut.maxCashOutAmount), this.y);
                vgd0 vgd0Var15 = this.f;
                if (vgd0Var15 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                DancingNumber2 dancingNumber4 = vgd0Var15.e;
                j7g j7gVar3 = new j7g();
                j7gVar3.e(getContext().getColor(R.color.text_danger), sn5.c(this, R.string.cashout__cashout_only_available_between_vcurrency_vmin_vmax, getCountryManager().B(), plainString, plainString2));
                dancingNumber4.setPlainText(j7gVar3);
                vgd0 vgd0Var16 = this.f;
                if (vgd0Var16 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var16.E.setVisibility(0);
                vgd0 vgd0Var17 = this.f;
                if (vgd0Var17 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var17.D.setEnabled(false);
                vgd0 vgd0Var18 = this.f;
                if (vgd0Var18 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var18.D.setProgress(0);
                vgd0 vgd0Var19 = this.f;
                if (vgd0Var19 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var19.B.setText(sn5.c(this, R.string.cashout__min_vmin, jc1.b(plainString)));
                vgd0 vgd0Var20 = this.f;
                if (vgd0Var20 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var20.z.setText(sn5.c(this, R.string.cashout__max_vmax, jc1.b(plainString2)));
                setConfirmButtonEnabled(false);
                Unit unit6 = Unit.a;
            } else if (iStatus2 == 2) {
                CashOut cashOut2 = bet.cashOut;
                cashOut2.getClass();
                b(cashOut2, this.y);
                vgd0 vgd0Var21 = this.f;
                if (vgd0Var21 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var21.E.setVisibility(0);
                vgd0 vgd0Var22 = this.f;
                if (vgd0Var22 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var22.D.setEnabled(false);
                vgd0 vgd0Var23 = this.f;
                if (vgd0Var23 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var23.D.setProgress(0);
                bet.cashOut.isSupportPartial = false;
                vgd0 vgd0Var24 = this.f;
                if (vgd0Var24 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var24.B.setText(getContext().getString(R.string.cashout__min_vmin, jc1.b(plainString)));
                vgd0 vgd0Var25 = this.f;
                if (vgd0Var25 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var25.z.setText(sn5.c(this, R.string.cashout__max_vmax, jc1.b(plainString2)));
                setConfirmButtonEnabled(true);
                Unit unit7 = Unit.a;
            } else if (iStatus2 != 3) {
                if (iStatus2 == 4) {
                    vgd0 vgd0Var26 = this.f;
                    if (vgd0Var26 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    vgd0Var26.A.setNumber(sn5.c(this, R.string.cashout__full_cashout, new Object[0]).concat(sn5.c(this, R.string.app_common__blank_space, new Object[0])), jc1.b(bet.cashOut.maxCashOutAmount), this.y);
                    vgd0 vgd0Var27 = this.f;
                    if (vgd0Var27 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    DancingNumber2 dancingNumber5 = vgd0Var27.e;
                    j7g j7gVar4 = new j7g();
                    j7gVar4.e(getContext().getColor(R.color.text_danger), sn5.c(this, R.string.cashout__cashout_only_available_between_vcurrency_vmin_vmax, getCountryManager().B(), plainString, plainString2));
                    dancingNumber5.setPlainText(j7gVar4);
                    vgd0 vgd0Var28 = this.f;
                    if (vgd0Var28 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    vgd0Var28.E.setVisibility(0);
                    vgd0 vgd0Var29 = this.f;
                    if (vgd0Var29 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    vgd0Var29.D.setEnabled(false);
                    vgd0 vgd0Var30 = this.f;
                    if (vgd0Var30 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    vgd0Var30.D.setProgress(CashOut.BIG_NUMBER);
                    vgd0 vgd0Var31 = this.f;
                    if (vgd0Var31 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    vgd0Var31.B.setText(sn5.c(this, R.string.cashout__min_vmin, jc1.b(plainString)));
                    vgd0 vgd0Var32 = this.f;
                    if (vgd0Var32 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    vgd0Var32.z.setText(sn5.c(this, R.string.cashout__max_vmax, jc1.b(plainString2)));
                    setConfirmButtonEnabled(false);
                }
                Unit unit8 = Unit.a;
            } else {
                CashOut cashOut3 = bet.cashOut;
                cashOut3.getClass();
                b(cashOut3, this.y);
                vgd0 vgd0Var33 = this.f;
                if (vgd0Var33 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var33.E.setVisibility(0);
                vgd0 vgd0Var34 = this.f;
                if (vgd0Var34 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var34.D.setEnabled(true);
                vgd0 vgd0Var35 = this.f;
                if (vgd0Var35 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var35.D.setProgress(this.A);
                vgd0 vgd0Var36 = this.f;
                if (vgd0Var36 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var36.B.setText(sn5.c(this, R.string.cashout__min_vmin, jc1.b(plainString)));
                vgd0 vgd0Var37 = this.f;
                if (vgd0Var37 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                vgd0Var37.z.setText(sn5.c(this, R.string.cashout__max_vmax, jc1.b(bet.cashOut.maxCashOutAmount)));
                setConfirmButtonEnabled(true);
                Unit unit9 = Unit.a;
            }
        }
        h();
    }

    public final void e(TextView textView, ppn ppnVar) {
        Context context = getContext();
        context.getClass();
        textView.setCompoundDrawablesWithIntrinsicBounds(s0b.c(context, R.drawable.spr_ic_info_blue_24dp, new a78.c(R.color.brand_secondary), null, 4), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setOnClickListener(ppnVar);
    }

    public final void f() {
        Bet bet = this.w;
        if (bet == null) {
            Intrinsics.n("betItem");
            throw null;
        }
        String reason = bet.getReason();
        reason.getClass();
        int length = reason.length();
        vgd0 vgd0Var = this.f;
        if (length == 0) {
            if (vgd0Var != null) {
                vgd0Var.e.setVisibility(8);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        if (vgd0Var != null) {
            vgd0Var.e.setPlainText(reason);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void g(BigDecimal bigDecimal) {
        BigDecimal bigDecimalG;
        ms6 ms6Var;
        String strB = getCountryManager().B();
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        String plainString = bigDecimal.setScale(2, roundingMode).toPlainString();
        Bet bet = this.w;
        if (bet == null) {
            Intrinsics.n("betItem");
            throw null;
        }
        String str = bet.stake;
        if (str == null || (bigDecimalG = kotlin.text.b.g(str)) == null) {
            bigDecimalG = BigDecimal.ZERO;
        }
        bigDecimalG.getClass();
        TaxConfig taxConfig = this.z;
        BigDecimal scale = bigDecimal.setScale(2, roundingMode);
        if (taxConfig == null || !taxConfig.hasRate()) {
            scale.getClass();
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            bigDecimal2.getClass();
            ms6Var = new ms6(false, scale, bigDecimal2);
        } else {
            BigDecimal scale2 = taxConfig.getTax(bigDecimal, bigDecimalG).setScale(2, roundingMode);
            scale.getClass();
            scale2.getClass();
            ms6Var = new ms6(true, scale, scale2);
        }
        if (ms6Var.c) {
            BigDecimal bigDecimal3 = ms6Var.b;
            BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal3);
            bigDecimalSubtract.getClass();
            String strC = sn5.c(this, R.string.cashout__confirm_amount, strB, bigDecimalSubtract.setScale(2, roundingMode).toPlainString());
            String strC2 = sn5.c(this, R.string.cashout__confirm_tax_formula, strB, plainString, strB, bigDecimal3.toPlainString());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strC);
            spannableStringBuilder.append((CharSequence) "\n");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) strC2);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(12, true), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new StyleSpan(0), length, spannableStringBuilder.length(), 33);
            getConfirmButton().setText(spannableStringBuilder);
        } else {
            getConfirmButton().setText(sn5.c(this, R.string.cashout__confirm_amount, strB, plainString));
        }
        getConfirmButton().setGravity(17);
        h();
    }

    public final String getBetId() {
        Bet bet = this.w;
        if (bet != null) {
            return bet.id;
        }
        Intrinsics.n("betItem");
        throw null;
    }

    public final yo6 getCashoutConfigManager() {
        yo6 yo6Var = this.cashoutConfigManager;
        if (yo6Var != null) {
            return yo6Var;
        }
        Intrinsics.n("cashoutConfigManager");
        throw null;
    }

    public final TextView getConfirmButton() {
        TextView textView = this.confirmButton;
        if (textView != null) {
            return textView;
        }
        Intrinsics.n("confirmButton");
        throw null;
    }

    public final ProgressButton getConfirmProgressBtn() {
        ProgressButton progressButton = this.confirmProgressBtn;
        if (progressButton != null) {
            return progressButton;
        }
        Intrinsics.n("confirmProgressBtn");
        throw null;
    }

    public final psm getCountryManager() {
        psm psmVar = this.countryManager;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    public final a getListener() {
        return this.listener;
    }

    public final boolean getShouldShowForceUpdateApp() {
        return this.shouldShowForceUpdateApp;
    }

    public final hrd0 getStakeConfigRepository() {
        hrd0 hrd0Var = this.stakeConfigRepository;
        if (hrd0Var != null) {
            return hrd0Var;
        }
        Intrinsics.n("stakeConfigRepository");
        throw null;
    }

    public final void h() {
        Bet bet = this.w;
        if (bet == null) {
            Intrinsics.n("betItem");
            throw null;
        }
        int i = bet.isFallbackCashOut ? 242 : 282;
        int i2 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
        if (i != this.B) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = i2;
            setLayoutParams(layoutParams);
            requestLayout();
            this.B = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.listener = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        vgd0 vgd0VarA = vgd0.a(this);
        this.f = vgd0VarA;
        setConfirmButton(vgd0VarA.w);
        vgd0 vgd0Var = this.f;
        if (vgd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        setConfirmProgressBtn(vgd0Var.c);
        this.C = getConfirmButton().getBackground();
        this.D = getConfirmButton().getTextColors();
    }

    public final void setCashoutConfigManager(yo6 yo6Var) {
        yo6Var.getClass();
        this.cashoutConfigManager = yo6Var;
    }

    public final void setConfirmButton(TextView textView) {
        textView.getClass();
        this.confirmButton = textView;
    }

    public final void setConfirmProgressBtn(ProgressButton progressButton) {
        progressButton.getClass();
        this.confirmProgressBtn = progressButton;
    }

    public final void setCountryManager(psm psmVar) {
        psmVar.getClass();
        this.countryManager = psmVar;
    }

    public final void setListener(a aVar) {
        this.listener = aVar;
    }

    public final void setShouldShowForceUpdateApp(boolean z) {
        this.shouldShowForceUpdateApp = z;
    }

    public final void setStakeConfigRepository(hrd0 hrd0Var) {
        hrd0Var.getClass();
        this.stakeConfigRepository = hrd0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [ppn] */
    public final void setup(final pl6 wrapper, final a listener, TaxConfig realSportTaxConfig, boolean animate, boolean shouldShowForceUpdateApp) {
        wrapper.getClass();
        listener.getClass();
        this.shouldShowForceUpdateApp = shouldShowForceUpdateApp;
        this.z = realSportTaxConfig;
        final Bet bet = wrapper.a;
        bet.getClass();
        this.w = bet;
        this.y = animate;
        vgd0 vgd0Var = this.f;
        if (vgd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var.D.setMax(CashOut.BIG_NUMBER);
        this.A = CashOut.BIG_NUMBER;
        vgd0 vgd0Var2 = this.f;
        if (vgd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var2.D.setProgress(CashOut.BIG_NUMBER);
        this.listener = listener;
        ?? r14 = new View.OnClickListener() { // from class: ppn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = InstantCashoutView.J;
                InstantCashoutView instantCashoutView = this.a;
                b.a aVar = new b.a(instantCashoutView.getContext());
                aVar.a.f = sn5.c(instantCashoutView, R.string.cashout__partial_cashout_rule, new Object[0]);
                aVar.c(sn5.c(instantCashoutView, R.string.common_functions__ok, new Object[0]), null);
                aVar.f();
            }
        };
        vgd0 vgd0Var3 = this.f;
        if (vgd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        e(vgd0Var3.C, r14);
        vgd0 vgd0Var4 = this.f;
        if (vgd0Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        e(vgd0Var4.K, r14);
        vgd0 vgd0Var5 = this.f;
        if (vgd0Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var5.D.setOnSeekBarChangeListener(new d(listener));
        vgd0 vgd0Var6 = this.f;
        if (vgd0Var6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        sn5.f(vgd0Var6.G, Intrinsics.g(bet.stake, bet.originStake) ? R.string.common_functions__stake : R.string.cashout__remaining_stake, new Object[0]);
        vgd0 vgd0Var7 = this.f;
        if (vgd0Var7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var7.F.setText(bet.stake);
        vgd0 vgd0Var8 = this.f;
        if (vgd0Var8 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var8.f.setText(bet.getPotWin());
        int i = bet.combinationNum > 1 ? 0 : 8;
        vgd0 vgd0Var9 = this.f;
        if (vgd0Var9 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var9.C.setVisibility(i);
        vgd0 vgd0Var10 = this.f;
        if (vgd0Var10 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var10.K.setVisibility(i);
        final cq40 cq40Var = new cq40();
        final cq40 cq40Var2 = new cq40();
        getConfirmButton().setOnClickListener(new View.OnClickListener() { // from class: qpn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = InstantCashoutView.J;
                long jCurrentTimeMillis = System.currentTimeMillis();
                InstantCashoutView instantCashoutView = this.a;
                boolean z = instantCashoutView.G;
                InstantCashoutView.a aVar = listener;
                if (!z) {
                    cq40 cq40Var3 = cq40Var;
                    if (jCurrentTimeMillis - cq40Var3.a < 500) {
                        return;
                    }
                    cq40Var3.a = jCurrentTimeMillis;
                    aVar.a(wrapper, bet.cashOut.isSupportPartial);
                    return;
                }
                long j = instantCashoutView.getCashoutConfigManager().d().u;
                cq40 cq40Var4 = cq40Var2;
                if (jCurrentTimeMillis - cq40Var4.a < j) {
                    return;
                }
                cq40Var4.a = jCurrentTimeMillis;
                Bet bet2 = instantCashoutView.w;
                if (bet2 != null) {
                    aVar.c(bet2.id);
                } else {
                    Intrinsics.n("betItem");
                    throw null;
                }
            }
        });
        vgd0 vgd0Var11 = this.f;
        if (vgd0Var11 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var11.J.setOnClickListener(new b(new cq40(), listener));
        vgd0 vgd0Var12 = this.f;
        if (vgd0Var12 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var12.v.setOnClickListener(new c(new cq40(), listener, wrapper));
        vgd0 vgd0Var13 = this.f;
        if (vgd0Var13 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        listener.d(vgd0Var13.D.getProgress());
        d();
        if (realSportTaxConfig == null || !realSportTaxConfig.hasRate()) {
            vgd0 vgd0Var14 = this.f;
            if (vgd0Var14 != null) {
                vgd0Var14.H.setVisibility(8);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        vgd0 vgd0Var15 = this.f;
        if (vgd0Var15 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        sn5.f(vgd0Var15.H, realSportTaxConfig.isNetType() ? R.string.cashout__star_cashout_winnings_exceeding_origin_stake : R.string.cashout__star_all_cashout_is_considered_a_win, new Object[0]);
        vgd0 vgd0Var16 = this.f;
        if (vgd0Var16 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        vgd0Var16.H.setVisibility(0);
        if (!getConfirmButton().isEnabled() || this.G) {
            vgd0 vgd0Var17 = this.f;
            if (vgd0Var17 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var17.H.setVisibility(8);
        }
        vgd0 vgd0Var18 = this.f;
        if (vgd0Var18 != null) {
            vgd0Var18.i.setText(sn5.c(this, R.string.component_betslip__to_win, new Object[0]));
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstantCashoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstantCashoutView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ InstantCashoutView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
