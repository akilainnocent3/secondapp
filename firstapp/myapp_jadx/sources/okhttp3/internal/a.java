package okhttp3.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinkedTags linkedTags = (LinkedTags) obj;
        linkedTags.getClass();
        Tags tags = linkedTags.c;
        if (tags instanceof LinkedTags) {
            return (LinkedTags) tags;
        }
        return null;
    }
}
