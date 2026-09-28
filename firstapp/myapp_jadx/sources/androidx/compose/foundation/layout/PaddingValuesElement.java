package androidx.compose.foundation.layout;

import defpackage.omz;
import defpackage.p3w;
import defpackage.tmz;
import defpackage.wmz;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Lp3w;", "Lwmz;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PaddingValuesElement extends p3w<wmz> {
    public final tmz b;

    public PaddingValuesElement(tmz tmzVar, omz omzVar) {
        this.b = tmzVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        wmz wmzVar = new wmz();
        wmzVar.D = this.b;
        return wmzVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ((wmz) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return Intrinsics.g(this.b, paddingValuesElement.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
