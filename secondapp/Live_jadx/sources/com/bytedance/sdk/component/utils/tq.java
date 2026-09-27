package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    private static hww hww;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
        boolean hww();

        ExecutorService sd();

        boolean tq();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.tq$tq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0333tq {
        void hww();

        void hww(Throwable th2);
    }

    public static void hww(hww hwwVar) {
        hww = hwwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean sd(Context context, Intent intent, InterfaceC0333tq interfaceC0333tq) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0333tq == null) {
                    return true;
                }
                interfaceC0333tq.hww();
                return true;
            } catch (Throwable th2) {
                if (interfaceC0333tq != null) {
                    interfaceC0333tq.hww(th2);
                }
            }
        }
        return false;
    }

    public static void hww(final Context context, final Intent intent, final InterfaceC0333tq interfaceC0333tq) {
        ExecutorService executorServiceSd;
        hww hwwVar = hww;
        if (hwwVar == null || !hwwVar.tq() || (executorServiceSd = hww.sd()) == null) {
            sd(context, intent, interfaceC0333tq);
        } else {
            executorServiceSd.execute(new com.bytedance.sdk.component.ok.ok("startAct") { // from class: com.bytedance.sdk.component.utils.tq.1
                @Override // java.lang.Runnable
                public void run() {
                    tq.sd(context, intent, interfaceC0333tq);
                }
            });
        }
    }

    public static boolean hww(final Context context, final Intent intent, final InterfaceC0333tq interfaceC0333tq, boolean z10) {
        hww hwwVar;
        ExecutorService executorServiceSd;
        if (z10 && (hwwVar = hww) != null && hwwVar.hww() && (executorServiceSd = hww.sd()) != null) {
            executorServiceSd.execute(new com.bytedance.sdk.component.ok.ok("startAct") { // from class: com.bytedance.sdk.component.utils.tq.2
                @Override // java.lang.Runnable
                public void run() {
                    tq.sd(context, intent, interfaceC0333tq);
                }
            });
            return true;
        }
        return sd(context, intent, interfaceC0333tq);
    }

    public static Activity hww(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    public static boolean hww(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
