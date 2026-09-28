package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class b270 implements lyh<qcn<? extends w270>> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ a270 b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballCellHandlerImpl$init$$inlined$combine$1", f = "ScheduledFootballCellHandlerImpl.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return b270.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[17];
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballCellHandlerImpl$init$$inlined$combine$1$3", f = "ScheduledFootballCellHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super qcn<? extends w270>>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ a270 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, a270 a270Var) {
            super(3, v1bVar);
            this.d = a270Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super qcn<? extends w270>> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:325:0x076c  */
        /* JADX WARN: Code duplicated, block: B:425:0x0902  */
        /* JADX WARN: Code duplicated, block: B:440:0x093b  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v24 */
        /* JADX WARN: Type inference failed for: r6v25 */
        /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r6v27, types: [m2g] */
        /* JADX WARN: Type inference failed for: r6v28, types: [java.util.ArrayList] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object next;
            y5b y5bVar;
            myh myhVar;
            List list;
            List<e970> list2;
            ck70 ck70Var;
            Map map;
            al70 al70Var;
            Map map2;
            Object next2;
            boolean z;
            u670 u670Var;
            ResourceUiText resourceUiText;
            Object next3;
            Object objPrevious;
            r470 r470Var;
            List<q470> list3;
            ResourceUiText resourceUiText2;
            ef70 cVar;
            Object next4;
            Integer numValueOf;
            Object next5;
            Object next6;
            r470 r470Var2;
            Pair pair;
            ek70 ek70Var;
            ek70 ek70Var2;
            Pair pair2;
            Map map3;
            Object k770Var;
            Object next7;
            ArrayList arrayList;
            ColoredUiText coloredUiText;
            Object next8;
            String str;
            g870 g870Var;
            Object obj2;
            ai70 ai70Var;
            ai70 ai70Var2;
            Object next9;
            String str2;
            ck70 ck70Var2;
            al70 al70Var2;
            n470 n470Var;
            n470 n470Var2;
            qgy.a aVar;
            boolean z2;
            Object next10;
            tsa0 tsa0Var;
            Object next11;
            ?? arrayList2;
            v870 v870Var;
            UiText resourceUiText3;
            h870 h870Var;
            v870 v870Var2;
            List<g870> list4;
            Object next12;
            y5b y5bVar2 = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar2 = this.b;
                Object[] objArr = this.c;
                Object obj3 = objArr[0];
                obj3.getClass();
                ni70 ni70Var = (ni70) obj3;
                Object obj4 = objArr[1];
                obj4.getClass();
                long jLongValue = ((Long) obj4).longValue();
                Object obj5 = objArr[2];
                obj5.getClass();
                String str3 = (String) obj5;
                Object obj6 = objArr[3];
                obj6.getClass();
                Map map4 = (Map) obj6;
                Object obj7 = objArr[4];
                obj7.getClass();
                qcn qcnVar = (qcn) obj7;
                Object obj8 = objArr[5];
                obj8.getClass();
                List list5 = (List) obj8;
                Object obj9 = objArr[6];
                obj9.getClass();
                List list6 = (List) obj9;
                al70 al70Var3 = (al70) objArr[7];
                Object obj10 = objArr[8];
                obj10.getClass();
                List list7 = (List) obj10;
                ck70 ck70Var3 = (ck70) objArr[9];
                u670 u670Var2 = (u670) objArr[10];
                Object obj11 = objArr[11];
                obj11.getClass();
                List list8 = (List) obj11;
                Object obj12 = objArr[12];
                obj12.getClass();
                Map map5 = (Map) obj12;
                Object obj13 = objArr[13];
                obj13.getClass();
                Map map6 = (Map) obj13;
                Object obj14 = objArr[14];
                obj14.getClass();
                Map map7 = (Map) obj14;
                Object obj15 = objArr[15];
                obj15.getClass();
                List list9 = (List) obj15;
                Object obj16 = objArr[16];
                obj16.getClass();
                List list10 = (List) obj16;
                List<l770> list11 = ni70Var.c;
                x270 x270Var = ni70Var.a;
                Iterator it = list11.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Iterator it2 = it;
                    if (((l770) next).a.equals(str3)) {
                        break;
                    }
                    it = it2;
                }
                l770 l770Var = (l770) next;
                if (l770Var == null || (list2 = l770Var.d) == null) {
                    y5bVar = y5bVar2;
                    myhVar = myhVar2;
                    list = null;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = list2.iterator();
                    ArrayList arrayList4 = arrayList3;
                    while (it3.hasNext()) {
                        Iterator it4 = it3;
                        e970 e970Var = (e970) it3.next();
                        boolean zB = e970Var.b(jLongValue);
                        y5b y5bVar3 = y5bVar2;
                        String str4 = e970Var.a;
                        myh myhVar3 = myhVar2;
                        int i2 = e970Var.c;
                        List<z370> list12 = e970Var.i;
                        if (zB) {
                            Map map8 = map7;
                            ck70Var = ck70Var3;
                            jLongValue = jLongValue;
                            Map map9 = map5;
                            map = map4;
                            al70Var = al70Var3;
                            ArrayList arrayList5 = arrayList4;
                            u670 u670Var3 = u670Var2;
                            long jI = kotlin.time.c.i(e970Var.h - jLongValue, rgf.MILLISECONDS);
                            kotlin.time.b.a aVar2 = kotlin.time.b.b;
                            if (kotlin.time.b.j(jI, rgf.SECONDS) <= 0) {
                                u670Var = u670Var3;
                                map3 = map8;
                                map2 = map9;
                                k770Var = null;
                                arrayList = arrayList5;
                            } else {
                                f970 f970Var = (f970) map6.get(str4);
                                map2 = map9;
                                v470 v470Var = (v470) map2.get(str4);
                                boolean z3 = f970Var != null ? f970Var == f970.d || f970Var == f970.b : true;
                                Iterator it5 = list9.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it5.next();
                                } while (!((q570) next2).a.equals(str4));
                                q570 q570Var = (q570) next2;
                                String str5 = q570Var != null ? q570Var.b : null;
                                boolean z4 = v470Var instanceof v470.c;
                                v470.c cVar2 = z4 ? (v470.c) v470Var : null;
                                if (cVar2 != null) {
                                    List<o470> list13 = cVar2.a;
                                    if (list13.isEmpty()) {
                                        z = false;
                                    } else {
                                        if (!list13.isEmpty()) {
                                            Iterator it6 = list13.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    if (jLongValue < ((o470) it6.next()).d) {
                                                        z = false;
                                                    }
                                                }
                                            }
                                        }
                                        z = true;
                                    }
                                } else {
                                    z = false;
                                }
                                int i3 = z ? R.string.page_instant_virtual__all_games_end : R.string.page_instant_virtual__now_playing;
                                StringUiText stringUiText = vch0.a;
                                ResourceUiText resourceUiText4 = new ResourceUiText(i3);
                                if (z) {
                                    u670Var = u670Var3;
                                    resourceUiText = null;
                                } else if (v470Var == null || (v470Var instanceof v470.b)) {
                                    u670Var = u670Var3;
                                    resourceUiText = new ResourceUiText(R.string.common_functions__loading);
                                } else {
                                    if (!(v470Var instanceof v470.a)) {
                                        if (!(v470Var instanceof v470.c)) {
                                            uhc.a();
                                            return null;
                                        }
                                        List<o470> list14 = ((v470.c) v470Var).a;
                                        if (!list14.isEmpty()) {
                                            Iterator it7 = list14.iterator();
                                            do {
                                                if (!it7.hasNext()) {
                                                    next3 = null;
                                                    break;
                                                }
                                                next3 = it7.next();
                                            } while (!((o470) next3).a.equals(str5));
                                            o470 o470Var = (o470) next3;
                                            List listR0 = (o470Var == null || (list3 = o470Var.e) == null) ? null : CollectionsKt.r0(list3, new x670());
                                            if (listR0 != null && !listR0.isEmpty()) {
                                                ListIterator listIterator = listR0.listIterator(listR0.size());
                                                while (true) {
                                                    if (!listIterator.hasPrevious()) {
                                                        u670Var = u670Var3;
                                                        objPrevious = null;
                                                        break;
                                                    }
                                                    objPrevious = listIterator.previous();
                                                    u670Var = u670Var3;
                                                    if (jLongValue >= ((q470) objPrevious).b) {
                                                        break;
                                                    }
                                                    u670Var3 = u670Var;
                                                }
                                                q470 q470Var = (q470) objPrevious;
                                                if (q470Var != null) {
                                                    r470 r470Var3 = q470Var.f;
                                                    if (r470Var3 == null || r470Var3 != r470.FULL_TIME) {
                                                        if (r470Var3 == null || r470Var3 != r470.HALF_TIME) {
                                                            if (listR0.isEmpty()) {
                                                                resourceUiText = new ResourceUiText(R.string.page_instant_virtual__1st_half);
                                                                break;
                                                            }
                                                            Iterator it8 = listR0.iterator();
                                                            while (true) {
                                                                if (!it8.hasNext()) {
                                                                    resourceUiText = new ResourceUiText(R.string.page_instant_virtual__1st_half);
                                                                    break;
                                                                }
                                                                q470 q470Var2 = (q470) it8.next();
                                                                if (jLongValue >= q470Var2.b && (r470Var = q470Var2.f) != null && r470Var == r470.HALF_TIME) {
                                                                    resourceUiText = new ResourceUiText(R.string.page_instant_virtual__2nd_half);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            resourceUiText = new ResourceUiText(R.string.page_instant_virtual__half_time);
                                                        }
                                                    } else {
                                                        resourceUiText = new ResourceUiText(R.string.page_instant_virtual__game_end);
                                                    }
                                                } else {
                                                    resourceUiText = new ResourceUiText(R.string.page_instant_virtual__1st_half);
                                                }
                                            } else {
                                                u670Var = u670Var3;
                                                resourceUiText = new ResourceUiText(R.string.page_instant_virtual__1st_half);
                                            }
                                        } else {
                                            resourceUiText2 = new ResourceUiText(R.string.page_instant_virtual__1st_half);
                                        }
                                    } else {
                                        resourceUiText2 = new ResourceUiText(R.string.page_instant_virtual__1st_half);
                                    }
                                    u670Var = u670Var3;
                                    resourceUiText = resourceUiText2;
                                }
                                a770 a770Var = new a770(resourceUiText4, resourceUiText, new ResourceUiText(R.string.page_instant_virtual__matchday_vnum, ay0.S(new Object[]{String.valueOf(i2)})), z);
                                if (v470Var == null || (v470Var instanceof v470.b)) {
                                    cVar = ef70.b.a;
                                } else if (v470Var instanceof v470.a) {
                                    cVar = ef70.a.a;
                                } else {
                                    if (!(v470Var instanceof v470.c)) {
                                        uhc.a();
                                        return null;
                                    }
                                    if (((v470.c) v470Var).a.isEmpty()) {
                                        cVar = ef70.a.a;
                                    } else {
                                        Iterator it9 = list10.iterator();
                                        do {
                                            if (!it9.hasNext()) {
                                                next7 = null;
                                                break;
                                            }
                                            next7 = it9.next();
                                        } while (!((f870) next7).a.equals(str5));
                                        cVar = new ef70.c((f870) next7);
                                    }
                                }
                                ef70 ef70Var = cVar;
                                if (z4) {
                                    Iterator it10 = ((v470.c) v470Var).a.iterator();
                                    do {
                                        if (!it10.hasNext()) {
                                            next4 = null;
                                            break;
                                        }
                                        next4 = it10.next();
                                    } while (!((o470) next4).a.equals(str5));
                                    o470 o470Var2 = (o470) next4;
                                    if (o470Var2 != null && jLongValue >= o470Var2.d) {
                                        numValueOf = Integer.valueOf(R.string.page_instant_virtual__scheduled_football_game_end_image);
                                    } else {
                                        numValueOf = null;
                                    }
                                } else {
                                    numValueOf = null;
                                }
                                if (z4) {
                                    Iterator it11 = list12.iterator();
                                    do {
                                        if (!it11.hasNext()) {
                                            next5 = null;
                                            break;
                                        }
                                        next5 = it11.next();
                                    } while (!((z370) next5).a.equals(str5));
                                    z370 z370Var = (z370) next5;
                                    if (z370Var == null) {
                                        pair2 = null;
                                    } else {
                                        String str6 = z370Var.d;
                                        String str7 = z370Var.c;
                                        String str8 = z370Var.g;
                                        String str9 = z370Var.f;
                                        Iterator it12 = ((v470.c) v470Var).a.iterator();
                                        do {
                                            if (!it12.hasNext()) {
                                                next6 = null;
                                                break;
                                            }
                                            next6 = it12.next();
                                        } while (!((o470) next6).a.equals(str5));
                                        o470 o470Var3 = (o470) next6;
                                        if (o470Var3 == null) {
                                            pair2 = null;
                                        } else {
                                            List<q470> list15 = o470Var3.e;
                                            if (list15 != null && list15.isEmpty()) {
                                                pair = new Pair(ek70.b.a, ek70.b.b);
                                                break;
                                            }
                                            Iterator it13 = list15.iterator();
                                            while (true) {
                                                if (!it13.hasNext()) {
                                                    pair = new Pair(ek70.b.a, ek70.b.b);
                                                    break;
                                                }
                                                q470 q470Var3 = (q470) it13.next();
                                                if (jLongValue >= q470Var3.b && (r470Var2 = q470Var3.f) != null && r470Var2 == r470.HALF_TIME) {
                                                    pair = new Pair(ek70.b.b, ek70.b.a);
                                                    break;
                                                }
                                            }
                                            ek70.b bVar = (ek70.b) pair.a;
                                            ek70.b bVar2 = (ek70.b) pair.b;
                                            ek70.a aVar3 = ek70.a.a;
                                            int iOrdinal = bVar.ordinal();
                                            if (iOrdinal == 0) {
                                                ek70Var = new ek70(str7, str6, bVar, aVar3);
                                            } else {
                                                if (iOrdinal != 1) {
                                                    uhc.a();
                                                    return null;
                                                }
                                                ek70Var = new ek70(str9, str8, bVar, aVar3);
                                            }
                                            ek70.a aVar4 = ek70.a.b;
                                            int iOrdinal2 = bVar2.ordinal();
                                            if (iOrdinal2 == 0) {
                                                ek70Var2 = new ek70(str7, str6, bVar2, aVar4);
                                            } else {
                                                if (iOrdinal2 != 1) {
                                                    uhc.a();
                                                    return null;
                                                }
                                                ek70Var2 = new ek70(str9, str8, bVar2, aVar4);
                                            }
                                            pair2 = new Pair(ek70Var, ek70Var2);
                                        }
                                    }
                                } else {
                                    pair2 = null;
                                }
                                ek70 ek70Var3 = pair2 != null ? (ek70) pair2.a : null;
                                ek70 ek70Var4 = pair2 != null ? (ek70) pair2.b : null;
                                map3 = map8;
                                Iterable iterable = (List) map3.get(str4);
                                if (iterable == null) {
                                    iterable = m2g.a;
                                }
                                k770Var = new k770(str4, z3, a770Var, ef70Var, numValueOf, ek70Var3, ek70Var4, a4h.b(iterable), (f970Var == null || !(f970Var == f970.a || f970Var == f970.b)) ? 4 : 0, new ResourceUiText(z3 ? R.string.page_instant_virtual__show_less_matches : R.string.page_instant_virtual__show_more_matches));
                                arrayList = arrayList5;
                            }
                        } else {
                            f970 f970Var2 = (f970) map4.get(str4);
                            map = map4;
                            boolean z5 = f970Var2 != null ? f970Var2 == f970.d || f970Var2 == f970.b : true;
                            boolean zA = e970Var.a(jLongValue);
                            if (zA) {
                                StringUiText stringUiText2 = vch0.a;
                                coloredUiText = new ColoredUiText(new ResourceUiText(R.string.page_instant_virtual__bet_closed), Integer.valueOf(R.color.text_secondary), null);
                            } else {
                                StringUiText stringUiText3 = vch0.a;
                                coloredUiText = new ColoredUiText(new ResourceUiText(R.string.page_instant_virtual__starting_in), Integer.valueOf(R.color.text_primary), null);
                            }
                            long jI2 = kotlin.time.c.i(e970Var.g - jLongValue, rgf.MILLISECONDS);
                            kotlin.time.b.a aVar5 = kotlin.time.b.b;
                            long j = kotlin.time.b.j(jI2, rgf.SECONDS);
                            xl70 xl70Var = new xl70(new ResourceUiText(R.string.page_instant_virtual__matchday_vnum, ay0.S(new Object[]{String.valueOf(i2)})), coloredUiText, String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2)), j > 60 ? R.color.bg_discount_gift_primary : (11 > j || j >= 61) ? R.color.text_disabled_action : R.color.bg_danger_primary, z5 ? xl70.a.c : xl70.a.d);
                            Iterator it14 = list5.iterator();
                            do {
                                if (!it14.hasNext()) {
                                    next8 = null;
                                    break;
                                }
                                next8 = it14.next();
                            } while (!((c970) next8).a.equals(str4));
                            c970 c970Var = (c970) next8;
                            String str10 = c970Var != null ? c970Var.b : null;
                            String str11 = "";
                            if (str10 == null) {
                                str10 = "";
                            }
                            z370 z370Var2 = (z370) CollectionsKt.firstOrNull(list12);
                            if (z370Var2 == null || (list4 = z370Var2.i) == null) {
                                str = "";
                                g870Var = null;
                            } else {
                                Iterator it15 = list4.iterator();
                                while (true) {
                                    if (!it15.hasNext()) {
                                        str = str11;
                                        next12 = null;
                                        break;
                                    }
                                    next12 = it15.next();
                                    str = str11;
                                    if (((g870) next12).e.equals(str10)) {
                                        break;
                                    }
                                    str11 = str;
                                }
                                g870Var = (g870) next12;
                            }
                            Iterator it16 = list6.iterator();
                            while (true) {
                                if (!it16.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                Object next13 = it16.next();
                                Iterator it17 = it16;
                                obj2 = next13;
                                if (Intrinsics.g(((bl70) next13).a, g870Var != null ? g870Var.e : null)) {
                                    break;
                                }
                                it16 = it17;
                            }
                            bl70 bl70Var = (bl70) obj2;
                            String str12 = bl70Var != null ? bl70Var.b : null;
                            if (str12 == null) {
                                str12 = str;
                            }
                            w870 w870Var = (g870Var == null || (h870Var = g870Var.g) == null || (v870Var2 = h870Var.d) == null) ? null : v870Var2.a;
                            int i4 = w870Var == null ? -1 : ml70.b[w870Var.ordinal()];
                            arrayList = arrayList4;
                            if (i4 == 1) {
                                map7 = map7;
                                ai70Var = new ai70(null, a4h.b(StringsKt__StringsKt.split$default(g870Var.h, new String[]{";"}, false, 0, 6, null)));
                            } else if (i4 != 2) {
                                ai70Var = new ai70(null, n1a0.c);
                                map7 = map7;
                            } else {
                                sfh0.b.getClass();
                                sfh0 sfh0VarA = sfh0.a.a(str12);
                                int i5 = sfh0VarA == null ? -1 : ml70.a[sfh0VarA.ordinal()];
                                if (i5 == 1) {
                                    resourceUiText3 = new ResourceUiText(R.string.common_functions__near);
                                } else if (i5 != 2) {
                                    StringUiText stringUiText4 = vch0.a;
                                    resourceUiText3 = new StringUiText(str12);
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.common_functions__far);
                                }
                                ai70Var = new ai70(new rfh0(resourceUiText3, str12, Intrinsics.g(al70Var3 != null ? al70Var3.a : null, str4)), a4h.b(CollectionsKt.O(StringsKt__StringsKt.split$default(g870Var.h, new String[]{";"}, false, 0, 6, null), 1)));
                            }
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it18 = list12.iterator();
                            while (it18.hasNext()) {
                                z370 z370Var3 = (z370) it18.next();
                                List<g870> list16 = z370Var3.i;
                                String str13 = z370Var3.g;
                                String str14 = str4;
                                String str15 = z370Var3.f;
                                String str16 = z370Var3.d;
                                String str17 = z370Var3.c;
                                String str18 = z370Var3.a;
                                Iterator it19 = list16.iterator();
                                while (true) {
                                    if (!it19.hasNext()) {
                                        ai70Var2 = ai70Var;
                                        next9 = null;
                                        break;
                                    }
                                    next9 = it19.next();
                                    ai70Var2 = ai70Var;
                                    if (((g870) next9).e.equals(str10)) {
                                        break;
                                    }
                                    ai70Var = ai70Var2;
                                }
                                g870 g870Var2 = (g870) next9;
                                if (g870Var2 == null) {
                                    str2 = str10;
                                    ck70Var2 = ck70Var3;
                                    al70Var2 = al70Var3;
                                    n470Var2 = null;
                                } else {
                                    u670 u670Var4 = (u670Var2 == null || !Intrinsics.g(u670Var2.a, str18)) ? null : u670Var2;
                                    h870 h870Var2 = g870Var2.g;
                                    w870 w870Var2 = (h870Var2 == null || (v870Var = h870Var2.d) == null) ? null : v870Var.a;
                                    int i6 = w870Var2 == null ? -1 : ml70.b[w870Var2.ordinal()];
                                    if (i6 == -1) {
                                        str2 = str10;
                                        ck70Var2 = ck70Var3;
                                        al70Var2 = al70Var3;
                                        n470Var = null;
                                    } else if (i6 == 1) {
                                        str2 = str10;
                                        ck70Var2 = ck70Var3;
                                        al70Var2 = al70Var3;
                                        c470 c470Var = new c470(str17, str16, z370Var3.e, str15, str13, z370Var3.h, x270Var.h ? u670Var4 != null ? c470.a.a : c470.a.b : null);
                                        ArrayList arrayList7 = g870Var2.i;
                                        ArrayList arrayList8 = new ArrayList(l48.r(arrayList7, 10));
                                        int size = arrayList7.size();
                                        int i7 = 0;
                                        while (i7 < size) {
                                            Object obj17 = arrayList7.get(i7);
                                            i7++;
                                            ad70 ad70Var = (ad70) obj17;
                                            if (zA) {
                                                aVar = qgy.a.v;
                                            } else if (ad70Var.f) {
                                                if (list8.isEmpty()) {
                                                    aVar = qgy.a.f;
                                                    break;
                                                }
                                                Iterator it20 = list8.iterator();
                                                while (true) {
                                                    if (!it20.hasNext()) {
                                                        aVar = qgy.a.f;
                                                        break;
                                                        break;
                                                    }
                                                    if (Intrinsics.g(((bi70) it20.next()).f, ad70Var)) {
                                                        aVar = qgy.a.i;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                aVar = qgy.a.v;
                                            }
                                            String string = ad70Var.b.toString();
                                            string.getClass();
                                            arrayList8.add(new da70(ad70Var.a, new qgy(null, gky.a.a(string, false), aVar)));
                                            arrayList7 = arrayList7;
                                        }
                                        n470Var = new n470(str18, c470Var, null, null, a4h.b(arrayList8), u670Var4);
                                    } else {
                                        if (i6 != 2) {
                                            uhc.a();
                                            return null;
                                        }
                                        boolean z6 = x270Var.h;
                                        Iterator it21 = list7.iterator();
                                        while (true) {
                                            if (!it21.hasNext()) {
                                                z2 = z6;
                                                next10 = null;
                                                break;
                                            }
                                            next10 = it21.next();
                                            ck70 ck70Var4 = (ck70) next10;
                                            z2 = z6;
                                            if (ck70Var4.b.equals(str18) && Intrinsics.g(ck70Var4.c, str10)) {
                                                break;
                                            }
                                            z6 = z2;
                                        }
                                        ck70 ck70Var5 = (ck70) next10;
                                        ck70 ck70Var6 = (ck70Var3 != null && ck70Var3.b.equals(str18) && Intrinsics.g(ck70Var3.c, str10)) ? ck70Var3 : null;
                                        List<g870> list17 = z370Var3.i;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        Iterator it22 = list17.iterator();
                                        while (it22.hasNext()) {
                                            ck70 ck70Var7 = ck70Var3;
                                            Object next14 = it22.next();
                                            Iterator it23 = it22;
                                            String str19 = ((g870) next14).e;
                                            Object objA = linkedHashMap.get(str19);
                                            if (objA == null) {
                                                objA = r9i.a(str19, linkedHashMap);
                                            }
                                            ((List) objA).add(next14);
                                            ck70Var3 = ck70Var7;
                                            it22 = it23;
                                        }
                                        ck70Var2 = ck70Var3;
                                        List list18 = (List) linkedHashMap.get(str10);
                                        if (list18 == null) {
                                            str2 = str10;
                                            al70Var2 = al70Var3;
                                            n470Var = null;
                                        } else {
                                            c470 c470Var2 = new c470(str17, str16, z370Var3.e, str15, str13, z370Var3.h, z2 ? u670Var4 != null ? c470.a.a : c470.a.b : null);
                                            if (ck70Var5 != null) {
                                                String str20 = ck70Var5.d;
                                                tsa0Var = new tsa0(str20, str20, ck70Var6 != null);
                                            } else {
                                                tsa0Var = null;
                                            }
                                            boolean z7 = ck70Var6 != null;
                                            String str21 = ck70Var6 != null ? ck70Var6.d : null;
                                            if (str21 == null) {
                                                str21 = str;
                                            }
                                            ArrayList arrayList9 = new ArrayList(l48.r(list18, 10));
                                            Iterator it24 = list18.iterator();
                                            while (it24.hasNext()) {
                                                g870 g870Var3 = (g870) it24.next();
                                                String str22 = str10;
                                                List list19 = list18;
                                                Iterator it25 = it24;
                                                al70 al70Var4 = al70Var3;
                                                String str23 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(g870Var3.d, new String[]{";"}, false, 0, 6, null));
                                                if (str23 == null) {
                                                    str23 = str;
                                                }
                                                ArrayList arrayList10 = g870Var3.i;
                                                ArrayList arrayList11 = new ArrayList(l48.r(arrayList10, 10));
                                                int size2 = arrayList10.size();
                                                for (int i8 = 0; i8 < size2; i8++) {
                                                    ArrayList arrayList12 = arrayList10;
                                                    ad70 ad70Var2 = (ad70) arrayList10.get(i8);
                                                    arrayList11.add(new ata0(ad70Var2.a, d470.a(ad70Var2, zA, list8)));
                                                    size2 = size2;
                                                    arrayList10 = arrayList12;
                                                }
                                                arrayList9.add(new usa0(a4h.b(arrayList11), str23, str23));
                                                list18 = list19;
                                                it24 = it25;
                                                str10 = str22;
                                                al70Var3 = al70Var4;
                                            }
                                            str2 = str10;
                                            List list20 = list18;
                                            al70Var2 = al70Var3;
                                            bta0 bta0Var = new bta0(a4h.b(arrayList9), str21, z7);
                                            Iterator it26 = list20.iterator();
                                            do {
                                                if (!it26.hasNext()) {
                                                    next11 = null;
                                                    break;
                                                }
                                                next11 = it26.next();
                                            } while (!Intrinsics.g((String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(((g870) next11).d, new String[]{";"}, false, 0, 6, null)), ck70Var5 != null ? ck70Var5.d : null));
                                            g870 g870Var4 = (g870) next11;
                                            if (g870Var4 != null) {
                                                ArrayList arrayList13 = g870Var4.i;
                                                arrayList2 = new ArrayList(l48.r(arrayList13, 10));
                                                int size3 = arrayList13.size();
                                                int i9 = 0;
                                                while (i9 < size3) {
                                                    Object obj18 = arrayList13.get(i9);
                                                    i9++;
                                                    ad70 ad70Var3 = (ad70) obj18;
                                                    arrayList2.add(new da70(ad70Var3.a, d470.a(ad70Var3, zA, list8)));
                                                }
                                            } else {
                                                arrayList2 = 0;
                                            }
                                            if (arrayList2 == 0) {
                                                arrayList2 = m2g.a;
                                            }
                                            n470Var = new n470(str18, c470Var2, tsa0Var, bta0Var, a4h.b(arrayList2), u670Var4);
                                        }
                                    }
                                    n470Var2 = n470Var;
                                }
                                if (n470Var2 != null) {
                                    arrayList6.add(n470Var2);
                                }
                                it18 = it18;
                                ck70Var3 = ck70Var2;
                                str4 = str14;
                                ai70Var = ai70Var2;
                                str10 = str2;
                                al70Var3 = al70Var2;
                            }
                            String str24 = str4;
                            ck70Var = ck70Var3;
                            al70Var = al70Var3;
                            u670 u670Var5 = u670Var2;
                            k770Var = new yl70(str24, z5, xl70Var, qcnVar, str10, ai70Var, a4h.b(arrayList6), new ResourceUiText(R.string.page_instant_virtual__season_id_vnum, ay0.S(new Object[]{String.valueOf(e970Var.b)})));
                            u670Var = u670Var5;
                            map3 = map7;
                            map2 = map5;
                        }
                        ArrayList arrayList14 = arrayList;
                        if (k770Var != null) {
                            arrayList14.add(k770Var);
                        }
                        map7 = map3;
                        arrayList4 = arrayList14;
                        map5 = map2;
                        u670Var2 = u670Var;
                        ck70Var3 = ck70Var;
                        it3 = it4;
                        y5bVar2 = y5bVar3;
                        myhVar2 = myhVar3;
                        map4 = map;
                        jLongValue = jLongValue;
                        al70Var3 = al70Var;
                    }
                    y5bVar = y5bVar2;
                    myhVar = myhVar2;
                    list = arrayList4;
                }
                if (list == null) {
                    list = m2g.a;
                }
                qcn qcnVarB = a4h.b(list);
                this.b = null;
                this.c = null;
                this.a = 1;
                y5b y5bVar4 = y5bVar;
                if (myhVar.emit(qcnVarB, this) == y5bVar4) {
                    return y5bVar4;
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

    public b270(lyh[] lyhVarArr, a270 a270Var) {
        this.a = lyhVarArr;
        this.b = a270Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super qcn<? extends w270>> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            lyh[] lyhVarArr = this.a;
            b bVar = new b(lyhVarArr);
            c cVar = new c(null, this.b);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
