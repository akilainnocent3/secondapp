package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public final class br20 implements uhu {
    public final yq20 a;
    public final int b;

    public br20(yq20 yq20Var, int i) throws InvalidAlgorithmParameterException {
        this.a = yq20Var;
        this.b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        yq20Var.a(i, new byte[0]);
    }

    @Override // defpackage.uhu
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (MessageDigest.isEqual(b(bArr2), bArr)) {
            return;
        }
        opp.a("invalid MAC");
    }

    @Override // defpackage.uhu
    public final byte[] b(byte[] bArr) {
        return this.a.a(this.b, bArr);
    }
}
