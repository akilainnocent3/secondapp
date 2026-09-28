package defpackage;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.media3.exoplayer.l;
import com.pairip.VMRunner;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w21 {
    public final Context a;
    public final qad b;
    public final Handler c;
    public final a d;
    public final c e;
    public final b f;
    public u21 g;
    public x21 h;
    public r21 i;
    public boolean j;

    public final class a extends AudioDeviceCallback {
        public a() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            w21 w21Var = w21.this;
            w21Var.a(u21.b(w21Var.a, w21Var.i, w21Var.h));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            w21 w21Var = w21.this;
            if (jrh0.l(w21Var.h, audioDeviceInfoArr)) {
                w21Var.h = null;
            }
            w21Var.a(u21.b(w21Var.a, w21Var.i, w21Var.h));
        }
    }

    public final class b extends ContentObserver {
        public final ContentResolver a;
        public final Uri b;

        public b(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.a = contentResolver;
            this.b = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            w21 w21Var = w21.this;
            w21Var.a(u21.b(w21Var.a, w21Var.i, w21Var.h));
        }
    }

    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            VMRunner.invoke("048VrTOBNWK2NUvJ", new Object[]{this, context, intent});
        }
    }

    public w21(Context context, qad qadVar, r21 r21Var, x21 x21Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = qadVar;
        this.i = r21Var;
        this.h = x21Var;
        String str = jrh0.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.c = handler;
        this.d = new a();
        this.e = new c();
        u21 u21Var = u21.c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new b(handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(u21 u21Var) {
        l.a aVar;
        if (!this.j || u21Var.equals(this.g)) {
            return;
        }
        this.g = u21Var;
        tad tadVar = this.b.a;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = tadVar.h0 == looperMyLooper;
        StringBuilder sb = new StringBuilder("Current looper (");
        sb.append(looperMyLooper == null ? "null" : looperMyLooper.getThread().getName());
        sb.append(") is not the playback looper (");
        Looper looper = tadVar.h0;
        sb.append(looper == null ? "null" : looper.getThread().getName());
        sb.append(")");
        ly0.e(sb.toString(), z);
        u21 u21Var2 = tadVar.x;
        if (u21Var2 == null || u21Var.equals(u21Var2)) {
            return;
        }
        tadVar.x = u21Var;
        wiv.a aVar2 = tadVar.s;
        if (aVar2 != null) {
            wiv wivVar = wiv.this;
            synchronized (wivVar.a) {
                aVar = wivVar.G;
            }
            if (aVar != null) {
                pid pidVar = (pid) aVar;
                synchronized (pidVar.c) {
                    pidVar.f.getClass();
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        x21 x21Var = this.h;
        if (Objects.equals(audioDeviceInfo, x21Var == null ? null : x21Var.a)) {
            return;
        }
        x21 x21Var2 = audioDeviceInfo != null ? new x21(audioDeviceInfo) : null;
        this.h = x21Var2;
        a(u21.b(this.a, this.i, x21Var2));
    }
}
