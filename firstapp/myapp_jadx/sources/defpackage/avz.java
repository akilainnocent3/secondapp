package defpackage;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;

/* JADX INFO: loaded from: classes5.dex */
public final class avz implements zuz {
    public static void b(FragmentManager fragmentManager, Fragment fragment) {
        fragmentManager.getClass();
        a aVar = new a(fragmentManager);
        aVar.f(R.id.content, fragment, null);
        aVar.c(null);
        aVar.k(true, true);
    }

    @Override // defpackage.zuz
    public final void a(FragmentManager fragmentManager, String str, String str2, boolean z, boolean z2, String str3) {
        fragmentManager.getClass();
        ec50 ec50Var = new ec50();
        Bundle bundleA = whs.a("mobile", str, "token", str2);
        bundleA.putBoolean("isForced", z);
        bundleA.putBoolean("isSkippable", z2);
        bundleA.putString("triggeredEvent", str3);
        ec50Var.setArguments(bundleA);
        b(fragmentManager, ec50Var);
    }
}
