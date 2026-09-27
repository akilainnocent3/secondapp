package fu;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import n0.w;
import oy.l;
import ts.i;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum e {
    BOOLEAN(i.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(i.CHAR, "char", "C", "java.lang.Character"),
    BYTE(i.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(i.SHORT, "short", l3.a.R4, "java.lang.Short"),
    INT(i.INT, "int", "I", "java.lang.Integer"),
    FLOAT(i.FLOAT, w.b.f115804c, "F", "java.lang.Float"),
    LONG(i.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(i.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Set<wt.c> f85356n = new HashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Map<String, e> f85357o = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Map<i, e> f85358p = new EnumMap(i.class);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Map<String, e> f85359q = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f85361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f85363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.c f85364e;

    static {
        for (e eVar : values()) {
            f85356n.add(eVar.i());
            f85357o.put(eVar.g(), eVar);
            f85358p.put(eVar.h(), eVar);
            f85359q.put(eVar.d(), eVar);
        }
    }

    e(@l i iVar, @l String str, String str2, String str3) {
        if (iVar == null) {
            a(6);
        }
        if (str == null) {
            a(7);
        }
        if (str2 == null) {
            a(8);
        }
        if (str3 == null) {
            a(9);
        }
        this.f85361b = iVar;
        this.f85362c = str;
        this.f85363d = str2;
        this.f85364e = new wt.c(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                case 11:
                case 12:
                case 13:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 7:
                objArr[0] = "name";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 3:
                objArr[0] = "type";
                break;
            case 5:
            case 8:
                objArr[0] = CampaignEx.JSON_KEY_DESC;
                break;
            case 6:
                objArr[0] = "primitiveType";
                break;
            case 9:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "className";
                break;
        }
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 11:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 12:
                    objArr[1] = "getDesc";
                    break;
                case 13:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i10) {
            case 1:
            case 3:
                objArr[2] = "get";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 5:
                objArr[2] = "getByDesc";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @l
    public static e b(@l String str) {
        if (str == null) {
            a(1);
        }
        e eVar = f85357o.get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    @l
    public static e c(@l i iVar) {
        if (iVar == null) {
            a(3);
        }
        e eVar = f85358p.get(iVar);
        if (eVar == null) {
            a(4);
        }
        return eVar;
    }

    @l
    public String d() {
        String str = this.f85363d;
        if (str == null) {
            a(12);
        }
        return str;
    }

    @l
    public String g() {
        String str = this.f85362c;
        if (str == null) {
            a(11);
        }
        return str;
    }

    @l
    public i h() {
        i iVar = this.f85361b;
        if (iVar == null) {
            a(10);
        }
        return iVar;
    }

    @l
    public wt.c i() {
        wt.c cVar = this.f85364e;
        if (cVar == null) {
            a(13);
        }
        return cVar;
    }
}
