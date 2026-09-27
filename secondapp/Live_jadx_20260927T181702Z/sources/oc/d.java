package oc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import tb.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final String f118995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f118996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f118997e;

    public d(@Nullable String str, long j10, int i10) {
        this.f118995c = str == null ? "" : str;
        this.f118996d = j10;
        this.f118997e = i10;
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f118996d).putInt(this.f118997e).array());
        messageDigest.update(this.f118995c.getBytes(f.f136431b));
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f118996d == dVar.f118996d && this.f118997e == dVar.f118997e && this.f118995c.equals(dVar.f118995c);
    }

    @Override // tb.f
    public int hashCode() {
        int iHashCode = this.f118995c.hashCode() * 31;
        long j10 = this.f118996d;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f118997e;
    }
}
