package yads;

import com.ironsource.C4241da;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class it1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f150797a;

    public it1(int i10, String str) {
        this.f150797a = i10;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            try {
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(bArr3);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                xr.c.a(byteArrayOutputStream, null);
                Cipher cipher = Cipher.getInstance(C4241da.f61560b);
                cipher.init(1, publicKey);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr.length);
                try {
                    byteArrayOutputStream2.write(ByteBuffer.allocate(4).putInt(this.f150797a).array());
                    byteArrayOutputStream2.write(cipher.doFinal(byteArray));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, to.c.asp);
                    Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    cipher2.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                    byteArrayOutputStream2.write(cipher2.doFinal(bArr));
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    xr.c.a(byteArrayOutputStream2, null);
                    return byteArray2;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        xr.c.a(byteArrayOutputStream2, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    xr.c.a(byteArrayOutputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable unused) {
            boolean z10 = ad1.f146762a;
            return null;
        }
    }
}
