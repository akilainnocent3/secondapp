package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class qaa0 {
    public static final qaa0 a = new qaa0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.fragment.app.FragmentManager] */
    public static FragmentManager a(Context context, String str) {
        ?? bVar;
        FragmentManager supportFragmentManager;
        try {
            zi50.a aVar = zi50.b;
            Context contextB = dvi.b(context);
            e eVar = contextB instanceof e ? (e) contextB : null;
            if (eVar != null) {
                supportFragmentManager = eVar.getSupportFragmentManager();
            } else {
                bVar = 0;
            }
            if ((bVar != 0 ? bVar.H(str) : null) != null) {
                bVar = supportFragmentManager;
                bVar = supportFragmentManager;
                itf0.a aVar2 = itf0.a;
                aVar2.q(str);
                aVar2.a("a dialog is already on the screen", new Object[0]);
                bVar = 0;
            }
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        bVar = supportFragmentManager;
        bVar = supportFragmentManager;
        return (FragmentManager) (bVar instanceof zi50.b ? 0 : bVar);
    }

    public static void b(Context context) {
        context.getClass();
        FragmentManager fragmentManagerA = a(context, "SocialFollowExceedLimitDialog");
        if (fragmentManagerA == null || fragmentManagerA.K) {
            return;
        }
        u1k.a aVar = u1k.b;
        f8a0 f8a0Var = new f8a0(bq9.a);
        aVar.getClass();
        u1k.a.a(fragmentManagerA, f8a0Var);
    }

    public static void c(Context context, String str, Function1 function1) {
        context.getClass();
        FragmentManager fragmentManagerA = a(context, "MySocialCreationConfirmDialog");
        if (fragmentManagerA == null || fragmentManagerA.K) {
            return;
        }
        i0x i0xVar = new i0x();
        Bundle bundle = new Bundle();
        bundle.putString("arg_social_username", str);
        i0xVar.setArguments(bundle);
        i0xVar.f = function1;
        i0xVar.setCancelable(true);
        i0xVar.show(fragmentManagerA, "MySocialCreationConfirmDialog");
    }

    public static void d(Context context, String str, Function1 function1) {
        context.getClass();
        str.getClass();
        FragmentManager fragmentManagerA = a(context, "SocialUnfollowConfirmDialog");
        if (fragmentManagerA == null || fragmentManagerA.K) {
            return;
        }
        bja0 bja0Var = new bja0();
        Bundle bundle = new Bundle();
        bundle.putString("arg_social_username", str);
        bja0Var.setArguments(bundle);
        bja0Var.f = function1;
        bja0Var.setCancelable(true);
        bja0Var.show(fragmentManagerA, "SocialUnfollowConfirmDialog");
    }
}
