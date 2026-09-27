package oa;

import a9.f0;
import a9.x0;
import androidx.annotation.NonNull;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@a9.w(foreignKeys = {@f0(childColumns = {"work_spec_id"}, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@y0({y0.a.LIBRARY_GROUP})
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @a9.j(name = "work_spec_id")
    @x0
    public final String f118885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a9.j(name = "system_id")
    public final int f118886b;

    public i(@NonNull String workSpecId, int systemId) {
        this.f118885a = workSpecId;
        this.f118886b = systemId;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof i)) {
            return false;
        }
        i iVar = (i) o10;
        if (this.f118886b != iVar.f118886b) {
            return false;
        }
        return this.f118885a.equals(iVar.f118885a);
    }

    public int hashCode() {
        return (this.f118885a.hashCode() * 31) + this.f118886b;
    }
}
