package defpackage;

import android.text.TextUtils;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.FavoriteSummary;
import com.sporty.android.core.model.patron.FavoriteTeam;
import com.sporty.android.core.model.patron.FavoriteTournament;
import com.sportybet.plugin.realsports.data.MyFavoriteTeam;
import com.sportybet.plugin.realsports.data.MySelectedTeam;
import com.sportybet.plugin.realsports.data.PostSearchTeam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class eww extends iww implements lfy<hqc> {
    public final yyw f;
    public final h2x i;
    public final jlv v;
    public final jlv w;
    public final jlv y;
    public HashMap z;

    public eww(final vxw vxwVar) {
        super(vxwVar);
        ssw<hqc> sswVar = new ssw<>();
        ssw<hqc> sswVar2 = new ssw<>();
        this.i = new h2x();
        this.z = new LinkedHashMap();
        yyw yywVar = new yyw();
        yywVar.a = sswVar;
        yywVar.b = sswVar2;
        this.f = yywVar;
        jlv jlvVarC = tsg0.c(this.e.b(), new Function1() { // from class: dww
            /* JADX WARN: Code duplicated, block: B:47:0x0110  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hqc hqcVar = (hqc) obj;
                eww ewwVar = this.a;
                h2x h2xVar = ewwVar.i;
                if (hqcVar instanceof lqc) {
                    return new ssw(new lqc());
                }
                if (!(hqcVar instanceof nqc)) {
                    return new ssw(new kqc());
                }
                HashMap<String, FavoriteTournament> tournamentRefMapping = ((FavoriteSummary) ((nqc) hqcVar).a).getTournamentRefMapping();
                ewwVar.z = tournamentRefMapping;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    if (tournamentRefMapping.size() > 0) {
                        for (Map.Entry<String, FavoriteTournament> entry : tournamentRefMapping.entrySet()) {
                            String key = entry.getKey();
                            MySelectedTeam mySelectedTeam = (MySelectedTeam) linkedHashMap.get(key);
                            FavoriteTournament value = entry.getValue();
                            if (mySelectedTeam == null) {
                                mySelectedTeam = new MySelectedTeam();
                                mySelectedTeam.tournamentId = key;
                                mySelectedTeam.competitorIds = new ArrayList();
                            }
                            List<FavoriteTeam> list = value.competitors;
                            if (list != null) {
                                Iterator<FavoriteTeam> it = list.iterator();
                                while (it.hasNext()) {
                                    mySelectedTeam.competitorIds.add(it.next().id);
                                }
                            }
                            linkedHashMap.put(key, mySelectedTeam);
                        }
                    }
                } catch (Exception unused) {
                }
                h2xVar.b = linkedHashMap;
                ewwVar.E1();
                ArrayList arrayList = new ArrayList();
                int i = 0;
                try {
                    if (ewwVar.z.size() > 0) {
                        Iterator it2 = ewwVar.z.entrySet().iterator();
                        boolean z = true;
                        while (it2.hasNext()) {
                            FavoriteTournament favoriteTournament = (FavoriteTournament) ((Map.Entry) it2.next()).getValue();
                            String str = favoriteTournament.id;
                            String str2 = favoriteTournament.tournamentName;
                            String str3 = favoriteTournament.categoryName;
                            List<FavoriteTeam> list2 = favoriteTournament.competitors;
                            int size = list2 != null ? list2.size() : 0;
                            j2x j2xVar = new j2x();
                            j2xVar.a = str;
                            j2xVar.b = str2;
                            j2xVar.c = str3;
                            j2xVar.d = size;
                            j2xVar.e = z;
                            arrayList.add(j2xVar);
                            z = false;
                        }
                    }
                } catch (Exception unused2) {
                }
                h2xVar.c = arrayList;
                if (arrayList.size() > 0) {
                    if (TextUtils.isEmpty(h2xVar.e)) {
                        h2xVar.e = ((j2x) h2xVar.c.get(0)).a;
                    } else if (vxwVar.n(h2xVar.e)) {
                        ArrayList arrayList2 = h2xVar.c;
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            j2x j2xVar2 = (j2x) obj2;
                            j2xVar2.e = TextUtils.equals(j2xVar2.a, h2xVar.e);
                        }
                    } else {
                        h2xVar.e = ((j2x) h2xVar.c.get(0)).a;
                    }
                    ewwVar.D1(h2xVar.e);
                }
                return new ssw(new nqc(h2xVar));
            }
        });
        this.v = jlvVarC;
        jlv jlvVarC2 = tsg0.c(sswVar, new yqn(this, 1));
        this.w = jlvVarC2;
        jlv jlvVarC3 = tsg0.c(sswVar2, new zqn(this, 1));
        this.y = jlvVarC3;
        jlvVarC.g(this);
        jlvVarC2.g(this);
        jlvVarC3.g(this);
    }

    @Override // defpackage.iww
    public final su5<BaseResponse> A1() {
        h2x h2xVar = this.i;
        try {
            for (String str : h2xVar.b.keySet()) {
                if (((MySelectedTeam) h2xVar.b.get(str)).competitorIds.size() == 0) {
                    h2xVar.b.remove(str);
                }
            }
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList(h2xVar.b.values());
        int size = arrayList.size();
        int size2 = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            size2 += ((MySelectedTeam) obj).competitorIds.size();
        }
        if (size2 == 0) {
            arrayList.clear();
        }
        return l840.a().f(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iww
    public final void B1(pvw pvwVar) {
        MySelectedTeam mySelectedTeam;
        int i = pvwVar.b;
        T t = pvwVar.a;
        int i2 = 0;
        h2x h2xVar = this.i;
        if (i == 6) {
            j2x j2xVar = (j2x) t;
            if (TextUtils.equals(h2xVar.e, j2xVar.a)) {
                return;
            }
            String str = j2xVar.a;
            h2xVar.e = str;
            ArrayList arrayList = h2xVar.c;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                j2x j2xVar2 = (j2x) obj;
                j2xVar2.e = TextUtils.equals(str, j2xVar2.a);
            }
            D1(j2xVar.a);
        } else {
            ssw<hqc> sswVar = this.a;
            if (i == 2 || i == 3) {
                G1((rww) t);
                String str2 = h2xVar.e;
                ArrayList arrayList2 = h2xVar.c;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    j2x j2xVar3 = (j2x) obj2;
                    if (TextUtils.equals(str2, j2xVar3.a) && (mySelectedTeam = (MySelectedTeam) h2xVar.b.get(str2)) != null) {
                        List<String> list = mySelectedTeam.competitorIds;
                        j2xVar3.d = list != null ? list.size() : 0;
                    }
                }
                sswVar.m(new nqc(h2xVar));
            } else if (i == 9 || i == 11) {
                G1((rww) t);
                ArrayList arrayList3 = h2xVar.a;
                int size3 = arrayList3.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = arrayList3.get(i4);
                    i4++;
                    rww rwwVar = (rww) obj3;
                    MyFavoriteTeam myFavoriteTeam = (MyFavoriteTeam) rwwVar.i;
                    rwwVar.c = F1(myFavoriteTeam.tournamentId, myFavoriteTeam.competitorId);
                }
                ArrayList arrayList4 = h2xVar.c;
                int size4 = arrayList4.size();
                int i5 = 0;
                while (i5 < size4) {
                    Object obj4 = arrayList4.get(i5);
                    i5++;
                    j2x j2xVar4 = (j2x) obj4;
                    MySelectedTeam mySelectedTeam2 = (MySelectedTeam) h2xVar.b.get(j2xVar4.a);
                    if (mySelectedTeam2 != null) {
                        List<String> list2 = mySelectedTeam2.competitorIds;
                        j2xVar4.d = list2 != null ? list2.size() : 0;
                    }
                }
                sswVar.m(new nqc(h2xVar));
            } else if (i == 1) {
                String str3 = h2xVar.e;
                LinkedHashMap linkedHashMap = h2xVar.b;
                if (linkedHashMap != null) {
                    linkedHashMap.remove(str3);
                }
                ArrayList arrayList5 = h2xVar.a;
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    int i6 = 0;
                    while (i6 < size5) {
                        Object obj5 = arrayList5.get(i6);
                        i6++;
                        rww rwwVar2 = (rww) obj5;
                        MyFavoriteTeam myFavoriteTeam2 = (MyFavoriteTeam) rwwVar2.i;
                        rwwVar2.c = F1(myFavoriteTeam2.tournamentId, myFavoriteTeam2.competitorId);
                    }
                }
                E1();
                String str4 = h2xVar.e;
                ArrayList arrayList6 = h2xVar.c;
                int size6 = arrayList6.size();
                int i7 = 0;
                while (i7 < size6) {
                    Object obj6 = arrayList6.get(i7);
                    i7++;
                    j2x j2xVar5 = (j2x) obj6;
                    if (TextUtils.equals(str4, j2xVar5.a)) {
                        j2xVar5.d = 0;
                    }
                }
                sswVar.m(new nqc(h2xVar));
            } else if (i == 4) {
                String str5 = (String) t;
                h2xVar.f = str5;
                PostSearchTeam postSearchTeam = new PostSearchTeam();
                postSearchTeam.searchTerm = str5;
                yyw yywVar = this.f;
                yywVar.b.m(new lqc());
                ap0.b().j(postSearchTeam).G(new xyw(yywVar));
            } else if (i == 10) {
                h2xVar.f = "";
                h2xVar.d.clear();
                sswVar.m(new nqc(h2xVar));
            } else if (i == 7) {
                D1(h2xVar.e);
            }
        }
        if (i == 8) {
            z1();
        }
    }

    public final void D1(String str) {
        yyw yywVar = this.f;
        yywVar.a.m(new lqc());
        ap0.b().W(str).G(new wyw(yywVar));
    }

    public final int E1() {
        h2x h2xVar = this.i;
        int size = 0;
        try {
            Iterator it = h2xVar.b.keySet().iterator();
            while (it.hasNext()) {
                size += ((MySelectedTeam) h2xVar.b.get((String) it.next())).competitorIds.size();
            }
        } catch (Exception unused) {
        }
        return size;
    }

    public final boolean F1(String str, String str2) {
        h2x h2xVar = this.i;
        try {
            MySelectedTeam mySelectedTeam = (MySelectedTeam) h2xVar.b.get(str);
            if (mySelectedTeam != null) {
                Iterator<String> it = mySelectedTeam.competitorIds.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(str2, it.next())) {
                        return true;
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return false;
            }
            for (MySelectedTeam mySelectedTeam2 : h2xVar.b.values()) {
                if (mySelectedTeam2 != null) {
                    Iterator<String> it2 = mySelectedTeam2.competitorIds.iterator();
                    while (it2.hasNext()) {
                        if (TextUtils.equals(str2, it2.next())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G1(rww rwwVar) {
        T t = rwwVar.i;
        String str = rwwVar.b;
        MyFavoriteTeam myFavoriteTeam = (MyFavoriteTeam) t;
        boolean z = rwwVar.c;
        h2x h2xVar = this.i;
        if (!z) {
            MySelectedTeam mySelectedTeam = (MySelectedTeam) h2xVar.b.get(myFavoriteTeam.tournamentId);
            if (mySelectedTeam != null) {
                Iterator<String> it = mySelectedTeam.competitorIds.iterator();
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next(), str)) {
                        it.remove();
                    }
                }
            }
            if (TextUtils.isEmpty(myFavoriteTeam.tournamentId)) {
                for (MySelectedTeam mySelectedTeam2 : h2xVar.b.values()) {
                    if (mySelectedTeam2 != null) {
                        Iterator<String> it2 = mySelectedTeam2.competitorIds.iterator();
                        while (it2.hasNext()) {
                            if (TextUtils.equals(it2.next(), str)) {
                                it2.remove();
                            }
                        }
                    }
                }
            }
        } else if (h2xVar.b.get(myFavoriteTeam.tournamentId) == null) {
            ArrayList arrayList = new ArrayList();
            MySelectedTeam mySelectedTeam3 = new MySelectedTeam();
            arrayList.add(myFavoriteTeam.competitorId);
            String str2 = myFavoriteTeam.tournamentId;
            mySelectedTeam3.tournamentId = str2;
            mySelectedTeam3.competitorIds = arrayList;
            h2xVar.b.put(str2, mySelectedTeam3);
        } else {
            ((MySelectedTeam) h2xVar.b.get(myFavoriteTeam.tournamentId)).competitorIds.add(myFavoriteTeam.competitorId);
            LinkedHashMap linkedHashMap = h2xVar.b;
            String str3 = myFavoriteTeam.tournamentId;
            linkedHashMap.put(str3, (MySelectedTeam) linkedHashMap.get(str3));
        }
        E1();
        h2xVar.getClass();
    }

    @Override // defpackage.lfy
    public final void u1(hqc hqcVar) {
        this.a.m(hqcVar);
    }

    @Override // defpackage.iww
    public final void y1() {
        this.v.k(this);
        this.w.k(this);
        this.y.k(this);
    }

    @Override // defpackage.iww
    public final void z1() {
        this.e.get();
    }
}
