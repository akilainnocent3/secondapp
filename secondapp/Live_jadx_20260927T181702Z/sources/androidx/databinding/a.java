package androidx.databinding;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c0 f9478b;

    @Override // androidx.databinding.u
    public void a(@NonNull u.a aVar) {
        synchronized (this) {
            try {
                if (this.f9478b == null) {
                    this.f9478b = new c0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f9478b.a(aVar);
    }

    @Override // androidx.databinding.u
    public void c(@NonNull u.a aVar) {
        synchronized (this) {
            try {
                c0 c0Var = this.f9478b;
                if (c0Var == null) {
                    return;
                }
                c0Var.o(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g() {
        synchronized (this) {
            try {
                c0 c0Var = this.f9478b;
                if (c0Var == null) {
                    return;
                }
                c0Var.j(this, 0, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(int i10) {
        synchronized (this) {
            try {
                c0 c0Var = this.f9478b;
                if (c0Var == null) {
                    return;
                }
                c0Var.j(this, i10, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
