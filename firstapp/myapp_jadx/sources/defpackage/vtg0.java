package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class vtg0 {
    public static final qtg0 a = new qtg0();
    public static final ttr b = hwr.a(a1s.c, new rtg0());

    public static final class a implements tse {
        public final /* synthetic */ dtg0 a;
        public final /* synthetic */ dtg0 b;

        public a(dtg0 dtg0Var, dtg0 dtg0Var2) {
            this.a = dtg0Var;
            this.b = dtg0Var2;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.j.remove(this.b);
        }
    }

    @c0d(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2173}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public tuw a;
        public o b;
        public int c;
        public final /* synthetic */ o d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.d = oVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference failed for: r1v8, types: [S, java.lang.Object] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            o oVar;
            tuw tuwVar;
            y5b y5bVar = y5b.a;
            int i = this.c;
            if (i == 0) {
                uj50.b(obj);
                o oVar2 = this.d;
                u480 u480Var = (u480) oVar2;
                u480Var.getClass();
                ((r6a0) vtg0.b.getValue()).d(u480Var, vtg0.a, u480Var.g);
                tuw tuwVar2 = u480Var.j;
                this.a = tuwVar2;
                this.b = oVar2;
                this.c = 1;
                if (tuwVar2.d(this) == y5bVar) {
                    return y5bVar;
                }
                oVar = oVar2;
                tuwVar = tuwVar2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oVar = this.b;
                tuwVar = this.a;
                uj50.b(obj);
            }
            try {
                ((u480) oVar).d = ((x5a0) ((u480) oVar).b).getValue();
                bc6 bc6Var = ((u480) oVar).i;
                if (bc6Var != null) {
                    zi50.a aVar = zi50.b;
                    bc6Var.resumeWith(((x5a0) ((u480) oVar).b).getValue());
                }
                ((u480) oVar).i = null;
                Unit unit = Unit.a;
                return Unit.a;
            } finally {
                tuwVar.f(null);
            }
        }
    }

    public static final class c implements tse {
        public final /* synthetic */ dtg0 a;

        public c(dtg0 dtg0Var) {
            this.a = dtg0Var;
        }

        @Override // defpackage.tse
        public final void dispose() {
            dtg0 dtg0Var = this.a;
            dtg0Var.k();
            dtg0Var.a.f0();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d implements tse {
        public final /* synthetic */ dtg0 a;

        public d(dtg0 dtg0Var) {
            this.a = dtg0Var;
        }

        @Override // defpackage.tse
        public final void dispose() {
            dtg0 dtg0Var = this.a;
            dtg0Var.k();
            dtg0Var.a.f0();
        }
    }

    public static final <S, T, V extends mj0> void a(final dtg0<S> dtg0Var, final dtg0<S>.d<T, V> dVar, final T t, final T t2, final goh<T> gohVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(867041821);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dtg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(t) : bVarI.A(t) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(t2) : bVarI.A(t2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? bVarI.M(gohVar) : bVarI.A(gohVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (!bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            bVarI.G();
        } else if (dtg0Var.i()) {
            dVar.l(t, t2, gohVar);
        } else {
            dVar.m(t2, gohVar);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: utg0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    vtg0.a(dtg0Var, dVar, t, t2, gohVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final <S, T> dtg0<T> b(final dtg0<S> dtg0Var, T t, T t2, String str, androidx.compose.runtime.a aVar, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && aVar.M(dtg0Var)) || (i & 6) == 4;
        Object objY = aVar.y();
        Object obj = androidx.compose.runtime.a.C0041a.a;
        if (z2 || objY == obj) {
            objY = new dtg0(new cuw(t), dtg0Var, pr0.a(new StringBuilder(), dtg0Var.c, " > ", str));
            aVar.r(objY);
        }
        final dtg0<T> dtg0Var2 = (dtg0) objY;
        if ((i2 <= 4 || !aVar.M(dtg0Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean zM = aVar.M(dtg0Var2) | z;
        Object objY2 = aVar.y();
        if (zM || objY2 == obj) {
            objY2 = new Function1() { // from class: otg0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    dtg0 dtg0Var3 = dtg0Var;
                    SnapshotStateList<dtg0<?>> snapshotStateList = dtg0Var3.j;
                    dtg0<?> dtg0Var4 = dtg0Var2;
                    snapshotStateList.add(dtg0Var4);
                    return new vtg0.a(dtg0Var3, dtg0Var4);
                }
            };
            aVar.r(objY2);
        }
        xvf.c(dtg0Var2, (Function1) objY2, aVar);
        if (dtg0Var.i()) {
            dtg0Var2.m(t, t2);
            return dtg0Var2;
        }
        dtg0Var2.r(t2);
        ((x5a0) dtg0Var2.k).setValue(Boolean.FALSE);
        return dtg0Var2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final dtg0.a c(final dtg0 dtg0Var, g0h0 g0h0Var, String str, androidx.compose.runtime.a aVar, int i, int i2) {
        dtg0.a.C0505a c0505a;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && aVar.M(dtg0Var)) || (i & 6) == 4;
        Object objY = aVar.y();
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        if (z2 || objY == c0042a) {
            objY = new dtg0.a(g0h0Var, str);
            aVar.r(objY);
        }
        final dtg0.a aVar2 = (dtg0.a) objY;
        if ((i3 <= 4 || !aVar.M(dtg0Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean zA = aVar.A(aVar2) | z;
        Object objY2 = aVar.y();
        if (zA || objY2 == c0042a) {
            objY2 = new Function1() { // from class: ptg0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return new wtg0(dtg0Var, aVar2);
                }
            };
            aVar.r(objY2);
        }
        xvf.c(aVar2, (Function1) objY2, aVar);
        if (dtg0Var.i() && (c0505a = (dtg0.a.C0505a) ((x5a0) aVar2.b).getValue()) != null) {
            dtg0<S> dtg0Var2 = dtg0.this;
            c0505a.a.l((T) c0505a.c.invoke((Object) dtg0Var2.f().c()), (T) c0505a.c.invoke((Object) dtg0Var2.f().a()), (goh<T>) ((goh) c0505a.b.invoke(dtg0Var2.f())));
        }
        return aVar2;
    }

    public static final dtg0.d d(final dtg0 dtg0Var, Object obj, Object obj2, goh gohVar, f0h0 f0h0Var, androidx.compose.runtime.a aVar, int i) {
        boolean zM = aVar.M(dtg0Var);
        Object objY = aVar.y();
        Object obj3 = androidx.compose.runtime.a.C0041a.a;
        if (zM || objY == obj3) {
            c5a0.e.getClass();
            c5a0 c5a0VarA = c5a0.a.a();
            Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
            c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
            try {
                mj0 mj0Var = (mj0) f0h0Var.a().invoke(obj2);
                mj0Var.d();
                objY = new dtg0.d(obj, mj0Var, f0h0Var);
                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                aVar.r(objY);
            } catch (Throwable th) {
                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                throw th;
            }
        }
        final dtg0.d dVar = (dtg0.d) objY;
        a(dtg0Var, dVar, obj, obj2, gohVar, aVar, 0);
        boolean zM2 = aVar.M(dtg0Var) | aVar.M(dVar);
        Object objY2 = aVar.y();
        if (zM2 || objY2 == obj3) {
            objY2 = new Function1() { // from class: ttg0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    dtg0 dtg0Var2 = dtg0Var;
                    SnapshotStateList<dtg0<S>.d<?, ?>> snapshotStateList = dtg0Var2.i;
                    dtg0<S>.d<?, ?> dVar2 = dVar;
                    snapshotStateList.add(dVar2);
                    return new xtg0(dtg0Var2, dVar2);
                }
            };
            aVar.r(objY2);
        }
        xvf.c(dVar, (Function1) objY2, aVar);
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> dtg0<T> e(o oVar, String str, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        int i3 = (i & 14) ^ 6;
        int i4 = 1;
        boolean z = (i3 > 4 && aVar.M(oVar)) || (i & 6) == 4;
        Object objY = aVar.y();
        Object obj = androidx.compose.runtime.a.C0041a.a;
        if (z || objY == obj) {
            c5a0.e.getClass();
            c5a0 c5a0VarA = c5a0.a.a();
            Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
            c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
            try {
                Object dtg0Var = new dtg0(oVar, null, str);
                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                aVar.r(dtg0Var);
                objY = dtg0Var;
            } catch (Throwable th) {
                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                throw th;
            }
        }
        dtg0<T> dtg0Var2 = (dtg0<T>) ((dtg0) objY);
        if (oVar instanceof u480) {
            aVar.N(-1357588631);
            u480 u480Var = (u480) oVar;
            Object value = ((x5a0) u480Var.c).getValue();
            Object value2 = ((x5a0) u480Var.b).getValue();
            boolean z2 = (i3 > 4 && aVar.M(oVar)) || (i & 6) == 4;
            Object objY2 = aVar.y();
            if (z2 || objY2 == obj) {
                objY2 = new b(oVar, null);
                aVar.r(objY2);
            }
            xvf.g(value, value2, (Function2) objY2, aVar);
            aVar.H();
        } else {
            aVar.N(-1357127072);
            dtg0Var2.a(oVar.b0(), aVar, 0);
            aVar.H();
        }
        boolean zM = aVar.M(dtg0Var2);
        Object objY3 = aVar.y();
        if (zM || objY3 == obj) {
            objY3 = new u1w(dtg0Var2, i4);
            aVar.r(objY3);
        }
        xvf.c(dtg0Var2, (Function1) objY3, aVar);
        return dtg0Var2;
    }

    public static final <T> dtg0<T> f(T t, String str, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        Object objY = aVar.y();
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        if (objY == c0042a) {
            objY = new dtg0(new cuw(t), null, str);
            aVar.r(objY);
        }
        dtg0<T> dtg0Var = (dtg0) objY;
        dtg0Var.a(t, aVar, (i & 8) | 48 | (i & 14));
        Object objY2 = aVar.y();
        if (objY2 == c0042a) {
            objY2 = new pl40(dtg0Var, 1);
            aVar.r(objY2);
        }
        xvf.c(dtg0Var, (Function1) objY2, aVar);
        return dtg0Var;
    }
}
