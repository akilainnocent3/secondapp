package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<j> f69658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69659b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f69661d;

    public b(List<j> list) {
        this.f69658a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i10 = this.f69659b; i10 < this.f69658a.size(); i10++) {
            if (this.f69658a.get(i10).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public j a(SSLSocket sSLSocket) throws IOException {
        j jVar;
        int i10 = this.f69659b;
        int size = this.f69658a.size();
        while (true) {
            if (i10 >= size) {
                jVar = null;
                break;
            }
            jVar = this.f69658a.get(i10);
            if (jVar.a(sSLSocket)) {
                this.f69659b = i10 + 1;
                break;
            }
            i10++;
        }
        if (jVar != null) {
            this.f69660c = b(sSLSocket);
            com.mbridge.msdk.thrid.okhttp.internal.a.f69620a.a(jVar, sSLSocket, this.f69661d);
            return jVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f69661d + ", modes=" + this.f69658a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean a(IOException iOException) {
        this.f69661d = true;
        if (!this.f69660c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z10 = iOException instanceof SSLHandshakeException;
        if ((z10 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z10 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
