package defpackage;

import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p8i0 {
    public static final j8i0 a(dq7 dq7Var, w8i0 w8i0Var, String str, r8i0.c cVar, cyb cybVar, a aVar) {
        r8i0 r8i0VarA;
        if (cVar != null) {
            v8i0 viewModelStore = w8i0Var.getViewModelStore();
            viewModelStore.getClass();
            cybVar.getClass();
            r8i0VarA = new r8i0(viewModelStore, cVar, cybVar);
        } else if (w8i0Var instanceof iel) {
            v8i0 viewModelStore2 = w8i0Var.getViewModelStore();
            r8i0.c defaultViewModelProviderFactory = ((iel) w8i0Var).getDefaultViewModelProviderFactory();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory.getClass();
            cybVar.getClass();
            r8i0VarA = new r8i0(viewModelStore2, defaultViewModelProviderFactory, cybVar);
        } else {
            r8i0VarA = r8i0.b.a(w8i0Var, null, 6);
        }
        return str != null ? r8i0VarA.a.a(dq7Var, str) : r8i0VarA.a(dq7Var);
    }
}
