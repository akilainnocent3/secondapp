package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportygames.campaign.data.model.PrizeInfo;
import com.sportygames.campaign.data.model.TournamentStatsData;
import com.sportygames.campaign.data.model.UserPlayInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class ycg0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final long j, final String str2, final String str3, final String str4, final ArrayList arrayList, final UserPlayInfo userPlayInfo, final Function0 function0, final String str5, final String str6, final String str7, final String str8, final aig0 aig0Var, b5 b5Var, final List list, final Double d, final long j2, final Function0 function1, final Function0 function2, final boolean z, a aVar, final int i) {
        int i2;
        String str9;
        b bVar;
        final b5 b5Var2;
        b5 b5Var3;
        int i3;
        str2.getClass();
        str3.getClass();
        b bVarI = aVar.i(-1728922612);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(str3) ? 2048 : 1024;
        }
        int i4 = i & 24576;
        int i5 = Http2.INITIAL_MAX_FRAME_SIZE;
        if (i4 == 0) {
            str9 = str4;
            i2 |= bVarI.M(str9) ? 16384 : 8192;
        } else {
            str9 = str4;
        }
        if ((i & 196608) == 0) {
            i2 |= bVarI.A(arrayList) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= bVarI.A(userPlayInfo) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= bVarI.A(function0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= bVarI.M(str5) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= bVarI.M(str6) ? 536870912 : 268435456;
        }
        int i6 = i2;
        int i7 = 512 | (bVarI.M(str7) ? 4 : 2) | (bVarI.M(str8) ? 32 : 16) | (bVarI.A(aig0Var) ? 256 : 128) | 1024;
        if (!bVarI.A(list)) {
            i5 = 8192;
        }
        int i8 = i7 | i5 | (bVarI.M(d) ? 131072 : 65536) | (bVarI.e(j2) ? 1048576 : 524288) | (bVarI.A(function1) ? 8388608 : 4194304) | (bVarI.A(function2) ? 67108864 : 33554432) | (bVarI.b(z) ? 536870912 : 268435456);
        if (bVarI.q(i6 & 1, ((i6 & 306783379) == 306783378 && (i8 & 306783379) == 306783378) ? false : true)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                qn70 qn70VarA = c7g0.a(-1168520582, -1633490746, bVarI, bVarI);
                boolean zM = bVarI.M(null) | bVarI.M(qn70VarA);
                Object objY = bVarI.y();
                if (zM || objY == a.C0041a.a) {
                    objY = qn70VarA.a(jq40.a(b5.class), null, null);
                    bVarI.r(objY);
                }
                bVarI.X(false);
                bVarI.X(false);
                b5Var3 = (b5) objY;
                i3 = i8 & (-7169);
            } else {
                bVarI.G();
                i3 = i8 & (-7169);
                b5Var3 = b5Var;
            }
            bVarI.Y();
            int i9 = i3 >> 15;
            Pair pairA = z5g0.a(d, j2, bVarI, i9 & WebSocketProtocol.PAYLOAD_SHORT);
            String str10 = (String) pairA.a;
            j58 j58Var = (j58) pairA.b;
            long j3 = j58Var.a;
            int i10 = i3 >> 3;
            bVar = bVarI;
            pfg0.g(new TournamentStatsData(str, j, str2, str3, str9, (PrizeInfo) CollectionsKt.firstOrNull(arrayList), userPlayInfo, str5, str6, str7, str8, phg0.a(arrayList, b5Var3)), function0, aig0Var, str10, j58Var, list, function1, function2, (HashMap) ((x5a0) wag0.g).getValue(), (HashMap) ((x5a0) wag0.f).getValue(), ((Boolean) ((x5a0) wag0.h).getValue()).booleanValue(), wag0.j.getValue().floatValue(), ((Number) ((x5a0) wag0.k).getValue()).intValue(), ((Boolean) ((x5a0) wag0.l).getValue()).booleanValue(), z, bVar, ((i6 >> 18) & 112) | (i3 & 896) | ((i3 << 3) & 458752) | (3670016 & i10) | (i10 & 29360128), i9 & 57344);
            b5Var2 = b5Var3;
        } else {
            bVar = bVarI;
            bVar.G();
            b5Var2 = b5Var;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xcg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    ycg0.a(str, j, str2, str3, str4, arrayList, userPlayInfo, function0, str5, str6, str7, str8, aig0Var, b5Var2, list, d, j2, function1, function2, z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
