package com.mbridge.msdk.out.strategy.base;

import android.app.Activity;
import android.content.Context;
import com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class BidAdHandler extends BaseAdHandler {
    protected IBidVideoAdStrategy iBidVideoAdStrategy;

    public BidAdHandler(String str, String str2) {
        super(str, str2);
        IBaseVideoAdStrategy iBaseVideoAdStrategy = this.iBaseVideoAdStrategy;
        if (iBaseVideoAdStrategy instanceof IBidVideoAdStrategy) {
            this.iBidVideoAdStrategy = (IBidVideoAdStrategy) iBaseVideoAdStrategy;
        }
    }

    public boolean isBidReady() {
        IBidVideoAdStrategy iBidVideoAdStrategy = this.iBidVideoAdStrategy;
        if (iBidVideoAdStrategy == null) {
            return false;
        }
        return iBidVideoAdStrategy.isBidReady();
    }

    public void loadFromBid(String str) {
        IBidVideoAdStrategy iBidVideoAdStrategy = this.iBidVideoAdStrategy;
        if (iBidVideoAdStrategy != null) {
            iBidVideoAdStrategy.loadFromBid(str);
        }
    }

    public void showFromBid() {
        IBidVideoAdStrategy iBidVideoAdStrategy = this.iBidVideoAdStrategy;
        if (iBidVideoAdStrategy != null) {
            iBidVideoAdStrategy.showFromBid();
        }
    }

    public void showFromBid(Activity activity) {
        IBidVideoAdStrategy iBidVideoAdStrategy = this.iBidVideoAdStrategy;
        if (iBidVideoAdStrategy != null) {
            iBidVideoAdStrategy.showFromBid(activity);
        }
    }

    public BidAdHandler(Context context, String str, String str2) {
        super(context, str, str2);
        IBaseVideoAdStrategy iBaseVideoAdStrategy = this.iBaseVideoAdStrategy;
        if (iBaseVideoAdStrategy instanceof IBidVideoAdStrategy) {
            this.iBidVideoAdStrategy = (IBidVideoAdStrategy) iBaseVideoAdStrategy;
        }
    }

    public void showFromBid(String str) {
        IBidVideoAdStrategy iBidVideoAdStrategy = this.iBidVideoAdStrategy;
        if (iBidVideoAdStrategy != null) {
            iBidVideoAdStrategy.showFromBid(str);
        }
    }

    public void showFromBid(String str, String str2) {
        IBidVideoAdStrategy iBidVideoAdStrategy = this.iBidVideoAdStrategy;
        if (iBidVideoAdStrategy != null) {
            iBidVideoAdStrategy.showFromBid(str, str2);
        }
    }
}
