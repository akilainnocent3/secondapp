package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qpa0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final void a(boolean z, final gwt gwtVar, d dVar, a aVar, final int i) {
        final boolean z2;
        final d dVar2;
        String str;
        i060 i060Var;
        d dVar3;
        ?? r0;
        b bVarI = aVar.i(-647973616);
        int i2 = i | (bVarI.b(z) ? 4 : 2) | (bVarI.A(gwtVar) ? 32 : 16) | 384;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            String str2 = z ? "muted" : "unmuted";
            long j = j58.f;
            long jC = j58.c(0.25f, j);
            i060 i060Var2 = j060.a;
            d dVarA = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(dVarA, jC, i060Var2);
            if (z) {
                bVarI.N(2096426803);
                dVar3 = dVarB;
                i060Var = i060Var2;
                str = str2;
                dVar2 = dVarA;
                r0 = 0;
                hfs hfsVarA = p590.a(kotlin.collections.b.k(new j58(j58.c(0.0f, j)), new j58(j58.c(0.4f, j)), new j58(j58.c(0.0f, j))), null, 2500, 0L, null, bVarI, 24960, 107);
                bVarI = bVarI;
                dVarA = androidx.compose.foundation.a.a(dVar2, hfsVarA, i060Var, 0.0f, 4);
                bVarI.X(false);
            } else {
                str = str2;
                i060Var = i060Var2;
                dVar3 = dVarB;
                dVar2 = dVarA;
                r0 = 0;
                bVarI.N(2096740058);
                bVarI.X(false);
            }
            d dVarA2 = ls7.a(j.r(dVar2, 40.0f).n(dVar3).n(dVarA), i060Var);
            ?? r6 = (i2 & 112) == 32 ? 1 : r0;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (r6 != 0 || objY == c0042a) {
                objY = new yx0(gwtVar, 2);
                bVarI.r(objY);
            }
            d dVarH = g3w.h(g3w.f(dVarA2, true, (Function0) objY), "winning_dialog_sound_icon");
            final String str3 = str;
            ?? r5 = (bVarI.M(str3) ? 1 : 0) | ((i2 & 14) == 4 ? 1 : r0);
            Object objY2 = bVarI.y();
            if (r5 != 0 || objY2 == c0042a) {
                z2 = z;
                objY2 = new Function1() { // from class: opa0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        pb80 pb80Var = (pb80) obj;
                        pb80Var.getClass();
                        mb80.a(pb80Var);
                        lb80.c(pb80Var, "sound");
                        lb80.i(pb80Var, str3);
                        lb80.h(pb80Var, 2);
                        kzf0 kzf0Var = z2 ? kzf0.b : kzf0.a;
                        ob80<kzf0> ob80Var = hb80.I;
                        ohp<Object> ohpVar = lb80.a[24];
                        pb80Var.b(ob80Var, kzf0Var);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            } else {
                z2 = z;
            }
            d dVarB2 = xa80.b(dVarH, r0, (Function1) objY2);
            aiv aivVarC = g75.c(ht.a.e, r0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB2);
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
            h6n.b(erz.a(z2 ? R.drawable.ic__new_sound_off : R.drawable.ic__new_sound_on, r0, bVarI), null, j.r(dVar2, 20.0f), c68.a(R.color.icon_inverse_primary, bVarI), bVarI, 432, 0);
            bVarI.X(true);
        } else {
            z2 = z;
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z2, gwtVar, dVar2, i) { // from class: ppa0
                public final /* synthetic */ boolean a;
                public final /* synthetic */ gwt b;
                public final /* synthetic */ d c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    qpa0.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
