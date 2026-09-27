package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4928b implements H8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AESEncrypter f96983a;

    public C4928b() {
        this(new C4902a(C5272oa.k().g()));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    @Override // io.appmetrica.analytics.impl.H8
    @NonNull
    public final A8 a(@NonNull Q5 q10) {
        String strEncodeToString;
        String value = q10.getValue();
        if (TextUtils.isEmpty(value)) {
            strEncodeToString = null;
        } else {
            try {
                byte[] bArrEncrypt = this.f96983a.encrypt(value.getBytes("UTF-8"));
                if (bArrEncrypt != null) {
                    strEncodeToString = Base64.encodeToString(bArrEncrypt, 0);
                } else {
                    strEncodeToString = null;
                }
            } catch (Throwable unused) {
            }
        }
        q10.setValue(strEncodeToString);
        return new A8(q10, J8.AES_VALUE_ENCRYPTION);
    }

    public C4928b(C4902a c4902a) {
        this(new AESEncrypter("AES/CBC/PKCS5Padding", c4902a.b(), c4902a.a()));
    }

    public C4928b(AESEncrypter aESEncrypter) {
        this.f96983a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.H8
    @NonNull
    public final byte[] a(@Nullable byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr != null && bArr.length > 0) {
            try {
                return this.f96983a.decrypt(Base64.decode(bArr, 0));
            } catch (Throwable unused) {
            }
        }
        return bArr2;
    }

    @NonNull
    public final J8 a() {
        return J8.AES_VALUE_ENCRYPTION;
    }
}
