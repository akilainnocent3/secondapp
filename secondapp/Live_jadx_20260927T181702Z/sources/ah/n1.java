package ah;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class n1 extends g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f5281o = 2000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f5282p = 8000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f5283q = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f5285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DatagramPacket f5286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Uri f5287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public DatagramSocket f5288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public MulticastSocket f5289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public InetAddress f5290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5292n;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends a0 {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public n1() {
        this(2000);
    }

    @Override // ah.v
    public long a(d0 d0Var) throws a {
        Uri uri = d0Var.f5063a;
        this.f5287i = uri;
        String str = (String) eh.a.g(uri.getHost());
        int port = this.f5287i.getPort();
        k(d0Var);
        try {
            this.f5290l = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f5290l, port);
            if (this.f5290l.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f5289k = multicastSocket;
                multicastSocket.joinGroup(this.f5290l);
                this.f5288j = this.f5289k;
            } else {
                this.f5288j = new DatagramSocket(inetSocketAddress);
            }
            this.f5288j.setSoTimeout(this.f5284f);
            this.f5291m = true;
            l(d0Var);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    public int c() {
        DatagramSocket datagramSocket = this.f5288j;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // ah.v
    public void close() {
        this.f5287i = null;
        MulticastSocket multicastSocket = this.f5289k;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) eh.a.g(this.f5290l));
            } catch (IOException unused) {
            }
            this.f5289k = null;
        }
        DatagramSocket datagramSocket = this.f5288j;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f5288j = null;
        }
        this.f5290l = null;
        this.f5292n = 0;
        if (this.f5291m) {
            this.f5291m = false;
            j();
        }
    }

    @Override // ah.v
    @Nullable
    public Uri getUri() {
        return this.f5287i;
    }

    @Override // ah.r
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f5292n == 0) {
            try {
                ((DatagramSocket) eh.a.g(this.f5288j)).receive(this.f5286h);
                int length = this.f5286h.getLength();
                this.f5292n = length;
                i(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f5286h.getLength();
        int i12 = this.f5292n;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f5285g, length2 - i12, bArr, i10, iMin);
        this.f5292n -= iMin;
        return iMin;
    }

    public n1(int i10) {
        this(i10, 8000);
    }

    public n1(int i10, int i11) {
        super(true);
        this.f5284f = i11;
        byte[] bArr = new byte[i10];
        this.f5285g = bArr;
        this.f5286h = new DatagramPacket(bArr, 0, i10);
    }
}
