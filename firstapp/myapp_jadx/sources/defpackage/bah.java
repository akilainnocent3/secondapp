package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.model.FavoriteMarketRequest;
import com.twilio.voice.Constants;
import com.twilio.voice.VoiceURLConnection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J:\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lbah;", "", "", "sportId", "", "productId", "userId", "Lcom/sporty/android/common/network/data/BaseResponse;", "", "a", "(Ljava/lang/String;ILjava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/common/network/model/FavoriteMarketRequest;", "body", "Ljava/lang/Void;", "c", "(Lcom/sporty/android/common/network/model/FavoriteMarketRequest;Lv1b;)Ljava/lang/Object;", "b", "common-network"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface bah {
    @sbj("patron/favoriteMarkets/marketIds")
    Object a(@db30("sportId") String str, @db30("productId") int i, @db30("userId") String str2, v1b<? super BaseResponse<List<Integer>>> v1bVar);

    @fbl(hasBody = Constants.dev, method = VoiceURLConnection.METHOD_TYPE_DELETE, path = "patron/favoriteMarkets/sportMarketId")
    @gil({"Content-Type: application/json"})
    Object b(@jh4 FavoriteMarketRequest favoriteMarketRequest, v1b<? super BaseResponse<Void>> v1bVar);

    @flz("patron/favoriteMarkets/sportMarketId")
    @gil({"Content-Type: application/json"})
    Object c(@jh4 FavoriteMarketRequest favoriteMarketRequest, v1b<? super BaseResponse<Void>> v1bVar);
}
