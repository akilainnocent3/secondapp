package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class lt00 {
    public static final void a(final int i, a aVar, final d dVar, final String str) {
        int i2;
        d dVarH;
        qyd0 qyd0Var;
        int i3;
        qyd0 qyd0Var2;
        d.a aVar2;
        b bVarI = aVar.i(-1825275279);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            qyd0 qyd0Var3 = ejb0.a;
            d dVarA = ls7.a(j.i(dVar, ((cjb0) bVarI.O(qyd0Var3)).i), j060.c(((zib0) bVarI.O(ajb0.a)).b));
            qyd0 qyd0Var4 = oib0.a;
            d dVarB = androidx.compose.foundation.a.b(dVarA, ((lib0) bVarI.O(qyd0Var4)).s0, zk40.a);
            d.a aVar3 = d.a.b;
            if (str != null) {
                bVarI.N(1805441449);
                dVarH = h.h(aVar3, ((cjb0) bVarI.O(qyd0Var3)).e, 0.0f, 2);
                bVarI.X(false);
            } else {
                bVarI.N(1805548833);
                bVarI.X(false);
                dVarH = aVar3;
            }
            d dVarN = dVarB.n(dVarH);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarN);
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
            if (str != null) {
                bVarI.N(-384311541);
                qyd0Var = qyd0Var3;
                i3 = 0;
                qyd0Var2 = qyd0Var4;
                aVar2 = aVar3;
                lkf0.d(str, new LayoutWeightElement(1.0f, true), ((lib0) bVarI.O(qyd0Var4)).d, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ijb0) bVarI.O(kjb0.a)).k, bVarI, i2 & 14, 24960, 110584);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                qyd0Var = qyd0Var3;
                i3 = 0;
                qyd0Var2 = qyd0Var4;
                aVar2 = aVar3;
                bVarI.N(-384015243);
                bVarI.X(false);
            }
            h6n.b(erz.a(R.drawable.spr_ic_prematch_lock, i3, bVarI), null, j.r(aVar2, ((cjb0) bVarI.O(qyd0Var)).f), ((lib0) bVarI.O(qyd0Var2)).Q, bVarI, 48, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: kt00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lt00.a(qj40.a(i | 1), (a) obj, dVar, str);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final boolean z, final boolean z2, final Function0<Unit> function0, final d dVar, String str2, a aVar, final int i, final int i2) {
        String str3;
        int i3;
        b bVar;
        final String str4;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        int i4;
        final String str5;
        long j;
        b bVar2;
        String str6;
        function0.getClass();
        b bVarI = aVar.i(-51912066);
        int i5 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.b(z2) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.M(dVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i5 | 196608;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i5 | (bVarI.M(str3) ? 131072 : 65536);
        }
        int i7 = i3;
        if (bVarI.q(i7 & 1, (i7 & 74899) != 74898)) {
            if (i6 != 0) {
                str5 = null;
                i4 = 2;
            } else {
                i4 = 2;
                str5 = str3;
            }
            if (z2) {
                bVarI.N(-323849916);
                bVarI.X(false);
                qyd0 qyd0Var = ejb0.a;
                d dVarA = ls7.a(j.i(dVar, ((cjb0) bVarI.O(qyd0Var)).i), j060.c(((zib0) bVarI.O(ajb0.a)).b));
                if (z) {
                    bVarI.N(-925222901);
                    j = ((lib0) bVarI.O(oib0.a)).x0;
                    bVarI.X(false);
                } else {
                    bVarI.N(-925157367);
                    j = ((lib0) bVarI.O(oib0.a)).A0;
                    bVarI.X(false);
                }
                d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVarA, j, zk40.a), false, null, null, function0, 15);
                d dVarH = d.a.b;
                if (str5 != null) {
                    bVarI.N(-323528260);
                    dVarH = h.h(dVarH, ((cjb0) bVarI.O(qyd0Var)).e, 0.0f, i4);
                    bVarI.X(false);
                } else {
                    bVarI.N(-323420876);
                    bVarI.X(false);
                }
                d dVarN = dVarD.n(dVarH);
                d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarN);
                yka.k.getClass();
                tsr.a aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
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
                if (str5 != null) {
                    bVarI.N(284904996);
                    String str7 = str5;
                    lkf0.d(str7, new LayoutWeightElement(1.0f, true), c(z, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ijb0) bVarI.O(kjb0.a)).k, bVarI, (i7 >> 15) & 14, 24960, 110584);
                    str6 = str7;
                    bVar2 = bVarI;
                    bVar2.X(false);
                } else {
                    bVar2 = bVarI;
                    str6 = str5;
                    bVar2.N(285195528);
                    bVar2.X(false);
                }
                b bVar3 = bVar2;
                lkf0.d(str, null, c(z, bVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVar2.O(kjb0.a)).i, bVar3, i7 & 14, 0, 131066);
                bVar = bVar3;
                bVar.X(true);
                str4 = str6;
            } else {
                bVarI.N(-323929679);
                a(((i7 >> 15) & 14) | ((i7 >> 9) & 112), bVarI, dVar, str5);
                bVarI.X(false);
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2(str, z, z2, function0, dVar, str5, i, i2) { // from class: it00
                        public final /* synthetic */ String a;
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ boolean c;
                        public final /* synthetic */ Function0 d;
                        public final /* synthetic */ d e;
                        public final /* synthetic */ String f;
                        public final /* synthetic */ int i;

                        {
                            this.i = i2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(1);
                            lt00.b(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA, this.i);
                            return Unit.a;
                        }
                    };
                }
            }
            eVarZ.d = function2;
        }
        bVar = bVarI;
        bVar.G();
        str4 = str3;
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            function2 = new Function2(str, z, z2, function0, dVar, str4, i, i2) { // from class: jt00
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ d e;
                public final /* synthetic */ String f;
                public final /* synthetic */ int i;

                {
                    this.i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lt00.b(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA, this.i);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    public static final long c(boolean z, a aVar) {
        if (z) {
            aVar.N(1507491238);
            long j = ((lib0) aVar.O(oib0.a)).o;
            aVar.H();
            return j;
        }
        aVar.N(1507552835);
        long j2 = ((lib0) aVar.O(oib0.a)).i;
        aVar.H();
        return j2;
    }
}
