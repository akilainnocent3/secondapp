package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.d;
import defpackage.p3w;
import defpackage.ybe0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElement;", "Lp3w;", "Lybe0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class StylusHandwritingElement extends p3w<ybe0> {
    public final Function0<Unit> b;

    public StylusHandwritingElement(Function0<Unit> function0) {
        this.b = function0;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new ybe0(this.b);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ((ybe0) cVar).F = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StylusHandwritingElement) {
            return this.b == ((StylusHandwritingElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
