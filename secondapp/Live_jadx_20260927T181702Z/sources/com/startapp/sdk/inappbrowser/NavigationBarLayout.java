package com.startapp.sdk.inappbrowser;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.internal.f2;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.qd;
import com.startapp.startappsdk.R;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class NavigationBarLayout extends RelativeLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f74494j = R.id.io_start_navigation_bar;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f74495k = R.id.io_start_navigation_bar_title;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f74496l = R.id.io_start_navigation_bar_close;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f74497m = R.id.io_start_navigation_bar_external;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f74498n = R.id.io_start_navigation_bar_back;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f74499o = R.id.io_start_navigation_bar_forward;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f74500p = R.id.io_start_navigation_bar_title_url;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f74501q = Color.rgb(78, 86, 101);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f74502r = Color.rgb(148, 155, 166);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f74503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f74504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f74505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f74506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f74507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f74508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f74509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f74510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private HashMap f74511i;

    public NavigationBarLayout(Context context) {
        super(context);
        this.f74510h = Boolean.FALSE;
    }

    public final void a(WebView webView) {
        if (this.f74510h.booleanValue()) {
            if (webView.canGoBack()) {
                this.f74507e.setImageBitmap(((qd) this.f74511i.get("BACK_DARK")).f75433a);
                this.f74507e.setEnabled(true);
            } else {
                this.f74507e.setImageBitmap(((qd) this.f74511i.get("BACK")).f75433a);
                this.f74507e.setEnabled(false);
            }
            if (webView.canGoForward()) {
                this.f74505c.setImageBitmap(((qd) this.f74511i.get("FORWARD_DARK")).f75433a);
                this.f74505c.setEnabled(true);
            } else {
                this.f74505c.setImageBitmap(((qd) this.f74511i.get("FORWARD")).f75433a);
                this.f74505c.setEnabled(false);
            }
            if (webView.getTitle() != null) {
                this.f74508f.setText(webView.getTitle());
                return;
            }
            return;
        }
        if (webView.canGoBack()) {
            this.f74507e.setImageBitmap(((qd) this.f74511i.get("BACK_DARK")).f75433a);
            addView(this.f74507e, ii.a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
            View view = this.f74505c;
            int i10 = f74498n;
            RelativeLayout.LayoutParams layoutParamsA = ii.a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15});
            layoutParamsA.addRule(1, i10);
            addView(view, layoutParamsA);
            removeView(this.f74503a);
            this.f74503a.removeView(this.f74509g);
            this.f74503a.removeView(this.f74508f);
            this.f74503a.addView(this.f74508f, ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
            RelativeLayout relativeLayout = this.f74503a;
            TextView textView = this.f74509g;
            int i11 = f74495k;
            RelativeLayout.LayoutParams layoutParamsA2 = ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14});
            layoutParamsA2.addRule(3, i11);
            relativeLayout.addView(textView, layoutParamsA2);
            int i12 = f74499o;
            RelativeLayout.LayoutParams layoutParamsA3 = ii.a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15});
            layoutParamsA3.addRule(1, i12);
            layoutParamsA3.addRule(0, f74497m);
            addView(this.f74503a, layoutParamsA3);
            this.f74510h = Boolean.TRUE;
        }
    }

    public final TextView b() {
        return this.f74509g;
    }

    public final void c() {
        Typeface typeface = Typeface.DEFAULT;
        Context context = getContext();
        int i10 = f74501q;
        int i11 = f74495k;
        TextView textView = new TextView(context);
        textView.setTypeface(typeface, 1);
        textView.setTextSize(1, 16.46f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(i10);
        textView.setId(i11);
        this.f74508f = textView;
        Context context2 = getContext();
        int i12 = f74502r;
        int i13 = f74500p;
        TextView textView2 = new TextView(context2);
        textView2.setTypeface(typeface, 1);
        textView2.setTextSize(1, 12.12f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(i12);
        textView2.setId(i13);
        this.f74509g = textView2;
        this.f74508f.setText("Loading…");
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f74503a = relativeLayout;
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f74503a.addView(this.f74508f, ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]));
        RelativeLayout relativeLayout2 = this.f74503a;
        TextView textView3 = this.f74509g;
        RelativeLayout.LayoutParams layoutParamsA = ii.a(getContext(), new int[]{0, 0, 0, 0}, new int[0]);
        layoutParamsA.addRule(3, i11);
        relativeLayout2.addView(textView3, layoutParamsA);
        for (qd qdVar : this.f74511i.values()) {
            Context context3 = getContext();
            String str = qdVar.f75436d;
            Bitmap bitmapB = f2.b(context3, str);
            if (bitmapB == null) {
                bitmapB = f2.b(context3, str);
            }
            if (bitmapB != null) {
                qdVar.f75433a = Bitmap.createScaledBitmap(bitmapB, ii.a(getContext(), qdVar.f75434b), ii.a(getContext(), qdVar.f75435c), true);
            }
        }
        Context context4 = getContext();
        Bitmap bitmap = ((qd) this.f74511i.get("X")).f75433a;
        int i14 = f74496l;
        ImageView imageView = new ImageView(context4);
        imageView.setImageBitmap(bitmap);
        imageView.setId(i14);
        this.f74504b = imageView;
        Context context5 = getContext();
        Bitmap bitmap2 = ((qd) this.f74511i.get("BROWSER")).f75433a;
        int i15 = f74497m;
        ImageView imageView2 = new ImageView(context5);
        imageView2.setImageBitmap(bitmap2);
        imageView2.setId(i15);
        this.f74506d = imageView2;
        Context context6 = getContext();
        Bitmap bitmap3 = ((qd) this.f74511i.get("BACK")).f75433a;
        int i16 = f74498n;
        ImageView imageView3 = new ImageView(context6);
        imageView3.setImageBitmap(bitmap3);
        imageView3.setId(i16);
        this.f74507e = imageView3;
        Context context7 = getContext();
        Bitmap bitmap4 = ((qd) this.f74511i.get("FORWARD")).f75433a;
        int i17 = f74499o;
        ImageView imageView4 = new ImageView(context7);
        imageView4.setImageBitmap(bitmap4);
        imageView4.setId(i17);
        this.f74505c = imageView4;
        int iA = ii.a(getContext(), 10);
        this.f74505c.setPadding(iA, iA, iA, iA);
        this.f74505c.setEnabled(false);
        this.f74507e.setPadding(iA, iA, iA, iA);
        addView(this.f74504b, ii.a(getContext(), new int[]{0, 0, 16, 0}, new int[]{15, 11}));
        View view = this.f74506d;
        RelativeLayout.LayoutParams layoutParamsA2 = ii.a(getContext(), new int[]{0, 0, 17, 0}, new int[]{15});
        layoutParamsA2.addRule(0, i14);
        addView(view, layoutParamsA2);
        View view2 = this.f74503a;
        RelativeLayout.LayoutParams layoutParamsA3 = ii.a(getContext(), new int[]{16, 6, 16, 0}, new int[]{9});
        layoutParamsA3.addRule(0, i15);
        addView(view2, layoutParamsA3);
    }

    public final void d() {
        setDescendantFocusability(262144);
        setBackgroundColor(Color.parseColor("#e9e9e9"));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, ii.a(getContext(), 60)));
        setId(f74494j);
        HashMap map = new HashMap();
        map.put("BACK", new qd(14, 22, "back_.png"));
        map.put("BACK_DARK", new qd(14, 22, "back_dark.png"));
        map.put("FORWARD", new qd(14, 22, "forward_.png"));
        map.put("FORWARD_DARK", new qd(14, 22, "forward_dark.png"));
        map.put("X", new qd(23, 23, "x_dark.png"));
        map.put("BROWSER", new qd(28, 28, "browser_icon_dark.png"));
        this.f74511i = map;
    }

    public final void e() {
        this.f74511i = null;
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.f74504b.setOnClickListener(onClickListener);
        this.f74507e.setOnClickListener(onClickListener);
        this.f74505c.setOnClickListener(onClickListener);
        this.f74506d.setOnClickListener(onClickListener);
    }

    public final TextView a() {
        return this.f74508f;
    }
}
