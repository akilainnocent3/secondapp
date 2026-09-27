package r7;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f124229c = "selector";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f124230d = "activeScan";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f124231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h1 f124232b;

    public z0(@NonNull h1 h1Var, boolean z10) {
        if (h1Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.f124231a = bundle;
        this.f124232b = h1Var;
        bundle.putBundle("selector", h1Var.a());
        bundle.putBoolean(f124230d, z10);
    }

    @Nullable
    public static z0 c(@Nullable Bundle bundle) {
        if (bundle != null) {
            return new z0(bundle);
        }
        return null;
    }

    @NonNull
    public Bundle a() {
        return this.f124231a;
    }

    public final void b() {
        if (this.f124232b == null) {
            h1 h1VarD = h1.d(this.f124231a.getBundle("selector"));
            this.f124232b = h1VarD;
            if (h1VarD == null) {
                this.f124232b = h1.f123799d;
            }
        }
    }

    @NonNull
    public h1 d() {
        b();
        return this.f124232b;
    }

    public boolean e() {
        return this.f124231a.getBoolean(f124230d);
    }

    public boolean equals(Object obj) {
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (d().equals(z0Var.d()) && e() == z0Var.e()) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        b();
        return this.f124232b.h();
    }

    public int hashCode() {
        return (d().hashCode() ^ (e() ? 1 : 0)) == true ? 1 : 0;
    }

    @NonNull
    public String toString() {
        return "DiscoveryRequest{ selector=" + d() + ", activeScan=" + e() + ", isValid=" + f() + " }";
    }

    public z0(Bundle bundle) {
        this.f124231a = bundle;
    }
}
