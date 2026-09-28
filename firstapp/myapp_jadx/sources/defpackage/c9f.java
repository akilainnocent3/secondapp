package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.protobuf.Reader;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c9f implements PointerInputEventHandler {
    public final /* synthetic */ h9f a;

    @c0d(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {543}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ u020 c;
        public final /* synthetic */ h9f d;
        public final /* synthetic */ z8f e;
        public final /* synthetic */ a9f f;
        public final /* synthetic */ asa i;
        public final /* synthetic */ bsa v;
        public final /* synthetic */ b9f w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u020 u020Var, h9f h9fVar, z8f z8fVar, a9f a9fVar, asa asaVar, bsa bsaVar, b9f b9fVar, v1b v1bVar) {
            super(2, v1bVar);
            this.c = u020Var;
            this.d = h9fVar;
            this.e = z8fVar;
            this.f = a9fVar;
            this.i = asaVar;
            this.v = bsaVar;
            this.w = b9fVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x005a  */
        /* JADX WARN: Code duplicated, block: B:29:0x0068  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            CancellationException cancellationException;
            v5b v5bVar;
            tb5 tb5Var;
            Object obj2 = y5b.a;
            int i = this.a;
            h9f h9fVar = this.d;
            if (i == 0) {
                uj50.b(obj);
                v5b v5bVar2 = (v5b) this.b;
                try {
                    u020 u020Var = this.c;
                    i3z i3zVar = h9fVar.F;
                    z8f z8fVar = this.e;
                    a9f a9fVar = this.f;
                    asa asaVar = this.i;
                    bsa bsaVar = this.v;
                    b9f b9fVar = this.w;
                    this.b = v5bVar2;
                    this.a = 1;
                    float f = y8f.a;
                    Object objB = dqi.b(u020Var, new m8f(bsaVar, new cq40(), i3zVar, z8fVar, b9fVar, asaVar, a9fVar, null), this);
                    if (objB != obj2) {
                        objB = Unit.a;
                    }
                    if (objB == obj2) {
                        return obj2;
                    }
                } catch (CancellationException e) {
                    cancellationException = e;
                    v5bVar = v5bVar2;
                    tb5Var = h9fVar.J;
                    if (tb5Var != null) {
                        tb5Var.c(v7f.a.a);
                    }
                    if (!w5b.e(v5bVar)) {
                        throw cancellationException;
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v5bVar = (v5b) this.b;
                try {
                    uj50.b(obj);
                } catch (CancellationException e2) {
                    cancellationException = e2;
                    tb5Var = h9fVar.J;
                    if (tb5Var != null) {
                        tb5Var.c(v7f.a.a);
                    }
                    if (!w5b.e(v5bVar)) {
                        throw cancellationException;
                    }
                }
            }
            return Unit.a;
        }
    }

    public c9f(h9f h9fVar) {
        this.a = h9fVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [z8f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a9f] */
    /* JADX WARN: Type inference failed for: r9v0, types: [b9f] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final u020 u020Var, v1b<? super Unit> v1bVar) {
        final jxh0 jxh0Var = new jxh0();
        final cq40 cq40Var = new cq40();
        final h9f h9fVar = this.a;
        cq40Var.a = pkd.e(h9fVar).w(0L);
        int i = 1;
        Object objD = w5b.d(new a(u020Var, h9fVar, new gaj() { // from class: z8f
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                m020 m020Var = (m020) obj;
                m020 m020Var2 = (m020) obj2;
                gly glyVar = (gly) obj3;
                h9f h9fVar2 = h9fVar;
                h9fVar2.M = 0L;
                if (h9fVar2.G.invoke(m020Var).booleanValue()) {
                    if (!h9fVar2.L) {
                        if (h9fVar2.J == null) {
                            h9fVar2.J = d77.b(Reader.READ_DONE, 6, null);
                        }
                        h9fVar2.L = true;
                        ej5.c(h9fVar2.d2(), null, null, new g9f(h9fVar2, null), 3);
                    }
                    mxh0.a(jxh0Var, m020Var, 0L);
                    long jE = gly.e(m020Var2.c, glyVar.a);
                    tb5 tb5Var = h9fVar2.J;
                    if (tb5Var != null) {
                        tb5Var.c(new v7f.c(jE));
                    }
                }
                return Unit.a;
            }
        }, new Function1() { // from class: a9f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                jxh0 jxh0Var2 = jxh0Var;
                mxh0.a(jxh0Var2, (m020) obj, 0L);
                float fG = u020Var.getViewConfiguration().g();
                long jA = jxh0Var2.a(fxh0.a(fG, fG));
                jxh0Var2.b();
                tb5 tb5Var = h9fVar.J;
                if (tb5Var != null) {
                    y9f.a aVar = y9f.a;
                    tb5Var.c(new v7f.d(fxh0.a(Float.isNaN(exh0.b(jA)) ? 0.0f : exh0.b(jA), Float.isNaN(exh0.c(jA)) ? 0.0f : exh0.c(jA))));
                }
                return Unit.a;
            }
        }, new asa(h9fVar, i), new bsa(h9fVar, i), new Function2() { // from class: b9f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                m020 m020Var = (m020) obj;
                gly glyVar = (gly) obj2;
                h9f h9fVar2 = h9fVar;
                long jW = pkd.e(h9fVar2).w(0L);
                cq40 cq40Var2 = cq40Var;
                if (!gly.c(jW, cq40Var2.a)) {
                    h9fVar2.M = gly.f(h9fVar2.M, gly.e(jW, cq40Var2.a));
                }
                cq40Var2.a = jW;
                mxh0.a(jxh0Var, m020Var, h9fVar2.M);
                tb5 tb5Var = h9fVar2.J;
                if (tb5Var != null) {
                    tb5Var.c(new v7f.b(glyVar.a));
                }
                return Unit.a;
            }
        }, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
