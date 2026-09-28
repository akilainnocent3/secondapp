package com.sportygames.pocketrocket.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.pocketrocket.component.PrHeaderContainer;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.jo80;
import defpackage.qw;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0013\u0010\u0011R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/sportygames/pocketrocket/component/PrHeaderContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "amount", "currency", "", "setAmount", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function0;", "backListener", "setBackListener", "(Lkotlin/jvm/functions/Function0;)V", "navigationListener", "setNavigationListener", "Ljo80;", "a", "Ljo80;", "getBinding", "()Ljo80;", "setBinding", "(Ljo80;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrHeaderContainer extends LinearLayout {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public jo80 binding;

    public final jo80 getBinding() {
        return this.binding;
    }

    public final void setAmount(String amount, String currency) {
        amount.getClass();
        currency.getClass();
        this.binding.b.setText(qw.c(Double.valueOf(Double.parseDouble(amount)), 12, false, null));
        this.binding.f.setText(currency);
    }

    public final void setBackListener(final Function0<Unit> backListener) {
        backListener.getClass();
        this.binding.c.setOnClickListener(new View.OnClickListener() { // from class: u820
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = PrHeaderContainer.b;
                backListener.invoke();
            }
        });
    }

    public final void setBinding(jo80 jo80Var) {
        jo80Var.getClass();
        this.binding = jo80Var;
    }

    public final void setNavigationListener(final Function0<Unit> navigationListener) {
        navigationListener.getClass();
        this.binding.y.setOnClickListener(new View.OnClickListener() { // from class: t820
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = PrHeaderContainer.b;
                navigationListener.invoke();
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrHeaderContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sg_game_header_pr, (ViewGroup) this, false);
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
                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.loader, viewInflate);
                            if (constraintLayout != null) {
                                i = R.id.main2_title;
                                TextView textView = (TextView) h5e.a(R.id.main2_title, viewInflate);
                                if (textView != null) {
                                    i = R.id.main_title;
                                    TextView textView2 = (TextView) h5e.a(R.id.main_title, viewInflate);
                                    if (textView2 != null) {
                                        i = R.id.navigation;
                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.navigation, viewInflate);
                                        if (appCompatImageView4 != null) {
                                            i = R.id.wallet_add_money_button;
                                            TextView textView3 = (TextView) h5e.a(R.id.wallet_add_money_button, viewInflate);
                                            if (textView3 != null) {
                                                i = R.id.walletContainer;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.walletContainer, viewInflate);
                                                if (constraintLayout2 != null) {
                                                    this.binding = new jo80((ConstraintLayout) viewInflate, appCompatTextView, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatTextView2, constraintLayout, textView, textView2, appCompatImageView4, textView3, constraintLayout2);
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
        bmy.a(vZBMKENANSz.rRdtDg.concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrHeaderContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
