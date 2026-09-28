package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.j;
import androidx.compose.runtime.l;
import androidx.compose.runtime.m;
import com.esotericsoftware.spine.android.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class sh4 {

    @c0d(c = "com.sportygames.bonuscup.presentation.ui.component.animation.BonusCupAnimationKt$BonusCupAnimations$2$1", f = "BonusCupAnimation.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ com.esotericsoftware.spine.android.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, com.esotericsoftware.spine.android.b bVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (this.a) {
                sh4.e(this.b, "Loading Screen", false);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.bonuscup.presentation.ui.component.animation.BonusCupAnimationKt$BonusCupAnimations$3$1", f = "BonusCupAnimation.kt", l = {95, 99}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public lh0 a;
        public int b;
        public int c;
        public int d;
        public final /* synthetic */ com.esotericsoftware.spine.android.b e;
        public final /* synthetic */ xsw f;
        public final /* synthetic */ ytw<lh0> i;
        public final /* synthetic */ ytw v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.esotericsoftware.spine.android.b bVar, xsw xswVar, ytw ytwVar, ytw ytwVar2, v1b v1bVar) {
            super(2, v1bVar);
            this.e = bVar;
            this.f = xswVar;
            this.i = ytwVar;
            this.v = ytwVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.e, this.f, this.i, this.v, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00da  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            if (defpackage.t4w.a(getContext()).P(r13, r12) == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
        
            if (defpackage.t4w.a(getContext()).P(r13, r12) == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00f5, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f3 -> B:41:0x00f6). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 265
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sh4.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.bonuscup.presentation.ui.component.animation.BonusCupAnimationKt$BonusCupAnimations$4$1", f = "BonusCupAnimation.kt", l = {128, 149}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public il4 a;
        public ph4 b;
        public int c;
        public final /* synthetic */ eku d;
        public final /* synthetic */ com.esotericsoftware.spine.android.b e;
        public final /* synthetic */ isw f;
        public final /* synthetic */ ytw<hl4> i;
        public final /* synthetic */ xsw v;
        public final /* synthetic */ ytw<xj4> w;
        public final /* synthetic */ ytw<String> y;

        public static final class a<T> implements Comparator {
            public final /* synthetic */ il4 a;

            public a(il4 il4Var) {
                this.a = il4Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                il4 il4Var = this.a;
                return Integer.valueOf(sh4.b((vj4) t2, il4Var.l)).compareTo(Integer.valueOf(sh4.b((vj4) t, il4Var.l)));
            }
        }

        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((vj4) t).a).compareTo(Long.valueOf(((vj4) t2).a));
            }
        }

        public static final class c<T> implements Comparator {
            public final /* synthetic */ a a;

            public c(a aVar) {
                this.a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = this.a.compare(t, t2);
                return iCompare != 0 ? iCompare : Long.valueOf(((vj4) t).a).compareTo(Long.valueOf(((vj4) t2).a));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(eku ekuVar, com.esotericsoftware.spine.android.b bVar, isw iswVar, ytw<hl4> ytwVar, xsw xswVar, ytw<xj4> ytwVar2, ytw<String> ytwVar3, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.d = ekuVar;
            this.e = bVar;
            this.f = iswVar;
            this.i = ytwVar;
            this.v = xswVar;
            this.w = ytwVar2;
            this.y = ytwVar3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:73:0x0143  */
        /* JADX WARN: Code duplicated, block: B:75:0x0147 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:77:0x014b  */
        /* JADX WARN: Code duplicated, block: B:81:0x015d  */
        /* JADX WARN: Code duplicated, block: B:85:0x0165  */
        /* JADX WARN: Code duplicated, block: B:89:0x016e  */
        /* JADX WARN: Code duplicated, block: B:94:0x0178  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            il4 il4Var;
            ytw<xj4> ytwVar;
            il4 il4Var2;
            String str;
            ph4 ph4Var;
            ph4 ph4Var2;
            boolean z;
            il4 il4Var3;
            String str2;
            String str3;
            xj4 xj4Var;
            y5b y5bVar = y5b.a;
            int i = this.c;
            ytw<String> ytwVar2 = this.y;
            ytw<xj4> ytwVar3 = this.w;
            String str4 = null;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    il4Var2 = this.a;
                    uj50.b(obj);
                    ytwVar = ytwVar3;
                    ytwVar.setValue(il4Var2.l);
                    ytwVar2.setValue(str4);
                    return Unit.a;
                }
                ph4Var2 = this.b;
                il4Var3 = this.a;
                uj50.b(obj);
                ytwVar = ytwVar3;
                str = null;
                il4Var = il4Var3;
                if (il4Var.a == hl4.c && (xj4Var = il4Var.l) != null) {
                    ytwVar.setValue(xj4Var);
                }
                if (ph4Var2 == null && (str3 = ph4Var2.c) != null && ph4Var2.d) {
                    str2 = str3;
                } else {
                    str2 = str;
                }
                ytwVar2.setValue(str2);
                return Unit.a;
            }
            uj50.b(obj);
            eku ekuVar = this.d;
            if (ekuVar == null || (il4Var = ekuVar.i) == null) {
                return Unit.a;
            }
            float f = il4Var.c;
            xj4 xj4Var2 = il4Var.l;
            hl4 hl4Var = il4Var.a;
            isw iswVar = this.f;
            float fJ = iswVar.j();
            ytw<hl4> ytwVar4 = this.i;
            xsw xswVar = this.v;
            if (f < fJ || (ytwVar4.getValue() == hl4.c && hl4Var == hl4.b)) {
                xswVar.K(-1L);
                ytwVar3.setValue(null);
                ytwVar2.setValue(null);
            }
            iswVar.A(f);
            ytwVar4.setValue(hl4Var);
            List<vj4> list = il4Var.k;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                ytw<xj4> ytwVar5 = ytwVar3;
                if (((vj4) obj2).a > xswVar.u()) {
                    arrayList.add(obj2);
                }
                ytwVar3 = ytwVar5;
            }
            ytwVar = ytwVar3;
            List listR0 = CollectionsKt.r0(arrayList, new b());
            boolean zIsEmpty = listR0.isEmpty();
            com.esotericsoftware.spine.android.b bVar = this.e;
            if (zIsEmpty) {
                int iOrdinal = hl4Var.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return null;
                    }
                    if (xj4Var2 != null && xj4Var2 != ytwVar.getValue()) {
                        str4 = null;
                        ph4 ph4Var3 = new ph4("game over", null, false, true);
                        this.a = il4Var;
                        this.c = 2;
                        if (sh4.d(bVar, ph4Var3, true, this) != y5bVar) {
                            il4Var2 = il4Var;
                            ytwVar.setValue(il4Var2.l);
                            ytwVar2.setValue(str4);
                        }
                    }
                }
                return Unit.a;
            }
            Iterator it = listR0.iterator();
            if (!it.hasNext()) {
                lrh0.a();
                return null;
            }
            str = null;
            long j = ((vj4) it.next()).a;
            while (it.hasNext()) {
                y5b y5bVar2 = y5bVar;
                long j2 = ((vj4) it.next()).a;
                if (j < j2) {
                    j = j2;
                }
                y5bVar = y5bVar2;
            }
            y5b y5bVar3 = y5bVar;
            xswVar.K(j);
            switch (((vj4) CollectionsKt.T(CollectionsKt.r0(listR0, new c(new a(il4Var))))).b.ordinal()) {
                case 0:
                case 1:
                    ph4Var = new ph4("Ball catch", xj4Var2 == null ? null : "game over", false, xj4Var2 == null);
                    ph4Var2 = ph4Var;
                    if (ph4Var2 != null) {
                        if (hl4Var == hl4.c || xj4Var2 == null) {
                            z = false;
                        } else {
                            z = true;
                        }
                        this.a = il4Var;
                        this.b = ph4Var2;
                        this.c = 1;
                        y5bVar = y5bVar3;
                        if (sh4.d(bVar, ph4Var2, z, this) != y5bVar) {
                            il4Var3 = il4Var;
                            il4Var = il4Var3;
                        }
                    }
                    if (il4Var.a == hl4.c) {
                        ytwVar.setValue(xj4Var);
                    }
                    if (ph4Var2 == null) {
                        str2 = str;
                    } else {
                        str2 = str;
                    }
                    ytwVar2.setValue(str2);
                    return Unit.a;
                case 2:
                case 3:
                case 4:
                case 7:
                    ph4Var2 = null;
                    if (ph4Var2 != null) {
                        if (hl4Var == hl4.c) {
                            z = false;
                        } else {
                            z = false;
                        }
                        this.a = il4Var;
                        this.b = ph4Var2;
                        this.c = 1;
                        y5bVar = y5bVar3;
                        if (sh4.d(bVar, ph4Var2, z, this) != y5bVar) {
                            il4Var3 = il4Var;
                            il4Var = il4Var3;
                        }
                    }
                    if (il4Var.a == hl4.c) {
                        ytwVar.setValue(xj4Var);
                    }
                    if (ph4Var2 == null) {
                        str2 = str;
                    } else {
                        str2 = str;
                    }
                    ytwVar2.setValue(str2);
                    return Unit.a;
                case 5:
                    ph4Var = new ph4("ball missed", xj4Var2 == null ? null : "game over", false, xj4Var2 == null);
                    ph4Var2 = ph4Var;
                    if (ph4Var2 != null) {
                        if (hl4Var == hl4.c) {
                            z = false;
                        } else {
                            z = false;
                        }
                        this.a = il4Var;
                        this.b = ph4Var2;
                        this.c = 1;
                        y5bVar = y5bVar3;
                        if (sh4.d(bVar, ph4Var2, z, this) != y5bVar) {
                            il4Var3 = il4Var;
                            il4Var = il4Var3;
                        }
                    }
                    if (il4Var.a == hl4.c) {
                        ytwVar.setValue(xj4Var);
                    }
                    if (ph4Var2 == null) {
                        str2 = str;
                    } else {
                        str2 = str;
                    }
                    ytwVar2.setValue(str2);
                    return Unit.a;
                case 6:
                    ph4Var = new ph4("Yellow card", xj4Var2 == null ? null : "game over", false, xj4Var2 == null);
                    ph4Var2 = ph4Var;
                    if (ph4Var2 != null) {
                        if (hl4Var == hl4.c) {
                            z = false;
                        } else {
                            z = false;
                        }
                        this.a = il4Var;
                        this.b = ph4Var2;
                        this.c = 1;
                        y5bVar = y5bVar3;
                        if (sh4.d(bVar, ph4Var2, z, this) != y5bVar) {
                            il4Var3 = il4Var;
                            il4Var = il4Var3;
                        }
                    }
                    if (il4Var.a == hl4.c) {
                        ytwVar.setValue(xj4Var);
                    }
                    if (ph4Var2 == null) {
                        str2 = str;
                    } else {
                        str2 = str;
                    }
                    ytwVar2.setValue(str2);
                    return Unit.a;
                default:
                    uhc.a();
                    return null;
            }
            return y5bVar;
        }
    }

    public static final class e implements tse {
        public final /* synthetic */ com.esotericsoftware.spine.android.b a;
        public final /* synthetic */ a b;

        public e(com.esotericsoftware.spine.android.b bVar, a aVar) {
            this.a = bVar;
            this.b = aVar;
        }

        @Override // defpackage.tse
        public final void dispose() {
            f5a0<zi0.b> f5a0Var = this.a.a().d;
            f5a0Var.k();
            zi0.b[] bVarArr = f5a0Var.a;
            int i = f5a0Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (bVarArr[i2] == this.b) {
                    f5a0Var.e(i2);
                    return;
                }
            }
        }
    }

    public static final void a(final Function0<? extends com.esotericsoftware.spine.android.b> function0, final pp4 pp4Var, final Function0<Unit> function1, final Function0<Unit> function2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z;
        androidx.compose.runtime.b bVarA = yoh0.a(function0, function1, function2, aVar, 812379338);
        if ((i & 6) == 0) {
            i2 = (bVarA.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.M(pp4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarA.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarA.A(function2) ? 2048 : 1024;
        }
        if (bVarA.q(i2 & 1, (i2 & 1171) != 1170)) {
            final com.esotericsoftware.spine.android.b bVarInvoke = function0.invoke();
            ytw ytwVarC = m.c(function1, bVarA);
            final ytw ytwVarC2 = m.c(function2, bVarA);
            Object objY = bVarA.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = l.a(-1L);
                bVarA.r(objY);
            }
            xsw xswVar = (xsw) objY;
            Object objY2 = bVarA.y();
            if (objY2 == c0042a) {
                objY2 = m.b(null);
                bVarA.r(objY2);
            }
            ytw ytwVar = (ytw) objY2;
            Object objY3 = bVarA.y();
            if (objY3 == c0042a) {
                objY3 = m.b(null);
                bVarA.r(objY3);
            }
            ytw ytwVar2 = (ytw) objY3;
            Object objY4 = bVarA.y();
            if (objY4 == c0042a) {
                objY4 = j.a(0.0f);
                bVarA.r(objY4);
            }
            isw iswVar = (isw) objY4;
            Object objY5 = bVarA.y();
            if (objY5 == c0042a) {
                objY5 = m.b(null);
                bVarA.r(objY5);
            }
            ytw ytwVar3 = (ytw) objY5;
            Object objY6 = bVarA.y();
            if (objY6 == c0042a) {
                objY6 = l.a(-1L);
                bVarA.r(objY6);
            }
            final xsw xswVar2 = (xsw) objY6;
            Object objY7 = bVarA.y();
            if (objY7 == c0042a) {
                objY7 = m.b(null);
                bVarA.r(objY7);
            }
            final ytw ytwVar4 = (ytw) objY7;
            if (bVarInvoke.c != null) {
                bVarA.N(-546660387);
                eku ekuVar = pp4Var instanceof eku ? (eku) pp4Var : null;
                boolean z2 = ekuVar != null && ekuVar.a;
                boolean zM = bVarA.M(ytwVarC2) | bVarA.A(bVarInvoke);
                Object objY8 = bVarA.y();
                if (zM || objY8 == c0042a) {
                    objY8 = new Function1() { // from class: qh4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((use) obj).getClass();
                            sh4.a aVar2 = new sh4.a(ytwVar4, ytwVarC2, xswVar2);
                            b bVar = bVarInvoke;
                            bVar.a().b(aVar2);
                            return new sh4.e(bVar, aVar2);
                        }
                    };
                    bVarA.r(objY8);
                }
                xvf.c(bVarInvoke, (Function1) objY8, bVarA);
                Boolean boolValueOf = Boolean.valueOf(z2);
                boolean zB = bVarA.b(z2) | bVarA.A(bVarInvoke);
                Object objY9 = bVarA.y();
                if (zB || objY9 == c0042a) {
                    objY9 = new b(z2, bVarInvoke, null);
                    bVarA.r(objY9);
                }
                xvf.g(bVarInvoke, boolValueOf, (Function2) objY9, bVarA);
                Long lValueOf = Long.valueOf(xswVar2.u());
                boolean zA = bVarA.A(bVarInvoke) | bVarA.M(ytwVarC);
                Object objY10 = bVarA.y();
                if (zA || objY10 == c0042a) {
                    c cVar = new c(bVarInvoke, xswVar2, ytwVar4, ytwVarC, null);
                    bVarA.r(cVar);
                    objY10 = cVar;
                }
                xvf.e(bVarA, lValueOf, (Function2) objY10);
                boolean zM2 = bVarA.M(ekuVar) | bVarA.A(bVarInvoke);
                Object objY11 = bVarA.y();
                if (zM2 || objY11 == c0042a) {
                    d dVar = new d(ekuVar, bVarInvoke, iswVar, ytwVar2, xswVar, ytwVar, ytwVar3, null);
                    bVarInvoke = bVarInvoke;
                    bVarA.r(dVar);
                    objY11 = dVar;
                }
                xvf.g(bVarInvoke, pp4Var, (Function2) objY11, bVarA);
                z = false;
            } else {
                z = false;
                bVarA.N(-549422952);
            }
            bVarA.X(z);
        } else {
            bVarA.G();
        }
        androidx.compose.runtime.e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rh4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sh4.a(function0, pp4Var, function1, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final int b(vj4 vj4Var, xj4 xj4Var) {
        switch (vj4Var.b.ordinal()) {
            case 0:
            case 1:
                return 50;
            case 2:
            case 3:
            case 4:
            case 7:
                return 0;
            case 5:
                return 30;
            case 6:
                return xj4Var == xj4.b ? 90 : 60;
            default:
                uhc.a();
                return 0;
        }
    }

    public static final void c(com.esotericsoftware.spine.android.b bVar, ph4 ph4Var) {
        String str;
        if (!e(bVar, ph4Var.a, ph4Var.b) || (str = ph4Var.c) == null) {
            return;
        }
        boolean z = ph4Var.d;
        if (StringsKt.U(str)) {
            return;
        }
        try {
            zi50.a aVar = zi50.b;
            bVar.a().a(0, str, z);
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (defpackage.hkd.b(600, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (defpackage.hkd.b(600, r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.esotericsoftware.spine.android.b r9, defpackage.ph4 r10, boolean r11, defpackage.x1b r12) {
        /*
            boolean r0 = r12 instanceof defpackage.vh4
            if (r0 == 0) goto L13
            r0 = r12
            vh4 r0 = (defpackage.vh4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vh4 r0 = new vh4
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 2
            java.lang.String r4 = "game over"
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2f
            com.esotericsoftware.spine.android.b r9 = r0.a
            defpackage.uj50.b(r12)
            goto L82
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r6
        L35:
            ph4 r10 = r0.b
            com.esotericsoftware.spine.android.b r9 = r0.a
            defpackage.uj50.b(r12)
            goto L5f
        L3d:
            defpackage.uj50.b(r12)
            if (r11 != 0) goto L48
            c(r9, r10)
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L48:
            java.lang.String r11 = r10.a
            boolean r11 = kotlin.jvm.internal.Intrinsics.g(r11, r4)
            r7 = 600(0x258, double:2.964E-321)
            if (r11 == 0) goto L63
            r0.a = r9
            r0.b = r10
            r0.d = r5
            java.lang.Object r11 = defpackage.hkd.b(r7, r0)
            if (r11 != r1) goto L5f
            goto L81
        L5f:
            c(r9, r10)
            goto L8a
        L63:
            java.lang.String r11 = r10.c
            boolean r11 = kotlin.jvm.internal.Intrinsics.g(r11, r4)
            if (r11 == 0) goto L87
            java.lang.String r11 = r10.a
            boolean r10 = r10.b
            r11.getClass()
            e(r9, r11, r10)
            r0.a = r9
            r0.b = r6
            r0.d = r3
            java.lang.Object r10 = defpackage.hkd.b(r7, r0)
            if (r10 != r1) goto L82
        L81:
            return r1
        L82:
            r10 = 0
            e(r9, r4, r10)
            goto L8a
        L87:
            c(r9, r10)
        L8a:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh4.d(com.esotericsoftware.spine.android.b, ph4, boolean, x1b):java.lang.Object");
    }

    public static final boolean e(com.esotericsoftware.spine.android.b bVar, String str, boolean z) {
        Object bVar2;
        if (StringsKt.U(str)) {
            return false;
        }
        try {
            zi50.a aVar = zi50.b;
            bVar2 = bVar.a().m(0, str, z);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar2 = new zi50.b(th);
        }
        return !(bVar2 instanceof zi50.b);
    }

    public static final class a implements zi0.b {
        public final /* synthetic */ ytw<lh0> a;
        public final /* synthetic */ ytw b;
        public final /* synthetic */ xsw c;

        public a(ytw ytwVar, ytw ytwVar2, xsw xswVar) {
            this.a = ytwVar;
            this.b = ytwVar2;
            this.c = xswVar;
        }

        @Override // zi0.b
        public final void b(zi0.e eVar) {
            lh0 lh0Var = eVar.a;
            if (lh0Var != null && Intrinsics.g(lh0Var.a, "Loading Screen")) {
                this.a.setValue(lh0Var);
                ((Function0) this.b.getValue()).invoke();
                xsw xswVar = this.c;
                xswVar.K(xswVar.u() + 1);
            }
        }

        @Override // zi0.b
        public final void c(zi0.e eVar) {
        }

        @Override // zi0.b
        public final void a(zi0.e eVar, whg whgVar) {
        }
    }
}
