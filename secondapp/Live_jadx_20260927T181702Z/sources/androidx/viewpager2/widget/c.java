package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements ViewPager2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ViewPager2.m> f19849a = new ArrayList();

    public void a(@NonNull ViewPager2.m mVar) {
        this.f19849a.add(mVar);
    }

    public void b(@NonNull ViewPager2.m mVar) {
        this.f19849a.remove(mVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.m
    public void transformPage(@NonNull View view, float f10) {
        Iterator<ViewPager2.m> it = this.f19849a.iterator();
        while (it.hasNext()) {
            it.next().transformPage(view, f10);
        }
    }
}
