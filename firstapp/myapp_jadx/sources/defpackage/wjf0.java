package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@fae
public final class wjf0 implements rk10 {
    public final View a;
    public final bmn b;
    public final bkf0 c;
    public boolean d;
    public Function1<? super List<? extends mof>, Unit> e;
    public Function1<? super acn, Unit> f;
    public ijf0 g;
    public bcn h;
    public final ArrayList i;
    public final ttr j;
    public Rect k;
    public final m5c l;
    public final duw<a> m;
    public vjf0 n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("StartInput", 0);
            a = aVar;
            a aVar2 = new a("StopInput", 1);
            b = aVar2;
            a aVar3 = new a("ShowKeyboard", 2);
            c = aVar3;
            a aVar4 = new a("HideKeyboard", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public static final class b extends qlr implements Function1<List<? extends mof>, Unit> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends mof> list) {
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function1<acn, Unit> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(acn acnVar) {
            int i = acnVar.a;
            return Unit.a;
        }
    }

    public wjf0(View view, AndroidComposeView androidComposeView) {
        bmn bmnVar = new bmn(view);
        bkf0 bkf0Var = new bkf0(Choreographer.getInstance());
        this.a = view;
        this.b = bmnVar;
        this.c = bkf0Var;
        this.e = zjf0.a;
        this.f = akf0.a;
        this.g = new ijf0("", ulf0.b, 4);
        this.h = bcn.g;
        this.i = new ArrayList();
        this.j = hwr.a(a1s.c, new xjf0(this));
        this.l = new m5c(androidComposeView, bmnVar);
        this.m = new duw<>(new a[16]);
    }

    @Override // defpackage.rk10
    public final void a() {
        i(a.a);
    }

    @Override // defpackage.rk10
    public final void b() {
        this.d = false;
        this.e = b.a;
        this.f = c.a;
        this.k = null;
        i(a.b);
    }

    @Override // defpackage.rk10
    public final void c(ijf0 ijf0Var, bcn bcnVar, vff0 vff0Var, uhi uhiVar) {
        this.d = true;
        this.g = ijf0Var;
        this.h = bcnVar;
        this.e = vff0Var;
        this.f = uhiVar;
        i(a.a);
    }

    @Override // defpackage.rk10
    public final void d(ijf0 ijf0Var, ijf0 ijf0Var2) {
        boolean z = (ulf0.b(this.g.b, ijf0Var2.b) && Intrinsics.g(this.g.c, ijf0Var2.c)) ? false : true;
        this.g = ijf0Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            hk40 hk40Var = (hk40) ((WeakReference) this.i.get(i)).get();
            if (hk40Var != null) {
                hk40Var.d = ijf0Var2;
            }
        }
        m5c m5cVar = this.l;
        synchronized (m5cVar.c) {
            m5cVar.j = null;
            m5cVar.l = null;
            m5cVar.k = null;
            m5cVar.m = k5c.a;
            m5cVar.n = null;
            m5cVar.o = null;
            Unit unit = Unit.a;
        }
        if (Intrinsics.g(ijf0Var, ijf0Var2)) {
            if (z) {
                bmn bmnVar = this.b;
                int iF = ulf0.f(ijf0Var2.b);
                int iE = ulf0.e(ijf0Var2.b);
                ulf0 ulf0Var = this.g.c;
                int iF2 = ulf0Var != null ? ulf0.f(ulf0Var.a) : -1;
                ulf0 ulf0Var2 = this.g.c;
                bmnVar.a(iF, iE, iF2, ulf0Var2 != null ? ulf0.e(ulf0Var2.a) : -1);
                return;
            }
            return;
        }
        if (ijf0Var != null && (!Intrinsics.g(ijf0Var.a.b, ijf0Var2.a.b) || (ulf0.b(ijf0Var.b, ijf0Var2.b) && !Intrinsics.g(ijf0Var.c, ijf0Var2.c)))) {
            bmn bmnVar2 = this.b;
            ((InputMethodManager) bmnVar2.b.getValue()).restartInput(bmnVar2.a);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            hk40 hk40Var2 = (hk40) ((WeakReference) this.i.get(i2)).get();
            if (hk40Var2 != null) {
                ijf0 ijf0Var3 = this.g;
                bmn bmnVar3 = this.b;
                if (hk40Var2.h) {
                    hk40Var2.d = ijf0Var3;
                    if (hk40Var2.f) {
                        ((InputMethodManager) bmnVar3.b.getValue()).updateExtractedText(bmnVar3.a, hk40Var2.e, lmn.a(ijf0Var3));
                    }
                    ulf0 ulf0Var3 = ijf0Var3.c;
                    long j = ijf0Var3.b;
                    int iF3 = ulf0Var3 != null ? ulf0.f(ulf0Var3.a) : -1;
                    ulf0 ulf0Var4 = ijf0Var3.c;
                    bmnVar3.a(ulf0.f(j), ulf0.e(j), iF3, ulf0Var4 != null ? ulf0.e(ulf0Var4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.rk10
    public final void e() {
        i(a.d);
    }

    @Override // defpackage.rk10
    @fae
    public final void f(lk40 lk40Var) {
        Rect rect;
        this.k = new Rect(ycv.b(lk40Var.a), ycv.b(lk40Var.b), ycv.b(lk40Var.c), ycv.b(lk40Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.rk10
    public final void g() {
        i(a.c);
    }

    @Override // defpackage.rk10
    public final void h(ijf0 ijf0Var, mly mlyVar, ukf0 ukf0Var, wff0 wff0Var, lk40 lk40Var, lk40 lk40Var2) {
        m5c m5cVar = this.l;
        synchronized (m5cVar.c) {
            try {
                m5cVar.j = ijf0Var;
                m5cVar.l = mlyVar;
                m5cVar.k = ukf0Var;
                m5cVar.m = wff0Var;
                m5cVar.n = lk40Var;
                m5cVar.o = lk40Var2;
                if (m5cVar.e || m5cVar.d) {
                    m5cVar.a();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Runnable, vjf0] */
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
    public final void i(a aVar) {
        this.m.b(aVar);
        if (this.n == null) {
            ?? r2 = new Runnable() { // from class: vjf0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.Boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    wjf0 wjf0Var = this.a;
                    bmn bmnVar = wjf0Var.b;
                    wjf0Var.n = null;
                    duw<wjf0.a> duwVar = wjf0Var.m;
                    View view = wjf0Var.a;
                    if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        duwVar.g();
                        return;
                    }
                    dq40 dq40Var = new dq40();
                    dq40 dq40Var2 = new dq40();
                    wjf0.a[] aVarArr = duwVar.a;
                    int i = duwVar.c;
                    for (int i2 = 0; i2 < i; i2++) {
                        wjf0.a aVar2 = aVarArr[i2];
                        int iOrdinal = aVar2.ordinal();
                        if (iOrdinal == 0) {
                            ?? r8 = Boolean.TRUE;
                            dq40Var.a = r8;
                            dq40Var2.a = r8;
                        } else if (iOrdinal == 1) {
                            ?? r9 = Boolean.FALSE;
                            dq40Var.a = r9;
                            dq40Var2.a = r9;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            uhc.a();
                            return;
                        } else if (!Intrinsics.g(dq40Var.a, Boolean.FALSE)) {
                            dq40Var2.a = Boolean.valueOf(aVar2 == wjf0.a.c);
                        }
                    }
                    duwVar.g();
                    if (Intrinsics.g(dq40Var.a, Boolean.TRUE)) {
                        ((InputMethodManager) bmnVar.b.getValue()).restartInput(bmnVar.a);
                    }
                    Boolean bool = (Boolean) dq40Var2.a;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            bmnVar.c.a.b();
                        } else {
                            bmnVar.c.a.a();
                        }
                    }
                    if (Intrinsics.g(dq40Var.a, Boolean.FALSE)) {
                        ((InputMethodManager) bmnVar.b.getValue()).restartInput(bmnVar.a);
                    }
                }
            };
            this.c.execute(r2);
            this.n = r2;
        }
    }
}
