package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import com.google.protobuf.Reader;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class tge0 {
    public final ghf B;
    public final rkl C;
    public final vbh D;
    public final String k;
    public final uv5 l;
    public final e16 m;
    public final j4h n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public hl1 w;
    public final lse y;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final HashMap g = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final tuf z = new tuf();
    public final vf50 A = new vf50();

    public static abstract class a {
        public abstract List<Size> a();

        public abstract List<Size> b();

        public abstract int c();

        public abstract int d();

        public abstract int e();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("WITHOUT_FEATURE_COMBO", 0);
            a = bVar;
            b bVar2 = new b("WITH_FEATURE_COMBO", 1);
            b = bVar2;
            b bVar3 = new b("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public static abstract class c {
        public abstract int a();

        public abstract int b();

        public abstract Range<Integer> c();

        public abstract boolean d();

        public abstract boolean e();

        public abstract boolean f();

        public abstract boolean g();

        public abstract boolean h();

        public abstract boolean i();

        public abstract boolean j();
    }

    public tge0(Context context, String str, q26 q26Var, uv5 uv5Var, vbh vbhVar) throws r36 {
        List listSingletonList;
        int[] iArr;
        boolean z;
        this.p = false;
        this.q = false;
        this.t = false;
        this.u = false;
        str.getClass();
        this.k = str;
        uv5Var.getClass();
        this.l = uv5Var;
        this.n = new j4h();
        this.y = lse.b(context);
        try {
            e16 e16VarB = q26Var.b(str);
            this.m = e16VarB;
            Integer num = (Integer) e16VarB.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.o = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) e16VarB.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i : iArr2) {
                    if (i == 3) {
                        this.p = true;
                    } else if (i == 6) {
                        this.q = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.t = true;
                    } else if (i == 1) {
                        this.u = true;
                    }
                }
            }
            ghf ghfVar = new ghf(this.m);
            this.B = ghfVar;
            this.C = new rkl(this.m);
            ArrayList arrayList = this.a;
            int i2 = this.o;
            boolean z2 = this.p;
            boolean z3 = this.q;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            uge0 uge0Var = new uge0();
            vge0.d dVar = vge0.d.a;
            vge0.b bVar = vge0.b.MAXIMUM;
            o8e0 o8e0Var = vge0.e;
            bVar.getClass();
            o8e0 o8e0Var2 = vge0.e;
            uge0 uge0VarB = oqj.b(uge0Var, vge0.a.a(dVar, bVar, o8e0Var2), arrayList3, uge0Var);
            vge0.d dVar2 = vge0.d.c;
            uge0 uge0VarB2 = oqj.b(uge0VarB, vge0.a.a(dVar2, bVar, o8e0Var2), arrayList3, uge0VarB);
            vge0.d dVar3 = vge0.d.b;
            uge0 uge0VarB3 = oqj.b(uge0VarB2, vge0.a.a(dVar3, bVar, o8e0Var2), arrayList3, uge0VarB2);
            vge0.b bVar2 = vge0.b.PREVIEW;
            bVar2.getClass();
            uge0VarB3.a(vge0.a.a(dVar, bVar2, o8e0Var2));
            uge0 uge0VarB4 = oqj.b(uge0VarB3, vge0.a.a(dVar2, bVar, o8e0Var2), arrayList3, uge0VarB3);
            sge0.a(uge0VarB4, vge0.a.a(dVar3, bVar2, o8e0Var2), dVar2, bVar, o8e0Var2);
            uge0 uge0VarA = pqj.a(arrayList3, uge0VarB4);
            sge0.a(uge0VarA, vge0.a.a(dVar, bVar2, o8e0Var2), dVar, bVar2, o8e0Var2);
            uge0 uge0VarA2 = pqj.a(arrayList3, uge0VarA);
            sge0.a(uge0VarA2, vge0.a.a(dVar, bVar2, o8e0Var2), dVar3, bVar2, o8e0Var2);
            uge0 uge0VarA3 = pqj.a(arrayList3, uge0VarA2);
            sge0.a(uge0VarA3, vge0.a.a(dVar, bVar2, o8e0Var2), dVar3, bVar2, o8e0Var2);
            uge0VarA3.a(vge0.a.a(dVar2, bVar, o8e0Var2));
            arrayList3.add(uge0VarA3);
            arrayList2.addAll(arrayList3);
            if (i2 == 0 || i2 == 4 || i2 == 1 || i2 == 3) {
                ArrayList arrayList4 = new ArrayList();
                uge0 uge0Var2 = new uge0();
                uge0Var2.a(vge0.a.a(dVar, bVar2, o8e0Var2));
                vge0.b bVar3 = vge0.b.RECORD;
                bVar3.getClass();
                uge0Var2.a(vge0.a.a(dVar, bVar3, o8e0Var2));
                uge0 uge0VarA4 = pqj.a(arrayList4, uge0Var2);
                sge0.a(uge0VarA4, vge0.a.a(dVar, bVar2, o8e0Var2), dVar3, bVar3, o8e0Var2);
                uge0 uge0VarA5 = pqj.a(arrayList4, uge0VarA4);
                sge0.a(uge0VarA5, vge0.a.a(dVar3, bVar2, o8e0Var2), dVar3, bVar3, o8e0Var2);
                uge0 uge0VarA6 = pqj.a(arrayList4, uge0VarA5);
                sge0.a(uge0VarA6, vge0.a.a(dVar, bVar2, o8e0Var2), dVar, bVar3, o8e0Var2);
                uge0 uge0VarB5 = oqj.b(uge0VarA6, vge0.a.a(dVar2, bVar3, o8e0Var2), arrayList4, uge0VarA6);
                sge0.a(uge0VarB5, vge0.a.a(dVar, bVar2, o8e0Var2), dVar3, bVar3, o8e0Var2);
                uge0 uge0VarB6 = oqj.b(uge0VarB5, vge0.a.a(dVar2, bVar3, o8e0Var2), arrayList4, uge0VarB5);
                sge0.a(uge0VarB6, vge0.a.a(dVar3, bVar2, o8e0Var2), dVar3, bVar2, o8e0Var2);
                uge0VarB6.a(vge0.a.a(dVar2, bVar, o8e0Var2));
                arrayList4.add(uge0VarB6);
                arrayList2.addAll(arrayList4);
            }
            if (i2 == 1 || i2 == 3) {
                ArrayList arrayList5 = new ArrayList();
                uge0 uge0Var3 = new uge0();
                sge0.a(uge0Var3, vge0.a.a(dVar, bVar2, o8e0Var2), dVar, bVar, o8e0Var2);
                uge0 uge0VarA7 = pqj.a(arrayList5, uge0Var3);
                sge0.a(uge0VarA7, vge0.a.a(dVar, bVar2, o8e0Var2), dVar3, bVar, o8e0Var2);
                uge0 uge0VarA8 = pqj.a(arrayList5, uge0VarA7);
                sge0.a(uge0VarA8, vge0.a.a(dVar3, bVar2, o8e0Var2), dVar3, bVar, o8e0Var2);
                uge0 uge0VarA9 = pqj.a(arrayList5, uge0VarA8);
                sge0.a(uge0VarA9, vge0.a.a(dVar, bVar2, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0 uge0VarB7 = oqj.b(uge0VarA9, vge0.a.a(dVar2, bVar, o8e0Var2), arrayList5, uge0VarA9);
                vge0.b bVar4 = vge0.b.VGA;
                bVar4.getClass();
                uge0VarB7.a(vge0.a.a(dVar3, bVar4, o8e0Var2));
                sge0.a(uge0VarB7, vge0.a.a(dVar, bVar2, o8e0Var2), dVar3, bVar, o8e0Var2);
                uge0 uge0VarA10 = pqj.a(arrayList5, uge0VarB7);
                sge0.a(uge0VarA10, vge0.a.a(dVar3, bVar4, o8e0Var2), dVar3, bVar2, o8e0Var2);
                uge0VarA10.a(vge0.a.a(dVar3, bVar, o8e0Var2));
                arrayList5.add(uge0VarA10);
                arrayList2.addAll(arrayList5);
            }
            if (z2) {
                ArrayList arrayList6 = new ArrayList();
                uge0 uge0Var4 = new uge0();
                vge0.d dVar4 = vge0.d.e;
                uge0 uge0VarB8 = oqj.b(uge0Var4, vge0.a.a(dVar4, bVar, o8e0Var2), arrayList6, uge0Var4);
                sge0.a(uge0VarB8, vge0.a.a(dVar, bVar2, o8e0Var2), dVar4, bVar, o8e0Var2);
                uge0 uge0VarA11 = pqj.a(arrayList6, uge0VarB8);
                sge0.a(uge0VarA11, vge0.a.a(dVar3, bVar2, o8e0Var2), dVar4, bVar, o8e0Var2);
                uge0 uge0VarA12 = pqj.a(arrayList6, uge0VarA11);
                sge0.a(uge0VarA12, vge0.a.a(dVar, bVar2, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0 uge0VarB9 = oqj.b(uge0VarA12, vge0.a.a(dVar4, bVar, o8e0Var2), arrayList6, uge0VarA12);
                sge0.a(uge0VarB9, vge0.a.a(dVar, bVar2, o8e0Var2), dVar3, bVar2, o8e0Var2);
                uge0 uge0VarB10 = oqj.b(uge0VarB9, vge0.a.a(dVar4, bVar, o8e0Var2), arrayList6, uge0VarB9);
                sge0.a(uge0VarB10, vge0.a.a(dVar3, bVar2, o8e0Var2), dVar3, bVar2, o8e0Var2);
                uge0 uge0VarB11 = oqj.b(uge0VarB10, vge0.a.a(dVar4, bVar, o8e0Var2), arrayList6, uge0VarB10);
                sge0.a(uge0VarB11, vge0.a.a(dVar, bVar2, o8e0Var2), dVar2, bVar, o8e0Var2);
                uge0 uge0VarB12 = oqj.b(uge0VarB11, vge0.a.a(dVar4, bVar, o8e0Var2), arrayList6, uge0VarB11);
                sge0.a(uge0VarB12, vge0.a.a(dVar3, bVar2, o8e0Var2), dVar2, bVar, o8e0Var2);
                uge0VarB12.a(vge0.a.a(dVar4, bVar, o8e0Var2));
                arrayList6.add(uge0VarB12);
                arrayList2.addAll(arrayList6);
            }
            if (z3 && i2 == 0) {
                ArrayList arrayList7 = new ArrayList();
                uge0 uge0Var5 = new uge0();
                sge0.a(uge0Var5, vge0.a.a(dVar, bVar2, o8e0Var2), dVar, bVar, o8e0Var2);
                uge0 uge0VarA13 = pqj.a(arrayList7, uge0Var5);
                sge0.a(uge0VarA13, vge0.a.a(dVar, bVar2, o8e0Var2), dVar3, bVar, o8e0Var2);
                uge0 uge0VarA14 = pqj.a(arrayList7, uge0VarA13);
                sge0.a(uge0VarA14, vge0.a.a(dVar3, bVar2, o8e0Var2), dVar3, bVar, o8e0Var2);
                arrayList7.add(uge0VarA14);
                arrayList2.addAll(arrayList7);
            }
            if (i2 == 3) {
                ArrayList arrayList8 = new ArrayList();
                uge0 uge0Var6 = new uge0();
                uge0Var6.a(vge0.a.a(dVar, bVar2, o8e0Var2));
                vge0.b bVar5 = vge0.b.VGA;
                bVar5.getClass();
                uge0Var6.a(vge0.a.a(dVar, bVar5, o8e0Var2));
                uge0Var6.a(vge0.a.a(dVar3, bVar, o8e0Var2));
                vge0.d dVar5 = vge0.d.e;
                uge0 uge0VarB13 = oqj.b(uge0Var6, vge0.a.a(dVar5, bVar, o8e0Var2), arrayList8, uge0Var6);
                sge0.a(uge0VarB13, vge0.a.a(dVar, bVar2, o8e0Var2), dVar, bVar5, o8e0Var2);
                sge0.a(uge0VarB13, vge0.a.a(dVar2, bVar, o8e0Var2), dVar5, bVar, o8e0Var2);
                arrayList8.add(uge0VarB13);
                arrayList2.addAll(arrayList8);
            }
            arrayList.addAll(arrayList2);
            j4h j4hVar = this.n;
            String str2 = this.k;
            if (j4hVar.a == null) {
                listSingletonList = new ArrayList();
            } else {
                uge0 uge0Var7 = ExtraSupportedSurfaceCombinationsQuirk.a;
                String str3 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str3) || "heroqltetmo".equalsIgnoreCase(str3)) {
                    ArrayList arrayList9 = new ArrayList();
                    listSingletonList = arrayList9;
                    if (str2.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.a);
                        listSingletonList = arrayList9;
                    }
                } else {
                    listSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.c()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.b) : Collections.EMPTY_LIST;
                }
            }
            arrayList.addAll(listSingletonList);
            if (this.t) {
                ArrayList arrayList10 = this.b;
                ArrayList arrayList11 = new ArrayList();
                uge0 uge0Var8 = new uge0();
                vge0.b bVar6 = vge0.b.ULTRA_MAXIMUM;
                bVar6.getClass();
                uge0Var8.a(vge0.a.a(dVar3, bVar6, o8e0Var2));
                uge0Var8.a(vge0.a.a(dVar, bVar2, o8e0Var2));
                vge0.b bVar7 = vge0.b.RECORD;
                bVar7.getClass();
                uge0Var8.a(vge0.a.a(dVar, bVar7, o8e0Var2));
                uge0 uge0VarA15 = pqj.a(arrayList11, uge0Var8);
                sge0.a(uge0VarA15, vge0.a.a(dVar2, bVar6, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0 uge0VarB14 = oqj.b(uge0VarA15, vge0.a.a(dVar, bVar7, o8e0Var2), arrayList11, uge0VarA15);
                vge0.d dVar6 = vge0.d.e;
                sge0.a(uge0VarB14, vge0.a.a(dVar6, bVar6, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0 uge0VarB15 = oqj.b(uge0VarB14, vge0.a.a(dVar, bVar7, o8e0Var2), arrayList11, uge0VarB14);
                sge0.a(uge0VarB15, vge0.a.a(dVar3, bVar6, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0 uge0VarB16 = oqj.b(uge0VarB15, vge0.a.a(dVar2, bVar, o8e0Var2), arrayList11, uge0VarB15);
                sge0.a(uge0VarB16, vge0.a.a(dVar2, bVar6, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0 uge0VarB17 = oqj.b(uge0VarB16, vge0.a.a(dVar2, bVar, o8e0Var2), arrayList11, uge0VarB16);
                sge0.a(uge0VarB17, vge0.a.a(dVar6, bVar6, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0 uge0VarB18 = oqj.b(uge0VarB17, vge0.a.a(dVar2, bVar, o8e0Var2), arrayList11, uge0VarB17);
                sge0.a(uge0VarB18, vge0.a.a(dVar3, bVar6, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0 uge0VarB19 = oqj.b(uge0VarB18, vge0.a.a(dVar3, bVar, o8e0Var2), arrayList11, uge0VarB18);
                sge0.a(uge0VarB19, vge0.a.a(dVar2, bVar6, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0 uge0VarB20 = oqj.b(uge0VarB19, vge0.a.a(dVar3, bVar, o8e0Var2), arrayList11, uge0VarB19);
                sge0.a(uge0VarB20, vge0.a.a(dVar6, bVar6, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0 uge0VarB21 = oqj.b(uge0VarB20, vge0.a.a(dVar3, bVar, o8e0Var2), arrayList11, uge0VarB20);
                sge0.a(uge0VarB21, vge0.a.a(dVar3, bVar6, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0 uge0VarB22 = oqj.b(uge0VarB21, vge0.a.a(dVar6, bVar, o8e0Var2), arrayList11, uge0VarB21);
                sge0.a(uge0VarB22, vge0.a.a(dVar2, bVar6, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0 uge0VarB23 = oqj.b(uge0VarB22, vge0.a.a(dVar6, bVar, o8e0Var2), arrayList11, uge0VarB22);
                sge0.a(uge0VarB23, vge0.a.a(dVar6, bVar6, o8e0Var2), dVar, bVar2, o8e0Var2);
                uge0VarB23.a(vge0.a.a(dVar6, bVar, o8e0Var2));
                arrayList11.add(uge0VarB23);
                arrayList10.addAll(arrayList11);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.r = zHasSystemFeature;
            if (zHasSystemFeature) {
                ArrayList arrayList12 = this.c;
                ArrayList arrayList13 = new ArrayList();
                uge0 uge0Var9 = new uge0();
                vge0.b bVar8 = vge0.b.S1440P_4_3;
                bVar8.getClass();
                uge0Var9.a(vge0.a.a(dVar3, bVar8, o8e0Var2));
                uge0 uge0VarA16 = pqj.a(arrayList13, uge0Var9);
                uge0 uge0VarB24 = oqj.b(uge0VarA16, vge0.a.a(dVar, bVar8, o8e0Var2), arrayList13, uge0VarA16);
                uge0 uge0VarB25 = oqj.b(uge0VarB24, vge0.a.a(dVar2, bVar8, o8e0Var2), arrayList13, uge0VarB24);
                vge0.b bVar9 = vge0.b.S720P_16_9;
                bVar9.getClass();
                uge0VarB25.a(vge0.a.a(dVar3, bVar9, o8e0Var2));
                uge0 uge0VarB26 = oqj.b(uge0VarB25, vge0.a.a(dVar2, bVar8, o8e0Var2), arrayList13, uge0VarB25);
                sge0.a(uge0VarB26, vge0.a.a(dVar, bVar9, o8e0Var2), dVar2, bVar8, o8e0Var2);
                uge0 uge0VarA17 = pqj.a(arrayList13, uge0VarB26);
                sge0.a(uge0VarA17, vge0.a.a(dVar3, bVar9, o8e0Var2), dVar3, bVar8, o8e0Var2);
                uge0 uge0VarA18 = pqj.a(arrayList13, uge0VarA17);
                sge0.a(uge0VarA18, vge0.a.a(dVar3, bVar9, o8e0Var2), dVar, bVar8, o8e0Var2);
                uge0 uge0VarA19 = pqj.a(arrayList13, uge0VarA18);
                sge0.a(uge0VarA19, vge0.a.a(dVar, bVar9, o8e0Var2), dVar3, bVar8, o8e0Var2);
                uge0 uge0VarA20 = pqj.a(arrayList13, uge0VarA19);
                sge0.a(uge0VarA20, vge0.a.a(dVar, bVar9, o8e0Var2), dVar, bVar8, o8e0Var2);
                arrayList13.add(uge0VarA20);
                arrayList12.addAll(arrayList13);
            }
            if (ghfVar.c) {
                ArrayList arrayList14 = this.h;
                ArrayList arrayList15 = new ArrayList();
                uge0 uge0Var10 = new uge0();
                uge0 uge0VarB27 = oqj.b(uge0Var10, vge0.a.a(dVar, bVar, o8e0Var2), arrayList15, uge0Var10);
                uge0 uge0VarB28 = oqj.b(uge0VarB27, vge0.a.a(dVar3, bVar, o8e0Var2), arrayList15, uge0VarB27);
                sge0.a(uge0VarB28, vge0.a.a(dVar, bVar2, o8e0Var2), dVar2, bVar, o8e0Var2);
                uge0 uge0VarA21 = pqj.a(arrayList15, uge0VarB28);
                sge0.a(uge0VarA21, vge0.a.a(dVar, bVar2, o8e0Var2), dVar3, bVar, o8e0Var2);
                uge0 uge0VarA22 = pqj.a(arrayList15, uge0VarA21);
                sge0.a(uge0VarA22, vge0.a.a(dVar3, bVar2, o8e0Var2), dVar3, bVar, o8e0Var2);
                uge0 uge0VarA23 = pqj.a(arrayList15, uge0VarA22);
                uge0VarA23.a(vge0.a.a(dVar, bVar2, o8e0Var2));
                vge0.b bVar10 = vge0.b.RECORD;
                bVar10.getClass();
                uge0VarA23.a(vge0.a.a(dVar, bVar10, o8e0Var2));
                uge0 uge0VarA24 = pqj.a(arrayList15, uge0VarA23);
                sge0.a(uge0VarA24, vge0.a.a(dVar, bVar2, o8e0Var2), dVar, bVar10, o8e0Var2);
                uge0 uge0VarB29 = oqj.b(uge0VarA24, vge0.a.a(dVar3, bVar10, o8e0Var2), arrayList15, uge0VarA24);
                sge0.a(uge0VarB29, vge0.a.a(dVar, bVar2, o8e0Var2), dVar, bVar10, o8e0Var2);
                uge0VarB29.a(vge0.a.a(dVar2, bVar10, o8e0Var2));
                arrayList15.add(uge0VarB29);
                arrayList14.addAll(arrayList15);
            }
            boolean zD = q8e0.d(this.m);
            this.s = zD;
            if (zD && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList16 = this.j;
                ArrayList arrayList17 = new ArrayList();
                uge0 uge0Var11 = new uge0();
                vge0.b bVar11 = vge0.b.S1440P_4_3;
                o8e0 o8e0Var3 = o8e0.PREVIEW_VIDEO_STILL;
                uge0 uge0VarB30 = oqj.b(uge0Var11, vge0.a.a(dVar, bVar11, o8e0Var3), arrayList17, uge0Var11);
                uge0 uge0VarB31 = oqj.b(uge0VarB30, vge0.a.a(dVar3, bVar11, o8e0Var3), arrayList17, uge0VarB30);
                vge0.b bVar12 = vge0.b.RECORD;
                o8e0 o8e0Var4 = o8e0.VIDEO_RECORD;
                uge0 uge0VarB32 = oqj.b(uge0VarB31, vge0.a.a(dVar, bVar12, o8e0Var4), arrayList17, uge0VarB31);
                uge0 uge0VarB33 = oqj.b(uge0VarB32, vge0.a.a(dVar3, bVar12, o8e0Var4), arrayList17, uge0VarB32);
                o8e0 o8e0Var5 = o8e0.STILL_CAPTURE;
                uge0 uge0VarB34 = oqj.b(uge0VarB33, vge0.a.a(dVar2, bVar, o8e0Var5), arrayList17, uge0VarB33);
                uge0 uge0VarB35 = oqj.b(uge0VarB34, vge0.a.a(dVar3, bVar, o8e0Var5), arrayList17, uge0VarB34);
                o8e0 o8e0Var6 = o8e0.PREVIEW;
                sge0.a(uge0VarB35, vge0.a.a(dVar, bVar2, o8e0Var6), dVar2, bVar, o8e0Var5);
                uge0 uge0VarA25 = pqj.a(arrayList17, uge0VarB35);
                sge0.a(uge0VarA25, vge0.a.a(dVar, bVar2, o8e0Var6), dVar3, bVar, o8e0Var5);
                uge0 uge0VarA26 = pqj.a(arrayList17, uge0VarA25);
                sge0.a(uge0VarA26, vge0.a.a(dVar, bVar2, o8e0Var6), dVar, bVar12, o8e0Var4);
                uge0 uge0VarA27 = pqj.a(arrayList17, uge0VarA26);
                sge0.a(uge0VarA27, vge0.a.a(dVar, bVar2, o8e0Var6), dVar3, bVar12, o8e0Var4);
                uge0 uge0VarA28 = pqj.a(arrayList17, uge0VarA27);
                sge0.a(uge0VarA28, vge0.a.a(dVar, bVar2, o8e0Var6), dVar3, bVar2, o8e0Var6);
                uge0 uge0VarA29 = pqj.a(arrayList17, uge0VarA28);
                sge0.a(uge0VarA29, vge0.a.a(dVar, bVar2, o8e0Var6), dVar, bVar12, o8e0Var4);
                uge0 uge0VarB36 = oqj.b(uge0VarA29, vge0.a.a(dVar2, bVar12, o8e0Var5), arrayList17, uge0VarA29);
                sge0.a(uge0VarB36, vge0.a.a(dVar, bVar2, o8e0Var6), dVar3, bVar12, o8e0Var4);
                uge0 uge0VarB37 = oqj.b(uge0VarB36, vge0.a.a(dVar2, bVar12, o8e0Var5), arrayList17, uge0VarB36);
                sge0.a(uge0VarB37, vge0.a.a(dVar, bVar2, o8e0Var6), dVar3, bVar2, o8e0Var6);
                uge0VarB37.a(vge0.a.a(dVar2, bVar, o8e0Var5));
                arrayList17.add(uge0VarB37);
                arrayList16.addAll(arrayList17);
            }
            e16 e16Var = this.m;
            if (Build.VERSION.SDK_INT < 33 || (iArr = (int[]) e16Var.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length == 0) {
                z = false;
                break;
            }
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = false;
                    break;
                } else {
                    if (iArr[i3] == 2) {
                        z = true;
                        break;
                    }
                    i3++;
                }
            }
            this.v = z;
            if (z && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList18 = this.d;
                ArrayList arrayList19 = new ArrayList();
                uge0 uge0Var12 = new uge0();
                vge0.d dVar7 = vge0.d.a;
                vge0.b bVar13 = vge0.b.S1440P_4_3;
                bVar13.getClass();
                o8e0 o8e0Var7 = vge0.e;
                uge0 uge0VarB38 = oqj.b(uge0Var12, vge0.a.a(dVar7, bVar13, o8e0Var7), arrayList19, uge0Var12);
                vge0.d dVar8 = vge0.d.b;
                uge0 uge0VarB39 = oqj.b(uge0VarB38, vge0.a.a(dVar8, bVar13, o8e0Var7), arrayList19, uge0VarB38);
                uge0VarB39.a(vge0.a.a(dVar7, bVar13, o8e0Var7));
                vge0.d dVar9 = vge0.d.c;
                vge0.b bVar14 = vge0.b.MAXIMUM;
                bVar14.getClass();
                uge0VarB39.a(vge0.a.a(dVar9, bVar14, o8e0Var7));
                uge0 uge0VarA30 = pqj.a(arrayList19, uge0VarB39);
                sge0.a(uge0VarA30, vge0.a.a(dVar8, bVar13, o8e0Var7), dVar9, bVar14, o8e0Var7);
                uge0 uge0VarA31 = pqj.a(arrayList19, uge0VarA30);
                sge0.a(uge0VarA31, vge0.a.a(dVar7, bVar13, o8e0Var7), dVar8, bVar14, o8e0Var7);
                uge0 uge0VarA32 = pqj.a(arrayList19, uge0VarA31);
                sge0.a(uge0VarA32, vge0.a.a(dVar8, bVar13, o8e0Var7), dVar8, bVar14, o8e0Var7);
                uge0 uge0VarA33 = pqj.a(arrayList19, uge0VarA32);
                vge0.b bVar15 = vge0.b.PREVIEW;
                bVar15.getClass();
                uge0VarA33.a(vge0.a.a(dVar7, bVar15, o8e0Var7));
                uge0 uge0VarB40 = oqj.b(uge0VarA33, vge0.a.a(dVar7, bVar13, o8e0Var7), arrayList19, uge0VarA33);
                sge0.a(uge0VarB40, vge0.a.a(dVar8, bVar15, o8e0Var7), dVar7, bVar13, o8e0Var7);
                uge0 uge0VarA34 = pqj.a(arrayList19, uge0VarB40);
                sge0.a(uge0VarA34, vge0.a.a(dVar7, bVar15, o8e0Var7), dVar8, bVar13, o8e0Var7);
                uge0 uge0VarA35 = pqj.a(arrayList19, uge0VarA34);
                sge0.a(uge0VarA35, vge0.a.a(dVar8, bVar15, o8e0Var7), dVar8, bVar13, o8e0Var7);
                arrayList19.add(uge0VarA35);
                arrayList18.addAll(arrayList19);
            }
            c();
            this.D = vbhVar;
        } catch (rz5 e) {
            throw new r36(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    public static Range d(Range range, int i, Range[] rangeArr) {
        Range range2 = k8e0.a;
        if (range2.equals(range) || rangeArr == null) {
            return range2;
        }
        Range range3 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i)));
        int i2 = 0;
        for (Range range4 : rangeArr) {
            Objects.requireNonNull(range4);
            if (i >= ((Integer) range4.getLower()).intValue()) {
                if (range2.equals(k8e0.a)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    return range4;
                }
                try {
                    int i3 = i(range4.intersect(range3));
                    if (i2 == 0) {
                        i2 = i3;
                    } else {
                        if (i3 >= i2) {
                            double dI = i(range2.intersect(range3));
                            double dI2 = i(range4.intersect(range3));
                            double dI3 = dI2 / ((double) i(range4));
                            double dI4 = dI / ((double) i(range2));
                            if (dI2 > dI) {
                                if (dI3 >= 0.5d || dI3 >= dI4) {
                                    range2 = range4;
                                }
                            } else if (dI2 == dI) {
                                if (dI3 > dI4 || (dI3 == dI4 && ((Integer) range4.getLower()).intValue() > ((Integer) range2.getLower()).intValue())) {
                                    range2 = range4;
                                }
                            } else if (dI4 < 0.5d && dI3 > dI4) {
                                range2 = range4;
                            }
                            i2 = i(range3.intersect(range2));
                        }
                        range4 = range2;
                    }
                } catch (IllegalArgumentException unused) {
                    if (i2 != 0 || (h(range4, range3) >= h(range2, range3) && (h(range4, range3) != h(range2, range3) || (((Integer) range4.getLower()).intValue() <= ((Integer) range2.getUpper()).intValue() && i(range4) >= i(range2))))) {
                    }
                }
                range2 = range4;
            }
        }
        return range2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    public static Size f(StreamConfigurationMap streamConfigurationMap, int i, boolean z, Rational rational) {
        Size[] outputSizes;
        Size[] highResolutionOutputSizes;
        try {
            outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null || outputSizes.length == 0) {
            outputSizes = null;
        } else if (rational != null) {
            ArrayList arrayList = new ArrayList();
            for (Size size : outputSizes) {
                if (ky0.a(rational, size)) {
                    arrayList.add(size);
                }
            }
            if (arrayList.isEmpty()) {
                outputSizes = null;
            } else {
                outputSizes = (Size[]) arrayList.toArray(new Size[0]);
            }
        }
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        ql8 ql8Var = new ql8(false);
        Size size2 = (Size) Collections.max(Arrays.asList(outputSizes), ql8Var);
        Size size3 = kx90.a;
        if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
            size3 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), ql8Var);
        }
        return (Size) Collections.max(Arrays.asList(size2, size3), ql8Var);
    }

    public static int h(Range<Integer> range, Range<Integer> range2) {
        km20.g("Ranges must not intersect", (range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int i(Range<Integer> range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public static Range m(Range range, Range range2, boolean z) {
        Range<Integer> range3 = k8e0.a;
        if (range3.equals(range2) && range3.equals(range)) {
            return range3;
        }
        if (range3.equals(range2)) {
            return range;
        }
        if (range3.equals(range)) {
            return range2;
        }
        if (z) {
            km20.g("All targetFrameRate should be the same if strict fps is required", range == range2);
            return range;
        }
        try {
            return range2.intersect(range);
        } catch (IllegalArgumentException unused) {
            return range2;
        }
    }

    public final boolean a(bl1 bl1Var, List list, Map map, List list2, List list3) {
        List list4;
        Size size;
        int i;
        unh0 unh0Var;
        boolean z = bl1Var.d;
        boolean z2 = bl1Var.h;
        int i2 = bl1Var.a;
        HashMap map2 = this.g;
        if (map2.containsKey(bl1Var)) {
            list4 = (List) map2.get(bl1Var);
            z = z;
        } else {
            ArrayList arrayList = new ArrayList();
            if (z2) {
                ArrayList arrayList2 = this.f;
                if (arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    vge0.d dVar = vge0.d.a;
                    vge0.b bVar = vge0.b.S1080P_16_9;
                    o8e0 o8e0Var = vge0.e;
                    bVar.getClass();
                    o8e0 o8e0Var2 = vge0.e;
                    arrayList3.add(new uge0(vge0.a.a(dVar, bVar, o8e0Var2)));
                    vge0.b bVar2 = vge0.b.S720P_16_9;
                    bVar2.getClass();
                    arrayList3.add(new uge0(vge0.a.a(dVar, bVar2, o8e0Var2)));
                    vge0.b bVar3 = vge0.b.D;
                    arrayList3.addAll(nal.a(bVar, bVar3));
                    vge0.b bVar4 = vge0.b.UHD;
                    arrayList3.addAll(nal.a(bVar, bVar4));
                    arrayList3.addAll(nal.a(bVar, vge0.b.S1440P_16_9));
                    arrayList3.addAll(nal.a(bVar, bVar));
                    arrayList3.addAll(nal.a(bVar2, bVar3));
                    arrayList3.addAll(nal.a(bVar2, bVar4));
                    arrayList3.addAll(nal.a(bVar2, bVar));
                    vge0.b bVar5 = vge0.b.X_VGA;
                    vge0.b bVar6 = vge0.b.C;
                    arrayList3.addAll(nal.a(bVar5, bVar6));
                    arrayList3.addAll(nal.a(vge0.b.S1080P_4_3, bVar6));
                    arrayList2.addAll(arrayList3);
                }
                arrayList.addAll(arrayList2);
                z = z;
            } else if (bl1Var.e) {
                ArrayList arrayList4 = this.i;
                if (arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    uge0 uge0Var = new uge0();
                    vge0.d dVar2 = vge0.d.d;
                    vge0.b bVar7 = vge0.b.MAXIMUM;
                    o8e0 o8e0Var3 = vge0.e;
                    bVar7.getClass();
                    o8e0 o8e0Var4 = vge0.e;
                    uge0 uge0VarB = oqj.b(uge0Var, vge0.a.a(dVar2, bVar7, o8e0Var4), arrayList5, uge0Var);
                    vge0.d dVar3 = vge0.d.a;
                    vge0.b bVar8 = vge0.b.PREVIEW;
                    bVar8.getClass();
                    uge0VarB.a(vge0.a.a(dVar3, bVar8, o8e0Var4));
                    uge0VarB.a(vge0.a.a(dVar2, bVar7, o8e0Var4));
                    arrayList5.add(uge0VarB);
                    arrayList4.addAll(arrayList5);
                }
                if (i2 == 0) {
                    arrayList.addAll(arrayList4);
                }
            } else {
                z = z;
                if (bl1Var.f) {
                    ArrayList arrayList6 = this.e;
                    if (arrayList6.isEmpty()) {
                        rkl rklVar = this.C;
                        if (((Boolean) rklVar.b.getValue()).booleanValue()) {
                            arrayList6.clear();
                            Size size2 = (Size) rklVar.c.getValue();
                            if (size2 != null) {
                                hl1 hl1VarL = l(34);
                                ArrayList arrayList7 = new ArrayList();
                                o8e0 o8e0Var5 = vge0.e;
                                hl1VarL.getClass();
                                vge0 vge0VarB = vge0.a.b(34, size2, hl1VarL, 0, vge0.c.b, vge0.e);
                                uge0 uge0Var2 = new uge0();
                                uge0Var2.a(vge0VarB);
                                arrayList7.add(uge0Var2);
                                uge0 uge0Var3 = new uge0();
                                uge0Var3.a(vge0VarB);
                                uge0Var3.a(vge0VarB);
                                arrayList7.add(uge0Var3);
                                arrayList6.addAll(arrayList7);
                            }
                        }
                    }
                    arrayList.addAll(arrayList6);
                } else {
                    int i3 = bl1Var.c;
                    if (i3 == 8) {
                        if (i2 != 1) {
                            ArrayList arrayList8 = this.a;
                            if (i2 != 2) {
                                if (z) {
                                    arrayList8 = this.d;
                                }
                                arrayList.addAll(arrayList8);
                            } else {
                                arrayList.addAll(this.b);
                                arrayList.addAll(arrayList8);
                            }
                        } else {
                            list4 = this.c;
                        }
                        map2.put(bl1Var, list4);
                    } else if (i3 == 10 && i2 == 0) {
                        arrayList.addAll(this.h);
                    }
                }
            }
            list4 = arrayList;
            map2.put(bl1Var, list4);
        }
        Iterator it = list4.iterator();
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            z4 = ((uge0) it.next()).c(list) != null;
            if (z4) {
                break;
            }
        }
        if (!z4 || !z2) {
            return z4;
        }
        Range<Integer> range = bl1Var.i;
        wf80.g gVar = new wf80.g();
        int i4 = 0;
        while (i4 < list.size()) {
            vge0 vge0Var = (vge0) list.get(i4);
            hl1 hl1VarL2 = l(vge0Var.d);
            int i5 = vge0Var.d;
            hl1VarL2.getClass();
            Map<Integer, Size> map3 = hl1VarL2.f;
            vge0.b bVar9 = vge0Var.b;
            int iOrdinal = bVar9.ordinal();
            if (iOrdinal != 3) {
                switch (iOrdinal) {
                    case 9:
                        size = hl1VarL2.e;
                        break;
                    case 10:
                        size = hl1VarL2.a().get(Integer.valueOf(i5));
                        break;
                    case 11:
                        size = map3.get(Integer.valueOf(i5));
                        break;
                    case 12:
                        size = map3.get(Integer.valueOf(i5));
                        break;
                    case 13:
                        size = hl1VarL2.b().get(Integer.valueOf(i5));
                        break;
                    case 14:
                        ib5.a("Not supported config size");
                        return z3;
                    default:
                        size = bVar9.b;
                        break;
                }
            } else {
                size = hl1VarL2.c;
            }
            size.getClass();
            snh0 snh0Var = (snh0) list2.get(((Integer) list3.get(i4)).intValue());
            dhf dhfVar = (dhf) map.get(vge0Var);
            Objects.requireNonNull(dhfVar);
            snh0Var.getClass();
            wbh wbhVar = new wbh(size, snh0Var.m());
            unh0.b.getClass();
            int iOrdinal2 = snh0Var.P().ordinal();
            if (iOrdinal2 != 0) {
                i = i4;
                if (iOrdinal2 == 1) {
                    unh0Var = unh0.PREVIEW;
                } else if (iOrdinal2 != 3) {
                    unh0Var = iOrdinal2 != 4 ? unh0.UNDEFINED : unh0.STREAM_SHARING;
                } else {
                    unh0Var = unh0.VIDEO_CAPTURE;
                }
            } else {
                i = i4;
                unh0Var = unh0.IMAGE_CAPTURE;
            }
            Class<?> cls = unh0Var.a;
            if (cls != null) {
                wbhVar.j = cls;
            }
            wf80.b bVarD = wf80.b.d(snh0Var, size);
            ue6.a aVar = bVarD.b;
            bVarD.b(wbhVar, dhfVar, -1);
            aVar.b.Y(ue6.k, k8e0.a.equals(range) ? nui.d : range);
            if (z) {
                aVar.b.Y(snh0.J, 2);
            }
            gVar.a(bVarD.c());
            boolean zC = gVar.c();
            StringBuilder sb = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb.append(snh0Var);
            sb.append(" with ");
            sb.append(vge0Var);
            sb.append(" due to [");
            kya0.b(!gVar.m ? "Template is not set" : gVar.l.toString(), "]; surfaceConfigList = ", ", featureSettings = ", sb, list);
            sb.append(bl1Var);
            sb.append(", newUseCaseConfigs = ");
            sb.append(list2);
            km20.g(sb.toString(), zC);
            i4 = i + 1;
            z3 = false;
        }
        wf80 wf80VarB = gVar.b();
        boolean zA = this.D.a(wf80VarB);
        Iterator<ijd> it2 = wf80VarB.b().iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        return zA;
    }

    public final bl1 b(int i, boolean z, HashMap map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Range range, boolean z7) {
        int i2;
        Range range2;
        Range range3;
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = 8;
                break;
            }
            if (((dhf) it.next()).b == 10) {
                i2 = 10;
                break;
            }
        }
        String str = "CONCURRENT_CAMERA";
        String str2 = this.k;
        if (i != 0 && z3) {
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            throw new IllegalArgumentException(tx5.a("Camera device id is ", str2, ". Ultra HDR is not currently supported in ", str, " camera mode."));
        }
        if (i != 0 && i2 == 10) {
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            throw new IllegalArgumentException(tx5.a("Camera device id is ", str2, ". 10 bit dynamic range is not currently supported in ", str, " camera mode."));
        }
        if (i != 0 && z5) {
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            throw new IllegalArgumentException(tx5.a("Camera device id is ", str2, ". Feature combination query is not currently supported in ", str, " camera mode."));
        }
        if (z4 && z5) {
            hb5.a("High-speed session is not supported with feature combination");
            return null;
        }
        if (z4 && !((Boolean) this.C.b.getValue()).booleanValue()) {
            hb5.a("High-speed session is not supported on this device.");
            return null;
        }
        if (z5) {
            range2 = range;
            if (range2 == k8e0.a && z6) {
                range3 = nui.d;
            }
            return new bl1(i, z, i2, z2, z3, z4, z5, z6, range3, z7);
        }
        range2 = range;
        range3 = range2;
        return new bl1(i, z, i2, z2, z3, z4, z5, z6, range3, z7);
    }

    public final void c() {
        Size[] outputSizes;
        Size size;
        Size size2;
        CamcorderProfile camcorderProfileA;
        Size sizeE = this.y.e();
        Size size3 = null;
        try {
            int i = Integer.parseInt(this.k);
            uv5 uv5Var = this.l;
            int[] iArr = {1, 13, 10, 8, 12, 6, 5, 4};
            int i2 = 0;
            while (true) {
                if (i2 >= 8) {
                    size = null;
                    break;
                }
                int i3 = iArr[i2];
                if (uv5Var.b(i, i3) && (camcorderProfileA = uv5Var.a(i, i3)) != null) {
                    size = new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight);
                    break;
                }
                i2++;
            }
            if (size != null) {
                size2 = size;
            } else {
                try {
                    outputSizes = this.m.c().a.a.getOutputSizes(MediaRecorder.class);
                } catch (Throwable unused) {
                    outputSizes = null;
                }
                if (outputSizes != null) {
                    Arrays.sort(outputSizes, new ql8(true));
                    for (Size size4 : outputSizes) {
                        int width = size4.getWidth();
                        Size size5 = kx90.e;
                        if (width <= size5.getWidth() && size4.getHeight() <= size5.getHeight()) {
                            size3 = size4;
                            break;
                        }
                    }
                }
                if (size3 != null) {
                    size2 = size3;
                } else {
                    size = kx90.c;
                    size2 = size;
                }
            }
        } catch (NumberFormatException unused2) {
        }
        this.w = new hl1(kx90.b, new HashMap(), sizeE, new HashMap(), size2, new HashMap(), new HashMap(), new HashMap(), new HashMap());
    }

    public final int e(int i, Size size, boolean z) {
        long outputMinFrameDuration;
        km20.g(null, !z || i == 34);
        if (!z) {
            try {
                outputMinFrameDuration = this.m.c().a.a.getOutputMinFrameDuration(i, size);
            } catch (RuntimeException e) {
                pgt.j("StreamConfigurationMapCompat", "Failed to get min frame duration for format = " + i + " and size = " + size, e);
                outputMinFrameDuration = 0L;
            }
            if (outputMinFrameDuration > 0) {
                return (int) (1.0E9d / outputMinFrameDuration);
            }
            if (!this.u) {
                return Reader.READ_DONE;
            }
            pgt.i("SupportedSurfaceCombination", "minFrameDuration: " + outputMinFrameDuration + " is invalid for imageFormat = " + i + ", size = " + size);
            return 0;
        }
        rkl rklVar = this.C;
        rklVar.getClass();
        size.getClass();
        List<Range<Integer>> listC = rklVar.c(size);
        List<Range<Integer>> list = listC.isEmpty() ? null : listC;
        if (list == null) {
            pgt.i("HighSpeedResolver", "No supported high speed  fps for " + size);
            return 0;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            lrh0.a();
            return 0;
        }
        Integer num = (Integer) ((Range) it.next()).getUpper();
        while (it.hasNext()) {
            Integer num2 = (Integer) ((Range) it.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        num.getClass();
        return num.intValue();
    }

    public final List g(bl1 bl1Var, List list, HashMap map, HashMap map2) {
        boolean z;
        List list2;
        boolean z2;
        wg1 wg1Var = q8e0.a;
        if (bl1Var.a != 0 || bl1Var.c != 8 || bl1Var.f) {
            return null;
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            List<vge0> listC = ((uge0) obj).c(list);
            if (listC != null) {
                wg1 wg1Var2 = q8e0.a;
                int size2 = listC.size();
                int i2 = 0;
                while (true) {
                    z = true;
                    if (i2 >= size2) {
                        break;
                    }
                    long j = listC.get(i2).c.a;
                    boolean zContainsKey = map.containsKey(Integer.valueOf(i2));
                    tnh0.b bVar = tnh0.b.e;
                    if (zContainsKey) {
                        a21 a21Var = (a21) map.get(Integer.valueOf(i2));
                        a21Var.getClass();
                        if (a21Var.a().size() == 1) {
                            z2 = false;
                            bVar = a21Var.a().get(0);
                        } else {
                            z2 = false;
                        }
                        bVar.getClass();
                        List<tnh0.b> listA = a21Var.a();
                        listA.getClass();
                        if (!q8e0.c(bVar, j, listA)) {
                            z = z2;
                            break;
                        }
                        i2++;
                    } else {
                        if (!map2.containsKey(Integer.valueOf(i2))) {
                            jb5.a("SurfaceConfig does not map to any use case");
                            return null;
                        }
                        Object obj2 = map2.get(Integer.valueOf(i2));
                        obj2.getClass();
                        snh0 snh0Var = (snh0) obj2;
                        tnh0.b bVarP = snh0Var.P();
                        bVarP.getClass();
                        if (snh0Var.P() == bVar) {
                            list2 = (List) ((i8e0) snh0Var).d(i8e0.O);
                            list2.getClass();
                        } else {
                            list2 = m2g.a;
                        }
                        if (!q8e0.c(bVarP, j, list2)) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                }
                if (z && Boolean.valueOf(q8e0.a(this.m, listC)).booleanValue()) {
                    return listC;
                }
            }
        }
        return null;
    }

    public final Pair k(bl1 bl1Var, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i, HashMap map, HashMap map2) {
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            a21 a21Var = (a21) obj;
            arrayList4.add(a21Var.g());
            map.put(Integer.valueOf(arrayList4.size() - 1), a21Var);
        }
        int iMin = i;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Size size2 = (Size) list.get(i3);
            snh0 snh0Var = (snh0) arrayList2.get(((Integer) arrayList3.get(i3)).intValue());
            int iM = snh0Var.m();
            o8e0 o8e0VarO = snh0Var.O();
            vge0.c cVar = bl1Var.h ? vge0.c.a : vge0.c.b;
            hl1 hl1VarL = l(iM);
            int i4 = bl1Var.a;
            o8e0 o8e0Var = vge0.e;
            arrayList4.add(vge0.a.b(iM, size2, hl1VarL, i4, cVar, o8e0VarO));
            map2.put(Integer.valueOf(arrayList4.size() - 1), snh0Var);
            iMin = Math.min(iMin, e(snh0Var.m(), size2, bl1Var.f));
        }
        return new Pair(arrayList4, Integer.valueOf(iMin));
    }

    public final hl1 l(int i) {
        StreamConfigurationMap streamConfigurationMap;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.x;
        if (!arrayList.contains(numValueOf)) {
            p(this.w.b, kx90.d, i);
            p(this.w.d, kx90.f, i);
            o(this.w.f, i, null);
            o(this.w.g, i, ky0.a);
            o(this.w.h, i, ky0.c);
            Map<Integer, Size> map = this.w.i;
            if (Build.VERSION.SDK_INT >= 31 && this.t && (streamConfigurationMap = (StreamConfigurationMap) this.m.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map.put(Integer.valueOf(i), f(streamConfigurationMap, i, true, null));
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.w;
    }

    public final void o(Map<Integer, Size> map, int i, Rational rational) {
        Size sizeF = f(this.m.c().a.a, i, true, rational);
        if (sizeF != null) {
            map.put(Integer.valueOf(i), sizeF);
        }
    }

    public final void p(Map<Integer, Size> map, Size size, int i) {
        if (this.r) {
            Size sizeF = f(this.m.c().a.a, i, false, null);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeF != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeF), new ql8(false));
            }
            map.put(numValueOf, size);
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x03da  */
    /* JADX WARN: Code duplicated, block: B:137:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:267:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [dhf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r30v0, types: [tge0] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v30 */
    public final gie0 j(int i, ArrayList arrayList, HashMap map, boolean z, boolean z2, boolean z3) {
        HashMap map2;
        ArrayList arrayList2;
        boolean z4;
        ?? r0;
        int i2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Set<dhf> set;
        ?? r28;
        Iterator it;
        dhf dhfVar;
        ?? r14;
        Object objA;
        ?? r29;
        dhf dhfVar2 = dhf.e;
        lse lseVar = this.y;
        lseVar.b = lseVar.a();
        if (this.w == null) {
            c();
        } else {
            Size sizeE = this.y.e();
            hl1 hl1Var = this.w;
            this.w = new hl1(hl1Var.a, hl1Var.b, sizeE, hl1Var.d, hl1Var.e, hl1Var.f, hl1Var.g, hl1Var.h, hl1Var.i);
        }
        Set setKeySet = map.keySet();
        Range<Integer> range = rkl.e;
        setKeySet.getClass();
        ArrayList arrayList5 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        boolean z5 = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            arrayList5.add(Integer.valueOf(((a21) obj).e()));
        }
        Set set2 = setKeySet;
        ArrayList arrayList6 = new ArrayList(l48.r(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList6.add(Integer.valueOf(((snh0) it2.next()).i()));
        }
        ArrayList arrayListI0 = CollectionsKt.i0(arrayList6, arrayList5);
        if (arrayListI0.isEmpty()) {
            break;
        }
        int size2 = arrayListI0.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                break;
                break;
            }
            Object obj2 = arrayListI0.get(i4);
            i4++;
            if (((Number) obj2).intValue() == 1) {
                z5 = true;
                break;
            }
        }
        gie0 gie0Var = null;
        if (z5 && !arrayListI0.isEmpty()) {
            int size3 = arrayListI0.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayListI0.get(i5);
                i5++;
                if (((Number) obj3).intValue() != 1) {
                    hb5.a("All sessionTypes should be high-speed when any of them is high-speed");
                    return null;
                }
            }
        }
        if (z5) {
            rkl rklVar = this.C;
            rklVar.getClass();
            List listA = rkl.a(CollectionsKt.A0(map.values()));
            ArrayList arrayList7 = new ArrayList();
            for (Object obj4 : listA) {
                if (((List) rklVar.d.getValue()).contains((Size) obj4)) {
                    arrayList7.add(obj4);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(jpu.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                List list = (List) entry.getValue();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj5 : list) {
                    gie0 gie0Var2 = gie0Var;
                    if (arrayList7.contains((Size) obj5)) {
                        arrayList8.add(obj5);
                    }
                    gie0Var = gie0Var2;
                }
                linkedHashMap.put(key, arrayList8);
            }
            map2 = linkedHashMap;
        } else {
            map2 = map;
        }
        gie0 gie0Var3 = gie0Var;
        ArrayList arrayList9 = new ArrayList(map2.keySet());
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        int size4 = arrayList9.size();
        int i6 = 0;
        while (i6 < size4) {
            Object obj6 = arrayList9.get(i6);
            i6++;
            int iJ = ((snh0) obj6).J();
            if (!arrayList11.contains(Integer.valueOf(iJ))) {
                arrayList11.add(Integer.valueOf(iJ));
            }
        }
        Collections.sort(arrayList11);
        Collections.reverse(arrayList11);
        int size5 = arrayList11.size();
        int i7 = 0;
        while (i7 < size5) {
            Object obj7 = arrayList11.get(i7);
            i7++;
            int iIntValue = ((Integer) obj7).intValue();
            int size6 = arrayList9.size();
            int i8 = 0;
            while (i8 < size6) {
                Object obj8 = arrayList9.get(i8);
                i8++;
                snh0 snh0Var = (snh0) obj8;
                ArrayList arrayList12 = arrayList11;
                if (iIntValue == snh0Var.J()) {
                    arrayList10.add(Integer.valueOf(arrayList9.indexOf(snh0Var)));
                }
                arrayList11 = arrayList12;
            }
        }
        ghf ghfVar = this.B;
        ihf ihfVar = ghfVar.b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size7 = arrayList.size();
        int i9 = 0;
        while (i9 < size7) {
            Object obj9 = arrayList.get(i9);
            i9++;
            linkedHashSet.add(((a21) obj9).b());
        }
        Set<dhf> setA = ihfVar.a.a();
        HashSet hashSet = new HashSet(setA);
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            ghf.d(hashSet, (dhf) it3.next(), ihfVar);
        }
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        boolean z6 = z5;
        ArrayList arrayList15 = new ArrayList();
        HashMap map3 = map2;
        int size8 = arrayList10.size();
        int i10 = 0;
        while (i10 < size8) {
            Object obj10 = arrayList10.get(i10);
            int i11 = i10 + 1;
            snh0 snh0Var2 = (snh0) arrayList9.get(((Integer) obj10).intValue());
            dhf dhfVarF = snh0Var2.F();
            int i12 = size8;
            if (dhfVarF.equals(dhf.c)) {
                arrayList15.add(snh0Var2);
            } else {
                int i13 = dhfVarF.a;
                int i14 = dhfVarF.b;
                if (i13 == 2 || ((i13 != 0 && i14 == 0) || (i13 == 0 && i14 != 0))) {
                    arrayList14.add(snh0Var2);
                } else {
                    arrayList13.add(snh0Var2);
                }
            }
            i10 = i11;
            size8 = i12;
        }
        HashMap map4 = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList16 = new ArrayList();
        arrayList16.addAll(arrayList13);
        arrayList16.addAll(arrayList14);
        arrayList16.addAll(arrayList15);
        int size9 = arrayList16.size();
        int i15 = 0;
        ?? r6 = linkedHashSet;
        while (i15 < size9) {
            Object obj11 = arrayList16.get(i15);
            int i16 = i15 + 1;
            snh0 snh0Var3 = (snh0) obj11;
            int i17 = size9;
            dhf dhfVarF2 = snh0Var3.F();
            String strR = snh0Var3.R();
            ArrayList arrayList17 = arrayList16;
            dhf dhfVar3 = dhf.d;
            if (!dhfVarF2.b()) {
                int i18 = dhfVarF2.a;
                arrayList3 = arrayList10;
                int i19 = dhfVarF2.b;
                arrayList4 = arrayList9;
                if (i18 == 1 && i19 == 0) {
                    if (!hashSet.contains(dhfVar3)) {
                        r28 = r6;
                        set = setA;
                        r14 = gie0Var3;
                        r29 = r28;
                        break;
                    }
                    r29 = r6;
                    set = setA;
                } else {
                    dhf dhfVarC = ghf.c(dhfVarF2, r6, hashSet);
                    set = setA;
                    r28 = r6;
                    if (dhfVarC == null) {
                        dhfVarC = ghf.c(dhfVarF2, linkedHashSet2, hashSet);
                        if (dhfVarC != null) {
                            pgt.a("DynamicRangeResolver", "Resolved dynamic range for use case " + strR + " from concurrently bound use case.\n" + dhfVarF2 + "\n->\n" + dhfVarC);
                        } else if (ghf.b(dhfVarF2, dhfVar3, hashSet)) {
                            pgt.a("DynamicRangeResolver", "Resolved dynamic range for use case " + strR + " to no compatible HDR dynamic ranges.\n" + dhfVarF2 + "\n->\n" + dhfVar3);
                        } else if (i18 == 2 && (i19 == 10 || i19 == 0)) {
                            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                            if (Build.VERSION.SDK_INT >= 33) {
                                objA = ghf.a.a(ghfVar.a);
                                if (objA != null) {
                                    linkedHashSet3.add(objA);
                                }
                            } else {
                                objA = gie0Var3;
                            }
                            linkedHashSet3.add(dhfVar2);
                            dhf dhfVarC2 = ghf.c(dhfVarF2, linkedHashSet3, hashSet);
                            if (dhfVarC2 == null) {
                                it = hashSet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        r14 = gie0Var3;
                                        r29 = r28;
                                        break;
                                    }
                                    dhfVar = (dhf) it.next();
                                    Iterator it4 = it;
                                    km20.g("Candidate dynamic range must be fully specified.", dhfVar.b());
                                    if (!dhfVar.equals(dhfVar3)) {
                                        pgt.a("DynamicRangeResolver", "Resolved dynamic range for use case " + strR + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + dhfVarF2 + "\n->\n" + dhfVar);
                                        r14 = dhfVar;
                                        r29 = r28;
                                        break;
                                    }
                                    it = it4;
                                }
                            } else {
                                StringBuilder sbA = ux5.a("Resolved dynamic range for use case ", strR, " from ", dhfVarC2.equals(objA) ? "recommended" : "required", " 10-bit supported dynamic range.\n");
                                sbA.append(dhfVarF2);
                                sbA.append("\n->\n");
                                sbA.append(dhfVarC2);
                                pgt.a("DynamicRangeResolver", sbA.toString());
                                r14 = dhfVarC2;
                                r29 = r28;
                            }
                        } else {
                            it = hashSet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    r14 = gie0Var3;
                                    r29 = r28;
                                    break;
                                }
                                dhfVar = (dhf) it.next();
                                Iterator it5 = it;
                                km20.g("Candidate dynamic range must be fully specified.", dhfVar.b());
                                if (!dhfVar.equals(dhfVar3) && ghf.a(dhfVarF2, dhfVar)) {
                                    pgt.a("DynamicRangeResolver", "Resolved dynamic range for use case " + strR + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + dhfVarF2 + "\n->\n" + dhfVar);
                                    r14 = dhfVar;
                                    r29 = r28;
                                    break;
                                }
                                it = it5;
                            }
                        }
                    } else {
                        pgt.a("DynamicRangeResolver", "Resolved dynamic range for use case " + strR + DZsoPoBl.SkqA + dhfVarF2 + "\n->\n" + dhfVarC);
                    }
                    r14 = dhfVarC;
                    r29 = r28;
                }
            } else {
                if (!hashSet.contains(dhfVarF2)) {
                    arrayList3 = arrayList10;
                    r28 = r6;
                    set = setA;
                    arrayList4 = arrayList9;
                    r14 = gie0Var3;
                    r29 = r28;
                    break;
                }
                arrayList3 = arrayList10;
                r29 = r6;
                r14 = dhfVarF2;
                set = setA;
                arrayList4 = arrayList9;
            }
            if (r14 == 0) {
                r14 = dhfVar3;
                r29 = r28;
                r14 = dhfVar3;
                String strR2 = snh0Var3.R();
                String strJoin = TextUtils.join("\n  ", set);
                String strJoin2 = TextUtils.join("\n  ", hashSet);
                StringBuilder sb = new StringBuilder("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  ");
                sb.append(strR2);
                sb.append("\nRequested dynamic range:\n  ");
                sb.append(dhfVarF2);
                sb.append("\nSupported dynamic ranges:\n  ");
                hb5.a(pr0.a(sb, strJoin, "\nConstrained set of concurrent dynamic ranges:\n  ", strJoin2));
                return gie0Var3;
            }
            r14 = dhfVar3;
            r29 = r28;
            r14 = dhfVar3;
            ghf.d(hashSet, r14, ihfVar);
            map4.put(snh0Var3, r14);
            ?? r2 = r29;
            if (!r2.contains(r14)) {
                linkedHashSet2.add(r14);
            }
            r6 = r2;
            size9 = i17;
            i15 = i16;
            arrayList16 = arrayList17;
            arrayList10 = arrayList3;
            arrayList9 = arrayList4;
            setA = set;
        }
        ArrayList arrayList18 = arrayList10;
        ArrayList arrayList19 = arrayList9;
        pgt.a("SupportedSurfaceCombination", "resolvedDynamicRanges = " + map4);
        int size10 = arrayList.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size10) {
                arrayList2 = arrayList;
                Iterator it6 = map3.keySet().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z4 = false;
                        break;
                    }
                    if (((snh0) it6.next()).m() == 4101) {
                    }
                }
            } else {
                arrayList2 = arrayList;
                Object obj12 = arrayList2.get(i20);
                i20++;
                if (((a21) obj12).c() == 4101) {
                }
            }
            z4 = true;
            break;
        }
        int size11 = arrayList2.size();
        ?? ValueOf = gie0Var3;
        int i21 = 0;
        while (i21 < size11) {
            Object obj13 = arrayList2.get(i21);
            i21++;
            boolean zI = ((a21) obj13).i();
            if (ValueOf != 0 && ValueOf.booleanValue() != zI) {
                ib5.a("All isStrictFpsRequired should be the same");
                return gie0Var3;
            }
            ValueOf = Boolean.valueOf(zI);
        }
        int size12 = arrayList19.size();
        int i22 = 0;
        ?? ValueOf2 = ValueOf;
        while (i22 < size12) {
            ArrayList arrayList20 = arrayList19;
            Object obj14 = arrayList20.get(i22);
            i22++;
            boolean zA = ((snh0) obj14).A();
            if (ValueOf2 != 0 && ValueOf2.booleanValue() != zA) {
                ib5.a("All isStrictFpsRequired should be the same");
                return gie0Var3;
            }
            arrayList19 = arrayList20;
            ValueOf2 = Boolean.valueOf(zA);
        }
        ArrayList arrayList21 = arrayList19;
        boolean zBooleanValue = ValueOf2 != 0 ? ValueOf2.booleanValue() : false;
        Range<Integer> rangeM = k8e0.a;
        int size13 = arrayList2.size();
        int i23 = 0;
        while (i23 < size13) {
            Object obj15 = arrayList2.get(i23);
            i23++;
            rangeM = m(((a21) obj15).h(), rangeM, zBooleanValue);
        }
        int size14 = arrayList18.size();
        Range<Integer> rangeM2 = rangeM;
        int i24 = 0;
        while (i24 < size14) {
            Object obj16 = arrayList18.get(i24);
            i24++;
            Range<Integer> rangeW = ((snh0) arrayList21.get(((Integer) obj16).intValue())).w(k8e0.a);
            Objects.requireNonNull(rangeW);
            rangeM2 = m(rangeW, rangeM2, zBooleanValue);
        }
        pgt.a("SupportedSurfaceCombination", "getSuggestedStreamSpecifications: isPreviewStabilizationOn = " + z + ", mIsPreviewStabilizationSupported = " + this.v + ", isFeatureComboInvocation = " + z3);
        if (z && !this.v && z3) {
            hb5.a("Preview stabilization is not supported by the camera.");
            return gie0Var3;
        }
        bl1 bl1VarB = b(i, z2, map4, z, z4, z6, z3, false, rangeM2, zBooleanValue);
        Collection collectionValues = map4.values();
        b bVar = b.a;
        if (z3) {
            ?? Contains = collectionValues.contains(dhfVar2);
            if (rangeM2 != null && ((Integer) rangeM2.getUpper()).intValue() == 60) {
                r0 = Contains;
                r0 = Contains;
                r0 = Contains + 1;
            }
            if (z) {
                r0++;
            }
            if (z4) {
                r0++;
            }
            i2 = 1;
            if (r0 > 1) {
                bVar = b.b;
            } else if (r0 == 1) {
                bVar = b.c;
            }
        } else {
            i2 = 1;
        }
        pgt.a("SupportedSurfaceCombination", "resolveSpecsByCheckingMethod: checkingMethod = " + bVar);
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == i2) {
            return n(b(bl1VarB.a, bl1VarB.b, map4, bl1VarB.d, bl1VarB.e, bl1VarB.f, bl1VarB.g, true, bl1VarB.i, bl1VarB.j), arrayList, map3, arrayList21, arrayList18, map4);
        }
        if (iOrdinal != 2) {
            return n(bl1VarB, arrayList2, map3, arrayList21, arrayList18, map4);
        }
        try {
            return n(bl1VarB, arrayList2, map3, arrayList21, arrayList18, map4);
        } catch (IllegalArgumentException e) {
            pgt.b("SupportedSurfaceCombination", "Failed to find a supported combination without feature combo, trying again with feature combo", e);
            return n(b(bl1VarB.a, bl1VarB.b, map4, bl1VarB.d, bl1VarB.e, bl1VarB.f, bl1VarB.g, true, bl1VarB.i, bl1VarB.j), arrayList, map3, arrayList21, arrayList18, map4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:307:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0251  */
    /* JADX WARN: Code duplicated, block: B:82:0x0265  */
    /* JADX WARN: Code duplicated, block: B:89:0x028e  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v60, types: [m2g] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final gie0 n(bl1 bl1Var, ArrayList arrayList, Map map, ArrayList arrayList2, ArrayList arrayList3, HashMap map2) {
        int i;
        ?? arrayList4;
        int i2;
        int i3;
        bl1 bl1Var2;
        HashMap map3;
        int i4;
        HashMap map4;
        List list;
        ArrayList arrayList5;
        HashMap map5;
        HashMap map6;
        HashMap map7;
        List list2;
        Range<Integer> range;
        bl1 bl1Var3;
        ArrayList arrayList6;
        int i5;
        List list3;
        List list4;
        tge0 tge0Var;
        HashMap map8;
        dhf dhfVarB;
        Rational rational;
        vf50 vf50Var;
        vge0.d dVar;
        Size sizeC;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        tge0 tge0Var2 = this;
        ArrayList arrayList10 = arrayList;
        Map map9 = map;
        ArrayList arrayList11 = arrayList2;
        ArrayList arrayList12 = arrayList3;
        pgt.a("SupportedSurfaceCombination", "resolveSpecsBySettings: featureSettings = " + bl1Var);
        String str = "No supported surface combination is found for camera device - Id : ";
        boolean z = false;
        if (bl1Var.h) {
            i = 1;
        } else {
            ArrayList arrayList13 = new ArrayList();
            int size = arrayList10.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList10.get(i6);
                i6++;
                arrayList13.add(((a21) obj).g());
            }
            ql8 ql8Var = new ql8(false);
            Iterator it = map9.keySet().iterator();
            while (it.hasNext()) {
                snh0 snh0Var = (snh0) it.next();
                List list5 = (List) map9.get(snh0Var);
                Iterator it2 = it;
                km20.a("No available output size is found for " + snh0Var + ".", (list5 == null || list5.isEmpty()) ? z : true);
                Size size2 = (Size) Collections.min(list5, ql8Var);
                int iM = snh0Var.m();
                hl1 hl1VarL = tge0Var2.l(iM);
                int i7 = bl1Var.a;
                vge0.c cVar = vge0.c.b;
                o8e0 o8e0VarO = snh0Var.O();
                o8e0 o8e0Var = vge0.e;
                arrayList13.add(vge0.a.b(iM, size2, hl1VarL, i7, cVar, o8e0VarO));
                it = it2;
                z = false;
            }
            i = 1;
            Map map10 = Collections.EMPTY_MAP;
            List list6 = Collections.EMPTY_LIST;
            if (!tge0Var2.a(bl1Var, arrayList13, map10, list6, list6)) {
                throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + tge0Var2.k + ".  May be attempting to bind too many use cases. Existing surfaces: " + arrayList10 + ". New configs: " + arrayList11 + ". GroupableFeature settings: " + bl1Var);
            }
        }
        HashMap map11 = new HashMap();
        Iterator it3 = map9.keySet().iterator();
        Map map12 = map9;
        while (it3.hasNext()) {
            snh0 snh0Var2 = (snh0) it3.next();
            ArrayList arrayList14 = new ArrayList();
            HashMap map13 = new HashMap();
            List list7 = (List) map12.get(snh0Var2);
            Objects.requireNonNull(list7);
            Iterator it4 = list7.iterator();
            while (it4.hasNext()) {
                Size size3 = (Size) it4.next();
                int iM2 = snh0Var2.m();
                o8e0 o8e0VarO2 = snh0Var2.O();
                Iterator it5 = it3;
                Range<Integer> range2 = bl1Var.i;
                hl1 hl1VarL2 = tge0Var2.l(iM2);
                int i8 = bl1Var.a;
                vge0.c cVar2 = bl1Var.h ? vge0.c.a : vge0.c.b;
                o8e0 o8e0Var2 = vge0.e;
                Iterator it6 = it4;
                vge0.b bVar = vge0.a.b(iM2, size3, hl1VarL2, i8, cVar2, o8e0VarO2).b;
                String str2 = str;
                Range<Integer> range3 = k8e0.a;
                int iE = range3.equals(range2) ? Reader.READ_DONE : tge0Var2.e(iM2, size3, bl1Var.f);
                if (!bl1Var.g || (bVar != vge0.b.NOT_SUPPORT && (range3.equals(range2) || iE >= ((Integer) range2.getUpper()).intValue()))) {
                    Set hashSet = (Set) map13.get(bVar);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map13.put(bVar, hashSet);
                    }
                    if (!hashSet.contains(Integer.valueOf(iE))) {
                        arrayList14.add(size3);
                        hashSet.add(Integer.valueOf(iE));
                    }
                }
                it4 = it6;
                str = str2;
                it3 = it5;
            }
            map11.put(snh0Var2, arrayList14);
            map12 = map;
        }
        String str3 = str;
        ArrayList arrayList15 = new ArrayList();
        int size4 = arrayList12.size();
        int i9 = 0;
        while (i9 < size4) {
            Object obj2 = arrayList12.get(i9);
            i9++;
            snh0 snh0Var3 = (snh0) arrayList11.get(((Integer) obj2).intValue());
            List<Size> list8 = (List) map11.get(snh0Var3);
            if (list8 == null) {
                list8 = Collections.EMPTY_LIST;
            }
            int iM3 = snh0Var3.m();
            tuf tufVar = tge0Var2.z;
            e16 e16Var = tge0Var2.m;
            tufVar.getClass();
            int i10 = (((Nexus4AndroidLTargetAspectRatioQuirk) zhe.a.b(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) cr0.b(e16Var).b(AspectRatioLegacyApi21Quirk.class)) == null) ? 3 : 2;
            if (i10 == 2) {
                Size size5 = tge0Var2.l(256).a().get(256);
                if (size5 != null) {
                    rational = new Rational(size5.getWidth(), size5.getHeight());
                }
                if (rational != null) {
                    arrayList8 = new ArrayList();
                    arrayList9 = new ArrayList();
                    for (Size size6 : list8) {
                        if (ky0.a(rational, size6)) {
                            arrayList8.add(size6);
                        } else {
                            arrayList9.add(size6);
                        }
                    }
                    arrayList9.addAll(0, arrayList8);
                    list8 = arrayList9;
                }
                vf50Var = tge0Var2.A;
                dVar = (vge0.d) vge0.h.get(Integer.valueOf(iM3));
                if (dVar == null) {
                    dVar = vge0.d.a;
                }
                if (vf50Var.a != null && (sizeC = ExtraCroppingQuirk.c(dVar)) != null) {
                    arrayList7 = new ArrayList();
                    arrayList7.add(sizeC);
                    for (Size size7 : list8) {
                        if (!size7.equals(sizeC)) {
                            arrayList7.add(size7);
                        }
                    }
                    list8 = arrayList7;
                }
                arrayList15.add(list8);
            } else if (i10 != 3) {
                jb5.a(hce0.a(i10, "Undefined targetAspectRatio: "));
                return null;
            }
            rational = null;
            if (rational != null) {
                arrayList8 = new ArrayList();
                arrayList9 = new ArrayList();
                while (r12.hasNext()) {
                    if (ky0.a(rational, size6)) {
                        arrayList8.add(size6);
                    } else {
                        arrayList9.add(size6);
                    }
                }
                arrayList9.addAll(0, arrayList8);
                list8 = arrayList9;
            }
            vf50Var = tge0Var2.A;
            dVar = (vge0.d) vge0.h.get(Integer.valueOf(iM3));
            if (dVar == null) {
                dVar = vge0.d.a;
            }
            if (vf50Var.a != null) {
                arrayList7 = new ArrayList();
                arrayList7.add(sizeC);
                while (r12.hasNext()) {
                    if (!size7.equals(sizeC)) {
                        arrayList7.add(size7);
                    }
                }
                list8 = arrayList7;
            }
            arrayList15.add(list8);
        }
        if (bl1Var.f) {
            tge0Var2.C.getClass();
            if (arrayList15.isEmpty()) {
                arrayList4 = m2g.a;
            } else {
                List<Size> listA = rkl.a(arrayList15);
                ArrayList arrayList16 = new ArrayList(l48.r(listA, 10));
                for (Size size8 : listA) {
                    int size9 = arrayList15.size();
                    ArrayList arrayList17 = new ArrayList(size9);
                    for (int i11 = 0; i11 < size9; i11++) {
                        arrayList17.add(size8);
                    }
                    arrayList16.add(arrayList17);
                }
                arrayList4 = arrayList16;
            }
        } else {
            int size10 = arrayList15.size();
            int size11 = i;
            int i12 = 0;
            while (i12 < size10) {
                Object obj3 = arrayList15.get(i12);
                i12++;
                size11 *= ((List) obj3).size();
            }
            if (size11 == 0) {
                hb5.a("Failed to find supported resolutions.");
                return null;
            }
            arrayList4 = new ArrayList();
            for (int i13 = 0; i13 < size11; i13++) {
                arrayList4.add(new ArrayList());
            }
            int size12 = size11 / ((List) arrayList15.get(0)).size();
            int i14 = size11;
            for (int i15 = 0; i15 < arrayList15.size(); i15++) {
                List list9 = (List) arrayList15.get(i15);
                for (int i16 = 0; i16 < size11; i16++) {
                    ((List) arrayList4.get(i16)).add((Size) list9.get((i16 % i14) / size12));
                }
                if (i15 < arrayList15.size() - 1) {
                    i14 = size12;
                    size12 /= ((List) arrayList15.get(i15 + 1)).size();
                }
            }
        }
        ?? r10 = arrayList4;
        HashMap map14 = new HashMap();
        HashMap map15 = new HashMap();
        HashMap map16 = new HashMap();
        HashMap map17 = new HashMap();
        wg1 wg1Var = q8e0.a;
        int size13 = arrayList10.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size13) {
                i2 = 0;
                int size14 = arrayList11.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size14) {
                        i3 = 0;
                        break;
                    }
                    Object obj4 = arrayList11.get(i18);
                    i18++;
                    snh0 snh0Var4 = (snh0) obj4;
                    tnh0.b bVarP = snh0Var4.P();
                    bVarP.getClass();
                    if (q8e0.e(snh0Var4, bVarP)) {
                    }
                }
            } else {
                Object obj5 = arrayList10.get(i17);
                i17++;
                a21 a21Var = (a21) obj5;
                List<tnh0.b> listA2 = a21Var.a();
                listA2.getClass();
                i2 = 0;
                tnh0.b bVar2 = listA2.get(0);
                hoa hoaVarD = a21Var.d();
                hoaVarD.getClass();
                bVar2.getClass();
                if (q8e0.e(hoaVarD, bVar2)) {
                }
            }
            i3 = i;
            break;
        }
        boolean z2 = bl1Var.f;
        int size15 = arrayList10.size();
        int i19 = i2;
        int iMin = Reader.READ_DONE;
        while (i19 < size15) {
            Object obj6 = arrayList10.get(i19);
            i19++;
            a21 a21Var2 = (a21) obj6;
            iMin = Math.min(iMin, tge0Var2.e(a21Var2.c(), a21Var2.f(), z2));
            map17 = map17;
        }
        HashMap map18 = map17;
        if (tge0Var2.s && i3 == 0) {
            Iterator it7 = r10.iterator();
            List listG = null;
            while (true) {
                if (!it7.hasNext()) {
                    bl1Var2 = bl1Var;
                    map3 = map16;
                    i4 = iMin;
                    map4 = map18;
                    break;
                }
                ArrayList arrayList18 = arrayList10;
                i4 = iMin;
                HashMap map19 = map18;
                Pair pairK = tge0Var2.k(bl1Var, arrayList18, (List) it7.next(), arrayList11, arrayList12, i4, map16, map19);
                bl1Var2 = bl1Var;
                map3 = map16;
                map4 = map19;
                listG = tge0Var2.g(bl1Var2, (List) pairK.first, map3, map4);
                if (listG != null) {
                    break;
                }
                map3.clear();
                map4.clear();
                arrayList11 = arrayList2;
                map16 = map3;
                map18 = map4;
                arrayList12 = arrayList3;
                iMin = i4;
                arrayList10 = arrayList;
            }
            pgt.a("SupportedSurfaceCombination", "orderedSurfaceConfigListForStreamUseCase = " + listG);
            list = listG;
        } else {
            bl1Var2 = bl1Var;
            map3 = map16;
            i4 = iMin;
            map4 = map18;
            list = null;
        }
        Range<Integer> range4 = bl1Var2.i;
        Iterator it8 = r10.iterator();
        List list10 = null;
        List list11 = null;
        int i20 = Reader.READ_DONE;
        int i21 = Reader.READ_DONE;
        int i22 = 0;
        int i23 = 0;
        tge0 tge0Var3 = tge0Var2;
        while (true) {
            if (!it8.hasNext()) {
                arrayList5 = arrayList3;
                map5 = map2;
                map6 = map3;
                map7 = map4;
                list2 = list;
                range = range4;
                bl1Var3 = bl1Var2;
                int i24 = i21;
                arrayList6 = arrayList2;
                i5 = i24;
                list3 = list10;
                list4 = list11;
                tge0Var = tge0Var3;
                break;
            }
            List list12 = (List) it8.next();
            HashMap map20 = new HashMap();
            HashMap map21 = new HashMap();
            map6 = map3;
            Iterator it9 = it8;
            map7 = map4;
            list2 = list;
            range = range4;
            int i25 = i20;
            int i26 = i21;
            Pair pairK2 = tge0Var3.k(bl1Var2, arrayList, list12, arrayList2, arrayList3, i4, map20, map21);
            int i27 = i4;
            List list13 = (List) pairK2.first;
            int iIntValue = ((Integer) pairK2.second).intValue();
            int i28 = (k8e0.a.equals(range) || iIntValue >= i27 || iIntValue >= ((Integer) range.getUpper()).intValue()) ? i : 0;
            HashMap map22 = new HashMap();
            int i29 = 0;
            while (i29 < list13.size()) {
                vge0 vge0Var = (vge0) list13.get(i29);
                dhf dhfVar = dhf.c;
                List list14 = list13;
                if (map20.containsKey(Integer.valueOf(i29))) {
                    a21 a21Var3 = (a21) map20.get(Integer.valueOf(i29));
                    Objects.requireNonNull(a21Var3);
                    i27 = i27;
                    dhfVarB = a21Var3.b();
                } else {
                    if (map21.containsKey(Integer.valueOf(i29))) {
                        snh0 snh0Var5 = (snh0) map21.get(Integer.valueOf(i29));
                        Objects.requireNonNull(snh0Var5);
                        dhfVar = (dhf) map2.get(snh0Var5);
                    }
                    dhfVarB = dhfVar;
                }
                map22.put(vge0Var, dhfVarB);
                i29++;
                list13 = list14;
                i27 = i27;
            }
            int i30 = i27;
            map5 = map2;
            arrayList6 = arrayList2;
            arrayList5 = arrayList3;
            bl1Var3 = bl1Var;
            tge0 tge0Var4 = this;
            if (i22 == 0 && tge0Var4.a(bl1Var3, list13, map22, arrayList6, arrayList5)) {
                if (i25 != Integer.MAX_VALUE && i25 >= iIntValue) {
                    i20 = i25;
                } else {
                    i20 = iIntValue;
                    list10 = list12;
                }
                if (i28 != 0) {
                    if (i23 != 0) {
                        i5 = i26;
                        i20 = iIntValue;
                        list4 = list11;
                        list3 = list12;
                        tge0Var = tge0Var4;
                        break;
                    }
                    i20 = iIntValue;
                    i22 = i;
                    list10 = list12;
                }
            } else {
                i20 = i25;
            }
            if (list2 != null && i23 == 0 && tge0Var4.g(bl1Var3, list13, map20, map21) != null) {
                if (i26 == Integer.MAX_VALUE || i26 < iIntValue) {
                    i26 = iIntValue;
                    list11 = list12;
                }
                if (i28 == 0) {
                    continue;
                } else {
                    if (i22 != 0) {
                        i5 = iIntValue;
                        list3 = list10;
                        list4 = list12;
                        tge0Var = tge0Var4;
                        break;
                    }
                    i26 = iIntValue;
                    i23 = i;
                    list11 = list12;
                }
            }
            bl1Var2 = bl1Var3;
            range4 = range;
            i21 = i26;
            it8 = it9;
            map4 = map7;
            map3 = map6;
            list = list2;
            i4 = i30;
            tge0Var3 = tge0Var4;
        }
        al1 al1Var = (!bl1Var3.g || k8e0.a.equals(range) || (i20 != Integer.MAX_VALUE && i20 >= ((Integer) range.getUpper()).intValue())) ? new al1(list3, list4, i20, i5, Reader.READ_DONE) : new al1(null, null, Reader.READ_DONE, Reader.READ_DONE, Reader.READ_DONE);
        pgt.a("SupportedSurfaceCombination", "resolveSpecsBySettings: bestSizesAndFps = " + al1Var);
        List<Size> list15 = al1Var.a;
        int i31 = al1Var.c;
        List<Size> list16 = al1Var.b;
        int i32 = al1Var.d;
        int i33 = al1Var.e;
        if (list15 == null) {
            throw new IllegalArgumentException(str3 + tge0Var.k + " and Hardware level: " + tge0Var.o + ". May be the specified resolution is too large and not supported. Existing surfaces: " + arrayList + " New configs: " + arrayList6);
        }
        Range<Integer> rangeD = k8e0.a;
        boolean zEquals = rangeD.equals(bl1Var3.i);
        boolean z3 = bl1Var3.f;
        if (!zEquals) {
            Range<Integer>[] rangeArrB = z3 ? tge0Var.C.b(list15) : (Range[]) tge0Var.m.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            Range<Integer> rangeD2 = d(bl1Var3.i, i31, rangeArrB);
            if (bl1Var3.g || bl1Var3.j) {
                km20.a(tYcQsJyaojE.SsiLWgOZfjlis + bl1Var3.i + " is not supported. Max FPS supported by the calculated best combination: " + i31 + ". Calculated best FPS range for device: " + rangeD2 + ". Device supported FPS ranges: " + Arrays.toString(rangeArrB), rangeD2.equals(bl1Var3.i));
            }
            rangeD = rangeD2;
        } else if (z3) {
            rangeD = d(rkl.e, i31, tge0Var.C.b(list15));
        }
        int size16 = arrayList6.size();
        int i34 = 0;
        while (i34 < size16) {
            Object obj7 = arrayList6.get(i34);
            int i35 = i34 + 1;
            snh0 snh0Var6 = (snh0) obj7;
            int i36 = size16;
            xk1.a aVarA = k8e0.a(list15.get(arrayList5.indexOf(Integer.valueOf(arrayList6.indexOf(snh0Var6)))));
            aVarA.d = Integer.valueOf(bl1Var3.f ? 1 : 0);
            dhf dhfVar2 = (dhf) map5.get(snh0Var6);
            dhfVar2.getClass();
            aVarA.c = dhfVar2;
            snh0Var6.getClass();
            ftw ftwVarV = ftw.V();
            wg1 wg1Var2 = jz5.P;
            if (snh0Var6.e(wg1Var2)) {
                ftwVarV.Y(wg1Var2, snh0Var6.d(wg1Var2));
            }
            wg1 wg1Var3 = snh0.G;
            if (snh0Var6.e(wg1Var3)) {
                ftwVarV.Y(wg1Var3, snh0Var6.d(wg1Var3));
            }
            wg1 wg1Var4 = i8n.O;
            if (snh0Var6.e(wg1Var4)) {
                ftwVarV.Y(wg1Var4, snh0Var6.d(wg1Var4));
            }
            wg1 wg1Var5 = d9n.h;
            if (snh0Var6.e(wg1Var5)) {
                ftwVarV.Y(wg1Var5, snh0Var6.d(wg1Var5));
            }
            aVarA.f = new jz5(ftwVarV);
            aVarA.g = Boolean.valueOf(bl1Var3.b);
            if (!k8e0.a.equals(rangeD)) {
                aVarA.e = rangeD;
            }
            map15.put(snh0Var6, aVarA.a());
            arrayList5 = arrayList3;
            map5 = map2;
            i34 = i35;
            size16 = i36;
        }
        if (list2 != null && i31 == i32 && list15.size() == list16.size()) {
            for (int i37 = 0; i37 < list15.size(); i37++) {
                if (list15.get(i37).equals(list16.get(i37))) {
                }
            }
            if (!q8e0.f(tge0Var.m, arrayList, map15, map14)) {
                int size17 = list2.size();
                int i38 = 0;
                while (i38 < size17) {
                    List list17 = list2;
                    long j = ((vge0) list17.get(i38)).c.a;
                    HashMap map23 = map6;
                    if (map23.containsKey(Integer.valueOf(i38))) {
                        a21 a21Var4 = (a21) map23.get(Integer.valueOf(i38));
                        a21Var4.getClass();
                        hoa hoaVarD2 = a21Var4.d();
                        hoaVarD2.getClass();
                        jz5 jz5VarB = q8e0.b(hoaVarD2, Long.valueOf(j));
                        if (jz5VarB != null) {
                            map14.put(a21Var4, a21Var4.j(jz5VarB));
                        }
                        map8 = map7;
                    } else {
                        map8 = map7;
                        if (!map8.containsKey(Integer.valueOf(i38))) {
                            jb5.a("SurfaceConfig does not map to any use case");
                            return null;
                        }
                        Object obj8 = map8.get(Integer.valueOf(i38));
                        obj8.getClass();
                        snh0 snh0Var7 = (snh0) obj8;
                        k8e0 k8e0Var = (k8e0) map15.get(snh0Var7);
                        k8e0Var.getClass();
                        hoa hoaVarD3 = k8e0Var.d();
                        hoaVarD3.getClass();
                        jz5 jz5VarB2 = q8e0.b(hoaVarD3, Long.valueOf(j));
                        if (jz5VarB2 != null) {
                            xk1.a aVarI = k8e0Var.i();
                            aVarI.f = jz5VarB2;
                            map15.put(snh0Var7, aVarI.a());
                        }
                    }
                    i38++;
                    list2 = list17;
                    map7 = map8;
                    map6 = map23;
                }
            }
        }
        return new gie0(map15, map14, i33);
    }
}
