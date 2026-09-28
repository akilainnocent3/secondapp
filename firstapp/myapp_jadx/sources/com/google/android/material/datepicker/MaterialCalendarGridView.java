package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import defpackage.c7;
import defpackage.e6;
import defpackage.frz;
import defpackage.ku5;
import defpackage.ljh;
import defpackage.r6i0;
import defpackage.rqh0;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar a;
    public final boolean b;

    public class a extends e6 {
        @Override // defpackage.e6
        public final void d(View view, c7 c7Var) {
            this.a.onInitializeAccessibilityNodeInfo(view, c7Var.a);
            c7Var.m(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = rqh0.g(null);
        if (g.n0(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.sportybet.android.gp.tz.R.id.cancel_button);
            setNextFocusRightId(com.sportybet.android.gp.tz.R.id.confirm_button);
        }
        this.b = g.n0(getContext(), com.sportybet.android.gp.tz.R.attr.nestedScrollable);
        r6i0.p(this, new a());
    }

    public final h a() {
        return (h) super.getAdapter();
    }

    public final View b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (h) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((h) super.getAdapter()).notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iB;
        int width;
        int iB2;
        int width2;
        int width3;
        int i;
        int right;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        h hVar = (h) super.getAdapter();
        DateSelector<?> dateSelector = hVar.b;
        int i2 = hVar.a.d;
        ku5 ku5Var = hVar.d;
        int iMax = Math.max(hVar.b(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(hVar.d(), materialCalendarGridView.getLastVisiblePosition());
        Long item = hVar.getItem(iMax);
        Long item2 = hVar.getItem(iMin);
        ArrayList arrayListI0 = dateSelector.I0();
        int size = arrayListI0.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListI0.get(i3);
            i3++;
            frz frzVar = (frz) obj;
            F f = frzVar.a;
            if (f == 0) {
                materialCalendarGridView = this;
            } else if (frzVar.b != 0) {
                Long l = (Long) f;
                long jLongValue = l.longValue();
                Long l2 = (Long) frzVar.b;
                long jLongValue2 = l2.longValue();
                if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    i2 = i2;
                    i3 = i3;
                    arrayListI0 = arrayListI0;
                    hVar = hVar;
                } else {
                    boolean z = materialCalendarGridView.getLayoutDirection() == 1;
                    long jLongValue3 = item.longValue();
                    Calendar calendar = materialCalendarGridView.a;
                    if (jLongValue < jLongValue3) {
                        if (iMax % i2 == 0) {
                            right = 0;
                        } else {
                            right = !z ? materialCalendarGridView.b(iMax - 1).getRight() : materialCalendarGridView.b(iMax - 1).getLeft();
                        }
                        width = right;
                        iB = iMax;
                    } else {
                        calendar.setTimeInMillis(jLongValue);
                        iB = hVar.b() + (calendar.get(5) - 1);
                        View viewB = materialCalendarGridView.b(iB);
                        width = (viewB.getWidth() / 2) + viewB.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        if ((iMin + 1) % i2 == 0) {
                            width2 = materialCalendarGridView.getWidth();
                        } else {
                            width2 = !z ? materialCalendarGridView.b(iMin).getRight() : materialCalendarGridView.b(iMin).getLeft();
                        }
                        iB2 = iMin;
                    } else {
                        calendar.setTimeInMillis(jLongValue2);
                        iB2 = hVar.b() + (calendar.get(5) - 1);
                        View viewB2 = materialCalendarGridView.b(iB2);
                        width2 = (viewB2.getWidth() / 2) + viewB2.getLeft();
                    }
                    ArrayList arrayList = arrayListI0;
                    int i4 = i2;
                    int itemId = (int) hVar.getItemId(iB);
                    int itemId2 = (int) hVar.getItemId(iB2);
                    int i5 = itemId;
                    while (i5 <= itemId2) {
                        h hVar2 = hVar;
                        int numColumns = materialCalendarGridView.getNumColumns() * i5;
                        int i6 = itemId2;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View viewB3 = materialCalendarGridView.b(numColumns);
                        int top = viewB3.getTop() + ku5Var.a.a.top;
                        int i7 = i5;
                        int bottom = viewB3.getBottom() - ku5Var.a.a.bottom;
                        if (z) {
                            int i8 = iB2 > numColumns2 ? 0 : width2;
                            width3 = numColumns > iB ? getWidth() : width;
                            i = i8;
                        } else {
                            i = numColumns > iB ? 0 : width;
                            width3 = iB2 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i, top, width3, bottom, ku5Var.h);
                        i5 = i7 + 1;
                        materialCalendarGridView = this;
                        hVar = hVar2;
                        itemId2 = i6;
                    }
                    materialCalendarGridView = this;
                    i2 = i4;
                    i3 = i3;
                    arrayListI0 = arrayList;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((h) super.getAdapter()).d());
        } else if (i == 130) {
            setSelection(((h) super.getAdapter()).b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((h) super.getAdapter()).b() && selectedItemPosition <= ((h) super.getAdapter()).d())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((h) super.getAdapter()).b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof h) {
            super.setAdapter(listAdapter);
        } else {
            ljh.a("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), h.class.getCanonicalName()});
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((h) super.getAdapter()).b()) {
            super.setSelection(((h) super.getAdapter()).b());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (h) super.getAdapter();
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
