package defpackage;

import com.google.protobuf.Reader;
import j$.time.Duration;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import okhttp3.ConnectionSpec;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes8.dex */
public final class lmy implements xpm {
    public final boolean a;
    public final OkHttpClient b;
    public final HttpUrl c;
    public final rna d;
    public final boolean e;
    public final Supplier<Map<String, List<String>>> f;
    public final MediaType g;

    public static class a extends RequestBody {
        public final rna a;
        public final b b;

        public a(rna rnaVar, b bVar) {
            this.a = rnaVar;
            this.b = bVar;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            return -1L;
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getD() {
            return this.b.d;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(bc5 bc5Var) throws IOException {
            bc5Var.F1();
            x740 x740Var = new x740(tmy.b(this.a.a()));
            this.b.writeTo(x740Var);
            x740Var.close();
        }
    }

    public static class b extends RequestBody {
        public final ktu a;
        public final boolean b;
        public final int c;
        public final MediaType d;

        public b(ktu ktuVar, boolean z, int i, MediaType mediaType) {
            this.a = ktuVar;
            this.b = z;
            this.c = i;
            this.d = mediaType;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            return this.c;
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getD() {
            return this.d;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(bc5 bc5Var) throws IOException {
            boolean z = this.b;
            ktu ktuVar = this.a;
            if (!z) {
                ktuVar.b(bc5Var.F1());
                return;
            }
            OutputStream outputStreamF1 = bc5Var.F1();
            ktuVar.getClass();
            nep nepVar = new nep(outputStreamF1);
            try {
                nepVar.W0(ktuVar);
                nepVar.close();
            } catch (Throwable th) {
                try {
                    nepVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public lmy(String str, rna rnaVar, boolean z, String str2, long j, long j2, Supplier supplier, hk1 hk1Var, SSLContext sSLContext, X509TrustManager x509TrustManager, ExecutorService executorService) {
        Dispatcher dispatcher;
        int iMin = (int) Math.min(Duration.ofNanos(j).toMillis(), 2147483647L);
        int iMin2 = (int) Math.min(Duration.ofNanos(j2).toMillis(), 2147483647L);
        if (executorService == null) {
            dispatcher = new Dispatcher(new ThreadPoolExecutor(0, Reader.READ_DONE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new bmc()));
            this.a = true;
        } else {
            Dispatcher dispatcher2 = new Dispatcher(executorService);
            this.a = false;
            dispatcher = dispatcher2;
        }
        OkHttpClient.Builder builderCallTimeout = new OkHttpClient.Builder().dispatcher(dispatcher).connectTimeout(Duration.ofMillis(iMin2)).callTimeout(Duration.ofMillis(iMin));
        if (hk1Var != null) {
            builderCallTimeout.addInterceptor(new eo50(hk1Var, new gmy()));
        }
        if (str.startsWith("http://")) {
            builderCallTimeout.connectionSpecs(Collections.singletonList(ConnectionSpec.CLEARTEXT));
        } else if (sSLContext != null && x509TrustManager != null) {
            builderCallTimeout.sslSocketFactory(sSLContext.getSocketFactory(), x509TrustManager);
        }
        this.b = builderCallTimeout.build();
        this.c = HttpUrl.get(str);
        this.d = rnaVar;
        this.e = z;
        this.g = MediaType.parse(str2);
        this.f = supplier;
    }
}
