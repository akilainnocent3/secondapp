package com.sportybet.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import defpackage.a330;
import defpackage.bmy;
import defpackage.fae;
import defpackage.h5e;
import defpackage.rk30;
import defpackage.sn5;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u0011J\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u0011R*\u0010+\u001a\u00020$2\u0006\u0010%\u001a\u00020$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b\u0010\u0010*R*\u0010.\u001a\u00020$2\u0006\u0010%\u001a\u00020$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b\u0016\u0010*R*\u00106\u001a\u00020/2\u0006\u0010%\u001a\u00020/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00108\u001a\u00020/2\u0006\u0010%\u001a\u00020/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105¨\u0006:"}, d2 = {"Lcom/sportybet/android/widget/ProgressButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "l", "", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "resId", "setButtonText", "(I)V", "Lcom/sporty/android/common_ui/uitext/UiText;", "text", "(Lcom/sporty/android/common_ui/uitext/UiText;)V", "setUppercasedButtonText", "setLoadingText", "Landroid/graphics/Typeface;", "typeface", "setTextTypeFace", "(Landroid/graphics/Typeface;)V", "color", "setTextColor", "setProgressBarColor", "", "sizeInSp", "setTextSize", "(F)V", "gravity", "setTextGravity", "", "value", "J", "Ljava/lang/CharSequence;", "getButtonText", "()Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;)V", "buttonText", "K", "getLoadingText", "loadingText", "", "M", "Z", "getEnableProgress2", "()Z", "setEnableProgress2", "(Z)V", "enableProgress2", "N", "isLoading", "setLoading", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ProgressButton extends ConstraintLayout {
    public final a330 F;
    public final TextView G;
    public ProgressBar H;
    public int I;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public CharSequence buttonText;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public CharSequence loadingText;
    public View.OnClickListener L;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public boolean enableProgress2;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean isLoading;
    public final boolean O;

    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ProgressButton progressButton = ProgressButton.this;
            progressButton.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            progressButton.I = progressButton.getWidth();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.progress_button, this);
        int i2 = R.id.progress;
        ProgressBar progressBar = (ProgressBar) h5e.a(R.id.progress, this);
        if (progressBar != null) {
            i2 = R.id.right_progress;
            ProgressBar progressBar2 = (ProgressBar) h5e.a(R.id.right_progress, this);
            if (progressBar2 != null) {
                i2 = R.id.text;
                TextView textView = (TextView) h5e.a(R.id.text, this);
                if (textView != null) {
                    this.F = new a330(this, progressBar, progressBar2, textView);
                    this.G = textView;
                    this.H = progressBar;
                    this.I = -2;
                    this.buttonText = "";
                    this.loadingText = "";
                    setClickable(true);
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.v, i, 0);
                    typedArrayObtainStyledAttributes.getClass();
                    String strA = sn5.a(2, context, typedArrayObtainStyledAttributes);
                    setButtonText(strA != null ? strA : "");
                    String strA2 = sn5.a(5, context, typedArrayObtainStyledAttributes);
                    setLoadingText(strA2 == null ? sn5.b(context, R.string.common_functions__loading_with_dot, new Object[0]) : strA2);
                    if (typedArrayObtainStyledAttributes.hasValue(6)) {
                        this.H.getIndeterminateDrawable().setTintList(typedArrayObtainStyledAttributes.getColorStateList(6));
                    }
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        textView.setTextAppearance(resourceId);
                    }
                    if (typedArrayObtainStyledAttributes.hasValue(1)) {
                        textView.setTextColor(typedArrayObtainStyledAttributes.getColorStateList(1));
                    }
                    setLoading(typedArrayObtainStyledAttributes.getBoolean(3, false));
                    this.O = typedArrayObtainStyledAttributes.getBoolean(4, false);
                    typedArrayObtainStyledAttributes.recycle();
                    getViewTreeObserver().addOnGlobalLayoutListener(new a());
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void E() {
        if (this.O) {
            int i = this.I;
            int width = getWidth();
            if (i < width) {
                i = width;
            }
            this.I = i;
            getLayoutParams().width = this.I;
        }
    }

    public final CharSequence getButtonText() {
        return this.buttonText;
    }

    public final boolean getEnableProgress2() {
        return this.enableProgress2;
    }

    public final CharSequence getLoadingText() {
        return this.loadingText;
    }

    public final void setButtonText(CharSequence charSequence) {
        charSequence.getClass();
        this.buttonText = charSequence;
        if (this.isLoading) {
            charSequence = this.loadingText;
        }
        this.G.setText(charSequence);
        E();
    }

    public final void setEnableProgress2(boolean z) {
        this.enableProgress2 = z;
        if (z) {
            this.H = this.F.b;
        }
    }

    public final void setLoading(boolean z) {
        if (z == this.isLoading) {
            return;
        }
        this.isLoading = z;
        TextView textView = this.G;
        if (!z) {
            setActivated(false);
            this.H.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(this.buttonText);
            E();
            super.setOnClickListener(this.L);
            return;
        }
        this.H.setVisibility(0);
        if (this.loadingText.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(this.loadingText);
        }
        E();
        super.setOnClickListener(null);
        setClickable(false);
        setActivated(true);
    }

    public final void setLoadingText(CharSequence charSequence) {
        charSequence.getClass();
        this.loadingText = charSequence;
        if (!this.isLoading) {
            charSequence = this.buttonText;
        }
        this.G.setText(charSequence);
        E();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l) {
        super.setOnClickListener(l);
        this.L = l;
    }

    @fae
    public final void setProgressBarColor(int color) {
        this.H.getIndeterminateDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN);
    }

    @fae
    public final void setTextColor(int color) {
        this.G.setTextColor(color);
    }

    public final void setTextGravity(int gravity) {
        this.G.setGravity(gravity);
    }

    public final void setTextSize(float sizeInSp) {
        this.G.setTextSize(0, TypedValue.applyDimension(2, sizeInSp, getResources().getDisplayMetrics()));
    }

    @fae
    public final void setTextTypeFace(Typeface typeface) {
        typeface.getClass();
        this.G.setTypeface(typeface);
    }

    public final void setUppercasedButtonText(int resId) {
        Context context = getContext();
        context.getClass();
        String upperCase = sn5.b(context, resId, new Object[0]).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        setButtonText(upperCase);
    }

    public final void setButtonText(int resId) {
        Context context = getContext();
        context.getClass();
        setButtonText(sn5.b(context, resId, new Object[0]));
    }

    public final void setButtonText(UiText text) {
        text.getClass();
        Context context = getContext();
        context.getClass();
        setButtonText(text.g(context));
    }

    public final void setLoadingText(int resId) {
        Context context = getContext();
        context.getClass();
        setLoadingText(sn5.b(context, resId, new Object[0]));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressButton(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ ProgressButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R.attr.progressButtonStyle);
    }
}
