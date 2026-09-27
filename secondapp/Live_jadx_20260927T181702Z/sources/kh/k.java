package kh;

import android.view.View;
import f2.z1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f102398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f102399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f102401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f102402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f102403f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f102404g = true;

    public k(View view) {
        this.f102398a = view;
    }

    public void a() {
        View view = this.f102398a;
        z1.i1(view, this.f102401d - (view.getTop() - this.f102399b));
        View view2 = this.f102398a;
        z1.h1(view2, this.f102402e - (view2.getLeft() - this.f102400c));
    }

    public int b() {
        return this.f102400c;
    }

    public int c() {
        return this.f102399b;
    }

    public int d() {
        return this.f102402e;
    }

    public int e() {
        return this.f102401d;
    }

    public boolean f() {
        return this.f102404g;
    }

    public boolean g() {
        return this.f102403f;
    }

    public void h() {
        this.f102399b = this.f102398a.getTop();
        this.f102400c = this.f102398a.getLeft();
    }

    public void i(boolean z10) {
        this.f102404g = z10;
    }

    public boolean j(int i10) {
        if (!this.f102404g || this.f102402e == i10) {
            return false;
        }
        this.f102402e = i10;
        a();
        return true;
    }

    public boolean k(int i10) {
        if (!this.f102403f || this.f102401d == i10) {
            return false;
        }
        this.f102401d = i10;
        a();
        return true;
    }

    public void l(boolean z10) {
        this.f102403f = z10;
    }
}
