package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", l = {180}, m = "invokeSuspend")
public final class zb0 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xb0 b;
    public final /* synthetic */ bef0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb0(xb0 xb0Var, bef0 bef0Var, v1b<? super zb0> v1bVar) {
        super(1, v1bVar);
        this.b = xb0Var;
        this.c = bef0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new zb0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((zb0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [yb0] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ?? r7;
        fdf0 fdf0VarInvoke;
        final xb0 xb0Var = this.b;
        r6a0 r6a0Var = xb0Var.e;
        ?? r2 = xb0Var.a;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                final xb0.b bVar = new xb0.b();
                bef0 bef0Var = this.c;
                final fdf0 aVar = new xb0.a(bVar, new qb0(xb0Var, bef0Var), new rb0(xb0Var, bef0Var), r2);
                Function1<fdf0, fdf0> function1 = xb0Var.b;
                if (function1 != null && (fdf0VarInvoke = function1.invoke(aVar)) != null) {
                    aVar = fdf0VarInvoke;
                }
                Looper looperMyLooper = Looper.myLooper();
                Handler handler = r2.getHandler();
                if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                    yb0 yb0Var = xb0Var.i;
                    if (yb0Var == null) {
                        r7 = yb0Var;
                        ?? r8 = new Runnable() { // from class: yb0
                            @Override // java.lang.Runnable
                            public final void run() {
                                xb0 xb0Var2 = xb0Var;
                                ActionMode actionModeStartActionMode = xb0Var2.a.startActionMode(new hyh(aVar), 1);
                                Intrinsics.g(xb0Var2.h, actionModeStartActionMode);
                                if (actionModeStartActionMode == null) {
                                    bVar.close();
                                }
                            }
                        };
                        xb0Var.i = r8;
                        r7 = r8;
                    }
                    r7 = yb0Var;
                    r2.post(r7);
                } else {
                    ActionMode actionModeStartActionMode = r2.startActionMode(new hyh(aVar), 1);
                    if (actionModeStartActionMode == null) {
                        return Unit.a;
                    }
                    xb0Var.h = actionModeStartActionMode;
                }
                this.a = 1;
                Object objA = bVar.a.a(this);
                if (objA != y5bVar) {
                    objA = Unit.a;
                }
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            r6a0Var.a();
            ActionMode actionMode = xb0Var.h;
            if (actionMode != null) {
                actionMode.finish();
            }
            yb0 yb0Var2 = xb0Var.i;
            if (yb0Var2 != null) {
                r2.removeCallbacks(yb0Var2);
            }
            xb0Var.h = null;
            return Unit.a;
        } catch (Throwable th) {
            r6a0Var.a();
            ActionMode actionMode2 = xb0Var.h;
            if (actionMode2 != null) {
                actionMode2.finish();
            }
            yb0 yb0Var3 = xb0Var.i;
            if (yb0Var3 != null) {
                r2.removeCallbacks(yb0Var3);
            }
            xb0Var.h = null;
            throw th;
        }
    }
}
