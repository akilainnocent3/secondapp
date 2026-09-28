package defpackage;

import com.google.protobuf.Reader;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lfk0;", "Lj8i0;", "", "<init>", "()V", "game-refscall_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fk0 extends j8i0 {
    public boolean a;
    public final wwd0 b = xwd0.a(new rq30.b(0));
    public final b390 c;
    public final b390 d;
    public final t340 e;
    public Pair<String, ? extends cm8<Unit>> f;

    @c0d(c = "com.sportygames.refscall.presentation.ui.animation.AnimationViewModel", f = "AnimationViewModel.kt", l = {59, 65, 69}, m = "processInternalEvent", v = 1)
    public static final class a extends x1b {
        public xh0 a;
        public Iterable b;
        public Iterator c;
        public int d;
        public int e;
        public /* synthetic */ Object f;
        public int v;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.v |= Integer.MIN_VALUE;
            return fk0.this.y1(null, this);
        }
    }

    public fk0() {
        pb5 pb5Var = pb5.c;
        this.c = d390.b(0, Reader.READ_DONE, pb5Var, 1);
        b390 b390VarB = d390.b(0, 500, pb5Var, 1);
        this.d = b390VarB;
        this.e = e1i.a(b390VarB);
    }

    public final void x1(rh0 rh0Var) {
        cm8 cm8Var;
        if (rh0Var instanceof rh0.b) {
            this.b.setValue(((rh0.b) rh0Var).a);
            return;
        }
        if (!(rh0Var instanceof rh0.a)) {
            uhc.a();
            return;
        }
        Pair<String, ? extends cm8<Unit>> pair = this.f;
        if (pair != null) {
            if (!Intrinsics.g(pair.a, ((rh0.a) rh0Var).a)) {
                pair = null;
            }
            if (pair == null || (cm8Var = (cm8) pair.b) == null) {
                return;
            }
            cm8Var.G(Unit.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
    
        if (r3.emit(r14, r0) == r1) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y1(defpackage.xh0 r14, defpackage.v1b<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk0.y1(xh0, v1b):java.lang.Object");
    }
}
