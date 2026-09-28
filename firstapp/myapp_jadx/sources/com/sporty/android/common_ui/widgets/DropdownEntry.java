package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.j7i0;
import defpackage.rk30;
import defpackage.sn5;
import defpackage.zch0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/common_ui/widgets/DropdownEntry;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "", "setText", "(Ljava/lang/CharSequence;)V", "resId", "(I)V", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DropdownEntry extends LinearLayout {
    public final j7i0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownEntry(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.view_dropdown_entry, this);
        int i2 = R.id.icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.icon, this);
        if (appCompatImageView != null) {
            i2 = R.id.textView;
            TextView textView = (TextView) h5e.a(R.id.textView, this);
            if (textView != null) {
                this.a = new j7i0(this, appCompatImageView, textView);
                setOrientation(0);
                setGravity(16);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.m, i, 0);
                typedArrayObtainStyledAttributes.getClass();
                if (!typedArrayObtainStyledAttributes.hasValue(2)) {
                    setBackgroundResource(R.drawable.dropdown_entry_bg);
                }
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
                if (resourceId != -1) {
                    textView.setTextAppearance(resourceId);
                }
                ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                String strA = sn5.a(3, context, typedArrayObtainStyledAttributes);
                if (strA != null) {
                    textView.setText(strA);
                }
                ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(5);
                if (colorStateList2 != null) {
                    appCompatImageView.setImageTintList(colorStateList2);
                }
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, zch0.b(context.getResources(), 20));
                ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
                layoutParams.width = dimensionPixelSize;
                layoutParams.height = dimensionPixelSize;
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void setText(CharSequence text) {
        text.getClass();
        this.a.b.setText(text);
    }

    public final void setText(int resId) {
        this.a.b.setText(resId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DropdownEntry(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DropdownEntry(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ DropdownEntry(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
