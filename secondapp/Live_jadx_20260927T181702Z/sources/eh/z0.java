package eh;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f81281a = "time.android.com";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f81282b = 10000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f81283c = 24;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f81284d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f81285e = 40;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f81286f = 48;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f81287g = 123;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f81288h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f81289i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f81290j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f81291k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f81292l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f81293m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f81294n = 15;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f81295o = 2208988800L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f81296p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f81297q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @k.a0("valueLock")
    public static boolean f81298r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @k.a0("valueLock")
    public static long f81299s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @k.a0("valueLock")
    public static String f81300t = "time.android.com";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(IOException iOException);

        void onInitialized();
    }

    public static void g(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    public static long h() {
        long j10;
        synchronized (f81297q) {
            try {
                j10 = f81298r ? f81299s : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    public static String i() {
        String str;
        synchronized (f81297q) {
            str = f81300t;
        }
        return str;
    }

    public static void j(@Nullable ah.v0 v0Var, @Nullable b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.onInitialized();
            }
        } else {
            if (v0Var == null) {
                v0Var = new ah.v0("SntpClient");
            }
            v0Var.l(new d(), new c(bVar), 1);
        }
    }

    public static boolean k() {
        boolean z10;
        synchronized (f81297q) {
            z10 = f81298r;
        }
        return z10;
    }

    public static long l() throws IOException {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = zi.c.E;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            p(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j10 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b10 = bArr[0];
            int i10 = bArr[1] & 255;
            long jN = n(bArr, 24);
            long jN2 = n(bArr, 32);
            long jN3 = n(bArr, 40);
            g((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i10, jN3);
            long j11 = (j10 + (((jN2 - jN) + (jN3 - j10)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j11;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long m(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    public static long n(byte[] bArr, int i10) {
        long jM = m(bArr, i10);
        long jM2 = m(bArr, i10 + 4);
        if (jM == 0 && jM2 == 0) {
            return 0L;
        }
        return ((jM - 2208988800L) * 1000) + ((jM2 * 1000) / 4294967296L);
    }

    public static void o(String str) {
        synchronized (f81297q) {
            try {
                if (!f81300t.equals(str)) {
                    f81300t = str;
                    f81298r = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void p(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + 2208988800L;
        bArr[i10] = (byte) (j13 >> 24);
        bArr[i10 + 1] = (byte) (j13 >> 16);
        bArr[i10 + 2] = (byte) (j13 >> 8);
        bArr[i10 + 3] = (byte) j13;
        long j14 = (j12 * 4294967296L) / 1000;
        bArr[i10 + 4] = (byte) (j14 >> 24);
        bArr[i10 + 5] = (byte) (j14 >> 16);
        bArr[i10 + 6] = (byte) (j14 >> 8);
        bArr[i10 + 7] = (byte) (Math.random() * 255.0d);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements ah.v0.e {
        public d() {
        }

        @Override // ah.v0.e
        public void load() throws IOException {
            synchronized (z0.f81296p) {
                synchronized (z0.f81297q) {
                    if (z0.f81298r) {
                        return;
                    }
                    long jL = z0.l();
                    synchronized (z0.f81297q) {
                        long unused = z0.f81299s = jL;
                        boolean unused2 = z0.f81298r = true;
                    }
                }
            }
        }

        @Override // ah.v0.e
        public void cancelLoad() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements ah.v0.b<ah.v0.e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final b f81301b;

        public c(@Nullable b bVar) {
            this.f81301b = bVar;
        }

        @Override // ah.v0.b
        public void K(ah.v0.e eVar, long j10, long j11) {
            if (this.f81301b != null) {
                if (z0.k()) {
                    this.f81301b.onInitialized();
                } else {
                    this.f81301b.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // ah.v0.b
        public ah.v0.c P(ah.v0.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f81301b;
            if (bVar != null) {
                bVar.a(iOException);
            }
            return ah.v0.f5387k;
        }

        @Override // ah.v0.b
        public void r(ah.v0.e eVar, long j10, long j11, boolean z10) {
        }
    }
}
