package com.sportybet.plugin.realsports.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.core.model.ads.RealSportsAdSpots;
import com.sporty.android.core.model.ads.RealSportsAds;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ErrorView;
import defpackage.ar30;
import defpackage.bi50;
import defpackage.gv5;
import defpackage.l840;
import defpackage.mo0;
import defpackage.rk30;
import defpackage.sh8;
import defpackage.su5;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class NavigationBarLoadingView extends FrameLayout {
    public static final /* synthetic */ int A = 0;
    public ErrorView a;
    public ProgressBar b;
    public TextView c;
    public LinearLayout d;
    public AspectRatioImageView e;
    public AppCompatImageView f;
    public TextView i;
    public TextView v;
    public AppCompatTextView w;
    public final mo0 y;
    public su5<BaseResponse<RealSportsAdsData>> z;

    public NavigationBarLoadingView(Context context) {
        super(context);
        this.y = l840.a();
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.spr_navigation_bar_loading_view, this);
        this.b = (ProgressBar) findViewById(R.id.progress);
        this.a = (ErrorView) findViewById(R.id.error);
        this.c = (TextView) findViewById(R.id.empty);
        this.i = (TextView) findViewById(R.id.empty1);
        this.v = (TextView) findViewById(R.id.empty2);
        this.d = (LinearLayout) findViewById(R.id.entry_container);
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) findViewById(R.id.banner_ad);
        this.e = aspectRatioImageView;
        aspectRatioImageView.setAspectRatio(0.24840765f);
        this.f = (AppCompatImageView) findViewById(R.id.icon_sportbet);
        this.w = (AppCompatTextView) findViewById(R.id.empty_message);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.u, R.attr.loadingViewStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.b.getIndeterminateDrawable().setColorFilter(typedArrayObtainStyledAttributes.getColor(0, 0), PorterDuff.Mode.SRC_IN);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b() {
        su5<BaseResponse<RealSportsAdsData>> su5Var = this.z;
        if (su5Var != null) {
            su5Var.cancel();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("spotId", "orderBottom"));
            jSONObject.put("adSpots", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        su5<BaseResponse<RealSportsAdsData>> su5VarA = this.y.a(jSONObject.toString());
        this.z = su5VarA;
        su5VarA.G(new a());
    }

    public final void c() {
        setVisibility(0);
        this.b.setVisibility(8);
        this.a.setVisibility(0);
        this.c.setVisibility(8);
        this.i.setVisibility(8);
        this.v.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }

    public final void d() {
        setVisibility(0);
        this.b.setVisibility(0);
        this.a.setVisibility(8);
        this.c.setVisibility(8);
        this.i.setVisibility(8);
        this.v.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }

    public final void e(ar30 ar30Var) {
        super.setOnClickListener(ar30Var);
    }

    public ErrorView getErrorView() {
        return this.a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public NavigationBarLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = l840.a();
        a(context, attributeSet);
    }

    public NavigationBarLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.y = l840.a();
        a(context, attributeSet);
    }

    public class a implements gv5<BaseResponse<RealSportsAdsData>> {
        public a() {
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<RealSportsAdsData>> su5Var, bi50<BaseResponse<RealSportsAdsData>> bi50Var) {
            BaseResponse<RealSportsAdsData> baseResponse;
            List<RealSportsAdSpots> adSpots;
            RealSportsAds firstAd;
            if (!bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || !baseResponse.hasData() || (adSpots = baseResponse.data.getAdSpots()) == null || adSpots.size() <= 0) {
                return;
            }
            for (RealSportsAdSpots realSportsAdSpots : adSpots) {
                if (realSportsAdSpots != null && realSportsAdSpots.getAds() != null && "orderBottom".equals(realSportsAdSpots.getSpotId()) && (firstAd = realSportsAdSpots.getFirstAd()) != null) {
                    int i = NavigationBarLoadingView.A;
                    sh8.a().c(firstAd.getImgUrl(), new com.sportybet.plugin.realsports.widget.a(NavigationBarLoadingView.this, firstAd));
                    return;
                }
            }
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<RealSportsAdsData>> su5Var, Throwable th) {
        }
    }
}
