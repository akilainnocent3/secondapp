package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public class fhx extends ygx implements Iterable<ygx>, dhp {
    public static final /* synthetic */ int v = 0;
    public final lhx i;

    public static final class a {
        public static ygx a(fhx fhxVar) {
            return (ygx) ld80.h(fd80.c(fhxVar, new c5a(1)));
        }
    }

    public fhx(nhx nhxVar) {
        super(nhxVar);
        this.i = new lhx(this);
    }

    @Override // defpackage.ygx
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fhx) || !super.equals(obj)) {
            return false;
        }
        lhx lhxVar = this.i;
        int iE = lhxVar.b.e();
        lhx lhxVar2 = ((fhx) obj).i;
        if (iE != lhxVar2.b.e() || lhxVar.c != lhxVar2.c) {
            return false;
        }
        for (ygx ygxVar : fd80.b(new hsa0(lhxVar.b))) {
            if (!ygxVar.equals(fsa0.a(lhxVar2.b, ygxVar.b.e))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ygx
    public final String h() {
        String strH = super.h();
        lhx lhxVar = this.i;
        lhxVar.getClass();
        strH.getClass();
        return lhxVar.a.b.e != 0 ? strH : "the root navigation";
    }

    @Override // defpackage.ygx
    public final int hashCode() {
        lhx lhxVar = this.i;
        int iC = lhxVar.c;
        esa0<ygx> esa0Var = lhxVar.b;
        int iE = esa0Var.e();
        for (int i = 0; i < iE; i++) {
            iC = (((iC * 31) + esa0Var.c(i)) * 31) + esa0Var.f(i).hashCode();
        }
        return iC;
    }

    @Override // java.lang.Iterable
    public final Iterator<ygx> iterator() {
        lhx lhxVar = this.i;
        lhxVar.getClass();
        return new khx(lhxVar);
    }

    @Override // defpackage.ygx
    public final ygx.b j(ugx ugxVar) {
        ygx.b bVarJ = super.j(ugxVar);
        lhx lhxVar = this.i;
        lhxVar.getClass();
        return lhxVar.e(bVarJ, ugxVar, false, lhxVar.a);
    }

    @Override // defpackage.ygx
    public final void k(Context context, AttributeSet attributeSet) {
        String strValueOf;
        context.getClass();
        super.k(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, bk30.d);
        typedArrayObtainAttributes.getClass();
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        lhx lhxVar = this.i;
        lhxVar.f(resourceId);
        int i = lhxVar.c;
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
        lhxVar.d = strValueOf;
        Unit unit = Unit.a;
        typedArrayObtainAttributes.recycle();
    }

    public final ygx n(String str) {
        lhx lhxVar = this.i;
        lhxVar.getClass();
        if (str == null || StringsKt.U(str)) {
            return null;
        }
        return lhxVar.c(str, true);
    }

    public final ygx.b o(ugx ugxVar, ygx ygxVar) {
        return this.i.e(super.j(ugxVar), ugxVar, true, ygxVar);
    }

    public final ygx.b p(String str, boolean z, ygx ygxVar) {
        ygx.b bVarP;
        str.getClass();
        lhx lhxVar = this.i;
        lhxVar.getClass();
        fhx fhxVar = lhxVar.a;
        ygx.b bVarA = fhxVar.b.a(str);
        ArrayList arrayList = new ArrayList();
        Iterator<ygx> it = fhxVar.iterator();
        while (true) {
            khx khxVar = (khx) it;
            bVarP = null;
            if (!khxVar.hasNext()) {
                break;
            }
            ygx ygxVar2 = (ygx) khxVar.next();
            if (!Intrinsics.g(ygxVar2, ygxVar)) {
                if (ygxVar2 instanceof fhx) {
                    bVarP = ((fhx) ygxVar2).p(str, false, fhxVar);
                } else {
                    ygxVar2.getClass();
                    bVarP = ygxVar2.b.a(str);
                }
            }
            if (bVarP != null) {
                arrayList.add(bVarP);
            }
        }
        ygx.b bVar = (ygx.b) CollectionsKt.e0(arrayList);
        fhx fhxVar2 = fhxVar.c;
        if (fhxVar2 != null && z && !fhxVar2.equals(ygxVar)) {
            bVarP = fhxVar2.p(str, true, fhxVar);
        }
        return (ygx.b) CollectionsKt.e0(ay0.v(new ygx.b[]{bVarA, bVar, bVarP}));
    }

    @Override // defpackage.ygx
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        lhx lhxVar = this.i;
        ygx ygxVarN = n(lhxVar.e);
        if (ygxVarN == null) {
            ygxVarN = lhxVar.b(lhxVar.c);
        }
        sb.append(" startDestination=");
        if (ygxVarN == null) {
            String str = lhxVar.e;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = lhxVar.d;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(lhxVar.c));
                }
            }
        } else {
            sb.append("{");
            sb.append(ygxVarN.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
