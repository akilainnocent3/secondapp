package defpackage;

import com.sportybet.plugin.realsports.data.Market;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fjs implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Market market = (Market) obj;
        Market market2 = (Market) obj2;
        if (market == null || market2 == null) {
            return 0;
        }
        String singleSpecifier = market.getSingleSpecifier();
        String singleSpecifier2 = market2.getSingleSpecifier();
        if (singleSpecifier == null || singleSpecifier2 == null) {
            return 0;
        }
        try {
            return Float.compare(Float.parseFloat(singleSpecifier), Float.parseFloat(singleSpecifier2));
        } catch (Exception unused) {
            return singleSpecifier.compareTo(singleSpecifier2);
        }
    }
}
