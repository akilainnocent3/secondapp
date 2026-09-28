package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class r7w {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, final int i, final float f, float f2, final float f3, final inj injVar, final boolean z, float f4, final Function0 function0, a aVar, final int i2) {
        b bVar;
        final float f5;
        final float f6;
        boolean z2;
        boolean z3;
        final float f7;
        Object q7wVar;
        final ytw ytwVar;
        final ytw ytwVar2;
        final String str2 = str;
        Float fValueOf = Float.valueOf(0.0f);
        str2.getClass();
        b bVarI = aVar.i(-2075483406);
        int i3 = (bVarI.M(str2) ? 4 : 2) | i2;
        if ((i2 & 384) == 0) {
            i3 |= bVarI.c(f) ? 256 : 128;
        }
        int i4 = i3 | 3072 | (bVarI.c(f3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.b(z) ? 1048576 : 524288) | 12582912;
        if (bVarI.q(i4 & 1, (38282387 & i4) != 38282386)) {
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(fValueOf);
                bVarI.r(objY);
            }
            final ytw ytwVar3 = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(fValueOf);
                bVarI.r(objY2);
            }
            final ytw ytwVar4 = (ytw) objY2;
            float fC1 = mmdVar.C1(f3);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(fValueOf);
                bVarI.r(objY3);
            }
            ytw ytwVar5 = (ytw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(fValueOf);
                bVarI.r(objY4);
            }
            ytw ytwVar6 = (ytw) objY4;
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new Function1() { // from class: n7w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        urr urrVar = (urr) obj;
                        urrVar.getClass();
                        ytwVar3.setValue(Float.valueOf((int) (urrVar.a() >> 32)));
                        ytwVar4.setValue(Float.valueOf((int) (urrVar.a() & 4294967295L)));
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            }
            d dVarA = v.a(dVarE, (Function1) objY5);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            float f8 = 400.0f;
            if (((Number) ytwVar3.getValue()).floatValue() <= 0.0f || ((Number) ytwVar4.getValue()).floatValue() <= 0.0f) {
                str2 = str;
                bVar = bVarI;
                f8 = 400.0f;
                z2 = true;
                z3 = false;
                f7 = 0.9f;
                bVar.N(866874390);
            } else {
                bVarI.N(868575174);
                float fFloatValue = ((Number) ytwVar4.getValue()).floatValue() * 0.1f;
                if (((Number) ytwVar5.getValue()).floatValue() == 0.0f && ((Number) ytwVar6.getValue()).floatValue() == 0.0f) {
                    ytwVar5.setValue(Float.valueOf(((Number) ytwVar3.getValue()).floatValue()));
                    ytwVar6.setValue(Float.valueOf(fFloatValue));
                }
                Float fValueOf2 = Float.valueOf(((Number) ytwVar3.getValue()).floatValue());
                Float fValueOf3 = Float.valueOf(((Number) ytwVar4.getValue()).floatValue());
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zC = ((3670016 & i4) == 1048576) | bVarI.c(fC1) | ((i4 & 896) == 256);
                Object objY6 = bVarI.y();
                if (zC || objY6 == c0042a) {
                    z2 = true;
                    z3 = false;
                    q7wVar = new q7w(fC1, z, i, f, 400.0f, function0, ytwVar5, ytwVar3, ytwVar6, null);
                    ytwVar = ytwVar5;
                    ytwVar2 = ytwVar6;
                    bVarI.r(q7wVar);
                } else {
                    ytwVar2 = ytwVar6;
                    ytwVar = ytwVar5;
                    z2 = true;
                    q7wVar = objY6;
                    z3 = false;
                }
                xvf.f(fValueOf2, fValueOf3, boolValueOf, (Function2) q7wVar, bVarI);
                nan.a aVar4 = new nan.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                str2 = str;
                aVar4.c = str2;
                abn.a(aVar4, z3);
                nan nanVarA = aVar4.a();
                d dVarR = j.r(aVar2, f3);
                Object objY7 = bVarI.y();
                if (objY7 == c0042a) {
                    f7 = 0.9f;
                    objY7 = new Function1() { // from class: o7w
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.B(((Number) ytwVar.getValue()).floatValue());
                            a7lVar.f(((Number) ytwVar2.getValue()).floatValue());
                            a7lVar.b(f7);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY7);
                } else {
                    f7 = 0.9f;
                }
                fn80.a(nanVarA, null, androidx.compose.ui.graphics.a.a(dVarR, (Function1) objY7), null, null, 0.0f, null, null, null, bVarI, 48, 2040);
                bVar = bVarI;
            }
            bVar.X(z3);
            bVar.X(z2);
            f6 = f7;
            f5 = f8;
        } else {
            bVar = bVarI;
            bVar.G();
            f5 = f2;
            f6 = f4;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: p7w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r7w.a(str2, i, f, f5, f3, injVar, z, f6, function0, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
