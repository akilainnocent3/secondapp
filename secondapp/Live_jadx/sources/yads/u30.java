package yads;

import android.net.Uri;
import com.ironsource.C4235d4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u30 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f156233k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f156234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f156235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f156236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f156237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f156238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f156239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f156240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f156241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f156242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f156243j;

    static {
        ho0.a("goog.exo.datasource");
    }

    public u30(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        ni.a(j10 + j11 >= 0);
        ni.a(j11 >= 0);
        ni.a(j12 > 0 || j12 == -1);
        this.f156234a = uri;
        this.f156235b = j10;
        this.f156236c = i10;
        this.f156237d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f156238e = Collections.unmodifiableMap(new HashMap(map));
        this.f156239f = j11;
        this.f156240g = j12;
        this.f156241h = str;
        this.f156242i = i11;
        this.f156243j = obj;
    }

    public final u30 a(long j10, long j11) {
        return (j10 == 0 && this.f156240g == j11) ? this : new u30(this.f156234a, this.f156235b, this.f156236c, this.f156237d, this.f156238e, this.f156239f + j10, j11, this.f156241h, this.f156242i, this.f156243j);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f156236c;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f156234a);
        sb2.append(", ");
        sb2.append(this.f156239f);
        sb2.append(", ");
        sb2.append(this.f156240g);
        sb2.append(", ");
        sb2.append(this.f156241h);
        sb2.append(", ");
        sb2.append(this.f156242i);
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }
}
