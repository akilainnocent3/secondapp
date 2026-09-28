package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c31 {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final r21 d;
    public final boolean e;
    public final Object f;

    public static final class a {
        public int a;
    }

    public static class b implements AudioManager.OnAudioFocusChangeListener {
        public final Handler a;
        public final AudioManager.OnAudioFocusChangeListener b;

        public b(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.b = onAudioFocusChangeListener;
            Looper looper = handler.getLooper();
            String str = jrh0.a;
            this.a = new Handler(looper, null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i) {
            jrh0.S(this.a, new Runnable() { // from class: d31
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.onAudioFocusChange(i);
                }
            });
        }
    }

    public c31(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, r21 r21Var, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = r21Var;
        this.e = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.b = new b(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f = new AudioFocusRequest.Builder(i).setAudioAttributes(r21Var.a().a).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c31)) {
            return false;
        }
        c31 c31Var = (c31) obj;
        return this.a == c31Var.a && this.e == c31Var.e && Objects.equals(this.b, c31Var.b) && this.c.equals(c31Var.c) && Objects.equals(this.d, c31Var.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
