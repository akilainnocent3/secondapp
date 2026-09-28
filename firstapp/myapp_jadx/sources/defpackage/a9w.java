package defpackage;

import androidx.compose.ui.layout.t;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a9w implements aiv {
    public final z8w a;

    public a9w(z8w z8wVar) {
        this.a = z8wVar;
    }

    @Override // defpackage.aiv
    public final int a(nzo nzoVar, List<? extends mzo> list, int i) {
        return this.a.a(nzoVar, div.a(nzoVar), i);
    }

    @Override // defpackage.aiv
    public final biv c(t tVar, List<? extends vhv> list, long j) {
        return this.a.c(tVar, div.a(tVar), j);
    }

    @Override // defpackage.aiv
    public final int e(nzo nzoVar, List<? extends mzo> list, int i) {
        return this.a.e(nzoVar, div.a(nzoVar), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9w) && Intrinsics.g(this.a, ((a9w) obj).a);
    }

    @Override // defpackage.aiv
    public final int g(nzo nzoVar, List<? extends mzo> list, int i) {
        return this.a.g(nzoVar, div.a(nzoVar), i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.aiv
    public final int i(nzo nzoVar, List<? extends mzo> list, int i) {
        return this.a.i(nzoVar, div.a(nzoVar), i);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
