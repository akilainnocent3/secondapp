package defpackage;

import com.twilio.voice.VoiceURLConnection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class twg0 {
    public static final String[] l = {"INSERT", "UPDATE", VoiceURLConnection.METHOD_TYPE_DELETE};
    public final lv50 a;
    public final HashMap b;
    public final HashMap c;
    public final boolean d;
    public final p0p e;
    public final LinkedHashMap f;
    public final String[] g;
    public final hfy h;
    public final jfy i;
    public final AtomicBoolean j;
    public Function0<Boolean> k;

    @c0d(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", l = {394}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function0<Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = function0;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return twg0.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            Function0<Unit> function0 = this.c;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    twg0 twg0Var = twg0.this;
                    this.a = 1;
                    obj = twg0Var.b(this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                function0.invoke();
                return Unit.a;
            } catch (Throwable th) {
                function0.invoke();
                throw th;
            }
        }
    }

    public twg0(lv50 lv50Var, HashMap map, HashMap map2, String[] strArr, boolean z, p0p p0pVar) {
        String lowerCase;
        lv50Var.getClass();
        this.a = lv50Var;
        this.b = map;
        this.c = map2;
        this.d = z;
        this.e = p0pVar;
        this.j = new AtomicBoolean(false);
        this.k = new b8f();
        this.f = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap = this.f;
                linkedHashMap.put(lowerCase4, kpu.c(lowerCase3, linkedHashMap));
            }
        }
        this.h = new hfy(this.g.length);
        this.i = new jfy(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(t120 t120Var, x1b x1bVar) {
        owg0 owg0Var;
        if (x1bVar instanceof owg0) {
            owg0Var = (owg0) x1bVar;
            int i = owg0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                owg0Var.d = i - Integer.MIN_VALUE;
            } else {
                owg0Var = new owg0(this, x1bVar);
            }
        } else {
            owg0Var = new owg0(this, x1bVar);
        }
        Object objC = owg0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = owg0Var.d;
        int i3 = 1;
        if (i2 == 0) {
            uj50.b(objC);
            yq00 yq00Var = new yq00(i3);
            owg0Var.a = t120Var;
            owg0Var.d = 1;
            objC = t120Var.c("SELECT * FROM room_table_modification_log WHERE invalidated = 1", yq00Var, owg0Var);
            if (objC != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) owg0Var.a;
            uj50.b(objC);
            return set;
        }
        t120Var = (t120) owg0Var.a;
        uj50.b(objC);
        Set set2 = (Set) objC;
        if (!set2.isEmpty()) {
            owg0Var.a = set2;
            owg0Var.d = 2;
            if (drg0.a(t120Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", owg0Var) == y5bVar) {
                return y5bVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) throws Throwable {
        qwg0 qwg0Var;
        ys7 ys7Var;
        Object value;
        int[] iArr;
        if (x1bVar instanceof qwg0) {
            qwg0Var = (qwg0) x1bVar;
            int i = qwg0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qwg0Var.d = i - Integer.MIN_VALUE;
            } else {
                qwg0Var = new qwg0(this, x1bVar);
            }
        } else {
            qwg0Var = new qwg0(this, x1bVar);
        }
        Object objW = qwg0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = qwg0Var.d;
        if (i2 == 0) {
            uj50.b(objW);
            lv50 lv50Var = this.a;
            ys7 ys7Var2 = lv50Var.g;
            if (!ys7Var2.a()) {
                return t3g.a;
            }
            try {
                if (!this.j.compareAndSet(true, false)) {
                    t3g t3gVar = t3g.a;
                    ys7Var2.b();
                    return t3gVar;
                }
                if (!this.k.invoke().booleanValue()) {
                    t3g t3gVar2 = t3g.a;
                    ys7Var2.b();
                    return t3gVar2;
                }
                rwg0 rwg0Var = new rwg0(this, null);
                qwg0Var.a = ys7Var2;
                qwg0Var.d = 1;
                objW = lv50Var.w(false, rwg0Var, qwg0Var);
                if (objW == y5bVar) {
                    return y5bVar;
                }
                ys7Var = ys7Var2;
            } catch (Throwable th) {
                th = th;
                ys7Var = ys7Var2;
                ys7Var.b();
                throw th;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ys7Var = qwg0Var.a;
            try {
                uj50.b(objW);
            } catch (Throwable th2) {
                th = th2;
                ys7Var.b();
                throw th;
            }
        }
        Set<? extends Integer> set = (Set) objW;
        if (!set.isEmpty()) {
            jfy jfyVar = this.i;
            set.getClass();
            if (!set.isEmpty()) {
                wwd0 wwd0Var = jfyVar.a;
                do {
                    value = wwd0Var.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                    }
                } while (!wwd0Var.g(value, iArr));
            }
            this.e.invoke(set);
        }
        ys7Var.b();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String[] strArr, Function0 function0, Function0 function1, x1b x1bVar) {
        swg0 swg0Var;
        int[] iArr;
        if (x1bVar instanceof swg0) {
            swg0Var = (swg0) x1bVar;
            int i = swg0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                swg0Var.e = i - Integer.MIN_VALUE;
            } else {
                swg0Var = new swg0(this, x1bVar);
            }
        } else {
            swg0Var = new swg0(this, x1bVar);
        }
        Object objB = swg0Var.c;
        Object obj = y5b.a;
        int i2 = swg0Var.e;
        boolean z = true;
        try {
            if (i2 == 0) {
                uj50.b(objB);
                int[] iArr2 = h(strArr).b;
                function0.invoke();
                swg0Var.a = function1;
                swg0Var.b = iArr2;
                swg0Var.e = 1;
                objB = b(swg0Var);
                if (objB == obj) {
                    return obj;
                }
                iArr = iArr2;
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iArr = swg0Var.b;
                function1 = swg0Var.a;
                uj50.b(objB);
            }
            Set set = (Set) objB;
            if (iArr.length != 0) {
                int length = iArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = false;
                        break;
                    }
                    if (set.contains(new Integer(iArr[i3]))) {
                        break;
                    }
                    i3++;
                }
            } else if (set.isEmpty()) {
                z = false;
                break;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            function1.invoke();
            return boolValueOf;
        } catch (Throwable th) {
            function1.invoke();
            throw th;
        }
    }

    public final void d(Function0<Unit> function0, Function0<Unit> function1) {
        function0.getClass();
        function1.getClass();
        if (this.j.compareAndSet(false, true)) {
            function0.invoke();
            ej5.c(this.a.i(), new t5b(), null, new a(function1, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0092  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (defpackage.drg0.a(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        if (defpackage.drg0.a(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d5 -> B:28:0x00d8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.crg0 r18, int r19, defpackage.x1b r20) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twg0.e(crg0, int, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:19:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(defpackage.crg0 r9, int r10, defpackage.x1b r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.vwg0
            if (r0 == 0) goto L13
            r0 = r11
            vwg0 r0 = (defpackage.vwg0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vwg0 r0 = new vwg0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f
            y5b r1 = defpackage.y5b.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            int r8 = r0.e
            int r9 = r0.d
            java.lang.String[] r10 = r0.c
            java.lang.String r2 = r0.b
            t120 r4 = r0.a
            defpackage.uj50.b(r11)
            r11 = r10
            r10 = r4
            goto L81
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L3a:
            defpackage.uj50.b(r11)
            java.lang.String[] r8 = r8.g
            r8 = r8[r10]
            java.lang.String[] r10 = defpackage.twg0.l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L4c:
            if (r9 >= r8) goto L83
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = defpackage.zdf0.a(r6, r5, r4)
            r0.a = r10
            r0.b = r2
            r0.c = r11
            r0.d = r9
            r0.e = r8
            r0.v = r3
            java.lang.Object r4 = defpackage.drg0.a(r10, r4, r0)
            if (r4 != r1) goto L81
            return r1
        L81:
            int r9 = r9 + r3
            goto L4c
        L83:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.twg0.f(crg0, int, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object g(x1b x1bVar) {
        wwg0 wwg0Var;
        ys7 ys7Var;
        ys7 ys7Var2;
        hfy hfyVar;
        hfy.b bVar;
        hfy.a aVar;
        if (x1bVar instanceof wwg0) {
            wwg0Var = (wwg0) x1bVar;
            int i = wwg0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wwg0Var.f = i - Integer.MIN_VALUE;
            } else {
                wwg0Var = new wwg0(this, x1bVar);
            }
        } else {
            wwg0Var = new wwg0(this, x1bVar);
        }
        Object obj = wwg0Var.d;
        y5b y5bVar = y5b.a;
        int i2 = wwg0Var.f;
        if (i2 == 0) {
            uj50.b(obj);
            ys7Var = this.a.g;
            if (ys7Var.a()) {
                try {
                    hfy hfyVar2 = this.h;
                    ReentrantLock reentrantLock = hfyVar2.a;
                    reentrantLock.lock();
                    try {
                        if (hfyVar2.e) {
                            int i3 = hfyVar2.d;
                            long[] jArr = hfyVar2.b;
                            boolean[] zArr = new boolean[jArr.length];
                            int length = jArr.length;
                            hfy.a[] aVarArr = new hfy.a[length];
                            boolean z = false;
                            for (int i4 = 0; i4 < length; i4++) {
                                boolean z2 = hfyVar2.b[i4] > 0;
                                if (z2 != hfyVar2.c[i4]) {
                                    zArr[i4] = z2;
                                    aVar = z2 ? hfy.a.b : hfy.a.c;
                                    z = true;
                                } else {
                                    aVar = hfy.a.a;
                                }
                                aVarArr[i4] = aVar;
                            }
                            if (z) {
                                hfy.b bVar2 = new hfy.b(i3, aVarArr, zArr);
                                reentrantLock.unlock();
                                lv50 lv50Var = this.a;
                                xwg0 xwg0Var = new xwg0(aVarArr, this, null);
                                wwg0Var.a = ys7Var;
                                wwg0Var.b = hfyVar2;
                                wwg0Var.c = bVar2;
                                wwg0Var.f = 1;
                                Object objW = lv50Var.w(false, xwg0Var, wwg0Var);
                                if (objW == y5bVar) {
                                    return y5bVar;
                                }
                                ys7Var2 = ys7Var;
                                obj = objW;
                                hfyVar = hfyVar2;
                                bVar = bVar2;
                            }
                        }
                        reentrantLock.unlock();
                        ys7Var.b();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ys7Var2 = ys7Var;
                    ys7Var2.b();
                    throw th;
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar = wwg0Var.c;
        hfyVar = wwg0Var.b;
        ys7Var2 = wwg0Var.a;
        try {
            uj50.b(obj);
        } catch (Throwable th3) {
            th = th3;
            ys7Var2.b();
            throw th;
        }
        if (((Boolean) obj).booleanValue()) {
            ReentrantLock reentrantLock2 = hfyVar.a;
            reentrantLock2.lock();
            try {
                if (hfyVar.e && bVar.a == hfyVar.d) {
                    boolean[] zArr2 = bVar.b;
                    System.arraycopy(zArr2, 0, hfyVar.c, 0, zArr2.length);
                    hfyVar.e = false;
                }
                Unit unit = Unit.a;
                reentrantLock2.unlock();
            } catch (Throwable th4) {
                reentrantLock2.unlock();
                throw th4;
            }
        }
        ys7Var = ys7Var2;
        ys7Var.b();
        return Unit.a;
    }

    public final Pair<String[], int[]> h(String[] strArr) {
        strArr.getClass();
        ph80 ph80Var = new ph80();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) this.c.get(lowerCase);
            if (set != null) {
                ph80Var.addAll(set);
            } else {
                ph80Var.add(str);
            }
        }
        String[] strArr2 = (String[]) wi80.a(ph80Var).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) this.f.get(lowerCase2);
            if (num == null) {
                hb5.a("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new Pair<>(strArr2, iArr);
    }
}
