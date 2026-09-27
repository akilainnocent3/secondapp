package t6;

import u4.i1;
import u4.j1;
import u4.k1;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public abstract class i implements k1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136156a;

    public i(String str) {
        this.f136156a = str;
    }

    @Override // u4.k1.a
    public /* synthetic */ byte[] G() {
        return j1.a(this);
    }

    @Override // u4.k1.a
    public /* synthetic */ androidx.media3.common.a H() {
        return j1.b(this);
    }

    @Override // u4.k1.a
    public /* synthetic */ void a(i1.b bVar) {
        j1.c(this, bVar);
    }

    public String toString() {
        return this.f136156a;
    }
}
