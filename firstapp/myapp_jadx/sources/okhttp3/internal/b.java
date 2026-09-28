package okhttp3.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinkedTags linkedTags = (LinkedTags) obj;
        linkedTags.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(linkedTags.a);
        sb.append('=');
        sb.append(linkedTags.b);
        return sb.toString();
    }
}
