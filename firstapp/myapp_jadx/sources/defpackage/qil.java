package defpackage;

import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class qil {
    public static final zn20.a<Long> b = new zn20.a<>("fire-global");
    public static final zn20.a<Long> c = new zn20.a<>("fire-count");
    public static final zn20.a<String> d = new zn20.a<>("last-used-date");
    public final x7p a;

    public qil(Context context, String str) {
        this.a = new x7p(context, "FirebaseHeartBeat".concat(str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            for (Map.Entry entry : ((Map) dj5.a(e.a, new u7p(this.a, null))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new mi1(((zn20.a) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.a.a(new Function1() { // from class: pil
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((jtw) obj).g(qil.b, Long.valueOf(jCurrentTimeMillis));
                        return null;
                    }
                });
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String b(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized zn20.a<Set<String>> c(jtw jtwVar, String str) {
        for (Map.Entry<zn20.a<?>, Object> entry : jtwVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return co20.g(entry.getKey().a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(jtw jtwVar, String str) {
        try {
            zn20.a<?> aVarC = c(jtwVar, str);
            if (aVarC == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) y7p.a(jtwVar, aVarC, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                jtwVar.f(aVarC);
            } else {
                jtwVar.h(aVarC, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean e(zn20.a<Long> aVar, long j) {
        e eVar;
        long jLongValue;
        x7p x7pVar = this.a;
        aVar.getClass();
        v7p v7pVar = new v7p(x7pVar, aVar, null);
        eVar = e.a;
        jLongValue = ((Long) dj5.a(eVar, v7pVar)).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j))) {
            return false;
        }
        return true;
    }
}
