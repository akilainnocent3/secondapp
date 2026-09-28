package com.sportygames.sportyherov2.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import defpackage.bmy;
import defpackage.e6a;
import defpackage.h5e;
import defpackage.hre;
import defpackage.hw80;
import defpackage.krh0;
import defpackage.lo80;
import defpackage.na7;
import defpackage.np5;
import defpackage.po80;
import defpackage.rv80;
import defpackage.uu80;
import defpackage.xa50;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/sportygames/sportyherov2/components/SHRangeComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/sportygames/sportyherov2/components/SHKeypadContainer;", "k1", "k2", "", "setupRangeKeypad", "(Lcom/sportygames/sportyherov2/components/SHKeypadContainer;Lcom/sportygames/sportyherov2/components/SHKeypadContainer;)V", "setValentine", "()V", "", "tournamentBannerVisible", "", "deviceHeight", "deviceWidth", "setBetButtonsHeight", "(ZFF)V", "isWorldCupThemeEnabled", "setBetContainerBgWcTheme", "(Z)V", "Lrv80;", "F", "Lrv80;", "getBinding", "()Lrv80;", "setBinding", "(Lrv80;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SHRangeComponent extends ConstraintLayout {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public rv80 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHRangeComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sh_range_container_v2, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.parent_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.parent_container, viewInflate);
        if (constraintLayout != null) {
            i = R.id.range_component1;
            RangeComponent rangeComponent = (RangeComponent) h5e.a(R.id.range_component1, viewInflate);
            if (rangeComponent != null) {
                i = R.id.range_component2;
                RangeComponent rangeComponent2 = (RangeComponent) h5e.a(R.id.range_component2, viewInflate);
                if (rangeComponent2 != null) {
                    i = R.id.tab_button;
                    View viewA = h5e.a(R.id.tab_button, viewInflate);
                    if (viewA != null) {
                        hw80 hw80VarA = hw80.a(viewA);
                        i = R.id.view_1;
                        View viewA2 = h5e.a(R.id.view_1, viewInflate);
                        if (viewA2 != null) {
                            i = R.id.wc_flag;
                            if (((CardView) h5e.a(R.id.wc_flag, viewInflate)) != null) {
                                i = R.id.wc_flag_image;
                                ImageView imageView = (ImageView) h5e.a(R.id.wc_flag_image, viewInflate);
                                if (imageView != null) {
                                    this.binding = new rv80((ConstraintLayout) viewInflate, constraintLayout, rangeComponent, rangeComponent2, hw80VarA, viewA2, imageView);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final rv80 getBinding() {
        return this.binding;
    }

    public final void setBetButtonsHeight(boolean tournamentBannerVisible, float deviceHeight, float deviceWidth) {
        if (deviceHeight == 0.0f || deviceWidth == 0.0f) {
            return;
        }
        Map mapB = tournamentBannerVisible ? uu80.b(deviceHeight, deviceWidth) : uu80.a(deviceHeight, deviceWidth);
        ViewGroup.LayoutParams layoutParams = this.binding.f.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Float f = (Float) mapB.get("view1_height");
        layoutParams2.S = f != null ? f.floatValue() : 0.0277f;
        this.binding.f.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.binding.e.z.getLayoutParams();
        layoutParams3.getClass();
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        Float f2 = (Float) mapB.get("spacer_1_width");
        layoutParams4.S = f2 != null ? f2.floatValue() : 0.0227f;
        this.binding.e.z.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = this.binding.e.A.getLayoutParams();
        layoutParams5.getClass();
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        Float f3 = (Float) mapB.get("spacer_1_width");
        layoutParams6.S = f3 != null ? f3.floatValue() : 0.0227f;
        this.binding.e.A.setLayoutParams(layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = this.binding.e.y.getLayoutParams();
        layoutParams7.getClass();
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        Float f4 = (Float) mapB.get("spacer_1_width");
        layoutParams8.S = f4 != null ? f4.floatValue() : 0.0227f;
        this.binding.e.y.setLayoutParams(layoutParams8);
        ConstraintLayout constraintLayout = this.binding.e.B;
        ViewGroup.LayoutParams layoutParams9 = constraintLayout.getLayoutParams();
        layoutParams9.getClass();
        ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
        ((ViewGroup.MarginLayoutParams) layoutParams10).height = 0;
        Float f5 = (Float) mapB.get("top_bet_btn_height");
        layoutParams10.S = f5 != null ? f5.floatValue() : 0.111f;
        constraintLayout.setLayoutParams(layoutParams10);
        this.binding.c.setNestedDimensions(tournamentBannerVisible, deviceHeight, deviceWidth);
        this.binding.d.setNestedDimensions(tournamentBannerVisible, deviceHeight, deviceWidth);
    }

    public final void setBetContainerBgWcTheme(boolean isWorldCupThemeEnabled) {
        GradientDrawable gradientDrawable;
        if (!isWorldCupThemeEnabled) {
            this.binding.i.setVisibility(8);
            Context context = getContext();
            if (context != null) {
                Drawable background = this.binding.b.getBackground();
                gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(context.getColor(R.color.color_898989));
                }
            }
            this.binding.e.v.setVisibility(8);
            this.binding.e.w.setVisibility(8);
            return;
        }
        String strA = e6a.a();
        Locale locale = Locale.ROOT;
        String lowerCase = strA.toLowerCase(locale);
        lowerCase.getClass();
        String strI = krh0.i(lowerCase);
        this.binding.i.setVisibility(8);
        if (strI.length() == 0) {
            return;
        }
        Context context2 = getContext();
        if (context2 != null) {
            Drawable background2 = this.binding.b.getBackground();
            gradientDrawable = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(context2.getColor(R.color.dialog_bg_color));
            }
        }
        this.binding.i.setVisibility(0);
        Context context3 = getContext();
        context3.getClass();
        xa50 xa50VarA = np5.a(context3, context3);
        po80 po80Var = new po80(xa50VarA, strI, na7.a(xa50VarA, Drawable.class, strI), lo80.a);
        hre.a aVar = hre.a;
        aVar.getClass();
        po80Var.c(aVar);
        po80Var.e(this.binding.i);
        ImageView imageView = this.binding.i;
        String country = SportyGamesManager.getInstance().getCountry();
        if (country == null) {
            country = "";
        }
        String lowerCase2 = country.toLowerCase(locale);
        lowerCase2.getClass();
        imageView.setAlpha(krh0.h(lowerCase2));
    }

    public final void setBinding(rv80 rv80Var) {
        rv80Var.getClass();
        this.binding = rv80Var;
    }

    public final void setValentine() {
        this.binding.e.d.setBackground(getContext().getDrawable(R.drawable.sh_bet_button_background_valentine));
        this.binding.e.i.setBackground(getContext().getDrawable(R.drawable.sh_bet_button_background_valentine));
        int currentTextColor = this.binding.e.b.getCurrentTextColor();
        int color = getContext().getColor(R.color.sh_bet_text_enable_color);
        rv80 rv80Var = this.binding;
        if (currentTextColor == color) {
            rv80Var.e.b.setTextColor(getContext().getColor(R.color.valentine));
        } else {
            rv80Var.e.e.setTextColor(getContext().getColor(R.color.valentine));
        }
    }

    public final void setupRangeKeypad(SHKeypadContainer k1, SHKeypadContainer k2) {
        k1.getClass();
        k2.getClass();
        rv80 rv80Var = this.binding;
        rv80Var.c.V = k1;
        rv80Var.d.V = k2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHRangeComponent(Context context) {
        this(context, null);
        context.getClass();
    }
}
