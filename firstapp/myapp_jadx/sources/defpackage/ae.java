package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ae extends vd<String[], Map<String, Boolean>> {
    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // defpackage.vd
    public final vd.a b(Object obj, Context context) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            return new vd.a(o2gVar);
        }
        for (String str : strArr) {
            if (o0b.a(context, str) != 0) {
                return null;
            }
        }
        int iA = jpu.a(strArr.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (String str2 : strArr) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new vd.a(linkedHashMap);
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        if (i != -1) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            return o2gVar;
        }
        if (intent == null) {
            o2g o2gVar2 = o2g.a;
            o2gVar2.getClass();
            return o2gVar2;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            o2g o2gVar3 = o2g.a;
            o2gVar3.getClass();
            return o2gVar3;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        return kpu.k(CollectionsKt.H0(ay0.v(stringArrayExtra), arrayList));
    }
}
