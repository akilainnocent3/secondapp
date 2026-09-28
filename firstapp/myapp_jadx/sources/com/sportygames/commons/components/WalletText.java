package com.sportygames.commons.components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import defpackage.op5;
import defpackage.qw;
import defpackage.tk30;
import java.text.DecimalFormat;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/sportygames/commons/components/WalletText;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "currency", "", JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT, "", "setBalance", "(Ljava/lang/String;Ljava/lang/Double;)V", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getBottom", "()Landroid/widget/TextView;", "setBottom", "(Landroid/widget/TextView;)V", "bottom", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WalletText extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final SpinKitView d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView bottom;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, R.layout.sg_wallet_textview, this);
        View viewFindViewById = findViewById(R.id.currency_code);
        viewFindViewById.getClass();
        this.a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.text_balance);
        viewFindViewById2.getClass();
        this.b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.text_balance);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.b = textView;
        View viewFindViewById4 = findViewById(R.id.spin_kit);
        viewFindViewById4.getClass();
        this.d = (SpinKitView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.top);
        viewFindViewById5.getClass();
        this.c = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.bottom);
        viewFindViewById6.getClass();
        this.bottom = (TextView) viewFindViewById6;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.w);
        typedArrayObtainStyledAttributes.getClass();
        textView.setText(typedArrayObtainStyledAttributes.getString(0));
        typedArrayObtainStyledAttributes.recycle();
        this.bottom.setGravity(80);
    }

    public final void a(double d) {
        if (d > 0.0d) {
            this.bottom.setText("+ ".concat(qw.c(Double.valueOf(d), 12, false, null)));
            if (d < 1.0d) {
                String str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d);
                str.getClass();
                this.bottom.setText(str);
                if (this.f) {
                    this.bottom.setText("+ ".concat(str));
                }
            }
            this.bottom.setGravity(48);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -10.0f);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.bottom, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            translateAnimation.setDuration(1700L);
            this.bottom.startAnimation(translateAnimation);
            objectAnimatorOfFloat.start();
        }
    }

    public final void b(double d) {
        if (d > 0.0d) {
            String strConcat = "- ".concat(qw.c(Double.valueOf(d), 12, false, null));
            TextView textView = this.c;
            textView.setText(strConcat);
            if (d < 1.0d) {
                String str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d);
                str.getClass();
                textView.setText(str);
                if (this.f) {
                    textView.setText("- ".concat(str));
                }
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 4.2f);
            AnimationSet animationSet = new AnimationSet(true);
            translateAnimation.setDuration(1800L);
            animationSet.addAnimation(translateAnimation);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(130L);
            animationSet.addAnimation(alphaAnimation);
            translateAnimation.setDuration(1800L);
            translateAnimation.setFillAfter(true);
            translateAnimation.setFillEnabled(true);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(900L);
            translateAnimation.setDuration(1700L);
            textView.startAnimation(translateAnimation);
            objectAnimatorOfFloat.start();
            textView.startAnimation(translateAnimation);
        }
    }

    @Override // android.view.View
    public final TextView getBottom() {
        return this.bottom;
    }

    public final void setBalance(String currency, Double balance) {
        String strI;
        this.a.setText(currency);
        this.d.setVisibility(8);
        String str = new DecimalFormat("#,###.00", SportyGamesManager.decimalFormatSymbols).format(balance);
        str.getClass();
        String strI2 = null;
        if (currency != null) {
            op5.a.getClass();
            strI = op5.i(currency);
        } else {
            strI = null;
        }
        TextView textView = this.b;
        textView.setText(strI + " " + str);
        balance.getClass();
        if (balance.doubleValue() < 1.0d) {
            String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(balance.doubleValue());
            str2.getClass();
            if (currency != null) {
                op5.a.getClass();
                strI2 = op5.i(currency);
            }
            textView.setText(strI2 + " " + str2);
        }
    }

    public final void setBottom(TextView textView) {
        textView.getClass();
        this.bottom = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WalletText(Context context) {
        this(context, null);
        context.getClass();
    }
}
