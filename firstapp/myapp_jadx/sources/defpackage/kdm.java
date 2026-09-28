package defpackage;

import com.sportybet.plugin.realsports.data.FeaturedMatch;
import com.sportybet.plugin.realsports.data.FeaturedMatchData;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kdm implements Function1 {
    public final /* synthetic */ dfm a;

    public /* synthetic */ kdm(dfm dfmVar) {
        this.a = dfmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FeaturedMatchData featuredMatchData;
        List<FeaturedMatch> featuredMatches;
        String str = (String) obj;
        List<String> list = dfm.v2;
        iim iimVar = this.a.w1;
        iimVar.getClass();
        str.getClass();
        Object value = iimVar.k0.getValue();
        Object obj2 = null;
        if (!(((lk50) value) instanceof lk50.c)) {
            value = null;
        }
        lk50 lk50Var = (lk50) value;
        if (lk50Var == null || (featuredMatchData = (FeaturedMatchData) ((lk50.c) lk50Var).a) == null || (featuredMatches = featuredMatchData.getFeaturedMatches()) == null) {
            return null;
        }
        for (Object obj3 : featuredMatches) {
            if (Intrinsics.g(((FeaturedMatch) obj3).getEvent().eventId, str)) {
                obj2 = obj3;
                break;
            }
        }
        return (FeaturedMatch) obj2;
    }
}
