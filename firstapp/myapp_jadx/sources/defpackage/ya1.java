package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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

/* JADX INFO: loaded from: classes7.dex */
public final class ya1 {
    public static final void a(final l1z l1zVar, final long j, final MultiplierResponse multiplierResponse, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final String str, final Integer num, final Double d, final List list, final Boolean bool, a aVar, final int i, final int i2) {
        int i3;
        boolean z7;
        int i4;
        b bVar;
        l1zVar.getClass();
        multiplierResponse.getClass();
        b bVarI = aVar.i(-1799577256);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(l1zVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.M(multiplierResponse) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z7 = z;
            i3 |= bVarI.b(z7) ? 2048 : 1024;
        } else {
            z7 = z;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= bVarI.b(z3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= bVarI.b(z4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bVarI.b(z5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarI.b(z6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarI.M(str) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.M(num) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.M(d) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.A(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.M(bool) ? 2048 : 1024;
        }
        int i5 = i4;
        if (bVarI.q(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object[] objArr = {Long.valueOf(j)};
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new sa1();
                bVarI.r(objY);
            }
            Function2 function2 = (Function2) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new ta1();
                bVarI.r(objY2);
            }
            uv60 uv60VarA = jis.a((Function1) objY2, function2);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new ua1();
                bVarI.r(objY3);
            }
            Set set = (Set) o350.c(objArr, uv60VarA, (Function0) objY3, bVarI, 384);
            Object[] objArr2 = {Long.valueOf(j), multiplierResponse.getMessageType(), Long.valueOf(multiplierResponse.getRoundId()), Boolean.valueOf(z7), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6)};
            boolean zA = ((i5 & 7168) == 2048) | ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864) | ((i5 & 112) == 32) | bVarI.A(list) | ((i5 & 14) == 4) | bVarI.A(set) | bVarI.A(l1zVar) | bVarI.A(context) | ((i3 & 1879048192) == 536870912);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                xa1 xa1Var = new xa1(j, multiplierResponse, z7, z2, z3, z4, z5, z6, d, list, num, bool, set, l1zVar, context, str, null);
                bVar = bVarI;
                bVar.r(xa1Var);
                objY4 = xa1Var;
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
            eVarZ.d = new Function2() { // from class: va1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    ya1.a(l1zVar, j, multiplierResponse, z, z2, z3, z4, z5, z6, str, num, d, list, bool, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    public static final od3.a b(qa1 qa1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, LinkedHashMap linkedHashMap) {
        Map mapE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z7 = qa1Var.b;
        boolean z8 = qa1Var.c;
        if (z7 != z) {
            arrayList.add(z ? "auto_bet_enabled" : "auto_bet_disabled");
            arrayList2.add("AutoBetToggle expected=" + z7 + ", actual=" + z);
            Map mapA = wa1.a(Boolean.valueOf(z7), "enabled");
            Map mapA2 = wa1.a(Boolean.valueOf(z), "enabled");
            Map mapB = jpu.b(new Pair("isFbgSelected", Boolean.valueOf(z5)));
            mapA.getClass();
            mapA2.getClass();
            mapB.getClass();
            arrayList3.add(kpu.e(new Pair("component", "AutoBetToggle"), new Pair("expected", mapA), new Pair("actual", mapA2), new Pair("inputs", mapB)));
        }
        if (z8 != z2) {
            arrayList.add(z2 ? "auto_cashout_enabled" : "auto_cashout_disabled");
            arrayList2.add("AutoCashoutToggle expected=" + z8 + ", actual=" + z2);
            Map mapA3 = wa1.a(Boolean.valueOf(z8), "enabled");
            Map mapA4 = wa1.a(Boolean.valueOf(z2), "enabled");
            Map mapF = kpu.f(new Pair("isAutoBetEnabled", Boolean.valueOf(z6)), new Pair("betPlaced", Boolean.valueOf(z3)), new Pair("betInProgress", Boolean.valueOf(z4)), new Pair("isFbgSelected", Boolean.valueOf(z5)));
            mapA3.getClass();
            mapA4.getClass();
            arrayList3.add(kpu.e(new Pair("component", "AutoCashoutToggle"), new Pair("expected", mapA3), new Pair("actual", mapA4), new Pair("inputs", mapF)));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String strA0 = CollectionsKt.a0(CollectionsKt.q0(CollectionsKt.A0(CollectionsKt.D0(arrayList))), ",", null, null, null, 62);
        String strA1 = CollectionsKt.a0(arrayList2, "; ", null, null, null, 62);
        if (arrayList3.isEmpty()) {
            mapE = o2g.a;
            mapE.getClass();
        } else {
            mapE = kpu.e(new Pair("game", linkedHashMap), new Pair("failed_components", arrayList3));
        }
        return new od3.a(mapE, strA0, strA1);
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    public static final defpackage.qa1 c(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5) {
        /*
            r1.getClass()
            r0 = r4 ^ 1
            if (r2 != 0) goto Lf
            if (r3 != 0) goto Lf
            if (r4 != 0) goto Lf
            if (r5 != 0) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            int r5 = r1.hashCode()
            switch(r5) {
                case -1111393803: goto L5e;
                case 2896988: goto L48;
                case 1599022634: goto L37;
                case 1862985098: goto L18;
                default: goto L17;
            }
        L17:
            goto L66
        L18:
            java.lang.String r5 = "ROUND_ONGOING"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L21
            goto L66
        L21:
            if (r3 == 0) goto L26
            java.lang.String r1 = "round_ongoing-bet_placed_request"
            goto L74
        L26:
            if (r2 != 0) goto L2d
            if (r3 != 0) goto L2d
            java.lang.String r1 = "round_ongoing-no_bets_placed"
            goto L74
        L2d:
            if (r2 == 0) goto L34
            if (r3 != 0) goto L34
            java.lang.String r1 = "round_ongoing-bet_placed_or_active"
            goto L74
        L34:
            java.lang.String r1 = "round_ongoing-no_active_bet_cashed_out"
            goto L74
        L37:
            java.lang.String r3 = "ROUND_END_WAIT"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L40
            goto L66
        L40:
            if (r2 == 0) goto L45
            java.lang.String r1 = "round_end_wait-bets_placed_next_round"
            goto L74
        L45:
            java.lang.String r1 = "round_end_wait-no_bets_next_round"
            goto L74
        L48:
            java.lang.String r5 = "ROUND_WAITING"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L51
            goto L66
        L51:
            if (r3 == 0) goto L56
            java.lang.String r1 = "round_waiting-bet_placed_request"
            goto L74
        L56:
            if (r2 == 0) goto L5b
            java.lang.String r1 = "round_waiting-bet_placed_response"
            goto L74
        L5b:
            java.lang.String r1 = "round_waiting-no_bet_placed"
            goto L74
        L5e:
            java.lang.String r5 = "ROUND_PRE_START"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L68
        L66:
            r1 = 0
            return r1
        L68:
            if (r3 == 0) goto L6d
            java.lang.String r1 = "round_pre_start-bet_placed_request"
            goto L74
        L6d:
            if (r2 == 0) goto L72
            java.lang.String r1 = "round_pre_start-bet_placed_response"
            goto L74
        L72:
            java.lang.String r1 = "round_pre_start-no_bet_placed"
        L74:
            qa1 r2 = new qa1
            r2.<init>(r1, r0, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya1.c(java.lang.String, boolean, boolean, boolean, boolean):qa1");
    }
}
