package defpackage;

import android.text.Html;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes4.dex */
public final class wk0 {

    @fae
    public static final class a {
        public final nk0 a;

        public a(nk0 nk0Var) {
            this.a = nk0Var;
        }
    }

    public static nk0 a(String str, ora0 ora0Var, uf00 uf00Var, final Function2 function2) {
        ora0Var.getClass();
        uf00Var.getClass();
        function2.getClass();
        nk0.b bVar = new nk0.b((Object) null);
        int iL = bVar.l(ora0Var);
        try {
            bVar.g(str);
            Unit unit = Unit.a;
            bVar.i(iL);
            Iterator<E> it = uf00Var.iterator();
            while (it.hasNext()) {
                final ggs ggsVar = (ggs) it.next();
                int iT = StringsKt.T(str, ggsVar.a, 0, false, 6);
                if (iT >= 0) {
                    bVar.b(new rfs.b("", new jlf0(ggsVar.b.a, 14), new ufs() { // from class: uk0
                        @Override // defpackage.ufs
                        public final void a(rfs rfsVar) {
                            rfsVar.getClass();
                            function2.invoke(ggsVar.a, "");
                        }
                    }), iT, ggsVar.a.length() + iT);
                }
            }
            return bVar.m();
        } catch (Throwable th) {
            bVar.i(iL);
            throw th;
        }
    }

    public static nk0 b(String str, String[] strArr, ora0 ora0Var, ora0 ora0Var2, final Function0 function0) {
        function0.getClass();
        nk0.b bVar = new nk0.b((Object) null);
        int i = 0;
        for (Object obj : StringsKt__StringsKt.split$default(str, (String[]) Arrays.copyOf(strArr, strArr.length), false, 0, 6, null)) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            String str2 = (String) obj;
            if (i % 2 == 0) {
                int iL = bVar.l(ora0Var2);
                try {
                    bVar.g(str2);
                    Unit unit = Unit.a;
                    bVar.i(iL);
                } catch (Throwable th) {
                    bVar.i(iL);
                    throw th;
                }
            } else {
                int iJ = bVar.j(new rfs.a("tag_target", new jlf0(ora0Var, 14), new ufs() { // from class: vk0
                    @Override // defpackage.ufs
                    public final void a(rfs rfsVar) {
                        rfsVar.getClass();
                        function0.invoke();
                    }
                }));
                try {
                    bVar.g(str2);
                    Unit unit2 = Unit.a;
                    bVar.i(iJ);
                } catch (Throwable th2) {
                    bVar.i(iJ);
                    throw th2;
                }
            }
            i = i2;
        }
        return bVar.m();
    }

    @fae
    public static a c(String str, String[] strArr, ora0 ora0Var, ora0 ora0Var2) {
        str.getClass();
        ora0Var.getClass();
        ora0Var2.getClass();
        List listSplit$default = StringsKt__StringsKt.split$default(str, (String[]) Arrays.copyOf(strArr, strArr.length), false, 0, 6, null);
        nk0.b bVar = new nk0.b((Object) null);
        if ((!listSplit$default.isEmpty() ? listSplit$default : null) != null) {
            int iL = bVar.l(ora0Var2);
            try {
                bVar.g((String) listSplit$default.get(0));
                Unit unit = Unit.a;
                bVar.i(iL);
            } catch (Throwable th) {
                bVar.i(iL);
                throw th;
            }
        }
        if ((listSplit$default.size() > 1 ? listSplit$default : null) != null) {
            bVar.k("tag_target", (String) listSplit$default.get(1));
            int iL2 = bVar.l(ora0Var);
            try {
                bVar.g((String) listSplit$default.get(1));
                Unit unit2 = Unit.a;
                bVar.i(iL2);
                bVar.h();
            } catch (Throwable th2) {
                bVar.i(iL2);
                throw th2;
            }
        }
        if ((listSplit$default.size() > 2 ? listSplit$default : null) != null) {
            int iL3 = bVar.l(ora0Var2);
            try {
                bVar.g((String) listSplit$default.get(2));
                Unit unit3 = Unit.a;
            } finally {
                bVar.i(iL3);
            }
        }
        return new a(bVar.m());
    }

    @fae
    public static a d(String str, String[] strArr, ora0 ora0Var, ora0 ora0Var2) {
        String strReplace;
        str.getClass();
        ora0Var.getClass();
        ora0Var2.getClass();
        if (strArr.length == 0) {
            strReplace = c.p(str, "<", "&lt;", false);
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str2 : strArr) {
                String strC0 = StringsKt.c0(StringsKt.a0(str2, "<"), ">");
                if (StringsKt.U(strC0)) {
                    strC0 = null;
                }
                if (strC0 != null) {
                    arrayList.add(strC0);
                }
            }
            strReplace = new Regex(tug.a("<(?!", CollectionsKt.a0(arrayList, "|", null, null, null, 62), ")")).replace(str, "&lt;");
        }
        List listSplit$default = StringsKt__StringsKt.split$default(strReplace, (String[]) Arrays.copyOf(strArr, strArr.length), false, 0, 6, null);
        nk0.b bVar = new nk0.b((Object) null);
        int i = 0;
        for (Object obj : listSplit$default) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            String str3 = (String) obj;
            if (str3.length() != 0) {
                Character chG = wae0.G(str3);
                boolean z = chG != null && chG.charValue() == ' ';
                Character chJ = wae0.J(str3);
                boolean z2 = chJ != null && chJ.charValue() == ' ';
                String string = Html.fromHtml(str3, 63).toString();
                boolean zU = c.u(string, " ", false);
                boolean zK = c.k(string, " ", false);
                StringBuilder sb = new StringBuilder();
                if (z && !zU) {
                    sb.append(' ');
                }
                sb.append(string);
                if (z2 && !zK) {
                    sb.append(' ');
                }
                String string2 = sb.toString();
                if (i % 2 == 0) {
                    int iL = bVar.l(ora0Var2);
                    try {
                        bVar.g(string2);
                        Unit unit = Unit.a;
                        bVar.i(iL);
                    } catch (Throwable th) {
                        bVar.i(iL);
                        throw th;
                    }
                } else {
                    bVar.k("tag_target", str3);
                    int iL2 = bVar.l(ora0Var);
                    try {
                        bVar.g(string2);
                        Unit unit2 = Unit.a;
                        bVar.i(iL2);
                        bVar.h();
                    } catch (Throwable th2) {
                        bVar.i(iL2);
                        throw th2;
                    }
                }
            }
            i = i2;
        }
        return new a(bVar.m());
    }

    public static nk0 e(String str, String[] strArr, ora0 ora0Var, ora0 ora0Var2) {
        str.getClass();
        ora0Var.getClass();
        ora0Var2.getClass();
        nk0.b bVar = new nk0.b((Object) null);
        int i = 0;
        for (Object obj : StringsKt__StringsKt.split$default(str, (String[]) Arrays.copyOf(strArr, strArr.length), false, 0, 6, null)) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            String str2 = (String) obj;
            int iL = bVar.l(i % 2 == 0 ? ora0Var2 : ora0Var);
            try {
                bVar.g(str2);
                Unit unit = Unit.a;
                bVar.i(iL);
                i = i2;
            } catch (Throwable th) {
                bVar.i(iL);
                throw th;
            }
        }
        return bVar.m();
    }
}
