package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class rhk0 extends ljk0 {
    public final Context a;
    public final /* synthetic */ v4l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhk0(v4l v4lVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = v4lVar;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = w4l.a;
        v4l v4lVar = this.b;
        Context context = this.a;
        int iC = v4lVar.c(context, i2);
        AtomicBoolean atomicBoolean = m5l.a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentA = v4lVar.a(iC, context, "n");
            v4lVar.g(context, iC, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
