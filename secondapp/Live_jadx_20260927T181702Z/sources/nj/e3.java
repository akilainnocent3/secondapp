package nj;

import java.util.Locale;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public final class e3 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.e
    public static final class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s1 f116945b = new s1(a.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runtime f116946a;

        public a(Runtime runtime) {
            this.f116946a = runtime;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread t10, Throwable e10) {
            try {
                f116945b.a().log(Level.SEVERE, String.format(Locale.ROOT, "Caught an exception in %s.  Shutting down.", t10), e10);
            } catch (Throwable th2) {
                try {
                    System.err.println(e10.getMessage());
                    System.err.println(th2.getMessage());
                } finally {
                    this.f116946a.exit(1);
                }
            }
        }
    }

    public static Thread.UncaughtExceptionHandler a() {
        return new a(Runtime.getRuntime());
    }
}
