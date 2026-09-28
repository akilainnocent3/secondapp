package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bjx {
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    public static final zix a(Function1<? super ajx, Unit> function1) {
        int iB;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        ygp<?> ygpVar;
        Object obj;
        boolean z6;
        boolean z7;
        int i2;
        ajx ajxVar = new ajx();
        function1.invoke(ajxVar);
        boolean z8 = ajxVar.b;
        zix.a aVar = ajxVar.a;
        aVar.a = z8;
        aVar.b = ajxVar.c;
        String str2 = ajxVar.e;
        if (str2 == null) {
            dq7 dq7Var = ajxVar.h;
            if (dq7Var != null) {
                z = ajxVar.f;
                z4 = ajxVar.g;
                aVar.d = dq7Var;
            } else {
                swf swfVar = ajxVar.i;
                if (swfVar != null) {
                    z = ajxVar.f;
                    z2 = ajxVar.g;
                    aVar.e = swfVar;
                    iB = w060.b(ue80.b(jq40.a(swf.class)));
                    aVar.c = null;
                } else {
                    iB = ajxVar.d;
                    z = ajxVar.f;
                    z2 = ajxVar.g;
                    aVar.c = null;
                }
                i = iB;
                z3 = z2;
            }
            z5 = z;
            str = aVar.c;
            if (str != null) {
                boolean z9 = aVar.a;
                boolean z10 = aVar.b;
                int i3 = aVar.f;
                int i4 = aVar.g;
                int i5 = aVar.h;
                int i6 = aVar.i;
                int i7 = ygx.f;
                zix zixVar = new zix(z9, z10, "android-app://androidx.navigation/".concat(str).hashCode(), z5, z3, i3, i4, i5, i6);
                zixVar.j = str;
                return zixVar;
            }
            ygpVar = aVar.d;
            if (ygpVar != null) {
                zix zixVar2 = new zix(aVar.a, aVar.b, w060.b(ue80.b(ygpVar)), z5, z3, aVar.f, aVar.g, aVar.h, aVar.i);
                zixVar2.k = ygpVar;
                return zixVar2;
            }
            obj = aVar.e;
            z6 = aVar.a;
            z7 = aVar.b;
            i2 = aVar.f;
            if (obj != null) {
                return new zix(z6, z7, i, z5, z3, i2, aVar.g, aVar.h, aVar.i);
            }
            zix zixVar3 = new zix(z6, z7, w060.b(ue80.b(jq40.a(obj.getClass()))), z5, z3, i2, aVar.g, aVar.h, aVar.i);
            zixVar3.l = obj;
            return zixVar3;
        }
        z = ajxVar.f;
        z4 = ajxVar.g;
        aVar.c = str2;
        z3 = z4;
        i = -1;
        z5 = z;
        str = aVar.c;
        if (str != null) {
            boolean z11 = aVar.a;
            boolean z12 = aVar.b;
            int i8 = aVar.f;
            int i9 = aVar.g;
            int i10 = aVar.h;
            int i11 = aVar.i;
            int i12 = ygx.f;
            zix zixVar4 = new zix(z11, z12, "android-app://androidx.navigation/".concat(str).hashCode(), z5, z3, i8, i9, i10, i11);
            zixVar4.j = str;
            return zixVar4;
        }
        ygpVar = aVar.d;
        if (ygpVar != null) {
            zix zixVar5 = new zix(aVar.a, aVar.b, w060.b(ue80.b(ygpVar)), z5, z3, aVar.f, aVar.g, aVar.h, aVar.i);
            zixVar5.k = ygpVar;
            return zixVar5;
        }
        obj = aVar.e;
        z6 = aVar.a;
        z7 = aVar.b;
        i2 = aVar.f;
        if (obj != null) {
            return new zix(z6, z7, i, z5, z3, i2, aVar.g, aVar.h, aVar.i);
        }
        zix zixVar6 = new zix(z6, z7, w060.b(ue80.b(jq40.a(obj.getClass()))), z5, z3, i2, aVar.g, aVar.h, aVar.i);
        zixVar6.l = obj;
        return zixVar6;
    }
}
