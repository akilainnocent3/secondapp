package com.google.ads.mediation.unity.eventadapters;

import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class zz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationInterstitialListener f48232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationInterstitialAdapter f48233b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48234a;

        static {
            int[] iArr = new int[com.google.ads.mediation.unity.zz.zr.values().length];
            f48234a = iArr;
            try {
                iArr[com.google.ads.mediation.unity.zz.zr.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48234a[com.google.ads.mediation.unity.zz.zr.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48234a[com.google.ads.mediation.unity.zz.zr.CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48234a[com.google.ads.mediation.unity.zz.zr.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48234a[com.google.ads.mediation.unity.zz.zr.LEFT_APPLICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public zz(MediationInterstitialListener mediationInterstitialListener, MediationInterstitialAdapter mediationInterstitialAdapter) {
        this.f48232a = mediationInterstitialListener;
        this.f48233b = mediationInterstitialAdapter;
    }

    public void zz(com.google.ads.mediation.unity.zz.zr zrVar) {
        if (this.f48232a == null) {
            return;
        }
        int i10 = a.f48234a[zrVar.ordinal()];
        if (i10 == 1) {
            this.f48232a.onAdLoaded(this.f48233b);
            return;
        }
        if (i10 == 2) {
            this.f48232a.onAdOpened(this.f48233b);
            return;
        }
        if (i10 == 3) {
            this.f48232a.onAdClicked(this.f48233b);
        } else if (i10 == 4) {
            this.f48232a.onAdClosed(this.f48233b);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f48232a.onAdLeftApplication(this.f48233b);
        }
    }
}
