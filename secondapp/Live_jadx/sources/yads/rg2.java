package yads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rg2 extends SSLSocketFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f154956b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f154957a;

    public rg2(SSLSocketFactory sSLSocketFactory) {
        this.f154957a = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) throws IOException {
        Socket socketCreateSocket = this.f154957a.createSocket(str, i10);
        String[] strArrA = qg2.a(this.f154957a);
        kotlin.jvm.internal.m0.n(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return qg2.a(this.f154957a);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return qg2.b(this.f154957a);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        Socket socketCreateSocket = this.f154957a.createSocket(str, i10, inetAddress, i11);
        String[] strArrA = qg2.a(this.f154957a);
        kotlin.jvm.internal.m0.n(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        Socket socketCreateSocket = this.f154957a.createSocket(inetAddress, i10);
        String[] strArrA = qg2.a(this.f154957a);
        kotlin.jvm.internal.m0.n(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        Socket socketCreateSocket = this.f154957a.createSocket(inetAddress, i10, inetAddress2, i11);
        String[] strArrA = qg2.a(this.f154957a);
        kotlin.jvm.internal.m0.n(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket socketCreateSocket = this.f154957a.createSocket(socket, str, i10, z10);
        String[] strArrA = qg2.a(this.f154957a);
        kotlin.jvm.internal.m0.n(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) socketCreateSocket).setEnabledCipherSuites(strArrA);
        return socketCreateSocket;
    }
}
