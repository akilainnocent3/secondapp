package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ubh {
    public final List<e4c> a;

    public static final class a extends ubh {
        public final long b;
        public final long c;
        public final boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, long j, long j2, List list) {
            super(list);
            list.getClass();
            this.b = j;
            this.c = j2;
            this.d = z;
        }

        @Override // defpackage.ubh
        public final ubh a(yy80.a aVar) {
            ngs ngsVarB = kotlin.collections.a.b();
            List<e4c> list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ngsVarB.add(list.get(i).e(aVar));
            }
            ngs ngsVarA = kotlin.collections.a.a(ngsVarB);
            return new a(this.d, a020.j(this.b, aVar), a020.j(this.c, aVar), ngsVarA);
        }

        public final String toString() {
            return "Corner: vertex=" + ((Object) ywh.b(this.b)) + ", center=" + ((Object) ywh.b(this.c)) + ", convex=" + this.d;
        }
    }

    public static final class b extends ubh {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<? extends e4c> list) {
            super(list);
            list.getClass();
        }

        @Override // defpackage.ubh
        public final ubh a(yy80.a aVar) {
            ngs ngsVarB = kotlin.collections.a.b();
            List<e4c> list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ngsVarB.add(list.get(i).e(aVar));
            }
            return new b(kotlin.collections.a.a(ngsVarB));
        }

        public final String toString() {
            return "Edge";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ubh(List<? extends e4c> list) {
        list.getClass();
        this.a = list;
    }

    public abstract ubh a(yy80.a aVar);
}
