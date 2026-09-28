package com.sportybet.plugin.realsports.prematch.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/widget/InterceptConsecutiveScrollerLayout;", "Lcom/donkingliang/consecutivescroller/ConsecutiveScrollerLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "w0", "Z", "getNeedIntercept", "()Z", "setNeedIntercept", "(Z)V", "needIntercept", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InterceptConsecutiveScrollerLayout extends ConsecutiveScrollerLayout {

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public boolean needIntercept;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptConsecutiveScrollerLayout(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.needIntercept) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getNeedIntercept() {
        return this.needIntercept;
    }

    public final void setNeedIntercept(boolean z) {
        this.needIntercept = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptConsecutiveScrollerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterceptConsecutiveScrollerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    public /* synthetic */ InterceptConsecutiveScrollerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
