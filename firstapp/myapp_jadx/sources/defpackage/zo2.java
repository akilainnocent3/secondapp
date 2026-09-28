package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.crash.remote.models.BetHistoryItem;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class zo2 extends mp2 {
    public final gaj<? super String, ? super String, ? super BetHistoryItem, Unit> A;
    public final e e;
    public final String f;
    public final String i;
    public final String v;
    public final String w;
    public final mz1 y;
    public final Function1<? super String, Unit> z;

    public zo2(e eVar, String str, String str2, String str3, String str4, mz1 mz1Var, Function1 function1, gaj gajVar) {
        wd7.a(str, str2, str3, str4);
        this.e = eVar;
        this.f = str;
        this.i = str2;
        this.v = str3;
        this.w = str4;
        this.y = mz1Var;
        this.z = function1;
        this.A = gajVar;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [qo2] */
    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ipc.d dVar;
        int i2;
        int color;
        int i3;
        lx90 lx90Var;
        int i4;
        int i5;
        d0Var.getClass();
        boolean z = d0Var instanceof js2;
        final e eVar = this.e;
        if (!z) {
            if (d0Var instanceof zs2) {
                final zs2 zs2Var = (zs2) d0Var;
                uo40 uo40Var = zs2Var.a;
                TextView textView = uo40Var.b;
                TextView textView2 = uo40Var.b;
                textView.setEnabled(true);
                textView2.setAlpha(1.0f);
                textView2.setClickable(true);
                op5.r(op5.a, b.f(textView2), null, 4);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: to2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.l();
                        uo40 uo40Var2 = zs2Var.a;
                        uo40Var2.b.setAlpha(0.5f);
                        uo40Var2.b.setClickable(false);
                        uo40Var2.b.setEnabled(false);
                    }
                });
                return;
            }
            if (d0Var instanceof tp2) {
                final tp2 tp2Var = (tp2) d0Var;
                so40 so40Var = tp2Var.a;
                CardView cardView = so40Var.b;
                CardView cardView2 = so40Var.b;
                cardView.setEnabled(true);
                cardView2.setAlpha(1.0f);
                cardView2.setClickable(true);
                op5.r(op5.a, b.f(so40Var.c), null, 4);
                cardView2.setCardBackgroundColor(eVar.getColor(R.color.button_blue));
                cardView2.setOnClickListener(new View.OnClickListener() { // from class: uo2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.k();
                        so40 so40Var2 = tp2Var.a;
                        so40Var2.b.setAlpha(0.5f);
                        so40Var2.b.setClickable(false);
                        so40Var2.b.setEnabled(false);
                    }
                });
                return;
            }
            return;
        }
        ipc item = getItem(i);
        item.getClass();
        ipc.d dVar2 = (ipc.d) item;
        BetHistoryItem betHistoryItem = dVar2.a;
        final js2 js2Var = (js2) d0Var;
        lx90 lx90Var2 = js2Var.a;
        final lo2 lo2Var = new lo2(this, 0);
        final ?? r13 = new gaj() { // from class: qo2
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                this.a.A.invoke(str, str2, (BetHistoryItem) obj3);
                return Unit.a;
            }
        };
        betHistoryItem.getClass();
        eVar.getClass();
        final String str = this.f;
        str.getClass();
        final String str2 = this.i;
        str2.getClass();
        final String str3 = this.v;
        str3.getClass();
        final String str4 = this.w;
        str4.getClass();
        js2Var.b = betHistoryItem;
        lx90Var2.w.setOnClickListener(new View.OnClickListener() { // from class: qr2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                js2 js2Var2 = js2Var;
                BetHistoryItem betHistoryItem2 = js2Var2.b;
                if (betHistoryItem2 == null) {
                    Intrinsics.n("dataItem");
                    throw null;
                }
                betHistoryItem2.setExpanded(!betHistoryItem2.isExpanded());
                BetHistoryItem betHistoryItem3 = js2Var2.b;
                if (betHistoryItem3 != null) {
                    js2Var2.a(betHistoryItem3, eVar, str, str2, str3, str4, lo2Var, r13);
                } else {
                    Intrinsics.n("dataItem");
                    throw null;
                }
            }
        });
        mz1 mz1Var = this.y;
        mz1Var.getClass();
        Double bonusPercentage = betHistoryItem.getBonusPercentage();
        double dDoubleValue = bonusPercentage != null ? bonusPercentage.doubleValue() : 0.0d;
        ConstraintLayout constraintLayout = lx90Var2.b;
        if (dDoubleValue > 0.0d) {
            constraintLayout.setBackground(eVar.getDrawable(R.drawable.bg_bonus_gradient_border));
        } else {
            constraintLayout.setBackgroundColor(r58.l(mz1Var.p()));
        }
        TextView textView3 = lx90Var2.a0;
        AppCompatImageView appCompatImageView = lx90Var2.e;
        LinearLayoutCompat linearLayoutCompat = lx90Var2.S;
        AppCompatTextView appCompatTextView = lx90Var2.R;
        AppCompatImageView appCompatImageView2 = lx90Var2.h0;
        TextView textView4 = lx90Var2.W;
        ImageView imageView = lx90Var2.T;
        TextView textView5 = lx90Var2.n0;
        TextView textView6 = lx90Var2.X;
        AppCompatTextView appCompatTextView2 = lx90Var2.f;
        textView3.setText(kt2.d(betHistoryItem.getCreatedAt()));
        textView4.setText(kt2.c(betHistoryItem.getStakeAmount(), eVar));
        textView4.addOnLayoutChangeListener(new ns2(textView4));
        int iL = r58.l(mz1Var.o());
        Drawable background = appCompatTextView2.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(iL);
        }
        Drawable background2 = textView5.getBackground();
        GradientDrawable gradientDrawable2 = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setColor(iL);
        }
        if (betHistoryItem.getPayoutAmount() <= 0.0d) {
            textView6.setText(betHistoryItem.getTicketStatus());
            dVar = dVar2;
            if (c.l(betHistoryItem.getTicketStatus(), "Pending", true)) {
                textView6.setTextColor(eVar.getColor(R.color.pending_text));
                textView6.setTag(eVar.getString(R.string.pending_cms));
            } else {
                textView6.setTag(eVar.getString(R.string.lost_cms));
            }
            appCompatImageView2.setVisibility(8);
            if (betHistoryItem.getTargetCoefficient() != null) {
                appCompatTextView.setText(eVar.getString(R.string.coeff, String.valueOf(betHistoryItem.getTargetCoefficient().doubleValue())));
                appCompatTextView2.setVisibility(8);
                linearLayoutCompat.setVisibility(0);
                if (Intrinsics.g(betHistoryItem.getSideBetType(), "OVER")) {
                    if (betHistoryItem.getHouseCoefficient() > betHistoryItem.getTargetCoefficient().doubleValue()) {
                        textView6.setText("Pending");
                        textView6.setTag(eVar.getString(R.string.pending_cms));
                    }
                    imageView.setRotation(90.0f);
                } else {
                    if (betHistoryItem.getHouseCoefficient() < betHistoryItem.getTargetCoefficient().doubleValue()) {
                        textView6.setText("Pending");
                        textView6.setTag(eVar.getString(R.string.pending_cms));
                    }
                    imageView.setRotation(270.0f);
                }
            } else if (betHistoryItem.getStartCoefficient() == null || betHistoryItem.getEndCoefficient() == null) {
                Drawable background3 = appCompatTextView2.getBackground();
                if (background3 instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable3 = (GradientDrawable) background3;
                    gradientDrawable3.mutate();
                    gradientDrawable3.setColor(r58.l(j58.l));
                }
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iL);
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                r6i0.d.j(appCompatTextView2, colorStateListValueOf);
                appCompatTextView2.setText("--");
                if (c.l(betHistoryItem.getTicketStatus(), "Pending", true)) {
                    appCompatTextView2.setText("Pending");
                    appCompatTextView2.setTextColor(eVar.getColor(R.color.pending_text));
                    appCompatTextView2.setTag(eVar.getString(R.string.pending_cms));
                }
            } else {
                if (betHistoryItem.getHouseCoefficient() >= betHistoryItem.getStartCoefficient().doubleValue() && betHistoryItem.getHouseCoefficient() <= betHistoryItem.getEndCoefficient().doubleValue()) {
                    textView6.setText("Pending");
                    textView6.setTag(eVar.getString(R.string.pending_cms));
                }
                Drawable background4 = appCompatTextView2.getBackground();
                if (background4 instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable4 = (GradientDrawable) background4;
                    gradientDrawable4.mutate();
                    gradientDrawable4.setColor(iL);
                }
                ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(iL);
                WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                r6i0.d.j(appCompatTextView2, colorStateListValueOf2);
                r6i0.d.j(textView5, ColorStateList.valueOf(iL));
                appCompatTextView2.setText(eVar.getString(R.string.coeff, String.valueOf(betHistoryItem.getStartCoefficient().doubleValue())) + " - " + eVar.getString(R.string.coeff, String.valueOf(betHistoryItem.getEndCoefficient().doubleValue())) + " ");
            }
            op5.r(op5.a, b.f(textView6), null, 4);
            appCompatImageView.setVisibility(8);
            lx90Var = lx90Var2;
            ViewGroup.LayoutParams layoutParams = lx90Var.d.getLayoutParams();
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 0.5f;
            layoutParams2.width = -2;
            lx90Var.d.setLayoutParams(layoutParams2);
            i4 = 0;
            i5 = 8;
        } else {
            dVar = dVar2;
            Drawable background5 = appCompatTextView2.getBackground();
            if (background5 instanceof GradientDrawable) {
                GradientDrawable gradientDrawable5 = (GradientDrawable) background5;
                gradientDrawable5.mutate();
                gradientDrawable5.setColor(iL);
            }
            ColorStateList colorStateListValueOf3 = ColorStateList.valueOf(iL);
            WeakHashMap<View, g9i0> weakHashMap3 = r6i0.a;
            r6i0.d.j(textView5, colorStateListValueOf3);
            r6i0.d.j(appCompatTextView2, ColorStateList.valueOf(iL));
            if (betHistoryItem.getTargetCoefficient() != null) {
                appCompatTextView.setText(eVar.getString(R.string.coeff, String.valueOf(betHistoryItem.getTargetCoefficient().doubleValue())));
                appCompatTextView2.setVisibility(8);
                linearLayoutCompat.setVisibility(0);
                if (Intrinsics.g(betHistoryItem.getSideBetType(), "OVER")) {
                    imageView.setRotation(90.0f);
                } else {
                    imageView.setRotation(270.0f);
                }
            } else if (betHistoryItem.getStartCoefficient() == null || betHistoryItem.getEndCoefficient() == null) {
                appCompatTextView2.setText(eVar.getString(R.string.coeff, betHistoryItem.getCashoutCoefficientStr()));
                if (str4.equals("sporty-skills")) {
                    Double cashoutCoefficient = betHistoryItem.getCashoutCoefficient();
                    double dDoubleValue2 = cashoutCoefficient != null ? cashoutCoefficient.doubleValue() : 0.0d;
                    if (dDoubleValue2 <= 1.5d) {
                        i3 = R.color.ss_chip1;
                    } else if (dDoubleValue2 <= 4.9d) {
                        i3 = R.color.ss_chip2;
                    } else if (dDoubleValue2 <= 9.9d) {
                        i3 = R.color.ss_chip3;
                    } else {
                        i3 = dDoubleValue2 <= 18.9d ? R.color.ss_chip4 : R.color.ss_chip5;
                    }
                    color = eVar.getColor(i3);
                } else if (str4.equals("sporty-cars")) {
                    color = eVar.getColor(R.color.bet_history_cars_coeff_color);
                } else {
                    Double cashoutCoefficient2 = betHistoryItem.getCashoutCoefficient();
                    double dDoubleValue3 = cashoutCoefficient2 != null ? cashoutCoefficient2.doubleValue() : 0.0d;
                    if (dDoubleValue3 <= 1.5d) {
                        i2 = R.color.sj_chip1;
                    } else if (dDoubleValue3 <= 4.9d) {
                        i2 = R.color.sj_chip2;
                    } else if (dDoubleValue3 <= 9.9d) {
                        i2 = R.color.sj_chip3;
                    } else {
                        i2 = dDoubleValue3 <= 18.9d ? R.color.sj_chip4 : R.color.sj_chip5;
                    }
                    color = eVar.getColor(i2);
                }
                appCompatTextView2.setTextColor(color);
            } else {
                appCompatTextView2.setText(eVar.getString(R.string.coeff, String.valueOf(betHistoryItem.getStartCoefficient().doubleValue())) + " - " + eVar.getString(R.string.coeff, String.valueOf(betHistoryItem.getEndCoefficient().doubleValue())) + " ");
            }
            appCompatImageView2.setVisibility(0);
            textView6.setText(kt2.c(betHistoryItem.getPayoutAmount(), eVar));
            textView6.addOnLayoutChangeListener(new ns2(textView6));
            if (str2.length() == 0) {
                i5 = 8;
                appCompatImageView.setVisibility(8);
                lx90Var = lx90Var2;
                ViewGroup.LayoutParams layoutParams3 = lx90Var.d.getLayoutParams();
                layoutParams3.getClass();
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.weight = 0.5f;
                layoutParams4.width = -2;
                lx90Var.d.setLayoutParams(layoutParams4);
                i4 = 0;
            } else {
                lx90Var = lx90Var2;
                i4 = 0;
                i5 = 8;
                appCompatImageView.setVisibility(0);
            }
        }
        lx90Var.F.setVisibility(betHistoryItem.getGiftAmount() > 0.0d ? i4 : i5);
        js2Var.a(dVar.a, this.e, this.f, this.i, this.v, this.w, new ro2(this, i4), new so2(this, i4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            int i2 = zs2.b;
            return zs2.a.a(viewGroup);
        }
        if (i == 2) {
            int i3 = tp2.b;
            return tp2.a.a(viewGroup);
        }
        if (i != 12) {
            throw new ClassCastException(hce0.a(i, "Unknown viewType "));
        }
        int i4 = js2.c;
        View viewA = u540.a(viewGroup, R.layout.sj_bethistory_item, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewA;
        int i5 = R.id.bottom_info_row;
        if (((LinearLayout) h5e.a(R.id.bottom_info_row, viewA)) != null) {
            i5 = R.id.button_item_view;
            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.button_item_view, viewA);
            if (appCompatTextView != null) {
                i5 = R.id.card_info;
                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.card_info, viewA);
                if (linearLayout != null) {
                    i5 = R.id.chat;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.chat, viewA);
                    if (appCompatImageView != null) {
                        i5 = R.id.coeff_item;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.coeff_item, viewA);
                        if (appCompatTextView2 != null) {
                            i5 = R.id.coeff_layer;
                            if (((LinearLayoutCompat) h5e.a(R.id.coeff_layer, viewA)) != null) {
                                i5 = R.id.coeff_prefix;
                                TextView textView = (TextView) h5e.a(R.id.coeff_prefix, viewA);
                                if (textView != null) {
                                    i5 = R.id.collapsed_bonus_image_view;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.collapsed_bonus_image_view, viewA);
                                    if (appCompatImageView2 != null) {
                                        i5 = R.id.details;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) h5e.a(R.id.details, viewA);
                                        if (linearLayoutCompat != null) {
                                            i5 = R.id.expanded_bonus_image_view;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.expanded_bonus_image_view, viewA);
                                            if (appCompatImageView3 != null) {
                                                i5 = R.id.fairness;
                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.fairness, viewA);
                                                if (appCompatImageView4 != null) {
                                                    i5 = R.id.fbg_amount_tv;
                                                    TextView textView2 = (TextView) h5e.a(R.id.fbg_amount_tv, viewA);
                                                    if (textView2 != null) {
                                                        i5 = R.id.fbg_win_amount_tv;
                                                        TextView textView3 = (TextView) h5e.a(R.id.fbg_win_amount_tv, viewA);
                                                        if (textView3 != null) {
                                                            i5 = R.id.free_bet_gift_tv;
                                                            TextView textView4 = (TextView) h5e.a(R.id.free_bet_gift_tv, viewA);
                                                            if (textView4 != null) {
                                                                i5 = R.id.free_bet_gift_win_tv;
                                                                TextView textView5 = (TextView) h5e.a(R.id.free_bet_gift_win_tv, viewA);
                                                                if (textView5 != null) {
                                                                    i5 = R.id.gift_detail;
                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.gift_detail, viewA);
                                                                    if (constraintLayout2 != null) {
                                                                        i5 = R.id.gift_icon;
                                                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) h5e.a(R.id.gift_icon, viewA);
                                                                        if (appCompatImageView5 != null) {
                                                                            i5 = R.id.gift_icon_ss;
                                                                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) h5e.a(R.id.gift_icon_ss, viewA);
                                                                            if (appCompatImageView6 != null) {
                                                                                i5 = R.id.gift_layout;
                                                                                if (((ConstraintLayout) h5e.a(R.id.gift_layout, viewA)) != null) {
                                                                                    i5 = R.id.gift_layout_below;
                                                                                    if (((ConstraintLayout) h5e.a(R.id.gift_layout_below, viewA)) != null) {
                                                                                        i5 = R.id.gift_paid_detail;
                                                                                        if (((ConstraintLayout) h5e.a(R.id.gift_paid_detail, viewA)) != null) {
                                                                                            i5 = R.id.gift_paid_detail_below;
                                                                                            if (((ConstraintLayout) h5e.a(R.id.gift_paid_detail_below, viewA)) != null) {
                                                                                                i5 = R.id.gift_paid_divider;
                                                                                                View viewA2 = h5e.a(R.id.gift_paid_divider, viewA);
                                                                                                if (viewA2 != null) {
                                                                                                    i5 = R.id.gift_win_detail;
                                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.gift_win_detail, viewA);
                                                                                                    if (constraintLayout3 != null) {
                                                                                                        i5 = R.id.gift_win_detail_below;
                                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.gift_win_detail_below, viewA);
                                                                                                        if (constraintLayout4 != null) {
                                                                                                            i5 = R.id.gift_win_divider;
                                                                                                            View viewA3 = h5e.a(R.id.gift_win_divider, viewA);
                                                                                                            if (viewA3 != null) {
                                                                                                                i5 = R.id.half_watermark;
                                                                                                                ImageView imageView = (ImageView) h5e.a(R.id.half_watermark, viewA);
                                                                                                                if (imageView != null) {
                                                                                                                    i5 = R.id.image_arrow_down;
                                                                                                                    AppCompatImageView appCompatImageView7 = (AppCompatImageView) h5e.a(R.id.image_arrow_down, viewA);
                                                                                                                    if (appCompatImageView7 != null) {
                                                                                                                        i5 = R.id.image_arrow_up;
                                                                                                                        AppCompatImageView appCompatImageView8 = (AppCompatImageView) h5e.a(R.id.image_arrow_up, viewA);
                                                                                                                        if (appCompatImageView8 != null) {
                                                                                                                            i5 = R.id.level_icon;
                                                                                                                            ShapeableImageView shapeableImageView = (ShapeableImageView) h5e.a(R.id.level_icon, viewA);
                                                                                                                            if (shapeableImageView != null) {
                                                                                                                                i5 = R.id.level_icon_fl;
                                                                                                                                FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.level_icon_fl, viewA);
                                                                                                                                if (frameLayout != null) {
                                                                                                                                    i5 = R.id.more_detail_content;
                                                                                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.more_detail_content, viewA);
                                                                                                                                    if (constraintLayout5 != null) {
                                                                                                                                        i5 = R.id.ou_coeff;
                                                                                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.ou_coeff, viewA);
                                                                                                                                        if (appCompatTextView3 != null) {
                                                                                                                                            i5 = R.id.over_under_coeff;
                                                                                                                                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) h5e.a(R.id.over_under_coeff, viewA);
                                                                                                                                            if (linearLayoutCompat2 != null) {
                                                                                                                                                i5 = R.id.over_under_image;
                                                                                                                                                ImageView imageView2 = (ImageView) h5e.a(R.id.over_under_image, viewA);
                                                                                                                                                if (imageView2 != null) {
                                                                                                                                                    i5 = R.id.round_id;
                                                                                                                                                    TextView textView6 = (TextView) h5e.a(R.id.round_id, viewA);
                                                                                                                                                    if (textView6 != null) {
                                                                                                                                                        i5 = R.id.round_layout;
                                                                                                                                                        if (((LinearLayoutCompat) h5e.a(R.id.round_layout, viewA)) != null) {
                                                                                                                                                            i5 = R.id.round_number;
                                                                                                                                                            TextView textView7 = (TextView) h5e.a(R.id.round_number, viewA);
                                                                                                                                                            if (textView7 != null) {
                                                                                                                                                                i5 = R.id.stake_item_view;
                                                                                                                                                                if (((LinearLayoutCompat) h5e.a(R.id.stake_item_view, viewA)) != null) {
                                                                                                                                                                    i5 = R.id.stake_tv;
                                                                                                                                                                    TextView textView8 = (TextView) h5e.a(R.id.stake_tv, viewA);
                                                                                                                                                                    if (textView8 != null) {
                                                                                                                                                                        i5 = R.id.status_item_view;
                                                                                                                                                                        TextView textView9 = (TextView) h5e.a(R.id.status_item_view, viewA);
                                                                                                                                                                        if (textView9 != null) {
                                                                                                                                                                            i5 = R.id.status_layer;
                                                                                                                                                                            if (((LinearLayoutCompat) h5e.a(R.id.status_layer, viewA)) != null) {
                                                                                                                                                                                i5 = R.id.ticket_id;
                                                                                                                                                                                TextView textView10 = (TextView) h5e.a(R.id.ticket_id, viewA);
                                                                                                                                                                                if (textView10 != null) {
                                                                                                                                                                                    i5 = R.id.ticket_number;
                                                                                                                                                                                    UnderLineTextView underLineTextView = (UnderLineTextView) h5e.a(R.id.ticket_number, viewA);
                                                                                                                                                                                    if (underLineTextView != null) {
                                                                                                                                                                                        i5 = R.id.ticket_number_layout;
                                                                                                                                                                                        if (((LinearLayoutCompat) h5e.a(R.id.ticket_number_layout, viewA)) != null) {
                                                                                                                                                                                            i5 = R.id.time_item_view;
                                                                                                                                                                                            TextView textView11 = (TextView) h5e.a(R.id.time_item_view, viewA);
                                                                                                                                                                                            if (textView11 != null) {
                                                                                                                                                                                                i5 = R.id.top_ui;
                                                                                                                                                                                                if (((ConstraintLayout) h5e.a(R.id.top_ui, viewA)) != null) {
                                                                                                                                                                                                    i5 = R.id.total_stake_amount_tv;
                                                                                                                                                                                                    TextView textView12 = (TextView) h5e.a(R.id.total_stake_amount_tv, viewA);
                                                                                                                                                                                                    if (textView12 != null) {
                                                                                                                                                                                                        i5 = R.id.total_stake_tv;
                                                                                                                                                                                                        TextView textView13 = (TextView) h5e.a(R.id.total_stake_tv, viewA);
                                                                                                                                                                                                        if (textView13 != null) {
                                                                                                                                                                                                            i5 = R.id.total_win_amount_tv;
                                                                                                                                                                                                            TextView textView14 = (TextView) h5e.a(R.id.total_win_amount_tv, viewA);
                                                                                                                                                                                                            if (textView14 != null) {
                                                                                                                                                                                                                i5 = R.id.total_win_tv;
                                                                                                                                                                                                                TextView textView15 = (TextView) h5e.a(R.id.total_win_tv, viewA);
                                                                                                                                                                                                                if (textView15 != null) {
                                                                                                                                                                                                                    i5 = R.id.vip_icon;
                                                                                                                                                                                                                    AppCompatImageView appCompatImageView9 = (AppCompatImageView) h5e.a(R.id.vip_icon, viewA);
                                                                                                                                                                                                                    if (appCompatImageView9 != null) {
                                                                                                                                                                                                                        i5 = R.id.watermark;
                                                                                                                                                                                                                        ImageView imageView3 = (ImageView) h5e.a(R.id.watermark, viewA);
                                                                                                                                                                                                                        if (imageView3 != null) {
                                                                                                                                                                                                                            i5 = R.id.win_image;
                                                                                                                                                                                                                            AppCompatImageView appCompatImageView10 = (AppCompatImageView) h5e.a(R.id.win_image, viewA);
                                                                                                                                                                                                                            if (appCompatImageView10 != null) {
                                                                                                                                                                                                                                i5 = R.id.you_paid_amount_tv;
                                                                                                                                                                                                                                TextView textView16 = (TextView) h5e.a(R.id.you_paid_amount_tv, viewA);
                                                                                                                                                                                                                                if (textView16 != null) {
                                                                                                                                                                                                                                    i5 = R.id.you_paid_tv;
                                                                                                                                                                                                                                    TextView textView17 = (TextView) h5e.a(R.id.you_paid_tv, viewA);
                                                                                                                                                                                                                                    if (textView17 != null) {
                                                                                                                                                                                                                                        i5 = R.id.you_win_amount_tv;
                                                                                                                                                                                                                                        TextView textView18 = (TextView) h5e.a(R.id.you_win_amount_tv, viewA);
                                                                                                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                                                                                                            i5 = R.id.you_win_tv;
                                                                                                                                                                                                                                            TextView textView19 = (TextView) h5e.a(R.id.you_win_tv, viewA);
                                                                                                                                                                                                                                            if (textView19 != null) {
                                                                                                                                                                                                                                                i5 = R.id.your_pick_layer;
                                                                                                                                                                                                                                                if (((LinearLayoutCompat) h5e.a(R.id.your_pick_layer, viewA)) != null) {
                                                                                                                                                                                                                                                    i5 = R.id.your_pick_prefix;
                                                                                                                                                                                                                                                    TextView textView20 = (TextView) h5e.a(R.id.your_pick_prefix, viewA);
                                                                                                                                                                                                                                                    if (textView20 != null) {
                                                                                                                                                                                                                                                        i5 = R.id.your_pick_txt;
                                                                                                                                                                                                                                                        TextView textView21 = (TextView) h5e.a(R.id.your_pick_txt, viewA);
                                                                                                                                                                                                                                                        if (textView21 != null) {
                                                                                                                                                                                                                                                            return new js2(new lx90(constraintLayout, constraintLayout, appCompatTextView, linearLayout, appCompatImageView, appCompatTextView2, textView, appCompatImageView2, linearLayoutCompat, appCompatImageView3, appCompatImageView4, textView2, textView3, textView4, textView5, constraintLayout2, appCompatImageView5, appCompatImageView6, viewA2, constraintLayout3, constraintLayout4, viewA3, imageView, appCompatImageView7, appCompatImageView8, shapeableImageView, frameLayout, constraintLayout5, appCompatTextView3, linearLayoutCompat2, imageView2, textView6, textView7, textView8, textView9, textView10, underLineTextView, textView11, textView12, textView13, textView14, textView15, appCompatImageView9, imageView3, appCompatImageView10, textView16, textView17, textView18, textView19, textView20, textView21));
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
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i5)));
        return null;
    }
}
