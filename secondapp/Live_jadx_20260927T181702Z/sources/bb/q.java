package bb;

import com.airbnb.lottie.z0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f21126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21127c;

    public q(String str, List<c> list, boolean z10) {
        this.f21125a = str;
        this.f21126b = list;
        this.f21127c = z10;
    }

    @Override // bb.c
    public va.c a(z0 z0Var, com.airbnb.lottie.k kVar, cb.b bVar) {
        return new va.d(z0Var, bVar, this, kVar);
    }

    public List<c> b() {
        return this.f21126b;
    }

    public String c() {
        return this.f21125a;
    }

    public boolean d() {
        return this.f21127c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f21125a + "' Shapes: " + Arrays.toString(this.f21126b.toArray()) + fw.b.f85383j;
    }
}
