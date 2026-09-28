package defpackage;

import com.sportygames.crash.remote.models.DetailResponse;
import com.sportygames.crash.remote.models.DetailResponseData;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v580 {

    public enum a {
        OverUnder("OVER_UNDER"),
        Range("RANGE");

        public final String a;

        a(String str) {
            this.a = str;
        }
    }

    public static DetailResponse a(DetailResponseData detailResponseData, a aVar, boolean z) {
        List<DetailResponse> gameDetails;
        if (detailResponseData == null || (gameDetails = detailResponseData.getGameDetails()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : gameDetails) {
            if (Intrinsics.g(((DetailResponse) obj).getBetCategoryEnum(), aVar.a)) {
                arrayList.add(obj);
            }
        }
        return (DetailResponse) CollectionsKt.V(!z ? 1 : 0, arrayList);
    }
}
