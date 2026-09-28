package defpackage;

import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class knp implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        inp inpVar = (inp) obj;
        return inpVar.getKey() + "=" + inpVar.getValue().a();
    }
}
