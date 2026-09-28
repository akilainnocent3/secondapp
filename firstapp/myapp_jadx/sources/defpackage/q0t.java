package defpackage;

import com.sporty.android.core.model.config.Version;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class q0t {
    public static final q0t a = new q0t();

    public static boolean b(String str, String str2) {
        str2.getClass();
        if (str == null || StringsKt.U(str)) {
            return true;
        }
        Version version = new Version(str);
        Version version2 = new Version(str2);
        return version.isValid() && version2.isValid() && version2.compareTo(version) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, mgb0 mgb0Var, x1b x1bVar) {
        p0t p0tVar;
        boolean zIsLogin;
        Object userId;
        Character chJ;
        if (x1bVar instanceof p0t) {
            p0tVar = (p0t) x1bVar;
            int i = p0tVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                p0tVar.f = i - Integer.MIN_VALUE;
            } else {
                p0tVar = new p0t(this, x1bVar);
            }
        } else {
            p0tVar = new p0t(this, x1bVar);
        }
        Object obj = p0tVar.d;
        Object obj2 = y5b.a;
        int i2 = p0tVar.f;
        String strValueOf = null;
        boolean z = true;
        if (i2 == 0) {
            uj50.b(obj);
            zIsLogin = mgb0Var.isLogin();
            p0tVar.a = this;
            p0tVar.b = str;
            p0tVar.c = zIsLogin;
            p0tVar.f = 1;
            userId = mgb0Var.getUserId(p0tVar);
            if (userId == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z2 = p0tVar.c;
            str = p0tVar.b;
            q0t q0tVar = p0tVar.a;
            uj50.b(obj);
            zIsLogin = z2;
            this = q0tVar;
            userId = obj;
        }
        String str2 = (String) userId;
        this.getClass();
        if (str != null && !StringsKt.U(str)) {
            String string = StringsKt.t0(str).toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string.toLowerCase(locale);
            lowerCase.getClass();
            jhi0[] jhi0VarArr = jhi0.a;
            if (!lowerCase.equals("all")) {
                if (lowerCase.equals("login_user")) {
                    z = zIsLogin;
                } else if (!lowerCase.equals("non_login_user")) {
                    if (str2 != null && (chJ = wae0.J(str2)) != null) {
                        strValueOf = String.valueOf(chJ.charValue());
                    }
                    if (strValueOf == null) {
                        z = false;
                    } else {
                        String lowerCase2 = str.toLowerCase(locale);
                        lowerCase2.getClass();
                        List listF0 = StringsKt.f0(lowerCase2, new char[]{','});
                        ArrayList arrayList = new ArrayList(l48.r(listF0, 10));
                        Iterator it = listF0.iterator();
                        while (it.hasNext()) {
                            arrayList.add(StringsKt.t0((String) it.next()).toString());
                        }
                        if (arrayList.isEmpty()) {
                            z = false;
                        } else {
                            int size = arrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj3 = arrayList.get(i3);
                                i3++;
                                if (Intrinsics.g((String) obj3, strValueOf)) {
                                }
                            }
                            z = false;
                        }
                    }
                } else if (zIsLogin) {
                    z = false;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
