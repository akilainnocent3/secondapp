package defpackage;

import com.sporty.android.book.domain.entity.Sport;
import com.sporty.android.book.domain.entity.SportEventCount;
import com.sporty.android.book.domain.entity.SportLists;
import com.sporty.android.book.domain.entity.SportsMenuData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.domain.usecase.GetSportsMenuDataUseCase$invoke$4", f = "SportsMenuUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dek extends tje0 implements gaj<SportLists, List<? extends SportEventCount>, v1b<? super SportsMenuData>, Object> {
    public /* synthetic */ SportLists a;
    public /* synthetic */ List b;

    @Override // defpackage.gaj
    public final Object invoke(SportLists sportLists, List<? extends SportEventCount> list, v1b<? super SportsMenuData> v1bVar) {
        dek dekVar = new dek(3, v1bVar);
        dekVar.a = sportLists;
        dekVar.b = list;
        return dekVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        SportLists sportLists = this.a;
        List<SportEventCount> list = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List<Sport> sportList = sportLists.getSportList();
        int iA = jpu.a(l48.r(sportList, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj2 : sportList) {
            linkedHashMap.put(((Sport) obj2).getId(), obj2);
        }
        List<Sport> popularEvents = sportLists.getPopularEvents();
        int iA2 = jpu.a(l48.r(popularEvents, 10));
        if (iA2 < 16) {
            iA2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2);
        for (Object obj3 : popularEvents) {
            linkedHashMap2.put(((Sport) obj3).getId(), obj3);
        }
        List<Sport> popularCategories = sportLists.getPopularCategories();
        int iA3 = jpu.a(l48.r(popularCategories, 10));
        if (iA3 < 16) {
            iA3 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA3);
        for (Object obj4 : popularCategories) {
            linkedHashMap3.put(((Sport) obj4).getId(), obj4);
        }
        int iA4 = jpu.a(l48.r(list, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iA4 >= 16 ? iA4 : 16);
        for (SportEventCount sportEventCount : list) {
            String sportId = sportEventCount.getSportId();
            Iterator<T> it = sportLists.getSportList().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((Sport) next).getId(), sportEventCount.getSportId()));
            Sport sport = (Sport) next;
            linkedHashMap4.put(sportId, SportEventCount.copy$default(sportEventCount, null, sport != null ? sport.getEventSize() : 0, 0, 0, 0, 29, null));
        }
        return new SportsMenuData(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
    }
}
