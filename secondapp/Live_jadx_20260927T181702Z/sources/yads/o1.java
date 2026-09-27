package yads;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f153299a;

    public o1(Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.f153299a = arrayList;
        if (activity != null) {
            arrayList.add(new WeakReference(activity));
        }
    }

    public final void a(Activity activity) {
        synchronized (this) {
            try {
                ArrayList arrayList = this.f153299a;
                if (!androidx.activity.k0.a(arrayList) || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!kotlin.jvm.internal.m0.g(((WeakReference) it.next()).get(), activity));
                    dr.w2 w2Var = dr.w2.f79517a;
                }
                this.f153299a.add(new WeakReference(activity));
                Objects.toString(activity);
                boolean z10 = ad1.f146762a;
                dr.w2 w2Var2 = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Activity activity) {
        Object next;
        synchronized (this) {
            try {
                Iterator it = this.f153299a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.m0.g(((WeakReference) next).get(), activity));
                WeakReference weakReference = (WeakReference) next;
                if (weakReference != null) {
                    this.f153299a.remove(weakReference);
                    Objects.toString(activity);
                    boolean z10 = ad1.f146762a;
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
