package com.mbridge.msdk.out.strategy.base;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.config.manager.a;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseAdHandler implements BaseExtraInterfaceForHandler {
    protected static final String TAG = "BaseAdHandler";
    protected Context context;
    protected IBaseVideoAdStrategy iBaseVideoAdStrategy;
    protected String placementId;
    protected String unitId;

    public BaseAdHandler(Context context, String str, String str2) {
        this.context = context;
        this.placementId = str;
        this.unitId = str2;
        if (c.n().d() == null && context != null) {
            c.n().b(context);
        }
        if (context instanceof Activity) {
            c.n().a(context);
        }
        initData(str, str2);
    }

    private void initData(String str, String str2) {
        String strE = v0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            v0.d(str2, strE);
        }
        initStrategy(str2, str);
    }

    public boolean checkComponentizedLogic() {
        return a.b().c();
    }

    public void clearVideoCache() {
        IBaseVideoAdStrategy iBaseVideoAdStrategy = this.iBaseVideoAdStrategy;
        if (iBaseVideoAdStrategy != null) {
            iBaseVideoAdStrategy.clearVideoCache();
        }
    }

    public Context getContext() {
        return this.context;
    }

    public String getCreativeIdWithUnitId() {
        IBaseVideoAdStrategy iBaseVideoAdStrategy = this.iBaseVideoAdStrategy;
        return iBaseVideoAdStrategy == null ? "" : iBaseVideoAdStrategy.getCreativeIdWithUnitId();
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getRequestId() {
        IBaseVideoAdStrategy iBaseVideoAdStrategy = this.iBaseVideoAdStrategy;
        return iBaseVideoAdStrategy == null ? "" : iBaseVideoAdStrategy.getRequestId();
    }

    public String getUnitId() {
        return this.unitId;
    }

    public abstract void initStrategy(String str, String str2);

    public void playVideoMute(int i10) {
        IBaseVideoAdStrategy iBaseVideoAdStrategy = this.iBaseVideoAdStrategy;
        if (iBaseVideoAdStrategy != null) {
            iBaseVideoAdStrategy.playVideoMute(i10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        IBaseVideoAdStrategy iBaseVideoAdStrategy = this.iBaseVideoAdStrategy;
        if (iBaseVideoAdStrategy != null) {
            iBaseVideoAdStrategy.setAlertDialogText(str, str2, str3, str4);
        }
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        IBaseVideoAdStrategy iBaseVideoAdStrategy = this.iBaseVideoAdStrategy;
        if (iBaseVideoAdStrategy != null) {
            iBaseVideoAdStrategy.setExtraInfo(jSONObject);
        }
    }

    public void setRewardPlus(boolean z10) {
        IBaseVideoAdStrategy iBaseVideoAdStrategy = this.iBaseVideoAdStrategy;
        if (iBaseVideoAdStrategy != null) {
            iBaseVideoAdStrategy.setRewardPlus(z10);
        }
    }

    public BaseAdHandler(String str, String str2) {
        this.placementId = str;
        this.unitId = str2;
        initData(str, str2);
    }
}
