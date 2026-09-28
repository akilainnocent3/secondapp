package defpackage;

import android.view.View;
import defpackage.g6i0;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e64<T extends g6i0> implements w7l {
    public static final AtomicLong c = new AtomicLong(0);
    public c8l a;
    public final long b;

    public e64() {
        long jDecrementAndGet = c.decrementAndGet();
        new HashMap();
        this.b = jDecrementAndGet;
    }

    @Override // defpackage.w7l
    public final int a() {
        return 1;
    }

    @Override // defpackage.w7l
    public final void c(c8l c8lVar) {
        this.a = c8lVar;
    }

    @Override // defpackage.w7l
    public final int d(y2p y2pVar) {
        return this == y2pVar ? 0 : -1;
    }

    public abstract void f(T t, int i);

    public void g(T t, int i, List<Object> list) {
        f(t, i);
    }

    @Override // defpackage.w7l
    public final e64 getItem(int i) {
        if (i == 0) {
            return this;
        }
        mae0.a(pe4.b(i, "Wanted item at position ", " but an Item is a Group of size 1"));
        return null;
    }

    public abstract int h();

    public abstract T i(View view);

    public void j(b9l<Object> b9lVar) {
        b9lVar.a = null;
    }

    @Override // defpackage.w7l
    public final void e(c8l c8lVar) {
    }
}
