package vb;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class n implements tb.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f140797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f140798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f140799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class<?> f140800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<?> f140801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tb.f f140802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<Class<?>, tb.m<?>> f140803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tb.i f140804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f140805k;

    public n(Object obj, tb.f fVar, int i10, int i11, Map<Class<?>, tb.m<?>> map, Class<?> cls, Class<?> cls2, tb.i iVar) {
        this.f140797c = pc.m.e(obj);
        this.f140802h = (tb.f) pc.m.f(fVar, "Signature must not be null");
        this.f140798d = i10;
        this.f140799e = i11;
        this.f140803i = (Map) pc.m.e(map);
        this.f140800f = (Class) pc.m.f(cls, "Resource class must not be null");
        this.f140801g = (Class) pc.m.f(cls2, "Transcode class must not be null");
        this.f140804j = (tb.i) pc.m.e(iVar);
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f140797c.equals(nVar.f140797c) && this.f140802h.equals(nVar.f140802h) && this.f140799e == nVar.f140799e && this.f140798d == nVar.f140798d && this.f140803i.equals(nVar.f140803i) && this.f140800f.equals(nVar.f140800f) && this.f140801g.equals(nVar.f140801g) && this.f140804j.equals(nVar.f140804j)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.f
    public int hashCode() {
        if (this.f140805k == 0) {
            int iHashCode = this.f140797c.hashCode();
            this.f140805k = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f140802h.hashCode()) * 31) + this.f140798d) * 31) + this.f140799e;
            this.f140805k = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f140803i.hashCode();
            this.f140805k = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f140800f.hashCode();
            this.f140805k = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f140801g.hashCode();
            this.f140805k = iHashCode5;
            this.f140805k = (iHashCode5 * 31) + this.f140804j.hashCode();
        }
        return this.f140805k;
    }

    public String toString() {
        return "EngineKey{model=" + this.f140797c + ", width=" + this.f140798d + ", height=" + this.f140799e + ", resourceClass=" + this.f140800f + ", transcodeClass=" + this.f140801g + ", signature=" + this.f140802h + ", hashCode=" + this.f140805k + ", transformations=" + this.f140803i + ", options=" + this.f140804j + fw.b.f85383j;
    }
}
