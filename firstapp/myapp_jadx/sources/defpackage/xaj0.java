package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class xaj0 {
    public static final void a(final int i, a aVar, final String str, final Function0 function0) {
        function0.getClass();
        b bVarI = aVar.i(288984289);
        int i2 = (bVarI.A(function0) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarF = h.f(j.g(d.a.b, 1.0f), 16.0f);
            boolean z = (i2 & 112) == 32;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new e8b0(function0, 2);
                bVarI.r(objY);
            }
            xya.b(dVarF, false, null, null, null, 0.0f, null, (Function0) objY, pp8.b(-1562817545, new gaj() { // from class: vaj0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final String str2 = str;
                        ck5.a(0.0f, pp8.b(194478177, new Function2() { // from class: qaj0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    lkf0.d(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar3, 0, 0, 262142);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), null, null, aVar2, 48, 13);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 100663302, WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function0) { // from class: waj0
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = str;
                    this.b = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xaj0.a(qj40.a(7), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final yaj0 yaj0Var, a aVar, final int i) {
        b bVarI = aVar.i(1806206006);
        int i2 = i | 2;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                yaj0Var = (yaj0) p8i0.a(jq40.a(yaj0.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
            }
            bVarI.Y();
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            d dVarE = j.e(d.a.b, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            boolean zA = bVarI.A(yaj0Var) | bVarI.A(context);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new ny6(1, yaj0Var, context);
                bVarI.r(objY);
            }
            a(6, bVarI, "Winning Dialog", (Function0) objY);
            boolean zA2 = bVarI.A(yaj0Var) | bVarI.A(context);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: raj0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        yaj0Var.x1(context, "{\"type\":\"recent_winning_order\",\"data\":{\"totalWinnings\":\"7788\",\"percent\":\"87\",\"settleType\":1,\"shortId\":\"123\",\"orderId\":\"456\",\"bizType\":1}}");
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            a(6, bVarI, "FlashWin Winning Dialog", (Function0) objY2);
            boolean zA3 = bVarI.A(yaj0Var) | bVarI.A(context);
            Object objY3 = bVarI.y();
            if (zA3 || objY3 == c0042a) {
                objY3 = new Function0() { // from class: saj0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        yaj0Var.x1(context, "{\"type\":\"recent_winning_order\",\"data\":{\"longTotalWinnings\":8899,\"roundNo\":\"aaa\",\"goodsId\":\"bbb\",\"roundId\":\"ccc\",\"bizType\":4}}");
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            a(6, bVarI, "Winning Dialog - BINGO_WIN", (Function0) objY3);
            boolean zA4 = bVarI.A(yaj0Var) | bVarI.A(context);
            Object objY4 = bVarI.y();
            if (zA4 || objY4 == c0042a) {
                objY4 = new Function0() { // from class: taj0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        yaj0Var.x1(context, "{\"type\":\"GiftUsablePush\",\"data\":{\"from\":1,\"bizTypeScope\":[7,8,9],\"amount\":3210,\"activityName\":\"source1\"}}");
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            a(6, bVarI, "Winning Dialog - CASH GIFT", (Function0) objY4);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: uaj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    xaj0.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
