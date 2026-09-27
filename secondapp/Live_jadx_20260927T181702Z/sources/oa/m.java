package oa;

import a9.a1;
import a9.l0;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@a9.n
public interface m {
    @NonNull
    @a1("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    List<String> a(@NonNull String workSpecId);

    @l0(onConflict = 5)
    void b(l workName);

    @a1("SELECT work_spec_id FROM workname WHERE name=:name")
    List<String> c(String name);
}
