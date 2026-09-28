package defpackage;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class y9f {
    public static final a a = new a(3, null);
    public static final b b = new b(3, null);

    @c0d(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements gaj<v5b, gly, v1b<? super Unit>, Object> {
        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, gly glyVar, v1b<? super Unit> v1bVar) {
            long j = glyVar.a;
            return new a(3, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Unit.a;
        }
    }

    @c0d(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class b extends tje0 implements gaj<v5b, Float, v1b<? super Unit>, Object> {
        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, Float f, v1b<? super Unit> v1bVar) {
            f.floatValue();
            return new b(3, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Unit.a;
        }
    }

    public static d a(d dVar, kcf kcfVar, i3z i3zVar, boolean z, psw pswVar, boolean z2, gaj gajVar, gaj gajVar2, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            pswVar = null;
        }
        return dVar.n(new DraggableElement(kcfVar, i3zVar, z4, pswVar, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? a : gajVar, gajVar2, (i & 128) != 0 ? false : z3));
    }

    public static final kcf b(Function1 function1, androidx.compose.runtime.a aVar) {
        ytw ytwVarC = m.c(function1, aVar);
        Object objY = aVar.y();
        if (objY == androidx.compose.runtime.a.C0041a.a) {
            xbd xbdVar = new xbd(new hp6(ytwVarC, 1));
            aVar.r(xbdVar);
            objY = xbdVar;
        }
        return (kcf) objY;
    }
}
