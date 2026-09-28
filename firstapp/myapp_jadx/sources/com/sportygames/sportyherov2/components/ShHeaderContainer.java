package com.sportygames.sportyherov2.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.a;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import com.sportygames.sportyherov2.components.ShHeaderContainer;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.ko80;
import defpackage.kpu;
import defpackage.lo80;
import defpackage.na7;
import defpackage.op5;
import defpackage.po80;
import defpackage.qw;
import defpackage.xa50;
import defpackage.yjm;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/sportygames/sportyherov2/components/ShHeaderContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "setTitleLogo", "()V", "", "amount", "currency", "setAmount", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function0;", "backListener", "setBackListener", "(Lkotlin/jvm/functions/Function0;)V", "navigationListener", "setNavigationListener", "", "height", "width", "setUiPercentageOfNestedElements", "(FF)V", "Lko80;", "a", "Lko80;", "getBinding", "()Lko80;", "setBinding", "(Lko80;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShHeaderContainer extends LinearLayout {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ko80 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShHeaderContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sg_game_header_sh_v2, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.amount;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.amount, viewInflate);
        if (appCompatTextView != null) {
            i = R.id.backicon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.backicon, viewInflate);
            if (appCompatImageView != null) {
                i = R.id.chat;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.chat, viewInflate);
                if (appCompatImageView2 != null) {
                    i = R.id.circle;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.circle, viewInflate);
                    if (appCompatImageView3 != null) {
                        i = R.id.currency_code;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.currency_code, viewInflate);
                        if (appCompatTextView2 != null) {
                            i = R.id.loader;
                            SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.loader, viewInflate);
                            if (spinKitView != null) {
                                i = R.id.main_title;
                                ImageView imageView = (ImageView) h5e.a(R.id.main_title, viewInflate);
                                if (imageView != null) {
                                    i = R.id.navigation;
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.navigation, viewInflate);
                                    if (appCompatImageView4 != null) {
                                        i = R.id.wallet_add_money_button;
                                        TextView textView = (TextView) h5e.a(R.id.wallet_add_money_button, viewInflate);
                                        if (textView != null) {
                                            i = R.id.wallet_container;
                                            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.wallet_container, viewInflate);
                                            if (frameLayout != null) {
                                                i = R.id.wallet_frame;
                                                if (((ConstraintLayout) h5e.a(R.id.wallet_frame, viewInflate)) != null) {
                                                    this.binding = new ko80((ConstraintLayout) viewInflate, appCompatTextView, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatTextView2, spinKitView, imageView, appCompatImageView4, textView, frameLayout);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final ko80 getBinding() {
        return this.binding;
    }

    public final void setAmount(String amount, String currency) {
        amount.getClass();
        currency.getClass();
        this.binding.b.setText(qw.c(Double.valueOf(Double.parseDouble(amount)), 12, false, null));
        this.binding.f.setText(currency);
    }

    public final void setBackListener(Function0<Unit> backListener) {
        backListener.getClass();
        this.binding.c.setOnClickListener(new yjm(backListener, 1));
    }

    public final void setBinding(ko80 ko80Var) {
        ko80Var.getClass();
        this.binding = ko80Var;
    }

    public final void setNavigationListener(final Function0<Unit> navigationListener) {
        navigationListener.getClass();
        this.binding.w.setOnClickListener(new View.OnClickListener() { // from class: gt80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ShHeaderContainer.b;
                navigationListener.invoke();
            }
        });
    }

    public final void setTitleLogo() {
        Context context = getContext();
        context.getClass();
        xa50 xa50VarC = a.b(context).c(context);
        xa50VarC.getClass();
        op5.a.getClass();
        String strB = op5.b("game_title_webp:sg_game_name", "https://s.sporty.net/cms/sh_header_logo_8f2265e4ae.webp", null);
        new po80(xa50VarC, strB, na7.a(xa50VarC, Drawable.class, strB), lo80.a).e(this.binding.v);
    }

    public final void setUiPercentageOfNestedElements(float height, float width) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        Object obj6;
        Map mapF;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float fFloatValue5;
        float fFloatValue6;
        Float fValueOf = Float.valueOf(0.266f);
        Float fValueOf2 = Float.valueOf(0.88f);
        Float fValueOf3 = Float.valueOf(0.218f);
        float f = height / width;
        Float fValueOf4 = Float.valueOf(0.065f);
        Pair pair = new Pair("header_back_icon_width", fValueOf4);
        Float fValueOf5 = Float.valueOf(0.65f);
        Pair pair2 = new Pair("header_back_icon_height", fValueOf5);
        Float fValueOf6 = Float.valueOf(0.226f);
        Pair pair3 = new Pair("header_wallet_width", fValueOf6);
        float fFloatValue7 = 0.966f;
        Float fValueOf7 = Float.valueOf(0.966f);
        Pair pair4 = new Pair("header_wallet_height", fValueOf7);
        Float fValueOf8 = Float.valueOf(0.273f);
        Pair pair5 = new Pair("header_logo_width", fValueOf8);
        float fFloatValue8 = 0.75f;
        Float fValueOf9 = Float.valueOf(0.75f);
        Pair pair6 = new Pair("header_logo_height", fValueOf9);
        Float fValueOf10 = Float.valueOf(0.069f);
        Pair pair7 = new Pair("header_chat_width", fValueOf10);
        Float fValueOf11 = Float.valueOf(0.55f);
        Pair pair8 = new Pair("header_chat_height", fValueOf11);
        Float fValueOf12 = Float.valueOf(0.06f);
        Pair pair9 = new Pair("header_ham_width", fValueOf12);
        Float fValueOf13 = Float.valueOf(0.46f);
        String str2 = lTGEJfVytU.kIITpbQzYKBo;
        Map mapF2 = kpu.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(str2, fValueOf13));
        if (f >= 2.1f) {
            obj2 = "header_wallet_height";
            obj = "header_logo_width";
            obj3 = "header_logo_height";
            obj4 = "header_chat_width";
            mapF = kpu.f(new Pair("header_back_icon_width", fValueOf4), new Pair("header_back_icon_height", fValueOf5), new Pair("header_wallet_width", fValueOf3), new Pair(obj2, fValueOf2), new Pair(obj, fValueOf), new Pair(obj3, fValueOf9), new Pair(obj4, fValueOf10), new Pair("header_chat_height", fValueOf11), new Pair("header_ham_width", fValueOf12), new Pair(str2, fValueOf13));
            str = str2;
            obj5 = "header_chat_height";
            obj6 = "header_ham_width";
        } else {
            obj = "header_logo_width";
            obj2 = "header_wallet_height";
            obj3 = "header_logo_height";
            obj4 = "header_chat_width";
            if (f >= 2.0f) {
                obj5 = "header_chat_height";
                mapF = kpu.f(new Pair("header_back_icon_width", fValueOf4), new Pair("header_back_icon_height", fValueOf5), new Pair("header_wallet_width", fValueOf3), new Pair(obj2, fValueOf2), new Pair(obj, fValueOf), new Pair(obj3, fValueOf9), new Pair(obj4, fValueOf10), new Pair(obj5, fValueOf11), new Pair("header_ham_width", fValueOf12), new Pair(str2, fValueOf13));
                str = str2;
                obj6 = "header_ham_width";
            } else {
                obj5 = "header_chat_height";
                if (f >= 1.5f) {
                    Pair pair10 = new Pair("header_back_icon_width", fValueOf4);
                    Pair pair11 = new Pair("header_back_icon_height", fValueOf5);
                    Pair pair12 = new Pair("header_wallet_width", fValueOf6);
                    Pair pair13 = new Pair(obj2, fValueOf7);
                    Pair pair14 = new Pair(obj, fValueOf8);
                    Pair pair15 = new Pair(obj3, fValueOf9);
                    Pair pair16 = new Pair(obj4, fValueOf10);
                    Pair pair17 = new Pair(obj5, fValueOf11);
                    obj6 = "header_ham_width";
                    str = str2;
                    mapF = kpu.f(pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, new Pair(obj6, fValueOf12), new Pair(str, fValueOf13));
                } else {
                    str = str2;
                    obj6 = "header_ham_width";
                    mapF = mapF2;
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = this.binding.c.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Float f2 = (Float) mapF.get("header_back_icon_height");
        float fFloatValue9 = 0.521f;
        if (f2 != null) {
            fFloatValue = f2.floatValue();
        } else {
            fFloatValue = 0.521f;
        }
        layoutParams2.S = fFloatValue;
        Float f3 = (Float) mapF.get("header_back_icon_width");
        float fFloatValue10 = 0.066f;
        if (f3 != null) {
            fFloatValue2 = f3.floatValue();
        } else {
            fFloatValue2 = 0.066f;
        }
        layoutParams2.R = fFloatValue2;
        this.binding.c.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.binding.z.getLayoutParams();
        layoutParams3.getClass();
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        Float f4 = (Float) mapF.get(obj2);
        if (f4 != null) {
            fFloatValue7 = f4.floatValue();
        }
        layoutParams4.S = fFloatValue7;
        Float f5 = (Float) mapF.get("header_wallet_width");
        if (f5 != null) {
            fFloatValue3 = f5.floatValue();
        } else {
            fFloatValue3 = 0.216f;
        }
        layoutParams4.R = fFloatValue3;
        this.binding.z.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = this.binding.v.getLayoutParams();
        layoutParams5.getClass();
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        Float f6 = (Float) mapF.get(obj3);
        if (f6 != null) {
            fFloatValue8 = f6.floatValue();
        }
        layoutParams6.S = fFloatValue8;
        Float f7 = (Float) mapF.get(obj);
        if (f7 != null) {
            fFloatValue4 = f7.floatValue();
        } else {
            fFloatValue4 = 0.261f;
        }
        layoutParams6.R = fFloatValue4;
        this.binding.v.setLayoutParams(layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = this.binding.d.getLayoutParams();
        layoutParams7.getClass();
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        Float f8 = (Float) mapF.get(obj5);
        if (f8 != null) {
            fFloatValue5 = f8.floatValue();
        } else {
            fFloatValue5 = 0.521f;
        }
        layoutParams8.S = fFloatValue5;
        Float f9 = (Float) mapF.get(obj4);
        if (f9 != null) {
            fFloatValue6 = f9.floatValue();
        } else {
            fFloatValue6 = 0.066f;
        }
        layoutParams8.R = fFloatValue6;
        this.binding.d.setLayoutParams(layoutParams8);
        ViewGroup.LayoutParams layoutParams9 = this.binding.w.getLayoutParams();
        layoutParams9.getClass();
        ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
        Float f10 = (Float) mapF.get(str);
        if (f10 != null) {
            fFloatValue9 = f10.floatValue();
        }
        layoutParams10.S = fFloatValue9;
        Float f11 = (Float) mapF.get(obj6);
        if (f11 != null) {
            fFloatValue10 = f11.floatValue();
        }
        layoutParams10.R = fFloatValue10;
        this.binding.w.setLayoutParams(layoutParams10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShHeaderContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
