package n6;

import androidx.annotation.Nullable;
import java.util.List;
import u4.l1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f116307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f116308b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f116309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f116310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f116311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f116312d;

        public a(String str, String str2, long j10, long j11) {
            this.f116309a = str;
            this.f116310b = str2;
            this.f116311c = j10;
            this.f116312d = j11;
        }
    }

    public c(long j10, List<a> list) {
        this.f116307a = j10;
        this.f116308b = list;
    }

    @Nullable
    public o6.c a(long j10) {
        long j11;
        o6.c cVar = null;
        if (this.f116308b.size() < 2) {
            return null;
        }
        boolean z10 = true;
        int size = this.f116308b.size() - 1;
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        while (size >= 0) {
            a aVar = this.f116308b.get(size);
            boolean z11 = (aVar.f116309a.equals("video/mp4") || aVar.f116309a.equals(l1.f138660g)) ? z10 : false;
            if (size == 0) {
                j12 -= aVar.f116312d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f116311c;
            }
            long j17 = j12;
            j12 = j11;
            if (z11 && j12 != j17) {
                j16 = j17 - j12;
                j15 = j12;
            }
            if (size == 0) {
                j14 = j17;
                j13 = j12;
            }
            size--;
            cVar = cVar;
            z10 = true;
        }
        return (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) ? cVar : new o6.c(j13, j14, this.f116307a, j15, j16);
    }
}
