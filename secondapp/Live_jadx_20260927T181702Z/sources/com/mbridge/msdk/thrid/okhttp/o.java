package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o {
    public static final o NONE = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends o {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements c {
        public b() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.o.c
        public o a(d dVar) {
            return o.this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        o a(d dVar);
    }

    public static c factory(o oVar) {
        return oVar.new b();
    }

    public void callEnd(d dVar) {
    }

    public void callStart(d dVar) {
    }

    public void requestBodyStart(d dVar) {
    }

    public void requestHeadersStart(d dVar) {
    }

    public void responseBodyStart(d dVar) {
    }

    public void responseHeadersStart(d dVar) {
    }

    public void secureConnectStart(d dVar) {
    }

    public void callFailed(d dVar, IOException iOException) {
    }

    public void connectionAcquired(d dVar, h hVar) {
    }

    public void connectionReleased(d dVar, h hVar) {
    }

    public void dnsStart(d dVar, String str) {
    }

    public void requestBodyEnd(d dVar, long j10) {
    }

    public void requestHeadersEnd(d dVar, y yVar) {
    }

    public void responseBodyEnd(d dVar, long j10) {
    }

    public void responseHeadersEnd(d dVar, a0 a0Var) {
    }

    public void secureConnectEnd(d dVar, @zq.h q qVar) {
    }

    public void connectStart(d dVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void dnsEnd(d dVar, String str, List<InetAddress> list) {
    }

    public void connectEnd(d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, @zq.h w wVar) {
    }

    public void connectFailed(d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, @zq.h w wVar, IOException iOException) {
    }
}
