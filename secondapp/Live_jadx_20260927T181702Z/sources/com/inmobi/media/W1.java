package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class W1 extends Dk {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public N1 f55701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public N1 f55702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public N1 f55703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public N1 f55704k;

    public W1(InMobiAudio.a callbacks) {
        kotlin.jvm.internal.m0.p(callbacks, "callbacks");
        this.f54522c = callbacks;
    }

    public static final void a(W1 w10, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = w10.f54522c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public static final void b(W1 w10, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = w10.f54522c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3680g1
    public final void c(final AdMetaInfo info) {
        kotlin.jvm.internal.m0.p(info, "info");
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.c(str, "onAdLoadSucceeded " + this);
        }
        super.c(info);
        this.f54520a = (byte) 0;
        C3862n9 c3862n10 = this.f54525f;
        if (c3862n10 != null) {
            String str2 = X1.f55760a;
            kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
            c3862n10.d(str2, "AdManager state - CREATED");
        }
        C3862n9 c3862n11 = this.f54525f;
        if (c3862n11 != null) {
            String str3 = X1.f55760a;
            kotlin.jvm.internal.m0.o(str3, "access$getTAG$p(...)");
            c3862n11.a(str3, "Ad load successful, providing callback");
        }
        this.f54523d.post(new Runnable() { // from class: com.inmobi.media.jv
            @Override // java.lang.Runnable
            public final void run() {
                W1.b(this.f56770b, info);
            }
        });
    }

    @Override // com.inmobi.media.Dk
    public final AbstractC3804l1 f() {
        return m() ? this.f55703j : this.f55704k;
    }

    @Override // com.inmobi.media.Dk
    public final void g() {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "submitAdLoadCalled " + this);
        }
        N1 n10 = this.f55704k;
        if (n10 != null) {
            n10.O();
        }
    }

    public final void h() {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "clear " + this);
        }
        p();
        N1 n10 = this.f55701h;
        if (n10 != null) {
            n10.d();
        }
        this.f55701h = null;
        N1 n11 = this.f55702i;
        if (n11 != null) {
            n11.d();
        }
        this.f55702i = null;
        this.f55703j = null;
        this.f55704k = null;
        this.f54521b = null;
    }

    public final void i() {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "pause " + this);
        }
        N1 n10 = this.f55703j;
        if (n10 != null) {
            n10.W();
        }
    }

    public final void j() {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.c(str, "registerLifeCycleCallbacks " + this);
        }
        N1 n10 = this.f55701h;
        if (n10 != null) {
            n10.Y();
        }
        N1 n11 = this.f55702i;
        if (n11 != null) {
            n11.Y();
        }
    }

    public final void k() {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "loadIntoView " + this);
        }
        N1 n10 = this.f55704k;
        if (n10 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a(wc.d.f142723h, String.valueOf(n10.f56877l.f57863a))) {
            this.f54520a = (byte) 8;
            C3862n9 c3862n10 = this.f54525f;
            if (c3862n10 != null) {
                String str2 = X1.f55760a;
                kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
                c3862n10.d(str2, "AdManager state - LOADING_INTO_VIEW");
            }
            n10.Z();
        }
    }

    public final void l() {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "resume " + this);
        }
        N1 n10 = this.f55703j;
        if (n10 != null) {
            n10.X();
        }
    }

    public final boolean m() {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.c(str, "shouldUseForegroundUnit " + this);
        }
        N1 n10 = this.f55703j;
        Byte bValueOf = n10 != null ? Byte.valueOf(n10.f56867b) : null;
        C3862n9 c3862n10 = this.f54525f;
        if (c3862n10 != null) {
            String str2 = X1.f55760a;
            kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
            c3862n10.d(str2, "State - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    public final void n() {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "submitAdShowCalled " + this);
        }
        N1 n10 = this.f55704k;
        if (n10 != null) {
            n10.Q();
        }
    }

    public final void o() {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "swapAdUnits " + this);
        }
        N1 n10 = this.f55703j;
        if (kotlin.jvm.internal.m0.g(n10, this.f55701h)) {
            this.f55703j = this.f55702i;
            this.f55704k = this.f55701h;
        } else if (kotlin.jvm.internal.m0.g(n10, this.f55702i) || n10 == null) {
            this.f55703j = this.f55701h;
            this.f55704k = this.f55702i;
        }
    }

    public final void p() {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.c(str, "unregisterLifecycleCallbacks " + this);
        }
        N1 n10 = this.f55701h;
        if (n10 != null) {
            n10.b0();
        }
        N1 n11 = this.f55702i;
        if (n11 != null) {
            n11.b0();
        }
    }

    public final boolean a(long j10) {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.c(str, "checkForRefreshRate " + this);
        }
        if (this.f55704k == null) {
            return false;
        }
        C3733i4 c3733i4 = Y3.f55798a;
        kotlin.jvm.internal.m0.p(AdConfig.class, "clazz");
        int minRefreshInterval = ((AdConfig) c3733i4.a(AdConfig.class)).getAudio().getMinRefreshInterval();
        if (SystemClock.elapsedRealtime() - j10 >= minRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        b(this.f55704k, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
        String str2 = X1.f55760a;
        kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
        N1 n10 = this.f55704k;
        Kb.a((byte) 1, str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (n10 != null ? n10.f56877l : null) + gi.j.f86771d);
        C3862n9 c3862n10 = this.f54525f;
        if (c3862n10 != null) {
            kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
            N1 n11 = this.f55704k;
            c3862n10.b(str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (n11 != null ? n11.f56877l : null) + gi.j.f86771d);
        }
        return false;
    }

    public final void b(String adSize) {
        kotlin.jvm.internal.m0.p(adSize, "adSize");
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "load 1 " + this);
        }
        N1 n10 = this.f55704k;
        if (n10 != null && a(wc.d.f142723h, String.valueOf(n10.f56877l.f57863a), this.f54522c) && n10.d((byte) 1)) {
            this.f54520a = (byte) 1;
            C3862n9 c3862n10 = this.f54525f;
            if (c3862n10 != null) {
                String str2 = X1.f55760a;
                kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
                c3862n10.d(str2, "AdManager state - LOADING");
            }
            this.f54524e = null;
            n10.c(adSize);
            n10.b(false);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3680g1
    public final void b(final AdMetaInfo info) {
        kotlin.jvm.internal.m0.p(info, "info");
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.c(str, "onAdFetchSuccess " + this);
        }
        N1 n10 = this.f55704k;
        if ((n10 != null ? n10.b(0) : null) == null) {
            C3862n9 c3862n10 = this.f54525f;
            if (c3862n10 != null) {
                String str2 = X1.f55760a;
                kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
                c3862n10.b(str2, "adObject is null, fetch failed");
            }
            a((AbstractC3804l1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        C3862n9 c3862n11 = this.f54525f;
        if (c3862n11 != null) {
            String str3 = X1.f55760a;
            kotlin.jvm.internal.m0.o(str3, "access$getTAG$p(...)");
            c3862n11.a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.b(info);
        this.f54523d.post(new Runnable() { // from class: com.inmobi.media.kv
            @Override // java.lang.Runnable
            public final void run() {
                W1.a(this.f56856b, info);
            }
        });
    }

    public final void a(RelativeLayout relativeLayout) {
        GestureDetectorOnGestureListenerC3594ci gestureDetectorOnGestureListenerC3594ciI;
        C4052v0 c4052v0;
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "displayAd " + this);
        }
        N1 n10 = this.f55703j;
        if (n10 == null || (gestureDetectorOnGestureListenerC3594ciI = n10.i()) == null) {
            return;
        }
        Fn viewableAd = gestureDetectorOnGestureListenerC3594ciI.getViewableAd();
        N1 n11 = this.f55703j;
        if (n11 != null && (c4052v0 = n11.f56877l) != null && c4052v0.f57872j) {
            gestureDetectorOnGestureListenerC3594ciI.k();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3594ciI.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewC = viewableAd.c();
        viewableAd.a((Map) null);
        N1 n12 = this.f55704k;
        if (n12 != null) {
            n12.W();
        }
        if (viewGroup == null) {
            relativeLayout.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
        N1 n13 = this.f55704k;
        if (n13 != null) {
            n13.d();
        }
    }

    @Override // com.inmobi.media.AbstractC3680g1
    public final void b() {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "onAdShowFailed " + this);
        }
        this.f54523d.post(new Runnable() { // from class: com.inmobi.media.hv
            @Override // java.lang.Runnable
            public final void run() {
                W1.a(this.f56614b);
            }
        });
    }

    public final void b(RelativeLayout relativeLayout) {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "showAudioAd");
        }
        N1 n10 = this.f55703j;
        if (n10 != null && n10.f56867b == 7) {
            String str2 = X1.f55760a;
            kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
            Kb.a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            C3862n9 c3862n10 = this.f54525f;
            if (c3862n10 != null) {
                kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
                c3862n10.b(str2, "ad is active");
            }
            N1 n11 = this.f55704k;
            if (n11 != null) {
                n11.e((short) 15);
                return;
            }
            return;
        }
        N1 n12 = this.f55704k;
        if (n12 != null) {
            C3862n9 c3862n11 = n12.f56874i;
            if (c3862n11 != null) {
                kotlin.jvm.internal.m0.o("l1", "<get-TAG>(...)");
                c3862n11.c("l1", "canProceedToShow");
            }
            if (n12.z()) {
                kotlin.jvm.internal.m0.o("l1", "<get-TAG>(...)");
                Kb.a((byte) 1, "l1", "Ad Show has failed because current ad is expired. Please call load() again.");
                C3862n9 c3862n12 = n12.f56874i;
                if (c3862n12 != null) {
                    kotlin.jvm.internal.m0.o("l1", "<get-TAG>(...)");
                    c3862n12.b("l1", "ad is expired");
                }
                n12.c0();
                return;
            }
            byte b10 = n12.f56867b;
            if (b10 == 1 || b10 == 2) {
                Kb.a((byte) 1, wc.d.f142723h, "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                C3862n9 c3862n13 = n12.f56874i;
                if (c3862n13 != null) {
                    kotlin.jvm.internal.m0.o("l1", "<get-TAG>(...)");
                    c3862n13.b("l1", "ad is not ready");
                }
                C3862n9 c3862n14 = n12.f56874i;
                if (c3862n14 != null) {
                    kotlin.jvm.internal.m0.o("l1", "<get-TAG>(...)");
                    c3862n14.a("l1", "callback - onShowFailure");
                }
                n12.e((short) 2152);
                return;
            }
            if (b10 == 3) {
                Kb.a((byte) 1, wc.d.f142723h, "Ad Load has Failed. Please call load() again.");
                n12.e((short) 0);
                C3862n9 c3862n15 = n12.f56874i;
                if (c3862n15 != null) {
                    kotlin.jvm.internal.m0.o("l1", "<get-TAG>(...)");
                    c3862n15.a("l1", "callback - onShowFailure");
                }
                C3862n9 c3862n16 = n12.f56874i;
                if (c3862n16 != null) {
                    kotlin.jvm.internal.m0.o("l1", "<get-TAG>(...)");
                    c3862n16.b("l1", "ad is failed");
                    return;
                }
                return;
            }
            if (b10 == 8) {
                Kb.a((byte) 1, wc.d.f142723h, "Ad Load has Failed. Please call load() again.");
                n12.e((short) 0);
                C3862n9 c3862n17 = n12.f56874i;
                if (c3862n17 != null) {
                    kotlin.jvm.internal.m0.o("l1", "<get-TAG>(...)");
                    c3862n17.a("l1", "callback - onShowFailure");
                }
                C3862n9 c3862n18 = n12.f56874i;
                if (c3862n18 != null) {
                    kotlin.jvm.internal.m0.o("l1", "<get-TAG>(...)");
                    c3862n18.b("l1", "ad is unloaded");
                    return;
                }
                return;
            }
            if (b10 == 0) {
                Kb.a((byte) 1, wc.d.f142723h, "Ad Show has Failed. Please call load() before calling show().");
                n12.e((short) 0);
                C3862n9 c3862n19 = n12.f56874i;
                if (c3862n19 != null) {
                    kotlin.jvm.internal.m0.o("l1", "<get-TAG>(...)");
                    c3862n19.a("l1", "callback - onShowFailure");
                }
                C3862n9 c3862n20 = n12.f56874i;
                if (c3862n20 != null) {
                    kotlin.jvm.internal.m0.o("l1", "<get-TAG>(...)");
                    c3862n20.b("l1", "show called before load");
                    return;
                }
                return;
            }
            o();
            a(relativeLayout);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3680g1
    public final void a() {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "onAdDismissed " + this);
        }
        this.f54520a = (byte) 0;
        C3862n9 c3862n10 = this.f54525f;
        if (c3862n10 != null) {
            String str2 = X1.f55760a;
            kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
            c3862n10.d(str2, "AdManager state - CREATED");
        }
        C3862n9 c3862n11 = this.f54525f;
        if (c3862n11 != null) {
            c3862n11.a();
        }
        super.a();
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3680g1
    public final void a(AdMetaInfo info) {
        kotlin.jvm.internal.m0.p(info, "info");
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "onAdDisplayed");
        }
        super.a(info);
        AbstractC3804l1 abstractC3804l1F = f();
        if (abstractC3804l1F != null) {
            abstractC3804l1F.R();
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3680g1
    public final void a(AbstractC3804l1 abstractC3804l1, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.m0.p(status, "status");
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.b(str, com.ironsource.Mf.f59491b);
        }
        C3862n9 c3862n10 = this.f54525f;
        if (c3862n10 != null) {
            c3862n10.a();
        }
    }

    public static final void a(W1 w10) {
        C3862n9 c3862n9 = w10.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = w10.f54522c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3862n9 c3862n10 = w10.f54525f;
        if (c3862n10 != null) {
            c3862n10.a();
        }
    }

    public final void a(final InMobiAudio audio) {
        kotlin.jvm.internal.m0.p(audio, "audio");
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.a(str, "show called");
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                b(audio);
            } else {
                this.f54523d.post(new Runnable() { // from class: com.inmobi.media.iv
                    @Override // java.lang.Runnable
                    public final void run() {
                        W1.a(this.f56686b, audio);
                    }
                });
            }
        } catch (Exception e10) {
            N1 n10 = this.f55704k;
            if (n10 != null) {
                n10.e((short) 26);
            }
            String str2 = X1.f55760a;
            kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
            Kb.a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            C3862n9 c3862n10 = this.f54525f;
            if (c3862n10 != null) {
                kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
                c3862n10.b(str2, "Show failed with unexpected error: " + e10.getMessage());
            }
            dr.i0 i0Var = P9.f55304a;
            AbstractC3738i9.a(e10);
        }
    }

    public final void b(short s10) {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.b(str, "submitAdLoadFailed " + this);
        }
        N1 n10 = this.f55704k;
        if (n10 != null) {
            n10.c((short) 15);
        }
    }

    @Override // com.inmobi.media.Dk
    public final void a(short s10) {
        C3862n9 c3862n9 = this.f54525f;
        if (c3862n9 != null) {
            String str = X1.f55760a;
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            c3862n9.b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        N1 n10 = this.f55704k;
        if (n10 != null) {
            n10.b(s10);
        }
    }

    public final void a(Context context, Jg pubSettings, String adSize) {
        String m10Context;
        String str;
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(pubSettings, "pubSettings");
        kotlin.jvm.internal.m0.p(adSize, "adSize");
        String str2 = X1.f55760a;
        kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
        kotlin.jvm.internal.m0.p("audio", "mAdType");
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        kotlin.jvm.internal.m0.p(context, "context");
        if (context instanceof Activity) {
            m10Context = androidx.appcompat.widget.c.f6970r;
        } else {
            m10Context = "others";
        }
        kotlin.jvm.internal.m0.p(m10Context, "m10Context");
        long j10 = pubSettings.f54918a;
        String str3 = pubSettings.f54919b;
        Map map = pubSettings.f54920c;
        kotlin.jvm.internal.m0.p(adSize, "adSize");
        boolean z10 = pubSettings.f54921d;
        String str4 = pubSettings.f54924g;
        String str5 = pubSettings.f54922e;
        if (j10 != Long.MIN_VALUE) {
            if (map == null || (str = (String) map.get("tp")) == null) {
                str = "";
            }
            C4052v0 c4052v0 = new C4052v0(j10, str, "audio", str4);
            c4052v0.f57866d = str3;
            c4052v0.f57865c = map;
            kotlin.jvm.internal.m0.p(adSize, "<set-?>");
            c4052v0.f57870h = adSize;
            kotlin.jvm.internal.m0.p(m10Context, "<set-?>");
            c4052v0.f57871i = m10Context;
            c4052v0.f57869g = string;
            c4052v0.f57872j = z10;
            c4052v0.f57873k = str5;
            N1 n10 = this.f55701h;
            if (n10 != null && this.f55702i != null) {
                n10.a(context, c4052v0, this);
                N1 n11 = this.f55702i;
                if (n11 != null) {
                    n11.a(context, c4052v0, this);
                }
            } else {
                this.f55701h = new N1(context, c4052v0, this);
                this.f55702i = new N1(context, c4052v0, this);
                this.f55704k = this.f55701h;
            }
            String str6 = pubSettings.f54924g;
            if (str6 != null) {
                C3862n9 c3862n9 = this.f54525f;
                if (c3862n9 != null) {
                    c3862n9.a();
                }
                C3862n9 c3862n9A = Jh.a("audio", str6);
                this.f54525f = c3862n9A;
                if (c3862n9A != null) {
                    kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
                    c3862n9A.a(str2, "adding audioAdUnit1 to reference tracker");
                }
                N1 n12 = this.f55701h;
                kotlin.jvm.internal.m0.m(n12);
                Jh.a(n12, this.f54525f);
                C3862n9 c3862n10 = this.f54525f;
                if (c3862n10 != null) {
                    kotlin.jvm.internal.m0.o(str2, "access$getTAG$p(...)");
                    c3862n10.a(str2, "adding audioAdUnit2 to reference tracker");
                }
                N1 n13 = this.f55702i;
                kotlin.jvm.internal.m0.m(n13);
                Jh.a(n13, this.f54525f);
                return;
            }
            return;
        }
        throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
    }

    public static final void a(W1 w10, RelativeLayout relativeLayout) {
        w10.b(relativeLayout);
    }
}
