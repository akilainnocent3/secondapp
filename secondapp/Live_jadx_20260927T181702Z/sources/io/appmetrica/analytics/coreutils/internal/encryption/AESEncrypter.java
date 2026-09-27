package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import k.h1;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f95320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f95321c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f95319a = str;
        this.f95320b = bArr;
        this.f95321c = bArr2;
    }

    @Nullable
    @SuppressLint({"TrulyRandom"})
    public byte[] decrypt(@NonNull byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @Nullable
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(@NonNull byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f95320b, c.asp);
            Cipher cipher = Cipher.getInstance(this.f95319a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f95321c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    @h1
    public String getAlgorithm() {
        return this.f95319a;
    }

    @h1
    public byte[] getIV() {
        return this.f95321c;
    }

    @h1
    public byte[] getPassword() {
        return this.f95320b;
    }

    @Nullable
    public byte[] decrypt(@NonNull byte[] bArr, int i10, int i11) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f95320b, c.asp);
            Cipher cipher = Cipher.getInstance(this.f95319a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f95321c));
            return cipher.doFinal(bArr, i10, i11);
        } catch (Throwable unused) {
            return null;
        }
    }
}
