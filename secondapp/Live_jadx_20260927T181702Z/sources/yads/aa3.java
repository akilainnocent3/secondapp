package yads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class aa3 extends eo {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f146716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f146717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f146718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f146719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatagramSocket f146720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MulticastSocket f146721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f146722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f146723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f146724m;

    public aa3(int i10) {
        super(true);
        this.f146716e = 8000;
        byte[] bArr = new byte[2000];
        this.f146717f = bArr;
        this.f146718g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws z93 {
        Uri uri = u30Var.f156234a;
        this.f146719h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f146719h.getPort();
        e();
        try {
            this.f146722k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f146722k, port);
            if (this.f146722k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f146721j = multicastSocket;
                multicastSocket.joinGroup(this.f146722k);
                this.f146720i = this.f146721j;
            } else {
                this.f146720i = new DatagramSocket(inetSocketAddress);
            }
            this.f146720i.setSoTimeout(this.f146716e);
            this.f146723l = true;
            b(u30Var);
            return -1L;
        } catch (IOException e10) {
            throw new z93(e10, 2001);
        } catch (SecurityException e11) {
            throw new z93(e11, 2006);
        }
    }

    @Override // yads.p30
    public final void close() {
        this.f146719h = null;
        MulticastSocket multicastSocket = this.f146721j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f146722k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f146721j = null;
        }
        DatagramSocket datagramSocket = this.f146720i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f146720i = null;
        }
        this.f146722k = null;
        this.f146724m = 0;
        if (this.f146723l) {
            this.f146723l = false;
            d();
        }
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f146719h;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws z93 {
        if (i11 == 0) {
            return 0;
        }
        if (this.f146724m == 0) {
            try {
                DatagramSocket datagramSocket = this.f146720i;
                datagramSocket.getClass();
                datagramSocket.receive(this.f146718g);
                int length = this.f146718g.getLength();
                this.f146724m = length;
                c(length);
            } catch (SocketTimeoutException e10) {
                throw new z93(e10, 2002);
            } catch (IOException e11) {
                throw new z93(e11, 2001);
            }
        }
        int length2 = this.f146718g.getLength();
        int i12 = this.f146724m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f146717f, length2 - i12, bArr, i10, iMin);
        this.f146724m -= iMin;
        return iMin;
    }
}
