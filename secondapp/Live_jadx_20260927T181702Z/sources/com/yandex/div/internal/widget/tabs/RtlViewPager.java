package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.util.ViewsKt;
import java.util.HashMap;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class RtlViewPager extends ViewPager {

    @l
    private final HashMap<ViewPager.j, ReversingOnPageChangeListener> pageChangeListeners;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class ReversingOnPageChangeListener implements ViewPager.j {

        @l
        private final ViewPager.j listener;

        public ReversingOnPageChangeListener(ViewPager.j jVar) {
            this.listener = jVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
            this.listener.onPageScrollStateChanged(i10);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (ViewsKt.isLayoutRtl(RtlViewPager.this) && adapter != null) {
                int count = adapter.getCount();
                int width = ((int) (RtlViewPager.this.getWidth() * (1 - adapter.getPageWidth(i10)))) + i11;
                while (i10 < count && width > 0) {
                    i10++;
                    width -= (int) (RtlViewPager.this.getWidth() * adapter.getPageWidth(i10));
                }
                i10 = (count - i10) - 1;
                i11 = -width;
                f10 = i11 / (RtlViewPager.this.getWidth() * adapter.getPageWidth(i10));
            }
            this.listener.onPageScrolled(i10, f10, i11);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (ViewsKt.isLayoutRtl(RtlViewPager.this) && adapter != null) {
                i10 = (adapter.getCount() - i10) - 1;
            }
            this.listener.onPageSelected(i10);
        }
    }

    public RtlViewPager(@l Context context, @m AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pageChangeListeners = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(@l ViewPager.j jVar) {
        ReversingOnPageChangeListener reversingOnPageChangeListener = new ReversingOnPageChangeListener(jVar);
        this.pageChangeListeners.put(jVar, reversingOnPageChangeListener);
        super.addOnPageChangeListener(reversingOnPageChangeListener);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.pageChangeListeners.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        return (adapter == null || !ViewsKt.isLayoutRtl(this)) ? currentItem : (adapter.getCount() - currentItem) - 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(@l ViewPager.j jVar) {
        ReversingOnPageChangeListener reversingOnPageChangeListenerRemove = this.pageChangeListeners.remove(jVar);
        if (reversingOnPageChangeListenerRemove != null) {
            super.removeOnPageChangeListener(reversingOnPageChangeListenerRemove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10, boolean z10) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            i10 = (adapter.getCount() - i10) - 1;
        }
        super.setCurrentItem(i10, z10);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i10) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && ViewsKt.isLayoutRtl(this)) {
            i10 = (adapter.getCount() - i10) - 1;
        }
        super.setCurrentItem(i10);
    }
}
