package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class smz extends d.c implements psr {
    public float D;
    public float E;
    public float F;
    public float G;
    public boolean H;

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        int iY0 = tVar.y0(this.F) + tVar.y0(this.D);
        int iY1 = tVar.y0(this.G) + tVar.y0(this.E);
        final y yVarD0 = vhvVar.d0(oxa.i(-iY0, j, -iY1));
        return t.z1(tVar, oxa.g(yVarD0.a + iY0, j), oxa.f(yVarD0.b + iY1, j), new Function1() { // from class: rmz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                smz smzVar = this.a;
                boolean z = smzVar.H;
                float f = smzVar.D;
                y yVar = yVarD0;
                if (z) {
                    y.a.A(aVar, yVar, aVar.y0(f), aVar.y0(smzVar.E));
                } else {
                    aVar.s(yVar, aVar.y0(f), aVar.y0(smzVar.E), 0.0f);
                }
                return Unit.a;
            }
        });
    }
}
