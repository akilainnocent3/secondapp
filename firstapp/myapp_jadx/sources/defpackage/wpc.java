package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class wpc extends qz1 {
    public gqc e;
    public byte[] f;
    public int g;
    public int h;

    @Override // defpackage.zpc
    public final long a(gqc gqcVar) throws dqc, ssz {
        byte[] bArrDecode;
        p(gqcVar);
        this.e = gqcVar;
        Uri uri = gqcVar.a;
        long j = gqcVar.g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        ly0.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = jrh0.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ssz(ffe0.a(uriNormalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                bArrDecode = Base64.decode(str2, 0);
                this.f = bArrDecode;
            } catch (IllegalArgumentException e) {
                throw new ssz(inm.a("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            bArrDecode = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            this.f = bArrDecode;
        }
        long j2 = gqcVar.f;
        if (j2 > bArrDecode.length) {
            this.f = null;
            throw new dqc(2008);
        }
        int i = (int) j2;
        this.g = i;
        int length = bArrDecode.length - i;
        this.h = length;
        if (j != -1) {
            this.h = (int) Math.min(length, j);
        }
        q(gqcVar);
        return j != -1 ? j : this.h;
    }

    @Override // defpackage.zpc
    public final void close() {
        if (this.f != null) {
            this.f = null;
            o();
        }
        this.e = null;
    }

    @Override // defpackage.zpc
    public final Uri getUri() {
        gqc gqcVar = this.e;
        if (gqcVar != null) {
            return gqcVar.a;
        }
        return null;
    }

    @Override // defpackage.tpc
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = jrh0.a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        n(iMin);
        return iMin;
    }
}
