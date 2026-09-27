package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class p extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public ViewGroup f19627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19628c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(21)
    public static class a {
        @k.t
        public static float a(View view) {
            return view.getZ();
        }
    }

    public p(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f19627b = viewGroup;
        viewGroup.setTag(a0.a.f19386b, this);
        this.f19627b.getOverlay().add(this);
        this.f19628c = true;
    }

    public static p b(@NonNull ViewGroup viewGroup) {
        return (p) viewGroup.getTag(a0.a.f19386b);
    }

    public static void d(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    public static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (a.a(view) != a.a(view2)) {
            return a.a(view) > a.a(view2);
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(c1.a(viewGroup, i10));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                return true;
            }
        }
        return true;
    }

    public static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i10 = 1; i10 < iMin; i10++) {
            View view = arrayList.get(i10);
            View view2 = arrayList2.get(i10);
            if (view != view2) {
                return e(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    public void a(r rVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(rVar.f19656d, arrayList);
        int iC = c(arrayList);
        if (iC < 0 || iC >= getChildCount()) {
            addView(rVar);
        } else {
            addView(rVar, iC);
        }
    }

    public final int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i10 = 0;
        while (i10 <= childCount) {
            int i11 = (i10 + childCount) / 2;
            d(((r) getChildAt(i11)).f19656d, arrayList2);
            if (f(arrayList, arrayList2)) {
                i10 = i11 + 1;
            } else {
                childCount = i11 - 1;
            }
            arrayList2.clear();
        }
        return i10;
    }

    public void g() {
        if (!this.f19628c) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        this.f19627b.getOverlay().remove(this);
        this.f19627b.getOverlay().add(this);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f19628c) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f19627b.setTag(a0.a.f19386b, null);
            this.f19627b.getOverlay().remove(this);
            this.f19628c = false;
        }
    }
}
