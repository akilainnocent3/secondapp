package ej;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@e
public class b extends f {
    public b(String identifier, Executor executor) {
        super(identifier, executor, d.c(), f.a.f81335a);
    }

    public b(Executor executor, l subscriberExceptionHandler) {
        super("default", executor, d.c(), subscriberExceptionHandler);
    }

    public b(Executor executor) {
        super("default", executor, d.c(), f.a.f81335a);
    }
}
