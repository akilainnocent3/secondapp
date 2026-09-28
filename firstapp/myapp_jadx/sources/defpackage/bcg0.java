package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.sporty.android.book.domain.entity.Category;
import com.sporty.android.book.domain.entity.Sport;
import com.sporty.android.book.domain.entity.SportsMenuData;
import com.sporty.android.book.domain.entity.Tournament;
import com.sporty.android.book.domain.entity.UIState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes4.dex */
public final class bcg0 {

    public static final /* synthetic */ class a extends saj implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            dgb0 dgb0Var = (dgb0) this.receiver;
            dgb0Var.getClass();
            wwd0 wwd0Var = dgb0Var.D;
            LinkedHashSet linkedHashSetD0 = CollectionsKt.D0((Iterable) wwd0Var.getValue());
            if (linkedHashSetD0.contains(str2)) {
                linkedHashSetD0.remove(str2);
            } else {
                linkedHashSetD0.add(str2);
            }
            wwd0Var.k(null, linkedHashSetD0);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<String, Unit> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v10, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r8v9, types: [m2g] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            ?? arrayList;
            List<Tournament> tournaments;
            String str2 = str;
            str2.getClass();
            dgb0 dgb0Var = (dgb0) this.receiver;
            wwd0 wwd0Var = dgb0Var.f;
            wwd0 wwd0Var2 = dgb0Var.F;
            LinkedHashSet linkedHashSetD0 = CollectionsKt.D0((Iterable) wwd0Var2.getValue());
            if (StringsKt.M(str2, LhMGMAwwhzjwfz.lCjrquSfiL, true)) {
                Object data = ((UIState) dgb0Var.v.getValue()).getData();
                data.getClass();
                Category categoryFindCategory = ((SportsMenuData) data).findCategory((String) wwd0Var.getValue(), str2);
                if (categoryFindCategory == null || (tournaments = categoryFindCategory.getTournaments()) == null) {
                    arrayList = 0;
                } else {
                    arrayList = new ArrayList(l48.r(tournaments, 10));
                    Iterator it = tournaments.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Tournament) it.next()).getId());
                    }
                }
                if (arrayList == 0) {
                    arrayList = m2g.a;
                }
                Set setE0 = CollectionsKt.E0(arrayList);
                if (linkedHashSetD0.containsAll(setE0)) {
                    linkedHashSetD0.removeAll(setE0);
                } else {
                    linkedHashSetD0.addAll(setE0);
                }
            } else if (StringsKt.M(str2, Category.FAVOURITES_ID, true)) {
                Object obj = ((Map) dgb0Var.z.getValue()).get(wwd0Var.getValue());
                obj.getClass();
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(l48.r(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Tournament) it2.next()).getId());
                }
                Set setE1 = CollectionsKt.E0(arrayList2);
                if (linkedHashSetD0.containsAll(setE1)) {
                    linkedHashSetD0.removeAll(setE1);
                } else {
                    linkedHashSetD0.addAll(setE1);
                }
            } else if (linkedHashSetD0.contains(str2)) {
                linkedHashSetD0.remove(str2);
            } else {
                linkedHashSetD0.add(str2);
            }
            wwd0Var2.k(null, linkedHashSetD0);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<String, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String str2 = str;
            str2.getClass();
            return ((dgb0) this.receiver).z1(str2);
        }
    }

    public static final /* synthetic */ class d extends saj implements Function1<Tournament, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Tournament tournament) {
            Tournament tournament2 = tournament;
            tournament2.getClass();
            dgb0 dgb0Var = (dgb0) this.receiver;
            dgb0Var.getClass();
            Boolean boolZ1 = dgb0Var.z1(tournament2.getId());
            if (boolZ1 != null) {
                boolean zBooleanValue = boolZ1.booleanValue();
                hzf0 hzf0Var = dgb0Var.c;
                String id = tournament2.getId();
                hzf0Var.getClass();
                id.getClass();
                nkb0 nkb0Var = hzf0Var.a;
                kzh.d(new yzh(new g1i(ozh.c(!zBooleanValue ? nkb0Var.i(id) : nkb0Var.a(id), hzf0Var.b), new ggb0(dgb0Var, zBooleanValue, tournament2, null)), new hgb0(dgb0Var, null)), o8i0.d(dgb0Var));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        Map<String, Sport> sportMap;
        Sport sport;
        Map<String, Sport> popularSportsMap;
        Sport sport2;
        Map<String, Sport> topSportsMap;
        Sport sport3;
        androidx.compose.runtime.b bVarI = aVar.i(694486153);
        int i2 = 1;
        if (bVarI.q(i & 1, i != 0)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            dgb0 dgb0Var = (dgb0) p8i0.a(jq40.a(dgb0.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            ytw ytwVarC = wyh.c(dgb0Var.A, bVarI, 0, 7);
            ytw ytwVarC2 = wyh.c(dgb0Var.w, bVarI, 0, 7);
            ytw ytwVarC3 = wyh.c(dgb0Var.i, bVarI, 0, 7);
            ytw ytwVarC4 = wyh.c(dgb0Var.K, bVarI, 0, 7);
            ytw ytwVarC5 = wyh.c(dgb0Var.E, bVarI, 0, 7);
            ytw ytwVarC6 = wyh.c(dgb0Var.G, bVarI, 0, 7);
            List list = (List) ((Map) ytwVarC.getValue()).get((String) ytwVarC3.getValue());
            if (list == null) {
                list = m2g.a;
            }
            SportsMenuData sportsMenuData = (SportsMenuData) ((UIState) ytwVarC2.getValue()).getData();
            List<Category> categories = null;
            Category topCategory = (sportsMenuData == null || (topSportsMap = sportsMenuData.getTopSportsMap()) == null || (sport3 = topSportsMap.get((String) ytwVarC3.getValue())) == null) ? null : sport3.getTopCategory();
            SportsMenuData sportsMenuData2 = (SportsMenuData) ((UIState) ytwVarC2.getValue()).getData();
            List<Category> categories2 = (sportsMenuData2 == null || (popularSportsMap = sportsMenuData2.getPopularSportsMap()) == null || (sport2 = popularSportsMap.get((String) ytwVarC3.getValue())) == null) ? null : sport2.getCategories();
            SportsMenuData sportsMenuData3 = (SportsMenuData) ((UIState) ytwVarC2.getValue()).getData();
            if (sportsMenuData3 != null && (sportMap = sportsMenuData3.getSportMap()) != null && (sport = sportMap.get((String) ytwVarC3.getValue())) != null) {
                categories = sport.getCategories();
            }
            List<Category> list2 = categories;
            String str = (String) ytwVarC4.getValue();
            boolean zM = bVarI.M(ytwVarC5);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new m5c0(ytwVarC5, i2);
                bVarI.r(objY);
            }
            Function1 function1 = (Function1) objY;
            boolean zA = bVarI.A(dgb0Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                a aVar2 = new a(1, dgb0Var, dgb0.class, "toggleCategoryExpand", "toggleCategoryExpand(Ljava/lang/String;)V", 0);
                bVarI.r(aVar2);
                objY2 = aVar2;
            }
            Function1 function2 = (Function1) ((chp) objY2);
            boolean zM2 = bVarI.M(ytwVarC6);
            Object objY3 = bVarI.y();
            if (zM2 || objY3 == c0042a) {
                objY3 = new n5c0(ytwVarC6, i2);
                bVarI.r(objY3);
            }
            Function1 function3 = (Function1) objY3;
            boolean zA2 = bVarI.A(dgb0Var);
            Object objY4 = bVarI.y();
            if (zA2 || objY4 == c0042a) {
                objY4 = new b(1, dgb0Var, dgb0.class, "toggleTournamentSelect", "toggleTournamentSelect(Ljava/lang/String;)V", 0);
                bVarI.r(objY4);
            }
            Function1 function4 = (Function1) ((chp) objY4);
            boolean zA3 = bVarI.A(dgb0Var);
            Object objY5 = bVarI.y();
            if (zA3 || objY5 == c0042a) {
                c cVar = new c(1, dgb0Var, dgb0.class, "isTournamentFavorited", "isTournamentFavorited(Ljava/lang/String;)Ljava/lang/Boolean;", 0);
                bVarI.r(cVar);
                objY5 = cVar;
            }
            Function1 function5 = (Function1) ((chp) objY5);
            boolean zA4 = bVarI.A(dgb0Var);
            Object objY6 = bVarI.y();
            if (zA4 || objY6 == c0042a) {
                d dVar = new d(1, dgb0Var, dgb0.class, "toggleTournamentFavorite", "toggleTournamentFavorite(Lcom/sporty/android/book/domain/entity/Tournament;)V", 0);
                bVarI.r(dVar);
                objY6 = dVar;
            }
            b(list, topCategory, categories2, list2, str, function1, function2, function3, function4, function5, (Function1) ((chp) objY6), bVarI, Category.$stable << 3);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new xbg0();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    public static final void b(final List list, final Category category, final List list2, final List list3, final String str, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function1 function5, final Function1 function6, androidx.compose.runtime.a aVar, final int i) {
        Function1 function7;
        Function1 function8;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        list.getClass();
        str.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1302622095);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? bVarI.M(list) : bVarI.A(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(category) : bVarI.A(category) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(list2) : bVarI.A(list2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(list3) : bVarI.A(list3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(function3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            function7 = function4;
            i2 |= bVarI.A(function7) ? 67108864 : 33554432;
        } else {
            function7 = function4;
        }
        if ((805306368 & i) == 0) {
            function8 = function5;
            i2 |= bVarI.A(function8) ? 536870912 : 268435456;
        } else {
            function8 = function5;
        }
        int i3 = bVarI.A(function6) ? 4 : 2;
        if (bVarI.q(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            int iHashCode = str.hashCode();
            n54.a aVar2 = ht.a.m;
            kw0.k kVar = kw0.c;
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            int i4 = i2;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            switch (iHashCode) {
                case -1802651299:
                    z = false;
                    if (!str.equals("my_favourites")) {
                        bVarI.N(1388627059);
                        bVarI.X(z);
                        Unit unit = Unit.a;
                    } else {
                        bVarI.N(1385928292);
                        Iterator it = list.iterator();
                        int eventSize = 0;
                        while (it.hasNext()) {
                            eventSize += ((Tournament) it.next()).getEventSize();
                        }
                        Category category2 = new Category(Category.FAVOURITES_ID, "My Favourites", eventSize, list);
                        int i5 = i4 >> 9;
                        mt6.a(category2, true, true, null, function3, function4, function5, function6, bVarI, Category.$stable | 432 | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | ((i3 << 21) & 29360128), 8);
                        bVarI.X(false);
                        Unit unit2 = Unit.a;
                    }
                    break;
                case -788842694:
                    if (!str.equals("top_leagues")) {
                        z = false;
                        bVarI.N(1388627059);
                        bVarI.X(z);
                        Unit unit3 = Unit.a;
                    } else {
                        bVarI.N(1984392913);
                        if (category == null) {
                            bVarI.N(1386638160);
                            bVarI.X(false);
                            z2 = false;
                        } else {
                            bVarI.N(1386638161);
                            int i6 = i4 >> 9;
                            z2 = false;
                            mt6.a(category, true, true, null, function3, function4, function5, function6, bVarI, Category.$stable | 432 | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | ((i3 << 21) & 29360128), 8);
                            Unit unit4 = Unit.a;
                            bVarI.X(false);
                        }
                        bVarI.X(z2);
                        Unit unit5 = Unit.a;
                    }
                    break;
                case 96284:
                    if (!str.equals("a_z")) {
                        z = false;
                        bVarI.N(1388627059);
                        bVarI.X(z);
                        Unit unit6 = Unit.a;
                    } else {
                        bVarI.N(1984434890);
                        if (list3 == null) {
                            bVarI.N(1387939447);
                            z3 = false;
                            bVarI.X(false);
                        } else {
                            bVarI.N(1387939448);
                            i78 i78VarA = g78.a(kVar, aVar2, bVarI, 0);
                            int iHashCode2 = Long.hashCode(bVarI.T);
                            ne00 ne00VarS = bVarI.S();
                            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, aVar3);
                            yka.k.getClass();
                            tsr.a aVar4 = yka.a.b;
                            bVarI.D();
                            if (bVarI.S) {
                                bVarI.F(aVar4);
                            } else {
                                bVarI.p();
                            }
                            hlh0.a(bVarI, i78VarA, yka.a.f);
                            hlh0.a(bVarI, ne00VarS, yka.a.e);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                            }
                            hlh0.a(bVarI, dVarC, yka.a.d);
                            bVarI.N(1651653964);
                            ArrayList arrayList = new ArrayList(l48.r(list3, 10));
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                final Category category3 = (Category) it2.next();
                                boolean zBooleanValue = ((Boolean) function1.invoke(category3.getId())).booleanValue();
                                boolean zA = ((i4 & 3670016) == 1048576) | bVarI.A(category3);
                                Object objY = bVarI.y();
                                if (zA || objY == c0042a) {
                                    objY = new Function0() { // from class: zbg0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(category3.getId());
                                            return Unit.a;
                                        }
                                    };
                                    bVarI.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                int i7 = i4 >> 9;
                                mt6.a(category3, zBooleanValue, false, function0, function3, function4, function5, function6, bVarI, Category.$stable | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | ((i3 << 21) & 29360128), 4);
                                arrayList.add(Unit.a);
                            }
                            z3 = false;
                            bVarI.X(false);
                            bVarI.X(true);
                            Unit unit7 = Unit.a;
                            bVarI.X(false);
                        }
                        bVarI.X(z3);
                        Unit unit8 = Unit.a;
                    }
                    break;
                case 1916439758:
                    if (!str.equals(Chyeyik.KtZsKVqp)) {
                        z = false;
                        bVarI.N(1388627059);
                        bVarI.X(z);
                        Unit unit9 = Unit.a;
                    } else {
                        bVarI.N(1984410346);
                        if (list2 == null) {
                            bVarI.N(1387178583);
                            z4 = false;
                            bVarI.X(false);
                        } else {
                            bVarI.N(1387178584);
                            i78 i78VarA2 = g78.a(kVar, aVar2, bVarI, 0);
                            int iHashCode3 = Long.hashCode(bVarI.T);
                            ne00 ne00VarS2 = bVarI.S();
                            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, aVar3);
                            yka.k.getClass();
                            tsr.a aVar5 = yka.a.b;
                            bVarI.D();
                            if (bVarI.S) {
                                bVarI.F(aVar5);
                            } else {
                                bVarI.p();
                            }
                            hlh0.a(bVarI, i78VarA2, yka.a.f);
                            hlh0.a(bVarI, ne00VarS2, yka.a.e);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                            }
                            hlh0.a(bVarI, dVarC2, yka.a.d);
                            bVarI.N(-1307939603);
                            ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                final Category category4 = (Category) it3.next();
                                boolean zBooleanValue2 = ((Boolean) function1.invoke(category4.getId())).booleanValue();
                                boolean zA2 = ((i4 & 3670016) == 1048576) | bVarI.A(category4);
                                Object objY2 = bVarI.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new Function0() { // from class: ybg0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(category4.getId());
                                            return Unit.a;
                                        }
                                    };
                                    bVarI.r(objY2);
                                }
                                Function0 function9 = (Function0) objY2;
                                int i8 = i4 >> 9;
                                mt6.a(category4, zBooleanValue2, false, function9, function3, function7, function8, function6, bVarI, Category.$stable | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | ((i3 << 21) & 29360128), 4);
                                arrayList2.add(Unit.a);
                                function7 = function4;
                                function8 = function5;
                            }
                            z4 = false;
                            bVarI.X(false);
                            bVarI.X(true);
                            Unit unit10 = Unit.a;
                            bVarI.X(false);
                        }
                        bVarI.X(z4);
                        Unit unit11 = Unit.a;
                    }
                    break;
                default:
                    z = false;
                    bVarI.N(1388627059);
                    bVarI.X(z);
                    Unit unit12 = Unit.a;
                    break;
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: acg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bcg0.b(list, category, list2, list3, str, function1, function2, function3, function4, function5, function6, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
