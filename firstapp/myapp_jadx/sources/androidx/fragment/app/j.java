package androidx.fragment.app;

import android.util.Log;
import defpackage.j8i0;
import defpackage.r8i0;
import defpackage.v8i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j extends j8i0 {
    public static final a i = new a();
    public final boolean d;
    public final HashMap<String, Fragment> a = new HashMap<>();
    public final HashMap<String, j> b = new HashMap<>();
    public final HashMap<String, v8i0> c = new HashMap<>();
    public boolean e = false;
    public boolean f = false;

    public class a implements r8i0.c {
        @Override // r8i0.c
        public final <T extends j8i0> T c(Class<T> cls) {
            return new j(true);
        }
    }

    public j(boolean z) {
        this.d = z;
    }

    public final void A1(String str, boolean z) {
        HashMap<String, j> map = this.b;
        j jVar = map.get(str);
        if (jVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(jVar.b.keySet());
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    jVar.z1((String) obj, true);
                }
            }
            jVar.onCleared();
            map.remove(str);
        }
        HashMap<String, v8i0> map2 = this.c;
        v8i0 v8i0Var = map2.get(str);
        if (v8i0Var != null) {
            v8i0Var.a();
            map2.remove(str);
        }
    }

    public final void B1(Fragment fragment) {
        if (this.f) {
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.a.remove(fragment.mWho) == null || !FragmentManager.R(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.a.equals(jVar.a) && this.b.equals(jVar.b) && this.c.equals(jVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        if (FragmentManager.R(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.e = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final void x1(Fragment fragment) {
        if (this.f) {
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fragment.mWho;
        HashMap<String, Fragment> map = this.a;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (FragmentManager.R(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void y1(Fragment fragment, boolean z) {
        if (FragmentManager.R(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        A1(fragment.mWho, z);
    }

    public final void z1(String str, boolean z) {
        if (FragmentManager.R(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        A1(str, z);
    }
}
