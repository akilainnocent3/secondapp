package com.startapp.sdk.ads.list3d;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.C4235d4;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.a9;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.f2;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.jb;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.mb;
import com.startapp.sdk.internal.ob;
import com.startapp.sdk.internal.qb;
import com.startapp.sdk.internal.rb;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.sb;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.wb;
import com.startapp.sdk.internal.xf;
import com.vungle.ads.internal.Constants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class List3DActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List3DView f74095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f74096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f74097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f74098d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f74100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f74101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList f74102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private sb f74103i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f74099e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private jb f74104j = new jb(this);

    @Override // android.app.Activity
    public final void finish() {
        sb sbVar;
        try {
            SystemClock.uptimeMillis();
            ArrayList arrayList = this.f74102h;
            String str = (arrayList == null || arrayList.isEmpty() || ((ob) this.f74102h.get(0)).f75305e == null) ? "" : ((ob) this.f74102h.get(0)).f75305e;
            g0.a(this, str, a());
            fh.f74808a.getClass();
            if (this.f74096b == getResources().getConfiguration().orientation) {
                wb.a(this).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
            }
            synchronized (this) {
                try {
                    if (this.f74104j != null) {
                        wb.a(this).a(this.f74104j);
                        this.f74104j = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            String str2 = this.f74100f;
            if (str2 != null && (sbVar = this.f74103i) != null) {
                for (xf xfVar : sbVar.a(str2).f75458a.f74531c.values()) {
                    if (xfVar != null) {
                        xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
                    }
                }
                if (!h0.f74931f.booleanValue()) {
                    this.f74103i.f75499a.remove(this.f74100f);
                }
            }
        } catch (Throwable th3) {
            d9.a(th3);
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        sb sbVar = this.f74103i;
        if (sbVar != null) {
            for (xf xfVar : sbVar.a(this.f74100f).f75458a.f74531c.values()) {
                if (xfVar != null) {
                    xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Throwable th2;
        View view;
        try {
            overridePendingTransition(0, 0);
            super.onCreate(bundle);
            if (getIntent().getBooleanExtra(Constants.TEMPLATE_TYPE_FULLSCREEN, false)) {
                try {
                    requestWindowFeature(1);
                    getWindow().setFlags(1024, 1024);
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            if (bundle == null) {
                wb.a(this).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
                this.f74097c = (Long) getIntent().getSerializableExtra("lastLoadTime");
                this.f74098d = (Long) getIntent().getSerializableExtra("adCacheTtl");
            } else {
                if (bundle.containsKey("lastLoadTime")) {
                    this.f74097c = (Long) bundle.getSerializable("lastLoadTime");
                }
                if (bundle.containsKey("adCacheTtl")) {
                    this.f74098d = (Long) bundle.getSerializable("adCacheTtl");
                }
            }
            getIntent().getStringExtra(C4235d4.i.L);
            this.f74100f = getIntent().getStringExtra("listModelUuid");
            wb.a(this).a(this.f74104j, new IntentFilter("com.startapp.android.CloseAdActivity"));
            this.f74096b = getResources().getConfiguration().orientation;
            si.a((Activity) this, true);
            requestWindowFeature(1);
            this.f74101g = getIntent().getStringExtra("adTag");
            int iD = AdsCommonMetaData.k().d();
            int iC = AdsCommonMetaData.k().c();
            this.f74095a = new List3DView(this);
            this.f74095a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iD, iC}));
            sb sbVar = (sb) com.startapp.sdk.components.a.a(this).R.a();
            this.f74103i = sbVar;
            ArrayList arrayList = sbVar.a(this.f74100f).f75459b;
            this.f74102h = arrayList;
            if (arrayList == null) {
                finish();
                return;
            }
            this.f74095a.setStarted();
            this.f74095a.setHint(true);
            this.f74095a.setFade(true);
            mb mbVar = new mb(this, this.f74102h, this.f74101g, this.f74100f);
            this.f74103i.a(this.f74100f).a(this);
            this.f74095a.setAdapter(mbVar);
            this.f74095a.setDynamics(new rg());
            this.f74095a.setOnItemClickListener(new a(this));
            RelativeLayout relativeLayout = new RelativeLayout(this);
            relativeLayout.setFitsSystemWindows(true);
            relativeLayout.setContentDescription("StartApp Ad");
            relativeLayout.setId(h0.f74933h);
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            relativeLayout.addView(linearLayout, layoutParams2);
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            relativeLayout2.setBackgroundColor(AdsCommonMetaData.k().z().intValue());
            linearLayout.addView(relativeLayout2);
            TextView textView = new TextView(this);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            textView.setLayoutParams(layoutParams3);
            float f10 = 2;
            textView.setPadding(0, Math.round(TypedValue.applyDimension(1, f10, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 5, getResources().getDisplayMetrics())));
            textView.setTextColor(AdsCommonMetaData.k().C().intValue());
            textView.setTextSize(AdsCommonMetaData.k().E().intValue());
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setText(AdsCommonMetaData.k().A());
            textView.setShadowLayer(2.5f, -2.0f, 2.0f, -11513776);
            ii.a(textView, AdsCommonMetaData.k().D());
            relativeLayout2.addView(textView);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(11);
            layoutParams4.addRule(15);
            Bitmap bitmapB = f2.b(this, "close_button.png");
            if (bitmapB == null) {
                bitmapB = f2.b(this, "close_button.png");
            }
            if (bitmapB != null) {
                ImageButton imageButton = new ImageButton(this, null, R.style.Theme.Translucent);
                float f11 = 36;
                imageButton.setImageBitmap(Bitmap.createScaledBitmap(bitmapB, Math.round(TypedValue.applyDimension(1, f11, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, f11, getResources().getDisplayMetrics())), true));
                view = imageButton;
            } else {
                TextView textView2 = new TextView(this);
                textView2.setText("   x   ");
                textView2.setTextSize(20.0f);
                view = textView2;
            }
            view.setLayoutParams(layoutParams4);
            view.setOnClickListener(new b(this));
            view.setContentDescription("x");
            view.setId(h0.f74935j);
            relativeLayout2.addView(view);
            View view2 = new View(this);
            view2.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(TypedValue.applyDimension(1, f10, getResources().getDisplayMetrics()))));
            view2.setBackgroundColor(AdsCommonMetaData.k().B().intValue());
            linearLayout.addView(view2);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams5.weight = 1.0f;
            this.f74095a.setLayoutParams(layoutParams5);
            linearLayout.addView(this.f74095a);
            LinearLayout linearLayout2 = new LinearLayout(this);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.gravity = 80;
            linearLayout2.setLayoutParams(layoutParams6);
            linearLayout2.setBackgroundColor(AdsCommonMetaData.k().u().intValue());
            linearLayout2.setGravity(17);
            linearLayout.addView(linearLayout2);
            TextView textView3 = new TextView(this);
            textView3.setTextColor(AdsCommonMetaData.k().v().intValue());
            textView3.setPadding(0, Math.round(TypedValue.applyDimension(1, f10, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 3, getResources().getDisplayMetrics())));
            textView3.setText("Powered By ");
            textView3.setTextSize(16.0f);
            linearLayout2.addView(textView3);
            ImageView imageView = new ImageView(this);
            Bitmap bitmapB2 = f2.b(this, "logo.png");
            if (bitmapB2 == null) {
                bitmapB2 = f2.b(this, "logo.png");
            }
            imageView.setImageBitmap(Bitmap.createScaledBitmap(bitmapB2, Math.round(TypedValue.applyDimension(1, 56, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 12, getResources().getDisplayMetrics())), true));
            linearLayout2.addView(imageView);
            try {
                new com.startapp.sdk.adsbase.adinformation.a(this, AdInformationConfig.ImageResourceType.INFO_L, AdPreferences.Placement.INAPP_OFFER_WALL, (AdInformationOverrides) getIntent().getSerializableExtra("adInfoOverride"), null, null, null, null, null).a(relativeLayout);
                setContentView(relativeLayout, layoutParams);
                new Handler().postDelayed(new lb(this), 500L);
                return;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        d9.a(th2);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.f74104j != null) {
            wb.a(this).a(this.f74104j);
        }
        si.a((Activity) this, false);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        sb sbVar = this.f74103i;
        if (sbVar != null) {
            for (xf xfVar : sbVar.a(this.f74100f).f75458a.f74531c.values()) {
                if (xfVar != null) {
                    xfVar.a();
                }
            }
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f74097c != null && this.f74098d != null && System.currentTimeMillis() - this.f74097c.longValue() > this.f74098d.longValue()) {
            finish();
            return;
        }
        fh.f74808a.getClass();
        this.f74099e = SystemClock.uptimeMillis();
        sb sbVar = this.f74103i;
        if (sbVar != null) {
            a9 a9Var = sbVar.a(this.f74100f).f75458a;
            for (String str : a9Var.f74531c.keySet()) {
                if (a9Var.f74531c.get(str) != null) {
                    ((xf) a9Var.f74531c.get(str)).c();
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Long l10 = this.f74097c;
        if (l10 != null) {
            bundle.putSerializable("lastLoadTime", l10);
        }
        Long l11 = this.f74098d;
        if (l11 != null) {
            bundle.putSerializable("adCacheTtl", l11);
        }
    }

    public final CloseTrackingParams a() {
        return new CloseTrackingParams(this.f74101g, (SystemClock.uptimeMillis() - this.f74099e) / 1000);
    }

    public final void a(int i10) {
        ArrayList arrayList;
        List3DView list3DView = this.f74095a;
        View childAt = list3DView.getChildAt(i10 - list3DView.f74113i);
        if (childAt == null) {
            return;
        }
        qb qbVar = (qb) childAt.getTag();
        sb sbVar = this.f74103i;
        rb rbVarA = sbVar != null ? sbVar.a(this.f74100f) : null;
        if (rbVarA == null || (arrayList = rbVarA.f75459b) == null || i10 >= arrayList.size()) {
            return;
        }
        ob obVar = (ob) rbVarA.f75459b.get(i10);
        qbVar.f75427b.setImageBitmap(rbVarA.f75458a.a(obVar.f75301a, i10, obVar.f75309i));
        qbVar.f75427b.requestLayout();
        if (obVar.f75314n != null) {
            qbVar.f75430e.setText("Open");
        } else {
            qbVar.f75430e.setText("Download");
        }
    }
}
