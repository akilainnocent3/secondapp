package defpackage;

import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w060 {
    public static final djx<Object> a(pd80 pd80Var, Map<qhp, ? extends djx<?>> map) {
        Object next;
        djx<?> djxVar;
        boolean zEquals;
        Iterator<T> it = map.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            qhp qhpVar = (qhp) next;
            pd80Var.getClass();
            qhpVar.getClass();
            if (pd80Var.b() != qhpVar.b()) {
                zEquals = false;
            } else {
                php<Object> phpVarD = ue80.d(ve80.a, qhpVar);
                if (phpVarD == null) {
                    i0b.b(pd80Var.h(), "Cannot find KSerializer for [", "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
                    return null;
                }
                zEquals = pd80Var.equals(phpVarD.getDescriptor());
            }
        } while (!zEquals);
        qhp qhpVar2 = (qhp) next;
        djx<?> iyoVar = qhpVar2 != null ? map.get(qhpVar2) : null;
        if (iyoVar == null) {
            iyoVar = null;
        }
        ubh0 ubh0Var = ubh0.r;
        if (iyoVar == null) {
            pd80Var.getClass();
            switch (ejx.a(pd80Var).ordinal()) {
                case 0:
                    djxVar = djx.b;
                    iyoVar = djxVar;
                    break;
                case 1:
                    djxVar = bzo.a;
                    iyoVar = djxVar;
                    break;
                case 2:
                    djxVar = djx.l;
                    iyoVar = djxVar;
                    break;
                case 3:
                    djxVar = bzo.b;
                    iyoVar = djxVar;
                    break;
                case 4:
                    djxVar = bzo.c;
                    iyoVar = djxVar;
                    break;
                case 5:
                    djxVar = bzo.d;
                    iyoVar = djxVar;
                    break;
                case 6:
                    djxVar = djx.i;
                    iyoVar = djxVar;
                    break;
                case 7:
                    djxVar = bzo.e;
                    iyoVar = djxVar;
                    break;
                case 8:
                    djxVar = djx.f;
                    iyoVar = djxVar;
                    break;
                case 9:
                    djxVar = bzo.f;
                    iyoVar = djxVar;
                    break;
                case 10:
                    djxVar = bzo.g;
                    iyoVar = djxVar;
                    break;
                case 11:
                    djxVar = djx.o;
                    iyoVar = djxVar;
                    break;
                case 12:
                    djxVar = djx.d;
                    iyoVar = djxVar;
                    break;
                case 13:
                    djxVar = djx.m;
                    iyoVar = djxVar;
                    break;
                case 14:
                    djxVar = bzo.j;
                    iyoVar = djxVar;
                    break;
                case 15:
                    djxVar = djx.j;
                    iyoVar = djxVar;
                    break;
                case 16:
                    djxVar = djx.g;
                    iyoVar = djxVar;
                    break;
                case 17:
                    int iOrdinal = ejx.a(pd80Var.g(0)).ordinal();
                    if (iOrdinal == 10) {
                        djxVar = djx.p;
                    } else if (iOrdinal != 11) {
                        iyoVar = ubh0Var;
                    } else {
                        djxVar = bzo.h;
                    }
                    iyoVar = djxVar;
                    break;
                case 18:
                    int iOrdinal2 = ejx.a(pd80Var.g(0)).ordinal();
                    if (iOrdinal2 == 0) {
                        djxVar = djx.e;
                    } else if (iOrdinal2 == 2) {
                        djxVar = djx.n;
                    } else if (iOrdinal2 == 4) {
                        djxVar = bzo.k;
                    } else if (iOrdinal2 == 6) {
                        djxVar = djx.k;
                    } else if (iOrdinal2 == 8) {
                        djxVar = djx.h;
                    } else if (iOrdinal2 == 19) {
                        iyoVar = new iyo<>(fjx.a(pd80Var.g(0)));
                    } else if (iOrdinal2 == 10) {
                        djxVar = djx.q;
                    } else if (iOrdinal2 != 11) {
                        iyoVar = ubh0Var;
                    } else {
                        djxVar = bzo.i;
                    }
                    iyoVar = djxVar;
                    break;
                case 19:
                    Class<?> clsA = fjx.a(pd80Var);
                    if (Parcelable.class.isAssignableFrom(clsA)) {
                        iyoVar = new djx.e<>(clsA);
                    } else if (Enum.class.isAssignableFrom(clsA)) {
                        iyoVar = new djx.c<>(clsA);
                    } else {
                        iyoVar = Serializable.class.isAssignableFrom(clsA) ? new djx.g<>(clsA) : null;
                    }
                    if (iyoVar == null) {
                        iyoVar = ubh0Var;
                    }
                    break;
                case 20:
                    Class<?> clsA2 = fjx.a(pd80Var);
                    iyoVar = !Enum.class.isAssignableFrom(clsA2) ? ubh0Var : new jyo<>(clsA2);
                    break;
                default:
                    iyoVar = ubh0Var;
                    break;
            }
        }
        if (iyoVar.equals(ubh0Var)) {
            return null;
        }
        return iyoVar;
    }

    public static final <T> int b(php<T> phpVar) {
        int iHashCode = phpVar.getDescriptor().h().hashCode();
        int iD = phpVar.getDescriptor().d();
        for (int i = 0; i < iD; i++) {
            iHashCode = (iHashCode * 31) + phpVar.getDescriptor().e(i).hashCode();
        }
        return iHashCode;
    }

    public static final ArrayList c(final php phpVar, final Map map) {
        map.getClass();
        if (phpVar instanceof i120) {
            zqh0.a(phpVar, "Cannot generate NavArguments for polymorphic serializer ", ". Arguments can only be generated from concrete classes or objects.");
            return null;
        }
        int iD = phpVar.getDescriptor().d();
        ArrayList arrayList = new ArrayList(iD);
        for (final int i = 0; i < iD; i++) {
            final String strE = phpVar.getDescriptor().e(i);
            arrayList.add(bf0.b(strE, new Function1() { // from class: u060
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    gfx gfxVar = (gfx) obj;
                    gfxVar.getClass();
                    php phpVar2 = phpVar;
                    pd80 descriptor = phpVar2.getDescriptor();
                    int i2 = i;
                    pd80 pd80VarG = descriptor.g(i2);
                    boolean zB = pd80VarG.b();
                    Map map2 = map;
                    djx<Object> djxVarA = w060.a(pd80VarG, map2);
                    if (djxVarA == null) {
                        hb5.a(w060.f(strE, pd80VarG.h(), phpVar2.getDescriptor().h(), map2.toString()));
                        return null;
                    }
                    ffx.a aVar = gfxVar.a;
                    aVar.a = djxVarA;
                    aVar.b = zB;
                    if (phpVar2.getDescriptor().i(i2)) {
                        aVar.e = true;
                    }
                    return Unit.a;
                }
            }));
        }
        return arrayList;
    }

    public static final String d(Object obj, LinkedHashMap linkedHashMap) {
        obj.getClass();
        php phpVarB = ue80.b(jq40.a(obj.getClass()));
        final Map<String, List<String>> mapH0 = new t060(phpVarB, linkedHashMap).h0(obj);
        final r060 r060Var = new r060(phpVarB);
        gaj gajVar = new gaj() { // from class: v060
            @Override // defpackage.gaj
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj2).intValue();
                String str = (String) obj3;
                djx djxVar = (djx) obj4;
                str.getClass();
                djxVar.getClass();
                Object obj5 = mapH0.get(str);
                obj5.getClass();
                List list = (List) obj5;
                boolean z = djxVar instanceof c48;
                r060 r060Var2 = r060Var;
                int iOrdinal = ((z || r060Var2.a.getDescriptor().i(iIntValue)) ? r060.a.b : r060.a.a).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return null;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r060Var2.a(str, (String) it.next());
                    }
                } else {
                    if (list.size() != 1) {
                        StringBuilder sbA = he.a("Expected one value for argument ", str, ", found ");
                        sbA.append(list.size());
                        sbA.append("values instead.");
                        throw new IllegalArgumentException(sbA.toString().toString());
                    }
                    r060Var2.c += '/' + ((String) CollectionsKt.T(list));
                }
                return Unit.a;
            }
        };
        int iD = phpVarB.getDescriptor().d();
        for (int i = 0; i < iD; i++) {
            String strE = phpVarB.getDescriptor().e(i);
            djx djxVar = (djx) linkedHashMap.get(strE);
            if (djxVar == null) {
                q1b.a(zdf0.a(']', "Cannot locate NavType for argument [", strE));
                return null;
            }
            gajVar.invoke(Integer.valueOf(i), strE, djxVar);
        }
        return r060Var.b + r060Var.c + r060Var.d;
    }

    public static final boolean e(pd80 pd80Var) {
        pd80Var.getClass();
        return Intrinsics.g(pd80Var.getKind(), ebe0.a.a) && pd80Var.isInline() && pd80Var.d() == 1;
    }

    public static final String f(String str, String str2, String str3, String str4) {
        return pr0.a(ux5.a("Route ", str3, " could not find any NavType for argument ", str, " of type "), str2, " - typeMap received was ", str4);
    }
}
