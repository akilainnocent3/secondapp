package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mv60 {
    public final nv60 a;
    public final xk20 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final ur6 c = new ur6();
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public mv60(nv60 nv60Var, xk20 xk20Var) {
        this.a = nv60Var;
        this.b = xk20Var;
    }

    public final void a() {
        nv60 nv60Var = this.a;
        if (nv60Var.getLifecycle().b() != s9s.b.b) {
            ib5.a("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                ib5.a("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            nv60Var.getLifecycle().a(new cbs() { // from class: lv60
                @Override // defpackage.cbs
                public final void F0(ibs ibsVar, s9s.a aVar) {
                    s9s.a aVar2 = s9s.a.ON_START;
                    mv60 mv60Var = this.a;
                    if (aVar == aVar2) {
                        mv60Var.h = true;
                    } else if (aVar == s9s.a.ON_STOP) {
                        mv60Var.h = false;
                    }
                }
            });
            this.e = true;
        }
    }
}
