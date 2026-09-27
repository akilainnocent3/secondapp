package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_ALLOWED_FIELDS = "fields_allowed";
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final String CUSTOMINFO_KEY_IPV6 = "key_ipv6";
    public static final String CUSTOMINFO_KEY_SEC_CONFIG_STR = "sec_config";
    public static final String CUSTOMINFO_KEY_TARGET_IDC = "target-idc";
    public static final String CUSTOMINFO_KEY_TRANSFER_HOST = "key_transfer_host";
    public static final int OVREGION_TYPE_SG = 2;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f72056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f72057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f72058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f72059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f72060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PglSSCallBack f72061f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f72062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f72063b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f72064c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f72065d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f72062a)) {
                return null;
            }
            return new PglSSConfig(this.f72062a, this.f72063b, this.f72064c, this.f72065d);
        }

        public Builder setAdsdkVersion(String str) {
            this.f72065d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f72062a = str;
            return this;
        }

        public Builder setCollectMode(int i10) {
            this.f72064c = i10;
            return this;
        }

        public Builder setOVRegionType(int i10) {
            this.f72063b = i10;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdSdkVersion() {
        return this.f72059d;
    }

    public String getAppId() {
        return this.f72056a;
    }

    public PglSSCallBack getCallBack() {
        return this.f72061f;
    }

    public int getCollectMode() {
        return this.f72058c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f72060e;
    }

    public int getOVRegionType() {
        return this.f72057b;
    }

    public void setCallBack(PglSSCallBack pglSSCallBack) {
        this.f72061f = pglSSCallBack;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f72060e = map;
    }

    private PglSSConfig(String str, int i10, int i11, String str2) {
        this.f72056a = str;
        this.f72057b = i10;
        this.f72058c = i11;
        this.f72059d = str2;
    }
}
