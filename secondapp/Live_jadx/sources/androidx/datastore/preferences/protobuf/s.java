package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f10200a = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10201b = 16384;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f10202c = 0.5f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<SoftReference<byte[]>> f10203d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?> f10204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f10205f;

    static {
        Class<?> clsF = f("java.io.FileOutputStream");
        f10204e = clsF;
        f10205f = c(clsF);
    }

    public static void a() {
        f10203d.set(null);
    }

    public static byte[] b() {
        SoftReference<byte[]> softReference = f10203d.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public static long c(Class<?> clazz) {
        if (clazz == null) {
            return -1L;
        }
        try {
            if (b5.U()) {
                return b5.Z(clazz.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static byte[] d(int requestedSize) {
        int iMax = Math.max(requestedSize, 1024);
        byte[] bArrB = b();
        if (bArrB != null && !e(iMax, bArrB.length)) {
            return bArrB;
        }
        byte[] bArr = new byte[iMax];
        if (iMax <= 16384) {
            g(bArr);
        }
        return bArr;
    }

    public static boolean e(int requestedSize, int bufferLength) {
        return bufferLength < requestedSize && ((float) bufferLength) < ((float) requestedSize) * 0.5f;
    }

    public static Class<?> f(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void g(byte[] value) {
        f10203d.set(new SoftReference<>(value));
    }

    public static void h(ByteBuffer buffer, OutputStream output) throws IOException {
        int iPosition = buffer.position();
        try {
            if (buffer.hasArray()) {
                output.write(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
            } else if (!i(buffer, output)) {
                byte[] bArrD = d(buffer.remaining());
                while (buffer.hasRemaining()) {
                    int iMin = Math.min(buffer.remaining(), bArrD.length);
                    buffer.get(bArrD, 0, iMin);
                    output.write(bArrD, 0, iMin);
                }
            }
        } finally {
            a2.e(buffer, iPosition);
        }
    }

    public static boolean i(ByteBuffer buffer, OutputStream output) throws IOException {
        WritableByteChannel writableByteChannel;
        long j10 = f10205f;
        if (j10 < 0 || !f10204e.isInstance(output)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) b5.Q(output, j10);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(buffer);
        return true;
    }
}
