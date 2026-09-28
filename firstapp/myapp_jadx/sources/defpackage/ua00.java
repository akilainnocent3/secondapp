package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes5.dex */
public final class ua00 {
    @Deprecated(since = "Use Fragment.replaceFragment extension instead")
    public static void a(FragmentManager fragmentManager, String str) {
        mgn mgnVar = (mgn) fragmentManager.H("InfoDialogFragment");
        if (mgnVar != null) {
            mgnVar.dismissAllowingStateLoss();
        }
        mgn mgnVar2 = new mgn();
        Bundle bundle = new Bundle();
        bundle.putString("param1", str);
        mgnVar2.setArguments(bundle);
        mgnVar2.show(fragmentManager, "InfoDialogFragment");
    }
}
