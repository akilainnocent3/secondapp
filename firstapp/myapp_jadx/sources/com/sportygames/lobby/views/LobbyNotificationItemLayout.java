package com.sportygames.lobby.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportygames/lobby/views/LobbyNotificationItemLayout;", "Landroid/view/ViewGroup;", "", "getGap", "()I", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LobbyNotificationItemLayout extends ViewGroup {
    /* JADX WARN: Illegal instructions before constructor call */
    public LobbyNotificationItemLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        context.getClass();
        super(context, attributeSet, i, 0);
    }

    private final int getGap() {
        Context context = getContext();
        context.getClass();
        return (int) TypedValue.applyDimension(1, 6.0f, context.getResources().getDisplayMetrics());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        childAt.getClass();
        TextView textView = (TextView) childAt;
        View childAt2 = getChildAt(1);
        childAt2.getClass();
        TextView textView2 = (TextView) childAt2;
        textView.measure(0, 0);
        textView2.measure(0, 0);
        int i5 = 0;
        while (true) {
            if ((getGap() * 3) + textView2.getMeasuredWidth() + textView.getMeasuredWidth() + getPaddingLeft() <= i3 - i || i5 > 8) {
                break;
            }
            float textSize = textView.getTextSize();
            Context context = getContext();
            context.getClass();
            textView.setTextSize(0, textSize - TypedValue.applyDimension(2, 1.0f, context.getResources().getDisplayMetrics()));
            textView.measure(0, 0);
            i5++;
        }
        if (textView.getVisibility() != 8) {
            int measuredHeight = ((i4 - i2) - textView.getMeasuredHeight()) / 2;
            textView.layout(getPaddingLeft(), getPaddingTop() + measuredHeight, textView.getMeasuredWidth() + getPaddingLeft(), textView.getMeasuredHeight() + getPaddingTop() + measuredHeight);
        }
        if (textView2.getVisibility() != 8) {
            int measuredHeight2 = ((i4 - i2) - textView2.getMeasuredHeight()) / 2;
            textView2.layout(textView.getMeasuredWidth() + getPaddingLeft() + getGap(), getPaddingTop() + measuredHeight2, textView2.getMeasuredWidth() + textView.getMeasuredWidth() + getPaddingLeft() + getGap(), textView2.getMeasuredHeight() + getPaddingTop() + measuredHeight2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LobbyNotificationItemLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LobbyNotificationItemLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LobbyNotificationItemLayout(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
