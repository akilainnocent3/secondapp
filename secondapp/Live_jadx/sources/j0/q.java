package j0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<t> f99410a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<d> f99411b = new ArrayList<>();

    public void a(d dVar) {
        this.f99411b.add(dVar);
    }

    public void b(t tVar) {
        this.f99410a.add(tVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n");
        if (!this.f99410a.isEmpty()) {
            sb2.append("Transitions:{\n");
            Iterator<t> it = this.f99410a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
            sb2.append("},\n");
        }
        if (!this.f99411b.isEmpty()) {
            sb2.append("ConstraintSets:{\n");
            Iterator<d> it2 = this.f99411b.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next().toString());
            }
            sb2.append("},\n");
        }
        sb2.append("}\n");
        return sb2.toString();
    }
}
