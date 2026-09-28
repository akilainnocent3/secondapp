package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class xwa<T> {
    public final vvj0 a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet<qwa<T>> d;
    public T e;

    public xwa(Context context, vvj0 vvj0Var) {
        this.a = vvj0Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet<>();
    }

    public abstract T a();

    public final void b(T t) {
        synchronized (this.c) {
            T t2 = this.e;
            if (t2 == null || !t2.equals(t)) {
                this.e = t;
                final List listA0 = CollectionsKt.A0(this.d);
                this.a.d.execute(new Runnable() { // from class: wwa
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it = listA0.iterator();
                        while (it.hasNext()) {
                            ((qwa) it.next()).a(this.e);
                        }
                    }
                });
                Unit unit = Unit.a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
