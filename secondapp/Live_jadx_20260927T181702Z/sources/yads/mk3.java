package yads;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class mk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dr.i0 f152523a = dr.k0.b(lk3.f152035b);

    public static final void a(final ViewGroup viewGroup, final boolean z10) {
        ((Handler) f152523a.getValue()).post(new Runnable() { // from class: yads.c64
            @Override // java.lang.Runnable
            public final void run() {
                mk3.b(viewGroup, z10);
            }
        });
    }

    public static final void b(ViewGroup viewGroup, boolean z10) {
        int childCount;
        if (viewGroup == null || viewGroup.getChildCount() <= 0 || (childCount = viewGroup.getChildCount() - (!z10 ? 1 : 0)) <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(childCount);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof wo) {
                arrayList.add(childAt);
            }
        }
        viewGroup.removeViews(0, childCount);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((wo) arrayList.get(i11)).c();
        }
        arrayList.clear();
    }
}
