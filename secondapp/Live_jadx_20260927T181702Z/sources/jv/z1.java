package jv;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z1 extends n0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final a f100970d = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @dr.v
    public static final class a extends or.b<n0, z1> {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public static final z1 d(or.j.b bVar) {
            if (bVar instanceof z1) {
                return (z1) bVar;
            }
            return null;
        }

        public a() {
            super(n0.f100842c, new ds.l() { // from class: jv.y1
                @Override // ds.l
                public final Object invoke(Object obj) {
                    return z1.a.d((or.j.b) obj);
                }
            });
        }
    }

    public abstract void close();

    @oy.l
    public abstract Executor z0();
}
