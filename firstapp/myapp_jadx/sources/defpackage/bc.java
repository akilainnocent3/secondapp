package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class bc implements ehx {
    public final int a;
    public final Bundle b;

    public bc(int i) {
        this.a = i;
        o2g.a.getClass();
        this.b = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
    }

    @Override // defpackage.ehx
    public final Bundle a() {
        return this.b;
    }

    @Override // defpackage.ehx
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bc.class.equals(obj.getClass()) && this.a == ((bc) obj).a;
    }

    public final int hashCode() {
        return 31 + this.a;
    }

    public final String toString() {
        return rr1.b(new StringBuilder("ActionOnlyNavDirections(actionId="), this.a, ')');
    }
}
