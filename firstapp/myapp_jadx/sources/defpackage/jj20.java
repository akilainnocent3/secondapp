package defpackage;

import com.sporty.android.book.domain.entity.Category;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Categories;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.SportGroup;
import com.sportybet.plugin.realsports.data.Tournaments;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getLeagueFilterOptions$2", f = "PreMatchSectionUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jj20 extends tje0 implements gaj<BaseResponse<SportGroup>, List<? extends String>, v1b<? super List<Categories>>, Object> {
    public /* synthetic */ BaseResponse a;
    public /* synthetic */ List b;

    public static final class a<T> implements Comparator {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String str = ((Tournaments) t).id;
            List list = this.a;
            return Integer.valueOf(list.indexOf(str)).compareTo(Integer.valueOf(list.indexOf(((Tournaments) t2).id)));
        }
    }

    @Override // defpackage.gaj
    public final Object invoke(BaseResponse<SportGroup> baseResponse, List<? extends String> list, v1b<? super List<Categories>> v1bVar) {
        jj20 jj20Var = new jj20(3, v1bVar);
        jj20Var.a = baseResponse;
        jj20Var.b = list;
        return jj20Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        BaseResponse baseResponse = this.a;
        List list = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        baseResponse.getClass();
        SportGroup sportGroup = (SportGroup) n52.b(baseResponse);
        ArrayList arrayList2 = new ArrayList();
        List<Sport> list2 = sportGroup.popularEvents;
        if (list2 != null) {
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                arrayList2.addAll(list2);
            }
        }
        List<Sport> list3 = sportGroup.popularCategories;
        if (list3 != null) {
            if (list3.isEmpty()) {
                list3 = null;
            }
            if (list3 != null) {
                arrayList2.addAll(list3);
            }
        }
        List<Sport> list4 = sportGroup.sportList;
        if (list4 != null) {
            List<Sport> list5 = list4.isEmpty() ? null : list4;
            if (list5 != null) {
                arrayList2.addAll(list5);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                List<Categories> list6 = ((Sport) obj2).categories;
                if (list6 != null) {
                    arrayList3.add(list6);
                }
            }
            ArrayList arrayListS = l48.s(arrayList3);
            HashSet hashSet = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            int size2 = arrayListS.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayListS.get(i2);
                i2++;
                if (hashSet.add(((Categories) obj3).id)) {
                    arrayList4.add(obj3);
                }
            }
            arrayList = new ArrayList(arrayList4);
        }
        if (!list.isEmpty()) {
            ArrayList arrayList5 = new ArrayList();
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj4 = arrayList.get(i3);
                i3++;
                List<Tournaments> list7 = ((Categories) obj4).tournaments;
                list7.getClass();
                p48.w(list7, arrayList5);
            }
            ArrayList arrayList6 = new ArrayList();
            int size4 = arrayList5.size();
            int i4 = 0;
            while (i4 < size4) {
                Object obj5 = arrayList5.get(i4);
                i4++;
                if (list.contains(((Tournaments) obj5).id)) {
                    arrayList6.add(obj5);
                }
            }
            List<Tournaments> listR0 = CollectionsKt.r0(CollectionsKt.A0(CollectionsKt.D0(arrayList6)), new a(list));
            if (!listR0.isEmpty()) {
                Categories categories = new Categories();
                categories.id = Category.FAVOURITES_ID;
                Iterator<T> it = listR0.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    i5 += ((Tournaments) it.next()).eventSize;
                }
                categories.eventSize = i5;
                categories.tournaments = listR0;
                Unit unit = Unit.a;
                arrayList.add(0, categories);
            }
        }
        return arrayList;
    }
}
