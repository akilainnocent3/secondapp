package defpackage;

import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t870 extends pf implements gaj<List<? extends e970>, Long, v1b<? super Pair<? extends List<? extends e970>, ? extends Long>>, Object> {
    public static final t870 v = new t870(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // defpackage.gaj
    public final Object invoke(List<? extends e970> list, Long l, v1b<? super Pair<? extends List<? extends e970>, ? extends Long>> v1bVar) {
        return new Pair(list, new Long(l.longValue()));
    }
}
