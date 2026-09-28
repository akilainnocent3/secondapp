package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ju5 extends y52 {
    public frz<uyc, uyc> b;
    public final int c;
    public final Function0<Unit> d;
    public uyc e;

    public ju5(frz<uyc, uyc> frzVar, int i, boy boyVar, Function0<Unit> function0) {
        this.b = frzVar;
        this.c = i;
        this.d = function0;
        this.a = boyVar;
    }

    @Override // defpackage.y52
    public final void a() {
        this.e = null;
    }

    @Override // defpackage.y52
    public final l980 b(uyc uycVar) {
        frz<uyc, uyc> frzVar = this.b;
        if (frzVar != null) {
            if (Intrinsics.g(frzVar.a, frzVar.b)) {
                return l980.a;
            }
            if (Intrinsics.g(frzVar.a, uycVar)) {
                return l980.b;
            }
            if (Intrinsics.g(frzVar.b, uycVar)) {
                return l980.c;
            }
            if (n94.a(uycVar, frzVar.a, frzVar.b)) {
                return l980.d;
            }
        }
        return l980.e;
    }

    @Override // defpackage.y52
    public final boolean c(uyc uycVar) {
        uycVar.getClass();
        frz<uyc, uyc> frzVar = this.b;
        if (frzVar == null) {
            return false;
        }
        return n94.a(uycVar, frzVar.a, frzVar.b);
    }

    @Override // defpackage.y52
    public final void d(uyc uycVar) {
        uyc uycVar2 = this.e;
        if (uycVar2 == null) {
            this.e = uycVar;
            this.b = new frz<>(uycVar, uycVar);
            this.a.I();
            return;
        }
        if (uycVar2.equals(uycVar)) {
            return;
        }
        uyc uycVar3 = this.e;
        uycVar3.getClass();
        boolean zBefore = uycVar3.a.getTime().before(uycVar.a.getTime());
        uyc uycVar4 = this.e;
        frz<uyc, uyc> frzVar = zBefore ? new frz<>(uycVar4, uycVar) : new frz<>(uycVar, uycVar4);
        uyc uycVar5 = frzVar.a;
        uycVar5.getClass();
        uyc uycVar6 = frzVar.b;
        uycVar6.getClass();
        if (((uycVar6.a.getTimeInMillis() - uycVar5.a.getTimeInMillis()) / 86400000) + 1 <= this.c) {
            this.b = frzVar;
            this.e = null;
            this.a.I();
        } else {
            Function0<Unit> function0 = this.d;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }
}
