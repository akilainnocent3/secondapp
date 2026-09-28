package androidx.compose.foundation;

import defpackage.p3w;
import defpackage.psw;
import defpackage.zkm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Lp3w;", "Lzkm;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class HoverableElement extends p3w<zkm> {
    public final psw b;

    public HoverableElement(psw pswVar) {
        this.b = pswVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        zkm zkmVar = new zkm();
        zkmVar.D = this.b;
        return zkmVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        zkm zkmVar = (zkm) cVar;
        psw pswVar = zkmVar.D;
        psw pswVar2 = this.b;
        if (Intrinsics.g(pswVar, pswVar2)) {
            return;
        }
        zkmVar.r2();
        zkmVar.D = pswVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && Intrinsics.g(((HoverableElement) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }
}
