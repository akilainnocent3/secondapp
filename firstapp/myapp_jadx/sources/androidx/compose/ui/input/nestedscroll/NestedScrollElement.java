package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.d;
import defpackage.flx;
import defpackage.glx;
import defpackage.llx;
import defpackage.mlx;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Lp3w;", "Lllx;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NestedScrollElement extends p3w<llx> {
    public final flx b;
    public final glx c;

    public NestedScrollElement(flx flxVar, glx glxVar) {
        this.b = flxVar;
        this.c = glxVar;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new llx(this.b, this.c);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        llx llxVar = (llx) cVar;
        llxVar.D = this.b;
        glx glxVar = llxVar.E;
        if (glxVar.a == llxVar) {
            glxVar.a = null;
        }
        glx glxVar2 = this.c;
        if (glxVar2 == null) {
            glxVar = new glx();
            llxVar.E = glxVar;
        } else if (glxVar2 != glxVar) {
            llxVar.E = glxVar2;
            glxVar = glxVar2;
        }
        if (llxVar.C) {
            glxVar.a = llxVar;
            glxVar.b = null;
            llxVar.F = null;
            glxVar.c = new mlx(llxVar);
            llxVar.E.d = llxVar.d2();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return Intrinsics.g(nestedScrollElement.b, this.b) && Intrinsics.g(nestedScrollElement.c, this.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        glx glxVar = this.c;
        return iHashCode + (glxVar != null ? glxVar.hashCode() : 0);
    }
}
