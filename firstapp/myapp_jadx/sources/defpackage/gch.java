package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.SurfaceHolder;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gch implements vbh {
    public static final b j = new b();
    public final Context b;
    public final String c;
    public final q26 d;
    public final mpe0 e;
    public final mpe0 f;
    public final mpe0 g;
    public final mpe0 h;
    public final mpe0 i;

    public static final class a implements AutoCloseable {
        public final OutputConfiguration a;
        public final ImageReader b;

        public a(OutputConfiguration outputConfiguration, ImageReader imageReader) {
            this.a = outputConfiguration;
            this.b = imageReader;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            ImageReader imageReader = this.b;
            if (imageReader != null) {
                imageReader.close();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            ImageReader imageReader = this.b;
            return iHashCode + (imageReader == null ? 0 : imageReader.hashCode());
        }

        public final String toString() {
            return "CloseableOutputConfiguration(value=" + this.a + ", backingImageReader=" + this.b + ')';
        }
    }

    public static final class b extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            cameraCaptureSession.getClass();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            cameraCaptureSession.getClass();
        }
    }

    public gch(Context context, String str, q26 q26Var) {
        context.getClass();
        str.getClass();
        q26Var.getClass();
        this.b = context;
        this.c = str;
        this.d = q26Var;
        this.e = hwr.b(new dch(this, 0));
        this.f = hwr.b(new sq3(this, 1));
        this.g = hwr.b(new Function0() { // from class: ech
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws r36 {
                gch gchVar = this.a;
                try {
                    return gchVar.d.b(gchVar.c);
                } catch (rz5 e) {
                    throw new r36(e);
                }
            }
        });
        this.h = hwr.b(new Function0() { // from class: fch
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ihf ihfVarA = ihf.a((e16) this.a.g.getValue());
                km20.g("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
                return ihfVarA.a.b();
            }
        });
        this.i = hwr.b(new Function0() { // from class: cch
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Context context2 = this.a.b;
                Boolean bool = null;
                try {
                    ServiceInfo[] serviceInfoArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 132).services;
                    if (serviceInfoArr != null) {
                        int i = 0;
                        while (true) {
                            if (!(i < serviceInfoArr.length)) {
                                bool = Boolean.FALSE;
                                break;
                            }
                            int i2 = i + 1;
                            try {
                                Bundle bundle = serviceInfoArr[i].metaData;
                                if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                i = i2;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                ibh0.a(e.getMessage());
                                return null;
                            }
                        }
                    } else {
                        bool = Boolean.FALSE;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return Boolean.valueOf(Intrinsics.g(bool, Boolean.FALSE));
            }
        });
    }

    public static final CameraDevice.CameraDeviceSetup b(gch gchVar) {
        q26 q26Var = gchVar.d;
        CameraManager cameraManager = q26Var.a.a;
        String str = gchVar.c;
        if (cameraManager.isCameraDeviceSetupSupported(str)) {
            return q26Var.a.a.getCameraDeviceSetup(str);
        }
        return null;
    }

    @Override // defpackage.vbh
    public final boolean a(wf80 wf80Var) throws Exception {
        boolean zIsTerminated;
        long j2;
        a aVar;
        DynamicRangeProfiles dynamicRangeProfilesA;
        OutputConfiguration outputConfiguration;
        ArrayList arrayList = wf80Var.a;
        ue6 ue6Var = wf80Var.g;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wf80.f fVar = (wf80.f) obj;
            if (((Boolean) this.i.getValue()).booleanValue()) {
                fVar.getClass();
                Class<?> cls = fVar.f().j;
                pgt.a("FeatureCombinationQueryImpl", "toDeferredOutputConfiguration: surface containerClass = " + fVar.f().j);
                if (cls != null) {
                    ach.a();
                    Size size2 = fVar.f().h;
                    if (size2 == null) {
                        hb5.a("Required value was null.");
                        return false;
                    }
                    outputConfiguration = new OutputConfiguration(size2, cls);
                } else {
                    ach.a();
                    outputConfiguration = new OutputConfiguration(fVar.f().i, fVar.f().h);
                }
                aVar = new a(outputConfiguration, null);
            } else {
                fVar.getClass();
                Class<?> cls2 = fVar.f().j;
                if (Intrinsics.g(cls2, MediaCodec.class)) {
                    j2 = 65536;
                } else if (Intrinsics.g(cls2, SurfaceHolder.class)) {
                    j2 = 2048;
                } else {
                    j2 = Intrinsics.g(cls2, SurfaceTexture.class) ? 256L : 0L;
                }
                pgt.a("FeatureCombinationQueryImpl", "toConcreteOutputConfiguration: surface containerClass = " + fVar.f().j + dqvOSm.faTQyZ + j2);
                ImageReader imageReaderNewInstance = ImageReader.newInstance(fVar.f().h.getWidth(), fVar.f().h.getHeight(), fVar.f().i, 1, j2);
                imageReaderNewInstance.getClass();
                aVar = new a(new OutputConfiguration(imageReaderNewInstance.getSurface()), imageReaderNewInstance);
            }
            if (fVar.f().j != null && (dynamicRangeProfilesA = bch.a(this.h.getValue())) != null) {
                Long lA = ehf.a(fVar.b(), dynamicRangeProfilesA);
                if (lA == null) {
                    hb5.a("Required value was null.");
                    return false;
                }
                aVar.a.setDynamicRangeProfile(lA.longValue());
            }
            arrayList2.add(aVar);
        }
        ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
        int size3 = arrayList2.size();
        int i2 = 0;
        while (i2 < size3) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            arrayList3.add(((a) obj2).a);
        }
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, arrayList3, nqe.a(), j);
        CameraDevice.CameraDeviceSetup cameraDeviceSetup = (CameraDevice.CameraDeviceSetup) this.f.getValue();
        if (cameraDeviceSetup == null) {
            sessionConfiguration = null;
        } else {
            CaptureRequest.Builder builderCreateCaptureRequest = cameraDeviceSetup.createCaptureRequest(ue6Var.c);
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, ue6Var.a());
            if (ue6Var.c() == 2) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
            }
            sessionConfiguration.setSessionParameters(builderCreateCaptureRequest.build());
        }
        if (sessionConfiguration == null) {
            return false;
        }
        int i3 = ((y16) this.e.getValue()).a(sessionConfiguration).a;
        StringBuilder sbA = efe0.a(i3, "isSupported: supported = ", " for session config with ");
        StringBuilder sb = new StringBuilder("sessionParameters=[");
        sb.append("fpsRange=" + ue6Var.a());
        sb.append(", previewStabilizationMode=" + ue6Var.c());
        sb.append("], outputConfigurations=[");
        int size4 = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size4) {
            Object obj3 = arrayList.get(i5);
            i5++;
            int i6 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            wf80.f fVar2 = (wf80.f) obj3;
            if (i4 != 0) {
                sb.append(",");
            }
            sb.append("{format=" + fVar2.f().i + ", size=" + fVar2.f().h + ", dynamicRange=" + fVar2.b() + ", class=" + fVar2.f().j + '}');
            i4 = i6;
        }
        sb.append("]");
        sbA.append(sb.toString());
        pgt.a("FeatureCombinationQueryImpl", sbA.toString());
        boolean z = i3 == 1;
        int size5 = arrayList2.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj4 = arrayList2.get(i7);
            i7++;
            AutoCloseable autoCloseable = (AutoCloseable) obj4;
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z2 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z2) {
                                executorService.shutdownNow();
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    d580.a();
                    return false;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
        return z;
    }
}
