package defpackage;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zcd implements kil, lil {
    public final utr a;
    public final Context b;
    public final n730<boh0> c;
    public final Set<jil> d;
    public final Executor e;

    public zcd() {
        throw null;
    }

    public zcd(final Context context, final String str, Set<jil> set, n730<boh0> n730Var, Executor executor) {
        this.a = new utr(new n730() { // from class: ycd
            @Override // defpackage.n730
            public final Object get() {
                return new qil(context, str);
            }
        });
        this.d = set;
        this.e = executor;
        this.c = n730Var;
        this.b = context;
    }

    @Override // defpackage.kil
    public final Task<String> a() {
        if (!fww.a(this.b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new Callable() { // from class: wcd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                zcd zcdVar = this.a;
                synchronized (zcdVar) {
                    try {
                        final qil qilVar = (qil) zcdVar.a.get();
                        ArrayList arrayListA = qilVar.a();
                        synchronized (qilVar) {
                            qilVar.a.a(new Function1() { // from class: oil
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    jtw jtwVar = (jtw) obj;
                                    zn20.a<Long> aVar = qil.c;
                                    long j = 0;
                                    for (Map.Entry<zn20.a<?>, Object> entry : jtwVar.a().entrySet()) {
                                        if (entry.getValue() instanceof Set) {
                                            zn20.a<?> key = entry.getKey();
                                            Set set = (Set) entry.getValue();
                                            String strB = qilVar.b(System.currentTimeMillis());
                                            if (set.contains(strB)) {
                                                Object[] objArr = {strB};
                                                HashSet hashSet = new HashSet(1);
                                                Object obj2 = objArr[0];
                                                Objects.requireNonNull(obj2);
                                                if (!hashSet.add(obj2)) {
                                                    hb5.a(wga.a(obj2, "duplicate element: "));
                                                    return null;
                                                }
                                                jtwVar.g(key, Collections.unmodifiableSet(hashSet));
                                                j++;
                                            } else {
                                                jtwVar.f(key);
                                            }
                                        }
                                    }
                                    if (j == 0) {
                                        jtwVar.f(aVar);
                                    } else {
                                        jtwVar.g(aVar, Long.valueOf(j));
                                    }
                                    return null;
                                }
                            });
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListA.size(); i++) {
                            ril rilVar = (ril) arrayListA.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", rilVar.b());
                            jSONObject.put("dates", new JSONArray((Collection) rilVar.a()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            }
        });
    }

    @Override // defpackage.lil
    public final synchronized int b() {
        boolean zE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        final qil qilVar = (qil) this.a.get();
        synchronized (qilVar) {
            zE = qilVar.e(qil.b, jCurrentTimeMillis);
        }
        if (!zE) {
            return 1;
        }
        synchronized (qilVar) {
            final String strB = qilVar.b(System.currentTimeMillis());
            qilVar.a.a(new Function1() { // from class: nil
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    jtw jtwVar = (jtw) obj;
                    zn20.a<String> aVar = qil.d;
                    String str = strB;
                    jtwVar.g(aVar, str);
                    qilVar.d(jtwVar, str);
                    return null;
                }
            });
        }
        return 3;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!fww.a(this.b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new Callable() { // from class: vcd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zcd zcdVar = this.a;
                    synchronized (zcdVar) {
                        final qil qilVar = (qil) zcdVar.a.get();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        final String strA = zcdVar.c.get().a();
                        synchronized (qilVar) {
                            final String strB = qilVar.b(jCurrentTimeMillis);
                            final zn20.a<Set<String>> aVarG = co20.g(strA);
                            qilVar.a.a(new Function1() { // from class: mil
                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Object obj2;
                                    qil qilVar2 = qilVar;
                                    String str = strB;
                                    String str2 = strA;
                                    zn20.a<?> aVar = aVarG;
                                    jtw jtwVar = (jtw) obj;
                                    Object obj3 = null;
                                    if (((String) y7p.a(jtwVar, qil.d, "")).equals(str)) {
                                        zn20.a<Set<String>> aVarC = qilVar2.c(jtwVar, str);
                                        if (aVarC == null || aVarC.a.equals(str2)) {
                                            return null;
                                        }
                                        synchronized (qilVar2) {
                                            qilVar2.d(jtwVar, str);
                                            HashSet hashSet = new HashSet((Collection) y7p.a(jtwVar, aVar, new HashSet()));
                                            hashSet.add(str);
                                            jtwVar.h(aVar, hashSet);
                                        }
                                        return null;
                                    }
                                    zn20.a<Long> aVar2 = qil.c;
                                    long jLongValue = ((Long) y7p.a(jtwVar, aVar2, 0L)).longValue();
                                    if (jLongValue + 1 == 30) {
                                        synchronized (qilVar2) {
                                            try {
                                                long jLongValue2 = ((Long) y7p.a(jtwVar, aVar2, 0L)).longValue();
                                                String str3 = "";
                                                Set hashSet2 = new HashSet();
                                                String str4 = null;
                                                for (Map.Entry<zn20.a<?>, Object> entry : jtwVar.a().entrySet()) {
                                                    if (entry.getValue() instanceof Set) {
                                                        Set<String> set = (Set) entry.getValue();
                                                        for (String str5 : set) {
                                                            Object obj4 = obj3;
                                                            if (str4 == null || str4.compareTo(str5) > 0) {
                                                                str3 = entry.getKey().a;
                                                                str4 = str5;
                                                                hashSet2 = set;
                                                            }
                                                            obj3 = obj4;
                                                        }
                                                    }
                                                    obj3 = obj3;
                                                }
                                                obj2 = obj3;
                                                HashSet hashSet3 = new HashSet(hashSet2);
                                                hashSet3.remove(str4);
                                                jtwVar.h(co20.g(str3), hashSet3);
                                                aVar2 = qil.c;
                                                jLongValue = jLongValue2 - 1;
                                                jtwVar.g(aVar2, Long.valueOf(jLongValue));
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                    HashSet hashSet4 = new HashSet((Collection) y7p.a(jtwVar, aVar, new HashSet()));
                                    hashSet4.add(str);
                                    jtwVar.h(aVar, hashSet4);
                                    jtwVar.h(aVar2, Long.valueOf(jLongValue + 1));
                                    jtwVar.g(qil.d, str);
                                    return obj2;
                                }
                            });
                        }
                    }
                    return null;
                }
            });
        }
    }
}
