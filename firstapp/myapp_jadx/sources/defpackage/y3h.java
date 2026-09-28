package defpackage;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class y3h implements w7j0 {
    public final WindowLayoutComponent a;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();

    public static final class a implements Consumer<WindowLayoutInfo> {
        public final Activity a;
        public b9j0 c;
        public final ReentrantLock b = new ReentrantLock();
        public final LinkedHashSet d = new LinkedHashSet();

        public a(Activity activity) {
            this.a = activity;
        }

        public final void a(d8j0 d8j0Var) {
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                b9j0 b9j0Var = this.c;
                if (b9j0Var != null) {
                    d8j0Var.accept(b9j0Var);
                }
                this.d.add(d8j0Var);
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.function.Consumer
        public final void accept(WindowLayoutInfo windowLayoutInfo) {
            WindowLayoutInfo windowLayoutInfo2 = windowLayoutInfo;
            windowLayoutInfo2.getClass();
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                this.c = b4h.b(this.a, windowLayoutInfo2);
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((qya) it.next()).accept(this.c);
                }
                Unit unit = Unit.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public y3h(WindowLayoutComponent windowLayoutComponent) {
        this.a = windowLayoutComponent;
    }

    @Override // defpackage.w7j0
    public final void a(Activity activity, liv livVar, d8j0 d8j0Var) {
        Unit unit;
        LinkedHashMap linkedHashMap = this.c;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            a aVar = (a) linkedHashMap.get(activity);
            LinkedHashMap linkedHashMap2 = this.d;
            if (aVar == null) {
                unit = null;
            } else {
                aVar.a(d8j0Var);
                linkedHashMap2.put(d8j0Var, activity);
                unit = Unit.a;
            }
            if (unit == null) {
                a aVar2 = new a(activity);
                linkedHashMap.put(activity, aVar2);
                linkedHashMap2.put(d8j0Var, activity);
                aVar2.a(d8j0Var);
                this.a.addWindowLayoutInfoListener(activity, aVar2);
            }
            Unit unit2 = Unit.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.w7j0
    public final void b(qya<b9j0> qyaVar) {
        qyaVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.d.get(qyaVar);
            if (activity == null) {
                reentrantLock.unlock();
                return;
            }
            a aVar = (a) this.c.get(activity);
            if (aVar == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashSet linkedHashSet = aVar.d;
            ReentrantLock reentrantLock2 = aVar.b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(qyaVar);
                reentrantLock2.unlock();
                if (linkedHashSet.isEmpty()) {
                    this.a.removeWindowLayoutInfoListener(aVar);
                }
                Unit unit = Unit.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
