package cj;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@qj.f("Use ImmutableClassToInstanceMap or MutableClassToInstanceMap")
@j4
public interface b0<B> extends Map<Class<? extends B>, B> {
    @qj.a
    @zq.a
    <T extends B> T i(Class<T> type, @n9 T value);

    @zq.a
    <T extends B> T q(Class<T> type);
}
