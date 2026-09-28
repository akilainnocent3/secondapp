package androidx.compose.foundation.layout;

import defpackage.g7f;
import defpackage.ihh0;
import defpackage.p3w;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Lp3w;", "Lihh0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class UnspecifiedConstraintsElement extends p3w<ihh0> {
    public final float b;
    public final float c;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        ihh0 ihh0Var = new ihh0();
        ihh0Var.D = this.b;
        ihh0Var.E = this.c;
        return ihh0Var;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ihh0 ihh0Var = (ihh0) cVar;
        ihh0Var.D = this.b;
        ihh0Var.E = this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return g7f.b(this.b, unspecifiedConstraintsElement.b) && g7f.b(this.c, unspecifiedConstraintsElement.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
