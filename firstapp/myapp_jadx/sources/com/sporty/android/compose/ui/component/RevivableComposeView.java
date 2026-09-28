package com.sporty.android.compose.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import defpackage.o9x;
import defpackage.op8;
import defpackage.u6i0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sporty/android/compose/ui/component/RevivableComposeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lu6i0;", "getViewCompositionStrategy", "()Lu6i0;", "compose-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class RevivableComposeView extends FrameLayout {
    public static final /* synthetic */ int b = 0;
    public ComposeView a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RevivableComposeView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public abstract void a(int i, a aVar);

    public abstract u6i0 getViewCompositionStrategy();

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == null) {
            Context context = getContext();
            context.getClass();
            ComposeView composeView = new ComposeView(context, null, 6, 0);
            composeView.setViewCompositionStrategy(getViewCompositionStrategy());
            addView(composeView, -1, -1);
            composeView.setContent(new op8(1424970738, new o9x(this, composeView), true));
            this.a = composeView;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RevivableComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevivableComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    public /* synthetic */ RevivableComposeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
