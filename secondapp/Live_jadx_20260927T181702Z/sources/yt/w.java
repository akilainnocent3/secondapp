package yt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class w extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f159973b;

    public w(q qVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f159973b = null;
    }

    public k d() {
        return new k(getMessage());
    }
}
