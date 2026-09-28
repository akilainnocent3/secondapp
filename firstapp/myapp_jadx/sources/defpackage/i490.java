package defpackage;

import androidx.compose.animation.n;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;

/* JADX INFO: loaded from: classes.dex */
public final class i490 extends qlr implements gaj<t, vhv, kxa, biv> {
    public final /* synthetic */ n a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i490(n nVar) {
        super(3);
        this.a = nVar;
    }

    @Override // defpackage.gaj
    public final biv invoke(t tVar, vhv vhvVar, kxa kxaVar) {
        t tVar2 = tVar;
        y yVarD0 = vhvVar.d0(kxaVar.a);
        return t.z1(tVar2, yVarD0.a, yVarD0.b, new h490(tVar2, this.a, yVarD0));
    }
}
