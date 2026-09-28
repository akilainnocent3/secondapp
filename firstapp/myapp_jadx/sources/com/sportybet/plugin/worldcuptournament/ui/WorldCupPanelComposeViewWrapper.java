package com.sportybet.plugin.worldcuptournament.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sportybet/plugin/worldcuptournament/ui/WorldCupPanelComposeViewWrapper;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WorldCupPanelComposeViewWrapper extends FrameLayout {
    public final ComposeView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorldCupPanelComposeViewWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.a = composeView;
        addView(composeView);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(View.MeasureSpec.getSize(i), getResources().getDisplayMetrics().widthPixels);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels * 2, Integer.MIN_VALUE);
        ComposeView composeView = this.a;
        composeView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(iMin, composeView.getMeasuredHeight());
    }

    public final void setContent(Function2<? super a, ? super Integer, Unit> content) {
        content.getClass();
        this.a.setContent(content);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorldCupPanelComposeViewWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorldCupPanelComposeViewWrapper(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ WorldCupPanelComposeViewWrapper(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
