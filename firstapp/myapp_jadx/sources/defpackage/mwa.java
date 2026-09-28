package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mwa implements esr {
    public final cwa a;
    public final Function1<bwa, Unit> b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public mwa(cwa cwaVar, Function1<? super bwa, Unit> function1) {
        this.a = cwaVar;
        this.b = function1;
        this.c = cwaVar.c;
    }

    @Override // defpackage.esr
    public final Object Y0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mwa)) {
            return false;
        }
        mwa mwaVar = (mwa) obj;
        return Intrinsics.g(this.a.c, mwaVar.a.c) && this.b == mwaVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.c.hashCode() * 31);
    }
}
