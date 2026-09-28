package defpackage;

import android.graphics.Canvas;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ro40 {
    public static final void a(final int i, a aVar, final d dVar, final String str, final Function0 function0) {
        int i2;
        b bVar;
        ytw ytwVar;
        Object obj;
        function0.getClass();
        b bVarI = aVar.i(-1443329970);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            final crz crzVarA = erz.a(R.drawable.red_button_stroke, 0, bVarI);
            final crz crzVarA2 = erz.a(R.drawable.red_button_content, 0, bVarI);
            final float fB = mla.b(1.5f, bVarI);
            final float f = fB / 2.0f;
            final float fB2 = mla.b(5.0f, bVarI) - f;
            final float f2 = fB2 - f;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar2 = (ytw) objY;
            d dVarC = androidx.compose.ui.graphics.a.c(j.i(dVar, 44.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, 458751);
            boolean zC = bVarI.c(fB) | bVarI.c(f2) | bVarI.A(crzVarA2) | bVarI.c(f) | bVarI.c(fB2) | bVarI.A(crzVarA);
            Object objY2 = bVarI.y();
            if (zC || objY2 == c0042a) {
                ytwVar = ytwVar2;
                obj = new Function1() { // from class: no40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        crz crzVar = crzVarA2;
                        lza lzaVar = (lza) obj2;
                        lzaVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                        final float f3 = fB;
                        float f4 = 2.0f * f3;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f4;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat - f4)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                        lc6 lc6VarA = lzaVar.F1().a();
                        long j = j58.g;
                        float f5 = f2;
                        tcf.d1(lzaVar, j, jFloatToRawIntBits2, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), null, 0.0f, 240);
                        lk40 lk40VarB = pk40.b(0L, lzaVar.d());
                        b90 b90VarA = c90.a();
                        b90VarA.c(5);
                        try {
                            lc6VarA.s(lk40VarB, b90VarA);
                            crzVar.g(lzaVar, lzaVar.d(), 1.0f, null);
                            lzaVar.b2();
                            lc6VarA.f();
                            final float f6 = f;
                            final float f7 = fB2;
                            final crz crzVar2 = crzVarA;
                            Function1 function1 = new Function1() { // from class: po40
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    tcf tcfVar = (tcf) obj3;
                                    tcfVar.getClass();
                                    lc6 lc6VarA2 = tcfVar.F1().a();
                                    long j2 = j58.g;
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                                    float f8 = f3;
                                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) - f8)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3 - f8) << 32);
                                    float f9 = f6;
                                    long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
                                    float f10 = f7;
                                    tcf.d1(tcfVar, j2, jFloatToRawIntBits4, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), new yae0(f8, 0.0f, 0, 0, null, 30), 0.0f, 224);
                                    lk40 lk40VarB2 = pk40.b(0L, tcfVar.d());
                                    b90 b90VarA2 = c90.a();
                                    b90VarA2.c(5);
                                    Unit unit = Unit.a;
                                    lc6VarA2.s(lk40VarB2, b90VarA2);
                                    crzVar2.g(tcfVar, tcfVar.d(), 1.0f, null);
                                    return Unit.a;
                                }
                            };
                            Canvas canvasC = i40.c(lzaVar.F1().a());
                            int iSaveLayer = canvasC.saveLayer(null, null);
                            function1.invoke(lzaVar);
                            canvasC.restoreToCount(iSaveLayer);
                            return Unit.a;
                        } catch (Throwable th) {
                            lc6VarA.f();
                            throw th;
                        }
                    }
                };
                bVarI.r(obj);
            } else {
                obj = objY2;
                ytwVar = ytwVar2;
            }
            d dVarC2 = androidx.compose.ui.draw.a.c(dVarC, (Function1) obj);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = rzk.a(bVarI);
            }
            d dVarB = androidx.compose.foundation.d.b(dVarC2, (psw) objY3, ut50.b(0.0f, 7, 0L, false), false, null, function0, 28);
            Unit unit = Unit.a;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new qo40(ytwVar);
                bVarI.r(objY4);
            }
            d dVarH = h.h(wje0.a(dVarB, unit, (PointerInputEventHandler) objY4), 12.0f, 0.0f, 2);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarH);
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
            hlh0.a(bVarI, dVarC3, yka.a.d);
            lkf0.d(str, null, c68.a(R.color.brand_tertiary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, (i3 >> 3) & 14, 0, 130042);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: oo40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ro40.a(qj40.a(i | 1), (a) obj2, dVar, str, function0);
                    return Unit.a;
                }
            };
        }
    }
}
