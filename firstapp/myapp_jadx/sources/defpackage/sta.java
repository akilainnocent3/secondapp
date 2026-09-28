package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.core.model.patron.UserCertConstants;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class sta {
    public static final sta a = new sta();
    public static WeakReference<rqa> b;
    public static volatile boolean c;

    public final void a(e eVar, xcj xcjVar, uta utaVar, Function0 function0, wta wtaVar) {
        synchronized (this) {
            if (c) {
                return;
            }
            c = true;
            Unit unit = Unit.a;
            FragmentManager supportFragmentManager = eVar.getSupportFragmentManager();
            supportFragmentManager.getClass();
            rqa rqaVar = new rqa();
            Bundle bundle = new Bundle();
            bundle.putInt(UserCertConstants.CONFIRM_NAME_USAGE, 10);
            bundle.putString("extra_dialog_variant", xcjVar != null ? xcjVar.a : null);
            bundle.putBoolean("extra_dialog_cancelable", true);
            rqaVar.setArguments(bundle);
            rqaVar.setCancelable(true);
            rqaVar.v = function0;
            if (wtaVar != null) {
                rqaVar.i = wtaVar;
            }
            b = new WeakReference<>(rqaVar);
            try {
                String tag = rqaVar.getTag();
                if (tag == null) {
                    tag = "ConfirmNameDialog";
                }
                cr0.a(rqaVar, supportFragmentManager, tag);
                if (utaVar != null) {
                    utaVar.invoke();
                }
            } catch (Exception unused) {
                c = false;
                b = null;
            }
        }
    }
}
