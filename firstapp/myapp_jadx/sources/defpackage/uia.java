package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crashInitiated.model.response.CrashInitiatedCoeffListResponse;
import com.sportygames.crashInitiated.remote.models.PreviousMultiplierResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class uia {

    @c0d(c = "com.sportygames.crashInitiated.components.ComposeRoundHistoryContainerInitiatedNewKt$ComposeRoundHistoryContainerInitiatedNew$2$1$1", f = "ComposeRoundHistoryContainerInitiatedNew.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ CrashInitiatedCoeffListResponse a;
        public final /* synthetic */ SnapshotStateList<gch0> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CrashInitiatedCoeffListResponse crashInitiatedCoeffListResponse, SnapshotStateList<gch0> snapshotStateList, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = crashInitiatedCoeffListResponse;
            this.b = snapshotStateList;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            CrashInitiatedCoeffListResponse crashInitiatedCoeffListResponse = this.a;
            if (crashInitiatedCoeffListResponse.isNew()) {
                SnapshotStateList<gch0> snapshotStateList = this.b;
                if (snapshotStateList == null || !snapshotStateList.isEmpty()) {
                    Iterator<gch0> it = snapshotStateList.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.g(it.next().b, crashInitiatedCoeffListResponse)) {
                        }
                    }
                    snapshotStateList.add(0, new gch0(System.nanoTime(), crashInitiatedCoeffListResponse));
                    if (snapshotStateList.size() > 7) {
                        snapshotStateList.remove(snapshotStateList.size() - 1);
                    }
                } else {
                    snapshotStateList.add(0, new gch0(System.nanoTime(), crashInitiatedCoeffListResponse));
                    if (snapshotStateList.size() > 7) {
                        snapshotStateList.remove(snapshotStateList.size() - 1);
                    }
                }
            }
            return Unit.a;
        }
    }

    public static final class b implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public b(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class c implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ mz1 b;

        public c(List list, mz1 mz1Var) {
            this.a = list;
            this.b = mz1Var;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                gch0 gch0Var = (gch0) this.a.get(iIntValue);
                aVar2.N(783680554);
                aVar2.C(-806003975, Long.valueOf(gch0Var.a));
                uia.b(gch0Var.a, gch0Var.b, this.b, null, aVar2, 0);
                aVar2.K();
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0133  */
    /* JADX WARN: Code duplicated, block: B:52:0x014f  */
    /* JADX WARN: Code duplicated, block: B:55:0x015f  */
    /* JADX WARN: Code duplicated, block: B:58:0x018f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0193  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ae  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final PreviousMultiplierResponse previousMultiplierResponse, final CrashInitiatedCoeffListResponse crashInitiatedCoeffListResponse, final mz1 mz1Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean zA;
        Object objY;
        final mmd mmdVar;
        Object objY2;
        final isw iswVar;
        Object objY3;
        int iHashCode;
        crashInitiatedCoeffListResponse.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-580012823);
        int i3 = (bVarI.A(previousMultiplierResponse) ? 4 : 2) | i | (bVarI.A(crashInitiatedCoeffListResponse) ? 32 : 16) | (bVarI.A(mz1Var) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            Object objY4 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY4 == c0042a) {
                objY4 = new SnapshotStateList();
                bVarI.r(objY4);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = m.b(Boolean.FALSE);
                bVarI.r(objY5);
            }
            ytw ytwVar = (ytw) objY5;
            if (!previousMultiplierResponse.getCoefficients().isEmpty() && !((Boolean) ytwVar.getValue()).booleanValue()) {
                ytwVar.setValue(Boolean.TRUE);
                List listT0 = CollectionsKt.t0(previousMultiplierResponse.getCoefficients(), 7);
                ArrayList arrayList = new ArrayList(l48.r(listT0, 10));
                Iterator it = listT0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new gch0(System.nanoTime(), (CrashInitiatedCoeffListResponse) it.next()));
                }
                snapshotStateList.addAll(arrayList);
            }
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.g(j.c(aVar2, 1.0f), 1.0f), mz1Var.S(), zk40.a);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
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
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                i2 = i3;
            } else {
                i2 = i3;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                zA = bVarI.A(crashInitiatedCoeffListResponse);
                objY = bVarI.y();
                if (zA || objY == c0042a) {
                    objY = new a(crashInitiatedCoeffListResponse, snapshotStateList, null);
                    bVarI.r(objY);
                }
                xvf.e(bVarI, crashInitiatedCoeffListResponse, (Function2) objY);
                mmdVar = (mmd) bVarI.O(kna.h);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = androidx.compose.runtime.j.a(0.0f);
                    bVarI.r(objY2);
                }
                iswVar = (isw) objY2;
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = a6a0.b(new Function0() { // from class: oia
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return new g7f(mmdVar.v1(iswVar.j()));
                        }
                    });
                    bVarI.r(objY3);
                }
                twd0 twd0Var = (twd0) objY3;
                d dVarG = j.g(aVar2, 1.0f);
                aiv aivVarC = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                a9h.a(h.j(j.g(aVar2, 1.0f), 8.0f, 0.0f, ((g7f) twd0Var.getValue()).a, 0.0f, 10), true, ((g7f) twd0Var.getValue()).a / 3.0f, mz1Var, null, pp8.b(-121125150, new gaj() { // from class: pia
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((m75) obj).getClass();
                        int i4 = 0;
                        if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            d dVarG2 = j.g(d.a.b, 1.0f);
                            mz1 mz1Var2 = mz1Var;
                            boolean zA2 = aVar4.A(mz1Var2);
                            Object objY6 = aVar4.y();
                            if (zA2 || objY6 == a.C0041a.a) {
                                objY6 = new ria(i4, snapshotStateList, mz1Var2);
                                aVar4.r(objY6);
                            }
                            aur.b(dVarG2, null, null, null, null, null, false, null, (Function1) objY6, aVar4, 12582918, 382);
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i2 << 12) & 3670016) | 100691376, 128);
                bVarI.X(true);
                bVarI.X(true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            zA = bVarI.A(crashInitiatedCoeffListResponse);
            objY = bVarI.y();
            if (zA) {
                objY = new a(crashInitiatedCoeffListResponse, snapshotStateList, null);
                bVarI.r(objY);
            } else {
                objY = new a(crashInitiatedCoeffListResponse, snapshotStateList, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, crashInitiatedCoeffListResponse, (Function2) objY);
            mmdVar = (mmd) bVarI.O(kna.h);
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(objY2);
            }
            iswVar = (isw) objY2;
            objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = a6a0.b(new Function0() { // from class: oia
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return new g7f(mmdVar.v1(iswVar.j()));
                    }
                });
                bVarI.r(objY3);
            }
            twd0 twd0Var2 = (twd0) objY3;
            d dVarG2 = j.g(aVar2, 1.0f);
            aiv aivVarC2 = g75.c(ht.a.a, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            a9h.a(h.j(j.g(aVar2, 1.0f), 8.0f, 0.0f, ((g7f) twd0Var2.getValue()).a, 0.0f, 10), true, ((g7f) twd0Var2.getValue()).a / 3.0f, mz1Var, null, pp8.b(-121125150, new gaj() { // from class: pia
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((m75) obj).getClass();
                    int i4 = 0;
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarG3 = j.g(d.a.b, 1.0f);
                        mz1 mz1Var2 = mz1Var;
                        boolean zA2 = aVar4.A(mz1Var2);
                        Object objY6 = aVar4.y();
                        if (zA2 || objY6 == a.C0041a.a) {
                            objY6 = new ria(i4, snapshotStateList, mz1Var2);
                            aVar4.r(objY6);
                        }
                        aur.b(dVarG3, null, null, null, null, null, false, null, (Function1) objY6, aVar4, 12582918, 382);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 << 12) & 3670016) | 100691376, 128);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(crashInitiatedCoeffListResponse, mz1Var, i) { // from class: qia
                public final /* synthetic */ CrashInitiatedCoeffListResponse b;
                public final /* synthetic */ mz1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    uia.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final long j, final CrashInitiatedCoeffListResponse crashInitiatedCoeffListResponse, final mz1 mz1Var, d dVar, androidx.compose.runtime.a aVar, final int i) {
        final d dVar2;
        int i2;
        int i3;
        crashInitiatedCoeffListResponse.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(728715636);
        int i4 = i | (bVarI.e(j) ? 4 : 2) | (bVarI.A(crashInitiatedCoeffListResponse) ? 32 : 16) | (bVarI.A(mz1Var) ? 256 : 128);
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = nvc.a(!crashInitiatedCoeffListResponse.isNew(), bVarI);
            }
            ytw ytwVar = (ytw) objY;
            twd0 twd0VarB = xe0.b(((Boolean) ytwVar.getValue()).booleanValue() ? 0.0f : -300.0f, yi0.e(300, 0, xkf.a, 2), "SlideInAnimation", null, bVarI, 3072, 20);
            Long lValueOf = Long.valueOf(j);
            boolean zA = bVarI.A(crashInitiatedCoeffListResponse);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new via(crashInitiatedCoeffListResponse, ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, lValueOf, (Function2) objY2);
            float fA = fw20.a(R.dimen._4sdp, bVarI);
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(aVar2, 0.0f, 0.0f, fA, 0.0f, 11);
            boolean zM = bVarI.M(twd0VarB);
            Object objY3 = bVarI.y();
            if (zM || objY3 == c0042a) {
                objY3 = new sia(twd0VarB, 0);
                bVarI.r(objY3);
            }
            d dVarG = h.g(androidx.compose.foundation.a.b(ls7.a(g.b(dVarJ, (Function1) objY3), j060.c(24.0f)), mz1Var.y0(), zk40.a), fw20.a(R.dimen._11sdp, bVarI), fw20.a(R.dimen._3sdp, bVarI));
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String strConcat = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(crashInitiatedCoeffListResponse.getHouseCoefficient())}, 1)).concat("x");
            if (crashInitiatedCoeffListResponse.isWon()) {
                i2 = 1351748093;
                i3 = R.color.sg_rush_coeff_green;
            } else {
                i2 = 1351750683;
                i3 = R.color.sg_rush_coeff_red;
            }
            lkf0.b(strConcat, null, rzg.a(bVarI, i2, i3, bVarI, false), 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(ni60.b)).d, R.dimen._10ssp, bVarI), bVarI, 0, 0, 65018);
            bVarI = bVarI;
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, crashInitiatedCoeffListResponse, mz1Var, dVar2, i) { // from class: tia
                public final /* synthetic */ long a;
                public final /* synthetic */ CrashInitiatedCoeffListResponse b;
                public final /* synthetic */ mz1 c;
                public final /* synthetic */ d d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    uia.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
