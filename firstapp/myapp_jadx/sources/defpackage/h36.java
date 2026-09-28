package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h36 implements pyo {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashSet c = new HashSet();
    public nv5.d d;
    public nv5.a<Void> e;
    public g26 f;

    @Override // defpackage.pyo
    public final void a(List<String> list) throws s36 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f.a(str));
            }
            synchronized (this.a) {
                try {
                    HashSet hashSet2 = new HashSet(this.b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((n26) this.b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList2 = (ArrayList) list;
                    int size = arrayList2.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        String str2 = (String) obj;
                        if (this.b.containsKey(str2)) {
                            linkedHashMap.put(str2, (n26) this.b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (n26) map.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(linkedHashMap);
                    int size2 = arrayList.size();
                    while (i < size2) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        n26 n26Var = (n26) obj2;
                        if (n26Var != null) {
                            n26Var.n();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (r36 e) {
            throw new s36("Failed to create CameraInternal", e);
        }
    }

    public final n26 b(String str) {
        n26 n26Var;
        synchronized (this.a) {
            try {
                n26Var = (n26) this.b.get(str);
                if (n26Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n26Var;
    }

    public final LinkedHashSet<n26> c() {
        LinkedHashSet<n26> linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet<>((Collection<? extends n26>) this.b.values());
        }
        return linkedHashSet;
    }

    public final void d(g26 g26Var) {
        this.f = g26Var;
        synchronized (this.a) {
            try {
                for (String str : g26Var.c()) {
                    pgt.a("CameraRepository", "Added camera: " + str);
                    n26 n26Var = (n26) this.b.put(str, g26Var.a(str));
                    if (n26Var != null) {
                        n26Var.release();
                    }
                }
            } catch (r36 e) {
                throw new uhn(e);
            }
        }
    }
}
