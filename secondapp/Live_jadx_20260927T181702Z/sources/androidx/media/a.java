package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import e2.s;
import k.t;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AudioAttributesCompat f13571g = new AudioAttributesCompat.d().e(1).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f13573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f13574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioAttributesCompat f13575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13577f;

    /* JADX INFO: renamed from: androidx.media.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(26)
    public static class C0102a {
        @t
        public static AudioFocusRequest a(int i10, AudioAttributes audioAttributes, boolean z10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i10).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f13583d = 2782386;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f13584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AudioManager.OnAudioFocusChangeListener f13585c;

        public c(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, @NonNull Handler handler) {
            this.f13585c = onAudioFocusChangeListener;
            this.f13584b = new Handler(handler.getLooper(), this);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 2782386) {
                return false;
            }
            this.f13585c.onAudioFocusChange(message.arg1);
            return true;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            Handler handler = this.f13584b;
            handler.sendMessage(Message.obtain(handler, f13583d, i10, 0));
        }
    }

    public a(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z10) {
        this.f13572a = i10;
        this.f13574c = handler;
        this.f13575d = audioAttributesCompat;
        this.f13576e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f13573b = onAudioFocusChangeListener;
        } else {
            this.f13573b = new c(onAudioFocusChangeListener, handler);
        }
        if (i11 >= 26) {
            this.f13577f = C0102a.a(i10, a(), z10, this.f13573b, handler);
        } else {
            this.f13577f = null;
        }
    }

    @t0(21)
    public AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.f13575d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.j();
        }
        return null;
    }

    @NonNull
    public AudioAttributesCompat b() {
        return this.f13575d;
    }

    @t0(26)
    public AudioFocusRequest c() {
        return q4.b.a(this.f13577f);
    }

    @NonNull
    public Handler d() {
        return this.f13574c;
    }

    public int e() {
        return this.f13572a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13572a == aVar.f13572a && this.f13576e == aVar.f13576e && s.a(this.f13573b, aVar.f13573b) && s.a(this.f13574c, aVar.f13574c) && s.a(this.f13575d, aVar.f13575d);
    }

    @NonNull
    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f13573b;
    }

    public boolean g() {
        return this.f13576e;
    }

    public int hashCode() {
        return s.b(Integer.valueOf(this.f13572a), this.f13573b, this.f13574c, this.f13575d, Boolean.valueOf(this.f13576e));
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AudioManager.OnAudioFocusChangeListener f13579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f13580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AudioAttributesCompat f13581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f13582e;

        public b(int i10) {
            this.f13581d = a.f13571g;
            d(i10);
        }

        public static boolean b(int i10) {
            return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
        }

        public a a() {
            if (this.f13579b != null) {
                return new a(this.f13578a, this.f13579b, this.f13580c, this.f13581d, this.f13582e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        @NonNull
        public b c(@NonNull AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat == null) {
                throw new NullPointerException("Illegal null AudioAttributes");
            }
            this.f13581d = audioAttributesCompat;
            return this;
        }

        @NonNull
        public b d(int i10) {
            if (b(i10)) {
                this.f13578a = i10;
                return this;
            }
            throw new IllegalArgumentException("Illegal audio focus gain type " + i10);
        }

        @NonNull
        public b e(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        @NonNull
        public b f(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, @NonNull Handler handler) {
            if (onAudioFocusChangeListener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (handler == null) {
                throw new IllegalArgumentException("Handler must not be null");
            }
            this.f13579b = onAudioFocusChangeListener;
            this.f13580c = handler;
            return this;
        }

        @NonNull
        public b g(boolean z10) {
            this.f13582e = z10;
            return this;
        }

        public b(@NonNull a aVar) {
            this.f13581d = a.f13571g;
            if (aVar != null) {
                this.f13578a = aVar.e();
                this.f13579b = aVar.f();
                this.f13580c = aVar.d();
                this.f13581d = aVar.b();
                this.f13582e = aVar.g();
                return;
            }
            throw new IllegalArgumentException("AudioFocusRequestCompat to copy must not be null");
        }
    }
}
