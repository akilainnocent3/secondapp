package a5;

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
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class y1 extends e {
    public static final int B = 2000;
    public static final int C = 8000;
    public static final int D = -1;
    public int A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f3820t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DatagramPacket f3821u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Uri f3822v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public DatagramSocket f3823w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public MulticastSocket f3824x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public InetAddress f3825y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3826z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends w {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public y1() {
        this(2000);
    }

    public int c() {
        DatagramSocket datagramSocket = this.f3823w;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // a5.r
    public void close() {
        this.f3822v = null;
        MulticastSocket multicastSocket = this.f3824x;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) zi.l0.E(this.f3825y));
            } catch (IOException unused) {
            }
            this.f3824x = null;
        }
        DatagramSocket datagramSocket = this.f3823w;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f3823w = null;
        }
        this.f3825y = null;
        this.A = 0;
        if (this.f3826z) {
            this.f3826z = false;
            transferEnded();
        }
    }

    @Override // a5.r
    @Nullable
    public Uri getUri() {
        return this.f3822v;
    }

    @Override // a5.r
    public long open(z zVar) throws a {
        Uri uri = zVar.f3834a;
        this.f3822v = uri;
        String str = (String) zi.l0.E(uri.getHost());
        int port = this.f3822v.getPort();
        transferInitializing(zVar);
        try {
            this.f3825y = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f3825y, port);
            if (this.f3825y.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f3824x = multicastSocket;
                multicastSocket.joinGroup(this.f3825y);
                this.f3823w = this.f3824x;
            } else {
                this.f3823w = new DatagramSocket(inetSocketAddress);
            }
            this.f3823w.setSoTimeout(this.f3819s);
            this.f3826z = true;
            transferStarted(zVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // u4.c0
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.A == 0) {
            try {
                ((DatagramSocket) zi.l0.E(this.f3823w)).receive(this.f3821u);
                int length = this.f3821u.getLength();
                this.A = length;
                bytesTransferred(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f3821u.getLength();
        int i12 = this.A;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f3820t, length2 - i12, bArr, i10, iMin);
        this.A -= iMin;
        return iMin;
    }

    public y1(int i10) {
        this(i10, 8000);
    }

    public y1(int i10, int i11) {
        super(true);
        this.f3819s = i11;
        byte[] bArr = new byte[i10];
        this.f3820t = bArr;
        this.f3821u = new DatagramPacket(bArr, 0, i10);
    }
}
