package yads;

import android.content.Context;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg0 f151093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yg1 f151094b;

    public /* synthetic */ jg0() {
        this(new lg0(), new yg1());
    }

    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public final String a(Context context) {
        String lowerCase = this.f151093a.a(context).name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static String a() {
        return Build.MANUFACTURER;
    }

    public jg0(lg0 lg0Var, yg1 yg1Var) {
        this.f151093a = lg0Var;
        this.f151094b = yg1Var;
    }
}
