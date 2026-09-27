package ff;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f83954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f83955b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f83958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f83959d;

        public a(String str, String str2, long j10, long j11) {
            this.f83956a = str;
            this.f83957b = str2;
            this.f83958c = j10;
            this.f83959d = j11;
        }
    }

    public b(long j10, List<a> list) {
        this.f83954a = j10;
        this.f83955b = list;
    }

    @Nullable
    public MotionPhotoMetadata a(long j10) {
        long j11;
        if (this.f83955b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f83955b.size() - 1; size >= 0; size--) {
            a aVar = this.f83955b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f83956a) | z10;
            if (size == 0) {
                j12 -= aVar.f83959d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f83958c;
            }
            long j17 = j11;
            long j18 = j12;
            j12 = j17;
            if (!zEquals || j12 == j18) {
                z10 = zEquals;
            } else {
                j16 = j18 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j18;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j13, j14, this.f83954a, j15, j16);
    }
}
