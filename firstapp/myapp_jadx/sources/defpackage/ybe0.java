package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ybe0 extends tkd implements s020, w3i, d5i {
    public Function0<Unit> F;
    public boolean G;
    public final yje0 H;

    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: ybe0$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {116, 144, 182}, m = "invokeSuspend")
        public static final class C1331a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
            public m020 b;
            public c020 c;
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ ybe0 f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1331a(ybe0 ybe0Var, v1b<? super C1331a> v1bVar) {
                super(2, v1bVar);
                this.f = ybe0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1331a c1331a = new C1331a(this.f, v1bVar);
                c1331a.e = obj;
                return c1331a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
                return ((C1331a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:60:0x0114  */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
            
                if (r9 == r1) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:143:0x0242, code lost:
            
                if (r4 == r1) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:144:0x0244, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
            
                if (r8 == r1) goto L144;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x0242 -> B:145:0x0245). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00c3 -> B:41:0x00c7). Please report as a decompilation issue!!! */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instruction units count: 641
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ybe0.a.C1331a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
            Object objB = dqi.b(u020Var, new C1331a(ybe0.this, null), v1bVar);
            return objB == y5b.a ? objB : Unit.a;
        }
    }

    public ybe0(Function0<Unit> function0) {
        this.F = function0;
        a aVar = new a();
        b020 b020Var = wje0.a;
        cke0 cke0Var = new cke0(null, null, null, aVar);
        p2(cke0Var);
        this.H = cke0Var;
    }

    @Override // defpackage.w3i
    public final void E1(j5i j5iVar) {
        this.G = j5iVar.a();
    }

    @Override // defpackage.s020
    public final long V0() {
        mmd mmdVar = pkd.f(this).N;
        androidx.compose.foundation.text.handwriting.a.a.getClass();
        int i = w3g0.b;
        return w3g0.a.a(mmdVar.y0(10.0f), mmdVar.y0(40.0f), mmdVar.y0(10.0f), mmdVar.y0(40.0f));
    }

    @Override // defpackage.s020
    public final void W(b020 b020Var, c020 c020Var, long j) {
        this.H.W(b020Var, c020Var, j);
    }

    @Override // defpackage.s020
    public final void n1() {
        this.H.n1();
    }
}
