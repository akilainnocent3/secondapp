package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class q0a0 implements PointerInputEventHandler {
    public final /* synthetic */ w0a0 a;

    @c0d(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements gaj<ip20, gly, v1b<? super Unit>, Object> {
        public /* synthetic */ long a;
        public final /* synthetic */ w0a0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w0a0 w0a0Var, v1b<? super a> v1bVar) {
            super(3, v1bVar);
            this.b = w0a0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(ip20 ip20Var, gly glyVar, v1b<? super Unit> v1bVar) {
            long j = glyVar.a;
            a aVar = new a(this.b, v1bVar);
            aVar.a = j;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            float fD;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            long j = this.a;
            w0a0 w0a0Var = this.b;
            if (w0a0Var.m == i3z.a) {
                fD = Float.intBitsToFloat((int) (j & 4294967295L));
            } else {
                fD = w0a0Var.j ? ((u5a0) w0a0Var.h).D() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32));
            }
            ((t5a0) w0a0Var.q).A(fD - ((t5a0) w0a0Var.p).j());
            return Unit.a;
        }
    }

    public q0a0(w0a0 w0a0Var) {
        this.a = w0a0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        final w0a0 w0a0Var = this.a;
        Object objD = u4f0.d(u020Var, new a(w0a0Var, null), new Function1() { // from class: p0a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                w0a0 w0a0Var2 = w0a0Var;
                w0a0Var2.a(0.0f);
                w0a0Var2.o.invoke();
                return Unit.a;
            }
        }, v1bVar, 3);
        return objD == y5b.a ? objD : Unit.a;
    }
}
