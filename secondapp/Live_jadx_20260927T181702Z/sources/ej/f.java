package ej;

import androidx.media3.session.fe;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import nj.c2;
import zi.d0;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@e
public class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f81329f = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f81331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f81332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f81333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f81334e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f81335a = new a();

        public static Logger b(k context) {
            return Logger.getLogger(f.class.getName() + fe.F + context.b().c());
        }

        public static String c(k context) {
            Method methodD = context.d();
            return "Exception thrown by subscriber method " + methodD.getName() + '(' + methodD.getParameterTypes()[0].getName() + ") on subscriber " + context.c() + " when dispatching event: " + context.a();
        }

        @Override // ej.l
        public void a(Throwable exception, k context) {
            Logger loggerB = b(context);
            Level level = Level.SEVERE;
            if (loggerB.isLoggable(level)) {
                loggerB.log(level, c(context), exception);
            }
        }
    }

    public f() {
        this("default");
    }

    public final Executor a() {
        return this.f81331b;
    }

    public void b(Throwable e10, k context) {
        l0.E(e10);
        l0.E(context);
        try {
            this.f81332c.a(e10, context);
        } catch (Throwable th2) {
            f81329f.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", th2, e10), th2);
        }
    }

    public final String c() {
        return this.f81330a;
    }

    public void d(Object event) {
        Iterator<j> itF = this.f81333d.f(event);
        if (itF.hasNext()) {
            this.f81334e.a(event, itF);
        } else {
            if (event instanceof c) {
                return;
            }
            d(new c(this, event));
        }
    }

    public void e(Object object) {
        this.f81333d.h(object);
    }

    public void f(Object object) {
        this.f81333d.i(object);
    }

    public String toString() {
        return d0.c(this).s(this.f81330a).toString();
    }

    public f(String identifier) {
        this(identifier, c2.c(), d.d(), a.f81335a);
    }

    public f(l exceptionHandler) {
        this("default", c2.c(), d.d(), exceptionHandler);
    }

    public f(String identifier, Executor executor, d dispatcher, l exceptionHandler) {
        this.f81333d = new m(this);
        this.f81330a = (String) l0.E(identifier);
        this.f81331b = (Executor) l0.E(executor);
        this.f81334e = (d) l0.E(dispatcher);
        this.f81332c = (l) l0.E(exceptionHandler);
    }
}
