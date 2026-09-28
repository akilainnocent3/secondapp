package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class cmy<T> implements su5<T> {
    public final ra50 a;
    public final Object b;
    public final Object[] c;
    public final Call.Factory d;
    public final y2b<ResponseBody, T> e;
    public volatile boolean f;
    public Call i;
    public Throwable v;
    public boolean w;

    public class a implements Callback {
        public final /* synthetic */ gv5 a;

        public a(gv5 gv5Var) {
            this.a = gv5Var;
        }

        @Override // okhttp3.Callback
        public final void onFailure(Call call, IOException iOException) {
            try {
                this.a.onFailure(cmy.this, iOException);
            } catch (Throwable th) {
                urh0.m(th);
                th.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public final void onResponse(Call call, Response response) {
            gv5 gv5Var = this.a;
            cmy cmyVar = cmy.this;
            try {
                try {
                    gv5Var.onResponse(cmyVar, cmyVar.c(response));
                } catch (Throwable th) {
                    urh0.m(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                urh0.m(th2);
                try {
                    gv5Var.onFailure(cmyVar, th2);
                } catch (Throwable th3) {
                    urh0.m(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    public static final class b extends ResponseBody {
        public final ResponseBody b;
        public final y740 c;
        public IOException d;

        public class a extends jui {
            public a(cc5 cc5Var) {
                super(cc5Var);
            }

            @Override // defpackage.jui, defpackage.zpa0
            public final long read(lb5 lb5Var, long j) throws IOException {
                try {
                    return super.read(lb5Var, j);
                } catch (IOException e) {
                    b.this.d = e;
                    throw e;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.b = responseBody;
            this.c = new y740(new a(responseBody.getD()));
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.b.close();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public final long getC() {
            return this.b.getC();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getB() {
            return this.b.getB();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public final cc5 getD() {
            return this.c;
        }
    }

    public static final class c extends ResponseBody {
        public final MediaType b;
        public final long c;

        public c(MediaType mediaType, long j) {
            this.b = mediaType;
            this.c = j;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public final long getC() {
            return this.c;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentType */
        public final MediaType getB() {
            return this.b;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: source */
        public final cc5 getD() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public cmy(ra50 ra50Var, Object obj, Object[] objArr, Call.Factory factory, y2b<ResponseBody, T> y2bVar) {
        this.a = ra50Var;
        this.b = obj;
        this.c = objArr;
        this.d = factory;
        this.e = y2bVar;
    }

    @Override // defpackage.su5
    public final void G(gv5<T> gv5Var) {
        Call call;
        Throwable th;
        Objects.requireNonNull(gv5Var, "callback == null");
        synchronized (this) {
            try {
                if (this.w) {
                    throw new IllegalStateException("Already executed.");
                }
                this.w = true;
                call = this.i;
                th = this.v;
                if (call == null && th == null) {
                    try {
                        Call callA = a();
                        this.i = callA;
                        call = callA;
                    } catch (Throwable th2) {
                        th = th2;
                        urh0.m(th);
                        this.v = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            gv5Var.onFailure(this, th);
            return;
        }
        if (this.f) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new a(gv5Var));
    }

    public final Call a() {
        HttpUrl httpUrlResolve;
        ra50 ra50Var = this.a;
        urz<?>[] urzVarArr = ra50Var.k;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (length != urzVarArr.length) {
            hb5.a(zk1.a(urzVarArr.length, ")", efe0.a(length, "Argument count (", ") doesn't match expected count (")));
            return null;
        }
        fa50 fa50Var = new fa50(ra50Var.d, ra50Var.c, ra50Var.e, ra50Var.f, ra50Var.g, ra50Var.h, ra50Var.i, ra50Var.j);
        if (ra50Var.l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            urzVarArr[i].a(fa50Var, objArr[i]);
        }
        HttpUrl.Builder builder = fa50Var.d;
        if (builder != null) {
            httpUrlResolve = builder.build();
        } else {
            String str = fa50Var.c;
            HttpUrl httpUrl = fa50Var.b;
            httpUrlResolve = httpUrl.resolve(str);
            if (httpUrlResolve == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(httpUrl);
                mrh0.a(sb, ", Relative: ", fa50Var.c);
                return null;
            }
        }
        RequestBody aVar = fa50Var.k;
        if (aVar == null) {
            FormBody.Builder builder2 = fa50Var.j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = fa50Var.i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (fa50Var.h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = fa50Var.g;
        Headers.Builder builder4 = fa50Var.f;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new fa50.a(aVar, mediaType);
            } else {
                builder4.add("Content-Type", mediaType.toString());
            }
        }
        Call callNewCall = this.d.newCall(fa50Var.e.url(httpUrlResolve).headers(builder4.build()).method(fa50Var.a, aVar).tag((Class<? super s0p>) s0p.class, new s0p(ra50Var.a, this.b, ra50Var.b, arrayList)).build());
        if (callNewCall != null) {
            return callNewCall;
        }
        bmy.a("Call.Factory returned null.");
        return null;
    }

    public final Call b() throws IOException {
        Call call = this.i;
        if (call != null) {
            return call;
        }
        Throwable th = this.v;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            Call callA = a();
            this.i = callA;
            return callA;
        } catch (IOException | Error | RuntimeException e) {
            urh0.m(e);
            this.v = e;
            throw e;
        }
    }

    public final bi50<T> c(Response response) throws IOException {
        ResponseBody responseBodyBody = response.body();
        Response responseBuild = response.newBuilder().body(new c(responseBodyBody.getB(), responseBodyBody.getC())).build();
        int iCode = responseBuild.code();
        if (iCode >= 200 && iCode < 300) {
            if (iCode == 204 || iCode == 205) {
                responseBodyBody.close();
                return bi50.b(null, responseBuild);
            }
            b bVar = new b(responseBodyBody);
            try {
                return bi50.b(this.e.convert(bVar), responseBuild);
            } catch (RuntimeException e) {
                IOException iOException = bVar.d;
                if (iOException == null) {
                    throw e;
                }
                throw iOException;
            }
        }
        try {
            lb5 lb5Var = new lb5();
            responseBodyBody.getD().V0(lb5Var);
            ResponseBody responseBodyCreate = ResponseBody.create(responseBodyBody.getB(), responseBodyBody.getC(), lb5Var);
            Objects.requireNonNull(responseBodyCreate, "body == null");
            if (responseBuild.getIsSuccessful()) {
                throw new IllegalArgumentException("rawResponse should not be successful response");
            }
            bi50<T> bi50Var = new bi50<>(responseBuild, null, responseBodyCreate);
            responseBodyBody.close();
            return bi50Var;
        } catch (Throwable th) {
            responseBodyBody.close();
            throw th;
        }
    }

    @Override // defpackage.su5
    public final void cancel() {
        Call call;
        this.f = true;
        synchronized (this) {
            call = this.i;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // defpackage.su5
    public final su5 clone() {
        return new cmy(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.su5
    public final bi50<T> execute() {
        Call callB;
        synchronized (this) {
            if (this.w) {
                throw new IllegalStateException("Already executed.");
            }
            this.w = true;
            callB = b();
        }
        if (this.f) {
            callB.cancel();
        }
        return c(FirebasePerfOkHttpClient.execute(callB));
    }

    @Override // defpackage.su5
    public final boolean isCanceled() {
        boolean z = true;
        if (this.f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.i;
                if (call == null || !call.getG()) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.su5
    public final synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().request();
    }

    public final Object clone() {
        return new cmy(this.a, this.b, this.c, this.d, this.e);
    }
}
