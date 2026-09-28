package defpackage;

import androidx.recyclerview.widget.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyherov2.components.MultipliercomponentKt$Multipliercomponent$4$1", f = "Multipliercomponent.kt", l = {282}, m = "invokeSuspend", v = 1)
public final class lrw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ float A;
    public final /* synthetic */ float B;
    public final /* synthetic */ ytw<Boolean> C;
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ v5b c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ytw<Boolean> f;
    public final /* synthetic */ float i;
    public final /* synthetic */ float v;
    public final /* synthetic */ int w;
    public final /* synthetic */ ytw<Float> y;
    public final /* synthetic */ ytw<Float> z;

    @c0d(c = "com.sportygames.sportyherov2.components.MultipliercomponentKt$Multipliercomponent$4$1$1", f = "Multipliercomponent.kt", l = {208, 220, 225}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ float A;
        public final /* synthetic */ int B;
        public final /* synthetic */ ytw<Float> C;
        public final /* synthetic */ ytw<Float> D;
        public long a;
        public long b;
        public long c;
        public long d;
        public long e;
        public int f;
        public int i;
        public int v;
        public final /* synthetic */ float w;
        public final /* synthetic */ float y;
        public final /* synthetic */ float z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, float f2, float f3, float f4, int i, ytw<Float> ytwVar, ytw<Float> ytwVar2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.w = f;
            this.y = f2;
            this.z = f3;
            this.A = f4;
            this.B = i;
            this.C = ytwVar;
            this.D = ytwVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.w, this.y, this.z, this.A, this.B, this.C, this.D, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0113  */
        /* JADX WARN: Code duplicated, block: B:32:0x01d8  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0137, code lost:
        
            if (r8 == r1) goto L23;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0137 -> B:24:0x013a). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 475
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lrw.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.sportyherov2.components.MultipliercomponentKt$Multipliercomponent$4$1$2", f = "Multipliercomponent.kt", l = {273}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ ytw<Float> e;
        public final /* synthetic */ ytw<Float> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, float f2, ytw<Float> ytwVar, ytw<Float> ytwVar2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = f;
            this.d = f2;
            this.e = ytwVar;
            this.f = ytwVar2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0122, code lost:
        
            if (r5 == r7) goto L30;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0122 -> B:31:0x0125). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object k(defpackage.v5b r24, defpackage.ytw r25, defpackage.ytw r26, long r27, long r29, int r31, defpackage.x1b r32) {
            /*
                Method dump skipped, instruction units count: 396
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lrw.b.k(v5b, ytw, ytw, long, long, int, x1b):java.lang.Object");
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, this.d, this.e, this.f, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ytw ytwVar = srw.a;
                float fFloatValue = this.e.getValue().floatValue();
                float fFloatValue2 = this.f.getValue().floatValue();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(this.c)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(this.d)));
                this.b = null;
                this.a = 1;
                if (k(v5bVar, this.e, this.f, jFloatToRawIntBits, jFloatToRawIntBits2, r.d.DEFAULT_DRAG_ANIMATION_DURATION, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lrw(String str, v5b v5bVar, float f, float f2, ytw<Boolean> ytwVar, float f3, float f4, int i, ytw<Float> ytwVar2, ytw<Float> ytwVar3, float f5, float f6, ytw<Boolean> ytwVar4, v1b<? super lrw> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = v5bVar;
        this.d = f;
        this.e = f2;
        this.f = ytwVar;
        this.i = f3;
        this.v = f4;
        this.w = i;
        this.y = ytwVar2;
        this.z = ytwVar3;
        this.A = f5;
        this.B = f6;
        this.C = ytwVar4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lrw(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lrw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ytw<Boolean> ytwVar = this.C;
        if (i == 0) {
            uj50.b(obj);
            String str = this.b;
            boolean zG = Intrinsics.g(str, "ROUND_PRE_START");
            v5b v5bVar = this.c;
            ytw<Boolean> ytwVar2 = this.f;
            if (zG || Intrinsics.g(str, "ROUND_ONGOING")) {
                ytw ytwVar3 = srw.a;
                if (!ytwVar2.getValue().booleanValue()) {
                    ytwVar2.setValue(Boolean.TRUE);
                    ej5.c(v5bVar, null, null, new a(this.d, this.e, this.i, this.v, this.w, this.y, this.z, null), 3);
                }
            }
            if (Intrinsics.g(str, "ROUND_END_WAIT")) {
                ytw ytwVar4 = srw.a;
                ytwVar2.setValue(Boolean.FALSE);
                ej5.c(v5bVar, null, null, new b(this.A, this.B, this.y, this.z, null), 3);
            }
            if (Intrinsics.g(str, "ROUND_WAITING")) {
                ytw ytwVar5 = srw.a;
                ytwVar2.setValue(Boolean.FALSE);
                this.y.setValue(Float.valueOf(this.d));
                this.z.setValue(Float.valueOf(this.e));
                srw.b(ytwVar, true);
                this.a = 1;
                if (hkd.b(370L, this) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        srw.b(ytwVar, false);
        return Unit.a;
    }
}
