package fg;

import ah.b0;
import ah.d0;
import ah.m1;
import android.net.Uri;
import androidx.annotation.Nullable;
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

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class a implements ah.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.v f83969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f83970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f83971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public CipherInputStream f83972e;

    public a(ah.v vVar, byte[] bArr, byte[] bArr2) {
        this.f83969b = vVar;
        this.f83970c = bArr;
        this.f83971d = bArr2;
    }

    @Override // ah.v
    public final long a(d0 d0Var) throws IOException {
        try {
            Cipher cipherG = g();
            try {
                cipherG.init(2, new SecretKeySpec(this.f83970c, to.c.asp), new IvParameterSpec(this.f83971d));
                b0 b0Var = new b0(this.f83969b, d0Var);
                this.f83972e = new CipherInputStream(b0Var, cipherG);
                b0Var.k();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // ah.v
    public void close() throws IOException {
        if (this.f83972e != null) {
            this.f83972e = null;
            this.f83969b.close();
        }
    }

    @Override // ah.v
    public final void d(m1 m1Var) {
        eh.a.g(m1Var);
        this.f83969b.d(m1Var);
    }

    public Cipher g() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // ah.v
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f83969b.getResponseHeaders();
    }

    @Override // ah.v
    @Nullable
    public final Uri getUri() {
        return this.f83969b.getUri();
    }

    @Override // ah.r
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        eh.a.g(this.f83972e);
        int i12 = this.f83972e.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}
