package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Llv50;", "", "<init>", "()V", "c", "a", "d", "b", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class lv50 {
    public j1b a;
    public CoroutineContext b;
    public Executor c;
    public hqg0 d;
    public fv50 e;
    public o0p f;
    public boolean h;
    public final ys7 g = new ys7(new e(0, this, lv50.class, "onClosed", "onClosed()V", 0));
    public final ThreadLocal<CoroutineContext> i = new ThreadLocal<>();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public static class a<T extends lv50> {
        public final dq7 a;
        public final Context b;
        public final String c;
        public final ArrayList d;
        public final ArrayList e;
        public Executor f;
        public Executor g;
        public suj0 h;
        public boolean i;
        public c j;
        public final d k;
        public final LinkedHashSet l;
        public final LinkedHashSet m;
        public final ArrayList n;
        public boolean o;
        public boolean p;
        public boolean q;

        public a(Context context, Class<T> cls, String str) {
            context.getClass();
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.j = c.a;
            this.k = new d();
            this.l = new LinkedHashSet();
            this.m = new LinkedHashSet();
            this.n = new ArrayList();
            this.o = true;
            this.a = jq40.a(cls);
            this.b = context;
            this.c = str;
        }

        public final void a(upv... upvVarArr) {
            for (upv upvVar : upvVarArr) {
                Integer numValueOf = Integer.valueOf(upvVar.a);
                LinkedHashSet linkedHashSet = this.m;
                linkedHashSet.add(numValueOf);
                linkedHashSet.add(Integer.valueOf(upvVar.b));
            }
            for (upv upvVar2 : (upv[]) Arrays.copyOf(upvVarArr, upvVarArr.length)) {
                this.k.a(upvVar2);
            }
        }

        public final T b() {
            String name;
            tv50 tv50Var;
            LinkedHashMap linkedHashMap;
            List<Object> list;
            int size;
            boolean[] zArr;
            Iterator<ygp<Object>> it;
            wfe0 wfe0VarD;
            wfe0 wfe0VarD2;
            boolean zContainsKey;
            Executor executor = this.f;
            if (executor == null && this.g == null) {
                ew0 ew0Var = fw0.f;
                this.g = ew0Var;
                this.f = ew0Var;
            } else if (executor != null && this.g == null) {
                this.g = executor;
            } else if (executor == null) {
                this.f = this.g;
            }
            LinkedHashSet linkedHashSet = this.m;
            boolean zIsEmpty = linkedHashSet.isEmpty();
            LinkedHashSet linkedHashSet2 = this.l;
            if (!zIsEmpty) {
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                        kb5.a(hce0.a(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                        return null;
                    }
                }
            }
            wfe0.c uziVar = this.h;
            if (uziVar == null) {
                uziVar = new uzi();
            }
            wfe0.c cVar = uziVar;
            boolean z = this.i;
            c cVar2 = this.j;
            Context context = this.b;
            context.getClass();
            if (cVar2 == c.a) {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                cVar2 = (activityManager == null || activityManager.isLowRamDevice()) ? c.b : c.c;
            }
            c cVar3 = cVar2;
            Executor executor2 = this.f;
            if (executor2 == null) {
                hb5.a("Required value was null.");
                return null;
            }
            Executor executor3 = this.g;
            if (executor3 == null) {
                hb5.a("Required value was null.");
                return null;
            }
            esc escVar = new esc(context, this.c, cVar, this.k, this.d, z, cVar3, executor2, executor3, null, this.o, this.p, linkedHashSet2, null, null, null, this.e, this.n, this.q, null, null);
            Class clsB = tgp.b(this.a);
            Package r0 = clsB.getPackage();
            if (r0 == null || (name = r0.getName()) == null) {
                name = "";
            }
            String canonicalName = clsB.getCanonicalName();
            canonicalName.getClass();
            if (name.length() != 0) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strReplace = canonicalName.replace('.', '_');
            strReplace.getClass();
            String strConcat = strReplace.concat("_Impl");
            try {
                Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsB.getClassLoader());
                cls.getClass();
                T t = (T) cls.getDeclaredConstructor(null).newInstance(null);
                t.getClass();
                t.k = true;
                try {
                    uv50 uv50VarF = t.f();
                    uv50VarF.getClass();
                    tv50Var = (tv50) uv50VarF;
                    while (true) {
                        int i = -1;
                        if (!it.hasNext()) {
                            int size2 = list.size() - 1;
                            if (size2 >= 0) {
                                while (true) {
                                    int i2 = size2 - 1;
                                    if (size2 >= size || !zArr[size2]) {
                                        hb5.a("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                        return null;
                                    }
                                    if (i2 < 0) {
                                        break;
                                    }
                                    size2 = i2;
                                }
                            }
                            for (upv upvVar : t.d(linkedHashMap)) {
                                int i3 = upvVar.a;
                                int i4 = upvVar.b;
                                d dVar = escVar.d;
                                LinkedHashMap linkedHashMap2 = dVar.a;
                                if (linkedHashMap2.containsKey(Integer.valueOf(i3))) {
                                    Map map = (Map) linkedHashMap2.get(Integer.valueOf(i3));
                                    if (map == null) {
                                        map = o2g.a;
                                        map.getClass();
                                    }
                                    zContainsKey = map.containsKey(Integer.valueOf(i4));
                                } else {
                                    zContainsKey = false;
                                }
                                if (!zContainsKey) {
                                    dVar.a(upvVar);
                                }
                            }
                            LinkedHashMap linkedHashMapN = t.n();
                            List<Object> list2 = escVar.q;
                            boolean[] zArr2 = new boolean[list2.size()];
                            for (Map.Entry entry : linkedHashMapN.entrySet()) {
                                ygp ygpVar = (ygp) entry.getKey();
                                for (ygp ygpVar2 : (List) entry.getValue()) {
                                    int size3 = list2.size() - 1;
                                    if (size3 < 0) {
                                        size3 = -1;
                                        break;
                                    }
                                    while (true) {
                                        int i5 = size3 - 1;
                                        if (ygpVar2.h(list2.get(size3))) {
                                            zArr2[size3] = true;
                                            break;
                                        }
                                        if (i5 < 0) {
                                            size3 = -1;
                                            break;
                                        }
                                        size3 = i5;
                                    }
                                    if (size3 < 0) {
                                        throw new IllegalArgumentException(("A required type converter (" + ygpVar2.i() + ") for " + ygpVar.i() + " is missing in the database configuration.").toString());
                                    }
                                    Object obj = list2.get(size3);
                                    ygpVar2.getClass();
                                    obj.getClass();
                                    t.j.put(ygpVar2, obj);
                                }
                            }
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i6 = size4 - 1;
                                    if (!zArr2[size4]) {
                                        hb5.a(aya.b(list2.get(size4), "Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                                        return null;
                                    }
                                    if (i6 < 0) {
                                        break;
                                    }
                                    size4 = i6;
                                }
                            }
                            t.c = escVar.h;
                            t.d = new hqg0(escVar.i);
                            Executor executor4 = t.c;
                            if (executor4 == null) {
                                Intrinsics.n("internalQueryExecutor");
                                throw null;
                            }
                            j1b j1bVarA = w5b.a(gf8.a(executor4).plus(lfe0.a()));
                            t.a = j1bVarA;
                            CoroutineContext coroutineContext = j1bVarA.a;
                            hqg0 hqg0Var = t.d;
                            if (hqg0Var == null) {
                                Intrinsics.n("internalTransactionExecutor");
                                throw null;
                            }
                            t.b = coroutineContext.plus(gf8.a(hqg0Var));
                            t.h = escVar.f;
                            fv50 fv50Var = t.e;
                            if (fv50Var == null) {
                                Intrinsics.n("connectionManager");
                                throw null;
                            }
                            wfe0 wfe0Var = fv50Var.g;
                            if (wfe0Var == null) {
                                wfe0VarD = null;
                                break;
                            }
                            wfe0VarD = wfe0Var;
                            while (!(wfe0VarD instanceof zl20)) {
                                if (!(wfe0VarD instanceof ukd)) {
                                    wfe0VarD = null;
                                    break;
                                }
                                wfe0VarD = ((ukd) wfe0VarD).d();
                            }
                            fv50 fv50Var2 = t.e;
                            if (fv50Var2 == null) {
                                Intrinsics.n("connectionManager");
                                throw null;
                            }
                            wfe0 wfe0Var2 = fv50Var2.g;
                            if (wfe0Var2 == null) {
                                wfe0VarD2 = null;
                                break;
                            }
                            wfe0VarD2 = wfe0Var2;
                            while (!(wfe0VarD2 instanceof wc1)) {
                                if (!(wfe0VarD2 instanceof ukd)) {
                                    wfe0VarD2 = null;
                                    break;
                                }
                                wfe0VarD2 = ((ukd) wfe0VarD2).d();
                            }
                            if (((wc1) wfe0VarD2) == null) {
                                return t;
                            }
                            throw null;
                        }
                        ygp<Object> next = it.next();
                        int size5 = list.size() - 1;
                        if (size5 >= 0) {
                            while (true) {
                                int i7 = size5 - 1;
                                if (next.h(list.get(size5))) {
                                    zArr[size5] = true;
                                    i = size5;
                                    break;
                                }
                                if (i7 < 0) {
                                    break;
                                }
                                size5 = i7;
                            }
                        }
                        if (i < 0) {
                            efx.a(next.i(), "A required auto migration spec (", ") is missing in the database configuration.");
                            return null;
                        }
                        linkedHashMap.put(next, list.get(i));
                    }
                } catch (czx unused) {
                    tv50Var = null;
                }
                t.e = tv50Var == null ? new fv50(escVar, new iv50(t), new mv50(2, t, qv50.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1)) : new fv50(escVar, tv50Var, new nv50(2, t, qv50.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1));
                t.f = t.e();
                linkedHashMap = new LinkedHashMap();
                Set<ygp<Object>> setL = t.l();
                list = escVar.r;
                size = list.size();
                zArr = new boolean[size];
                it = setL.iterator();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Cannot find implementation for " + clsB.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
            } catch (IllegalAccessException e2) {
                jk40.a(kv50.a(clsB, new StringBuilder("Cannot access the constructor ")), e2);
                return null;
            } catch (InstantiationException e3) {
                jk40.a(kv50.a(clsB, new StringBuilder("Failed to create an instance of ")), e3);
                return null;
            }
        }

        @fae
        public final void c() {
            this.o = false;
            this.p = true;
        }
    }

    public static abstract class b {
        public void a(vfe0 vfe0Var) {
            vfe0Var.getClass();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final /* synthetic */ c[] d;

        static {
            c cVar = new c("AUTOMATIC", 0);
            a = cVar;
            c cVar2 = new c("TRUNCATE", 1);
            b = cVar2;
            c cVar3 = new c("WRITE_AHEAD_LOGGING", 2);
            c = cVar3;
            d = new c[]{cVar, cVar2, cVar3};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) d.clone();
        }
    }

    public static class d {
        public final LinkedHashMap a = new LinkedHashMap();

        public final void a(upv upvVar) {
            upvVar.getClass();
            int i = upvVar.a;
            int i2 = upvVar.b;
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.a;
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + upvVar);
            }
            treeMap2.put(Integer.valueOf(i2), upvVar);
        }
    }

    public static final /* synthetic */ class e extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() throws Exception {
            lv50 lv50Var = (lv50) this.receiver;
            j1b j1bVar = lv50Var.a;
            if (j1bVar == null) {
                Intrinsics.n("coroutineScope");
                throw null;
            }
            w5b.c(j1bVar, null);
            lv50Var.j();
            fv50 fv50Var = lv50Var.e;
            if (fv50Var == null) {
                Intrinsics.n("connectionManager");
                throw null;
            }
            fv50Var.f.close();
            wfe0 wfe0Var = fv50Var.g;
            if (wfe0Var != null) {
                wfe0Var.close();
            }
            return Unit.a;
        }
    }

    public final void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ib5.a("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!p() || q()) {
            return;
        }
        CoroutineContext coroutineContext = this.i.get();
        if ((coroutineContext != null ? (fqg0) coroutineContext.get(fqg0.b) : null) == null) {
            return;
        }
        ib5.a("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    @fae
    public final void c() {
        a();
        a();
        vfe0 vfe0VarF1 = k().f1();
        if (!vfe0VarF1.s()) {
            u160.a(new q0p(j(), null));
        }
        if (vfe0VarF1.y1()) {
            vfe0VarF1.O();
        } else {
            vfe0VarF1.v();
        }
    }

    public List d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(jpu.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(tgp.b((ygp) entry.getKey()), entry.getValue());
        }
        return h(linkedHashMap2);
    }

    public abstract o0p e();

    public uv50 f() {
        throw new czx(null, 1, null);
    }

    @fae
    public wfe0 g(esc escVar) {
        throw new czx(null, 1, null);
    }

    @fae
    public List h(LinkedHashMap linkedHashMap) {
        return m2g.a;
    }

    public final v5b i() {
        j1b j1bVar = this.a;
        if (j1bVar != null) {
            return j1bVar;
        }
        Intrinsics.n("coroutineScope");
        throw null;
    }

    public final o0p j() {
        o0p o0pVar = this.f;
        if (o0pVar != null) {
            return o0pVar;
        }
        Intrinsics.n("internalTracker");
        throw null;
    }

    public final wfe0 k() {
        fv50 fv50Var = this.e;
        if (fv50Var == null) {
            Intrinsics.n("connectionManager");
            throw null;
        }
        wfe0 wfe0Var = fv50Var.g;
        if (wfe0Var != null) {
            return wfe0Var;
        }
        ib5.a("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set<ygp<Object>> l() {
        Set<Class<Object>> setM = m();
        ArrayList arrayList = new ArrayList(l48.r(setM, 10));
        Iterator<T> it = setM.iterator();
        while (it.hasNext()) {
            arrayList.add(tgp.d((Class) it.next()));
        }
        return CollectionsKt.E0(arrayList);
    }

    @fae
    public Set<Class<Object>> m() {
        return t3g.a;
    }

    public LinkedHashMap n() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = o().entrySet();
        int iA = jpu.a(l48.r(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            dq7 dq7VarD = tgp.d(cls);
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(tgp.d((Class) it2.next()));
            }
            linkedHashMap.put(dq7VarD, arrayList);
        }
        return linkedHashMap;
    }

    public Map<Class<?>, List<Class<?>>> o() {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return o2gVar;
    }

    public final boolean p() {
        fv50 fv50Var = this.e;
        if (fv50Var != null) {
            return fv50Var.g != null;
        }
        Intrinsics.n("connectionManager");
        throw null;
    }

    public final boolean q() {
        return t() && k().f1().s();
    }

    public final void r() {
        k().f1().W();
        if (q()) {
            return;
        }
        o0p o0pVarJ = j();
        o0pVarJ.b.d(o0pVarJ.e, o0pVarJ.f);
    }

    public final void s(vp60 vp60Var) {
        vp60Var.getClass();
        o0p o0pVarJ = j();
        twg0 twg0Var = o0pVarJ.b;
        twg0Var.getClass();
        hq60 hq60VarH1 = vp60Var.H1("PRAGMA query_only");
        try {
            hq60VarH1.D1();
            boolean zT0 = hq60VarH1.T0();
            vc1.a(hq60VarH1, null);
            if (!zT0) {
                up60.a(vp60Var, "PRAGMA temp_store = MEMORY");
                up60.a(vp60Var, "PRAGMA recursive_triggers = 1");
                up60.a(vp60Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (twg0Var.d) {
                    up60.a(vp60Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    up60.a(vp60Var, kotlin.text.c.p("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                hfy hfyVar = twg0Var.h;
                ReentrantLock reentrantLock = hfyVar.a;
                reentrantLock.lock();
                try {
                    hfyVar.e = true;
                    Unit unit = Unit.a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (o0pVarJ.g) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                vc1.a(hq60VarH1, th2);
                throw th3;
            }
        }
    }

    public final boolean t() {
        fv50 fv50Var = this.e;
        if (fv50Var == null) {
            Intrinsics.n("connectionManager");
            throw null;
        }
        vfe0 vfe0Var = fv50Var.h;
        if (vfe0Var != null) {
            return vfe0Var.isOpen();
        }
        return false;
    }

    public final <T> T u(Function0<? extends T> function0) {
        if (p()) {
            c();
            try {
                T tInvoke = function0.invoke();
                v();
                return tInvoke;
            } finally {
                r();
            }
        }
        jv50 jv50Var = new jv50(function0, 0);
        a();
        b();
        CoroutineContext coroutineContext = this.i.get();
        if (coroutineContext == null) {
            coroutineContext = kotlin.coroutines.e.a;
        }
        return (T) u160.a(new llc(coroutineContext, this, jv50Var, null));
    }

    @fae
    public final void v() {
        k().f1().N();
    }

    public final Object w(boolean z, Function2 function2, x1b x1bVar) {
        fv50 fv50Var = this.e;
        if (fv50Var != null) {
            return fv50Var.f.w0(z, function2, x1bVar);
        }
        Intrinsics.n("connectionManager");
        throw null;
    }
}
