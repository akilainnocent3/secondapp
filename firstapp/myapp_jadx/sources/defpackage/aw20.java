package defpackage;

import defpackage.wnv;

/* JADX INFO: loaded from: classes4.dex */
public abstract class aw20<PrimitiveT, KeyProtoT extends wnv> {
    public final Class<PrimitiveT> a;

    public aw20(Class<PrimitiveT> cls) {
        this.a = cls;
    }

    public abstract PrimitiveT a(KeyProtoT keyprotot);
}
