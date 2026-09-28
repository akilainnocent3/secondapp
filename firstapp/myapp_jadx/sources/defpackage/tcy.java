package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface tcy<T> {

    public interface a<T> {
        void a(T t);

        void onError(Throwable th);
    }

    qis<T> a();

    void b(a<? super T> aVar);

    void c(Executor executor, a<? super T> aVar);
}
