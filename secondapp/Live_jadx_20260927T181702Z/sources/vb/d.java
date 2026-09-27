package vb;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements tb.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tb.f f140656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tb.f f140657d;

    public d(tb.f fVar, tb.f fVar2) {
        this.f140656c = fVar;
        this.f140657d = fVar2;
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        this.f140656c.a(messageDigest);
        this.f140657d.a(messageDigest);
    }

    public tb.f c() {
        return this.f140656c;
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f140656c.equals(dVar.f140656c) && this.f140657d.equals(dVar.f140657d)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.f
    public int hashCode() {
        return (this.f140656c.hashCode() * 31) + this.f140657d.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f140656c + ", signature=" + this.f140657d + fw.b.f85383j;
    }
}
