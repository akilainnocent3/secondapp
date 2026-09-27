package oc;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import pc.m;
import tb.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f118998c;

    public e(@NonNull Object obj) {
        this.f118998c = m.e(obj);
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f118998c.toString().getBytes(f.f136431b));
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f118998c.equals(((e) obj).f118998c);
        }
        return false;
    }

    @Override // tb.f
    public int hashCode() {
        return this.f118998c.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f118998c + fw.b.f85383j;
    }
}
