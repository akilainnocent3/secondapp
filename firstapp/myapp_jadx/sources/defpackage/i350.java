package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class i350 {
    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(Context context, pnt pntVar, String str, String str2, String str3, String str4, x1b x1bVar) throws Throwable {
        f350 f350Var;
        String str5;
        String str6;
        Context context2;
        String str7;
        Object objD;
        Context context3;
        xmt xmtVar;
        String str8;
        Object objD2;
        if (x1bVar instanceof f350) {
            f350Var = (f350) x1bVar;
            int i = f350Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                f350Var.f = i - Integer.MIN_VALUE;
            } else {
                f350Var = new f350(x1bVar);
            }
        } else {
            f350Var = new f350(x1bVar);
        }
        Object objO = f350Var.e;
        y5b y5bVar = y5b.a;
        int i2 = f350Var.f;
        if (i2 == 0) {
            uj50.b(objO);
            yot<xmt> yotVarB = b(context, pntVar, str4, false);
            if (yotVarB == null) {
                efx.a(pntVar, "Unable to create parsing task for ", ".");
                return null;
            }
            f350Var.a = context;
            f350Var.b = str;
            str5 = str2;
            f350Var.c = str5;
            str6 = str3;
            f350Var.d = str6;
            f350Var.f = 1;
            bc6 bc6Var = new bc6(1, yzo.b(f350Var));
            bc6Var.q();
            yotVarB.b(new b350(bc6Var));
            yotVarB.a(new c350(bc6Var));
            objO = bc6Var.o();
            if (objO != y5bVar) {
                context2 = context;
                str7 = str;
            }
            return y5bVar;
        }
        if (i2 == 1) {
            String str9 = (String) f350Var.d;
            String str10 = f350Var.c;
            String str11 = f350Var.b;
            Context context4 = (Context) f350Var.a;
            uj50.b(objO);
            str5 = str10;
            str7 = str11;
            str6 = str9;
            context2 = context4;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xmt xmtVar2 = (xmt) f350Var.a;
                uj50.b(objO);
                return xmtVar2;
            }
            xmtVar = (xmt) f350Var.d;
            str8 = f350Var.c;
            str5 = f350Var.b;
            context3 = (Context) f350Var.a;
            uj50.b(objO);
        }
        f350Var.a = xmtVar;
        f350Var.b = null;
        f350Var.c = null;
        f350Var.d = null;
        f350Var.f = 3;
        if (xmtVar.f.isEmpty()) {
            objD2 = Unit.a;
        } else {
            pfd pfdVar = fse.a;
            Context context5 = context3;
            objD2 = ej5.d(odd.b, new d350(xmtVar, context5, str5, str8, null), f350Var);
            if (objD2 != y5bVar) {
                objD2 = Unit.a;
            }
        }
        if (objD2 != y5bVar) {
            return y5bVar;
        }
        return xmtVar;
        xmt xmtVar3 = (xmt) objO;
        f350Var.a = context2;
        f350Var.b = str5;
        f350Var.c = str6;
        f350Var.d = xmtVar3;
        f350Var.f = 2;
        if (xmtVar3.d.isEmpty()) {
            objD = Unit.a;
        } else {
            pfd pfdVar2 = fse.a;
            objD = ej5.d(odd.b, new e350(xmtVar3, context2, str7, null), f350Var);
            if (objD != y5bVar) {
                objD = Unit.a;
            }
        }
        if (objD != y5bVar) {
            context3 = context2;
            xmtVar = xmtVar3;
            str8 = str6;
            f350Var.a = xmtVar;
            f350Var.b = null;
            f350Var.c = null;
            f350Var.d = null;
            f350Var.f = 3;
            if (xmtVar.f.isEmpty()) {
                objD2 = Unit.a;
            } else {
                pfd pfdVar3 = fse.a;
                Context context6 = context3;
                objD2 = ej5.d(odd.b, new d350(xmtVar, context6, str5, str8, null), f350Var);
                if (objD2 != y5bVar) {
                    objD2 = Unit.a;
                }
            }
            if (objD2 != y5bVar) {
                return xmtVar;
            }
        }
        return y5bVar;
    }

    public static final yot<xmt> b(Context context, pnt pntVar, final String str, boolean z) throws FileNotFoundException {
        if (pntVar instanceof pnt.e) {
            return Intrinsics.g(str, "__LottieInternalDefaultCacheKey__") ? lnt.g(0, context, lnt.n(context, 0)) : lnt.g(0, context, str);
        }
        if (pntVar instanceof pnt.f) {
            return Intrinsics.g(str, "__LottieInternalDefaultCacheKey__") ? lnt.i(context, ((pnt.f) pntVar).a) : lnt.a(str, new zmt(context, ((pnt.f) pntVar).a, str), null);
        }
        if (pntVar instanceof pnt.c) {
            if (z) {
                return null;
            }
            new FileInputStream((String) null);
            Intrinsics.g(str, "__LottieInternalDefaultCacheKey__");
            c.k(null, "zip", false);
            throw null;
        }
        if (pntVar instanceof pnt.a) {
            if (Intrinsics.g(str, "__LottieInternalDefaultCacheKey__")) {
                return lnt.b(context, ((pnt.a) pntVar).a);
            }
            String str2 = ((pnt.a) pntVar).a;
            HashMap map = lnt.a;
            return lnt.a(str, new fnt(context.getApplicationContext(), str2, str), null);
        }
        if (pntVar instanceof pnt.d) {
            if (Intrinsics.g(str, "__LottieInternalDefaultCacheKey__")) {
                throw null;
            }
            return lnt.a(str, new ant(), null);
        }
        if (!(pntVar instanceof pnt.b)) {
            uhc.a();
            return null;
        }
        final InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(null);
        if (Intrinsics.g(str, "__LottieInternalDefaultCacheKey__")) {
            throw null;
        }
        HashMap map2 = lnt.a;
        final Context applicationContext = context.getApplicationContext();
        return lnt.a(str, new Callable() { // from class: knt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lnt.d(applicationContext, inputStreamOpenInputStream, str);
            }
        }, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ont c(pnt pntVar, a aVar, int i) throws FileNotFoundException {
        pntVar.getClass();
        aVar.x(-1248473602);
        g350 g350Var = new g350(3, null);
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        aVar.x(1388713953);
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && aVar.M(pntVar)) || (i & 6) == 4;
        Object objY = aVar.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (z || objY == c0042a) {
            objY = m.b(new ont());
            aVar.r(objY);
        }
        ytw ytwVar = (ytw) objY;
        aVar.L();
        aVar.x(1388714244);
        boolean zM = aVar.M("__LottieInternalDefaultCacheKey__") | ((i2 > 4 && aVar.M(pntVar)) || (i & 6) == 4);
        Object objY2 = aVar.y();
        if (zM || objY2 == c0042a) {
            objY2 = b(context, pntVar, "__LottieInternalDefaultCacheKey__", true);
            aVar.r(objY2);
        }
        aVar.L();
        xvf.g(pntVar, "__LottieInternalDefaultCacheKey__", new h350(g350Var, context, pntVar, ytwVar, null), aVar);
        ont ontVar = (ont) ytwVar.getValue();
        aVar.L();
        return ontVar;
    }
}
