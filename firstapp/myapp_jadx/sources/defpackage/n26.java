package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface n26 extends qz5, pnh0.b {

    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        public final boolean a;

        a(boolean z) {
            this.a = z;
        }
    }

    @Override // defpackage.qz5
    default l26 a() {
        return h();
    }

    tcy<a> b();

    m16 e();

    default h16 f() {
        return j16.a;
    }

    m26 h();

    default boolean i() {
        return a().f() == 0;
    }

    void l(ArrayList arrayList);

    void m(ArrayList arrayList);

    default boolean o() {
        return true;
    }

    qis<Void> release();

    default void n() {
    }

    default void c(h16 h16Var) {
    }

    default void g(boolean z) {
    }

    default void p(boolean z) {
    }
}
