package yads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md0 f153003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f153004b = new AtomicBoolean(false);

    public nd0(md0 md0Var) {
        this.f153003a = md0Var;
    }

    public final mq0 a(Object... objArr) {
        Constructor constructorA;
        synchronized (this.f153004b) {
            try {
                if (!this.f153004b.get()) {
                    try {
                        constructorA = this.f153003a.a();
                    } catch (ClassNotFoundException unused) {
                        this.f153004b.set(true);
                        constructorA = null;
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating extension", e10);
                    }
                }
                constructorA = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (mq0) constructorA.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }
}
