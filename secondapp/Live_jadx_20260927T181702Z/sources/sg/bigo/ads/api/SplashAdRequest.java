package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import k.u;

/* JADX INFO: loaded from: classes7.dex */
public class SplashAdRequest extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @u
    public final int f132700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f132701j;

    public static class Builder extends c<Builder, SplashAdRequest> {

        @u
        private int mAppLogoResId;
        private String mAppName;

        @Override // sg.bigo.ads.api.c
        public SplashAdRequest createAdRequest() {
            return new SplashAdRequest(this.mSlotId, this.mAppLogoResId, this.mAppName, this.mServerBidPayload);
        }

        @NonNull
        public Builder withAppLogo(@u int i10) {
            this.mAppLogoResId = i10;
            return this;
        }

        @NonNull
        public Builder withAppName(String str) {
            this.mAppName = str;
            return this;
        }
    }

    public SplashAdRequest(String str, @u int i10, String str2, String str3) {
        super(str, str3);
        this.f132700i = i10;
        this.f132701j = str2;
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return 12;
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final Map<String, Object> d() {
        return null;
    }
}
