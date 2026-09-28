package defpackage;

import android.text.TextUtils;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.realsports.data.MyFavoriteTeam;
import com.sportybet.plugin.realsports.data.MySelectedTeam;
import com.sportybet.plugin.realsports.data.PostSearchTeam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class xvw extends iww {
    public final azw f;
    public final jlv i;
    public final wvw v;
    public final f0x w;

    /* JADX WARN: Type inference failed for: r0v3, types: [lfy, wvw] */
    public xvw(vxw vxwVar) {
        super(vxwVar);
        ssw<hqc> sswVar = new ssw<>();
        this.w = new f0x();
        azw azwVar = new azw();
        azwVar.a = sswVar;
        this.f = azwVar;
        jlv jlvVarC = tsg0.c(sswVar, new Function1() { // from class: vvw
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                hqc hqcVar = (hqc) obj;
                xvw xvwVar = this.a;
                f0x f0xVar = xvwVar.w;
                if (hqcVar instanceof lqc) {
                    return new ssw(new lqc());
                }
                if (!(hqcVar instanceof nqc)) {
                    return new ssw(new kqc());
                }
                List<MyFavoriteTeam> list = (List) ((nqc) hqcVar).a;
                ArrayList arrayList = new ArrayList();
                for (MyFavoriteTeam myFavoriteTeam : list) {
                    MyFavoriteTypeEnum myFavoriteTypeEnum = MyFavoriteTypeEnum.SEARCH_TEAM;
                    String str = myFavoriteTeam.competitorId;
                    String str2 = myFavoriteTeam.tournamentId;
                    arrayList.add(new rww(myFavoriteTypeEnum, myFavoriteTeam, str, xvwVar.E1(str2, str2), myFavoriteTeam.competitorName, myFavoriteTeam.iconUrl));
                }
                f0xVar.a = arrayList;
                f0xVar.c = xvwVar.D1();
                return new ssw(new nqc(f0xVar));
            }
        });
        this.i = jlvVarC;
        ?? r0 = new lfy() { // from class: wvw
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                this.a.a.m((hqc) obj);
            }
        };
        this.v = r0;
        jlvVarC.g(r0);
    }

    @Override // defpackage.iww
    public final su5<BaseResponse> A1() {
        ArrayList arrayList = new ArrayList(this.w.b.values());
        mo0 mo0VarA = l840.a();
        try {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                MySelectedTeam mySelectedTeam = (MySelectedTeam) obj;
                if (TextUtils.equals(mySelectedTeam.tournamentId, "noSpecificLeague")) {
                    mySelectedTeam.tournamentId = null;
                }
                if (mySelectedTeam.competitorIds.size() > 0) {
                    arrayList2.add(mySelectedTeam);
                }
            }
            arrayList = arrayList2;
        } catch (Exception unused) {
        }
        return mo0VarA.f(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iww
    public final void B1(pvw pvwVar) {
        int i = pvwVar.b;
        T t = pvwVar.a;
        ssw<hqc> sswVar = this.a;
        f0x f0xVar = this.w;
        if (i != 2 && i != 3) {
            if (i == 4) {
                PostSearchTeam postSearchTeam = new PostSearchTeam();
                postSearchTeam.searchTerm = (String) t;
                azw azwVar = this.f;
                azwVar.a.m(new lqc());
                ap0.b().j(postSearchTeam).G(new zyw(azwVar));
                return;
            }
            if (i == 1) {
                LinkedHashMap linkedHashMap = f0xVar.b;
                if (linkedHashMap != null) {
                    linkedHashMap.clear();
                }
                ArrayList arrayList = f0xVar.a;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        rww rwwVar = (rww) obj;
                        MyFavoriteTeam myFavoriteTeam = (MyFavoriteTeam) rwwVar.i;
                        rwwVar.c = E1(myFavoriteTeam.tournamentId, myFavoriteTeam.competitorId);
                    }
                }
                f0xVar.c = D1();
                sswVar.m(new nqc(f0xVar));
                return;
            }
            return;
        }
        rww rwwVar2 = (rww) t;
        MyFavoriteTeam myFavoriteTeam2 = (MyFavoriteTeam) rwwVar2.i;
        if (rwwVar2.c) {
            if (TextUtils.isEmpty(myFavoriteTeam2.tournamentId)) {
                myFavoriteTeam2.tournamentId = "noSpecificLeague";
            }
            LinkedHashMap linkedHashMap2 = f0xVar.b;
            if (linkedHashMap2.get(myFavoriteTeam2.tournamentId) == null) {
                ArrayList arrayList2 = new ArrayList();
                MySelectedTeam mySelectedTeam = new MySelectedTeam();
                arrayList2.add(myFavoriteTeam2.competitorId);
                String str = myFavoriteTeam2.tournamentId;
                mySelectedTeam.tournamentId = str;
                mySelectedTeam.competitorIds = arrayList2;
                linkedHashMap2.put(str, mySelectedTeam);
            } else {
                ((MySelectedTeam) linkedHashMap2.get(myFavoriteTeam2.tournamentId)).competitorIds.add(myFavoriteTeam2.competitorId);
                String str2 = myFavoriteTeam2.tournamentId;
                linkedHashMap2.put(str2, (MySelectedTeam) linkedHashMap2.get(str2));
            }
        } else {
            if (TextUtils.isEmpty(myFavoriteTeam2.tournamentId)) {
                myFavoriteTeam2.tournamentId = "noSpecificLeague";
            }
            Iterator<String> it = ((MySelectedTeam) f0xVar.b.get(myFavoriteTeam2.tournamentId)).competitorIds.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next(), rwwVar2.b)) {
                    it.remove();
                }
            }
        }
        f0xVar.c = D1();
        sswVar.m(new nqc(f0xVar));
    }

    public final int D1() {
        f0x f0xVar = this.w;
        int size = 0;
        try {
            Iterator it = f0xVar.b.keySet().iterator();
            while (it.hasNext()) {
                size += ((MySelectedTeam) f0xVar.b.get((String) it.next())).competitorIds.size();
            }
        } catch (Exception unused) {
        }
        return size;
    }

    public final boolean E1(String str, String str2) {
        MySelectedTeam mySelectedTeam;
        LinkedHashMap linkedHashMap = this.w.b;
        if (linkedHashMap == null || (mySelectedTeam = (MySelectedTeam) linkedHashMap.get(str)) == null) {
            return false;
        }
        Iterator<String> it = mySelectedTeam.competitorIds.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str2, it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.iww
    public final void y1() {
        this.i.k(this.v);
    }
}
