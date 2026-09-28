package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.scottyab.rootbeer.RootBeerNative;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lui50;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ui50 extends j8i0 {
    public final ssw<lk50<Boolean>> A;
    public final ssw B;
    public final wwd0 C;
    public final f1i D;
    public final sni0 a;
    public final m2l b;
    public final ith0 c;
    public final cuh0 d;
    public final psm e;
    public final x1p f;
    public final zae i;
    public final k650 v;
    public final yi5 w;
    public final odd y;
    public final AtomicBoolean z;

    @c0d(c = "com.sportybet.android.home.RestrictionViewModel$checkRestrictions$1$1", f = "RestrictionViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<myh<? super hih>, Throwable, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Throwable c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super hih> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.b = myhVar;
            aVar.c = th;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            myh myhVar = this.b;
            Throwable th = this.c;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                itf0.a.p(th, "RemoteConfig failed or timed out.", new Object[0]);
                hih.a aVar = hih.a.a;
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.home.RestrictionViewModel$checkRestrictions$1$2", f = "RestrictionViewModel.kt", l = {80}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<hih, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ k650 b;
        public final /* synthetic */ ui50 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k650 k650Var, ui50 ui50Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = k650Var;
            this.c = ui50Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hih hihVar, v1b<? super Unit> v1bVar) {
            return ((b) create(hihVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:138:0x049b  */
        /* JADX WARN: Code duplicated, block: B:36:0x0254  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            String[] strArrSplit;
            boolean z2;
            String[] strArr;
            HashMap map;
            int i;
            String[] strArrSplit2;
            boolean z3;
            String[] strArr2;
            int i2;
            String str;
            Process processExec;
            boolean z4;
            ui50 ui50Var = this.c;
            yi5 yi5Var = ui50Var.w;
            AtomicBoolean atomicBoolean = ui50Var.z;
            wwd0 wwd0Var = ui50Var.C;
            y5b y5bVar = y5b.a;
            int i3 = this.a;
            if (i3 == 0) {
                uj50.b(obj);
                if (this.b.b("is_emulator_validation_enable") && yi5Var.a().a()) {
                    ith0 ith0Var = ui50Var.c;
                    ith0Var.getClass();
                    int i4 = 0;
                    for (Pair pair : kotlin.collections.b.k(new Pair(new sth0(0, ith0Var, ith0.class, "isFirebaseEmulator", "isFirebaseEmulator()Z", 0), 10), new Pair(new tth0(0, ith0Var, ith0.class, "fakeTelephoneOperator", "fakeTelephoneOperator()Z", 0), 10), new Pair(new uth0(0, ith0Var, ith0.class, "isSharedFolderExists", "isSharedFolderExists()Z", 0), 10), new Pair(new vth0(0, ith0Var, ith0.class, "isGoogleEmulator", "isGoogleEmulator()Z", 0), 10), new Pair(new wth0(0, ith0Var, ith0.class, "isGenericEmulator", "isGenericEmulator()Z", 0), 10), new Pair(new xth0(0, ith0Var, ith0.class, "isSpecialEmulator", "isSpecialEmulator()Z", 0), 10), new Pair(new yth0(0, ith0Var, ith0.class, "isBluestacks", "isBluestacks()Z", 0), 10), new Pair(new zth0(0, ith0Var, ith0.class, "hasKnownEmulatorFiles", "hasKnownEmulatorFiles()Z", 0), 10), new Pair(new fth0(), 10), new Pair(new jth0(0, ith0Var, ith0.class, "isEmulatorInProduct", "isEmulatorInProduct()Z", 0), 1), new Pair(new kth0(0, ith0Var, ith0.class, "isEmulatorEnvironmentVariables", "isEmulatorEnvironmentVariables()Z", 0), 1), new Pair(new lth0(0, ith0Var, ith0.class, "isEmulatorInManufacturer", "isEmulatorInManufacturer()Z", 0), 1), new Pair(new mth0(0, ith0Var, ith0.class, "isEmulatorInBrand", "isEmulatorInBrand()Z", 0), 1), new Pair(new nth0(0, ith0Var, ith0.class, "isEmulatorInDevice", "isEmulatorInDevice()Z", 0), 1), new Pair(new oth0(0, ith0Var, ith0.class, "isEmulatorInModel", "isEmulatorInModel()Z", 0), 1), new Pair(new pth0(0, ith0Var, ith0.class, "isEmulatorInHardware", "isEmulatorInHardware()Z", 0), 1), new Pair(new qth0(0, ith0Var, ith0.class, "isEmulatorInFingerprint", "isEmulatorInFingerprint()Z", 0), 1), new Pair(new rth0(0, ith0Var, ith0.class, "noSensors", "noSensors()Z", 0), 1))) {
                        Function0 function0 = (Function0) pair.a;
                        int iIntValue = ((Number) pair.b).intValue();
                        if (((Boolean) function0.invoke()).booleanValue() && (i4 = i4 + iIntValue) >= 3) {
                            wwd0Var.setValue(si50.c.a);
                            atomicBoolean.set(false);
                            break;
                        }
                    }
                }
                if (ui50Var.e.W() && yi5Var.a().a()) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) ui50Var.f.a;
                    ProxyInfo defaultProxy = connectivityManager.getDefaultProxy();
                    if (defaultProxy == null || (defaultProxy.getHost() == null && defaultProxy.getPacFileUrl() == null)) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        if (networkCapabilities != null ? networkCapabilities.hasTransport(4) : false) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                    if (z) {
                        wwd0Var.setValue(si50.d.a);
                        atomicBoolean.set(false);
                    }
                    cuh0 cuh0Var = ui50Var.d;
                    cuh0Var.getClass();
                    if (ti8.f()) {
                        wwd0Var.setValue(si50.e.a);
                        atomicBoolean.set(false);
                    } else {
                        ew50 ew50Var = new ew50(cuh0Var.a);
                        if (ew50Var.b(new ArrayList(Arrays.asList(rva.a)))) {
                            wwd0Var.setValue(si50.e.a);
                            atomicBoolean.set(false);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(Arrays.asList(rva.b));
                            if (ew50Var.b(arrayList) || ew50.a("su")) {
                                wwd0Var.setValue(si50.e.a);
                                atomicBoolean.set(false);
                            } else {
                                HashMap map2 = new HashMap();
                                map2.put("ro.debuggable", "1");
                                map2.put("ro.secure", "0");
                                try {
                                    InputStream inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
                                    strArrSplit = inputStream == null ? null : new Scanner(inputStream).useDelimiter("\\A").next().split("\n");
                                } catch (IOException | NoSuchElementException e) {
                                    e.printStackTrace();
                                }
                                if (strArrSplit == null) {
                                    z2 = false;
                                } else {
                                    int length = strArrSplit.length;
                                    z2 = false;
                                    for (int i5 = 0; i5 < length; i5++) {
                                        String str2 = strArrSplit[i5];
                                        for (String str3 : map2.keySet()) {
                                            if (str2.contains(str3)) {
                                                strArr = strArrSplit;
                                                map = map2;
                                                i = length;
                                                String strA = tug.a("[", (String) map2.get(str3), "]");
                                                if (str2.contains(strA)) {
                                                    Log.v("RootBeer", ya30.b().concat(v70.b(str3, " = ", strA, " detected!")));
                                                    z2 = true;
                                                }
                                            } else {
                                                strArr = strArrSplit;
                                                map = map2;
                                                i = length;
                                            }
                                            map2 = map;
                                            strArrSplit = strArr;
                                            length = i;
                                        }
                                    }
                                }
                                if (z2) {
                                    wwd0Var.setValue(si50.e.a);
                                    atomicBoolean.set(false);
                                } else {
                                    try {
                                        InputStream inputStream2 = Runtime.getRuntime().exec("mount").getInputStream();
                                        strArrSplit2 = inputStream2 == null ? null : new Scanner(inputStream2).useDelimiter("\\A").next().split("\n");
                                    } catch (IOException | NoSuchElementException e2) {
                                        e2.printStackTrace();
                                    }
                                    if (strArrSplit2 == null) {
                                        z3 = false;
                                    } else {
                                        int length2 = strArrSplit2.length;
                                        int i6 = 0;
                                        z3 = false;
                                        while (i6 < length2) {
                                            String str4 = strArrSplit2[i6];
                                            String[] strArrSplit3 = str4.split(" ");
                                            if (strArrSplit3.length < 6) {
                                                ya30.a("Error formatting mount line: ".concat(str4));
                                            } else {
                                                String str5 = strArrSplit3[2];
                                                String str6 = strArrSplit3[5];
                                                int i7 = 0;
                                                while (i7 < 7) {
                                                    String str7 = rva.d[i7];
                                                    if (str5.equalsIgnoreCase(str7)) {
                                                        strArr2 = strArrSplit2;
                                                        i2 = length2;
                                                        String strReplace = str6.replace("(", "").replace(")", "");
                                                        String[] strArrSplit4 = strReplace.split(",");
                                                        int length3 = strArrSplit4.length;
                                                        int i8 = 0;
                                                        while (true) {
                                                            if (i8 >= length3) {
                                                                str6 = strReplace;
                                                                break;
                                                            }
                                                            int i9 = i8;
                                                            String[] strArr3 = strArrSplit4;
                                                            if (strArrSplit4[i9].equalsIgnoreCase("rw")) {
                                                                Log.v("RootBeer", ya30.b().concat(oxc.a(str7, " path is mounted with rw permissions! ", str4)));
                                                                str6 = strReplace;
                                                                z3 = true;
                                                                break;
                                                            }
                                                            i8 = i9 + 1;
                                                            strArrSplit4 = strArr3;
                                                        }
                                                    } else {
                                                        strArr2 = strArrSplit2;
                                                        i2 = length2;
                                                    }
                                                    i7++;
                                                    strArrSplit2 = strArr2;
                                                    length2 = i2;
                                                }
                                            }
                                            i6++;
                                            strArrSplit2 = strArrSplit2;
                                            length2 = length2;
                                        }
                                    }
                                    if (z3 || ((str = Build.TAGS) != null && str.contains("test-keys"))) {
                                        wwd0Var.setValue(si50.e.a);
                                        atomicBoolean.set(false);
                                    } else {
                                        try {
                                            processExec = Runtime.getRuntime().exec(new String[]{"which", "su"});
                                            try {
                                                z4 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null;
                                                processExec.destroy();
                                            } catch (Throwable unused) {
                                                if (processExec != null) {
                                                    processExec.destroy();
                                                }
                                                z4 = false;
                                            }
                                        } catch (Throwable unused2) {
                                            processExec = null;
                                        }
                                        if (z4) {
                                            wwd0Var.setValue(si50.e.a);
                                            atomicBoolean.set(false);
                                        } else {
                                            if (RootBeerNative.a) {
                                                String[] strArrA = rva.a();
                                                int length4 = strArrA.length;
                                                String[] strArr4 = new String[length4];
                                                for (int i10 = 0; i10 < length4; i10++) {
                                                    strArr4[i10] = uf80.a(new StringBuilder(), strArrA[i10], "su");
                                                }
                                                RootBeerNative rootBeerNative = new RootBeerNative();
                                                try {
                                                    rootBeerNative.setLogDebugMessages(true);
                                                    if (rootBeerNative.checkForRoot(strArr4) > 0) {
                                                        wwd0Var.setValue(si50.e.a);
                                                        atomicBoolean.set(false);
                                                    }
                                                } catch (UnsatisfiedLinkError unused3) {
                                                }
                                            } else {
                                                ya30.a("We could not load the native library to test for root");
                                            }
                                            if (ew50.a("magisk")) {
                                                wwd0Var.setValue(si50.e.a);
                                                atomicBoolean.set(false);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.a = 1;
                    if (ui50Var.x1(this) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.home.RestrictionViewModel$checkRestrictions$1$3", f = "RestrictionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<hih, v1b<? super Unit>, Object> {
        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ui50.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(hih hihVar, v1b<? super Unit> v1bVar) {
            return ((c) create(hihVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ui50 ui50Var = ui50.this;
            if (ui50Var.z.get()) {
                kzh.d(new g1i(bm50.a(new rni0(ui50Var.a.a.z())), new vi50(ui50Var, null)), o8i0.d(ui50Var));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.home.RestrictionViewModel$onAllRestrictionsPassed$1", f = "RestrictionViewModel.kt", l = {124, WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public boolean a;
        public int b;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ui50.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            boolean z;
            ui50 ui50Var = ui50.this;
            m2l m2lVar = ui50Var.b;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                cfd[] cfdVarArr = cfd.b;
                this.b = 1;
                obj = m2lVar.a.getBoolean("isFirst", true, this);
                if (obj != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.a;
                uj50.b(obj);
            }
            zBooleanValue = z;
            wwd0 wwd0Var = ui50Var.C;
            si50.a aVar = new si50.a(zBooleanValue);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar);
            return Unit.a;
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                cfd[] cfdVarArr2 = cfd.b;
                Boolean bool = Boolean.FALSE;
                this.a = zBooleanValue;
                this.b = 2;
                if (m2lVar.a.putBoolean("isFirst", bool, this) != y5bVar) {
                    z = zBooleanValue;
                    zBooleanValue = z;
                }
                return y5bVar;
            }
            wwd0 wwd0Var2 = ui50Var.C;
            si50.a aVar2 = new si50.a(zBooleanValue);
            wwd0Var2.getClass();
            wwd0Var2.k(null, aVar2);
            return Unit.a;
        }
    }

    public ui50(sni0 sni0Var, m2l m2lVar, ith0 ith0Var, cuh0 cuh0Var, psm psmVar, x1p x1pVar, zae zaeVar, k650 k650Var, yi5 yi5Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        m2lVar.getClass();
        psmVar.getClass();
        k650Var.getClass();
        yi5Var.getClass();
        this.a = sni0Var;
        this.b = m2lVar;
        this.c = ith0Var;
        this.d = cuh0Var;
        this.e = psmVar;
        this.f = x1pVar;
        this.i = zaeVar;
        this.v = k650Var;
        this.w = yi5Var;
        this.y = oddVar;
        this.z = new AtomicBoolean(true);
        ssw<lk50<Boolean>> sswVar = new ssw<>();
        this.A = sswVar;
        this.B = sswVar;
        wwd0 wwd0VarA = xwd0.a(null);
        this.C = wwd0VarA;
        this.D = new f1i(wwd0VarA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x1(x1b x1bVar) {
        ti50 ti50Var;
        if (x1bVar instanceof ti50) {
            ti50Var = (ti50) x1bVar;
            int i = ti50Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ti50Var.c = i - Integer.MIN_VALUE;
            } else {
                ti50Var = new ti50(this, x1bVar);
            }
        } else {
            ti50Var = new ti50(this, x1bVar);
        }
        Object objD = ti50Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ti50Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            ti50Var.c = 1;
            zae zaeVar = this.i;
            zaeVar.getClass();
            try {
                throw new Exception("this is safe");
            } catch (Exception e) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                stackTrace.getClass();
                int length = stackTrace.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/maps"));
                            ArrayList arrayListA = dmf0.a(bufferedReader);
                            int size = arrayListA.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size) {
                                    Object obj = arrayListA.get(i4);
                                    i4++;
                                    String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    List<String> list = zaeVar.a;
                                    if (list == null || !list.isEmpty()) {
                                        Iterator<T> it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                continue;
                                            } else if (StringsKt.M(lowerCase, (String) it.next(), false)) {
                                            }
                                        }
                                    }
                                } else {
                                    bufferedReader.close();
                                }
                                pfd pfdVar = fse.a;
                                objD = ej5.d(odd.b, new yae(2, null), ti50Var);
                                break;
                            }
                        } catch (Exception e2) {
                            itf0.a.d(e2.getMessage(), new Object[0]);
                        }
                    } else if (!Intrinsics.g(stackTrace[i3].getClassName(), "de.robv.android.xposed.XposedBridge")) {
                        i3++;
                    }
                    objD = Boolean.TRUE;
                    break;
                }
                if (objD == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        if (((Boolean) objD).booleanValue()) {
            this.C.setValue(si50.b.a);
            this.z.set(false);
        }
        return Unit.a;
    }

    public final void y1() {
        k650 k650Var = this.v;
        yzh yzhVarA = k650Var.a();
        kotlin.time.b.a aVar = kotlin.time.b.b;
        kzh.d(new g1i(ozh.c(new g1i(new yzh(new oyh(new rzh(kotlin.time.c.h(5, rgf.SECONDS), null, yzhVarA)), new a(3, null)), new b(k650Var, this, null)), this.y), new c(null)), o8i0.d(this));
    }

    public final void z1() {
        ej5.c(o8i0.d(this), null, null, new d(null), 3);
    }
}
