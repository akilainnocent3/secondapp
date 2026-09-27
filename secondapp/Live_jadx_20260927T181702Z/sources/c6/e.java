package c6;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import k.a0;
import x4.m1;
import z5.s;
import z5.t;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f22473a = "time.android.com";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f22474b = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f22475c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22476d = 24;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22477e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f22478f = 40;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f22479g = 48;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f22480h = 123;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f22481i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f22482j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f22483k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f22484l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f22485m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f22486n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f22487o = 15;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f22488p = 2208988800L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f22489q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f22490r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @a0("valueLock")
    public static boolean f22491s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @a0("valueLock")
    public static long f22492t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @a0("valueLock")
    public static String f22493u = "time.android.com";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @a0("valueLock")
    public static int f22494v = 1000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @a0("valueLock")
    public static long f22495w = -9223372036854775807L;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @a0("valueLock")
    public static long f22496x = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(IOException iOException);

        void onInitialized();
    }

    public static void h(byte b10, byte b11, int i10, long j10) throws IOException {
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

    public static long i() {
        long j10;
        synchronized (f22490r) {
            try {
                j10 = f22491s ? f22492t : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    public static long j() {
        long j10;
        synchronized (f22490r) {
            j10 = f22495w;
        }
        return j10;
    }

    public static String k() {
        String str;
        synchronized (f22490r) {
            str = f22493u;
        }
        return str;
    }

    public static int l() {
        int i10;
        synchronized (f22490r) {
            i10 = f22494v;
        }
        return i10;
    }

    public static void m(@Nullable s sVar, @Nullable b bVar) {
        if (n()) {
            if (bVar != null) {
                bVar.onInitialized();
            }
        } else {
            if (sVar == null) {
                sVar = new s("SntpClient");
            }
            sVar.l(new d(), new c(bVar), 1);
        }
    }

    public static boolean n() {
        boolean z10;
        synchronized (f22490r) {
            try {
                if (f22496x != -9223372036854775807L && f22495w != -9223372036854775807L) {
                    f22491s = f22491s && SystemClock.elapsedRealtime() - f22496x < f22495w;
                }
                z10 = f22491s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public static long o() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(l());
            InetAddress[] allByName = InetAddress.getAllByName(k());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i10], 123);
                bArr[0] = zi.c.E;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                u(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j10 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b10 = bArr[0];
                    int i12 = bArr[1] & 255;
                    long jQ = q(bArr, 24);
                    long jQ2 = q(bArr, 32);
                    long jQ3 = q(bArr, 40);
                    h((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i12, jQ3);
                    long j11 = (j10 + (((jQ2 - jQ) + (jQ3 - j10)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j11;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e10;
                    } else {
                        socketTimeoutException.addSuppressed(e10);
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        throw ((SocketTimeoutException) l0.E(socketTimeoutException));
                    }
                    i10++;
                    i11 = i13;
                }
            }
            throw ((SocketTimeoutException) l0.E(socketTimeoutException));
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static long p(byte[] bArr, int i10) {
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

    public static long q(byte[] bArr, int i10) {
        long jP = p(bArr, i10);
        long jP2 = p(bArr, i10 + 4);
        if (jP == 0 && jP2 == 0) {
            return 0L;
        }
        return ((jP - 2208988800L) * 1000) + ((jP2 * 1000) / 4294967296L);
    }

    public static void r(long j10) {
        synchronized (f22490r) {
            f22495w = j10;
        }
    }

    public static void s(String str) {
        synchronized (f22490r) {
            try {
                if (!f22493u.equals(str)) {
                    f22493u = str;
                    f22491s = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void t(int i10) {
        synchronized (f22490r) {
            try {
                if (f22494v != i10) {
                    f22494v = i10;
                    f22491s = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void u(byte[] bArr, int i10, long j10) {
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
    public static final class d implements s.e {
        public d() {
        }

        @Override // z5.s.e
        public void load() throws IOException {
            synchronized (e.f22489q) {
                synchronized (e.f22490r) {
                    if (e.f22491s) {
                        return;
                    }
                    long jO = e.o();
                    synchronized (e.f22490r) {
                        long unused = e.f22496x = SystemClock.elapsedRealtime();
                        long unused2 = e.f22492t = jO;
                        boolean unused3 = e.f22491s = true;
                    }
                }
            }
        }

        @Override // z5.s.e
        public void cancelLoad() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements s.b<s.e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final b f22497b;

        public c(@Nullable b bVar) {
            this.f22497b = bVar;
        }

        @Override // z5.s.b
        public /* synthetic */ void n(s.e eVar, long j10, long j11, int i10) {
            t.a(this, eVar, j10, j11, i10);
        }

        @Override // z5.s.b
        public void o(s.e eVar, long j10, long j11) {
            if (this.f22497b != null) {
                if (e.n()) {
                    this.f22497b.onInitialized();
                } else {
                    this.f22497b.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // z5.s.b
        public s.c r(s.e eVar, long j10, long j11, IOException iOException, int i10) {
            b bVar = this.f22497b;
            if (bVar != null) {
                bVar.a(iOException);
            }
            return s.f160502k;
        }

        @Override // z5.s.b
        public void q(s.e eVar, long j10, long j11, boolean z10) {
        }
    }
}
