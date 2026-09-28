package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sporty.android.common_ui.widgets.DoubleTextViewWithSeparator;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.c6f;
import defpackage.h5e;
import defpackage.h7i0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/common_ui/widgets/DoubleTextViewWithSeparator;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setVisibleWithFadeAnimation", "()V", "Lc6f;", "value", "b", "Lc6f;", "getDoubleTextWithSeparator", "()Lc6f;", "setDoubleTextWithSeparator", "(Lc6f;)V", "doubleTextWithSeparator", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DoubleTextViewWithSeparator extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final h7i0 a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public c6f doubleTextWithSeparator;
    public final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleTextViewWithSeparator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.view_double_textview_with_separator, this);
        int i2 = R.id.firstText;
        TextView textView = (TextView) h5e.a(R.id.firstText, this);
        if (textView != null) {
            i2 = R.id.secondText;
            TextView textView2 = (TextView) h5e.a(R.id.secondText, this);
            if (textView2 != null) {
                i2 = R.id.separator;
                TextView textView3 = (TextView) h5e.a(R.id.separator, this);
                if (textView3 != null) {
                    this.a = new h7i0(this, textView, textView2, textView3);
                    this.doubleTextWithSeparator = new c6f("", "", "");
                    this.c = 300L;
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final c6f getDoubleTextWithSeparator() {
        return this.doubleTextWithSeparator;
    }

    public final void setDoubleTextWithSeparator(final c6f c6fVar) {
        c6fVar.getClass();
        if (Intrinsics.g(this.doubleTextWithSeparator, c6fVar)) {
            return;
        }
        final h7i0 h7i0Var = this.a;
        h7i0Var.d.setText(c6fVar.b);
        h7i0Var.a.post(new Runnable() { // from class: b6f
            @Override // java.lang.Runnable
            public final void run() {
                int i = DoubleTextViewWithSeparator.d;
                h7i0 h7i0Var2 = h7i0Var;
                int width = (h7i0Var2.a.getWidth() - h7i0Var2.d.getWidth()) / 2;
                TextView textView = h7i0Var2.b;
                textView.setMaxWidth(width);
                TextView textView2 = h7i0Var2.c;
                textView2.setMaxWidth(width);
                c6f c6fVar2 = c6fVar;
                textView.setText(c6fVar2.a);
                textView2.setText(c6fVar2.c);
            }
        });
        this.doubleTextWithSeparator = c6fVar;
    }

    public final void setVisibleWithFadeAnimation() {
        if (getVisibility() == 0) {
            return;
        }
        h7i0 h7i0Var = this.a;
        h7i0Var.a.setAlpha(0.0f);
        setVisibility(0);
        h7i0Var.a.animate().alpha(1.0f).setDuration(this.c).start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleTextViewWithSeparator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DoubleTextViewWithSeparator(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ DoubleTextViewWithSeparator(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
