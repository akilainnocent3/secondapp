package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.d;
import com.sporty.android.common_ui.widgets.CombEditText;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class cr0 {
    public static final /* synthetic */ int a = 0;

    public static final void a(d dVar, FragmentManager fragmentManager, String str) {
        fragmentManager.getClass();
        if (fragmentManager.H(str) == null) {
            a aVar = new a(fragmentManager);
            aVar.e(0, dVar, str, 1);
            aVar.k(true, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:266:0x048e  */
    /* JADX WARN: Code duplicated, block: B:268:0x0496  */
    /* JADX WARN: Code duplicated, block: B:271:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:273:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:276:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:278:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:281:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:283:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:286:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:293:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:295:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:298:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:300:0x0504 A[PHI: r4
      0x0504: PHI (r4v28 java.lang.String) = 
      (r4v23 java.lang.String)
      (r4v23 java.lang.String)
      (r4v23 java.lang.String)
      (r4v23 java.lang.String)
      (r4v23 java.lang.String)
      (r4v24 java.lang.String)
      (r4v25 java.lang.String)
      (r4v26 java.lang.String)
      (r4v29 java.lang.String)
     binds: [B:299:0x0502, B:294:0x04f3, B:296:0x04fb, B:289:0x04e2, B:284:0x04d3, B:279:0x04c4, B:274:0x04b1, B:269:0x049e, B:264:0x048a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:301:0x0506  */
    public static yj30 b(e16 e16Var) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        String str2;
        Integer num;
        wj30 wj30Var = wj30.c;
        wj30Var.getClass();
        try {
            vj30 vj30Var = wj30Var.a.a().get();
            ArrayList arrayList = new ArrayList();
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num2 = (Integer) e16Var.a(key);
            if (vj30Var.a(AeFpsRangeLegacyQuirk.class, num2 != null && num2.intValue() == 2)) {
                arrayList.add(new AeFpsRangeLegacyQuirk(e16Var));
            }
            if (vj30Var.a(AspectRatioLegacyApi21Quirk.class, false)) {
                arrayList.add(new AspectRatioLegacyApi21Quirk());
            }
            HashSet hashSet = JpegHalCorruptImageQuirk.a;
            String str3 = Build.DEVICE;
            Locale locale = Locale.US;
            if (vj30Var.a(JpegHalCorruptImageQuirk.class, hashSet.contains(str3.toLowerCase(locale)))) {
                arrayList.add(new JpegHalCorruptImageQuirk());
            }
            HashSet hashSet2 = JpegCaptureDownsizingQuirk.a;
            String str4 = Build.MODEL;
            if (vj30Var.a(JpegCaptureDownsizingQuirk.class, hashSet2.contains(str4.toLowerCase(locale)) && ((Integer) e16Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new JpegCaptureDownsizingQuirk());
            }
            Integer num3 = (Integer) e16Var.a(key);
            if (vj30Var.a(CamcorderProfileResolutionQuirk.class, num3 != null && num3.intValue() == 2)) {
                CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = new CamcorderProfileResolutionQuirk();
                e16Var.c();
                arrayList.add(camcorderProfileResolutionQuirk);
            }
            String str5 = Build.HARDWARE;
            if (vj30Var.a(CaptureNoResponseQuirk.class, ("samsungexynos7420".equalsIgnoreCase(str5) || "universal7420".equalsIgnoreCase(str5)) && ((Integer) e16Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new CaptureNoResponseQuirk());
            }
            Integer num4 = (Integer) e16Var.a(key);
            if (vj30Var.a(LegacyCameraOutputConfigNullPointerQuirk.class, num4 != null && num4.intValue() == 2)) {
                arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
            }
            if (vj30Var.a(LegacyCameraSurfaceCleanupQuirk.class, Build.VERSION.SDK_INT < 29 && (num = (Integer) e16Var.a(key)) != null && num.intValue() == 2)) {
                arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
            }
            if (vj30Var.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.a.contains(str4.toUpperCase(locale)) && ((Integer) e16Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new ImageCaptureWashedOutImageQuirk());
            }
            if (vj30Var.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.a.contains(str4.toUpperCase(locale)) && ((Integer) e16Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
            }
            String str6 = Build.BRAND;
            if (vj30Var.a(YuvImageOnePixelShiftQuirk.class, ("motorola".equalsIgnoreCase(str6) && "MotoG3".equalsIgnoreCase(str4)) || ("samsung".equalsIgnoreCase(str6) && "SM-G532F".equalsIgnoreCase(str4)) || (("samsung".equalsIgnoreCase(str6) && "SM-J700F".equalsIgnoreCase(str4)) || (("samsung".equalsIgnoreCase(str6) && "SM-A920F".equalsIgnoreCase(str4)) || (("samsung".equalsIgnoreCase(str6) && "SM-J415F".equalsIgnoreCase(str4)) || ("xiaomi".equalsIgnoreCase(str6) && "Mi A1".equalsIgnoreCase(str4))))))) {
                arrayList.add(new YuvImageOnePixelShiftQuirk());
            }
            Iterator<String> it = FlashTooSlowQuirk.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                        if (((Integer) e16Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                break;
            }
            if (vj30Var.a(FlashTooSlowQuirk.class, z)) {
                arrayList.add(new FlashTooSlowQuirk());
            }
            if (vj30Var.a(AfRegionFlipHorizontallyQuirk.class, Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) e16Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new AfRegionFlipHorizontallyQuirk());
            }
            CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            Integer num5 = (Integer) e16Var.a(key2);
            if (vj30Var.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, num5 != null && num5.intValue() == 2)) {
                arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
            }
            Integer num6 = (Integer) e16Var.a(key2);
            if (vj30Var.a(PreviewOrientationIncorrectQuirk.class, num6 != null && num6.intValue() == 2)) {
                arrayList.add(new PreviewOrientationIncorrectQuirk());
            }
            Integer num7 = (Integer) e16Var.a(key2);
            if (vj30Var.a(CaptureSessionStuckQuirk.class, num7 != null && num7.intValue() == 2)) {
                arrayList.add(new CaptureSessionStuckQuirk());
            }
            List<String> list = ImageCaptureFlashNotFireQuirk.b;
            String str7 = Build.MODEL;
            Locale locale2 = Locale.US;
            if (vj30Var.a(ImageCaptureFlashNotFireQuirk.class, (list.contains(str7.toLowerCase(locale2)) && ((Integer) e16Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || ImageCaptureFlashNotFireQuirk.a.contains(str7.toLowerCase(locale2)))) {
                arrayList.add(new ImageCaptureFlashNotFireQuirk());
            }
            if (vj30Var.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.a.contains(str7.toLowerCase(locale2)) && ((Integer) e16Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
                arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
            }
            if (vj30Var.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.a.contains(str7.toLowerCase(locale2)) && ((Integer) e16Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
            }
            Integer num8 = (Integer) e16Var.a(key2);
            if (vj30Var.a(IncorrectCaptureStateQuirk.class, num8 != null && num8.intValue() == 2)) {
                arrayList.add(new IncorrectCaptureStateQuirk());
            }
            Iterator<String> it2 = TorchFlashRequiredFor3aUpdateQuirk.b.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (Build.MODEL.toUpperCase(Locale.US).equals(it2.next())) {
                        if (((Integer) e16Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                break;
            }
            if (vj30Var.a(TorchFlashRequiredFor3aUpdateQuirk.class, z2)) {
                arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(e16Var));
            }
            String str8 = Build.MANUFACTURER;
            if (vj30Var.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, ("HUAWEI".equalsIgnoreCase(str8) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str8) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str8) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str8) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) || (("OPPO".equalsIgnoreCase(str8) && "A37F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str8) && "sm-j510fn".equalsIgnoreCase(Build.MODEL))))))) {
                arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
            }
            if (vj30Var.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, "Huawei".equalsIgnoreCase(str8))) {
                arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
            }
            String str9 = Build.BRAND;
            if ("blu".equalsIgnoreCase(str9)) {
                str = Build.MODEL;
                if ("studio x10".equalsIgnoreCase(str)) {
                    z3 = true;
                } else if ("itel".equalsIgnoreCase(str9)) {
                    str = Build.MODEL;
                    if ("itel w6004".equalsIgnoreCase(str)) {
                        z3 = true;
                    } else if ("vivo".equalsIgnoreCase(str9)) {
                        str = Build.MODEL;
                        if ("vivo 1805".equalsIgnoreCase(str)) {
                            z3 = true;
                        } else if ("positivo".equalsIgnoreCase(str9)) {
                            str = Build.MODEL;
                            if ("twist 2 pro".equalsIgnoreCase(str)) {
                                z3 = true;
                            } else {
                                str = Build.MODEL;
                                if ((!"pixel 4 xl".equalsIgnoreCase(str) && Build.VERSION.SDK_INT == 29) || ("motorola".equalsIgnoreCase(str9) && "moto e13".equalsIgnoreCase(str))) {
                                    z3 = true;
                                } else if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if (!"gta8".equalsIgnoreCase(str2) || "gta8wifi".equalsIgnoreCase(str2)) {
                                        z3 = true;
                                    } else if (nbe.a()) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                } else if (nbe.a()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                        } else {
                            str = Build.MODEL;
                            if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                                if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if ("gta8".equalsIgnoreCase(str2)) {
                                    }
                                    z3 = true;
                                } else if (nbe.a()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else if ("samsung".equalsIgnoreCase(str9)) {
                                str2 = Build.DEVICE;
                                if ("gta8".equalsIgnoreCase(str2)) {
                                }
                                z3 = true;
                            } else if (nbe.a()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                    } else if ("positivo".equalsIgnoreCase(str9)) {
                        str = Build.MODEL;
                        if ("twist 2 pro".equalsIgnoreCase(str)) {
                            z3 = true;
                        } else {
                            str = Build.MODEL;
                            if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                                if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if ("gta8".equalsIgnoreCase(str2)) {
                                    }
                                    z3 = true;
                                } else if (nbe.a()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else if ("samsung".equalsIgnoreCase(str9)) {
                                str2 = Build.DEVICE;
                                if ("gta8".equalsIgnoreCase(str2)) {
                                }
                                z3 = true;
                            } else if (nbe.a()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                    } else {
                        str = Build.MODEL;
                        if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                            if ("samsung".equalsIgnoreCase(str9)) {
                                str2 = Build.DEVICE;
                                if ("gta8".equalsIgnoreCase(str2)) {
                                }
                                z3 = true;
                            } else if (nbe.a()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else if ("samsung".equalsIgnoreCase(str9)) {
                            str2 = Build.DEVICE;
                            if ("gta8".equalsIgnoreCase(str2)) {
                            }
                            z3 = true;
                        } else if (nbe.a()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                } else if ("vivo".equalsIgnoreCase(str9)) {
                    str = Build.MODEL;
                    if ("vivo 1805".equalsIgnoreCase(str)) {
                        z3 = true;
                    } else if ("positivo".equalsIgnoreCase(str9)) {
                        str = Build.MODEL;
                        if ("twist 2 pro".equalsIgnoreCase(str)) {
                            z3 = true;
                        } else {
                            str = Build.MODEL;
                            if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                                if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if ("gta8".equalsIgnoreCase(str2)) {
                                    }
                                    z3 = true;
                                } else if (nbe.a()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else if ("samsung".equalsIgnoreCase(str9)) {
                                str2 = Build.DEVICE;
                                if ("gta8".equalsIgnoreCase(str2)) {
                                }
                                z3 = true;
                            } else if (nbe.a()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                    } else {
                        str = Build.MODEL;
                        if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                            if ("samsung".equalsIgnoreCase(str9)) {
                                str2 = Build.DEVICE;
                                if ("gta8".equalsIgnoreCase(str2)) {
                                }
                                z3 = true;
                            } else if (nbe.a()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else if ("samsung".equalsIgnoreCase(str9)) {
                            str2 = Build.DEVICE;
                            if ("gta8".equalsIgnoreCase(str2)) {
                            }
                            z3 = true;
                        } else if (nbe.a()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                } else if ("positivo".equalsIgnoreCase(str9)) {
                    str = Build.MODEL;
                    if ("twist 2 pro".equalsIgnoreCase(str)) {
                        z3 = true;
                    } else {
                        str = Build.MODEL;
                        if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                            if ("samsung".equalsIgnoreCase(str9)) {
                                str2 = Build.DEVICE;
                                if ("gta8".equalsIgnoreCase(str2)) {
                                }
                                z3 = true;
                            } else if (nbe.a()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else if ("samsung".equalsIgnoreCase(str9)) {
                            str2 = Build.DEVICE;
                            if ("gta8".equalsIgnoreCase(str2)) {
                            }
                            z3 = true;
                        } else if (nbe.a()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                } else {
                    str = Build.MODEL;
                    if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                        if ("samsung".equalsIgnoreCase(str9)) {
                            str2 = Build.DEVICE;
                            if ("gta8".equalsIgnoreCase(str2)) {
                            }
                            z3 = true;
                        } else if (nbe.a()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else if ("samsung".equalsIgnoreCase(str9)) {
                        str2 = Build.DEVICE;
                        if ("gta8".equalsIgnoreCase(str2)) {
                        }
                        z3 = true;
                    } else if (nbe.a()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            } else if ("itel".equalsIgnoreCase(str9)) {
                str = Build.MODEL;
                if ("itel w6004".equalsIgnoreCase(str)) {
                    z3 = true;
                } else if ("vivo".equalsIgnoreCase(str9)) {
                    str = Build.MODEL;
                    if ("vivo 1805".equalsIgnoreCase(str)) {
                        z3 = true;
                    } else if ("positivo".equalsIgnoreCase(str9)) {
                        str = Build.MODEL;
                        if ("twist 2 pro".equalsIgnoreCase(str)) {
                            z3 = true;
                        } else {
                            str = Build.MODEL;
                            if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                                if ("samsung".equalsIgnoreCase(str9)) {
                                    str2 = Build.DEVICE;
                                    if ("gta8".equalsIgnoreCase(str2)) {
                                    }
                                    z3 = true;
                                } else if (nbe.a()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else if ("samsung".equalsIgnoreCase(str9)) {
                                str2 = Build.DEVICE;
                                if ("gta8".equalsIgnoreCase(str2)) {
                                }
                                z3 = true;
                            } else if (nbe.a()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                    } else {
                        str = Build.MODEL;
                        if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                            if ("samsung".equalsIgnoreCase(str9)) {
                                str2 = Build.DEVICE;
                                if ("gta8".equalsIgnoreCase(str2)) {
                                }
                                z3 = true;
                            } else if (nbe.a()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else if ("samsung".equalsIgnoreCase(str9)) {
                            str2 = Build.DEVICE;
                            if ("gta8".equalsIgnoreCase(str2)) {
                            }
                            z3 = true;
                        } else if (nbe.a()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                } else if ("positivo".equalsIgnoreCase(str9)) {
                    str = Build.MODEL;
                    if ("twist 2 pro".equalsIgnoreCase(str)) {
                        z3 = true;
                    } else {
                        str = Build.MODEL;
                        if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                            if ("samsung".equalsIgnoreCase(str9)) {
                                str2 = Build.DEVICE;
                                if ("gta8".equalsIgnoreCase(str2)) {
                                }
                                z3 = true;
                            } else if (nbe.a()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else if ("samsung".equalsIgnoreCase(str9)) {
                            str2 = Build.DEVICE;
                            if ("gta8".equalsIgnoreCase(str2)) {
                            }
                            z3 = true;
                        } else if (nbe.a()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                } else {
                    str = Build.MODEL;
                    if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                        if ("samsung".equalsIgnoreCase(str9)) {
                            str2 = Build.DEVICE;
                            if ("gta8".equalsIgnoreCase(str2)) {
                            }
                            z3 = true;
                        } else if (nbe.a()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else if ("samsung".equalsIgnoreCase(str9)) {
                        str2 = Build.DEVICE;
                        if ("gta8".equalsIgnoreCase(str2)) {
                        }
                        z3 = true;
                    } else if (nbe.a()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            } else if ("vivo".equalsIgnoreCase(str9)) {
                str = Build.MODEL;
                if ("vivo 1805".equalsIgnoreCase(str)) {
                    z3 = true;
                } else if ("positivo".equalsIgnoreCase(str9)) {
                    str = Build.MODEL;
                    if ("twist 2 pro".equalsIgnoreCase(str)) {
                        z3 = true;
                    } else {
                        str = Build.MODEL;
                        if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                            if ("samsung".equalsIgnoreCase(str9)) {
                                str2 = Build.DEVICE;
                                if ("gta8".equalsIgnoreCase(str2)) {
                                }
                                z3 = true;
                            } else if (nbe.a()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else if ("samsung".equalsIgnoreCase(str9)) {
                            str2 = Build.DEVICE;
                            if ("gta8".equalsIgnoreCase(str2)) {
                            }
                            z3 = true;
                        } else if (nbe.a()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                } else {
                    str = Build.MODEL;
                    if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                        if ("samsung".equalsIgnoreCase(str9)) {
                            str2 = Build.DEVICE;
                            if ("gta8".equalsIgnoreCase(str2)) {
                            }
                            z3 = true;
                        } else if (nbe.a()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else if ("samsung".equalsIgnoreCase(str9)) {
                        str2 = Build.DEVICE;
                        if ("gta8".equalsIgnoreCase(str2)) {
                        }
                        z3 = true;
                    } else if (nbe.a()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            } else if ("positivo".equalsIgnoreCase(str9)) {
                str = Build.MODEL;
                if ("twist 2 pro".equalsIgnoreCase(str)) {
                    z3 = true;
                } else {
                    str = Build.MODEL;
                    if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                        if ("samsung".equalsIgnoreCase(str9)) {
                            str2 = Build.DEVICE;
                            if ("gta8".equalsIgnoreCase(str2)) {
                            }
                            z3 = true;
                        } else if (nbe.a()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else if ("samsung".equalsIgnoreCase(str9)) {
                        str2 = Build.DEVICE;
                        if ("gta8".equalsIgnoreCase(str2)) {
                        }
                        z3 = true;
                    } else if (nbe.a()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            } else {
                str = Build.MODEL;
                if (!"pixel 4 xl".equalsIgnoreCase(str)) {
                    if ("samsung".equalsIgnoreCase(str9)) {
                        str2 = Build.DEVICE;
                        if ("gta8".equalsIgnoreCase(str2)) {
                        }
                        z3 = true;
                    } else if (nbe.a()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else if ("samsung".equalsIgnoreCase(str9)) {
                    str2 = Build.DEVICE;
                    if ("gta8".equalsIgnoreCase(str2)) {
                    }
                    z3 = true;
                } else if (nbe.a()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (vj30Var.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, z3)) {
                arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
            }
            if (vj30Var.a(TemporalNoiseQuirk.class, "Pixel 8".equalsIgnoreCase(str) && ((Integer) e16Var.a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
                arrayList.add(new TemporalNoiseQuirk());
            }
            if (vj30Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.c())) {
                arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
            }
            if (vj30Var.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class, "motorola".equalsIgnoreCase(str9) && "moto e20".equalsIgnoreCase(str) && e16Var.c.equals("1"))) {
                arrayList.add(new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk());
            }
            if (vj30Var.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, "samsung".equalsIgnoreCase(str9) && Build.DEVICE.equalsIgnoreCase("m55xq"))) {
                arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
            }
            yj30 yj30Var = new yj30(arrayList);
            pgt.a("CameraQuirks", "camera2 CameraQuirks = ".concat(yj30.d(yj30Var)));
            return yj30Var;
        } catch (InterruptedException | ExecutionException e) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e);
        }
    }

    public static void d(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof ogj0) {
                editorInfo.hintText = ((ogj0) parent).a();
                return;
            }
        }
    }

    public static final void c(zrr zrrVar) {
        Context context = zrrVar.a.getContext();
        CombEditText combEditText = zrrVar.i;
        Boolean bool = Boolean.FALSE;
        combEditText.setCanCopy(bool);
        combEditText.setLabelImage(R.drawable.ic_credit_card_unify);
        context.getClass();
        combEditText.setLabelText(sn5.b(context, R.string.page_payment__card_number, new Object[0]));
        combEditText.setErrorView(zrrVar.v);
        CombEditText combEditText2 = zrrVar.w;
        combEditText2.setKeyListener(DigitsKeyListener.getInstance(" 0123456789"));
        wec wecVar = new wec();
        wecVar.a = '0';
        combEditText2.setTransformationMethod(wecVar);
        CombEditText combEditText3 = zrrVar.z;
        combEditText3.setLabelImage(R.drawable.ic_expiry_unify);
        combEditText3.setLabelText(sn5.b(context, R.string.page_payment__expiry, new Object[0]));
        combEditText3.setEditHint(sn5.b(context, R.string.page_payment__mm_yy, new Object[0]));
        combEditText3.setErrorView(zrrVar.A);
        combEditText3.setKeyListener(DigitsKeyListener.getInstance("/0123456789"));
        combEditText3.setMaxLength(5);
        combEditText2.setCanCopy(bool);
        combEditText2.setLabelImage(R.drawable.ic_lock_unify);
        combEditText2.setLabelText(sn5.b(context, R.string.page_payment__cvv, new Object[0]));
        combEditText2.setEditHint(sn5.b(context, R.string.page_payment__vnum_digits, jbkEboCkTqmGf.ftgAEIBc));
        combEditText2.setErrorView(zrrVar.y);
        combEditText2.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        combEditText2.setMaxLength(3);
        combEditText2.setInputType(18);
        zrrVar.c.setErrorView(zrrVar.d);
    }
}
