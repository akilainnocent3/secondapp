package defpackage;

import j$.util.Base64;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class uuh0 implements ruh0<ByteBuffer> {
    public final byte[] a;

    public uuh0(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.ruh0
    public final String a() {
        return Base64.getEncoder().encodeToString(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uuh0) {
            return Arrays.equals(this.a, ((uuh0) obj).a);
        }
        return false;
    }

    @Override // defpackage.ruh0
    public final evh0 getType() {
        return evh0.d;
    }

    @Override // defpackage.ruh0
    public final ByteBuffer getValue() {
        return ByteBuffer.wrap(this.a).asReadOnlyBuffer();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "ValueBytes{" + a() + "}";
    }
}
