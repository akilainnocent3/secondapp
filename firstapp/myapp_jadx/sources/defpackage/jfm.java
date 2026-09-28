package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.sporty.android.core.model.ads.RealSportsAds;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import com.sportybet.plugin.realsports.activities.AlertBannerActivity;
import com.sportybet.plugin.realsports.data.AdConfigKey;

/* JADX INFO: loaded from: classes2.dex */
public final class jfm implements j5f0<Bitmap> {
    public final /* synthetic */ RealSportsAds a;
    public final /* synthetic */ dfm b;

    public jfm(dfm dfmVar, RealSportsAds realSportsAds) {
        this.b = dfmVar;
        this.a = realSportsAds;
    }

    @Override // defpackage.j5f0
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.j5f0
    public final void b(Bitmap bitmap) {
        dfm dfmVar = this.b;
        if (!dfmVar.O0 || bitmap.isRecycled()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        RealSportsAds realSportsAds = this.a;
        sb.append(realSportsAds.getImgUrl());
        sb.append(realSportsAds.getLinkUrl());
        if (vn20.c("alert_banner", sb.toString(), true)) {
            Intent intent = new Intent(dfmVar.getActivity(), (Class<?>) AlertBannerActivity.class);
            intent.putExtra("img", realSportsAds.getImgUrl());
            intent.putExtra("link", realSportsAds.getLinkUrl());
            intent.putExtra(UccrWswQGaIj.ArLUe, bitmap.getHeight() / bitmap.getWidth());
            if (realSportsAds.getConfigKey() instanceof AdConfigKey) {
                intent.putExtra("configKey", ((AdConfigKey) realSportsAds.getConfigKey()).key);
                intent.putExtra("configName", ((AdConfigKey) realSportsAds.getConfigKey()).name);
            }
            yrh0.s(dfmVar.getActivity(), intent, true);
            vn20.g("alert_banner", realSportsAds.getImgUrl() + realSportsAds.getLinkUrl(), false, true);
        }
    }
}
