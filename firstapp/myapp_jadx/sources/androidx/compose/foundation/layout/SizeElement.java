package androidx.compose.foundation.layout;

import defpackage.ex90;
import defpackage.g7f;
import defpackage.knn;
import defpackage.p3w;
import defpackage.tvh;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Lp3w;", "Lex90;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SizeElement extends p3w<ex90> {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final Function1<knn, Unit> g;

    public SizeElement(float f, float f2, float f3, float f4, boolean z, Function1 function1, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z, function1);
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        ex90 ex90Var = new ex90();
        ex90Var.D = this.b;
        ex90Var.E = this.c;
        ex90Var.F = this.d;
        ex90Var.G = this.e;
        ex90Var.H = this.f;
        return ex90Var;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ex90 ex90Var = (ex90) cVar;
        ex90Var.D = this.b;
        ex90Var.E = this.c;
        ex90Var.F = this.d;
        ex90Var.G = this.e;
        ex90Var.H = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return g7f.b(this.b, sizeElement.b) && g7f.b(this.c, sizeElement.c) && g7f.b(this.d, sizeElement.d) && g7f.b(this.e, sizeElement.e) && this.f == sizeElement.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + tvh.a(this.e, tvh.a(this.d, tvh.a(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }

    public SizeElement(float f, float f2, float f3, float f4, boolean z, Function1 function1) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        this.g = function1;
    }
}
