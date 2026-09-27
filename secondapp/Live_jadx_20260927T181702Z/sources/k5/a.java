package k5;

import a5.x1;
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
/* JADX INFO: loaded from: classes.dex */
public class a implements a5.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5.r f101789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f101790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f101791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public CipherInputStream f101792d;

    public a(a5.r rVar, byte[] bArr, byte[] bArr2) {
        this.f101789a = rVar;
        this.f101790b = bArr;
        this.f101791c = bArr2;
    }

    public Cipher a() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // a5.r
    public final void addTransferListener(x1 x1Var) {
        zi.l0.E(x1Var);
        this.f101789a.addTransferListener(x1Var);
    }

    @Override // a5.r
    public void close() throws IOException {
        if (this.f101792d != null) {
            this.f101792d = null;
            this.f101789a.close();
        }
    }

    @Override // a5.r
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f101789a.getResponseHeaders();
    }

    @Override // a5.r
    @Nullable
    public final Uri getUri() {
        return this.f101789a.getUri();
    }

    @Override // a5.r
    public final long open(a5.z zVar) throws IOException {
        try {
            Cipher cipherA = a();
            try {
                cipherA.init(2, new SecretKeySpec(this.f101790b, to.c.asp), new IvParameterSpec(this.f101791c));
                a5.x xVar = new a5.x(this.f101789a, zVar);
                this.f101792d = new CipherInputStream(xVar, cipherA);
                xVar.k();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // u4.c0
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        zi.l0.E(this.f101792d);
        int i12 = this.f101792d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}
