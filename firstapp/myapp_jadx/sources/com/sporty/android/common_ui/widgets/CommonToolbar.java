package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.ohd0;
import defpackage.rk30;
import defpackage.sn5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/common_ui/widgets/CommonToolbar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "", "setTitle", "(Ljava/lang/String;)V", "", "visible", "setTitleVisible", "(Z)V", "setBackVisible", "setHomeVisible", "setCloseVisible", "Landroid/view/View$OnClickListener;", "listener", "setOnBackClickListener", "(Landroid/view/View$OnClickListener;)V", "setOnHomeClickListener", "setOnCloseClickListener", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CommonToolbar extends ConstraintLayout {
    public final ohd0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_common_tool_bar, (ViewGroup) null, false);
        int i2 = R.id.back;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) h5e.a(R.id.back, viewInflate);
        if (appCompatImageButton != null) {
            i2 = R.id.barrier;
            if (((Barrier) h5e.a(R.id.barrier, viewInflate)) != null) {
                i2 = R.id.close;
                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.close, viewInflate);
                if (appCompatImageView != null) {
                    i2 = R.id.home;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.home, viewInflate);
                    if (appCompatImageView2 != null) {
                        i2 = R.id.title;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.title, viewInflate);
                        if (appCompatTextView != null) {
                            this.F = new ohd0((ConstraintLayout) viewInflate, appCompatImageButton, appCompatImageView, appCompatImageView2, appCompatTextView);
                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.l, 0, 0);
                            try {
                                typedArrayObtainStyledAttributes.getClass();
                                String strA = sn5.a(4, context, typedArrayObtainStyledAttributes);
                                strA = strA == null ? "" : strA;
                                boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
                                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
                                boolean z3 = typedArrayObtainStyledAttributes.getBoolean(2, false);
                                boolean z4 = typedArrayObtainStyledAttributes.getBoolean(1, false);
                                setTitle(strA);
                                setTitleVisible(z);
                                setBackVisible(z2);
                                setHomeVisible(z3);
                                setCloseVisible(z4);
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

    public final void setBackVisible(boolean visible) {
        this.F.b.setVisibility(visible ? 0 : 8);
    }

    public final void setCloseVisible(boolean visible) {
        this.F.c.setVisibility(visible ? 0 : 8);
    }

    public final void setHomeVisible(boolean visible) {
        this.F.d.setVisibility(visible ? 0 : 8);
    }

    public final void setOnBackClickListener(View.OnClickListener listener) {
        listener.getClass();
        this.F.b.setOnClickListener(listener);
    }

    public final void setOnCloseClickListener(View.OnClickListener listener) {
        listener.getClass();
        this.F.c.setOnClickListener(listener);
    }

    public final void setOnHomeClickListener(View.OnClickListener listener) {
        listener.getClass();
        this.F.d.setOnClickListener(listener);
    }

    public final void setTitle(String title) {
        title.getClass();
        this.F.e.setText(title);
    }

    public final void setTitleVisible(boolean visible) {
        this.F.e.setVisibility(visible ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonToolbar(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ CommonToolbar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
