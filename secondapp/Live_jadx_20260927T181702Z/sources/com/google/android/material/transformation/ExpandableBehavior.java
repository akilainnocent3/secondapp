package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bi.b;
import f2.z1;
import java.util.List;
import k.i;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f51965c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f51966d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f51967e = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51968b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f51969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f51970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f51971d;

        public a(View view, int i10, b bVar) {
            this.f51969b = view;
            this.f51970c = i10;
            this.f51971d = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f51969b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f51968b == this.f51970c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b bVar = this.f51971d;
                expandableBehavior.g((View) bVar, this.f51969b, bVar.b(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f51968b = 0;
    }

    @Nullable
    public static <T extends ExpandableBehavior> T f(@NonNull View view, @NonNull Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.g)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) layoutParams).f();
        if (cVarF instanceof ExpandableBehavior) {
            return cls.cast(cVarF);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }

    public final boolean d(boolean z10) {
        if (!z10) {
            return this.f51968b == 1;
        }
        int i10 = this.f51968b;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public b e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> listW = coordinatorLayout.w(view);
        int size = listW.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = listW.get(i10);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (b) view2;
            }
        }
        return null;
    }

    public abstract boolean g(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @i
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = (b) view2;
        if (!d(bVar.b())) {
            return false;
        }
        this.f51968b = bVar.b() ? 1 : 2;
        return g((View) bVar, view, bVar.b(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @i
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
        b bVarE;
        if (z1.Y0(view) || (bVarE = e(coordinatorLayout, view)) == null || !d(bVarE.b())) {
            return false;
        }
        int i11 = bVarE.b() ? 1 : 2;
        this.f51968b = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, bVarE));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51968b = 0;
    }
}
