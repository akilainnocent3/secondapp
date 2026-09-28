package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dx20 {
    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = m2g.a;
        }
        ArrayList arrayListR = CollectionsKt.R(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        int size = arrayListR.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListR.get(i3);
            i3++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new cx20(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, Intrinsics.g(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static cx20 b(Context context) {
        Object obj;
        String strA;
        context.getClass();
        int iMyPid = Process.myPid();
        ArrayList arrayListA = a(context);
        int size = arrayListA.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayListA.get(i);
            i++;
        } while (((cx20) obj).b != iMyPid);
        cx20 cx20Var = (cx20) obj;
        if (cx20Var != null) {
            return cx20Var;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            strA = Process.myProcessName();
            strA.getClass();
        } else if ((i2 < 28 || (strA = Application.getProcessName()) == null) && (strA = zx20.a()) == null) {
            strA = "";
        }
        return new cx20(iMyPid, 0, strA, false);
    }
}
