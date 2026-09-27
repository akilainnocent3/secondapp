package ag;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import k.h1;
import re.y7;
import zf.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@h1(otherwise = 3)
@Deprecated
public final class j extends x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AdPlaybackState f5031h;

    public j(y7 y7Var, AdPlaybackState adPlaybackState) {
        super(y7Var);
        eh.a.i(y7Var.m() == 1);
        eh.a.i(y7Var.v() == 1);
        this.f5031h = adPlaybackState;
    }

    @Override // zf.x, re.y7
    public y7.b k(int i10, y7.b bVar, boolean z10) {
        this.f161501g.k(i10, bVar, z10);
        long j10 = bVar.f127212e;
        if (j10 == -9223372036854775807L) {
            j10 = this.f5031h.f48682e;
        }
        bVar.y(bVar.f127209b, bVar.f127210c, bVar.f127211d, j10, bVar.s(), this.f5031h, bVar.f127214g);
        return bVar;
    }
}
