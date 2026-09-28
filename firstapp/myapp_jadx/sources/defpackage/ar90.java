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
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ar90 {

    @c0d(c = "com.sportybet.android.instantwin.presentation.simulationticketdetail.component.SimulationTicketDetailContentItemKt$SimulationTicketDetailContentItem$1$1", f = "SimulationTicketDetailContentItem.kt", l = {63}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ br90 b;
        public final /* synthetic */ b1g0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(br90 br90Var, b1g0 b1g0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = br90Var;
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
                boolean z = this.b.l;
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

    /* JADX WARN: Code duplicated, block: B:103:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:107:0x0498  */
    /* JADX WARN: Code duplicated, block: B:110:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:111:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:114:0x04da  */
    /* JADX WARN: Code duplicated, block: B:115:0x04de  */
    /* JADX WARN: Code duplicated, block: B:122:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:125:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:127:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:129:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:130:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:132:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:136:0x0621  */
    /* JADX WARN: Code duplicated, block: B:137:0x0631  */
    /* JADX WARN: Code duplicated, block: B:139:0x066a  */
    /* JADX WARN: Code duplicated, block: B:140:0x066e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0689  */
    /* JADX WARN: Code duplicated, block: B:151:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:154:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:156:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:159:0x074c  */
    /* JADX WARN: Code duplicated, block: B:160:0x074e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0762  */
    /* JADX WARN: Code duplicated, block: B:171:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:173:0x0818  */
    /* JADX WARN: Code duplicated, block: B:176:0x082c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0851  */
    /* JADX WARN: Code duplicated, block: B:180:0x0860  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:52:0x015b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0176  */
    /* JADX WARN: Code duplicated, block: B:60:0x0192  */
    /* JADX WARN: Code duplicated, block: B:61:0x0194  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:70:0x0217  */
    /* JADX WARN: Code duplicated, block: B:71:0x021b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0238  */
    /* JADX WARN: Code duplicated, block: B:82:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:83:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0350  */
    /* JADX WARN: Code duplicated, block: B:87:0x0354  */
    /* JADX WARN: Code duplicated, block: B:94:0x0373  */
    /* JADX WARN: Code duplicated, block: B:97:0x03be  */
    /* JADX WARN: Code duplicated, block: B:98:0x03c2  */
    public static final void a(br90 br90Var, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Function1<? super ns90, Unit> function2, androidx.compose.runtime.a aVar, final int i) {
        final Function1<? super ns90, Unit> function3;
        n54.a aVar2;
        yka.a.c cVar;
        kw0.j jVar;
        n54.b bVar;
        int iHashCode;
        qyd0 qyd0Var;
        boolean z;
        Object objY;
        int iHashCode2;
        yka.a.C1350a c1350a;
        yka.a.C1350a c1350a2;
        b bVar2;
        qeo qeoVar;
        d.a aVar3;
        int iHashCode3;
        d.a aVar4;
        int iHashCode4;
        b bVar3;
        float f;
        int iHashCode5;
        us90 us90Var;
        d dVarH;
        er90 er90Var;
        boolean z2;
        final ms90 ms90Var;
        int iHashCode6;
        qyd0 qyd0Var2;
        float f2;
        d.a aVar5;
        boolean z3;
        boolean zA;
        Object objY2;
        d.a aVar6;
        final br90 br90Var2 = br90Var;
        br90Var2.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        b bVarI = aVar.i(965508019);
        int i2 = i | (bVarI.A(br90Var2) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            b1g0 b1g0VarD = r0g0.d(48, 5, bVarI, true);
            boolean z4 = br90Var2.l;
            boolean z5 = br90Var2.i;
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean zA2 = ((i2 & 14) == 4 || bVarI.A(br90Var2)) | bVarI.A(b1g0VarD);
            Object objY3 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA2 || objY3 == c0042a) {
                objY3 = new a(br90Var2, b1g0VarD, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY3);
            d.a aVar7 = d.a.b;
            d dVarG = j.g(aVar7, 1.0f);
            long j = fjb0.b(bVarI).i0;
            zk40.a aVar8 = zk40.a;
            d dVarH2 = h.h(androidx.compose.foundation.a.b(dVarG, j, aVar8), 28.0f, 0.0f, 2);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new np(2);
                bVarI.r(objY4);
            }
            d dVarB = xa80.b(dVarH2, false, (Function1) objY4);
            kw0.k kVar = kw0.c;
            n54.a aVar9 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar9, bVarI, 0);
            int iHashCode7 = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar10 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar10);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar4);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarI.S) {
                aVar2 = aVar9;
            } else {
                aVar2 = aVar9;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                d dVarG2 = j.g(aVar7, 1.0f);
                jVar = kw0.a;
                bVar = ht.a.k;
                d160 d160VarA = b160.a(jVar, bVar, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.m());
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarG2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar10);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar4);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a3);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                ResourceUiText resourceUiText = br90Var2.k.b;
                qyd0Var = AndroidCompositionLocals_androidKt.b;
                String strG = resourceUiText.g((Context) bVarI.O(qyd0Var));
                if ((i2 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objY = bVarI.y();
                if (z || objY == c0042a) {
                    objY = new i850(function0, 1);
                    bVarI.r(objY);
                }
                n54.a aVar11 = aVar2;
                spo.a(b1g0VarD, strG, false, false, false, 28.0f, (Function0) objY, false, pp8.b(1843445952, new Function2() { // from class: wq90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar12 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar12.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            final br90 br90Var3 = br90Var2;
                            crz crzVarA = erz.a(br90Var3.k.a, 0, aVar12);
                            d dVarH3 = g3w.h(j.r(ls7.a(d.a.b, j060.a), 24.0f), br90Var3.k.c);
                            final Function1 function4 = function1;
                            boolean zM = aVar12.M(function4) | aVar12.A(br90Var3);
                            Object objY5 = aVar12.y();
                            if (zM || objY5 == a.C0041a.a) {
                                objY5 = new Function0() { // from class: zq90
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function4.invoke(br90Var3.j);
                                        return Unit.a;
                                    }
                                };
                                aVar12.r(objY5);
                            }
                            h9n.a(crzVarA, null, androidx.compose.foundation.d.d(dVarH3, false, null, null, (Function0) objY5, 15), null, null, 0.0f, null, aVar12, 48, 120);
                        } else {
                            aVar12.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 806879232, 316);
                ty0.a(bVarI, j.w(aVar7, fjb0.d(bVarI).f));
                i78 i78VarA2 = g78.a(kVar, aVar11, bVarI, 0);
                iHashCode2 = Long.hashCode(bVarI.m());
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, aVar7);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar10);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, bVar4);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S && Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    c1350a = c1350a3;
                } else {
                    c1350a = c1350a3;
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                c1350a2 = c1350a;
                lkf0.e(br90Var.a.a((Context) bVarI.O(qyd0Var)), g3w.h(h.j(aVar7, 0.0f, 10.0f, 0.0f, 0.0f, 13), "content_matchup_text"), fjb0.b(bVarI).c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, fjb0.e(bVarI).k, bVarI, 48, 0, 262136);
                bVar2 = bVarI;
                qeoVar = br90Var.b;
                if (qeoVar == null) {
                    bVar2.N(1651666504);
                    bVar2.X(false);
                    aVar3 = aVar7;
                } else {
                    bVar2.N(1651666505);
                    aVar3 = aVar7;
                    peo.b(h.j(aVar7, 0.0f, fjb0.d(bVar2).c, 0.0f, 0.0f, 13), qeoVar, ht.a.d, bVar2, 384, 0);
                    bVar2 = bVar2;
                    Unit unit = Unit.a;
                    bVar2.X(false);
                }
                d dVarF = h.f(androidx.compose.foundation.a.b(hib0.a(aVar3, fjb0.d(bVar2).d, bVar2, aVar3, 1.0f), c68.a(br90Var.m, bVar2), aVar8), fjb0.d(bVar2).d);
                d160 d160VarA2 = b160.a(jVar, bVar, bVar2, 48);
                iHashCode3 = Long.hashCode(bVar2.m());
                ne00 ne00VarS4 = bVar2.S();
                d dVarC4 = c.c(bVar2, dVarF);
                bVar2.D();
                if (bVar2.S) {
                    bVar2.F(aVar10);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, d160VarA2, bVar4);
                hlh0.a(bVar2, ne00VarS4, dVar);
                if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVar2, iHashCode3, c1350a2);
                }
                hlh0.a(bVar2, dVarC4, cVar);
                aVar4 = aVar3;
                d dVarJ = h.j(aVar4, 0.0f, 0.0f, fjb0.d(bVar2).d, 0.0f, 11);
                i78 i78VarA3 = g78.a(new kw0.i(fjb0.d(bVar2).c, true, new hw0()), ht.a.o, bVar2, 48);
                iHashCode4 = Long.hashCode(bVar2.m());
                ne00 ne00VarS5 = bVar2.S();
                d dVarC5 = c.c(bVar2, dVarJ);
                bVar2.D();
                if (bVar2.S) {
                    bVar2.F(aVar10);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, i78VarA3, bVar4);
                hlh0.a(bVar2, ne00VarS5, dVar);
                if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVar2, iHashCode4, c1350a2);
                }
                hlh0.a(bVar2, dVarC5, cVar);
                bVar3 = bVar2;
                lkf0.d(cb40.a(R.string.bet_history__pick, new Object[0], bVar2), null, fjb0.b(bVar2).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVar2).o, bVar3, 0, 0, 131066);
                lkf0.d(cb40.a(R.string.bet_history__market, new Object[0], bVar3), null, fjb0.b(bVar3).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVar3).o, bVar3, 0, 0, 131066);
                lkf0.d(cb40.a(R.string.bet_history__outcome, new Object[0], bVar3), null, fjb0.b(bVar3).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVar3).o, bVar3, 0, 0, 131066);
                bVar3.X(true);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                } else {
                    f = 1.0f;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f, true);
                i78 i78VarA4 = g78.a(new kw0.i(fjb0.d(bVar3).c, true, new hw0()), aVar11, bVar3, 0);
                iHashCode5 = Long.hashCode(bVar3.m());
                ne00 ne00VarS6 = bVar3.S();
                d dVarC6 = c.c(bVar3, layoutWeightElement);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar10);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, i78VarA4, bVar4);
                hlh0.a(bVar3, ne00VarS6, dVar);
                if (bVar3.S || !Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode5))) {
                    n30.a(iHashCode5, bVar3, iHashCode5, c1350a2);
                }
                hlh0.a(bVar3, dVarC6, cVar);
                br90Var2 = br90Var;
                lkf0.d(br90Var.c.g((Context) bVar3.O(qyd0Var)), g3w.h(aVar4, "content_pick_text"), fjb0.b(bVar3).c, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, fjb0.e(bVar3).n, bVar3, 48, 24960, 110584);
                lkf0.d(br90Var2.d, g3w.h(aVar4, "content_market_text"), fjb0.b(bVar3).c, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, fjb0.e(bVar3).n, bVar3, 48, 24960, 110584);
                lkf0.d(br90Var2.e, g3w.h(aVar4, "content_outcome_text"), fjb0.b(bVar3).c, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, fjb0.e(bVar3).n, bVar3, 48, 24960, 110584);
                bVarI = bVar3;
                bVarI.X(true);
                us90Var = br90Var2.f;
                if (us90Var == null) {
                    bVarI.N(-1128712600);
                    bVarI.X(false);
                    z2 = false;
                } else {
                    bVarI.N(-1128712599);
                    dVarH = g3w.h(dw.a(j.r(aVar4, 48.0f), 0.1f), us90Var.b);
                    er90Var = us90Var.a;
                    if (er90Var instanceof er90.b) {
                        bVarI.N(-1702124380);
                        z2 = false;
                        h9n.a(erz.a(((er90.b) er90Var).a, 0, bVarI), null, dVarH, null, null, 0.0f, null, bVarI, 48, 120);
                        bVarI = bVarI;
                        bVarI.X(false);
                    } else {
                        z2 = false;
                        if (er90Var instanceof er90.a) {
                            throw igf0.a(bVarI, 83636386, false);
                        }
                        bVarI.N(-1701725038);
                        h6n.b(erz.a(R.drawable.ic__feature__won, 0, bVarI), null, dVarH, c68.a(R.color.icon_brand_sub_primary_d_base, bVarI), bVarI, 48, 0);
                        bVarI.X(false);
                    }
                    Unit unit2 = Unit.a;
                    bVarI.X(z2);
                }
                bVarI.X(true);
                ms90Var = br90Var2.g;
                if (ms90Var == null) {
                    bVarI.N(1656345055);
                    bVarI.X(z2);
                    aVar5 = aVar4;
                    qyd0Var2 = qyd0Var;
                    function3 = function2;
                } else {
                    bVarI.N(1656345056);
                    d dVarB2 = androidx.compose.foundation.a.b(j.g(aVar4, 1.0f), fjb0.b(bVarI).r0, aVar8);
                    d160 d160VarA3 = b160.a(jVar, bVar, bVarI, 48);
                    iHashCode6 = Long.hashCode(bVarI.m());
                    ne00 ne00VarS7 = bVarI.S();
                    d dVarC7 = c.c(bVarI, dVarB2);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar10);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA3, bVar4);
                    hlh0.a(bVarI, ne00VarS7, dVar);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                        n30.a(iHashCode6, bVarI, iHashCode6, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC7, cVar);
                    qyd0Var2 = qyd0Var;
                    String strG2 = ms90Var.b.g((Context) bVarI.O(qyd0Var2));
                    if (1.0f <= 0.0d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    } else {
                        f2 = 1.0f;
                    }
                    b bVar5 = bVarI;
                    lkf0.d(strG2, g3w.h(h.h(h.j(new LayoutWeightElement(f2, true), fjb0.d(bVarI).f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 6.0f, 1), "selection_description_text"), fjb0.b(bVarI).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).q, bVar5, 0, 0, 131064);
                    bVarI = bVar5;
                    crz crzVarA = erz.a(R.drawable.ic__question_circle, 0, bVarI);
                    aVar5 = aVar4;
                    d dVarA = ls7.a(h.f(h.j(aVar4, 0.0f, 0.0f, fjb0.d(bVarI).e, 0.0f, 11), fjb0.d(bVarI).b), j060.a);
                    if ((i2 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zA = bVarI.A(ms90Var) | z3;
                    objY2 = bVarI.y();
                    if (!zA || objY2 == c0042a) {
                        function3 = function2;
                        objY2 = new Function0() { // from class: xq90
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function3.invoke(ms90Var.a);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    } else {
                        function3 = function2;
                    }
                    h6n.b(crzVarA, "Display selection description", g3w.h(j.r(h.f(androidx.compose.foundation.d.d(dVarA, false, null, null, (Function0) objY2, 15), fjb0.d(bVarI).b), 16.0f), "selection_description_hint_icon"), fjb0.b(bVarI).P, bVarI, 48, 0);
                    bVarI.X(true);
                    Unit unit3 = Unit.a;
                    bVarI.X(false);
                }
                ty0.a(bVarI, j.i(aVar5, fjb0.d(bVarI).e));
                if (z5) {
                    bVarI.N(1658285284);
                    b bVar6 = bVarI;
                    aVar6 = aVar5;
                    lkf0.d(br90Var2.h.g((Context) bVarI.O(qyd0Var2)), j.g(aVar5, 1.0f), fjb0.b(bVarI).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).q, bVar6, 48, 0, 131064);
                    bVarI = bVar6;
                    iib0.a(aVar6, fjb0.d(bVarI).e, bVarI, false);
                } else {
                    aVar6 = aVar5;
                    bVarI.N(1658649503);
                    bVarI.X(false);
                }
                bVarI.X(true);
                bVarI.X(true);
                if (z5) {
                    bVarI.N(-8775099);
                    bVarI.X(false);
                } else {
                    bVarI.N(-8954806);
                    b bVar7 = bVarI;
                    ute.b(j.g(aVar6, 1.0f), 1.0f, fjb0.b(bVarI).A, bVar7, 54, 0);
                    bVarI = bVar7;
                    bVarI.X(false);
                }
                bVarI.X(true);
            }
            n30.a(iHashCode7, bVarI, iHashCode7, c1350a3);
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG3 = j.g(aVar7, 1.0f);
            jVar = kw0.a;
            bVar = ht.a.k;
            d160 d160VarA4 = b160.a(jVar, bVar, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS8 = bVarI.S();
            d dVarC8 = c.c(bVarI, dVarG3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar10);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA4, bVar4);
            hlh0.a(bVarI, ne00VarS8, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a3);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a3);
            }
            hlh0.a(bVarI, dVarC8, cVar);
            ResourceUiText resourceUiText2 = br90Var2.k.b;
            qyd0Var = AndroidCompositionLocals_androidKt.b;
            String strG3 = resourceUiText2.g((Context) bVarI.O(qyd0Var));
            if ((i2 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            objY = bVarI.y();
            if (z) {
                objY = new i850(function0, 1);
                bVarI.r(objY);
            } else {
                objY = new i850(function0, 1);
                bVarI.r(objY);
            }
            n54.a aVar12 = aVar2;
            spo.a(b1g0VarD, strG3, false, false, false, 28.0f, (Function0) objY, false, pp8.b(1843445952, new Function2() { // from class: wq90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar13 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar13.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final br90 br90Var3 = br90Var2;
                        crz crzVarA2 = erz.a(br90Var3.k.a, 0, aVar13);
                        d dVarH3 = g3w.h(j.r(ls7.a(d.a.b, j060.a), 24.0f), br90Var3.k.c);
                        final Function1 function4 = function1;
                        boolean zM = aVar13.M(function4) | aVar13.A(br90Var3);
                        Object objY5 = aVar13.y();
                        if (zM || objY5 == a.C0041a.a) {
                            objY5 = new Function0() { // from class: zq90
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function4.invoke(br90Var3.j);
                                    return Unit.a;
                                }
                            };
                            aVar13.r(objY5);
                        }
                        h9n.a(crzVarA2, null, androidx.compose.foundation.d.d(dVarH3, false, null, null, (Function0) objY5, 15), null, null, 0.0f, null, aVar13, 48, 120);
                    } else {
                        aVar13.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 806879232, 316);
            ty0.a(bVarI, j.w(aVar7, fjb0.d(bVarI).f));
            i78 i78VarA5 = g78.a(kVar, aVar12, bVarI, 0);
            iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS9 = bVarI.S();
            d dVarC9 = c.c(bVarI, aVar7);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar10);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA5, bVar4);
            hlh0.a(bVarI, ne00VarS9, dVar);
            if (bVarI.S) {
                c1350a = c1350a3;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                c1350a = c1350a3;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC9, cVar);
            c1350a2 = c1350a;
            lkf0.e(br90Var.a.a((Context) bVarI.O(qyd0Var)), g3w.h(h.j(aVar7, 0.0f, 10.0f, 0.0f, 0.0f, 13), "content_matchup_text"), fjb0.b(bVarI).c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, fjb0.e(bVarI).k, bVarI, 48, 0, 262136);
            bVar2 = bVarI;
            qeoVar = br90Var.b;
            if (qeoVar == null) {
                bVar2.N(1651666504);
                bVar2.X(false);
                aVar3 = aVar7;
            } else {
                bVar2.N(1651666505);
                aVar3 = aVar7;
                peo.b(h.j(aVar7, 0.0f, fjb0.d(bVar2).c, 0.0f, 0.0f, 13), qeoVar, ht.a.d, bVar2, 384, 0);
                bVar2 = bVar2;
                Unit unit4 = Unit.a;
                bVar2.X(false);
            }
            d dVarF2 = h.f(androidx.compose.foundation.a.b(hib0.a(aVar3, fjb0.d(bVar2).d, bVar2, aVar3, 1.0f), c68.a(br90Var.m, bVar2), aVar8), fjb0.d(bVar2).d);
            d160 d160VarA5 = b160.a(jVar, bVar, bVar2, 48);
            iHashCode3 = Long.hashCode(bVar2.m());
            ne00 ne00VarS10 = bVar2.S();
            d dVarC10 = c.c(bVar2, dVarF2);
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar10);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, d160VarA5, bVar4);
            hlh0.a(bVar2, ne00VarS10, dVar);
            if (bVar2.S) {
                n30.a(iHashCode3, bVar2, iHashCode3, c1350a2);
            } else {
                n30.a(iHashCode3, bVar2, iHashCode3, c1350a2);
            }
            hlh0.a(bVar2, dVarC10, cVar);
            aVar4 = aVar3;
            d dVarJ2 = h.j(aVar4, 0.0f, 0.0f, fjb0.d(bVar2).d, 0.0f, 11);
            i78 i78VarA6 = g78.a(new kw0.i(fjb0.d(bVar2).c, true, new hw0()), ht.a.o, bVar2, 48);
            iHashCode4 = Long.hashCode(bVar2.m());
            ne00 ne00VarS11 = bVar2.S();
            d dVarC11 = c.c(bVar2, dVarJ2);
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar10);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, i78VarA6, bVar4);
            hlh0.a(bVar2, ne00VarS11, dVar);
            if (bVar2.S) {
                n30.a(iHashCode4, bVar2, iHashCode4, c1350a2);
            } else {
                n30.a(iHashCode4, bVar2, iHashCode4, c1350a2);
            }
            hlh0.a(bVar2, dVarC11, cVar);
            bVar3 = bVar2;
            lkf0.d(cb40.a(R.string.bet_history__pick, new Object[0], bVar2), null, fjb0.b(bVar2).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVar2).o, bVar3, 0, 0, 131066);
            lkf0.d(cb40.a(R.string.bet_history__market, new Object[0], bVar3), null, fjb0.b(bVar3).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVar3).o, bVar3, 0, 0, 131066);
            lkf0.d(cb40.a(R.string.bet_history__outcome, new Object[0], bVar3), null, fjb0.b(bVar3).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVar3).o, bVar3, 0, 0, 131066);
            bVar3.X(true);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f, true);
            i78 i78VarA7 = g78.a(new kw0.i(fjb0.d(bVar3).c, true, new hw0()), aVar12, bVar3, 0);
            iHashCode5 = Long.hashCode(bVar3.m());
            ne00 ne00VarS12 = bVar3.S();
            d dVarC12 = c.c(bVar3, layoutWeightElement2);
            bVar3.D();
            if (bVar3.S) {
                bVar3.F(aVar10);
            } else {
                bVar3.p();
            }
            hlh0.a(bVar3, i78VarA7, bVar4);
            hlh0.a(bVar3, ne00VarS12, dVar);
            if (bVar3.S) {
                n30.a(iHashCode5, bVar3, iHashCode5, c1350a2);
            } else {
                n30.a(iHashCode5, bVar3, iHashCode5, c1350a2);
            }
            hlh0.a(bVar3, dVarC12, cVar);
            br90Var2 = br90Var;
            lkf0.d(br90Var.c.g((Context) bVar3.O(qyd0Var)), g3w.h(aVar4, "content_pick_text"), fjb0.b(bVar3).c, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, fjb0.e(bVar3).n, bVar3, 48, 24960, 110584);
            lkf0.d(br90Var2.d, g3w.h(aVar4, "content_market_text"), fjb0.b(bVar3).c, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, fjb0.e(bVar3).n, bVar3, 48, 24960, 110584);
            lkf0.d(br90Var2.e, g3w.h(aVar4, "content_outcome_text"), fjb0.b(bVar3).c, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, fjb0.e(bVar3).n, bVar3, 48, 24960, 110584);
            bVarI = bVar3;
            bVarI.X(true);
            us90Var = br90Var2.f;
            if (us90Var == null) {
                bVarI.N(-1128712600);
                bVarI.X(false);
                z2 = false;
            } else {
                bVarI.N(-1128712599);
                dVarH = g3w.h(dw.a(j.r(aVar4, 48.0f), 0.1f), us90Var.b);
                er90Var = us90Var.a;
                if (er90Var instanceof er90.b) {
                    bVarI.N(-1702124380);
                    z2 = false;
                    h9n.a(erz.a(((er90.b) er90Var).a, 0, bVarI), null, dVarH, null, null, 0.0f, null, bVarI, 48, 120);
                    bVarI = bVarI;
                    bVarI.X(false);
                } else {
                    z2 = false;
                    if (er90Var instanceof er90.a) {
                        throw igf0.a(bVarI, 83636386, false);
                    }
                    bVarI.N(-1701725038);
                    h6n.b(erz.a(R.drawable.ic__feature__won, 0, bVarI), null, dVarH, c68.a(R.color.icon_brand_sub_primary_d_base, bVarI), bVarI, 48, 0);
                    bVarI.X(false);
                }
                Unit unit5 = Unit.a;
                bVarI.X(z2);
            }
            bVarI.X(true);
            ms90Var = br90Var2.g;
            if (ms90Var == null) {
                bVarI.N(1656345055);
                bVarI.X(z2);
                aVar5 = aVar4;
                qyd0Var2 = qyd0Var;
                function3 = function2;
            } else {
                bVarI.N(1656345056);
                d dVarB3 = androidx.compose.foundation.a.b(j.g(aVar4, 1.0f), fjb0.b(bVarI).r0, aVar8);
                d160 d160VarA6 = b160.a(jVar, bVar, bVarI, 48);
                iHashCode6 = Long.hashCode(bVarI.m());
                ne00 ne00VarS13 = bVarI.S();
                d dVarC13 = c.c(bVarI, dVarB3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar10);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA6, bVar4);
                hlh0.a(bVarI, ne00VarS13, dVar);
                if (bVarI.S) {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a2);
                } else {
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a2);
                }
                hlh0.a(bVarI, dVarC13, cVar);
                qyd0Var2 = qyd0Var;
                String strG4 = ms90Var.b.g((Context) bVarI.O(qyd0Var2));
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                } else {
                    f2 = 1.0f;
                }
                b bVar8 = bVarI;
                lkf0.d(strG4, g3w.h(h.h(h.j(new LayoutWeightElement(f2, true), fjb0.d(bVarI).f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 6.0f, 1), "selection_description_text"), fjb0.b(bVarI).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).q, bVar8, 0, 0, 131064);
                bVarI = bVar8;
                crz crzVarA2 = erz.a(R.drawable.ic__question_circle, 0, bVarI);
                aVar5 = aVar4;
                d dVarA2 = ls7.a(h.f(h.j(aVar4, 0.0f, 0.0f, fjb0.d(bVarI).e, 0.0f, 11), fjb0.d(bVarI).b), j060.a);
                if ((i2 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zA = bVarI.A(ms90Var) | z3;
                objY2 = bVarI.y();
                if (zA) {
                    function3 = function2;
                    objY2 = new Function0() { // from class: xq90
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function3.invoke(ms90Var.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    function3 = function2;
                    objY2 = new Function0() { // from class: xq90
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function3.invoke(ms90Var.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                h6n.b(crzVarA2, "Display selection description", g3w.h(j.r(h.f(androidx.compose.foundation.d.d(dVarA2, false, null, null, (Function0) objY2, 15), fjb0.d(bVarI).b), 16.0f), "selection_description_hint_icon"), fjb0.b(bVarI).P, bVarI, 48, 0);
                bVarI.X(true);
                Unit unit6 = Unit.a;
                bVarI.X(false);
            }
            ty0.a(bVarI, j.i(aVar5, fjb0.d(bVarI).e));
            if (z5) {
                bVarI.N(1658285284);
                b bVar9 = bVarI;
                aVar6 = aVar5;
                lkf0.d(br90Var2.h.g((Context) bVarI.O(qyd0Var2)), j.g(aVar5, 1.0f), fjb0.b(bVarI).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).q, bVar9, 48, 0, 131064);
                bVarI = bVar9;
                iib0.a(aVar6, fjb0.d(bVarI).e, bVarI, false);
            } else {
                aVar6 = aVar5;
                bVarI.N(1658649503);
                bVarI.X(false);
            }
            bVarI.X(true);
            bVarI.X(true);
            if (z5) {
                bVarI.N(-8954806);
                b bVar10 = bVarI;
                ute.b(j.g(aVar6, 1.0f), 1.0f, fjb0.b(bVarI).A, bVar10, 54, 0);
                bVarI = bVar10;
                bVarI.X(false);
            } else {
                bVarI.N(-8775099);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            function3 = function2;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function1<? super ns90, Unit> function4 = function3;
            eVarZ.d = new Function2(function1, function0, function4, i) { // from class: yq90
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    ar90.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
