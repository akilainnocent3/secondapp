package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sportygames.crash.models.header.snc.OdQr;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;

/* JADX INFO: loaded from: classes8.dex */
public final class ebd extends tu5.a {
    public final Executor a;

    public class a implements tu5<Object, su5<?>> {
        public final /* synthetic */ Type a;
        public final /* synthetic */ Executor b;

        public a(Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        @Override // defpackage.tu5
        public final Type a() {
            return this.a;
        }

        @Override // defpackage.tu5
        public final su5<?> b(su5<Object> su5Var) {
            Executor executor = this.b;
            return executor == null ? su5Var : new b(executor, su5Var);
        }
    }

    public static final class b<T> implements su5<T> {
        public final Executor a;
        public final su5<T> b;

        public class a implements gv5<T> {
            public final /* synthetic */ gv5 a;

            public a(gv5 gv5Var) {
                this.a = gv5Var;
            }

            @Override // defpackage.gv5
            public final void onFailure(su5<T> su5Var, final Throwable th) {
                Executor executor = b.this.a;
                final gv5 gv5Var = this.a;
                executor.execute(new Runnable() { // from class: gbd
                    @Override // java.lang.Runnable
                    public final void run() {
                        Throwable th2 = th;
                        gv5Var.onFailure(ebd.b.this, th2);
                    }
                });
            }

            @Override // defpackage.gv5
            public final void onResponse(su5<T> su5Var, final bi50<T> bi50Var) {
                Executor executor = b.this.a;
                final gv5 gv5Var = this.a;
                executor.execute(new Runnable() { // from class: fbd
                    @Override // java.lang.Runnable
                    public final void run() {
                        ebd.b bVar = ebd.b.this;
                        boolean zIsCanceled = bVar.b.isCanceled();
                        gv5 gv5Var2 = gv5Var;
                        if (zIsCanceled) {
                            gv5Var2.onFailure(bVar, new IOException(OdQr.QvCfDX));
                        } else {
                            gv5Var2.onResponse(bVar, bi50Var);
                        }
                    }
                });
            }
        }

        public b(Executor executor, su5<T> su5Var) {
            this.a = executor;
            this.b = su5Var;
        }

        @Override // defpackage.su5
        public final void G(gv5<T> gv5Var) {
            Objects.requireNonNull(gv5Var, "callback == null");
            this.b.G(new a(gv5Var));
        }

        @Override // defpackage.su5
        public final void cancel() {
            this.b.cancel();
        }

        @Override // defpackage.su5
        public final su5<T> clone() {
            return new b(this.a, this.b.clone());
        }

        @Override // defpackage.su5
        public final bi50<T> execute() {
            return this.b.execute();
        }

        @Override // defpackage.su5
        public final boolean isCanceled() {
            return this.b.isCanceled();
        }

        @Override // defpackage.su5
        public final Request request() {
            return this.b.request();
        }
    }

    public ebd(Executor executor) {
        this.a = executor;
    }

    @Override // tu5.a
    public final tu5<?, ?> a(Type type, Annotation[] annotationArr, on50 on50Var) {
        Executor executor = null;
        if (urh0.e(type) != su5.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type typeD = urh0.d(0, (ParameterizedType) type);
            if (!urh0.h(annotationArr, ny90.class)) {
                executor = this.a;
            }
            return new a(typeD, executor);
        }
        hb5.a(lobGSRIlnSGJY.LMWyv);
        return null;
    }
}
