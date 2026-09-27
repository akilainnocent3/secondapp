package c7;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public abstract class i extends c5.m<o, p, l> implements k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f22514o;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends p {
        public a() {
        }

        @Override // c5.k
        public void l() {
            i.this.p(this);
        }
    }

    public i(String str) {
        super(new o[2], new p[2]);
        this.f22514o = str;
        s(1024);
    }

    @Override // c5.h
    public final String getName() {
        return this.f22514o;
    }

    @Override // c5.m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final o e() {
        return new o();
    }

    @Override // c5.m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final p f() {
        return new a();
    }

    @Override // c5.m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final l g(Throwable th2) {
        return new l("Unexpected decode error", th2);
    }

    public abstract j x(byte[] bArr, int i10, boolean z10) throws l;

    @Override // c5.m
    @Nullable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final l h(o oVar, p pVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) l0.E(oVar.f22412e);
            pVar.m(oVar.f22414g, x(byteBuffer.array(), byteBuffer.limit(), z10), oVar.f22538n);
            pVar.f22422e = false;
            return null;
        } catch (l e10) {
            return e10;
        }
    }

    @Override // c7.k
    public void setPositionUs(long j10) {
    }
}
