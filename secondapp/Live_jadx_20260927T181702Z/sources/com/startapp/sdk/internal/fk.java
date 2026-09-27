package com.startapp.sdk.internal;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LruCache f74839a = new LruCache(100);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f74840b = new HashSet(Arrays.asList(NotDisplayedReason.AD_CLIPPED, NotDisplayedReason.AD_WAS_COVERED));

    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r21v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r3v16, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v17, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v27 */
    public static jk a(View view, Point point, BannerOptions bannerOptions, AtomicReference atomicReference, boolean z10) {
        NotDisplayedReason notDisplayedReason;
        int iApplyDimension;
        JSONArray jSONArray;
        ?? r21;
        ?? r24;
        View view2 = view;
        AtomicReference atomicReference2 = atomicReference;
        jk jkVar = new jk();
        float f10 = 0.0f;
        Rect rect = null;
        if (view2 == null) {
            return new jk(NotDisplayedReason.INTERNAL_ERROR, 0.0f, null, null);
        }
        int width = view2.getWidth();
        if (width <= 0) {
            return new jk(NotDisplayedReason.VIEW_INVALID_SIZE, 0.0f, null, null);
        }
        int height = view2.getHeight();
        if (height <= 0) {
            return new jk(NotDisplayedReason.VIEW_INVALID_SIZE, 0.0f, null, null);
        }
        boolean z11 = true;
        if (bannerOptions.u()) {
            if (view2.getParent() == null || view2.getRootView() == null || view2.getRootView().getParent() == null) {
                notDisplayedReason = NotDisplayedReason.VIEW_NOT_ATTACHED;
            } else if (view2.isShown()) {
                notDisplayedReason = (view2.getWidth() < 1 || view2.getHeight() < 1) ? NotDisplayedReason.VIEW_INVALID_SIZE : null;
            } else {
                notDisplayedReason = NotDisplayedReason.VIEW_NOT_VISIBLE;
            }
            if (notDisplayedReason == null) {
                notDisplayedReason = null;
            }
        } else {
            notDisplayedReason = null;
        }
        if (bannerOptions.s() && notDisplayedReason == null && !view2.hasWindowFocus()) {
            notDisplayedReason = NotDisplayedReason.WINDOW_NOT_FOCUSED;
        }
        boolean zR = bannerOptions.r();
        if (!zR && !z10) {
            return jkVar;
        }
        if (point != null) {
            DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
            iApplyDimension = ((int) TypedValue.applyDimension(1, point.x, displayMetrics)) * ((int) TypedValue.applyDimension(1, point.y, displayMetrics));
        } else {
            iApplyDimension = width * height;
        }
        int iMin = (Math.min(Math.max(1, bannerOptions.h()), 100) * iApplyDimension) / 100;
        Rect rect2 = new Rect();
        if (!view2.getGlobalVisibleRect(rect2) && zR && notDisplayedReason == null) {
            notDisplayedReason = NotDisplayedReason.AD_CLIPPED;
        }
        if (rect2.isEmpty() && zR && notDisplayedReason == null) {
            notDisplayedReason = NotDisplayedReason.AD_CLIPPED;
        }
        LinkedList linkedList = new LinkedList();
        NotDisplayedReason notDisplayedReason2 = notDisplayedReason == null ? NotDisplayedReason.AD_CLIPPED : notDisplayedReason;
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        view2.getGlobalVisibleRect(rect3);
        Region region = new Region(rect3);
        atomicReference2.set(a(view2, rect2, true));
        ?? r10 = view2;
        while (true) {
            int i10 = 0;
            if (!(r10.getParent() instanceof ViewGroup)) {
                break;
            }
            if (bannerOptions.t() && r10.getVisibility() != 0 && notDisplayedReason2 == NotDisplayedReason.AD_CLIPPED) {
                notDisplayedReason2 = NotDisplayedReason.VIEW_NOT_VISIBLE;
            }
            if (bannerOptions.q() && r10.getAlpha() < 1.0f && notDisplayedReason2 == NotDisplayedReason.AD_CLIPPED) {
                notDisplayedReason2 = NotDisplayedReason.VIEW_TRANSPARENT;
            }
            ?? r11 = (ViewGroup) r10.getParent();
            JSONObject jSONObjectA = a(r11, ((r11.getParent() instanceof ViewGroup) || !r11.getGlobalVisibleRect(rect4)) ? rect : rect4, false);
            float f11 = f10;
            JSONObject jSONObject = (JSONObject) atomicReference2.get();
            JSONArray jSONArrayOptJSONArray = jSONObjectA.optJSONArray("children");
            boolean z12 = z11;
            if (jSONArrayOptJSONArray == null) {
                jSONArray = new JSONArray();
                try {
                    jSONObjectA.put("children", jSONArray);
                } catch (JSONException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                jSONArray = jSONArrayOptJSONArray;
            }
            jSONArray.put(jSONObject);
            atomicReference2.set(jSONObjectA);
            int iIndexOfChild = r11.indexOfChild(r10);
            int childCount = r11.getChildCount();
            ?? r12 = r10;
            ?? r13 = r11;
            while (i10 < childCount) {
                View childAt = r13.getChildAt(i10);
                if (childAt == r12) {
                    r21 = r12;
                    r24 = r13;
                } else {
                    r21 = r12;
                    r24 = r13;
                    int iCompare = Float.compare(childAt.getZ(), r21.getZ());
                    if (iCompare >= 0 && ((iCompare != 0 || i10 > iIndexOfChild) && childAt.getVisibility() == 0 && childAt.getAlpha() > f11 && childAt.getGlobalVisibleRect(rect4) && Rect.intersects(rect3, rect4))) {
                        region.op(rect4, Region.Op.DIFFERENCE);
                        linkedList.add(new Rect(rect4));
                        JSONObject jSONObjectA2 = a(childAt, rect4, false);
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectA.optJSONArray("children");
                        if (jSONArrayOptJSONArray2 == null) {
                            jSONArrayOptJSONArray2 = new JSONArray();
                            try {
                                jSONObjectA.put("children", jSONArrayOptJSONArray2);
                            } catch (JSONException e11) {
                                throw new RuntimeException(e11);
                            }
                        }
                        jSONArrayOptJSONArray2.put(jSONObjectA2);
                        if (notDisplayedReason2 == NotDisplayedReason.AD_CLIPPED && notDisplayedReason != null) {
                            notDisplayedReason2 = NotDisplayedReason.AD_WAS_COVERED;
                        }
                    }
                }
                i10++;
                r12 = r21;
                r13 = r24;
            }
            atomicReference2 = atomicReference;
            r10 = r13;
            f10 = f11;
            z11 = z12;
            rect = null;
        }
        RegionIterator regionIterator = new RegionIterator(region);
        int iHeight = 0;
        while (regionIterator.next(rect4)) {
            iHeight += (rect4.height() + 1) * (rect4.width() + 1);
        }
        return new jk((iHeight >= iMin && f74840b.contains(notDisplayedReason2) && notDisplayedReason == null) ? null : notDisplayedReason2, iHeight / iApplyDimension, region.getBounds(), (Rect[]) linkedList.toArray(new Rect[0]));
    }

    public static String b(View view) {
        String name = view.getClass().getName();
        if (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("com.android.")) {
            return view.getClass().getSimpleName();
        }
        String packageName = view.getContext().getPackageName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(packageName);
        sb2.append(androidx.media3.session.fe.F);
        return name.startsWith(sb2.toString()) ? name.substring(packageName.length()) : name;
    }

    public static JSONObject a(View view, Rect rect, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(sc.c.f129750g, b(view));
            String strA = a(view);
            if (strA != null) {
                jSONObject.put("id", strA);
            }
            if (z10) {
                jSONObject.put("target", true);
            }
            if (view.getAlpha() < 1.0f) {
                jSONObject.put("alpha", view.getAlpha());
            }
            if (rect != null) {
                jSONObject.put("left", rect.left);
                jSONObject.put("top", rect.top);
                jSONObject.put("right", rect.right);
                jSONObject.put("bottom", rect.bottom);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String a(View view) {
        int id2 = view.getId();
        if (id2 == -1 || id2 == 0) {
            return null;
        }
        LruCache lruCache = f74839a;
        synchronized (lruCache) {
            try {
                String str = (String) lruCache.get(Integer.valueOf(id2));
                if (str != null) {
                    return str;
                }
                try {
                    return view.getContext().getResources().getResourceName(id2);
                } catch (Resources.NotFoundException unused) {
                    String str2 = "0x" + Integer.toHexString(id2);
                    LruCache lruCache2 = f74839a;
                    synchronized (lruCache2) {
                        lruCache2.put(Integer.valueOf(id2), str2);
                        return str2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
