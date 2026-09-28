package androidx.recyclerview.widget;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> {
    public final Executor a;
    public final n.e<T> b;

    public static final class a<T> {
        public static final Object a = new Object();
        public static ExecutorService b;
    }

    public c(Executor executor, n.e eVar) {
        this.a = executor;
        this.b = eVar;
    }
}
