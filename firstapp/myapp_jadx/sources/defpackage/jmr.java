package defpackage;

import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class jmr {
    public final m2l a;
    public final psm b;
    public final mgb0 c;
    public final k650 d;
    public final pbd e;
    public final ssw<wjh0> f;
    public final ssw g;
    public final ArrayList h;
    public final ArrayList i;
    public final mpe0 j;

    public jmr(m2l m2lVar, psm psmVar, mgb0 mgb0Var, k650 k650Var, pbd pbdVar) {
        m2lVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        k650Var.getClass();
        pbdVar.getClass();
        this.a = m2lVar;
        this.b = psmVar;
        this.c = mgb0Var;
        this.d = k650Var;
        this.e = pbdVar;
        ssw<wjh0> sswVar = new ssw<>();
        this.f = sswVar;
        this.g = sswVar;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.i = arrayList;
        this.j = hwr.b(new dmr());
    }

    public static boolean d(String str) {
        String[] stringArray = hp0.A.getResources().getStringArray(R.array.language_code_list);
        stringArray.getClass();
        ArrayList arrayListU = ay0.U(stringArray);
        int size = arrayListU.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListU.get(i);
            i++;
            String str2 = (String) obj;
            str2.getClass();
            if (StringsKt.M(str2, str, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d1, code lost:
    
        if (r9.a.a.putLong(r10, new java.lang.Long(r4), r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.sporty.android.core.model.service.CountryCodeName r10, defpackage.x1b r11) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmr.a(com.sporty.android.core.model.service.CountryCodeName, x1b):java.lang.Object");
    }

    public final ArrayList b() {
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((ao5) obj).b);
        }
        return arrayList2;
    }

    public final ArrayList c() {
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((ao5) obj).c);
        }
        return arrayList2;
    }

    public final void e(bcp bcpVar) {
        if (bcpVar == null) {
            return;
        }
        ArrayList arrayList = this.h;
        arrayList.clear();
        Iterator<tcp> it = bcpVar.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            tcp next = it.next();
            next.getClass();
            if (next instanceof xdp) {
                xdp xdpVarD = next.d();
                String strF = xdpVarD.j(EventKeys.ERROR_CODE).f();
                strF.getClass();
                if (d(strF)) {
                    int iB = xdpVarD.j(AnalyticsParam.EVENT_PARAM_ID).b();
                    String strF2 = xdpVarD.j(EventKeys.ERROR_CODE).f();
                    strF2.getClass();
                    String strF3 = xdpVarD.j("name").f();
                    strF3.getClass();
                    arrayList.add(new ao5(iB, strF2, strF3));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(CountryCodeName countryCodeName, x1b x1bVar) throws JSONException {
        hmr hmrVar;
        long j;
        String str;
        Object objA;
        if (x1bVar instanceof hmr) {
            hmrVar = (hmr) x1bVar;
            int i = hmrVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hmrVar.e = i - Integer.MIN_VALUE;
            } else {
                hmrVar = new hmr(this, x1bVar);
            }
        } else {
            hmrVar = new hmr(this, x1bVar);
        }
        Object objD = hmrVar.c;
        Object obj = y5b.a;
        int i2 = hmrVar.e;
        psm psmVar = this.b;
        if (i2 == 0) {
            uj50.b(objD);
            String strA = yk10.a(psmVar.getCountryCode().getCode(), "_refresh_time");
            hmrVar.a = countryCodeName;
            hmrVar.e = 1;
            objD = ej5.d(fse.a, new gmr(this, strA, null), hmrVar);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            countryCodeName = hmrVar.a;
            uj50.b(objD);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    uj50.b(objD);
                    return objD;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = hmrVar.b;
            countryCodeName = hmrVar.a;
            uj50.b(objD);
        }
        str = (String) objD;
        if (!TextUtils.isEmpty(str) || System.currentTimeMillis() - j >= this.d.c("refresh_language_interval")) {
            this.f.j(wjh0.a);
            hmrVar.a = null;
            hmrVar.b = j;
            hmrVar.e = 3;
            objA = a(countryCodeName, hmrVar);
            if (objA != obj) {
                return obj;
            }
            return objA;
        }
        ArrayList arrayList = this.h;
        arrayList.clear();
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            Object obj2 = jSONArray.get(i3);
            obj2.getClass();
            JSONObject jSONObject = (JSONObject) obj2;
            String string = jSONObject.getString(EventKeys.ERROR_CODE);
            string.getClass();
            if (d(string)) {
                int i4 = jSONObject.getInt(AnalyticsParam.EVENT_PARAM_ID);
                String string2 = jSONObject.getString(EventKeys.ERROR_CODE);
                string2.getClass();
                String string3 = jSONObject.getString("name");
                string3.getClass();
                arrayList.add(new ao5(i4, string2, string3));
            }
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_LANGUAGE);
        aVar.a("load languages list from preference:%s", arrayList.toString());
        return Unit.a;
        long jLongValue = ((Number) objD).longValue();
        String strA2 = yk10.a(psmVar.getCountryCode().getCode(), "_language_list");
        hmrVar.a = countryCodeName;
        hmrVar.b = jLongValue;
        hmrVar.e = 2;
        objD = ej5.d(fse.a, new fmr(this, strA2, null), hmrVar);
        if (objD != obj) {
            j = jLongValue;
            str = (String) objD;
            if (TextUtils.isEmpty(str)) {
            }
            this.f.j(wjh0.a);
            hmrVar.a = null;
            hmrVar.b = j;
            hmrVar.e = 3;
            objA = a(countryCodeName, hmrVar);
            if (objA != obj) {
                return objA;
            }
        }
        return obj;
    }
}
