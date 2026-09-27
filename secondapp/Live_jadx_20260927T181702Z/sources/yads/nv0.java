package yads;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nv0 implements a03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz2 f153211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn f153212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f153213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f153214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f153215e;

    public nv0(int i10, int i11, zz2 zz2Var, fn fnVar) {
        this.f153211a = zz2Var;
        this.f153212b = fnVar;
        this.f153213c = (i10 >= 0 || -1 == i10) ? i10 : 0;
        this.f153214d = (i11 >= 0 || -2 == i11) ? i11 : 0;
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        String str = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, 2));
        kotlin.jvm.internal.m0.o(str, "format(...)");
        this.f153215e = str;
    }

    @Override // yads.a03
    public final int a(Context context) {
        int i10 = this.f153214d;
        return -2 == i10 ? kl3.b(context) : i10;
    }

    @Override // yads.a03
    public final int b(Context context) {
        int i10 = this.f153214d;
        return -2 == i10 ? kl3.c(context) : kl3.a(context, i10);
    }

    @Override // yads.a03
    public final int c(Context context) {
        int i10 = this.f153213c;
        return -1 == i10 ? kl3.d(context) : i10;
    }

    @Override // yads.a03
    public final int d(Context context) {
        int i10 = this.f153213c;
        if (-1 != i10) {
            return kl3.a(context, i10);
        }
        wl3 wl3Var = kl3.f151600a;
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kotlin.jvm.internal.m0.g(nv0.class, obj.getClass())) {
            nv0 nv0Var = (nv0) obj;
            if (this.f153213c == nv0Var.f153213c && this.f153214d == nv0Var.f153214d && this.f153211a == nv0Var.f153211a) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.a03
    public final int getHeight() {
        return this.f153214d;
    }

    @Override // yads.a03
    public final int getWidth() {
        return this.f153213c;
    }

    public final int hashCode() {
        return this.f153211a.hashCode() + k4.a(this.f153215e, ((this.f153213c * 31) + this.f153214d) * 31, 31);
    }

    public final String toString() {
        return this.f153215e;
    }

    @Override // yads.a03
    public final fn a() {
        return this.f153212b;
    }

    @Override // yads.a03
    public final zz2 b() {
        return this.f153211a;
    }
}
