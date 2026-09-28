package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig;
import com.sporty.android.core.model.config.VersionData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.update.data.VersionUpdateInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class kkh0 {
    public final Context a;
    public final fbh0 b;

    public kkh0(Context context, fbh0 fbh0Var) {
        context.getClass();
        fbh0Var.getClass();
        this.a = context;
        this.b = fbh0Var;
    }

    public final void a(String str) {
        Object bVar;
        Object bVar2;
        if (str == null || StringsKt.U(str) || !this.b.h(false, Uri.parse(str))) {
            str = null;
        }
        Context context = this.a;
        context.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + context.getPackageName()));
        intent.addFlags(268435456);
        try {
            zi50.a aVar = zi50.b;
            context.startActivity(intent);
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_COMMON);
            aVar3.p(thA, "Unable to open Palm store by market uri", new Object[0]);
            if (str == null || StringsKt.U(str)) {
                Toast.makeText(context, R.string.app_common__unable_to_find_application_to_perform_this_action, 0).show();
                return;
            }
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268435456);
                context.startActivity(intent2);
                bVar2 = Unit.a;
            } catch (Throwable th2) {
                zi50.a aVar4 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            Throwable thA2 = zi50.a(bVar2);
            if (thA2 != null) {
                itf0.a aVar5 = itf0.a;
                aVar5.q(MyLog.TAG_COMMON);
                aVar5.p(thA2, "Unable to open Palm store fallback url", new Object[0]);
                Toast.makeText(context, R.string.app_common__unable_to_find_application_to_perform_this_action, 0).show();
            }
        }
    }

    public final void b(String str) {
        if (str != null && !StringsKt.U(str)) {
            Uri uri = Uri.parse(str);
            fbh0 fbh0Var = this.b;
            if (fbh0Var.h(false, uri)) {
                fbh0Var.e(str);
                return;
            }
        }
        Context context = this.a;
        String packageName = context.getPackageName();
        packageName.getClass();
        n5l.a(context, packageName);
    }

    public final void c(VersionAutoUpdateConfig versionAutoUpdateConfig, VersionData versionData, final Function0<Unit> function0) {
        Object bVar;
        versionAutoUpdateConfig.getClass();
        versionData.getClass();
        Context context = this.a;
        if (context instanceof e) {
            e eVar = (e) context;
            Fragment fragmentH = eVar.getSupportFragmentManager().H("VersionUpdateDialogFragment");
            if (fragmentH != null) {
                try {
                    zi50.a aVar = zi50.b;
                    if ((fragmentH instanceof d) && ((d) fragmentH).isAdded()) {
                        ((d) fragmentH).dismissAllowingStateLoss();
                    }
                    bVar = Unit.a;
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                Throwable thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a aVar3 = itf0.a;
                    aVar3.q(MyLog.TAG_VERSION_CHECK);
                    aVar3.p(thA, "unable to dismiss previous new version dialog", new Object[0]);
                }
            }
            i2i0 i2i0VarM0 = i2i0.m0(new VersionUpdateInput.DefaultContent(versionAutoUpdateConfig, versionData), new i2i0.b() { // from class: jkh0
                @Override // i2i0.b
                public final void a() {
                    function0.invoke();
                }
            });
            FragmentManager supportFragmentManager = eVar.getSupportFragmentManager();
            supportFragmentManager.getClass();
            i2i0VarM0.show(supportFragmentManager, "VersionUpdateDialogFragment");
        }
    }
}
