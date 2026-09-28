package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class d7k0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i, a aVar, final d dVar, final Function0 function0) {
        function0.getClass();
        b bVarI = aVar.i(89588759);
        int i2 = (bVarI.A(function0) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            Class<f7k0> cls = f7k0.class;
            f7k0 f7k0Var = (f7k0) p8i0.a(jq40.a(f7k0.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            e7k0 e7k0Var = (e7k0) wyh.c(f7k0Var.A, bVarI, 0, 7).getValue();
            boolean zA = bVarI.A(f7k0Var);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                zeq zeqVar = new zeq(1, f7k0Var, cls, "onTabSelected", "onTabSelected(Lcom/sportybet/feature/worldcup/tournament/presentation/state/TournamentTab;)V", 0, 1);
                bVarI.r(zeqVar);
                objY = zeqVar;
            }
            Function1 function1 = (Function1) ((chp) objY);
            boolean zA2 = bVarI.A(f7k0Var);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                z6k0 z6k0Var = new z6k0(1, f7k0Var, f7k0.class, "onTeamSelected", "onTeamSelected(Lcom/sporty/android/core/model/worldcuptournament/WorldCupTeam;)Lkotlinx/coroutines/Job;", 8);
                bVarI.r(z6k0Var);
                objY2 = z6k0Var;
            }
            Function1 function2 = (Function1) objY2;
            boolean zA3 = bVarI.A(f7k0Var);
            Object objY3 = bVarI.y();
            if (zA3 || objY3 == c0042a) {
                pt70 pt70Var = new pt70(0, f7k0Var, cls, "onRetry", "onRetry()V", 0);
                bVarI.r(pt70Var);
                objY3 = pt70Var;
            }
            Function0 function3 = (Function0) ((chp) objY3);
            boolean zA4 = bVarI.A(f7k0Var);
            Object objY4 = bVarI.y();
            if (zA4 || objY4 == c0042a) {
                objY4 = new a7k0(1, f7k0Var, f7k0.class, "onGroupBetNowClick", "onGroupBetNowClick(Ljava/lang/String;)V", 0);
                bVarI.r(objY4);
            }
            Function1 function4 = (Function1) ((chp) objY4);
            boolean zA5 = bVarI.A(f7k0Var);
            Object objY5 = bVarI.y();
            if (zA5 || objY5 == c0042a) {
                b7k0 b7k0Var = new b7k0(2, f7k0Var, f7k0.class, "onMatchBetNowClick", "onMatchBetNowClick(Ljava/lang/String;Z)V", 0);
                bVarI.r(b7k0Var);
                objY5 = b7k0Var;
            }
            Function2 function5 = (Function2) ((chp) objY5);
            boolean zA6 = bVarI.A(f7k0Var);
            Object objY6 = bVarI.y();
            if (zA6 || objY6 == c0042a) {
                c7k0 c7k0Var = new c7k0(0, f7k0Var, f7k0.class, "onToolbarHomeClick", "onToolbarHomeClick()V", 0);
                bVarI.r(c7k0Var);
                objY6 = c7k0Var;
            }
            b(dVar, e7k0Var, function1, function2, function3, function4, function5, function0, (Function0) ((chp) objY6), bVarI, 70 | ((i2 << 18) & 29360128));
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, function0) { // from class: w6k0
                public final /* synthetic */ d a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = dVar;
                    this.b = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d7k0.a(qj40.a(7), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:111:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x01da  */
    public static final void b(final d dVar, final e7k0 e7k0Var, final Function1 function1, final Function1 function2, Function0 function0, Function1 function3, final Function2 function4, final Function0 function5, final Function0 function6, a aVar, final int i) {
        int i2;
        qyd0 qyd0Var;
        int iHashCode;
        Iterator<WorldCupTeam> it;
        WorldCupTeam next;
        final Function0 function7 = function0;
        final Function1 function8 = function3;
        b bVarI = aVar.i(907386469);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(e7k0Var) : bVarI.A(e7k0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function7) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function8) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(function5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= bVarI.A(function6) ? 67108864 : 33554432;
        }
        if (bVarI.q(i2 & 1, (38347923 & i2) != 38347922)) {
            d dVarE = j.e(dVar, 1.0f);
            qyd0 qyd0Var2 = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var2)).b1;
            zk40.a aVar2 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarE, j, aVar2);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                qyd0Var = qyd0Var2;
            } else {
                qyd0Var = qyd0Var2;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                odd0.a(null, cb40.a(R.string.world_cup_tournament__title, new Object[0], bVarI), null, function5, function6, bVarI, (i2 >> 12) & 64512, 5);
                d dVarJ = h.j(androidx.compose.foundation.a.b(j.g(d.a.b, 1.0f), ((lib0) bVarI.O(qyd0Var)).d1, aVar2), 0.0f, 0.0f, 16.0f, 0.0f, 11);
                d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarJ);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                agg0.a(new LayoutWeightElement(1.0f, true), e7k0Var.a, function1, bVarI, i2 & 896, 0);
                uf00<WorldCupTeam> uf00Var = e7k0Var.c;
                it = uf00Var.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.g(next.getId(), e7k0Var.b));
                z8f0.d(uf00Var, next, function2, bVarI, (i2 >> 3) & 896);
                bVarI.X(true);
                function7 = function0;
                function8 = function3;
                q3c.b(e7k0Var.a, j.g(new LayoutWeightElement(1.0f, true), 1.0f), null, null, pp8.b(-677322420, new gaj() { // from class: x6k0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        qfg0 qfg0Var = (qfg0) obj;
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        qfg0Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar4.d(qfg0Var.ordinal()) ? 4 : 2;
                        }
                        if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            d dVarE2 = j.e(d.a.b, 1.0f);
                            aiv aivVarC = g75.c(ht.a.a, false);
                            int iHashCode3 = Long.hashCode(aVar4.m());
                            ne00 ne00VarO = aVar4.o();
                            d dVarC3 = c.c(aVar4, dVarE2);
                            yka.k.getClass();
                            tsr.a aVar5 = yka.a.b;
                            if (aVar4.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar4.D();
                            if (aVar4.g()) {
                                aVar4.F(aVar5);
                            } else {
                                aVar4.p();
                            }
                            hlh0.a(aVar4, aivVarC, yka.a.f);
                            hlh0.a(aVar4, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                            }
                            hlh0.a(aVar4, dVarC3, yka.a.d);
                            int iOrdinal = qfg0Var.ordinal();
                            e7k0 e7k0Var2 = e7k0Var;
                            Function0 function9 = function7;
                            if (iOrdinal == 0) {
                                aVar4.N(-13806930);
                                o9l.c(null, e7k0Var2.d, function9, function8, aVar4, 64);
                                aVar4.H();
                            } else {
                                if (iOrdinal != 1) {
                                    throw rg.a(-13808428, aVar4);
                                }
                                aVar4.N(-13799022);
                                drp.b(null, e7k0Var2.e, function9, function4, aVar4, 64);
                                aVar4.H();
                            }
                            aVar4.s();
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 24576, 12);
                bVarI = bVarI;
                bVarI.X(true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            odd0.a(null, cb40.a(R.string.world_cup_tournament__title, new Object[0], bVarI), null, function5, function6, bVarI, (i2 >> 12) & 64512, 5);
            d dVarJ2 = h.j(androidx.compose.foundation.a.b(j.g(d.a.b, 1.0f), ((lib0) bVarI.O(qyd0Var)).d1, aVar2), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarJ2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            agg0.a(new LayoutWeightElement(1.0f, true), e7k0Var.a, function1, bVarI, i2 & 896, 0);
            uf00<WorldCupTeam> uf00Var2 = e7k0Var.c;
            it = uf00Var2.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(next.getId(), e7k0Var.b));
            z8f0.d(uf00Var2, next, function2, bVarI, (i2 >> 3) & 896);
            bVarI.X(true);
            function7 = function0;
            function8 = function3;
            q3c.b(e7k0Var.a, j.g(new LayoutWeightElement(1.0f, true), 1.0f), null, null, pp8.b(-677322420, new gaj() { // from class: x6k0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    qfg0 qfg0Var = (qfg0) obj;
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    qfg0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar4.d(qfg0Var.ordinal()) ? 4 : 2;
                    }
                    if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d dVarE2 = j.e(d.a.b, 1.0f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode3 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC4 = c.c(aVar4, dVarE2);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar5);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, aivVarC, yka.a.f);
                        hlh0.a(aVar4, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC4, yka.a.d);
                        int iOrdinal = qfg0Var.ordinal();
                        e7k0 e7k0Var2 = e7k0Var;
                        Function0 function9 = function7;
                        if (iOrdinal == 0) {
                            aVar4.N(-13806930);
                            o9l.c(null, e7k0Var2.d, function9, function8, aVar4, 64);
                            aVar4.H();
                        } else {
                            if (iOrdinal != 1) {
                                throw rg.a(-13808428, aVar4);
                            }
                            aVar4.N(-13799022);
                            drp.b(null, e7k0Var2.e, function9, function4, aVar4, 64);
                            aVar4.H();
                        }
                        aVar4.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 24576, 12);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y6k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d7k0.b(dVar, e7k0Var, function1, function2, function7, function8, function4, function5, function6, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
