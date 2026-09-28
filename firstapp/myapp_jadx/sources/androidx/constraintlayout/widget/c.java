package androidx.constraintlayout.widget;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public HashMap<Integer, HashSet<WeakReference<a>>> a;

    public interface a {
    }

    public final void a(int i, a aVar) {
        HashMap<Integer, HashSet<WeakReference<a>>> map = this.a;
        HashSet<WeakReference<a>> hashSet = map.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
