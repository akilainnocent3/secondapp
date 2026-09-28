package androidx.compose.ui.input.pointer;

import androidx.compose.ui.d;
import defpackage.cke0;
import defpackage.p3w;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Lp3w;", "Lcke0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuspendPointerInputElement extends p3w<cke0> {
    public final Object b;
    public final Object c;
    public final Object[] d;
    public final PointerInputEventHandler e;

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.b = obj;
        this.c = obj2;
        this.d = objArr;
        this.e = pointerInputEventHandler;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new cke0(this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        cke0 cke0Var = (cke0) cVar;
        Object obj = cke0Var.D;
        Object obj2 = this.b;
        boolean z = !Intrinsics.g(obj, obj2);
        cke0Var.D = obj2;
        Object obj3 = cke0Var.E;
        Object obj4 = this.c;
        if (!Intrinsics.g(obj3, obj4)) {
            z = true;
        }
        cke0Var.E = obj4;
        Object[] objArr = cke0Var.F;
        Object[] objArr2 = this.d;
        if (objArr != null && objArr2 == null) {
            z = true;
        }
        if (objArr == null && objArr2 != null) {
            z = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z = true;
        }
        cke0Var.F = objArr2;
        Class<?> cls = cke0Var.G.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.e;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            cke0Var.O0();
        }
        cke0Var.G = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!Intrinsics.g(this.b, suspendPointerInputElement.b) || !Intrinsics.g(this.c, suspendPointerInputElement.c)) {
            return false;
        }
        Object[] objArr = suspendPointerInputElement.d;
        Object[] objArr2 = this.d;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.e == suspendPointerInputElement.e;
    }

    public final int hashCode() {
        Object obj = this.b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.c;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.d;
        return this.e.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }
}
