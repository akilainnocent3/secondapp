package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class lei {

    @c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.component.FootballFamilySettlementSelectionColumnKt$TitleRow$1$1$1$1", f = "FootballFamilySettlementSelectionColumn.kt", l = {132}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ b1g0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, b1g0 b1g0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = b1g0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                boolean z = this.b;
                b1g0 b1g0Var = this.c;
                if (z) {
                    this.a = 1;
                    if (b1g0Var.c(huw.a, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    b1g0Var.a();
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i, final qcn qcnVar, androidx.compose.runtime.a aVar, final Function0 function0, final Function1 function1) {
        int i2;
        qcnVar.getClass();
        b bVarI = aVar.i(449576151);
        int i3 = (bVarI.M(qcnVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        int i4 = 0;
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            long j = ((lib0) bVarI.O(oib0.a)).i0;
            zk40.a aVar2 = zk40.a;
            d.a aVar3 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(aVar3, j, aVar2);
            kw0.k kVar = kw0.c;
            n54.a aVar4 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar4, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            boolean z = true;
            if (bVarI.S) {
                bVarI.F(aVar5);
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
            int size = qcnVar.size() - 1;
            bVarI.N(924866945);
            int i5 = 0;
            for (Object obj : qcnVar) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                rei reiVar = (rei) obj;
                d dVarG = j.g(aVar3, 1.0f);
                i78 i78VarA2 = g78.a(kVar, aVar4, bVarI, i4);
                d.a aVar6 = aVar3;
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarG);
                yka.k.getClass();
                kw0.k kVar2 = kVar;
                tsr.a aVar7 = yka.a.b;
                bVarI.D();
                n54.a aVar8 = aVar4;
                if (bVarI.S) {
                    bVarI.F(aVar7);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                mei meiVar = reiVar.f;
                c(reiVar, function1, function0, bVarI, i3 & 1008);
                mei.a aVar9 = meiVar instanceof mei.a ? (mei.a) meiVar : null;
                if (aVar9 == null) {
                    bVarI.N(-582110720);
                    bVarI.X(false);
                } else {
                    bVarI.N(-582110719);
                    d(aVar9, bVarI, 0);
                    bVarI.X(false);
                }
                if (i5 != size) {
                    bVarI.N(-581994314);
                    aVar3 = aVar6;
                    ute.b(h.j(aVar3, 36.0f, 0.0f, 10.0f, 0.0f, 10), ((qhb0) bVarI.O(shb0.a)).a, ((lib0) bVarI.O(oib0.a)).A, bVarI, 6, 0);
                    i2 = 0;
                    bVarI.X(false);
                } else {
                    aVar3 = aVar6;
                    i2 = 0;
                    bVarI.N(-581731961);
                    bVarI.X(false);
                }
                boolean z2 = z;
                bVarI.X(z2);
                z = z2;
                i4 = i2;
                i5 = i6;
                kVar = kVar2;
                aVar4 = aVar8;
            }
            bVarI.X(i4);
            ute.b(h.h(aVar3, 10.0f, 0.0f, 2), ((qhb0) bVarI.O(shb0.a)).a, ((lib0) bVarI.O(oib0.a)).A, bVarI, 6, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, qcnVar, function0, function1) { // from class: cei
                public final /* synthetic */ qcn a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = qcnVar;
                    this.b = function1;
                    this.c = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    lei.a(qj40.a(1), this.a, (a) obj2, this.c, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final mei meiVar, androidx.compose.runtime.a aVar, final int i) {
        String strG;
        b bVarI = aVar.i(127185606);
        int i2 = (bVarI.M(meiVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            if (meiVar instanceof mei.b) {
                bVarI.N(1966287850);
                bVarI.X(false);
                strG = ((mei.b) meiVar).a;
            } else {
                if (!(meiVar instanceof mei.a)) {
                    throw igf0.a(bVarI, 1966285522, false);
                }
                bVarI.N(1966290414);
                UiText uiText = ((mei.a) meiVar).a;
                uiText.getClass();
                strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                bVarI.X(false);
            }
            lkf0.d(strG, h.g(g3w.b(h.j(d.a.b, 0.0f, 0.0f, 14.0f, 0.0f, 11), meiVar instanceof mei.a, new jei(), bVarI, 6), 6.0f, 4.0f), ((lib0) bVarI.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, 0, 0, 130040);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: kei
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lei.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static final void c(final rei reiVar, final Function1<? super String, Unit> function1, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        b bVar;
        ?? r7;
        f160 f160Var;
        boolean z;
        yka.a.b bVar2;
        yka.a.C1350a c1350a;
        b bVar3;
        b bVarI = aVar.i(2093650758);
        int i2 = i | (bVarI.M(reiVar) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(aVar2, 0.0f, 4.0f, 1);
            kw0.j jVar = kw0.a;
            d160 d160VarA = b160.a(jVar, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar4);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            f160 f160Var2 = f160.a;
            d dVarA = f160Var2.a(1.2f, aVar2, true);
            d160 d160VarA2 = b160.a(jVar, ht.a.j, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar4);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            qei qeiVar = reiVar.b;
            boolean z2 = reiVar.c;
            UiText uiText = reiVar.d;
            boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z3 || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function0() { // from class: eei
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Function1 function2 = function1;
                        if (function2 != null) {
                            function2.invoke(reiVar.a);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            e(qeiVar, z2, uiText, (Function0) objY, function0, bVarI, 57344 & (i2 << 6));
            bVarI.X(true);
            d dVarA2 = f160Var2.a(0.8f, aVar2, true);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar4);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            String str = reiVar.e;
            if (str == null) {
                bVarI.N(948108263);
                bVarI.X(false);
                bVar3 = bVarI;
                f160Var = f160Var2;
                c1350a = c1350a2;
                z = true;
                r7 = 0;
                bVar2 = bVar4;
            } else {
                bVarI.N(948108264);
                long j = ((lib0) bVarI.O(oib0.a)).b;
                gdf0 gdf0Var = new gdf0(3);
                imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).o;
                r7 = 0;
                f160Var = f160Var2;
                z = true;
                bVar2 = bVar4;
                c1350a = c1350a2;
                lkf0.d(str, null, j, null, 0L, null, null, null, 0L, null, gdf0Var, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 130042);
                b bVar5 = bVarI;
                Unit unit = Unit.a;
                bVar5.X(false);
                bVar3 = bVar5;
            }
            bVar3.X(z);
            d dVarA3 = f160Var.a(1.2f, aVar2, z);
            aiv aivVarC2 = g75.c(ht.a.f, r7);
            int iHashCode4 = Long.hashCode(bVar3.T);
            ne00 ne00VarS4 = bVar3.S();
            d dVarC4 = c.c(bVar3, dVarA3);
            bVar3.D();
            if (bVar3.S) {
                bVar3.F(aVar3);
            } else {
                bVar3.p();
            }
            hlh0.a(bVar3, aivVarC2, bVar2);
            hlh0.a(bVar3, ne00VarS4, dVar);
            if (bVar3.S || !Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVar3, iHashCode4, c1350a);
            }
            hlh0.a(bVar3, dVarC4, cVar);
            mei meiVar = reiVar.f;
            if (meiVar == null) {
                bVar3.N(1833566368);
            } else {
                bVar3.N(1833566369);
                b(meiVar, bVar3, r7);
                Unit unit2 = Unit.a;
            }
            bVar3.X(r7);
            bVar3.X(z);
            bVar3.X(z);
            bVar = bVar3;
        } else {
            b bVar6 = bVarI;
            bVar6.G();
            bVar = bVar6;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function0, i) { // from class: fei
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lei.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(mei.a aVar, androidx.compose.runtime.a aVar2, final int i) {
        b bVar;
        final mei.a aVar3;
        b bVarI = aVar2.i(1281482218);
        int i2 = i | (bVarI.M(aVar) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar4 = d.a.b;
            d dVarH = h.h(aVar4, 0.0f, 4.0f, 1);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            f160 f160Var = f160.a;
            ty0.a(bVarI, f160Var.a(1.2f, aVar4, true));
            d dVarA = f160Var.a(0.8f, aVar4, true);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String str = aVar.b;
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).b;
            gdf0 gdf0Var = new gdf0(3);
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(str, null, j, null, 0L, null, null, null, 0L, null, gdf0Var, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).o, bVarI, 0, 0, 130042);
            bVarI.X(true);
            d dVarA2 = f160Var.a(1.2f, aVar4, true);
            aiv aivVarC2 = g75.c(ht.a.f, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            aVar3 = aVar;
            lkf0.d(aVar3.c, h.j(aVar4, 0.0f, 0.0f, 20.0f, 0.0f, 11), ((lib0) bVarI.O(qyd0Var)).b, null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).o, bVarI, 48, 0, 130040);
            bVar = bVarI;
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            aVar3 = aVar;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: dei
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lei.d(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final qei qeiVar, final boolean z, final UiText uiText, final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVar;
        yka.a.C1350a c1350a;
        d.a aVar2;
        yka.a.b bVar2;
        boolean z2;
        tsr.a aVar3;
        b bVar3;
        Unit unit;
        b bVarI = aVar.i(855296606);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(qeiVar) : bVarI.A(qeiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(uiText) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar4 = d.a.b;
            d dVarC = c.c(bVarI, aVar4);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar4);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (qeiVar == null) {
                bVarI.N(546065775);
                bVarI.X(false);
                bVar3 = bVarI;
                c1350a = c1350a2;
                z2 = false;
                aVar3 = aVar5;
                bVar2 = bVar4;
                aVar2 = aVar4;
                unit = null;
            } else {
                bVarI.N(546065776);
                b1g0 b1g0VarD = r0g0.d(48, 5, bVarI, true);
                Boolean boolValueOf = Boolean.valueOf(z);
                int i3 = i2;
                boolean zA = ((i2 & 112) == 32) | bVarI.A(b1g0VarD);
                Object objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (zA || objY == c0042a) {
                    objY = new a(z, b1g0VarD, null);
                    bVarI.r(objY);
                }
                xvf.e(bVarI, boolValueOf, (Function2) objY);
                String strG = qeiVar.a().g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                boolean z3 = (i3 & 57344) == 16384;
                Object objY2 = bVarI.y();
                if (z3 || objY2 == c0042a) {
                    objY2 = new Function0() { // from class: gei
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Function0 function2 = function1;
                            if (function2 != null) {
                                function2.invoke();
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                op8 op8VarB = pp8.b(-568653240, new hei(qeiVar, function0), bVarI);
                c1350a = c1350a2;
                aVar2 = aVar4;
                bVar2 = bVar4;
                z2 = false;
                aVar3 = aVar5;
                spo.a(b1g0VarD, strG, false, false, false, 6.0f, (Function0) objY2, false, op8VarB, bVarI, 907542528, 60);
                bVar3 = bVarI;
                Unit unit2 = Unit.a;
                bVar3.X(false);
                unit = Unit.a;
            }
            if (unit == null) {
                bVar3.N(1126028069);
                ty0.a(bVar3, j.t(aVar2, 48.0f, 32.0f));
            } else {
                bVar3.N(1125993473);
            }
            bVar3.X(z2);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            aiv aivVarC = g75.c(ht.a.d, z2);
            int iHashCode2 = Long.hashCode(bVar3.T);
            ne00 ne00VarS2 = bVar3.S();
            d dVarC2 = c.c(bVar3, layoutWeightElement);
            bVar3.D();
            if (bVar3.S) {
                bVar3.F(aVar3);
            } else {
                bVar3.p();
            }
            hlh0.a(bVar3, aivVarC, bVar2);
            hlh0.a(bVar3, ne00VarS2, dVar);
            if (bVar3.S || !Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
            }
            hlh0.a(bVar3, dVarC2, cVar);
            b bVar5 = bVar3;
            lkf0.d(uiText.g((Context) bVar3.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) bVar3.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, ((ijb0) bVar3.O(kjb0.a)).o, bVar5, 0, 0, 130042);
            bVar = bVar5;
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: iei
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lei.e(qeiVar, z, uiText, function0, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
