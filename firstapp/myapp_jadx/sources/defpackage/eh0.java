package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class eh0 extends qlr implements gaj<t, vhv, kxa, biv> {
    public final /* synthetic */ Function1<Object, Boolean> a;
    public final /* synthetic */ dtg0<Object> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh0(Function1<Object, Boolean> function1, dtg0<Object> dtg0Var) {
        super(3);
        this.a = function1;
        this.b = dtg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    @Override // defpackage.gaj
    public final biv invoke(t tVar, vhv vhvVar, kxa kxaVar) {
        long j;
        t tVar2 = tVar;
        y yVarD0 = vhvVar.d0(kxaVar.a);
        if (tVar2.q0()) {
            if (this.a.invoke(((x5a0) this.b.d).getValue()).booleanValue()) {
                j = (((long) yVarD0.a) << 32) | (((long) yVarD0.b) & 4294967295L);
            } else {
                j = 0;
            }
        } else {
            j = (((long) yVarD0.a) << 32) | (((long) yVarD0.b) & 4294967295L);
        }
        return t.z1(tVar2, (int) (j >> 32), (int) (4294967295L & j), new dh0(yVarD0));
    }
}
