package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class a00 implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f146596b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f146597c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f146598d = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f146599e = Collections.EMPTY_LIST;

    public final int a(Object obj) {
        int iIntValue;
        synchronized (this.f146596b) {
            try {
                iIntValue = this.f146597c.containsKey(obj) ? ((Integer) this.f146597c.get(obj)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public final void b(Object obj) {
        synchronized (this.f146596b) {
            try {
                Integer num = (Integer) this.f146597c.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f146599e);
                arrayList.remove(obj);
                this.f146599e = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f146597c.remove(obj);
                    HashSet hashSet = new HashSet(this.f146598d);
                    hashSet.remove(obj);
                    this.f146598d = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f146597c.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f146596b) {
            it = this.f146599e.iterator();
        }
        return it;
    }
}
