package qy;

import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @zq.h
    public static final Executor f123106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f123107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f123108c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f123106a = null;
            f123107b = new c0();
            f123108c = new c();
        } else {
            if (!property.equals("Dalvik")) {
                f123106a = null;
                f123107b = new c0.b();
                f123108c = new c.a();
                return;
            }
            f123106a = new a();
            if (Build.VERSION.SDK_INT >= 24) {
                f123107b = new c0.a();
                f123108c = new c.a();
            } else {
                f123107b = new c0();
                f123108c = new c();
            }
        }
    }
}
