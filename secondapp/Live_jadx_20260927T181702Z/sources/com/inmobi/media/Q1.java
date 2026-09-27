package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f55343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f55344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioAttributes f55345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioFocusRequest f55346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f55347f;

    public Q1(Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.m0.o(applicationContext, "getApplicationContext(...)");
        this.f55342a = applicationContext;
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        kotlin.jvm.internal.m0.o(audioAttributesBuild, "build(...)");
        this.f55345d = audioAttributesBuild;
    }

    public final void a() {
        this.f55343b = false;
        Object systemService = this.f55342a.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.f55346e;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f55347f;
            if (onAudioFocusChangeListener != null) {
                audioManager.abandonAudioFocus(onAudioFocusChangeListener);
            }
        }
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return new AudioManager.OnAudioFocusChangeListener() { // from class: com.inmobi.media.bu
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                Q1.a(this.f56108b, i10);
            }
        };
    }

    public final void c() {
        WeakReference weakReference = this.f55344c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f55344c = null;
        a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f55346e = null;
        }
        this.f55347f = null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    public final boolean d() {
        int iRequestAudioFocus;
        Object systemService = this.f55342a.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            iRequestAudioFocus = 0;
        } else {
            if (this.f55347f == null) {
                this.f55347f = b();
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (this.f55346e == null) {
                    AudioFocusRequest.Builder audioAttributes = v4.m.a(2).setAudioAttributes(this.f55345d);
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f55347f;
                    kotlin.jvm.internal.m0.m(onAudioFocusChangeListener);
                    AudioFocusRequest audioFocusRequestBuild = audioAttributes.setOnAudioFocusChangeListener(onAudioFocusChangeListener, ((Wb) AbstractC3884o6.f57190e.getValue()).f55723a).build();
                    kotlin.jvm.internal.m0.o(audioFocusRequestBuild, "build(...)");
                    this.f55346e = audioFocusRequestBuild;
                }
                AudioFocusRequest audioFocusRequest = this.f55346e;
                if (audioFocusRequest != null) {
                    iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                } else {
                    iRequestAudioFocus = 0;
                }
            } else {
                iRequestAudioFocus = audioManager.requestAudioFocus(this.f55347f, 3, 2);
            }
        }
        return iRequestAudioFocus == 1;
    }

    public static final void a(Q1 q10, int i10) {
        P1 p10;
        P1 p11;
        WeakReference weakReference;
        P1 p12;
        if (i10 == -2) {
            q10.f55343b = true;
            WeakReference weakReference2 = q10.f55344c;
            if (weakReference2 == null || (p10 = (P1) weakReference2.get()) == null) {
                return;
            }
            p10.a();
            return;
        }
        if (i10 == -1) {
            q10.f55343b = false;
            WeakReference weakReference3 = q10.f55344c;
            if (weakReference3 == null || (p11 = (P1) weakReference3.get()) == null) {
                return;
            }
            p11.a();
            return;
        }
        if (i10 != 1) {
            return;
        }
        if (q10.f55343b && (weakReference = q10.f55344c) != null && (p12 = (P1) weakReference.get()) != null) {
            p12.b();
        }
        q10.f55343b = false;
    }
}
