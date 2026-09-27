package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f10195a = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends r {
        @Override // androidx.datastore.preferences.protobuf.r
        public d a(int capacity) {
            return d.j(ByteBuffer.allocateDirect(capacity));
        }

        @Override // androidx.datastore.preferences.protobuf.r
        public d b(int capacity) {
            return d.k(new byte[capacity]);
        }
    }

    public static r c() {
        return f10195a;
    }

    public abstract d a(int capacity);

    public abstract d b(int capacity);
}
