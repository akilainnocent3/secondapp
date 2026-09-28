package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public class ygx {
    public static final /* synthetic */ int f = 0;
    public final String a;
    public final dhx b;
    public fhx c;
    public CharSequence d;
    public final esa0<afx> e;

    public static final class a {
        public static String a(ufx ufxVar, int i) {
            ufxVar.getClass();
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                Context context = ufxVar.a;
                context.getClass();
                String resourceName = context.getResources().getResourceName(i);
                resourceName.getClass();
                return resourceName;
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(i);
            }
        }

        public static Sequence b(ygx ygxVar) {
            ygxVar.getClass();
            return fd80.c(ygxVar, new xgx());
        }
    }

    public static final class b implements Comparable<b> {
        public final ygx a;
        public final Bundle b;
        public final boolean c;
        public final int d;
        public final boolean e;
        public final int f;

        public b(ygx ygxVar, Bundle bundle, boolean z, int i, boolean z2, int i2) {
            this.a = ygxVar;
            this.b = bundle;
            this.c = z;
            this.d = i;
            this.e = z2;
            this.f = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            bVar.getClass();
            boolean z = this.c;
            if (z && !bVar.c) {
                return 1;
            }
            if (!z && bVar.c) {
                return -1;
            }
            int i = bVar.d;
            boolean z2 = bVar.e;
            Bundle bundle = bVar.b;
            int i2 = this.d - i;
            if (i2 > 0) {
                return 1;
            }
            if (i2 < 0) {
                return -1;
            }
            Bundle bundle2 = this.b;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                bundle2.getClass();
                int size = bundle2.size();
                bundle.getClass();
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z3 = this.e;
            if (z3 && !z2) {
                return 1;
            }
            if (z3 || !z2) {
                return this.f - bVar.f;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public ygx(vkx<? extends ygx> vkxVar) {
        vkxVar.getClass();
        LinkedHashMap linkedHashMap = wkx.b;
        this.a = wkx.a.a(vkxVar.getClass());
        this.b = new dhx(this);
        this.e = new esa0<>(0);
    }

    public final void b(final pgx pgxVar) {
        pgxVar.getClass();
        dhx dhxVar = this.b;
        dhxVar.getClass();
        ArrayList arrayListA = hfx.a(dhxVar.d, new Function1() { // from class: ahx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(!pgxVar.c().contains(str));
            }
        });
        if (arrayListA.isEmpty()) {
            dhxVar.c.add(pgxVar);
        } else {
            vgx.a(pgxVar.a, "Deep link ", " can't be used to open destination ", dhxVar.a, ".\nFollowing required arguments are missing: ", arrayListA);
        }
    }

    public final Bundle c(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.b.d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        o2g.a.getClass();
        Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ffx ffxVar = (ffx) entry.getValue();
            ffxVar.getClass();
            str.getClass();
            if (ffxVar.c && (obj = ffxVar.e) != null) {
                ffxVar.a.e(bundleA, str, obj);
            }
        }
        if (bundle != null) {
            bundleA.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                ffx ffxVar2 = (ffx) entry2.getValue();
                boolean z = ffxVar2.d;
                djx<Object> djxVar = ffxVar2.a;
                if (!z) {
                    str2.getClass();
                    if (ffxVar2.b || !bundleA.containsKey(str2) || !hv60.f(str2, bundleA)) {
                        try {
                            djxVar.a(str2, bundleA);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    wgx.a(he.a("Wrong argument type for '", str2, "' in argument savedState. "), djxVar.b(), " expected.");
                    return null;
                }
            }
        }
        return bundleA;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    public final int[] d(ygx ygxVar) {
        gx0 gx0Var = new gx0();
        while (true) {
            dhx dhxVar = this.b;
            fhx fhxVar = this.c;
            if ((ygxVar != null ? ygxVar.c : null) != null) {
                fhx fhxVar2 = ygxVar.c;
                fhxVar2.getClass();
                if (fhxVar2.i.b(dhxVar.e) != this) {
                    if (fhxVar != null || fhxVar.i.c != dhxVar.e) {
                        gx0Var.addFirst(this);
                    }
                    if (!Intrinsics.g(fhxVar, ygxVar) || fhxVar == null) {
                        break;
                    }
                    this = fhxVar;
                } else {
                    gx0Var.addFirst(this);
                    break;
                }
            } else {
                if (fhxVar != null) {
                    gx0Var.addFirst(this);
                } else {
                    gx0Var.addFirst(this);
                }
                if (!Intrinsics.g(fhxVar, ygxVar)) {
                    break;
                }
                this = fhxVar;
            }
        }
        List listA0 = CollectionsKt.A0(gx0Var);
        ArrayList arrayList = new ArrayList(l48.r(listA0, 10));
        Iterator it = listA0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ygx) it.next()).b.e));
        }
        return CollectionsKt.z0(arrayList);
    }

    public final afx e(int i) {
        afx afxVar;
        esa0<afx> esa0Var = this.e;
        if (esa0Var.e() == 0) {
            afxVar = null;
        } else {
            esa0Var.getClass();
            afxVar = (afx) fsa0.a(esa0Var, i);
        }
        if (afxVar != null) {
            return afxVar;
        }
        fhx fhxVar = this.c;
        if (fhxVar != null) {
            return fhxVar.e(i);
        }
        return null;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof ygx)) {
                dhx dhxVar = this.b;
                ArrayList arrayList = dhxVar.c;
                ygx ygxVar = (ygx) obj;
                esa0<afx> esa0Var = ygxVar.e;
                dhx dhxVar2 = ygxVar.b;
                boolean zEquals = arrayList.equals(dhxVar2.c);
                esa0<afx> esa0Var2 = this.e;
                if (esa0Var2.e() != esa0Var.e()) {
                    z = false;
                    break;
                }
                Iterator it = fd80.b(new gsa0(esa0Var2)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!Intrinsics.g(fsa0.a(esa0Var2, iIntValue), fsa0.a(esa0Var, iIntValue))) {
                        z = false;
                        break;
                    }
                }
                if (f().size() != ygxVar.f().size()) {
                    z2 = false;
                    break;
                }
                Iterator it2 = CollectionsKt.K(f().entrySet()).a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!ygxVar.f().containsKey(entry.getKey()) || !Intrinsics.g(ygxVar.f().get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (dhxVar.e != dhxVar2.e || !Intrinsics.g(dhxVar.f, dhxVar2.f) || !zEquals || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    public final Map<String, ffx> f() {
        return kpu.l(this.b.d);
    }

    public String h() {
        dhx dhxVar = this.b;
        String str = dhxVar.b;
        return str == null ? String.valueOf(dhxVar.e) : str;
    }

    public int hashCode() {
        dhx dhxVar = this.b;
        int i = dhxVar.e * 31;
        String str = dhxVar.f;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = dhxVar.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            pgx pgxVar = (pgx) obj;
            int i3 = iHashCode * 31;
            String str2 = pgxVar.a;
            int iHashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = pgxVar.b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = pgxVar.c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        esa0<afx> esa0Var = this.e;
        esa0Var.getClass();
        int i4 = 0;
        while (true) {
            if (!(i4 < esa0Var.e())) {
                break;
            }
            int i5 = i4 + 1;
            afx afxVarF = esa0Var.f(i4);
            int i6 = ((iHashCode * 31) + afxVarF.a) * 31;
            zix zixVar = afxVarF.b;
            iHashCode = i6 + (zixVar != null ? zixVar.hashCode() : 0);
            Bundle bundle = afxVarF.c;
            if (bundle != null) {
                iHashCode = iv60.b(bundle) + (iHashCode * 31);
            }
            i4 = i5;
        }
        for (String str5 : f().keySet()) {
            int iA = gmf0.a(iHashCode * 31, 31, str5);
            ffx ffxVar = f().get(str5);
            iHashCode = iA + (ffxVar != null ? ffxVar.hashCode() : 0);
        }
        return iHashCode;
    }

    public final boolean i(String str, Bundle bundle) {
        str.getClass();
        dhx dhxVar = this.b;
        dhxVar.getClass();
        if (Intrinsics.g(dhxVar.f, str)) {
            return true;
        }
        b bVarA = dhxVar.a(str);
        if (!dhxVar.a.equals(bVarA != null ? bVarA.a : null)) {
            return false;
        }
        Bundle bundle2 = bVarA.b;
        if (bundle == null || bundle2 == null) {
            return false;
        }
        Set<String> setKeySet = bundle2.keySet();
        setKeySet.getClass();
        for (String str2 : setKeySet) {
            str2.getClass();
            if (!bundle.containsKey(str2)) {
                return false;
            }
            ffx ffxVar = bVarA.a.f().get(str2);
            djx<Object> djxVar = ffxVar != null ? ffxVar.a : null;
            Object objA = djxVar != null ? djxVar.a(str2, bundle2) : null;
            Object objA2 = djxVar != null ? djxVar.a(str2, bundle) : null;
            if (djxVar != null && !djxVar.g(objA, objA2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:17:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:23:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:73:0x0157  */
    /* JADX WARN: Code duplicated, block: B:87:0x0198  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ab  */
    public b j(ugx ugxVar) {
        boolean z;
        boolean zF;
        boolean zEquals;
        boolean zF2;
        Bundle bundleD;
        boolean z2;
        int i;
        b bVar;
        final Bundle bundleA;
        Regex regex;
        n8v n8vVarE;
        List listT0;
        int i2;
        List listT1;
        ugxVar = ugxVar;
        dhx dhxVar = this.b;
        LinkedHashMap linkedHashMap = dhxVar.d;
        Uri uri = ugxVar.a;
        ArrayList arrayList = dhxVar.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        b bVar2 = null;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            pgx pgxVar = (pgx) obj;
            String str = ugxVar.c;
            String str2 = ugxVar.b;
            pgxVar.getClass();
            mpe0 mpe0Var = pgxVar.o;
            mpe0 mpe0Var2 = pgxVar.f;
            String str3 = pgxVar.c;
            String str4 = pgxVar.b;
            if (((Regex) mpe0Var2.getValue()) == null) {
                zF = true;
            } else {
                if (uri == null) {
                    zF = false;
                } else {
                    z = true;
                    Regex regex2 = (Regex) mpe0Var2.getValue();
                    regex2.getClass();
                    zF = regex2.f(uri.toString());
                }
                if (!zF) {
                    if (str4 == null) {
                        zEquals = z;
                    } else if (str2 == null) {
                        zEquals = false;
                    } else {
                        zEquals = str4.equals(str2);
                    }
                    if (!zEquals) {
                        if (str3 == null) {
                            zF2 = z;
                        } else if (str == null) {
                            zF2 = false;
                        } else {
                            Regex regex3 = (Regex) mpe0Var.getValue();
                            regex3.getClass();
                            zF2 = regex3.f(str);
                        }
                        if (!zF2) {
                            if (uri != null) {
                                bundleD = pgxVar.d(uri, linkedHashMap);
                            } else {
                                bundleD = null;
                            }
                            int iB = pgxVar.b(uri);
                            if (str2 == null && str2.equals(str4)) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (str != null || str3 == null) {
                                i = -1;
                            } else {
                                Regex regex4 = (Regex) mpe0Var.getValue();
                                regex4.getClass();
                                if (regex4.f(str)) {
                                    List listH = new Regex("/").h(str3);
                                    if (!listH.isEmpty()) {
                                        ListIterator listIterator = listH.listIterator(listH.size());
                                        while (true) {
                                            if (!listIterator.hasPrevious()) {
                                                listT0 = m2g.a;
                                                break;
                                            }
                                            if (((String) listIterator.previous()).length() != 0) {
                                                listT0 = CollectionsKt.t0(listH, listIterator.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    } else {
                                        listT0 = m2g.a;
                                        break;
                                    }
                                    String str5 = (String) listT0.get(0);
                                    String str6 = (String) listT0.get(z ? 1 : 0);
                                    List listH2 = new Regex("/").h(str);
                                    if (!listH2.isEmpty()) {
                                        ListIterator listIterator2 = listH2.listIterator(listH2.size());
                                        while (true) {
                                            if (!listIterator2.hasPrevious()) {
                                                i2 = 1;
                                                listT1 = m2g.a;
                                                break;
                                            }
                                            if (((String) listIterator2.previous()).length() != 0) {
                                                i2 = 1;
                                                listT1 = CollectionsKt.t0(listH2, listIterator2.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    } else {
                                        i2 = 1;
                                        listT1 = m2g.a;
                                        break;
                                    }
                                    String str7 = (String) listT1.get(0);
                                    String str8 = (String) listT1.get(i2);
                                    i = Intrinsics.g(str5, str7) ? 2 : 0;
                                    if (Intrinsics.g(str6, str8)) {
                                        i++;
                                    }
                                } else {
                                    i = -1;
                                }
                            }
                            if (bundleD != null) {
                                if (!z2 || i > -1) {
                                    o2g.a.getClass();
                                    bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                                    if (uri != null && (regex = (Regex) mpe0Var2.getValue()) != null && (n8vVarE = regex.e(uri.toString())) != null) {
                                        pgxVar.e(n8vVarE, bundleA, linkedHashMap);
                                        if (((Boolean) pgxVar.g.getValue()).booleanValue()) {
                                            pgxVar.f(uri, bundleA, linkedHashMap);
                                        }
                                    }
                                    if (hfx.a(linkedHashMap, new Function1() { // from class: chx
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            String str9 = (String) obj2;
                                            str9.getClass();
                                            return Boolean.valueOf(!bundleA.containsKey(str9));
                                        }
                                    }).isEmpty()) {
                                    }
                                }
                            }
                            bVar = new b(dhxVar.a, bundleD, pgxVar.p, iB, z2, i);
                            if (bVar2 != null || bVar.compareTo(bVar2) > 0) {
                                bVar2 = bVar;
                            }
                        }
                    }
                }
            }
            z = true;
            if (!zF) {
                if (str4 == null) {
                    zEquals = z;
                } else if (str2 == null) {
                    zEquals = false;
                } else {
                    zEquals = str4.equals(str2);
                }
                if (!zEquals) {
                    if (str3 == null) {
                        zF2 = z;
                    } else if (str == null) {
                        zF2 = false;
                    } else {
                        Regex regex5 = (Regex) mpe0Var.getValue();
                        regex5.getClass();
                        zF2 = regex5.f(str);
                    }
                    if (!zF2) {
                        if (uri != null) {
                            bundleD = pgxVar.d(uri, linkedHashMap);
                        } else {
                            bundleD = null;
                        }
                        int iB2 = pgxVar.b(uri);
                        if (str2 == null) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (str != null) {
                            i = -1;
                        } else {
                            i = -1;
                        }
                        if (bundleD != null) {
                            if (!z2) {
                            }
                            o2g.a.getClass();
                            bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                            if (uri != null) {
                                pgxVar.e(n8vVarE, bundleA, linkedHashMap);
                                if (((Boolean) pgxVar.g.getValue()).booleanValue()) {
                                    pgxVar.f(uri, bundleA, linkedHashMap);
                                }
                            }
                            if (hfx.a(linkedHashMap, new Function1() { // from class: chx
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    String str9 = (String) obj2;
                                    str9.getClass();
                                    return Boolean.valueOf(!bundleA.containsKey(str9));
                                }
                            }).isEmpty()) {
                            }
                        }
                        bVar = new b(dhxVar.a, bundleD, pgxVar.p, iB2, z2, i);
                        if (bVar2 != null) {
                        }
                        bVar2 = bVar;
                    }
                }
            }
        }
        return bVar2;
    }

    public void k(Context context, AttributeSet attributeSet) {
        String strValueOf;
        context.getClass();
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, bk30.e);
        typedArrayObtainAttributes.getClass();
        m(typedArrayObtainAttributes.getString(2));
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            dhx dhxVar = this.b;
            dhxVar.e = resourceId;
            dhxVar.b = null;
            int i = dhxVar.e;
            if (i <= 16777215) {
                strValueOf = String.valueOf(i);
            } else {
                try {
                    strValueOf = context.getResources().getResourceName(i);
                    strValueOf.getClass();
                } catch (Resources.NotFoundException unused) {
                    strValueOf = String.valueOf(i);
                }
            }
            dhxVar.b = strValueOf;
        }
        this.d = typedArrayObtainAttributes.getText(0);
        Unit unit = Unit.a;
        typedArrayObtainAttributes.recycle();
    }

    public final void l(int i, afx afxVar) {
        afxVar.getClass();
        if (!(this instanceof id.a)) {
            if (i != 0) {
                this.e.d(i, afxVar);
                return;
            } else {
                hb5.a("Cannot have an action with actionId 0");
                return;
            }
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void m(String str) {
        dhx dhxVar = this.b;
        if (str == null) {
            dhxVar.e = 0;
            dhxVar.b = null;
        } else {
            dhxVar.getClass();
            if (StringsKt.U(str)) {
                hb5.a("Cannot have an empty route");
                return;
            }
            String strConcat = "android-app://androidx.navigation/".concat(str);
            final pgx pgxVar = new pgx(strConcat, null, null);
            ArrayList arrayListA = hfx.a(dhxVar.d, new Function1() { // from class: bhx
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str2 = (String) obj;
                    str2.getClass();
                    return Boolean.valueOf(!pgxVar.c().contains(str2));
                }
            });
            if (!arrayListA.isEmpty()) {
                StringBuilder sbA = he.a("Cannot set route \"", str, "\" for destination ");
                sbA.append(dhxVar.a);
                sbA.append(". Following required arguments are missing: ");
                sbA.append(arrayListA);
                throw new IllegalArgumentException(sbA.toString().toString());
            }
            dhxVar.g = hwr.b(new li0(strConcat, 2));
            dhxVar.e = strConcat.hashCode();
            dhxVar.b = null;
        }
        dhxVar.f = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("(");
        dhx dhxVar = this.b;
        String str = dhxVar.b;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(dhxVar.e));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = dhxVar.f;
        if (str2 != null && !StringsKt.U(str2)) {
            sb.append(" route=");
            sb.append(dhxVar.f);
        }
        if (this.d != null) {
            sb.append(" label=");
            sb.append(this.d);
        }
        return sb.toString();
    }
}
