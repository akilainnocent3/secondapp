package defpackage;

import androidx.media3.ui.a;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class csa0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        a.b bVar = (a.b) obj;
        a.b bVar2 = (a.b) obj2;
        int iCompare = Integer.compare(bVar2.b, bVar.b);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = bVar.c.compareTo(bVar2.c);
        return iCompareTo != 0 ? iCompareTo : bVar.d.compareTo(bVar2.d);
    }
}
