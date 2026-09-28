package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.social.data.remote.entity.CreatorCredit;
import com.sportybet.android.social.data.remote.entity.CreatorCreditsData;
import com.sportybet.android.social.data.remote.entity.RewardData;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\bJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\bJ&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00052\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00052\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lh1c;", "", "", "pageNo", "pageSize", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/android/social/data/remote/entity/CreatorCreditsData;", "c", "(IILv1b;)Ljava/lang/Object;", "b", "d", "", "batchId", "", "Lcom/sportybet/android/social/data/remote/entity/CreatorCredit;", "e", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/social/data/remote/entity/RewardData;", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface h1c {
    @gmz("promotion/v1/loyalty/influencer/claim")
    Object a(@db30("batchId") String str, v1b<? super BaseResponse<RewardData>> v1bVar);

    @sbj("promotion/v1/loyalty/influencer/claimed")
    Object b(@db30("pageNo") int i, @db30("pageSize") int i2, v1b<? super BaseResponse<CreatorCreditsData>> v1bVar);

    @sbj("promotion/v1/loyalty/influencer/applicable")
    Object c(@db30("pageNo") int i, @db30("pageSize") int i2, v1b<? super BaseResponse<CreatorCreditsData>> v1bVar);

    @sbj("promotion/v1/loyalty/influencer/expired")
    Object d(@db30("pageNo") int i, @db30("pageSize") int i2, v1b<? super BaseResponse<CreatorCreditsData>> v1bVar);

    @sbj("promotion/v1/loyalty/influencer/claimedContent")
    Object e(@db30("batchId") String str, v1b<? super BaseResponse<List<CreatorCredit>>> v1bVar);
}
