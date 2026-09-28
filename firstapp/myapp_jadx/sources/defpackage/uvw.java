package defpackage;

import android.text.TextUtils;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.MyFavoriteMarket;
import com.sportybet.plugin.realsports.data.MySelectedMarket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class uvw extends iww implements lfy<hqc> {
    public final ayw f;
    public final oxw i;
    public final jlv v;
    public final jlv w;
    public final mo0 y;
    public final pzw z;

    public uvw(vxw vxwVar, ayw aywVar) {
        super(vxwVar);
        ssw<hqc> sswVar = new ssw<>();
        this.y = l840.a();
        this.z = new pzw();
        this.f = aywVar;
        oxw oxwVar = new oxw();
        oxwVar.a = sswVar;
        this.i = oxwVar;
        jlv jlvVarB = fks.b(aywVar.b(), this.e.b(), new tvw(this, 0));
        this.v = jlvVarB;
        jlv jlvVarC = tsg0.c(sswVar, new sv4(this, 1));
        this.w = jlvVarC;
        jlvVarB.g(this);
        jlvVarC.g(this);
    }

    @Override // defpackage.iww
    public final su5<BaseResponse> A1() {
        return this.y.c(new ArrayList(this.z.a.values()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iww
    public final void B1(pvw pvwVar) {
        List<String> list;
        int i = pvwVar.b;
        T t = pvwVar.a;
        ssw<hqc> sswVar = this.a;
        pzw pzwVar = this.z;
        if (i == 1) {
            String str = (String) t;
            if (str != null) {
                LinkedHashMap linkedHashMap = pzwVar.a;
                if (linkedHashMap != null) {
                    linkedHashMap.remove(str);
                }
                ArrayList arrayList = pzwVar.b;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        rww rwwVar = (rww) obj;
                        MyFavoriteMarket myFavoriteMarket = (MyFavoriteMarket) rwwVar.i;
                        rwwVar.c = D1(myFavoriteMarket.sportId, myFavoriteMarket.marketId);
                    }
                }
            }
            sswVar.m(new nqc(pzwVar));
            return;
        }
        if (i == 2) {
            MyFavoriteMarket myFavoriteMarket2 = (MyFavoriteMarket) ((ovw) t).b.i;
            if (pzwVar.a.get(myFavoriteMarket2.sportId) != null) {
                ((MySelectedMarket) pzwVar.a.get(myFavoriteMarket2.sportId)).marketIds.add(myFavoriteMarket2.marketId);
            } else {
                MySelectedMarket mySelectedMarket = new MySelectedMarket();
                mySelectedMarket.sportId = myFavoriteMarket2.sportId;
                ArrayList arrayList2 = new ArrayList();
                mySelectedMarket.marketIds = arrayList2;
                arrayList2.add(myFavoriteMarket2.marketId);
                pzwVar.a.put(myFavoriteMarket2.sportId, mySelectedMarket);
            }
            sswVar.m(new nqc(pzwVar));
            return;
        }
        if (i != 3) {
            if (i == 5) {
                pzwVar.getClass();
                this.i.a((String) t);
                return;
            }
            return;
        }
        MyFavoriteMarket myFavoriteMarket3 = (MyFavoriteMarket) ((ovw) t).b.i;
        MySelectedMarket mySelectedMarket2 = (MySelectedMarket) pzwVar.a.get(myFavoriteMarket3.sportId);
        if (mySelectedMarket2 != null && (list = mySelectedMarket2.marketIds) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next(), myFavoriteMarket3.marketId)) {
                    it.remove();
                }
            }
        }
        sswVar.m(new nqc(pzwVar));
    }

    public final boolean D1(String str, String str2) {
        MySelectedMarket mySelectedMarket = (MySelectedMarket) this.z.a.get(str);
        if (mySelectedMarket == null) {
            return false;
        }
        Iterator<String> it = mySelectedMarket.marketIds.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str2, it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lfy
    public final void u1(hqc hqcVar) {
        this.a.m(hqcVar);
    }

    @Override // defpackage.iww
    public final void y1() {
        this.v.k(this);
        this.w.k(this);
    }

    @Override // defpackage.iww
    public final void z1() {
        this.e.get();
        this.f.getAll();
    }
}
