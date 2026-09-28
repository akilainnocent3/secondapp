package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class cj10 {
    public static final String a(s9i s9iVar, Context context) {
        boolean z;
        float fB;
        ArrayList arrayList = s9iVar.a;
        t60.a(context);
        int i = 0;
        int i2 = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i2 == 0) {
            return ois.a(arrayList, null, new bj10(), 31);
        }
        int size = arrayList.size();
        String strConcat = "";
        boolean z2 = false;
        while (i < size) {
            q9i q9iVar = (q9i) arrayList.get(i);
            if (Intrinsics.g(q9iVar.c(), "wght")) {
                fB = f.d(q9iVar.b() + i2, 1.0f, 1000.0f);
                z = true;
            } else {
                z = z2;
                fB = q9iVar.b();
            }
            if (i != 0) {
                strConcat = strConcat.concat(",");
            }
            strConcat = strConcat + '\'' + q9iVar.c() + "' " + fB;
            i++;
            z2 = z;
        }
        if (z2) {
            return strConcat;
        }
        float fD = f.d(i2 + 400.0f, 1.0f, 1000.0f);
        if (!arrayList.isEmpty()) {
            strConcat = strConcat.concat(",");
        }
        return strConcat + "'wght' " + fD;
    }
}
