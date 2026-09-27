package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.b0;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.q;
import java.lang.ref.WeakReference;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f74259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdInformationView f74260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdPreferences.Placement f74261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConsentData f74262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f74263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f74264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AdInformationOverrides f74265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f74266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f74267i;

    public a(Context context, AdInformationConfig.ImageResourceType imageResourceType, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, ConsentData consentData, String str, String str2, String str3, String str4) {
        this.f74259a = new WeakReference(context);
        this.f74261c = placement;
        this.f74265g = adInformationOverrides;
        this.f74262d = consentData;
        this.f74263e = str;
        this.f74264f = str2;
        this.f74266h = str3;
        this.f74267i = str4;
        this.f74260b = new AdInformationView(context, imageResourceType, placement, adInformationOverrides, this, (str3 == null && str4 == null) ? false : true);
    }

    public final void a(RelativeLayout relativeLayout) {
        Set setA;
        Context context = relativeLayout.getContext();
        AdInformationConfig adInformationConfigA = AdInformationMetaData.c().a();
        AdInformationOverrides adInformationOverrides = this.f74265g;
        if ((adInformationOverrides == null || !adInformationOverrides.d()) ? adInformationConfigA.isEnabled(context) : this.f74265g.c()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            AdInformationOverrides adInformationOverrides2 = this.f74265g;
            if (adInformationOverrides2 == null || !adInformationOverrides2.e()) {
                adInformationConfigA.getPosition(this.f74261c).addRules(layoutParams);
            } else {
                this.f74265g.b().addRules(layoutParams);
            }
            relativeLayout.addView(this.f74260b, layoutParams);
        }
        q qVar = (q) com.startapp.sdk.components.a.a(context).P.a();
        AdDebuggerMetadata adDebuggerMetadataD = MetaData.E().d();
        if ((adDebuggerMetadataD == null || (setA = adDebuggerMetadataD.a()) == null) ? false : setA.contains(((com.startapp.sdk.common.advertisingid.b) qVar.f75393b.a()).a().f75070a)) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText("D");
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setTextSize(0, (this.f74260b.c() * 2) / 3.0f);
            textView.setTextColor(-1);
            textView.setBackgroundColor(Integer.MIN_VALUE);
            RelativeLayout relativeLayout2 = new RelativeLayout(context);
            relativeLayout2.setOnClickListener(new b0(this, qVar));
            AdInformationPositions.Position positionFlipHorizontal = this.f74260b.d().flipHorizontal();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f74260b.e(), this.f74260b.c());
            layoutParams2.setMargins(0, 0, 0, 0);
            positionFlipHorizontal.addRules(layoutParams2);
            relativeLayout2.addView(textView, layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f74260b.b(), this.f74260b.a());
            positionFlipHorizontal.addRules(layoutParams3);
            relativeLayout.addView(relativeLayout2, layoutParams3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = (Context) this.f74259a.get();
        if (context == null) {
            return;
        }
        g6 g6Var = (g6) com.startapp.sdk.components.a.a(context).f74465j.a();
        ConsentData consentData = this.f74262d;
        String strC = consentData != null ? consentData.c() : null;
        ConsentData consentData2 = this.f74262d;
        String strD = consentData2 != null ? consentData2.d() : null;
        ConsentData consentData3 = this.f74262d;
        g6Var.a(true, strC, strD, consentData3 != null ? consentData3.b() : null, this.f74266h, this.f74267i);
    }
}
