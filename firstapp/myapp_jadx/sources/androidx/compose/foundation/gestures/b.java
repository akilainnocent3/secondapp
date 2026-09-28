package androidx.compose.foundation.gestures;

import androidx.compose.ui.d;
import defpackage.aq40;
import defpackage.gly;
import defpackage.huw;
import defpackage.i3z;
import defpackage.ib5;
import defpackage.mmd;
import defpackage.o5w;
import defpackage.psw;
import defpackage.sq70;
import defpackage.thf0;
import defpackage.tp70;
import defpackage.tq70;
import defpackage.uj50;
import defpackage.vq70;
import defpackage.wr70;
import defpackage.x1b;
import defpackage.y5b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final sq70 a = new sq70();
    public static final C0038b b = new C0038b();
    public static final a c = new a();
    public static final c d = new c();

    public static final class a implements o5w {
        @Override // kotlin.coroutines.CoroutineContext
        public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return function2.invoke(r, this);
        }

        @Override // defpackage.o5w
        public final float g() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final <E extends CoroutineContext.Element> E get(CoroutineContext.a<E> aVar) {
            return (E) CoroutineContext.Element.a.b(this, aVar);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final CoroutineContext minusKey(CoroutineContext.a<?> aVar) {
            return CoroutineContext.Element.a.c(this, aVar);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public final CoroutineContext plus(CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(this, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.b$b, reason: collision with other inner class name */
    public static final class C0038b implements tp70 {
        @Override // defpackage.tp70
        public final float e(float f) {
            return f;
        }
    }

    public static final class c implements mmd {
        @Override // defpackage.mmd
        public final float getDensity() {
            return 1.0f;
        }

        @Override // defpackage.mmd
        public final float y1() {
            return 1.0f;
        }
    }

    public static d a(thf0 thf0Var, i3z i3zVar, boolean z, boolean z2, psw pswVar) {
        return new ScrollableElement(thf0Var, i3zVar, z, z2, pswVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(wr70 wr70Var, long j, x1b x1bVar) {
        tq70 tq70Var;
        aq40 aq40Var;
        wr70 wr70Var2;
        if (x1bVar instanceof tq70) {
            tq70Var = (tq70) x1bVar;
            int i = tq70Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tq70Var.d = i - Integer.MIN_VALUE;
            } else {
                tq70Var = new tq70(x1bVar);
            }
        } else {
            tq70Var = new tq70(x1bVar);
        }
        Object obj = tq70Var.c;
        y5b y5bVar = y5b.a;
        int i2 = tq70Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            aq40Var = new aq40();
            huw huwVar = huw.a;
            vq70 vq70Var = new vq70(wr70Var, j, aq40Var, null);
            tq70Var.a = wr70Var;
            tq70Var.b = aq40Var;
            tq70Var.d = 1;
            if (wr70Var.f(huwVar, vq70Var, tq70Var) == y5bVar) {
                return y5bVar;
            }
            wr70Var2 = wr70Var;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aq40 aq40Var2 = tq70Var.b;
            wr70 wr70Var3 = tq70Var.a;
            uj50.b(obj);
            aq40Var = aq40Var2;
            wr70Var2 = wr70Var3;
        }
        return new gly(wr70Var2.h(aq40Var.a));
    }
}
