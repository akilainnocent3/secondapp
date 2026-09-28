package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h0p<T> {
    public final Function1<T, Unit> a;
    public final Function0<Boolean> b;
    public final ReentrantLock c;
    public final ArrayList d;
    public boolean e;

    public h0p(Function1 function1, aqc.b bVar) {
        function1.getClass();
        this.a = function1;
        this.b = bVar;
        this.c = new ReentrantLock();
        this.d = new ArrayList();
    }

    public final boolean a() {
        ArrayList arrayList = this.d;
        if (this.e) {
            return false;
        }
        ReentrantLock reentrantLock = this.c;
        try {
            reentrantLock.lock();
            if (this.e) {
                reentrantLock.unlock();
                return false;
            }
            this.e = true;
            List listA0 = CollectionsKt.A0(arrayList);
            arrayList.clear();
            reentrantLock.unlock();
            Iterator<T> it = listA0.iterator();
            while (it.hasNext()) {
                this.a.invoke(it.next());
            }
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(T t) {
        boolean z = true;
        Function0<Boolean> function0 = this.b;
        if (function0 != null && function0.invoke().booleanValue()) {
            a();
        }
        boolean z2 = this.e;
        Function1<T, Unit> function1 = this.a;
        if (z2) {
            function1.invoke(t);
            return;
        }
        ReentrantLock reentrantLock = this.c;
        try {
            reentrantLock.lock();
            if (!this.e) {
                this.d.add(t);
                z = false;
            }
            if (z) {
                function1.invoke(t);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(T t) {
        ReentrantLock reentrantLock = this.c;
        try {
            reentrantLock.lock();
            this.d.remove(t);
        } finally {
            reentrantLock.unlock();
        }
    }
}
