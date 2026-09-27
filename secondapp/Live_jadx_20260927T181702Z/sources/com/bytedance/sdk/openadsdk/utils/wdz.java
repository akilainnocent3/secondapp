package com.bytedance.sdk.openadsdk.utils;

import a2.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class wdz {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private static boolean f37701ed = true;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static int f37702hu = -1;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static int f37703hv = -1;
    private static float hww = -1.0f;
    private static float nod = -1.0f;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private static final Object f37704ny = new Object();

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private static ViewConfiguration f37705ok = null;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private static int f37706rs = -1;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static float f37707sd = -1.0f;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static int f37708tq = -1;
    private static WindowManager vgm = null;
    private static Boolean vhb = null;
    private static int vy = -1;

    public static boolean bs(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            return (string == null || TextUtils.isEmpty(string)) ? false : true;
        } catch (Exception unused) {
        }
    }

    public static int ed(Context context) {
        return ((Integer) vhb(context).first).intValue();
    }

    public static int hu(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.bs.hww();
        }
        if (context == null) {
            return f37702hu;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            f37702hu = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return f37702hu;
    }

    public static int hv(Context context) {
        hww(context);
        return f37703hv;
    }

    private static boolean hww(int i10) {
        return i10 == 0 || i10 == 8 || i10 == 4;
    }

    public static boolean jpb(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean khx(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int nod(Context context) {
        hww(context);
        return f37708tq;
    }

    public static int ny(Context context) {
        return ((Integer) vhb(context).second).intValue();
    }

    public static float ok(Context context) {
        hww(context, true);
        return hww;
    }

    public static float rs(Context context) {
        hww(context);
        return f37707sd;
    }

    private static boolean sd() {
        return hww < 0.0f || f37708tq < 0 || f37707sd < 0.0f || vy < 0 || f37703hv < 0;
    }

    public static int vgm(Context context) {
        hww(context);
        return sd(context, f37703hv);
    }

    public static Pair<Integer, Integer> vhb(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.bs.hww();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static int vy(Context context) {
        hww(context);
        return sd(context, vy);
    }

    public static boolean weu(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean wgt(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    public static void hww(Context context) {
        hww(context, false);
    }

    public static int sd(Context context, float f10) {
        hww(context, true);
        float fOk = ok(context);
        if (fOk <= 0.0f) {
            fOk = 1.0f;
        }
        return (int) ((f10 / fOk) + 0.5f);
    }

    public static int tq(Context context, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return Float.valueOf(hww(context, f10, true)).intValue();
    }

    public static void hv(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.wdz.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    wdz.hww(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static void hww(Context context, boolean z10) {
        Context contextHww = context == null ? com.bytedance.sdk.openadsdk.core.bs.hww() : context;
        if (contextHww == null) {
            return;
        }
        vgm = (WindowManager) contextHww.getSystemService("window");
        if (sd() || z10) {
            DisplayMetrics displayMetrics = contextHww.getResources().getDisplayMetrics();
            hww = displayMetrics.density;
            f37708tq = displayMetrics.densityDpi;
            f37707sd = displayMetrics.scaledDensity;
            vy = displayMetrics.widthPixels;
            f37703hv = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i10 = vy;
            int i11 = f37703hv;
            if (i10 > i11) {
                vy = i11;
                f37703hv = i10;
            }
        } else {
            int i12 = vy;
            int i13 = f37703hv;
            if (i12 < i13) {
                vy = i13;
                f37703hv = i12;
            }
        }
        f37702hu = configuration.smallestScreenWidthDp;
    }

    public static int[] tq(Context context) {
        if (context == null) {
            return null;
        }
        if (vgm == null) {
            vgm = (WindowManager) com.bytedance.sdk.openadsdk.core.bs.hww().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = vgm;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i10 = point.x;
                i11 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i10;
            iArr[1] = i11;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static void vgm(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static boolean vy(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static int sd(Context context) {
        hww(context);
        return vy;
    }

    public static boolean vy(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    f37701ed = false;
                } else {
                    displayCutout = null;
                }
                if (displayCutout != null) {
                    return true;
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.omn.sd("UIUtils", e10.getMessage());
            }
        }
        return false;
    }

    @Nullable
    public static int[] sd(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static void hu(View view) {
        if (view == null) {
            return;
        }
        hww(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.wdz.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static boolean sd(Activity activity) {
        if (vhb == null) {
            synchronized (f37704ny) {
                try {
                    if (vhb == null) {
                        String strHww = com.bytedance.sdk.openadsdk.kv.hww.hww("cutout_devices", "");
                        String str = Build.MODEL;
                        if (!TextUtils.isEmpty(strHww) && !TextUtils.isEmpty(str)) {
                            try {
                                JSONArray jSONArray = new JSONArray(strHww);
                                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                    if (str.equals(jSONArray.getString(i10))) {
                                        vhb = Boolean.TRUE;
                                        return true;
                                    }
                                }
                            } catch (Exception e10) {
                                com.bytedance.sdk.component.utils.omn.sd("UIUtils", e10.getMessage());
                            }
                        }
                        vhb = Boolean.valueOf(vy(activity) || hww("ro.miui.notch", activity) == 1 || khx(activity) || jpb(activity) || weu(activity) || wgt(activity) || bs(activity));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vhb.booleanValue();
    }

    public static float hww(Context context, float f10) {
        hww(context);
        return f10 * rs(context);
    }

    public static int[] tq(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static float hww(Context context, float f10, boolean z10) {
        hww(context);
        return (f10 * ok(context)) + (z10 ? 0.5f : 0.0f);
    }

    public static void tq(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(a.b.f3536f);
            activity.getWindow().clearFlags(a.b.f3536f);
        } catch (Exception unused) {
        }
    }

    @Nullable
    public static int[] hww(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static boolean tq() {
        return f37701ed && Build.VERSION.SDK_INT >= 28;
    }

    private static Bitmap tq(com.bytedance.sdk.component.rs.hu huVar) {
        if (huVar == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(huVar.getWidth(), huVar.getHeight(), Bitmap.Config.RGB_565);
            huVar.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void hww(View view, int i10) {
        if (view == null || view.getVisibility() == i10 || !hww(i10)) {
            return;
        }
        view.setVisibility(i10);
    }

    public static void hww(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sd(final com.bytedance.sdk.openadsdk.core.model.kub kubVar, String str, String str2, final Bitmap bitmap, final String str3, final long j10) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.vy.sd.hww(System.currentTimeMillis(), kubVar, str, str2, new com.bytedance.sdk.openadsdk.wgt.sd.hww() { // from class: com.bytedance.sdk.openadsdk.utils.wdz.4
                        @Override // com.bytedance.sdk.openadsdk.wgt.sd.hww, com.bytedance.sdk.openadsdk.wgt.sd.tq
                        public JSONObject sd() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int iHww = wdz.hww(bitmap);
                                jSONObject.put("url", str3);
                                long j11 = j10;
                                if (j11 != -1) {
                                    jSONObject.put("page_id", j11);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iHww == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.za.tq(kubVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.ed.sd.hww.hww().hww(kubVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.omn.sd("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th2)));
            }
        }
    }

    public static void hww(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        hww(view, (ViewGroup.MarginLayoutParams) layoutParams, i10, i11, i12, i13);
    }

    private static ArrayList<Integer> tq(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = iArr[i11];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i12) >> 16, (65280 & i12) >> 8, i12 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void hww(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
            return;
        }
        if (i10 != -3) {
            marginLayoutParams.leftMargin = i10;
        }
        if (i11 != -3) {
            marginLayoutParams.topMargin = i11;
        }
        if (i12 != -3) {
            marginLayoutParams.rightMargin = i12;
        }
        if (i13 != -3) {
            marginLayoutParams.bottomMargin = i13;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void tq(View view, final float f10) {
        if (view != null && f10 > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.wdz.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f10);
                }
            });
            view.setClipToOutline(true);
        }
    }

    private static Bitmap hww(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.omn.sd("UIUtils", th2.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static float hww() {
        float f10 = nod;
        if (f10 > 0.0f) {
            return f10;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.bs.hww().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        nod = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void hww(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(a.b.f3536f);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.omn.sd("UIUtils", e10.getMessage());
        }
    }

    public static int hww(String str, Activity activity) {
        if (aed.hv()) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e10) {
                com.bytedance.sdk.component.utils.omn.sd("UIUtils", e10.getMessage());
            } catch (IllegalAccessException e11) {
                com.bytedance.sdk.component.utils.omn.sd("UIUtils", e11.getMessage());
            } catch (IllegalArgumentException e12) {
                com.bytedance.sdk.component.utils.omn.sd("UIUtils", e12.getMessage());
            } catch (NoSuchMethodException e13) {
                com.bytedance.sdk.component.utils.omn.sd("UIUtils", e13.getMessage());
            } catch (InvocationTargetException e14) {
                com.bytedance.sdk.component.utils.omn.sd("UIUtils", e14.getMessage());
            }
        }
        return 0;
    }

    public static void hww(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.omn.sd("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void hww(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.omn.sd("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void hww(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
    }

    public static void hww(TextView textView, com.bytedance.sdk.openadsdk.core.widget.wgt wgtVar, com.bytedance.sdk.openadsdk.core.model.kub kubVar) {
        hww(textView, wgtVar, kubVar, 14);
    }

    public static void hww(TextView textView, com.bytedance.sdk.openadsdk.core.widget.wgt wgtVar, com.bytedance.sdk.openadsdk.core.model.kub kubVar, int i10) {
        hww(textView, wgtVar, (kubVar == null || kubVar.eow() == null) ? -1.0d : kubVar.eow().vy(), i10);
    }

    public static void hww(TextView textView, com.bytedance.sdk.openadsdk.core.widget.wgt wgtVar, double d10, int i10) {
        if (d10 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            wgtVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d10)));
            }
            hww(wgtVar, d10, i10);
        }
    }

    public static void hww(com.bytedance.sdk.openadsdk.core.widget.wgt wgtVar, double d10, int i10) {
        if (d10 < 0.0d) {
            wgtVar.setVisibility(8);
        } else {
            wgtVar.setVisibility(0);
            wgtVar.hww(d10, i10);
        }
    }

    public static Bitmap hww(com.bytedance.sdk.component.rs.hu huVar) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        WebView webView = huVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapTq = tq(huVar);
        if (bitmapTq == null) {
            bitmapTq = hww(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapTq == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.vy.hww(bitmapTq, bitmapTq.getWidth() / 6, bitmapTq.getHeight() / 6);
    }

    public static void hww(final com.bytedance.sdk.openadsdk.core.model.kub kubVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j10) {
        syb.tq(new com.bytedance.sdk.component.ok.ok("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.wdz.3
            @Override // java.lang.Runnable
            public void run() {
                wdz.sd(kubVar, str, str2, bitmap, str3, j10);
            }
        }, 10);
    }

    public static int hww(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListTq = tq(bitmap);
            if (arrayListTq == null) {
                return -1;
            }
            HashMap map = new HashMap();
            for (Integer num : arrayListTq) {
                if (map.containsKey(num)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(num)).intValue() + 1);
                    map.remove(num);
                    map.put(num, numValueOf);
                } else {
                    map.put(num, 1);
                }
            }
            int iIntValue = 0;
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i10 < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i10 = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i10 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean hww(float f10, float f11, Context context) {
        if (f10 != -1.0f && f11 != -1.0f) {
            if (f37705ok == null) {
                f37705ok = ViewConfiguration.get(context);
            }
            if (f37706rs == -1) {
                f37706rs = f37705ok.getScaledTouchSlop();
            }
            if (f10 - f11 > f37706rs) {
                return true;
            }
        }
        return false;
    }

    public static void hww(boolean z10) {
        vhb = Boolean.valueOf(z10);
    }
}
