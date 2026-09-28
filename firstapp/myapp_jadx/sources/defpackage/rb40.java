package defpackage;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.cms.CMSError;
import com.sportybet.android.cms.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class rb40 implements jb40 {
    public final j1b a;
    public final iym b;
    public final db40 c;
    public final mgb0 d;
    public final v340 e;
    public final v340 f;
    public final v340 g;
    public final v340 h;
    public final wwd0 i;
    public final kb40 j;

    public rb40(j1b j1bVar, m2l m2lVar, k650 k650Var, iym iymVar, db40 db40Var, mgb0 mgb0Var) {
        this.a = j1bVar;
        this.b = iymVar;
        this.c = db40Var;
        this.d = mgb0Var;
        zed zedVar = m2lVar.a;
        lyh<Boolean> booleanByFlow = zedVar.getBooleanByFlow("realtime_cms_test_mode", false);
        Boolean bool = Boolean.FALSE;
        kwd0 kwd0Var = q490.a.a;
        this.e = e1i.e(booleanByFlow, j1bVar, kwd0Var, bool);
        this.f = e1i.e(zedVar.getBooleanByFlow("realtime_cms_display_string_key", false), j1bVar, kwd0Var, bool);
        this.g = e1i.e(new pb40((zed.x) zedVar.getLongByFlow("firebase_remote_config_last_fetch_time", -1L), k650Var), j1bVar, kwd0Var, bool);
        this.h = e1i.e(new qb40((zed.x) zedVar.getLongByFlow("firebase_remote_config_last_fetch_time", -1L), k650Var), j1bVar, kwd0Var, bool);
        this.i = xwd0.a(jb40.a.C0716a.a);
        this.j = new kb40();
    }

    public static String j(ln5 ln5Var, int i) {
        String resourceName = ln5Var.getResources().getResourceName(i);
        resourceName.getClass();
        return (String) StringsKt__StringsKt.split$default(resourceName, new String[]{"/"}, false, 0, 6, null).get(1);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d6  */
    @Override // defpackage.jb40
    public final Object a(Function1 function1, boolean z, ln5 ln5Var, int i, Object... objArr) {
        Object bVar;
        jae0 jae0VarH;
        rb40 rb40Var;
        Function1 function2;
        Object bVar2;
        Long lValueOf;
        anf0 anf0VarC;
        Object bVar3;
        Object bVar4;
        uwd0<T> uwd0Var = this.e.a;
        if (((Boolean) this.f.a.getValue()).booleanValue()) {
            try {
                zi50.a aVar = zi50.b;
                bVar = j(ln5Var, i);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            String str = (String) bVar;
            if (str == null || StringsKt__StringsKt.split$default(str, new String[]{"__"}, false, 0, 6, null).size() <= 1) {
                str = null;
            }
            if (str != null) {
                return ((anf0) function1.invoke(str)).e();
            }
        }
        l9e0 l9e0Var = new l9e0(i, ay0.S(objArr));
        if (!z) {
            return h(ln5Var, l9e0Var, false, function1, null).getValue().e();
        }
        try {
            jb40.b bVarI = i(l9e0Var);
            if (bVarI != null) {
                long j = bVarI.b;
                String str2 = bVarI.a;
                if (StringsKt.M(str2, "\\u", false)) {
                    int i2 = 0;
                    while (i2 < 2) {
                        String strA = r9e0.a(str2);
                        if (Intrinsics.g(strA, str2)) {
                            break;
                        }
                        strA.getClass();
                        i2++;
                        str2 = strA;
                    }
                }
                jae0VarH = new jae0.c(a.a(str2, l9e0Var.b, function1, Long.valueOf(j)), j);
            } else {
                jae0VarH = null;
            }
        } catch (Throwable th2) {
            jae0VarH = h(ln5Var, l9e0Var, true, function1, th2);
        }
        if (jae0VarH == null) {
            rb40Var = this;
            function2 = function1;
            jae0VarH = rb40Var.h(ln5Var, l9e0Var, true, function2, null);
        } else {
            rb40Var = this;
            function2 = function1;
        }
        if (jae0VarH instanceof jae0.c) {
            if (((Boolean) uwd0Var.getValue()).booleanValue()) {
                try {
                    zi50.a aVar3 = zi50.b;
                    bVar4 = j(ln5Var, i);
                } catch (Throwable th3) {
                    zi50.a aVar4 = zi50.b;
                    bVar4 = new zi50.b(th3);
                }
                String str3 = (String) (bVar4 instanceof zi50.b ? null : bVar4);
                if (str3 == null) {
                    str3 = "";
                }
                itf0.a aVar5 = itf0.a;
                aVar5.q(MyLog.TAG_CMS);
                jae0.c cVar = (jae0.c) jae0VarH;
                anf0<? extends T> anf0Var = cVar.a;
                aVar5.a(uf80.a(x.a(cVar.b, "RemoteString: key: ", str3, " version: "), " value: ", anf0Var.d()), new Object[0]);
                anf0VarC = ((anf0) function2.invoke("+")).c(anf0Var.e(), "");
            } else {
                anf0VarC = ((jae0.c) jae0VarH).a;
            }
        } else if (jae0VarH instanceof jae0.b) {
            if (((Boolean) uwd0Var.getValue()).booleanValue()) {
                try {
                    zi50.a aVar6 = zi50.b;
                    bVar3 = j(ln5Var, i);
                } catch (Throwable th4) {
                    zi50.a aVar7 = zi50.b;
                    bVar3 = new zi50.b(th4);
                }
                String str4 = (String) (bVar3 instanceof zi50.b ? null : bVar3);
                if (str4 == null) {
                    str4 = "";
                }
                itf0.a aVar8 = itf0.a;
                aVar8.q(MyLog.TAG_CMS);
                anf0<? extends T> anf0Var2 = ((jae0.b) jae0VarH).a;
                aVar8.a(lx5.a("LocalString: key: ", str4, " value: ", anf0Var2.d()), new Object[0]);
                anf0VarC = ((anf0) function2.invoke("-")).c(anf0Var2.e(), "");
            } else {
                anf0VarC = ((jae0.b) jae0VarH).a;
            }
        } else {
            if (!(jae0VarH instanceof jae0.a)) {
                uhc.a();
                return null;
            }
            try {
                zi50.a aVar9 = zi50.b;
                bVar2 = j(ln5Var, i);
            } catch (Throwable th5) {
                zi50.a aVar10 = zi50.b;
                bVar2 = new zi50.b(th5);
            }
            if (bVar2 instanceof zi50.b) {
                bVar2 = null;
            }
            String str5 = (String) bVar2;
            if (str5 == null) {
                str5 = "";
            }
            jae0.a aVar11 = (jae0.a) jae0VarH;
            anf0 anf0Var3 = aVar11.a;
            Throwable th6 = aVar11.b;
            CMSError.StringArgNotMatch stringArgNotMatch = (CMSError.StringArgNotMatch) (!(th6 instanceof CMSError.StringArgNotMatch) ? null : th6);
            if (stringArgNotMatch != null) {
                long version = stringArgNotMatch.getVersion();
                lValueOf = Long.valueOf(version);
                if (version < 0) {
                    lValueOf = null;
                }
            } else {
                lValueOf = null;
            }
            if (((Boolean) rb40Var.h.a.getValue()).booleanValue()) {
                List listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{"__"}, false, 0, 6, null);
                rb40Var.b.b(kpu.f(new Pair("name", "realtime_cms_error"), new Pair("full_string_key_name", str5), new Pair(AnalyticsParam.MINI_GAMES_PAGE, (String) CollectionsKt.V(0, listSplit$default)), new Pair("key", (String) CollectionsKt.V(1, listSplit$default)), new Pair("version", String.valueOf(lValueOf)), new Pair("args", CollectionsKt.a0(l9e0Var.b, ",", null, null, null, 62)), new Pair(AnalyticsEvent.BI_TRACKING_KIND_ERROR, th6.toString())));
            }
            if (((Boolean) uwd0Var.getValue()).booleanValue()) {
                itf0.a aVar12 = itf0.a;
                aVar12.q(MyLog.TAG_CMS);
                StringBuilder sbA = ux5.a("ErrorString: key: ", str5, " value: ", anf0Var3.d(), " version: ");
                sbA.append(lValueOf);
                sbA.append(" exception: ");
                sbA.append(th6);
                aVar12.a(sbA.toString(), new Object[0]);
                anf0VarC = ((anf0) function2.invoke("*")).c(anf0Var3.e(), "");
            } else {
                anf0VarC = anf0Var3;
            }
        }
        return anf0VarC.e();
    }

    @Override // defpackage.jb40
    public final String b(boolean z, ln5 ln5Var, int i, Object... objArr) {
        return (String) a(this.j, z, ln5Var, i, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.jb40
    public final v340 c() {
        return this.g;
    }

    @Override // defpackage.jb40
    public final boolean d(int i) {
        Map<Integer, jb40.b> map;
        if (!((Boolean) this.f.a.getValue()).booleanValue() && !((Boolean) this.e.a.getValue()).booleanValue()) {
            Object value = this.i.getValue();
            if (!(value instanceof jb40.a.b)) {
                value = null;
            }
            jb40.a.b bVar = (jb40.a.b) value;
            if (bVar == null || (map = bVar.a) == null || !map.containsKey(Integer.valueOf(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.jb40
    public final Unit e() {
        kzh.d(new g1i(this.d.getLanguageFlow(), new nb40(this, null)), this.a);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(String str, x1b x1bVar) {
        lb40 lb40Var;
        xnu xnuVar;
        if (x1bVar instanceof lb40) {
            lb40Var = (lb40) x1bVar;
            int i = lb40Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lb40Var.d = i - Integer.MIN_VALUE;
            } else {
                lb40Var = new lb40(this, x1bVar);
            }
        } else {
            lb40Var = new lb40(this, x1bVar);
        }
        Object obj = lb40Var.b;
        y5b y5bVar = y5b.a;
        int i2 = lb40Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            xnu xnuVar2 = new xnu(5651);
            qu7.a(xnuVar2);
            qu7.b(xnuVar2);
            xnu xnuVarC = xnuVar2.c();
            lb40Var.a = xnuVarC;
            lb40Var.d = 1;
            Object objB = this.c.b(str, lb40Var);
            if (objB == y5bVar) {
                return y5bVar;
            }
            obj = objB;
            xnuVar = xnuVarC;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xnuVar = lb40Var.a;
            uj50.b(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (hb40 hb40Var : (Iterable) obj) {
            Integer num = (Integer) xnuVar.get(hb40Var.b);
            Pair pair = num != null ? new Pair(new Integer(num.intValue()), new jb40.b(hb40Var.d, hb40Var.e)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kpu.k(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, x1b x1bVar) {
        mb40 mb40Var;
        if (x1bVar instanceof mb40) {
            mb40Var = (mb40) x1bVar;
            int i = mb40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mb40Var.c = i - Integer.MIN_VALUE;
            } else {
                mb40Var = new mb40(this, x1bVar);
            }
        } else {
            mb40Var = new mb40(this, x1bVar);
        }
        Object objF = mb40Var.a;
        Object obj = y5b.a;
        int i2 = mb40Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CMS);
            aVar.a("Start creating realtime CMS", new Object[0]);
            mb40Var.c = 1;
            objF = f(str, mb40Var);
            if (objF != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objF);
                return objF;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objF);
        jb40.a.b bVar = new jb40.a.b((Map) objF);
        mb40Var.c = 2;
        this.i.k(null, bVar);
        Object obj2 = Unit.a;
        return obj2 == obj ? obj : obj2;
    }

    @Override // defpackage.jb40
    public final ob40 getState() {
        return new ob40(this.i);
    }

    public final jae0 h(ln5 ln5Var, l9e0 l9e0Var, boolean z, Function1 function1, Throwable th) {
        anf0 anf0VarA;
        String string;
        int i = l9e0Var.a;
        List<Object> list = l9e0Var.b;
        try {
            Throwable th2 = null;
            if (function1.equals(this.j)) {
                try {
                    Object[] array = list.toArray(new Object[0]);
                    string = ln5Var.getString(i, Arrays.copyOf(array, array.length));
                } catch (Throwable th3) {
                    th2 = th3;
                    if (!list.isEmpty() || z) {
                        throw th2;
                    }
                    string = ln5Var.getString(i);
                }
                anf0VarA = (anf0) function1.invoke(string);
            } else {
                String string2 = ln5Var.getString(i);
                try {
                    string2.getClass();
                    anf0VarA = a.a(string2, list, function1, null);
                } catch (Throwable th4) {
                    th2 = th4;
                    if (!list.isEmpty() || z) {
                        throw th2;
                    }
                    string2.getClass();
                    anf0VarA = (anf0) function1.invoke(string2);
                }
            }
            if (th != null) {
                return new jae0.a(anf0VarA, th);
            }
            return th2 != null ? new jae0.a(anf0VarA, th2) : new jae0.b(anf0VarA);
        } catch (Throwable th5) {
            anf0 anf0Var = (anf0) function1.invoke("");
            if (th == null) {
                th = new CMSError.LocalStringError(th5);
            }
            return new jae0.a(anf0Var, th);
        }
    }

    public final jb40.b i(l9e0 l9e0Var) {
        jb40.a aVar = (jb40.a) this.i.getValue();
        if (!Intrinsics.g(aVar, jb40.a.C0716a.a)) {
            if (aVar instanceof jb40.a.b) {
                return ((jb40.a.b) aVar).a.get(Integer.valueOf(l9e0Var.a));
            }
            uhc.a();
            return null;
        }
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_CMS);
        aVar2.n("You try to get string before realtime CMS is initialized: " + l9e0Var, new Object[0]);
        return null;
    }
}
