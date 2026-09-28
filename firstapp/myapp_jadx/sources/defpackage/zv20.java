package defpackage;

import defpackage.b3;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zv20<KeyT extends b3, PrimitiveT> {
    public final Class<KeyT> a;

    public interface a<KeyT extends b3, PrimitiveT> {
        PrimitiveT a(KeyT keyt);
    }

    public zv20(Class cls) {
        this.a = cls;
    }

    public abstract PrimitiveT a(KeyT keyt);
}
