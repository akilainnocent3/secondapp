package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes7.dex */
public class AutoNextLineLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f133458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f133459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f133460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f133461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Hashtable f133462e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f133463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f133464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f133465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f133466d;

        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    public AutoNextLineLinearLayout(Context context) {
        super(context);
        this.f133462e = new Hashtable();
    }

    private int a(int i10, int i11) {
        if (i10 <= 0) {
            return getPaddingLeft();
        }
        int i12 = i11 - 1;
        return a(i10 - 1, i12) + getChildAt(i12).getMeasuredWidth() + 30;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) this.f133462e.get(childAt);
            if (aVar != null) {
                childAt.layout(aVar.f133463a, aVar.f133464b, aVar.f133465c, aVar.f133466d);
            } else {
                Log.i("MyLayout", "error");
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int childCount = getChildCount();
        byte b10 = 0;
        this.f133458a = 0;
        this.f133459b = 0;
        this.f133460c = 5;
        this.f133461d = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            childAt.measure(0, 0);
            int measuredWidth = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight();
            i13 += measuredWidth;
            a aVar = new a(b10);
            int iA = a(i12 - i14, i12);
            this.f133458a = iA;
            this.f133459b = iA + childAt.getMeasuredWidth();
            if (i13 >= size) {
                this.f133458a = 0;
                this.f133459b = childAt.getMeasuredWidth();
                this.f133460c = i15 + measuredHeight + layoutParams.topMargin;
                i14 = i12;
                i13 = measuredWidth;
            }
            int measuredHeight2 = this.f133460c + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
            this.f133461d = measuredHeight2;
            int i16 = this.f133460c;
            aVar.f133463a = this.f133458a;
            aVar.f133464b = i16 + 3;
            aVar.f133465c = this.f133459b;
            aVar.f133466d = measuredHeight2;
            this.f133462e.put(childAt, aVar);
            i12++;
            i15 = i16;
        }
        setMeasuredDimension(size, this.f133461d);
    }

    public AutoNextLineLinearLayout(Context context, int i10, int i11) {
        super(context);
        this.f133462e = new Hashtable();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(0, 0);
    }

    public AutoNextLineLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f133462e = new Hashtable();
    }
}
