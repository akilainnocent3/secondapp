package defpackage;

import java.util.function.Function;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class gmy implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(io50.b.contains(Integer.valueOf(((Response) obj).code())));
    }
}
