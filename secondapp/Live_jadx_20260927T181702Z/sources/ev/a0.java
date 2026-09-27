package ev;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@o
public final class a0 implements Externalizable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final a f81637d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f81638e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f81639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81640c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public a() {
        }
    }

    public a0(long j10, int i10) {
        this.f81639b = j10;
        this.f81640c = i10;
    }

    public final long d() {
        return this.f81639b;
    }

    public final int g() {
        return this.f81640c;
    }

    public final Object h() {
        return p.f81694d.b(this.f81639b, this.f81640c);
    }

    public final void i(long j10) {
        this.f81639b = j10;
    }

    public final void j(int i10) {
        this.f81640c = i10;
    }

    @Override // java.io.Externalizable
    public void readExternal(@oy.l ObjectInput input) {
        m0.p(input, "input");
        this.f81639b = input.readLong();
        this.f81640c = input.readInt();
    }

    @Override // java.io.Externalizable
    public void writeExternal(@oy.l ObjectOutput output) throws IOException {
        m0.p(output, "output");
        output.writeLong(this.f81639b);
        output.writeInt(this.f81640c);
    }

    public a0() {
        this(0L, 0);
    }
}
