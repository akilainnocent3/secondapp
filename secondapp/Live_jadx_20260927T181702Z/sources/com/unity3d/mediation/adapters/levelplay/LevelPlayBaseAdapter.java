package com.unity3d.mediation.adapters.levelplay;

import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdaptiveInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import java.util.List;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class LevelPlayBaseAdapter extends BaseAdapter implements AdapterMetaDataInterface, AdapterAdaptiveInterface {
    private boolean mAdapterDebug;

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdaptiveInterface
    public int getAdaptiveHeight(int i10) {
        return -1;
    }

    public boolean isAdaptersDebugEnabled() {
        return this.mAdapterDebug;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z10) {
        this.mAdapterDebug = z10;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(@m String str, @m List<String> list) {
    }
}
