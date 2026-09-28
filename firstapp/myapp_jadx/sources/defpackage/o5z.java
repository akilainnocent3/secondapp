package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o5z {
    public static final void a(final d dVar, final OtpSelection otpSelection, final boolean z, final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        Function0<Unit> function1;
        ak5 ak5VarG;
        b bVarI = aVar.i(-107856186);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(otpSelection.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function1 = function0;
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            i060 i060VarC = j060.c(0.0f);
            if (otpSelection == OtpSelection.TELEGRAM) {
                bVarI.N(-507783237);
                umz umzVar = ek5.a;
                ak5VarG = ek5.g(j58.m, 0L, bVarI, 13);
                bVarI.X(false);
            } else {
                bVarI.N(-507677341);
                umz umzVar2 = ek5.a;
                ak5VarG = ek5.g(c68.a(R.color.text_type1_secondary, bVarI), 0L, bVarI, 13);
                bVarI.X(false);
            }
            nk5.a(function1, dVar, false, i060VarC, ak5VarG, null, null, new umz(36.0f, 16.0f, 36.0f, 16.0f), null, pp8.b(424856790, new gaj() { // from class: l5z
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long jA;
                    e160 e160Var = (e160) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e160Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(e160Var) ? 4 : 2;
                    }
                    int i3 = iIntValue;
                    if (aVar2.q(i3 & 1, (i3 & 19) != 18)) {
                        d.a aVar3 = d.a.b;
                        d dVarR = j.r(aVar3, 24.0f);
                        OtpSelection otpSelection2 = otpSelection;
                        crz crzVarA = erz.a(otpSelection2.c, 0, aVar2);
                        if (otpSelection2 == OtpSelection.TELEGRAM) {
                            aVar2.N(-359804389);
                            aVar2.H();
                            jA = j58.m;
                        } else {
                            jA = m7b.a(aVar2, -359748713, R.color.text_type1_secondary, aVar2);
                        }
                        h6n.b(crzVarA, AnalyticsParam.HOME_NAV_ICON, dVarR, jA, aVar2, 432, 0);
                        o5z.b(e160Var, null, otpSelection2, z, aVar2, i3 & 14);
                        h6n.b(erz.a(R.drawable.icon_arrow1_right, 0, aVar2), "right", j.r(h.j(aVar3, 12.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), c68.a(R.color.text_type1_secondary, aVar2), aVar2, 432, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 9) & 14) | 817889280 | ((i2 << 3) & 112), 356);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: m5z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o5z.a(dVar, otpSelection, z, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final e160 e160Var, d dVar, final OtpSelection otpSelection, final boolean z, a aVar, final int i) {
        int i2;
        b bVar;
        final d dVar2;
        OtpSelection otpSelection2;
        b bVarI = aVar.i(-1213638993);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(e160Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= bVarI.d(otpSelection.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.b(z) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d.a aVar2 = d.a.b;
            d dVarA = e160Var.a(1.0f, h.j(aVar2, 12.0f, 0.0f, 0.0f, 0.0f, 14), true);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
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
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            lkf0.d(cb40.a(otpSelection.d, new Object[0], bVarI), yy.a(bVarI, dVarC2, cVar, 1.0f, true), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 262136);
            bVar = bVarI;
            OtpSelection otpSelection3 = OtpSelection.TELEGRAM;
            if (otpSelection == otpSelection3) {
                bVar.N(-378485346);
                otpSelection2 = otpSelection3;
                lkf0.d(cb40.a(R.string.common_functions__reliable, new Object[0], bVar), h.g(d35.a(aVar2, 1.0f, c68.a(R.color.text_brand_sub_primary_d_base, bVar), j060.c(42.0f)), 8.0f, 2.0f), c68.a(R.color.text_brand_sub_primary_d_base, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_B, bVar), bVar, 0, 0, 131064);
                bVar = bVar;
                bVar.X(false);
            } else {
                otpSelection2 = otpSelection3;
                bVar.N(-377872755);
                bVar.X(false);
            }
            bVar.X(true);
            if (z || otpSelection != otpSelection2) {
                bVar.N(726540585);
                bVar.X(false);
            } else {
                bVar.N(726233716);
                b bVar3 = bVar;
                lkf0.d(cb40.a(R.string.common_otp_verify__no_telegram_account_otp_description, new Object[0], bVar), h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_secondary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar), bVar3, 48, 0, 131064);
                bVar = bVar3;
                bVar.X(false);
            }
            bVar.X(true);
            dVar2 = aVar2;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: n5z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o5z.b(e160Var, dVar2, otpSelection, z, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(d dVar, final uf00<? extends OtpSelection> uf00Var, final boolean z, final Function1<? super OtpSelection, Unit> function1, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        boolean z2;
        final d dVar3;
        String str;
        uf00Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(-256024199);
        int i4 = i2 & 1;
        int i5 = 4;
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
        if ((i & 48) == 0) {
            i3 |= bVarI.M(uf00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i3 |= bVarI.b(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(function1) ? 2048 : 1024;
        }
        int i6 = i3;
        if (bVarI.q(i6 & 1, (i6 & 1171) != 1170)) {
            d.a aVar2 = d.a.b;
            d dVar4 = i4 != 0 ? aVar2 : dVar2;
            d dVarG = j.g(dVar4, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int i7 = i6;
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(1168209770);
            for (final OtpSelection otpSelection : uf00Var) {
                int iOrdinal = otpSelection.ordinal();
                if (iOrdinal == 1) {
                    str = "btn-otp-way-sms";
                } else if (iOrdinal != 2) {
                    str = iOrdinal != i5 ? "" : "btn-otp-way-telegram_gateway";
                } else {
                    str = "btn-otp-way-voice";
                }
                d dVarC2 = c9j.c(aVar2, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, str);
                int i8 = i7;
                boolean zD = bVarI.d(otpSelection.ordinal()) | ((i8 & 7168) == 2048);
                Object objY = bVarI.y();
                if (zD || objY == a.C0041a.a) {
                    objY = new Function0() { // from class: j5z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(otpSelection);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                d.a aVar4 = aVar2;
                a(dVarC2, otpSelection, z2, (Function0) objY, bVarI, i8 & 896);
                if (uf00Var.indexOf(otpSelection) != uf00Var.size() - 1) {
                    bVarI.N(-1768348131);
                    g75.a(androidx.compose.foundation.a.b(h.h(j.i(j.g(aVar4, 1.0f), 1.0f), 34.0f, 0.0f, 2), c68.a(R.color.line_type1_primary, bVarI), zk40.a), bVarI, 0);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1768038689);
                    bVarI.X(false);
                }
                z2 = z;
                aVar2 = aVar4;
                i7 = i8;
                i5 = 4;
            }
            bVarI.X(false);
            bVarI.X(true);
            dVar3 = dVar4;
        } else {
            bVarI.G();
            dVar3 = dVar2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: k5z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o5z.c(dVar3, uf00Var, z, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
