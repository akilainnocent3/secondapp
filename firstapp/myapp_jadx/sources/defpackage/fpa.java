package defpackage;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class fpa implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Map.Entry) obj).getValue().toString();
    }
}
