package com.startapp.sdk.ads.banner.banner3d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.internal.d1;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.json.RatingBar;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.startappsdk.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class Banner3DView extends RelativeLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f73989g = R.id.io_start_banner_photo;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f73990h = R.id.io_start_banner_title;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f73991i = R.id.io_start_banner_description;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f73992j = R.id.io_start_banner_download;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f73993k = R.id.io_start_banner_rating;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f73994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f73995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f73996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RatingBar f73997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f73998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Point f73999f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Template {
        /* JADX INFO: Fake field, exist only in values array */
        XS,
        S,
        M,
        L,
        XL
    }

    public Banner3DView(Context context) {
        super(context);
        a();
    }

    private void a() {
        Context context = getContext();
        Template template = Template.S;
        int i10 = this.f73999f.x;
        Banner3DSize.Size size = Banner3DSize.Size.SMALL;
        if (i10 > size.getSize().getWidth() || this.f73999f.y > size.getSize().getHeight()) {
            template = Template.M;
        }
        int i11 = this.f73999f.x;
        Banner3DSize.Size size2 = Banner3DSize.Size.MEDIUM;
        if (i11 > size2.getSize().getWidth() || this.f73999f.y > size2.getSize().getHeight()) {
            template = Template.L;
        }
        int i12 = this.f73999f.x;
        Banner3DSize.Size size3 = Banner3DSize.Size.LARGE;
        if (i12 > size3.getSize().getWidth() || this.f73999f.y > size3.getSize().getHeight()) {
            template = Template.XL;
        }
        setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.k().p(), AdsCommonMetaData.k().o()}));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int iA = ii.a(context, 2);
        int iRound = Math.round(TypedValue.applyDimension(1, 3, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 4, context.getResources().getDisplayMetrics()));
        int iRound2 = Math.round(TypedValue.applyDimension(1, 5, context.getResources().getDisplayMetrics()));
        int iRound3 = Math.round(TypedValue.applyDimension(1, 6, context.getResources().getDisplayMetrics()));
        int iRound4 = Math.round(TypedValue.applyDimension(1, 8, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 10, context.getResources().getDisplayMetrics()));
        int iRound5 = Math.round(TypedValue.applyDimension(1, 20, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 84, context.getResources().getDisplayMetrics()));
        int iRound6 = Math.round(TypedValue.applyDimension(1, 90, context.getResources().getDisplayMetrics()));
        setPadding(iRound2, 0, iRound2, 0);
        setTag(this);
        ImageView imageView = new ImageView(context);
        this.f73996c = imageView;
        int i13 = f73989g;
        imageView.setId(i13);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iRound6, iRound6);
        layoutParams.addRule(15);
        this.f73996c.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        this.f73994a = textView;
        int i14 = f73990h;
        textView.setId(i14);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17, i13);
        layoutParams2.addRule(14);
        this.f73994a.setLayoutParams(layoutParams2);
        this.f73994a.setTextColor(AdsCommonMetaData.k().q().intValue());
        this.f73994a.setGravity(8388611);
        this.f73994a.setBackgroundColor(0);
        int iOrdinal = template.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f73994a.setTextSize(17.0f);
            this.f73994a.setPadding(iRound, 0, 0, iA);
            layoutParams2.width = ii.a(getContext(), (int) (((double) this.f73999f.x) * 0.55d));
        } else if (iOrdinal == 2) {
            this.f73994a.setTextSize(17.0f);
            this.f73994a.setPadding(iRound, 0, 0, iA);
            layoutParams2.width = ii.a(getContext(), (int) (((double) this.f73999f.x) * 0.65d));
        } else if (iOrdinal == 3 || iOrdinal == 4) {
            this.f73994a.setTextSize(22.0f);
            this.f73994a.setPadding(iRound, 0, 0, iRound2);
        }
        this.f73994a.setSingleLine(true);
        this.f73994a.setEllipsize(TextUtils.TruncateAt.END);
        ii.a(this.f73994a, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context);
        this.f73995b = textView2;
        int i15 = f73991i;
        textView2.setId(i15);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(17, i13);
        layoutParams3.addRule(3, i14);
        layoutParams3.setMargins(0, 0, 0, iRound2);
        this.f73995b.setLayoutParams(layoutParams3);
        this.f73995b.setTextColor(AdsCommonMetaData.k().l().intValue());
        this.f73995b.setTextSize(18.0f);
        this.f73995b.setMaxLines(2);
        this.f73995b.setLines(2);
        this.f73995b.setSingleLine(false);
        this.f73995b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f73995b.setHorizontallyScrolling(true);
        this.f73995b.setPadding(iRound, 0, 0, 0);
        RatingBar ratingBar = new RatingBar(getContext());
        this.f73997d = ratingBar;
        ratingBar.setId(f73993k);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int iOrdinal2 = template.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
            layoutParams4.addRule(17, i13);
            layoutParams4.addRule(8, i13);
        } else if (iOrdinal2 == 3 || iOrdinal2 == 4) {
            layoutParams4.addRule(17, i14);
            layoutParams3.width = ii.a(getContext(), (int) (((double) this.f73999f.x) * 0.6d));
        }
        layoutParams4.setMargins(iRound, iRound4, iRound, 0);
        this.f73997d.setLayoutParams(layoutParams4);
        this.f73998e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        int iOrdinal3 = template.ordinal();
        if (iOrdinal3 == 0 || iOrdinal3 == 1 || iOrdinal3 == 2) {
            this.f73998e.setTextSize(13.0f);
            layoutParams5.addRule(17, i14);
            layoutParams5.addRule(15);
        } else if (iOrdinal3 == 3) {
            layoutParams5.addRule(17, i15);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(iRound5, 0, 0, 0);
            this.f73998e.setTextSize(26.0f);
        } else if (iOrdinal3 == 4) {
            layoutParams5.addRule(17, i15);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(iRound5 * 7, 0, 0, 0);
            this.f73998e.setTextSize(26.0f);
        }
        this.f73998e.setPadding(iRound3, iRound3, iRound3, iRound3);
        this.f73998e.setLayoutParams(layoutParams5);
        setButtonText(false);
        this.f73998e.setTextColor(-1);
        this.f73998e.setTypeface(null, 1);
        this.f73998e.setId(f73992j);
        this.f73998e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f73998e.setBackgroundDrawable(new d1(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
        addView(this.f73996c);
        addView(this.f73994a);
        int iOrdinal4 = template.ordinal();
        if (iOrdinal4 == 0 || iOrdinal4 == 1 || iOrdinal4 == 2) {
            addView(this.f73998e);
        } else if (iOrdinal4 == 3 || iOrdinal4 == 4) {
            addView(this.f73998e);
            addView(this.f73995b);
        }
        addView(this.f73997d);
    }

    @SuppressLint({"SetTextI18n"})
    public void setButtonText(boolean z10) {
        if (z10) {
            this.f73998e.setText("OPEN");
        } else {
            this.f73998e.setText("DOWNLOAD");
        }
    }

    @SuppressLint({"SetTextI18n"})
    public void setDescription(String str) {
        if (str != null) {
            if (str.compareTo("") != 0) {
                String[] strArrA = a(str);
                String str2 = strArrA[0];
                String str3 = strArrA[1];
                String str4 = str3 != null ? a(str3)[0] : "";
                if (str.length() >= 110) {
                    str4 = str4 + "...";
                }
                this.f73995b.setText(str2 + IOUtils.LINE_SEPARATOR_UNIX + str4);
            }
        }
    }

    public void setImage(Bitmap bitmap) {
        this.f73996c.setImageBitmap(bitmap);
    }

    public void setRating(float f10) {
        try {
            this.f73997d.setRating(f10);
        } catch (NullPointerException unused) {
        }
    }

    public void setText(String str) {
        this.f73994a.setText(str);
    }

    public void setImage(int i10, int i11, int i12) {
        this.f73996c.setImageResource(i10);
        ViewGroup.LayoutParams layoutParams = this.f73996c.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i12;
        this.f73996c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, Point point) {
        super(context);
        this.f73999f = point;
        a();
    }

    public Banner3DView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setImage(Bitmap bitmap, int i10, int i11) {
        this.f73996c.setImageBitmap(bitmap);
        ViewGroup.LayoutParams layoutParams = this.f73996c.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f73996c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    private static String[] a(String str) {
        boolean z10;
        String[] strArr = new String[2];
        if (str.length() > 55) {
            char[] charArray = str.substring(0, 55).toCharArray();
            int length = charArray.length;
            int i10 = length - 1;
            int i11 = length - 2;
            while (true) {
                if (i11 <= 0) {
                    z10 = false;
                    break;
                }
                if (charArray[i11] == ' ') {
                    z10 = true;
                    i10 = i11;
                    break;
                }
                i11--;
            }
            int i12 = z10 ? i10 : 55;
            strArr[0] = str.substring(0, i12);
            strArr[1] = str.substring(i12 + 1);
            return strArr;
        }
        strArr[0] = str;
        strArr[1] = null;
        return strArr;
    }
}
