package ko;

import a9.a1;
import a9.l0;
import dr.w2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@a9.n
public interface a {
    @oy.l
    @a1("SELECT * FROM event_table")
    List<g> a();

    @a1("DELETE FROM event_table WHERE eventName = :name AND eventCode = :code")
    @oy.m
    Object b(@oy.l String str, int i10, @oy.l or.f<? super w2> fVar);

    @a1("DELETE FROM event_table")
    @oy.m
    Object c(@oy.l or.f<? super w2> fVar);

    @l0(onConflict = 1)
    @oy.m
    Object d(@oy.l g gVar, @oy.l or.f<? super w2> fVar);
}
