package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class djg0 implements Call.Factory {
    public static final wei0<Request, m0b> b = (wei0) ((cr5) b260.a.a.a(Request.class, new c260())).a(m0b.class, new d260());
    public static final Method c;
    public static final Method d;
    public final OkHttpClient a;

    public static class a implements Call {
        public final Call a;
        public final m0b b;

        /* JADX INFO: renamed from: djg0$a$a, reason: collision with other inner class name */
        public static class C0488a implements Callback {
            public final Callback a;
            public final m0b b;

            public C0488a(Callback callback, m0b m0bVar) {
                this.a = callback;
                this.b = m0bVar;
            }

            @Override // okhttp3.Callback
            public final void onFailure(Call call, IOException iOException) throws Exception {
                rn70 rn70VarD = this.b.d();
                try {
                    this.a.onFailure(call, iOException);
                    if (rn70VarD != null) {
                        rn70VarD.close();
                    }
                } catch (Throwable th) {
                    if (rn70VarD != null) {
                        try {
                            rn70VarD.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }

            @Override // okhttp3.Callback
            public final void onResponse(Call call, Response response) throws Exception {
                rn70 rn70VarD = this.b.d();
                try {
                    this.a.onResponse(call, response);
                    if (rn70VarD != null) {
                        rn70VarD.close();
                    }
                } catch (Throwable th) {
                    if (rn70VarD != null) {
                        try {
                            rn70VarD.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }

        public a(Call call, m0b m0bVar) {
            this.a = call;
            this.b = m0bVar;
        }

        @Override // okhttp3.Call
        public final void cancel() {
            this.a.cancel();
        }

        @Override // okhttp3.Call
        public final Call clone() {
            Method method = djg0.d;
            if (method == null) {
                return (Call) super.clone();
            }
            try {
                return new a((Call) method.invoke(this.a, null), m0b.current());
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return (Call) super.clone();
            }
        }

        @Override // okhttp3.Call
        public final void enqueue(Callback callback) {
            this.a.enqueue(new C0488a(callback, this.b));
        }

        @Override // okhttp3.Call
        public final Response execute() throws Exception {
            rn70 rn70VarD = this.b.d();
            try {
                Response responseExecute = this.a.execute();
                if (rn70VarD != null) {
                    rn70VarD.close();
                }
                return responseExecute;
            } catch (Throwable th) {
                if (rn70VarD != null) {
                    try {
                        rn70VarD.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // okhttp3.Call
        /* JADX INFO: renamed from: isCanceled */
        public final boolean getG() {
            return this.a.getG();
        }

        @Override // okhttp3.Call
        public final boolean isExecuted() {
            return this.a.isExecuted();
        }

        @Override // okhttp3.Call
        public final Request request() {
            return this.a.request();
        }

        @Override // okhttp3.Call
        public final sxf0 timeout() {
            Method method = djg0.c;
            if (method == null) {
                return sxf0.NONE;
            }
            try {
                return (sxf0) method.invoke(this.a, null);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return sxf0.NONE;
            }
        }
    }

    static {
        try {
            c = Call.class.getMethod("timeout", null);
        } catch (NoSuchMethodException unused) {
            c = null;
        }
        try {
            d = Call.class.getDeclaredMethod("clone", null);
        } catch (NoSuchMethodException unused2) {
            d = null;
        }
    }

    public djg0(OkHttpClient okHttpClient) {
        this.a = okHttpClient;
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        m0b m0bVarCurrent = m0b.current();
        Request requestBuild = request.newBuilder().build();
        b.b(requestBuild, m0bVarCurrent);
        return new a(this.a.newCall(requestBuild), m0bVarCurrent);
    }
}
