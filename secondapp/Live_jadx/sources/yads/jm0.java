package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jm0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f151152h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f151153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f151154b = fr.h0.J();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f151155c = fr.n1.z();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f151156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f151157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f151158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f151159g;

    public final Map a() {
        return this.f151155c;
    }

    public final String b() {
        String str;
        synchronized (f151152h) {
            str = this.f151159g;
        }
        return str;
    }
}
