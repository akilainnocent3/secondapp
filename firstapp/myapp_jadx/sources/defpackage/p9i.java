package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p9i {
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(int i, Object obj, z7i z7iVar, t9i t9iVar, int i2) {
        Object[] objArr;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z = false;
        int i3 = 0;
        z = false;
        if ((i & 1) == 0 || Intrinsics.g(z7iVar.b(), t9iVar)) {
            objArr = false;
        } else {
            t9i t9iVar2 = t9i.i;
            if (t9iVar.compareTo(t9iVar2) < 0 || Intrinsics.h(z7iVar.b().a, t9iVar2.a) >= 0) {
                objArr = false;
            } else {
                objArr = true;
            }
        }
        Object[] objArr2 = ((i & 2) == 0 || i2 == z7iVar.c()) ? false : true;
        if (objArr2 != true && objArr != true) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int i4 = objArr != false ? t9iVar.a : z7iVar.b().a;
            if (objArr2 == false ? z7iVar.c() == 1 : i2 == 1) {
                z = true;
            }
            return v9h0.a((Typeface) obj, i4, z);
        }
        Object[] objArr3 = objArr2 == true && i2 == 1;
        if (objArr3 == true && objArr == true) {
            i3 = 3;
        } else if (objArr == true) {
            i3 = 1;
        } else if (objArr3 != false) {
            i3 = 2;
        }
        return Typeface.create((Typeface) obj, i3);
    }
}
