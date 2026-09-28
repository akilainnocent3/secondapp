package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class qhi {
    public final yho a;
    public final JsonSerializeService b;

    public qhi(yho yhoVar, JsonSerializeService jsonSerializeService) {
        this.a = yhoVar;
        this.b = jsonSerializeService;
    }

    public final khi a(String str) {
        str.getClass();
        yho yhoVar = this.a;
        return new khi(yhoVar.b.a(yhoVar, yho.o[0]).d(""), this, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, x1b x1bVar) {
        lhi lhiVar;
        wm20 wm20VarA;
        Object objE;
        String str3;
        qhi qhiVar;
        String str4;
        Object bVar;
        if (x1bVar instanceof lhi) {
            lhiVar = (lhi) x1bVar;
            int i = lhiVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                lhiVar.i = i - Integer.MIN_VALUE;
            } else {
                lhiVar = new lhi(this, x1bVar);
            }
        } else {
            lhiVar = new lhi(this, x1bVar);
        }
        Object obj = lhiVar.e;
        y5b y5bVar = y5b.a;
        int i2 = lhiVar.i;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                yho yhoVar = this.a;
                wm20VarA = yhoVar.b.a(yhoVar, yho.o[0]);
                lhiVar.a = str;
                lhiVar.b = str2;
                lhiVar.c = wm20VarA;
                lhiVar.d = this;
                lhiVar.i = 1;
                objE = wm20VarA.e(lhiVar, "");
                if (objE != y5bVar) {
                    str3 = str;
                    qhiVar = this;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                return obj;
            }
            qhiVar = lhiVar.d;
            wm20 wm20Var = lhiVar.c;
            String str5 = lhiVar.b;
            str3 = lhiVar.a;
            uj50.b(obj);
            wm20VarA = wm20Var;
            str2 = str5;
            objE = obj;
            zi50.a aVar = zi50.b;
            bVar = (Map) qhiVar.b.fromJson(str4, (Type) Map.class);
            if (bVar == null) {
                bVar = o2g.a;
                bVar.getClass();
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        str4 = (String) objE;
        Object obj2 = o2g.a;
        obj2.getClass();
        if (bVar instanceof zi50.b) {
            bVar = obj2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) bVar);
        linkedHashMap.put(str3, str2);
        String json = this.b.toJson(linkedHashMap);
        json.getClass();
        lhiVar.a = null;
        lhiVar.b = null;
        lhiVar.c = null;
        lhiVar.d = null;
        lhiVar.i = 2;
        Object objG = wm20VarA.g(lhiVar, json);
        return objG == y5bVar ? y5bVar : objG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, x1b x1bVar) {
        mhi mhiVar;
        wm20 wm20VarA;
        String str2;
        qhi qhiVar;
        String str3;
        Object bVar;
        if (x1bVar instanceof mhi) {
            mhiVar = (mhi) x1bVar;
            int i = mhiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mhiVar.f = i - Integer.MIN_VALUE;
            } else {
                mhiVar = new mhi(this, x1bVar);
            }
        } else {
            mhiVar = new mhi(this, x1bVar);
        }
        Object objE = mhiVar.d;
        y5b y5bVar = y5b.a;
        int i2 = mhiVar.f;
        try {
            if (i2 == 0) {
                uj50.b(objE);
                yho yhoVar = this.a;
                wm20VarA = yhoVar.c.a(yhoVar, yho.o[1]);
                mhiVar.a = str;
                mhiVar.b = wm20VarA;
                mhiVar.c = this;
                mhiVar.f = 1;
                objE = wm20VarA.e(mhiVar, "");
                if (objE != y5bVar) {
                    str2 = str;
                    qhiVar = this;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objE);
                return objE;
            }
            qhiVar = mhiVar.c;
            wm20VarA = mhiVar.b;
            str2 = mhiVar.a;
            uj50.b(objE);
            zi50.a aVar = zi50.b;
            bVar = (Map) qhiVar.b.fromJson(str3, (Type) Map.class);
            if (bVar == null) {
                bVar = o2g.a;
                bVar.getClass();
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        str3 = (String) objE;
        Object obj = o2g.a;
        obj.getClass();
        if (bVar instanceof zi50.b) {
            bVar = obj;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) bVar);
        linkedHashMap.put(str2, Boolean.FALSE);
        String json = this.b.toJson(linkedHashMap);
        json.getClass();
        mhiVar.a = null;
        mhiVar.b = null;
        mhiVar.c = null;
        mhiVar.f = 2;
        Object objG = wm20VarA.g(mhiVar, json);
        return objG == y5bVar ? y5bVar : objG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, x1b x1bVar) {
        nhi nhiVar;
        wm20 wm20VarA;
        String str2;
        qhi qhiVar;
        String str3;
        Object bVar;
        if (x1bVar instanceof nhi) {
            nhiVar = (nhi) x1bVar;
            int i = nhiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhiVar.f = i - Integer.MIN_VALUE;
            } else {
                nhiVar = new nhi(this, x1bVar);
            }
        } else {
            nhiVar = new nhi(this, x1bVar);
        }
        Object objE = nhiVar.d;
        y5b y5bVar = y5b.a;
        int i2 = nhiVar.f;
        try {
            if (i2 == 0) {
                uj50.b(objE);
                yho yhoVar = this.a;
                wm20VarA = yhoVar.d.a(yhoVar, yho.o[2]);
                nhiVar.a = str;
                nhiVar.b = wm20VarA;
                nhiVar.c = this;
                nhiVar.f = 1;
                objE = wm20VarA.e(nhiVar, "");
                if (objE != y5bVar) {
                    str2 = str;
                    qhiVar = this;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objE);
                return objE;
            }
            qhiVar = nhiVar.c;
            wm20VarA = nhiVar.b;
            str2 = nhiVar.a;
            uj50.b(objE);
            zi50.a aVar = zi50.b;
            bVar = (Map) qhiVar.b.fromJson(str3, (Type) Map.class);
            if (bVar == null) {
                bVar = o2g.a;
                bVar.getClass();
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        str3 = (String) objE;
        Object obj = o2g.a;
        obj.getClass();
        if (bVar instanceof zi50.b) {
            bVar = obj;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) bVar);
        linkedHashMap.put(str2, Boolean.FALSE);
        String json = this.b.toJson(linkedHashMap);
        json.getClass();
        nhiVar.a = null;
        nhiVar.b = null;
        nhiVar.c = null;
        nhiVar.f = 2;
        Object objG = wm20VarA.g(nhiVar, json);
        return objG == y5bVar ? y5bVar : objG;
    }
}
