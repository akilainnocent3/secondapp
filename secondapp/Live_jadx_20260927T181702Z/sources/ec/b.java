package ec;

import androidx.annotation.NonNull;
import pc.m;
import vb.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b implements v<byte[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f80722b;

    public b(byte[] bArr) {
        this.f80722b = (byte[]) m.e(bArr);
    }

    @Override // vb.v
    @NonNull
    public Class<byte[]> b() {
        return byte[].class;
    }

    @Override // vb.v
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f80722b;
    }

    @Override // vb.v
    public int getSize() {
        return this.f80722b.length;
    }

    @Override // vb.v
    public void a() {
    }
}
