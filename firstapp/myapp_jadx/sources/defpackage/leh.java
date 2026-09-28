package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.featuredGames.model.FeaturedResponse;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class leh {
    public static final ttr<leh> d = hwr.a(a1s.a, new keh(0));
    public HTTPResponse<List<FeaturedResponse>> a;
    public Long b;
    public String c = "";

    public final boolean a(String str) {
        HTTPResponse<List<FeaturedResponse>> hTTPResponse;
        Integer bizCode;
        Long l = this.b;
        if (l != null) {
            return System.currentTimeMillis() - l.longValue() <= 600000 && this.c.equals(str) && (hTTPResponse = this.a) != null && (bizCode = hTTPResponse.getBizCode()) != null && bizCode.intValue() == 10000;
        }
        return false;
    }
}
