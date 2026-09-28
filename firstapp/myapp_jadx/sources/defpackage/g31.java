package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class g31 {
    public static AudioManager a;

    public static void a(AudioManager audioManager, c31 c31Var) {
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(c31Var.b);
            return;
        }
        Object obj = c31Var.f;
        obj.getClass();
        audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
    }

    public static synchronized AudioManager b(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                a = null;
            }
            AudioManager audioManager = a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final eoa eoaVar = new eoa();
                ls1.a().execute(new Runnable() { // from class: f31
                    @Override // java.lang.Runnable
                    public final void run() {
                        g31.a = (AudioManager) applicationContext.getSystemService("audio");
                        eoaVar.c();
                    }
                });
                eoaVar.a();
                AudioManager audioManager2 = a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static int c(AudioManager audioManager, c31 c31Var) {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            Object obj = c31Var.f;
            obj.getClass();
            return audioManager.requestAudioFocus((AudioFocusRequest) obj);
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = c31Var.b;
        switch (c31Var.d.b) {
            case 2:
                i = 0;
                break;
            case 3:
                i = 8;
                break;
            case 4:
                i = 4;
                break;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                i = 5;
                break;
            case 6:
                i = 2;
                break;
            case 11:
                i = 10;
                break;
            case 12:
            default:
                i = 3;
                break;
            case 13:
                i = 1;
                break;
        }
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, i, c31Var.a);
    }
}
