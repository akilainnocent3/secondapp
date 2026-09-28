package okhttp3.internal;

import defpackage.fd80;
import defpackage.ld80;
import defpackage.tgp;
import defpackage.ygp;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000b\u001a\u00020\u0003\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/LinkedTags;", "", "K", "Lokhttp3/internal/Tags;", "Lygp;", "key", "value", "next", "<init>", "(Lygp;Ljava/lang/Object;Lokhttp3/internal/Tags;)V", "T", "plus", "(Lygp;Ljava/lang/Object;)Lokhttp3/internal/Tags;", "get", "(Lygp;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class LinkedTags<K> extends Tags {
    public final ygp<K> a;
    public final K b;
    public final Tags c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedTags(ygp<K> ygpVar, K k, Tags tags) {
        super(null);
        ygpVar.getClass();
        k.getClass();
        tags.getClass();
        this.a = ygpVar;
        this.b = k;
        this.c = tags;
    }

    @Override // okhttp3.internal.Tags
    public <T> T get(ygp<T> key) {
        key.getClass();
        return Intrinsics.g(key, this.a) ? (T) tgp.b(key).cast(this.b) : (T) this.c.get(key);
    }

    @Override // okhttp3.internal.Tags
    public <T> Tags plus(ygp<T> key, T value) {
        key.getClass();
        ygp<K> ygpVar = this.a;
        boolean zG = Intrinsics.g(key, ygpVar);
        Tags tags = this.c;
        if (!zG) {
            Tags tagsPlus = tags.plus(key, null);
            if (tagsPlus != tags) {
                this = new LinkedTags<>(ygpVar, this.b, tagsPlus);
            }
            tags = this;
        }
        return value != null ? new LinkedTags(key, value, tags) : tags;
    }

    public String toString() {
        return CollectionsKt.a0(CollectionsKt.m0(ld80.k(fd80.c(this, new a()))), null, "{", "}", new b(), 25);
    }
}
