package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class dcq {
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void a(d dVar, final glq glqVar, boolean z, a aVar, final int i, final int i2) {
        final d dVar2;
        int i3;
        boolean z2;
        boolean z3;
        final boolean z4;
        e eVarZ;
        d dVar3;
        boolean z5;
        d dVarF;
        glqVar.getClass();
        b bVarI = aVar.i(1991412319);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i5 = i3 | (bVarI.M(glqVar) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i5 |= bVarI.b(z2) ? 256 : 128;
            }
            if ((i5 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i5 & 1, z3)) {
                if (i4 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (glqVar.equals(glq.a.a)) {
                    bVarI.N(-218702094);
                    h9n.a(erz.a(R.drawable.ic_codehub_default_league_logo, 0, bVarI), "flag", j.r(dVar3, 24.0f), null, null, 0.0f, null, bVarI, 48, 120);
                    bVarI.X(false);
                } else {
                    if (glqVar instanceof glq.b) {
                        throw igf0.a(bVarI, -1808171382, false);
                    }
                    bVarI.N(-218421358);
                    bVarI.N(-1808156990);
                    dVarF = h.f(j.r(dVar3, 24.0f), 0.5f);
                    if (z5) {
                        bVarI.N(-153812213);
                        dVarF = d35.a(dVarF, 1.0f, ((lib0) bVarI.O(oib0.a)).A, j060.a);
                        bVarI.X(false);
                    } else {
                        bVarI.N(-153558447);
                        bVarI.X(false);
                    }
                    bVarI.X(false);
                    mw90.a(((glq.b) glqVar).a, "flag", h.f(dVarF, 0.5f), null, null, null, null, bVarI, 48, 2040);
                    bVarI.X(false);
                }
                z4 = z5;
                dVar2 = dVar3;
            } else {
                bVarI.G();
                z4 = z2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ccq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        dcq.a(dVar2, glqVar, z4, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i5 |= 384;
        z2 = z;
        if ((i5 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i5 & 1, z3)) {
            if (i4 != 0) {
                dVar3 = d.a.b;
            } else {
                dVar3 = dVar2;
            }
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (glqVar.equals(glq.a.a)) {
                bVarI.N(-218702094);
                h9n.a(erz.a(R.drawable.ic_codehub_default_league_logo, 0, bVarI), "flag", j.r(dVar3, 24.0f), null, null, 0.0f, null, bVarI, 48, 120);
                bVarI.X(false);
            } else {
                if (glqVar instanceof glq.b) {
                    throw igf0.a(bVarI, -1808171382, false);
                }
                bVarI.N(-218421358);
                bVarI.N(-1808156990);
                dVarF = h.f(j.r(dVar3, 24.0f), 0.5f);
                if (z5) {
                    bVarI.N(-153812213);
                    dVarF = d35.a(dVarF, 1.0f, ((lib0) bVarI.O(oib0.a)).A, j060.a);
                    bVarI.X(false);
                } else {
                    bVarI.N(-153558447);
                    bVarI.X(false);
                }
                bVarI.X(false);
                mw90.a(((glq.b) glqVar).a, "flag", h.f(dVarF, 0.5f), null, null, null, null, bVarI, 48, 2040);
                bVarI.X(false);
            }
            z4 = z5;
            dVar2 = dVar3;
        } else {
            bVarI.G();
            z4 = z2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ccq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dcq.a(dVar2, glqVar, z4, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
