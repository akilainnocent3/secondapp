package defpackage;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface lef {

    public static class a extends IOException {
        public final int a;

        public a(int i, Throwable th) {
            super(th);
            this.a = i;
        }
    }

    a e();

    UUID f();

    default boolean g() {
        return false;
    }

    int getState();

    mzi h();

    void i(mef.a aVar);

    void j(mef.a aVar);

    boolean k(String str);
}
