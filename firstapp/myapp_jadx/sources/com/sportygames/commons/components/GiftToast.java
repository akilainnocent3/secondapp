package com.sportygames.commons.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.twilio.voice.EventKeys;
import defpackage.jn5;
import defpackage.op5;
import defpackage.qw;
import defpackage.tug;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/sportygames/commons/components/GiftToast;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "currency", "", "giftPrice", "", "shouldShowCurrency", "", "setToastText", "(Ljava/lang/String;DLjava/lang/Boolean;)V", "setCampaignCompletedText", "()V", EventKeys.ERROR_MESSAGE, "setWarningText", "(Ljava/lang/String;)V", "setErrorText", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "setTextView", "(Landroid/widget/TextView;)V", "textView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getBackground", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setBackground", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "background", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GiftToast extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public TextView textView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ConstraintLayout background;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftToast(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, R.layout.gift_toast, this);
        View viewFindViewById = findViewById(R.id.fbg_text);
        viewFindViewById.getClass();
        this.textView = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.background);
        viewFindViewById2.getClass();
        this.background = (ConstraintLayout) viewFindViewById2;
    }

    public static /* synthetic */ void setToastText$default(GiftToast giftToast, String str, double d, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = Boolean.TRUE;
        }
        giftToast.setToastText(str, d, bool);
    }

    @Override // android.view.View
    public final ConstraintLayout getBackground() {
        return this.background;
    }

    public final TextView getTextView() {
        return this.textView;
    }

    public final void setBackground(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this.background = constraintLayout;
    }

    public final void setCampaignCompletedText() {
        this.textView.setText(jn5.CAMPAIGN_COMPLETED_TOAST_MESSAGE.a());
        this.background.setBackgroundResource(R.color.campaign_toast_color);
    }

    public final void setErrorText(String message) {
        message.getClass();
        this.textView.setText(message);
        this.background.setBackgroundResource(R.color.toast_error);
    }

    public final void setTextView(TextView textView) {
        textView.getClass();
        this.textView = textView;
    }

    public final void setToastText(String currency, double giftPrice, Boolean shouldShowCurrency) {
        currency.getClass();
        Drawable drawable = getContext().getDrawable(R.drawable.gift_close);
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) this.textView.getLineHeight()) * 1.2d), this.textView.getLineHeight());
        }
        op5 op5Var = op5.a;
        String string = this.textView.getTag().toString();
        String string2 = getContext().getString(R.string.you_have_free_bet_gift_worth);
        string2.getClass();
        String strC = op5.c(op5Var, string, string2);
        String strI = op5.i(currency);
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = strI.toUpperCase(locale);
        upperCase.getClass();
        String strA = tug.a(upperCase, " ", qw.c(Double.valueOf(giftPrice), 12, false, null));
        if (Intrinsics.g(shouldShowCurrency, Boolean.FALSE)) {
            strA = qw.c(Double.valueOf(giftPrice), 12, false, null);
        }
        SpannableString spannableString = new SpannableString(tug.a(strC, " ", ": ".concat(strA)));
        int iT = StringsKt.T(spannableString, ":", 0, false, 6);
        int i = iT + 1;
        ImageSpan imageSpan = drawable != null ? new ImageSpan(drawable, 1) : null;
        if (imageSpan != null) {
            spannableString.setSpan(imageSpan, iT, i, 17);
        }
        this.textView.setText(spannableString);
        this.background.setBackgroundResource(R.color.gift_toast_color);
    }

    public final void setWarningText(String message) {
        message.getClass();
        this.textView.setText(message);
        this.background.setBackgroundResource(R.color.toast_warning);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftToast(Context context) {
        this(context, null);
        context.getClass();
    }
}
