package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: yads.do, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class Cdo implements bl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zk f148281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zk f148282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zk f148283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zk f148284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f148285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f148286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f148287h;

    public Cdo() {
        ByteBuffer byteBuffer = bl.f147231a;
        this.f148285f = byteBuffer;
        this.f148286g = byteBuffer;
        zk zkVar = zk.f158884e;
        this.f148283d = zkVar;
        this.f148284e = zkVar;
        this.f148281b = zkVar;
        this.f148282c = zkVar;
    }

    @Override // yads.bl
    public final zk a(zk zkVar) {
        this.f148283d = zkVar;
        this.f148284e = b(zkVar);
        return isActive() ? this.f148284e : zk.f158884e;
    }

    public abstract zk b(zk zkVar);

    @Override // yads.bl
    public final void b() {
        this.f148287h = true;
        d();
    }

    @Override // yads.bl
    public final void flush() {
        this.f148286g = bl.f147231a;
        this.f148287h = false;
        this.f148281b = this.f148283d;
        this.f148282c = this.f148284e;
        c();
    }

    @Override // yads.bl
    public boolean isActive() {
        return this.f148284e != zk.f158884e;
    }

    @Override // yads.bl
    public boolean isEnded() {
        return this.f148287h && this.f148286g == bl.f147231a;
    }

    @Override // yads.bl
    public final void reset() {
        flush();
        this.f148285f = bl.f147231a;
        zk zkVar = zk.f158884e;
        this.f148283d = zkVar;
        this.f148284e = zkVar;
        this.f148281b = zkVar;
        this.f148282c = zkVar;
        e();
    }

    @Override // yads.bl
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f148286g;
        this.f148286g = bl.f147231a;
        return byteBuffer;
    }

    public final ByteBuffer a(int i10) {
        if (this.f148285f.capacity() < i10) {
            this.f148285f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f148285f.clear();
        }
        ByteBuffer byteBuffer = this.f148285f;
        this.f148286g = byteBuffer;
        return byteBuffer;
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
