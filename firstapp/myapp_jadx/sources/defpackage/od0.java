package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class od0 {
    public static final long a(AndroidComposeView androidComposeView) {
        Activity activity;
        int iRound;
        long j;
        v65 v65Var;
        Context context = androidComposeView.getContext();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof Activity)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            } else {
                activity = (Activity) baseContext;
                break;
            }
        }
        if (activity != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                v65Var = z65.a;
            } else if (i >= 29) {
                v65Var = y65.a;
            } else {
                v65Var = i >= 28 ? x65.a : w65.a;
            }
            Rect rectA = v65Var.a(activity);
            int iWidth = rectA.width();
            iRound = rectA.height();
            j = iWidth;
        } else {
            Configuration configuration = context.getResources().getConfiguration();
            float f = context.getResources().getDisplayMetrics().density;
            int iRound2 = Math.round(configuration.screenWidthDp * f);
            iRound = Math.round(configuration.screenHeightDp * f);
            j = iRound2;
        }
        return (((long) iRound) & 4294967295L) | (j << 32);
    }
}
