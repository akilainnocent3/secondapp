package kh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class j<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f102395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f102397d;

    public j() {
        this.f102396c = 0;
        this.f102397d = 0;
    }

    public int c() {
        k kVar = this.f102395b;
        if (kVar != null) {
            return kVar.d();
        }
        return 0;
    }

    public int d() {
        k kVar = this.f102395b;
        if (kVar != null) {
            return kVar.e();
        }
        return 0;
    }

    public boolean e() {
        k kVar = this.f102395b;
        return kVar != null && kVar.f();
    }

    public boolean f() {
        k kVar = this.f102395b;
        return kVar != null && kVar.g();
    }

    public void g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        coordinatorLayout.N(v10, i10);
    }

    public void h(boolean z10) {
        k kVar = this.f102395b;
        if (kVar != null) {
            kVar.i(z10);
        }
    }

    public boolean i(int i10) {
        k kVar = this.f102395b;
        if (kVar != null) {
            return kVar.j(i10);
        }
        this.f102397d = i10;
        return false;
    }

    public boolean j(int i10) {
        k kVar = this.f102395b;
        if (kVar != null) {
            return kVar.k(i10);
        }
        this.f102396c = i10;
        return false;
    }

    public void k(boolean z10) {
        k kVar = this.f102395b;
        if (kVar != null) {
            kVar.l(z10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        g(coordinatorLayout, v10, i10);
        if (this.f102395b == null) {
            this.f102395b = new k(v10);
        }
        this.f102395b.h();
        this.f102395b.a();
        int i11 = this.f102396c;
        if (i11 != 0) {
            this.f102395b.k(i11);
            this.f102396c = 0;
        }
        int i12 = this.f102397d;
        if (i12 == 0) {
            return true;
        }
        this.f102395b.j(i12);
        this.f102397d = 0;
        return true;
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f102396c = 0;
        this.f102397d = 0;
    }
}
