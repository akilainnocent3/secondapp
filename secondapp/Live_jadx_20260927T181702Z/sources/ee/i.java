package ee;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ae.e f80801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f80802b;

    public i(@NonNull ae.e eVar, @NonNull byte[] bArr) {
        if (eVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f80801a = eVar;
        this.f80802b = bArr;
    }

    public byte[] a() {
        return this.f80802b;
    }

    public ae.e b() {
        return this.f80801a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f80801a.equals(iVar.f80801a)) {
            return Arrays.equals(this.f80802b, iVar.f80802b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f80801a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f80802b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f80801a + ", bytes=[...]}";
    }
}
