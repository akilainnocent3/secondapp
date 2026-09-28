package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.RemoteViews;
import com.sportybet.android.firebase.MessageService;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.SplashActivity;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class pa30 extends p32 implements na30 {
    public int a = 10001;
    public final AtomicInteger b = new AtomicInteger((int) System.currentTimeMillis());

    public static Intent i(MessageService messageService, String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent(messageService, (Class<?>) SplashActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("purpose", str2);
        intent.putExtra("purposeId", str3);
        intent.putExtra("anTestCopyCode", str4);
        intent.putExtra("anTestCopyVariantName", str5);
        return intent;
    }

    @Override // defpackage.na30
    public final boolean c(final MessageService messageService, String str, String str2, String str3, final String str4, String str5, String str6, String str7, String str8) {
        if (str2 == null || StringsKt.U(str2)) {
            return false;
        }
        final RemoteViews remoteViews = new RemoteViews(messageService.getPackageName(), R.layout.push_notification);
        remoteViews.setTextViewText(R.id.push_content, str2);
        PendingIntent activity = PendingIntent.getActivity(messageService, this.a, i(messageService, str3, str5, str6, str7, str8), Build.VERSION.SDK_INT >= 31 ? 1140850688 : 1073741824);
        activity.getClass();
        final g1y g1yVarB = b5y.b(messageService, "FCMPic");
        g1yVarB.e = g1y.b(str);
        g1yVarB.g = activity;
        Notification notification = g1yVarB.w;
        notification.contentView = remoteViews;
        g1yVarB.j = 1;
        notification.vibrate = new long[0];
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: oa30
            @Override // java.lang.Runnable
            public final void run() {
                gbn gbnVarA = sh8.a();
                pa30 pa30Var = this;
                int i = pa30Var.a;
                g1y g1yVar = g1yVarB;
                gbnVarA.i(str4, remoteViews, i, g1yVar.a());
                p32.h(messageService, pa30Var.a, g1yVar.a());
                pa30Var.a++;
            }
        });
        return true;
    }

    @Override // defpackage.na30
    public final boolean d(MessageService messageService, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (str == null || StringsKt.U(str) || str2 == null || StringsKt.U(str2)) {
            return false;
        }
        Intent intentI = i(messageService, str3, str4, str5, str6, str7);
        AtomicInteger atomicInteger = this.b;
        PendingIntent activity = PendingIntent.getActivity(messageService, atomicInteger.incrementAndGet(), intentI, Build.VERSION.SDK_INT >= 31 ? 1140850688 : 1073741824);
        activity.getClass();
        g1y g1yVarB = b5y.b(messageService, "FCMText");
        g1yVarB.e = g1y.b(str);
        g1yVarB.f = g1y.b(str2);
        g1yVarB.g = activity;
        g1yVarB.d(16, true);
        g1yVarB.j = 1;
        f1y f1yVar = new f1y();
        f1yVar.e = g1y.b(str2);
        f1yVar.b = g1y.b(str);
        g1yVarB.f(f1yVar);
        p32.h(messageService, atomicInteger.incrementAndGet(), g1yVarB.a());
        return true;
    }
}
