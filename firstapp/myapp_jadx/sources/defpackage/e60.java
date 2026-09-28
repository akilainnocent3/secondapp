package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e60 implements rdd, View.OnAttachStateChangeListener {
    public cb80 A;
    public boolean B;
    public final d60 C;
    public final AndroidComposeView a;
    public final AndroidComposeView.e b;
    public hza c;
    public final ArrayList d = new ArrayList();
    public a e = a.a;
    public boolean f = true;
    public final tb5 i = d77.b(1, 6, null);
    public final Handler v = new Handler(Looper.getMainLooper());
    public msw w;
    public long y;
    public final msw<cb80> z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("SHOW_ORIGINAL", 0);
            a = aVar;
            a aVar2 = new a("SHOW_TRANSLATED", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static final class b {
        public static void a(e60 e60Var, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            eb80 eb80VarB;
            bb80 bb80Var;
            c6 c6Var;
            Function1 function1;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                long jKeyAt = longSparseArray.keyAt(i);
                ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
                if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (eb80VarB = e60Var.d().b((int) jKeyAt)) != null && (bb80Var = eb80VarB.a) != null && (c6Var = (c6) ta80.a(bb80Var.d, ra80.k)) != null && (function1 = (Function1) c6Var.b) != null) {
                }
            }
        }

        public static void b(e60 e60Var, long[] jArr, Consumer consumer) {
            bb80 bb80Var;
            for (long j : jArr) {
                eb80 eb80VarB = e60Var.d().b((int) j);
                if (eb80VarB != null && (bb80Var = eb80VarB.a) != null) {
                    ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(e60Var.a.getAutofillId(), bb80Var.g);
                    List list = (List) ta80.a(bb80Var.d, hb80.A);
                    if (list != null) {
                        builder.setValue("android:text", TranslationRequestValue.forText(new nk0(ois.a(list, "\n", null, 62))));
                        consumer.accept(builder.build());
                    }
                }
            }
        }
    }

    public static final class c extends qlr implements Function2<Integer, bb80, Unit> {
        public final /* synthetic */ cb80 a;
        public final /* synthetic */ e60 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(cb80 cb80Var, e60 e60Var) {
            super(2);
            this.a = cb80Var;
            this.b = e60Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, bb80 bb80Var) {
            int iIntValue = num.intValue();
            bb80 bb80Var2 = bb80Var;
            if (!this.a.b.b(bb80Var2.g)) {
                e60 e60Var = this.b;
                e60Var.i(iIntValue, bb80Var2);
                e60Var.i.c(Unit.a);
            }
            return Unit.a;
        }
    }

    public static final class d extends qlr implements Function2<Integer, bb80, Unit> {
        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, bb80 bb80Var) {
            e60.this.i(num.intValue(), bb80Var);
            return Unit.a;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [d60] */
    public e60(AndroidComposeView androidComposeView, AndroidComposeView.e eVar) {
        this.a = androidComposeView;
        this.b = eVar;
        msw mswVar = hwo.a;
        mswVar.getClass();
        this.w = mswVar;
        this.z = new msw<>();
        this.A = new cb80(androidComposeView.getSemanticsOwner().a(), mswVar);
        this.C = new Runnable() { // from class: d60
            /* JADX WARN: Code duplicated, block: B:18:0x0071  */
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                e60 e60Var = this.a;
                boolean zE = e60Var.e();
                AndroidComposeView androidComposeView2 = e60Var.a;
                if (zE) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        androidComposeView2.a(true);
                        msw<cb80> mswVar2 = e60Var.z;
                        int[] iArr = mswVar2.b;
                        long[] jArr = mswVar2.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j = jArr[i2];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        if ((255 & j) < 128) {
                                            int i5 = iArr[(i2 << 3) + i4];
                                            if (!e60Var.d().a(i5)) {
                                                e60Var.d.add(new eza(i5, e60Var.y, fza.b, null));
                                                e60Var.i.c(Unit.a);
                                            }
                                        }
                                        j >>= 8;
                                        i4++;
                                        i2 = i2;
                                    }
                                    int i6 = i2;
                                    if (i3 != 8) {
                                        break;
                                    } else {
                                        i = i6;
                                    }
                                } else {
                                    i = i2;
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i2 = i + 1;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            e60Var.g(androidComposeView2.getSemanticsOwner().a(), e60Var.A);
                            Unit unit = Unit.a;
                            Trace.endSection();
                            e60Var.b(e60Var.d());
                            e60Var.k();
                            e60Var.B = false;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (defpackage.hkd.b(100, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007d -> B:13:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.x1b r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.i60
            if (r0 == 0) goto L13
            r0 = r9
            i60 r0 = (defpackage.i60) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            i60 r0 = new i60
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            c77 r2 = r0.a
            defpackage.uj50.b(r9)
        L2b:
            r9 = r2
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L34:
            c77 r2 = r0.a
            defpackage.uj50.b(r9)
            goto L52
        L3a:
            defpackage.uj50.b(r9)
            tb5$a r9 = new tb5$a
            tb5 r2 = r8.i
            r9.<init>()
        L44:
            r0.a = r9
            r0.d = r4
            java.lang.Object r2 = r9.b(r0)
            if (r2 != r1) goto L4f
            goto L7f
        L4f:
            r7 = r2
            r2 = r9
            r9 = r7
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L80
            r2.next()
            boolean r9 = r8.e()
            if (r9 == 0) goto L66
            r8.f()
        L66:
            boolean r9 = r8.B
            if (r9 != 0) goto L73
            r8.B = r4
            android.os.Handler r9 = r8.v
            d60 r5 = r8.C
            r9.post(r5)
        L73:
            r0.a = r2
            r0.d = r3
            r5 = 100
            java.lang.Object r9 = defpackage.hkd.b(r5, r0)
            if (r9 != r1) goto L2b
        L7f:
            return r1
        L80:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e60.a(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7 A[LOOP:2: B:21:0x006f->B:39:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x015e A[LOOP:4: B:45:0x00e5->B:70:0x015e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x00d0 A[EDGE_INSN: B:90:0x00d0->B:41:0x00d0 BREAK  A[LOOP:2: B:21:0x006f->B:39:0x00c7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0164 A[EDGE_INSN: B:96:0x0164->B:71:0x0164 BREAK  A[LOOP:4: B:45:0x00e5->B:70:0x015e], SYNTHETIC] */
    public final void b(gwo<eb80> gwoVar) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c2;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        gwo<eb80> gwoVar2 = gwoVar;
        int[] iArr3 = gwoVar2.b;
        long[] jArr = gwoVar2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c3 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c2 = c3;
                        cb80 cb80VarB = this.z.b(i7);
                        eb80 eb80VarB = gwoVar2.b(i7);
                        bb80 bb80Var = eb80VarB != null ? eb80VarB.a : null;
                        if (bb80Var == null) {
                            throw w20.a("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = bb80Var.g;
                        sa80 sa80Var = bb80Var.d;
                        rtw<ob80<?>, Object> rtwVar = sa80Var.a;
                        if (cb80VarB == null) {
                            Object[] objArr = rtwVar.b;
                            long[] jArr2 = rtwVar.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c2) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                ob80 ob80Var = (ob80) objArr[(i10 << 3) + i12];
                                                ob80<List<nk0>> ob80Var2 = hb80.A;
                                                if (Intrinsics.g(ob80Var, ob80Var2)) {
                                                    List list = (List) ta80.a(sa80Var, ob80Var2);
                                                    h(i8, String.valueOf(list != null ? (nk0) CollectionsKt.firstOrNull(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = rtwVar.b;
                            long[] jArr3 = rtwVar.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c2) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                ob80 ob80Var3 = (ob80) objArr2[(i13 << 3) + i15];
                                                ob80<List<nk0>> ob80Var4 = hb80.A;
                                                if (Intrinsics.g(ob80Var3, ob80Var4)) {
                                                    List list2 = (List) ta80.a(cb80VarB.a, ob80Var4);
                                                    nk0 nk0Var = list2 != null ? (nk0) CollectionsKt.firstOrNull(list2) : null;
                                                    List list3 = (List) ta80.a(sa80Var, ob80Var4);
                                                    nk0 nk0Var2 = list3 != null ? (nk0) CollectionsKt.firstOrNull(list3) : null;
                                                    if (!Intrinsics.g(nk0Var, nk0Var2)) {
                                                        h(i8, String.valueOf(nk0Var2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c2 = c3;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c3 = c2;
                    j6 = j2;
                    iArr3 = iArr2;
                    gwoVar2 = gwoVar;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            gwoVar2 = gwoVar;
            iArr3 = iArr;
        }
    }

    public final void c(bb80 bb80Var, Function2<? super Integer, ? super bb80, Unit> function2) {
        bb80Var.getClass();
        List listJ = bb80.j(4, bb80Var);
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (d().a(((bb80) obj).g)) {
                function2.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final gwo<eb80> d() {
        if (this.f) {
            this.f = false;
            this.w = gb80.b(this.a.getSemanticsOwner());
            this.y = System.currentTimeMillis();
        }
        return this.w;
    }

    public final boolean e() {
        return this.c != null;
    }

    public final void f() {
        hza hzaVar = this.c;
        if (hzaVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                eza ezaVar = (eza) arrayList.get(i);
                int iOrdinal = ezaVar.c.ordinal();
                if (iOrdinal == 0) {
                    r9i0 r9i0Var = ezaVar.d;
                    if (r9i0Var != null) {
                        hzaVar.d(r9i0Var.a);
                    }
                } else if (iOrdinal != 1) {
                    uhc.a();
                    return;
                } else {
                    AutofillId autofillIdB = hzaVar.b(ezaVar.a);
                    if (autofillIdB != null) {
                        hzaVar.e(autofillIdB);
                    }
                }
            }
            hzaVar.a();
            arrayList.clear();
        }
    }

    public final void g(bb80 bb80Var, cb80 cb80Var) {
        c(bb80Var, new c(cb80Var, this));
        List listJ = bb80.j(4, bb80Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            bb80 bb80Var2 = (bb80) listJ.get(i);
            gwo<eb80> gwoVarD = d();
            int i2 = bb80Var2.g;
            if (gwoVarD.a(i2)) {
                msw<cb80> mswVar = this.z;
                if (mswVar.a(i2)) {
                    cb80 cb80VarB = mswVar.b(i2);
                    if (cb80VarB == null) {
                        throw w20.a("node not present in pruned tree before this change");
                    }
                    g(bb80Var2, cb80VarB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void h(int i, String str) {
        hza hzaVar;
        if (Build.VERSION.SDK_INT >= 29 && (hzaVar = this.c) != null) {
            AutofillId autofillIdB = hzaVar.b(i);
            if (autofillIdB == null) {
                throw w20.a("Invalid content capture ID");
            }
            hzaVar.f(autofillIdB, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:77:0x015d  */
    public final void i(int i, bb80 bb80Var) {
        c6 c6Var;
        Function1 function1;
        xl1 xl1VarA;
        AutofillId autofillIdA;
        lk40 lk40VarA;
        r9i0 r9i0Var;
        String strC;
        Function1 function2;
        if (e()) {
            sa80 sa80Var = bb80Var.d;
            Boolean bool = (Boolean) ta80.a(sa80Var, hb80.C);
            if (this.e == a.a && Intrinsics.g(bool, Boolean.TRUE)) {
                c6 c6Var2 = (c6) ta80.a(sa80Var, ra80.l);
                if (c6Var2 != null && (function2 = (Function1) c6Var2.b) != null) {
                }
            } else if (this.e == a.b && Intrinsics.g(bool, Boolean.FALSE) && (c6Var = (c6) ta80.a(sa80Var, ra80.l)) != null && (function1 = (Function1) c6Var.b) != null) {
            }
            int i2 = bb80Var.g;
            hza hzaVar = this.c;
            if (hzaVar == null || Build.VERSION.SDK_INT < 29 || (xl1VarA = s6i0.a(this.a)) == null) {
                r9i0Var = null;
            } else {
                bb80 bb80VarL = bb80Var.l();
                int i3 = bb80Var.g;
                if (bb80VarL != null) {
                    autofillIdA = hzaVar.b(bb80VarL.g);
                    if (autofillIdA == null) {
                        r9i0Var = null;
                    }
                } else {
                    autofillIdA = xl1VarA.a();
                }
                r9i0 r9i0VarC = hzaVar.c(autofillIdA, i3);
                if (r9i0VarC == null) {
                    r9i0Var = null;
                } else {
                    ViewStructure viewStructure = r9i0VarC.a;
                    sa80 sa80Var2 = bb80Var.d;
                    if (sa80Var2.a.b(hb80.J)) {
                        r9i0Var = null;
                    } else {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.y);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        String str = (String) ta80.a(sa80Var2, hb80.y);
                        if (str != null) {
                            viewStructure.setId(i3, null, null, str);
                        }
                        if (((Boolean) ta80.a(sa80Var2, hb80.m)) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        List list = (List) ta80.a(sa80Var2, hb80.A);
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(ois.a(list, "\n", null, 62));
                        }
                        nk0 nk0Var = (nk0) ta80.a(sa80Var2, hb80.E);
                        if (nk0Var != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(nk0Var);
                        }
                        List list2 = (List) ta80.a(sa80Var2, hb80.a);
                        if (list2 != null) {
                            viewStructure.setContentDescription(ois.a(list2, "\n", null, 62));
                        }
                        su50 su50Var = (su50) ta80.a(sa80Var2, hb80.x);
                        if (su50Var != null && (strC = vb80.c(su50Var.a)) != null) {
                            viewStructure.setClassName(strC);
                        }
                        ukf0 ukf0VarA = vb80.a(sa80Var2);
                        if (ukf0VarA != null) {
                            tkf0 tkf0Var = ukf0VarA.a;
                            imf0 imf0Var = tkf0Var.b;
                            mmd mmdVar = tkf0Var.g;
                            viewStructure.setTextStyle(mmdVar.y1() * mmdVar.getDensity() * omf0.c(imf0Var.a.b), 0, 0, 0);
                        }
                        ywx ywxVarD = bb80Var.d();
                        if (ywxVarD == null) {
                            lk40VarA = lk40.e;
                        } else {
                            ywx ywxVar = ywxVarD.E1().C ? ywxVarD : null;
                            if (ywxVar != null) {
                                lk40VarA = bb80Var.a(ywxVar);
                            } else {
                                lk40VarA = lk40.e;
                            }
                        }
                        float f = lk40VarA.a;
                        float f2 = lk40VarA.b;
                        viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (lk40VarA.c - f), (int) (lk40VarA.d - f2));
                        r9i0Var = r9i0VarC;
                    }
                }
            }
            if (r9i0Var != null) {
                this.d.add(new eza(i2, this.y, fza.a, r9i0Var));
            }
            c(bb80Var, new d());
        }
    }

    public final void j(bb80 bb80Var) {
        if (e()) {
            this.d.add(new eza(bb80Var.g, this.y, fza.b, null));
            List listJ = bb80.j(4, bb80Var);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                j((bb80) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void k() {
        msw<cb80> mswVar = this.z;
        mswVar.c();
        gwo<eb80> gwoVarD = d();
        int[] iArr = gwoVarD.b;
        Object[] objArr = gwoVarD.c;
        long[] jArr = gwoVarD.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            mswVar.h(iArr[i4], new cb80(((eb80) objArr[i4]).a, d()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.A = new cb80(this.a.getSemanticsOwner().a(), d());
    }

    @Override // defpackage.rdd
    public final void onStart(ibs ibsVar) {
        this.c = (hza) this.b.invoke();
        i(-1, this.a.getSemanticsOwner().a());
        f();
    }

    @Override // defpackage.rdd
    public final void onStop(ibs ibsVar) {
        j(this.a.getSemanticsOwner().a());
        f();
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.v.removeCallbacks(this.C);
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
