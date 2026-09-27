package androidx.appcompat.app;

import android.os.LocaleList;
import java.util.LinkedHashSet;
import java.util.Locale;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(24)
public final class d0 {
    public static u1.n a(u1.n nVar, u1.n nVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < nVar.l() + nVar2.l()) {
            Locale localeD = i10 < nVar.l() ? nVar.d(i10) : nVar2.d(i10 - nVar.l());
            if (localeD != null) {
                linkedHashSet.add(localeD);
            }
            i10++;
        }
        return u1.n.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static u1.n b(LocaleList localeList, LocaleList localeList2) {
        return (localeList == null || localeList.isEmpty()) ? u1.n.g() : a(u1.n.o(localeList), u1.n.o(localeList2));
    }

    public static u1.n c(u1.n nVar, u1.n nVar2) {
        return (nVar == null || nVar.j()) ? u1.n.g() : a(nVar, nVar2);
    }
}
