package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public interface rft {
    int a();

    ui1 b();

    oso c();

    pg50 d();

    int e();

    default ruh0<?> f() {
        ih4 body = getBody();
        if (body.getType() == ih4.a.a) {
            return null;
        }
        String strA = body.a();
        Objects.requireNonNull(strA, "value must not be null");
        return new dvh0(strA);
    }

    long g();

    m21 getAttributes();

    @Deprecated
    ih4 getBody();

    default String getEventName() {
        return null;
    }

    long h();

    String i();
}
