package androidx.compose.ui.focus;

import androidx.compose.ui.d;
import defpackage.b5i;
import defpackage.f5i;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Lp3w;", "Lf5i;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class FocusRequesterElement extends p3w<f5i> {
    public final b5i b;

    public FocusRequesterElement(b5i b5iVar) {
        this.b = b5iVar;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        f5i f5iVar = new f5i();
        f5iVar.D = this.b;
        return f5iVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        f5i f5iVar = (f5i) cVar;
        f5iVar.D.a.j(f5iVar);
        b5i b5iVar = this.b;
        f5iVar.D = b5iVar;
        b5iVar.a.b(f5iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.g(this.b, ((FocusRequesterElement) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.b + ')';
    }
}
