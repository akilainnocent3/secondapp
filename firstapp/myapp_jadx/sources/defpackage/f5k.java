package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class f5k {
    public final jrm a;

    public f5k(jrm jrmVar) {
        jrmVar.getClass();
        this.a = jrmVar;
    }

    public final ArrayList a(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListU = this.a.U();
        int i = 0;
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayListU.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListU.get(i2);
                i2++;
                Selection selection = (Selection) obj;
                if (yay.j(selection) && !yay.i(selection)) {
                    arrayList2.add(obj);
                }
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                arrayList.add((Selection) obj2);
            }
        } else {
            if (z) {
                uhc.a();
                return null;
            }
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayListU.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayListU.get(i3);
                i3++;
                if (yay.i((Selection) obj3)) {
                    arrayList3.add(obj3);
                }
            }
            int size4 = arrayList3.size();
            while (i < size4) {
                Object obj4 = arrayList3.get(i);
                i++;
                arrayList.add((Selection) obj4);
            }
        }
        return arrayList;
    }
}
