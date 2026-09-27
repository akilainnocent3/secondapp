package qv;

import jv.j2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 {
    @j2
    public static final <T> T b(@oy.l Object obj, @oy.l ds.a<? extends T> aVar) {
        T tInvoke;
        synchronized (obj) {
            try {
                tInvoke = aVar.invoke();
                kotlin.jvm.internal.j0.d(1);
            } finally {
                kotlin.jvm.internal.j0.d(1);
                kotlin.jvm.internal.j0.c(1);
            }
        }
        return tInvoke;
    }

    @j2
    public static /* synthetic */ void a() {
    }
}
