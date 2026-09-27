package com.bytedance.sdk.openadsdk.vy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    public static final String hww = com.bytedance.sdk.openadsdk.vy.sd.hww.InterfaceC0394hww.hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static final String f38048tq = com.bytedance.sdk.openadsdk.vy.sd.hww.InterfaceC0394hww.f38044tq;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public static final String f38047sd = com.bytedance.sdk.openadsdk.vy.sd.hww.InterfaceC0394hww.f38043sd;
    public static final String vy = com.bytedance.sdk.openadsdk.vy.sd.hww.InterfaceC0394hww.vy;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public static final String f38046hv = com.bytedance.sdk.openadsdk.vy.sd.hww.InterfaceC0394hww.f38042hv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public static final String f38045hu = com.bytedance.sdk.openadsdk.vy.sd.hww.InterfaceC0394hww.f38041hu;
    public static final Set<String> vgm = new HashSet(Arrays.asList("click", "show", "insight_log"));

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        public static String hww = "openDetailPage";

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        public static String f38049sd = "direct";

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public static String f38050tq = "openAdLandPageLinks";
        public static String vy = "saLandingPageLinks";
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.vy.tq$tq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0395tq {
        public static int hww = 1;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        public static int f38051sd = 100;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public static int f38052tq = 2;
    }

    public static boolean hww(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
