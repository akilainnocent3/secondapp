package yads;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class m81 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        uf2 uf2Var = (uf2) obj;
        uf2 uf2Var2 = (uf2) obj2;
        if (kotlin.jvm.internal.m0.g(uf2Var, uf2Var2)) {
            return 0;
        }
        String str = uf2Var.f156410a.f153283d;
        String str2 = uf2Var2.f156410a.f153283d;
        if (kotlin.jvm.internal.m0.g(str, InstreamAdBreakType.PREROLL)) {
            return -1;
        }
        if (kotlin.jvm.internal.m0.g(str2, InstreamAdBreakType.PREROLL) || kotlin.jvm.internal.m0.g(str, InstreamAdBreakType.POSTROLL)) {
            return 1;
        }
        return (!kotlin.jvm.internal.m0.g(str2, InstreamAdBreakType.POSTROLL) && uf2Var.f156411b >= uf2Var2.f156411b) ? 1 : -1;
    }
}
