package tvo.webrtc;

import defpackage.b9p;

/* JADX INFO: loaded from: classes8.dex */
class WebRtcClassLoader {
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        b9p.a("Failed to get WebRTC class loader.");
        return null;
    }
}
