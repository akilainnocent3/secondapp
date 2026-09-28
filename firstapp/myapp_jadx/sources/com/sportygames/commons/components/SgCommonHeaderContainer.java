package com.sportygames.commons.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.SgCommonHeaderContainer;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.op5;
import defpackage.qw;
import defpackage.ro80;
import defpackage.tk30;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/sportygames/commons/components/SgCommonHeaderContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "amount", "currency", "", "setAmount", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function0;", "backListener", "setBackListener", "(Lkotlin/jvm/functions/Function0;)V", "navigationListener", "setNavigationListener", "title", "", "color", "setTitleAndColor", "(Ljava/lang/String;I)V", "Lro80;", "a", "Lro80;", "getBinding", "()Lro80;", "setBinding", "(Lro80;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SgCommonHeaderContainer extends LinearLayout {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ro80 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SgCommonHeaderContainer(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sg_header_rush, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.amount;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.amount, viewInflate);
        if (appCompatTextView != null) {
            i = R.id.amountFrame;
            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.amountFrame, viewInflate);
            if (frameLayout != null) {
                i = R.id.cashAddTxt;
                TextView textView = (TextView) h5e.a(R.id.cashAddTxt, viewInflate);
                if (textView != null) {
                    i = R.id.cashMinusTxt;
                    TextView textView2 = (TextView) h5e.a(R.id.cashMinusTxt, viewInflate);
                    if (textView2 != null) {
                        i = R.id.chat;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.chat, viewInflate);
                        if (appCompatImageView != null) {
                            i = R.id.circle;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.circle, viewInflate);
                            if (appCompatImageView2 != null) {
                                i = R.id.currency_code;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.currency_code, viewInflate);
                                if (appCompatTextView2 != null) {
                                    i = R.id.icBack;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.icBack, viewInflate);
                                    if (appCompatImageView3 != null) {
                                        i = R.id.main_title;
                                        TextView textView3 = (TextView) h5e.a(R.id.main_title, viewInflate);
                                        if (textView3 != null) {
                                            i = R.id.navigation;
                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.navigation, viewInflate);
                                            if (appCompatImageView4 != null) {
                                                i = R.id.spinKitLoader;
                                                SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.spinKitLoader, viewInflate);
                                                if (spinKitView != null) {
                                                    i = R.id.wallet_add_money_button;
                                                    TextView textView4 = (TextView) h5e.a(R.id.wallet_add_money_button, viewInflate);
                                                    if (textView4 != null) {
                                                        this.binding = new ro80((ConstraintLayout) viewInflate, appCompatTextView, frameLayout, textView, textView2, appCompatImageView, appCompatImageView2, appCompatTextView2, appCompatImageView3, textView3, appCompatImageView4, spinKitView, textView4);
                                                        if (attributeSet != null) {
                                                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.l);
                                                            typedArrayObtainStyledAttributes.getClass();
                                                            typedArrayObtainStyledAttributes.recycle();
                                                            return;
                                                        }
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final ro80 getBinding() {
        return this.binding;
    }

    public final void setAmount(String amount, String currency) {
        amount.getClass();
        currency.getClass();
        ro80 ro80Var = this.binding;
        if (ro80Var != null) {
            ro80Var.b.setText(qw.c(Double.valueOf(Double.parseDouble(amount)), 12, false, null));
        }
        ro80 ro80Var2 = this.binding;
        if (ro80Var2 != null) {
            AppCompatTextView appCompatTextView = ro80Var2.v;
            op5.a.getClass();
            appCompatTextView.setText(op5.i(currency));
        }
    }

    public final void setBackListener(final Function0<Unit> backListener) {
        backListener.getClass();
        ro80 ro80Var = this.binding;
        if (ro80Var != null) {
            ro80Var.w.setOnClickListener(new View.OnClickListener() { // from class: kn80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = SgCommonHeaderContainer.b;
                    backListener.invoke();
                }
            });
        }
    }

    public final void setBinding(ro80 ro80Var) {
        this.binding = ro80Var;
    }

    public final void setNavigationListener(final Function0<Unit> navigationListener) {
        navigationListener.getClass();
        ro80 ro80Var = this.binding;
        if (ro80Var != null) {
            ro80Var.z.setOnClickListener(new View.OnClickListener() { // from class: jn80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = SgCommonHeaderContainer.b;
                    navigationListener.invoke();
                }
            });
        }
    }

    public final void setTitleAndColor(String title, int color) {
        title.getClass();
        ro80 ro80Var = this.binding;
        if (ro80Var != null) {
            ro80Var.y.setText(title);
        }
        ro80 ro80Var2 = this.binding;
        if (ro80Var2 != null) {
            ro80Var2.y.setTextColor(color);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SgCommonHeaderContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
