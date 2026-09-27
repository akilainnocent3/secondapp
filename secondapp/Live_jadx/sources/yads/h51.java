package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class h51 extends i51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f149938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f149939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f149940c;

    public h51() {
        kx.a(4, "initialCapacity");
        this.f149938a = new Object[4];
        this.f149939b = 0;
    }

    public final void a(int i10) {
        Object[] objArr = this.f149938a;
        if (objArr.length < i10) {
            this.f149938a = Arrays.copyOf(objArr, i51.a(objArr.length, i10));
            this.f149940c = false;
        } else if (this.f149940c) {
            this.f149938a = (Object[]) objArr.clone();
            this.f149940c = false;
        }
    }
}
