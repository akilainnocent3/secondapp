package androidx.compose.ui;

import defpackage.j26;
import defpackage.qlr;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {
    public final d b;
    public final d c;

    /* JADX INFO: renamed from: androidx.compose.ui.a$a, reason: collision with other inner class name */
    public static final class C0044a extends qlr implements Function2<String, d.b, String> {
        public static final C0044a a = new C0044a(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, d.b bVar) {
            String str2 = str;
            d.b bVar2 = bVar;
            if (str2.length() == 0) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    public a(d dVar, d dVar2) {
        this.b = dVar;
        this.c = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.d
    public final <R> R b(R r, Function2<? super R, ? super d.b, ? extends R> function2) {
        return (R) this.c.b(this.b.b(r, function2), function2);
    }

    @Override // androidx.compose.ui.d
    public final boolean c(Function1<? super d.b, Boolean> function1) {
        return this.b.c(function1) && this.c.c(function1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b.equals(aVar.b) && Intrinsics.g(this.c, aVar.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return j26.a(new StringBuilder("["), (String) b("", C0044a.a), ']');
    }
}
