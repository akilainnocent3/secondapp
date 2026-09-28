package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.e;

/* JADX INFO: loaded from: classes.dex */
public final class a31 {
    public final mfe0<AudioManager> a;
    public final Handler b;
    public e c;
    public r21 d;
    public int f;
    public c31 h;
    public float g = 1.0f;
    public int e = 0;

    public a31(final Context context, Looper looper, e eVar) {
        this.a = nfe0.a(new mfe0() { // from class: z21
            @Override // defpackage.mfe0
            public final Object get() {
                return g31.b(context);
            }
        });
        this.c = eVar;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        g31.a(this.a.get(), this.h);
    }

    public final void b(int i) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.v.g(33, i, 0).b();
        }
    }

    public final void c(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        e eVar = this.c;
        if (eVar != null) {
            eVar.v.k(34);
        }
    }

    public final int d(int i, boolean z) {
        int i2;
        c31.a aVar;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            c(0);
            return 1;
        }
        int i3 = this.e;
        if (z) {
            if (i3 != 2) {
                c31 c31Var = this.h;
                if (c31Var == null) {
                    if (c31Var == null) {
                        aVar = new c31.a();
                        r21 r21Var = r21.d;
                        aVar.a = i2;
                    } else {
                        c31.a aVar2 = new c31.a();
                        aVar2.a = c31Var.a;
                        aVar = aVar2;
                    }
                    r21 r21Var2 = this.d;
                    boolean z2 = r21Var2 != null && r21Var2.a == 1;
                    r21Var2.getClass();
                    this.h = new c31(aVar.a, new AudioManager.OnAudioFocusChangeListener() { // from class: y21
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i4) {
                            r21 r21Var3;
                            a31 a31Var = this.a;
                            a31Var.getClass();
                            if (i4 == -3 || i4 == -2) {
                                if (i4 != -2 && ((r21Var3 = a31Var.d) == null || r21Var3.a != 1)) {
                                    a31Var.c(4);
                                    return;
                                } else {
                                    a31Var.b(0);
                                    a31Var.c(3);
                                    return;
                                }
                            }
                            if (i4 == -1) {
                                a31Var.b(-1);
                                a31Var.a();
                                a31Var.c(1);
                            } else if (i4 != 1) {
                                h08.a(i4, "Unknown focus change type: ", "AudioFocusManager");
                            } else {
                                a31Var.c(2);
                                a31Var.b(1);
                            }
                        }
                    }, this.b, r21Var2, z2);
                }
                if (g31.c(this.a.get(), this.h) == 1) {
                    c(2);
                    return 1;
                }
                c(1);
                return -1;
            }
        } else {
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
