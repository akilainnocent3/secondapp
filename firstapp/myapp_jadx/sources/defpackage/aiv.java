package defpackage;

import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.t;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface aiv {
    default int a(nzo nzoVar, List<? extends mzo> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ndd(list.get(i2), ozo.b, szo.a));
        }
        return c(new h(nzoVar, nzoVar.getLayoutDirection()), arrayList, oxa.b(0, 0, i, 7)).c();
    }

    biv c(t tVar, List<? extends vhv> list, long j);

    default int e(nzo nzoVar, List<? extends mzo> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ndd(list.get(i2), ozo.a, szo.a));
        }
        return c(new h(nzoVar, nzoVar.getLayoutDirection()), arrayList, oxa.b(0, 0, i, 7)).c();
    }

    default int g(nzo nzoVar, List<? extends mzo> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ndd(list.get(i2), ozo.b, szo.b));
        }
        return c(new h(nzoVar, nzoVar.getLayoutDirection()), arrayList, oxa.b(0, i, 0, 13)).b();
    }

    default int i(nzo nzoVar, List<? extends mzo> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ndd(list.get(i2), ozo.a, szo.b));
        }
        return c(new h(nzoVar, nzoVar.getLayoutDirection()), arrayList, oxa.b(0, i, 0, 13)).b();
    }
}
