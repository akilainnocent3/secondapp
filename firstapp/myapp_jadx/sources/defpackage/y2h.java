package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class y2h extends cs70 {

    public static final class a extends cs70.a implements m2h {
        @Override // cs70.a, defpackage.qze
        public final pze build() {
            return (y2h) this.a.b(new x2h());
        }

        @Override // cs70.a, defpackage.qze
        public final zjt c() {
            jso jsoVar = this.a;
            return new f3h.a(jsoVar.b, jsoVar.a, jsoVar.f, jsoVar.g, jsoVar.e);
        }

        @Override // defpackage.m2h
        public final void d(List list) {
            fg1.a aVar = this.a.e;
            if (list != null) {
                list = Collections.unmodifiableList(new ArrayList(list));
            }
            aVar.b = list;
        }

        @Override // cs70.a
        /* JADX INFO: renamed from: f */
        public final cs70 build() {
            return (y2h) this.a.b(new x2h());
        }
    }
}
