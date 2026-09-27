package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e6 implements xq {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e6 f148512h = new e6(null, new d6[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d6 f148513i = new d6(0, -1, new int[0], new Uri[0], new long[0], 0, false).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final wq f148514j = new wq() { // from class: yads.wz3
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return e6.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f148515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f148516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f148517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f148518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f148519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d6[] f148520g;

    public e6(Object obj, d6[] d6VarArr, long j10, long j11, int i10) {
        this.f148515b = obj;
        this.f148517d = j10;
        this.f148518e = j11;
        this.f148516c = d6VarArr.length + i10;
        this.f148520g = d6VarArr;
        this.f148519f = i10;
    }

    public static e6 a(Bundle bundle) {
        d6[] d6VarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            d6VarArr = new d6[0];
        } else {
            d6[] d6VarArr2 = new d6[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                d6VarArr2[i10] = (d6) d6.f148077i.fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            d6VarArr = d6VarArr2;
        }
        return new e6(null, d6VarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e6.class == obj.getClass()) {
            e6 e6Var = (e6) obj;
            if (ib3.a(this.f148515b, e6Var.f148515b) && this.f148516c == e6Var.f148516c && this.f148517d == e6Var.f148517d && this.f148518e == e6Var.f148518e && this.f148519f == e6Var.f148519f && Arrays.equals(this.f148520g, e6Var.f148520g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f148516c * 31;
        Object obj = this.f148515b;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f148517d)) * 31) + ((int) this.f148518e)) * 31) + this.f148519f) * 31) + Arrays.hashCode(this.f148520g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f148515b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f148517d);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f148520g.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f148520g[i10].f148078b);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f148520g[i10].f148081e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f148520g[i10].f148081e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append(PublicSuffixDatabase.f119166e);
                }
                sb2.append(", durationUs=");
                sb2.append(this.f148520g[i10].f148082f[i11]);
                sb2.append(')');
                if (i11 < this.f148520g[i10].f148081e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f148520g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    public final d6 a(int i10) {
        int i11 = this.f148519f;
        if (i10 < i11) {
            return f148513i;
        }
        return this.f148520g[i10 - i11];
    }
}
