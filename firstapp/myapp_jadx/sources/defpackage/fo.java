package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class fo implements vm {
    public final qmn a;

    public fo(byte[] bArr) throws GeneralSecurityException {
        if (byf0.a.b.a()) {
            this.a = new qmn(bArr);
        } else {
            opp.a("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
    }

    @Override // defpackage.vm
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA = kx30.a(12);
        if (bArrA.length != 12) {
            opp.a("iv is wrong size");
            return null;
        }
        if (bArr.length > 2147483619) {
            opp.a("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecA = qmn.a(bArrA);
        qmn.a aVar = qmn.b;
        aVar.get().init(1, this.a.a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            aVar.get().updateAAD(bArr2);
        }
        int iDoFinal = aVar.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(pe4.b(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // defpackage.vm
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        if (bArrCopyOf.length != 12) {
            opp.a("iv is wrong size");
            return null;
        }
        if (bArr.length < 28) {
            opp.a("ciphertext too short");
            return null;
        }
        if (!ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
            opp.a("iv does not match prepended iv");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecA = qmn.a(bArrCopyOf);
        qmn.a aVar = qmn.b;
        aVar.get().init(2, this.a.a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            aVar.get().updateAAD(bArr2);
        }
        return aVar.get().doFinal(bArr, 12, bArr.length - 12);
    }
}
