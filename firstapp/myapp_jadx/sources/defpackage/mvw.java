package defpackage;

import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class mvw implements lfy<hqc> {
    public final /* synthetic */ nvw a;

    public mvw(nvw nvwVar) {
        this.a = nvwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lfy
    public final void u1(hqc hqcVar) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        hqc hqcVar2 = hqcVar;
        boolean z = hqcVar2 instanceof nqc;
        nvw nvwVar = this.a;
        if (!z) {
            if (hqcVar2 instanceof kqc) {
                nvwVar.n0();
                return;
            } else {
                if (hqcVar2 instanceof jqc) {
                    nvwVar.n0();
                    return;
                }
                return;
            }
        }
        MyFavoriteTypeEnum myFavoriteTypeEnum = nvwVar.y;
        ArrayList<rww> arrayList2 = nvwVar.A;
        int i = 0;
        if (myFavoriteTypeEnum == MyFavoriteTypeEnum.SPORT) {
            arrayList2.clear();
            h1x h1xVar = (h1x) ((nqc) hqcVar2).a;
            ArrayList arrayList3 = h1xVar.b;
            int size = arrayList3.size();
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                ((rww) obj).g = nvwVar;
            }
            arrayList2.addAll(h1xVar.b);
            nvwVar.z.setList(arrayList2);
            return;
        }
        if (myFavoriteTypeEnum != MyFavoriteTypeEnum.LEAGUE) {
            if (myFavoriteTypeEnum == MyFavoriteTypeEnum.MARKET) {
                arrayList2.clear();
                pzw pzwVar = (pzw) ((nqc) hqcVar2).a;
                if (pzwVar != null && (arrayList = pzwVar.b) != null) {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        ((rww) obj2).g = nvwVar;
                    }
                    arrayList2.addAll(pzwVar.b);
                }
                nvwVar.z.setList(arrayList2);
                return;
            }
            return;
        }
        ozw ozwVar = (ozw) ((nqc) hqcVar2).a;
        if (ozwVar == null || (linkedHashMap = ozwVar.c) == null || linkedHashMap.get(nvwVar.B) == null) {
            return;
        }
        arrayList2.clear();
        Iterator it = ((List) linkedHashMap.get(nvwVar.B)).iterator();
        while (it.hasNext()) {
            ((rww) it.next()).g = nvwVar;
        }
        arrayList2.addAll((Collection) linkedHashMap.get(nvwVar.B));
        nvwVar.z.setList(nvw.m0(nvwVar.E, arrayList2));
        if (nvwVar.z.getData().isEmpty()) {
            nvwVar.n0();
        }
    }
}
