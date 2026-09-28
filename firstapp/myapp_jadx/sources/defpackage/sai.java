package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.recyclerview.widget.r;
import com.google.protobuf.DescriptorProtos;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class sai {

    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballBoardGroupKt$FootballBoardGroup$1$1", f = "FootballBoardGroup.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public gzg0 a;
        public ytw b;
        public Function1 c;
        public Iterator d;
        public int e;
        public /* synthetic */ Object f;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ Function0<Unit> v;
        public final /* synthetic */ ytw<wf00<Integer, zg4>> w;
        public final /* synthetic */ gzg0<Float> y;
        public final /* synthetic */ Function1<wf00<Integer, zg4>, Unit> z;

        /* JADX INFO: renamed from: sai$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballBoardGroupKt$FootballBoardGroup$1$1$1$1", f = "FootballBoardGroup.kt", l = {38}, m = "invokeSuspend", v = 2)
        public static final class C1085a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ zg4 b;
            public final /* synthetic */ long c;
            public final /* synthetic */ gzg0<Float> d;
            public final /* synthetic */ ytw<wf00<Integer, zg4>> e;
            public final /* synthetic */ Function1<wf00<Integer, zg4>, Unit> f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1085a(zg4 zg4Var, long j, gzg0<Float> gzg0Var, ytw<wf00<Integer, zg4>> ytwVar, Function1<? super wf00<Integer, zg4>, Unit> function1, v1b<? super C1085a> v1bVar) {
                super(2, v1bVar);
                this.b = zg4Var;
                this.c = j;
                this.d = gzg0Var;
                this.e = ytwVar;
                this.f = function1;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1085a(this.b, this.c, this.d, this.e, this.f, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1085a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    final zg4 zg4Var = this.b;
                    float fC = j7f.c(zg4Var.b);
                    float fC2 = j7f.c(this.c);
                    final ytw<wf00<Integer, zg4>> ytwVar = this.e;
                    final Function1<wf00<Integer, zg4>, Unit> function1 = this.f;
                    Function2 function2 = new Function2() { // from class: rai
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            float fFloatValue = ((Float) obj2).floatValue();
                            ((Float) obj3).getClass();
                            ytw ytwVar2 = ytwVar;
                            wf00 wf00Var = (wf00) ytwVar2.getValue();
                            int i2 = zg4Var.a;
                            wf00Var.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(wf00Var);
                            zg4 zg4Var2 = (zg4) linkedHashMap.get(Integer.valueOf(i2));
                            if (zg4Var2 != null) {
                                linkedHashMap.put(Integer.valueOf(i2), zg4.a(zg4Var2, j7f.a(fFloatValue, 0.0f, 2, zg4Var2.b), null, 29));
                            }
                            wf00 wf00VarG = a4h.g(linkedHashMap);
                            ytwVar2.setValue(wf00VarG);
                            function1.invoke(wf00VarG);
                            return Unit.a;
                        }
                    };
                    this.a = 1;
                    if (sje0.c(fC, fC2, 0.0f, this.d, function2, this, 4) == y5bVar) {
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

        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballBoardGroupKt$FootballBoardGroup$1$1$1$2", f = "FootballBoardGroup.kt", l = {52}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ zg4 b;
            public final /* synthetic */ long c;
            public final /* synthetic */ gzg0<Float> d;
            public final /* synthetic */ ytw<wf00<Integer, zg4>> e;
            public final /* synthetic */ Function1<wf00<Integer, zg4>, Unit> f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(zg4 zg4Var, long j, gzg0<Float> gzg0Var, ytw<wf00<Integer, zg4>> ytwVar, Function1<? super wf00<Integer, zg4>, Unit> function1, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = zg4Var;
                this.c = j;
                this.d = gzg0Var;
                this.e = ytwVar;
                this.f = function1;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, this.c, this.d, this.e, this.f, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    final zg4 zg4Var = this.b;
                    float fD = j7f.d(zg4Var.b);
                    float fD2 = j7f.d(this.c);
                    final ytw<wf00<Integer, zg4>> ytwVar = this.e;
                    final Function1<wf00<Integer, zg4>, Unit> function1 = this.f;
                    Function2 function2 = new Function2() { // from class: tai
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            float fFloatValue = ((Float) obj2).floatValue();
                            ((Float) obj3).getClass();
                            ytw ytwVar2 = ytwVar;
                            wf00 wf00Var = (wf00) ytwVar2.getValue();
                            int i2 = zg4Var.a;
                            wf00Var.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(wf00Var);
                            zg4 zg4Var2 = (zg4) linkedHashMap.get(Integer.valueOf(i2));
                            if (zg4Var2 != null) {
                                linkedHashMap.put(Integer.valueOf(i2), zg4.a(zg4Var2, j7f.a(0.0f, fFloatValue, 1, zg4Var2.b), null, 29));
                            }
                            wf00 wf00VarG = a4h.g(linkedHashMap);
                            ytwVar2.setValue(wf00VarG);
                            function1.invoke(wf00VarG);
                            return Unit.a;
                        }
                    };
                    this.a = 1;
                    if (sje0.c(fD, fD2, 0.0f, this.d, function2, this, 4) == y5bVar) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, Function0<Unit> function0, ytw<wf00<Integer, zg4>> ytwVar, gzg0<Float> gzg0Var, Function1<? super wf00<Integer, zg4>, Unit> function1, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.i = z;
            this.v = function0;
            this.w = ytwVar;
            this.y = gzg0Var;
            this.z = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.i, this.v, this.w, this.y, this.z, v1bVar);
            aVar.f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0051  */
        /* JADX WARN: Code duplicated, block: B:17:0x00af A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00ad -> B:18:0x00b0). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = r0.f
                v5b r1 = (defpackage.v5b) r1
                y5b r2 = defpackage.y5b.a
                int r3 = r0.e
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L27
                if (r3 != r5) goto L21
                java.util.Iterator r3 = r0.d
                kotlin.jvm.functions.Function1 r6 = r0.c
                ytw r7 = r0.b
                gzg0 r8 = r0.a
                defpackage.uj50.b(r19)
                r15 = r5
                r12 = r6
                r11 = r7
                r10 = r8
                goto Lb0
            L21:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                return r4
            L27:
                defpackage.uj50.b(r19)
                boolean r3 = r0.i
                if (r3 != 0) goto L31
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            L31:
                ytw<wf00<java.lang.Integer, zg4>> r3 = r0.w
                java.lang.Object r6 = r3.getValue()
                wf00 r6 = (defpackage.wf00) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
                gzg0<java.lang.Float> r7 = r0.y
                kotlin.jvm.functions.Function1<wf00<java.lang.Integer, zg4>, kotlin.Unit> r8 = r0.z
                r11 = r3
                r3 = r6
                r10 = r7
                r12 = r8
            L4b:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto Lb2
                java.lang.Object r6 = r3.next()
                r7 = r6
                zg4 r7 = (defpackage.zg4) r7
                int r6 = r7.a
                int r8 = r6 / 3
                r14 = 3
                int r6 = r6 % r14
                uf00<zg4> r9 = defpackage.cbi.a
                float r6 = (float) r6
                r9 = 1120796672(0x42ce0000, float:103.0)
                float r6 = r6 * r9
                r13 = 1106771968(0x41f80000, float:31.0)
                float r6 = r6 + r13
                float r8 = (float) r8
                float r8 = r8 * r9
                r9 = 1117782016(0x42a00000, float:80.0)
                float r8 = r8 + r9
                int r6 = java.lang.Float.floatToRawIntBits(r6)
                r15 = r5
                long r5 = (long) r6
                int r8 = java.lang.Float.floatToRawIntBits(r8)
                long r8 = (long) r8
                r13 = 32
                long r5 = r5 << r13
                r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
                long r8 = r8 & r16
                long r8 = r8 | r5
                sai$a$a r6 = new sai$a$a
                r13 = 0
                r6.<init>(r7, r8, r10, r11, r12, r13)
                pjd r5 = defpackage.ej5.a(r1, r4, r6, r14)
                sai$a$b r6 = new sai$a$b
                r6.<init>(r7, r8, r10, r11, r12, r13)
                pjd r6 = defpackage.ej5.a(r1, r4, r6, r14)
                r7 = 2
                ojd[] r7 = new defpackage.ojd[r7]
                r8 = 0
                r7[r8] = r5
                r7[r15] = r6
                r0.f = r1
                r0.a = r10
                r0.b = r11
                r0.c = r12
                r0.d = r3
                r0.e = r15
                java.lang.Object r5 = defpackage.up1.b(r7, r0)
                if (r5 != r2) goto Lb0
                return r2
            Lb0:
                r5 = r15
                goto L4b
            Lb2:
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.v
                r0.invoke()
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sai.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(final wf00<Integer, zg4> wf00Var, final boolean z, final Function1<? super wf00<Integer, zg4>, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function2, androidx.compose.runtime.a aVar, final int i) {
        ytw ytwVar;
        wf00Var.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        b bVarI = aVar.i(-1852283048);
        int i2 = i | (bVarI.A(wf00Var) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (i2 & 14) == 4 || bVarI.M(wf00Var);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = m.b(wf00Var);
                bVarI.r(objY);
            }
            ytw ytwVar2 = (ytw) objY;
            gzg0 gzg0VarE = yi0.e(r.d.DEFAULT_DRAG_ANIMATION_DURATION, 0, xkf.d, 2);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zM = bVarI.M(ytwVar2) | ((i2 & 112) == 32) | bVarI.M(gzg0VarE);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                ytwVar = ytwVar2;
                a aVar2 = new a(z, function0, ytwVar, gzg0VarE, function1, null);
                bVarI.r(aVar2);
                objY2 = aVar2;
            } else {
                ytwVar = ytwVar2;
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY2);
            Iterator it = CollectionsKt.m0(((wf00) ytwVar.getValue()).values()).iterator();
            while (it.hasNext()) {
                bbi.b((zg4) it.next(), function2, bVarI, ((i2 >> 9) & 112) | 8);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function1, function0, function2, i) { // from class: qai
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3465);
                    sai.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
