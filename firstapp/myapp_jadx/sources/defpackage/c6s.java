package defpackage;

import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class c6s {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc6s$a;", "Ljv60$a;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements jv60.a {
        @Override // jv60.a
        public final void a(nv60 nv60Var) {
            if (!(nv60Var instanceof w8i0)) {
                dmy.a(nv60Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                return;
            }
            v8i0 viewModelStore = ((w8i0) nv60Var).getViewModelStore();
            jv60 savedStateRegistry = nv60Var.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.a;
            for (String str : new HashSet(linkedHashMap.keySet())) {
                str.getClass();
                j8i0 j8i0Var = (j8i0) linkedHashMap.get(str);
                if (j8i0Var != null) {
                    c6s.a(j8i0Var, savedStateRegistry, nv60Var.getLifecycle());
                }
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d();
        }
    }

    public static final void a(j8i0 j8i0Var, jv60 jv60Var, s9s s9sVar) {
        jv60Var.getClass();
        s9sVar.getClass();
        yu60 yu60Var = (yu60) j8i0Var.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (yu60Var == null || yu60Var.c) {
            return;
        }
        yu60Var.d(s9sVar, jv60Var);
        s9s.b bVarB = s9sVar.b();
        if (bVarB == s9s.b.b || bVarB.compareTo(s9s.b.d) >= 0) {
            jv60Var.d();
        } else {
            s9sVar.a(new d6s(s9sVar, jv60Var));
        }
    }
}
