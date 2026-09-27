package yads;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f158371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk f158372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xk f158373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pk f158374d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f158376f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f158378h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f158377g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f158375e = 0;

    public yk(Context context, Handler handler, wn0 wn0Var) {
        this.f158371a = (AudioManager) ni.a(context.getApplicationContext().getSystemService("audio"));
        this.f158373c = wn0Var;
        this.f158372b = new wk(this, handler);
    }

    public final void a() {
        if (this.f158375e == 0) {
            return;
        }
        if (ib3.f150516a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f158378h;
            if (audioFocusRequest != null) {
                this.f158371a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f158371a.abandonAudioFocus(this.f158372b);
        }
        b(0);
    }

    public final void b() {
        if (ib3.a(this.f158374d, (Object) null)) {
            return;
        }
        this.f158374d = null;
        this.f158376f = 0;
    }

    public final void b(int i10) {
        if (this.f158375e == i10) {
            return;
        }
        this.f158375e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f158377g == f10) {
            return;
        }
        this.f158377g = f10;
        xk xkVar = this.f158373c;
        if (xkVar != null) {
            zn0 zn0Var = ((wn0) xkVar).f157452a;
            zn0Var.a(1, 2, Float.valueOf(zn0Var.T * zn0Var.f158964v.f158377g));
        }
    }

    public final void a(int i10) {
        xk xkVar = this.f158373c;
        if (xkVar != null) {
            wn0 wn0Var = (wn0) xkVar;
            zn0 zn0Var = wn0Var.f157452a;
            zn0Var.r();
            boolean z10 = zn0Var.Z.f147709l;
            zn0 zn0Var2 = wn0Var.f157452a;
            int i11 = 1;
            if (z10 && i10 != 1) {
                i11 = 2;
            }
            zn0Var2.a(i10, i11, z10);
        }
    }

    public final int a(boolean z10, int i10) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderA;
        if (i10 == 1 || this.f158376f != 1) {
            a();
            return z10 ? 1 : -1;
        }
        if (z10) {
            if (this.f158375e == 1) {
                return 1;
            }
            if (ib3.f150516a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f158378h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        com.chartboost.sdk.internal.interruption.c.a();
                        builderA = v4.m.a(this.f158376f);
                    } else {
                        com.chartboost.sdk.internal.interruption.c.a();
                        builderA = re.c.a(this.f158378h);
                    }
                    pk pkVar = this.f158374d;
                    boolean z11 = pkVar != null && pkVar.f153962b == 1;
                    pkVar.getClass();
                    if (pkVar.f153967g == null) {
                        pkVar.f153967g = new ok(pkVar);
                    }
                    this.f158378h = builderA.setAudioAttributes(pkVar.f153967g.f153517a).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(this.f158372b).build();
                }
                iRequestAudioFocus = this.f158371a.requestAudioFocus(this.f158378h);
            } else {
                AudioManager audioManager = this.f158371a;
                wk wkVar = this.f158372b;
                pk pkVar2 = this.f158374d;
                pkVar2.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(wkVar, ib3.c(pkVar2.f153964d), this.f158376f);
            }
            if (iRequestAudioFocus == 1) {
                b(1);
                return 1;
            }
            b(0);
        }
        return -1;
    }
}
