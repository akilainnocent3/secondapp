package com.sporty.android.book.domain.entity;

import defpackage.kpu;
import defpackage.l48;
import defpackage.m2g;
import defpackage.p48;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'BW\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000J8\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0002J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003Ja\u0010!\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0001J\u0014\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0004HÖ\u0081\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rÊ\u0001\f\b)\u0012\b\b*\u0012\u0004\b\u0003\u0010\u0002¨\u0006("}, d2 = {"Lcom/sporty/android/book/domain/entity/SportsMenuData;", "", "sportMap", "", "", "Lcom/sporty/android/book/domain/entity/Sport;", "topSportsMap", "popularSportsMap", "eventCountMap", "Lcom/sporty/android/book/domain/entity/SportEventCount;", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getSportMap", "()Ljava/util/Map;", "getTopSportsMap", "getPopularSportsMap", "getEventCountMap", "findCategory", "Lcom/sporty/android/book/domain/entity/Category;", "sportId", "categoryId", "findTournament", "Lcom/sporty/android/book/domain/entity/Tournament;", "tournamentId", "hasEvent", "", "hasEventCount", "updateEventSizes", "newData", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportsMenuData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, SportEventCount> eventCountMap;
    private final Map<String, Sport> popularSportsMap;
    private final Map<String, Sport> sportMap;
    private final Map<String, Sport> topSportsMap;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/book/domain/entity/SportsMenuData$Companion;", "", "<init>", "()V", "mock", "Lcom/sporty/android/book/domain/entity/SportsMenuData;", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SportsMenuData mock() {
            Sport.Companion companion = Sport.INSTANCE;
            Map mapF = kpu.f(new Pair("1", companion.mock("1")), new Pair("2", companion.mock("2")), new Pair("3", companion.mock("3")));
            Map mapF2 = kpu.f(new Pair("1", companion.mock("1")), new Pair("2", companion.mock("2")));
            Map mapF3 = kpu.f(new Pair("1", companion.mock("1")), new Pair("2", companion.mock("2")));
            SportEventCount.Companion companion2 = SportEventCount.INSTANCE;
            return new SportsMenuData(mapF, mapF2, mapF3, kpu.f(new Pair("1", companion2.mock("1")), new Pair("2", companion2.mock("2")), new Pair("3", companion2.mock("3"))));
        }

        private Companion() {
        }
    }

    public SportsMenuData(Map<String, Sport> map, Map<String, Sport> map2, Map<String, Sport> map3, Map<String, SportEventCount> map4) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        this.sportMap = map;
        this.topSportsMap = map2;
        this.popularSportsMap = map3;
        this.eventCountMap = map4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportsMenuData copy$default(SportsMenuData sportsMenuData, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 1) != 0) {
            map = sportsMenuData.sportMap;
        }
        if ((i & 2) != 0) {
            map2 = sportsMenuData.topSportsMap;
        }
        if ((i & 4) != 0) {
            map3 = sportsMenuData.popularSportsMap;
        }
        if ((i & 8) != 0) {
            map4 = sportsMenuData.eventCountMap;
        }
        return sportsMenuData.copy(map, map2, map3, map4);
    }

    private final Map<String, Sport> updateEventSizes(Map<String, Sport> map, Map<String, Sport> map2) {
        Category category;
        Tournament tournament;
        List<Tournament> tournaments;
        Object next;
        List<Category> categories;
        Object next2;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Sport> entry : map.entrySet()) {
            String key = entry.getKey();
            Sport value = entry.getValue();
            Sport sport = map2.get(entry.getKey());
            int eventSize = sport != null ? sport.getEventSize() : 0;
            List<Category> categories2 = entry.getValue().getCategories();
            int i = 10;
            ArrayList arrayList2 = new ArrayList(l48.r(categories2, 10));
            for (Category category2 : categories2) {
                Sport sport2 = map2.get(entry.getKey());
                if (sport2 == null || (categories = sport2.getCategories()) == null) {
                    category = null;
                } else {
                    Iterator<T> it = categories.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!Intrinsics.g(((Category) next2).getId(), category2.getId()));
                    category = (Category) next2;
                }
                int eventSize2 = category != null ? category.getEventSize() : 0;
                List<Tournament> tournaments2 = category2.getTournaments();
                ArrayList arrayList3 = new ArrayList(l48.r(tournaments2, i));
                for (Tournament tournament2 : tournaments2) {
                    if (category == null || (tournaments = category.getTournaments()) == null) {
                        tournament = null;
                    } else {
                        Iterator<T> it2 = tournaments.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!Intrinsics.g(((Tournament) next).getId(), tournament2.getId()));
                        tournament = (Tournament) next;
                    }
                    arrayList3.add(Tournament.copy$default(tournament2, null, null, tournament != null ? tournament.getEventSize() : 0, 3, null));
                }
                arrayList2.add(Category.copy$default(category2, null, null, eventSize2, arrayList3, 3, null));
                map2 = map2;
                i = 10;
            }
            arrayList.add(new Pair(key, Sport.copy$default(value, null, null, eventSize, arrayList2, 3, null)));
        }
        return kpu.k(arrayList);
    }

    public final Map<String, Sport> component1() {
        return this.sportMap;
    }

    public final Map<String, Sport> component2() {
        return this.topSportsMap;
    }

    public final Map<String, Sport> component3() {
        return this.popularSportsMap;
    }

    public final Map<String, SportEventCount> component4() {
        return this.eventCountMap;
    }

    public final SportsMenuData copy(Map<String, Sport> sportMap, Map<String, Sport> topSportsMap, Map<String, Sport> popularSportsMap, Map<String, SportEventCount> eventCountMap) {
        sportMap.getClass();
        topSportsMap.getClass();
        popularSportsMap.getClass();
        eventCountMap.getClass();
        return new SportsMenuData(sportMap, topSportsMap, popularSportsMap, eventCountMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsMenuData)) {
            return false;
        }
        SportsMenuData sportsMenuData = (SportsMenuData) other;
        return Intrinsics.g(this.sportMap, sportsMenuData.sportMap) && Intrinsics.g(this.topSportsMap, sportsMenuData.topSportsMap) && Intrinsics.g(this.popularSportsMap, sportsMenuData.popularSportsMap) && Intrinsics.g(this.eventCountMap, sportsMenuData.eventCountMap);
    }

    public final Category findCategory(String sportId, String categoryId) {
        sportId.getClass();
        categoryId.getClass();
        Sport sport = this.sportMap.get(sportId);
        Object obj = null;
        List<Category> categories = sport != null ? sport.getCategories() : null;
        if (categories == null) {
            categories = m2g.a;
        }
        Sport sport2 = this.topSportsMap.get(sportId);
        List<Category> categories2 = sport2 != null ? sport2.getCategories() : null;
        if (categories2 == null) {
            categories2 = m2g.a;
        }
        ArrayList arrayListI0 = CollectionsKt.i0(categories2, categories);
        int size = arrayListI0.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayListI0.get(i);
            i++;
            if (Intrinsics.g(((Category) obj2).getId(), categoryId)) {
                obj = obj2;
                break;
            }
        }
        return (Category) obj;
    }

    public final Tournament findTournament(String sportId, String tournamentId) {
        sportId.getClass();
        tournamentId.getClass();
        Sport sport = this.sportMap.get(sportId);
        Object obj = null;
        List<Category> categories = sport != null ? sport.getCategories() : null;
        if (categories == null) {
            categories = m2g.a;
        }
        Sport sport2 = this.topSportsMap.get(sportId);
        List<Category> categories2 = sport2 != null ? sport2.getCategories() : null;
        if (categories2 == null) {
            categories2 = m2g.a;
        }
        ArrayList arrayListI0 = CollectionsKt.i0(categories2, categories);
        ArrayList arrayList = new ArrayList();
        int size = arrayListI0.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayListI0.get(i2);
            i2++;
            p48.w(((Category) obj2).getTournaments(), arrayList);
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj3 = arrayList.get(i);
            i++;
            if (Intrinsics.g(((Tournament) obj3).getId(), tournamentId)) {
                obj = obj3;
                break;
            }
        }
        return (Tournament) obj;
    }

    public final Map<String, SportEventCount> getEventCountMap() {
        return this.eventCountMap;
    }

    public final Map<String, Sport> getPopularSportsMap() {
        return this.popularSportsMap;
    }

    public final Map<String, Sport> getSportMap() {
        return this.sportMap;
    }

    public final Map<String, Sport> getTopSportsMap() {
        return this.topSportsMap;
    }

    public final boolean hasEvent(String sportId) {
        List<Category> categories;
        sportId.getClass();
        Sport sport = this.sportMap.get(sportId);
        return (sport == null || (categories = sport.getCategories()) == null || !(categories.isEmpty() ^ true)) ? false : true;
    }

    public final boolean hasEventCount(String sportId) {
        sportId.getClass();
        SportEventCount sportEventCount = this.eventCountMap.get(sportId);
        if (sportEventCount != null) {
            return sportEventCount.getAllEventSize() > 0 || sportEventCount.getTodayEventSize() > 0 || sportEventCount.getOutrightEventSize() > 0 || sportEventCount.getLiveEventSize() > 0;
        }
        return false;
    }

    public int hashCode() {
        return this.eventCountMap.hashCode() + ((this.popularSportsMap.hashCode() + ((this.topSportsMap.hashCode() + (this.sportMap.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "SportsMenuData(sportMap=" + this.sportMap + ", topSportsMap=" + this.topSportsMap + ", popularSportsMap=" + this.popularSportsMap + ", eventCountMap=" + this.eventCountMap + ")";
    }

    public final SportsMenuData updateEventSizes(SportsMenuData newData) {
        newData.getClass();
        return copy$default(this, updateEventSizes(this.sportMap, newData.sportMap), updateEventSizes(this.topSportsMap, newData.topSportsMap), updateEventSizes(this.popularSportsMap, newData.popularSportsMap), null, 8, null);
    }
}
