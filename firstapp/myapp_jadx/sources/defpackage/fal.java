package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes8.dex */
public final class fal extends y2b.a {
    public final eal a;

    public fal(eal ealVar) {
        this.a = ealVar;
    }

    public static fal c() {
        return new fal(new eal());
    }

    @Override // y2b.a
    public final y2b a(Type type, Annotation[] annotationArr) {
        TypeToken<?> typeToken = TypeToken.get(type);
        eal ealVar = this.a;
        return new gal(ealVar, ealVar.g(typeToken));
    }

    @Override // y2b.a
    public final y2b<ResponseBody, ?> b(Type type, Annotation[] annotationArr, on50 on50Var) {
        TypeToken<?> typeToken = TypeToken.get(type);
        eal ealVar = this.a;
        return new hal(ealVar, ealVar.g(typeToken));
    }
}
