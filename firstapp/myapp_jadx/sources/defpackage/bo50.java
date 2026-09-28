package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class bo50 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder sb = new StringBuilder();
        sb.append((String) entry.getKey());
        sb.append("=");
        Iterable iterable = (Iterable) entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) ",");
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }
}
