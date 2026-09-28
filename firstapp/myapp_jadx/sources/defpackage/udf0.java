package defpackage;

import android.view.textclassifier.TextClassification;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class udf0 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public udf0(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udf0)) {
            return false;
        }
        udf0 udf0Var = (udf0) obj;
        return Intrinsics.g(this.a, udf0Var.a) && ulf0.b(this.b, udf0Var.b) && Intrinsics.g(this.c, udf0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = ulf0.c;
        return this.c.hashCode() + f87.a(iHashCode, this.b, 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) ulf0.h(this.b)) + ", textClassification=" + this.c + ')';
    }
}
