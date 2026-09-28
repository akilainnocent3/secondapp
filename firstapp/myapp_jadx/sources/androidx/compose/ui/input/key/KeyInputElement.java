package androidx.compose.ui.input.key;

import androidx.compose.ui.d;
import defpackage.cmp;
import defpackage.jmp;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Lp3w;", "Ljmp;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class KeyInputElement extends p3w<jmp> {
    public final Function1<cmp, Boolean> b;
    public final Function1<cmp, Boolean> c;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(Function1<? super cmp, Boolean> function1, Function1<? super cmp, Boolean> function2) {
        this.b = function1;
        this.c = function2;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        jmp jmpVar = new jmp();
        jmpVar.D = this.b;
        jmpVar.E = this.c;
        return jmpVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        jmp jmpVar = (jmp) cVar;
        jmpVar.D = this.b;
        jmpVar.E = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.b == keyInputElement.b && this.c == keyInputElement.c;
    }

    public final int hashCode() {
        Function1<cmp, Boolean> function1 = this.b;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<cmp, Boolean> function2 = this.c;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }
}
