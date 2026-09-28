package defpackage;

import androidx.transition.nfj.CaBJCMnsV;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckProcessor;
import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultTypeDto;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.liabilitycheck.domain.model.LiabilityCheckSelection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes2.dex */
public final class o8s {
    public final h940 a;
    public final jrm b;
    public final ArrayList c;

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h8s.values().length];
            try {
                h8s h8sVar = h8s.a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                h8s h8sVar2 = h8s.a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public o8s(h940 h940Var, jrm jrmVar) {
        h940Var.getClass();
        jrmVar.getClass();
        this.a = h940Var;
        this.b = jrmVar;
        jrmVar.m1(new iu2.a() { // from class: n8s
            @Override // iu2.a
            public final void C() {
                Object obj;
                jrm jrmVar2 = this.a.b;
                j8s j8sVarW = jrmVar2.w();
                if (!(j8sVarW instanceof j8s.b)) {
                    if (!(j8sVarW instanceof j8s.c) || jrmVar2.u()) {
                        return;
                    }
                    j8s.c cVar = (j8s.c) j8sVarW;
                    if (g880.v(jrmVar2.U(), cVar.d)) {
                        jrmVar2.k0(j8s.c.a(cVar, false));
                        return;
                    }
                    return;
                }
                j8s.b bVar = (j8s.b) j8sVarW;
                List<LiabilityCheckSelection> list = bVar.c;
                ArrayList arrayListC0 = CollectionsKt.C0(list);
                for (LiabilityCheckSelection liabilityCheckSelection : list) {
                    ArrayList arrayListU = jrmVar2.U();
                    if (arrayListU == null || !arrayListU.isEmpty()) {
                        int size = arrayListU.size();
                        int i = 0;
                        do {
                            if (i < size) {
                                obj = arrayListU.get(i);
                                i++;
                            }
                        } while (!g880.w((Selection) obj, liabilityCheckSelection));
                    }
                    arrayListC0.remove(liabilityCheckSelection);
                }
                m8s m8sVar = bVar.a;
                LiabilityCheckResultTypeDto liabilityCheckResultTypeDto = bVar.b;
                liabilityCheckResultTypeDto.getClass();
                jrmVar2.k0(new j8s.b(m8sVar, liabilityCheckResultTypeDto, arrayListC0));
            }
        });
        this.c = new ArrayList();
    }

    public final boolean a() {
        jrm jrmVar = this.b;
        if (!jrmVar.W()) {
            return false;
        }
        j8s j8sVarW = jrmVar.w();
        if (j8sVarW instanceof j8s.b) {
            return true;
        }
        return (j8sVarW instanceof j8s.c) && !((j8s.c) j8sVarW).e;
    }

    public final bew c() {
        int i;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_LIABILITY_CHECK);
        ArrayList arrayList = this.c;
        int i2 = 0;
        aVar.g("liabilityCheckEventRecords:\n".concat(CollectionsKt.a0(arrayList, "\n", null, null, null, 62)), new Object[0]);
        h8s h8sVar = (h8s) CollectionsKt.firstOrNull(arrayList);
        int i3 = h8sVar == null ? -1 : a.a[h8sVar.ordinal()];
        if (i3 == 1) {
            h8s h8sVar2 = h8s.e;
            if (arrayList.contains(h8sVar2) || arrayList.contains(h8s.d)) {
                if (arrayList.lastIndexOf(h8sVar2) > arrayList.lastIndexOf(h8s.d)) {
                    if (arrayList.isEmpty()) {
                        i = 0;
                    } else {
                        int size = arrayList.size();
                        i = 0;
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            if (((h8s) obj) == h8s.e && (i = i + 1) < 0) {
                                b.p();
                                throw null;
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayList.get(i5);
                            i5++;
                            if (((h8s) obj2) == h8s.c && (i2 = i2 + 1) < 0) {
                                b.p();
                                throw null;
                            }
                        }
                    }
                    if (i == i2) {
                        return bew.PLACE_BET_AFTER_REJECTED_BY_BC_VIA_MULTI_MAKER;
                    }
                } else if (!arrayList.contains(h8s.c)) {
                    return bew.PLACE_BET_AFTER_REJECTED_BY_BC_VIA_ADD_RELATED_BET;
                }
            } else if (!arrayList.contains(h8s.c)) {
                return bew.PLACE_BET_AFTER_REJECTED_BY_BC_VIA_MANUAL_CHANGE;
            }
        } else if (i3 == 2 && !arrayList.contains(h8s.c)) {
            return bew.PLACE_BET_AFTER_REJECTED_BY_BET_OR_MARKET;
        }
        return null;
    }

    public final Collection<Selection> d() {
        jrm jrmVar = this.b;
        if (!jrmVar.W()) {
            return t3g.a;
        }
        j8s j8sVarW = jrmVar.w();
        if (!(j8sVarW instanceof j8s.b)) {
            return t3g.a;
        }
        ArrayList arrayListU = jrmVar.U();
        ArrayList arrayList = new ArrayList();
        int size = arrayListU.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListU.get(i);
            i++;
            Selection selection = (Selection) obj;
            List<LiabilityCheckSelection> list = ((j8s.b) j8sVarW).c;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (g880.w((LiabilityCheckSelection) it.next(), selection)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public final j8s e(BaseResponse baseResponse, ArrayList arrayList) {
        baseResponse.getClass();
        jrm jrmVar = this.b;
        if (arrayList == null) {
            arrayList = jrmVar.U();
        }
        j8s j8sVarA = k8s.a(baseResponse, m8s.a, arrayList);
        boolean z = j8sVarA instanceof j8s.b;
        ArrayList arrayList2 = this.c;
        if (z) {
            arrayList2.clear();
            arrayList2.add(h8s.a);
        } else if (j8sVarA instanceof j8s.c) {
            arrayList2.clear();
            arrayList2.add(h8s.b);
        }
        jrmVar.k0(j8sVarA);
        return j8sVarA;
    }

    public final boolean f() {
        jrm jrmVar = this.b;
        int i = 0;
        if (jrmVar.W()) {
            j8s j8sVarW = jrmVar.w();
            if (j8sVarW instanceof j8s.c) {
                ArrayList arrayListU = jrmVar.U();
                ArrayList arrayList = new ArrayList();
                int size = arrayListU.size();
                while (i < size) {
                    Object obj = arrayListU.get(i);
                    i++;
                    if (qz3.b((Selection) obj)) {
                        arrayList.add(obj);
                    }
                }
                return g880.v(((j8s.c) j8sVarW).d, arrayList);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(i8s i8sVar, x1b x1bVar) {
        p8s p8sVar;
        Object bVar;
        ArrayList arrayList;
        if (x1bVar instanceof p8s) {
            p8sVar = (p8s) x1bVar;
            int i = p8sVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p8sVar.d = i - Integer.MIN_VALUE;
            } else {
                p8sVar = new p8s(this, x1bVar);
            }
        } else {
            p8sVar = new p8s(this, x1bVar);
        }
        Object objJ = p8sVar.b;
        y5b y5bVar = y5b.a;
        int i2 = p8sVar.d;
        jrm jrmVar = this.b;
        try {
            if (i2 == 0) {
                uj50.b(objJ);
                ArrayList arrayListU = jrmVar.U();
                ArrayList arrayList2 = new ArrayList();
                int size = arrayListU.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayListU.get(i3);
                    i3++;
                    if (qz3.b((Selection) obj)) {
                        arrayList2.add(obj);
                    }
                }
                Set setB = i8sVar == i8s.b ? wi80.b(LiabilityCheckProcessor.MARKET_AND_BET_LIABILITY_CHECK) : LiabilityCheckProcessor.getEntries();
                zi50.a aVar = zi50.b;
                h940 h940Var = this.a;
                ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    arrayList3.add(l8s.a((Selection) obj2));
                }
                p8sVar.a = arrayList2;
                p8sVar.d = 1;
                objJ = h940Var.J(arrayList3, setB, p8sVar);
                if (objJ == y5bVar) {
                    return y5bVar;
                }
                arrayList = arrayList2;
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = p8sVar.a;
                uj50.b(objJ);
            }
            bVar = k8s.a((BaseResponse) objJ, m8s.b, arrayList);
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_LIABILITY_CHECK);
            aVar4.p(thA, CaBJCMnsV.bXRLFjIIk, new Object[0]);
        }
        j8s dVar = (j8s) (bVar instanceof zi50.b ? null : bVar);
        if (dVar == null) {
            dVar = new j8s.d(m8s.b);
        }
        j8s j8sVarW = jrmVar.w();
        if (!(j8sVarW instanceof j8s.c)) {
            jrmVar.k0(dVar);
        } else if (dVar instanceof j8s.a) {
            jrmVar.k0(j8s.c.a((j8s.c) j8sVarW, true));
        }
        return dVar;
    }
}
