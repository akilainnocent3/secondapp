package c7;

import cj.v6;
import java.util.List;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v6<w4.a> f22506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22509d;

    public d(List<w4.a> list, long j10, long j11) {
        this.f22506a = v6.u(list);
        this.f22507b = j10;
        this.f22508c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f22509d = j12;
    }
}
