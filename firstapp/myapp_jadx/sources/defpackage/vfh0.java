package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.prematch.data.LiveEventDataInPreMatch;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventData;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class vfh0 {
    public final Context a;
    public final String b;
    public final ArrayList<String> c = new ArrayList<>();
    public final HashMap<String, String> d = new HashMap<>();
    public final m2l e;
    public final mpe0 f;

    public static final class a implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3 == null || str4 == null) {
                return 0;
            }
            try {
                return Float.compare(Float.parseFloat(zog.j(str3)), Float.parseFloat(zog.j(str4)));
            } catch (Exception unused) {
                return str3.compareTo(str4);
            }
        }
    }

    public vfh0(Context context, String str) {
        m2l m2lVar;
        this.a = context;
        this.b = str;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            m2lVar = new m2l(applicationContext);
        } else {
            m2lVar = null;
        }
        this.e = m2lVar;
        this.f = hwr.b(new tfh0());
        if (m2lVar == null) {
            return;
        }
        nas nasVarD = d();
        if (nasVarD != null) {
            pfd pfdVar = fse.a;
            ej5.c(nasVarD, odd.b, null, new ufh0(this, null), 2);
        } else {
            itf0.a aVar = itf0.a;
            aVar.q(c());
            aVar.a("context is not a lifecycle owner!", new Object[0]);
            Unit unit = Unit.a;
        }
    }

    public static void a(String str, String str2, List list) {
        list.getClass();
        str.getClass();
        for (Object obj : list) {
            if (obj instanceof ing) {
                if (str2 != null) {
                    ing ingVar = (ing) obj;
                    if (ingVar.a.getSpecifierList(str).contains(str2)) {
                        ingVar.d(str, str2);
                    }
                }
                ((ing) obj).e.remove(str);
            } else if (obj instanceof Event) {
                if (str2 != null) {
                    Event event = (Event) obj;
                    if (event.getSpecifierList(str).contains(str2)) {
                        event.setSelectSpecifier(str, str2);
                    }
                }
                ((Event) obj).removeSelectSpecifier(str);
            }
        }
    }

    public final void b(RegularMarketRule regularMarketRule, List<?> list, boolean z) {
        list.getClass();
        ArrayList<String> arrayList = this.c;
        arrayList.clear();
        if (regularMarketRule != null) {
            String str = regularMarketRule.a;
            if (regularMarketRule.c) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Object obj : list) {
                    if (obj instanceof ing) {
                        ing ingVar = (ing) obj;
                        List<Market> list2 = ingVar.w;
                        list2.getClass();
                        linkedHashSet.addAll(!list2.isEmpty() ? ing.c(str, ingVar.w) : ing.c(str, ingVar.a.markets));
                    } else if (obj instanceof Event) {
                        linkedHashSet.addAll(z ? gjs.e(gjs.d((Event) obj, str)) : ((Event) obj).getSpecifierList(str));
                    } else if (obj instanceof PreMatchEventData) {
                        List<Market> list3 = ((PreMatchEventData) obj).getEvent().markets;
                        str.getClass();
                        linkedHashSet.addAll(zog.g(str, list3));
                    } else if (obj instanceof LiveEventDataInPreMatch) {
                        List<Market> list4 = ((LiveEventDataInPreMatch) obj).getEvent().markets;
                        str.getClass();
                        linkedHashSet.addAll(zog.g(str, list4));
                    }
                }
                arrayList.addAll(linkedHashSet);
                Collections.sort(arrayList, new a());
                arrayList.add(0, "near_odds");
                arrayList.add(1, "far_odds");
            }
        }
    }

    public final String c() {
        eo20[] eo20VarArr = eo20.a;
        return "universal_specifiers_".concat(this.b);
    }

    public final nas d() {
        Object baseContext = this.a;
        if (baseContext instanceof ibs) {
            return lrn.b((ibs) baseContext);
        }
        if (baseContext instanceof ContextThemeWrapper) {
            baseContext = ((ContextThemeWrapper) baseContext).getBaseContext();
        }
        if (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        ibs ibsVar = baseContext instanceof ibs ? (ibs) baseContext : null;
        if (ibsVar != null) {
            return ebs.a(ibsVar.getLifecycle());
        }
        return null;
    }

    public final String e(String str) {
        str.getClass();
        String str2 = this.d.get(str);
        return str2 == null ? "near_odds" : str2;
    }

    public final int f(String str) {
        str.getClass();
        String str2 = this.d.get(str);
        if (str2 == null || str2.equals("near_odds")) {
            return 0;
        }
        if (str2.equals("far_odds")) {
            return 1;
        }
        int iIndexOf = this.c.indexOf(str2);
        if (iIndexOf == -1) {
            return 0;
        }
        return iIndexOf;
    }

    public final ArrayList g() {
        ArrayList<String> arrayList = this.c;
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        return CollectionsKt.i0(tru.i(arrayList.subList(2, arrayList.size())), CollectionsKt.t0(arrayList, 2));
    }

    public final void h(int i, String str, Function1<? super String, Unit> function1) {
        str.getClass();
        if (i == f(str)) {
            return;
        }
        HashMap<String, String> map = this.d;
        if (i == 0) {
            map.put(str, "near_odds");
            function1.invoke(null);
        } else if (i == 1) {
            map.put(str, "far_odds");
            function1.invoke(null);
        } else if (2 <= i) {
            ArrayList<String> arrayList = this.c;
            if (i < arrayList.size()) {
                String str2 = arrayList.get(i);
                map.put(str, str2);
                function1.invoke(str2);
            }
        }
        if (this.e == null) {
            return;
        }
        nas nasVarD = d();
        if (nasVarD != null) {
            pfd pfdVar = fse.a;
            ej5.c(nasVarD, odd.b, null, new wfh0(this, null), 2);
        } else {
            itf0.a aVar = itf0.a;
            aVar.q(c());
            aVar.a("context is not a lifecycle owner!", new Object[0]);
            Unit unit = Unit.a;
        }
    }
}
