package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface mef {

    public static class a {
        public final int a;
        public final ekv.b b;
        public final CopyOnWriteArrayList<C0868a> c;

        /* JADX INFO: renamed from: mef$a$a, reason: collision with other inner class name */
        public static final class C0868a {
            public mef a;
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a(CopyOnWriteArrayList<C0868a> copyOnWriteArrayList, int i, ekv.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }
}
