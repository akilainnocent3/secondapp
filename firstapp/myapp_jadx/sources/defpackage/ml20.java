package defpackage;

import com.sporty.android.book.domain.entity.Category;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Categories;
import com.sportybet.plugin.realsports.data.Tournaments;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.sportssoccer.expandview.RegionsListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.PreMatchSportActivity$collectData$1$3", f = "PreMatchSportActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ml20 extends tje0 implements Function2<lk50<? extends List<? extends Categories>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ PreMatchSportActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml20(PreMatchSportActivity preMatchSportActivity, v1b<? super ml20> v1bVar) {
        super(2, v1bVar);
        this.b = preMatchSportActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ml20 ml20Var = new ml20(this.b, v1bVar);
        ml20Var.a = obj;
        return ml20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends Categories>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((ml20) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object next2;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        PreMatchSportActivity preMatchSportActivity = this.b;
        if (z) {
            Iterator it = ((Iterable) ((lk50.c) lk50Var).a).iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.g(((Categories) next2).id, Category.FAVOURITES_ID));
            Categories categories = (Categories) next2;
            if (categories != null) {
                categories.name = preMatchSportActivity.getCMSString(R.string.common_functions__my_favourites, new Object[0]);
            }
        }
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        ymh ymhVarC1 = preMatchSportActivity.C1();
        ymhVarC1.getClass();
        mpe0 mpe0Var = ymhVarC1.f;
        lk50Var.getClass();
        boolean z2 = lk50Var instanceof lk50.c;
        if (z2) {
            ArrayList arrayList = ymhVarC1.m;
            List<Categories> list = (List) ((lk50.c) lk50Var).a;
            k48.a(arrayList, list);
            ((RegionsListView) mpe0Var.getValue()).d(list);
        } else {
            ((RegionsListView) mpe0Var.getValue()).d(m2g.a);
        }
        ArrayList<String> arrayList2 = preMatchSportActivity.S;
        if (arrayList2 != null) {
            preMatchSportActivity.C1().getClass();
            if (z2) {
                Iterator it2 = ((Iterable) ((lk50.c) lk50Var).a).iterator();
                loop1: while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    List<Tournaments> list2 = ((Categories) next).tournaments;
                    list2.getClass();
                    if (!list2.isEmpty()) {
                        Iterator<T> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (arrayList2.contains(((Tournaments) it3.next()).id)) {
                                break loop1;
                            }
                        }
                    }
                }
                Categories categories2 = (Categories) next;
                if (categories2 != null) {
                    String str = categories2.name;
                    str.getClass();
                    if (str.length() > 0) {
                        hjd0 hjd0Var = preMatchSportActivity.b;
                        if (hjd0Var == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        hjd0Var.c.a(str);
                    }
                    preMatchSportActivity.S = null;
                    Unit unit = Unit.a;
                }
            }
        }
        return Unit.a;
    }
}
