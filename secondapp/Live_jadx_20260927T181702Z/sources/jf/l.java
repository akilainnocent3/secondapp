package jf;

import androidx.annotation.Nullable;
import androidx.media3.session.fe;
import eh.h0;
import eh.t0;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f100019a = "PsshAtomUtil";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f100020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f100021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f100022c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f100020a = uuid;
            this.f100021b = i10;
            this.f100022c = bArr;
        }
    }

    public static byte[] a(UUID uuid, @Nullable byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    @Nullable
    public static a d(byte[] bArr) {
        t0 t0Var = new t0(bArr);
        if (t0Var.g() < 32) {
            return null;
        }
        t0Var.Y(0);
        if (t0Var.s() != t0Var.a() + 4 || t0Var.s() != 1886614376) {
            return null;
        }
        int iC = jf.a.c(t0Var.s());
        if (iC > 1) {
            h0.n("PsshAtomUtil", "Unsupported pssh version: " + iC);
            return null;
        }
        UUID uuid = new UUID(t0Var.E(), t0Var.E());
        if (iC == 1) {
            t0Var.Z(t0Var.P() * 16);
        }
        int iP = t0Var.P();
        if (iP != t0Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iP];
        t0Var.n(bArr2, 0, iP);
        return new a(uuid, iC, bArr2);
    }

    @Nullable
    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f100020a)) {
            return aVarD.f100022c;
        }
        h0.n("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f100020a + fe.F);
        return null;
    }

    @Nullable
    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f100020a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f100021b;
    }
}
