package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class wsb implements wsm {
    public final str<gph> a;

    public wsb(str<gph> strVar) {
        strVar.getClass();
        this.a = strVar;
    }

    @Override // defpackage.wsm
    public final void a(final String str) {
        str.getClass();
        final qsb qsbVar = this.a.get().a;
        qsbVar.o.a.a(new Runnable() { // from class: hsb
            @Override // java.lang.Runnable
            public final void run() {
                boolean zEquals;
                qsb qsbVar2 = qsbVar;
                String str2 = str;
                final oph0 oph0Var = qsbVar2.g.d;
                String strA = lpp.a(1024, str2);
                synchronized (oph0Var.g) {
                    try {
                        String reference = oph0Var.g.getReference();
                        if (strA == null) {
                            zEquals = reference == null;
                        } else {
                            zEquals = strA.equals(reference);
                        }
                        if (zEquals) {
                            return;
                        }
                        oph0Var.g.set(strA, true);
                        oph0Var.b.b.a(new Runnable() { // from class: mph0
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                boolean z;
                                String reference2;
                                oph0 oph0Var2 = oph0Var;
                                synchronized (oph0Var2.g) {
                                    try {
                                        z = false;
                                        if (oph0Var2.g.isMarked()) {
                                            reference2 = oph0Var2.g.getReference();
                                            oph0Var2.g.set(reference2, false);
                                            z = true;
                                        } else {
                                            reference2 = null;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (z) {
                                    oph0Var2.a.j(oph0Var2.c, reference2);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // defpackage.wsm
    public final void b() {
        esb esbVar = this.a.get().a.g;
        esbVar.p.trySetResult(Boolean.TRUE);
        esbVar.q.getTask();
    }

    @Override // defpackage.wsm
    public final void c(boolean z) {
        qsb qsbVar = this.a.get().a;
        Boolean boolValueOf = Boolean.valueOf(z);
        toc tocVar = qsbVar.b;
        synchronized (tocVar) {
            tocVar.f = false;
            tocVar.g = boolValueOf;
            SharedPreferences.Editor editorEdit = tocVar.a.edit();
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", z);
            editorEdit.apply();
            synchronized (tocVar.c) {
                try {
                    boolean zA = tocVar.a();
                    boolean z2 = tocVar.e;
                    if (zA) {
                        if (!z2) {
                            tocVar.d.trySetResult(null);
                            tocVar.e = true;
                        }
                    } else if (z2) {
                        tocVar.d = new TaskCompletionSource<>();
                        tocVar.e = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        itf0.a aVar = itf0.a;
        str<gph> strVar = this.a;
        strVar.getClass();
        dub dubVar = new dub(strVar);
        aVar.getClass();
        if (dubVar == aVar) {
            hb5.a("Cannot plant Timber into itself.");
            return;
        }
        ArrayList<itf0.b> arrayList = itf0.b;
        synchronized (arrayList) {
            arrayList.add(dubVar);
            Object[] array = arrayList.toArray(new itf0.b[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            itf0.c = (itf0.b[]) array;
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.wsm
    public final void e(final String str, final String str2) {
        str2.getClass();
        final qsb qsbVar = this.a.get().a;
        qsbVar.o.a.a(new Runnable() { // from class: isb
            @Override // java.lang.Runnable
            public final void run() {
                String str3 = str;
                String str4 = str2;
                esb esbVar = qsbVar.g;
                esbVar.getClass();
                try {
                    esbVar.d.d.b(str3, str4);
                } catch (IllegalArgumentException e) {
                    Context context = esbVar.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
            }
        });
    }

    @Override // defpackage.wsm
    public final void f(Throwable th, Map<String, String> map) {
        th.getClass();
        map.getClass();
        gph gphVar = this.a.get();
        gphVar.getClass();
        gph gphVar2 = gphVar;
        jnp jnpVar = new jnp();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            eec eecVar = jnpVar.a;
            if (!zHasNext) {
                Unit unit = Unit.a;
                eecVar.getClass();
                HashMap map2 = eecVar.a;
                qsb qsbVar = gphVar2.a;
                qsbVar.o.a.a(new jsb(qsbVar, th, map2));
                return;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            key.getClass();
            value.getClass();
            eecVar.a.put(key, value);
        }
    }

    @Override // defpackage.wsm
    public final void g(String str, String str2, Throwable th, List<? extends Pair<String, String>> list) {
        str2.getClass();
        th.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StackTraceElement(str, str2, th.getMessage(), 0));
        if (list != null) {
            for (Pair<String, String> pair : list) {
                arrayList.add(new StackTraceElement((String) pair.first, (String) pair.second, "", 0));
            }
        }
        th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        this.a.get().b(th);
    }

    @Override // defpackage.wsm
    public final void h(LinkedHashMap linkedHashMap) {
        final HashMap map = new HashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            map.put((String) entry.getKey(), (String) entry.getValue());
        }
        final qsb qsbVar = this.a.get().a;
        if (map.isEmpty()) {
            return;
        }
        qsbVar.o.a.a(new Runnable() { // from class: msb
            @Override // java.lang.Runnable
            public final void run() {
                qsb qsbVar2 = qsbVar;
                HashMap map2 = map;
                oph0.a aVar = qsbVar2.g.d.d;
                synchronized (aVar) {
                    aVar.a.getReference().c(map2);
                    AtomicMarkableReference<lpp> atomicMarkableReference = aVar.a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                }
                aVar.a();
            }
        });
    }

    @Override // defpackage.wsm
    public final void log(String str) {
        qsb qsbVar = this.a.get().a;
        qsbVar.o.a.a(new lsb(qsbVar, System.currentTimeMillis() - qsbVar.d, str));
    }
}
