package com.sportybet.android.globalpay.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.globalpay.customview.PaymentAccountView;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.gr0;
import defpackage.h5e;
import defpackage.uhc;
import defpackage.x500;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/sportybet/android/globalpay/customview/PaymentAccountView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enable", "", "setViewEnable", "(Z)V", "Lx500;", "F", "Lx500;", "getBinding", "()Lx500;", "binding", "Lcom/sporty/android/common_ui/widgets/ClearEditText;", "getMobileNumber", "()Lcom/sporty/android/common_ui/widgets/ClearEditText;", "mobileNumber", "Landroid/widget/TextView;", "getPrefixNumber", "()Landroid/widget/TextView;", "prefixNumber", "Landroidx/appcompat/widget/AppCompatImageView;", "getAccountIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "accountIcon", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PaymentAccountView extends ConstraintLayout {
    public static final /* synthetic */ int G = 0;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final x500 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAccountView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.payment_account_view, this);
        int i2 = R.id.account_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.account_icon, this);
        if (appCompatImageView != null) {
            i2 = R.id.left_barrier;
            if (((Barrier) h5e.a(R.id.left_barrier, this)) != null) {
                i2 = R.id.mobile_number;
                ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.mobile_number, this);
                if (clearEditText != null) {
                    i2 = R.id.prefix_number;
                    TextView textView = (TextView) h5e.a(R.id.prefix_number, this);
                    if (textView != null) {
                        this.binding = new x500(this, appCompatImageView, clearEditText, textView);
                        setBackground(gr0.a(context, R.drawable.comb_edit_text_bg));
                        clearEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: w500
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view, boolean z) {
                                PaymentAccountView paymentAccountView = this.a;
                                x500 x500Var = paymentAccountView.binding;
                                int i3 = PaymentAccountView.G;
                                Context context2 = context;
                                if (z) {
                                    paymentAccountView.setBackground(gr0.a(context2, R.drawable.bg_outlined_brand_secondary_2_radius));
                                    ClearEditText clearEditText2 = x500Var.c;
                                    clearEditText2.setClearIconVisible(String.valueOf(clearEditText2.getText()).length() > 0);
                                } else if (z) {
                                    uhc.a();
                                } else {
                                    paymentAccountView.setBackground(gr0.a(context2, R.drawable.comb_edit_text_bg));
                                    x500Var.c.setClearIconVisible(false);
                                }
                            }
                        });
                        return;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final AppCompatImageView getAccountIcon() {
        return this.binding.b;
    }

    public final x500 getBinding() {
        return this.binding;
    }

    public final ClearEditText getMobileNumber() {
        return this.binding.c;
    }

    public final TextView getPrefixNumber() {
        return this.binding.d;
    }

    public final void setViewEnable(boolean enable) {
        x500 x500Var = this.binding;
        if (enable) {
            setBackground(gr0.a(getContext(), R.drawable.comb_edit_text_bg));
            x500Var.c.setEditable(true);
        } else {
            if (enable) {
                uhc.a();
                return;
            }
            setBackground(gr0.a(getContext(), R.drawable.spr_share_reply_content));
            ClearEditText clearEditText = x500Var.c;
            ClearEditText clearEditText2 = x500Var.c;
            clearEditText.setEditable(false);
            clearEditText2.setTextColor(getContext().getColor(R.color.text_type1_secondary));
            clearEditText2.setClearIconVisible(false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAccountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAccountView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ PaymentAccountView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
