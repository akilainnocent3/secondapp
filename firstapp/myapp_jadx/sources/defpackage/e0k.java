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
import com.sportybet.android.gp.tz.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class e0k {
    /* JADX WARN: Code duplicated, block: B:47:0x0198  */
    /* JADX WARN: Code duplicated, block: B:48:0x019c  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bd  */
    public static final void a(g0k g0kVar, a aVar, final int i) {
        final g0k g0kVar2;
        a.C0041a.C0042a c0042a;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        b bVarI = aVar.i(-1321586662);
        int i2 = i | 2;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                g0kVar2 = (g0k) p8i0.a(jq40.a(g0k.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
                g0kVar2 = g0kVar;
            }
            bVarI.Y();
            Map<String, Object> map = g0kVar2.a;
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            d.a aVar3 = d.a.b;
            d dVarC = op70.c(j.e(aVar3, 1.0f), op70.a(bVarI), 14);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarC);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            d dVarF = h.f(j.g(aVar3, 1.0f), 16.0f);
            boolean zA = bVarI.A(context) | bVarI.A(g0kVar2);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (zA || objY == c0042a2) {
                objY = new Function0() { // from class: b0k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String str = (String) g0kVar2.b.getValue();
                        str.getClass();
                        hgy.a(context, str);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            g0kVar = g0kVar2;
            a.C0041a.C0042a c0042a3 = c0042a2;
            d.a aVar5 = aVar3;
            float f = 1.0f;
            final Context context2 = context;
            xya.b(dVarF, false, null, null, null, 0.0f, null, (Function0) objY, w39.b, bVarI, 100663302, WebSocketProtocol.PAYLOAD_SHORT);
            bVarI = bVarI;
            bVarI.N(-2060068406);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                final Object value = entry.getValue();
                d dVarG = j.g(aVar5, f);
                boolean zA2 = bVarI.A(value) | bVarI.A(context2);
                Object objY2 = bVarI.y();
                if (zA2) {
                    c0042a = c0042a3;
                } else {
                    c0042a = c0042a3;
                    if (objY2 == c0042a) {
                    }
                    d dVarF2 = h.f(androidx.compose.foundation.d.d(dVarG, false, null, null, (Function0) objY2, 15), 16.0f);
                    d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    d dVarC3 = c.c(bVarI, dVarF2);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA, yka.a.f);
                    hlh0.a(bVarI, ne00VarS2, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC3, yka.a.d);
                    c0042a3 = c0042a;
                    b bVar = bVarI;
                    d.a aVar6 = aVar5;
                    lkf0.d(key, null, c68.a(R.color.colorPrimary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar, 0, 0, 262138);
                    ty0.a(bVar, lt6.b(aVar6, 16.0f, bVar, f, true));
                    lkf0.d(String.valueOf(value), null, c68.a(R.color.text_type1_primary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar, 0, 0, 262138);
                    bVarI = bVar;
                    bVarI.X(true);
                    aVar5 = aVar6;
                    context2 = context2;
                    f = 1.0f;
                }
                objY2 = new Function0() { // from class: c0k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object obj = value;
                        if (obj != null) {
                            hgy.a(context2, obj.toString());
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
                d dVarF3 = h.f(androidx.compose.foundation.d.d(dVarG, false, null, null, (Function0) objY2, 15), 16.0f);
                d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarF3);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, yka.a.f);
                hlh0.a(bVarI, ne00VarS3, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC4, yka.a.d);
                c0042a3 = c0042a;
                b bVar2 = bVarI;
                d.a aVar7 = aVar5;
                lkf0.d(key, null, c68.a(R.color.colorPrimary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 262138);
                ty0.a(bVar2, lt6.b(aVar7, 16.0f, bVar2, f, true));
                lkf0.d(String.valueOf(value), null, c68.a(R.color.text_type1_primary, bVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar2, 0, 0, 262138);
                bVarI = bVar2;
                bVarI.X(true);
                aVar5 = aVar7;
                context2 = context2;
                f = 1.0f;
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        final g0k g0kVar3 = g0kVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: d0k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    e0k.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
