package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.google.protobuf.Reader;
import java.io.FileNotFoundException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class v0f {
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final void a(final int i, final int i2, a aVar, final d dVar, boolean z) throws FileNotFoundException {
        boolean z2;
        boolean z3;
        b bVar;
        final boolean z4;
        e eVarZ;
        ont ontVarC;
        final fmt fmtVarA;
        float f;
        boolean zM;
        Object objY;
        b bVarI = aVar.i(-1319470834);
        int i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i4 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                ontVarC = i350.c(new pnt.f("https://s.sporty.net/cms/Sporty_Penalty_Winning_6ef3822b22.json"), bVarI, 6);
                fmtVarA = bf0.a(ontVarC.getValue(), false, false, 0.0f, z4 ? Reader.READ_DONE : 1, bVarI, 958);
                if (ontVarC.getValue() != null || fmtVarA.getValue().floatValue() < 0.9f) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                twd0 twd0VarB = xe0.b(f, yi0.e(1000, 0, null, 6), "winning_popup_background_alpha", null, bVarI, 3120, 20);
                xmt value = ontVarC.getValue();
                zM = bVarI.M(fmtVarA);
                objY = bVarI.y();
                if (zM || objY == a.C0041a.a) {
                    objY = new Function0() { // from class: t0f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(fmtVarA.getValue().floatValue());
                        }
                    };
                    bVarI.r(objY);
                }
                bVar = bVarI;
                mmt.b(value, (Function0) objY, dw.a(dVar, ((Number) twd0VarB.getValue()).floatValue()), false, false, false, false, null, false, null, ht.a.h, d0b.a.c, false, false, null, null, false, bVar, 0, 54, 127992);
            } else {
                bVar = bVarI;
                bVar.G();
                z4 = z2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: u0f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                        ((Integer) obj2).getClass();
                        v0f.a(qj40.a(i | 1), i2, (a) obj, dVar, z4);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            if (i4 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            ontVarC = i350.c(new pnt.f("https://s.sporty.net/cms/Sporty_Penalty_Winning_6ef3822b22.json"), bVarI, 6);
            fmtVarA = bf0.a(ontVarC.getValue(), false, false, 0.0f, z4 ? Reader.READ_DONE : 1, bVarI, 958);
            if (ontVarC.getValue() != null) {
                f = 1.0f;
            } else {
                f = 1.0f;
            }
            twd0 twd0VarB2 = xe0.b(f, yi0.e(1000, 0, null, 6), "winning_popup_background_alpha", null, bVarI, 3120, 20);
            xmt value2 = ontVarC.getValue();
            zM = bVarI.M(fmtVarA);
            objY = bVarI.y();
            if (zM) {
                objY = new Function0() { // from class: t0f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(fmtVarA.getValue().floatValue());
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function0() { // from class: t0f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(fmtVarA.getValue().floatValue());
                    }
                };
                bVarI.r(objY);
            }
            bVar = bVarI;
            mmt.b(value2, (Function0) objY, dw.a(dVar, ((Number) twd0VarB2.getValue()).floatValue()), false, false, false, false, null, false, null, ht.a.h, d0b.a.c, false, false, null, null, false, bVar, 0, 54, 127992);
        } else {
            bVar = bVarI;
            bVar.G();
            z4 = z2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: u0f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    ((Integer) obj2).getClass();
                    v0f.a(qj40.a(i | 1), i2, (a) obj, dVar, z4);
                    return Unit.a;
                }
            };
        }
    }
}
