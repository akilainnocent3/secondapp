package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u2z {
    public final Context a;
    public final ww90 b;
    public final vy60 c;
    public final dm20 d;
    public final String e;
    public final blh f;
    public final wr5 g;
    public final wr5 h;
    public final wr5 i;
    public final p4h j;

    public u2z(Context context, ww90 ww90Var, vy60 vy60Var, dm20 dm20Var, String str, blh blhVar, wr5 wr5Var, wr5 wr5Var2, wr5 wr5Var3, p4h p4hVar) {
        this.a = context;
        this.b = ww90Var;
        this.c = vy60Var;
        this.d = dm20Var;
        this.e = str;
        this.f = blhVar;
        this.g = wr5Var;
        this.h = wr5Var2;
        this.i = wr5Var3;
        this.j = p4hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2z)) {
            return false;
        }
        u2z u2zVar = (u2z) obj;
        return Intrinsics.g(this.a, u2zVar.a) && Intrinsics.g(this.b, u2zVar.b) && this.c == u2zVar.c && this.d == u2zVar.d && Intrinsics.g(this.e, u2zVar.e) && Intrinsics.g(this.f, u2zVar.f) && this.g == u2zVar.g && this.h == u2zVar.h && this.i == u2zVar.i && Intrinsics.g(this.j, u2zVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ')';
    }
}
