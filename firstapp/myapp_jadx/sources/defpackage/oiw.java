package defpackage;

import android.util.Range;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckProcessor;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import com.sportybet.android.multimaker.domain.model.MultiMakerMarket;
import com.sportybet.android.multimaker.presentation.uievent.MultiMakerAddToBetSlipOptionsUiEvent;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.liabilitycheck.domain.model.LiabilityCheckSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$addToBetSlip$1", f = "MultiMakerViewModel.kt", l = {751, 757, 761, 770, 779}, m = "invokeSuspend", v = 2)
public final class oiw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public List a;
    public MultiMakerAddToBetSlipOptionsUiEvent b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ tjw i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oiw(v1b v1bVar, tjw tjwVar) {
        super(2, v1bVar);
        this.i = tjwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        oiw oiwVar = new oiw(v1bVar, this.i);
        oiwVar.f = obj;
        return oiwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((oiw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0248  */
    /* JADX WARN: Code duplicated, block: B:102:0x0250  */
    /* JADX WARN: Code duplicated, block: B:105:0x025f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0262  */
    /* JADX WARN: Code duplicated, block: B:110:0x0273  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:122:0x02be  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:139:0x033b  */
    /* JADX WARN: Code duplicated, block: B:140:0x033e  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ea A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:? A[LOOP:3: B:56:0x011b->B:164:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x010c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121  */
    /* JADX WARN: Code duplicated, block: B:64:0x015b  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190 A[Catch: all -> 0x01cf, TryCatch #1 {all -> 0x01cf, blocks: (B:70:0x0177, B:71:0x018a, B:73:0x0190, B:77:0x01b3, B:80:0x01d4), top: B:145:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x020d  */
    /* JADX WARN: Code duplicated, block: B:92:0x021b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0220  */
    /* JADX WARN: Code duplicated, block: B:98:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v17, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v28 */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        int i;
        Iterator it;
        boolean z;
        Object objO;
        List<MultiMakerItem> list2;
        int i2;
        ?? r7;
        MultiMakerAddToBetSlipOptionsUiEvent multiMakerAddToBetSlipOptionsUiEvent;
        MultiMakerAddToBetSlipOptionsUiEvent multiMakerAddToBetSlipOptionsUiEvent2;
        int i3;
        List list3;
        ArrayList arrayList;
        Object objJ;
        MultiMakerMarket multiMakerMarket;
        boolean z2;
        Object bVar;
        Throwable thA;
        j8s dVar;
        jrm jrmVar;
        j8s j8sVarW;
        boolean z3;
        String str;
        ArrayList arrayList2;
        int iOrdinal;
        boolean z4;
        k980 k980Var;
        k980 k980Var2;
        ArrayList arrayList3;
        int size;
        int i4;
        boolean z5;
        Selection selectionC;
        v5b v5bVar = (v5b) this.f;
        y5b y5bVar = y5b.a;
        int i5 = this.e;
        tjw tjwVar = this.i;
        if (i5 == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = tjwVar.M;
            ifw ifwVar = tjwVar.e;
            wwd0 wwd0Var2 = tjwVar.b0;
            list = (List) wwd0Var.getValue();
            if (list.isEmpty()) {
                return Unit.a;
            }
            mhw mhwVar = (mhw) tjwVar.a0.getValue();
            int iOrdinal2 = mhwVar.ordinal();
            if (iOrdinal2 == 0) {
                lhw lhwVarC1 = tjw.C1((List) wwd0Var2.getValue(), mhwVar);
                Float fValueOf = Float.valueOf(lhwVarC1.a);
                Float f = lhwVarC1.b;
                Range range = new Range(fValueOf, Float.valueOf(f != null ? f.floatValue() : Float.MAX_VALUE));
                this.f = v5bVar;
                this.a = list;
                this.b = null;
                this.e = 1;
                if (ifwVar.N(range, this) != y5bVar) {
                }
            } else {
                if (iOrdinal2 != 1) {
                    uhc.a();
                    return null;
                }
                float f2 = tjw.C1((List) wwd0Var2.getValue(), mhwVar).a;
                this.f = v5bVar;
                this.a = list;
                this.b = null;
                this.e = 2;
                if (ifwVar.S(f2, this) != y5bVar) {
                }
            }
            return y5bVar;
        }
        if (i5 == 1 || i5 == 2) {
            list = this.a;
            uj50.b(obj);
        } else {
            if (i5 == 3) {
                list = this.a;
                uj50.b(obj);
                if (tjwVar.A || tjwVar.f.U().isEmpty()) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (list == null && list.isEmpty()) {
                    z = false;
                    break;
                }
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((MultiMakerItem) it.next()).d) {
                        z = true;
                        break;
                    }
                }
                ku90<hiw> ku90Var = tjwVar.i0;
                this.f = v5bVar;
                this.a = list;
                this.c = i;
                this.d = z ? 1 : 0;
                this.e = 4;
                bc6 bc6Var = new bc6(1, yzo.b(this));
                bc6Var.q();
                ku90Var.a(new hiw.b(z, new iiw(bc6Var)));
                objO = bc6Var.o();
                y5b y5bVar2 = y5b.a;
                if (objO != y5bVar) {
                    list2 = list;
                    i2 = i;
                    r7 = z;
                    multiMakerAddToBetSlipOptionsUiEvent = (MultiMakerAddToBetSlipOptionsUiEvent) objO;
                    multiMakerAddToBetSlipOptionsUiEvent.getClass();
                    if (multiMakerAddToBetSlipOptionsUiEvent.equals(MultiMakerAddToBetSlipOptionsUiEvent.Cancel.a)) {
                        return Unit.a;
                    }
                    wwd0 wwd0Var3 = tjwVar.Q;
                    Boolean bool = Boolean.TRUE;
                    wwd0Var3.getClass();
                    wwd0Var3.k(null, bool);
                    zi50.a aVar = zi50.b;
                    h940 h940Var = tjwVar.d;
                    arrayList = new ArrayList(l48.r(list2, 10));
                    for (MultiMakerItem multiMakerItem : list2) {
                        multiMakerItem.getClass();
                        String str2 = multiMakerItem.a.a;
                        multiMakerMarket = multiMakerItem.b;
                        String str3 = multiMakerMarket.a;
                        String str4 = multiMakerItem.c.a;
                        String str5 = multiMakerMarket.b;
                        if (multiMakerMarket.c == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList.add(new LiabilityCheckSelection(str2, str3, str4, str5, null, null, Boolean.valueOf(z2), 48, null));
                    }
                    Set setB = wi80.b(LiabilityCheckProcessor.BOOKING_CODE_LIABILITY_CHECK);
                    this.f = null;
                    this.a = list2;
                    this.b = multiMakerAddToBetSlipOptionsUiEvent;
                    this.c = i2;
                    this.d = r7;
                    this.e = 5;
                    objJ = h940Var.J(arrayList, setB, this);
                    if (objJ != y5bVar) {
                        multiMakerAddToBetSlipOptionsUiEvent2 = multiMakerAddToBetSlipOptionsUiEvent;
                        i3 = i2;
                        list3 = list2;
                        bVar = k8s.a((BaseResponse) objJ, m8s.b, list3);
                        zi50.a aVar2 = zi50.b;
                        thA = zi50.a(bVar);
                        if (thA != null) {
                            itf0.a aVar3 = itf0.a;
                            aVar3.q(MyLog.TAG_MULTI_MAKER);
                            aVar3.o(thA);
                        }
                        if (bVar instanceof zi50.b) {
                            bVar = null;
                        }
                        dVar = (j8s) bVar;
                        if (dVar == null) {
                            dVar = new j8s.d(m8s.b);
                        }
                        wwd0 wwd0Var4 = tjwVar.Q;
                        jrmVar = tjwVar.f;
                        Boolean bool2 = Boolean.FALSE;
                        wwd0Var4.getClass();
                        wwd0Var4.k(null, bool2);
                        if (dVar instanceof j8s.c) {
                            wwd0 wwd0Var5 = tjwVar.P;
                            Boolean bool3 = Boolean.TRUE;
                            wwd0Var5.getClass();
                            wwd0Var5.k(null, bool3);
                            jrmVar.k0(dVar);
                            return Unit.a;
                        }
                        j8sVarW = jrmVar.w();
                        if (j8sVarW instanceof j8s.c) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (i3 == 0) {
                            jrmVar.G(z3);
                            tjwVar.i.clear();
                            tjwVar.v.clear();
                        }
                        str = tjwVar.B;
                        if (str != null) {
                            f00 f00Var = vgb0.a;
                            vgb0.c("add_to_betslip_in_multimaker", jpu.b(new Pair("from", tjwVar.B)), false);
                        }
                        tjwVar.y.a(rfw.a, k00.d, k00.c);
                        arrayList2 = new ArrayList();
                        iOrdinal = ((mhw) tjwVar.a0.getValue()).ordinal();
                        if (iOrdinal != 0) {
                            z4 = true;
                            if (iOrdinal == 1) {
                                uhc.a();
                                return null;
                            }
                            k980Var = k980.e;
                        } else {
                            z4 = true;
                            k980Var = k980.d;
                        }
                        k980Var2 = k980Var;
                        jrmVar.X0(z4);
                        arrayList3 = new ArrayList();
                        for (Object obj2 : list3) {
                            MultiMakerItem multiMakerItem2 = (MultiMakerItem) obj2;
                            multiMakerAddToBetSlipOptionsUiEvent2.getClass();
                            if (!multiMakerAddToBetSlipOptionsUiEvent2.equals(MultiMakerAddToBetSlipOptionsUiEvent.AllSelections.a)) {
                            }
                            arrayList3.add(obj2);
                        }
                        size = arrayList3.size();
                        i4 = 0;
                        while (i4 < size) {
                            Object obj3 = arrayList3.get(i4);
                            i4++;
                            selectionC = sd9.c((MultiMakerItem) obj3);
                            if (i3 != 0) {
                                arrayList2.add(selectionC);
                            } else {
                                jrmVar.j0(selectionC.a, selectionC.b, selectionC.c, k980Var2);
                                iym iymVar = tjwVar.w;
                                PageMeta.INSTANCE.getClass();
                                iymVar.f(AnalyticsEvent.MULTI_MAKER_ADD_TO_BETSLIP, new PageMeta("multimaker", null));
                            }
                        }
                        jrmVar.X0(false);
                        tjwVar.c.c.add(h8s.e);
                        ku90<hiw> ku90Var2 = tjwVar.i0;
                        int i6 = tjwVar.C;
                        int i7 = tjwVar.D;
                        if (i3 != 0) {
                            z5 = z4;
                        } else {
                            z5 = false;
                        }
                        String str6 = tjwVar.B;
                        String str7 = tjwVar.E;
                        ku90Var2.getClass();
                        ku90Var2.a(new hiw.a(i6, i7, k980Var2, z5, arrayList2, str6, str7));
                        return Unit.a;
                    }
                }
                return y5bVar;
            }
            if (i5 != 4) {
                if (i5 != 5) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = this.c;
                multiMakerAddToBetSlipOptionsUiEvent2 = this.b;
                list3 = this.a;
                try {
                    uj50.b(obj);
                    objJ = obj;
                    bVar = k8s.a((BaseResponse) objJ, m8s.b, list3);
                    zi50.a aVar4 = zi50.b;
                } catch (Throwable th) {
                    th = th;
                    zi50.a aVar5 = zi50.b;
                    bVar = new zi50.b(th);
                }
                thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a aVar6 = itf0.a;
                    aVar6.q(MyLog.TAG_MULTI_MAKER);
                    aVar6.o(thA);
                }
                if (bVar instanceof zi50.b) {
                    bVar = null;
                }
                dVar = (j8s) bVar;
                if (dVar == null) {
                    dVar = new j8s.d(m8s.b);
                }
                wwd0 wwd0Var6 = tjwVar.Q;
                jrmVar = tjwVar.f;
                Boolean bool4 = Boolean.FALSE;
                wwd0Var6.getClass();
                wwd0Var6.k(null, bool4);
                if (dVar instanceof j8s.c) {
                    wwd0 wwd0Var7 = tjwVar.P;
                    Boolean bool5 = Boolean.TRUE;
                    wwd0Var7.getClass();
                    wwd0Var7.k(null, bool5);
                    jrmVar.k0(dVar);
                    return Unit.a;
                }
                j8sVarW = jrmVar.w();
                if ((j8sVarW instanceof j8s.c) || !(dVar instanceof j8s.a)) {
                    z3 = true;
                } else {
                    z3 = true;
                    jrmVar.k0(j8s.c.a((j8s.c) j8sVarW, true));
                }
                if (i3 == 0) {
                    jrmVar.G(z3);
                    tjwVar.i.clear();
                    tjwVar.v.clear();
                }
                str = tjwVar.B;
                if (str != null && !StringsKt.U(str)) {
                    f00 f00Var2 = vgb0.a;
                    vgb0.c("add_to_betslip_in_multimaker", jpu.b(new Pair("from", tjwVar.B)), false);
                }
                tjwVar.y.a(rfw.a, k00.d, k00.c);
                arrayList2 = new ArrayList();
                iOrdinal = ((mhw) tjwVar.a0.getValue()).ordinal();
                if (iOrdinal != 0) {
                    z4 = true;
                    if (iOrdinal == 1) {
                        uhc.a();
                        return null;
                    }
                    k980Var = k980.e;
                } else {
                    z4 = true;
                    k980Var = k980.d;
                }
                k980Var2 = k980Var;
                jrmVar.X0(z4);
                arrayList3 = new ArrayList();
                while (r3.hasNext()) {
                    MultiMakerItem multiMakerItem3 = (MultiMakerItem) obj2;
                    multiMakerAddToBetSlipOptionsUiEvent2.getClass();
                    if (!multiMakerAddToBetSlipOptionsUiEvent2.equals(MultiMakerAddToBetSlipOptionsUiEvent.AllSelections.a) || multiMakerItem3.d) {
                        arrayList3.add(obj2);
                    }
                }
                size = arrayList3.size();
                i4 = 0;
                while (i4 < size) {
                    Object obj4 = arrayList3.get(i4);
                    i4++;
                    selectionC = sd9.c((MultiMakerItem) obj4);
                    if (i3 != 0) {
                        arrayList2.add(selectionC);
                    } else {
                        jrmVar.j0(selectionC.a, selectionC.b, selectionC.c, k980Var2);
                        iym iymVar2 = tjwVar.w;
                        PageMeta.INSTANCE.getClass();
                        iymVar2.f(AnalyticsEvent.MULTI_MAKER_ADD_TO_BETSLIP, new PageMeta("multimaker", null));
                    }
                }
                jrmVar.X0(false);
                tjwVar.c.c.add(h8s.e);
                ku90<hiw> ku90Var3 = tjwVar.i0;
                int i8 = tjwVar.C;
                int i9 = tjwVar.D;
                if (i3 != 0) {
                    z5 = z4;
                } else {
                    z5 = false;
                }
                String str8 = tjwVar.B;
                String str9 = tjwVar.E;
                ku90Var3.getClass();
                ku90Var3.a(new hiw.a(i8, i9, k980Var2, z5, arrayList2, str8, str9));
                return Unit.a;
            }
            int i10 = this.d;
            i2 = this.c;
            list2 = this.a;
            uj50.b(obj);
            r7 = i10;
            objO = obj;
            multiMakerAddToBetSlipOptionsUiEvent = (MultiMakerAddToBetSlipOptionsUiEvent) objO;
            multiMakerAddToBetSlipOptionsUiEvent.getClass();
            if (multiMakerAddToBetSlipOptionsUiEvent.equals(MultiMakerAddToBetSlipOptionsUiEvent.Cancel.a)) {
                return Unit.a;
            }
            wwd0 wwd0Var8 = tjwVar.Q;
            Boolean bool6 = Boolean.TRUE;
            wwd0Var8.getClass();
            wwd0Var8.k(null, bool6);
            try {
                zi50.a aVar7 = zi50.b;
                h940 h940Var2 = tjwVar.d;
                arrayList = new ArrayList(l48.r(list2, 10));
                while (r13.hasNext()) {
                    multiMakerItem.getClass();
                    String str10 = multiMakerItem.a.a;
                    multiMakerMarket = multiMakerItem.b;
                    String str11 = multiMakerMarket.a;
                    String str12 = multiMakerItem.c.a;
                    String str13 = multiMakerMarket.b;
                    if (multiMakerMarket.c == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(new LiabilityCheckSelection(str10, str11, str12, str13, null, null, Boolean.valueOf(z2), 48, null));
                }
                Set setB2 = wi80.b(LiabilityCheckProcessor.BOOKING_CODE_LIABILITY_CHECK);
                this.f = null;
                this.a = list2;
                this.b = multiMakerAddToBetSlipOptionsUiEvent;
                this.c = i2;
                this.d = r7;
                this.e = 5;
                objJ = h940Var2.J(arrayList, setB2, this);
                if (objJ != y5bVar) {
                    multiMakerAddToBetSlipOptionsUiEvent2 = multiMakerAddToBetSlipOptionsUiEvent;
                    i3 = i2;
                    list3 = list2;
                    bVar = k8s.a((BaseResponse) objJ, m8s.b, list3);
                    zi50.a aVar8 = zi50.b;
                    thA = zi50.a(bVar);
                    if (thA != null) {
                        itf0.a aVar9 = itf0.a;
                        aVar9.q(MyLog.TAG_MULTI_MAKER);
                        aVar9.o(thA);
                    }
                    if (bVar instanceof zi50.b) {
                        bVar = null;
                    }
                    dVar = (j8s) bVar;
                    if (dVar == null) {
                        dVar = new j8s.d(m8s.b);
                    }
                    wwd0 wwd0Var9 = tjwVar.Q;
                    jrmVar = tjwVar.f;
                    Boolean bool7 = Boolean.FALSE;
                    wwd0Var9.getClass();
                    wwd0Var9.k(null, bool7);
                    if (dVar instanceof j8s.c) {
                        wwd0 wwd0Var10 = tjwVar.P;
                        Boolean bool8 = Boolean.TRUE;
                        wwd0Var10.getClass();
                        wwd0Var10.k(null, bool8);
                        jrmVar.k0(dVar);
                        return Unit.a;
                    }
                    j8sVarW = jrmVar.w();
                    if (j8sVarW instanceof j8s.c) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (i3 == 0) {
                        jrmVar.G(z3);
                        tjwVar.i.clear();
                        tjwVar.v.clear();
                    }
                    str = tjwVar.B;
                    if (str != null) {
                        f00 f00Var3 = vgb0.a;
                        vgb0.c("add_to_betslip_in_multimaker", jpu.b(new Pair("from", tjwVar.B)), false);
                    }
                    tjwVar.y.a(rfw.a, k00.d, k00.c);
                    arrayList2 = new ArrayList();
                    iOrdinal = ((mhw) tjwVar.a0.getValue()).ordinal();
                    if (iOrdinal != 0) {
                        z4 = true;
                        if (iOrdinal == 1) {
                            uhc.a();
                            return null;
                        }
                        k980Var = k980.e;
                    } else {
                        z4 = true;
                        k980Var = k980.d;
                    }
                    k980Var2 = k980Var;
                    jrmVar.X0(z4);
                    arrayList3 = new ArrayList();
                    while (r3.hasNext()) {
                        MultiMakerItem multiMakerItem4 = (MultiMakerItem) obj2;
                        multiMakerAddToBetSlipOptionsUiEvent2.getClass();
                        if (!multiMakerAddToBetSlipOptionsUiEvent2.equals(MultiMakerAddToBetSlipOptionsUiEvent.AllSelections.a)) {
                        }
                        arrayList3.add(obj2);
                    }
                    size = arrayList3.size();
                    i4 = 0;
                    while (i4 < size) {
                        Object obj5 = arrayList3.get(i4);
                        i4++;
                        selectionC = sd9.c((MultiMakerItem) obj5);
                        if (i3 != 0) {
                            arrayList2.add(selectionC);
                        } else {
                            jrmVar.j0(selectionC.a, selectionC.b, selectionC.c, k980Var2);
                            iym iymVar3 = tjwVar.w;
                            PageMeta.INSTANCE.getClass();
                            iymVar3.f(AnalyticsEvent.MULTI_MAKER_ADD_TO_BETSLIP, new PageMeta("multimaker", null));
                        }
                    }
                    jrmVar.X0(false);
                    tjwVar.c.c.add(h8s.e);
                    ku90<hiw> ku90Var4 = tjwVar.i0;
                    int i11 = tjwVar.C;
                    int i12 = tjwVar.D;
                    if (i3 != 0) {
                        z5 = z4;
                    } else {
                        z5 = false;
                    }
                    String str14 = tjwVar.B;
                    String str15 = tjwVar.E;
                    ku90Var4.getClass();
                    ku90Var4.a(new hiw.a(i11, i12, k980Var2, z5, arrayList2, str14, str15));
                    return Unit.a;
                }
                return y5bVar;
            } catch (Throwable th2) {
                th = th2;
                multiMakerAddToBetSlipOptionsUiEvent2 = multiMakerAddToBetSlipOptionsUiEvent;
                i3 = i2;
                list3 = list2;
                zi50.a aVar10 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        ifw ifwVar2 = tjwVar.e;
        String str16 = (String) tjwVar.R.getValue();
        str16.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str16);
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
        this.f = v5bVar;
        this.a = list;
        this.b = null;
        this.e = 3;
        if (ifwVar2.s(iIntValue, this) != y5bVar) {
            if (tjwVar.A) {
                i = 0;
            } else {
                i = 0;
            }
            if (list == null) {
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((MultiMakerItem) it.next()).d) {
                        z = true;
                        break;
                    }
                }
            } else {
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((MultiMakerItem) it.next()).d) {
                        z = true;
                        break;
                    }
                }
            }
            ku90<hiw> ku90Var5 = tjwVar.i0;
            this.f = v5bVar;
            this.a = list;
            this.c = i;
            this.d = z ? 1 : 0;
            this.e = 4;
            bc6 bc6Var2 = new bc6(1, yzo.b(this));
            bc6Var2.q();
            ku90Var5.a(new hiw.b(z, new iiw(bc6Var2)));
            objO = bc6Var2.o();
            y5b y5bVar3 = y5b.a;
            if (objO != y5bVar) {
                list2 = list;
                i2 = i;
                r7 = z;
                multiMakerAddToBetSlipOptionsUiEvent = (MultiMakerAddToBetSlipOptionsUiEvent) objO;
                multiMakerAddToBetSlipOptionsUiEvent.getClass();
                if (multiMakerAddToBetSlipOptionsUiEvent.equals(MultiMakerAddToBetSlipOptionsUiEvent.Cancel.a)) {
                    return Unit.a;
                }
                wwd0 wwd0Var11 = tjwVar.Q;
                Boolean bool9 = Boolean.TRUE;
                wwd0Var11.getClass();
                wwd0Var11.k(null, bool9);
                zi50.a aVar11 = zi50.b;
                h940 h940Var3 = tjwVar.d;
                arrayList = new ArrayList(l48.r(list2, 10));
                while (r13.hasNext()) {
                    multiMakerItem.getClass();
                    String str17 = multiMakerItem.a.a;
                    multiMakerMarket = multiMakerItem.b;
                    String str18 = multiMakerMarket.a;
                    String str19 = multiMakerItem.c.a;
                    String str110 = multiMakerMarket.b;
                    if (multiMakerMarket.c == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(new LiabilityCheckSelection(str17, str18, str19, str110, null, null, Boolean.valueOf(z2), 48, null));
                }
                Set setB3 = wi80.b(LiabilityCheckProcessor.BOOKING_CODE_LIABILITY_CHECK);
                this.f = null;
                this.a = list2;
                this.b = multiMakerAddToBetSlipOptionsUiEvent;
                this.c = i2;
                this.d = r7;
                this.e = 5;
                objJ = h940Var3.J(arrayList, setB3, this);
                if (objJ != y5bVar) {
                    multiMakerAddToBetSlipOptionsUiEvent2 = multiMakerAddToBetSlipOptionsUiEvent;
                    i3 = i2;
                    list3 = list2;
                    bVar = k8s.a((BaseResponse) objJ, m8s.b, list3);
                    zi50.a aVar12 = zi50.b;
                    thA = zi50.a(bVar);
                    if (thA != null) {
                        itf0.a aVar13 = itf0.a;
                        aVar13.q(MyLog.TAG_MULTI_MAKER);
                        aVar13.o(thA);
                    }
                    if (bVar instanceof zi50.b) {
                        bVar = null;
                    }
                    dVar = (j8s) bVar;
                    if (dVar == null) {
                        dVar = new j8s.d(m8s.b);
                    }
                    wwd0 wwd0Var12 = tjwVar.Q;
                    jrmVar = tjwVar.f;
                    Boolean bool10 = Boolean.FALSE;
                    wwd0Var12.getClass();
                    wwd0Var12.k(null, bool10);
                    if (dVar instanceof j8s.c) {
                        wwd0 wwd0Var13 = tjwVar.P;
                        Boolean bool11 = Boolean.TRUE;
                        wwd0Var13.getClass();
                        wwd0Var13.k(null, bool11);
                        jrmVar.k0(dVar);
                        return Unit.a;
                    }
                    j8sVarW = jrmVar.w();
                    if (j8sVarW instanceof j8s.c) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (i3 == 0) {
                        jrmVar.G(z3);
                        tjwVar.i.clear();
                        tjwVar.v.clear();
                    }
                    str = tjwVar.B;
                    if (str != null) {
                        f00 f00Var4 = vgb0.a;
                        vgb0.c("add_to_betslip_in_multimaker", jpu.b(new Pair("from", tjwVar.B)), false);
                    }
                    tjwVar.y.a(rfw.a, k00.d, k00.c);
                    arrayList2 = new ArrayList();
                    iOrdinal = ((mhw) tjwVar.a0.getValue()).ordinal();
                    if (iOrdinal != 0) {
                        z4 = true;
                        if (iOrdinal == 1) {
                            uhc.a();
                            return null;
                        }
                        k980Var = k980.e;
                    } else {
                        z4 = true;
                        k980Var = k980.d;
                    }
                    k980Var2 = k980Var;
                    jrmVar.X0(z4);
                    arrayList3 = new ArrayList();
                    while (r3.hasNext()) {
                        MultiMakerItem multiMakerItem5 = (MultiMakerItem) obj2;
                        multiMakerAddToBetSlipOptionsUiEvent2.getClass();
                        if (!multiMakerAddToBetSlipOptionsUiEvent2.equals(MultiMakerAddToBetSlipOptionsUiEvent.AllSelections.a)) {
                        }
                        arrayList3.add(obj2);
                    }
                    size = arrayList3.size();
                    i4 = 0;
                    while (i4 < size) {
                        Object obj6 = arrayList3.get(i4);
                        i4++;
                        selectionC = sd9.c((MultiMakerItem) obj6);
                        if (i3 != 0) {
                            arrayList2.add(selectionC);
                        } else {
                            jrmVar.j0(selectionC.a, selectionC.b, selectionC.c, k980Var2);
                            iym iymVar4 = tjwVar.w;
                            PageMeta.INSTANCE.getClass();
                            iymVar4.f(AnalyticsEvent.MULTI_MAKER_ADD_TO_BETSLIP, new PageMeta("multimaker", null));
                        }
                    }
                    jrmVar.X0(false);
                    tjwVar.c.c.add(h8s.e);
                    ku90<hiw> ku90Var6 = tjwVar.i0;
                    int i13 = tjwVar.C;
                    int i14 = tjwVar.D;
                    if (i3 != 0) {
                        z5 = z4;
                    } else {
                        z5 = false;
                    }
                    String str111 = tjwVar.B;
                    String str112 = tjwVar.E;
                    ku90Var6.getClass();
                    ku90Var6.a(new hiw.a(i13, i14, k980Var2, z5, arrayList2, str111, str112));
                    return Unit.a;
                }
            }
        }
        return y5bVar;
    }
}
