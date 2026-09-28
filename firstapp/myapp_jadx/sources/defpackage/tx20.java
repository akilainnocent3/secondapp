package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx20 implements Function1 {
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Context context = (Context) obj;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
        ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
        int size = listQueryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
            ResolveInfo resolveInfo2 = resolveInfo;
            if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                arrayList.add(resolveInfo);
            } else {
                ActivityInfo activityInfo = resolveInfo2.activityInfo;
                if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                    arrayList.add(resolveInfo);
                }
            }
        }
        return arrayList;
    }
}
