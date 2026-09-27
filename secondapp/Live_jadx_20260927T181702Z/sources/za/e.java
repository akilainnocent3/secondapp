package za;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f160934c = new e("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f160935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public f f160936b;

    public e(String... strArr) {
        this.f160935a = Arrays.asList(strArr);
    }

    @CheckResult
    @y0({y0.a.LIBRARY})
    public e a(String str) {
        e eVar = new e(this);
        eVar.f160935a.add(str);
        return eVar;
    }

    public final boolean b() {
        List<String> list = this.f160935a;
        return list.get(list.size() - 1).equals("**");
    }

    @y0({y0.a.LIBRARY})
    public boolean c(String str, int i10) {
        if (i10 >= this.f160935a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f160935a.size() - 1;
        String str2 = this.f160935a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f160935a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z10 && this.f160935a.get(i10 + 1).equals(str)) {
            return i10 == this.f160935a.size() + (-2) || (i10 == this.f160935a.size() + (-3) && b());
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < this.f160935a.size() - 1) {
            return false;
        }
        return this.f160935a.get(i11).equals(str);
    }

    @Nullable
    @y0({y0.a.LIBRARY})
    public f d() {
        return this.f160936b;
    }

    @y0({y0.a.LIBRARY})
    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (this.f160935a.get(i10).equals("**")) {
            return (i10 != this.f160935a.size() - 1 && this.f160935a.get(i10 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f160935a.equals(eVar.f160935a)) {
                return false;
            }
            f fVar = this.f160936b;
            f fVar2 = eVar.f160936b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(String str) {
        return "__container".equals(str);
    }

    public String g() {
        return this.f160935a.toString();
    }

    @y0({y0.a.LIBRARY})
    public boolean h(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f160935a.size()) {
            return false;
        }
        return this.f160935a.get(i10).equals(str) || this.f160935a.get(i10).equals("**") || this.f160935a.get(i10).equals("*");
    }

    public int hashCode() {
        int iHashCode = this.f160935a.hashCode() * 31;
        f fVar = this.f160936b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    @y0({y0.a.LIBRARY})
    public boolean i(String str, int i10) {
        return "__container".equals(str) || i10 < this.f160935a.size() - 1 || this.f160935a.get(i10).equals("**");
    }

    @y0({y0.a.LIBRARY})
    public e j(f fVar) {
        e eVar = new e(this);
        eVar.f160936b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f160935a);
        sb2.append(",resolved=");
        sb2.append(this.f160936b != null);
        sb2.append(fw.b.f85383j);
        return sb2.toString();
    }

    public e(e eVar) {
        this.f160935a = new ArrayList(eVar.f160935a);
        this.f160936b = eVar.f160936b;
    }
}
