package defpackage;

import java.io.Closeable;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\fB\u001d\b\u0017\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0007\"\u00020\r¢\u0006\u0004\b\u0002\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0015\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0016\u0010\u0019J%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u001a*\u00060\bj\u0002`\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lj8i0;", "", "<init>", "()V", "Lv5b;", "viewModelScope", "(Lv5b;)V", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Lv5b;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "", "onCleared", "clear$lifecycle_viewmodel_release", "clear", "", "key", "closeable", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "(Ljava/io/Closeable;)V", "T", "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Lm8i0;", "impl", "Lm8i0;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class j8i0 {
    private final m8i0 impl;

    public j8i0(v5b v5bVar, AutoCloseable... autoCloseableArr) {
        v5bVar.getClass();
        autoCloseableArr.getClass();
        this.impl = new m8i0(v5bVar, (AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        key.getClass();
        closeable.getClass();
        m8i0 m8i0Var = this.impl;
        if (m8i0Var != null) {
            m8i0Var.b(key, closeable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        m8i0 m8i0Var = this.impl;
        if (m8i0Var != null && !m8i0Var.d) {
            m8i0Var.d = true;
            synchronized (m8i0Var.a) {
                try {
                    Iterator it = m8i0Var.b.values().iterator();
                    while (it.hasNext()) {
                        m8i0.c((AutoCloseable) it.next());
                    }
                    Iterator it2 = m8i0Var.c.iterator();
                    while (it2.hasNext()) {
                        m8i0.c((AutoCloseable) it2.next());
                    }
                    m8i0Var.c.clear();
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        T t;
        key.getClass();
        m8i0 m8i0Var = this.impl;
        if (m8i0Var == null) {
            return null;
        }
        synchronized (m8i0Var.a) {
            t = (T) m8i0Var.b.get(key);
        }
        return t;
    }

    public void addCloseable(AutoCloseable closeable) {
        closeable.getClass();
        m8i0 m8i0Var = this.impl;
        if (m8i0Var != null) {
            m8i0Var.a(closeable);
        }
    }

    @fae
    public /* synthetic */ void addCloseable(Closeable closeable) {
        closeable.getClass();
        m8i0 m8i0Var = this.impl;
        if (m8i0Var != null) {
            m8i0Var.a(closeable);
        }
    }

    public void onCleared() {
    }

    public j8i0(v5b v5bVar) {
        v5bVar.getClass();
        this.impl = new m8i0(v5bVar);
    }

    public j8i0(AutoCloseable... autoCloseableArr) {
        autoCloseableArr.getClass();
        this.impl = new m8i0((AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public j8i0() {
        this.impl = new m8i0();
    }

    @fae
    public /* synthetic */ j8i0(Closeable... closeableArr) {
        closeableArr.getClass();
        this.impl = new m8i0((AutoCloseable[]) Arrays.copyOf(closeableArr, closeableArr.length));
    }
}
