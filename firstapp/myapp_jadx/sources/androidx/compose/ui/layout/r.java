package androidx.compose.ui.layout;

import defpackage.glt;
import defpackage.urr;
import defpackage.ykt;
import defpackage.ywx;
import defpackage.zkt;

/* JADX INFO: loaded from: classes.dex */
public final class r implements glt {
    @Override // defpackage.glt
    public final urr e(urr urrVar) {
        zkt zktVar;
        zkt zktVar2 = urrVar instanceof zkt ? (zkt) urrVar : null;
        if (zktVar2 != null) {
            return zktVar2;
        }
        ywx ywxVar = (ywx) urrVar;
        ykt yktVarX1 = ywxVar.x1();
        return (yktVarX1 == null || (zktVar = yktVarX1.H) == null) ? ywxVar : zktVar;
    }
}
