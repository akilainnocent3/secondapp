package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class f6y extends f08 {
    public final boolean b = true;
    public final yx30<Integer> c;

    public f6y(int i, int i2) {
        this.c = new yx30<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // defpackage.f08
    public final boolean b(int i, StringWriter stringWriter) throws IOException {
        Integer numValueOf = Integer.valueOf(i);
        yx30<Integer> yx30Var = this.c;
        Comparator<Integer> comparator = yx30Var.a;
        if (this.b != (comparator.compare(numValueOf, yx30Var.d) > -1 && comparator.compare(numValueOf, yx30Var.c) < 1)) {
            return false;
        }
        stringWriter.write("&#");
        stringWriter.write(Integer.toString(i, 10));
        stringWriter.write(59);
        return true;
    }
}
