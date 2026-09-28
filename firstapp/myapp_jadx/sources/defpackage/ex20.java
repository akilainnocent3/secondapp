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
public final class ex20 {
    public static final ex20 a = new ex20();

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
            qh1.a aVar = new qh1.a();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                bmy.a("Null processName");
                return null;
            }
            aVar.a = str2;
            aVar.b = runningAppProcessInfo.pid;
            byte b = (byte) (aVar.e | 1);
            aVar.c = runningAppProcessInfo.importance;
            aVar.e = (byte) (b | 2);
            aVar.d = Intrinsics.g(str2, str);
            aVar.e = (byte) (aVar.e | 4);
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public final ktb.e.d.a.c b(Context context) {
        Object obj;
        String processName;
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
        } while (((ktb.e.d.a.c) obj).b() != iMyPid);
        ktb.e.d.a.c cVar = (ktb.e.d.a.c) obj;
        if (cVar != null) {
            return cVar;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 33) {
            processName = Process.myProcessName();
            processName.getClass();
        } else if (i2 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        qh1.a aVar = new qh1.a();
        aVar.a = processName;
        aVar.b = iMyPid;
        byte b = (byte) (aVar.e | 1);
        aVar.c = 0;
        aVar.d = false;
        aVar.e = (byte) (((byte) (b | 2)) | 4);
        return aVar.a();
    }
}
