package defpackage;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v9g implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return (CharSequence) ((Map.Entry) obj).getKey();
    }
}
