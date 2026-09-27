package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
class ControlBar extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f12009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12011e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(View view, View view2);
    }

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12010d = -1;
        this.f12011e = true;
    }

    public int a() {
        if (this.f12011e) {
            return getChildCount() / 2;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (i10 != 33 && i10 != 130) {
            super.addFocusables(arrayList, i10, i11);
            return;
        }
        int i12 = this.f12010d;
        if (i12 >= 0 && i12 < getChildCount()) {
            arrayList.add(getChildAt(this.f12010d));
        } else if (getChildCount() > 0) {
            arrayList.add(getChildAt(a()));
        }
    }

    public void b(int i10) {
        this.f12008b = i10;
    }

    public void c(boolean z10) {
        this.f12011e = z10;
    }

    public void d(a aVar) {
        this.f12009c = aVar;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f12008b <= 0) {
            return;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < getChildCount() - 1) {
            View childAt = getChildAt(i12);
            i12++;
            View childAt2 = getChildAt(i12);
            int measuredWidth = this.f12008b - ((childAt.getMeasuredWidth() + childAt2.getMeasuredWidth()) / 2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            int marginStart = measuredWidth - layoutParams.getMarginStart();
            layoutParams.setMarginStart(measuredWidth);
            childAt2.setLayoutParams(layoutParams);
            i13 += marginStart;
        }
        setMeasuredDimension(getMeasuredWidth() + i13, getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (getChildCount() > 0) {
            int i11 = this.f12010d;
            if (getChildAt((i11 < 0 || i11 >= getChildCount()) ? a() : this.f12010d).requestFocus(i10, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f12010d = indexOfChild(view);
        a aVar = this.f12009c;
        if (aVar != null) {
            aVar.a(view, view2);
        }
    }

    public ControlBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12010d = -1;
        this.f12011e = true;
    }
}
