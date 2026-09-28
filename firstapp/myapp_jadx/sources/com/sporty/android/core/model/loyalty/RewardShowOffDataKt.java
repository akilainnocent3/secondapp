package com.sporty.android.core.model.loyalty;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"toRewardShowOffData", "Lcom/sporty/android/core/model/loyalty/RewardShowOffData;", "Lcom/sporty/android/core/model/loyalty/RewardShowOffConfig;", "batchId", "", "rewardAmount", "", "urlForRewardShowOffPic", "jsScript", "model"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class RewardShowOffDataKt {
    public static final RewardShowOffData toRewardShowOffData(RewardShowOffConfig rewardShowOffConfig, String str, long j, String str2, String str3) {
        rewardShowOffConfig.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        boolean z = rewardShowOffConfig.getMinAmount() != null && j >= rewardShowOffConfig.getMinAmount().longValue() && rewardShowOffConfig.getEnable();
        List<String> hashtagList = rewardShowOffConfig.getHashtagList();
        String strA0 = hashtagList != null ? CollectionsKt.a0(hashtagList, "\n", null, null, null, 62) : null;
        List<String> platformList = rewardShowOffConfig.getPlatformList();
        return new RewardShowOffData(z, str2, str3, str, platformList != null ? CollectionsKt.a0(platformList, ",", null, null, null, 62) : null, rewardShowOffConfig.getText(), strA0, rewardShowOffConfig.getUrl(), null, 256, null);
    }
}
