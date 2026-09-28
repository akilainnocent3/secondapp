package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class ar20 implements yq20 {
    public final a a;
    public final String b;
    public final SecretKeySpec c;
    public final int d;

    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        public final Mac initialValue() {
            ar20 ar20Var = ar20.this;
            try {
                o6g<d7g.e, Mac> o6gVar = o6g.c;
                Mac macA = o6gVar.a.a(ar20Var.b);
                macA.init(ar20Var.c);
                return macA;
            } catch (GeneralSecurityException e) {
                dad.a(e);
                return null;
            }
        }
    }

    public ar20(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        a aVar = new a();
        this.a = aVar;
        if (!byf0.a.b.a()) {
            opp.a("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.b = str;
        this.c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.d = 20;
                break;
            case "HMACSHA224":
                this.d = 28;
                break;
            case "HMACSHA256":
                this.d = 32;
                break;
            case "HMACSHA384":
                this.d = 48;
                break;
            case "HMACSHA512":
                this.d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        aVar.get();
    }

    @Override // defpackage.yq20
    public final byte[] a(int i, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        a aVar = this.a;
        aVar.get().update(bArr);
        return Arrays.copyOf(aVar.get().doFinal(), i);
    }
}
