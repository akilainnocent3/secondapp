package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4235d4;

/* JADX INFO: renamed from: com.inmobi.media.wc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4089wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3594ci f58002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3837m9 f58003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3716hc f58004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3536ac f58005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3536ac f58006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3536ac f58007f;

    public C4089wc(GestureDetectorOnGestureListenerC3594ci gestureDetectorOnGestureListenerC3594ci, InterfaceC3837m9 interfaceC3837m9) {
        this.f58002a = gestureDetectorOnGestureListenerC3594ci;
        this.f58003b = interfaceC3837m9;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean b() {
        Context context = Ji.f54934a;
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public final void a(String url, Activity activity) {
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(activity, "activity");
        InterfaceC3837m9 interfaceC3837m9 = this.f58003b;
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("MraidMediaProcessor", "doPlayMedia");
        }
        C3716hc c3716hc = new C3716hc(activity, this.f58003b);
        this.f58004c = c3716hc;
        c3716hc.setPlaybackData(url);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        C3716hc c3716hc2 = this.f58004c;
        if (c3716hc2 != null) {
            c3716hc2.setLayoutParams(layoutParams);
        }
        C3741ic c3741ic = new C3741ic(activity);
        c3741ic.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.h20
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C4089wc.a(view, motionEvent);
            }
        });
        c3741ic.setBackgroundColor(-16777216);
        c3741ic.addView(this.f58004c);
        InterfaceC3837m9 interfaceC3837m10 = this.f58003b;
        if (interfaceC3837m10 != null) {
            ((C3862n9) interfaceC3837m10).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c3741ic, new ViewGroup.LayoutParams(-1, -1));
        C3716hc c3716hc3 = this.f58004c;
        if (c3716hc3 != null) {
            c3716hc3.setViewContainer(c3741ic);
        }
        C3716hc c3716hc4 = this.f58004c;
        if (c3716hc4 != null) {
            c3716hc4.requestFocus();
        }
        C3716hc c3716hc5 = this.f58004c;
        if (c3716hc5 != null) {
            c3716hc5.setOnKeyListener(new View.OnKeyListener() { // from class: com.inmobi.media.i20
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                    return C4089wc.a(this.f56636b, view, i10, keyEvent);
                }
            });
        }
        C3716hc c3716hc6 = this.f58004c;
        if (c3716hc6 != null) {
            c3716hc6.setListener(new C4064vc(this));
        }
        C3716hc c3716hc7 = this.f58004c;
        if (c3716hc7 != null) {
            c3716hc7.a();
        }
    }

    public final void b(String str, boolean z10) {
        InterfaceC3837m9 interfaceC3837m9 = this.f58003b;
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("MraidMediaProcessor", "fireHeadphonePluggedEvent");
        }
        GestureDetectorOnGestureListenerC3594ci gestureDetectorOnGestureListenerC3594ci = this.f58002a;
        if (gestureDetectorOnGestureListenerC3594ci != null) {
            gestureDetectorOnGestureListenerC3594ci.a(str, "fireHeadphonePluggedEvent(" + z10 + ");");
        }
    }

    public static final boolean a(C4089wc c4089wc, View view, int i10, KeyEvent keyEvent) {
        if (4 != i10 || keyEvent.getAction() != 0) {
            return false;
        }
        C3716hc c3716hc = c4089wc.f58004c;
        if (c3716hc == null) {
            return true;
        }
        c3716hc.b();
        return true;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        InterfaceC3837m9 interfaceC3837m9 = this.f58003b;
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("MraidMediaProcessor", C4235d4.j.P);
        }
        Context context = Ji.f54934a;
        if (context == null) {
            return -1;
        }
        GestureDetectorOnGestureListenerC3594ci gestureDetectorOnGestureListenerC3594ci = this.f58002a;
        if (((gestureDetectorOnGestureListenerC3594ci == null || (renderingConfig = gestureDetectorOnGestureListenerC3594ci.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && Ji.f54939f) {
            return 0;
        }
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public final void a(String str, boolean z10) {
        InterfaceC3837m9 interfaceC3837m9 = this.f58003b;
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
        }
        GestureDetectorOnGestureListenerC3594ci gestureDetectorOnGestureListenerC3594ci = this.f58002a;
        if (gestureDetectorOnGestureListenerC3594ci != null) {
            gestureDetectorOnGestureListenerC3594ci.a(str, "fireDeviceMuteChangeEvent(" + z10 + ");");
        }
    }

    public final void a(String str, int i10) {
        InterfaceC3837m9 interfaceC3837m9 = this.f58003b;
        if (interfaceC3837m9 != null) {
            ((C3862n9) interfaceC3837m9).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
        }
        GestureDetectorOnGestureListenerC3594ci gestureDetectorOnGestureListenerC3594ci = this.f58002a;
        if (gestureDetectorOnGestureListenerC3594ci != null) {
            gestureDetectorOnGestureListenerC3594ci.a(str, "fireDeviceVolumeChangeEvent(" + i10 + ");");
        }
    }
}
