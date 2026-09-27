package yads;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zj3 implements yj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj3 f158881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f158882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f158883c;

    public zj3(uy uyVar) {
        this.f158881a = uyVar;
    }

    @Override // yads.yj3
    public final void a(View view, List list) {
        this.f158881a.a(view, list);
        this.f158882b = false;
        this.f158883c = false;
    }

    @Override // yads.yj3
    public final void b() {
        this.f158881a.b();
        k();
    }

    @Override // yads.yj3
    public final void c() {
        this.f158881a.c();
    }

    @Override // yads.yj3
    public final void d() {
        this.f158881a.d();
    }

    @Override // yads.yj3
    public final void e() {
        this.f158881a.e();
        k();
    }

    @Override // yads.yj3
    public final void f() {
        this.f158881a.f();
    }

    @Override // yads.yj3
    public final void g() {
        this.f158881a.g();
        k();
    }

    @Override // yads.yj3
    public final void h() {
        if (this.f158882b) {
            return;
        }
        this.f158882b = true;
        this.f158881a.h();
    }

    @Override // yads.yj3
    public final void i() {
        this.f158881a.i();
    }

    @Override // yads.yj3
    public final void j() {
        this.f158881a.j();
    }

    @Override // yads.yj3
    public final void k() {
        this.f158881a.k();
        this.f158882b = false;
        this.f158883c = false;
    }

    @Override // yads.yj3
    public final void l() {
        this.f158881a.l();
    }

    @Override // yads.yj3
    public final void m() {
        this.f158881a.m();
        h();
        n();
    }

    @Override // yads.yj3
    public final void n() {
        if (this.f158883c) {
            return;
        }
        this.f158883c = true;
        this.f158881a.n();
    }

    @Override // yads.yj3
    public final void a(String str) {
        this.f158881a.a(str);
        h();
        n();
    }

    @Override // yads.yj3
    public final void a(jf3 jf3Var) {
        this.f158881a.a(jf3Var);
        k();
    }

    @Override // yads.yj3
    public final void a(xj3 xj3Var) {
        this.f158881a.a(xj3Var);
    }

    @Override // yads.yj3
    public final void a(float f10, long j10) {
        this.f158881a.a(f10, j10);
    }

    @Override // yads.yj3
    public final void a() {
        this.f158881a.a();
    }

    @Override // yads.yj3
    public final void a(float f10) {
        this.f158881a.a(f10);
    }
}
