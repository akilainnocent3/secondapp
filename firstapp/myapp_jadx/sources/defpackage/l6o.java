package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l6o implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = ((w8z) obj).c;
        return i >= 10 ? String.valueOf(i) : hce0.a(i, "0");
    }
}
