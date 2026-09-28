package com.sportygames.pingpong.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sportybet.android.gp.tz.R;
import com.twilio.voice.EventKeys;
import defpackage.iw80;
import defpackage.tk30;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/sportygames/pingpong/components/SHToastContainer;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "color", "", EventKeys.ERROR_MESSAGE, "", "setMessageandBG", "(ILjava/lang/String;)V", "bgColor", "textColor", "setNetworkErrorToastData", "(ILjava/lang/String;I)V", "setFadeOut", "()V", "Liw80;", "E", "Liw80;", "getBinding", "()Liw80;", "setBinding", "(Liw80;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SHToastContainer extends LinearLayoutCompat {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public iw80 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHToastContainer(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        context.getClass();
        this.binding = iw80.a(LayoutInflater.from(context), this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.k);
            typedArrayObtainStyledAttributes.getClass();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final iw80 getBinding() {
        return this.binding;
    }

    public final void setBinding(iw80 iw80Var) {
        iw80Var.getClass();
        this.binding = iw80Var;
    }

    public final void setFadeOut() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setStartOffset(1500L);
        alphaAnimation.setDuration(1500L);
        this.binding.d.setAnimation(alphaAnimation);
        this.binding.d.setVisibility(8);
    }

    public final void setMessageandBG(int color, String message) {
        message.getClass();
        this.binding.w.setText(message);
        this.binding.b.setVisibility(8);
        this.binding.f.setVisibility(8);
        this.binding.e.setVisibility(8);
        this.binding.i.setVisibility(8);
        this.binding.v.setVisibility(8);
        this.binding.c.setBackgroundColor(getContext().getColor(color));
        iw80 iw80Var = this.binding;
        if (color == R.color.error_toast) {
            iw80Var.w.setTextColor(getContext().getColor(R.color.error_text));
        } else if (color == R.color.warn_toast) {
            iw80Var.w.setTextColor(getContext().getColor(R.color.white));
            this.binding.w.setTextAppearance(R.style.TextRegularElevenDp);
        } else {
            iw80Var.w.setTextColor(getContext().getColor(R.color.white));
        }
        this.binding.d.setVisibility(0);
    }

    public final void setNetworkErrorToastData(int bgColor, String message, int textColor) {
        message.getClass();
        this.binding.w.setText(message);
        this.binding.b.setVisibility(8);
        this.binding.f.setVisibility(8);
        this.binding.e.setVisibility(8);
        this.binding.i.setVisibility(8);
        this.binding.v.setVisibility(8);
        this.binding.c.setBackgroundColor(getContext().getColor(bgColor));
        this.binding.w.setTextColor(getContext().getColor(textColor));
        this.binding.w.setTextAppearance(R.style.TextRegularTenDp);
        this.binding.d.setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHToastContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
