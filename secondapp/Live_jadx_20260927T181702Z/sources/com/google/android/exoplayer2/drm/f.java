package com.google.android.exoplayer2.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import re.n2;
import se.b2;
import ze.j0;
import ze.r;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f48377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final f f48378b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f48379a = new b() { // from class: ze.s
            @Override // com.google.android.exoplayer2.drm.f.b
            public final void release() {
                t.a();
            }
        };

        void release();
    }

    static {
        a aVar = new a();
        f48377a = aVar;
        f48378b = aVar;
    }

    b a(@Nullable e.a aVar, n2 n2Var);

    @Nullable
    d b(@Nullable e.a aVar, n2 n2Var);

    int c(n2 n2Var);

    void d(Looper looper, b2 b2Var);

    void prepare();

    void release();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements f {
        @Override // com.google.android.exoplayer2.drm.f
        public /* synthetic */ b a(e.a aVar, n2 n2Var) {
            return r.a(this, aVar, n2Var);
        }

        @Override // com.google.android.exoplayer2.drm.f
        @Nullable
        public d b(@Nullable e.a aVar, n2 n2Var) {
            if (n2Var.f126252p == null) {
                return null;
            }
            return new i(new d.a(new j0(1), 6001));
        }

        @Override // com.google.android.exoplayer2.drm.f
        public int c(n2 n2Var) {
            return n2Var.f126252p != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.f
        public /* synthetic */ void prepare() {
            r.b(this);
        }

        @Override // com.google.android.exoplayer2.drm.f
        public /* synthetic */ void release() {
            r.c(this);
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void d(Looper looper, b2 b2Var) {
        }
    }
}
