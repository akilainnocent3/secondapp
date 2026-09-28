package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.rk30;
import defpackage.sn5;
import defpackage.w6j0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u000eR(\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/sporty/android/common_ui/widgets/IconTextSelectorButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "iconResId", "setIconResId", "(I)V", "Landroidx/appcompat/widget/AppCompatImageView;", "getIconImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "iconImageView", "value", "isLoading", "()Z", "setLoading", "", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class IconTextSelectorButton extends ConstraintLayout {
    public final w6j0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconTextSelectorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.widget_icon_text_selector_button, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.icon_end_image_view;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.icon_end_image_view, viewInflate);
        if (appCompatImageView != null) {
            i2 = R.id.icon_start_image_view;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.icon_start_image_view, viewInflate);
            if (appCompatImageView2 != null) {
                i2 = R.id.progress_bar;
                ProgressBar progressBar = (ProgressBar) h5e.a(R.id.progress_bar, viewInflate);
                if (progressBar != null) {
                    i2 = R.id.switch_text_view;
                    TextView textView = (TextView) h5e.a(R.id.switch_text_view, viewInflate);
                    if (textView != null) {
                        i2 = R.id.text_view;
                        TextView textView2 = (TextView) h5e.a(R.id.text_view, viewInflate);
                        if (textView2 != null) {
                            this.F = new w6j0((ConstraintLayout) viewInflate, appCompatImageView, appCompatImageView2, progressBar, textView, textView2);
                            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rk30.q, i, 0);
                            try {
                                typedArrayObtainStyledAttributes.getClass();
                                textView2.setText(sn5.a(0, context, typedArrayObtainStyledAttributes));
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
                                if (resourceId != -1) {
                                    appCompatImageView2.setImageResource(resourceId);
                                }
                                ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2);
                                if (colorStateList != null) {
                                    appCompatImageView2.setImageTintList(colorStateList);
                                }
                                return;
                            } finally {
                                typedArrayObtainStyledAttributes.recycle();
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final AppCompatImageView getIconImageView() {
        return this.F.c;
    }

    public final CharSequence getText() {
        return this.F.f.getText();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        w6j0 w6j0Var = this.F;
        w6j0Var.a.setBackgroundResource(isEnabled() ? R.drawable.bg_icon_text_selector_button_enabled : R.drawable.bg_icon_text_selector_button_disabled);
        w6j0Var.f.setTextColor(getContext().getColor(isEnabled() ? R.color.text_type1_primary : R.color.text_type1_secondary));
        w6j0Var.e.setVisibility(isEnabled() ? 0 : 4);
        w6j0Var.b.setVisibility(isEnabled() ? 0 : 4);
    }

    public final void setIconResId(int iconResId) {
        this.F.c.setImageResource(iconResId);
    }

    public final void setLoading(boolean z) {
        this.F.d.setVisibility(z ? 0 : 8);
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = this.F.f;
        if (charSequence == null) {
            charSequence = "";
        }
        textView.setText(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconTextSelectorButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconTextSelectorButton(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ IconTextSelectorButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
