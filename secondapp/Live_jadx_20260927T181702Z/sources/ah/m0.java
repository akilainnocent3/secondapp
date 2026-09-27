package ah;

import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class m0 implements u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f5269d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f5270e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f5271f = 60000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final long f5272g = 60000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f5273h = 300000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f5274i = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5275c;

    public m0() {
        this(-1);
    }

    @Override // ah.u0
    public /* synthetic */ void a(long j10) {
        t0.a(this, j10);
    }

    @Override // ah.u0
    public int b(int i10) {
        int i11 = this.f5275c;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }

    @Override // ah.u0
    @Nullable
    public u0.b c(u0.a aVar, u0.d dVar) {
        if (!e(dVar.f5378c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new u0.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new u0.b(2, 60000L);
        }
        return null;
    }

    @Override // ah.u0
    public long d(u0.d dVar) {
        IOException iOException = dVar.f5378c;
        if ((iOException instanceof d4) || (iOException instanceof FileNotFoundException) || (iOException instanceof q0.b) || (iOException instanceof v0.h) || a0.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((dVar.f5379d - 1) * 1000, 5000);
    }

    public boolean e(IOException iOException) {
        if (!(iOException instanceof q0.f)) {
            return false;
        }
        int i10 = ((q0.f) iOException).f5354i;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }

    public m0(int i10) {
        this.f5275c = i10;
    }
}
