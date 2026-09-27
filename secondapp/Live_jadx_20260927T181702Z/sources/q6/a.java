package q6;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;
import k.h1;
import u4.i1;
import u4.j1;
import u4.k1;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class a implements k1.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @h1
    public static final String f121742g = "https://aomedia.org/emsg/ID3";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f121743h = "https://developer.apple.com/streaming/emsg-id3";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @h1
    public static final String f121744i = "urn:scte:scte35:2014:bin";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final androidx.media3.common.a f121745j = new androidx.media3.common.a.b().A0("application/id3").Q();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final androidx.media3.common.a f121746k = new androidx.media3.common.a.b().A0("application/x-scte35").Q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f121749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f121750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f121751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f121752f;

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f121747a = str;
        this.f121748b = str2;
        this.f121749c = j10;
        this.f121750d = j11;
        this.f121751e = bArr;
    }

    @Override // u4.k1.a
    @Nullable
    public byte[] G() {
        if (H() != null) {
            return this.f121751e;
        }
        return null;
    }

    @Override // u4.k1.a
    @Nullable
    public androidx.media3.common.a H() {
        String str = this.f121747a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f121746k;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f121745j;
            default:
                return null;
        }
    }

    @Override // u4.k1.a
    public /* synthetic */ void a(i1.b bVar) {
        j1.c(this, bVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f121749c == aVar.f121749c && this.f121750d == aVar.f121750d && Objects.equals(this.f121747a, aVar.f121747a) && Objects.equals(this.f121748b, aVar.f121748b) && Arrays.equals(this.f121751e, aVar.f121751e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f121752f == 0) {
            String str = this.f121747a;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f121748b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f121749c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f121750d;
            this.f121752f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f121751e);
        }
        return this.f121752f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f121747a + ", id=" + this.f121750d + ", durationMs=" + this.f121749c + ", value=" + this.f121748b;
    }
}
