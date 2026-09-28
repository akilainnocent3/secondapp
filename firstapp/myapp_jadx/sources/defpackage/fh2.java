package defpackage;

import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fh2 implements ch2 {
    public final wwd0 a;

    public fh2() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.a = xwd0.a(o2gVar);
    }

    public static List c(List list, List list2) {
        if (list == null || list2 == null) {
            return m2g.a;
        }
        HashSet hashSetY0 = CollectionsKt.y0(list);
        hashSetY0.retainAll(CollectionsKt.y0(list2));
        return CollectionsKt.A0(hashSetY0);
    }

    public static boolean d(List list, List list2) {
        return list != null && list.size() == list2.size() && CollectionsKt.y0(list).equals(CollectionsKt.y0(list2));
    }

    @Override // defpackage.ch2
    public final void a(et7 et7Var, lyh lyhVar, lyh lyhVar2, uwd0 uwd0Var) {
        lyhVar.getClass();
        lyhVar2.getClass();
        uwd0Var.getClass();
        kzh.d(new g1i(r1i.a(lyhVar, lyhVar2, uwd0Var, new dh2(4, this, fh2.class, "buildOutcomeStates", "buildOutcomeStates(Lcom/sportybet/android/instantwin/newtork/model/response/BetBuilderConfig;Ljava/util/List;Lcom/sportybet/android/instantwin/newtork/model/response/BetBuilderOutcome;)Ljava/util/Map;", 4)), new eh2(this, null)), et7Var);
    }

    @Override // defpackage.ch2
    public final v340 b() {
        return e1i.b(this.a);
    }
}
