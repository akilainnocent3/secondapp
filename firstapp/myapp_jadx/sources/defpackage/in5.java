package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.cms.CMSRequest;
import com.sporty.android.core.model.cms.CMSResponse;
import com.sportybet.core.database.SportyBetPersistentDB;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class in5 {
    public final str<SportyBetPersistentDB> a;
    public final mgb0 b;
    public final psm c;
    public final mpe0 d;

    public in5(str<SportyBetPersistentDB> strVar, mgb0 mgb0Var, psm psmVar) {
        strVar.getClass();
        mgb0Var.getClass();
        psmVar.getClass();
        this.a = strVar;
        this.b = mgb0Var;
        this.c = psmVar;
        this.d = hwr.b(new an5(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        cn5 cn5Var;
        Object bVar;
        if (x1bVar instanceof cn5) {
            cn5Var = (cn5) x1bVar;
            int i = cn5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cn5Var.c = i - Integer.MIN_VALUE;
            } else {
                cn5Var = new cn5(this, x1bVar);
            }
        } else {
            cn5Var = new cn5(this, x1bVar);
        }
        Object obj = cn5Var.a;
        y5b y5bVar = y5b.a;
        int i2 = cn5Var.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                sm5 sm5VarF = f();
                String strE = e();
                String languageCode = this.b.getLanguageCode(null);
                cn5Var.c = 1;
                if (sm5VarF.c(str, strE, languageCode, cn5Var) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_CACHE_DB);
            aVar4.f(thA, "delete CMS values with page failed.", new Object[0]);
        }
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(ArrayList arrayList, x1b x1bVar) {
        bn5 bn5Var;
        Object bVar;
        if (x1bVar instanceof bn5) {
            bn5Var = (bn5) x1bVar;
            int i = bn5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bn5Var.c = i - Integer.MIN_VALUE;
            } else {
                bn5Var = new bn5(this, x1bVar);
            }
        } else {
            bn5Var = new bn5(this, x1bVar);
        }
        bn5 bn5Var2 = bn5Var;
        Object obj = bn5Var2.a;
        y5b y5bVar = y5b.a;
        int i2 = bn5Var2.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                sm5 sm5VarF = f();
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    String page = ((CMSRequest) obj2).getPage();
                    if (page != null) {
                        arrayList2.add(page);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    String key = ((CMSRequest) obj3).getKey();
                    if (key != null) {
                        arrayList3.add(key);
                    }
                }
                String strE = e();
                String languageCode = this.b.getLanguageCode(null);
                bn5Var2.c = 1;
                if (sm5VarF.d(arrayList2, arrayList3, strE, languageCode, bn5Var2) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_CACHE_DB);
            aVar4.f(thA, "delete CMS values with requests failed.", new Object[0]);
        }
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(String str, x1b x1bVar) {
        en5 en5Var;
        Serializable bVar;
        if (x1bVar instanceof en5) {
            en5Var = (en5) x1bVar;
            int i = en5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                en5Var.c = i - Integer.MIN_VALUE;
            } else {
                en5Var = new en5(this, x1bVar);
            }
        } else {
            en5Var = new en5(this, x1bVar);
        }
        Object objF = en5Var.a;
        y5b y5bVar = y5b.a;
        int i2 = en5Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objF);
                zi50.a aVar = zi50.b;
                sm5 sm5VarF = f();
                String strE = e();
                String languageCode = this.b.getLanguageCode(null);
                en5Var.c = 1;
                objF = sm5VarF.f(str, strE, languageCode, en5Var);
                if (objF == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objF);
            }
            Iterable iterable = (Iterable) objF;
            ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(ip5.c((hp5) it.next()));
            }
            zi50.a aVar2 = zi50.b;
            bVar = arrayList;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_CACHE_DB);
            aVar4.f(thA, "get CMS values with page failed.", new Object[0]);
        }
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable d(ArrayList arrayList, x1b x1bVar) {
        dn5 dn5Var;
        Serializable bVar;
        if (x1bVar instanceof dn5) {
            dn5Var = (dn5) x1bVar;
            int i = dn5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dn5Var.c = i - Integer.MIN_VALUE;
            } else {
                dn5Var = new dn5(this, x1bVar);
            }
        } else {
            dn5Var = new dn5(this, x1bVar);
        }
        dn5 dn5Var2 = dn5Var;
        Object objE = dn5Var2.a;
        y5b y5bVar = y5b.a;
        int i2 = dn5Var2.c;
        try {
            if (i2 == 0) {
                uj50.b(objE);
                zi50.a aVar = zi50.b;
                sm5 sm5VarF = f();
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    String page = ((CMSRequest) obj).getPage();
                    if (page != null) {
                        arrayList2.add(page);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    String key = ((CMSRequest) obj2).getKey();
                    if (key != null) {
                        arrayList3.add(key);
                    }
                }
                String strE = e();
                String languageCode = this.b.getLanguageCode(null);
                dn5Var2.c = 1;
                objE = sm5VarF.e(arrayList2, arrayList3, strE, languageCode, dn5Var2);
                if (objE == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objE);
            }
            Iterable iterable = (Iterable) objE;
            ArrayList arrayList4 = new ArrayList(l48.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList4.add(ip5.c((hp5) it.next()));
            }
            zi50.a aVar2 = zi50.b;
            bVar = arrayList4;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_CACHE_DB);
            aVar4.f(thA, "get CMS values with requests failed.", new Object[0]);
        }
        return bVar;
    }

    public final String e() {
        return this.c.getCountryCode().getCode();
    }

    public final sm5 f() {
        return (sm5) this.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(List list, x1b x1bVar) {
        hn5 hn5Var;
        Object bVar;
        if (x1bVar instanceof hn5) {
            hn5Var = (hn5) x1bVar;
            int i = hn5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hn5Var.c = i - Integer.MIN_VALUE;
            } else {
                hn5Var = new hn5(this, x1bVar);
            }
        } else {
            hn5Var = new hn5(this, x1bVar);
        }
        Object obj = hn5Var.a;
        y5b y5bVar = y5b.a;
        int i2 = hn5Var.c;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                sm5 sm5VarF = f();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CMSResponse cMSResponse = (CMSResponse) it.next();
                    String strE = e();
                    String languageCode = this.b.getLanguageCode(null);
                    cMSResponse.getClass();
                    strE.getClass();
                    languageCode.getClass();
                    String key = cMSResponse.getKey();
                    String page = cMSResponse.getPage();
                    hp5 hp5Var = (key == null || page == null) ? null : new hp5(key, page, strE, languageCode, cMSResponse.getValue(), cMSResponse.getType());
                    if (hp5Var != null) {
                        arrayList.add(hp5Var);
                    }
                }
                hn5Var.c = 1;
                if (sm5VarF.a(arrayList, hn5Var) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_CACHE_DB);
            aVar4.f(thA, "insert CMS values failed.", new Object[0]);
        }
        return bVar;
    }
}
