package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a3f0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ zp70 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ op8 c;
    public final /* synthetic */ Function2<a, Integer, Unit> d;
    public final /* synthetic */ op8 e;
    public final /* synthetic */ int f;

    public a3f0(zp70 zp70Var, float f, op8 op8Var, Function2 function2, op8 op8Var2, int i) {
        this.a = zp70Var;
        this.b = f;
        this.c = op8Var;
        this.d = function2;
        this.e = op8Var2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = xvf.i(e.a, aVar2);
                aVar2.r(objY);
            }
            v5b v5bVar = (v5b) objY;
            goh gohVarB = a6w.b(z5w.a, aVar2);
            zp70 zp70Var = this.a;
            boolean zM = aVar2.M(zp70Var) | aVar2.M(v5bVar);
            Object objY2 = aVar2.y();
            if (zM || objY2 == c0042a) {
                objY2 = new jr70(zp70Var, v5bVar, gohVarB);
                aVar2.r(objY2);
            }
            final jr70 jr70Var = (jr70) objY2;
            d dVarB = ls7.b(i780.a(op70.b(j.C(j.g(d.a.b, 1.0f), ht.a.d, 2), zp70Var, false, true, false)));
            boolean zC = aVar2.c(this.b);
            final op8 op8Var = this.c;
            boolean zM2 = zC | aVar2.M(op8Var) | aVar2.M(this.d);
            final op8 op8Var2 = this.e;
            boolean zM3 = zM2 | aVar2.M(op8Var2) | aVar2.A(jr70Var) | aVar2.d(this.f);
            Object objY3 = aVar2.y();
            if (zM3 || objY3 == c0042a) {
                final float f = this.b;
                final Function2<a, Integer, Unit> function2 = this.d;
                final int i = this.f;
                Function2 function3 = new Function2() { // from class: x2f0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        final rce0 rce0Var = (rce0) obj;
                        final kxa kxaVar = (kxa) obj2;
                        int iY0 = rce0Var.y0(90.0f);
                        final int iY1 = rce0Var.y0(f);
                        List<vhv> listK = rce0Var.K(l3f0.a, op8Var);
                        Integer numValueOf = 0;
                        int size = listK.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), listK.get(i2).x(Reader.READ_DONE)));
                        }
                        final int iIntValue2 = numValueOf.intValue();
                        long jB = kxa.b(iY0, 0, iIntValue2, iIntValue2, 2, kxaVar.a);
                        final ArrayList arrayList = new ArrayList();
                        final ArrayList arrayList2 = new ArrayList();
                        int size2 = listK.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            vhv vhvVar = listK.get(i3);
                            y yVarD0 = vhvVar.d0(jB);
                            float fU1 = rce0Var.u1(Math.min(vhvVar.b0(yVarD0.b), yVarD0.a)) - (w1f0.b * 2.0f);
                            arrayList.add(yVarD0);
                            arrayList2.add(new g7f(fU1));
                        }
                        Integer numValueOf2 = Integer.valueOf(iY1 * 2);
                        int size3 = arrayList.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((y) arrayList.get(i4)).a);
                        }
                        final int iIntValue3 = numValueOf2.intValue();
                        final Function2 function4 = function2;
                        final jr70 jr70Var2 = jr70Var;
                        final int i5 = i;
                        final op8 op8Var3 = op8Var2;
                        return t.z1(rce0Var, iIntValue3, iIntValue2, new Function1() { // from class: y2f0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                rce0 rce0Var2;
                                int i6;
                                int i7;
                                y.a aVar3 = (y.a) obj3;
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = arrayList;
                                int size4 = arrayList4.size();
                                int i8 = iY1;
                                int i9 = i8;
                                int i10 = 0;
                                while (true) {
                                    rce0Var2 = rce0Var;
                                    if (i10 >= size4) {
                                        break;
                                    }
                                    y yVar = (y) arrayList4.get(i10);
                                    y.a.A(aVar3, yVar, i9, 0);
                                    arrayList3.add(new z1f0(rce0Var2.u1(i9), rce0Var2.u1(yVar.a), ((g7f) arrayList2.get(i10)).a));
                                    i9 += yVar.a;
                                    i10++;
                                }
                                List<vhv> listK2 = rce0Var2.K(l3f0.b, function4);
                                int size5 = listK2.size();
                                int i11 = 0;
                                while (true) {
                                    i6 = iIntValue3;
                                    i7 = iIntValue2;
                                    if (i11 >= size5) {
                                        break;
                                    }
                                    y yVarD1 = listK2.get(i11).d0(kxa.b(i6, i6, 0, 0, 8, kxaVar.a));
                                    y.a.A(aVar3, yVarD1, 0, i7 - yVarD1.b);
                                    i11++;
                                }
                                List<vhv> listK3 = rce0Var2.K(l3f0.c, new op8(2125766411, new z2f0(op8Var3, arrayList3), true));
                                int size6 = listK3.size();
                                for (int i12 = 0; i12 < size6; i12++) {
                                    vhv vhvVar2 = listK3.get(i12);
                                    if (!((i6 >= 0) & (i7 >= 0))) {
                                        ykn.a("width and height must be >= 0");
                                    }
                                    y.a.A(aVar3, vhvVar2.d0(oxa.h(i6, i6, i7, i7)), 0, 0);
                                }
                                jr70Var2.a(rce0Var2, i8, arrayList3, i5);
                                return Unit.a;
                            }
                        });
                    }
                };
                aVar2.r(function3);
                objY3 = function3;
            }
            f0.a(dVarB, (Function2) objY3, aVar2, 0, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
