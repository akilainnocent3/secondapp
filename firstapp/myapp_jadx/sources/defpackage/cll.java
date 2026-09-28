package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes8.dex */
public final class cll {
    public static final all a(w8i0 w8i0Var, a aVar) {
        if (!(w8i0Var instanceof iel)) {
            aVar.N(-1968008324);
            aVar.H();
            return null;
        }
        aVar.N(-1968186822);
        Context baseContext = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        r8i0.c defaultViewModelProviderFactory = ((iel) w8i0Var).getDefaultViewModelProviderFactory();
        baseContext.getClass();
        defaultViewModelProviderFactory.getClass();
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof rn8) {
                all.c cVar = (all.c) jm2.a((rn8) baseContext, all.c.class);
                all allVar = new all(cVar.E(), defaultViewModelProviderFactory, cVar.P2());
                aVar.H();
                return allVar;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            baseContext.getClass();
        }
        rcp.a(baseContext, "Expected an activity context for creating a HiltViewModelFactory but instead found: ");
        return null;
    }
}
