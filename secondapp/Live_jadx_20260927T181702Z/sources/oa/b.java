package oa;

import a9.a1;
import a9.l0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@a9.n
public interface b {
    @a1("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    List<String> a(String id2);

    @a1("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean b(String id2);

    @l0(onConflict = 5)
    void c(a dependency);

    @a1("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    List<String> d(String id2);

    @a1("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean e(String id2);
}
