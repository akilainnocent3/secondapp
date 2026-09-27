package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class q51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f154273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f154274b = 0;

    public q51(int i10) {
        this.f154273a = new Object[i10 * 2];
    }

    public final xm2 a() {
        return xm2.a(this.f154274b, this.f154273a);
    }

    public final void a(int i10) {
        int i11 = i10 * 2;
        Object[] objArr = this.f154273a;
        if (i11 > objArr.length) {
            this.f154273a = Arrays.copyOf(objArr, i51.a(objArr.length, i11));
        }
    }

    public final q51 a(Object obj, Object obj2) {
        a(this.f154274b + 1);
        kx.a(obj, obj2);
        Object[] objArr = this.f154273a;
        int i10 = this.f154274b;
        int i11 = i10 * 2;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.f154274b = i10 + 1;
        return this;
    }
}
