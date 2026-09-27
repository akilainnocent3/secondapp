package j5;

import android.os.Looper;
import androidx.annotation.Nullable;
import e5.k4;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f99710a = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f99711a = new b() { // from class: j5.y
            @Override // j5.x.b
            public final void release() {
                z.a();
            }
        };

        void release();
    }

    void a(Looper looper, k4 k4Var);

    int b(androidx.media3.common.a aVar);

    b c(@Nullable v.a aVar, androidx.media3.common.a aVar2);

    @Nullable
    n d(@Nullable v.a aVar, androidx.media3.common.a aVar2);

    void prepare();

    void release();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements x {
        @Override // j5.x
        public int b(androidx.media3.common.a aVar) {
            return aVar.f13646t != null ? 1 : 0;
        }

        @Override // j5.x
        public /* synthetic */ b c(v.a aVar, androidx.media3.common.a aVar2) {
            return w.a(this, aVar, aVar2);
        }

        @Override // j5.x
        @Nullable
        public n d(@Nullable v.a aVar, androidx.media3.common.a aVar2) {
            if (aVar2.f13646t == null) {
                return null;
            }
            return new d0(new n.a(new g1(1), 6001));
        }

        @Override // j5.x
        public /* synthetic */ void prepare() {
            w.b(this);
        }

        @Override // j5.x
        public /* synthetic */ void release() {
            w.c(this);
        }

        @Override // j5.x
        public void a(Looper looper, k4 k4Var) {
        }
    }
}
