package com.cleveradssolutions.adapters.exchange.rendering.utils.helpers;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.session.fe;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f42531a = "zx";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static float f42532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f42533c = {"tel:", "voicemail:", "sms:", t1.c.f135976b, "geo:", "google.streetview:", "market:"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f42534d = {"3gp", "mp4", "ts", "webm", "mkv"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f42535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f42536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f42537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f42538h;

    static {
        int iGenerateViewId = View.generateViewId();
        f42535e = iGenerateViewId;
        int iGenerateViewId2 = View.generateViewId();
        f42536f = iGenerateViewId2;
        int iGenerateViewId3 = View.generateViewId();
        f42537g = iGenerateViewId3;
        f42538h = new int[]{iGenerateViewId, iGenerateViewId2, iGenerateViewId3, com.cleveradssolutions.adapters.exchange.a.b.f42009e, com.cleveradssolutions.adapters.exchange.a.b.f42010f};
    }

    public static boolean A() {
        return g(14);
    }

    public static boolean B(int i10) {
        return i10 == 0;
    }

    public static boolean C(int i10, int i11) {
        return B(i10) != B(i11);
    }

    public static boolean D(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i10 = 0; i10 < length; i10++) {
                if (!Character.isWhitespace(charSequence.charAt(i10))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int b(int i10, Context context) {
        return (int) (i10 / (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    public static int c(WindowManager windowManager) {
        if (windowManager == null) {
            return 0;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static long d(String str) {
        Date date;
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            date = simpleDateFormat.parse(str);
        } catch (ParseException e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42531a, "Unable to convert the videoDuration into seconds: " + e10.getMessage());
            date = null;
        }
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    public static View e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setId(f42537g);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(com.cleveradssolutions.adapters.exchange.a.C0420a.f41994d);
        int iT = t(15, context);
        linearLayout.addView(imageView, iT, iT);
        final TextView textView = new TextView(context);
        textView.setVisibility(8);
        textView.setTextColor(-1);
        textView.setTextSize(8.0f);
        int iT2 = t(3, context);
        textView.setPadding(iT2, 0, iT2, 0);
        textView.setBackgroundResource(com.cleveradssolutions.adapters.exchange.a.C0420a.f41991a);
        textView.setText(wc.d.f142737v);
        linearLayout.addView(textView, -2, iT);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, iT);
        layoutParams.gravity = 8388691;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.z(textView, view);
            }
        });
        return linearLayout;
    }

    public static boolean f() {
        return g(19);
    }

    public static boolean g(int i10) {
        return Build.VERSION.SDK_INT >= i10;
    }

    public static boolean h(CharSequence charSequence) {
        return !D(charSequence);
    }

    public static View i(Context context) {
        return w(context, com.cleveradssolutions.adapters.exchange.a.C0420a.f42002l, f42536f);
    }

    public static boolean j() {
        return g(29);
    }

    public static boolean k(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f42533c) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int l() {
        return new Random().nextInt(Integer.MAX_VALUE);
    }

    public static int m(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int iMin = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            if (iMin > 0) {
                return iMin;
            }
        } catch (Exception unused) {
        }
        DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
        return Math.min(displayMetrics2.heightPixels, displayMetrics2.widthPixels);
    }

    public static boolean n(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("<VAST\\s.*version\\s*=\\s*[\"'].*[\"'](\\s.*|)?>").matcher(str).find();
    }

    public static boolean o() {
        boolean z10;
        boolean z11;
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState)) {
            if ("mounted_ro".equals(externalStorageState)) {
                z11 = false;
                z10 = true;
            } else {
                z10 = false;
            }
            return !z10 && z11;
        }
        z10 = true;
        z11 = z10;
        if (z10) {
        }
    }

    public static boolean p(String str) {
        if (!TextUtils.isEmpty(str)) {
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
            if (!TextUtils.isEmpty(extensionFromMimeType)) {
                for (String str2 : f42534d) {
                    if (extensionFromMimeType.equalsIgnoreCase(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String q(String str) {
        if (h(str)) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b10)));
                }
                return sb2.toString();
            } catch (NoSuchAlgorithmException e10) {
                e10.printStackTrace();
            }
        }
        return "";
    }

    public static com.cleveradssolutions.adapters.exchange.rendering.networking.c.b r(String str) {
        if (D(str)) {
            return null;
        }
        try {
            URL url = new URL(str);
            com.cleveradssolutions.adapters.exchange.rendering.networking.c.b bVar = new com.cleveradssolutions.adapters.exchange.rendering.networking.c.b();
            bVar.f42411a = url.getProtocol() + "://" + url.getAuthority() + url.getPath();
            bVar.f42412b = url.getQuery();
            return bVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int s(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int t(int i10, Context context) {
        return (int) (i10 * (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    public static int u(WindowManager windowManager) {
        if (windowManager == null) {
            return 0;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static View v(Context context) {
        return w(context, com.cleveradssolutions.adapters.exchange.a.C0420a.f41999i, f42535e);
    }

    public static View w(Context context, int i10, int i11) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.setId(i11);
        int iT = t(15, context);
        imageView.setPadding(iT, iT, iT, iT);
        FrameLayout.LayoutParams layoutParamsX = x(imageView, 0.0d);
        layoutParamsX.gravity = 8388661;
        imageView.setLayoutParams(layoutParamsX);
        g.e(imageView);
        return imageView;
    }

    public static FrameLayout.LayoutParams x(View view, double d10) {
        Context context = view.getContext();
        if (d10 < 0.05d || d10 > 1.0d) {
            return new FrameLayout.LayoutParams(-2, -2);
        }
        int iM = (int) (((double) m(context)) * d10);
        if (b(iM, context) < 25) {
            iM = t(25, context);
        }
        int i10 = (int) (((double) iM) * 0.2d);
        view.setPadding(i10, i10, i10, i10);
        return new FrameLayout.LayoutParams(iM, iM);
    }

    public static String y(String str) {
        String lastPathSegment;
        int iLastIndexOf;
        return (str == null || (lastPathSegment = Uri.parse(str).getLastPathSegment()) == null || (iLastIndexOf = lastPathSegment.lastIndexOf(fe.F)) == -1) ? "" : lastPathSegment.substring(iLastIndexOf);
    }

    public static /* synthetic */ void z(TextView textView, View view) {
        if (textView.getVisibility() == 8) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }
}
