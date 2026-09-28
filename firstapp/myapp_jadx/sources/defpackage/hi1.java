package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hi1 extends wzg {
    public final byte[] a;
    public final byte[] b;

    public hi1(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    @Override // defpackage.wzg
    public final byte[] a() {
        return this.a;
    }

    @Override // defpackage.wzg
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wzg)) {
            return false;
        }
        wzg wzgVar = (wzg) obj;
        boolean z = wzgVar instanceof hi1;
        if (Arrays.equals(this.a, z ? ((hi1) wzgVar).a : wzgVar.a())) {
            return Arrays.equals(this.b, z ? ((hi1) wzgVar).b : wzgVar.b());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
