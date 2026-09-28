package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import defpackage.rcp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final ArrayList<Fragment> a = new ArrayList<>();
    public final HashMap<String, k> b = new HashMap<>();
    public final HashMap<String, Bundle> c = new HashMap<>();
    public j d;

    public final void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            rcp.a(fragment, "Fragment already added: ");
            return;
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        k kVar = this.b.get(str);
        if (kVar != null) {
            return kVar.c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (k kVar : this.b.values()) {
            if (kVar != null && (fragmentFindFragmentByWho = kVar.c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (k kVar : this.b.values()) {
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (k kVar : this.b.values()) {
            if (kVar != null) {
                arrayList.add(kVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<Fragment> f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(k kVar) {
        Fragment fragment = kVar.c;
        String str = fragment.mWho;
        HashMap<String, k> map = this.b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, kVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            boolean z = fragment.mRetainInstance;
            j jVar = this.d;
            if (z) {
                jVar.x1(fragment);
            } else {
                jVar.B1(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.R(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(k kVar) {
        Fragment fragment = kVar.c;
        if (fragment.mRetainInstance) {
            this.d.B1(fragment);
        }
        String str = fragment.mWho;
        HashMap<String, k> map = this.b;
        if (map.get(str) == kVar && map.put(fragment.mWho, null) != null && FragmentManager.R(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle i(String str, Bundle bundle) {
        HashMap<String, Bundle> map = this.c;
        return bundle != null ? map.put(str, bundle) : map.remove(str);
    }
}
