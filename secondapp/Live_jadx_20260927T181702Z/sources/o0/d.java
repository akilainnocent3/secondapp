package o0;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ArrayList<String> f118583j;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f118583j = arrayList;
        arrayList.add("ConstraintSets");
        f118583j.add("Variables");
        f118583j.add("Generate");
        f118583j.add("Transitions");
        f118583j.add(w0.i.f141819f);
        f118583j.add("KeyAttributes");
        f118583j.add("KeyPositions");
        f118583j.add("KeyCycles");
    }

    public d(char[] cArr) {
        super(cArr);
    }

    public static c B(char[] cArr) {
        return new d(cArr);
    }

    public static c f0(String str, c cVar) {
        d dVar = new d(str.toCharArray());
        dVar.x(0L);
        dVar.v(str.length() - 1);
        dVar.j0(cVar);
        return dVar;
    }

    @Override // o0.b, o0.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d) || Objects.equals(h0(), ((d) obj).h0())) {
            return super.equals(obj);
        }
        return false;
    }

    public String h0() {
        return f();
    }

    @Override // o0.b, o0.c
    public int hashCode() {
        return super.hashCode();
    }

    public c i0() {
        if (this.f118575i.size() > 0) {
            return this.f118575i.get(0);
        }
        return null;
    }

    public void j0(c cVar) {
        if (this.f118575i.size() > 0) {
            this.f118575i.set(0, cVar);
        } else {
            this.f118575i.add(cVar);
        }
    }

    @Override // o0.c
    public String y(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(i());
        a(sb2, i10);
        String strF = f();
        if (this.f118575i.size() <= 0) {
            return strF + ": <> ";
        }
        sb2.append(strF);
        sb2.append(": ");
        if (f118583j.contains(strF)) {
            i11 = 3;
        }
        if (i11 > 0) {
            sb2.append(this.f118575i.get(0).y(i10, i11 - 1));
        } else {
            String strZ = this.f118575i.get(0).z();
            if (strZ.length() + i10 < c.f118576g) {
                sb2.append(strZ);
            } else {
                sb2.append(this.f118575i.get(0).y(i10, i11 - 1));
            }
        }
        return sb2.toString();
    }

    @Override // o0.c
    public String z() {
        if (this.f118575i.size() <= 0) {
            return i() + f() + ": <> ";
        }
        return i() + f() + ": " + this.f118575i.get(0).z();
    }
}
