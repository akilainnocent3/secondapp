package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class an implements zpc {
    public final zpc a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public an(zpc zpcVar, byte[] bArr, byte[] bArr2) {
        this.a = zpcVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.zpc
    public final long a(gqc gqcVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                eqc eqcVar = new eqc(this.a, gqcVar);
                this.d = new CipherInputStream(eqcVar, cipher);
                if (eqcVar.d) {
                    return -1L;
                }
                eqcVar.a.a(eqcVar.b);
                eqcVar.d = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                gqm.a(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            gqm.a(e2);
            return 0L;
        }
    }

    @Override // defpackage.zpc
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // defpackage.zpc
    public final Map<String, List<String>> d() {
        return this.a.d();
    }

    @Override // defpackage.zpc
    public final void g(mrg0 mrg0Var) {
        mrg0Var.getClass();
        this.a.g(mrg0Var);
    }

    @Override // defpackage.zpc
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.tpc
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
