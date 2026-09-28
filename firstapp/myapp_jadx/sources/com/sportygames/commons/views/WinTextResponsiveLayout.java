package com.sportygames.commons.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportygames/commons/views/WinTextResponsiveLayout;", "Landroid/view/ViewGroup;", "", "getGap", "()I", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WinTextResponsiveLayout extends ViewGroup {
    /* JADX WARN: Illegal instructions before constructor call */
    public WinTextResponsiveLayout(Context context, AttributeSet attributeSet, int i, int i2) {
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
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        childAt.getClass();
        TextView textView = (TextView) childAt;
        View childAt2 = getChildAt(1);
        childAt2.getClass();
        ImageView imageView = (ImageView) childAt2;
        View childAt3 = getChildAt(2);
        childAt3.getClass();
        TextView textView2 = (TextView) childAt3;
        textView.measure(0, 0);
        textView2.measure(0, 0);
        imageView.measure(0, 0);
        double d = 1.4d;
        int measuredHeight = (int) (((double) textView2.getMeasuredHeight()) * 1.4d);
        int i5 = (int) (((double) measuredHeight) * 0.666666d);
        int i6 = 0;
        while (true) {
            double d2 = d;
            if (getPaddingRight() + (getGap() * 3) + textView2.getMeasuredWidth() + textView.getMeasuredWidth() + getPaddingLeft() + i5 <= i3 - i || i6 > 8) {
                break;
            }
            float textSize = textView.getTextSize();
            Context context = getContext();
            context.getClass();
            textView.setTextSize(0, textSize - TypedValue.applyDimension(2, 1.0f, context.getResources().getDisplayMetrics()));
            float textSize2 = textView2.getTextSize();
            Context context2 = getContext();
            context2.getClass();
            textView2.setTextSize(0, textSize2 - TypedValue.applyDimension(2, 1.0f, context2.getResources().getDisplayMetrics()));
            textView.measure(0, 0);
            textView2.measure(0, 0);
            measuredHeight = (int) (((double) textView2.getMeasuredHeight()) * d2);
            i5 = (int) (((double) measuredHeight) * 0.666666d);
            i6++;
            d = d2;
        }
        int measuredWidth2 = textView.getMeasuredWidth();
        if (imageView.getVisibility() != 8) {
            measuredWidth = (textView2.getVisibility() != 8 ? textView2.getMeasuredWidth() + getGap() : 0) + getGap() + i5;
        }
        int paddingRight = (((i3 - getPaddingRight()) - (getPaddingLeft() + i)) - (measuredWidth2 + measuredWidth)) / 2;
        Context context3 = getContext();
        context3.getClass();
        int iApplyDimension = (int) TypedValue.applyDimension(1, 3.0f, context3.getResources().getDisplayMetrics());
        if (textView.getVisibility() != 8) {
            int measuredHeight2 = ((i4 - i2) - textView.getMeasuredHeight()) / 2;
            textView.layout(getPaddingLeft() + paddingRight, (getPaddingTop() + measuredHeight2) - iApplyDimension, textView.getMeasuredWidth() + getPaddingLeft() + paddingRight, textView.getMeasuredHeight() + ((getPaddingTop() + measuredHeight2) - iApplyDimension));
        }
        if (imageView.getVisibility() != 8) {
            int i7 = ((i4 - i2) - measuredHeight) / 2;
            imageView.layout(textView.getMeasuredWidth() + getPaddingLeft() + paddingRight + getGap(), (getPaddingTop() + i7) - iApplyDimension, textView.getMeasuredWidth() + getPaddingLeft() + paddingRight + getGap() + i5, ((getPaddingTop() + i7) - iApplyDimension) + measuredHeight);
        }
        int i8 = ((int) textView2.getPaint().getFontMetrics().descent) / 3;
        if (textView2.getVisibility() != 8) {
            int measuredHeight3 = ((i4 - i2) - textView2.getMeasuredHeight()) / 2;
            textView2.layout(textView.getMeasuredWidth() + getPaddingLeft() + paddingRight + getGap() + i5 + getGap(), ((getPaddingTop() + measuredHeight3) + i8) - iApplyDimension, textView2.getMeasuredWidth() + textView.getMeasuredWidth() + getPaddingLeft() + paddingRight + getGap() + i5 + getGap(), textView2.getMeasuredHeight() + (((getPaddingTop() + measuredHeight3) + i8) - iApplyDimension));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View childAt = getChildAt(0);
        childAt.getClass();
        TextView textView = (TextView) childAt;
        View childAt2 = getChildAt(2);
        childAt2.getClass();
        TextView textView2 = (TextView) childAt2;
        textView.measure(0, 0);
        textView2.measure(0, 0);
        setMeasuredDimension(i, (int) (Math.max(textView.getMeasuredHeight(), textView2.getMeasuredHeight()) + 1.45f));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WinTextResponsiveLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WinTextResponsiveLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WinTextResponsiveLayout(Context context) {
        this(context, null, 0, 14);
        context.getClass();
    }
}
