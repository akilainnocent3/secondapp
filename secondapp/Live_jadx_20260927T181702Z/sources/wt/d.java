package wt;

import androidx.media3.session.fe;
import com.ironsource.B1;
import ds.l;
import fr.a0;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f143836e = f.i("<root>");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f143837f = Pattern.compile("\\.");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l<String, f> f143838g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f143839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient c f143840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient d f143841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient f f143842d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements l<String, f> {
        @Override // ds.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f invoke(String str) {
            return f.e(str);
        }
    }

    public d(@oy.l String str, @oy.l c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f143839a = str;
        this.f143840b = cVar;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i11 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = B1.f58463i;
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = androidx.constraintlayout.widget.g.W1;
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @oy.l
    public static d m(@oy.l f fVar) {
        if (fVar == null) {
            a(16);
        }
        return new d(fVar.b(), c.f143833c.j(), fVar);
    }

    @oy.l
    public String b() {
        String str = this.f143839a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    @oy.l
    public d c(@oy.l f fVar) {
        String strB;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            strB = fVar.b();
        } else {
            strB = this.f143839a + fe.F + fVar.b();
        }
        return new d(strB, this, fVar);
    }

    public final void d() {
        int iLastIndexOf = this.f143839a.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f143842d = f.e(this.f143839a.substring(iLastIndexOf + 1));
            this.f143841c = new d(this.f143839a.substring(0, iLastIndexOf));
        } else {
            this.f143842d = f.e(this.f143839a);
            this.f143841c = c.f143833c.j();
        }
    }

    public boolean e() {
        return this.f143839a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f143839a.equals(((d) obj).f143839a);
    }

    public boolean f() {
        return this.f143840b != null || b().indexOf(60) < 0;
    }

    @oy.l
    public d g() {
        d dVar = this.f143841c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        d dVar2 = this.f143841c;
        if (dVar2 == null) {
            a(8);
        }
        return dVar2;
    }

    @oy.l
    public List<f> h() {
        List<f> listXi = e() ? Collections.EMPTY_LIST : a0.xi(f143837f.split(this.f143839a), f143838g);
        if (listXi == null) {
            a(14);
        }
        return listXi;
    }

    public int hashCode() {
        return this.f143839a.hashCode();
    }

    @oy.l
    public f i() {
        f fVar = this.f143842d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        f fVar2 = this.f143842d;
        if (fVar2 == null) {
            a(11);
        }
        return fVar2;
    }

    @oy.l
    public f j() {
        if (e()) {
            f fVar = f143836e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f fVarI = i();
        if (fVarI == null) {
            a(13);
        }
        return fVarI;
    }

    public boolean k(@oy.l f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int iIndexOf = this.f143839a.indexOf(46);
        String strB = fVar.b();
        String str = this.f143839a;
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strB.length());
        }
        return str.regionMatches(0, strB, 0, iIndexOf);
    }

    @oy.l
    public c l() {
        c cVar = this.f143840b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f143840b = cVar2;
        return cVar2;
    }

    @oy.l
    public String toString() {
        String strB = e() ? f143836e.b() : this.f143839a;
        if (strB == null) {
            a(17);
        }
        return strB;
    }

    public d(@oy.l String str) {
        if (str == null) {
            a(2);
        }
        this.f143839a = str;
    }

    public d(@oy.l String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f143839a = str;
        this.f143841c = dVar;
        this.f143842d = fVar;
    }
}
