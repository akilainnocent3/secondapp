package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class f3h extends ns70 {

    public static final class a extends ns70.a implements t2h {
        @Override // ns70.a
        /* JADX INFO: renamed from: a */
        public final ns70 build() {
            return (f3h) this.a.b(new e3h());
        }

        @Override // ns70.a, defpackage.zjt
        public final yjt build() {
            return (f3h) this.a.b(new e3h());
        }

        @Override // defpackage.t2h
        public final void d(List list) {
            fg1.a aVar = this.a.e;
            if (list != null) {
                list = Collections.unmodifiableList(new ArrayList(list));
            }
            aVar.b = list;
        }
    }
}
