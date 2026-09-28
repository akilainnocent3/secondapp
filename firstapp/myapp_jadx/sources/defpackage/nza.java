package defpackage;

import androidx.compose.ui.d;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
public final class nza extends d.c implements yma, mrr {
    public i3z D;
    public final wr70 E;
    public boolean F;
    public qa5 G;
    public urr I;
    public boolean J;
    public boolean K;
    public boolean M;
    public final ha5 H = new ha5();
    public long L = 0;

    public static final class a {
        public final oa5.a.C0922a a;
        public final bc6 b;

        public a(oa5.a.C0922a c0922a, bc6 bc6Var) {
            this.a = c0922a;
            this.b = bc6Var;
        }

        public final String toString() {
            bc6 bc6Var = this.b;
            t5b t5bVar = (t5b) bc6Var.e.get(t5b.b);
            String str = t5bVar != null ? t5bVar.a : null;
            StringBuilder sb = new StringBuilder("Request@");
            String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            string.getClass();
            sb.append(string);
            sb.append(str != null ? tug.a("[", str, "](") : "(");
            sb.append("currentBounds()=");
            sb.append(this.a.invoke());
            sb.append(", continuation=");
            sb.append(bc6Var);
            sb.append(')');
            return sb.toString();
        }
    }

    @c0d(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {215}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ kjh0 d;
        public final /* synthetic */ qa5 e;

        @c0d(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {221}, m = "invokeSuspend")
        public static final class a extends tje0 implements Function2<olx, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ kjh0 c;
            public final /* synthetic */ nza d;
            public final /* synthetic */ qa5 e;
            public final /* synthetic */ c9p f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kjh0 kjh0Var, nza nzaVar, qa5 qa5Var, c9p c9pVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = kjh0Var;
                this.d = nzaVar;
                this.e = qa5Var;
                this.f = c9pVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, this.d, this.e, this.f, v1bVar);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(olx olxVar, v1b<? super Unit> v1bVar) {
                return ((a) create(olxVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [oza] */
            /* JADX WARN: Type inference failed for: r8v3, types: [pza] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    final olx olxVar = (olx) this.b;
                    final nza nzaVar = this.d;
                    final qa5 qa5Var = this.e;
                    float fP2 = nzaVar.p2(qa5Var);
                    final kjh0 kjh0Var = this.c;
                    kjh0Var.e = fP2;
                    final c9p c9pVar = this.f;
                    ?? r4 = new Function1(kjh0Var, c9pVar, olxVar) { // from class: oza
                        public final /* synthetic */ c9p b;
                        public final /* synthetic */ olx c;

                        {
                            this.b = c9pVar;
                            this.c = olxVar;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            float fFloatValue = ((Float) obj2).floatValue();
                            nza nzaVar2 = this.a;
                            float f = nzaVar2.F ? 1.0f : -1.0f;
                            wr70 wr70Var = nzaVar2.E;
                            float fG = wr70Var.g(wr70Var.e(this.c.a(wr70Var.e(wr70Var.h(f * fFloatValue))))) * f;
                            if (Math.abs(fG) < Math.abs(fFloatValue)) {
                                CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                                cancellationException.initCause(null);
                                this.b.cancel(cancellationException);
                            }
                            return Unit.a;
                        }
                    };
                    ?? r8 = new Function0() { // from class: pza
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            lk40 lk40VarQ2;
                            nza nzaVar2 = nzaVar;
                            ha5 ha5Var = nzaVar2.H;
                            while (true) {
                                duw<nza.a> duwVar = ha5Var.a;
                                int i2 = duwVar.c;
                                if (i2 == 0) {
                                    break;
                                }
                                if (i2 == 0) {
                                    ibh0.a("MutableVector is empty.");
                                    return null;
                                }
                                lk40 lk40Var = (lk40) duwVar.a[i2 - 1].a.invoke();
                                if (!(lk40Var == null ? true : nzaVar2.r2(lk40Var, nzaVar2.L))) {
                                    break;
                                }
                                duw<nza.a> duwVar2 = ha5Var.a;
                                bc6 bc6Var = duwVar2.k(duwVar2.c - 1).b;
                                Unit unit = Unit.a;
                                zi50.a aVar = zi50.b;
                                bc6Var.resumeWith(unit);
                            }
                            if (nzaVar2.J && (lk40VarQ2 = nzaVar2.q2()) != null && nzaVar2.r2(lk40VarQ2, nzaVar2.L)) {
                                nzaVar2.J = false;
                            }
                            kjh0Var.e = nzaVar2.p2(qa5Var);
                            return Unit.a;
                        }
                    };
                    this.a = 1;
                    if (kjh0Var.a(r4, r8, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kjh0 kjh0Var, qa5 qa5Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.d = kjh0Var;
            this.e = qa5Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = nza.this.new b(this.d, this.e, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            nza nzaVar = nza.this;
            ha5 ha5Var = nzaVar.H;
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                try {
                    if (i == 0) {
                        uj50.b(obj);
                        c9p c9pVarF = i9p.f(((v5b) this.b).getCoroutineContext());
                        nzaVar.M = true;
                        wr70 wr70Var = nzaVar.E;
                        huw huwVar = huw.a;
                        a aVar = new a(this.d, nzaVar, this.e, c9pVarF, null);
                        this.a = 1;
                        if (wr70Var.f(huwVar, aVar, this) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    ha5Var.b();
                    nzaVar.M = false;
                    ha5Var.a(null);
                    nzaVar.J = false;
                    return Unit.a;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                nzaVar.M = false;
                ha5Var.a(null);
                nzaVar.J = false;
                throw th;
            }
        }
    }

    public nza(i3z i3zVar, wr70 wr70Var, boolean z, qa5 qa5Var) {
        this.D = i3zVar;
        this.E = wr70Var;
        this.F = z;
        this.G = qa5Var;
    }

    @Override // defpackage.mrr
    public final void M(long j) {
        int iH;
        lk40 lk40VarQ2;
        long j2 = this.L;
        this.L = j;
        int iOrdinal = this.D.ordinal();
        if (iOrdinal == 0) {
            iH = Intrinsics.h((int) (j & 4294967295L), (int) (4294967295L & j2));
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            iH = Intrinsics.h((int) (j >> 32), (int) (j2 >> 32));
        }
        if (iH >= 0 || this.M || this.J || (lk40VarQ2 = q2()) == null || !r2(lk40VarQ2, j2)) {
            return;
        }
        this.K = true;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    public final float p2(qa5 qa5Var) {
        float f;
        lk40 lk40Var;
        int iCompare;
        if (jxo.b(this.L, 0L)) {
            return 0.0f;
        }
        duw<a> duwVar = this.H.a;
        int i = duwVar.c - 1;
        a[] aVarArr = duwVar.a;
        if (i < aVarArr.length) {
            lk40Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                lk40 lk40Var2 = (lk40) aVarArr[i].a.invoke();
                if (lk40Var2 != null) {
                    long jD = lk40Var2.d();
                    long jD2 = kc6.d(this.L);
                    f = 0.0f;
                    int iOrdinal = this.D.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jD & 4294967295L)), Float.intBitsToFloat((int) (jD2 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            uhc.a();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jD2 >> 32)));
                    }
                    if (iCompare > 0) {
                        if (lk40Var != null) {
                            break;
                        }
                        lk40Var = lk40Var2;
                        break;
                    }
                    lk40Var = lk40Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            lk40Var = null;
        }
        if (lk40Var == null) {
            lk40 lk40VarQ2 = this.J ? q2() : null;
            if (lk40VarQ2 == null) {
                return f;
            }
            lk40Var = lk40VarQ2;
        }
        long jD3 = kc6.d(this.L);
        int iOrdinal2 = this.D.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = lk40Var.b;
            return qa5Var.a(f2, lk40Var.d - f2, Float.intBitsToFloat((int) (jD3 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = lk40Var.a;
            return qa5Var.a(f3, lk40Var.c - f3, Float.intBitsToFloat((int) (jD3 >> 32)));
        }
        uhc.a();
        return f;
    }

    public final lk40 q2() {
        if (this.C) {
            ywx ywxVarE = pkd.e(this);
            urr urrVar = this.I;
            if (urrVar != null) {
                if (!urrVar.e()) {
                    urrVar = null;
                }
                if (urrVar != null) {
                    return ywxVarE.P(urrVar, false);
                }
            }
        }
        return null;
    }

    public final boolean r2(lk40 lk40Var, long j) {
        long jT2 = t2(lk40Var, j);
        return Math.abs(Float.intBitsToFloat((int) (jT2 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jT2 & 4294967295L))) <= 0.5f;
    }

    public final void s2() {
        qa5 qa5Var = this.G;
        if (qa5Var == null) {
            qa5Var = (qa5) zma.a(this, sa5.a);
        }
        if (this.M) {
            zkn.c("launchAnimation called when previous animation was running");
        }
        qa5 qa5Var2 = this.G;
        if (qa5Var2 == null) {
            qa5Var2 = (qa5) zma.a(this, sa5.a);
        }
        qa5Var2.getClass();
        qa5.a.getClass();
        ej5.c(d2(), null, a6b.d, new b(new kjh0(qa5.a.b), qa5Var, null), 1);
    }

    public final long t2(lk40 lk40Var, long j) {
        long jD = kc6.d(j);
        int iOrdinal = this.D.ordinal();
        if (iOrdinal == 0) {
            qa5 qa5Var = this.G;
            if (qa5Var == null) {
                qa5Var = (qa5) zma.a(this, sa5.a);
            }
            float f = lk40Var.b;
            float fA = qa5Var.a(f, lk40Var.d - f, Float.intBitsToFloat((int) (jD & 4294967295L)));
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        }
        if (iOrdinal != 1) {
            uhc.a();
            return 0L;
        }
        qa5 qa5Var2 = this.G;
        if (qa5Var2 == null) {
            qa5Var2 = (qa5) zma.a(this, sa5.a);
        }
        float f2 = lk40Var.a;
        return (((long) Float.floatToRawIntBits(qa5Var2.a(f2, lk40Var.c - f2, Float.intBitsToFloat((int) (jD >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
