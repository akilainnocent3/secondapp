package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class m7w {
    /* JADX WARN: Code duplicated, block: B:101:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:102:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:111:0x030b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0313  */
    /* JADX WARN: Code duplicated, block: B:115:0x0336  */
    /* JADX WARN: Code duplicated, block: B:117:0x033a  */
    /* JADX WARN: Code duplicated, block: B:119:0x033e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0341  */
    /* JADX WARN: Code duplicated, block: B:123:0x0344  */
    /* JADX WARN: Code duplicated, block: B:124:0x0347  */
    /* JADX WARN: Code duplicated, block: B:125:0x034a  */
    /* JADX WARN: Code duplicated, block: B:126:0x034c  */
    /* JADX WARN: Code duplicated, block: B:139:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x025a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0284  */
    /* JADX WARN: Code duplicated, block: B:90:0x028a  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a8  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i, final float f, float f2, float f3, final float f4, final boolean z, List list, a aVar, final int i2) {
        b bVar;
        final float f5;
        final float f6;
        float f7;
        boolean z2;
        Object k7wVar;
        yka.a.c cVar;
        final ytw ytwVar;
        int i3;
        final ytw ytwVar2;
        ytw ytwVar3;
        float f8;
        a.C0041a.C0042a c0042a;
        Object l7wVar;
        Object objY;
        int iHashCode;
        yka.a.C1350a c1350a;
        int iHashCode2;
        Iterator itA;
        int i4;
        Object next;
        int i5;
        float f9;
        float f10;
        f4 = f4;
        final List list2 = list;
        Float fValueOf = Float.valueOf(0.0f);
        list2.getClass();
        b bVarI = aVar.i(-1630782697);
        int i6 = i2 | (bVarI.c(f) ? 32 : 16) | 3456 | (bVarI.c(f4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.b(z) ? 131072 : 65536) | (bVarI.A(list2) ? 1048576 : 524288);
        if (bVarI.q(i6 & 1, (599187 & i6) != 599186)) {
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY2 = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (objY2 == c0042a2) {
                objY2 = m.b(fValueOf);
                bVarI.r(objY2);
            }
            final ytw ytwVar4 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a2) {
                objY3 = m.b(fValueOf);
                bVarI.r(objY3);
            }
            final ytw ytwVar5 = (ytw) objY3;
            float fC1 = mmdVar.C1(f4);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a2) {
                objY4 = m.b(fValueOf);
                bVarI.r(objY4);
            }
            ytw ytwVar6 = (ytw) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a2) {
                objY5 = m.b(fValueOf);
                bVarI.r(objY5);
            }
            ytw ytwVar7 = (ytw) objY5;
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            Object objY6 = bVarI.y();
            if (objY6 == c0042a2) {
                objY6 = new Function1() { // from class: h7w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        urr urrVar = (urr) obj;
                        urrVar.getClass();
                        ytwVar4.setValue(Float.valueOf((int) (urrVar.a() >> 32)));
                        ytwVar5.setValue(Float.valueOf((int) (urrVar.a() & 4294967295L)));
                        return Unit.a;
                    }
                };
                bVarI.r(objY6);
            }
            d dVarA = v.a(dVarE, (Function1) objY6);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            if (((Number) ytwVar4.getValue()).floatValue() <= 0.0f || ((Number) ytwVar5.getValue()).floatValue() <= 0.0f) {
                bVar = bVarI;
                f5 = 600.0f;
                f7 = 1.5f;
                z2 = true;
                bVar.N(1544000625);
                bVar.X(false);
            } else {
                bVarI.N(1545962925);
                float fFloatValue = ((Number) ytwVar5.getValue()).floatValue() * 0.01f;
                if (((Number) ytwVar6.getValue()).floatValue() == 0.0f && ((Number) ytwVar7.getValue()).floatValue() == 0.0f) {
                    ytwVar6.setValue(Float.valueOf(((Number) ytwVar4.getValue()).floatValue()));
                    ytwVar7.setValue(Float.valueOf(fFloatValue));
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                Float fValueOf2 = Float.valueOf(((Number) ytwVar4.getValue()).floatValue());
                Float fValueOf3 = Float.valueOf(((Number) ytwVar5.getValue()).floatValue());
                int i7 = i6 & 458752;
                boolean zC = (i7 == 131072) | bVarI.c(fC1) | ((i6 & 112) == 32);
                Object objY7 = bVarI.y();
                if (zC || objY7 == c0042a2) {
                    cVar = cVar2;
                    ytwVar = ytwVar6;
                    i3 = 131072;
                    ytwVar2 = ytwVar7;
                    ytwVar3 = ytwVar4;
                    f8 = fC1;
                    k7wVar = new k7w(z, f8, i, f, ytwVar3, ytwVar, ytwVar2, null);
                    bVarI.r(k7wVar);
                } else {
                    cVar = cVar2;
                    ytwVar = ytwVar6;
                    k7wVar = objY7;
                    ytwVar2 = ytwVar7;
                    i3 = 131072;
                    ytwVar3 = ytwVar4;
                    f8 = fC1;
                }
                xvf.f(boolValueOf, fValueOf2, fValueOf3, (Function2) k7wVar, bVarI);
                Boolean boolValueOf2 = Boolean.valueOf(z);
                boolean zC2 = bVarI.c(f8) | (i7 == i3);
                Object objY8 = bVarI.y();
                if (zC2) {
                    c0042a = c0042a2;
                } else {
                    c0042a = c0042a2;
                    if (objY8 != c0042a) {
                        l7wVar = objY8;
                        f5 = 600.0f;
                        f7 = 1.5f;
                    }
                    xvf.e(bVarI, boolValueOf2, (Function2) l7wVar);
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new Function1() { // from class: i7w
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ((mmd) obj).getClass();
                                int iB = ycv.b(((Number) ytwVar.getValue()).floatValue());
                                return new iwo((((long) ycv.b(((Number) ytwVar2.getValue()).floatValue())) & 4294967295L) | (((long) iB) << 32));
                            }
                        };
                        bVarI.r(objY);
                    }
                    d dVarB = g.b(aVar2, (Function1) objY);
                    aiv aivVarC2 = g75.c(n54Var, false);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    d dVarC2 = c.c(bVarI, dVarB);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC2, bVar2);
                    hlh0.a(bVarI, ne00VarS2, dVar);
                    if (bVarI.S && Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        c1350a = c1350a2;
                    } else {
                        c1350a = c1350a2;
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    yka.a.c cVar3 = cVar;
                    hlh0.a(bVarI, dVarC2, cVar3);
                    d dVarR = j.r(aVar2, f4 * 2.0f);
                    aiv aivVarC3 = g75.c(n54Var, false);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS3 = bVarI.S();
                    d dVarC3 = c.c(bVarI, dVarR);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC3, bVar2);
                    hlh0.a(bVarI, ne00VarS3, dVar);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    list2 = list;
                    itA = yt1.a(bVarI, dVarC3, cVar3, 155638230, list2);
                    i4 = 0;
                    while (itA.hasNext()) {
                        next = itA.next();
                        i5 = i4 + 1;
                        if (i4 >= 0) {
                            kotlin.collections.b.q();
                            throw null;
                        }
                        nan.a aVar4 = new nan.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                        aVar4.c = (String) next;
                        abn.a(aVar4, false);
                        nan nanVarA = aVar4.a();
                        d dVarR2 = j.r(aVar2, f4);
                        if (i4 % 2 == 0) {
                            f9 = 0.0f;
                        } else {
                            f9 = f4;
                        }
                        if (i4 != 1) {
                            f10 = (-f4) / 3.0f;
                        } else if (i4 != 2) {
                            f10 = f4;
                        } else if (i4 != 3) {
                            f10 = 0.0f;
                        } else {
                            f10 = f4 / 2.0f;
                        }
                        b bVar3 = bVarI;
                        fn80.a(nanVarA, null, g.c(dVarR2, f9, f10), null, null, 0.0f, null, null, null, bVar3, 48, 2040);
                        bVarI = bVar3;
                        i4 = i5;
                    }
                    bVar = bVarI;
                    z2 = true;
                    mx4.a(bVar, false, true, true, false);
                }
                ytw ytwVar8 = ytwVar2;
                ytw ytwVar9 = ytwVar;
                l7wVar = new l7w(z, f8, i, 600.0f, 1.5f, ytwVar3, ytwVar9, ytwVar8, null);
                f5 = 600.0f;
                f7 = 1.5f;
                ytwVar = ytwVar9;
                ytwVar2 = ytwVar8;
                bVarI.r(l7wVar);
                xvf.e(bVarI, boolValueOf2, (Function2) l7wVar);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new Function1() { // from class: i7w
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((mmd) obj).getClass();
                            int iB = ycv.b(((Number) ytwVar.getValue()).floatValue());
                            return new iwo((((long) ycv.b(((Number) ytwVar2.getValue()).floatValue())) & 4294967295L) | (((long) iB) << 32));
                        }
                    };
                    bVarI.r(objY);
                }
                d dVarB2 = g.b(aVar2, (Function1) objY);
                aiv aivVarC4 = g75.c(n54Var, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarB2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC4, bVar2);
                hlh0.a(bVarI, ne00VarS4, dVar);
                if (bVarI.S) {
                    c1350a = c1350a2;
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    c1350a = c1350a2;
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                yka.a.c cVar4 = cVar;
                hlh0.a(bVarI, dVarC4, cVar4);
                d dVarR3 = j.r(aVar2, f4 * 2.0f);
                aiv aivVarC5 = g75.c(n54Var, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS5 = bVarI.S();
                d dVarC5 = c.c(bVarI, dVarR3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC5, bVar2);
                hlh0.a(bVarI, ne00VarS5, dVar);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                list2 = list;
                itA = yt1.a(bVarI, dVarC5, cVar4, 155638230, list2);
                i4 = 0;
                while (itA.hasNext()) {
                    next = itA.next();
                    i5 = i4 + 1;
                    if (i4 >= 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    nan.a aVar5 = new nan.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                    aVar5.c = (String) next;
                    abn.a(aVar5, false);
                    nan nanVarA2 = aVar5.a();
                    d dVarR4 = j.r(aVar2, f4);
                    if (i4 % 2 == 0) {
                        f9 = 0.0f;
                    } else {
                        f9 = f4;
                    }
                    if (i4 != 1) {
                        f10 = (-f4) / 3.0f;
                    } else if (i4 != 2) {
                        f10 = f4;
                    } else if (i4 != 3) {
                        f10 = 0.0f;
                    } else {
                        f10 = f4 / 2.0f;
                    }
                    b bVar4 = bVarI;
                    fn80.a(nanVarA2, null, g.c(dVarR4, f9, f10), null, null, 0.0f, null, null, null, bVar4, 48, 2040);
                    bVarI = bVar4;
                    i4 = i5;
                }
                bVar = bVarI;
                z2 = true;
                mx4.a(bVar, false, true, true, false);
            }
            bVar.X(z2);
            f6 = f7;
        } else {
            bVar = bVarI;
            bVar.G();
            f5 = f2;
            f6 = f3;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, f, f5, f6, f4, z, list2, i2) { // from class: j7w
                public final /* synthetic */ int a;
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ List i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    m7w.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
