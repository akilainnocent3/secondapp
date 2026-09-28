package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.sporty.android.core.model.MyLog;

/* JADX INFO: loaded from: classes4.dex */
public final class ge00 {
    public final /* synthetic */ bc6 a;
    public final /* synthetic */ rn8 b;

    public ge00(bc6 bc6Var, rn8 rn8Var) {
        this.a = bc6Var;
        this.b = rn8Var;
    }

    public final void a(boolean z) {
        bc6 bc6Var = this.a;
        if (z) {
            Boolean bool = Boolean.TRUE;
            if (bc6Var.p() instanceof bzx) {
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(bool);
                return;
            } else {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_COMMON);
                aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                return;
            }
        }
        Intent intent = new Intent();
        int i = Build.VERSION.SDK_INT;
        rn8 rn8Var = this.b;
        if (i >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", rn8Var.getPackageName()).getClass();
        } else {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + rn8Var.getPackageName()));
        }
        rn8Var.startActivity(intent);
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
