package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class cz5 {
    public static void a(ue6 ue6Var, CaptureRequest.Builder builder) {
        Range<Integer> rangeA = ue6Var.a();
        if (!rangeA.equals(k8e0.a)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeA);
        }
        pgt.a("Camera2CaptureRequestBuilder", "applyAeFpsRange: expectedFrameRateRange = " + rangeA);
    }

    public static void b(CaptureRequest.Builder builder, w2z w2zVar) {
        hf6 hf6VarB = hf6.a.c(w2zVar).b();
        for (hoa.a<?> aVar : hf6VarB.c()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.c();
            try {
                builder.set(key, hf6VarB.d(aVar));
            } catch (IllegalArgumentException unused) {
                pgt.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void c(CaptureRequest.Builder builder, int i, ocf0 ocf0Var) {
        Map mapUnmodifiableMap;
        if (i == 3 && ocf0Var.a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            if (i != 4) {
                ocf0Var.getClass();
            } else if (ocf0Var.b) {
                HashMap map2 = new HashMap();
                map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                mapUnmodifiableMap = Collections.unmodifiableMap(map2);
            }
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest d(ue6 ue6Var, CameraDevice cameraDevice, HashMap map, boolean z, ocf0 ocf0Var) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest;
        if (cameraDevice != null) {
            ArrayList arrayList = ue6Var.a;
            int i = ue6Var.c;
            w2z w2zVar = ue6Var.b;
            TreeMap<hoa.a<?>, Map<hoa.b, Object>> treeMap = w2zVar.N;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                Surface surface = (Surface) map.get((ijd) it.next());
                if (surface == null) {
                    hb5.a("DeferrableSurface not in configuredSurfaceMap");
                    return null;
                }
                arrayList2.add(surface);
            }
            if (!arrayList2.isEmpty()) {
                e06 e06Var = ue6Var.h;
                if (i == 5 && e06Var != null && (e06Var.e() instanceof TotalCaptureResult)) {
                    pgt.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
                    builderCreateCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) e06Var.e());
                } else {
                    pgt.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
                    if (i == 5) {
                        builderCreateCaptureRequest = cameraDevice.createCaptureRequest(z ? 1 : 2);
                    } else {
                        builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
                    }
                }
                c(builderCreateCaptureRequest, i, ocf0Var);
                a(ue6Var, builderCreateCaptureRequest);
                Integer numF = f(ue6Var);
                if (numF != null) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, numF);
                }
                pgt.a("Camera2CaptureRequestBuilder", "applyVideoStabilization: mode = " + numF);
                wg1 wg1Var = ue6.i;
                if (treeMap.containsKey(wg1Var)) {
                    builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) w2zVar.d(wg1Var));
                }
                wg1 wg1Var2 = ue6.j;
                if (treeMap.containsKey(wg1Var2)) {
                    builderCreateCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) w2zVar.d(wg1Var2)).byteValue()));
                }
                b(builderCreateCaptureRequest, w2zVar);
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    builderCreateCaptureRequest.addTarget((Surface) obj);
                }
                builderCreateCaptureRequest.setTag(ue6Var.g);
                return builderCreateCaptureRequest.build();
            }
        }
        return null;
    }

    public static CaptureRequest e(ue6 ue6Var, CameraDevice cameraDevice, ocf0 ocf0Var) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("template type = ");
        int i = ue6Var.c;
        sb.append(i);
        pgt.a("Camera2CaptureRequestBuilder", sb.toString());
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        c(builderCreateCaptureRequest, i, ocf0Var);
        a(ue6Var, builderCreateCaptureRequest);
        b(builderCreateCaptureRequest, ue6Var.b);
        return builderCreateCaptureRequest.build();
    }

    public static Integer f(ue6 ue6Var) {
        if (ue6Var.c() == 1 || ue6Var.d() == 1) {
            return 0;
        }
        if (ue6Var.c() == 2) {
            return 2;
        }
        return ue6Var.d() == 2 ? 1 : null;
    }
}
