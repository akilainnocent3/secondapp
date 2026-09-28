package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface oyg extends pjg0 {

    public static final class a {
        public final jjg0 a;
        public final int[] b;

        public a(int i, jjg0 jjg0Var, int[] iArr) {
            if (iArr.length == 0) {
                cft.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.a = jjg0Var;
            this.b = iArr;
        }
    }

    void a();

    boolean b(int i, long j);

    int c();

    default boolean d(long j, mn7 mn7Var, List<? extends siv> list) {
        return false;
    }

    boolean g(int i, long j);

    void h(float f);

    Object i();

    void l(long j, long j2, long j3, List<? extends siv> list, tiv[] tivVarArr);

    void o();

    int p(long j, List<? extends siv> list);

    int q();

    androidx.media3.common.a r();

    int s();

    default void j() {
    }

    default void t() {
    }

    default void n(boolean z) {
    }
}
