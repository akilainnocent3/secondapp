package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class uca implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ Function0 A;
    public final /* synthetic */ ytw B;
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ h5h e;
    public final /* synthetic */ gaj f;
    public final /* synthetic */ zzr i;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ v5b y;
    public final /* synthetic */ Function0 z;

    public uca(List list, int i, int i2, boolean z, h5h h5hVar, gaj gajVar, zzr zzrVar, int i3, int i4, v5b v5bVar, Function0 function0, Function0 function1, ytw ytwVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = h5hVar;
        this.f = gajVar;
        this.i = zzrVar;
        this.v = i3;
        this.w = i4;
        this.y = v5bVar;
        this.z = function0;
        this.A = function1;
        this.B = ytwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        a.C0041a.C0042a c0042a;
        int i2;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            cok cokVar = (cok) this.a.get(iIntValue);
            aVar2.N(1726244911);
            ytw ytwVar = this.B;
            Integer num3 = (Integer) ytwVar.getValue();
            boolean z = num3 != null && num3.intValue() == iIntValue;
            int i3 = (i & 112) ^ 48;
            boolean zM = ((i3 > 32 && aVar2.d(iIntValue)) || (i & 48) == 32) | aVar2.M(this.i) | aVar2.d(this.v) | aVar2.d(this.w) | aVar2.A(this.y) | aVar2.M(this.z);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (zM || objY == c0042a2) {
                c0042a = c0042a2;
                i2 = i3;
                qca qcaVar = new qca(iIntValue, this.i, this.v, this.w, this.y, this.z, this.B);
                aVar2.r(qcaVar);
                objY = qcaVar;
            } else {
                i2 = i3;
                c0042a = c0042a2;
            }
            Function0 function0 = (Function0) objY;
            boolean z2 = (i2 > 32 && aVar2.d(iIntValue)) || (i & 48) == 32;
            Function0 function1 = this.A;
            boolean zM2 = aVar2.M(function1) | z2;
            Object objY2 = aVar2.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = new rca(iIntValue, function1, ytwVar);
                aVar2.r(objY2);
            }
            vca.h(this.b, this.c, this.d, cokVar, this.e, z, this.f, function0, (Function0) objY2, aVar2, 0);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
