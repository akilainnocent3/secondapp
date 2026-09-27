package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import k.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends ViewPager2.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final List<ViewPager2.j> f19848d;

    public b(int i10) {
        this.f19848d = new ArrayList(i10);
    }

    public void a(ViewPager2.j jVar) {
        this.f19848d.add(jVar);
    }

    public void b(ViewPager2.j jVar) {
        this.f19848d.remove(jVar);
    }

    public final void c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageScrollStateChanged(int i10) {
        try {
            Iterator<ViewPager2.j> it = this.f19848d.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i10);
            }
        } catch (ConcurrentModificationException e10) {
            c(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageScrolled(int i10, float f10, @q0 int i11) {
        try {
            Iterator<ViewPager2.j> it = this.f19848d.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            c(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageSelected(int i10) {
        try {
            Iterator<ViewPager2.j> it = this.f19848d.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i10);
            }
        } catch (ConcurrentModificationException e10) {
            c(e10);
        }
    }
}
