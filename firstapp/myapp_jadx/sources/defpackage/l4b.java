package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class l4b implements Function1<cmp, Boolean> {
    public final /* synthetic */ n6s a;
    public final /* synthetic */ iif0 b;

    public l4b(n6s n6sVar, iif0 iif0Var) {
        this.a = n6sVar;
        this.b = iif0Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(cmp cmpVar) {
        boolean z;
        KeyEvent keyEvent = cmpVar.a;
        if (this.a.a() == ocl.b && keyEvent.getKeyCode() == 4) {
            z = true;
            if (emp.b(keyEvent) == 1) {
                this.b.d(null);
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
