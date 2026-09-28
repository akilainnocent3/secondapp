package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: loaded from: classes4.dex */
public final class esb {
    public static final yrb r = new yrb();
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final toc b;
    public final vsb c;
    public final oph0 d;
    public final mub e;
    public final x6n f;
    public final xkh g;
    public final rr0 h;
    public final ift i;
    public final gtb j;
    public final c00 k;
    public final wrb l;
    public final ah80 m;
    public fub n;
    public final TaskCompletionSource<Boolean> o = new TaskCompletionSource<>();
    public final TaskCompletionSource<Boolean> p = new TaskCompletionSource<>();
    public final TaskCompletionSource<Void> q = new TaskCompletionSource<>();

    public class a implements SuccessContinuation<Boolean, Void> {
        public final /* synthetic */ Task a;

        public a(Task task) {
            this.a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public final Task<Void> then(Boolean bool) {
            Boolean bool2 = bool;
            boolean zBooleanValue = bool2.booleanValue();
            esb esbVar = esb.this;
            if (zBooleanValue) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean zBooleanValue2 = bool2.booleanValue();
                toc tocVar = esbVar.b;
                if (!zBooleanValue2) {
                    ib5.a("An invalid data collection token was used.");
                    return null;
                }
                tocVar.h.trySetResult(null);
                return this.a.onSuccessTask(esbVar.e.a, new dsb(this));
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            xkh xkhVar = esbVar.g;
            Iterator it = xkh.e(xkhVar.c.listFiles(esb.r)).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            xkh xkhVar2 = esbVar.m.b.b;
            ytb.a(xkh.e(xkhVar2.e.listFiles()));
            ytb.a(xkh.e(xkhVar2.f.listFiles()));
            ytb.a(xkh.e(xkhVar2.g.listFiles()));
            esbVar.q.trySetResult(null);
            return Tasks.forResult(null);
        }
    }

    public esb(Context context, x6n x6nVar, toc tocVar, xkh xkhVar, vsb vsbVar, rr0 rr0Var, oph0 oph0Var, ift iftVar, ah80 ah80Var, gtb gtbVar, c00 c00Var, wrb wrbVar, mub mubVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = x6nVar;
        this.b = tocVar;
        this.g = xkhVar;
        this.c = vsbVar;
        this.h = rr0Var;
        this.d = oph0Var;
        this.i = iftVar;
        this.j = gtbVar;
        this.k = c00Var;
        this.l = wrbVar;
        this.m = ah80Var;
        this.e = mubVar;
    }

    public final boolean c(fk80 fk80Var) {
        mub.a();
        fub fubVar = this.n;
        if (fubVar != null && fubVar.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            a(true, fk80Var, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String d() {
        NavigableSet navigableSetC = this.m.b.c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String e() throws IOException {
        InputStream resourceAsStream;
        Context context = this.a;
        int iC = ti8.c(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iC == 0 ? null : context.getResources().getString(iC);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = esb.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = resourceAsStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        resourceAsStream.close();
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
            resourceAsStream.close();
            throw th4;
        }
    }

    public final Task<Void> f() {
        Task taskCall;
        ArrayList arrayList = new ArrayList();
        for (File file : xkh.e(this.g.c.listFiles(r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new fsb(this, j));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public final void g() {
        try {
            String strE = e();
            if (strE != null) {
                try {
                    this.d.e.b("com.crashlytics.version-control-info", strE);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final void h(Task<aj80> task) {
        Task<Void> task2;
        Task taskA;
        TaskCompletionSource<Boolean> taskCompletionSource = this.o;
        xkh xkhVar = this.m.b.b;
        if (xkh.e(xkhVar.e.listFiles()).isEmpty() && xkh.e(xkhVar.f.listFiles()).isEmpty() && xkh.e(xkhVar.g.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        ngt ngtVar = ngt.a;
        ngtVar.c("Crash reports are available to be sent.");
        toc tocVar = this.b;
        if (tocVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskA = Tasks.forResult(Boolean.TRUE);
        } else {
            ngtVar.b("Automatic data collection is disabled.");
            ngtVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (tocVar.c) {
                task2 = tocVar.d.getTask();
            }
            Task<TContinuationResult> taskOnSuccessTask = task2.onSuccessTask(new csb());
            ngtVar.b("Waiting for send/deleteUnsentReports to be called.");
            taskA = cub.a(taskOnSuccessTask, this.p.getTask());
        }
        taskA.onSuccessTask(this.e.a, new a(task));
    }

    /* JADX WARN: Code duplicated, block: B:179:0x055d  */
    /* JADX WARN: Code duplicated, block: B:43:0x011e  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x011e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [wrb] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22, types: [int] */
    /* JADX WARN: Type inference failed for: r9v24 */
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
    public final void a(boolean z, fk80 fk80Var, boolean z2) {
        ah80 ah80Var;
        int i;
        boolean z3;
        int i2;
        int i3;
        ?? r11;
        boolean z4;
        String str;
        String strSubstring;
        boolean z5;
        String[] list;
        Object obj;
        List<vu50> listB;
        ApplicationExitInfo next;
        String strC;
        List<ktb.a.AbstractC0783a> listUnmodifiableList;
        Closeable closeable;
        FileInputStream fileInputStream;
        gtb gtbVar = this.j;
        mub.a();
        ah80 ah80Var2 = this.m;
        ArrayList arrayList = new ArrayList(ah80Var2.b.c());
        if (arrayList.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str2 = (String) arrayList.get(z == true ? 1 : 0);
        if (z2 && fk80Var.b().b.b) {
            xkh xkhVar = this.g;
            int i4 = Build.VERSION.SDK_INT;
            i2 = 4;
            if (i4 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    ift iftVar = new ift(xkhVar);
                    i3 = 8;
                    iftVar.b = ift.c;
                    if (str2 != null) {
                        iftVar.b = new lb30(xkhVar.b(str2, "userlog"));
                    }
                    mub mubVar = this.e;
                    tov tovVar = new tov(xkhVar);
                    oph0 oph0Var = new oph0(str2, xkhVar, mubVar);
                    oph0Var.d.a.getReference().c(tovVar.c(str2, false));
                    oph0Var.e.a.getReference().c(tovVar.c(str2, true));
                    oph0Var.g.set(tovVar.d(str2), false);
                    wu50 wu50Var = oph0Var.f;
                    File fileB = xkhVar.b(str2, "rollouts-state");
                    if (fileB.exists()) {
                        try {
                            if (fileB.length() == 0) {
                                tov.g(fileB, "The file has a length of zero for session: " + str2);
                                listB = Collections.EMPTY_LIST;
                            } else {
                                try {
                                    fileInputStream = new FileInputStream(fileB);
                                    try {
                                        listB = tov.b(ti8.h(fileInputStream));
                                        String str3 = "Loaded rollouts state:\n" + listB + rarBonoqWB.KruI + str2;
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", str3, null);
                                        }
                                        ti8.b(fileInputStream, "Failed to close rollouts state file.");
                                    } catch (Exception e) {
                                        e = e;
                                        Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                        tov.f(fileB);
                                        ti8.b(fileInputStream, "Failed to close rollouts state file.");
                                        listB = Collections.EMPTY_LIST;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    fileInputStream = null;
                                } catch (Throwable th) {
                                    th = th;
                                    closeable = null;
                                    ti8.b(closeable, "Failed to close rollouts state file.");
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            closeable = null;
                        }
                    } else {
                        tov.g(fileB, "The file has a length of zero for session: " + str2);
                        listB = Collections.EMPTY_LIST;
                    }
                    wu50Var.b(listB);
                    ytb ytbVar = ah80Var2.b;
                    long jLastModified = ytbVar.b.b(str2, "start-time").lastModified();
                    Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            if (next.getTimestamp() < jLastModified) {
                            }
                        }
                        next = null;
                        break;
                    } while (next.getReason() != 6);
                    if (next == null) {
                        String strA = inm.a("No relevant ApplicationExitInfo occurred during session: ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strA, null);
                        }
                        ah80Var = ah80Var2;
                        z3 = true;
                    } else {
                        mtb mtbVar = ah80Var2.a;
                        try {
                            InputStream traceInputStream = next.getTraceInputStream();
                            strC = traceInputStream != null ? ah80.c(traceInputStream) : null;
                        } catch (IOException e3) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + next.toString() + " Error: " + e3, null);
                        }
                        zg1.a aVar = new zg1.a();
                        aVar.d = next.getImportance();
                        aVar.j = (byte) (aVar.j | 4);
                        String processName = next.getProcessName();
                        if (processName == null) {
                            bmy.a("Null processName");
                            return;
                        }
                        aVar.b = processName;
                        aVar.c = next.getReason();
                        aVar.j = (byte) (aVar.j | 2);
                        aVar.g = next.getTimestamp();
                        aVar.j = (byte) (aVar.j | 32);
                        aVar.a = next.getPid();
                        aVar.j = (byte) (aVar.j | 1);
                        aVar.e = next.getPss();
                        aVar.j = (byte) (aVar.j | 8);
                        aVar.f = next.getRss();
                        aVar.j = (byte) (aVar.j | 16);
                        aVar.h = strC;
                        zg1 zg1VarA = aVar.a();
                        int i5 = mtbVar.a.getResources().getConfiguration().orientation;
                        ih1.a aVar2 = new ih1.a();
                        aVar2.b = "anr";
                        aVar2.a = zg1VarA.g;
                        aVar2.g = (byte) (aVar2.g | 1);
                        rr0 rr0Var = mtbVar.c;
                        if (!mtbVar.e.b().b.c || rr0Var.c.size() <= 0) {
                            ah80Var = ah80Var2;
                            listUnmodifiableList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = rr0Var.c;
                            int size = arrayList3.size();
                            int i6 = 0;
                            while (i6 < size) {
                                Object obj2 = arrayList3.get(i6);
                                int i7 = i6 + 1;
                                bj5 bj5Var = (bj5) obj2;
                                ArrayList arrayList4 = arrayList3;
                                String str4 = bj5Var.a;
                                if (str4 == null) {
                                    bmy.a("Null libraryName");
                                    return;
                                }
                                int i8 = size;
                                String str5 = bj5Var.b;
                                if (str5 == null) {
                                    bmy.a("Null arch");
                                    return;
                                }
                                String str6 = bj5Var.c;
                                if (str6 == null) {
                                    bmy.a("Null buildId");
                                    return;
                                }
                                arrayList2.add(new ah1(str5, str4, str6));
                                i6 = i7;
                                arrayList3 = arrayList4;
                                size = i8;
                                ah80Var2 = ah80Var2;
                            }
                            ah80Var = ah80Var2;
                            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                        }
                        zg1.a aVar3 = new zg1.a();
                        aVar3.d = zg1VarA.d;
                        byte b = (byte) (aVar3.j | 4);
                        aVar3.j = b;
                        String str7 = zg1VarA.b;
                        if (str7 == null) {
                            bmy.a("Null processName");
                            return;
                        }
                        aVar3.b = str7;
                        aVar3.c = zg1VarA.c;
                        aVar3.g = zg1VarA.g;
                        aVar3.a = zg1VarA.a;
                        aVar3.e = zg1VarA.e;
                        aVar3.f = zg1VarA.f;
                        aVar3.j = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 32)) | 1)) | 8)) | 16);
                        aVar3.h = zg1VarA.h;
                        aVar3.i = listUnmodifiableList;
                        zg1 zg1VarA2 = aVar3.a();
                        Boolean boolValueOf = Boolean.valueOf(zg1VarA2.d != 100);
                        String str8 = zg1VarA2.b;
                        int i9 = zg1VarA2.a;
                        int i10 = zg1VarA2.d;
                        str8.getClass();
                        qh1.a aVar4 = new qh1.a();
                        aVar4.a = str8;
                        aVar4.b = i9;
                        byte b2 = (byte) (aVar4.e | 1);
                        aVar4.c = i10;
                        aVar4.d = false;
                        aVar4.e = (byte) (((byte) (b2 | 2)) | 4);
                        qh1 qh1VarA = aVar4.a();
                        nh1 nh1VarE = mtb.e();
                        List<ktb.e.d.a.b.AbstractC0786a> listA = mtbVar.a();
                        if (listA == null) {
                            bmy.a("Null binaries");
                            return;
                        }
                        aVar2.c = new jh1(new kh1(null, null, zg1VarA2, nh1VarE, listA), null, null, boolValueOf, qh1VarA, null, i5);
                        aVar2.d = mtbVar.b(i5);
                        ih1 ih1VarA = aVar2.a();
                        String strA2 = inm.a("Persisting anr for session ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strA2, null);
                        }
                        z3 = true;
                        ytbVar.d(ah80.b(ah80.a(ih1VarA, iftVar, oph0Var, Collections.EMPTY_MAP), oph0Var), str2, true);
                    }
                    i = 2;
                } else {
                    ah80Var = ah80Var2;
                    z3 = true;
                    i3 = 8;
                    String strA3 = inm.a("No ApplicationExitInfo available. Session: ", str2);
                    i = 2;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        r11 = 0;
                        Log.v("FirebaseCrashlytics", strA3, null);
                    }
                }
                r11 = 0;
            } else {
                ah80Var = ah80Var2;
                i = 2;
                obj = null;
                z3 = true;
                i3 = 8;
                String strA4 = hce0.a(i4, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    r11 = obj;
                    Log.v("FirebaseCrashlytics", strA4, null);
                    r11 = obj;
                }
            }
        } else {
            ah80Var = ah80Var2;
            i = 2;
            Object obj3 = null;
            z3 = true;
            i2 = 4;
            i3 = 8;
            r11 = obj3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
                r11 = obj3;
            }
        }
        if (z2 && gtbVar.d(str2)) {
            String strA5 = inm.a("Finalizing native report for session ", str2);
            if (Log.isLoggable("FirebaseCrashlytics", i)) {
                Log.v("FirebaseCrashlytics", strA5, r11);
            }
            gtbVar.a(str2).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str2, r11);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str2, r11);
            Log.w("FirebaseCrashlytics", "No native core present", r11);
        }
        if (z != 0) {
            z4 = false;
            str = (String) arrayList.get(0);
        } else {
            z4 = false;
            this.l.d(r11);
            str = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ytb ytbVar2 = ah80Var.b;
        xkh xkhVar2 = ytbVar2.b;
        xkhVar2.a(".com.google.firebase.crashlytics");
        xkhVar2.a(".com.google.firebase.crashlytics-ndk");
        if (!xkhVar2.a.isEmpty()) {
            xkhVar2.a(".com.google.firebase.crashlytics.files.v1");
            final String str9 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = xkhVar2.b;
            if (file.exists() && (list = file.list(new FilenameFilter() { // from class: wkh
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str10) {
                    return str10.startsWith(str9);
                }
            })) != null) {
                int length = list.length;
                for (?? r9 = z4; r9 < length; r9++) {
                    xkhVar2.a(list[r9]);
                }
            }
        }
        NavigableSet<String> navigableSetC = ytbVar2.c();
        if (str != null) {
            navigableSetC.remove(str);
        }
        int i11 = i3;
        if (navigableSetC.size() > i11) {
            while (navigableSetC.size() > i11) {
                String str10 = (String) navigableSetC.last();
                String strA6 = inm.a("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strA6, null);
                }
                xkh.d(new File(xkhVar2.d, str10));
                navigableSetC.remove(str10);
            }
        }
        for (String str11 : navigableSetC) {
            String strA7 = inm.a("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strA7, null);
            }
            ttb ttbVar = ytb.g;
            vtb vtbVar = ytb.i;
            File file2 = new File(xkhVar2.d, str11);
            file2.mkdirs();
            List<File> listE = xkh.e(file2.listFiles(vtbVar));
            if (listE.isEmpty()) {
                String strA8 = tug.a("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strA8, null);
                }
            } else {
                Collections.sort(listE);
                ArrayList arrayList5 = new ArrayList();
                boolean z6 = z4;
                for (File file3 : listE) {
                    try {
                        String strE = ytb.e(file3);
                        ttbVar.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strE));
                            try {
                                ih1 ih1VarD = ttb.d(jsonReader);
                                jsonReader.close();
                                arrayList5.add(ih1VarD);
                                if (z6) {
                                    z5 = z3;
                                } else {
                                    String name = file3.getName();
                                    if (name.startsWith(AnalyticsEvent.BI_TRACKING_KIND_EVENT) && name.endsWith("_")) {
                                        z5 = z3;
                                    } else {
                                        z5 = false;
                                    }
                                }
                                z6 = z5;
                            } catch (Throwable th3) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (IllegalStateException e4) {
                            throw new IOException(e4);
                        }
                    } catch (IOException e5) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e5);
                    }
                }
                if (arrayList5.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String strD = new tov(xkhVar2).d(str11);
                    vrb vrbVar = ytbVar2.d.b;
                    synchronized (vrbVar) {
                        if (Objects.equals(vrbVar.b, str11)) {
                            strSubstring = vrbVar.c;
                        } else {
                            xkh xkhVar3 = vrbVar.a;
                            trb trbVar = vrb.d;
                            File file4 = new File(xkhVar3.d, str11);
                            file4.mkdirs();
                            List listE2 = xkh.e(file4.listFiles(trbVar));
                            if (listE2.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                strSubstring = null;
                            } else {
                                strSubstring = ((File) Collections.min(listE2, vrb.e)).getName().substring(i2);
                            }
                        }
                    }
                    File fileB2 = xkhVar2.b(str11, "report");
                    try {
                        String strE2 = ytb.e(fileB2);
                        ttbVar.getClass();
                        xg1 xg1VarN = ttb.i(strE2).n(jCurrentTimeMillis, strD, z6);
                        xg1.a aVarM = xg1VarN.m();
                        aVarM.g = strSubstring;
                        ktb.e eVar = xg1VarN.k;
                        if (eVar != null) {
                            eh1.a aVarM2 = eVar.m();
                            aVarM2.c = strSubstring;
                            aVarM.j = aVarM2.a();
                        }
                        xg1 xg1VarA = aVarM.a();
                        if (xg1VarA.k == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        xg1.a aVarM3 = xg1VarA.m();
                        eh1.a aVarM4 = xg1VarA.k.m();
                        aVarM4.k = arrayList5;
                        aVarM3.j = aVarM4.a();
                        xg1 xg1VarA2 = aVarM3.a();
                        ktb.e eVar2 = xg1VarA2.k;
                        if (eVar2 != null) {
                            String str12 = "appQualitySessionId: " + strSubstring;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e6) {
                                        e = e6;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                                    }
                                }
                                ytb.f(z6 ? new File(xkhVar2.f, eVar2.h()) : new File(xkhVar2.e, eVar2.h()), ttb.a.a(xg1VarA2));
                            } catch (IOException e7) {
                                e = e7;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                            }
                        }
                        e = e6;
                    } catch (IOException e8) {
                        e = e8;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                }
                xkh.d(new File(xkhVar2.d, str11));
                z4 = false;
                i2 = 4;
            }
            xkh.d(new File(xkhVar2.d, str11));
            z4 = false;
            i2 = 4;
        }
        aj80.b bVar = ytbVar2.c.b().a;
        ArrayList arrayListB = ytbVar2.b();
        int size2 = arrayListB.size();
        if (size2 <= 4) {
            return;
        }
        Iterator it2 = arrayListB.subList(4, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r8v10, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final void b(Boolean bool, final String str) {
        ?? r5;
        ?? r8;
        Integer num;
        final Map mapUnmodifiableMap;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strA = inm.a("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strA, null);
        }
        Locale locale = Locale.US;
        x6n x6nVar = this.f;
        rr0 rr0Var = this.h;
        uk1 uk1Var = new uk1(x6nVar.c, rr0Var.f, rr0Var.g, x6nVar.c().a, imd.a(rr0Var.d != null ? 4 : 1), rr0Var.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        wk1 wk1Var = new wk1(ti8.f());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        ti8.a aVar = ti8.a.a;
        String str4 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str4)) {
            ti8.a aVar2 = (ti8.a) ti8.a.b.get(str4.toLowerCase(locale));
            if (aVar2 != null) {
                aVar = aVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = aVar.ordinal();
        String str5 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = ti8.a(context);
        boolean zE = ti8.e();
        boolean zE2 = ti8.e();
        ?? r6 = zE2;
        if (ti8.f()) {
            r6 = (zE2 ? 1 : 0) | 2;
        }
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            r5 = r6;
            r5 = (r6 == true ? 1 : 0) | 4;
        }
        r5 = r6;
        ?? r29 = r5;
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        this.j.c(str, jCurrentTimeMillis, new tk1(uk1Var, wk1Var, new vk1(iOrdinal, iAvailableProcessors, jA, blockCount, zE, r29 == true ? 1 : 0)));
        if (bool.booleanValue() && str != null) {
            final oph0 oph0Var = this.d;
            synchronized (oph0Var.c) {
                oph0Var.c = str;
                lpp reference = oph0Var.d.a.getReference();
                synchronized (reference) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
                }
                final List<vu50> listA = oph0Var.f.a();
                oph0Var.b.b.a(new Runnable() { // from class: kph0
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        oph0 oph0Var2 = oph0Var;
                        tov tovVar = oph0Var2.a;
                        AtomicMarkableReference<String> atomicMarkableReference = oph0Var2.g;
                        String reference2 = atomicMarkableReference.getReference();
                        String str8 = str;
                        if (reference2 != null) {
                            tovVar.j(str8, atomicMarkableReference.getReference());
                        }
                        Map<String, String> map = mapUnmodifiableMap;
                        if (!map.isEmpty()) {
                            tovVar.h(str8, map, false);
                        }
                        List<vu50> list = listA;
                        if (list.isEmpty()) {
                            return;
                        }
                        tovVar.i(str8, list);
                    }
                });
            }
        }
        ift iftVar = this.i;
        iftVar.b.a();
        iftVar.b = ift.c;
        if (str != null) {
            iftVar.b = new lb30(iftVar.a.b(str, "userlog"));
        }
        this.l.d(str);
        ah80 ah80Var = this.m;
        mtb mtbVar = ah80Var.a;
        Charset charset = ktb.a;
        xg1.a aVar3 = new xg1.a();
        aVar3.a = "20.0.1";
        rr0 rr0Var2 = mtbVar.c;
        String str8 = rr0Var2.a;
        if (str8 == null) {
            bmy.a("Null gmpAppId");
            return;
        }
        aVar3.b = str8;
        x6n x6nVar2 = mtbVar.b;
        String str9 = x6nVar2.c().a;
        if (str9 == null) {
            bmy.a("Null installationUuid");
            return;
        }
        aVar3.d = str9;
        aVar3.e = x6nVar2.c().b;
        aVar3.f = x6nVar2.c().c;
        String str10 = rr0Var2.f;
        if (str10 == null) {
            bmy.a("Null buildVersion");
            return;
        }
        aVar3.h = str10;
        String str11 = rr0Var2.g;
        if (str11 == null) {
            bmy.a(xOgHBQVl.FddbTpDLS);
            return;
        }
        aVar3.i = str11;
        aVar3.c = 4;
        aVar3.m = (byte) (aVar3.m | 1);
        eh1.a aVar4 = new eh1.a();
        aVar4.f = false;
        byte b = (byte) (aVar4.m | 2);
        aVar4.d = jCurrentTimeMillis;
        aVar4.m = (byte) (b | 1);
        if (str == null) {
            bmy.a("Null identifier");
            return;
        }
        aVar4.b = str;
        String str12 = mtb.g;
        if (str12 == null) {
            bmy.a("Null generator");
            return;
        }
        aVar4.a = str12;
        String str13 = x6nVar2.c;
        if (str13 == null) {
            bmy.a("Null identifier");
            return;
        }
        lbe lbeVar = rr0Var2.h;
        String str14 = x6nVar2.c().a;
        lbe.a aVar5 = lbeVar.b;
        if (aVar5 == null) {
            aVar5 = new lbe.a(lbeVar);
            lbeVar.b = aVar5;
        }
        lbe.a aVar6 = aVar5;
        String str15 = aVar5.a;
        if (aVar6 == null) {
            aVar6 = new lbe.a(lbeVar);
            lbeVar.b = aVar6;
        }
        aVar4.g = new fh1(str13, str10, str11, str14, str15, aVar6.b);
        wh1.a aVar7 = new wh1.a();
        aVar7.a = 3;
        aVar7.e = (byte) (aVar7.e | 1);
        if (str2 == null) {
            bmy.a("Null version");
            return;
        }
        aVar7.b = str2;
        if (str3 == null) {
            bmy.a("Null buildVersion");
            return;
        }
        aVar7.c = str3;
        aVar7.d = ti8.f();
        aVar7.e = (byte) (aVar7.e | 2);
        aVar4.i = aVar7.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) mtb.f.get(str4.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = ti8.a(mtbVar.a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zE3 = ti8.e();
        boolean zE4 = ti8.e();
        ?? r9 = zE4;
        if (ti8.f()) {
            r9 = (zE4 ? 1 : 0) | 2;
        }
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            r8 = r9;
            r8 = (r9 == true ? 1 : 0) | 4;
        }
        r8 = r9;
        hh1.a aVar8 = new hh1.a();
        aVar8.a = iIntValue;
        byte b2 = (byte) (aVar8.j | 1);
        aVar8.j = b2;
        if (str5 == null) {
            bmy.a("Null model");
            return;
        }
        aVar8.b = str5;
        aVar8.c = iAvailableProcessors2;
        aVar8.d = jA2;
        aVar8.e = blockCount2;
        aVar8.f = zE3;
        aVar8.g = r8;
        aVar8.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        if (str6 == null) {
            bmy.a("Null manufacturer");
            return;
        }
        aVar8.h = str6;
        if (str7 == 0) {
            bmy.a("Null modelClass");
            return;
        }
        aVar8.i = str7;
        aVar4.j = aVar8.a();
        aVar4.l = 3;
        aVar4.m = (byte) (aVar4.m | 4);
        aVar3.j = aVar4.a();
        xg1 xg1VarA = aVar3.a();
        xkh xkhVar = ah80Var.b.b;
        ktb.e eVar = xg1VarA.k;
        if (eVar == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String strH = eVar.h();
        try {
            ytb.g.getClass();
            ytb.f(xkhVar.b(strH, "report"), ttb.a.a(xg1VarA));
            File fileB = xkhVar.b(strH, "start-time");
            long j = eVar.j();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), ytb.e);
            try {
                outputStreamWriter.write("");
                fileB.setLastModified(j * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            String strA2 = inm.a("Could not persist report for session ", strH);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strA2, e);
            }
        }
    }
}
