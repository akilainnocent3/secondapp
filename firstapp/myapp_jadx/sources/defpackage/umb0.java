package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.esotericsoftware.spine.android.SpineView;
import com.esotericsoftware.spine.android.b;
import com.sportybet.android.gp.tz.R;
import java.io.File;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class umb0 {
    public static final p8i a = g8i.a(n8i.a(R.font.sporty_cars, null, 0, 14));

    @c0d(c = "com.sportygames.multilevel.sportycar.components.SportyCarMultiplierSpineKt$SportyCarMultiplierSpine$1$1", f = "SportyCarMultiplierSpine.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            p8i p8iVar = umb0.a;
            this.a.setValue(Boolean.FALSE);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.multilevel.sportycar.components.SportyCarMultiplierSpineKt$SportyCarMultiplierSpine$2$1", f = "SportyCarMultiplierSpine.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ytw<Boolean> ytwVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.a = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            p8i p8iVar = umb0.a;
            this.a.setValue(Boolean.FALSE);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.multilevel.sportycar.components.SportyCarMultiplierSpineKt$SportyCarMultiplierSpine$3$3$1", f = "SportyCarMultiplierSpine.kt", l = {213}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ float b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ isw d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f, boolean z, isw iswVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = f;
            this.c = z;
            this.d = iswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0025  */
        /* JADX WARN: Code duplicated, block: B:13:0x002f  */
        /* JADX WARN: Code duplicated, block: B:15:0x0039 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0037 -> B:16:0x003a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.a
                r2 = 0
                r3 = 1
                isw r4 = r7.d
                if (r1 == 0) goto L17
                if (r1 != r3) goto L10
                defpackage.uj50.b(r8)
                goto L3a
            L10:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L17:
                defpackage.uj50.b(r8)
                p8i r8 = defpackage.umb0.a
                float r8 = r7.b
                r4.A(r8)
            L21:
                boolean r8 = r7.c
                if (r8 == 0) goto L4b
                p8i r8 = defpackage.umb0.a
                float r8 = r4.j()
                int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r8 <= 0) goto L4b
                r7.a = r3
                r5 = 100
                java.lang.Object r8 = defpackage.hkd.b(r5, r7)
                if (r8 != r0) goto L3a
                return r0
            L3a:
                p8i r8 = defpackage.umb0.a
                float r8 = r4.j()
                r1 = 1120403456(0x42c80000, float:100.0)
                float r8 = r8 - r1
                float r8 = java.lang.Math.max(r2, r8)
                r4.A(r8)
                goto L21
            L4b:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: umb0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.multilevel.sportycar.components.SportyCarMultiplierSpineKt$SportyCarSpineView$1$1", f = "SportyCarMultiplierSpine.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ float d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ List<String> i;
        public final /* synthetic */ boolean v;
        public final /* synthetic */ float w;
        public final /* synthetic */ ytw<com.esotericsoftware.spine.android.b> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, String str, boolean z2, float f, String str2, String str3, List<String> list, boolean z3, float f2, ytw<com.esotericsoftware.spine.android.b> ytwVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = str;
            this.c = z2;
            this.d = f;
            this.e = str2;
            this.f = str3;
            this.i = list;
            this.v = z3;
            this.w = f2;
            this.y = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            p8i p8iVar = umb0.a;
            com.esotericsoftware.spine.android.b value = this.y.getValue();
            if (value == null) {
                return Unit.a;
            }
            if (this.a) {
                return Unit.a;
            }
            umb0.d(value, this.b, this.c, this.d, this.e, this.i, this.v, this.w);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.multilevel.sportycar.components.SportyCarMultiplierSpineKt$SportyCarSpineView$2$1", f = "SportyCarMultiplierSpine.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ float e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;
        public final /* synthetic */ List<String> v;
        public final /* synthetic */ boolean w;
        public final /* synthetic */ float y;
        public final /* synthetic */ ytw<com.esotericsoftware.spine.android.b> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, boolean z2, String str, boolean z3, float f, String str2, String str3, List<String> list, boolean z4, float f2, ytw<com.esotericsoftware.spine.android.b> ytwVar, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = z2;
            this.c = str;
            this.d = z3;
            this.e = f;
            this.f = str2;
            this.i = str3;
            this.v = list;
            this.w = z4;
            this.y = f2;
            this.z = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            p8i p8iVar = umb0.a;
            com.esotericsoftware.spine.android.b value = this.z.getValue();
            if (value == null) {
                return Unit.a;
            }
            if (!this.a || !this.b) {
                return Unit.a;
            }
            umb0.d(value, this.c, this.d, this.e, this.f, this.v, this.w, this.y);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.multilevel.sportycar.components.SportyCarMultiplierSpineKt$SportyCarSpineView$3$1", f = "SportyCarMultiplierSpine.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ ytw<com.esotericsoftware.spine.android.b> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z, boolean z2, ytw<com.esotericsoftware.spine.android.b> ytwVar, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = z2;
            this.c = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new f(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            p8i p8iVar = umb0.a;
            com.esotericsoftware.spine.android.b value = this.c.getValue();
            if (value == null) {
                return Unit.a;
            }
            zi0 zi0VarA = value.a();
            float f = 0.0f;
            if (!this.a && this.b) {
                f = 1.0f;
            }
            zi0VarA.h = f;
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0180  */
    /* JADX WARN: Code duplicated, block: B:102:0x0183  */
    /* JADX WARN: Code duplicated, block: B:104:0x0187  */
    /* JADX WARN: Code duplicated, block: B:105:0x018a  */
    /* JADX WARN: Code duplicated, block: B:113:0x019f  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01da  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:133:0x0215  */
    /* JADX WARN: Code duplicated, block: B:142:0x023a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0256  */
    /* JADX WARN: Code duplicated, block: B:155:0x025d  */
    /* JADX WARN: Code duplicated, block: B:158:0x026e  */
    /* JADX WARN: Code duplicated, block: B:161:0x027b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0280  */
    /* JADX WARN: Code duplicated, block: B:164:0x0283  */
    /* JADX WARN: Code duplicated, block: B:166:0x028c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0294  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:173:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:176:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:180:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:190:0x02db  */
    /* JADX WARN: Code duplicated, block: B:194:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:202:0x0322  */
    /* JADX WARN: Code duplicated, block: B:203:0x0326  */
    /* JADX WARN: Code duplicated, block: B:206:0x033b  */
    /* JADX WARN: Code duplicated, block: B:209:0x034c  */
    /* JADX WARN: Code duplicated, block: B:213:0x035f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x0403  */
    /* JADX WARN: Code duplicated, block: B:226:0x042f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:239:0x04db  */
    /* JADX WARN: Code duplicated, block: B:241:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:242:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:245:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:246:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:249:0x04fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:250:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:253:0x0518  */
    /* JADX WARN: Code duplicated, block: B:254:0x051a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0529 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:260:0x052f  */
    /* JADX WARN: Code duplicated, block: B:263:0x057e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0586  */
    /* JADX WARN: Code duplicated, block: B:268:0x0598  */
    /* JADX WARN: Code duplicated, block: B:270:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:276:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:277:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:280:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:285:0x0613  */
    /* JADX WARN: Code duplicated, block: B:286:0x0615  */
    /* JADX WARN: Code duplicated, block: B:289:0x061d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:290:0x061f  */
    /* JADX WARN: Code duplicated, block: B:294:0x0629  */
    /* JADX WARN: Code duplicated, block: B:295:0x0636  */
    /* JADX WARN: Code duplicated, block: B:299:0x0662  */
    /* JADX WARN: Code duplicated, block: B:300:0x067e  */
    /* JADX WARN: Code duplicated, block: B:303:0x06ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:306:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:309:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:310:0x06da  */
    /* JADX WARN: Code duplicated, block: B:313:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:315:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:318:0x074e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:319:0x0750  */
    /* JADX WARN: Code duplicated, block: B:322:0x076b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:325:0x0771  */
    /* JADX WARN: Code duplicated, block: B:328:0x077e  */
    /* JADX WARN: Code duplicated, block: B:330:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:332:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:335:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    public static final void a(final String str, final File file, final File file2, final File file3, final File file4, String str2, String str3, String str4, final String str5, final String str6, final float f2, final float f3, final long j, final boolean z, final long j2, final boolean z2, final boolean z3, final int i, final boolean z4, cnb0 cnb0Var, cnb0 cnb0Var2, androidx.compose.runtime.a aVar, final int i2, final int i3, final int i4, final int i5) {
        int i6;
        boolean z5;
        androidx.compose.runtime.b bVar;
        final String str7;
        final String str8;
        final String str9;
        final cnb0 cnb0Var3;
        final cnb0 cnb0Var4;
        androidx.compose.runtime.e eVarZ;
        cnb0 cnb0Var5;
        cnb0 cnb0Var6;
        boolean z6;
        boolean z7;
        Configuration configuration;
        cnb0 cnb0Var7;
        float f4;
        float density;
        cnb0 cnb0Var8;
        boolean z8;
        boolean zC;
        Object objY;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        fnb0 fnb0Var;
        List listK;
        boolean zEquals;
        boolean z9;
        boolean z10;
        Object objY2;
        ytw ytwVar;
        Object objY3;
        final ytw ytwVar2;
        String path;
        String path2;
        Object objY4;
        String path3;
        String path4;
        Object objY5;
        boolean z11;
        boolean z12;
        boolean z13;
        androidx.compose.ui.d.a aVar2;
        n54 n54Var;
        int iHashCode;
        tsr.a aVar3;
        yka.a.b bVar2;
        yka.a.d dVar;
        yka.a.C1350a c1350a;
        yka.a.b bVar3;
        yka.a.c cVar;
        cnb0 cnb0Var9;
        androidx.compose.runtime.a.C0041a.C0042a c0042a2;
        tsr.a aVar4;
        boolean z14;
        int i7;
        float f5;
        int i8;
        cnb0 cnb0Var10;
        boolean z15;
        String str10;
        boolean z16;
        boolean z17;
        int i9;
        boolean z18;
        boolean z19;
        Object objY6;
        androidx.compose.runtime.a.C0041a.C0042a c0042a3;
        isw iswVar;
        boolean z20;
        boolean zB;
        Object objY7;
        int iHashCode2;
        tsr.a aVar5;
        yka.a.C1350a c1350a2;
        int iHashCode3;
        boolean z21;
        boolean z22;
        Object objY8;
        float f6;
        float fD;
        float fFloatValue;
        String strC;
        imf0 imf0VarG;
        float f7;
        int iHashCode4;
        boolean zC2;
        Object objY9;
        float f8;
        Object objY10;
        str.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(52747737);
        int i10 = i2 | (bVarI.M(str) ? 4 : 2) | (bVarI.A(file) ? 32 : 16) | (bVarI.A(file2) ? 256 : 128) | (bVarI.A(file3) ? 2048 : 1024) | (bVarI.A(file4) ? 16384 : 8192) | 12779520 | (bVarI.M(str5) ? 67108864 : 33554432) | (bVarI.M(str6) ? 536870912 : 268435456);
        int i11 = i3 | (bVarI.c(f2) ? 4 : 2) | (bVarI.c(f3) ? 32 : 16) | (bVarI.e(j) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.e(j2) ? 16384 : 8192) | (bVarI.b(z2) ? 131072 : 65536) | (bVarI.b(z3) ? 1048576 : 524288) | (bVarI.d(i) ? 8388608 : 4194304) | (bVarI.b(z4) ? 67108864 : 33554432);
        int i12 = i5 & 524288;
        if (i12 != 0) {
            i11 |= 805306368;
        } else if ((i3 & 805306368) == 0) {
            i11 |= bVarI.d(cnb0Var == null ? -1 : cnb0Var.ordinal()) ? 536870912 : 268435456;
        }
        int i13 = i11;
        int i14 = i5 & 1048576;
        if (i14 != 0) {
            i6 = 6;
        } else if ((i4 & 6) == 0) {
            i6 = i4 | (bVarI.d(cnb0Var2 != null ? cnb0Var2.ordinal() : -1) ? 4 : 2);
        } else {
            i6 = i4;
        }
        int i15 = i6;
        if ((i10 & 306259091) == 306259090 && (i13 & 306783379) == 306783378) {
            if ((i15 & 3) == 2) {
                z5 = false;
            }
            if (bVarI.q(i10 & 1, z5)) {
                if (i12 != 0) {
                    cnb0Var5 = cnb0.a;
                } else {
                    cnb0Var5 = cnb0Var;
                }
                if (i14 != 0) {
                    cnb0Var6 = cnb0.b;
                } else {
                    cnb0Var6 = cnb0Var2;
                }
                if (file == null && file2 != null && file.exists() && file2.exists()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (file3 == null && file4 != null && file3.exists() && file4.exists()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
                cnb0Var7 = cnb0Var5;
                f4 = configuration.screenWidthDp;
                density = ((mmd) bVarI.O(kna.h)).getDensity() * f4;
                cnb0Var8 = cnb0Var6;
                if ((i13 & 29360128) == 8388608) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zC = z8 | bVarI.c(density);
                objY = bVarI.y();
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (zC || objY == c0042a) {
                    objY = vi8.a(i, density);
                    bVarI.r(objY);
                }
                fnb0Var = (fnb0) objY;
                if (z3) {
                    listK = kotlin.collections.b.k("Car 5: set2", "Car 5: set3_2(right stadium )", "Car 5: set2", "Car 5: set3_1(Sportyboard)", "Car 5: set2", "Car 5: set3_4(left and right stadium )", "Car 5: set2", "Car 5: set3_3(left stadium )", "Car 5: set2", "Car 5: set3_1(Sportyboard)");
                } else {
                    listK = null;
                }
                zEquals = str.equals("ROUND_WAITING");
                List list = listK;
                if (!str.equals("ROUND_PRE_START") || str.equals("ROUND_ONGOING") || str.equals("ROUND_END_WAIT")) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!str.equals("ROUND_WAITING") || str.equals("ROUND_PRE_START") || str.equals("ROUND_ONGOING") || str.equals("ROUND_END_WAIT")) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = m.b(Boolean.FALSE);
                    bVarI.r(objY2);
                }
                ytwVar = (ytw) objY2;
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = m.b(Boolean.FALSE);
                    bVarI.r(objY3);
                }
                ytwVar2 = (ytw) objY3;
                if (file != null) {
                    path = file.getPath();
                } else {
                    path = null;
                }
                if (file2 != null) {
                    path2 = file2.getPath();
                } else {
                    path2 = null;
                }
                boolean z23 = z10;
                objY4 = bVarI.y();
                if (objY4 == c0042a) {
                    objY4 = new a(ytwVar, null);
                    bVarI.r(objY4);
                }
                xvf.g(path, path2, (Function2) objY4, bVarI);
                if (file3 != null) {
                    path3 = file3.getPath();
                } else {
                    path3 = null;
                }
                if (file4 != null) {
                    path4 = file4.getPath();
                } else {
                    path4 = null;
                }
                objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    objY5 = new b(ytwVar2, null);
                    bVarI.r(objY5);
                }
                xvf.g(path3, path4, (Function2) objY5, bVarI);
                if (!z9 || z23 || (zEquals && z7)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (zEquals || !z6) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z2 || z23) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                aVar2 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
                n54Var = ht.a.h;
                boolean z24 = z12;
                aiv aivVarC = g75.c(n54Var, false);
                iHashCode = Long.hashCode(bVarI.m());
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                bVar2 = yka.a.f;
                hlh0.a(bVarI, aivVarC, bVar2);
                dVar = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    bVar3 = bVar2;
                } else {
                    bVar3 = bVar2;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    cVar = yka.a.d;
                    hlh0.a(bVarI, dVarC, cVar);
                    if (z7 || file3 == null || file4 == null) {
                        cnb0Var9 = cnb0Var8;
                        c0042a2 = c0042a;
                        bVar = bVarI;
                        aVar4 = aVar3;
                        z14 = false;
                        i7 = 57344;
                        f5 = 0.0f;
                        i8 = 1803739427;
                        bVar.N(1803739427);
                        bVar.X(false);
                    } else {
                        bVarI.N(1809569442);
                        i7 = 57344;
                        bVarI.C(335468296, bVarI.l(bVarI.l(file3.getPath(), file4.getPath()), "animation"));
                        androidx.compose.ui.d dVarA = dw.a(j.g(aVar2, 1.0f), z11 ? 1.0f : 0.0f);
                        float f9 = fnb0Var.e;
                        Object objY11 = bVarI.y();
                        if (objY11 == c0042a) {
                            objY11 = new Function0() { // from class: pmb0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ytwVar2.setValue(Boolean.TRUE);
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY11);
                        }
                        int i16 = i10 >> 9;
                        c0042a2 = c0042a;
                        aVar4 = aVar3;
                        f5 = 0.0f;
                        z14 = false;
                        c(file3, file4, "animation", true, str6, dVarA, f9, cnb0Var8, z13, list, (Function0) objY11, false, z11, 300.0f, true, bVarI, (i16 & 112) | (i16 & 14) | 3072 | 384 | ((i10 >> 15) & 57344) | ((i15 << 21) & 29360128), 24582, 2048);
                        cnb0Var9 = cnb0Var8;
                        bVar = bVarI;
                        bVar.X(false);
                        bVar.X(false);
                        i8 = 1803739427;
                    }
                    if (z6 || file == null || file2 == null) {
                        cnb0Var10 = cnb0Var7;
                        z15 = z14;
                        str10 = "animation";
                        bVar.N(i8);
                    } else {
                        bVar.N(1810641081);
                        bVar.C(335504353, bVar.l(bVar.l(bVar.l(file.getPath(), file2.getPath()), "animation"), str5));
                        androidx.compose.ui.d dVarA2 = dw.a(j.g(aVar2, 1.0f), z24 ? 1.0f : f5);
                        float f10 = fnb0Var.e;
                        Object objY12 = bVar.y();
                        androidx.compose.runtime.a.C0041a.C0042a c0042a4 = c0042a2;
                        if (objY12 == c0042a4) {
                            objY12 = new rsk(ytwVar, 2);
                            bVar.r(objY12);
                        }
                        Function0 function0 = (Function0) objY12;
                        int i17 = i10 >> 3;
                        int i18 = (i17 & 112) | (i17 & 14) | 3072 | 384 | ((i10 >> 12) & i7) | ((i13 >> 6) & 29360128);
                        cnb0Var10 = cnb0Var7;
                        androidx.compose.runtime.b bVar4 = bVar;
                        c0042a2 = c0042a4;
                        z15 = z14;
                        c(file, file2, "animation", false, str5, dVarA2, f10, cnb0Var10, z13, null, function0, true, z24, 300.0f, true, bVar4, i18, 24630, 512);
                        str10 = "animation";
                        bVar = bVar4;
                        bVar.X(z15);
                    }
                    bVar.X(z15);
                    if (zEquals) {
                        bVar.N(1811728127);
                        if ((i13 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = z15;
                        }
                        i9 = i13 & 14;
                        if (i9 == 4) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        z19 = z18 | z17;
                        objY6 = bVar.y();
                        c0042a3 = c0042a2;
                        if (z19 || objY6 == c0042a3) {
                            objY6 = androidx.compose.runtime.j.a(f2);
                            bVar.r(objY6);
                        }
                        iswVar = (isw) objY6;
                        Boolean boolValueOf = Boolean.valueOf(zEquals);
                        Long lValueOf = Long.valueOf(j);
                        Float fValueOf = Float.valueOf(f2);
                        boolean zM = bVar.M(iswVar);
                        if (i9 == 4) {
                            z20 = true;
                        } else {
                            z20 = z15;
                        }
                        zB = z20 | zM | bVar.b(zEquals);
                        objY7 = bVar.y();
                        if (zB || objY7 == c0042a3) {
                            objY7 = new c(f2, zEquals, iswVar, null);
                            bVar.r(objY7);
                        }
                        xvf.f(boolValueOf, lValueOf, fValueOf, (Function2) objY7, bVar);
                        androidx.compose.ui.d dVarA3 = abk0.a(h.j(j.e(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, configuration.screenHeightDp / fnb0Var.i, 7), 2.0f);
                        aiv aivVarC2 = g75.c(n54Var, z15);
                        iHashCode2 = Long.hashCode(bVar.m());
                        ne00 ne00VarS2 = bVar.S();
                        androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVar, dVarA3);
                        bVar.D();
                        if (bVar.S) {
                            aVar5 = aVar4;
                            bVar.F(aVar5);
                        } else {
                            aVar5 = aVar4;
                            bVar.p();
                        }
                        yka.a.b bVar5 = bVar3;
                        hlh0.a(bVar, aivVarC2, bVar5);
                        hlh0.a(bVar, ne00VarS2, dVar);
                        if (bVar.S && Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode2))) {
                            c1350a2 = c1350a;
                        } else {
                            c1350a2 = c1350a;
                            n30.a(iHashCode2, bVar, iHashCode2, c1350a2);
                        }
                        hlh0.a(bVar, dVarC2, cVar);
                        androidx.compose.ui.d dVarG2 = j.g(aVar2, 1.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, bVar, 48);
                        iHashCode3 = Long.hashCode(bVar.m());
                        ne00 ne00VarS3 = bVar.S();
                        androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVar, dVarG2);
                        bVar.D();
                        if (bVar.S) {
                            bVar.F(aVar5);
                        } else {
                            bVar.p();
                        }
                        hlh0.a(bVar, i78VarA, bVar5);
                        hlh0.a(bVar, ne00VarS3, dVar);
                        if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode3))) {
                            n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
                        }
                        hlh0.a(bVar, dVarC3, cVar);
                        boolean zC3 = bVar.c(iswVar.j());
                        if ((i13 & 112) == 32) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        z22 = zC3 | z21;
                        objY8 = bVar.y();
                        if (!z22 || objY8 == c0042a3) {
                            f6 = 0.0f;
                            if (f3 > 0.0f) {
                                fD = kotlin.ranges.f.d(iswVar.j() / f3, 0.0f, 1.0f);
                            } else {
                                fD = 0.0f;
                            }
                            objY8 = Float.valueOf(fD);
                            bVar.r(objY8);
                        } else {
                            f6 = 0.0f;
                        }
                        fFloatValue = ((Number) objY8).floatValue();
                        strC = op5.c(op5.a, pwo.e(R.string.power_up_next_round_cms, bVar), pwo.e(R.string.powering_up_for_next_round, bVar));
                        if (strC.length() > 28) {
                            bVar.N(-1689061333);
                            imf0VarG = ni60.g(((sfd0) bVar.O(ni60.b)).d, R.dimen._14ssp, bVar);
                            bVar.X(false);
                        } else {
                            bVar.N(-1689057493);
                            imf0VarG = ni60.g(((sfd0) bVar.O(ni60.b)).d, R.dimen._16ssp, bVar);
                            bVar.X(false);
                        }
                        androidx.compose.ui.d dVarJ = h.j(aVar2, 3.0f, 0.0f, 0.0f, 9.0f, 6);
                        if (!z || z4) {
                            f7 = f6;
                        } else {
                            f7 = 1.0f;
                        }
                        androidx.compose.ui.d dVarA4 = dw.a(dVarJ, f7);
                        aiv aivVarC3 = g75.c(ht.a.e, false);
                        iHashCode4 = Long.hashCode(bVar.m());
                        ne00 ne00VarS4 = bVar.S();
                        androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVar, dVarA4);
                        bVar.D();
                        if (bVar.S) {
                            bVar.F(aVar5);
                        } else {
                            bVar.p();
                        }
                        hlh0.a(bVar, aivVarC3, bVar5);
                        hlh0.a(bVar, ne00VarS4, dVar);
                        if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode4))) {
                            n30.a(iHashCode4, bVar, iHashCode4, c1350a2);
                        }
                        hlh0.a(bVar, dVarC4, cVar);
                        long jD = r58.d(2566914048L);
                        z16 = true;
                        androidx.compose.ui.d dVarD = g.d(aVar2, 0.0f, 2.0f, 1);
                        p8i p8iVar = a;
                        androidx.compose.runtime.b bVar6 = bVar;
                        imf0 imf0Var = imf0VarG;
                        lkf0.b(strC, dVarD, jD, 0L, null, null, p8iVar, 0L, null, 0L, 0, false, 0, 0, null, imf0Var, bVar6, 1573296, 0, 65464);
                        lkf0.b(strC, null, j58.f, 0L, null, null, p8iVar, 0L, null, 0L, 0, false, 0, 0, null, imf0Var, bVar6, 1573248, 0, 65466);
                        bVar.X(true);
                        zC2 = bVar.c(fFloatValue);
                        objY9 = bVar.y();
                        if (zC2 || objY9 == c0042a3) {
                            objY9 = new mhc0(fFloatValue);
                            bVar.r(objY9);
                        }
                        Function0 function1 = (Function0) objY9;
                        androidx.compose.ui.d dVarI = j.i(j.w(aVar2, f4 * 0.75f), 6.0f);
                        if (!z || z4) {
                            f8 = 0.0f;
                        } else {
                            f8 = 1.0f;
                        }
                        androidx.compose.ui.d dVarA5 = dw.a(dVarI, f8);
                        long j3 = j58.l;
                        objY10 = bVar.y();
                        if (objY10 == c0042a3) {
                            objY10 = new qmb0();
                            bVar.r(objY10);
                        }
                        q330.c(function1, dVarA5, j2, j3, 0, 0.0f, (Function1) objY10, bVar, ((i13 >> 6) & 896) | 1575936, 48);
                        f30.a(bVar, true, true, false);
                    } else {
                        z16 = true;
                        bVar.N(1803739427);
                        bVar.X(z15);
                    }
                    bVar.X(z16);
                    str7 = str10;
                    str8 = "animation";
                    cnb0Var3 = cnb0Var10;
                    cnb0Var4 = cnb0Var9;
                    str9 = "animation";
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                if (z7) {
                    cnb0Var9 = cnb0Var8;
                    c0042a2 = c0042a;
                    bVar = bVarI;
                    aVar4 = aVar3;
                    z14 = false;
                    i7 = 57344;
                    f5 = 0.0f;
                    i8 = 1803739427;
                    bVar.N(1803739427);
                    bVar.X(false);
                } else {
                    cnb0Var9 = cnb0Var8;
                    c0042a2 = c0042a;
                    bVar = bVarI;
                    aVar4 = aVar3;
                    z14 = false;
                    i7 = 57344;
                    f5 = 0.0f;
                    i8 = 1803739427;
                    bVar.N(1803739427);
                    bVar.X(false);
                }
                if (z6) {
                    cnb0Var10 = cnb0Var7;
                    z15 = z14;
                    str10 = "animation";
                    bVar.N(i8);
                } else {
                    cnb0Var10 = cnb0Var7;
                    z15 = z14;
                    str10 = "animation";
                    bVar.N(i8);
                }
                bVar.X(z15);
                if (zEquals) {
                    bVar.N(1811728127);
                    if ((i13 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    i9 = i13 & 14;
                    if (i9 == 4) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    z19 = z18 | z17;
                    objY6 = bVar.y();
                    c0042a3 = c0042a2;
                    if (z19) {
                        objY6 = androidx.compose.runtime.j.a(f2);
                        bVar.r(objY6);
                    } else {
                        objY6 = androidx.compose.runtime.j.a(f2);
                        bVar.r(objY6);
                    }
                    iswVar = (isw) objY6;
                    Boolean boolValueOf2 = Boolean.valueOf(zEquals);
                    Long lValueOf2 = Long.valueOf(j);
                    Float fValueOf2 = Float.valueOf(f2);
                    boolean zM2 = bVar.M(iswVar);
                    if (i9 == 4) {
                        z20 = true;
                    } else {
                        z20 = z15;
                    }
                    zB = z20 | zM2 | bVar.b(zEquals);
                    objY7 = bVar.y();
                    if (zB) {
                        objY7 = new c(f2, zEquals, iswVar, null);
                        bVar.r(objY7);
                    } else {
                        objY7 = new c(f2, zEquals, iswVar, null);
                        bVar.r(objY7);
                    }
                    xvf.f(boolValueOf2, lValueOf2, fValueOf2, (Function2) objY7, bVar);
                    androidx.compose.ui.d dVarA6 = abk0.a(h.j(j.e(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, configuration.screenHeightDp / fnb0Var.i, 7), 2.0f);
                    aiv aivVarC4 = g75.c(n54Var, z15);
                    iHashCode2 = Long.hashCode(bVar.m());
                    ne00 ne00VarS5 = bVar.S();
                    androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(bVar, dVarA6);
                    bVar.D();
                    if (bVar.S) {
                        aVar5 = aVar4;
                        bVar.F(aVar5);
                    } else {
                        aVar5 = aVar4;
                        bVar.p();
                    }
                    yka.a.b bVar7 = bVar3;
                    hlh0.a(bVar, aivVarC4, bVar7);
                    hlh0.a(bVar, ne00VarS5, dVar);
                    if (bVar.S) {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar, iHashCode2, c1350a2);
                    } else {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar, iHashCode2, c1350a2);
                    }
                    hlh0.a(bVar, dVarC5, cVar);
                    androidx.compose.ui.d dVarG3 = j.g(aVar2, 1.0f);
                    i78 i78VarA2 = g78.a(kw0.c, ht.a.n, bVar, 48);
                    iHashCode3 = Long.hashCode(bVar.m());
                    ne00 ne00VarS6 = bVar.S();
                    androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(bVar, dVarG3);
                    bVar.D();
                    if (bVar.S) {
                        bVar.F(aVar5);
                    } else {
                        bVar.p();
                    }
                    hlh0.a(bVar, i78VarA2, bVar7);
                    hlh0.a(bVar, ne00VarS6, dVar);
                    if (bVar.S) {
                        n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVar, dVarC6, cVar);
                    boolean zC4 = bVar.c(iswVar.j());
                    if ((i13 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zC4 | z21;
                    objY8 = bVar.y();
                    if (z22) {
                        f6 = 0.0f;
                        if (f3 > 0.0f) {
                            fD = kotlin.ranges.f.d(iswVar.j() / f3, 0.0f, 1.0f);
                        } else {
                            fD = 0.0f;
                        }
                        objY8 = Float.valueOf(fD);
                        bVar.r(objY8);
                    } else {
                        f6 = 0.0f;
                        if (f3 > 0.0f) {
                            fD = kotlin.ranges.f.d(iswVar.j() / f3, 0.0f, 1.0f);
                        } else {
                            fD = 0.0f;
                        }
                        objY8 = Float.valueOf(fD);
                        bVar.r(objY8);
                    }
                    fFloatValue = ((Number) objY8).floatValue();
                    strC = op5.c(op5.a, pwo.e(R.string.power_up_next_round_cms, bVar), pwo.e(R.string.powering_up_for_next_round, bVar));
                    if (strC.length() > 28) {
                        bVar.N(-1689061333);
                        imf0VarG = ni60.g(((sfd0) bVar.O(ni60.b)).d, R.dimen._14ssp, bVar);
                        bVar.X(false);
                    } else {
                        bVar.N(-1689057493);
                        imf0VarG = ni60.g(((sfd0) bVar.O(ni60.b)).d, R.dimen._16ssp, bVar);
                        bVar.X(false);
                    }
                    androidx.compose.ui.d dVarJ2 = h.j(aVar2, 3.0f, 0.0f, 0.0f, 9.0f, 6);
                    if (z) {
                        f7 = f6;
                    } else {
                        f7 = f6;
                    }
                    androidx.compose.ui.d dVarA7 = dw.a(dVarJ2, f7);
                    aiv aivVarC5 = g75.c(ht.a.e, false);
                    iHashCode4 = Long.hashCode(bVar.m());
                    ne00 ne00VarS7 = bVar.S();
                    androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(bVar, dVarA7);
                    bVar.D();
                    if (bVar.S) {
                        bVar.F(aVar5);
                    } else {
                        bVar.p();
                    }
                    hlh0.a(bVar, aivVarC5, bVar7);
                    hlh0.a(bVar, ne00VarS7, dVar);
                    if (bVar.S) {
                        n30.a(iHashCode4, bVar, iHashCode4, c1350a2);
                    } else {
                        n30.a(iHashCode4, bVar, iHashCode4, c1350a2);
                    }
                    hlh0.a(bVar, dVarC7, cVar);
                    long jD2 = r58.d(2566914048L);
                    z16 = true;
                    androidx.compose.ui.d dVarD2 = g.d(aVar2, 0.0f, 2.0f, 1);
                    p8i p8iVar2 = a;
                    androidx.compose.runtime.b bVar8 = bVar;
                    imf0 imf0Var2 = imf0VarG;
                    lkf0.b(strC, dVarD2, jD2, 0L, null, null, p8iVar2, 0L, null, 0L, 0, false, 0, 0, null, imf0Var2, bVar8, 1573296, 0, 65464);
                    lkf0.b(strC, null, j58.f, 0L, null, null, p8iVar2, 0L, null, 0L, 0, false, 0, 0, null, imf0Var2, bVar8, 1573248, 0, 65466);
                    bVar.X(true);
                    zC2 = bVar.c(fFloatValue);
                    objY9 = bVar.y();
                    if (zC2) {
                        objY9 = new mhc0(fFloatValue);
                        bVar.r(objY9);
                    } else {
                        objY9 = new mhc0(fFloatValue);
                        bVar.r(objY9);
                    }
                    Function0 function2 = (Function0) objY9;
                    androidx.compose.ui.d dVarI2 = j.i(j.w(aVar2, f4 * 0.75f), 6.0f);
                    if (z) {
                        f8 = 0.0f;
                    } else {
                        f8 = 0.0f;
                    }
                    androidx.compose.ui.d dVarA8 = dw.a(dVarI2, f8);
                    long j4 = j58.l;
                    objY10 = bVar.y();
                    if (objY10 == c0042a3) {
                        objY10 = new qmb0();
                        bVar.r(objY10);
                    }
                    q330.c(function2, dVarA8, j2, j4, 0, 0.0f, (Function1) objY10, bVar, ((i13 >> 6) & 896) | 1575936, 48);
                    f30.a(bVar, true, true, false);
                } else {
                    z16 = true;
                    bVar.N(1803739427);
                    bVar.X(z15);
                }
                bVar.X(z16);
                str7 = str10;
                str8 = "animation";
                cnb0Var3 = cnb0Var10;
                cnb0Var4 = cnb0Var9;
                str9 = "animation";
            } else {
                bVar = bVarI;
                bVar.G();
                str7 = str2;
                str8 = str3;
                str9 = str4;
                cnb0Var3 = cnb0Var;
                cnb0Var4 = cnb0Var2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2(str, file, file2, file3, file4, str7, str8, str9, str5, str6, f2, f3, j, z, j2, z2, z3, i, z4, cnb0Var3, cnb0Var4, i2, i3, i4, i5) { // from class: rmb0
                    public final /* synthetic */ float A;
                    public final /* synthetic */ long B;
                    public final /* synthetic */ boolean C;
                    public final /* synthetic */ long D;
                    public final /* synthetic */ boolean E;
                    public final /* synthetic */ boolean F;
                    public final /* synthetic */ int G;
                    public final /* synthetic */ boolean H;
                    public final /* synthetic */ cnb0 I;
                    public final /* synthetic */ cnb0 J;
                    public final /* synthetic */ int K;
                    public final /* synthetic */ int L;
                    public final /* synthetic */ int M;
                    public final /* synthetic */ String a;
                    public final /* synthetic */ File b;
                    public final /* synthetic */ File c;
                    public final /* synthetic */ File d;
                    public final /* synthetic */ File e;
                    public final /* synthetic */ String f;
                    public final /* synthetic */ String i;
                    public final /* synthetic */ String v;
                    public final /* synthetic */ String w;
                    public final /* synthetic */ String y;
                    public final /* synthetic */ float z;

                    {
                        this.K = i3;
                        this.L = i4;
                        this.M = i5;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(1);
                        int iA2 = qj40.a(this.K);
                        int iA3 = qj40.a(this.L);
                        umb0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (a) obj, iA, iA2, iA3, this.M);
                        return Unit.a;
                    }
                };
            }
        }
        z5 = true;
        if (bVarI.q(i10 & 1, z5)) {
            if (i12 != 0) {
                cnb0Var5 = cnb0.a;
            } else {
                cnb0Var5 = cnb0Var;
            }
            if (i14 != 0) {
                cnb0Var6 = cnb0.b;
            } else {
                cnb0Var6 = cnb0Var2;
            }
            if (file == null) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (file3 == null) {
                z7 = false;
            } else {
                z7 = false;
            }
            configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            cnb0Var7 = cnb0Var5;
            f4 = configuration.screenWidthDp;
            density = ((mmd) bVarI.O(kna.h)).getDensity() * f4;
            cnb0Var8 = cnb0Var6;
            if ((i13 & 29360128) == 8388608) {
                z8 = true;
            } else {
                z8 = false;
            }
            zC = z8 | bVarI.c(density);
            objY = bVarI.y();
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zC) {
                objY = vi8.a(i, density);
                bVarI.r(objY);
            } else {
                objY = vi8.a(i, density);
                bVarI.r(objY);
            }
            fnb0Var = (fnb0) objY;
            if (z3) {
                listK = kotlin.collections.b.k("Car 5: set2", "Car 5: set3_2(right stadium )", "Car 5: set2", "Car 5: set3_1(Sportyboard)", "Car 5: set2", "Car 5: set3_4(left and right stadium )", "Car 5: set2", "Car 5: set3_3(left stadium )", "Car 5: set2", "Car 5: set3_1(Sportyboard)");
            } else {
                listK = null;
            }
            zEquals = str.equals("ROUND_WAITING");
            List list2 = listK;
            if (str.equals("ROUND_PRE_START")) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (str.equals("ROUND_WAITING")) {
                z10 = false;
            } else {
                z10 = false;
            }
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytwVar = (ytw) objY2;
            objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(Boolean.FALSE);
                bVarI.r(objY3);
            }
            ytwVar2 = (ytw) objY3;
            if (file != null) {
                path = file.getPath();
            } else {
                path = null;
            }
            if (file2 != null) {
                path2 = file2.getPath();
            } else {
                path2 = null;
            }
            boolean z25 = z10;
            objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new a(ytwVar, null);
                bVarI.r(objY4);
            }
            xvf.g(path, path2, (Function2) objY4, bVarI);
            if (file3 != null) {
                path3 = file3.getPath();
            } else {
                path3 = null;
            }
            if (file4 != null) {
                path4 = file4.getPath();
            } else {
                path4 = null;
            }
            objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new b(ytwVar2, null);
                bVarI.r(objY5);
            }
            xvf.g(path3, path4, (Function2) objY5, bVarI);
            if (z9) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (zEquals) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (z2) {
                z13 = true;
            } else {
                z13 = true;
            }
            aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG4 = j.g(aVar2, 1.0f);
            n54Var = ht.a.h;
            boolean z26 = z12;
            aiv aivVarC6 = g75.c(n54Var, false);
            iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS8 = bVarI.S();
            androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(bVarI, dVarG4);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC6, bVar2);
            dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS8, dVar);
            c1350a = yka.a.g;
            if (bVarI.S) {
                bVar3 = bVar2;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC8, cVar);
                if (z7) {
                    cnb0Var9 = cnb0Var8;
                    c0042a2 = c0042a;
                    bVar = bVarI;
                    aVar4 = aVar3;
                    z14 = false;
                    i7 = 57344;
                    f5 = 0.0f;
                    i8 = 1803739427;
                    bVar.N(1803739427);
                    bVar.X(false);
                } else {
                    cnb0Var9 = cnb0Var8;
                    c0042a2 = c0042a;
                    bVar = bVarI;
                    aVar4 = aVar3;
                    z14 = false;
                    i7 = 57344;
                    f5 = 0.0f;
                    i8 = 1803739427;
                    bVar.N(1803739427);
                    bVar.X(false);
                }
                if (z6) {
                    cnb0Var10 = cnb0Var7;
                    z15 = z14;
                    str10 = "animation";
                    bVar.N(i8);
                } else {
                    cnb0Var10 = cnb0Var7;
                    z15 = z14;
                    str10 = "animation";
                    bVar.N(i8);
                }
                bVar.X(z15);
                if (zEquals) {
                    bVar.N(1811728127);
                    if ((i13 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    i9 = i13 & 14;
                    if (i9 == 4) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    z19 = z18 | z17;
                    objY6 = bVar.y();
                    c0042a3 = c0042a2;
                    if (z19) {
                        objY6 = androidx.compose.runtime.j.a(f2);
                        bVar.r(objY6);
                    } else {
                        objY6 = androidx.compose.runtime.j.a(f2);
                        bVar.r(objY6);
                    }
                    iswVar = (isw) objY6;
                    Boolean boolValueOf3 = Boolean.valueOf(zEquals);
                    Long lValueOf3 = Long.valueOf(j);
                    Float fValueOf3 = Float.valueOf(f2);
                    boolean zM3 = bVar.M(iswVar);
                    if (i9 == 4) {
                        z20 = true;
                    } else {
                        z20 = z15;
                    }
                    zB = z20 | zM3 | bVar.b(zEquals);
                    objY7 = bVar.y();
                    if (zB) {
                        objY7 = new c(f2, zEquals, iswVar, null);
                        bVar.r(objY7);
                    } else {
                        objY7 = new c(f2, zEquals, iswVar, null);
                        bVar.r(objY7);
                    }
                    xvf.f(boolValueOf3, lValueOf3, fValueOf3, (Function2) objY7, bVar);
                    androidx.compose.ui.d dVarA9 = abk0.a(h.j(j.e(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, configuration.screenHeightDp / fnb0Var.i, 7), 2.0f);
                    aiv aivVarC7 = g75.c(n54Var, z15);
                    iHashCode2 = Long.hashCode(bVar.m());
                    ne00 ne00VarS9 = bVar.S();
                    androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(bVar, dVarA9);
                    bVar.D();
                    if (bVar.S) {
                        aVar5 = aVar4;
                        bVar.F(aVar5);
                    } else {
                        aVar5 = aVar4;
                        bVar.p();
                    }
                    yka.a.b bVar9 = bVar3;
                    hlh0.a(bVar, aivVarC7, bVar9);
                    hlh0.a(bVar, ne00VarS9, dVar);
                    if (bVar.S) {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar, iHashCode2, c1350a2);
                    } else {
                        c1350a2 = c1350a;
                        n30.a(iHashCode2, bVar, iHashCode2, c1350a2);
                    }
                    hlh0.a(bVar, dVarC9, cVar);
                    androidx.compose.ui.d dVarG5 = j.g(aVar2, 1.0f);
                    i78 i78VarA3 = g78.a(kw0.c, ht.a.n, bVar, 48);
                    iHashCode3 = Long.hashCode(bVar.m());
                    ne00 ne00VarS10 = bVar.S();
                    androidx.compose.ui.d dVarC10 = androidx.compose.ui.c.c(bVar, dVarG5);
                    bVar.D();
                    if (bVar.S) {
                        bVar.F(aVar5);
                    } else {
                        bVar.p();
                    }
                    hlh0.a(bVar, i78VarA3, bVar9);
                    hlh0.a(bVar, ne00VarS10, dVar);
                    if (bVar.S) {
                        n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
                    } else {
                        n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
                    }
                    hlh0.a(bVar, dVarC10, cVar);
                    boolean zC5 = bVar.c(iswVar.j());
                    if ((i13 & 112) == 32) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zC5 | z21;
                    objY8 = bVar.y();
                    if (z22) {
                        f6 = 0.0f;
                        if (f3 > 0.0f) {
                            fD = kotlin.ranges.f.d(iswVar.j() / f3, 0.0f, 1.0f);
                        } else {
                            fD = 0.0f;
                        }
                        objY8 = Float.valueOf(fD);
                        bVar.r(objY8);
                    } else {
                        f6 = 0.0f;
                        if (f3 > 0.0f) {
                            fD = kotlin.ranges.f.d(iswVar.j() / f3, 0.0f, 1.0f);
                        } else {
                            fD = 0.0f;
                        }
                        objY8 = Float.valueOf(fD);
                        bVar.r(objY8);
                    }
                    fFloatValue = ((Number) objY8).floatValue();
                    strC = op5.c(op5.a, pwo.e(R.string.power_up_next_round_cms, bVar), pwo.e(R.string.powering_up_for_next_round, bVar));
                    if (strC.length() > 28) {
                        bVar.N(-1689061333);
                        imf0VarG = ni60.g(((sfd0) bVar.O(ni60.b)).d, R.dimen._14ssp, bVar);
                        bVar.X(false);
                    } else {
                        bVar.N(-1689057493);
                        imf0VarG = ni60.g(((sfd0) bVar.O(ni60.b)).d, R.dimen._16ssp, bVar);
                        bVar.X(false);
                    }
                    androidx.compose.ui.d dVarJ3 = h.j(aVar2, 3.0f, 0.0f, 0.0f, 9.0f, 6);
                    if (z) {
                        f7 = f6;
                    } else {
                        f7 = f6;
                    }
                    androidx.compose.ui.d dVarA10 = dw.a(dVarJ3, f7);
                    aiv aivVarC8 = g75.c(ht.a.e, false);
                    iHashCode4 = Long.hashCode(bVar.m());
                    ne00 ne00VarS11 = bVar.S();
                    androidx.compose.ui.d dVarC11 = androidx.compose.ui.c.c(bVar, dVarA10);
                    bVar.D();
                    if (bVar.S) {
                        bVar.F(aVar5);
                    } else {
                        bVar.p();
                    }
                    hlh0.a(bVar, aivVarC8, bVar9);
                    hlh0.a(bVar, ne00VarS11, dVar);
                    if (bVar.S) {
                        n30.a(iHashCode4, bVar, iHashCode4, c1350a2);
                    } else {
                        n30.a(iHashCode4, bVar, iHashCode4, c1350a2);
                    }
                    hlh0.a(bVar, dVarC11, cVar);
                    long jD3 = r58.d(2566914048L);
                    z16 = true;
                    androidx.compose.ui.d dVarD3 = g.d(aVar2, 0.0f, 2.0f, 1);
                    p8i p8iVar3 = a;
                    androidx.compose.runtime.b bVar10 = bVar;
                    imf0 imf0Var3 = imf0VarG;
                    lkf0.b(strC, dVarD3, jD3, 0L, null, null, p8iVar3, 0L, null, 0L, 0, false, 0, 0, null, imf0Var3, bVar10, 1573296, 0, 65464);
                    lkf0.b(strC, null, j58.f, 0L, null, null, p8iVar3, 0L, null, 0L, 0, false, 0, 0, null, imf0Var3, bVar10, 1573248, 0, 65466);
                    bVar.X(true);
                    zC2 = bVar.c(fFloatValue);
                    objY9 = bVar.y();
                    if (zC2) {
                        objY9 = new mhc0(fFloatValue);
                        bVar.r(objY9);
                    } else {
                        objY9 = new mhc0(fFloatValue);
                        bVar.r(objY9);
                    }
                    Function0 function3 = (Function0) objY9;
                    androidx.compose.ui.d dVarI3 = j.i(j.w(aVar2, f4 * 0.75f), 6.0f);
                    if (z) {
                        f8 = 0.0f;
                    } else {
                        f8 = 0.0f;
                    }
                    androidx.compose.ui.d dVarA11 = dw.a(dVarI3, f8);
                    long j5 = j58.l;
                    objY10 = bVar.y();
                    if (objY10 == c0042a3) {
                        objY10 = new qmb0();
                        bVar.r(objY10);
                    }
                    q330.c(function3, dVarA11, j2, j5, 0, 0.0f, (Function1) objY10, bVar, ((i13 >> 6) & 896) | 1575936, 48);
                    f30.a(bVar, true, true, false);
                } else {
                    z16 = true;
                    bVar.N(1803739427);
                    bVar.X(z15);
                }
                bVar.X(z16);
                str7 = str10;
                str8 = "animation";
                cnb0Var3 = cnb0Var10;
                cnb0Var4 = cnb0Var9;
                str9 = "animation";
            } else {
                bVar3 = bVar2;
            }
            n30.a(iHashCode, bVarI, iHashCode, c1350a);
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC8, cVar);
            if (z7) {
                cnb0Var9 = cnb0Var8;
                c0042a2 = c0042a;
                bVar = bVarI;
                aVar4 = aVar3;
                z14 = false;
                i7 = 57344;
                f5 = 0.0f;
                i8 = 1803739427;
                bVar.N(1803739427);
                bVar.X(false);
            } else {
                cnb0Var9 = cnb0Var8;
                c0042a2 = c0042a;
                bVar = bVarI;
                aVar4 = aVar3;
                z14 = false;
                i7 = 57344;
                f5 = 0.0f;
                i8 = 1803739427;
                bVar.N(1803739427);
                bVar.X(false);
            }
            if (z6) {
                cnb0Var10 = cnb0Var7;
                z15 = z14;
                str10 = "animation";
                bVar.N(i8);
            } else {
                cnb0Var10 = cnb0Var7;
                z15 = z14;
                str10 = "animation";
                bVar.N(i8);
            }
            bVar.X(z15);
            if (zEquals) {
                bVar.N(1811728127);
                if ((i13 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = z15;
                }
                i9 = i13 & 14;
                if (i9 == 4) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                z19 = z18 | z17;
                objY6 = bVar.y();
                c0042a3 = c0042a2;
                if (z19) {
                    objY6 = androidx.compose.runtime.j.a(f2);
                    bVar.r(objY6);
                } else {
                    objY6 = androidx.compose.runtime.j.a(f2);
                    bVar.r(objY6);
                }
                iswVar = (isw) objY6;
                Boolean boolValueOf4 = Boolean.valueOf(zEquals);
                Long lValueOf4 = Long.valueOf(j);
                Float fValueOf4 = Float.valueOf(f2);
                boolean zM4 = bVar.M(iswVar);
                if (i9 == 4) {
                    z20 = true;
                } else {
                    z20 = z15;
                }
                zB = z20 | zM4 | bVar.b(zEquals);
                objY7 = bVar.y();
                if (zB) {
                    objY7 = new c(f2, zEquals, iswVar, null);
                    bVar.r(objY7);
                } else {
                    objY7 = new c(f2, zEquals, iswVar, null);
                    bVar.r(objY7);
                }
                xvf.f(boolValueOf4, lValueOf4, fValueOf4, (Function2) objY7, bVar);
                androidx.compose.ui.d dVarA12 = abk0.a(h.j(j.e(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, configuration.screenHeightDp / fnb0Var.i, 7), 2.0f);
                aiv aivVarC9 = g75.c(n54Var, z15);
                iHashCode2 = Long.hashCode(bVar.m());
                ne00 ne00VarS12 = bVar.S();
                androidx.compose.ui.d dVarC12 = androidx.compose.ui.c.c(bVar, dVarA12);
                bVar.D();
                if (bVar.S) {
                    aVar5 = aVar4;
                    bVar.F(aVar5);
                } else {
                    aVar5 = aVar4;
                    bVar.p();
                }
                yka.a.b bVar11 = bVar3;
                hlh0.a(bVar, aivVarC9, bVar11);
                hlh0.a(bVar, ne00VarS12, dVar);
                if (bVar.S) {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVar, iHashCode2, c1350a2);
                } else {
                    c1350a2 = c1350a;
                    n30.a(iHashCode2, bVar, iHashCode2, c1350a2);
                }
                hlh0.a(bVar, dVarC12, cVar);
                androidx.compose.ui.d dVarG6 = j.g(aVar2, 1.0f);
                i78 i78VarA4 = g78.a(kw0.c, ht.a.n, bVar, 48);
                iHashCode3 = Long.hashCode(bVar.m());
                ne00 ne00VarS13 = bVar.S();
                androidx.compose.ui.d dVarC13 = androidx.compose.ui.c.c(bVar, dVarG6);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar5);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, i78VarA4, bVar11);
                hlh0.a(bVar, ne00VarS13, dVar);
                if (bVar.S) {
                    n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
                } else {
                    n30.a(iHashCode3, bVar, iHashCode3, c1350a2);
                }
                hlh0.a(bVar, dVarC13, cVar);
                boolean zC6 = bVar.c(iswVar.j());
                if ((i13 & 112) == 32) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = zC6 | z21;
                objY8 = bVar.y();
                if (z22) {
                    f6 = 0.0f;
                    if (f3 > 0.0f) {
                        fD = kotlin.ranges.f.d(iswVar.j() / f3, 0.0f, 1.0f);
                    } else {
                        fD = 0.0f;
                    }
                    objY8 = Float.valueOf(fD);
                    bVar.r(objY8);
                } else {
                    f6 = 0.0f;
                    if (f3 > 0.0f) {
                        fD = kotlin.ranges.f.d(iswVar.j() / f3, 0.0f, 1.0f);
                    } else {
                        fD = 0.0f;
                    }
                    objY8 = Float.valueOf(fD);
                    bVar.r(objY8);
                }
                fFloatValue = ((Number) objY8).floatValue();
                strC = op5.c(op5.a, pwo.e(R.string.power_up_next_round_cms, bVar), pwo.e(R.string.powering_up_for_next_round, bVar));
                if (strC.length() > 28) {
                    bVar.N(-1689061333);
                    imf0VarG = ni60.g(((sfd0) bVar.O(ni60.b)).d, R.dimen._14ssp, bVar);
                    bVar.X(false);
                } else {
                    bVar.N(-1689057493);
                    imf0VarG = ni60.g(((sfd0) bVar.O(ni60.b)).d, R.dimen._16ssp, bVar);
                    bVar.X(false);
                }
                androidx.compose.ui.d dVarJ4 = h.j(aVar2, 3.0f, 0.0f, 0.0f, 9.0f, 6);
                if (z) {
                    f7 = f6;
                } else {
                    f7 = f6;
                }
                androidx.compose.ui.d dVarA13 = dw.a(dVarJ4, f7);
                aiv aivVarC10 = g75.c(ht.a.e, false);
                iHashCode4 = Long.hashCode(bVar.m());
                ne00 ne00VarS14 = bVar.S();
                androidx.compose.ui.d dVarC14 = androidx.compose.ui.c.c(bVar, dVarA13);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar5);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, aivVarC10, bVar11);
                hlh0.a(bVar, ne00VarS14, dVar);
                if (bVar.S) {
                    n30.a(iHashCode4, bVar, iHashCode4, c1350a2);
                } else {
                    n30.a(iHashCode4, bVar, iHashCode4, c1350a2);
                }
                hlh0.a(bVar, dVarC14, cVar);
                long jD4 = r58.d(2566914048L);
                z16 = true;
                androidx.compose.ui.d dVarD4 = g.d(aVar2, 0.0f, 2.0f, 1);
                p8i p8iVar4 = a;
                androidx.compose.runtime.b bVar12 = bVar;
                imf0 imf0Var4 = imf0VarG;
                lkf0.b(strC, dVarD4, jD4, 0L, null, null, p8iVar4, 0L, null, 0L, 0, false, 0, 0, null, imf0Var4, bVar12, 1573296, 0, 65464);
                lkf0.b(strC, null, j58.f, 0L, null, null, p8iVar4, 0L, null, 0L, 0, false, 0, 0, null, imf0Var4, bVar12, 1573248, 0, 65466);
                bVar.X(true);
                zC2 = bVar.c(fFloatValue);
                objY9 = bVar.y();
                if (zC2) {
                    objY9 = new mhc0(fFloatValue);
                    bVar.r(objY9);
                } else {
                    objY9 = new mhc0(fFloatValue);
                    bVar.r(objY9);
                }
                Function0 function4 = (Function0) objY9;
                androidx.compose.ui.d dVarI4 = j.i(j.w(aVar2, f4 * 0.75f), 6.0f);
                if (z) {
                    f8 = 0.0f;
                } else {
                    f8 = 0.0f;
                }
                androidx.compose.ui.d dVarA14 = dw.a(dVarI4, f8);
                long j6 = j58.l;
                objY10 = bVar.y();
                if (objY10 == c0042a3) {
                    objY10 = new qmb0();
                    bVar.r(objY10);
                }
                q330.c(function4, dVarA14, j2, j6, 0, 0.0f, (Function1) objY10, bVar, ((i13 >> 6) & 896) | 1575936, 48);
                f30.a(bVar, true, true, false);
            } else {
                z16 = true;
                bVar.N(1803739427);
                bVar.X(z15);
            }
            bVar.X(z16);
            str7 = str10;
            str8 = "animation";
            cnb0Var3 = cnb0Var10;
            cnb0Var4 = cnb0Var9;
            str9 = "animation";
        } else {
            bVar = bVarI;
            bVar.G();
            str7 = str2;
            str8 = str3;
            str9 = str4;
            cnb0Var3 = cnb0Var;
            cnb0Var4 = cnb0Var2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, file, file2, file3, file4, str7, str8, str9, str5, str6, f2, f3, j, z, j2, z2, z3, i, z4, cnb0Var3, cnb0Var4, i2, i3, i4, i5) { // from class: rmb0
                public final /* synthetic */ float A;
                public final /* synthetic */ long B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ long D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ int G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ cnb0 I;
                public final /* synthetic */ cnb0 J;
                public final /* synthetic */ int K;
                public final /* synthetic */ int L;
                public final /* synthetic */ int M;
                public final /* synthetic */ String a;
                public final /* synthetic */ File b;
                public final /* synthetic */ File c;
                public final /* synthetic */ File d;
                public final /* synthetic */ File e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String i;
                public final /* synthetic */ String v;
                public final /* synthetic */ String w;
                public final /* synthetic */ String y;
                public final /* synthetic */ float z;

                {
                    this.K = i3;
                    this.L = i4;
                    this.M = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    int iA2 = qj40.a(this.K);
                    int iA3 = qj40.a(this.L);
                    umb0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (a) obj, iA, iA2, iA3, this.M);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final File file, final File file2, float f2, androidx.compose.ui.d dVar, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        float f3;
        final androidx.compose.ui.d dVar2;
        androidx.compose.runtime.e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2;
        int i2;
        float f4;
        final ytw ytwVar;
        String str2 = str;
        str2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(219366996);
        int i3 = i | (bVarI.M(str2) ? 4 : 2) | (bVarI.A(file) ? 32 : 16) | (bVarI.A(file2) ? 256 : 128) | 224256 | (bVarI.b(z) ? 1048576 : 524288);
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            if (file == null || file2 == null || !file.exists() || !file2.exists()) {
                final float f5 = 6.0f;
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2(str, file, file2, f5, z, i) { // from class: jmb0
                        public final /* synthetic */ String a;
                        public final /* synthetic */ File b;
                        public final /* synthetic */ File c;
                        public final /* synthetic */ float d;
                        public final /* synthetic */ boolean e;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(1);
                            umb0.b(this.a, this.b, this.c, this.d, d.a.b, this.e, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                }
            } else {
                androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                bVarI.C(2007979385, bVarI.l(file.getPath(), file2.getPath()));
                Object objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(null);
                    bVarI.r(objY);
                }
                ytw ytwVar2 = (ytw) objY;
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    String name = file.getName();
                    name.getClass();
                    objY2 = "speedo-".concat(StringsKt.q0('.', name));
                    bVarI.r(objY2);
                }
                final String str3 = (String) objY2;
                T value = ytwVar2.getValue();
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean z2 = (3670016 & i3) == 1048576;
                int i4 = i3 & 14;
                boolean z3 = z2 | (i4 == 4);
                Object objY3 = bVarI.y();
                if (z3 || objY3 == c0042a) {
                    i2 = i4;
                    vmb0 vmb0Var = new vmb0(ytwVar2, z, str2, 6.0f, str3, null);
                    f4 = 6.0f;
                    ytwVar = ytwVar2;
                    str2 = str2;
                    bVarI.r(vmb0Var);
                    objY3 = vmb0Var;
                } else {
                    i2 = i4;
                    ytwVar = ytwVar2;
                    f4 = 6.0f;
                }
                xvf.f(value, str2, boolValueOf, (Function2) objY3, bVarI);
                androidx.compose.ui.d dVarA = s3w.a(j.e(aVar2, 1.0f), "sporty_car_speedometer_spine");
                boolean zA = bVarI.A(file) | (i2 == 4) | bVarI.A(file2);
                Object objY4 = bVarI.y();
                if (zA || objY4 == c0042a) {
                    final float f6 = f4;
                    final String str4 = str2;
                    Function1 function1 = new Function1() { // from class: mmb0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Context context = (Context) obj;
                            context.getClass();
                            File file3 = file;
                            File parentFile = file3.getParentFile();
                            String name2 = file3.getName();
                            name2.getClass();
                            new File(parentFile, StringsKt.p0(name2, ".", name2).concat(".png"));
                            Pair<String, Boolean> pairF = umb0.f(str4);
                            final String str5 = pairF.a;
                            final boolean zBooleanValue = pairF.b.booleanValue();
                            final ytw ytwVar3 = ytwVar;
                            final float f7 = f6;
                            final String str6 = str3;
                            SpineView spineViewA = SpineView.a(file3, file2, context, new b(new hcb0(str5, zBooleanValue, f7, str6) { // from class: smb0
                                public final /* synthetic */ String b;
                                public final /* synthetic */ boolean c;
                                public final /* synthetic */ float d;

                                @Override // defpackage.hcb0
                                public final void b(b bVar2) {
                                    this.a.setValue(bVar2);
                                    bVar2.getClass();
                                    umb0.d(bVar2, this.b, this.c, this.d, null, null, false, 0.0f);
                                }
                            }));
                            spineViewA.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                            Double dValueOf = Double.valueOf(-1000.0d);
                            Double dValueOf2 = Double.valueOf(2000.0d);
                            spineViewA.setBoundsProvider(new q040(dValueOf, dValueOf, dValueOf2, dValueOf2));
                            spineViewA.setContentMode(zza.a);
                            return spineViewA;
                        }
                    };
                    f3 = f6;
                    bVarI.r(function1);
                    objY4 = function1;
                } else {
                    f3 = f4;
                }
                Function1 function3 = (Function1) objY4;
                Object objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    objY5 = new nmb0();
                    bVarI.r(objY5);
                }
                bVar = bVarI;
                androidx.compose.ui.viewinterop.b.a(function3, dVarA, (Function1) objY5, bVar, 384, 0);
                bVar.X(false);
                bVar.X(true);
                dVar2 = aVar2;
            }
            eVarZ.d = function2;
        }
        bVar = bVarI;
        bVar.G();
        f3 = f2;
        dVar2 = dVar;
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            final float f7 = f3;
            function2 = new Function2(str, file, file2, f7, dVar2, z, i) { // from class: omb0
                public final /* synthetic */ String a;
                public final /* synthetic */ File b;
                public final /* synthetic */ File c;
                public final /* synthetic */ float d;
                public final /* synthetic */ d e;
                public final /* synthetic */ boolean f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    umb0.b(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final File file, final File file2, final String str, final boolean z, final String str2, androidx.compose.ui.d dVar, final float f2, final cnb0 cnb0Var, final boolean z2, List<String> list, Function0<Unit> function0, boolean z3, boolean z4, final float f3, final boolean z5, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        String str3;
        final List<String> list2;
        int i5;
        int i6;
        androidx.compose.runtime.b bVar;
        final androidx.compose.ui.d dVar2;
        final Function0<Unit> function1;
        final boolean z6;
        final boolean z7;
        boolean z8;
        boolean z9;
        String str4;
        final Function0<Unit> function2;
        List<String> list3;
        file.getClass();
        file2.getClass();
        str.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-706582060);
        if ((i & 6) == 0) {
            i4 = (bVarI.A(file) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= bVarI.A(file2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str3 = str2;
            i4 |= bVarI.M(str3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            str3 = str2;
        }
        int i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= bVarI.M(dVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= bVarI.c(f2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= bVarI.d(cnb0Var == null ? -1 : cnb0Var.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= bVarI.b(z2) ? 67108864 : 33554432;
        }
        int i8 = i3 & 512;
        if (i8 != 0) {
            i4 |= 805306368;
            list2 = list;
        } else {
            list2 = list;
            if ((i & 805306368) == 0) {
                i4 |= bVarI.A(list2) ? 536870912 : 268435456;
            }
        }
        int i9 = i3 & 1024;
        if (i9 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (bVarI.A(function0) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i10 = i3 & 2048;
        if (i10 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= bVarI.b(z3) ? 32 : 16;
        }
        int i11 = i5;
        int i12 = i3 & 4096;
        if (i12 != 0) {
            i6 = i11 | 384;
        } else {
            i6 = i11 | (bVarI.b(z4) ? 256 : 128);
        }
        if ((i2 & 3072) == 0) {
            i6 |= bVarI.c(f3) ? 2048 : 1024;
        }
        if (bVarI.q(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            androidx.compose.ui.d dVar3 = i7 != 0 ? androidx.compose.ui.d.a.b : dVar;
            List<String> list4 = i8 != 0 ? null : list2;
            Function0<Unit> function3 = i9 != 0 ? null : function0;
            boolean z10 = i10 != 0 ? false : z3;
            boolean z11 = i12 != 0 ? true : z4;
            int i13 = 29360128 & i4;
            boolean zM = (i13 == 8388608) | bVarI.M(file) | bVarI.M(file2);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                String lowerCase = cnb0Var.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String name = file.getName();
                name.getClass();
                objY = "car-spine-" + lowerCase + "-" + StringsKt.q0('.', name);
                bVarI.r(objY);
            }
            String str5 = (String) objY;
            boolean zM2 = bVarI.M(file.getPath()) | bVarI.M(file2.getPath()) | (i13 == 8388608);
            Object objY2 = bVarI.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            ytw ytwVar = (ytw) objY2;
            Object[] objArr = {(com.esotericsoftware.spine.android.b) ytwVar.getValue(), str, str3, Boolean.valueOf(z), Float.valueOf(f2), list4};
            List<String> list5 = list4;
            int i14 = i6 & 112;
            ytw ytwVar2 = ytwVar;
            int i15 = i4 & 896;
            boolean zM3 = (i14 == 32) | bVarI.M(ytwVar) | (i15 == 256);
            int i16 = i4 & 7168;
            int i17 = i4;
            int i18 = i17 & 3670016;
            int i19 = i17 & 57344;
            Function0<Unit> function4 = function3;
            boolean zM4 = zM3 | (i16 == 2048) | (i18 == 1048576) | (i19 == 16384) | bVarI.M(str5) | bVarI.A(list5);
            List<String> list6 = list5;
            int i20 = i6 & 7168;
            boolean z12 = (i20 == 2048) | zM4;
            Object objY3 = bVarI.y();
            if (z12 || objY3 == c0042a) {
                objY3 = new d(z10, str, z, f2, str2, str5, list6, z5, f3, ytwVar2, null);
                list6 = list6;
                bVarI.r(objY3);
            }
            xvf.h(objArr, (Function2) objY3, bVarI);
            final List<String> list7 = list6;
            Object[] objArr2 = {(com.esotericsoftware.spine.android.b) ytwVar2.getValue(), Boolean.valueOf(z11), str, str2, Boolean.valueOf(z), Float.valueOf(f2), list7};
            int i21 = i6 & 896;
            int i22 = i6;
            boolean zM5 = bVarI.M(ytwVar2) | (i14 == 32) | (i21 == 256) | (i15 == 256) | (i16 == 2048) | (i18 == 1048576) | (i19 == 16384) | bVarI.M(r22) | bVarI.A(list7) | (i20 == 2048);
            Object objY4 = bVarI.y();
            if (zM5 || objY4 == c0042a) {
                z8 = z10;
                boolean z13 = z11;
                objY4 = new e(z8, z13, str, z, f2, str2, r22, list7, z5, f3, ytwVar2, null);
                z9 = z13;
                ytwVar2 = ytwVar2;
                str4 = r22;
                bVarI.r(objY4);
            } else {
                z8 = z10;
                str4 = str5;
                z9 = z11;
            }
            xvf.h(objArr2, (Function2) objY4, bVarI);
            com.esotericsoftware.spine.android.b bVar2 = (com.esotericsoftware.spine.android.b) ytwVar2.getValue();
            Boolean boolValueOf = Boolean.valueOf(z9);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            final String str6 = str4;
            final ytw ytwVar3 = ytwVar2;
            boolean zM6 = bVarI.M(ytwVar3) | ((i17 & 234881024) == 67108864) | (i21 == 256);
            Object objY5 = bVarI.y();
            if (zM6 || objY5 == c0042a) {
                objY5 = new f(z2, z9, ytwVar3, null);
                bVarI.r(objY5);
            }
            xvf.f(bVar2, boolValueOf, boolValueOf2, (Function2) objY5, bVarI);
            boolean zA = (i16 == 2048) | bVarI.A(file) | bVarI.A(file2) | bVarI.M(ytwVar3) | (i14 == 32) | (i15 == 256) | (i18 == 1048576) | (i19 == 16384) | bVarI.M(str6) | bVarI.A(list7) | (i20 == 2048) | ((i22 & 14) == 4);
            Object objY6 = bVarI.y();
            if (zA || objY6 == c0042a) {
                bVar = bVarI;
                final boolean z14 = z8;
                function2 = function4;
                Function1 function5 = new Function1() { // from class: tmb0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        File file3 = file;
                        File parentFile = file3.getParentFile();
                        String name2 = file3.getName();
                        name2.getClass();
                        new File(parentFile, StringsKt.p0(name2, ".", name2).concat(".png"));
                        SpineView spineViewA = SpineView.a(file3, file2, context, new b(new hcb0(z14, str, z, f2, str2, str6, list7, z5, f3, function2) { // from class: lmb0
                            public final /* synthetic */ boolean b;
                            public final /* synthetic */ String c;
                            public final /* synthetic */ boolean d;
                            public final /* synthetic */ float e;
                            public final /* synthetic */ String f;
                            public final /* synthetic */ List i;
                            public final /* synthetic */ boolean v;
                            public final /* synthetic */ float w;
                            public final /* synthetic */ Function0 y;

                            {
                                this.i = list;
                                this.v = z;
                                this.w = f;
                                this.y = function0;
                            }

                            @Override // defpackage.hcb0
                            public final void b(b bVar3) {
                                this.a.setValue(bVar3);
                                boolean z15 = this.b;
                                float f4 = this.e;
                                String str7 = this.f;
                                boolean z16 = this.v;
                                float f5 = this.w;
                                if (z15) {
                                    bVar3.getClass();
                                    tx90 tx90Var = bVar3.b().a;
                                    mx90.a aVar2 = mx90.a.b;
                                    if (str7 != null && tx90Var.f(str7) != null) {
                                        bVar3.b().c(str7);
                                        bVar3.b().d();
                                        if (z16) {
                                            bVar3.b().l = -30.0f;
                                            bVar3.b().m = -f5;
                                            bVar3.b().k(aVar2);
                                        }
                                    }
                                    mx90 mx90VarB = bVar3.b();
                                    mx90VarB.n = f4;
                                    mx90VarB.o = f4;
                                    bVar3.b().k(aVar2);
                                } else {
                                    bVar3.getClass();
                                    umb0.d(bVar3, this.c, this.d, f4, str7, this.i, z16, f5);
                                }
                                Function0 function6 = this.y;
                                if (function6 != null) {
                                    function6.invoke();
                                }
                            }
                        }));
                        spineViewA.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        Double dValueOf = Double.valueOf(-1000.0d);
                        Double dValueOf2 = Double.valueOf(2000.0d);
                        spineViewA.setBoundsProvider(new q040(dValueOf, dValueOf, dValueOf2, dValueOf2));
                        spineViewA.setContentMode(zza.a);
                        return spineViewA;
                    }
                };
                list3 = list7;
                bVar.r(function5);
                objY6 = function5;
            } else {
                bVar = bVarI;
                list3 = list7;
                function2 = function4;
            }
            dVar2 = dVar3;
            androidx.compose.ui.viewinterop.b.a((Function1) objY6, dVar2, null, bVar, (i17 >> 12) & 112, 4);
            function1 = function2;
            z6 = z8;
            z7 = z9;
            list2 = list3;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            function1 = function0;
            z6 = z3;
            z7 = z4;
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: kmb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    umb0.c(file, file2, str, z, str2, dVar2, f2, cnb0Var, z2, list2, function1, z6, z7, f3, z5, (a) obj, iA, iA2, i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(com.esotericsoftware.spine.android.b bVar, String str, boolean z, float f2, String str2, List list, boolean z2, float f3) {
        tx90 tx90Var = bVar.b().a;
        if (str2 != null && tx90Var.f(str2) != null) {
            bVar.b().c(str2);
            bVar.b().d();
        }
        e(bVar, str, z, f2, list, z2, f3);
    }

    public static final void e(com.esotericsoftware.spine.android.b bVar, String str, boolean z, float f2, List list, boolean z2, float f3) {
        tx90 tx90Var = bVar.b().a;
        ngs ngsVarB = kotlin.collections.a.b();
        int i = tx90Var.g.b;
        for (int i2 = 0; i2 < i; i2++) {
            ngsVarB.add(tx90Var.g.get(i2).a);
        }
        ngs ngsVarA = kotlin.collections.a.a(ngsVarB);
        mx90 mx90VarB = bVar.b();
        mx90VarB.n = f2;
        mx90VarB.o = f2;
        mx90.a aVar = mx90.a.b;
        if (z2) {
            bVar.b().l = -30.0f;
            bVar.b().m = -f3;
            bVar.b().k(aVar);
        }
        if (list != null && !list.isEmpty() && tx90Var.a((String) CollectionsKt.T(list)) != null) {
            bq40 bq40Var = new bq40();
            bVar.a().d.clear();
            bVar.a().b(new wmb0(bq40Var, list, tx90Var, bVar));
            bVar.a().m(0, (String) list.get(bq40Var.a), false);
            bVar.b().k(aVar);
            return;
        }
        if (tx90Var.a(str) == null && !ngsVarA.isEmpty()) {
            str = (String) CollectionsKt.T(ngsVarA);
        }
        if (tx90Var.a(str) == null) {
            return;
        }
        bVar.a().m(0, str, z);
        bVar.b().k(aVar);
    }

    public static final Pair<String, Boolean> f(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1111393803) {
            if (iHashCode != 1599022634) {
                if (iHashCode == 1862985098 && str.equals("ROUND_ONGOING")) {
                    return new Pair<>("Speedometer_ongoing", Boolean.TRUE);
                }
            } else if (str.equals("ROUND_END_WAIT")) {
                return new Pair<>("Speedometer_crash", Boolean.FALSE);
            }
        } else if (str.equals("ROUND_PRE_START")) {
            return new Pair<>("Speedometer_pre_start", Boolean.FALSE);
        }
        return new Pair<>("Speedometer_pre_start", Boolean.FALSE);
    }
}
