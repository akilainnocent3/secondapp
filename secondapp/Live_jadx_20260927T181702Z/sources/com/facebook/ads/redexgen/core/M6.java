package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Arrays;
import java.util.List;
import l3.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class M6 extends LinearLayout implements InterfaceC2543av {
    public static byte[] A0E;
    public static String[] A0F = {"SfnKd94fp0LIHLn5JRYBcVoydcWvvWC", "zcIUR0bnd2fDOpnzxhHInmQw6nqRGEtO", "", "Rlzv6bB7Czucpp1t79MjvCXFuIOZg8dc", "c1MACJD11uXVhN3Ickl6ZqMudEgzXQA", "WTgVZUaV9yT0hbCJXLqGbS", "77CVi", "3ZIeaeVMqGSC8jDTqrHFXNca0PmxnycW"};
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final Uri A0L;
    public static final View.OnTouchListener A0M;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public C2535an A05;
    public InterfaceC2542au A06;
    public String A07;
    public final WebView A08;
    public final C2900gi A09;
    public final InterfaceC2539ar A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0E = new byte[]{-23, 8, 10, c.f161643u, -114, -73, -70, -66, -80, -22, 19, c.f161648z, c.E, 5, c.f161648z, 8, -74, -41, -52, -43, -121, -43, -56, -37, -48, -35, -52, -121, a.f103493v7, a.E7, -42, -34, a.B7, -52, a.E7, -6, -5, 8, c.f161638p, 13, -45, -5, 5, -6, 7, 4, c.A, 36, c.D, 40, 37, 31, c.D, -28, 31, 36, 42, c.E, 36, 42, -28, c.A, c.C, 42, 31, 37, 36, -28, c.f161636n, -1, -5, 13, c.f161643u, c.H, 28, -35, c.f161640r, c.G, 19, 33, c.H, c.B, 19, -35, c.f161643u, c.A, 33, c.H, 28, c.f161646x, -68, -56, -56, -60, -114, -125, -125, a.f103511x7, a.f103511x7, a.f103511x7, -126, -70, -75, -73, -71, -74, a.f103460r7, a.f103460r7, -65, -126, -73, a.f103460r7, a.f103444p7};
    }

    static {
        A0A();
        A0I = Color.rgb(224, 224, 224);
        A0L = XB.A00(A06(90, 23, 25));
        A0M = new ViewOnTouchListenerC2524ac();
        A0K = Color.argb(34, 0, 0, 0);
        A0G = XV.A0P;
        A0H = XV.A0I;
        A0J = XV.A0A;
    }

    public M6(C2900gi c2900gi, WebView webView) {
        this(c2900gi, webView, false, false);
    }

    public M6(C2900gi c2900gi, WebView webView, boolean z10, boolean z11) {
        super(c2900gi);
        this.A0A = new M7(this);
        this.A08 = webView;
        this.A09 = c2900gi;
        this.A0B = AbstractC2351Uq.A06(c2900gi);
        this.A0D = z10;
        this.A0C = z11;
        A08();
        if (z11) {
            A0C(false);
        }
    }

    private void A08() {
        float f10;
        YB.A0N(this, -1);
        setGravity(16);
        this.A01 = new ImageView(this.A09);
        this.A01.setContentDescription(A06(4, 5, 16));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0G, A0G);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(YN.A01(YM.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0M);
        this.A01.setOnClickListener(new ViewOnClickListenerC2525ad(this));
        addView(this.A01, layoutParams);
        if (this.A0B && !C2350Up.A2w(this.A09)) {
            this.A00 = new ImageView(this.A09);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 108));
            ViewGroup.LayoutParams backButtonParams = new LinearLayout.LayoutParams(A0G, A0G);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(YN.A01(YM.BACK_ARROW));
            this.A00.setOnTouchListener(A0M);
            this.A00.setOnClickListener(new ViewOnClickListenerC2526ae(this));
            addView(this.A00, backButtonParams);
        }
        this.A05 = new C2535an(this.A09);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        if (this.A0B || C2350Up.A2w(this.A09)) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        layoutParams2.weight = f10;
        this.A05.setGravity(17);
        if (C2350Up.A2w(this.A09) && !this.A0D) {
            this.A04 = new LinearLayout(this.A09);
            this.A04.setOrientation(1);
            this.A04.setPadding(0, A0J, 0, A0J);
            layoutParams2.setMarginStart(0);
            addView(this.A04, layoutParams2);
            ImageView imageView = new ImageView(this.A09);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(YN.A01(YM.HANDLER));
            imageView.setPadding(0, A0H, 0, A0H);
            LinearLayout.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(imageView, closeButtonParams);
            LinearLayout.LayoutParams titleViewsParams = new LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(this.A05, titleViewsParams);
        } else {
            addView(this.A05, layoutParams2);
        }
        if (this.A0B && !C2350Up.A2w(this.A09)) {
            this.A02 = new ImageView(this.A09);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 105));
            ViewGroup.LayoutParams titleViewsParams2 = new LinearLayout.LayoutParams(A0G, A0G);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(YN.A02(YM.BACK_ARROW));
            this.A02.setOnTouchListener(A0M);
            this.A02.setOnClickListener(new ViewOnClickListenerC2527af(this));
            addView(this.A02, titleViewsParams2);
        }
        this.A03 = new ImageView(this.A09);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0G, A0G);
        this.A03.setContentDescription(A06(16, 19, 44));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0M);
        this.A03.setOnClickListener(new ViewOnClickListenerC2528ag(this));
        addView(this.A03, layoutParams3);
        A09();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    private void A09() {
        PackageManager packageManager;
        Bitmap externalBrowserBitmap = null;
        boolean zA0k = C2350Up.A0k(this.A09);
        if (!zA0k && (packageManager = this.A09.getPackageManager()) != null) {
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent(A06(46, 26, 123), A0L), 65536);
            if (listQueryIntentActivities.isEmpty()) {
                this.A03.setVisibility(8);
            } else if (listQueryIntentActivities.size() == 1) {
                ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
                String[] strArr = A0F;
                if (strArr[4].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                A0F[6] = "Y9G9nX";
                if (resolveInfo.activityInfo != null) {
                    ResolveInfo resolveInfo2 = listQueryIntentActivities.get(0);
                    if (A0F[2].length() != 9) {
                        String[] strArr2 = A0F;
                        strArr2[7] = "hqSHhnICOqiHaN8u87jsv4Qx8TBqcflH";
                        strArr2[3] = "kBU630hheaj535sYoezwG0Sk33mkxVnX";
                        if (A06(72, 18, 116).equals(resolveInfo2.activityInfo.packageName)) {
                            externalBrowserBitmap = YN.A01(YM.BROWSER_LAUNCH_CHROME);
                        } else {
                            externalBrowserBitmap = getExternalBrowserBitmap();
                        }
                    } else if (A06(72, 18, 116).equals(resolveInfo2.activityInfo.packageName)) {
                        externalBrowserBitmap = YN.A01(YM.BROWSER_LAUNCH_CHROME);
                    } else {
                        externalBrowserBitmap = getExternalBrowserBitmap();
                    }
                } else {
                    externalBrowserBitmap = getExternalBrowserBitmap();
                }
            } else {
                externalBrowserBitmap = getExternalBrowserBitmap();
            }
        }
        if (C2350Up.A2w(this.A09) || zA0k) {
            this.A03.setVisibility(0);
            externalBrowserBitmap = getExternalBrowserBitmap();
        }
        this.A03.setImageBitmap(externalBrowserBitmap);
    }

    private void A0C(boolean z10) {
        int i10 = z10 ? 0 : 8;
        ImageView imageView = this.A00;
        if (A0F[1].charAt(15) == 'W') {
            throw new RuntimeException();
        }
        A0F[2] = "nknH3C2";
        if (imageView != null) {
            this.A00.setVisibility(i10);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z10) {
        if (z10) {
            A0C(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2543av
    public InterfaceC2539ar getBrowserNavigationListener() {
        return this.A0A;
    }

    private Bitmap getExternalBrowserBitmap() {
        if (this.A0C) {
            return YN.A01(YM.BROWSER_LAUNCH_NATIVE_V2);
        }
        return YN.A01(YM.BROWSER_LAUNCH_NATIVE);
    }

    public void setCloseButtonVisibility(int i10) {
        this.A01.setVisibility(i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2543av
    public void setListener(InterfaceC2542au interfaceC2542au) {
        this.A06 = interfaceC2542au;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2543av
    public void setTitle(String str) {
        this.A05.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2543av
    public void setUrl(String str) {
        this.A07 = str;
        if (TextUtils.isEmpty(this.A07) || A06(35, 11, 94).equals(this.A07)) {
            this.A05.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0I, PorterDuff.Mode.SRC_IN));
        } else {
            this.A05.setSubtitle(this.A07);
            this.A03.setEnabled(true);
            this.A03.setColorFilter((ColorFilter) null);
        }
    }
}
