package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vue {
    public final String a;
    public final String b;
    public final String c;
    public final List<Integer> d;

    public vue(String str, String str2, String str3, List<Integer> list) {
        bt6.a(str, str3, list);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vue)) {
            return false;
        }
        vue vueVar = (vue) obj;
        return Intrinsics.g(this.a, vueVar.a) && this.b.equals(vueVar.b) && Intrinsics.g(this.c, vueVar.c) && Intrinsics.g(this.d, vueVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nve.a(this.c, ", bizTypeScope=", ")", ux5.a("DobGiftDisplayModel(imageUrl=", this.a, ", formattedAmount=", this.b, ", currencyCode="), this.d);
    }
}
