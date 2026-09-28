package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.social.data.local.CreatorCreditEntity;
import com.sportybet.android.social.data.local.CreatorCreditHistoryEntity;
import com.sportybet.android.social.data.remote.entity.CreatorCredit;
import com.sportybet.android.social.data.remote.entity.RewardData;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface x2c {
    lyh<BaseResponse<RewardData>> a(String str);

    lyh<Boolean> b();

    lyh<Integer> c();

    lyh<kqz<CreatorCreditHistoryEntity>> d(String str, boolean z);

    lyh<kqz<CreatorCreditEntity>> e(String str);

    lyh<BaseResponse<List<CreatorCredit>>> f(String str);
}
