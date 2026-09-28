package androidx.compose.foundation.layout;

import defpackage.g7f;
import defpackage.knn;
import defpackage.p3w;
import defpackage.smz;
import defpackage.tvh;
import defpackage.ukn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Lp3w;", "Lsmz;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PaddingElement extends p3w<smz> {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f = true;
    public final Function1<knn, Unit> g;

    public PaddingElement(float f, float f2, float f3, float f4, Function1 function1) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        boolean z = true;
        this.g = function1;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            ukn.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        smz smzVar = new smz();
        smzVar.D = this.b;
        smzVar.E = this.c;
        smzVar.F = this.d;
        smzVar.G = this.e;
        smzVar.H = this.f;
        return smzVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        smz smzVar = (smz) cVar;
        smzVar.D = this.b;
        smzVar.E = this.c;
        smzVar.F = this.d;
        smzVar.G = this.e;
        smzVar.H = this.f;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && g7f.b(this.b, paddingElement.b) && g7f.b(this.c, paddingElement.c) && g7f.b(this.d, paddingElement.d) && g7f.b(this.e, paddingElement.e) && this.f == paddingElement.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + tvh.a(this.e, tvh.a(this.d, tvh.a(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }
}
