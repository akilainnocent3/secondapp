package vb;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements tb.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final pc.j<Class<?>, byte[]> f140846k = new pc.j<>(50);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb.b f140847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tb.f f140848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tb.f f140849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f140850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f140851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class<?> f140852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final tb.i f140853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tb.m<?> f140854j;

    public x(wb.b bVar, tb.f fVar, tb.f fVar2, int i10, int i11, tb.m<?> mVar, Class<?> cls, tb.i iVar) {
        this.f140847c = bVar;
        this.f140848d = fVar;
        this.f140849e = fVar2;
        this.f140850f = i10;
        this.f140851g = i11;
        this.f140854j = mVar;
        this.f140852h = cls;
        this.f140853i = iVar;
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f140847c.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f140850f).putInt(this.f140851g).array();
        this.f140849e.a(messageDigest);
        this.f140848d.a(messageDigest);
        messageDigest.update(bArr);
        tb.m<?> mVar = this.f140854j;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.f140853i.a(messageDigest);
        messageDigest.update(c());
        this.f140847c.put(bArr);
    }

    public final byte[] c() {
        pc.j<Class<?>, byte[]> jVar = f140846k;
        byte[] bArrJ = jVar.j(this.f140852h);
        if (bArrJ != null) {
            return bArrJ;
        }
        byte[] bytes = this.f140852h.getName().getBytes(tb.f.f136431b);
        jVar.n(this.f140852h, bytes);
        return bytes;
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f140851g == xVar.f140851g && this.f140850f == xVar.f140850f && pc.o.e(this.f140854j, xVar.f140854j) && this.f140852h.equals(xVar.f140852h) && this.f140848d.equals(xVar.f140848d) && this.f140849e.equals(xVar.f140849e) && this.f140853i.equals(xVar.f140853i)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.f
    public int hashCode() {
        int iHashCode = (((((this.f140848d.hashCode() * 31) + this.f140849e.hashCode()) * 31) + this.f140850f) * 31) + this.f140851g;
        tb.m<?> mVar = this.f140854j;
        if (mVar != null) {
            iHashCode = (iHashCode * 31) + mVar.hashCode();
        }
        return (((iHashCode * 31) + this.f140852h.hashCode()) * 31) + this.f140853i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f140848d + ", signature=" + this.f140849e + ", width=" + this.f140850f + ", height=" + this.f140851g + ", decodedResourceClass=" + this.f140852h + ", transformation='" + this.f140854j + "', options=" + this.f140853i + fw.b.f85383j;
    }
}
