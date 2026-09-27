package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Object> f102788a;

    public t1(int i10) {
        this.f102788a = new ArrayList<>(i10);
    }

    public void a(Object obj) {
        this.f102788a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f102788a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f102788a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f102788a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f102788a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f102788a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f102788a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f102788a.toArray(objArr);
    }
}
