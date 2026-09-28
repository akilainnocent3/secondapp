package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eqi {
    public final Function1<String, Unit> a;
    public final Function1<String, Unit> b;
    public final Function1<jl00, Unit> c;
    public final Function1<kl00, Unit> d;
    public final Function1<kl00, Unit> e;
    public final Function1<kl00, Unit> f;

    /* JADX WARN: Multi-variable type inference failed */
    public eqi(Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, Function1<? super jl00, Unit> function3, Function1<? super kl00, Unit> function4, Function1<? super kl00, Unit> function5, Function1<? super kl00, Unit> function6) {
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        this.a = function1;
        this.b = function2;
        this.c = function3;
        this.d = function4;
        this.e = function5;
        this.f = function6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqi)) {
            return false;
        }
        eqi eqiVar = (eqi) obj;
        return Intrinsics.g(this.a, eqiVar.a) && Intrinsics.g(this.b, eqiVar.b) && Intrinsics.g(this.c, eqiVar.c) && Intrinsics.g(this.d, eqiVar.d) && Intrinsics.g(this.e, eqiVar.e) && Intrinsics.g(this.f, eqiVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + w57.b(w57.b(w57.b(w57.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "ForYouAccountActions(onViewProfile=" + this.a + ", onFollow=" + this.b + ", onStatistic=" + this.c + ", onShare=" + this.d + ", onEdit=" + this.e + ", onAdd=" + this.f + ")";
    }
}
