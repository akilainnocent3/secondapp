package fu;

import cv.z0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wt.c f85347b;

    public d(@l String str) {
        if (str == null) {
            a(5);
        }
        this.f85346a = str;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i10 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i10 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @l
    public static d b(@l wt.b bVar) {
        if (bVar == null) {
            a(1);
        }
        wt.c cVarH = bVar.h();
        String strReplace = bVar.i().b().replace(kj.e.f102543c, z0.f77338c);
        if (cVarH.d()) {
            return new d(strReplace);
        }
        return new d(cVarH.b().replace(kj.e.f102543c, '/') + to.c.userBaseDel + strReplace);
    }

    @l
    public static d c(@l wt.c cVar) {
        if (cVar == null) {
            a(2);
        }
        d dVar = new d(cVar.b().replace(kj.e.f102543c, '/'));
        dVar.f85347b = cVar;
        return dVar;
    }

    @l
    public static d d(@l String str) {
        if (str == null) {
            a(0);
        }
        return new d(str);
    }

    @l
    public wt.c e() {
        return new wt.c(this.f85346a.replace('/', kj.e.f102543c));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f85346a.equals(((d) obj).f85346a);
    }

    @l
    public String f() {
        String str = this.f85346a;
        if (str == null) {
            a(8);
        }
        return str;
    }

    @l
    public wt.c g() {
        int iLastIndexOf = this.f85346a.lastIndexOf(to.c.userBaseDel);
        if (iLastIndexOf != -1) {
            return new wt.c(this.f85346a.substring(0, iLastIndexOf).replace('/', kj.e.f102543c));
        }
        wt.c cVar = wt.c.f143833c;
        if (cVar == null) {
            a(7);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f85346a.hashCode();
    }

    public String toString() {
        return this.f85346a;
    }
}
