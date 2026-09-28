package defpackage;

import java.io.IOException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class iqa0 implements AutoCloseable {
    public final cc5 a;

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final Unit d(lb5 lb5Var) {
        this.a.V0(lb5Var);
        return Unit.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iqa0) {
            return this.a.equals(((iqa0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.a + ')';
    }
}
