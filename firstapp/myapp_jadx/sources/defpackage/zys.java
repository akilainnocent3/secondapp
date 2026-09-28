package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zys {

    @c0d(c = "com.sportygames.common.ui.loading.LoadingScreenKt$Content$1$1$1", f = "LoadingScreen.kt", l = {121}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ float b;
        public final /* synthetic */ gzg0<Float> c;
        public final /* synthetic */ isw d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, gzg0<Float> gzg0Var, isw iswVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = f;
            this.c = gzg0Var;
            this.d = iswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                isw iswVar = this.d;
                float fJ = iswVar.j();
                yys yysVar = new yys(iswVar);
                this.a = 1;
                if (sje0.c(fJ, this.b, 0.0f, this.c, yysVar, this, 4) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final void a(int i, androidx.compose.runtime.a aVar) {
        b bVarI = aVar.i(1166681421);
        if (bVarI.q(i & 1, i != 0)) {
            final mmd mmdVar = (mmd) bVarI.O(kna.h);
            tti0.a(j.e(d.a.b, 1.0f), 360.0f, 640.0f, pp8.b(-830725703, new Function2() { // from class: qys
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final mmd mmdVar2 = mmdVar;
                        boolean zM = aVar2.M(mmdVar2);
                        Object objY = aVar2.y();
                        if (zM || objY == a.C0041a.a) {
                            objY = new Function2() { // from class: uys
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    rce0 rce0Var = (rce0) obj3;
                                    final kxa kxaVar = (kxa) obj4;
                                    rce0Var.getClass();
                                    List<vhv> listK = rce0Var.K("content", ac9.a);
                                    final ArrayList arrayList = new ArrayList(l48.r(listK, 10));
                                    Iterator<T> it = listK.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((vhv) it.next()).d0(oxa.b(0, 0, 0, 15)));
                                    }
                                    int i2 = kxa.i(kxaVar.a);
                                    int iH = kxa.h(kxaVar.a);
                                    final mmd mmdVar3 = mmdVar2;
                                    return t.z1(rce0Var, i2, iH, new Function1() { // from class: xys
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            y.a aVar3 = (y.a) obj5;
                                            aVar3.getClass();
                                            ArrayList arrayList2 = arrayList;
                                            int size = arrayList2.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj6 = arrayList2.get(i3);
                                                i3++;
                                                aVar3.s((y) obj6, 0, (kxa.h(kxaVar.a) - ((int) mmdVar3.C1(640.0f))) / 2, 0.0f);
                                            }
                                            return Unit.a;
                                        }
                                    });
                                }
                            };
                            aVar2.r(objY);
                        }
                        f0.a(null, (Function2) objY, aVar2, 0, 1);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3510);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new rys();
        }
    }

    public static final void b(final float f, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(-589938539);
        int i2 = (bVarI.c(f) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            q75.a(j.e(d.a.b, 1.0f), null, false, pp8.b(-1998264833, new gaj() { // from class: vys
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        mmd mmdVar = (mmd) aVar2.O(kna.h);
                        float fA = i7f.a(r75Var.d(), aVar2);
                        boolean zC = aVar2.c(fA) | aVar2.M(mmdVar);
                        float f2 = f;
                        boolean zC2 = zC | aVar2.c(f2);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zC2 || objY == c0042a) {
                            objY = Float.valueOf(fA * f2);
                            aVar2.r(objY);
                        }
                        float fFloatValue = ((Number) objY).floatValue();
                        Object objY2 = aVar2.y();
                        if (objY2 == c0042a) {
                            objY2 = androidx.compose.runtime.j.a(0.0f);
                            aVar2.r(objY2);
                        }
                        isw iswVar = (isw) objY2;
                        Object objY3 = aVar2.y();
                        if (objY3 == c0042a) {
                            objY3 = yi0.e(300, 0, xkf.b, 2);
                            aVar2.r(objY3);
                        }
                        gzg0 gzg0Var = (gzg0) objY3;
                        Float fValueOf = Float.valueOf(fFloatValue);
                        boolean zC3 = aVar2.c(fFloatValue);
                        Object objY4 = aVar2.y();
                        if (zC3 || objY4 == c0042a) {
                            objY4 = new zys.a(fFloatValue, gzg0Var, iswVar, null);
                            aVar2.r(objY4);
                        }
                        xvf.e(aVar2, fValueOf, (Function2) objY4);
                        g75.a(androidx.compose.foundation.a.b(j.w(j.c(d.a.b, 1.0f), mmdVar.v1(iswVar.j())), c68.a(R.color.progress_light_color, aVar2), j060.c(100.0f)), aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3078, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, f) { // from class: wys
                public final /* synthetic */ float a;

                {
                    this.a = f;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zys.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final float f, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(-1952069243);
        int i2 = (bVarI.c(f) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            rg6.a(j.g(j.w(j.i(d.a.b, 8.0f), 287.0f), 1.0f), j060.c(100.0f), fg6.b(gg6.a(bVarI), c68.a(R.color.progress_dark_color, bVarI), 0L, 14), null, null, pp8.b(-1120148397, new gaj() { // from class: sys
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        zys.b(f, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 196614, 24);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, f) { // from class: tys
                public final /* synthetic */ float a;

                {
                    this.a = f;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zys.c(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final float f, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(-1687733530);
        int i2 = (bVarI.c(f) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.b, zk40.a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            a(0, bVarI);
            c(f, bVarI, i2 & 14);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, f) { // from class: pys
                public final /* synthetic */ float a;

                {
                    this.a = f;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zys.d(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
