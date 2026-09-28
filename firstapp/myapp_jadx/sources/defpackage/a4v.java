package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.League;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a4v extends pf implements gaj<ctg, String, v1b<? super m4v>, Object> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [m2g] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    @Override // defpackage.gaj
    public final Object invoke(ctg ctgVar, String str, v1b<? super m4v> v1bVar) {
        League league;
        League league2;
        Object next;
        ctg ctgVar2 = ctgVar;
        String str2 = str;
        ((e4v) this.a).getClass();
        ?? arrayList = 0;
        if (!(ctgVar2 instanceof ctg.a)) {
            return null;
        }
        List<League> list = ((ctg.a) ctgVar2).a.leagues;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((League) next).leagueId, str2));
            league = (League) next;
        } else {
            league = null;
        }
        if (league == null) {
            str2 = (list == null || (league2 = (League) CollectionsKt.firstOrNull(list)) == null) ? null : league2.leagueId;
            if (str2 == null) {
                str2 = "";
            }
        }
        if (list != null) {
            arrayList = new ArrayList(l48.r(list, 10));
            for (League league3 : list) {
                String str3 = league3.leagueId;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = league3.name;
                if (str4 == null) {
                    str4 = "";
                }
                arrayList.add(new m4v.a(str3, str4));
            }
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        return new m4v(a4h.b(arrayList), str2);
    }
}
