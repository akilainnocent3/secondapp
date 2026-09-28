package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jv60 {
    public final mv60 a;
    public kk40.a b;

    public interface a {
        void a(nv60 nv60Var);
    }

    public interface b {
        Bundle a();
    }

    public jv60(mv60 mv60Var) {
        this.a = mv60Var;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        mv60 mv60Var = this.a;
        if (!mv60Var.g) {
            ib5.a("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle2 = mv60Var.f;
        if (bundle2 == null) {
            return null;
        }
        if (bundle2.containsKey(str)) {
            bundle = bundle2.getBundle(str);
            if (bundle == null) {
                s5b.a(str);
                throw null;
            }
        } else {
            bundle = null;
        }
        bundle2.remove(str);
        if (bundle2.isEmpty()) {
            mv60Var.f = null;
        }
        return bundle;
    }

    public final b b() {
        b bVar;
        mv60 mv60Var = this.a;
        synchronized (mv60Var.c) {
            Iterator it = mv60Var.d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                b bVar2 = (b) entry.getValue();
                if (Intrinsics.g(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final void c(String str, b bVar) {
        mv60 mv60Var = this.a;
        synchronized (mv60Var.c) {
            if (mv60Var.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            mv60Var.d.put(str, bVar);
            Unit unit = Unit.a;
        }
    }

    public final void d() {
        if (!this.a.h) {
            ib5.a("Can not perform this action after onSaveInstanceState");
            return;
        }
        kk40.a aVar = this.b;
        if (aVar == null) {
            aVar = new kk40.a(this);
        }
        this.b = aVar;
        try {
            c6s.a.class.getDeclaredConstructor(null);
            kk40.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.a.add(c6s.a.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + c6s.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
