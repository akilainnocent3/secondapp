package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public interface m16 {
    public static final a a = new a();

    public static final class b extends Exception {
    }

    void a(hoa hoaVar);

    void b(int i);

    hoa d();

    void e(wf80.b bVar);

    void f();

    qis g(ArrayList arrayList, int i, int i2);

    void h();

    default qis i(int i) {
        return obj.c(new l16());
    }

    public class a implements m16 {
        @Override // defpackage.m16
        public final hoa d() {
            return null;
        }

        @Override // defpackage.m16
        public final qis g(ArrayList arrayList, int i, int i2) {
            return obj.c(Collections.EMPTY_LIST);
        }

        @Override // defpackage.m16
        public final void f() {
        }

        @Override // defpackage.m16
        public final void h() {
        }

        @Override // defpackage.m16
        public final void a(hoa hoaVar) {
        }

        @Override // defpackage.m16
        public final void b(int i) {
        }

        @Override // defpackage.m16
        public final void e(wf80.b bVar) {
        }
    }

    default void c(h8n.i iVar) {
    }
}
