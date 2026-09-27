package d5;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f77763f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f77764g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f77765h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f77766i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f77767j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f77768k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f77769l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f77770m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f77771n = 16;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f77772o = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f77773p = 64;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f77774q = 128;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f77775r = 256;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f77776s = 512;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f77777t = 1024;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f77778u = 2048;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f77779v = 4096;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f77780w = 8192;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f77781x = 16384;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f77782y = 32768;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f77783z = 65536;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.a f77785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.a f77786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77788e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public d(String str, androidx.media3.common.a aVar, androidx.media3.common.a aVar2, int i10, int i11) {
        zi.l0.d(i10 == 0 || i11 == 0);
        zi.l0.d(true ^ TextUtils.isEmpty(str));
        this.f77784a = str;
        this.f77785b = (androidx.media3.common.a) zi.l0.E(aVar);
        this.f77786c = (androidx.media3.common.a) zi.l0.E(aVar2);
        this.f77787d = i10;
        this.f77788e = i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f77787d == dVar.f77787d && this.f77788e == dVar.f77788e && this.f77784a.equals(dVar.f77784a) && this.f77785b.equals(dVar.f77785b) && this.f77786c.equals(dVar.f77786c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f77787d) * 31) + this.f77788e) * 31) + this.f77784a.hashCode()) * 31) + this.f77785b.hashCode()) * 31) + this.f77786c.hashCode();
    }
}
