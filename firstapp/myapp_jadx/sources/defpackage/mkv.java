package defpackage;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface mkv {

    public static class a {
        public final int a;
        public final ekv.b b;
        public final CopyOnWriteArrayList<C0872a> c;

        /* JADX INFO: renamed from: mkv$a$a, reason: collision with other inner class name */
        public static final class C0872a {
            public Handler a;
            public mkv b;
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a(final oya<mkv> oyaVar) {
            for (C0872a c0872a : this.c) {
                final mkv mkvVar = c0872a.b;
                jrh0.S(c0872a.a, new Runnable() { // from class: lkv
                    @Override // java.lang.Runnable
                    public final void run() {
                        oyaVar.accept(mkvVar);
                    }
                });
            }
        }

        public final void b(tws twsVar, int i, int i2, androidx.media3.common.a aVar, int i3, Object obj, long j, long j2) {
            a(new jkv(this, twsVar, new pjv(i, i2, aVar, i3, obj, jrh0.Z(j), jrh0.Z(j2))));
        }

        public final void c(tws twsVar, int i, int i2, androidx.media3.common.a aVar, int i3, Object obj, long j, long j2) {
            a(new hkv(this, twsVar, new pjv(i, i2, aVar, i3, obj, jrh0.Z(j), jrh0.Z(j2))));
        }

        public final void d(tws twsVar, int i, int i2, androidx.media3.common.a aVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            a(new ikv(this, twsVar, new pjv(i, i2, aVar, i3, obj, jrh0.Z(j), jrh0.Z(j2)), iOException, z));
        }

        public final void e(tws twsVar, int i, int i2, androidx.media3.common.a aVar, int i3, Object obj, long j, long j2, int i4) {
            a(new gkv(this, twsVar, new pjv(i, i2, aVar, i3, obj, jrh0.Z(j), jrh0.Z(j2)), i4));
        }

        public a(CopyOnWriteArrayList<C0872a> copyOnWriteArrayList, int i, ekv.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }

    default void M(int i, ekv.b bVar, pjv pjvVar) {
    }

    default void n(int i, ekv.b bVar, pjv pjvVar) {
    }

    default void S(int i, ekv.b bVar, tws twsVar, pjv pjvVar) {
    }

    default void U(int i, ekv.b bVar, tws twsVar, pjv pjvVar) {
    }

    default void L(int i, ekv.b bVar, tws twsVar, pjv pjvVar, int i2) {
    }

    default void v(int i, ekv.b bVar, tws twsVar, pjv pjvVar, IOException iOException, boolean z) {
    }
}
