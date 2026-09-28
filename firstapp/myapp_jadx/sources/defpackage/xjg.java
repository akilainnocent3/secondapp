package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.EditText;
import com.sportybet.plugin.event.EventActivity;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xjg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xjg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText;
        Iterable iterableC;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                hsx hsxVar = ((EventActivity) obj).x0;
                if (hsxVar != null && (editText = hsxVar.i) != null) {
                    lop.b(editText, Boolean.FALSE);
                    break;
                }
                break;
            default:
                mdl mdlVar = (mdl) obj;
                if (!mdlVar.v && !mdlVar.w) {
                    if (SystemClock.elapsedRealtime() - mdlVar.y >= mdlVar.e.getStartupGracePeriodMs()) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - mdlVar.i;
                        if (jElapsedRealtime > mdlVar.e.getThresholdMs()) {
                            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                            stackTrace.getClass();
                            int maxStackTraceLines = mdlVar.e.getMaxStackTraceLines();
                            if (maxStackTraceLines < 0) {
                                kb5.a(pe4.b(maxStackTraceLines, "Requested element count ", " is less than zero."));
                            } else {
                                if (maxStackTraceLines == 0) {
                                    iterableC = m2g.a;
                                } else if (maxStackTraceLines >= stackTrace.length) {
                                    iterableC = ay0.S(stackTrace);
                                } else {
                                    iterableC = maxStackTraceLines == 1 ? a.c(stackTrace[0]) : xx0.c(xx0.k(0, maxStackTraceLines, stackTrace));
                                }
                                String strA0 = CollectionsKt.a0(iterableC, "\n", "\n", null, new ldl(), 28);
                                mdlVar.w = true;
                                mdlVar.a.a(new rdl(jElapsedRealtime, (String) mdlVar.b.getValue(), strA0), k00.d);
                                ((Handler) mdlVar.c.getValue()).removeCallbacks(mdlVar.z);
                                ScheduledFuture<?> scheduledFuture = mdlVar.f;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(false);
                                }
                                ((ScheduledExecutorService) mdlVar.d.getValue()).shutdown();
                            }
                        }
                    } else {
                        mdlVar.i = SystemClock.elapsedRealtime();
                    }
                    break;
                }
                break;
        }
    }
}
