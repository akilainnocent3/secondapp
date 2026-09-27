package l8;

import android.os.Build;
import android.os.ext.SdkExtensions;
import k.t;
import k.t0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final a f103754a = new a();

    /* JADX INFO: renamed from: l8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(30)
    public static final class C0985a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public static final C0985a f103755a = new C0985a();

        @t
        public final int a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(30)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public static final b f103756a = new b();

        @t
        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f103756a.a();
        }
        return 0;
    }

    public final int b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return C0985a.f103755a.a();
        }
        return 0;
    }
}
