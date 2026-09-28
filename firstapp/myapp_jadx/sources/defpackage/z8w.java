package defpackage;

import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface z8w {
    default int a(nzo nzoVar, List<? extends List<? extends mzo>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ndd((mzo) list2.get(i3), ozo.b, szo.a));
            }
            arrayList2.add(arrayList3);
        }
        return c(new h(nzoVar, nzoVar.getLayoutDirection()), arrayList2, oxa.b(0, 0, i, 7)).c();
    }

    biv c(t tVar, List<? extends List<? extends vhv>> list, long j);

    default int e(nzo nzoVar, List<? extends List<? extends mzo>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ndd((mzo) list2.get(i3), ozo.a, szo.a));
            }
            arrayList2.add(arrayList3);
        }
        return c(new h(nzoVar, nzoVar.getLayoutDirection()), arrayList2, oxa.b(0, 0, i, 7)).c();
    }

    default int g(nzo nzoVar, List<? extends List<? extends mzo>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ndd((mzo) list2.get(i3), ozo.b, szo.b));
            }
            arrayList2.add(arrayList3);
        }
        return c(new h(nzoVar, nzoVar.getLayoutDirection()), arrayList2, oxa.b(0, i, 0, 13)).b();
    }

    default int i(nzo nzoVar, List<? extends List<? extends mzo>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ndd((mzo) list2.get(i3), ozo.a, szo.b));
            }
            arrayList2.add(arrayList3);
        }
        return c(new h(nzoVar, nzoVar.getLayoutDirection()), arrayList2, oxa.b(0, i, 0, 13)).b();
    }
}
