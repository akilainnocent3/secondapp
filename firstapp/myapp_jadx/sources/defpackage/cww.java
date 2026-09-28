package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.FavoriteSport;
import com.sporty.android.core.model.patron.FavoriteSummary;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import com.sportybet.plugin.realsports.data.MyFavoriteSport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public class cww extends iww {
    public final ayw f;
    public final jlv i;
    public final bww v;
    public final mo0 w;
    public final h1x y;

    /* JADX WARN: Type inference failed for: r3v3, types: [bww, lfy] */
    public cww(vxw vxwVar, ayw aywVar) {
        super(vxwVar);
        new LinkedHashMap();
        this.w = l840.a();
        this.y = new h1x();
        this.f = aywVar;
        jlv jlvVarB = fks.b(aywVar.b(), this.e.b(), new Function2() { // from class: aww
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                hqc hqcVar = (hqc) obj;
                hqc hqcVar2 = (hqc) obj2;
                h1x h1xVar = this.a.y;
                if ((hqcVar instanceof lqc) || (hqcVar2 instanceof lqc)) {
                    return new lqc();
                }
                if (!(hqcVar instanceof nqc) || !(hqcVar2 instanceof nqc)) {
                    return new kqc();
                }
                List<MyFavoriteSport> list = (List) ((nqc) hqcVar).a;
                Iterator<FavoriteSport> it = ((FavoriteSummary) ((nqc) hqcVar2).a).getSportRefMapping().values().iterator();
                while (it.hasNext()) {
                    h1xVar.a.add(it.next().id);
                }
                ArrayList arrayList = new ArrayList();
                for (MyFavoriteSport myFavoriteSport : list) {
                    boolean zContains = h1xVar.a.contains(myFavoriteSport.id);
                    myFavoriteSport.selected = zContains;
                    MyFavoriteTypeEnum myFavoriteTypeEnum = MyFavoriteTypeEnum.SPORT;
                    String str = myFavoriteSport.id;
                    String str2 = myFavoriteSport.name;
                    String str3 = myFavoriteSport.iconUrl;
                    rww rwwVar = new rww();
                    rwwVar.a = myFavoriteTypeEnum;
                    rwwVar.b = str;
                    rwwVar.c = zContains;
                    rwwVar.d = str2;
                    rwwVar.f = str3;
                    rwwVar.g = null;
                    rwwVar.h = true;
                    arrayList.add(rwwVar);
                }
                h1xVar.b = arrayList;
                return new nqc(h1xVar);
            }
        });
        this.i = jlvVarB;
        ?? r3 = new lfy() { // from class: bww
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                this.a.a.m((hqc) obj);
            }
        };
        this.v = r3;
        jlvVarB.g(r3);
    }

    @Override // defpackage.iww
    public final su5<BaseResponse> A1() {
        return this.w.h(new ArrayList(this.y.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iww
    public final void B1(pvw pvwVar) {
        int i = pvwVar.b;
        T t = pvwVar.a;
        ssw<hqc> sswVar = this.a;
        h1x h1xVar = this.y;
        if (i != 1) {
            if (i == 2) {
                h1xVar.a.add(((ovw) t).b.b);
                sswVar.m(new nqc(h1xVar));
                return;
            } else {
                if (i == 3) {
                    h1xVar.a.remove(((ovw) t).b.b);
                    sswVar.m(new nqc(h1xVar));
                    return;
                }
                return;
            }
        }
        h1xVar.a.clear();
        ArrayList arrayList = h1xVar.b;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                rww rwwVar = (rww) obj;
                rwwVar.c = h1xVar.a.contains(rwwVar.b);
            }
        }
        sswVar.m(new nqc(h1xVar));
    }

    @Override // defpackage.iww
    public final void y1() {
        this.i.k(this.v);
    }

    @Override // defpackage.iww
    public final void z1() {
        this.e.get();
        this.f.getAll();
    }
}
