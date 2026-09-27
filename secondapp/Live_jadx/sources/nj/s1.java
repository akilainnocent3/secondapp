package nj;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.b
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f117308a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f117310c;

    public s1(Class<?> ownerOfLogger) {
        this.f117309b = ownerOfLogger.getName();
    }

    public Logger a() {
        Logger logger = this.f117310c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f117308a) {
            try {
                Logger logger2 = this.f117310c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f117309b);
                this.f117310c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
