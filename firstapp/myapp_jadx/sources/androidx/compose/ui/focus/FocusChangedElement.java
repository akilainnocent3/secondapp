package androidx.compose.ui.focus;

import androidx.compose.ui.d;
import defpackage.j5i;
import defpackage.p3w;
import defpackage.s3i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Lp3w;", "Ls3i;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class FocusChangedElement extends p3w<s3i> {
    public final Function1<j5i, Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(Function1<? super j5i, Unit> function1) {
        this.b = function1;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        s3i s3iVar = new s3i();
        s3iVar.D = this.b;
        return s3iVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ((s3i) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusChangedElement) {
            return this.b == ((FocusChangedElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
