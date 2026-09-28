package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;

/* JADX INFO: loaded from: classes.dex */
public final class hf0 extends qlr implements gaj<t, vhv, kxa, biv> {
    public final /* synthetic */ f0b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf0(f0b f0bVar) {
        super(3);
        this.a = f0bVar;
    }

    @Override // defpackage.gaj
    public final biv invoke(t tVar, vhv vhvVar, kxa kxaVar) {
        y yVarD0 = vhvVar.d0(kxaVar.a);
        return t.z1(tVar, yVarD0.a, yVarD0.b, new gf0(yVarD0, this.a));
    }
}
