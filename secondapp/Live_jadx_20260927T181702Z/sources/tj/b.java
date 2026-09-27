package tj;

import android.os.Bundle;
import androidx.annotation.NonNull;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final Bundle f137025a = new Bundle();

    @l
    public final Bundle a() {
        return this.f137025a;
    }

    public final void b(@NonNull String key, double d10) {
        m0.p(key, "key");
        this.f137025a.putDouble(key, d10);
    }

    public final void c(@NonNull String key, long j10) {
        m0.p(key, "key");
        this.f137025a.putLong(key, j10);
    }

    public final void d(@NonNull String key, @NonNull Bundle value) {
        m0.p(key, "key");
        m0.p(value, "value");
        this.f137025a.putBundle(key, value);
    }

    public final void e(@NonNull String key, @NonNull String value) {
        m0.p(key, "key");
        m0.p(value, "value");
        this.f137025a.putString(key, value);
    }

    public final void f(@NonNull String key, @NonNull Bundle[] value) {
        m0.p(key, "key");
        m0.p(value, "value");
        this.f137025a.putParcelableArray(key, value);
    }
}
