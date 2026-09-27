package yads;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ho0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f150210a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f150211b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f150210a.add(str)) {
            f150211b += ", " + str;
        }
    }
}
