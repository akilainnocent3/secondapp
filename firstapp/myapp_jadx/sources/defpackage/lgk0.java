package defpackage;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class lgk0 {
    public final qn0 a;
    public final Feature b;

    public /* synthetic */ lgk0(qn0 qn0Var, Feature feature) {
        this.a = qn0Var;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof lgk0)) {
            return false;
        }
        lgk0 lgk0Var = (lgk0) obj;
        return scy.a(this.a, lgk0Var.a) && scy.a(this.b, lgk0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        scy.a aVar = new scy.a(this);
        aVar.a(this.a, "key");
        aVar.a(this.b, "feature");
        return aVar.toString();
    }
}
