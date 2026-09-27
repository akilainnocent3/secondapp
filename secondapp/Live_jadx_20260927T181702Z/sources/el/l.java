package el;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class l extends sj.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final a f81401b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public l(@NonNull a aVar) {
        this.f81401b = aVar;
    }

    @NonNull
    public a d() {
        return this.f81401b;
    }

    public l(@NonNull String str, @NonNull a aVar) {
        super(str);
        this.f81401b = aVar;
    }

    public l(@NonNull String str, @NonNull a aVar, @NonNull Throwable th2) {
        super(str, th2);
        this.f81401b = aVar;
    }
}
