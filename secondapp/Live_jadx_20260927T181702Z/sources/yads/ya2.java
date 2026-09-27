package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ya2 implements a03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f158211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a03 f158212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a03 f158213c;

    public ya2(Context context, nv0 nv0Var, nv0 nv0Var2) {
        this.f158211a = context;
        this.f158212b = nv0Var;
        this.f158213c = nv0Var2;
    }

    @Override // yads.a03
    public final int a(Context context) {
        return uz.b(context) == ta2.f155796c ? this.f158213c.a(context) : this.f158212b.a(context);
    }

    @Override // yads.a03
    public final int b(Context context) {
        return uz.b(context) == ta2.f155796c ? this.f158213c.b(context) : this.f158212b.b(context);
    }

    @Override // yads.a03
    public final int c(Context context) {
        return uz.b(context) == ta2.f155796c ? this.f158213c.c(context) : this.f158212b.c(context);
    }

    @Override // yads.a03
    public final int d(Context context) {
        return uz.b(context) == ta2.f155796c ? this.f158213c.d(context) : this.f158212b.d(context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya2)) {
            return false;
        }
        ya2 ya2Var = (ya2) obj;
        return kotlin.jvm.internal.m0.g(this.f158211a, ya2Var.f158211a) && kotlin.jvm.internal.m0.g(this.f158212b, ya2Var.f158212b) && kotlin.jvm.internal.m0.g(this.f158213c, ya2Var.f158213c);
    }

    @Override // yads.a03
    public final int getHeight() {
        return uz.b(this.f158211a) == ta2.f155796c ? this.f158213c.getHeight() : this.f158212b.getHeight();
    }

    @Override // yads.a03
    public final int getWidth() {
        return uz.b(this.f158211a) == ta2.f155796c ? this.f158213c.getWidth() : this.f158212b.getWidth();
    }

    public final int hashCode() {
        return this.f158213c.hashCode() + ((this.f158212b.hashCode() + (this.f158211a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return uz.b(this.f158211a) == ta2.f155796c ? this.f158213c.toString() : this.f158212b.toString();
    }

    @Override // yads.a03
    public final fn a() {
        if (uz.b(this.f158211a) == ta2.f155796c) {
            return this.f158213c.a();
        }
        return this.f158212b.a();
    }

    @Override // yads.a03
    public final zz2 b() {
        if (uz.b(this.f158211a) == ta2.f155796c) {
            return this.f158213c.b();
        }
        return this.f158212b.b();
    }
}
