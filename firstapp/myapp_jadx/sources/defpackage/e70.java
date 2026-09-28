package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e70 implements tfz {
    public final Context a;
    public final mmd b;
    public final long c;
    public final umz d;

    public e70(Context context, mmd mmdVar, long j, umz umzVar) {
        this.a = context;
        this.b = mmdVar;
        this.c = j;
        this.d = umzVar;
    }

    @Override // defpackage.tfz
    public final d70 a() {
        return new d70(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e70.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        e70 e70Var = (e70) obj;
        if (!Intrinsics.g(this.a, e70Var.a) || !Intrinsics.g(this.b, e70Var.b)) {
            return false;
        }
        long j = e70Var.c;
        int i = j58.n;
        return nbh0.a(this.c, j) && this.d.equals(e70Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return this.d.hashCode() + f87.a(iHashCode, this.c, 31);
    }
}
