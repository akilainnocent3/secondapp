package oa;

import a9.a1;
import a9.l0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@a9.n
public interface v {
    @a1("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> a(String id2);

    @a1("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    List<String> b(String tag);

    @l0(onConflict = 5)
    void c(u workTag);
}
