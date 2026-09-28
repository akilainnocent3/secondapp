package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public enum opi {
    FACEBOOK(R.drawable.ic_footer_social_facebook, AnalyticsParam.EVENT_PARAM_SHARING_TYPE_FACEBOOK),
    X(R.drawable.ic_footer_social_x, AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X),
    INSTAGRAM(R.drawable.ic_footer_social_instagram, "Instagram"),
    TELEGRAM(R.drawable.ic_footer_social_telegram, AnalyticsParam.EVENT_PARAM_SHARING_TYPE_TELEGRAM),
    YOUTUBE(R.drawable.ic_footer_social_youtube, "YouTube"),
    TIKTOK(R.drawable.ic_footer_social_tiktok, "TikTok");

    public final int a;
    public final String b;

    opi(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
