package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: loaded from: classes.dex */
public final class wje0 {
    public static final b020 a = new b020(m2g.a, null);

    public static final d a(d dVar, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return dVar.n(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6));
    }

    public static final d b(d dVar, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        return dVar.n(new SuspendPointerInputElement(null, null, objArr, pointerInputEventHandler, 3));
    }
}
