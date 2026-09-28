package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import z950.a;

/* JADX INFO: loaded from: classes4.dex */
public final class ah80 {
    public final mtb a;
    public final ytb b;
    public final asc c;
    public final ift d;
    public final oph0 e;
    public final x6n f;
    public final mub g;

    public ah80(mtb mtbVar, ytb ytbVar, asc ascVar, ift iftVar, oph0 oph0Var, x6n x6nVar, mub mubVar) {
        this.a = mtbVar;
        this.b = ytbVar;
        this.c = ascVar;
        this.d = iftVar;
        this.e = oph0Var;
        this.f = x6nVar;
        this.g = mubVar;
    }

    public static ih1 a(ih1 ih1Var, ift iftVar, oph0 oph0Var, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        ktb.e.d.a.b bVar;
        ih1.a aVarG = ih1Var.g();
        String strB = iftVar.b.b();
        if (strB != null) {
            aVarG.e = new sh1(strB);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean zIsEmpty = map.isEmpty();
        oph0.a aVar = oph0Var.d;
        if (zIsEmpty) {
            lpp reference = aVar.a.getReference();
            synchronized (reference) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(reference.a));
            }
        } else {
            lpp reference2 = aVar.a.getReference();
            synchronized (reference2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference2.a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strA = lpp.a(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strA)) {
                    map2.put(strA, lpp.a(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List<ktb.c> listE = e(mapUnmodifiableMap2);
        lpp reference3 = oph0Var.e.a.getReference();
        synchronized (reference3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(reference3.a));
        }
        List<ktb.c> listE2 = e(mapUnmodifiableMap3);
        if (!listE.isEmpty() || !listE2.isEmpty()) {
            jh1.a aVarH = ih1Var.c.h();
            aVarH.b = listE;
            aVarH.c = listE2;
            if (aVarH.h != 1 || (bVar = aVarH.a) == null) {
                StringBuilder sb = new StringBuilder();
                if (aVarH.a == null) {
                    sb.append(" execution");
                }
                if ((aVarH.h & 1) == 0) {
                    sb.append(" uiOrientation");
                }
                ib5.a(ltb.a(sb, "Missing required properties:"));
                return null;
            }
            aVarG.c = new jh1(bVar, listE, listE2, aVarH.d, aVarH.e, aVarH.f, aVarH.g);
        }
        return aVarG.a();
    }

    public static ktb.e.d b(ih1 ih1Var, oph0 oph0Var) {
        List<vu50> listA = oph0Var.f.a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listA.size(); i++) {
            vu50 vu50Var = listA.get(i);
            th1.a aVar = new th1.a();
            String strE = vu50Var.e();
            if (strE == null) {
                bmy.a("Null variantId");
                return null;
            }
            String strC = vu50Var.c();
            if (strC == null) {
                bmy.a("Null rolloutId");
                return null;
            }
            aVar.a = new uh1(strC, strE);
            String strA = vu50Var.a();
            if (strA == null) {
                bmy.a("Null parameterKey");
                return null;
            }
            aVar.b = strA;
            String strB = vu50Var.b();
            if (strB == null) {
                bmy.a("Null parameterValue");
                return null;
            }
            aVar.c = strB;
            aVar.d = vu50Var.d();
            aVar.e = (byte) (aVar.e | 1);
            arrayList.add(aVar.a());
        }
        if (arrayList.isEmpty()) {
            return ih1Var;
        }
        ih1.a aVarG = ih1Var.g();
        aVarG.f = new vh1(arrayList);
        return aVarG.a();
    }

    public static String c(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            bufferedInputStream.close();
            throw th4;
        }
    }

    public static ah80 d(Context context, x6n x6nVar, xkh xkhVar, rr0 rr0Var, ift iftVar, oph0 oph0Var, spv spvVar, fk80 fk80Var, coy coyVar, wrb wrbVar, mub mubVar) {
        mtb mtbVar = new mtb(context, x6nVar, rr0Var, spvVar, fk80Var);
        ytb ytbVar = new ytb(xkhVar, fk80Var, wrbVar);
        ttb ttbVar = asc.b;
        dvg0.b(context);
        return new ah80(mtbVar, ytbVar, new asc(new z950(dvg0.a().c(new bm5(asc.c, asc.d)).a("FIREBASE_CRASHLYTICS_REPORT", new j4g("json"), asc.e), fk80Var.b(), coyVar)), iftVar, oph0Var, x6nVar, mubVar);
    }

    public static List<ktb.c> e(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                bmy.a("Null key");
                return null;
            }
            String value = entry.getValue();
            if (value == null) {
                bmy.a("Null value");
                return null;
            }
            arrayList.add(new bh1(key, value));
        }
        Collections.sort(arrayList, new zg80());
        return Collections.unmodifiableList(arrayList);
    }

    public final void f(Throwable th, Thread thread, String str, final bqg bqgVar, boolean z) {
        final boolean zEquals = str.equals("crash");
        long j = bqgVar.b;
        mtb mtbVar = this.a;
        Context context = mtbVar.a;
        int i = context.getResources().getConfiguration().orientation;
        spv spvVar = mtbVar.d;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        zwg0 zwg0Var = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            zwg0Var = new zwg0(th2.getLocalizedMessage(), th2.getClass().getName(), spvVar.a(th2.getStackTrace()), zwg0Var);
        }
        ih1.a aVar = new ih1.a();
        aVar.b = str;
        aVar.a = j;
        aVar.g = (byte) (aVar.g | 1);
        ktb.e.d.a.c cVarB = ex20.a.b(context);
        Boolean boolValueOf = cVarB.a() > 0 ? Boolean.valueOf(cVarB.a() != 100) : null;
        ArrayList arrayListA = ex20.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = zwg0Var.c;
        String name = thread.getName();
        if (name == null) {
            bmy.a("Null name");
            return;
        }
        List listD = mtb.d(stackTraceElementArr, 4);
        if (listD == null) {
            bmy.a("Null frames");
            return;
        }
        arrayList.add(new oh1(name, 4, listD));
        if (z) {
            for (Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                Thread key = next.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrA = spvVar.a(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        bmy.a("Null name");
                        return;
                    }
                    List listD2 = mtb.d(stackTraceElementArrA, 0);
                    if (listD2 == null) {
                        bmy.a("Null frames");
                        return;
                    }
                    arrayList.add(new oh1(name2, 0, listD2));
                }
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        mh1 mh1VarC = mtb.c(zwg0Var, 0);
        nh1 nh1VarE = mtb.e();
        List<ktb.e.d.a.b.AbstractC0786a> listA = mtbVar.a();
        if (listA == null) {
            bmy.a("Null binaries");
            return;
        }
        aVar.c = new jh1(new kh1(listUnmodifiableList, mh1VarC, null, nh1VarE, listA), null, null, boolValueOf, cVarB, arrayListA, i);
        aVar.d = mtbVar.b(i);
        ih1 ih1VarA = aVar.a();
        Map<String, String> map = bqgVar.c;
        ift iftVar = this.d;
        oph0 oph0Var = this.e;
        final ktb.e.d dVarB = b(a(ih1VarA, iftVar, oph0Var, map), oph0Var);
        if (z) {
            this.b.d(dVarB, bqgVar.a, zEquals);
        } else {
            this.g.b.a(new Runnable() { // from class: xg80
                @Override // java.lang.Runnable
                public final void run() {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                    }
                    this.a.b.d(dVarB, bqgVar.a, zEquals);
                }
            });
        }
    }

    public final Task<Void> g(Executor executor, String str) {
        TaskCompletionSource<ztb> taskCompletionSource;
        ArrayList arrayListB = this.b.b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            File file = (File) arrayListB.get(i);
            try {
                ttb ttbVar = ytb.g;
                String strE = ytb.e(file);
                ttbVar.getClass();
                arrayList.add(new yg1(ttb.i(strE), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            ztb yg1Var = (ztb) obj;
            if (str == null || str.equals(yg1Var.c())) {
                asc ascVar = this.c;
                if (yg1Var.a().f() == null || yg1Var.a().e() == null) {
                    lph lphVarB = this.f.b(true);
                    ktb ktbVarA = yg1Var.a();
                    String str2 = lphVarB.a;
                    xg1.a aVarM = ktbVarA.m();
                    aVarM.e = str2;
                    xg1 xg1VarA = aVarM.a();
                    String str3 = lphVarB.b;
                    xg1.a aVarM2 = xg1VarA.m();
                    aVarM2.f = str3;
                    yg1Var = new yg1(aVarM2.a(), yg1Var.c(), yg1Var.b());
                }
                boolean z = str != null;
                z950 z950Var = ascVar.a;
                String str4 = QWvyvNzGsBpRT.RdoGkTMiug;
                synchronized (z950Var.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource<>();
                        if (z) {
                            z950Var.i.a.getAndIncrement();
                            if (z950Var.f.size() < z950Var.e) {
                                ngt ngtVar = ngt.a;
                                ngtVar.b("Enqueueing report: " + yg1Var.c());
                                ngtVar.b("Queue size: " + z950Var.f.size());
                                z950Var.g.execute(z950Var.new a(yg1Var, taskCompletionSource));
                                ngtVar.b("Closing task for report: " + yg1Var.c());
                                taskCompletionSource.trySetResult(yg1Var);
                            } else {
                                z950Var.a();
                                String str5 = str4 + yg1Var.c();
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str5, null);
                                }
                                z950Var.i.b.getAndIncrement();
                                taskCompletionSource.trySetResult(yg1Var);
                            }
                        } else {
                            z950Var.b(yg1Var, taskCompletionSource);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new yg80()));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
