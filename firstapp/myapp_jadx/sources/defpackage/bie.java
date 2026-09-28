package defpackage;

import com.sporty.android.core.model.patron.DeviceStatusDto;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bie {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeviceStatusDto.values().length];
        try {
            iArr[DeviceStatusDto.LOGIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeviceStatusDto.LOGOUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeviceStatusDto.FORCE_LOGOUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeviceStatusDto.BLOCKED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
