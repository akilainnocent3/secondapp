package yk;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface d {
    <T> void a(Class<T> cls, b<? super T> bVar);

    <T> void b(Class<T> cls, b<? super T> bVar);

    <T> void d(Class<T> cls, Executor executor, b<? super T> bVar);
}
