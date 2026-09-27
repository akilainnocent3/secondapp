package com.startapp.sdk.adsbase.model;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.gh;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class AdPreferences implements Serializable {
    public static final String TYPE_APP_WALL = "APP_WALL";
    public static final String TYPE_BANNER = "BANNER";
    public static final String TYPE_INAPP_EXIT = "INAPP_EXIT";
    public static final String TYPE_SCRINGO_TOOLBAR = "SCRINGO_TOOLBAR";
    public static final String TYPE_TEXT = "TEXT";
    private static final long serialVersionUID = 5287002180723228322L;
    private String adTag;
    private String age;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private Boolean f74363ai;

    @Nullable
    private Integer autoLoadAmount;
    private Set<String> categories;
    private Set<String> categoriesExclude;
    protected boolean forceFullpage;
    protected boolean forceOfferWall2D;
    protected boolean forceOfferWall3D;
    protected boolean forceOverlay;
    private SDKAdPreferences.Gender gender;
    private boolean hardwareAccelerated;
    private boolean isPreCached;
    private String keywords;
    private Double latitude;
    private Double longitude;
    protected Double minCpm;
    protected Set<String> packageInclude;

    @Nullable
    private String placementId;

    @Nullable
    private String productId;
    private boolean testMode;
    protected Ad.AdType type;
    private boolean videoMuted;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public enum Placement {
        INAPP_FULL_SCREEN(1),
        INAPP_BANNER(2),
        INAPP_OFFER_WALL(3),
        INAPP_SPLASH(4),
        INAPP_OVERLAY(5),
        INAPP_NATIVE(6),
        DEVICE_SIDEBAR(7),
        INAPP_RETURN(8),
        INAPP_BROWSER(9);

        private final int index;

        Placement(int i10) {
            this.index = i10;
        }

        @NonNull
        public static Placement getByIndex(int i10) {
            Placement placement = INAPP_FULL_SCREEN;
            for (Placement placement2 : values()) {
                if (placement2.getIndex() == i10) {
                    return placement2;
                }
            }
            return placement;
        }

        public int getIndex() {
            return this.index;
        }

        public boolean isInterstitial() {
            return this == INAPP_FULL_SCREEN || this == INAPP_OFFER_WALL || this == INAPP_OVERLAY;
        }
    }

    @Keep
    public AdPreferences() {
        this.type = null;
        this.packageInclude = null;
        this.forceOfferWall3D = false;
        this.forceOfferWall2D = false;
        this.forceFullpage = false;
        this.forceOverlay = false;
        this.minCpm = null;
        this.testMode = false;
        this.longitude = null;
        this.latitude = null;
        this.keywords = null;
        this.gender = null;
        this.age = null;
        this.f74363ai = null;
        this.videoMuted = false;
        this.adTag = null;
        this.hardwareAccelerated = fh.f74808a.f74899m;
        this.categories = null;
        this.categoriesExclude = null;
    }

    @Keep
    public AdPreferences addCategory(String str) {
        if (this.categories == null) {
            this.categories = new HashSet();
        }
        this.categories.add(str);
        return this;
    }

    @Keep
    public AdPreferences addCategoryExclude(String str) {
        if (this.categoriesExclude == null) {
            this.categoriesExclude = new HashSet();
        }
        this.categoriesExclude.add(str);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdPreferences adPreferences = (AdPreferences) obj;
            if (this.forceOfferWall3D == adPreferences.forceOfferWall3D && this.forceOfferWall2D == adPreferences.forceOfferWall2D && this.forceFullpage == adPreferences.forceFullpage && this.forceOverlay == adPreferences.forceOverlay && this.testMode == adPreferences.testMode && this.videoMuted == adPreferences.videoMuted && this.hardwareAccelerated == adPreferences.hardwareAccelerated && this.type == adPreferences.type && si.a(this.packageInclude, adPreferences.packageInclude) && si.a((Object) this.minCpm, (Object) adPreferences.minCpm) && si.a((Object) this.longitude, (Object) adPreferences.longitude) && si.a((Object) this.latitude, (Object) adPreferences.latitude) && si.a((Object) this.keywords, (Object) adPreferences.keywords) && this.gender == adPreferences.gender && si.a((Object) this.age, (Object) adPreferences.age) && si.a((Object) this.f74363ai, (Object) adPreferences.f74363ai) && si.a((Object) this.adTag, (Object) adPreferences.adTag) && si.a((Object) this.productId, (Object) adPreferences.productId) && si.a((Object) this.autoLoadAmount, (Object) adPreferences.autoLoadAmount) && this.isPreCached == adPreferences.isPreCached && si.a(this.categories, adPreferences.categories) && si.a(this.categoriesExclude, adPreferences.categoriesExclude) && si.a((Object) this.placementId, (Object) adPreferences.placementId)) {
                return true;
            }
        }
        return false;
    }

    @Keep
    public String getAdTag() {
        return this.adTag;
    }

    @Keep
    public String getAge(Context context) {
        String str = this.age;
        if (str != null) {
            return str;
        }
        gh ghVar = fh.f74808a;
        if (ghVar.f74887a == null) {
            SDKAdPreferences sDKAdPreferences = (SDKAdPreferences) e7.b(context, "shared_prefs_sdk_ad_prefs");
            if (sDKAdPreferences == null) {
                ghVar.f74887a = new SDKAdPreferences();
            } else {
                ghVar.f74887a = sDKAdPreferences;
            }
        }
        return ghVar.f74887a.getAge();
    }

    @Keep
    public Boolean getAi() {
        return this.f74363ai;
    }

    @Keep
    public Boolean getAs() {
        return Boolean.FALSE;
    }

    @Nullable
    public Integer getAutoLoadAmount() {
        return this.autoLoadAmount;
    }

    @Keep
    public Set<String> getCategories() {
        return this.categories;
    }

    @Keep
    public Set<String> getCategoriesExclude() {
        return this.categoriesExclude;
    }

    @Nullable
    @Keep
    public String getCustomProductId() {
        return this.productId;
    }

    @Keep
    public SDKAdPreferences.Gender getGender(Context context) {
        SDKAdPreferences.Gender gender = this.gender;
        if (gender != null) {
            return gender;
        }
        gh ghVar = fh.f74808a;
        if (ghVar.f74887a == null) {
            SDKAdPreferences sDKAdPreferences = (SDKAdPreferences) e7.b(context, "shared_prefs_sdk_ad_prefs");
            if (sDKAdPreferences == null) {
                ghVar.f74887a = new SDKAdPreferences();
            } else {
                ghVar.f74887a = sDKAdPreferences;
            }
        }
        return ghVar.f74887a.getGender();
    }

    @Keep
    public String getKeywords() {
        return this.keywords;
    }

    @Keep
    public Double getLatitude() {
        return this.latitude;
    }

    @Keep
    public Double getLongitude() {
        return this.longitude;
    }

    @Keep
    public Double getMinCpm() {
        return this.minCpm;
    }

    @Nullable
    @Keep
    public String getPlacementId() {
        return this.placementId;
    }

    @Keep
    public Ad.AdType getType() {
        return this.type;
    }

    public int hashCode() {
        Object[] objArr = {this.type, this.packageInclude, Boolean.valueOf(this.forceOfferWall3D), Boolean.valueOf(this.forceOfferWall2D), Boolean.valueOf(this.forceFullpage), Boolean.valueOf(this.forceOverlay), this.minCpm, Boolean.valueOf(this.testMode), this.longitude, this.latitude, this.keywords, this.gender, this.age, this.f74363ai, Boolean.valueOf(this.videoMuted), this.adTag, this.productId, Boolean.valueOf(this.hardwareAccelerated), this.autoLoadAmount, Boolean.valueOf(this.isPreCached), this.categories, this.categoriesExclude, this.placementId};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }

    @Keep
    public boolean isForceFullpage() {
        return this.forceFullpage;
    }

    @Keep
    public boolean isForceOfferWall2D() {
        return this.forceOfferWall2D;
    }

    @Keep
    public boolean isForceOfferWall3D() {
        return this.forceOfferWall3D;
    }

    @Keep
    public boolean isForceOverlay() {
        return this.forceOverlay;
    }

    public boolean isHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    public boolean isPreCached() {
        return this.isPreCached;
    }

    @Keep
    public boolean isSimpleToken() {
        return true;
    }

    @Keep
    public boolean isTestMode() {
        return this.testMode;
    }

    @Keep
    public boolean isVideoMuted() {
        return this.videoMuted;
    }

    public void makePreCached() {
        this.isPreCached = true;
    }

    @Keep
    public AdPreferences muteVideo() {
        this.videoMuted = true;
        return this;
    }

    @Keep
    public AdPreferences setAdTag(String str) {
        this.adTag = str;
        return this;
    }

    @Keep
    public AdPreferences setAge(Integer num) {
        this.age = Integer.toString(num.intValue());
        return this;
    }

    @Keep
    public AdPreferences setAi(Boolean bool) {
        this.f74363ai = bool;
        return this;
    }

    public void setAutoLoadAmount(int i10) {
        if (i10 > 0) {
            this.autoLoadAmount = Integer.valueOf(i10);
        }
    }

    @Keep
    public AdPreferences setCustomProductId(@Nullable String str) {
        this.productId = str;
        return this;
    }

    @Keep
    public AdPreferences setGender(SDKAdPreferences.Gender gender) {
        this.gender = gender;
        return this;
    }

    @Keep
    public void setHardwareAccelerated(boolean z10) {
        this.hardwareAccelerated = z10;
    }

    @Keep
    public AdPreferences setKeywords(String str) {
        this.keywords = str;
        return this;
    }

    @Keep
    public AdPreferences setLatitude(double d10) {
        this.latitude = Double.valueOf(d10);
        return this;
    }

    @Keep
    public AdPreferences setLongitude(double d10) {
        this.longitude = Double.valueOf(d10);
        return this;
    }

    @Keep
    public void setMinCpm(Double d10) {
        this.minCpm = d10;
    }

    @Keep
    public void setPlacementId(@Nullable String str) {
        this.placementId = str;
    }

    @Keep
    public AdPreferences setTestMode(boolean z10) {
        this.testMode = z10;
        return this;
    }

    @Keep
    public void setType(Ad.AdType adType) {
        this.type = adType;
    }

    @Keep
    public AdPreferences setAge(String str) {
        this.age = str;
        return this;
    }

    @Keep
    public AdPreferences(AdPreferences adPreferences) {
        this.type = null;
        this.packageInclude = null;
        this.forceOfferWall3D = false;
        this.forceOfferWall2D = false;
        this.forceFullpage = false;
        this.forceOverlay = false;
        this.minCpm = null;
        this.testMode = false;
        this.longitude = null;
        this.latitude = null;
        this.keywords = null;
        this.gender = null;
        this.age = null;
        this.f74363ai = null;
        this.videoMuted = false;
        this.adTag = null;
        this.hardwareAccelerated = fh.f74808a.f74899m;
        this.categories = null;
        this.categoriesExclude = null;
        this.type = adPreferences.type;
        if (adPreferences.packageInclude != null) {
            this.packageInclude = new HashSet(adPreferences.packageInclude);
        }
        this.minCpm = adPreferences.minCpm;
        this.forceOfferWall3D = adPreferences.forceOfferWall3D;
        this.forceOfferWall2D = adPreferences.forceOfferWall2D;
        this.forceFullpage = adPreferences.forceFullpage;
        this.forceOverlay = adPreferences.forceOverlay;
        this.testMode = adPreferences.testMode;
        this.longitude = adPreferences.longitude;
        this.latitude = adPreferences.latitude;
        this.keywords = adPreferences.keywords;
        this.gender = adPreferences.gender;
        this.age = adPreferences.age;
        this.f74363ai = adPreferences.f74363ai;
        this.videoMuted = adPreferences.videoMuted;
        this.adTag = adPreferences.adTag;
        this.hardwareAccelerated = adPreferences.hardwareAccelerated;
        this.autoLoadAmount = adPreferences.autoLoadAmount;
        this.isPreCached = adPreferences.isPreCached;
        this.productId = adPreferences.productId;
        if (adPreferences.categories != null) {
            this.categories = new HashSet(adPreferences.categories);
        }
        if (adPreferences.categoriesExclude != null) {
            this.categoriesExclude = new HashSet(adPreferences.categoriesExclude);
        }
        this.placementId = adPreferences.placementId;
    }

    @Keep
    public AdPreferences setAs(Boolean bool) {
        return this;
    }
}
