package defpackage;

import java.util.HashSet;
import java.util.function.Function;
import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes8.dex */
public final class aqm<REQUEST> implements era0<REQUEST> {
    public final HashSet a;
    public final Function<REQUEST, String> b;

    public aqm(HashSet hashSet, Function function) {
        this.a = hashSet;
        this.b = function;
    }

    @Override // defpackage.era0
    public final String a(Interceptor.Chain chain) {
        String strF = amy.a.f(chain);
        if (strF == null) {
            return "HTTP";
        }
        if (!this.a.contains(strF)) {
            strF = "HTTP";
        }
        String strApply = this.b.apply(chain);
        return strApply == null ? strF : tug.a(strF, " ", strApply);
    }
}
