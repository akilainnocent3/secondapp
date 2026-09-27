package com.mbridge.msdk.dycreator.viewdata;

import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a implements com.mbridge.msdk.dycreator.viewdata.base.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DyOption f66571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f66572b;

    public a(DyOption dyOption) {
        this.f66571a = dyOption;
        this.f66572b = dyOption.getCampaignEx();
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public CampaignEx getBindData() {
        return this.f66572b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.a
    public DyOption getEffectData() {
        return this.f66571a;
    }
}
