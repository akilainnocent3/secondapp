package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.sk30;
import defpackage.xhd0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sporty/android/common_ui/widgets/InsureCheckBoxView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setInsureEnabled", "(Z)V", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InsureCheckBoxView extends ConstraintLayout {
    public final xhd0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsureCheckBoxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.spr_insure_checkbox_view, this);
        int i2 = R.id.insure_checkbox;
        CheckBox checkBox = (CheckBox) h5e.a(R.id.insure_checkbox, this);
        if (checkBox != null) {
            i2 = R.id.insure_overlay;
            View viewA = h5e.a(R.id.insure_overlay, this);
            if (viewA != null) {
                i2 = R.id.insure_text;
                TextView textView = (TextView) h5e.a(R.id.insure_text, this);
                if (textView != null) {
                    this.F = new xhd0(this, checkBox, viewA, textView);
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sk30.b, i, 0);
                    Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
                    String string = typedArrayObtainStyledAttributes.getString(1);
                    boolean z = typedArrayObtainStyledAttributes.getBoolean(2, false);
                    textView.setText(string);
                    if (z) {
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, context.getDrawable(R.drawable.ic_arrow_down_1), (Drawable) null);
                    } else {
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setInsureEnabled(boolean enabled) {
        xhd0 xhd0Var = this.F;
        xhd0Var.b.setEnabled(enabled);
        xhd0Var.d.setEnabled(enabled);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsureCheckBoxView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsureCheckBoxView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ InsureCheckBoxView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
