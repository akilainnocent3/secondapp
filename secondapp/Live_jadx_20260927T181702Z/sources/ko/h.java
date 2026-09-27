package ko;

import a9.a1;
import a9.b3;
import a9.l0;
import a9.s;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@a9.n
public interface h {
    @l0(onConflict = 1)
    void a(@oy.l o oVar);

    @b3
    void b(@oy.l o oVar);

    @s
    void c(@oy.l o oVar);

    @a1("DELETE FROM RoomTable")
    void deleteAll();

    @oy.l
    @a1("SELECT * FROM RoomTable")
    List<o> getAll();
}
