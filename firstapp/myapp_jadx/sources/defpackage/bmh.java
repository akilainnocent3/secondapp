package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bmh {
    public final Function0<Unit> a;
    public final Function0<Unit> b;
    public final Function0<Unit> c;
    public final Function0<Unit> d;
    public final Function0<Unit> e;
    public final Function1<Float, Unit> f;

    /* JADX WARN: Multi-variable type inference failed */
    public bmh(Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, Function0<Unit> function3, Function0<Unit> function4, Function1<? super Float, Unit> function5) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = function3;
        this.e = function4;
        this.f = function5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmh)) {
            return false;
        }
        bmh bmhVar = (bmh) obj;
        return Intrinsics.g(this.a, bmhVar.a) && Intrinsics.g(this.b, bmhVar.b) && Intrinsics.g(this.c, bmhVar.c) && Intrinsics.g(this.d, bmhVar.d) && Intrinsics.g(this.e, bmhVar.e) && Intrinsics.g(this.f, bmhVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + x7g.a(x7g.a(x7g.a(x7g.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "FilterBarActions(onBetStatusClick=" + this.a + ", onBetResultClick=" + this.b + ", onDateClick=" + this.c + ", onDeleteClick=" + this.d + ", onResetClick=" + this.e + ", onBetResultFilterCenterXChanged=" + this.f + ")";
    }
}
