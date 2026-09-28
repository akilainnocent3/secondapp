package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dkw implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jrz jrzVar = (jrz) obj;
        StringBuilder sb = new StringBuilder("[");
        sb.append(jrzVar.b);
        sb.append(", ");
        return rr1.b(sb, jrzVar.c, ')');
    }
}
