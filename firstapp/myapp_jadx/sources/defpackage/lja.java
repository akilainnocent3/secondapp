package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.models.history.CrashRoundHistoryState;
import com.sportygames.crash.remote.models.Coefficients;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class lja {
    /* JADX WARN: Code duplicated, block: B:104:0x0300  */
    /* JADX WARN: Code duplicated, block: B:106:0x0318  */
    /* JADX WARN: Code duplicated, block: B:109:0x037b  */
    /* JADX WARN: Code duplicated, block: B:111:0x039b  */
    /* JADX WARN: Code duplicated, block: B:114:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:116:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:119:0x040c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x0205  */
    /* JADX WARN: Code duplicated, block: B:84:0x0220  */
    /* JADX WARN: Code duplicated, block: B:87:0x0257  */
    /* JADX WARN: Code duplicated, block: B:88:0x025b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0276  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v26 */
    public static final void a(final uwd0 uwd0Var, final m28 m28Var, final mz1 mz1Var, final cj5 cj5Var, final Function1 function1, final Function0 function0, final String str, a aVar, final int i) {
        b bVar;
        ytw ytwVar;
        yka.a.c cVar;
        boolean zA;
        Object objY;
        final mmd mmdVar;
        Object objY2;
        final isw iswVar;
        Object objY3;
        twd0 twd0Var;
        boolean z;
        n54 n54Var;
        int iHashCode;
        final op8 op8VarB;
        String str2;
        String str3;
        ytw ytwVar2;
        int i2;
        Object objY4;
        int iHashCode2;
        uwd0Var.getClass();
        m28Var.getClass();
        mz1Var.getClass();
        cj5Var.getClass();
        function1.getClass();
        function0.getClass();
        str.getClass();
        b bVarI = aVar.i(69989697);
        int i3 = i | (bVarI.A(uwd0Var) ? 4 : 2) | (bVarI.A(m28Var) ? 32 : 16) | (bVarI.A(mz1Var) ? 256 : 128) | (bVarI.A(cj5Var) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function0) ? 131072 : 65536) | (bVarI.M(str) ? 1048576 : 524288);
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            ytw ytwVarC = wyh.c(uwd0Var, bVarI, i3 & 14, 7);
            int i4 = i5c0.d;
            final boolean zEqualsIgnoreCase = str.equalsIgnoreCase("sporty-hero");
            Coefficients lastCoefficient = ((CrashRoundHistoryState) ytwVarC.getValue()).getLastCoefficient();
            PreviousMultiplierResponse previousRoundsList = ((CrashRoundHistoryState) ytwVarC.getValue()).getPreviousRoundsList();
            Object objY5 = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY5 == c0042a) {
                objY5 = new SnapshotStateList();
                bVarI.r(objY5);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objY5;
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = m.b(Boolean.FALSE);
                bVarI.r(objY6);
            }
            final ytw ytwVar3 = (ytw) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = m.b(Boolean.FALSE);
                bVarI.r(objY7);
            }
            ytw ytwVar4 = (ytw) objY7;
            if (!previousRoundsList.getCoefficients().isEmpty() && !((Boolean) ytwVar3.getValue()).booleanValue()) {
                ytwVar3.setValue(Boolean.TRUE);
                snapshotStateList.addAll(CollectionsKt.t0(previousRoundsList.getCoefficients(), previousRoundsList.getLimit()));
            }
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            boolean zA2 = bVarI.A(ibsVar);
            Object objY8 = bVarI.y();
            if (zA2 || objY8 == c0042a) {
                objY8 = new Function1() { // from class: wia
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v2, types: [hbs, xia] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        final SnapshotStateList snapshotStateList2 = snapshotStateList;
                        final ytw ytwVar5 = ytwVar3;
                        ?? r3 = new cbs() { // from class: xia
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar2, s9s.a aVar2) {
                                if (aVar2 == s9s.a.ON_RESUME) {
                                    snapshotStateList2.clear();
                                    ytwVar5.setValue(Boolean.FALSE);
                                }
                            }
                        };
                        ibs ibsVar2 = ibsVar;
                        ibsVar2.getLifecycle().a(r3);
                        return new ija(ibsVar2, r3);
                    }
                };
                bVarI.r(objY8);
            }
            xvf.c(ibsVar, (Function1) objY8, bVarI);
            d.a aVar2 = d.a.b;
            d dVarA = s3w.a(androidx.compose.foundation.a.b(j.g(j.c(aVar2, 1.0f), 1.0f), zEqualsIgnoreCase ? j58.l : mz1Var.S(), zk40.a), "round_history_layout");
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                ytwVar = ytwVar4;
            } else {
                ytwVar = ytwVar4;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                zA = bVarI.A(lastCoefficient) | bVarI.A(previousRoundsList);
                objY = bVarI.y();
                if (zA || objY == c0042a) {
                    objY = new hja(lastCoefficient, snapshotStateList, previousRoundsList, null);
                    bVarI.r(objY);
                }
                xvf.e(bVarI, lastCoefficient, (Function2) objY);
                mmdVar = (mmd) bVarI.O(kna.h);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = androidx.compose.runtime.j.a(0.0f);
                    bVarI.r(objY2);
                }
                iswVar = (isw) objY2;
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = a6a0.b(new Function0() { // from class: yia
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return new g7f(mmdVar.v1(iswVar.j()));
                        }
                    });
                    bVarI.r(objY3);
                }
                twd0Var = (twd0) objY3;
                if (zEqualsIgnoreCase) {
                    bVarI.N(-2017537550);
                    float f = ((g7f) twd0Var.getValue()).a;
                    fw20.a(R.dimen._5sdp, bVarI);
                    z = false;
                    bVarI.X(false);
                } else {
                    z = false;
                    bVarI.N(-2017463987);
                    bVarI.X(false);
                    float f2 = ((g7f) twd0Var.getValue()).a;
                }
                d dVarG = j.g(aVar2, 1.0f);
                n54Var = ht.a.a;
                aiv aivVarC = g75.c(n54Var, z);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarG);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                op8VarB = pp8.b(1785226168, new Function2() { // from class: zia
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        float fA;
                        a aVar4 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d dVarG2 = j.g(d.a.b, 1.0f);
                            if (zEqualsIgnoreCase) {
                                aVar4.N(1910401784);
                                fA = fw20.a(R.dimen._2sdp, aVar4);
                                aVar4.H();
                            } else {
                                aVar4.N(1910402973);
                                aVar4.H();
                                fA = 10.0f;
                            }
                            d dVarJ = h.j(dVarG2, 0.0f, 0.0f, fA, 0.0f, 11);
                            final m28 m28Var2 = m28Var;
                            boolean zA3 = aVar4.A(m28Var2);
                            final Function1 function2 = function1;
                            boolean zM = zA3 | aVar4.M(function2);
                            final mz1 mz1Var2 = mz1Var;
                            boolean zA4 = zM | aVar4.A(mz1Var2);
                            final String str4 = str;
                            boolean zM2 = zA4 | aVar4.M(str4) | aVar4.M("2");
                            Object objY9 = aVar4.y();
                            if (zM2 || objY9 == a.C0041a.a) {
                                final SnapshotStateList snapshotStateList2 = snapshotStateList;
                                Function1 function3 = new Function1() { // from class: dja
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        szr szrVar = (szr) obj3;
                                        szrVar.getClass();
                                        SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                        szrVar.d(snapshotStateList3.size(), null, new jja(snapshotStateList3), new op8(2039820996, new kja(snapshotStateList3, m28Var2, function2, mz1Var2, str4), true));
                                        return Unit.a;
                                    }
                                };
                                aVar4.r(function3);
                                objY9 = function3;
                            }
                            aur.b(dVarJ, null, null, null, null, null, false, null, (Function1) objY9, aVar4, 12582912, 382);
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI);
                str2 = "2";
                if (zEqualsIgnoreCase) {
                    bVarI.N(-174437214);
                    d dVarJ = h.j(j.g(aVar2, 1.0f), 8.0f, 0.0f, ((g7f) twd0Var.getValue()).a, 0.0f, 10);
                    aiv aivVarC2 = g75.c(n54Var, false);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS3 = bVarI.S();
                    d dVarC3 = c.c(bVarI, dVarJ);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC2, bVar2);
                    hlh0.a(bVarI, ne00VarS3, dVar);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC3, cVar);
                    op8VarB.invoke(bVarI, 6);
                    bVarI.X(true);
                    bVarI.X(false);
                    bVar = bVarI;
                } else {
                    bVarI.N(-174156354);
                    a9h.a(h.j(j.g(aVar2, 1.0f), 8.0f, 0.0f, ((g7f) twd0Var.getValue()).a, 0.0f, 10), true, ((g7f) twd0Var.getValue()).a / 3.0f, mz1Var, "2", pp8.b(1234853910, new gaj() { // from class: aja
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar4 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((m75) obj).getClass();
                            if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                op8VarB.invoke(aVar4, 6);
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, ((i3 << 12) & 3670016) | 113274288, 0);
                    str2 = "2";
                    bVar = bVarI;
                    bVar.X(false);
                }
                if (((Boolean) ytwVar3.getValue()).booleanValue()) {
                    bVar.N(-173548258);
                    ytwVar2 = ytwVar;
                    b(ytwVar2, mz1Var, iswVar, str, bVar, (i3 & 896) | 27702 | ((i3 >> 3) & 458752));
                    str3 = str;
                    i2 = 0;
                } else {
                    str3 = str;
                    ytwVar2 = ytwVar;
                    i2 = 0;
                    bVar.N(-182622051);
                }
                bVar.X(i2);
                if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                    bVar.N(-173170275);
                    function0.invoke();
                    wz.a("RoundHistoryClicked", str3, new String[i2]);
                    boolean zBooleanValue = ((Boolean) ytwVar2.getValue()).booleanValue();
                    objY4 = bVar.y();
                    if (objY4 == c0042a) {
                        objY4 = new bja(ytwVar2, i2);
                        bVar.r(objY4);
                    }
                    int i5 = i3 << 6;
                    b bVar3 = bVar;
                    sja.a(zBooleanValue, (Function0) objY4, snapshotStateList, m28Var, mz1Var, cj5Var, str2, str3, bVar3, (i5 & 458752) | (i5 & 7168) | 432 | (57344 & i5) | 1572864 | ((i3 << 3) & 29360128));
                    bVar = bVar3;
                    bVar.X(false);
                } else {
                    bVar.N(-172486043);
                    bVar.X(i2);
                    ytwVar2.setValue(Boolean.FALSE);
                }
                bVar.X(true);
                bVar.X(true);
            }
            n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            zA = bVarI.A(lastCoefficient) | bVarI.A(previousRoundsList);
            objY = bVarI.y();
            if (zA) {
                objY = new hja(lastCoefficient, snapshotStateList, previousRoundsList, null);
                bVarI.r(objY);
            } else {
                objY = new hja(lastCoefficient, snapshotStateList, previousRoundsList, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, lastCoefficient, (Function2) objY);
            mmdVar = (mmd) bVarI.O(kna.h);
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(objY2);
            }
            iswVar = (isw) objY2;
            objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = a6a0.b(new Function0() { // from class: yia
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return new g7f(mmdVar.v1(iswVar.j()));
                    }
                });
                bVarI.r(objY3);
            }
            twd0Var = (twd0) objY3;
            if (zEqualsIgnoreCase) {
                bVarI.N(-2017537550);
                float f3 = ((g7f) twd0Var.getValue()).a;
                fw20.a(R.dimen._5sdp, bVarI);
                z = false;
                bVarI.X(false);
            } else {
                z = false;
                bVarI.N(-2017463987);
                bVarI.X(false);
                float f4 = ((g7f) twd0Var.getValue()).a;
            }
            d dVarG2 = j.g(aVar2, 1.0f);
            n54Var = ht.a.a;
            aiv aivVarC3 = g75.c(n54Var, z);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC3, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            op8VarB = pp8.b(1785226168, new Function2() { // from class: zia
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    float fA;
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarG3 = j.g(d.a.b, 1.0f);
                        if (zEqualsIgnoreCase) {
                            aVar4.N(1910401784);
                            fA = fw20.a(R.dimen._2sdp, aVar4);
                            aVar4.H();
                        } else {
                            aVar4.N(1910402973);
                            aVar4.H();
                            fA = 10.0f;
                        }
                        d dVarJ2 = h.j(dVarG3, 0.0f, 0.0f, fA, 0.0f, 11);
                        final m28 m28Var2 = m28Var;
                        boolean zA3 = aVar4.A(m28Var2);
                        final Function1 function2 = function1;
                        boolean zM = zA3 | aVar4.M(function2);
                        final mz1 mz1Var2 = mz1Var;
                        boolean zA4 = zM | aVar4.A(mz1Var2);
                        final String str4 = str;
                        boolean zM2 = zA4 | aVar4.M(str4) | aVar4.M("2");
                        Object objY9 = aVar4.y();
                        if (zM2 || objY9 == a.C0041a.a) {
                            final SnapshotStateList snapshotStateList2 = snapshotStateList;
                            Function1 function3 = new Function1() { // from class: dja
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    szr szrVar = (szr) obj3;
                                    szrVar.getClass();
                                    SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                    szrVar.d(snapshotStateList3.size(), null, new jja(snapshotStateList3), new op8(2039820996, new kja(snapshotStateList3, m28Var2, function2, mz1Var2, str4), true));
                                    return Unit.a;
                                }
                            };
                            aVar4.r(function3);
                            objY9 = function3;
                        }
                        aur.b(dVarJ2, null, null, null, null, null, false, null, (Function1) objY9, aVar4, 12582912, 382);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            str2 = "2";
            if (zEqualsIgnoreCase) {
                bVarI.N(-174437214);
                d dVarJ2 = h.j(j.g(aVar2, 1.0f), 8.0f, 0.0f, ((g7f) twd0Var.getValue()).a, 0.0f, 10);
                aiv aivVarC4 = g75.c(n54Var, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS5 = bVarI.S();
                d dVarC5 = c.c(bVarI, dVarJ2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC4, bVar2);
                hlh0.a(bVarI, ne00VarS5, dVar);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC5, cVar);
                op8VarB.invoke(bVarI, 6);
                bVarI.X(true);
                bVarI.X(false);
                bVar = bVarI;
            } else {
                bVarI.N(-174156354);
                a9h.a(h.j(j.g(aVar2, 1.0f), 8.0f, 0.0f, ((g7f) twd0Var.getValue()).a, 0.0f, 10), true, ((g7f) twd0Var.getValue()).a / 3.0f, mz1Var, "2", pp8.b(1234853910, new gaj() { // from class: aja
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((m75) obj).getClass();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            op8VarB.invoke(aVar4, 6);
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i3 << 12) & 3670016) | 113274288, 0);
                str2 = "2";
                bVar = bVarI;
                bVar.X(false);
            }
            if (((Boolean) ytwVar3.getValue()).booleanValue()) {
                bVar.N(-173548258);
                ytwVar2 = ytwVar;
                b(ytwVar2, mz1Var, iswVar, str, bVar, (i3 & 896) | 27702 | ((i3 >> 3) & 458752));
                str3 = str;
                i2 = 0;
            } else {
                str3 = str;
                ytwVar2 = ytwVar;
                i2 = 0;
                bVar.N(-182622051);
            }
            bVar.X(i2);
            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                bVar.N(-173170275);
                function0.invoke();
                wz.a("RoundHistoryClicked", str3, new String[i2]);
                boolean zBooleanValue2 = ((Boolean) ytwVar2.getValue()).booleanValue();
                objY4 = bVar.y();
                if (objY4 == c0042a) {
                    objY4 = new bja(ytwVar2, i2);
                    bVar.r(objY4);
                }
                int i6 = i3 << 6;
                b bVar4 = bVar;
                sja.a(zBooleanValue2, (Function0) objY4, snapshotStateList, m28Var, mz1Var, cj5Var, str2, str3, bVar4, (i6 & 458752) | (i6 & 7168) | 432 | (57344 & i6) | 1572864 | ((i3 << 3) & 29360128));
                bVar = bVar4;
                bVar.X(false);
            } else {
                bVar.N(-172486043);
                bVar.X(i2);
                ytwVar2.setValue(Boolean.FALSE);
            }
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(m28Var, mz1Var, cj5Var, function1, function0, str, i) { // from class: cja
                public final /* synthetic */ m28 b;
                public final /* synthetic */ mz1 c;
                public final /* synthetic */ cj5 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ String i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(12582913);
                    lja.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x019c  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0204  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:85:0x024c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0250  */
    /* JADX WARN: Code duplicated, block: B:91:0x026b  */
    /* JADX WARN: Code duplicated, block: B:94:0x027b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0280  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ytw ytwVar, mz1 mz1Var, final ytw ytwVar2, String str, a aVar, int i) {
        float fA;
        d dVarA;
        twd0 twd0Var;
        boolean z;
        Object objY;
        a.C0041a.C0042a c0042a;
        long jA0;
        float f;
        Object objY2;
        int iHashCode;
        long jD;
        b bVarI = aVar.i(1312640863);
        int i2 = (bVarI.A(mz1Var) ? 256 : 128) | i;
        if ((i & 24576) == 0) {
            i2 |= bVarI.M("2") ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(str) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            twd0 twd0VarB = xe0.b(((Boolean) ytwVar.getValue()).booleanValue() ? 180.0f : 0.0f, null, "rotationAnimation", null, bVarI, 3072, 22);
            j58.c(0.2f, j58.b);
            long j = j58.l;
            int i3 = i5c0.d;
            str.getClass();
            boolean zEqualsIgnoreCase = str.equalsIgnoreCase("sporty-hero");
            float fA2 = (fw20.a(zEqualsIgnoreCase ? R.dimen._4sdp : R.dimen._3sdp, bVarI) * 2.0f) + fw20.a(zEqualsIgnoreCase ? R.dimen._8ssp : R.dimen._10ssp, bVarI);
            if (zEqualsIgnoreCase) {
                bVarI.N(-1272494529);
                fA = fw20.a(R.dimen._2sdp, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-1272493341);
                bVarI.X(false);
                fA = 4.0f;
            }
            float fC = c(R.dimen._7sdp, bVarI) + c(R.dimen._10ssp, bVarI);
            d.a aVar2 = d.a.b;
            d dVarC = j.c(aVar2, 1.0f);
            if (zEqualsIgnoreCase) {
                bVarI.N(-792379213);
                bVarI.X(false);
                dVarA = aVar2;
            } else {
                bVarI.N(-792316965);
                dVarA = androidx.compose.foundation.a.a(aVar2, ya5.a.a(0.0f, i7f.a(12.0f, bVarI), 8, kotlin.collections.b.k(new j58(j58.l), new j58(j))), null, 0.0f, 6);
                bVarI.X(false);
            }
            d dVarA2 = s3w.a(androidx.compose.foundation.layout.d.a.b(h.j(dVarC.n(dVarA), zEqualsIgnoreCase ? 2.0f : 14.0f, 0.0f, 6.0f, 0.0f, 10), ht.a.f), "round_history_btn");
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                twd0Var = twd0VarB;
            } else {
                twd0Var = twd0VarB;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC2, cVar);
                bVarI.N(1162721625);
                if (zEqualsIgnoreCase) {
                    bVarI.N(-101038897);
                    z = false;
                } else {
                    z = false;
                    bVarI.N(-101038371);
                    fA2 = lla.b(fC, bVarI);
                }
                bVarI.X(z);
                d dVarI = j.i(aVar2, fA2);
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = new Function1() { // from class: eja
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            urr urrVar = (urr) obj;
                            urrVar.getClass();
                            ytwVar2.setValue(Float.valueOf((int) (urrVar.a() >> 32)));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                d dVarA3 = v.a(dVarI, (Function1) objY);
                if (zEqualsIgnoreCase) {
                    jA0 = i5c0.b;
                } else {
                    jA0 = mz1Var.A0();
                }
                d dVarB = androidx.compose.foundation.a.b(dVarA3, jA0, j060.b(50));
                if (zEqualsIgnoreCase) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                d dVarA4 = d35.a(dVarB, f, i5c0.c, j060.b(50));
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new fja(ytwVar, 0);
                    bVarI.r(objY2);
                }
                d dVarG = h.g(androidx.compose.foundation.d.d(dVarA4, false, null, null, (Function0) objY2, 15), fw20.a(R.dimen._9sdp, bVarI), fA);
                d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarG);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                crz crzVarA = erz.a(2131233690, 0, bVarI);
                if (zEqualsIgnoreCase) {
                    jD = j58.f;
                } else {
                    jD = r58.d(4280789514L);
                }
                h9n.a(crzVarA, "Round history arrow", p1a.a(j.r(aVar2, 8.0f), ((Number) twd0Var.getValue()).floatValue()), null, d0b.a.b, 0.0f, new gf4(jD, 5), bVarI, 24624, 40);
                bVarI = bVarI;
                f30.a(bVarI, true, false, true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC2, cVar2);
            bVarI.N(1162721625);
            if (zEqualsIgnoreCase) {
                bVarI.N(-101038897);
                z = false;
            } else {
                z = false;
                bVarI.N(-101038371);
                fA2 = lla.b(fC, bVarI);
            }
            bVarI.X(z);
            d dVarI2 = j.i(aVar2, fA2);
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new Function1() { // from class: eja
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        urr urrVar = (urr) obj;
                        urrVar.getClass();
                        ytwVar2.setValue(Float.valueOf((int) (urrVar.a() >> 32)));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarA5 = v.a(dVarI2, (Function1) objY);
            if (zEqualsIgnoreCase) {
                jA0 = i5c0.b;
            } else {
                jA0 = mz1Var.A0();
            }
            d dVarB2 = androidx.compose.foundation.a.b(dVarA5, jA0, j060.b(50));
            if (zEqualsIgnoreCase) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            d dVarA6 = d35.a(dVarB2, f, i5c0.c, j060.b(50));
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new fja(ytwVar, 0);
                bVarI.r(objY2);
            }
            d dVarG2 = h.g(androidx.compose.foundation.d.d(dVarA6, false, null, null, (Function0) objY2, 15), fw20.a(R.dimen._9sdp, bVarI), fA);
            d160 d160VarA2 = b160.a(kw0.e, ht.a.k, bVarI, 54);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar2);
            crz crzVarA2 = erz.a(2131233690, 0, bVarI);
            if (zEqualsIgnoreCase) {
                jD = j58.f;
            } else {
                jD = r58.d(4280789514L);
            }
            h9n.a(crzVarA2, "Round history arrow", p1a.a(j.r(aVar2, 8.0f), ((Number) twd0Var.getValue()).floatValue()), null, d0b.a.b, 0.0f, new gf4(jD, 5), bVarI, 24624, 40);
            bVarI = bVarI;
            f30.a(bVarI, true, false, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new gja(ytwVar, mz1Var, ytwVar2, str, i);
        }
    }

    public static final float c(int i, a aVar) {
        aVar.N(1944557521);
        float fC1 = ((mmd) aVar.O(kna.h)).C1(fw20.a(i, aVar));
        aVar.H();
        return fC1;
    }
}
