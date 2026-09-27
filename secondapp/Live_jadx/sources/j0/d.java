package j0;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<c> f99289b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<h> f99290c = new ArrayList<>();

    public d(String str) {
        this.f99288a = str;
    }

    public void a(c cVar) {
        this.f99289b.add(cVar);
    }

    public void b(h hVar) {
        this.f99290c.add(hVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f99288a + ":{\n");
        if (!this.f99289b.isEmpty()) {
            Iterator<c> it = this.f99289b.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
            }
        }
        if (!this.f99290c.isEmpty()) {
            Iterator<h> it2 = this.f99290c.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next().toString());
            }
        }
        sb2.append("},\n");
        return sb2.toString();
    }
}
