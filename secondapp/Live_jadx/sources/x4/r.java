package x4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class r<E> implements Iterable<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f144413b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k.a0("lock")
    public final Map<E, Integer> f144414c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k.a0("lock")
    public Set<E> f144415d = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @k.a0("lock")
    public List<E> f144416e = Collections.EMPTY_LIST;

    public int F1(E e10) {
        int iIntValue;
        synchronized (this.f144413b) {
            try {
                iIntValue = this.f144414c.containsKey(e10) ? this.f144414c.get(e10).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public void a(E e10) {
        synchronized (this.f144413b) {
            try {
                ArrayList arrayList = new ArrayList(this.f144416e);
                arrayList.add(e10);
                this.f144416e = Collections.unmodifiableList(arrayList);
                Integer num = this.f144414c.get(e10);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f144415d);
                    hashSet.add(e10);
                    this.f144415d = Collections.unmodifiableSet(hashSet);
                }
                this.f144414c.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(E e10) {
        synchronized (this.f144413b) {
            try {
                Integer num = this.f144414c.get(e10);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f144416e);
                arrayList.remove(e10);
                this.f144416e = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f144414c.remove(e10);
                    HashSet hashSet = new HashSet(this.f144415d);
                    hashSet.remove(e10);
                    this.f144415d = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f144414c.put(e10, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f144413b) {
            it = this.f144416e.iterator();
        }
        return it;
    }

    public Set<E> k() {
        Set<E> set;
        synchronized (this.f144413b) {
            set = this.f144415d;
        }
        return set;
    }
}
