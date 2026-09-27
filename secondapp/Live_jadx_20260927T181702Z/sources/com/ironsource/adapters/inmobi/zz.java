package com.ironsource.adapters.inmobi;

import com.inmobi.sdk.SdkInitializationListener;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class zz implements SdkInitializationListener {
    @Override // com.inmobi.sdk.SdkInitializationListener
    public void onInitializationComplete(Error error) {
        if (error != null) {
            InMobiAdapter.zz zzVar = InMobiAdapter.zz;
            zzVar.zz(InMobiAdapter.zr.INIT_STATE_ERROR);
            Iterator it = zzVar.zs().iterator();
            while (it.hasNext()) {
                ((INetworkInitCallbackListener) it.next()).onNetworkInitCallbackFailed(error.getMessage());
            }
        } else {
            InMobiAdapter.zz zzVar2 = InMobiAdapter.zz;
            zzVar2.zz(InMobiAdapter.zr.INIT_STATE_SUCCESS);
            Iterator it2 = zzVar2.zs().iterator();
            while (it2.hasNext()) {
                ((INetworkInitCallbackListener) it2.next()).onNetworkInitCallbackSuccess();
            }
        }
        InMobiAdapter.zz.zs().clear();
    }
}
