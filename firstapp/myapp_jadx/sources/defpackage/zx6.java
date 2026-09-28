package defpackage;

import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class zx6 implements aiv {
    public final /* synthetic */ float a;
    public final /* synthetic */ olf0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ imf0 d;

    public zx6(float f, olf0 olf0Var, String str, imf0 imf0Var) {
        this.a = f;
        this.b = olf0Var;
        this.c = str;
        this.d = imf0Var;
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        list.getClass();
        vhv vhvVar = list.get(0);
        vhv vhvVar2 = list.get(1);
        vhv vhvVar3 = list.get(2);
        final int iY0 = tVar.y0(this.a);
        int iY1 = tVar.y0(24.0f);
        if (!((iY1 >= 0) & (iY1 >= 0))) {
            ykn.a("width and height must be >= 0");
        }
        final y yVarD0 = vhvVar.d0(oxa.h(iY1, iY1, iY1, iY1));
        int i = (kxa.i(j) - yVarD0.a) - iY0;
        if (i < 0) {
            i = 0;
        }
        int i2 = (int) ((((long) i) * 3) / 7);
        int i3 = i - i2;
        boolean z = olf0.a(this.b, this.c, this.d, oxa.b(0, i2, 0, 13), 988).b.f <= 1;
        final y yVarD1 = vhvVar2.d0(oxa.b(i2, i2, 0, 12));
        final y yVarD2 = vhvVar3.d0(oxa.b(i3, i3, 0, 12));
        int iMax = Math.max(yVarD0.b, yVarD1.b);
        final int i4 = z ? (iMax - yVarD0.b) / 2 : 0;
        final int i5 = z ? (iMax - yVarD1.b) / 2 : 0;
        return t.z1(tVar, kxa.i(j), Math.max(yVarD0.b + i4, Math.max(yVarD1.b + i5, yVarD2.b + i5)), new Function1() { // from class: yx6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                aVar.getClass();
                y yVar = yVarD0;
                y.a.A(aVar, yVar, 0, i4);
                int i6 = yVar.a;
                int i7 = iY0;
                y yVar2 = yVarD1;
                y.a.A(aVar, yVar2, i6 + i7, i5);
                y.a.A(aVar, yVarD2, yVar.a + i7 + yVar2.a, i5);
                return Unit.a;
            }
        });
    }
}
