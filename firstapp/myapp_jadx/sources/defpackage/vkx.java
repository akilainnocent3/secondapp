package defpackage;

import android.os.Bundle;
import defpackage.ygx;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class vkx<D extends ygx> {
    public yfx.a a;
    public boolean b;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        String value();
    }

    public abstract D a();

    public final xkx b() {
        yfx.a aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        ib5.a("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public ygx c(ygx ygxVar, Bundle bundle, zix zixVar) {
        return ygxVar;
    }

    public void d(List list, final zix zixVar) {
        list.getClass();
        knh.a aVar = new knh.a(new knh(new ysg0(new u48(list), new Function1() { // from class: ukx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ifx ifxVar = (ifx) obj;
                ifxVar.getClass();
                ygx ygxVar = ifxVar.b;
                lfx lfxVar = ifxVar.v;
                if (ygxVar == null) {
                    ygxVar = null;
                }
                if (ygxVar != null) {
                    Bundle bundleA = lfxVar.a();
                    vkx vkxVar = this.a;
                    ygx ygxVarC = vkxVar.c(ygxVar, bundleA, zixVar);
                    if (ygxVarC != null) {
                        return ygxVarC.equals(ygxVar) ? ifxVar : vkxVar.b().a(ygxVarC, ygxVarC.c(lfxVar.a()));
                    }
                }
                return null;
            }
        }), false, new hd80()));
        while (aVar.hasNext()) {
            b().g((ifx) aVar.next());
        }
    }

    public void e(yfx.a aVar) {
        this.a = aVar;
        this.b = true;
    }

    public void f(ifx ifxVar) {
        ygx ygxVar = ifxVar.b;
        if (ygxVar == null) {
            ygxVar = null;
        }
        if (ygxVar == null) {
            return;
        }
        c(ygxVar, null, bjx.a(new plo(1)));
        b().c(ifxVar);
    }

    public Bundle h() {
        return null;
    }

    public void i(ifx ifxVar, boolean z) {
        List list = (List) b().e.a.getValue();
        if (!list.contains(ifxVar)) {
            tkx.a(ifxVar, "popBackStack was called with ", " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        ifx ifxVar2 = null;
        while (j()) {
            ifxVar2 = (ifx) listIterator.previous();
            if (Intrinsics.g(ifxVar2, ifxVar)) {
                break;
            }
        }
        if (ifxVar2 != null) {
            b().d(ifxVar2, z);
        }
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }
}
