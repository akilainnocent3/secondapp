package oa;

import a9.a1;
import a9.l0;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@a9.n
public interface j {
    @Nullable
    @a1("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId")
    i a(@NonNull String workSpecId);

    @NonNull
    @a1("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> b();

    @a1("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void c(@NonNull String workSpecId);

    @l0(onConflict = 1)
    void d(@NonNull i systemIdInfo);
}
