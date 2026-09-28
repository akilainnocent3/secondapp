package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class m8i0 {
    public final npe0 a;
    public final LinkedHashMap b;
    public final LinkedHashSet c;
    public volatile boolean d;

    public m8i0(v5b v5bVar, AutoCloseable... autoCloseableArr) {
        v5bVar.getClass();
        this.a = new npe0();
        this.b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.c = linkedHashSet;
        b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new et7(v5bVar.getCoroutineContext()));
        p48.x(linkedHashSet, autoCloseableArr);
    }

    public static void c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                l8i0.a(autoCloseable);
            } catch (Exception e) {
                gqm.a(e);
            }
        }
    }

    public final void a(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        if (this.d) {
            c(autoCloseable);
            return;
        }
        synchronized (this.a) {
            this.c.add(autoCloseable);
            Unit unit = Unit.a;
        }
    }

    public final void b(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        str.getClass();
        autoCloseable.getClass();
        if (this.d) {
            c(autoCloseable);
            return;
        }
        synchronized (this.a) {
            autoCloseable2 = (AutoCloseable) this.b.put(str, autoCloseable);
        }
        c(autoCloseable2);
    }

    public m8i0(v5b v5bVar) {
        v5bVar.getClass();
        this.a = new npe0();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashSet();
        b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new et7(v5bVar.getCoroutineContext()));
    }

    public m8i0(AutoCloseable... autoCloseableArr) {
        this.a = new npe0();
        this.b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.c = linkedHashSet;
        p48.x(linkedHashSet, autoCloseableArr);
    }

    public m8i0() {
        this.a = new npe0();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashSet();
    }
}
