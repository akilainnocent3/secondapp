package com.mbridge.msdk.mbbanner.common.listener;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface a {
    void a(CampaignEx campaignEx);

    void a(boolean z10);

    void a(boolean z10, String str);

    void close();

    void readyStatus(int i10);

    void toggleCloseBtn(int i10);

    void triggerCloseBtn(String str);
}
