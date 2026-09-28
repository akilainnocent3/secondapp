package com.sportybet.android.virtual.presentation.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.flexbox.FlexboxLayout;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.InstantWinMultipleBetBonusHint;
import com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout;
import com.sportybet.android.widget.ArrowButton;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.plugin.realsports.betslip.widget.IndicatorLayout;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.a8b;
import defpackage.bjb0;
import defpackage.bmy;
import defpackage.bqe;
import defpackage.dj5;
import defpackage.efo;
import defpackage.ffo;
import defpackage.fqy;
import defpackage.fvh;
import defpackage.gky;
import defpackage.h5e;
import defpackage.iwh0;
import defpackage.j7g;
import defpackage.jpk;
import defpackage.m2l;
import defpackage.m780;
import defpackage.mpe0;
import defpackage.o4p;
import defpackage.r5j;
import defpackage.s5y;
import defpackage.seo;
import defpackage.sn5;
import defpackage.spi;
import defpackage.sqo;
import defpackage.tlo;
import defpackage.tug;
import defpackage.uuo;
import defpackage.zch0;
import defpackage.zi50;
import defpackage.zpy;
import defpackage.zyf0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001AB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJI\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u00162\b\b\u0002\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/sportybet/android/virtual/presentation/widget/InstantWinFooterLayout;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lo4p;", "ivTicketData", "", "stake", "Lcom/sportybet/android/virtual/presentation/widget/InstantWinFooterLayout$a;", "instantWinFooterListener", "Lcom/sporty/android/core/model/config/tax/TaxConfig;", "config", "isFlexAvailable", "isOneCutAvailable", "Lm780;", "selectedGiftInfo", "", "setupFooter", "(Lo4p;Ljava/lang/String;Lcom/sportybet/android/virtual/presentation/widget/InstantWinFooterLayout$a;Lcom/sporty/android/core/model/config/tax/TaxConfig;IILm780;)V", "", "hasExciseTaxRate", "exciseTax", "betSlipType", "setShowExciseTax", "(ZLjava/lang/String;Ljava/lang/String;)V", "Ljava/math/BigDecimal;", "getCurrentFlexOdds", "()Ljava/math/BigDecimal;", "betType", "setOneCutCount", "(Ljava/lang/String;)V", "Landroid/widget/CheckBox;", "checkBox", "setIndicatorLayout", "(Landroid/widget/CheckBox;)V", "Ltlo;", "d", "Ltlo;", "getSharedData", "()Ltlo;", "setSharedData", "(Ltlo;)V", "sharedData", "Lm2l;", "e", "Lm2l;", "getDataStore", "()Lm2l;", "setDataStore", "(Lm2l;)V", "dataStore", "Ljpk;", "f", "Ljpk;", "getGiftManager", "()Ljpk;", "setGiftManager", "(Ljpk;)V", "giftManager", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InstantWinFooterLayout extends Hilt_InstantWinFooterLayout {
    public static final BigDecimal B = new BigDecimal(-1);
    public final StringBuilder A;
    public final seo c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public tlo sharedData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public m2l dataStore;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public jpk giftManager;
    public final DecimalFormat i;
    public int v;
    public boolean w;
    public a y;
    public final StringBuilder z;

    public interface a {
        void F();

        void J(int i);

        void T(int i, String str, boolean z);

        void h0();

        void m();

        void n();

        boolean v();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantWinFooterLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((ffo) generatedComponent()).n(this);
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.instant_win_footer, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.arrow_down;
        ArrowButton arrowButton = (ArrowButton) h5e.a(R.id.arrow_down, viewInflate);
        if (arrowButton != null) {
            i2 = R.id.arrow_up;
            ArrowButton arrowButton2 = (ArrowButton) h5e.a(R.id.arrow_up, viewInflate);
            if (arrowButton2 != null) {
                i2 = R.id.bonus_layout;
                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.bonus_layout, viewInflate);
                if (linearLayout != null) {
                    i2 = R.id.bonus_value;
                    TextView textView = (TextView) h5e.a(R.id.bonus_value, viewInflate);
                    if (textView != null) {
                        i2 = R.id.check_box_container;
                        if (((LinearLayout) h5e.a(R.id.check_box_container, viewInflate)) != null) {
                            i2 = R.id.excise_tax_layout;
                            LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.excise_tax_layout, viewInflate);
                            if (linearLayout2 != null) {
                                i2 = R.id.excise_tax_value;
                                TextView textView2 = (TextView) h5e.a(R.id.excise_tax_value, viewInflate);
                                if (textView2 != null) {
                                    i2 = R.id.flex_bet_hint;
                                    TextView textView3 = (TextView) h5e.a(R.id.flex_bet_hint, viewInflate);
                                    if (textView3 != null) {
                                        i2 = R.id.flex_bet_text;
                                        if (((TextView) h5e.a(R.id.flex_bet_text, viewInflate)) != null) {
                                            i2 = R.id.flex_control_panel;
                                            RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.flex_control_panel, viewInflate);
                                            if (relativeLayout != null) {
                                                i2 = R.id.flex_error_msg;
                                                if (((TextView) h5e.a(R.id.flex_error_msg, viewInflate)) != null) {
                                                    i2 = R.id.flexibet_help;
                                                    ImageView imageView = (ImageView) h5e.a(R.id.flexibet_help, viewInflate);
                                                    if (imageView != null) {
                                                        i2 = R.id.flexibet_num;
                                                        TextView textView4 = (TextView) h5e.a(R.id.flexibet_num, viewInflate);
                                                        if (textView4 != null) {
                                                            i2 = R.id.flexible_check_box;
                                                            CheckBox checkBox = (CheckBox) h5e.a(R.id.flexible_check_box, viewInflate);
                                                            if (checkBox != null) {
                                                                i2 = R.id.flexipop;
                                                                BubbleView bubbleView = (BubbleView) h5e.a(R.id.flexipop, viewInflate);
                                                                if (bubbleView != null) {
                                                                    i2 = R.id.gifts;
                                                                    TextView textView5 = (TextView) h5e.a(R.id.gifts, viewInflate);
                                                                    if (textView5 != null) {
                                                                        i2 = R.id.gifts_container;
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) h5e.a(R.id.gifts_container, viewInflate);
                                                                        if (relativeLayout2 != null) {
                                                                            i2 = R.id.gifts_label;
                                                                            if (((TextView) h5e.a(R.id.gifts_label, viewInflate)) != null) {
                                                                                i2 = R.id.indicator_layout;
                                                                                IndicatorLayout indicatorLayout = (IndicatorLayout) h5e.a(R.id.indicator_layout, viewInflate);
                                                                                if (indicatorLayout != null) {
                                                                                    i2 = R.id.line;
                                                                                    View viewA = h5e.a(R.id.line, viewInflate);
                                                                                    if (viewA != null) {
                                                                                        i2 = R.id.multiplebet_bonus_hint;
                                                                                        InstantWinMultipleBetBonusHint instantWinMultipleBetBonusHint = (InstantWinMultipleBetBonusHint) h5e.a(R.id.multiplebet_bonus_hint, viewInflate);
                                                                                        if (instantWinMultipleBetBonusHint != null) {
                                                                                            i2 = R.id.one_cut_check_box;
                                                                                            CheckBox checkBox2 = (CheckBox) h5e.a(R.id.one_cut_check_box, viewInflate);
                                                                                            if (checkBox2 != null) {
                                                                                                i2 = R.id.one_cut_hint;
                                                                                                TextView textView6 = (TextView) h5e.a(R.id.one_cut_hint, viewInflate);
                                                                                                if (textView6 != null) {
                                                                                                    i2 = R.id.one_cut_still_win;
                                                                                                    TextView textView7 = (TextView) h5e.a(R.id.one_cut_still_win, viewInflate);
                                                                                                    if (textView7 != null) {
                                                                                                        i2 = R.id.one_cut_still_win_container;
                                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) h5e.a(R.id.one_cut_still_win_container, viewInflate);
                                                                                                        if (relativeLayout3 != null) {
                                                                                                            i2 = R.id.one_cut_still_win_label;
                                                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.one_cut_still_win_label, viewInflate);
                                                                                                            if (appCompatTextView != null) {
                                                                                                                i2 = R.id.over_max_stake_msg;
                                                                                                                TextView textView8 = (TextView) h5e.a(R.id.over_max_stake_msg, viewInflate);
                                                                                                                if (textView8 != null) {
                                                                                                                    i2 = R.id.over_max_stake_msg_for_system;
                                                                                                                    TextView textView9 = (TextView) h5e.a(R.id.over_max_stake_msg_for_system, viewInflate);
                                                                                                                    if (textView9 != null) {
                                                                                                                        i2 = R.id.potentail_win_layout;
                                                                                                                        if (((LinearLayout) h5e.a(R.id.potentail_win_layout, viewInflate)) != null) {
                                                                                                                            i2 = R.id.potentail_win_value;
                                                                                                                            TextView textView10 = (TextView) h5e.a(R.id.potentail_win_value, viewInflate);
                                                                                                                            if (textView10 != null) {
                                                                                                                                i2 = R.id.potential_win_label;
                                                                                                                                TextView textView11 = (TextView) h5e.a(R.id.potential_win_label, viewInflate);
                                                                                                                                if (textView11 != null) {
                                                                                                                                    i2 = R.id.sporty_insure;
                                                                                                                                    FlexboxLayout flexboxLayout = (FlexboxLayout) h5e.a(R.id.sporty_insure, viewInflate);
                                                                                                                                    if (flexboxLayout != null) {
                                                                                                                                        i2 = R.id.sporty_insure_title;
                                                                                                                                        TextView textView12 = (TextView) h5e.a(R.id.sporty_insure_title, viewInflate);
                                                                                                                                        if (textView12 != null) {
                                                                                                                                            i2 = R.id.stake_per_bet_layout;
                                                                                                                                            StakeItemLayout stakeItemLayout = (StakeItemLayout) h5e.a(R.id.stake_per_bet_layout, viewInflate);
                                                                                                                                            if (stakeItemLayout != null) {
                                                                                                                                                i2 = R.id.system_layout;
                                                                                                                                                LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.system_layout, viewInflate);
                                                                                                                                                if (linearLayout3 != null) {
                                                                                                                                                    i2 = R.id.top_line;
                                                                                                                                                    View viewA2 = h5e.a(R.id.top_line, viewInflate);
                                                                                                                                                    if (viewA2 != null) {
                                                                                                                                                        i2 = R.id.total_odds_layout;
                                                                                                                                                        LinearLayout linearLayout4 = (LinearLayout) h5e.a(R.id.total_odds_layout, viewInflate);
                                                                                                                                                        if (linearLayout4 != null) {
                                                                                                                                                            i2 = R.id.total_odds_value;
                                                                                                                                                            TextView textView13 = (TextView) h5e.a(R.id.total_odds_value, viewInflate);
                                                                                                                                                            if (textView13 != null) {
                                                                                                                                                                i2 = R.id.total_stake_layout;
                                                                                                                                                                LinearLayout linearLayout5 = (LinearLayout) h5e.a(R.id.total_stake_layout, viewInflate);
                                                                                                                                                                if (linearLayout5 != null) {
                                                                                                                                                                    i2 = R.id.total_stake_value;
                                                                                                                                                                    TextView textView14 = (TextView) h5e.a(R.id.total_stake_value, viewInflate);
                                                                                                                                                                    if (textView14 != null) {
                                                                                                                                                                        i2 = R.id.wh_tax_layout;
                                                                                                                                                                        LinearLayout linearLayout6 = (LinearLayout) h5e.a(R.id.wh_tax_layout, viewInflate);
                                                                                                                                                                        if (linearLayout6 != null) {
                                                                                                                                                                            i2 = R.id.wh_tax_value;
                                                                                                                                                                            TextView textView15 = (TextView) h5e.a(R.id.wh_tax_value, viewInflate);
                                                                                                                                                                            if (textView15 != null) {
                                                                                                                                                                                this.c = new seo((RelativeLayout) viewInflate, arrowButton, arrowButton2, linearLayout, textView, linearLayout2, textView2, textView3, relativeLayout, imageView, textView4, checkBox, bubbleView, textView5, relativeLayout2, indicatorLayout, viewA, instantWinMultipleBetBonusHint, checkBox2, textView6, textView7, relativeLayout3, appCompatTextView, textView8, textView9, textView10, textView11, flexboxLayout, textView12, stakeItemLayout, linearLayout3, viewA2, linearLayout4, textView13, linearLayout5, textView14, linearLayout6, textView15);
                                                                                                                                                                                setPadding(0, 0, 0, bqe.a(16.0f));
                                                                                                                                                                                this.i = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.US));
                                                                                                                                                                                this.v = 2;
                                                                                                                                                                                this.z = new StringBuilder("");
                                                                                                                                                                                this.A = new StringBuilder("");
                                                                                                                                                                                return;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public static BigDecimal a(o4p o4pVar) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(Double.MAX_VALUE);
        ArrayList arrayList = o4pVar.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            BigDecimal bigDecimal = ((o4p.a) obj).a;
            if (bigDecimal.compareTo(BigDecimal.ZERO) > 0 && bigDecimal.compareTo(bigDecimalValueOf) < 0) {
                bigDecimalValueOf = bigDecimal;
            }
        }
        if (bigDecimalValueOf.compareTo(BigDecimal.valueOf(Double.MAX_VALUE)) == 0) {
            bigDecimalValueOf = BigDecimal.ZERO;
        }
        bigDecimalValueOf.getClass();
        return bigDecimalValueOf;
    }

    public static String c(BigDecimal bigDecimal) {
        return bjb0.L(bigDecimal.multiply(B), Locale.US);
    }

    public static fqy d(Map map, BigDecimal bigDecimal, TaxConfig taxConfig) {
        BigDecimal bigDecimal2 = (BigDecimal) map.get("ALL_WIN");
        if (bigDecimal2 == null) {
            bigDecimal2 = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal3 = (BigDecimal) map.get("CUT_BET");
        if (bigDecimal3 == null) {
            bigDecimal3 = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal4 = (BigDecimal) map.get("ORIGINAL_ALL_WIN");
        if (bigDecimal4 == null) {
            bigDecimal4 = BigDecimal.ZERO;
        }
        bigDecimal2.getClass();
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(new BigDecimal(10000));
        bigDecimalMultiply.getClass();
        BigDecimal tax = taxConfig.getTax(bigDecimal2, bigDecimalMultiply);
        bigDecimal3.getClass();
        BigDecimal bigDecimalMultiply2 = bigDecimal.multiply(new BigDecimal(10000));
        bigDecimalMultiply2.getClass();
        BigDecimal bigDecimalSubtract = bigDecimal3.subtract(taxConfig.getTax(bigDecimal3, bigDecimalMultiply2));
        if (bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
            return new fqy("--", "--", "--", "--", 0L, 0L);
        }
        BigDecimal bigDecimalMultiply3 = bigDecimal.multiply(new BigDecimal(10000));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal bigDecimalDivide = bigDecimal4.divide(bigDecimalMultiply3, 2, roundingMode);
        Locale locale = Locale.US;
        String strL = bjb0.L(bigDecimalDivide, locale);
        String strL2 = bjb0.L(tax.divide(new BigDecimal(10000), 2, roundingMode).multiply(B), locale);
        BigDecimal bigDecimalSubtract2 = bigDecimal2.subtract(tax);
        bigDecimalSubtract2.getClass();
        return new fqy(strL, strL2, bjb0.L(bigDecimalSubtract2.divide(new BigDecimal(10000), 2, roundingMode), locale), bjb0.L(bigDecimalSubtract.divide(new BigDecimal(10000)), locale), Long.valueOf(bigDecimal2.longValue()), Long.valueOf(bigDecimal3.longValue()));
    }

    public static String f(o4p o4pVar, int i, String str) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            BigDecimal bigDecimalB = o4pVar.b(i);
            bVar = bigDecimalB != null ? bigDecimalB.toPlainString() : null;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        String str2 = (String) (bVar instanceof zi50.b ? null : bVar);
        if (str2 == null) {
            return str == null ? "" : str;
        }
        return str2;
    }

    public static final void i(InstantWinFooterLayout instantWinFooterLayout, seo seoVar) {
        instantWinFooterLayout.setIndicatorLayout(seoVar.A);
    }

    public static final void j(InstantWinFooterLayout instantWinFooterLayout, seo seoVar) {
        instantWinFooterLayout.setIndicatorLayout(seoVar.H);
    }

    private final void setIndicatorLayout(CheckBox checkBox) {
        boolean zIsChecked = checkBox.isChecked();
        seo seoVar = this.c;
        if (!zIsChecked) {
            seoVar.E.setVisibility(8);
            return;
        }
        seoVar.E.setVisibility(0);
        int[] iArr = new int[2];
        checkBox.getLocationOnScreen(iArr);
        seoVar.E.setTriangleOffset(zch0.a(checkBox.getContext(), 14) + iArr[0]);
    }

    private final void setOneCutCount(String betType) {
        StringBuilder sb = this.z;
        sb.getClass();
        sb.setLength(0);
        StringBuilder sb2 = this.A;
        sb2.getClass();
        sb2.setLength(0);
        boolean zK = getSharedData().k();
        seo seoVar = this.c;
        if (!zK || !Intrinsics.g(betType, SimulateBetConsts.BetslipType.MULTIPLE)) {
            TextView textView = seoVar.P;
            Context context = getContext();
            context.getClass();
            textView.setText(sn5.b(context, R.string.component_betslip__to_win, new Object[0]));
            return;
        }
        int i = getSharedData().f().h;
        if (i > 1) {
            AppCompatTextView appCompatTextView = seoVar.L;
            TextView textView2 = seoVar.P;
            Context context2 = getContext();
            context2.getClass();
            appCompatTextView.setText(sn5.b(context2, R.string.common_functions__one_cut_win, new Object[0]));
            Context context3 = getContext();
            context3.getClass();
            textView2.setText(sn5.b(context3, R.string.component_betslip__to_win, new Object[0]));
            int i2 = i + 1;
            Context context4 = getContext();
            context4.getClass();
            String strB = sn5.b(context4, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(i), String.valueOf(i2));
            Context context5 = getContext();
            context5.getClass();
            String strB2 = sn5.b(context5, R.string.component_betslip__vselection_of_vthreshold, String.valueOf(i2), String.valueOf(i2));
            String strA = tug.a(" (", strB, ")");
            String strA2 = tug.a(" (", strB2, ")");
            sb.append(appCompatTextView.getText());
            sb.append(strA);
            sb2.append(textView2.getText());
            sb2.append(strA2);
            appCompatTextView.setText(sb);
            textView2.setText(sb2);
        }
    }

    public final String b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bjb0.L(bigDecimal.min(getSharedData().i()).subtract(bigDecimal2), Locale.US);
    }

    public final String e(m780 m780Var, TaxConfig taxConfig, BigDecimal bigDecimal) {
        if (m780Var == null || getSharedData().k()) {
            return bjb0.L(taxConfig.getExciseTax(bigDecimal), Locale.US);
        }
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(new BigDecimal(c.p(m780Var.a, ",", "", false)));
        bigDecimalSubtract.getClass();
        BigDecimal bigDecimalMax = bigDecimalSubtract.max(BigDecimal.ZERO);
        bigDecimalMax.getClass();
        return bjb0.L(taxConfig.getExciseTax(bigDecimalMax), Locale.US);
    }

    public final void g(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z) {
        if (Intrinsics.g(str, SimulateBetConsts.BetslipType.MULTIPLE) && getSharedData().k()) {
            spi spiVarF = getSharedData().f();
            fqy fqyVar = spiVarF != null ? spiVarF.g : null;
            long jLongValue = fqyVar != null ? fqyVar.f.longValue() : 0L;
            long jLongValue2 = fqyVar != null ? fqyVar.e.longValue() : 0L;
            boolean z2 = jLongValue > jLongValue2;
            boolean z3 = bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) == 0 && jLongValue == jLongValue2;
            boolean zH = h(fqyVar);
            if (!z2 && !z3 && !zH) {
                this.w = false;
                return;
            }
            seo seoVar = this.c;
            if (z2 && bigDecimal != null && bigDecimal.compareTo(bigDecimal2) >= 0) {
                seoVar.O.setText("--");
                seoVar.J.setText("--");
                seoVar.a0.setText("--");
            }
            if (z3) {
                seoVar.W.setText("--");
                seoVar.O.setText("0.00");
                seoVar.i.setText("0.00");
                seoVar.J.setText("0.00");
                seoVar.a0.setText("0.00");
            }
            if (!z || this.w) {
                return;
            }
            this.w = true;
            zyf0.b(R.string.component_betslip__one_cut_odds_too_small_tip, 0);
        }
    }

    public final BigDecimal getCurrentFlexOdds() {
        return new BigDecimal(c.p(this.c.W.getText().toString(), ",", "", false));
    }

    public final m2l getDataStore() {
        m2l m2lVar = this.dataStore;
        if (m2lVar != null) {
            return m2lVar;
        }
        Intrinsics.n("dataStore");
        throw null;
    }

    public final jpk getGiftManager() {
        jpk jpkVar = this.giftManager;
        if (jpkVar != null) {
            return jpkVar;
        }
        Intrinsics.n("giftManager");
        throw null;
    }

    public final tlo getSharedData() {
        tlo tloVar = this.sharedData;
        if (tloVar != null) {
            return tloVar;
        }
        Intrinsics.n("sharedData");
        throw null;
    }

    public final boolean h(fqy fqyVar) {
        BigDecimal bigDecimalG;
        Double dG = getSharedData().g();
        if (dG != null) {
            BigDecimal bigDecimal = s5y.a;
            BigDecimal bigDecimal2 = new BigDecimal(dG.toString());
            if (bigDecimal2.compareTo(BigDecimal.ZERO) > 0 && fqyVar != null && (bigDecimalG = b.g(c.p(fqyVar.a, ",", "", false))) != null && bigDecimalG.compareTo(bigDecimal2) < 0) {
                return true;
            }
        }
        return false;
    }

    public final void k(o4p o4pVar, TaxConfig taxConfig, m780 m780Var) {
        BigDecimal scale;
        BigDecimal tax;
        String strA;
        String str;
        fqy fqyVar;
        fqy fqyVar2;
        HashMap map;
        fvh fvhVar;
        HashMap map2;
        fvh fvhVar2;
        HashMap map3;
        fvh fvhVar3;
        Map map4;
        spi spiVarF;
        int i;
        seo seoVar;
        String str2;
        String str3;
        String str4;
        int i2;
        BigDecimal tax2;
        BigDecimal tax3;
        String strB;
        String strA2;
        fqy fqyVar3;
        fqy fqyVar4;
        o4p.d dVar;
        InstantWinMultipleBetBonusHint instantWinMultipleBetBonusHint;
        HashMap map5;
        fvh fvhVar4;
        HashMap map6;
        fvh fvhVar5;
        HashMap map7;
        fvh fvhVar6;
        Map map8;
        spi spiVarF2;
        spi spiVarF3;
        spi spiVarF4;
        String strA3;
        String strA4;
        boolean zEquals = TextUtils.equals(o4pVar.a, SimulateBetConsts.BetslipType.SINGLE);
        seo seoVar2 = this.c;
        if (zEquals) {
            o4p.d dVar2 = o4pVar.i.get(o4pVar.f);
            seoVar2.d.setVisibility(8);
            seoVar2.Y.setText(bjb0.L(dVar2.c, Locale.US));
            l(dVar2.c, o4pVar.a);
            seoVar2.G.setVisibility(8);
            BigDecimal bigDecimalA = a(o4pVar);
            BigDecimal bigDecimal = dVar2.a;
            BigDecimal bigDecimal2 = dVar2.b;
            BigDecimal bigDecimal3 = dVar2.f;
            BigDecimal bigDecimal4 = dVar2.i;
            seoVar2.Z.setVisibility(taxConfig.hasRate() ? 0 : 8);
            if (Intrinsics.g(bigDecimal, bigDecimal2)) {
                bigDecimalA = bigDecimal4;
            }
            BigDecimal tax4 = taxConfig.getTax(bigDecimal, bigDecimalA);
            BigDecimal tax5 = taxConfig.getTax(bigDecimal2, bigDecimal4);
            BigDecimal bigDecimalAdd = tax5.add(bigDecimal3);
            bigDecimalAdd.getClass();
            String strC = c(bigDecimalAdd);
            BigDecimal bigDecimalMin = bigDecimal2.add(bigDecimal3).min(getSharedData().i());
            bigDecimalMin.getClass();
            String strB2 = b(bigDecimalMin, tax5);
            if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                BigDecimal bigDecimalAdd2 = tax4.add(bigDecimal3);
                bigDecimalAdd2.getClass();
                strA3 = c(bigDecimalAdd2);
            } else {
                strA3 = tug.a(c(tax4), " ~ ", strC);
            }
            seoVar2.a0.setText(strA3);
            if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                BigDecimal bigDecimalMin2 = bigDecimal.add(bigDecimal3).min(getSharedData().i());
                bigDecimalMin2.getClass();
                strA4 = b(bigDecimalMin2, tax4);
            } else {
                strA4 = tug.a(b(bigDecimal, tax4), " ~ ", strB2);
            }
            seoVar2.O.setText(strA4);
            setShowExciseTax(taxConfig.hasExciseTaxRate(), e(m780Var, taxConfig, dVar2.c), o4pVar.a);
            return;
        }
        String str5 = o4pVar.a;
        String str6 = SimulateBetConsts.BetslipType.MULTIPLE;
        String str7 = "0";
        String str8 = "ONE_CUT";
        if (!TextUtils.equals(str5, SimulateBetConsts.BetslipType.MULTIPLE)) {
            if (TextUtils.equals(o4pVar.a, "system")) {
                TextView textView = seoVar2.Y;
                LinearLayout linearLayout = seoVar2.d;
                textView.setText(bjb0.L(o4pVar.j, Locale.US));
                SparseArray<o4p.d> sparseArray = o4pVar.i;
                BigDecimal bigDecimalMin3 = BigDecimal.ZERO;
                int size = sparseArray.size();
                BigDecimal bigDecimalAdd3 = bigDecimalMin3;
                BigDecimal bigDecimalAdd4 = bigDecimalAdd3;
                int i3 = 0;
                while (i3 < size) {
                    o4p.d dVarValueAt = sparseArray.valueAt(i3);
                    SparseArray<o4p.d> sparseArray2 = sparseArray;
                    BigDecimal bigDecimal5 = BigDecimal.ZERO;
                    if (bigDecimalMin3.compareTo(bigDecimal5) == 0) {
                        bigDecimalMin3 = bigDecimalMin3.max(dVarValueAt.a);
                        i = size;
                    } else {
                        i = size;
                        if (dVarValueAt.a.compareTo(bigDecimal5) > 0) {
                            bigDecimalMin3 = bigDecimalMin3.min(dVarValueAt.a);
                        }
                    }
                    bigDecimalAdd3 = bigDecimalAdd3.add(dVarValueAt.b);
                    bigDecimalAdd4 = bigDecimalAdd4.add(dVarValueAt.i);
                    i3++;
                    sparseArray = sparseArray2;
                    size = i;
                }
                BigDecimal bigDecimalA2 = a(o4pVar);
                BigDecimal bigDecimalI = getSharedData().i();
                if (o4pVar.k.compareTo(bigDecimalI) <= 0) {
                    bigDecimalI = o4pVar.k;
                }
                o4pVar.l.compareTo(getSharedData().i());
                if (bigDecimalI == null || (scale = bigDecimalI.setScale(2, RoundingMode.HALF_UP)) == null) {
                    scale = BigDecimal.ZERO;
                }
                BigDecimal bigDecimal6 = BigDecimal.ZERO;
                if (scale.compareTo(bigDecimal6) > 0) {
                    if (seoVar2.A.isChecked() || seoVar2.H.isChecked()) {
                        linearLayout.setVisibility(8);
                        getSharedData().f().e = false;
                    } else {
                        linearLayout.setVisibility(0);
                        getSharedData().f().e = true;
                    }
                    seoVar2.e.setText(bjb0.L(bigDecimalI, Locale.US));
                    getSharedData().f().d = true;
                } else {
                    linearLayout.setVisibility(8);
                    getSharedData().f().d = false;
                    getSharedData().f().e = false;
                }
                String str9 = o4pVar.a;
                BigDecimal bigDecimal7 = o4pVar.j;
                bigDecimal7.getClass();
                l(bigDecimal7, str9);
                seoVar2.G.setVisibility(8);
                bigDecimalMin3.getClass();
                bigDecimalAdd3.getClass();
                if (bigDecimalI == null) {
                    bigDecimalI = bigDecimal6;
                }
                bigDecimalI.getClass();
                bigDecimalAdd4.getClass();
                LinearLayout linearLayout2 = seoVar2.Z;
                TextView textView2 = seoVar2.W;
                TextView textView3 = seoVar2.O;
                TextView textView4 = seoVar2.a0;
                linearLayout2.setVisibility(taxConfig.hasRate() ? 0 : 8);
                BigDecimal tax6 = taxConfig.getTax(bigDecimalMin3, bigDecimalA2);
                if (bigDecimalI.compareTo(bigDecimal6) > 0) {
                    BigDecimal bigDecimalMin4 = bigDecimalAdd3.add(bigDecimalI).min(getSharedData().i());
                    bigDecimalMin4.getClass();
                    tax = taxConfig.getTax(bigDecimalMin4, bigDecimalAdd4);
                } else {
                    BigDecimal bigDecimalMin5 = bigDecimalAdd3.min(getSharedData().i());
                    bigDecimalMin5.getClass();
                    tax = taxConfig.getTax(bigDecimalMin5, bigDecimalAdd4);
                }
                String strC2 = c(tax);
                BigDecimal bigDecimalAdd5 = bigDecimalAdd3.add(bigDecimalI);
                bigDecimalAdd5.getClass();
                String strB3 = b(bigDecimalAdd5, tax);
                boolean z = bigDecimalMin3.equals(bigDecimalAdd3) || bigDecimalMin3.equals(bigDecimal6);
                String strC3 = z ? c(tax) : tug.a(c(tax6), " ~ ", strC2);
                String strB4 = b(bigDecimalMin3, tax6);
                if (z) {
                    BigDecimal bigDecimalAdd6 = bigDecimalAdd3.add(bigDecimalI);
                    bigDecimalAdd6.getClass();
                    strA = b(bigDecimalAdd6, tax);
                } else {
                    strA = tug.a(strB4, " ~ ", strB3);
                }
                if (TextUtils.equals(o4pVar.a, SimulateBetConsts.BetslipType.MULTIPLE)) {
                    spi spiVarF5 = getSharedData().f();
                    if (spiVarF5 != null && (map4 = spiVarF5.f) != null && (spiVarF = getSharedData().f()) != null) {
                        spiVarF.f = p(map4, bigDecimalAdd4, taxConfig);
                    }
                    Map<String, String> map9 = o4pVar.p;
                    if (map9.isEmpty()) {
                        map9 = null;
                    }
                    if (map9 != null) {
                        spi spiVarF6 = getSharedData().f();
                        String str10 = map9.get("ONE_CUT");
                        spiVarF6.g = r(str10 == null ? "0" : str10, o4pVar, taxConfig);
                    }
                    spi spiVarF7 = getSharedData().f();
                    if (spiVarF7 != null) {
                        spiVarF7.b = strC3;
                    }
                    spi spiVarF8 = getSharedData().f();
                    if (spiVarF8 != null) {
                        spiVarF8.c = strA;
                    }
                }
                if (seoVar2.A.isChecked()) {
                    spi spiVarF9 = getSharedData().f();
                    textView2.setText((spiVarF9 == null || (map3 = spiVarF9.f) == null || (fvhVar3 = (fvh) map3.get(Integer.valueOf(getSharedData().f().h))) == null) ? null : gky.a.a(bjb0.L(fvhVar3.a, Locale.US), false));
                    spi spiVarF10 = getSharedData().f();
                    textView4.setText((spiVarF10 == null || (map2 = spiVarF10.f) == null || (fvhVar2 = (fvh) map2.get(Integer.valueOf(getSharedData().f().h))) == null) ? null : fvhVar2.b);
                    spi spiVarF11 = getSharedData().f();
                    textView3.setText((spiVarF11 == null || (map = spiVarF11.f) == null || (fvhVar = (fvh) map.get(Integer.valueOf(getSharedData().f().h))) == null) ? null : fvhVar.c);
                } else if (seoVar2.H.isChecked()) {
                    spi spiVarF12 = getSharedData().f();
                    textView2.setText((spiVarF12 == null || (fqyVar2 = spiVarF12.g) == null) ? null : gky.a.a(fqyVar2.a, false));
                    spi spiVarF13 = getSharedData().f();
                    textView4.setText((spiVarF13 == null || (fqyVar = spiVarF13.g) == null) ? null : fqyVar.b);
                    fqy fqyVar5 = getSharedData().f().g;
                    textView3.setText(fqyVar5 != null ? fqyVar5.c : null);
                    TextView textView5 = seoVar2.J;
                    fqy fqyVar6 = getSharedData().f().g;
                    textView5.setText(fqyVar6 != null ? fqyVar6.d : null);
                    this.w = false;
                    String str11 = o4pVar.a;
                    BigDecimal bigDecimal8 = o4pVar.n;
                    Double dValueOf = Double.valueOf(getSharedData().a());
                    BigDecimal bigDecimal9 = s5y.a;
                    g(str11, bigDecimal8, new BigDecimal(dValueOf.toString()), false);
                } else {
                    spi spiVarF14 = getSharedData().f();
                    textView2.setText((spiVarF14 == null || (str = spiVarF14.a) == null) ? null : gky.a.a(str, false));
                    textView4.setText(strC3);
                    textView3.setText(strA);
                }
                boolean zHasExciseTaxRate = taxConfig.hasExciseTaxRate();
                BigDecimal bigDecimal10 = o4pVar.j;
                bigDecimal10.getClass();
                setShowExciseTax(zHasExciseTaxRate, e(m780Var, taxConfig, bigDecimal10), o4pVar.a);
                return;
            }
            return;
        }
        o4p.d dVar3 = o4pVar.i.get(o4pVar.f);
        if (o4pVar.p.isEmpty() || (spiVarF4 = getSharedData().f()) == null) {
            seoVar = seoVar2;
            str2 = SimulateBetConsts.BetslipType.MULTIPLE;
            str3 = "0";
            str4 = "ONE_CUT";
            i2 = 1;
        } else {
            Map<String, String> map10 = o4pVar.p;
            BigDecimal bigDecimal11 = dVar3.i;
            HashMap map11 = new HashMap();
            List listA0 = CollectionsKt.A0(map10.entrySet());
            i2 = 1;
            int size2 = listA0.size() - 1;
            int i4 = 0;
            while (i4 < size2) {
                Map.Entry entry = (Map.Entry) listA0.get(i4);
                String str12 = (String) entry.getKey();
                int i5 = i4;
                String str13 = (String) entry.getValue();
                String str14 = str7;
                BigDecimal bigDecimal12 = new BigDecimal(str13);
                List list = listA0;
                BigDecimal bigDecimalMin6 = bigDecimal12.multiply(bigDecimal11).min(getSharedData().i());
                bigDecimalMin6.getClass();
                BigDecimal tax7 = taxConfig.getTax(bigDecimalMin6, bigDecimal11);
                int i6 = size2;
                seo seoVar3 = seoVar2;
                double dDoubleValue = tax7.multiply(B).doubleValue();
                DecimalFormat decimalFormat = this.i;
                String str15 = decimalFormat.format(dDoubleValue);
                BigDecimal bigDecimalSubtract = bigDecimalMin6.subtract(tax7);
                bigDecimalSubtract.getClass();
                map11.put(Integer.valueOf(Integer.parseInt(str12)), new fvh(Integer.parseInt(str12), str15, decimalFormat.format(bigDecimalSubtract.doubleValue()), bigDecimal12));
                i4 = i5 + 1;
                str8 = str8;
                str7 = str14;
                bigDecimal11 = bigDecimal11;
                listA0 = list;
                size2 = i6;
                seoVar2 = seoVar3;
                str6 = str6;
            }
            seoVar = seoVar2;
            str2 = str6;
            str3 = str7;
            str4 = str8;
            spiVarF4.f = map11;
        }
        if (!o4pVar.q.isEmpty() && (spiVarF3 = getSharedData().f()) != null) {
            spiVarF3.g = d(o4pVar.q, dVar3.i, taxConfig);
        }
        spi spiVarF15 = getSharedData().f();
        if (spiVarF15 != null) {
            spiVarF15.a = sqo.g(dVar3.d, dVar3.e);
        }
        BigDecimal bigDecimalMin7 = dVar3.a.min(getSharedData().i());
        BigDecimal bigDecimalMin8 = dVar3.b.min(getSharedData().i());
        BigDecimal bigDecimalA3 = a(o4pVar);
        bigDecimalMin7.getClass();
        bigDecimalMin8.getClass();
        BigDecimal bigDecimal13 = dVar3.f;
        BigDecimal bigDecimal14 = dVar3.g;
        BigDecimal bigDecimal15 = dVar3.i;
        seo seoVar4 = seoVar;
        LinearLayout linearLayout3 = seoVar4.Z;
        LinearLayout linearLayout4 = seoVar4.d;
        String str16 = str4;
        InstantWinMultipleBetBonusHint instantWinMultipleBetBonusHint2 = seoVar4.G;
        TextView textView6 = seoVar4.W;
        TextView textView7 = seoVar4.O;
        TextView textView8 = seoVar4.a0;
        linearLayout3.setVisibility(taxConfig.hasRate() ? 0 : 8);
        if (bigDecimal14.compareTo(bigDecimal13) == 0) {
            tax2 = taxConfig.getTax(bigDecimalMin7, bigDecimalA3);
        } else {
            BigDecimal bigDecimalAdd7 = bigDecimalMin7.add(bigDecimal14);
            bigDecimalAdd7.getClass();
            tax2 = taxConfig.getTax(bigDecimalAdd7, bigDecimalA3);
        }
        BigDecimal bigDecimal16 = BigDecimal.ZERO;
        if (bigDecimal13.compareTo(bigDecimal16) > 0) {
            BigDecimal bigDecimalMin9 = bigDecimalMin8.add(bigDecimal13).min(getSharedData().i());
            bigDecimalMin9.getClass();
            tax3 = taxConfig.getTax(bigDecimalMin9, bigDecimal15);
        } else {
            BigDecimal bigDecimalMin10 = bigDecimalMin8.min(getSharedData().i());
            bigDecimalMin10.getClass();
            tax3 = taxConfig.getTax(bigDecimalMin10, bigDecimal15);
        }
        String strC4 = c(tax3);
        BigDecimal bigDecimalAdd8 = bigDecimalMin8.add(bigDecimal13);
        bigDecimalAdd8.getClass();
        String strB5 = b(bigDecimalAdd8, tax3);
        int i7 = (bigDecimalMin7.equals(bigDecimalMin8) || bigDecimalMin7.equals(bigDecimal16)) ? i2 : 0;
        String strC5 = i7 != 0 ? c(tax3) : tug.a(c(tax2), " ~ ", strC4);
        if (bigDecimal14.compareTo(bigDecimal13) == 0) {
            strB = b(bigDecimalMin7, tax2);
        } else {
            BigDecimal bigDecimalAdd9 = bigDecimalMin7.add(bigDecimal14);
            bigDecimalAdd9.getClass();
            strB = b(bigDecimalAdd9, tax2);
        }
        if (i7 != 0) {
            BigDecimal bigDecimalAdd10 = bigDecimalMin8.add(bigDecimal13);
            bigDecimalAdd10.getClass();
            strA2 = b(bigDecimalAdd10, tax3);
        } else {
            strA2 = tug.a(strB, " ~ ", strB5);
        }
        if (TextUtils.equals(o4pVar.a, str2)) {
            spi spiVarF16 = getSharedData().f();
            if (spiVarF16 != null && (map8 = spiVarF16.f) != null && (spiVarF2 = getSharedData().f()) != null) {
                spiVarF2.f = p(map8, bigDecimal15, taxConfig);
            }
            Map<String, String> map12 = o4pVar.p;
            if (map12.isEmpty()) {
                map12 = null;
            }
            if (map12 != null) {
                spi spiVarF17 = getSharedData().f();
                String str17 = map12.get(str16);
                spiVarF17.g = r(str17 == null ? str3 : str17, o4pVar, taxConfig);
            }
            spi spiVarF18 = getSharedData().f();
            if (spiVarF18 != null) {
                spiVarF18.b = strC5;
            }
            spi spiVarF19 = getSharedData().f();
            if (spiVarF19 != null) {
                spiVarF19.c = strA2;
            }
        }
        if (seoVar4.A.isChecked()) {
            spi spiVarF20 = getSharedData().f();
            textView6.setText((spiVarF20 == null || (map7 = spiVarF20.f) == null || (fvhVar6 = (fvh) map7.get(Integer.valueOf(getSharedData().f().h))) == null) ? null : bjb0.L(fvhVar6.a, Locale.US));
            spi spiVarF21 = getSharedData().f();
            textView8.setText((spiVarF21 == null || (map6 = spiVarF21.f) == null || (fvhVar5 = (fvh) map6.get(Integer.valueOf(getSharedData().f().h))) == null) ? null : fvhVar5.b);
            spi spiVarF22 = getSharedData().f();
            textView7.setText((spiVarF22 == null || (map5 = spiVarF22.f) == null || (fvhVar4 = (fvh) map5.get(Integer.valueOf(getSharedData().f().h))) == null) ? null : fvhVar4.c);
        } else if (seoVar4.H.isChecked()) {
            spi spiVarF23 = getSharedData().f();
            textView6.setText((spiVarF23 == null || (fqyVar4 = spiVarF23.g) == null) ? null : fqyVar4.a);
            spi spiVarF24 = getSharedData().f();
            textView8.setText((spiVarF24 == null || (fqyVar3 = spiVarF24.g) == null) ? null : fqyVar3.b);
            fqy fqyVar7 = getSharedData().f().g;
            textView7.setText(fqyVar7 != null ? fqyVar7.c : null);
            TextView textView9 = seoVar4.J;
            fqy fqyVar8 = getSharedData().f().g;
            textView9.setText(fqyVar8 != null ? fqyVar8.d : null);
            this.w = false;
            String str18 = o4pVar.a;
            BigDecimal bigDecimal17 = o4pVar.n;
            Double dValueOf2 = Double.valueOf(getSharedData().a());
            BigDecimal bigDecimal18 = s5y.a;
            g(str18, bigDecimal17, new BigDecimal(dValueOf2.toString()), false);
        } else {
            spi spiVarF25 = getSharedData().f();
            textView6.setText(spiVarF25 != null ? spiVarF25.a : null);
            textView8.setText(strC5);
            textView7.setText(strA2);
        }
        int size3 = o4pVar.d.size();
        LinearLayout linearLayout5 = seoVar4.X;
        if (size3 == i2) {
            linearLayout5.setVisibility(8);
            dVar = dVar3;
        } else {
            linearLayout5.setVisibility(0);
            dVar = dVar3;
            seoVar4.Y.setText(bjb0.L(dVar.c, Locale.US));
        }
        if (dVar.f.setScale(2, RoundingMode.HALF_UP).compareTo(bigDecimal16) > 0) {
            if (seoVar4.A.isChecked() || seoVar4.H.isChecked()) {
                instantWinMultipleBetBonusHint = instantWinMultipleBetBonusHint2;
                linearLayout4.setVisibility(8);
                instantWinMultipleBetBonusHint.setVisibility(8);
                getSharedData().f().e = false;
            } else {
                linearLayout4.setVisibility(0);
                instantWinMultipleBetBonusHint = instantWinMultipleBetBonusHint2;
                instantWinMultipleBetBonusHint.setVisibility(0);
                getSharedData().f().e = true;
            }
            getSharedData().f().d = true;
            seoVar4.e.setText(bjb0.L(dVar.f, Locale.US));
        } else {
            instantWinMultipleBetBonusHint = instantWinMultipleBetBonusHint2;
            linearLayout4.setVisibility(8);
            instantWinMultipleBetBonusHint.setVisibility(8);
            getSharedData().f().d = false;
            getSharedData().f().e = false;
        }
        l(dVar.c, o4pVar.a);
        instantWinMultipleBetBonusHint.E(o4pVar, getSharedData().l(), seoVar4.A.isChecked() || seoVar4.H.isChecked(), false);
        setShowExciseTax(taxConfig.hasExciseTaxRate(), e(m780Var, taxConfig, dVar.c), o4pVar.a);
    }

    public final void l(BigDecimal bigDecimal, String str) {
        double dB = getSharedData().b();
        int iCompareTo = bigDecimal.compareTo(BigDecimal.valueOf(getSharedData().b()));
        seo seoVar = this.c;
        if (iCompareTo <= 0) {
            seoVar.M.setVisibility(8);
            seoVar.N.setVisibility(8);
            return;
        }
        TextView textView = seoVar.M;
        TextView textView2 = seoVar.N;
        textView.setTextColor(-1);
        Context context = getContext();
        context.getClass();
        RoundingMode roundingMode = RoundingMode.FLOOR;
        textView.setText(sn5.b(context, R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, bjb0.Z(dB, roundingMode)));
        Context context2 = getContext();
        context2.getClass();
        textView2.setText(sn5.b(context2, R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, bjb0.Z(dB, roundingMode)));
        if (TextUtils.equals(str, "system")) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView2.setVisibility(8);
        }
    }

    public final void m(int i) {
        seo seoVar = this.c;
        ArrowButton arrowButton = seoVar.c;
        spi spiVarF = getSharedData().f();
        arrowButton.setStateAvailable((spiVarF != null ? spiVarF.h : 0) < i - 1);
        ArrowButton arrowButton2 = seoVar.b;
        spi spiVarF2 = getSharedData().f();
        arrowButton2.setStateAvailable((spiVarF2 != null ? spiVarF2.h : 0) > this.v);
    }

    public final void n(boolean z, o4p o4pVar) {
        ArrayList arrayList = o4pVar.d;
        int size = ((o4p.a) arrayList.get(0)).b.size();
        if (z && getSharedData().f().h < size - 1) {
            getSharedData().f().h++;
        } else if (z || getSharedData().f().h <= this.v) {
            zyf0.b(R.string.component_betslip__feature_is_constrained_for_certain_selections, 0);
        } else {
            getSharedData().f().h--;
        }
        o(((o4p.a) arrayList.get(0)).b.size());
        m(size);
    }

    public final void o(int i) {
        int i2 = getSharedData().f().h;
        if (i2 >= this.v) {
            Context context = getContext();
            context.getClass();
            String strB = sn5.b(context, R.string.component_betslip__flexibet_short_desc, new Object[0]);
            seo seoVar = this.c;
            seoVar.v.setText(zch0.j(strB, getContext().getColor(R.color.text_type2_tertiary), 14, null));
            j7g j7gVar = new j7g();
            j7gVar.b(i2 + "+ ");
            StringBuilder sb = new StringBuilder("of ");
            sb.append(i);
            j7gVar.j(sb.toString(), getContext().getColor(R.color.absolute_type2), zch0.a(getContext(), 14));
            seoVar.z.setText(j7gVar);
            q(true, false);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            return;
        }
        seo seoVar = this.c;
        seoVar.D.setOnClickListener(new View.OnClickListener() { // from class: teo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstantWinFooterLayout.a aVar = this.a.y;
                if (aVar != null) {
                    aVar.m();
                }
            }
        });
        TextView textView = seoVar.C;
        textView.setOnClickListener(new View.OnClickListener() { // from class: veo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstantWinFooterLayout.a aVar = this.a.y;
                if (aVar != null) {
                    aVar.m();
                }
            }
        });
        if (getGiftManager().a0()) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(getContext(), R.drawable.ic_play_arrow_green_24dp, getContext().getColor(R.color.custom_text_type1_primary_type1)), (Drawable) null);
            textView.setCompoundDrawablePadding(zch0.a(getContext(), 5));
        } else {
            seoVar.D.setVisibility(8);
        }
        TextView textView2 = seoVar.I;
        Context context = getContext();
        context.getClass();
        textView2.setText(sn5.b(context, R.string.component_betslip__one_cut_pay_one_selection_v2, new Object[0]));
        TextView textView3 = seoVar.R;
        textView3.setBackground(new uuo(textView3, zch0.a(getContext(), 10)));
        seoVar.y.setOnClickListener(new View.OnClickListener() { // from class: weo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstantWinFooterLayout.a aVar = this.a.y;
                if (aVar != null) {
                    aVar.F();
                }
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: xeo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstantWinFooterLayout.a aVar = this.a.y;
                if (aVar != null) {
                    aVar.F();
                }
            }
        });
    }

    public final HashMap p(Map map, BigDecimal bigDecimal, TaxConfig taxConfig) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            fvh fvhVar = (fvh) entry.getValue();
            BigDecimal bigDecimal2 = fvhVar.a;
            if (bigDecimal2 == null) {
                bigDecimal2 = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalMin = bigDecimal2.multiply(bigDecimal).min(getSharedData().i());
            bigDecimalMin.getClass();
            BigDecimal tax = taxConfig.getTax(bigDecimalMin, bigDecimal);
            double dDoubleValue = tax.multiply(B).doubleValue();
            DecimalFormat decimalFormat = this.i;
            String str = decimalFormat.format(dDoubleValue);
            BigDecimal bigDecimalSubtract = bigDecimalMin.subtract(tax);
            bigDecimalSubtract.getClass();
            map2.put(Integer.valueOf(iIntValue), new fvh(fvhVar.d, str, decimalFormat.format(bigDecimalSubtract.doubleValue()), fvhVar.a));
        }
        return map2;
    }

    public final Unit q(boolean z, boolean z2) {
        fvh fvhVar;
        fvh fvhVar2;
        fvh fvhVar3;
        String str = "--";
        String str2 = null;
        seo seoVar = this.c;
        if (z) {
            spi spiVarF = getSharedData().f();
            if (spiVarF != null) {
                TextView textView = seoVar.W;
                HashMap map = spiVarF.f;
                if (map != null && (fvhVar3 = (fvh) map.get(Integer.valueOf(spiVarF.h))) != null) {
                    String strA = gky.a.a(bjb0.L(fvhVar3.a, Locale.US), false);
                    if (strA != null) {
                        str = strA;
                    }
                }
                textView.setText(str);
                TextView textView2 = seoVar.a0;
                HashMap map2 = spiVarF.f;
                textView2.setText((map2 == null || (fvhVar2 = (fvh) map2.get(Integer.valueOf(spiVarF.h))) == null) ? null : fvhVar2.b);
                TextView textView3 = seoVar.O;
                HashMap map3 = spiVarF.f;
                if (map3 != null && (fvhVar = (fvh) map3.get(Integer.valueOf(spiVarF.h))) != null) {
                    str2 = fvhVar.c;
                }
                textView3.setText(str2);
                return Unit.a;
            }
        } else if (z2) {
            spi spiVarF2 = getSharedData().f();
            if (spiVarF2 != null) {
                TextView textView4 = seoVar.W;
                fqy fqyVar = spiVarF2.g;
                textView4.setText(fqyVar != null ? gky.a.a(fqyVar.a, false) : null);
                TextView textView5 = seoVar.a0;
                fqy fqyVar2 = spiVarF2.g;
                textView5.setText(fqyVar2 != null ? fqyVar2.b : "--");
                TextView textView6 = seoVar.O;
                fqy fqyVar3 = spiVarF2.g;
                textView6.setText(fqyVar3 != null ? fqyVar3.c : "--");
                TextView textView7 = seoVar.J;
                fqy fqyVar4 = spiVarF2.g;
                textView7.setText(fqyVar4 != null ? fqyVar4.d : "--");
                return Unit.a;
            }
        } else {
            spi spiVarF3 = getSharedData().f();
            if (spiVarF3 != null) {
                TextView textView8 = seoVar.W;
                String str3 = spiVarF3.a;
                textView8.setText(str3 != null ? gky.a.a(str3, false) : null);
                seoVar.a0.setText(spiVarF3.b);
                seoVar.O.setText(spiVarF3.c);
                return Unit.a;
            }
        }
        return null;
    }

    public final fqy r(String str, o4p o4pVar, TaxConfig taxConfig) {
        o4p.d dVar = o4pVar.i.get(o4pVar.f);
        mpe0 mpe0Var = zpy.a;
        BigDecimal bigDecimal = new BigDecimal(str);
        BigDecimal bigDecimal2 = dVar.e;
        BigDecimal bigDecimal3 = o4pVar.m;
        bigDecimal3.getClass();
        BigDecimal bigDecimal4 = o4pVar.j;
        bigDecimal4.getClass();
        BigDecimal bigDecimalI = getSharedData().i();
        bigDecimalI.getClass();
        Map mapA = zpy.a(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimalI);
        BigDecimal bigDecimal5 = o4pVar.j;
        bigDecimal5.getClass();
        return d(mapA, bigDecimal5, taxConfig);
    }

    public final void s(o4p o4pVar, String str, int i, TaxConfig taxConfig, m780 m780Var) {
        String plainString;
        o4pVar.getClass();
        taxConfig.getClass();
        boolean zEquals = TextUtils.equals(o4pVar.a, SimulateBetConsts.BetslipType.SINGLE);
        seo seoVar = this.c;
        if (zEquals) {
            StakeItemLayout stakeItemLayout = seoVar.S;
            stakeItemLayout.h(str);
            if (!stakeItemLayout.c()) {
                if (stakeItemLayout.a()) {
                    stakeItemLayout.g();
                } else {
                    stakeItemLayout.i.setActivated(false);
                    stakeItemLayout.e.setVisibility(8);
                }
            }
        } else if (TextUtils.equals(o4pVar.a, SimulateBetConsts.BetslipType.MULTIPLE)) {
            StakeItemLayout stakeItemLayout2 = seoVar.S;
            stakeItemLayout2.h(str);
            if (!stakeItemLayout2.c()) {
                if (stakeItemLayout2.a()) {
                    stakeItemLayout2.g();
                } else {
                    stakeItemLayout2.i.setActivated(false);
                    stakeItemLayout2.e.setVisibility(8);
                }
            }
        } else if (TextUtils.equals(o4pVar.a, "system")) {
            StakeItemLayout stakeItemLayout3 = seoVar.S;
            LinearLayout linearLayout = seoVar.T;
            if (i == 0) {
                stakeItemLayout3.h(str);
                if (stakeItemLayout3.a()) {
                    stakeItemLayout3.g();
                } else {
                    stakeItemLayout3.i.setActivated(false);
                    stakeItemLayout3.e.setVisibility(8);
                }
            }
            if (TextUtils.isEmpty(str) || i != 0) {
                stakeItemLayout3.i.setActivated(false);
                stakeItemLayout3.e.setVisibility(8);
            }
            int childCount = linearLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = linearLayout.getChildAt(i2);
                childAt.getClass();
                StakeItemLayout stakeItemLayout4 = (StakeItemLayout) childAt;
                SparseIntArray sparseIntArray = o4pVar.e;
                if (i == 0) {
                    stakeItemLayout4.h(((str == null || str.length() == 0) && o4pVar.n == null) ? f(o4pVar, sparseIntArray.keyAt(i2), str) : str);
                    if (i == 0) {
                        stakeItemLayout4.f(o4pVar);
                    } else if (!stakeItemLayout4.c()) {
                        if (stakeItemLayout4.a()) {
                            stakeItemLayout4.g();
                        } else {
                            stakeItemLayout4.f(o4pVar);
                        }
                    }
                } else if (i == sparseIntArray.keyAt(i2)) {
                    stakeItemLayout4.h(str);
                    if (i == 0) {
                        stakeItemLayout4.f(o4pVar);
                    } else if (!stakeItemLayout4.c()) {
                        if (stakeItemLayout4.a()) {
                            stakeItemLayout4.g();
                        } else {
                            stakeItemLayout4.f(o4pVar);
                        }
                    }
                }
            }
            if (i != 0) {
                BigDecimal bigDecimalO = getSharedData().o();
                if (bigDecimalO == null || (plainString = bigDecimalO.toPlainString()) == null) {
                    plainString = "";
                }
                if (str == null) {
                    str = "";
                }
                if (!plainString.equals(str)) {
                    seoVar.S.h("");
                    getSharedData().j();
                }
            }
        }
        k(o4pVar, taxConfig, m780Var);
    }

    public final void setDataStore(m2l m2lVar) {
        m2lVar.getClass();
        this.dataStore = m2lVar;
    }

    public final void setGiftManager(jpk jpkVar) {
        jpkVar.getClass();
        this.giftManager = jpkVar;
    }

    public final void setSharedData(tlo tloVar) {
        tloVar.getClass();
        this.sharedData = tloVar;
    }

    public final void setShowExciseTax(boolean hasExciseTaxRate, String exciseTax, String betSlipType) {
        betSlipType.getClass();
        seo seoVar = this.c;
        seoVar.f.setVisibility(hasExciseTaxRate ? 0 : 8);
        seoVar.i.setText(exciseTax);
        setOneCutCount(betSlipType);
    }

    public final void setupFooter(o4p ivTicketData, String stake, a instantWinFooterListener, TaxConfig config, int isFlexAvailable, int isOneCutAvailable, m780 selectedGiftInfo) {
        String strB;
        spi spiVarF;
        o4p.a aVar;
        ArrayList arrayList;
        final o4p o4pVar = ivTicketData;
        o4pVar.getClass();
        instantWinFooterListener.getClass();
        config.getClass();
        this.y = instantWinFooterListener;
        String str = o4pVar.a;
        SparseIntArray sparseIntArray = o4pVar.e;
        ArrayList arrayList2 = o4pVar.d;
        boolean zEquals = TextUtils.equals(str, SimulateBetConsts.BetslipType.SINGLE);
        int i = 0;
        int i2 = 1;
        final seo seoVar = this.c;
        if (zEquals) {
            seoVar.V.setVisibility(8);
            seoVar.X.setVisibility(0);
            seoVar.F.setVisibility(8);
            Context context = getContext();
            context.getClass();
            String strB2 = sn5.b(context, R.string.component_betslip__stake_per_bet_vstakecount_bets, String.valueOf(arrayList2.size()));
            StakeItemLayout stakeItemLayout = seoVar.S;
            String strD = a8b.d();
            strD.getClass();
            int length = strD.length() - 1;
            int i3 = 0;
            boolean z = false;
            while (i3 <= length) {
                boolean z2 = strD.charAt(!z ? i3 : length) <= ' ';
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i3++;
                } else {
                    z = true;
                }
            }
            stakeItemLayout.setData(strB2, strD.subSequence(i3, length + 1).toString(), stake, "", 0, o4pVar, instantWinFooterListener);
            ViewGroup.LayoutParams layoutParams = seoVar.U.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = (int) getResources().getDimension(R.dimen.iwqk_bh_line_height_1_dp);
            }
        } else if (TextUtils.equals(o4pVar.a, SimulateBetConsts.BetslipType.MULTIPLE)) {
            BubbleView bubbleView = seoVar.B;
            FlexboxLayout flexboxLayout = seoVar.Q;
            RelativeLayout relativeLayout = seoVar.K;
            RelativeLayout relativeLayout2 = seoVar.w;
            bubbleView.setVisibility(((Boolean) dj5.a(e.a, new efo(this, null))).booleanValue() ? 0 : 8);
            seoVar.B.setOnClickedClose(new r5j(this, i2));
            SparseArray<o4p.d> sparseArray = o4pVar.i;
            o4p.d dVar = sparseArray != null ? sparseArray.get(o4pVar.f) : null;
            final int size = (arrayList2 == null || (aVar = (o4p.a) arrayList2.get(0)) == null || (arrayList = aVar.b) == null) ? 0 : arrayList.size();
            boolean z3 = size > 2 && dVar != null && dVar.j;
            if (size >= 0 && size < 2) {
                getSharedData().p(false);
                relativeLayout2.setVisibility(8);
                getSharedData().e(false);
                relativeLayout.setVisibility(8);
                flexboxLayout.setVisibility(8);
            } else if (size == 2) {
                getSharedData().p(false);
                relativeLayout2.setVisibility(8);
                getSharedData().e(false);
                relativeLayout.setVisibility(8);
                flexboxLayout.setVisibility(0);
            } else {
                flexboxLayout.setVisibility((isFlexAvailable == 0 || isOneCutAvailable == 0) ? 0 : 8);
                if (dVar != null && !dVar.j) {
                    getSharedData().p(false);
                    relativeLayout2.setVisibility(8);
                    getSharedData().e(false);
                    relativeLayout.setVisibility(8);
                }
            }
            Integer num = o4p.r.get(Integer.valueOf(size));
            this.v = num != null ? num.intValue() : 2;
            CheckBox checkBox = seoVar.A;
            CheckBox checkBox2 = seoVar.H;
            checkBox.setEnabled(z3);
            checkBox.setVisibility(isFlexAvailable == 0 ? 0 : 8);
            checkBox2.setEnabled(z3);
            checkBox2.setVisibility(isOneCutAvailable == 0 ? 0 : 8);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yeo
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                    spi spiVarF2;
                    BigDecimal bigDecimal = InstantWinFooterLayout.B;
                    compoundButton.getClass();
                    boolean zIsPressed = compoundButton.isPressed();
                    final seo seoVar2 = seoVar;
                    RelativeLayout relativeLayout3 = seoVar2.w;
                    InstantWinMultipleBetBonusHint instantWinMultipleBetBonusHint = seoVar2.G;
                    LinearLayout linearLayout = seoVar2.d;
                    relativeLayout3.setVisibility(z4 ? 0 : 8);
                    seoVar2.v.setVisibility(z4 ? 0 : 8);
                    final InstantWinFooterLayout instantWinFooterLayout = this;
                    instantWinFooterLayout.getSharedData().p(z4);
                    CheckBox checkBox3 = seoVar2.H;
                    if (z4) {
                        checkBox3.setChecked(false);
                        seo seoVar3 = instantWinFooterLayout.c;
                        ibs ibsVarB = ll5.b(instantWinFooterLayout);
                        if (ibsVarB != null) {
                            ej5.c(ebs.a(ibsVarB.getLifecycle()), null, null, new dfo(instantWinFooterLayout, seoVar3, null), 3);
                        }
                        linearLayout.setVisibility(8);
                        instantWinMultipleBetBonusHint.setVisibility(8);
                        spi spiVarF3 = instantWinFooterLayout.getSharedData().f();
                        int i4 = size;
                        if (spiVarF3 != null && spiVarF3.h == 0 && (spiVarF2 = instantWinFooterLayout.getSharedData().f()) != null) {
                            spiVarF2.h = i4 - 1;
                        }
                        instantWinFooterLayout.o(i4);
                        instantWinFooterLayout.m(i4);
                        instantWinFooterLayout.q(true, false);
                        if (!TextUtils.isEmpty(seoVar2.C.getText().toString()) && instantWinFooterLayout.getGiftManager().a0()) {
                            seoVar2.D.setVisibility(0);
                        }
                    } else if (!checkBox3.isChecked()) {
                        c8i0.o(linearLayout, instantWinFooterLayout.getSharedData().f().e);
                        c8i0.o(instantWinMultipleBetBonusHint, instantWinFooterLayout.getSharedData().f().d);
                        instantWinFooterLayout.q(false, false);
                        spi spiVarF4 = instantWinFooterLayout.getSharedData().f();
                        if (spiVarF4 != null) {
                            spiVarF4.h = 0;
                        }
                    }
                    seoVar2.A.post(new Runnable() { // from class: ueo
                        @Override // java.lang.Runnable
                        public final void run() {
                            InstantWinFooterLayout.i(instantWinFooterLayout, seoVar2);
                        }
                    });
                    if (zIsPressed) {
                        InstantWinFooterLayout.a aVar2 = instantWinFooterLayout.y;
                        if (aVar2 != null) {
                            aVar2.n();
                        }
                        InstantWinFooterLayout.a aVar3 = instantWinFooterLayout.y;
                        if (aVar3 != null) {
                            aVar3.h0();
                        }
                    }
                }
            });
            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: zeo
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                    InstantWinFooterLayout.a aVar2;
                    InstantWinFooterLayout.a aVar3;
                    InstantWinFooterLayout.a aVar4;
                    BigDecimal bigDecimal = InstantWinFooterLayout.B;
                    compoundButton.getClass();
                    boolean zIsPressed = compoundButton.isPressed();
                    final seo seoVar2 = seoVar;
                    TextView textView = seoVar2.I;
                    RelativeLayout relativeLayout3 = seoVar2.D;
                    InstantWinMultipleBetBonusHint instantWinMultipleBetBonusHint = seoVar2.G;
                    LinearLayout linearLayout = seoVar2.d;
                    textView.setVisibility(z4 ? 0 : 8);
                    seoVar2.K.setVisibility(z4 ? 0 : 8);
                    final InstantWinFooterLayout instantWinFooterLayout = this;
                    boolean z5 = zIsPressed && z4 && !instantWinFooterLayout.getSharedData().k();
                    if (z5 && (aVar4 = instantWinFooterLayout.y) != null && aVar4.v()) {
                        zyf0.b(R.string.component_betslip__one_cut_can_not_apply_gift_hint, 0);
                    }
                    instantWinFooterLayout.getSharedData().e(z4);
                    if (zIsPressed && (aVar3 = instantWinFooterLayout.y) != null) {
                        aVar3.h0();
                    }
                    CheckBox checkBox3 = seoVar2.A;
                    if (z4) {
                        checkBox3.setChecked(false);
                        linearLayout.setVisibility(8);
                        instantWinMultipleBetBonusHint.setVisibility(8);
                        relativeLayout3.setVisibility(8);
                        spi spiVarF2 = instantWinFooterLayout.getSharedData().f();
                        if (spiVarF2 != null) {
                            spiVarF2.h = size - 1;
                        }
                        instantWinFooterLayout.q(false, true);
                        o4p o4pVar2 = o4pVar;
                        String str2 = o4pVar2.a;
                        BigDecimal bigDecimal2 = o4pVar2.n;
                        Double dValueOf = Double.valueOf(instantWinFooterLayout.getSharedData().a());
                        BigDecimal bigDecimal3 = s5y.a;
                        instantWinFooterLayout.g(str2, bigDecimal2, new BigDecimal(dValueOf.toString()), z5);
                    } else if (!checkBox3.isChecked()) {
                        c8i0.o(linearLayout, instantWinFooterLayout.getSharedData().f().e);
                        c8i0.o(instantWinMultipleBetBonusHint, instantWinFooterLayout.getSharedData().f().d);
                        if (!TextUtils.isEmpty(seoVar2.C.getText().toString()) && instantWinFooterLayout.getGiftManager().a0()) {
                            relativeLayout3.setVisibility(0);
                        }
                        instantWinFooterLayout.q(false, false);
                    }
                    if (!z4) {
                        instantWinFooterLayout.w = true;
                    }
                    seoVar2.H.post(new Runnable() { // from class: cfo
                        @Override // java.lang.Runnable
                        public final void run() {
                            InstantWinFooterLayout.j(instantWinFooterLayout, seoVar2);
                        }
                    });
                    if (!zIsPressed || (aVar2 = instantWinFooterLayout.y) == null) {
                        return;
                    }
                    aVar2.n();
                }
            });
            boolean z4 = o4pVar.f > this.v;
            checkBox.setChecked(z4 && getSharedData().n());
            checkBox2.setChecked(z4 && getSharedData().k());
            seoVar.c.setOnClickListener(new View.OnClickListener() { // from class: afo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BigDecimal bigDecimal = InstantWinFooterLayout.B;
                    this.a.n(true, o4pVar);
                }
            });
            seoVar.b.setOnClickListener(new View.OnClickListener() { // from class: bfo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BigDecimal bigDecimal = InstantWinFooterLayout.B;
                    this.a.n(false, o4pVar);
                }
            });
            spi spiVarF2 = getSharedData().f();
            if (spiVarF2 != null && spiVarF2.h == 0 && (spiVarF = getSharedData().f()) != null) {
                spiVarF.h = o4pVar.g - 1;
            }
            m(size);
            o(((o4p.a) arrayList2.get(0)).b.size());
            q(checkBox.isChecked(), checkBox2.isChecked());
            int size2 = arrayList2.size();
            StakeItemLayout stakeItemLayout2 = seoVar.S;
            if (size2 == 1) {
                Context context2 = getContext();
                context2.getClass();
                String strB3 = sn5.b(context2, R.string.bet_history__total_stake, new Object[0]);
                String strD2 = a8b.d();
                strD2.getClass();
                int length2 = strD2.length() - 1;
                int i4 = 0;
                boolean z5 = false;
                while (i4 <= length2) {
                    boolean z6 = strD2.charAt(!z5 ? i4 : length2) <= ' ';
                    if (z5) {
                        if (!z6) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z6) {
                        i4++;
                    } else {
                        z5 = true;
                    }
                }
                stakeItemLayout2.setData(strB3, strD2.subSequence(i4, length2 + 1).toString(), stake, "", 0, o4pVar, instantWinFooterListener);
                o4pVar = ivTicketData;
            } else {
                Context context3 = getContext();
                context3.getClass();
                String strB4 = sn5.b(context3, R.string.component_betslip__stake_per_bet_vstakecount_bets, String.valueOf(arrayList2.size()));
                String strD3 = a8b.d();
                strD3.getClass();
                int length3 = strD3.length() - 1;
                int i5 = 0;
                boolean z7 = false;
                while (i5 <= length3) {
                    boolean z8 = strD3.charAt(!z7 ? i5 : length3) <= ' ';
                    if (z7) {
                        if (!z8) {
                            break;
                        } else {
                            length3--;
                        }
                    } else if (z8) {
                        i5++;
                    } else {
                        z7 = true;
                    }
                }
                o4pVar = ivTicketData;
                stakeItemLayout2.setData(strB4, strD3.subSequence(i5, length3 + 1).toString(), stake, "", 0, o4pVar, instantWinFooterListener);
            }
            ViewGroup.LayoutParams layoutParams2 = seoVar.U.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = (int) getResources().getDimension(R.dimen.iwqk_bh_line_height_1_dp);
            }
            seoVar.V.setVisibility(0);
            seoVar.F.setVisibility(8);
        } else if (TextUtils.equals(o4pVar.a, "system")) {
            LinearLayout linearLayout = seoVar.V;
            LinearLayout linearLayout2 = seoVar.T;
            linearLayout.setVisibility(8);
            seoVar.X.setVisibility(0);
            seoVar.F.setVisibility(0);
            StakeItemLayout stakeItemLayout3 = seoVar.S;
            Context context4 = getContext();
            context4.getClass();
            stakeItemLayout3.setData(sn5.b(context4, R.string.component_betslip__play_all, new Object[0]), "", stake, "", 0, o4pVar, instantWinFooterListener);
            linearLayout2.removeAllViews();
            int size3 = sparseIntArray.size();
            int i6 = 0;
            while (i6 < size3) {
                int iKeyAt = sparseIntArray.keyAt(i6);
                StakeItemLayout stakeItemLayout4 = new StakeItemLayout(getContext());
                int i7 = iKeyAt - 1;
                Context context5 = getContext();
                context5.getClass();
                if (i7 == 0) {
                    strB = sn5.b(context5, R.string.component_betslip__singles, new Object[i]);
                } else if (i7 != 1) {
                    strB = i7 != 2 ? sn5.b(context5, R.string.component_betslip__veventsize_folds, String.valueOf(iKeyAt)) : sn5.b(context5, R.string.component_betslip__trebles, new Object[i]);
                } else {
                    strB = sn5.b(context5, R.string.component_betslip__doubles, new Object[i]);
                }
                String strF = f(o4pVar, iKeyAt, stake);
                Context context6 = getContext();
                context6.getClass();
                stakeItemLayout4.setData(strB, "", strF, sn5.b(context6, R.string.page_instant_virtual__bet_num, String.valueOf(sparseIntArray.get(iKeyAt))), iKeyAt, o4pVar, instantWinFooterListener);
                linearLayout2.addView(stakeItemLayout4);
                i6++;
                i = 0;
            }
            ViewGroup.LayoutParams layoutParams3 = seoVar.U.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.height = (int) getResources().getDimension(R.dimen.iwqk_bh_line_height_1_dp);
            }
        }
        seoVar.U.requestLayout();
        k(o4pVar, config, selectedGiftInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstantWinFooterLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstantWinFooterLayout(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ InstantWinFooterLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
