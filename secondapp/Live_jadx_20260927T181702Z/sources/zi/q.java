package zi;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.c
@yi.d
@k
public class q implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f161796f = "com.google.common.base.internal.Finalizer";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReferenceQueue<Object> f161798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PhantomReference<Object> f161799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f161800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f161795e = Logger.getLogger(q.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Method f161797g = i(k(new d(), new a(), new b()));

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f161801a = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

        @Override // zi.q.c
        @zq.a
        public Class<?> a() {
            try {
                return c(b()).loadClass(q.f161796f);
            } catch (Exception e10) {
                q.f161795e.log(Level.WARNING, f161801a, (Throwable) e10);
                return null;
            }
        }

        public URL b() throws IOException {
            String str = q.f161796f.replace(kj.e.f102543c, '/') + mj.c.f107528d;
            URL resource = getClass().getClassLoader().getResource(str);
            if (resource == null) {
                throw new FileNotFoundException(str);
            }
            String string = resource.toString();
            if (string.endsWith(str)) {
                return new URL(resource, string.substring(0, string.length() - str.length()));
            }
            throw new IOException("Unsupported path style: " + string);
        }

        public URLClassLoader c(URL base) {
            return new URLClassLoader(new URL[]{base}, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements c {
        @Override // zi.q.c
        public Class<?> a() {
            try {
                return Class.forName("aj.a");
            } catch (ClassNotFoundException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        @zq.a
        Class<?> a();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @yi.e
        public static boolean f161802a;

        @Override // zi.q.c
        @zq.a
        public Class<?> a() {
            if (f161802a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass(q.f161796f);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                q.f161795e.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public q() {
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f161798b = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.f161799c = phantomReference;
        boolean z10 = false;
        try {
            f161797g.invoke(null, p.class, referenceQueue, phantomReference);
            z10 = true;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (Throwable th2) {
            f161795e.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th2);
        }
        this.f161800d = z10;
    }

    public static Method i(Class<?> finalizer) {
        try {
            return finalizer.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e10) {
            throw new AssertionError(e10);
        }
    }

    public static Class<?> k(c... loaders) {
        for (c cVar : loaders) {
            Class<?> clsA = cVar.a();
            if (clsA != null) {
                return clsA;
            }
        }
        throw new AssertionError();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f161799c.enqueue();
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h() {
        if (this.f161800d) {
            return;
        }
        while (true) {
            Reference<? extends Object> referencePoll = this.f161798b.poll();
            if (referencePoll == 0) {
                return;
            }
            referencePoll.clear();
            try {
                ((p) referencePoll).a();
            } catch (Throwable th2) {
                f161795e.log(Level.SEVERE, "Error cleaning up after reference.", th2);
            }
        }
    }
}
