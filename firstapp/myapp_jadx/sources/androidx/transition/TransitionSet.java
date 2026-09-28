package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bug0;
import defpackage.cug0;
import defpackage.g9h0;
import defpackage.hce0;
import defpackage.kni0;
import defpackage.mq0;
import defpackage.xbe0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class TransitionSet extends Transition {
    public ArrayList<Transition> W;
    public boolean X;
    public int Y;
    public boolean Z;
    public int a0;

    public class a extends d {
        public final /* synthetic */ Transition a;

        public a(Transition transition) {
            this.a = transition;
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public final void j(Transition transition) {
            this.a.E();
            transition.B(this);
        }
    }

    public class b extends d {
        public b() {
        }

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
        @Override // androidx.transition.d, androidx.transition.Transition.f
        public final void k(Transition transition) {
            TransitionSet transitionSet = TransitionSet.this;
            transitionSet.W.remove(transition);
            if (transitionSet.u()) {
                return;
            }
            transitionSet.y(transitionSet, Transition.g.c, false);
            transitionSet.I = true;
            transitionSet.y(transitionSet, Transition.g.b, false);
        }
    }

    public static class c extends d {
        public TransitionSet a;

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public final void g(Transition transition) {
            TransitionSet transitionSet = this.a;
            if (transitionSet.Z) {
                return;
            }
            transitionSet.N();
            transitionSet.Z = true;
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public final void j(Transition transition) {
            TransitionSet transitionSet = this.a;
            int i = transitionSet.Y - 1;
            transitionSet.Y = i;
            if (i == 0) {
                transitionSet.Z = false;
                transitionSet.m();
            }
            transition.B(this);
        }
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = new ArrayList<>();
        this.X = true;
        this.Z = false;
        this.a0 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xbe0.g);
        T(g9h0.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    public final void A() {
        this.P = 0L;
        b bVar = new b();
        for (int i = 0; i < this.W.size(); i++) {
            Transition transition = this.W.get(i);
            transition.a(bVar);
            transition.A();
            long j = transition.P;
            boolean z = this.X;
            long j2 = this.P;
            if (z) {
                this.P = Math.max(j2, j);
            } else {
                transition.R = j2;
                this.P = j2 + j;
            }
        }
    }

    @Override // androidx.transition.Transition
    public final Transition B(Transition.f fVar) {
        super.B(fVar);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void C(View view) {
        for (int i = 0; i < this.W.size(); i++) {
            this.W.get(i).C(view);
        }
        this.f.remove(view);
    }

    @Override // androidx.transition.Transition
    public final void D(View view) {
        super.D(view);
        int size = this.W.size();
        for (int i = 0; i < size; i++) {
            this.W.get(i).D(view);
        }
    }

    @Override // androidx.transition.Transition
    public final void E() {
        ArrayList<Transition> arrayList;
        if (this.W.isEmpty()) {
            N();
            m();
            return;
        }
        c cVar = new c();
        cVar.a = this;
        ArrayList<Transition> arrayList2 = this.W;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Transition transition = arrayList2.get(i2);
            i2++;
            transition.a(cVar);
        }
        this.Y = this.W.size();
        if (this.X) {
            ArrayList<Transition> arrayList3 = this.W;
            int size2 = arrayList3.size();
            while (i < size2) {
                Transition transition2 = arrayList3.get(i);
                i++;
                transition2.E();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.W.size();
            arrayList = this.W;
            if (i3 >= size3) {
                break;
            }
            arrayList.get(i3 - 1).a(new a(this.W.get(i3)));
            i3++;
        }
        Transition transition3 = arrayList.get(0);
        if (transition3 != null) {
            transition3.E();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    public final void F(long j, long j2) {
        long j3;
        long j4 = this.P;
        long j5 = 0;
        if (this.z != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.I = false;
            y(this, Transition.g.a, z);
        }
        if (!this.X) {
            int size = 1;
            while (true) {
                int size2 = this.W.size();
                ArrayList<Transition> arrayList = this.W;
                if (size >= size2) {
                    size = arrayList.size();
                    break;
                } else if (arrayList.get(size).R > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.W.size()) {
                        Transition transition = this.W.get(i);
                        long j6 = transition.R;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        transition.F(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    Transition transition2 = this.W.get(i);
                    long j8 = transition2.R;
                    long j9 = j - j8;
                    transition2.F(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.z != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.I = true;
                }
                y(this, Transition.g.b, z);
            }
        }
        for (int i2 = 0; i2 < this.W.size(); i2++) {
            this.W.get(i2).F(j, j2);
        }
        j3 = j5;
        if (this.z != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.I = true;
            }
            y(this, Transition.g.b, z);
        }
    }

    @Override // androidx.transition.Transition
    public final void I(Transition.c cVar) {
        this.N = cVar;
        this.a0 |= 8;
        int size = this.W.size();
        for (int i = 0; i < size; i++) {
            this.W.get(i).I(cVar);
        }
    }

    @Override // androidx.transition.Transition
    public final void K(PathMotion pathMotion) {
        super.K(pathMotion);
        this.a0 |= 4;
        if (this.W != null) {
            for (int i = 0; i < this.W.size(); i++) {
                this.W.get(i).K(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void L(kni0 kni0Var) {
        this.M = kni0Var;
        this.a0 |= 2;
        int size = this.W.size();
        for (int i = 0; i < size; i++) {
            this.W.get(i).L(kni0Var);
        }
    }

    @Override // androidx.transition.Transition
    public final void M(long j) {
        this.b = j;
    }

    @Override // androidx.transition.Transition
    public final String O(String str) {
        String strO = super.O(str);
        for (int i = 0; i < this.W.size(); i++) {
            StringBuilder sbB = mq0.b(strO, "\n");
            sbB.append(this.W.get(i).O(str.concat("  ")));
            strO = sbB.toString();
        }
        return strO;
    }

    public final void P(Transition transition) {
        this.W.add(transition);
        transition.z = this;
        long j = this.c;
        if (j >= 0) {
            transition.H(j);
        }
        if ((this.a0 & 1) != 0) {
            transition.J(this.d);
        }
        if ((this.a0 & 2) != 0) {
            transition.L(this.M);
        }
        if ((this.a0 & 4) != 0) {
            transition.K(this.O);
        }
        if ((this.a0 & 8) != 0) {
            transition.I(this.N);
        }
    }

    public final Transition Q(int i) {
        if (i < 0 || i >= this.W.size()) {
            return null;
        }
        return this.W.get(i);
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final void H(long j) {
        ArrayList<Transition> arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.W) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.W.get(i).H(j);
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J(TimeInterpolator timeInterpolator) {
        this.a0 |= 1;
        ArrayList<Transition> arrayList = this.W;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.W.get(i).J(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    public final void T(int i) {
        if (i == 0) {
            this.X = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(hce0.a(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.X = false;
        }
    }

    @Override // androidx.transition.Transition
    public final void b(View view) {
        for (int i = 0; i < this.W.size(); i++) {
            this.W.get(i).b(view);
        }
        this.f.add(view);
    }

    @Override // androidx.transition.Transition
    public final void cancel() {
        super.cancel();
        int size = this.W.size();
        for (int i = 0; i < size; i++) {
            this.W.get(i).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public final void d(bug0 bug0Var) {
        View view = bug0Var.b;
        if (x(view)) {
            ArrayList<Transition> arrayList = this.W;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Transition transition = arrayList.get(i);
                i++;
                Transition transition2 = transition;
                if (transition2.x(view)) {
                    transition2.d(bug0Var);
                    bug0Var.c.add(transition2);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void f(bug0 bug0Var) {
        super.f(bug0Var);
        int size = this.W.size();
        for (int i = 0; i < size; i++) {
            this.W.get(i).f(bug0Var);
        }
    }

    @Override // androidx.transition.Transition
    public final void g(bug0 bug0Var) {
        View view = bug0Var.b;
        if (x(view)) {
            ArrayList<Transition> arrayList = this.W;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Transition transition = arrayList.get(i);
                i++;
                Transition transition2 = transition;
                if (transition2.x(view)) {
                    transition2.g(bug0Var);
                    bug0Var.c.add(transition2);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: j */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.W = new ArrayList<>();
        int size = this.W.size();
        for (int i = 0; i < size; i++) {
            Transition transitionClone = this.W.get(i).clone();
            transitionSet.W.add(transitionClone);
            transitionClone.z = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public final void l(ViewGroup viewGroup, cug0 cug0Var, cug0 cug0Var2, ArrayList<bug0> arrayList, ArrayList<bug0> arrayList2) {
        long j = this.b;
        int size = this.W.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.W.get(i);
            if (j > 0 && (this.X || i == 0)) {
                long j2 = transition.b;
                if (j2 > 0) {
                    transition.M(j2 + j);
                } else {
                    transition.M(j);
                }
            }
            transition.l(viewGroup, cug0Var, cug0Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public final Transition n(View view) {
        throw null;
    }

    @Override // androidx.transition.Transition
    public final void o() {
        for (int i = 0; i < this.W.size(); i++) {
            this.W.get(i).o();
        }
        super.o();
    }

    @Override // androidx.transition.Transition
    public final boolean u() {
        for (int i = 0; i < this.W.size(); i++) {
            if (this.W.get(i).u()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        int size = this.W.size();
        for (int i = 0; i < size; i++) {
            if (!this.W.get(i).v()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    public final void z(View view) {
        super.z(view);
        int size = this.W.size();
        for (int i = 0; i < size; i++) {
            this.W.get(i).z(view);
        }
    }

    public TransitionSet() {
        this.W = new ArrayList<>();
        this.X = true;
        this.Z = false;
        this.a0 = 0;
    }
}
