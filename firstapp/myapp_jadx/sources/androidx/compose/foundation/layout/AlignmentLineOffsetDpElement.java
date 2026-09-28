package androidx.compose.foundation.layout;

import defpackage.g7f;
import defpackage.knn;
import defpackage.kt;
import defpackage.nt;
import defpackage.p3w;
import defpackage.tvh;
import defpackage.ukn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "Lp3w;", "Lnt;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AlignmentLineOffsetDpElement extends p3w<nt> {
    public final kt b;
    public final float c;
    public final float d;
    public final Function1<knn, Unit> e;

    public AlignmentLineOffsetDpElement(kt ktVar, float f, float f2, Function1 function1) {
        this.b = ktVar;
        this.c = f;
        this.d = f2;
        this.e = function1;
        boolean z = true;
        boolean z2 = f >= 0.0f || Float.isNaN(f);
        if (f2 < 0.0f && !Float.isNaN(f2)) {
            z = false;
        }
        if (!z2 || !z) {
            ukn.a("Padding from alignment line must be a non-negative number");
        }
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        nt ntVar = new nt();
        ntVar.D = this.b;
        ntVar.E = this.c;
        ntVar.F = this.d;
        return ntVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        nt ntVar = (nt) cVar;
        ntVar.D = this.b;
        ntVar.E = this.c;
        ntVar.F = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        return alignmentLineOffsetDpElement != null && Intrinsics.g(this.b, alignmentLineOffsetDpElement.b) && g7f.b(this.c, alignmentLineOffsetDpElement.c) && g7f.b(this.d, alignmentLineOffsetDpElement.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tvh.a(this.c, this.b.hashCode() * 31, 31);
    }
}
