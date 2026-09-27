package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mx implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f152712g = new wq() { // from class: yads.h64
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return mx.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f152714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f152715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f152716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f152717f;

    public mx(int i10, int i11, int i12, byte[] bArr) {
        this.f152713b = i10;
        this.f152714c = i11;
        this.f152715d = i12;
        this.f152716e = bArr;
    }

    public static mx a(Bundle bundle) {
        return new mx(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mx.class == obj.getClass()) {
            mx mxVar = (mx) obj;
            if (this.f152713b == mxVar.f152713b && this.f152714c == mxVar.f152714c && this.f152715d == mxVar.f152715d && Arrays.equals(this.f152716e, mxVar.f152716e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f152717f == 0) {
            this.f152717f = Arrays.hashCode(this.f152716e) + ((((((this.f152713b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f152714c) * 31) + this.f152715d) * 31);
        }
        return this.f152717f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f152713b);
        sb2.append(", ");
        sb2.append(this.f152714c);
        sb2.append(", ");
        sb2.append(this.f152715d);
        sb2.append(", ");
        sb2.append(this.f152716e != null);
        sb2.append(gi.j.f86771d);
        return sb2.toString();
    }
}
