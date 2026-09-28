package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qw5 implements o16 {
    public final q26 b;
    public final Object a = new Object();
    public HashMap d = new HashMap();
    public HashSet e = new HashSet();
    public final ArrayList f = new ArrayList();
    public int g = 0;
    public final ArrayList c = new ArrayList();

    public qw5(q26 q26Var) {
        this.b = q26Var;
        try {
            a(Arrays.asList(q26Var.c()));
        } catch (rz5 | s36 e) {
            pgt.d("Camera2CameraCoordinator", "Failed to get concurrent camera ids", e);
        }
    }

    @Override // defpackage.pyo
    public final void a(List<String> list) throws s36 {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set<String> set : this.b.a.c()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (i26.a(this.b, str) && i26.a(this.b, str2)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!map.containsKey(str)) {
                                    map.put(str, new ArrayList());
                                }
                                ((List) map.get(str)).add(str2);
                                if (!map.containsKey(str2)) {
                                    map.put(str2, new ArrayList());
                                }
                                ((List) map.get(str2)).add(str);
                            }
                        } catch (uhn unused) {
                            pgt.a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str + ") is not backward compatible");
                        }
                    }
                }
            }
            synchronized (this.a) {
                this.d = map;
                this.e = hashSet;
                pgt.a("Camera2CameraCoordinator", "Updated concurrent camera map: " + this.d);
            }
        } catch (rz5 e) {
            throw new s36("Failed to retrieve concurrent camera id info.", e);
        }
    }

    public final int b() {
        int i;
        synchronized (this.a) {
            i = this.g;
        }
        return i;
    }

    public final String c(String str) {
        synchronized (this.a) {
            try {
                if (!this.d.containsKey(str)) {
                    return null;
                }
                List<String> list = (List) this.d.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    ArrayList arrayList = this.f;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (str2.equals(wx5.a((l26) obj).a.a)) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
