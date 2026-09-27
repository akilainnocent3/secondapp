package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.hww.hww.hww.vgm.tq;
import com.bytedance.sdk.component.utils.weu;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class AdSlot {
    public static final int ANCHORED_BANNER = 2;
    public static final int FIX_BANNER = 1;
    public static final int INLINE_BANNER = 3;
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private Map<String, Object> aed;
    private int aeg;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private String f35138bs;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private boolean f35139ed;
    private boolean grv;
    private int hnv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f35140hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private float f35141hv;
    private String hww;
    private String jpb;
    private boolean khx;
    private int kub;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    private int f35142kv;
    private String mrs;
    private String nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private int f35143ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private String f35144ok;
    private int omn;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f35145rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f35146sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f35147tq;
    private boolean vgm;
    private String vhb;
    private float vy;
    private String weu;
    private String wgt;

    public static int getPosition(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return (i10 == 3 || i10 == 4 || i10 == 7 || i10 == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
            builder.setBannerType(jSONObject.optInt("mBannerType"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public int getAdCount() {
        return this.f35140hu;
    }

    public String getAdId() {
        return this.wgt;
    }

    public int getBannerType() {
        return this.aeg;
    }

    public String getBidAdm() {
        return this.weu;
    }

    public String getCodeId() {
        return this.hww;
    }

    public String getCreativeId() {
        return this.f35138bs;
    }

    public int getDurationSlotType() {
        return this.kub;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f35141hv;
    }

    public float getExpressViewAcceptedWidth() {
        return this.vy;
    }

    public String getExt() {
        return this.jpb;
    }

    public int getImgAcceptedHeight() {
        return this.f35146sd;
    }

    public int getImgAcceptedWidth() {
        return this.f35147tq;
    }

    public int getIsRotateBanner() {
        return this.omn;
    }

    public String getMediaExtra() {
        return this.nod;
    }

    @Nullable
    public Map<String, Object> getRequestExtraMap() {
        return this.aed;
    }

    public int getRewardAmount() {
        return this.f35145rs;
    }

    public String getRewardName() {
        return this.f35144ok;
    }

    public int getRotateOrder() {
        return this.f35142kv;
    }

    public int getRotateTime() {
        return this.hnv;
    }

    public String getUserData() {
        return this.mrs;
    }

    public String getUserID() {
        return this.vhb;
    }

    public boolean isAutoPlay() {
        return this.f35139ed;
    }

    public boolean isExpressAd() {
        return this.khx;
    }

    public boolean isPreload() {
        return this.grv;
    }

    public boolean isSupportDeepLink() {
        return this.vgm;
    }

    public void setAdCount(int i10) {
        this.f35140hu = i10;
    }

    public void setDurationSlotType(int i10) {
        this.kub = i10;
    }

    public void setExpressViewAccepted(float f10, float f11) {
        this.vy = f10;
        this.f35141hv = f11;
    }

    public void setIsRotateBanner(int i10) {
        this.omn = i10;
    }

    public void setPreload(boolean z10) {
        this.grv = z10;
    }

    public void setRotateOrder(int i10) {
        this.f35142kv = i10;
    }

    public void setRotateTime(int i10) {
        this.hnv = i10;
    }

    public void setUserData(String str) {
        this.mrs = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.hww);
            jSONObject.put("mAdCount", this.f35140hu);
            jSONObject.put("mIsAutoPlay", this.f35139ed);
            jSONObject.put("mImgAcceptedWidth", this.f35147tq);
            jSONObject.put("mImgAcceptedHeight", this.f35146sd);
            jSONObject.put("mExpressViewAcceptedWidth", this.vy);
            jSONObject.put("mExpressViewAcceptedHeight", this.f35141hv);
            jSONObject.put("mSupportDeepLink", this.vgm);
            jSONObject.put("mRewardName", this.f35144ok);
            jSONObject.put("mRewardAmount", this.f35145rs);
            jSONObject.put("mMediaExtra", this.nod);
            jSONObject.put("mUserID", this.vhb);
            jSONObject.put("mNativeAdType", this.f35143ny);
            jSONObject.put("mIsExpressAd", this.khx);
            jSONObject.put("mAdId", this.wgt);
            jSONObject.put("mCreativeId", this.f35138bs);
            jSONObject.put("mExt", this.jpb);
            jSONObject.put("mBidAdm", this.weu);
            jSONObject.put("mUserData", this.mrs);
            jSONObject.put("mDurationSlotType", this.kub);
            jSONObject.put("mBannerType", this.aeg);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.f35139ed = true;
        this.khx = false;
        this.omn = 0;
        this.hnv = 0;
        this.f35142kv = 0;
        this.aeg = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: bs, reason: collision with root package name */
        private String f35148bs;

        /* JADX INFO: renamed from: ed, reason: collision with root package name */
        private boolean f35149ed;
        private int hnv;
        private String hww;
        private String jpb;
        private String khx;
        private int nod;

        /* JADX INFO: renamed from: ny, reason: collision with root package name */
        private float f35153ny;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private String f35154ok;
        private float vhb;
        private String weu;
        private String wgt;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private int f35157tq = 640;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private int f35156sd = 320;
        private final boolean vy = true;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private int f35151hv = 1;

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private final String f35150hu = "";
        private final int vgm = 0;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private String f35155rs = "defaultUser";
        private boolean mrs = true;
        private Map<String, Object> omn = null;

        /* JADX INFO: renamed from: kv, reason: collision with root package name */
        private int f35152kv = 1;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.hww = this.hww;
            adSlot.f35140hu = this.f35151hv;
            adSlot.vgm = true;
            adSlot.f35147tq = this.f35157tq;
            adSlot.f35146sd = this.f35156sd;
            float f10 = this.vhb;
            if (f10 <= 0.0f) {
                adSlot.vy = this.f35157tq;
                adSlot.f35141hv = this.f35156sd;
            } else {
                adSlot.vy = f10;
                adSlot.f35141hv = this.f35153ny;
            }
            adSlot.f35144ok = "";
            adSlot.f35145rs = 0;
            adSlot.nod = this.f35154ok;
            adSlot.vhb = this.f35155rs;
            adSlot.f35143ny = this.nod;
            adSlot.f35139ed = this.mrs;
            adSlot.khx = this.f35149ed;
            adSlot.weu = this.khx;
            adSlot.wgt = this.weu;
            adSlot.f35138bs = this.wgt;
            adSlot.jpb = this.f35148bs;
            adSlot.mrs = this.jpb;
            adSlot.aed = this.omn;
            adSlot.kub = this.hnv;
            adSlot.aeg = this.f35152kv;
            return adSlot;
        }

        public Builder isExpressAd(boolean z10) {
            this.f35149ed = z10;
            return this;
        }

        public Builder setAdCount(int i10) {
            if (i10 <= 0) {
                i10 = 1;
            }
            if (i10 > 20) {
                i10 = 20;
            }
            this.f35151hv = i10;
            return this;
        }

        public Builder setAdId(String str) {
            this.weu = str;
            return this;
        }

        public Builder setBannerType(int i10) {
            this.f35152kv = i10;
            return this;
        }

        public Builder setCodeId(String str) {
            this.hww = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.wgt = str;
            return this;
        }

        public Builder setDurationSlotType(int i10) {
            this.hnv = i10;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f10, float f11) {
            this.vhb = f10;
            this.f35153ny = f11;
            return this;
        }

        public Builder setExt(String str) {
            this.f35148bs = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i10, int i11) {
            this.f35157tq = i10;
            this.f35156sd = i11;
            return this;
        }

        public Builder setIsAutoPlay(boolean z10) {
            this.mrs = z10;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.f35154ok = str;
            return this;
        }

        public Builder setNativeAdType(int i10) {
            this.nod = i10;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.omn = map;
            return this;
        }

        public Builder setUserData(String str) {
            this.jpb = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.f35155rs = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (weu.vy()) {
                tq.hww(str);
            }
            this.khx = str;
            return this;
        }

        public Builder setRewardAmount(int i10) {
            return this;
        }

        public Builder setRewardName(String str) {
            return this;
        }

        public Builder setSupportDeepLink(boolean z10) {
            return this;
        }
    }
}
