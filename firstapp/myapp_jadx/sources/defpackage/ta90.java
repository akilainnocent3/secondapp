package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.loyalty.BetBuilderType;
import com.sporty.android.core.model.loyalty.EarlyGoalsType;
import com.sporty.android.core.model.loyalty.MissionBetCategory;
import com.sporty.android.core.model.loyalty.UpType;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.mission.ShowMissionViewModel$special$$inlined$flatMapLatest$1", f = "ShowMissionViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class ta90 extends tje0 implements gaj<myh<? super vwv>, Pair<? extends nsv, ? extends i53>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sa90 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta90(v1b v1bVar, sa90 sa90Var) {
        super(3, v1bVar);
        this.d = sa90Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super vwv> myhVar, Pair<? extends nsv, ? extends i53> pair, v1b<? super Unit> v1bVar) {
        ta90 ta90Var = new ta90(v1bVar, this.d);
        ta90Var.b = myhVar;
        ta90Var.c = pair;
        return ta90Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:132:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:136:0x0203  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:175:0x02fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:183:0x0319  */
    /* JADX WARN: Code duplicated, block: B:185:0x031f  */
    /* JADX WARN: Code duplicated, block: B:187:0x032a  */
    /* JADX WARN: Code duplicated, block: B:189:0x032d  */
    /* JADX WARN: Code duplicated, block: B:192:0x0338  */
    /* JADX WARN: Code duplicated, block: B:193:0x033a A[Catch: all -> 0x0372, TryCatch #1 {all -> 0x0372, blocks: (B:190:0x0330, B:195:0x0346, B:200:0x035e, B:209:0x0375, B:203:0x0366, B:198:0x034e, B:193:0x033a), top: B:593:0x0330 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x0346 A[Catch: all -> 0x0372, TryCatch #1 {all -> 0x0372, blocks: (B:190:0x0330, B:195:0x0346, B:200:0x035e, B:209:0x0375, B:203:0x0366, B:198:0x034e, B:193:0x033a), top: B:593:0x0330 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x034c  */
    /* JADX WARN: Code duplicated, block: B:198:0x034e A[Catch: all -> 0x0372, TryCatch #1 {all -> 0x0372, blocks: (B:190:0x0330, B:195:0x0346, B:200:0x035e, B:209:0x0375, B:203:0x0366, B:198:0x034e, B:193:0x033a), top: B:593:0x0330 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x035e A[Catch: all -> 0x0372, TryCatch #1 {all -> 0x0372, blocks: (B:190:0x0330, B:195:0x0346, B:200:0x035e, B:209:0x0375, B:203:0x0366, B:198:0x034e, B:193:0x033a), top: B:593:0x0330 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x0364  */
    /* JADX WARN: Code duplicated, block: B:203:0x0366 A[Catch: all -> 0x0372, TryCatch #1 {all -> 0x0372, blocks: (B:190:0x0330, B:195:0x0346, B:200:0x035e, B:209:0x0375, B:203:0x0366, B:198:0x034e, B:193:0x033a), top: B:593:0x0330 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0370  */
    /* JADX WARN: Code duplicated, block: B:208:0x0374  */
    /* JADX WARN: Code duplicated, block: B:214:0x038a  */
    /* JADX WARN: Code duplicated, block: B:216:0x0393  */
    /* JADX WARN: Code duplicated, block: B:218:0x0396  */
    /* JADX WARN: Code duplicated, block: B:220:0x039a  */
    /* JADX WARN: Code duplicated, block: B:221:0x039d  */
    /* JADX WARN: Code duplicated, block: B:262:0x0415  */
    /* JADX WARN: Code duplicated, block: B:263:0x0417  */
    /* JADX WARN: Code duplicated, block: B:265:0x041d  */
    /* JADX WARN: Code duplicated, block: B:271:0x042e  */
    /* JADX WARN: Code duplicated, block: B:273:0x0441  */
    /* JADX WARN: Code duplicated, block: B:275:0x0444  */
    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:288:0x0460  */
    /* JADX WARN: Code duplicated, block: B:290:0x0466  */
    /* JADX WARN: Code duplicated, block: B:334:0x0550  */
    /* JADX WARN: Code duplicated, block: B:377:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:384:0x060b  */
    /* JADX WARN: Code duplicated, block: B:453:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:473:0x073c  */
    /* JADX WARN: Code duplicated, block: B:474:0x073f  */
    /* JADX WARN: Code duplicated, block: B:477:0x0744  */
    /* JADX WARN: Code duplicated, block: B:480:0x074d  */
    /* JADX WARN: Code duplicated, block: B:482:0x0757  */
    /* JADX WARN: Code duplicated, block: B:484:0x0776  */
    /* JADX WARN: Code duplicated, block: B:489:0x0790 A[EDGE_INSN: B:489:0x0790->B:495:0x07a6 BREAK  A[LOOP:7: B:491:0x0797->B:623:?]] */
    /* JADX WARN: Code duplicated, block: B:490:0x0792  */
    /* JADX WARN: Code duplicated, block: B:492:0x0799  */
    /* JADX WARN: Code duplicated, block: B:497:0x07ac A[EDGE_INSN: B:497:0x07ac->B:503:0x07c2 BREAK  A[LOOP:6: B:499:0x07b3->B:620:?]] */
    /* JADX WARN: Code duplicated, block: B:498:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:500:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:504:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:505:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:508:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:509:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:512:0x07f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:513:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:514:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:518:0x080e  */
    /* JADX WARN: Code duplicated, block: B:519:0x0810  */
    /* JADX WARN: Code duplicated, block: B:522:0x081d  */
    /* JADX WARN: Code duplicated, block: B:524:0x0827  */
    /* JADX WARN: Code duplicated, block: B:526:0x082f  */
    /* JADX WARN: Code duplicated, block: B:527:0x0838  */
    /* JADX WARN: Code duplicated, block: B:529:0x0840  */
    /* JADX WARN: Code duplicated, block: B:530:0x0849  */
    /* JADX WARN: Code duplicated, block: B:532:0x0851  */
    /* JADX WARN: Code duplicated, block: B:533:0x085a  */
    /* JADX WARN: Code duplicated, block: B:534:0x085c  */
    /* JADX WARN: Code duplicated, block: B:542:0x0871 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:545:0x0886 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:546:0x0888 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:548:0x089b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:549:0x089d  */
    /* JADX WARN: Code duplicated, block: B:550:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:553:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:555:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:558:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:560:0x0920  */
    /* JADX WARN: Code duplicated, block: B:563:0x092b  */
    /* JADX WARN: Code duplicated, block: B:564:0x092e  */
    /* JADX WARN: Code duplicated, block: B:567:0x0934  */
    /* JADX WARN: Code duplicated, block: B:571:0x093c  */
    /* JADX WARN: Code duplicated, block: B:574:0x0942  */
    /* JADX WARN: Code duplicated, block: B:578:0x094a  */
    /* JADX WARN: Code duplicated, block: B:583:0x096d  */
    /* JADX WARN: Code duplicated, block: B:586:0x0974  */
    /* JADX WARN: Code duplicated, block: B:588:0x0979 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:593:0x0330 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x0780 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x0774 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x07ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x07c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:? A[LOOP:6: B:499:0x07b3->B:620:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x0790 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x07a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[LOOP:7: B:491:0x0797->B:623:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x0473 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x0478 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x0478 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x040b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x046e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x0688 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[LOOP:10: B:434:0x06b9->B:648:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar;
        Object aVar;
        qtv qtvVar;
        vwv cVar;
        ArrayList arrayList;
        qtv qtvVar2;
        jrv jrvVar;
        Double d;
        double d2;
        Double d3;
        ArrayList arrayList2;
        int size;
        int i;
        ga90.b bVar;
        int size2;
        int i2;
        Object obj2;
        boolean z;
        int size3;
        int i3;
        Object obj3;
        boolean z2;
        Long lValueOf;
        String str;
        String strE;
        String strD;
        String strD2;
        float fD;
        boolean z3;
        UiText uiTextA;
        ResourceUiText resourceUiText;
        ResourceUiText resourceUiText2;
        ResourceUiText resourceUiText3;
        int[] iArr;
        UiText stringUiText;
        boolean z4;
        UiText stringUiText2;
        boolean z5;
        boolean z6;
        boolean z7;
        double dDoubleValue;
        Object obj4;
        Object objEmit;
        y5b y5bVar2;
        y5b y5bVar3;
        boolean zBooleanValue;
        boolean zM0;
        boolean zX;
        int i4;
        int i5;
        Object bVar2;
        Object obj5;
        boolean z8;
        Double dH;
        Double dH2;
        int i6;
        ConcurrentHashMap concurrentHashMap;
        boolean zBooleanValue2;
        Iterator<T> it;
        int i7;
        Selection selection;
        boolean zT;
        int i8;
        int i9;
        Object bVar3;
        Object obj6;
        boolean zContains;
        boolean z9;
        boolean zContains2;
        boolean zContains3;
        String str2;
        Double dH3;
        Double dH4;
        Iterator it2;
        boolean zBooleanValue3;
        boolean zL1;
        Object bVar4;
        Object obj7;
        boolean z10;
        int i10;
        Double dH5;
        sa90 sa90Var = this.d;
        p53 p53Var = sa90Var.f;
        y5b y5bVar4 = y5b.a;
        int i11 = this.a;
        Object obj8 = null;
        if (i11 == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            Pair pair = (Pair) this.c;
            nsv nsvVar = (nsv) pair.a;
            i53 i53Var = (i53) pair.b;
            nsv.c cVar2 = nsvVar instanceof nsv.c ? (nsv.c) nsvVar : null;
            List<da90> list = cVar2 != null ? cVar2.a : null;
            if (list == null) {
                list = m2g.a;
            }
            OrderBetType orderBetType = i53Var.a;
            String str3 = i53Var.c;
            Boolean bool = i53Var.b;
            p53Var.getClass();
            list.getClass();
            orderBetType.getClass();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    Object obj9 = obj8;
                    if (arrayList3.size() > 1) {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q("BetSlipMission");
                        aVar2.n("%d missions qualify for one betslip (ids %s); showing the first. Check the BO setup.", Integer.valueOf(arrayList3.size()), CollectionsKt.a0(arrayList3, null, null, null, new o53(), 31));
                    }
                    da90 da90Var = (da90) CollectionsKt.firstOrNull(arrayList3);
                    if (da90Var != null) {
                        wwd0 wwd0Var = sa90Var.E;
                        Integer num = new Integer(da90Var.b);
                        wwd0Var.getClass();
                        wwd0Var.k(obj9, num);
                    }
                    if (da90Var != null) {
                        n53 n53Var = sa90Var.i;
                        lrm lrmVar = n53Var.b;
                        jrm jrmVar = n53Var.a;
                        orderBetType.getClass();
                        List<OrderBetType> list2 = da90Var.m;
                        List<UpType> list3 = da90Var.y;
                        EarlyGoalsType earlyGoalsType = da90Var.z;
                        BetBuilderType betBuilderType = da90Var.x;
                        jrv jrvVar2 = da90Var.t;
                        List<String> list4 = da90Var.w;
                        List<String> list5 = da90Var.v;
                        List<String> list6 = da90Var.u;
                        MissionBetCategory missionBetCategory = da90Var.a;
                        Double d4 = da90Var.n;
                        Double d5 = da90Var.o;
                        if (list2.contains(orderBetType)) {
                            Boolean bool2 = da90Var.p;
                            if (bool2 != null ? bool2.equals(bool) : true) {
                                if (orderBetType != OrderBetType.SINGLE) {
                                    if (d5 != null && (str3 == null || (dH2 = b.h(str3)) == null || dH2.doubleValue() < d5.doubleValue())) {
                                        p53Var = p53Var;
                                        y5bVar = y5bVar4;
                                        aVar = ltv.c.a;
                                    } else {
                                        if (d4 != null) {
                                            double dDoubleValue2 = d4.doubleValue();
                                            int i12 = n53.a.a[orderBetType.ordinal()];
                                            if (i12 != 1) {
                                                if (i12 != 2) {
                                                    y5bVar = y5bVar4;
                                                } else {
                                                    y5bVar = y5bVar4;
                                                    knh.a aVar3 = new knh.a(ld80.j(ld80.d(CollectionsKt.K(lrmVar.u().entrySet()), new l53(ln7.a(), 0)), new m53()));
                                                    if (aVar3.hasNext()) {
                                                        double dDoubleValue3 = ((Number) aVar3.next()).doubleValue();
                                                        while (aVar3.hasNext()) {
                                                            dDoubleValue3 = Math.max(dDoubleValue3, ((Number) aVar3.next()).doubleValue());
                                                            p53Var = p53Var;
                                                            aVar3 = aVar3;
                                                        }
                                                        p53Var = p53Var;
                                                        dH = Double.valueOf(dDoubleValue3);
                                                    }
                                                }
                                                dH = null;
                                            } else {
                                                p53Var = p53Var;
                                                y5bVar = y5bVar4;
                                                String str4 = lrmVar.d0().a;
                                                str4.getClass();
                                                dH = b.h(str4);
                                            }
                                            if (dH == null || dH.doubleValue() < dDoubleValue2 / 10000.0d) {
                                                aVar = ltv.c.a;
                                            }
                                        } else {
                                            p53Var = p53Var;
                                            y5bVar = y5bVar4;
                                        }
                                        int i13 = missionBetCategory != null ? n53.a.b[missionBetCategory.ordinal()] : -1;
                                        if (i13 == 1) {
                                            zBooleanValue = true;
                                        } else if (i13 != 2) {
                                            zBooleanValue = false;
                                        } else {
                                            ArrayList arrayListU = jrmVar.U();
                                            if (arrayListU.isEmpty()) {
                                                zBooleanValue = false;
                                            } else {
                                                try {
                                                    zi50.a aVar4 = zi50.b;
                                                    if (!list6.isEmpty()) {
                                                        if (!arrayListU.isEmpty()) {
                                                            int size4 = arrayListU.size();
                                                            int i14 = 0;
                                                            while (true) {
                                                                if (i14 < size4) {
                                                                    Object obj10 = arrayListU.get(i14);
                                                                    i14++;
                                                                    if (list6.contains(((Selection) obj10).a.sport.id)) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z8 = false;
                                                        bVar2 = Boolean.valueOf(z8);
                                                        obj5 = Boolean.FALSE;
                                                        zi50.a aVar5 = zi50.b;
                                                        if (bVar2 instanceof zi50.b) {
                                                            bVar2 = obj5;
                                                        }
                                                        zBooleanValue = ((Boolean) bVar2).booleanValue();
                                                    }
                                                    if (!list5.isEmpty()) {
                                                        if (!arrayListU.isEmpty()) {
                                                            int size5 = arrayListU.size();
                                                            int i15 = 0;
                                                            while (true) {
                                                                if (i15 < size5) {
                                                                    Object obj11 = arrayListU.get(i15);
                                                                    i15++;
                                                                    if (list5.contains(((Selection) obj11).a.sport.category.tournament.id)) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z8 = false;
                                                        bVar2 = Boolean.valueOf(z8);
                                                        obj5 = Boolean.FALSE;
                                                        zi50.a aVar6 = zi50.b;
                                                        if (bVar2 instanceof zi50.b) {
                                                            bVar2 = obj5;
                                                        }
                                                        zBooleanValue = ((Boolean) bVar2).booleanValue();
                                                    }
                                                    if (!list4.isEmpty()) {
                                                        if (!arrayListU.isEmpty()) {
                                                            int size6 = arrayListU.size();
                                                            int i16 = 0;
                                                            while (true) {
                                                                if (i16 < size6) {
                                                                    Object obj12 = arrayListU.get(i16);
                                                                    i16++;
                                                                    if (list4.contains(((Selection) obj12).b.id)) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z8 = false;
                                                        bVar2 = Boolean.valueOf(z8);
                                                        obj5 = Boolean.FALSE;
                                                        zi50.a aVar7 = zi50.b;
                                                        if (bVar2 instanceof zi50.b) {
                                                            bVar2 = obj5;
                                                        }
                                                        zBooleanValue = ((Boolean) bVar2).booleanValue();
                                                    }
                                                    z8 = true;
                                                    bVar2 = Boolean.valueOf(z8);
                                                } catch (Throwable th) {
                                                    zi50.a aVar8 = zi50.b;
                                                    bVar2 = new zi50.b(th);
                                                }
                                                obj5 = Boolean.FALSE;
                                                zi50.a aVar9 = zi50.b;
                                                if (bVar2 instanceof zi50.b) {
                                                    bVar2 = obj5;
                                                }
                                                zBooleanValue = ((Boolean) bVar2).booleanValue();
                                            }
                                        }
                                        if (zBooleanValue) {
                                            if (jrvVar2 instanceof jrv.e) {
                                                zX = true;
                                            } else if (Intrinsics.g(jrvVar2, jrv.c.a) || Intrinsics.g(jrvVar2, jrv.d.a) || Intrinsics.g(jrvVar2, jrv.f.a)) {
                                                if (list3 == null) {
                                                    zX = true;
                                                } else if (list3.contains(UpType.ALL_ONE_UP) && list3.contains(UpType.ALL_TWO_UP)) {
                                                    zX = jrmVar.x();
                                                } else {
                                                    if (!list3.isEmpty()) {
                                                        if (!list3.isEmpty()) {
                                                            Iterator<T> it4 = list3.iterator();
                                                            while (true) {
                                                                if (it4.hasNext()) {
                                                                    int i17 = n53.a.e[((UpType) it4.next()).ordinal()];
                                                                    if (i17 != 1) {
                                                                        if (i17 != 2) {
                                                                            if (i17 == 3) {
                                                                                zM0 = jrmVar.M0();
                                                                            } else if (i17 != 4) {
                                                                                if (i17 != 5) {
                                                                                    uhc.a();
                                                                                    return null;
                                                                                }
                                                                                zM0 = jrmVar.n1();
                                                                            } else if (!jrmVar.Z0() || !jrmVar.C0()) {
                                                                                zM0 = false;
                                                                            }
                                                                        } else if (!jrmVar.s0(false) || !jrmVar.H1(false)) {
                                                                            zM0 = false;
                                                                        }
                                                                        if (!zM0) {
                                                                        }
                                                                    }
                                                                    zM0 = true;
                                                                    if (!zM0) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        zX = true;
                                                    }
                                                    zX = false;
                                                }
                                            } else if (Intrinsics.g(jrvVar2, jrv.a.a)) {
                                                if (betBuilderType == null || (i5 = n53.a.c[betBuilderType.ordinal()]) == 1) {
                                                    zX = true;
                                                } else if (i5 == 2) {
                                                    zX = jrmVar.L1();
                                                } else {
                                                    if (i5 != 3) {
                                                        uhc.a();
                                                        return null;
                                                    }
                                                    zX = jrmVar.O1();
                                                }
                                            } else if (!Intrinsics.g(jrvVar2, jrv.b.a)) {
                                                if (jrvVar2 != null) {
                                                    uhc.a();
                                                    return null;
                                                }
                                                zX = false;
                                            } else if (earlyGoalsType == null || (i4 = n53.a.d[earlyGoalsType.ordinal()]) == 1) {
                                                zX = true;
                                            } else if (i4 == 2) {
                                                zX = jrmVar.h();
                                            } else {
                                                if (i4 != 3) {
                                                    uhc.a();
                                                    return null;
                                                }
                                                zX = jrmVar.p1();
                                            }
                                            if (!zX) {
                                                aVar = ltv.c.a;
                                            }
                                        } else {
                                            aVar = ltv.c.a;
                                        }
                                    }
                                    if (aVar == null) {
                                    }
                                    sa90Var.D.setValue(aVar);
                                    if (da90Var != null) {
                                        qtvVar = da90Var.k;
                                    } else {
                                        qtvVar = null;
                                    }
                                    if (qtvVar == qtv.c) {
                                        da90Var = null;
                                    }
                                    p53Var.getClass();
                                    orderBetType.getClass();
                                    if (da90Var == null) {
                                        cVar = new vwv.b(orderBetType);
                                    } else {
                                        p53Var.b.getClass();
                                        arrayList = da90Var.r;
                                        qtvVar2 = da90Var.k;
                                        jrvVar = da90Var.t;
                                        d = da90Var.s;
                                        d2 = da90Var.l;
                                        d3 = da90Var.n;
                                        arrayList2 = new ArrayList();
                                        size = arrayList.size();
                                        i = 0;
                                        while (i < size) {
                                            obj4 = arrayList.get(i);
                                            i++;
                                            if (obj4 instanceof ga90.b) {
                                                arrayList2.add(obj4);
                                            }
                                        }
                                        bVar = (ga90.b) CollectionsKt.firstOrNull(arrayList2);
                                        if (arrayList.isEmpty()) {
                                            size2 = arrayList.size();
                                            i2 = 0;
                                            while (true) {
                                                if (i2 < size2) {
                                                    z = false;
                                                    break;
                                                }
                                                obj2 = arrayList.get(i2);
                                                i2++;
                                                if (((ga90) obj2) instanceof ga90.c) {
                                                    z = true;
                                                    break;
                                                }
                                            }
                                        } else {
                                            z = false;
                                            break;
                                        }
                                        if (arrayList.isEmpty()) {
                                            size3 = arrayList.size();
                                            i3 = 0;
                                            while (true) {
                                                if (i3 < size3) {
                                                    z2 = false;
                                                    break;
                                                }
                                                obj3 = arrayList.get(i3);
                                                i3++;
                                                if (((ga90) obj3) instanceof ga90.a) {
                                                    z2 = true;
                                                    break;
                                                }
                                            }
                                        } else {
                                            z2 = false;
                                            break;
                                        }
                                        if (bVar != null) {
                                            lValueOf = Long.valueOf(bVar.a);
                                        } else {
                                            lValueOf = null;
                                        }
                                        String strD3 = s5y.d(lValueOf);
                                        str = da90Var.j;
                                        strE = s5y.e(d3);
                                        if (d != null) {
                                            strD = s5y.d(d);
                                        } else {
                                            strD = null;
                                        }
                                        strD2 = s5y.d(Double.valueOf(d2));
                                        fD = 0.0f;
                                        if (Math.abs(d2) > 1.0E-10d) {
                                            if (d != null) {
                                                dDoubleValue = d.doubleValue();
                                            } else {
                                                dDoubleValue = 0.0d;
                                            }
                                            fD = f.d((float) (dDoubleValue / d2), 0.0f, 1.0f);
                                        }
                                        float f = fD;
                                        if (bVar != null) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        uiTextA = j53.a(str, strD3, z3, z2, z);
                                        if (Intrinsics.g(jrvVar, jrv.d.a)) {
                                            resourceUiText2 = new ResourceUiText(R.string.common_bet_ways__1up);
                                        } else if (Intrinsics.g(jrvVar, jrv.f.a)) {
                                            resourceUiText2 = new ResourceUiText(R.string.common_bet_ways__2up);
                                        } else if (Intrinsics.g(jrvVar, jrv.c.a)) {
                                            resourceUiText2 = new ResourceUiText(R.string.common_bet_ways__1up_or_2up);
                                        } else {
                                            if (Intrinsics.g(jrvVar, jrv.b.a)) {
                                                resourceUiText2 = new ResourceUiText(R.string.component_betslip__early_goals);
                                            } else {
                                                if (jrvVar == null && !jrvVar.equals(jrv.a.a) && !(jrvVar instanceof jrv.e)) {
                                                    uhc.a();
                                                    return null;
                                                }
                                                resourceUiText = null;
                                            }
                                            if (d3 != null && resourceUiText == null) {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__final_push_stake_more_to_unlock_vreward, ay0.S(new Object[]{uiTextA}));
                                            } else if (d3 != null && resourceUiText != null) {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__final_push_stake_more_vbetreq_to_unlock_vreward, ay0.S(new Object[]{resourceUiText, uiTextA}));
                                            } else if (resourceUiText == null) {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                            } else {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                            }
                                            ResourceUiText resourceUiText4 = resourceUiText3;
                                            iArr = j53.a.a;
                                            if (iArr[qtvVar2.ordinal()] == 1) {
                                                stringUiText = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.component_betslip__mission), new StringUiText(lx5.a(": ", str, " ", strD2))});
                                            } else {
                                                stringUiText = new StringUiText("--");
                                            }
                                            UiText uiText = stringUiText;
                                            if (iArr[qtvVar2.ordinal()] == 1) {
                                                z4 = false;
                                                stringUiText2 = new ConcatUiText(new UiText[]{new StringUiText(v70.b(str, " ", strD, " ")), new ResourceUiText(R.string.component_betslip__settled)});
                                            } else {
                                                z4 = false;
                                                stringUiText2 = new StringUiText("--");
                                            }
                                            UiText uiText2 = stringUiText2;
                                            if (d3 != null) {
                                                z5 = true;
                                            } else {
                                                z5 = z4;
                                            }
                                            if (!(jrvVar instanceof jrv.d) || (jrvVar instanceof jrv.c)) {
                                                z6 = true;
                                            } else {
                                                z6 = z4;
                                            }
                                            if (!(jrvVar instanceof jrv.f) || (jrvVar instanceof jrv.c)) {
                                                z7 = true;
                                            } else {
                                                z7 = z4;
                                            }
                                            cVar = new vwv.c(orderBetType, new ftv.a(resourceUiText4, uiText2, uiText, f, z5, z6, z7, jrvVar instanceof jrv.b));
                                        }
                                        resourceUiText = resourceUiText2;
                                        if (d3 != null) {
                                            if (d3 != null) {
                                                if (resourceUiText == null) {
                                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                                } else {
                                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                                }
                                            } else if (resourceUiText == null) {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                            } else {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                            }
                                        } else if (d3 != null) {
                                            if (resourceUiText == null) {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                            } else {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                            }
                                        } else if (resourceUiText == null) {
                                            resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                        } else {
                                            resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                        }
                                        ResourceUiText resourceUiText5 = resourceUiText3;
                                        iArr = j53.a.a;
                                        if (iArr[qtvVar2.ordinal()] == 1) {
                                            stringUiText = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.component_betslip__mission), new StringUiText(lx5.a(": ", str, " ", strD2))});
                                        } else {
                                            stringUiText = new StringUiText("--");
                                        }
                                        UiText uiText3 = stringUiText;
                                        if (iArr[qtvVar2.ordinal()] == 1) {
                                            z4 = false;
                                            stringUiText2 = new ConcatUiText(new UiText[]{new StringUiText(v70.b(str, " ", strD, " ")), new ResourceUiText(R.string.component_betslip__settled)});
                                        } else {
                                            z4 = false;
                                            stringUiText2 = new StringUiText("--");
                                        }
                                        UiText uiText4 = stringUiText2;
                                        if (d3 != null) {
                                            z5 = true;
                                        } else {
                                            z5 = z4;
                                        }
                                        if (jrvVar instanceof jrv.d) {
                                            z6 = true;
                                        } else {
                                            z6 = true;
                                        }
                                        if (jrvVar instanceof jrv.f) {
                                            z7 = true;
                                        } else {
                                            z7 = true;
                                        }
                                        cVar = new vwv.c(orderBetType, new ftv.a(resourceUiText5, uiText4, uiText3, f, z5, z6, z7, jrvVar instanceof jrv.b));
                                    }
                                    this.b = null;
                                    this.c = null;
                                    this.a = 1;
                                    h99.a(myhVar);
                                    objEmit = myhVar.emit(cVar, this);
                                    y5bVar2 = y5b.a;
                                    if (objEmit != y5bVar2) {
                                        objEmit = Unit.a;
                                    }
                                    if (objEmit != y5bVar2) {
                                        objEmit = Unit.a;
                                    }
                                    y5bVar3 = y5bVar;
                                    if (objEmit == y5bVar3) {
                                        break;
                                    }
                                    return y5bVar3;
                                }
                                ConcurrentHashMap concurrentHashMapB = lrmVar.B();
                                ArrayList arrayListU2 = jrmVar.U();
                                if (arrayListU2 == null || !arrayListU2.isEmpty()) {
                                    int size7 = arrayListU2.size();
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < size7) {
                                            int i19 = i18 + 1;
                                            ArrayList arrayList4 = arrayListU2;
                                            Selection selection2 = (Selection) arrayListU2.get(i18);
                                            String str5 = (String) concurrentHashMapB.get(selection2);
                                            if (d4 != null) {
                                                double dDoubleValue4 = d4.doubleValue();
                                                if (str5 == null || (dH4 = b.h(str5)) == null || dH4.doubleValue() < dDoubleValue4 / 10000.0d) {
                                                    concurrentHashMap = concurrentHashMapB;
                                                } else {
                                                    if (d5 != null) {
                                                        double dDoubleValue5 = d5.doubleValue();
                                                        str2 = selection2.c.odds;
                                                        if (str2 != null || (dH3 = b.h(str2)) == null || dH3.doubleValue() < dDoubleValue5) {
                                                            concurrentHashMap = concurrentHashMapB;
                                                        }
                                                    }
                                                    if (missionBetCategory == null) {
                                                        i6 = -1;
                                                    } else {
                                                        i6 = n53.a.b[missionBetCategory.ordinal()];
                                                    }
                                                    concurrentHashMap = concurrentHashMapB;
                                                    if (i6 != 1) {
                                                        zBooleanValue2 = true;
                                                    } else if (i6 != 2) {
                                                        zBooleanValue2 = false;
                                                    } else {
                                                        try {
                                                            zi50.a aVar10 = zi50.b;
                                                            if (list6.isEmpty()) {
                                                                zContains = true;
                                                            } else {
                                                                zContains = list6.contains(selection2.a.sport.id);
                                                            }
                                                            if (zContains) {
                                                                if (list5.isEmpty()) {
                                                                    zContains2 = true;
                                                                } else {
                                                                    zContains2 = list5.contains(selection2.a.sport.category.tournament.id);
                                                                }
                                                                if (zContains2) {
                                                                    if (list4.isEmpty()) {
                                                                        zContains3 = true;
                                                                    } else {
                                                                        zContains3 = list4.contains(selection2.b.id);
                                                                    }
                                                                    if (zContains3) {
                                                                        z9 = true;
                                                                    } else {
                                                                        z9 = false;
                                                                    }
                                                                } else {
                                                                    z9 = false;
                                                                }
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            bVar3 = Boolean.valueOf(z9);
                                                        } catch (Throwable th2) {
                                                            zi50.a aVar11 = zi50.b;
                                                            bVar3 = new zi50.b(th2);
                                                        }
                                                        obj6 = Boolean.FALSE;
                                                        if (bVar3 instanceof zi50.b) {
                                                            bVar3 = obj6;
                                                        }
                                                        zBooleanValue2 = ((Boolean) bVar3).booleanValue();
                                                    }
                                                    if (zBooleanValue2) {
                                                        if (!(jrvVar2 instanceof jrv.e)) {
                                                            zT = true;
                                                        } else if (!Intrinsics.g(jrvVar2, jrv.c.a) || Intrinsics.g(jrvVar2, jrv.d.a) || Intrinsics.g(jrvVar2, jrv.f.a)) {
                                                            if (list3 != null) {
                                                                if (!list3.isEmpty() && !list3.isEmpty()) {
                                                                    it = list3.iterator();
                                                                    while (true) {
                                                                        if (it.hasNext()) {
                                                                            i7 = n53.a.e[((UpType) it.next()).ordinal()];
                                                                            selection = selection2;
                                                                            if (i7 != 1) {
                                                                                if (i7 != 2 || i7 == 3) {
                                                                                    if (u7u.h(selection) || !u7u.g(selection)) {
                                                                                        selection2 = selection;
                                                                                    }
                                                                                } else {
                                                                                    if (i7 != 4 && i7 != 5) {
                                                                                        uhc.a();
                                                                                        return null;
                                                                                    }
                                                                                    if (!u7u.i(selection) || !u7u.j(selection)) {
                                                                                        selection2 = selection;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                zT = false;
                                                            }
                                                            zT = true;
                                                        } else {
                                                            if (!Intrinsics.g(jrvVar2, jrv.a.a)) {
                                                                if (Intrinsics.g(jrvVar2, jrv.b.a)) {
                                                                    if (earlyGoalsType != null && (i8 = n53.a.d[earlyGoalsType.ordinal()]) != 1) {
                                                                        if (i8 != 2 && i8 != 3) {
                                                                            uhc.a();
                                                                            return null;
                                                                        }
                                                                        if (!yay.j(selection2) || !yay.i(selection2)) {
                                                                        }
                                                                    }
                                                                } else if (jrvVar2 != null) {
                                                                    uhc.a();
                                                                    return null;
                                                                }
                                                                zT = false;
                                                            } else if (betBuilderType != null && (i9 = n53.a.c[betBuilderType.ordinal()]) != 1) {
                                                                if (i9 != 2 && i9 != 3) {
                                                                    uhc.a();
                                                                    return null;
                                                                }
                                                                zT = g880.t(selection2);
                                                            }
                                                            zT = true;
                                                        }
                                                        if (zT) {
                                                            p53Var = p53Var;
                                                            y5bVar = y5bVar4;
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                if (d5 != null) {
                                                    double dDoubleValue6 = d5.doubleValue();
                                                    str2 = selection2.c.odds;
                                                    if (str2 != null) {
                                                    }
                                                    concurrentHashMap = concurrentHashMapB;
                                                }
                                                if (missionBetCategory == null) {
                                                    i6 = -1;
                                                } else {
                                                    i6 = n53.a.b[missionBetCategory.ordinal()];
                                                }
                                                concurrentHashMap = concurrentHashMapB;
                                                if (i6 != 1) {
                                                    zBooleanValue2 = true;
                                                } else if (i6 != 2) {
                                                    zBooleanValue2 = false;
                                                } else {
                                                    zi50.a aVar12 = zi50.b;
                                                    if (list6.isEmpty()) {
                                                        zContains = true;
                                                    } else {
                                                        zContains = list6.contains(selection2.a.sport.id);
                                                    }
                                                    if (zContains) {
                                                        z9 = false;
                                                    } else {
                                                        if (list5.isEmpty()) {
                                                            zContains2 = true;
                                                        } else {
                                                            zContains2 = list5.contains(selection2.a.sport.category.tournament.id);
                                                        }
                                                        if (zContains2) {
                                                            z9 = false;
                                                        } else {
                                                            if (list4.isEmpty()) {
                                                                zContains3 = true;
                                                            } else {
                                                                zContains3 = list4.contains(selection2.b.id);
                                                            }
                                                            if (zContains3) {
                                                                z9 = true;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                        }
                                                    }
                                                    bVar3 = Boolean.valueOf(z9);
                                                    obj6 = Boolean.FALSE;
                                                    if (bVar3 instanceof zi50.b) {
                                                        bVar3 = obj6;
                                                    }
                                                    zBooleanValue2 = ((Boolean) bVar3).booleanValue();
                                                }
                                                if (zBooleanValue2) {
                                                    continue;
                                                } else {
                                                    if (!(jrvVar2 instanceof jrv.e)) {
                                                        zT = true;
                                                    } else if (Intrinsics.g(jrvVar2, jrv.c.a)) {
                                                        if (list3 != null) {
                                                            if (!list3.isEmpty()) {
                                                                it = list3.iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        i7 = n53.a.e[((UpType) it.next()).ordinal()];
                                                                        selection = selection2;
                                                                        if (i7 != 1) {
                                                                            if (i7 != 2) {
                                                                                if (u7u.h(selection)) {
                                                                                    continue;
                                                                                }
                                                                                selection2 = selection;
                                                                            } else {
                                                                                if (u7u.h(selection)) {
                                                                                    continue;
                                                                                }
                                                                                selection2 = selection;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            zT = false;
                                                        }
                                                        zT = true;
                                                    } else {
                                                        if (list3 != null) {
                                                            if (!list3.isEmpty()) {
                                                                it = list3.iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        i7 = n53.a.e[((UpType) it.next()).ordinal()];
                                                                        selection = selection2;
                                                                        if (i7 != 1) {
                                                                            if (i7 != 2) {
                                                                                if (u7u.h(selection)) {
                                                                                    continue;
                                                                                }
                                                                                selection2 = selection;
                                                                            } else {
                                                                                if (u7u.h(selection)) {
                                                                                    continue;
                                                                                }
                                                                                selection2 = selection;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            zT = false;
                                                        }
                                                        zT = true;
                                                    }
                                                    if (zT) {
                                                        p53Var = p53Var;
                                                        y5bVar = y5bVar4;
                                                    }
                                                }
                                            }
                                            concurrentHashMapB = concurrentHashMap;
                                            i18 = i19;
                                            arrayListU2 = arrayList4;
                                        }
                                    }
                                }
                                aVar = ltv.c.a;
                                aVar = new ltv.a(Integer.valueOf(da90Var.b));
                                if (aVar == null) {
                                }
                                sa90Var.D.setValue(aVar);
                                if (da90Var != null) {
                                    qtvVar = da90Var.k;
                                } else {
                                    qtvVar = null;
                                }
                                if (qtvVar == qtv.c) {
                                    da90Var = null;
                                }
                                p53Var.getClass();
                                orderBetType.getClass();
                                if (da90Var == null) {
                                    cVar = new vwv.b(orderBetType);
                                } else {
                                    p53Var.b.getClass();
                                    arrayList = da90Var.r;
                                    qtvVar2 = da90Var.k;
                                    jrvVar = da90Var.t;
                                    d = da90Var.s;
                                    d2 = da90Var.l;
                                    d3 = da90Var.n;
                                    arrayList2 = new ArrayList();
                                    size = arrayList.size();
                                    i = 0;
                                    while (i < size) {
                                        obj4 = arrayList.get(i);
                                        i++;
                                        if (obj4 instanceof ga90.b) {
                                            arrayList2.add(obj4);
                                        }
                                    }
                                    bVar = (ga90.b) CollectionsKt.firstOrNull(arrayList2);
                                    if (arrayList.isEmpty()) {
                                        size2 = arrayList.size();
                                        i2 = 0;
                                        while (true) {
                                            if (i2 < size2) {
                                                z = false;
                                                break;
                                            }
                                            obj2 = arrayList.get(i2);
                                            i2++;
                                            if (((ga90) obj2) instanceof ga90.c) {
                                                z = true;
                                                break;
                                            }
                                        }
                                    } else {
                                        z = false;
                                        break;
                                    }
                                    if (arrayList.isEmpty()) {
                                        size3 = arrayList.size();
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < size3) {
                                                z2 = false;
                                                break;
                                            }
                                            obj3 = arrayList.get(i3);
                                            i3++;
                                            if (((ga90) obj3) instanceof ga90.a) {
                                                z2 = true;
                                                break;
                                            }
                                        }
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                    if (bVar != null) {
                                        lValueOf = Long.valueOf(bVar.a);
                                    } else {
                                        lValueOf = null;
                                    }
                                    String strD4 = s5y.d(lValueOf);
                                    str = da90Var.j;
                                    strE = s5y.e(d3);
                                    if (d != null) {
                                        strD = s5y.d(d);
                                    } else {
                                        strD = null;
                                    }
                                    strD2 = s5y.d(Double.valueOf(d2));
                                    fD = 0.0f;
                                    if (Math.abs(d2) > 1.0E-10d) {
                                        if (d != null) {
                                            dDoubleValue = d.doubleValue();
                                        } else {
                                            dDoubleValue = 0.0d;
                                        }
                                        fD = f.d((float) (dDoubleValue / d2), 0.0f, 1.0f);
                                    }
                                    float f2 = fD;
                                    if (bVar != null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    uiTextA = j53.a(str, strD4, z3, z2, z);
                                    if (Intrinsics.g(jrvVar, jrv.d.a)) {
                                        resourceUiText2 = new ResourceUiText(R.string.common_bet_ways__1up);
                                    } else if (Intrinsics.g(jrvVar, jrv.f.a)) {
                                        resourceUiText2 = new ResourceUiText(R.string.common_bet_ways__2up);
                                    } else if (Intrinsics.g(jrvVar, jrv.c.a)) {
                                        resourceUiText2 = new ResourceUiText(R.string.common_bet_ways__1up_or_2up);
                                    } else {
                                        if (Intrinsics.g(jrvVar, jrv.b.a)) {
                                            resourceUiText2 = new ResourceUiText(R.string.component_betslip__early_goals);
                                        } else {
                                            if (jrvVar == null) {
                                            }
                                            resourceUiText = null;
                                        }
                                        if (d3 != null) {
                                            if (d3 != null) {
                                                if (resourceUiText == null) {
                                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                                } else {
                                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                                }
                                            } else if (resourceUiText == null) {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                            } else {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                            }
                                        } else if (d3 != null) {
                                            if (resourceUiText == null) {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                            } else {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                            }
                                        } else if (resourceUiText == null) {
                                            resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                        } else {
                                            resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                        }
                                        ResourceUiText resourceUiText6 = resourceUiText3;
                                        iArr = j53.a.a;
                                        if (iArr[qtvVar2.ordinal()] == 1) {
                                            stringUiText = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.component_betslip__mission), new StringUiText(lx5.a(": ", str, " ", strD2))});
                                        } else {
                                            stringUiText = new StringUiText("--");
                                        }
                                        UiText uiText5 = stringUiText;
                                        if (iArr[qtvVar2.ordinal()] == 1) {
                                            z4 = false;
                                            stringUiText2 = new ConcatUiText(new UiText[]{new StringUiText(v70.b(str, " ", strD, " ")), new ResourceUiText(R.string.component_betslip__settled)});
                                        } else {
                                            z4 = false;
                                            stringUiText2 = new StringUiText("--");
                                        }
                                        UiText uiText6 = stringUiText2;
                                        if (d3 != null) {
                                            z5 = true;
                                        } else {
                                            z5 = z4;
                                        }
                                        if (jrvVar instanceof jrv.d) {
                                            z6 = true;
                                        } else {
                                            z6 = true;
                                        }
                                        if (jrvVar instanceof jrv.f) {
                                            z7 = true;
                                        } else {
                                            z7 = true;
                                        }
                                        cVar = new vwv.c(orderBetType, new ftv.a(resourceUiText6, uiText6, uiText5, f2, z5, z6, z7, jrvVar instanceof jrv.b));
                                    }
                                    resourceUiText = resourceUiText2;
                                    if (d3 != null) {
                                        if (d3 != null) {
                                            if (resourceUiText == null) {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                            } else {
                                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                            }
                                        } else if (resourceUiText == null) {
                                            resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                        } else {
                                            resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                        }
                                    } else if (d3 != null) {
                                        if (resourceUiText == null) {
                                            resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                        } else {
                                            resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                        }
                                    } else if (resourceUiText == null) {
                                        resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                    } else {
                                        resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                    }
                                    ResourceUiText resourceUiText7 = resourceUiText3;
                                    iArr = j53.a.a;
                                    if (iArr[qtvVar2.ordinal()] == 1) {
                                        stringUiText = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.component_betslip__mission), new StringUiText(lx5.a(": ", str, " ", strD2))});
                                    } else {
                                        stringUiText = new StringUiText("--");
                                    }
                                    UiText uiText7 = stringUiText;
                                    if (iArr[qtvVar2.ordinal()] == 1) {
                                        z4 = false;
                                        stringUiText2 = new ConcatUiText(new UiText[]{new StringUiText(v70.b(str, " ", strD, " ")), new ResourceUiText(R.string.component_betslip__settled)});
                                    } else {
                                        z4 = false;
                                        stringUiText2 = new StringUiText("--");
                                    }
                                    UiText uiText8 = stringUiText2;
                                    if (d3 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = z4;
                                    }
                                    if (jrvVar instanceof jrv.d) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    if (jrvVar instanceof jrv.f) {
                                        z7 = true;
                                    } else {
                                        z7 = true;
                                    }
                                    cVar = new vwv.c(orderBetType, new ftv.a(resourceUiText7, uiText8, uiText7, f2, z5, z6, z7, jrvVar instanceof jrv.b));
                                }
                                this.b = null;
                                this.c = null;
                                this.a = 1;
                                h99.a(myhVar);
                                objEmit = myhVar.emit(cVar, this);
                                y5bVar2 = y5b.a;
                                if (objEmit != y5bVar2) {
                                    objEmit = Unit.a;
                                }
                                if (objEmit != y5bVar2) {
                                    objEmit = Unit.a;
                                }
                                y5bVar3 = y5bVar;
                                if (objEmit == y5bVar3) {
                                    break;
                                }
                                return y5bVar3;
                            }
                            aVar = ltv.c.a;
                        } else {
                            aVar = ltv.c.a;
                        }
                        p53Var = p53Var;
                        y5bVar = y5bVar4;
                        if (aVar == null) {
                        }
                        sa90Var.D.setValue(aVar);
                        if (da90Var != null) {
                            qtvVar = da90Var.k;
                        } else {
                            qtvVar = null;
                        }
                        if (qtvVar == qtv.c) {
                            da90Var = null;
                        }
                        p53Var.getClass();
                        orderBetType.getClass();
                        if (da90Var == null) {
                            cVar = new vwv.b(orderBetType);
                        } else {
                            p53Var.b.getClass();
                            arrayList = da90Var.r;
                            qtvVar2 = da90Var.k;
                            jrvVar = da90Var.t;
                            d = da90Var.s;
                            d2 = da90Var.l;
                            d3 = da90Var.n;
                            arrayList2 = new ArrayList();
                            size = arrayList.size();
                            i = 0;
                            while (i < size) {
                                obj4 = arrayList.get(i);
                                i++;
                                if (obj4 instanceof ga90.b) {
                                    arrayList2.add(obj4);
                                }
                            }
                            bVar = (ga90.b) CollectionsKt.firstOrNull(arrayList2);
                            if (arrayList.isEmpty()) {
                                size2 = arrayList.size();
                                i2 = 0;
                                while (true) {
                                    if (i2 < size2) {
                                        z = false;
                                        break;
                                    }
                                    obj2 = arrayList.get(i2);
                                    i2++;
                                    if (((ga90) obj2) instanceof ga90.c) {
                                        z = true;
                                        break;
                                    }
                                }
                            } else {
                                z = false;
                                break;
                            }
                            if (arrayList.isEmpty()) {
                                size3 = arrayList.size();
                                i3 = 0;
                                while (true) {
                                    if (i3 < size3) {
                                        z2 = false;
                                        break;
                                    }
                                    obj3 = arrayList.get(i3);
                                    i3++;
                                    if (((ga90) obj3) instanceof ga90.a) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            } else {
                                z2 = false;
                                break;
                            }
                            if (bVar != null) {
                                lValueOf = Long.valueOf(bVar.a);
                            } else {
                                lValueOf = null;
                            }
                            String strD5 = s5y.d(lValueOf);
                            str = da90Var.j;
                            strE = s5y.e(d3);
                            if (d != null) {
                                strD = s5y.d(d);
                            } else {
                                strD = null;
                            }
                            strD2 = s5y.d(Double.valueOf(d2));
                            fD = 0.0f;
                            if (Math.abs(d2) > 1.0E-10d) {
                                if (d != null) {
                                    dDoubleValue = d.doubleValue();
                                } else {
                                    dDoubleValue = 0.0d;
                                }
                                fD = f.d((float) (dDoubleValue / d2), 0.0f, 1.0f);
                            }
                            float f3 = fD;
                            if (bVar != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            uiTextA = j53.a(str, strD5, z3, z2, z);
                            if (Intrinsics.g(jrvVar, jrv.d.a)) {
                                resourceUiText2 = new ResourceUiText(R.string.common_bet_ways__1up);
                            } else if (Intrinsics.g(jrvVar, jrv.f.a)) {
                                resourceUiText2 = new ResourceUiText(R.string.common_bet_ways__2up);
                            } else if (Intrinsics.g(jrvVar, jrv.c.a)) {
                                resourceUiText2 = new ResourceUiText(R.string.common_bet_ways__1up_or_2up);
                            } else {
                                if (Intrinsics.g(jrvVar, jrv.b.a)) {
                                    resourceUiText2 = new ResourceUiText(R.string.component_betslip__early_goals);
                                } else {
                                    if (jrvVar == null) {
                                    }
                                    resourceUiText = null;
                                }
                                if (d3 != null) {
                                    if (d3 != null) {
                                        if (resourceUiText == null) {
                                            resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                        } else {
                                            resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                        }
                                    } else if (resourceUiText == null) {
                                        resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                    } else {
                                        resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                    }
                                } else if (d3 != null) {
                                    if (resourceUiText == null) {
                                        resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                    } else {
                                        resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                    }
                                } else if (resourceUiText == null) {
                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                }
                                ResourceUiText resourceUiText8 = resourceUiText3;
                                iArr = j53.a.a;
                                if (iArr[qtvVar2.ordinal()] == 1) {
                                    stringUiText = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.component_betslip__mission), new StringUiText(lx5.a(": ", str, " ", strD2))});
                                } else {
                                    stringUiText = new StringUiText("--");
                                }
                                UiText uiText9 = stringUiText;
                                if (iArr[qtvVar2.ordinal()] == 1) {
                                    z4 = false;
                                    stringUiText2 = new ConcatUiText(new UiText[]{new StringUiText(v70.b(str, " ", strD, " ")), new ResourceUiText(R.string.component_betslip__settled)});
                                } else {
                                    z4 = false;
                                    stringUiText2 = new StringUiText("--");
                                }
                                UiText uiText10 = stringUiText2;
                                if (d3 != null) {
                                    z5 = true;
                                } else {
                                    z5 = z4;
                                }
                                if (jrvVar instanceof jrv.d) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                if (jrvVar instanceof jrv.f) {
                                    z7 = true;
                                } else {
                                    z7 = true;
                                }
                                cVar = new vwv.c(orderBetType, new ftv.a(resourceUiText8, uiText10, uiText9, f3, z5, z6, z7, jrvVar instanceof jrv.b));
                            }
                            resourceUiText = resourceUiText2;
                            if (d3 != null) {
                                if (d3 != null) {
                                    if (resourceUiText == null) {
                                        resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                    } else {
                                        resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                    }
                                } else if (resourceUiText == null) {
                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                }
                            } else if (d3 != null) {
                                if (resourceUiText == null) {
                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                }
                            } else if (resourceUiText == null) {
                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                            }
                            ResourceUiText resourceUiText9 = resourceUiText3;
                            iArr = j53.a.a;
                            if (iArr[qtvVar2.ordinal()] == 1) {
                                stringUiText = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.component_betslip__mission), new StringUiText(lx5.a(": ", str, " ", strD2))});
                            } else {
                                stringUiText = new StringUiText("--");
                            }
                            UiText uiText11 = stringUiText;
                            if (iArr[qtvVar2.ordinal()] == 1) {
                                z4 = false;
                                stringUiText2 = new ConcatUiText(new UiText[]{new StringUiText(v70.b(str, " ", strD, " ")), new ResourceUiText(R.string.component_betslip__settled)});
                            } else {
                                z4 = false;
                                stringUiText2 = new StringUiText("--");
                            }
                            UiText uiText12 = stringUiText2;
                            if (d3 != null) {
                                z5 = true;
                            } else {
                                z5 = z4;
                            }
                            if (jrvVar instanceof jrv.d) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            if (jrvVar instanceof jrv.f) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            cVar = new vwv.c(orderBetType, new ftv.a(resourceUiText9, uiText12, uiText11, f3, z5, z6, z7, jrvVar instanceof jrv.b));
                        }
                        this.b = null;
                        this.c = null;
                        this.a = 1;
                        h99.a(myhVar);
                        objEmit = myhVar.emit(cVar, this);
                        y5bVar2 = y5b.a;
                        if (objEmit != y5bVar2) {
                            objEmit = Unit.a;
                        }
                        if (objEmit != y5bVar2) {
                            objEmit = Unit.a;
                        }
                        y5bVar3 = y5bVar;
                        if (objEmit == y5bVar3) {
                            break;
                        }
                        return y5bVar3;
                    }
                    p53Var = p53Var;
                    y5bVar = y5bVar4;
                    aVar = ltv.c.a;
                    sa90Var.D.setValue(aVar);
                    if (da90Var != null) {
                        qtvVar = da90Var.k;
                    } else {
                        qtvVar = null;
                    }
                    if (qtvVar == qtv.c) {
                        da90Var = null;
                    }
                    p53Var.getClass();
                    orderBetType.getClass();
                    if (da90Var == null) {
                        cVar = new vwv.b(orderBetType);
                    } else {
                        p53Var.b.getClass();
                        arrayList = da90Var.r;
                        qtvVar2 = da90Var.k;
                        jrvVar = da90Var.t;
                        d = da90Var.s;
                        d2 = da90Var.l;
                        d3 = da90Var.n;
                        arrayList2 = new ArrayList();
                        size = arrayList.size();
                        i = 0;
                        while (i < size) {
                            obj4 = arrayList.get(i);
                            i++;
                            if (obj4 instanceof ga90.b) {
                                arrayList2.add(obj4);
                            }
                        }
                        bVar = (ga90.b) CollectionsKt.firstOrNull(arrayList2);
                        if (arrayList.isEmpty()) {
                            size2 = arrayList.size();
                            i2 = 0;
                            while (true) {
                                if (i2 < size2) {
                                    z = false;
                                    break;
                                }
                                obj2 = arrayList.get(i2);
                                i2++;
                                if (((ga90) obj2) instanceof ga90.c) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        if (arrayList.isEmpty()) {
                            size3 = arrayList.size();
                            i3 = 0;
                            while (true) {
                                if (i3 < size3) {
                                    z2 = false;
                                    break;
                                }
                                obj3 = arrayList.get(i3);
                                i3++;
                                if (((ga90) obj3) instanceof ga90.a) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                        if (bVar != null) {
                            lValueOf = Long.valueOf(bVar.a);
                        } else {
                            lValueOf = null;
                        }
                        String strD6 = s5y.d(lValueOf);
                        str = da90Var.j;
                        strE = s5y.e(d3);
                        if (d != null) {
                            strD = s5y.d(d);
                        } else {
                            strD = null;
                        }
                        strD2 = s5y.d(Double.valueOf(d2));
                        fD = 0.0f;
                        if (Math.abs(d2) > 1.0E-10d) {
                            if (d != null) {
                                dDoubleValue = d.doubleValue();
                            } else {
                                dDoubleValue = 0.0d;
                            }
                            fD = f.d((float) (dDoubleValue / d2), 0.0f, 1.0f);
                        }
                        float f4 = fD;
                        if (bVar != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        uiTextA = j53.a(str, strD6, z3, z2, z);
                        if (Intrinsics.g(jrvVar, jrv.d.a)) {
                            resourceUiText2 = new ResourceUiText(R.string.common_bet_ways__1up);
                        } else if (Intrinsics.g(jrvVar, jrv.f.a)) {
                            resourceUiText2 = new ResourceUiText(R.string.common_bet_ways__2up);
                        } else if (Intrinsics.g(jrvVar, jrv.c.a)) {
                            resourceUiText2 = new ResourceUiText(R.string.common_bet_ways__1up_or_2up);
                        } else {
                            if (Intrinsics.g(jrvVar, jrv.b.a)) {
                                resourceUiText2 = new ResourceUiText(R.string.component_betslip__early_goals);
                            } else {
                                if (jrvVar == null) {
                                }
                                resourceUiText = null;
                            }
                            if (d3 != null) {
                                if (d3 != null) {
                                    if (resourceUiText == null) {
                                        resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                    } else {
                                        resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                    }
                                } else if (resourceUiText == null) {
                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                }
                            } else if (d3 != null) {
                                if (resourceUiText == null) {
                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                }
                            } else if (resourceUiText == null) {
                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                            }
                            ResourceUiText resourceUiText10 = resourceUiText3;
                            iArr = j53.a.a;
                            if (iArr[qtvVar2.ordinal()] == 1) {
                                stringUiText = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.component_betslip__mission), new StringUiText(lx5.a(": ", str, " ", strD2))});
                            } else {
                                stringUiText = new StringUiText("--");
                            }
                            UiText uiText13 = stringUiText;
                            if (iArr[qtvVar2.ordinal()] == 1) {
                                z4 = false;
                                stringUiText2 = new ConcatUiText(new UiText[]{new StringUiText(v70.b(str, " ", strD, " ")), new ResourceUiText(R.string.component_betslip__settled)});
                            } else {
                                z4 = false;
                                stringUiText2 = new StringUiText("--");
                            }
                            UiText uiText14 = stringUiText2;
                            if (d3 != null) {
                                z5 = true;
                            } else {
                                z5 = z4;
                            }
                            if (jrvVar instanceof jrv.d) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            if (jrvVar instanceof jrv.f) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            cVar = new vwv.c(orderBetType, new ftv.a(resourceUiText10, uiText14, uiText13, f4, z5, z6, z7, jrvVar instanceof jrv.b));
                        }
                        resourceUiText = resourceUiText2;
                        if (d3 != null) {
                            if (d3 != null) {
                                if (resourceUiText == null) {
                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                                }
                            } else if (resourceUiText == null) {
                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                            }
                        } else if (d3 != null) {
                            if (resourceUiText == null) {
                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                            } else {
                                resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                            }
                        } else if (resourceUiText == null) {
                            resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_to_unlock_vreward, ay0.S(new Object[]{str, strE, uiTextA}));
                        } else {
                            resourceUiText3 = new ResourceUiText(R.string.component_betslip__stake_at_least_vcurrency_vminstake_vbetreq_to_unlock_vreward, ay0.S(new Object[]{str, strE, resourceUiText, uiTextA}));
                        }
                        ResourceUiText resourceUiText11 = resourceUiText3;
                        iArr = j53.a.a;
                        if (iArr[qtvVar2.ordinal()] == 1) {
                            stringUiText = new ConcatUiText(new UiText[]{new ResourceUiText(R.string.component_betslip__mission), new StringUiText(lx5.a(": ", str, " ", strD2))});
                        } else {
                            stringUiText = new StringUiText("--");
                        }
                        UiText uiText15 = stringUiText;
                        if (iArr[qtvVar2.ordinal()] == 1) {
                            z4 = false;
                            stringUiText2 = new ConcatUiText(new UiText[]{new StringUiText(v70.b(str, " ", strD, " ")), new ResourceUiText(R.string.component_betslip__settled)});
                        } else {
                            z4 = false;
                            stringUiText2 = new StringUiText("--");
                        }
                        UiText uiText16 = stringUiText2;
                        if (d3 != null) {
                            z5 = true;
                        } else {
                            z5 = z4;
                        }
                        if (jrvVar instanceof jrv.d) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (jrvVar instanceof jrv.f) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        cVar = new vwv.c(orderBetType, new ftv.a(resourceUiText11, uiText16, uiText15, f4, z5, z6, z7, jrvVar instanceof jrv.b));
                    }
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    h99.a(myhVar);
                    objEmit = myhVar.emit(cVar, this);
                    y5bVar2 = y5b.a;
                    if (objEmit != y5bVar2) {
                        objEmit = Unit.a;
                    }
                    if (objEmit != y5bVar2) {
                        objEmit = Unit.a;
                    }
                    y5bVar3 = y5bVar;
                    if (objEmit == y5bVar3) {
                        break;
                    }
                    return y5bVar3;
                }
                Object next = it3.next();
                da90 da90Var2 = (da90) next;
                Object obj13 = obj8;
                jrm jrmVar2 = p53Var.a;
                ArrayList arrayList5 = da90Var2.r;
                Double d6 = da90Var2.o;
                if (!arrayList5.isEmpty()) {
                    int size8 = arrayList5.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 < size8) {
                            Object obj14 = arrayList5.get(i20);
                            i20++;
                            int i21 = size8;
                            if (!(((ga90) obj14) instanceof ga90.d)) {
                                size8 = i21;
                            }
                        }
                        it2 = it3;
                        zBooleanValue3 = false;
                        if (zBooleanValue3) {
                            arrayList3.add(next);
                        }
                        it3 = it2;
                        obj8 = obj13;
                    }
                }
                if (da90Var2.m.contains(orderBetType)) {
                    Boolean bool3 = da90Var2.p;
                    if ((bool3 != null ? bool3.equals(bool) : true) && (d6 == null || !(str3 == null || (dH5 = b.h(str3)) == null || dH5.doubleValue() < d6.doubleValue()))) {
                        jrv jrvVar3 = da90Var2.t;
                        if ((jrvVar3 instanceof jrv.e) || Intrinsics.g(jrvVar3, jrv.c.a) || Intrinsics.g(jrvVar3, jrv.d.a) || Intrinsics.g(jrvVar3, jrv.f.a) || Intrinsics.g(jrvVar3, jrv.b.a)) {
                            zL1 = true;
                        } else {
                            if (Intrinsics.g(jrvVar3, jrv.a.a)) {
                                BetBuilderType betBuilderType2 = da90Var2.x;
                                if (betBuilderType2 != null && (i10 = p53.a.a[betBuilderType2.ordinal()]) != 1) {
                                    if (i10 == 2) {
                                        zL1 = jrmVar2.L1();
                                    } else {
                                        if (i10 != 3) {
                                            uhc.a();
                                            return obj13;
                                        }
                                        zL1 = jrmVar2.O1();
                                    }
                                }
                            } else if (jrvVar3 != null) {
                                uhc.a();
                                return obj13;
                            }
                            zL1 = true;
                        }
                        if (zL1) {
                            MissionBetCategory missionBetCategory2 = da90Var2.a;
                            int i22 = missionBetCategory2 != null ? p53.a.b[missionBetCategory2.ordinal()] : -1;
                            if (i22 == 1) {
                                it2 = it3;
                                zBooleanValue3 = true;
                            } else if (i22 != 2) {
                                it2 = it3;
                                zBooleanValue3 = false;
                            } else {
                                ArrayList arrayListU3 = jrmVar2.U();
                                if (arrayListU3.isEmpty()) {
                                    it2 = it3;
                                    zBooleanValue3 = false;
                                } else {
                                    try {
                                        zi50.a aVar13 = zi50.b;
                                        List<String> list7 = da90Var2.u;
                                        try {
                                            if (list7.isEmpty()) {
                                                it2 = it3;
                                            } else {
                                                if (!arrayListU3.isEmpty()) {
                                                    int size9 = arrayListU3.size();
                                                    int i23 = 0;
                                                    while (true) {
                                                        if (i23 < size9) {
                                                            Object obj15 = arrayListU3.get(i23);
                                                            i23++;
                                                            it2 = it3;
                                                            if (!list7.contains(((Selection) obj15).a.sport.id)) {
                                                                it3 = it2;
                                                            }
                                                        }
                                                        zi50.a aVar14 = zi50.b;
                                                        bVar4 = new zi50.b(th);
                                                        obj7 = Boolean.FALSE;
                                                        zi50.a aVar15 = zi50.b;
                                                        if (bVar4 instanceof zi50.b) {
                                                            bVar4 = obj7;
                                                        }
                                                        zBooleanValue3 = ((Boolean) bVar4).booleanValue();
                                                    }
                                                }
                                                it2 = it3;
                                                z10 = false;
                                                bVar4 = Boolean.valueOf(z10);
                                                obj7 = Boolean.FALSE;
                                                zi50.a aVar16 = zi50.b;
                                                if (bVar4 instanceof zi50.b) {
                                                    bVar4 = obj7;
                                                }
                                                zBooleanValue3 = ((Boolean) bVar4).booleanValue();
                                            }
                                            List<String> list8 = da90Var2.v;
                                            if (!list8.isEmpty()) {
                                                if (!arrayListU3.isEmpty()) {
                                                    int size10 = arrayListU3.size();
                                                    int i24 = 0;
                                                    while (true) {
                                                        if (i24 < size10) {
                                                            Object obj16 = arrayListU3.get(i24);
                                                            i24++;
                                                            if (list8.contains(((Selection) obj16).a.sport.category.tournament.id)) {
                                                            }
                                                        }
                                                    }
                                                }
                                                z10 = false;
                                                bVar4 = Boolean.valueOf(z10);
                                                obj7 = Boolean.FALSE;
                                                zi50.a aVar17 = zi50.b;
                                                if (bVar4 instanceof zi50.b) {
                                                    bVar4 = obj7;
                                                }
                                                zBooleanValue3 = ((Boolean) bVar4).booleanValue();
                                            }
                                            List<String> list9 = da90Var2.w;
                                            if (!list9.isEmpty()) {
                                                if (!arrayListU3.isEmpty()) {
                                                    int size11 = arrayListU3.size();
                                                    int i25 = 0;
                                                    while (true) {
                                                        if (i25 < size11) {
                                                            Object obj17 = arrayListU3.get(i25);
                                                            i25++;
                                                            if (list9.contains(((Selection) obj17).b.id)) {
                                                            }
                                                        }
                                                    }
                                                }
                                                z10 = false;
                                                bVar4 = Boolean.valueOf(z10);
                                                obj7 = Boolean.FALSE;
                                                zi50.a aVar18 = zi50.b;
                                                if (bVar4 instanceof zi50.b) {
                                                    bVar4 = obj7;
                                                }
                                                zBooleanValue3 = ((Boolean) bVar4).booleanValue();
                                            }
                                            z10 = true;
                                            bVar4 = Boolean.valueOf(z10);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            zi50.a aVar19 = zi50.b;
                                            bVar4 = new zi50.b(th);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        it2 = it3;
                                    }
                                    obj7 = Boolean.FALSE;
                                    zi50.a aVar110 = zi50.b;
                                    if (bVar4 instanceof zi50.b) {
                                        bVar4 = obj7;
                                    }
                                    zBooleanValue3 = ((Boolean) bVar4).booleanValue();
                                }
                            }
                        } else {
                            it2 = it3;
                            zBooleanValue3 = false;
                        }
                    } else {
                        it2 = it3;
                        zBooleanValue3 = false;
                    }
                } else {
                    it2 = it3;
                    zBooleanValue3 = false;
                }
                if (zBooleanValue3) {
                    arrayList3.add(next);
                }
                it3 = it2;
                obj8 = obj13;
            }
        } else {
            if (i11 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
