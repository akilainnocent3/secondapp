package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rc2 implements Function1<cmp, Boolean> {
    public final /* synthetic */ b1g0 a;
    public final /* synthetic */ ytw<Boolean> b;

    public rc2(b1g0 b1g0Var, ytw ytwVar) {
        this.a = b1g0Var;
        this.b = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(cmp cmpVar) {
        KeyEvent keyEvent = cmpVar.a;
        if (!this.a.b()) {
            this.b.setValue(Boolean.FALSE);
        }
        return Boolean.FALSE;
    }
}
