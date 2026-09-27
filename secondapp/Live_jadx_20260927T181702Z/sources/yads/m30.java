package yads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class m30 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u30 f152289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f152290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f152291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f152292h;

    public m30() {
        super(false);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws ob2, q30 {
        e();
        this.f152289e = u30Var;
        Uri uri = u30Var.f156234a;
        String scheme = uri.getScheme();
        ni.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = ib3.f150516a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ob2("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(ac.e.f4694c)) {
            try {
                this.f152290f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new ob2("Error while parsing Base64 encoded string: " + str, e10, true, 0);
            }
        } else {
            this.f152290f = ib3.c(URLDecoder.decode(str, bu.f147342a.name()));
        }
        long j10 = u30Var.f156239f;
        byte[] bArr = this.f152290f;
        if (j10 > bArr.length) {
            this.f152290f = null;
            throw new q30(2008);
        }
        int i11 = (int) j10;
        this.f152291g = i11;
        int length = bArr.length - i11;
        this.f152292h = length;
        long j11 = u30Var.f156240g;
        if (j11 != -1) {
            this.f152292h = (int) Math.min(length, j11);
        }
        b(u30Var);
        long j12 = u30Var.f156240g;
        return j12 != -1 ? j12 : this.f152292h;
    }

    @Override // yads.p30
    public final void close() {
        if (this.f152290f != null) {
            this.f152290f = null;
            d();
        }
        this.f152289e = null;
    }

    @Override // yads.p30
    public final Uri getUri() {
        u30 u30Var = this.f152289e;
        if (u30Var != null) {
            return u30Var.f156234a;
        }
        return null;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f152292h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f152290f;
        int i13 = ib3.f150516a;
        System.arraycopy(bArr2, this.f152291g, bArr, i10, iMin);
        this.f152291g += iMin;
        this.f152292h -= iMin;
        c(iMin);
        return iMin;
    }
}
