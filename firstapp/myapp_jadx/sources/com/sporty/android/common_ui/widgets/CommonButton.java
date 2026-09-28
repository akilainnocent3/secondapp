package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.l6i0;
import defpackage.rk30;
import defpackage.sn5;
import defpackage.zch0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u000eJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u000eJ\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0018\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/sporty/android/common_ui/widgets/CommonButton;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "", "setText", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "resId", "(I)V", "setDescriptionText", "getDescriptionText", "setNumberTag", "getNumberTag", "color", "setTextColor", "Landroid/content/res/ColorStateList;", "colorStateList", "(Landroid/content/res/ColorStateList;)V", "setTextAppearance", "", "enabled", "setEnabled", "(Z)V", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CommonButton extends LinearLayout {
    public final l6i0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.view_common_button, this);
        int i2 = R.id.descriptionTextView;
        TextView textView = (TextView) h5e.a(R.id.descriptionTextView, this);
        if (textView != null) {
            i2 = R.id.iconEnd;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.iconEnd, this);
            if (appCompatImageView != null) {
                i2 = R.id.iconStart;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.iconStart, this);
                if (appCompatImageView2 != null) {
                    i2 = R.id.numberTag;
                    TextView textView2 = (TextView) h5e.a(R.id.numberTag, this);
                    if (textView2 != null) {
                        i2 = R.id.textView;
                        TextView textView3 = (TextView) h5e.a(R.id.textView, this);
                        if (textView3 != null) {
                            this.a = new l6i0(this, textView, appCompatImageView, appCompatImageView2, textView2, textView3);
                            setOrientation(0);
                            setGravity(17);
                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.j, i, 0);
                            typedArrayObtainStyledAttributes.getClass();
                            textView3.setText(sn5.a(2, context, typedArrayObtainStyledAttributes));
                            textView.setText(sn5.a(3, context, typedArrayObtainStyledAttributes));
                            a();
                            textView2.setText(sn5.a(10, context, typedArrayObtainStyledAttributes));
                            b();
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                            if (resourceId != 0) {
                                textView3.setTextAppearance(resourceId);
                            }
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(4, resourceId);
                            if (resourceId2 != 0) {
                                textView.setTextAppearance(resourceId2);
                            }
                            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                                textView3.setTextColor(typedArrayObtainStyledAttributes.getColorStateList(1));
                                textView.setTextColor(typedArrayObtainStyledAttributes.getColorStateList(1));
                            }
                            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, zch0.b(context.getResources(), 20));
                            appCompatImageView2.getLayoutParams().width = dimensionPixelSize;
                            appCompatImageView2.getLayoutParams().height = dimensionPixelSize;
                            appCompatImageView.getLayoutParams().width = dimensionPixelSize;
                            appCompatImageView.getLayoutParams().height = dimensionPixelSize;
                            ColorStateList colorStateList = typedArrayObtainStyledAttributes.hasValue(8) ? typedArrayObtainStyledAttributes.getColorStateList(8) : textView3.getTextColors();
                            appCompatImageView2.setImageTintList(colorStateList);
                            appCompatImageView.setImageTintList(colorStateList);
                            textView2.setBackgroundTintList(typedArrayObtainStyledAttributes.hasValue(9) ? typedArrayObtainStyledAttributes.getColorStateList(9) : textView2.getTextColors());
                            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
                            if (drawable != null) {
                                appCompatImageView2.setImageDrawable(drawable);
                                appCompatImageView2.setVisibility(0);
                            }
                            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
                            if (drawable2 != null) {
                                appCompatImageView.setImageDrawable(drawable2);
                                appCompatImageView.setVisibility(0);
                            }
                            typedArrayObtainStyledAttributes.recycle();
                            return;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void a() {
        TextView textView = this.a.b;
        CharSequence text = textView.getText();
        text.getClass();
        textView.setVisibility(text.length() == 0 ? 8 : 0);
    }

    public final void b() {
        TextView textView = this.a.e;
        CharSequence text = textView.getText();
        text.getClass();
        textView.setVisibility(text.length() == 0 ? 8 : 0);
    }

    public final CharSequence getDescriptionText() {
        CharSequence text = this.a.b.getText();
        text.getClass();
        return text;
    }

    public final CharSequence getNumberTag() {
        CharSequence text = this.a.e.getText();
        text.getClass();
        return text;
    }

    public final CharSequence getText() {
        CharSequence text = this.a.f.getText();
        text.getClass();
        return text;
    }

    public final void setDescriptionText(CharSequence text) {
        text.getClass();
        this.a.b.setText(text);
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        l6i0 l6i0Var = this.a;
        l6i0Var.f.setEnabled(enabled);
        l6i0Var.b.setEnabled(enabled);
        l6i0Var.d.setEnabled(enabled);
        l6i0Var.c.setEnabled(enabled);
        l6i0Var.e.setEnabled(enabled);
    }

    public final void setNumberTag(CharSequence text) {
        text.getClass();
        this.a.e.setText(text);
        b();
    }

    public final void setText(CharSequence text) {
        text.getClass();
        this.a.f.setText(text);
    }

    public final void setTextAppearance(int resId) {
        this.a.f.setTextAppearance(resId);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.a.f.setTextColor(colorStateList);
    }

    public final void setText(int resId) {
        this.a.f.setText(resId);
    }

    public final void setTextColor(int color) {
        this.a.f.setTextColor(color);
    }

    public final void setDescriptionText(int resId) {
        this.a.b.setText(resId);
        a();
    }

    public final void setNumberTag(int resId) {
        this.a.e.setText(resId);
        b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonButton(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ CommonButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R.attr.commonButtonStyle);
    }
}
