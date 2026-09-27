package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public interface bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f147231a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    zk a(zk zkVar);

    void a(ByteBuffer byteBuffer);

    void b();

    void flush();

    boolean isActive();

    boolean isEnded();

    void reset();
}
