package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jmp extends d.c implements imp {
    public Function1<? super cmp, Boolean> D;
    public Function1<? super cmp, Boolean> E;

    public jmp() {
        throw null;
    }

    @Override // defpackage.imp
    public final boolean R0(KeyEvent keyEvent) {
        Function1<? super cmp, Boolean> function1 = this.E;
        if (function1 != null) {
            return function1.invoke(new cmp(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // defpackage.imp
    public final boolean h1(KeyEvent keyEvent) {
        Function1<? super cmp, Boolean> function1 = this.D;
        if (function1 != null) {
            return function1.invoke(new cmp(keyEvent)).booleanValue();
        }
        return false;
    }
}
