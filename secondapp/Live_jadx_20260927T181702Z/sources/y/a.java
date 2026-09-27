package y;

import android.app.PendingIntent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.u;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final PendingIntent f145636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @u
    public int f145637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Uri f145638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Runnable f145639e;

    public a(@NonNull String str, @NonNull PendingIntent pendingIntent, @u int i10) {
        this.f145635a = str;
        this.f145636b = pendingIntent;
        this.f145637c = i10;
    }

    @NonNull
    public PendingIntent a() {
        PendingIntent pendingIntent = this.f145636b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public int b() {
        return this.f145637c;
    }

    @Nullable
    @y0({y0.a.LIBRARY})
    public Uri c() {
        return this.f145638d;
    }

    @Nullable
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public Runnable d() {
        return this.f145639e;
    }

    @NonNull
    public String e() {
        return this.f145635a;
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public a(@NonNull String str, @NonNull PendingIntent pendingIntent, @NonNull Uri uri) {
        this.f145635a = str;
        this.f145636b = pendingIntent;
        this.f145638d = uri;
    }

    public a(@NonNull String str, @NonNull Runnable runnable) {
        this.f145635a = str;
        this.f145636b = null;
        this.f145639e = runnable;
    }

    public a(@NonNull String str, @NonNull PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }
}
