package androidx.databinding;

import android.util.Log;
import android.view.View;
import defpackage.d7i0;
import defpackage.loc;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MergedDataBinderMapper extends loc {
    public final HashSet a = new HashSet();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    @Override // defpackage.loc
    public final d7i0 a(int i, View view) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            d7i0 d7i0VarA = ((loc) it.next()).a(i, view);
            if (d7i0VarA != null) {
                return d7i0VarA;
            }
        }
        if (d()) {
            return a(i, view);
        }
        return null;
    }

    @Override // defpackage.loc
    public final int b(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            int iB = ((loc) it.next()).b(str);
            if (iB != 0) {
                return iB;
            }
        }
        if (d()) {
            return b(str);
        }
        return 0;
    }

    public final void c(loc locVar) {
        if (this.a.add(locVar.getClass())) {
            this.b.add(locVar);
            Iterator it = Collections.EMPTY_LIST.iterator();
            while (it.hasNext()) {
                c((loc) it.next());
            }
        }
    }

    public final boolean d() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.c;
        boolean z = false;
        for (String str : copyOnWriteArrayList) {
            try {
                Class<?> cls = Class.forName(str);
                if (loc.class.isAssignableFrom(cls)) {
                    c((loc) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            }
        }
        return z;
    }
}
