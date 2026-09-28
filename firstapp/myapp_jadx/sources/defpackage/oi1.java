package defpackage;

import javax.net.ssl.SSLContext;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes8.dex */
public final class oi1 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final gpm e;
    public final hk1 f;
    public final SSLContext g;

    public oi1(String str, long j, gpm gpmVar, hk1 hk1Var, SSLContext sSLContext) {
        if (str == null) {
            bmy.a("Null endpoint");
            throw null;
        }
        this.a = str;
        this.b = "application/x-protobuf";
        this.c = j;
        this.d = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
        this.e = gpmVar;
        this.f = hk1Var;
        this.g = sSLContext;
    }

    public final hk1 a() {
        return this.f;
    }

    public final SSLContext b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oi1)) {
            return false;
        }
        oi1 oi1Var = (oi1) obj;
        if (!this.a.equals(oi1Var.a) || !this.b.equals(oi1Var.b) || this.c != oi1Var.c || this.d != oi1Var.d || !equals(oi1Var.e)) {
            return false;
        }
        hk1 hk1Var = this.f;
        if (hk1Var == null) {
            if (oi1Var.a() != null) {
                return false;
            }
        } else if (!hk1Var.equals(oi1Var.a())) {
            return false;
        }
        SSLContext sSLContext = this.g;
        if (sSLContext == null) {
            return oi1Var.b() == null;
        }
        return sSLContext.equals(oi1Var.b());
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ 1237) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.d;
        int iHashCode2 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ hashCode()) * (-721379959);
        hk1 hk1Var = this.f;
        int iHashCode3 = (iHashCode2 ^ (hk1Var == null ? 0 : hk1Var.hashCode())) * 1000003;
        SSLContext sSLContext = this.g;
        return (iHashCode3 ^ (sSLContext != null ? sSLContext.hashCode() : 0)) * (-721379959);
    }

    public final String toString() {
        return "HttpSenderConfig{endpoint=" + this.a + ", compressor=null, exportAsJson=false, contentType=" + this.b + ", timeoutNanos=" + this.c + ", connectTimeoutNanos=" + this.d + ", headersSupplier=" + this.e + ", proxyOptions=null, retryPolicy=" + this.f + ", sslContext=" + this.g + ", trustManager=null, executorService=null}";
    }
}
