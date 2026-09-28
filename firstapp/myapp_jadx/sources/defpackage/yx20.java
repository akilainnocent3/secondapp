package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yx20 {
    public static final void a(xdf0 xdf0Var, Context context, final boolean z, final String str, final long j) {
        if (ulf0.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) vx20.a.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        etw<ydf0> etwVar = xdf0Var.a;
        etw<ydf0> etwVar2 = xdf0Var.a;
        sef0 sef0Var = sef0.b;
        etwVar.g(sef0Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            etwVar2.g(new ief0(new wx20(i), resolveInfo.loadLabel(packageManager).toString(), 0, new Function1() { // from class: xx20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    vx20.b.l(context2, resolveInfo, Boolean.valueOf(z), str, new ulf0(j));
                    ((tef0) obj).close();
                    return Unit.a;
                }
            }));
            i++;
            context2 = context;
        }
        etwVar2.g(sef0Var);
    }
}
