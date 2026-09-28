package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k600 {
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public static final void a(final int i, final int i2, final long j, a aVar, d dVar, final String str) {
        d dVar2;
        boolean z;
        b bVar;
        final d dVar3;
        e eVarZ;
        d dVar4;
        b bVarI = aVar.i(-1534311358);
        int i3 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.e(j) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i4 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                bVar = bVarI;
                lkf0.d(str, dVar4, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVar, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0, 131064);
                dVar3 = dVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar3 = dVar2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: j600
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k600.a(qj40.a(i | 1), i2, j, (a) obj, dVar3, str);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        dVar2 = dVar;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            if (i4 != 0) {
                dVar4 = d.a.b;
            } else {
                dVar4 = dVar2;
            }
            bVar = bVarI;
            lkf0.d(str, dVar4, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVar, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0, 131064);
            dVar3 = dVar4;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar3 = dVar2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: j600
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k600.a(qj40.a(i | 1), i2, j, (a) obj, dVar3, str);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void b(final UiText uiText, final UiText uiText2, final d dVar, int i, a aVar, final int i2, final int i3) {
        final int i4;
        int i5;
        boolean z;
        e eVarZ;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        uiText.getClass();
        uiText2.getClass();
        b bVarI = aVar.i(-330449678);
        int i6 = (bVarI.M(uiText) ? 4 : 2) | i2 | (bVarI.M(uiText2) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i6 |= bVarI.M(dVar) ? 256 : 128;
        }
        if ((i3 & 8) == 0) {
            i4 = i;
            int i7 = bVarI.d(i4) ? 2048 : 1024;
            i5 = i6 | i7;
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i5 & 1, z)) {
                bVarI.A0();
                if ((i2 & 1) == 0 && !bVarI.h0()) {
                    bVarI.G();
                } else if ((i3 & 8) != 0) {
                    i4 = R.color.text_type1_primary;
                }
                bVarI.Y();
                Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                long jA = c68.a(i4, bVarI);
                d160 d160VarA = b160.a(kw0.b, ht.a.k, bVarI, 54);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVar);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                a(384, 0, jA, bVarI, h.j(d.a.b, 0.0f, 0.0f, 10.0f, 0.0f, 11), uiText.g(context));
                a(0, 4, jA, bVarI, null, uiText2.e(context).toString());
                bVarI.X(true);
            } else {
                bVarI.G();
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: i600
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k600.b(uiText, uiText2, dVar, i4, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 = i;
        i5 = i6 | i7;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i5 & 1, z)) {
            bVarI.A0();
            if ((i2 & 1) == 0) {
                if ((i3 & 8) != 0) {
                    i4 = R.color.text_type1_primary;
                }
            } else if ((i3 & 8) != 0) {
                i4 = R.color.text_type1_primary;
            }
            bVarI.Y();
            Context context2 = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            long jA2 = c68.a(i4, bVarI);
            d160 d160VarA2 = b160.a(kw0.b, ht.a.k, bVarI, 54);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVar);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            a(384, 0, jA2, bVarI, h.j(d.a.b, 0.0f, 0.0f, 10.0f, 0.0f, 11), uiText.g(context2));
            a(0, 4, jA2, bVarI, null, uiText2.e(context2).toString());
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: i600
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k600.b(uiText, uiText2, dVar, i4, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }
}
