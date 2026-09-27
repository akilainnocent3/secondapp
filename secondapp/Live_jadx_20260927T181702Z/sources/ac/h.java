package ac;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class h implements tb.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f4717j = "@#&=*+-_.,:!?()/~'%;$";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f4718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final URL f4719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f4720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f4721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public URL f4722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public volatile byte[] f4723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4724i;

    public h(URL url) {
        this(url, i.f4726b);
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f4720e;
        return str != null ? str : ((URL) pc.m.e(this.f4719d)).toString();
    }

    public final byte[] d() {
        if (this.f4723h == null) {
            this.f4723h = c().getBytes(tb.f.f136431b);
        }
        return this.f4723h;
    }

    public Map<String, String> e() {
        return this.f4718c.a();
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f4718c.equals(hVar.f4718c)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        if (TextUtils.isEmpty(this.f4721f)) {
            String string = this.f4720e;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) pc.m.e(this.f4719d)).toString();
            }
            this.f4721f = Uri.encode(string, f4717j);
        }
        return this.f4721f;
    }

    public final URL g() throws MalformedURLException {
        if (this.f4722g == null) {
            this.f4722g = new URL(f());
        }
        return this.f4722g;
    }

    public String h() {
        return f();
    }

    @Override // tb.f
    public int hashCode() {
        if (this.f4724i == 0) {
            int iHashCode = c().hashCode();
            this.f4724i = iHashCode;
            this.f4724i = (iHashCode * 31) + this.f4718c.hashCode();
        }
        return this.f4724i;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f4726b);
    }

    public h(URL url, i iVar) {
        this.f4719d = (URL) pc.m.e(url);
        this.f4720e = null;
        this.f4718c = (i) pc.m.e(iVar);
    }

    public h(String str, i iVar) {
        this.f4719d = null;
        this.f4720e = pc.m.c(str);
        this.f4718c = (i) pc.m.e(iVar);
    }
}
