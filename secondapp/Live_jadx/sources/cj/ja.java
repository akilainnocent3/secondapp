package cj;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@j4
public interface ja<R, C, V> extends gb<R, C, V> {
    /* bridge */ /* synthetic */ Map l();

    @Override // cj.gb, cj.ja
    SortedMap<R, Map<C, V>> l();

    /* bridge */ /* synthetic */ Set n();

    @Override // cj.gb, cj.ja
    SortedSet<R> n();
}
