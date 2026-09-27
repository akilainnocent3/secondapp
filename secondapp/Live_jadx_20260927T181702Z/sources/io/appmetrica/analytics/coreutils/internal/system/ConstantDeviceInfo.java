package io.appmetrica.analytics.coreutils.internal.system;

import android.annotation.SuppressLint;
import android.os.Build;
import cs.g;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class ConstantDeviceInfo {

    @l
    public static final String APP_PLATFORM = "android";

    @l
    public static final ConstantDeviceInfo INSTANCE = new ConstantDeviceInfo();

    @l
    @g
    public static final String MANUFACTURER = Build.MANUFACTURER;

    @l
    @g
    public static final String MODEL = Build.MODEL;

    @l
    @g
    public static final String OS_VERSION = Build.VERSION.RELEASE;

    @SuppressLint({"AnnotateVersionCheck"})
    @g
    public static final int OS_API_LEVEL = Build.VERSION.SDK_INT;

    @l
    @g
    public static final String DEVICE_ROOT_STATUS = String.valueOf(RootChecker.isRootedPhone());

    private ConstantDeviceInfo() {
    }
}
