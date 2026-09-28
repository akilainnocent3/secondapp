package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class mtb {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final x6n b;
    public final rr0 c;
    public final spv d;
    public final fk80 e;

    static {
        HashMap map = new HashMap();
        f = map;
        pwd0.a(5, map, "armeabi", 6, "armeabi-v7a");
        pwd0.a(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.0.1";
    }

    public mtb(Context context, x6n x6nVar, rr0 rr0Var, spv spvVar, fk80 fk80Var) {
        this.a = context;
        this.b = x6nVar;
        this.c = rr0Var;
        this.d = spvVar;
        this.e = fk80Var;
    }

    public static mh1 c(zwg0 zwg0Var, int i) {
        String str = zwg0Var.b;
        String str2 = zwg0Var.a;
        StackTraceElement[] stackTraceElementArr = zwg0Var.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        zwg0 zwg0Var2 = zwg0Var.d;
        if (i >= 8) {
            zwg0 zwg0Var3 = zwg0Var2;
            while (zwg0Var3 != null) {
                zwg0Var3 = zwg0Var3.d;
                i2++;
            }
        }
        int i3 = i2;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            bmy.a("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        mh1 mh1VarC = (zwg0Var2 == null || i3 != 0) ? null : c(zwg0Var2, i + 1);
        if (b == 1) {
            return new mh1(str, str2, listD, mh1VarC, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        ib5.a(ltb.a(sb, "Missing required properties:"));
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ph1.a aVar = new ph1.a();
            aVar.e = i;
            aVar.f = (byte) (aVar.f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            aVar.a = jMax;
            byte b = (byte) (aVar.f | 1);
            aVar.b = str;
            aVar.c = fileName;
            aVar.d = lineNumber;
            aVar.f = (byte) (b | 2);
            arrayList.add(aVar.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static nh1 e() {
        return new nh1(0L, "0", "0");
    }

    public final List<ktb.e.d.a.b.AbstractC0786a> a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        rr0 rr0Var = this.c;
        String str = rr0Var.e;
        if (str == null) {
            bmy.a("Null name");
            return null;
        }
        String str2 = rr0Var.b;
        if (b == 3) {
            return Collections.singletonList(new lh1(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        ib5.a(ltb.a(sb, "Missing required properties:"));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    public final rh1 b(int i) {
        boolean z;
        Float fValueOf;
        int i2;
        long j;
        Context context = this.a;
        boolean z2 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra(AnalyticsParam.EVENT_STATUS, -1);
                z = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z || fValueOf == null) {
                    i2 = 1;
                } else {
                    i2 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
                }
                if (!ti8.e() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long jA = ti8.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = jA - memoryInfo.availMem;
                if (j <= 0) {
                    j = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                rh1.a aVar = new rh1.a();
                aVar.a = dValueOf;
                aVar.b = i2;
                byte b = (byte) (aVar.g | 1);
                aVar.c = z2;
                aVar.d = i;
                aVar.e = j;
                aVar.f = blockCount;
                aVar.g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return aVar.a();
            }
            z = false;
        } catch (IllegalStateException e2) {
            e = e2;
            z = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z) {
            i2 = 1;
        } else {
            i2 = 1;
        }
        if (!ti8.e()) {
            z2 = true;
        }
        long jA2 = ti8.a(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j = jA2 - memoryInfo2.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        rh1.a aVar2 = new rh1.a();
        aVar2.a = dValueOf;
        aVar2.b = i2;
        byte b2 = (byte) (aVar2.g | 1);
        aVar2.c = z2;
        aVar2.d = i;
        aVar2.e = j;
        aVar2.f = blockCount2;
        aVar2.g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
        return aVar2.a();
    }
}
