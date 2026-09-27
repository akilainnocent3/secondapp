package j0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<p> f99385a = new ArrayList<>();

    public void a(p pVar) {
        this.f99385a.add(pVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f99385a.isEmpty()) {
            sb2.append("keyFrames:{\n");
            Iterator<p> it = this.f99385a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
            sb2.append("},\n");
        }
        return sb2.toString();
    }
}
