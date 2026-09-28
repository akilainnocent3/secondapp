package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: classes4.dex */
public final class skx implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ NavigationView a;

    public skx(NavigationView navigationView) {
        this.a = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        NavigationView navigationView = this.a;
        int[] iArr = navigationView.z;
        navigationView.getLocationOnScreen(iArr);
        boolean z = true;
        boolean z2 = iArr[1] == 0;
        ekx ekxVar = navigationView.w;
        if (ekxVar.M != z2) {
            ekxVar.M = z2;
            int i = (ekxVar.b.getChildCount() <= 0 && ekxVar.M) ? ekxVar.O : 0;
            NavigationMenuView navigationMenuView = ekxVar.a;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        navigationView.setDrawTopInsetForeground(z2 && navigationView.C);
        boolean z3 = navigationView.getLayoutDirection() == 1;
        int i2 = iArr[0];
        navigationView.setDrawLeftInsetForeground((i2 == 0 || navigationView.getWidth() + i2 == 0) && (!z3 ? !navigationView.E : !navigationView.F));
        Context context = navigationView.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            Rect rectA = n9j0.a(activity);
            navigationView.setDrawBottomInsetForeground((rectA.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.D);
            if ((rectA.width() != iArr[0] && rectA.width() - navigationView.getWidth() != iArr[0]) || (!z3 ? !navigationView.F : !navigationView.E)) {
                z = false;
            }
            navigationView.setDrawRightInsetForeground(z);
        }
    }
}
