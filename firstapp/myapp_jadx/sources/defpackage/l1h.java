package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class l1h implements Function1<cmp, Boolean> {
    public final /* synthetic */ j1h a;
    public final /* synthetic */ ytw<Boolean> b;

    public l1h(j1h j1hVar, boolean z, ytw ytwVar) {
        this.a = j1hVar;
        this.b = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(cmp cmpVar) {
        KeyEvent keyEvent = cmpVar.a;
        boolean z = true;
        if (emp.b(keyEvent) == 1) {
            long jA = emp.a(keyEvent);
            int i = olp.r;
            if (!olp.a(jA, olp.h) && !olp.a(jA, olp.k) && !olp.a(jA, olp.q)) {
                z = false;
            }
            if (z || olp.a(qnp.b(keyEvent.getKeyCode()), olp.j)) {
                this.a.invoke();
            }
        }
        Boolean bool = Boolean.FALSE;
        this.b.setValue(bool);
        return bool;
    }
}
