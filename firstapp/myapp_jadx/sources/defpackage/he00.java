package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.e;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.permission.PermissionActivity;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class he00 {
    public static Object a(e eVar, fe00 fe00Var, tje0 tje0Var) throws Throwable {
        bc6 bc6Var = new bc6(1, yzo.b(tje0Var));
        bc6Var.q();
        if (new t2y(eVar).b.areNotificationsEnabled()) {
            Boolean bool = Boolean.TRUE;
            if (bc6Var.p() instanceof bzx) {
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(bool);
            } else {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_COMMON);
                aVar2.n("Continuation not active, resume not perform.", new Object[0]);
            }
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                fe00Var.l0(new ge00(bc6Var, eVar));
                fe00Var.B0().b("android.permission.POST_NOTIFICATIONS");
            } else {
                Intent intent = new Intent();
                if (i >= 26) {
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", eVar.getPackageName()).getClass();
                } else {
                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.setData(Uri.parse("package:" + eVar.getPackageName()));
                }
                eVar.startActivity(intent);
                Boolean bool2 = Boolean.FALSE;
                if (bc6Var.p() instanceof bzx) {
                    zi50.a aVar3 = zi50.b;
                    bc6Var.resumeWith(bool2);
                } else {
                    itf0.a aVar4 = itf0.a;
                    aVar4.q(MyLog.TAG_COMMON);
                    aVar4.n("Continuation not active, resume not perform.", new Object[0]);
                }
            }
        }
        Object objO = bc6Var.o();
        y5b y5bVar = y5b.a;
        return objO;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    public static boolean b(Context context, String[] strArr) {
        context.getClass();
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                break;
            }
            String str = strArr[i];
            if (Intrinsics.g(str, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                if (Build.VERSION.SDK_INT <= 28) {
                    z = false;
                }
            } else if (!Intrinsics.g(str, "android.permission.POST_NOTIFICATIONS")) {
                try {
                    if (o0b.a(context, str) != 0) {
                        z = false;
                    }
                } catch (Throwable th) {
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_COMMON);
                    aVar.o(th);
                }
            } else if (Build.VERSION.SDK_INT >= 33) {
                z = false;
            }
            arrayList.add(new Pair(str, Boolean.valueOf(z)));
            i++;
        }
        int iA = jpu.a(l48.r(arrayList, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Pair pair = (Pair) obj;
            linkedHashMap.put(pair.a, pair.b);
        }
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final ArrayList c(PermissionActivity permissionActivity, String... strArr) {
        strArr.getClass();
        List<String> listK = b.k(Arrays.copyOf(strArr, strArr.length));
        ArrayList arrayListA = kw5.a(listK);
        for (String str : listK) {
            if (Intrinsics.g(str, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                String string = permissionActivity.getString(R.string.app_common__storage);
                string.getClass();
                if (!arrayListA.contains(string)) {
                    arrayListA.add(string);
                }
            } else if (Intrinsics.g(str, "android.permission.POST_NOTIFICATIONS")) {
                String string2 = permissionActivity.getString(R.string.wap_setting__notifications);
                string2.getClass();
                if (!arrayListA.contains(string2)) {
                    arrayListA.add(string2);
                }
            }
        }
        return arrayListA;
    }
}
