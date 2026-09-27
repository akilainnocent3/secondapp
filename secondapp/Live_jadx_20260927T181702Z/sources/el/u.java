package el;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f81413c = ":";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static u f81415e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kl.a f81416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f81412b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f81414d = Pattern.compile("\\AA[\\w-]{38}\\z");

    public u(kl.a aVar) {
        this.f81416a = aVar;
    }

    public static u c() {
        return d(kl.b.a());
    }

    public static u d(kl.a aVar) {
        if (f81415e == null) {
            f81415e = new u(aVar);
        }
        return f81415e;
    }

    public static boolean g(@Nullable String str) {
        return f81414d.matcher(str).matches();
    }

    public static boolean h(@Nullable String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f81416a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@NonNull il.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f81412b;
    }
}
