package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class bjs<T> {
    public final vs7 a;
    public final cdl b;
    public final b<T> c;
    public final CopyOnWriteArraySet<c<T>> d;
    public final ArrayDeque<Runnable> e;
    public final ArrayDeque<Runnable> f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public interface a<T> {
        void invoke(T t);
    }

    public interface b<T> {
        void a(T t, iuh iuhVar);
    }

    public static final class c<T> {
        public final T a;
        public iuh.a b = new iuh.a();
        public boolean c;
        public boolean d;

        public c(T t) {
            this.a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public bjs(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, vs7 vs7Var, b<T> bVar, boolean z) {
        this.a = vs7Var;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.g = new Object();
        this.e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.b = vs7Var.c(looper, new Handler.Callback() { // from class: zis
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                bjs bjsVar = this.a;
                Iterator it = bjsVar.d.iterator();
                while (it.hasNext()) {
                    bjs.c cVar = (bjs.c) it.next();
                    bjs.b<T> bVar2 = bjsVar.c;
                    if (!cVar.d && cVar.c) {
                        iuh iuhVarB = cVar.b.b();
                        cVar.b = new iuh.a();
                        cVar.c = false;
                        bVar2.a(cVar.a, iuhVarB);
                    }
                    if (bjsVar.b.a()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.i = z;
    }

    public final void a(T t) {
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new c<>(t));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque<Runnable> arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        cdl cdlVar = this.b;
        if (!cdlVar.a()) {
            cdlVar.h(cdlVar.c(1));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                arrayDeque2.peekFirst().run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(final int i, final a<T> aVar) {
        g();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: ajs
            @Override // java.lang.Runnable
            public final void run() {
                for (bjs.c cVar : copyOnWriteArraySet) {
                    if (!cVar.d) {
                        int i2 = i;
                        if (i2 != -1) {
                            cVar.b.a(i2);
                        }
                        cVar.c = true;
                        aVar.invoke(cVar.a);
                    }
                }
            }
        });
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        for (c<T> cVar : this.d) {
            b<T> bVar = this.c;
            cVar.d = true;
            if (cVar.c) {
                cVar.c = false;
                bVar.a(cVar.a, cVar.b.b());
            }
        }
        this.d.clear();
    }

    public final void e(T t) {
        g();
        CopyOnWriteArraySet<c<T>> copyOnWriteArraySet = this.d;
        for (c<T> cVar : copyOnWriteArraySet) {
            if (cVar.a.equals(t)) {
                cVar.d = true;
                if (cVar.c) {
                    cVar.c = false;
                    this.c.a(cVar.a, cVar.b.b());
                }
                copyOnWriteArraySet.remove(cVar);
            }
        }
    }

    public final void f(int i, a<T> aVar) {
        c(i, aVar);
        b();
    }

    public final void g() {
        if (this.i) {
            ly0.f(Thread.currentThread() == this.b.f().getThread());
        }
    }

    public bjs(Looper looper, vs7 vs7Var, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, vs7Var, bVar, true);
    }
}
