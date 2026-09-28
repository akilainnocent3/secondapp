package defpackage;

import androidx.compose.ui.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class iw50 extends d.c implements hw50 {
    public Function1<? super jw50, Boolean> D;

    public iw50() {
        throw null;
    }

    @Override // defpackage.hw50
    public final boolean J0(jw50 jw50Var) {
        Function1<? super jw50, Boolean> function1 = this.D;
        if (function1 != null) {
            return function1.invoke(jw50Var).booleanValue();
        }
        return false;
    }

    @Override // defpackage.hw50
    public final boolean p0(jw50 jw50Var) {
        return false;
    }
}
