package oa;

import a9.f0;
import a9.k0;
import androidx.annotation.NonNull;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@a9.w(foreignKeys = {@f0(childColumns = {"work_spec_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @f0(childColumns = {"prerequisite_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@k0({"work_spec_id"}), @k0({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
@y0({y0.a.LIBRARY_GROUP})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @a9.j(name = "work_spec_id")
    public final String f118870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @a9.j(name = "prerequisite_id")
    public final String f118871b;

    public a(@NonNull String workSpecId, @NonNull String prerequisiteId) {
        this.f118870a = workSpecId;
        this.f118871b = prerequisiteId;
    }
}
