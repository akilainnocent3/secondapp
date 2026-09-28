package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k2w {
    public final wjw a;
    public final a b;

    public static class a {
        public final HashMap a = new HashMap();

        /* JADX INFO: renamed from: k2w$a$a, reason: collision with other inner class name */
        public static class C0749a<Model> {
            public final List<i2w<Model, ?>> a;

            public C0749a(List<i2w<Model, ?>> list) {
                this.a = list;
            }
        }
    }

    public k2w(v7h.c cVar) {
        wjw wjwVar = new wjw(cVar);
        this.b = new a();
        this.a = wjwVar;
    }
}
