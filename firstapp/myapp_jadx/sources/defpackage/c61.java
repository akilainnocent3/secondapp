package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.BetComponentColors;
import com.sportygames.crash.models.BetData;
import com.sportygames.crash.remote.models.DetailResponse;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class c61 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final fsw fswVar, final ytw ytwVar, final ytw ytwVar2, final ytw ytwVar3, final ytw ytwVar4, final boolean z, final t290 t290Var, final DetailResponse detailResponse, final BetComponentColors betComponentColors, final cj5 cj5Var, final boolean z2, final Function2 function2, final Function1 function1, final Function1 function3, final Function2 function4, final Function0 function0, final Function0 function5, final osw oswVar, final boolean z3, final boolean z4, final float f, final float f2, final float f3, final boolean z5, a aVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        b bVar;
        int i7;
        fswVar.getClass();
        ytwVar.getClass();
        ytwVar3.getClass();
        ytwVar4.getClass();
        t290Var.getClass();
        detailResponse.getClass();
        function2.getClass();
        function1.getClass();
        function3.getClass();
        function4.getClass();
        b bVarA = v2g.a(function0, function5, aVar, -1679861404);
        if ((i & 6) == 0) {
            i4 = (bVarA.M(fswVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= bVarA.M(ytwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= bVarA.M(ytwVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= bVarA.M(ytwVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= bVarA.M(ytwVar4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= bVarA.b(z) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= bVarA.A(t290Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= bVarA.A(detailResponse) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= bVarA.M(betComponentColors) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= bVarA.A(cj5Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (bVarA.b(z2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= bVarA.A(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= bVarA.A(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= bVarA.A(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= bVarA.A(function4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= bVarA.A(function0) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= bVarA.A(function5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= bVarA.M(oswVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= bVarA.b(z3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= bVarA.b(z4) ? 536870912 : 268435456;
        }
        int i8 = i5;
        if ((i3 & 6) == 0) {
            i6 = i3 | (bVarA.c(f) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= bVarA.c(f2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= bVarA.c(f3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= bVarA.b(z5) ? 2048 : 1024;
        }
        int i9 = i6;
        if (bVarA.q(i4 & 1, ((i4 & 306783379) == 306783378 && (i8 & 306783379) == 306783378 && (i9 & 1171) == 1170) ? false : true)) {
            bVarA.A0();
            if ((i & 1) != 0 && !bVarA.h0()) {
                bVarA.G();
            }
            bVarA.Y();
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarA, 48);
            int iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarA, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, d160VarA, yka.a.f);
            hlh0.a(bVarA, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            hlh0.a(bVarA, dVarC, yka.a.d);
            d dVarA = s3w.a(aVar2, "sj_auto_bet_text");
            op5 op5Var = op5.a;
            int i10 = i4;
            lkf0.b(op5.c(op5Var, pwo.e(R.string.auto_bet_cms, bVarA), "Auto bet"), dVarA, betComponentColors.getTextSecondary(), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, o6a.a(ni60.a(((eah0) bVarA.O(gah0.a)).h), f), bVarA, 0, 0, 65528);
            b bVar2 = bVarA;
            final String strC = op5.c(op5Var, pwo.e(R.string.fbg_auto_bet_warning_cms, bVar2), pwo.e(R.string.enable_auto_bet_fbg, bVar2));
            ty0.a(bVar2, j.w(aVar2, 4.0f));
            boolean zEqualsIgnoreCase = "br".equalsIgnoreCase(new SportyGamesManager().getSubCountry());
            boolean z6 = ((Boolean) ytwVar2.getValue()).booleanValue() && !z;
            String strValueOf = (!zEqualsIgnoreCase || oswVar == null) ? null : String.valueOf(oswVar.D());
            d dVarA2 = s3w.a(aVar2, "sj_auto_bet_toggle");
            boolean zM = ((i8 & 3670016) == 1048576) | ((i8 & 458752) == 131072) | ((i8 & 14) == 4) | ((i10 & 57344) == 16384) | ((i10 & 458752) == 131072) | ((i8 & 112) == 32) | bVar2.M(strC) | ((i10 & 7168) == 2048) | ((i10 & 14) == 4) | bVar2.A(detailResponse) | ((i10 & 112) == 32) | ((i8 & 896) == 256) | ((i10 & 896) == 256) | ((i8 & 7168) == 2048) | ((i8 & 57344) == 16384);
            Object objY = bVar2.y();
            if (zM || objY == a.C0041a.a) {
                i7 = i10;
                Function1 function6 = new Function1() { // from class: a61
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        double d;
                        Boolean bool = (Boolean) obj;
                        boolean zBooleanValue = bool.booleanValue();
                        if (((Boolean) function0.invoke()).booleanValue()) {
                            function5.invoke();
                        } else {
                            boolean z7 = z2;
                            ytw ytwVar5 = ytwVar4;
                            boolean z8 = z;
                            Function2 function7 = function2;
                            String str = strC;
                            ytw ytwVar6 = ytwVar3;
                            fsw fswVar2 = fswVar;
                            DetailResponse detailResponse2 = detailResponse;
                            ytw ytwVar7 = ytwVar;
                            if (z7) {
                                ytwVar2.setValue(bool);
                                double d2 = 1.01d;
                                try {
                                    double d3 = Double.parseDouble((String) ytwVar5.getValue());
                                    if (d3 >= 1.01d) {
                                        d2 = d3;
                                    }
                                } catch (Exception unused) {
                                }
                                if (z8) {
                                    function7.invoke(str, new j58(new ubj().w1));
                                    return Unit.a;
                                }
                                boolean zBooleanValue2 = ((Boolean) ytwVar6.getValue()).booleanValue();
                                Function1 function8 = function3;
                                Function2 function9 = function4;
                                if (zBooleanValue2) {
                                    if (fswVar2.getDoubleValue() * d2 > detailResponse2.getMaxPayoutAmount()) {
                                        double maxAmount = fswVar2.getDoubleValue() > detailResponse2.getMaxAmount() ? detailResponse2.getMaxAmount() : fswVar2.getDoubleValue();
                                        TreeMap treeMap = pw.a;
                                        ytwVar5.setValue(pw.n(detailResponse2.getMaxPayoutAmount() / maxAmount));
                                        ytwVar7.setValue(ytwVar5.getValue() + "x");
                                    }
                                    lla.a(detailResponse2, fswVar2, ytwVar7, ytwVar5, true);
                                    if (fswVar2.getDoubleValue() * d2 > detailResponse2.getMaxPayoutAmount()) {
                                        TreeMap treeMap2 = pw.a;
                                        d2 = Double.parseDouble(pw.n(detailResponse2.getMaxPayoutAmount() / fswVar2.getDoubleValue()));
                                    }
                                    if (yju.a("br") && zBooleanValue) {
                                        function8.invoke(new BetData(Double.valueOf(fswVar2.getDoubleValue()), Double.valueOf(d2)));
                                    } else {
                                        function9.invoke(new BetData(Double.valueOf(fswVar2.getDoubleValue()), Double.valueOf(d2)), bool);
                                    }
                                } else {
                                    lla.a(detailResponse2, fswVar2, ytwVar7, ytwVar5, true);
                                    if ("br".equalsIgnoreCase(new SportyGamesManager().getSubCountry()) && zBooleanValue) {
                                        function8.invoke(new BetData(Double.valueOf(fswVar2.getDoubleValue()), null));
                                    } else {
                                        function9.invoke(new BetData(Double.valueOf(fswVar2.getDoubleValue()), null), bool);
                                    }
                                }
                            } else {
                                try {
                                    d = Double.parseDouble((String) ytwVar5.getValue());
                                } catch (Exception unused2) {
                                    d = 5.0d;
                                }
                                if (z8) {
                                    function7.invoke(str, new j58(new ubj().w1));
                                } else {
                                    boolean zBooleanValue3 = ((Boolean) ytwVar6.getValue()).booleanValue();
                                    Function1 function10 = function1;
                                    if (zBooleanValue3) {
                                        if (fswVar2.getDoubleValue() * d > detailResponse2.getMaxPayoutAmount()) {
                                            double maxAmount2 = fswVar2.getDoubleValue() > detailResponse2.getMaxAmount() ? detailResponse2.getMaxAmount() : fswVar2.getDoubleValue();
                                            TreeMap treeMap3 = pw.a;
                                            ytwVar5.setValue(pw.n(detailResponse2.getMaxPayoutAmount() / maxAmount2));
                                            ytwVar7.setValue(ytwVar5.getValue() + "x");
                                        }
                                        function10.invoke(new BetData(Double.valueOf(fswVar2.getDoubleValue()), Double.valueOf(d)));
                                    } else {
                                        function10.invoke(new BetData(Double.valueOf(fswVar2.getDoubleValue()), null));
                                    }
                                }
                            }
                        }
                        return Unit.a;
                    }
                };
                bVar2 = bVar2;
                bVar2.r(function6);
                objY = function6;
            } else {
                i7 = i10;
            }
            int i11 = i9 << 12;
            b bVar3 = bVar2;
            xka.a(z6, (Function1) objY, t290Var, false, cj5Var, f2, f3, dVarA2, strValueOf, z3, z4, false, z5, bVar3, ((i7 >> 12) & 896) | 3072 | ((i7 >> 15) & 57344) | (i11 & 458752) | (i11 & 3670016) | ((r2 << 3) & 1879048192), ((i8 >> 27) & 14) | ((i9 >> 3) & 896), 2048);
            bVar = bVar3;
            bVar.X(true);
        } else {
            bVar = bVarA;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: b61
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    int iA3 = qj40.a(i3);
                    c61.a(fswVar, ytwVar, ytwVar2, ytwVar3, ytwVar4, z, t290Var, detailResponse, betComponentColors, cj5Var, z2, function2, function1, function3, function4, function0, function5, oswVar, z3, z4, f, f2, f3, z5, (a) obj, iA, iA2, iA3);
                    return Unit.a;
                }
            };
        }
    }
}
