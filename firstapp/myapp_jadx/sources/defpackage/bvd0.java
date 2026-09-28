package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import com.sportygames.crash.remote.models.MultiplierResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public final class bvd0 {
    public static final void a(final l1z l1zVar, final long j, final MultiplierResponse multiplierResponse, final long j2, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final boolean z11, final String str, final String str2, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final boolean z16, final z83 z83Var, final boolean z17, final String str3, final Integer num, final Double d, final List list, final Boolean bool, a aVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        b bVar;
        l1zVar.getClass();
        multiplierResponse.getClass();
        str.getClass();
        str2.getClass();
        z83Var.getClass();
        b bVarI = aVar.i(-1442235806);
        if ((i & 6) == 0) {
            i4 = (bVarI.A(l1zVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= bVarI.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= bVarI.M(multiplierResponse) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= bVarI.e(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= bVarI.b(z2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= bVarI.b(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= bVarI.b(z4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= bVarI.b(z5) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= bVarI.b(z6) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (bVarI.b(z7) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= bVarI.b(z8) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= bVarI.b(z9) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= bVarI.b(z10) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= bVarI.b(z11) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= bVarI.M(str) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= bVarI.M(str2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= bVarI.b(z12) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= bVarI.b(z13) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= bVarI.b(z14) ? 536870912 : 268435456;
        }
        int i7 = i5;
        if ((i3 & 6) == 0) {
            i6 = i3 | (bVarI.b(z15) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= bVarI.b(z16) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= bVarI.d(z83Var.ordinal()) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= bVarI.b(z17) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= bVarI.M(str3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= bVarI.M(num) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= bVarI.M(d) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= bVarI.A(list) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= bVarI.M(bool) ? 67108864 : 33554432;
        }
        int i8 = i6;
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (i7 & 306783379) == 306783378 && (38347923 & i8) == 38347922) ? false : true)) {
            Object[] objArr = {Long.valueOf(j)};
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new wud0();
                bVarI.r(objY);
            }
            Function2 function2 = (Function2) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new xud0();
                bVarI.r(objY2);
            }
            uv60 uv60VarA = jis.a((Function1) objY2, function2);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new yud0();
                bVarI.r(objY3);
            }
            Set set = (Set) o350.c(objArr, uv60VarA, (Function0) objY3, bVarI, 384);
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object[] objArr2 = {Long.valueOf(j), multiplierResponse.getMessageType(), Long.valueOf(multiplierResponse.getRoundId()), Boolean.valueOf(z2), Boolean.valueOf(z), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z8), Boolean.valueOf(z9), Boolean.valueOf(z10), str, str2, Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14), Boolean.valueOf(z15), Boolean.valueOf(z16), z83Var, Boolean.valueOf(z17)};
            int i9 = i4;
            boolean zA = ((i7 & 1879048192) == 536870912) | ((i4 & 7168) == 2048) | ((i4 & 112) == 32) | ((i4 & 896) == 256) | ((i4 & 458752) == 131072) | ((i4 & 57344) == 16384) | ((i4 & 3670016) == 1048576) | ((i9 & 29360128) == 8388608) | ((i9 & 234881024) == 67108864) | ((i7 & 14) == 4) | ((i7 & 112) == 32) | ((i7 & 896) == 256) | ((i7 & 7168) == 2048) | ((i7 & 57344) == 16384) | ((i7 & 458752) == 131072) | ((i7 & 3670016) == 1048576) | ((i8 & 896) == 256) | ((i8 & 7168) == 2048) | bVarI.A(set) | ((i9 & 1879048192) == 536870912) | ((i7 & 29360128) == 8388608) | ((i7 & 234881024) == 67108864) | ((i8 & 14) == 4) | ((i8 & 112) == 32) | ((i8 & 3670016) == 1048576) | bVarI.A(list) | ((i8 & 458752) == 131072) | ((i8 & 234881024) == 67108864) | bVarI.A(l1zVar) | bVarI.A(context) | ((i8 & 57344) == 16384);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                avd0 avd0Var = new avd0(j, multiplierResponse, z2, z, z3, j2, z4, z5, z7, z8, z9, z10, z11, str, str2, z83Var, z17, set, z6, z12, z13, z14, z15, z16, d, list, num, bool, l1zVar, context, str3, null);
                bVar = bVarI;
                bVar.r(avd0Var);
                objY4 = avd0Var;
            } else {
                bVar = bVarI;
            }
            xvf.h(objArr2, (Function2) objY4, bVar);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zud0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    int iA3 = qj40.a(i3);
                    bvd0.a(l1zVar, j, multiplierResponse, j2, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, str, str2, z12, z13, z14, z15, z16, z83Var, z17, str3, num, d, list, bool, (a) obj, iA, iA2, iA3);
                    return Unit.a;
                }
            };
        }
    }

    public static final od3.a b(vud0 vud0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, String str, String str2, boolean z12, boolean z13, boolean z14, boolean z15, z83 z83Var, LinkedHashMap linkedHashMap) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str3;
        Map mapE;
        str.getClass();
        str2.getClass();
        z83Var.getClass();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        boolean z16 = false;
        boolean z17 = (z6 || z7) ? false : true;
        boolean z18 = str.length() > 0 && str2.length() > 0;
        if (z12 || (z15 && z83Var != z83.c)) {
            z16 = true;
        }
        boolean z19 = vud0Var.b;
        boolean z20 = vud0Var.f;
        boolean z21 = vud0Var.e;
        boolean z22 = z16;
        boolean z23 = vud0Var.d;
        boolean z24 = vud0Var.c;
        boolean z25 = z17;
        boolean z26 = z18;
        if (z19 != z) {
            arrayList4.add(z ? "minus_button_enabled" : "minus_button_disabled");
            arrayList5.add("Minus expected=" + z19 + ", actual=" + z);
            Map mapA = wa1.a(Boolean.valueOf(z19), "enabled");
            Map mapA2 = wa1.a(Boolean.valueOf(z), "enabled");
            Map mapF = kpu.f(new Pair("canDecrease", Boolean.valueOf(z10)), new Pair("isAutoBetEnabled", Boolean.valueOf(z8)), new Pair("betPlaced", Boolean.valueOf(z6)), new Pair("betInProgress", Boolean.valueOf(z7)), new Pair("isFbgSelected", Boolean.valueOf(z9)), new Pair("canInteractStake", Boolean.valueOf(z25)));
            mapA.getClass();
            mapA2.getClass();
            LinkedHashMap linkedHashMapE = kpu.e(new Pair("component", "MinusButton"), new Pair("expected", mapA), new Pair("actual", mapA2), new Pair("inputs", mapF));
            arrayList = arrayList6;
            arrayList.add(linkedHashMapE);
        } else {
            arrayList = arrayList6;
        }
        if (z24 != z2) {
            arrayList4.add(z2 ? "plus_button_enabled" : "plus_button_disabled");
            arrayList4 = arrayList4;
            arrayList5.add("Plus expected=" + z24 + ", actual=" + z2);
            Map mapA3 = wa1.a(Boolean.valueOf(z24), "enabled");
            Map mapA4 = wa1.a(Boolean.valueOf(z2), "enabled");
            Map mapF2 = kpu.f(new Pair("canIncrease", Boolean.valueOf(z11)), new Pair("isAutoBetEnabled", Boolean.valueOf(z8)), new Pair("betPlaced", Boolean.valueOf(z6)), new Pair("betInProgress", Boolean.valueOf(z7)), new Pair("isFbgSelected", Boolean.valueOf(z9)), new Pair("canInteractStake", Boolean.valueOf(z25)));
            mapA3.getClass();
            mapA4.getClass();
            arrayList.add(kpu.e(new Pair("component", "PlusButton"), new Pair("expected", mapA3), new Pair("actual", mapA4), new Pair("inputs", mapF2)));
        }
        if (z23 != z3) {
            arrayList2 = arrayList4;
            arrayList2.add(z3 ? "stake_amount_enabled" : "stake_amount_disabled");
            arrayList5.add("Amount expected=" + z23 + ", actual=" + z3);
            Map mapA5 = wa1.a(Boolean.valueOf(z23), "clickable");
            Map mapA6 = wa1.a(Boolean.valueOf(z3), "clickable");
            Map mapF3 = kpu.f(new Pair("isAutoBetEnabled", Boolean.valueOf(z8)), new Pair("betPlaced", Boolean.valueOf(z6)), new Pair("betInProgress", Boolean.valueOf(z7)), new Pair("isFbgSelected", Boolean.valueOf(z9)), new Pair("canInteractStake", Boolean.valueOf(z25)));
            mapA5.getClass();
            mapA6.getClass();
            arrayList.add(kpu.e(new Pair("component", "StakeAmount"), new Pair("expected", mapA5), new Pair("actual", mapA6), new Pair("inputs", mapF3)));
        } else {
            arrayList2 = arrayList4;
        }
        if (z21 != z4) {
            arrayList2.add(z4 ? gvQvkPPtA.JglGfBjCO : "chip_button_disabled");
            arrayList3 = arrayList5;
            arrayList3.add("Chips expected=" + z21 + ", actual=" + z4);
            Map mapA7 = wa1.a(Boolean.valueOf(z21), "enabled");
            Map mapA8 = wa1.a(Boolean.valueOf(z4), "enabled");
            str3 = "enabled";
            Map mapF4 = kpu.f(new Pair("isAutoBetEnabled", Boolean.valueOf(z8)), new Pair("betPlaced", Boolean.valueOf(z6)), new Pair("betInProgress", Boolean.valueOf(z7)), new Pair("isFbgSelected", Boolean.valueOf(z9)), new Pair("hasInputs", Boolean.valueOf(z26)), new Pair("toShowFbg", Boolean.valueOf(z12)), new Pair("isClickableHost", Boolean.valueOf(z15)), new Pair("betState", z83Var.name()), new Pair("chipsLayoutGate", Boolean.valueOf(z22)), new Pair("canInteractStake", Boolean.valueOf(z25)));
            mapA7.getClass();
            mapA8.getClass();
            arrayList.add(kpu.e(new Pair("component", "ChipButton"), new Pair("expected", mapA7), new Pair("actual", mapA8), new Pair("inputs", mapF4)));
        } else {
            arrayList3 = arrayList5;
            str3 = r2;
        }
        if (z20 != z5) {
            arrayList2.add(z5 ? "fbg_chip_enabled" : "fbg_chip_disabled");
            arrayList3.add("Gift expected=" + z20 + ", actual=" + z5);
            String str4 = str3;
            Map mapA9 = wa1.a(Boolean.valueOf(z20), str4);
            Map mapA10 = wa1.a(Boolean.valueOf(z5), str4);
            Map mapF5 = kpu.f(new Pair("toShowFbg", Boolean.valueOf(z12)), new Pair("disableFbg", Boolean.valueOf(z13)), new Pair("giftResponseReceived", Boolean.valueOf(z14)), new Pair("hasInputs", Boolean.valueOf(z26)), new Pair("betPlaced", Boolean.valueOf(z6)), new Pair("betInProgress", Boolean.valueOf(z7)), new Pair("isFbgSelected", Boolean.valueOf(z9)), new Pair("canInteractStake", Boolean.valueOf(z25)));
            mapA9.getClass();
            mapA10.getClass();
            arrayList.add(kpu.e(new Pair("component", "GiftChip"), new Pair("expected", mapA9), new Pair("actual", mapA10), new Pair("inputs", mapF5)));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        String strA0 = CollectionsKt.a0(CollectionsKt.q0(CollectionsKt.A0(CollectionsKt.D0(arrayList2))), ",", null, null, null, 62);
        String strA1 = CollectionsKt.a0(arrayList3, "; ", null, null, null, 62);
        if (arrayList.isEmpty()) {
            mapE = o2g.a;
            mapE.getClass();
        } else {
            mapE = kpu.e(new Pair("game", linkedHashMap), new Pair("failed_components", arrayList));
        }
        return new od3.a(mapE, strA0, strA1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final vud0 c(String str, boolean z, boolean z2, boolean z3, MultiplierResponse multiplierResponse, long j, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str2, String str3, z83 z83Var, boolean z11) {
        str.getClass();
        multiplierResponse.getClass();
        str2.getClass();
        str3.getClass();
        z83Var.getClass();
        long roundId = multiplierResponse.getRoundId();
        if (j <= 0 || roundId <= 0 || j >= roundId) {
            if (!z4) {
                switch (str.hashCode()) {
                    case -1111393803:
                        if (str.equals("ROUND_PRE_START")) {
                            if (z2) {
                                return d("round_pre_start-bet_placed_request");
                            }
                            return z ? d("round_pre_start-bet_placed_response") : e("round_pre_start-no_bet_placed", z8, z9, z5, z, z2, str2, str3, z10, z6, z7, z83Var, z11);
                        }
                        break;
                    case 2896988:
                        if (str.equals("ROUND_WAITING")) {
                            if (z2) {
                                return d("round_waiting-bet_placed_request");
                            }
                            return z ? d("round_waiting-bet_placed_response") : e("round_waiting-no_bet_placed", z8, z9, z5, z, z2, str2, str3, z10, z6, z7, z83Var, z11);
                        }
                        break;
                    case 1599022634:
                        if (str.equals("ROUND_END_WAIT")) {
                            return z ? d("round_end_wait-bets_placed_next_round") : e("round_end_wait-no_bets_next_round", z8, z9, z5, z, z2, str2, str3, z10, z6, z7, z83Var, z11);
                        }
                        break;
                    case 1862985098:
                        if (str.equals("ROUND_ONGOING")) {
                            String currentMultiplier = multiplierResponse.getCurrentMultiplier();
                            boolean zD = nd3.d(z, z3, str, currentMultiplier != null ? kotlin.text.b.i(currentMultiplier) : null, roundId, j);
                            if (zD) {
                                return d("round_ongoing-active_bet");
                            }
                            if (z2) {
                                return d("round_ongoing-bet_placed_request");
                            }
                            if (z || z2) {
                                return (!z || z2 || zD || z3) ? e("round_ongoing-no_active_bet_cashed_out", z8, z9, z5, z, z2, str2, str3, z10, z6, z7, z83Var, z11) : d("round_ongoing-bet_placed_response");
                            }
                            return e("round_ongoing-no_bets_placed", z8, z9, z5, z, z2, str2, str3, z10, z6, z7, z83Var, z11);
                        }
                        break;
                }
            } else {
                return d("any_betting-fbg_selected_on_bet_card");
            }
        }
        return null;
    }

    public static final vud0 d(String str) {
        return new vud0(str, false, false, false, false, false);
    }

    public static final vud0 e(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, String str3, boolean z6, boolean z7, boolean z8, z83 z83Var, boolean z9) {
        boolean z10 = str2.length() > 0 && str3.length() > 0;
        boolean z11 = z8 || (z9 && z83Var != z83.c);
        boolean z12 = (z4 || z5) ? false : true;
        return new vud0(str, z && !z3 && z12, z2 && !z3 && z12, !z3 && z12, !z3 && z10 && z11 && z12, z8 && !z7 && z6 && z10 && z12);
    }
}
