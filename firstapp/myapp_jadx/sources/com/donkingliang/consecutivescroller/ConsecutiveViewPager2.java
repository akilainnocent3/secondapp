package com.donkingliang.consecutivescroller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.osm;
import defpackage.yxi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ConsecutiveViewPager2 extends FrameLayout implements osm {
    public static final /* synthetic */ int d = 0;
    public ViewPager2 a;
    public RecyclerView b;
    public int c;

    public static class a implements View.OnAttachStateChangeListener {
        public WeakReference<ConsecutiveViewPager2> a;
        public View b;

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View viewE;
            WeakReference<ConsecutiveViewPager2> weakReference = this.a;
            if (weakReference.get() != null) {
                ConsecutiveViewPager2 consecutiveViewPager2 = weakReference.get();
                View view2 = this.b;
                int i = ConsecutiveViewPager2.d;
                if (view2 == null) {
                    consecutiveViewPager2.getClass();
                    return;
                }
                if (consecutiveViewPager2.getParent() instanceof ConsecutiveScrollerLayout) {
                    ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) consecutiveViewPager2.getParent();
                    int iIndexOfChild = consecutiveScrollerLayout.indexOfChild(consecutiveViewPager2);
                    if ((iIndexOfChild != consecutiveScrollerLayout.getChildCount() - 1 || consecutiveViewPager2.getHeight() >= consecutiveScrollerLayout.getHeight() || consecutiveScrollerLayout.getScrollY() < consecutiveScrollerLayout.A) && (viewE = consecutiveScrollerLayout.e()) != null) {
                        int iIndexOfChild2 = consecutiveScrollerLayout.indexOfChild(viewE);
                        if (iIndexOfChild < iIndexOfChild2) {
                            ConsecutiveScrollerLayout.z(view2);
                        } else if (iIndexOfChild > iIndexOfChild2) {
                            ConsecutiveScrollerLayout.A(view2);
                        }
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public ConsecutiveViewPager2(Context context) {
        super(context);
        a(context);
    }

    private void setAttachListener(View view) {
        if (view.getTag(-123) != null) {
            a aVar = (a) view.getTag(-123);
            if (aVar.a.get() == null) {
                view.removeOnAttachStateChangeListener(aVar);
                view.setTag(-123, null);
            }
        }
        if (view.getTag(-123) == null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if ((layoutParams instanceof ConsecutiveScrollerLayout.LayoutParams) && ((ConsecutiveScrollerLayout.LayoutParams) layoutParams).a) {
                a aVar2 = new a();
                aVar2.a = new WeakReference<>(this);
                aVar2.b = view;
                view.addOnAttachStateChangeListener(aVar2);
                view.setTag(-123, aVar2);
            }
        }
    }

    public final void a(Context context) {
        ViewPager2 viewPager2 = new ViewPager2(context);
        this.a = viewPager2;
        addView(viewPager2, -1, -1);
        this.b = (RecyclerView) this.a.getChildAt(0);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.a.y.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.a.y.canScrollVertically(i);
    }

    public RecyclerView.f getAdapter() {
        return this.a.getAdapter();
    }

    public int getAdjustHeight() {
        return this.c;
    }

    public int getCurrentItem() {
        return this.a.getCurrentItem();
    }

    @Override // defpackage.osm
    public View getCurrentScrollerView() {
        View viewF;
        int currentItem = getCurrentItem();
        RecyclerView.f adapter = this.b.getAdapter();
        RecyclerView.o layoutManager = this.b.getLayoutManager();
        if (adapter == null || layoutManager == null || currentItem < 0 || currentItem >= adapter.getItemCount()) {
            viewF = null;
        } else {
            viewF = layoutManager.F(currentItem);
            if ((this.b.getAdapter() instanceof yxi) && (viewF instanceof FrameLayout)) {
                FrameLayout frameLayout = (FrameLayout) viewF;
                if (frameLayout.getChildCount() > 0) {
                    viewF = frameLayout.getChildAt(0);
                }
            }
            if (viewF != null) {
                setAttachListener(viewF);
            }
        }
        return viewF == null ? this.b : viewF;
    }

    public int getOffscreenPageLimit() {
        return this.a.getOffscreenPageLimit();
    }

    public int getOrientation() {
        return this.a.getOrientation();
    }

    @Override // defpackage.osm
    public List<View> getScrolledViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = this.b.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = this.b.getChildAt(i);
                if ((this.b.getAdapter() instanceof yxi) && (childAt instanceof FrameLayout)) {
                    FrameLayout frameLayout = (FrameLayout) childAt;
                    if (frameLayout.getChildCount() > 0) {
                        childAt = frameLayout.getChildAt(0);
                    }
                }
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public ViewPager2 getViewPager2() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ViewParent parent = getParent();
        if (parent instanceof ConsecutiveScrollerLayout) {
            ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) parent;
            if (consecutiveScrollerLayout.indexOfChild(this) == consecutiveScrollerLayout.getChildCount() - 1 && this.c > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.getDefaultSize(0, i2) - this.c, View.MeasureSpec.getMode(i2)));
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setAdapter(RecyclerView.f fVar) {
        this.a.setAdapter(fVar);
    }

    public void setAdjustHeight(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setCurrentItem(int i) {
        this.a.setCurrentItem(i);
    }

    public void setOffscreenPageLimit(int i) {
        this.a.setOffscreenPageLimit(i);
    }

    public void setOrientation(int i) {
        this.a.setOrientation(i);
    }

    public void setCurrentItem(int i, boolean z) {
        this.a.setCurrentItem(i, z);
    }

    public ConsecutiveViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ConsecutiveViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
