package o0;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<c> f118575i;

    public b(char[] cArr) {
        super(cArr);
        this.f118575i = new ArrayList<>();
    }

    public static c B(char[] cArr) {
        return new b(cArr);
    }

    public void A(c cVar) {
        this.f118575i.add(cVar);
        if (g.f118587d) {
            System.out.println("added element " + cVar + " to " + this);
        }
    }

    @Override // o0.c
    @NonNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b e() {
        b bVar = (b) super.e();
        ArrayList<c> arrayList = new ArrayList<>(this.f118575i.size());
        Iterator<c> it = this.f118575i.iterator();
        while (it.hasNext()) {
            c cVarE = it.next().e();
            cVarE.u(bVar);
            arrayList.add(cVarE);
        }
        bVar.f118575i = arrayList;
        return bVar;
    }

    public c D(int i10) throws h {
        if (i10 >= 0 && i10 < this.f118575i.size()) {
            return this.f118575i.get(i10);
        }
        throw new h("no element at index " + i10, this);
    }

    public c E(String str) throws h {
        Iterator<c> it = this.f118575i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f().equals(str)) {
                return dVar.i0();
            }
        }
        throw new h("no element for key <" + str + ">", this);
    }

    public a F(int i10) throws h {
        c cVarD = D(i10);
        if (cVarD instanceof a) {
            return (a) cVarD;
        }
        throw new h("no array at index " + i10, this);
    }

    public a G(String str) throws h {
        c cVarE = E(str);
        if (cVarE instanceof a) {
            return (a) cVarE;
        }
        throw new h("no array found for key <" + str + ">, found [" + cVarE.p() + "] : " + cVarE, this);
    }

    public a H(String str) {
        a aVarJ = J(str);
        if (aVarJ != null) {
            return aVarJ;
        }
        a aVar = new a(new char[0]);
        a0(str, aVar);
        return aVar;
    }

    public a J(String str) {
        c cVarT = T(str);
        if (cVarT instanceof a) {
            return (a) cVarT;
        }
        return null;
    }

    public boolean K(String str) throws h {
        c cVarE = E(str);
        if (cVarE instanceof j) {
            return ((j) cVarE).B();
        }
        throw new h("no boolean found for key <" + str + ">, found [" + cVarE.p() + "] : " + cVarE, this);
    }

    public float L(String str) throws h {
        c cVarE = E(str);
        if (cVarE != null) {
            return cVarE.l();
        }
        throw new h("no float found for key <" + str + ">, found [" + cVarE.p() + "] : " + cVarE, this);
    }

    public float M(String str) {
        c cVarT = T(str);
        if (cVarT instanceof e) {
            return cVarT.l();
        }
        return Float.NaN;
    }

    public int N(String str) throws h {
        c cVarE = E(str);
        if (cVarE != null) {
            return cVarE.m();
        }
        throw new h("no int found for key <" + str + ">, found [" + cVarE.p() + "] : " + cVarE, this);
    }

    public f P(int i10) throws h {
        c cVarD = D(i10);
        if (cVarD instanceof f) {
            return (f) cVarD;
        }
        throw new h("no object at index " + i10, this);
    }

    public f Q(String str) throws h {
        c cVarE = E(str);
        if (cVarE instanceof f) {
            return (f) cVarE;
        }
        throw new h("no object found for key <" + str + ">, found [" + cVarE.p() + "] : " + cVarE, this);
    }

    public f R(String str) {
        c cVarT = T(str);
        if (cVarT instanceof f) {
            return (f) cVarT;
        }
        return null;
    }

    public c S(int i10) {
        if (i10 < 0 || i10 >= this.f118575i.size()) {
            return null;
        }
        return this.f118575i.get(i10);
    }

    public c T(String str) {
        Iterator<c> it = this.f118575i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f().equals(str)) {
                return dVar.i0();
            }
        }
        return null;
    }

    public String U(int i10) throws h {
        c cVarD = D(i10);
        if (cVarD instanceof i) {
            return cVarD.f();
        }
        throw new h("no string at index " + i10, this);
    }

    public String V(String str) throws h {
        c cVarE = E(str);
        if (cVarE instanceof i) {
            return cVarE.f();
        }
        throw new h("no string found for key <" + str + ">, found [" + (cVarE != null ? cVarE.p() : null) + "] : " + cVarE, this);
    }

    public String W(int i10) {
        c cVarS = S(i10);
        if (cVarS instanceof i) {
            return cVarS.f();
        }
        return null;
    }

    public String X(String str) {
        c cVarT = T(str);
        if (cVarT instanceof i) {
            return cVarT.f();
        }
        return null;
    }

    public boolean Y(String str) {
        for (c cVar : this.f118575i) {
            if ((cVar instanceof d) && ((d) cVar).f().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> Z() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (c cVar : this.f118575i) {
            if (cVar instanceof d) {
                arrayList.add(((d) cVar).f());
            }
        }
        return arrayList;
    }

    public void a0(String str, c cVar) {
        Iterator<c> it = this.f118575i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f().equals(str)) {
                dVar.j0(cVar);
                return;
            }
        }
        this.f118575i.add((d) d.f0(str, cVar));
    }

    public void b0(String str, float f10) {
        a0(str, new e(f10));
    }

    public void c0(String str, String str2) {
        i iVar = new i(str2.toCharArray());
        iVar.x(0L);
        iVar.v(str2.length() - 1);
        a0(str, iVar);
    }

    public void clear() {
        this.f118575i.clear();
    }

    public void e0(String str) {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f118575i) {
            if (((d) cVar).f().equals(str)) {
                arrayList.add(cVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f118575i.remove((c) it.next());
        }
    }

    @Override // o0.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f118575i.equals(((b) obj).f118575i);
        }
        return false;
    }

    public boolean getBoolean(int i10) throws h {
        c cVarD = D(i10);
        if (cVarD instanceof j) {
            return ((j) cVarD).B();
        }
        throw new h("no boolean at index " + i10, this);
    }

    public float getFloat(int i10) throws h {
        c cVarD = D(i10);
        if (cVarD != null) {
            return cVarD.l();
        }
        throw new h("no float at index " + i10, this);
    }

    public int getInt(int i10) throws h {
        c cVarD = D(i10);
        if (cVarD != null) {
            return cVarD.m();
        }
        throw new h("no int at index " + i10, this);
    }

    @Override // o0.c
    public int hashCode() {
        return Objects.hash(this.f118575i, Integer.valueOf(super.hashCode()));
    }

    public int size() {
        return this.f118575i.size();
    }

    @Override // o0.c
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (c cVar : this.f118575i) {
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(cVar);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }
}
