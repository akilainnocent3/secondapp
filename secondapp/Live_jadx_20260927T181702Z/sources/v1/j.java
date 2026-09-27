package v1;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import e2.x;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f139858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f139859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f139860f;

    public j(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        this.f139855a = (String) x.l(str);
        this.f139856b = (String) x.l(str2);
        this.f139857c = (String) x.l(str3);
        this.f139858d = (List) x.l(list);
        this.f139859e = 0;
        this.f139860f = a(str, str2, str3);
    }

    public final String a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return str + TokenBuilder.TOKEN_DELIMITER + str2 + TokenBuilder.TOKEN_DELIMITER + str3;
    }

    @Nullable
    public List<List<byte[]>> b() {
        return this.f139858d;
    }

    @k.e
    public int c() {
        return this.f139859e;
    }

    @NonNull
    @y0({y0.a.LIBRARY})
    public String d() {
        return this.f139860f;
    }

    @Deprecated
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public String e() {
        return this.f139860f;
    }

    @NonNull
    public String f() {
        return this.f139855a;
    }

    @NonNull
    public String g() {
        return this.f139856b;
    }

    @NonNull
    public String h() {
        return this.f139857c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f139855a + ", mProviderPackage: " + this.f139856b + ", mQuery: " + this.f139857c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f139858d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f139858d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f139859e);
        return sb2.toString();
    }

    public j(@NonNull String str, @NonNull String str2, @NonNull String str3, @k.e int i10) {
        this.f139855a = (String) x.l(str);
        this.f139856b = (String) x.l(str2);
        this.f139857c = (String) x.l(str3);
        this.f139858d = null;
        x.a(i10 != 0);
        this.f139859e = i10;
        this.f139860f = a(str, str2, str3);
    }
}
