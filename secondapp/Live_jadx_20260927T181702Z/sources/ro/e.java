package ro;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import k.t0;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @m
    public final Context f127456a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m
    public Context f127458c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @m
    public a f127460e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final String f127457b = "hg";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @m
    public IntentFilter f127459d = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public final String f127461a = "reason";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        public final String f127462b = "globalactions";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @l
        public final String f127463c = "recentapps";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @l
        public final String f127464d = "homekey";

        @l
        public final String a() {
            return this.f127462b;
        }

        @l
        public final String b() {
            return this.f127464d;
        }

        @l
        public final String c() {
            return this.f127461a;
        }

        @l
        public final String d() {
            return this.f127463c;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@m Context context, @l Intent intent) {
            m0.p(intent, "intent");
            try {
                if (m0.g(intent.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                    String stringExtra = intent.getStringExtra(this.f127461a);
                    m0.m(stringExtra);
                    if (stringExtra != null) {
                        Log.d("HomePressedfd", "home  " + stringExtra);
                        to.c cVar = to.c.INSTANCE;
                        if (cVar.getMListener() != null) {
                            if (m0.g(stringExtra, this.f127464d)) {
                                so.h mListener = cVar.getMListener();
                                m0.m(mListener);
                                mListener.b();
                            } else if (m0.g(stringExtra, this.f127463c)) {
                                so.h mListener2 = cVar.getMListener();
                                m0.m(mListener2);
                                mListener2.a();
                            } else if (m0.g(stringExtra, "fs_gesture")) {
                                so.h mListener3 = cVar.getMListener();
                                m0.m(mListener3);
                                mListener3.b();
                            }
                        }
                    }
                }
            } catch (Exception unused) {
                Log.d("Exception", NotificationCompat.CATEGORY_MESSAGE);
            }
        }
    }

    public e(@m Context context) {
        this.f127456a = context;
        this.f127458c = context;
    }

    @m
    public final Context a() {
        return this.f127456a;
    }

    @l
    public final String b() {
        return this.f127457b;
    }

    public final void c(@m so.h hVar) {
        try {
            to.c.INSTANCE.setMListener(hVar);
            this.f127460e = new a();
        } catch (Exception unused) {
            Log.d("Exception", NotificationCompat.CATEGORY_MESSAGE);
        }
    }

    @t0(26)
    public final void d() {
        a aVar = this.f127460e;
        if (aVar != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                Context context = this.f127458c;
                if (context != null) {
                    context.registerReceiver(aVar, this.f127459d, 2);
                    return;
                }
                return;
            }
            Context context2 = this.f127458c;
            if (context2 != null) {
                context2.registerReceiver(aVar, this.f127459d, 0);
            }
        }
    }

    public final void e() {
        Context context;
        a aVar = this.f127460e;
        if (aVar == null || (context = this.f127458c) == null) {
            return;
        }
        context.unregisterReceiver(aVar);
    }
}
