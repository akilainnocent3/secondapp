package defpackage;

import android.os.Bundle;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class dv60 {
    public static final b a = new b();
    public static final c b = new c();
    public static final d c = new d();

    public static final class a implements r8i0.c {
        @Override // r8i0.c
        public final j8i0 b(dq7 dq7Var, dsw dswVar) {
            return new gv60();
        }
    }

    public static final class b implements cyb.b<nv60> {
    }

    public static final class c implements cyb.b<w8i0> {
    }

    public static final class d implements cyb.b<Bundle> {
    }

    public static final vu60 a(cyb cybVar) {
        vu60 vu60Var;
        cybVar.getClass();
        nv60 nv60Var = (nv60) cybVar.a(a);
        Bundle bundle = null;
        if (nv60Var == null) {
            hb5.a("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        w8i0 w8i0Var = (w8i0) cybVar.a(b);
        if (w8i0Var == null) {
            hb5.a("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) cybVar.a(c);
        String str = (String) cybVar.a(r8i0.b);
        if (str == null) {
            hb5.a("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        jv60.b bVarB = nv60Var.getSavedStateRegistry().b();
        fv60 fv60Var = bVarB instanceof fv60 ? (fv60) bVarB : null;
        if (fv60Var == null) {
            ib5.a("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = c(w8i0Var).a;
        vu60 vu60Var2 = (vu60) linkedHashMap.get(str);
        if (vu60Var2 != null) {
            return vu60Var2;
        }
        fv60Var.b();
        Bundle bundle3 = fv60Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                o2g.a.getClass();
                bundle4 = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                fv60Var.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            vu60Var = new vu60();
        } else {
            ClassLoader classLoader = vu60.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            xnu xnuVar = new xnu(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                xnuVar.put(str2, bundle2.get(str2));
            }
            vu60Var = new vu60(xnuVar.c());
        }
        linkedHashMap.put(str, vu60Var);
        return vu60Var;
    }

    public static final gv60 c(w8i0 w8i0Var) {
        r8i0 r8i0VarA = r8i0.b.a(w8i0Var, new a(), 4);
        return (gv60) r8i0VarA.a.a(jq40.a(gv60.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends nv60 & w8i0> void b(T t) {
        s9s.b bVarB = t.getLifecycle().b();
        if (bVarB != s9s.b.b && bVarB != s9s.b.c) {
            hb5.a(ACKxwYRsuWyGz.QAzactq);
        } else if (t.getSavedStateRegistry().b() == null) {
            fv60 fv60Var = new fv60(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", fv60Var);
            t.getLifecycle().a(new xu60(fv60Var));
        }
    }
}
