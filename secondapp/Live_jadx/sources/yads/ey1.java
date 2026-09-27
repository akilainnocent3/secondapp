package yads;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ey1 implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f148878b = "YandexAds.UrlTracker";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f148879c = "YandexAds.BaseController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148880a;

    public ey1(String str) {
        this.f148880a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f148880a);
    }
}
