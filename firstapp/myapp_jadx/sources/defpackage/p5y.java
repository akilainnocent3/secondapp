package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p5y<T> implements php<T> {
    public final php<T> a;
    public final qd80 b;

    public p5y(php<T> phpVar) {
        phpVar.getClass();
        this.a = phpVar;
        this.b = new qd80(phpVar.getDescriptor());
    }

    @Override // defpackage.tae
    public final T deserialize(b5d b5dVar) {
        if (b5dVar.D()) {
            return (T) b5dVar.z(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p5y.class == obj.getClass() && Intrinsics.g(this.a, ((p5y) obj).a);
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, T t) {
        if (t == null) {
            f4gVar.t();
        } else {
            f4gVar.z();
            f4gVar.x(this.a, t);
        }
    }
}
