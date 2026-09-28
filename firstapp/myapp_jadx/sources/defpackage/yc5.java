package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.virtual.presentation.dialog.BuildAndGoRunningPageDialog;

/* JADX INFO: loaded from: classes6.dex */
public final class yc5 {
    public static final /* synthetic */ int a = 0;

    public static final void a(FragmentManager fragmentManager, boolean z) {
        fragmentManager.getClass();
        if (fragmentManager.H("FeaturedBNGRunningPageDialog") != null || fragmentManager.K || fragmentManager.V()) {
            return;
        }
        BuildAndGoRunningPageDialog buildAndGoRunningPageDialog = new BuildAndGoRunningPageDialog();
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_SHOW_CAROUSEL", z);
        buildAndGoRunningPageDialog.setArguments(bundle);
        buildAndGoRunningPageDialog.setCancelable(true);
        buildAndGoRunningPageDialog.show(fragmentManager, "FeaturedBNGRunningPageDialog");
    }
}
