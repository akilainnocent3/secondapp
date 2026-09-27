package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.C4235d4;
import com.ironsource.environment.ContextProvider;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a extends IronSourceLogger {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f62726c = "console";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62727d = "LevelPlaySDK: ";

    private a() {
        super("console");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UIThread: ");
        sb2.append(Looper.getMainLooper() == Looper.myLooper());
        sb2.append(" ");
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Activity: ");
        sb3.append(ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE);
        sb3.append(" ");
        String string2 = sb3.toString();
        if (i10 == 0) {
            Log.v(f62727d + ironSourceTag, string + string2 + str);
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                Log.w(f62727d + ironSourceTag, str);
                return;
            }
            if (i10 == 3) {
                Log.e(f62727d + ironSourceTag, str);
                return;
            }
            if (i10 != 4) {
                return;
            }
        }
        Log.i(f62727d + ironSourceTag, str);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th2) {
        log(ironSourceTag, str + ":stacktrace[" + Log.getStackTraceString(th2) + C4235d4.j.f61462e, 3);
    }

    public a(int i10) {
        super("console", i10);
    }
}
