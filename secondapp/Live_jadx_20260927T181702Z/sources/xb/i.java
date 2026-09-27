package xb;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import vb.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class i extends pc.j<tb.f, v<?>> implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j.a f144792e;

    public i(long j10) {
        super(j10);
    }

    @Override // xb.j
    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            p(getMaxSize() / 2);
        }
    }

    @Override // xb.j
    @Nullable
    public /* bridge */ /* synthetic */ v e(@NonNull tb.f fVar, @Nullable v vVar) {
        return (v) super.n(fVar, vVar);
    }

    @Override // xb.j
    @Nullable
    public /* bridge */ /* synthetic */ v f(@NonNull tb.f fVar) {
        return (v) super.o(fVar);
    }

    @Override // xb.j
    public void g(@NonNull j.a aVar) {
        this.f144792e = aVar;
    }

    @Override // pc.j
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int l(@Nullable v<?> vVar) {
        return vVar == null ? super.l(null) : vVar.getSize();
    }

    @Override // pc.j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void m(@NonNull tb.f fVar, @Nullable v<?> vVar) {
        j.a aVar = this.f144792e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.b(vVar);
    }
}
