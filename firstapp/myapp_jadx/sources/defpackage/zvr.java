package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.m;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zvr implements fr70 {
    public static final uv60 w = jis.a(new vvr(), new uvr());
    public final pdd a;
    public boolean b;
    public gvr c;
    public final mvr d;
    public final ytw<gvr> e;
    public final qsw f;
    public float g;
    public final sfd h;
    public final boolean i;
    public y250 j;
    public final yvr k;
    public final rp1 l;
    public final LazyLayoutItemAnimator<hvr> m;
    public final jwr n;
    public final gyr o;
    public final xvr p;
    public final fyr q;
    public final ytw<Unit> r;
    public final ytw<Unit> s;
    public final ytw t;
    public final ytw u;
    public final iyr v;

    @c0d(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {475, 476}, m = "scroll")
    public static final class a extends x1b {
        public huw a;
        public tje0 b;
        public /* synthetic */ Object c;
        public int e;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return zvr.this.b(null, null, this);
        }
    }

    public zvr(final int i, int i2, pdd pddVar) {
        this.a = pddVar;
        this.d = new mvr(i, i2);
        this.e = m.a(dwr.a, epx.a);
        this.f = new qsw();
        this.h = new sfd(new svr(this, 0));
        this.i = true;
        this.k = new yvr(this);
        this.l = new rp1();
        this.m = new LazyLayoutItemAnimator<>();
        this.n = new jwr();
        this.o = new gyr(null, new Function1() { // from class: tvr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                dlx dlxVar = (dlx) obj;
                pdd pddVar2 = this.a.a;
                c5a0.e.getClass();
                c5a0 c5a0VarA = c5a0.a.a();
                c5a0.a.e(c5a0VarA, c5a0.a.b(c5a0VarA), c5a0VarA != null ? c5a0VarA.e() : null);
                pddVar2.getClass();
                int iB = dlxVar.b() == -1 ? 2 : dlxVar.b();
                for (int i3 = 0; i3 < iB; i3++) {
                    dlxVar.a(i + i3);
                }
                return Unit.a;
            }
        });
        this.p = new xvr(this);
        this.q = new fyr();
        this.r = aey.a();
        this.s = aey.a();
        Boolean bool = Boolean.FALSE;
        this.t = m.b(bool);
        this.u = m.b(bool);
        this.v = new iyr();
    }

    @Override // defpackage.fr70
    public final float a(float f) {
        return this.h.a(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r6.h.b(r7, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.fr70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.huw r7, kotlin.jvm.functions.Function2<? super defpackage.tp70, ? super defpackage.v1b<? super kotlin.Unit>, ? extends java.lang.Object> r8, defpackage.v1b<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof zvr.a
            if (r0 == 0) goto L13
            r0 = r9
            zvr$a r0 = (zvr.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            zvr$a r0 = new zvr$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.uj50.b(r9)
            goto L60
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L31:
            tje0 r7 = r0.b
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            huw r7 = r0.a
            defpackage.uj50.b(r9)
            goto L51
        L3c:
            defpackage.uj50.b(r9)
            r0.a = r7
            r9 = r8
            tje0 r9 = (defpackage.tje0) r9
            r0.b = r9
            r0.e = r5
            rp1 r9 = r6.l
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L51
            goto L5f
        L51:
            r0.a = r3
            r0.b = r3
            r0.e = r4
            sfd r6 = r6.h
            java.lang.Object r6 = r6.b(r7, r8, r0)
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvr.b(huw, kotlin.jvm.functions.Function2, v1b):java.lang.Object");
    }

    @Override // defpackage.fr70
    public final boolean c() {
        return this.h.c();
    }

    @Override // defpackage.fr70
    public final boolean d() {
        return ((Boolean) ((x5a0) this.u).getValue()).booleanValue();
    }

    @Override // defpackage.fr70
    public final boolean e() {
        return ((Boolean) ((x5a0) this.t).getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    public final void f(gvr gvrVar, boolean z, boolean z2) {
        Object obj;
        int i;
        List<hvr> list = gvrVar.m;
        int i2 = gvrVar.b;
        ivr ivrVar = gvrVar.a;
        this.o.f = list.size();
        if (!z && this.b) {
            this.c = gvrVar;
            return;
        }
        if (z) {
            this.b = true;
        }
        this.g -= gvrVar.d;
        ((x5a0) this.e).setValue(gvrVar);
        ((x5a0) this.u).setValue(Boolean.valueOf(((ivrVar != null ? ivrVar.a : 0) == 0 && i2 == 0) ? false : true));
        ((x5a0) this.t).setValue(Boolean.valueOf(gvrVar.c));
        mvr mvrVar = this.d;
        if (z2) {
            mvrVar.getClass();
            if (i2 < 0.0f) {
                zkn.c("scrollOffset should be non-negative");
            }
            ((u5a0) mvrVar.b).k(i2);
        } else {
            mvrVar.getClass();
            if (ivrVar != null) {
                hvr[] hvrVarArr = ivrVar.b;
                hvr hvrVar = hvrVarArr.length == 0 ? null : hvrVarArr[0];
                if (hvrVar != null) {
                    obj = hvrVar.b;
                } else {
                    obj = null;
                }
            } else {
                obj = null;
            }
            mvrVar.d = obj;
            if (mvrVar.c || gvrVar.p > 0) {
                mvrVar.c = true;
                if (i2 < 0.0f) {
                    zkn.c("scrollOffset should be non-negative (" + i2 + ')');
                }
                if (ivrVar != null) {
                    hvr[] hvrVarArr2 = ivrVar.b;
                    hvr hvrVar2 = hvrVarArr2.length != 0 ? hvrVarArr2[0] : null;
                    if (hvrVar2 != null) {
                        i = hvrVar2.a;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                mvrVar.a(i, i2);
            }
            if (this.i) {
                pdd pddVar = this.a;
                duw<gyr.b> duwVar = pddVar.b;
                int i3 = pddVar.a;
                boolean z3 = pddVar.c;
                if (i3 != -1 && !gvrVar.k().isEmpty() && i3 != pdd.b(gvrVar, z3)) {
                    pddVar.a = -1;
                    gyr.b[] bVarArr = duwVar.a;
                    int i4 = duwVar.c;
                    for (int i5 = 0; i5 < i4; i5++) {
                        bVarArr[i5].cancel();
                    }
                    duwVar.g();
                }
                int i6 = gvrVar.i();
                int i7 = pddVar.d;
                if (i7 != -1 && pddVar.e != 0.0f && i7 != i6 && !gvrVar.k().isEmpty()) {
                    int iB = pdd.b(gvrVar, pddVar.e < 0.0f);
                    int iA = pdd.a(gvrVar, pddVar.e < 0.0f);
                    if (iA >= 0 && iA < gvrVar.i() && iB != pddVar.a && iB >= 0) {
                        pddVar.a = iB;
                        duwVar.g();
                        duwVar.d(duwVar.c, this.p.a(iB));
                    }
                }
                pddVar.d = i6;
            }
        }
        if (z) {
            this.v.a(gvrVar.f, gvrVar.i, gvrVar.h);
        }
    }

    public final cvr g() {
        return (cvr) ((x5a0) this.e).getValue();
    }

    public zvr(int i, int i2) {
        this(i, i2, new pdd());
    }

    public zvr() {
        this(0, 0, new pdd());
    }
}
