package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class vdp implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        String str = (String) entry.getKey();
        scp scpVar = (scp) entry.getValue();
        StringBuilder sb = new StringBuilder();
        dae0.a(sb, str);
        sb.append(':');
        sb.append(scpVar);
        return sb.toString();
    }
}
