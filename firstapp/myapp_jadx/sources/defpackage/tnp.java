package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tnp {
    public static final tnp d = new tnp(null, null, null, 63);
    public final Function1<snp, Unit> a;
    public final Function1<snp, Unit> b;
    public final Function1<snp, Unit> c;

    public tnp(Function1 function1, Function1 function2, Function1 function3, int i) {
        function1 = (i & 1) != 0 ? null : function1;
        function2 = (i & 4) != 0 ? null : function2;
        function3 = (i & 16) != 0 ? null : function3;
        this.a = function1;
        this.b = function2;
        this.c = function3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnp)) {
            return false;
        }
        tnp tnpVar = (tnp) obj;
        return this.a == tnpVar.a && this.b == tnpVar.b && this.c == tnpVar.c;
    }

    public final int hashCode() {
        Function1<snp, Unit> function1 = this.a;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 961;
        Function1<snp, Unit> function2 = this.b;
        int iHashCode2 = (iHashCode + (function2 != null ? function2.hashCode() : 0)) * 961;
        Function1<snp, Unit> function3 = this.c;
        return (iHashCode2 + (function3 != null ? function3.hashCode() : 0)) * 31;
    }
}
