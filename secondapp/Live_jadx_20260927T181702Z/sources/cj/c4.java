package cj;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public final class c4 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23445b;

    public c4(int value) {
        this.f23445b = value;
    }

    public void a(int delta) {
        this.f23445b += delta;
    }

    public int b(int delta) {
        int i10 = this.f23445b + delta;
        this.f23445b = i10;
        return i10;
    }

    public int d() {
        return this.f23445b;
    }

    public int e(int newValue) {
        int i10 = this.f23445b;
        this.f23445b = newValue;
        return i10;
    }

    public boolean equals(@zq.a Object obj) {
        return (obj instanceof c4) && ((c4) obj).f23445b == this.f23445b;
    }

    public void f(int newValue) {
        this.f23445b = newValue;
    }

    public int hashCode() {
        return this.f23445b;
    }

    public String toString() {
        return Integer.toString(this.f23445b);
    }
}
