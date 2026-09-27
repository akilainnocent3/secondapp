package com.bytedance.adsdk.tq.hv;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
class omn {
    private static final Interpolator hww = new LinearInterpolator();

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static SparseArray<WeakReference<Interpolator>> f31977tq;

    private static SparseArray<WeakReference<Interpolator>> hww() {
        if (f31977tq == null) {
            f31977tq = new SparseArray<>();
        }
        return f31977tq;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0276  */
    private static <T> com.bytedance.adsdk.tq.vgm.hww<T> tq(com.bytedance.adsdk.tq.vgm vgmVar, JsonReader jsonReader, float f10, npz<T> npzVar) throws IOException {
        Interpolator interpolatorHww;
        Interpolator interpolatorHww2;
        T t10;
        Interpolator interpolator;
        Interpolator interpolatorHww3;
        com.bytedance.adsdk.tq.vgm.hww<T> hwwVar;
        T t11;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        jsonReader.beginObject();
        boolean z10 = false;
        PointF pointFTq = null;
        PointF pointFTq2 = null;
        PointF pointF5 = null;
        T tTq = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointFTq3 = null;
        PointF pointFTq4 = null;
        float fNextDouble = 0.0f;
        T tTq2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tTq2 = npzVar.tq(jsonReader, f10);
                    continue;
                    break;
                case "h":
                    t11 = tTq;
                    pointF = pointFTq3;
                    pointF2 = pointFTq4;
                    if (jsonReader.nextInt() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                    break;
                case "i":
                    boolean z11 = z10;
                    t11 = tTq;
                    pointF = pointFTq3;
                    pointF2 = pointFTq4;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("x")) {
                                JsonToken jsonTokenPeek = jsonReader.peek();
                                JsonToken jsonToken = JsonToken.NUMBER;
                                if (jsonTokenPeek == jsonToken) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == jsonToken ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (strNextName2.equals("y")) {
                                JsonToken jsonTokenPeek2 = jsonReader.peek();
                                JsonToken jsonToken2 = JsonToken.NUMBER;
                                if (jsonTokenPeek2 == jsonToken2) {
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == jsonToken2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        PointF pointF9 = new PointF(fNextDouble2, fNextDouble3);
                        pointF8 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF7 = pointF9;
                    } else {
                        pointFTq2 = mrs.tq(jsonReader, f10);
                    }
                    z10 = z11;
                    break;
                case "o":
                    boolean z12 = z10;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        while (jsonReader.hasNext()) {
                            tTq = tTq;
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (strNextName3.equals("x")) {
                                pointF3 = pointFTq3;
                                pointF4 = pointFTq4;
                                JsonToken jsonTokenPeek3 = jsonReader.peek();
                                JsonToken jsonToken3 = JsonToken.NUMBER;
                                if (jsonTokenPeek3 == jsonToken3) {
                                    fNextDouble8 = (float) jsonReader.nextDouble();
                                    fNextDouble6 = fNextDouble8;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = jsonReader.peek() == jsonToken3 ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
                                }
                            } else if (strNextName3.equals("y")) {
                                JsonToken jsonTokenPeek4 = jsonReader.peek();
                                JsonToken jsonToken4 = JsonToken.NUMBER;
                                if (jsonTokenPeek4 == jsonToken4) {
                                    fNextDouble9 = (float) jsonReader.nextDouble();
                                    fNextDouble7 = fNextDouble9;
                                } else {
                                    jsonReader.beginArray();
                                    pointF3 = pointFTq3;
                                    pointF4 = pointFTq4;
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    fNextDouble9 = jsonReader.peek() == jsonToken4 ? (float) jsonReader.nextDouble() : fNextDouble7;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            pointFTq3 = pointF3;
                            pointFTq4 = pointF4;
                        }
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        PointF pointF11 = new PointF(fNextDouble8, fNextDouble9);
                        jsonReader.endObject();
                        pointF5 = pointF10;
                        pointF6 = pointF11;
                    } else {
                        pointFTq = mrs.tq(jsonReader, f10);
                    }
                    z10 = z12;
                    continue;
                    break;
                case "s":
                    tTq = npzVar.tq(jsonReader, f10);
                    continue;
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "ti":
                    pointFTq4 = mrs.tq(jsonReader, f10);
                    continue;
                    break;
                case "to":
                    pointFTq3 = mrs.tq(jsonReader, f10);
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
                    break;
            }
            tTq = t11;
            pointFTq3 = pointF;
            pointFTq4 = pointF2;
        }
        boolean z13 = z10;
        T t12 = tTq;
        PointF pointF12 = pointFTq3;
        PointF pointF13 = pointFTq4;
        jsonReader.endObject();
        if (!z13) {
            if (pointFTq != null && pointFTq2 != null) {
                interpolatorHww3 = hww(pointFTq, pointFTq2);
                interpolator = interpolatorHww3;
                t10 = tTq2;
                interpolatorHww = null;
                interpolatorHww2 = null;
            } else if (pointF5 != null && pointF6 != null && pointF7 != null && pointF8 != null) {
                interpolatorHww = hww(pointF5, pointF7);
                interpolatorHww2 = hww(pointF6, pointF8);
                t10 = tTq2;
                interpolator = null;
            }
            if (interpolatorHww != null || interpolatorHww2 == null) {
                hwwVar = new com.bytedance.adsdk.tq.vgm.hww<>(vgmVar, t12, t10, interpolator, fNextDouble, null);
            } else {
                hwwVar = new com.bytedance.adsdk.tq.vgm.hww<>(vgmVar, t12, t10, interpolatorHww, interpolatorHww2, fNextDouble, null);
            }
            hwwVar.f32349ok = pointF12;
            hwwVar.f32350rs = pointF13;
            return hwwVar;
        }
        tTq2 = t12;
        interpolatorHww3 = hww;
        interpolator = interpolatorHww3;
        t10 = tTq2;
        interpolatorHww = null;
        interpolatorHww2 = null;
        if (interpolatorHww != null) {
            hwwVar = new com.bytedance.adsdk.tq.vgm.hww<>(vgmVar, t12, t10, interpolator, fNextDouble, null);
        } else {
            hwwVar = new com.bytedance.adsdk.tq.vgm.hww<>(vgmVar, t12, t10, interpolator, fNextDouble, null);
        }
        hwwVar.f32349ok = pointF12;
        hwwVar.f32350rs = pointF13;
        return hwwVar;
    }

    private static WeakReference<Interpolator> hww(int i10) {
        WeakReference<Interpolator> weakReference;
        synchronized (omn.class) {
            weakReference = hww().get(i10);
        }
        return weakReference;
    }

    private static void hww(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (omn.class) {
            f31977tq.put(i10, weakReference);
        }
    }

    public static <T> com.bytedance.adsdk.tq.vgm.hww<T> hww(JsonReader jsonReader, com.bytedance.adsdk.tq.vgm vgmVar, float f10, npz<T> npzVar, boolean z10, boolean z11) throws IOException {
        if (z10 && z11) {
            return tq(vgmVar, jsonReader, f10, npzVar);
        }
        if (z10) {
            return hww(vgmVar, jsonReader, f10, npzVar);
        }
        return hww(jsonReader, f10, npzVar);
    }

    private static <T> com.bytedance.adsdk.tq.vgm.hww<T> hww(com.bytedance.adsdk.tq.vgm vgmVar, JsonReader jsonReader, float f10, npz<T> npzVar) throws IOException {
        Interpolator interpolatorHww;
        jsonReader.beginObject();
        PointF pointFTq = null;
        T tTq = null;
        T tTq2 = null;
        PointF pointFTq2 = null;
        PointF pointFTq3 = null;
        float fNextDouble = 0.0f;
        boolean z10 = false;
        PointF pointFTq4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tTq = npzVar.tq(jsonReader, f10);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                    break;
                case "i":
                    pointFTq4 = mrs.tq(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFTq = mrs.tq(jsonReader, 1.0f);
                    break;
                case "s":
                    tTq2 = npzVar.tq(jsonReader, f10);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFTq3 = mrs.tq(jsonReader, f10);
                    break;
                case "to":
                    pointFTq2 = mrs.tq(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z10) {
            if (pointFTq != null && pointFTq4 != null) {
                interpolatorHww = hww(pointFTq, pointFTq4);
            }
            com.bytedance.adsdk.tq.vgm.hww<T> hwwVar = new com.bytedance.adsdk.tq.vgm.hww<>(vgmVar, tTq2, tTq, interpolatorHww, fNextDouble, null);
            hwwVar.f32349ok = pointFTq2;
            hwwVar.f32350rs = pointFTq3;
            return hwwVar;
        }
        tTq = tTq2;
        interpolatorHww = hww;
        com.bytedance.adsdk.tq.vgm.hww<T> hwwVar2 = new com.bytedance.adsdk.tq.vgm.hww<>(vgmVar, tTq2, tTq, interpolatorHww, fNextDouble, null);
        hwwVar2.f32349ok = pointFTq2;
        hwwVar2.f32350rs = pointFTq3;
        return hwwVar2;
    }

    private static Interpolator hww(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.tq.hu.hv.tq(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.tq.hu.hv.tq(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.tq.hu.hv.tq(pointF2.x, -1.0f, 1.0f);
        float fTq = com.bytedance.adsdk.tq.hu.hv.tq(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fTq;
        int iHww = com.bytedance.adsdk.tq.hu.hu.hww(pointF.x, pointF.y, pointF2.x, fTq);
        WeakReference<Interpolator> weakReferenceHww = com.bytedance.adsdk.tq.hv.hww() ? null : hww(iHww);
        Interpolator interpolator = weakReferenceHww != null ? weakReferenceHww.get() : null;
        if (weakReferenceHww != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.tq.bs.hww(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.tq.bs.hww(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.tq.hv.hww()) {
            try {
                hww(iHww, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.tq.vgm.hww<T> hww(JsonReader jsonReader, float f10, npz<T> npzVar) throws IOException {
        return new com.bytedance.adsdk.tq.vgm.hww<>(npzVar.tq(jsonReader, f10));
    }
}
