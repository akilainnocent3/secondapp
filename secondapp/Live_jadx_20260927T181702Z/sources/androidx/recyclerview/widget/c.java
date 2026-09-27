package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Executor f18657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Executor f18658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final k.f<T> f18659c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Object f18660d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Executor f18661e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Executor f18662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Executor f18663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k.f<T> f18664c;

        public a(@NonNull k.f<T> fVar) {
            this.f18664c = fVar;
        }

        @NonNull
        public c<T> a() {
            if (this.f18663b == null) {
                synchronized (f18660d) {
                    try {
                        if (f18661e == null) {
                            f18661e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f18663b = f18661e;
            }
            return new c<>(this.f18662a, this.f18663b, this.f18664c);
        }

        @NonNull
        public a<T> b(@Nullable Executor executor) {
            this.f18663b = executor;
            return this;
        }

        @NonNull
        @y0({y0.a.LIBRARY})
        public a<T> c(@Nullable Executor executor) {
            this.f18662a = executor;
            return this;
        }
    }

    public c(@Nullable Executor executor, @NonNull Executor executor2, @NonNull k.f<T> fVar) {
        this.f18657a = executor;
        this.f18658b = executor2;
        this.f18659c = fVar;
    }

    @NonNull
    public Executor a() {
        return this.f18658b;
    }

    @NonNull
    public k.f<T> b() {
        return this.f18659c;
    }

    @Nullable
    @y0({y0.a.LIBRARY})
    public Executor c() {
        return this.f18657a;
    }
}
