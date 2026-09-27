package ej;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@e
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @km.m
    public f f81338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @yi.e
    public final Object f81339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f81340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f81341d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @yi.e
    public static final class b extends j {
        @Override // ej.j
        public void e(Object event) throws InvocationTargetException {
            synchronized (this) {
                super.e(event);
            }
        }

        public b(f bus, Object target, Method method) {
            super(bus, target, method);
        }
    }

    public static /* synthetic */ void a(j jVar, Object obj) {
        jVar.getClass();
        try {
            jVar.e(obj);
        } catch (InvocationTargetException e10) {
            jVar.f81338a.b(e10.getCause(), jVar.b(obj));
        }
    }

    public static j c(f bus, Object listener, Method method) {
        return f(method) ? new j(bus, listener, method) : new b(bus, listener, method);
    }

    public static boolean f(Method method) {
        return method.getAnnotation(ej.a.class) != null;
    }

    public final k b(Object event) {
        return new k(this.f81338a, event, this.f81339b, this.f81340c);
    }

    public final void d(final Object event) {
        this.f81341d.execute(new Runnable() { // from class: ej.i
            @Override // java.lang.Runnable
            public final void run() {
                j.a(this.f81336b, event);
            }
        });
    }

    @yi.e
    public void e(Object event) throws InvocationTargetException {
        try {
            this.f81340c.invoke(this.f81339b, l0.E(event));
        } catch (IllegalAccessException e10) {
            throw new Error("Method became inaccessible: " + event, e10);
        } catch (IllegalArgumentException e11) {
            throw new Error("Method rejected target/argument: " + event, e11);
        } catch (InvocationTargetException e12) {
            if (!(e12.getCause() instanceof Error)) {
                throw e12;
            }
            throw ((Error) e12.getCause());
        }
    }

    public final boolean equals(@zq.a Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f81339b == jVar.f81339b && this.f81340c.equals(jVar.f81340c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f81340c.hashCode() + 31) * 31) + System.identityHashCode(this.f81339b);
    }

    public j(f bus, Object target, Method method) {
        this.f81338a = bus;
        this.f81339b = l0.E(target);
        this.f81340c = method;
        method.setAccessible(true);
        this.f81341d = bus.a();
    }
}
