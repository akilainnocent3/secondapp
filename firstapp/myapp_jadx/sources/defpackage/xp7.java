package defpackage;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes8.dex */
public final class xp7 extends b3 {
    public final /* synthetic */ Constructor c;
    public final /* synthetic */ Class d;

    public xp7(Constructor constructor, Class cls) {
        super(3);
        this.c = constructor;
        this.d = cls;
    }

    @Override // defpackage.b3
    public final Object W() {
        return this.c.newInstance(null);
    }

    @Override // defpackage.b3
    public final String toString() {
        return this.d.getName();
    }
}
