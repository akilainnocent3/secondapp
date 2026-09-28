package androidx.compose.material3;

import androidx.compose.ui.d;
import defpackage.p3w;
import defpackage.tac;
import defpackage.y0h;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuAnchorElement;", "Lp3w;", "Ly0h;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ExposedDropdownMenuAnchorElement extends p3w<y0h> {
    public final tac b;

    public ExposedDropdownMenuAnchorElement(tac tacVar) {
        this.b = tacVar;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        y0h y0hVar = new y0h();
        y0hVar.D = this.b;
        return y0hVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ((y0h) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExposedDropdownMenuAnchorElement) {
            return this.b == ((ExposedDropdownMenuAnchorElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
