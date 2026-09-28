package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class mc4 {
    public static final void a(final int i, a aVar, final String str, final Function0 function0, final boolean z) {
        int i2;
        d.a aVar2;
        float f;
        b bVar;
        function0.getClass();
        b bVarI = aVar.i(989714620);
        int i3 = (bVarI.b(z) ? 4 : 2) | i | (bVarI.M(str) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = str == null || StringsKt.U(str);
            if (z2 && !z) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2(i, str, function0, z) { // from class: jc4
                        public final /* synthetic */ boolean a;
                        public final /* synthetic */ String b;
                        public final /* synthetic */ Function0 c;

                        {
                            this.a = z;
                            this.b = str;
                            this.c = function0;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            mc4.a(qj40.a(1), (a) obj, this.b, this.c, this.a);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            d.a aVar3 = d.a.b;
            d dVarG = h.g(androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), c68.a(R.color.background_cashout_card, bVarI), zk40.a), 16.0f, 12.0f);
            boolean z3 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object objY = bVarI.y();
            if (z3 || objY == a.C0041a.a) {
                objY = new Function0() { // from class: kc4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z) {
                            function0.invoke();
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarD = androidx.compose.foundation.d.d(dVarG, false, null, null, (Function0) objY, 15);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (z2) {
                i2 = 0;
                aVar2 = aVar3;
                f = 12.0f;
                bVarI.N(821112530);
                lkf0.d(pwo.e(R.string.personal_page__bio_default_message, bVarI), null, c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
                bVar = bVarI;
                bVar.X(false);
            } else {
                bVarI.N(820884556);
                str.getClass();
                f = 12.0f;
                aVar2 = aVar3;
                i2 = 0;
                lkf0.d(str, null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 0, 0, 131066);
                bVar = bVarI;
                bVar.X(false);
            }
            b bVar2 = bVar;
            h6n.b(erz.a(R.drawable.ic_bet_note, i2, bVar), null, h.j(aVar2, f, 0.0f, 0.0f, 0.0f, 14), c68.a(R.color.icon_primary, bVar), bVar2, 432, 0);
            bVarI = bVar2;
            bVarI.X(true);
            ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
        } else {
            bVarI.G();
        }
        e eVarZ2 = bVarI.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2(i, str, function0, z) { // from class: lc4
                public final /* synthetic */ boolean a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = z;
                    this.b = str;
                    this.c = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mc4.a(qj40.a(1), (a) obj, this.b, this.c, this.a);
                    return Unit.a;
                }
            };
        }
    }
}
