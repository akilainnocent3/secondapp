package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class zii {

    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballKt$FootballImpl$1$1", f = "Football.kt", l = {108}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ ytw<gly> c;
        public final /* synthetic */ float d;
        public final /* synthetic */ gzg0<Float> e;
        public final /* synthetic */ float f;

        /* JADX INFO: renamed from: zii$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballKt$FootballImpl$1$1$1", f = "Football.kt", l = {110}, m = "invokeSuspend", v = 2)
        public static final class C1395a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ float c;
            public final /* synthetic */ gzg0<Float> d;
            public final /* synthetic */ ytw<gly> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1395a(long j, float f, gzg0<Float> gzg0Var, ytw<gly> ytwVar, v1b<? super C1395a> v1bVar) {
                super(2, v1bVar);
                this.b = j;
                this.c = f;
                this.d = gzg0Var;
                this.e = ytwVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1395a(this.b, this.c, this.d, this.e, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1395a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (this.b >> 32));
                    zii.k(fIntBitsToFloat);
                    float f = this.c;
                    zii.k(f);
                    yii yiiVar = new yii(this.e);
                    this.a = 1;
                    if (sje0.c(fIntBitsToFloat, f, 0.0f, this.d, yiiVar, this, 4) == y5bVar) {
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

        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballKt$FootballImpl$1$1$2", f = "Football.kt", l = {119}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ long b;
            public final /* synthetic */ float c;
            public final /* synthetic */ gzg0<Float> d;
            public final /* synthetic */ ytw<gly> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, float f, gzg0<Float> gzg0Var, ytw<gly> ytwVar, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = j;
                this.c = f;
                this.d = gzg0Var;
                this.e = ytwVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, this.c, this.d, this.e, v1bVar);
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
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (this.b & 4294967295L));
                    zii.k(fIntBitsToFloat);
                    float f = this.c;
                    zii.k(f);
                    final ytw<gly> ytwVar = this.e;
                    Function2 function2 = new Function2() { // from class: aji
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            float fFloatValue = ((Float) obj2).floatValue();
                            ((Float) obj3).getClass();
                            ytw ytwVar2 = ytwVar;
                            zii.d(gly.b(0.0f, fFloatValue, 1, zii.c(ytwVar2)), ytwVar2);
                            return Unit.a;
                        }
                    };
                    this.a = 1;
                    if (sje0.c(fIntBitsToFloat, f, 0.0f, this.d, function2, this, 4) == y5bVar) {
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
        public a(ytw<gly> ytwVar, float f, gzg0<Float> gzg0Var, float f2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = ytwVar;
            this.d = f;
            this.e = gzg0Var;
            this.f = f2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, this.f, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                long jC = zii.c(this.c);
                ytw<gly> ytwVar = this.c;
                float f = this.d;
                gzg0<Float> gzg0Var = this.e;
                ojd[] ojdVarArr = {ej5.a(v5bVar, null, new C1395a(jC, f, gzg0Var, ytwVar, null), 3), ej5.a(v5bVar, null, new b(jC, this.f, gzg0Var, this.c, null), 3)};
                this.b = null;
                this.a = 1;
                if (up1.b(ojdVarArr, this) == y5bVar) {
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

    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballKt$FootballImpl$2$1", f = "Football.kt", l = {148, 198, 213}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Function1<zg4, Unit> A;
        public final /* synthetic */ float B;
        public final /* synthetic */ lx30.Companion C;
        public final /* synthetic */ ytw<Boolean> D;
        public final /* synthetic */ ytw<g7f> E;
        public final /* synthetic */ ytw<gly> F;
        public final /* synthetic */ ytw<gly> G;
        public final /* synthetic */ ytw<Boolean> H;
        public final /* synthetic */ Function0<Unit> I;
        public aq40 a;
        public yp40 b;
        public long c;
        public long d;
        public int e;
        public float f;
        public float i;
        public int v;
        public /* synthetic */ Object w;
        public final /* synthetic */ mmd y;
        public final /* synthetic */ wf00<Integer, zg4> z;

        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballKt$FootballImpl$2$1$2", f = "Football.kt", l = {215}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ytw<g7f> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ytw<g7f> ytwVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = ytwVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    final ytw<g7f> ytwVar = this.b;
                    float fE = zii.e(ytwVar);
                    float f = 0.7f * ytwVar.getValue().a;
                    gzg0 gzg0VarE = yi0.e(1600, 0, xkf.d, 2);
                    Function2 function2 = new Function2() { // from class: cji
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            float fFloatValue = ((Float) obj2).floatValue();
                            ((Float) obj3).getClass();
                            ytwVar.setValue(new g7f(fFloatValue));
                            return Unit.a;
                        }
                    };
                    this.a = 1;
                    if (sje0.c(fE, f, 0.0f, gzg0VarE, function2, this, 4) == y5bVar) {
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

        /* JADX INFO: renamed from: zii$b$b, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballKt$FootballImpl$2$1$3", f = "Football.kt", l = {226}, m = "invokeSuspend", v = 2)
        public static final class C1396b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int A;
            public final /* synthetic */ aq40 B;
            public final /* synthetic */ mmd C;
            public final /* synthetic */ dq40<gam> D;
            public final /* synthetic */ lx30.Companion E;
            public final /* synthetic */ float F;
            public final /* synthetic */ float G;
            public final /* synthetic */ ytw<g7f> H;
            public final /* synthetic */ ytw<gly> I;
            public int a;
            public int b;
            public aq40 c;
            public mmd d;
            public dq40 e;
            public lx30.Companion f;
            public ytw i;
            public ytw v;
            public dq40 w;
            public float y;
            public float z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1396b(aq40 aq40Var, mmd mmdVar, dq40<gam> dq40Var, lx30.Companion companion, float f, float f2, ytw<g7f> ytwVar, ytw<gly> ytwVar2, v1b<? super C1396b> v1bVar) {
                super(2, v1bVar);
                this.B = aq40Var;
                this.C = mmdVar;
                this.D = dq40Var;
                this.E = companion;
                this.F = f;
                this.G = f2;
                this.H = ytwVar;
                this.I = ytwVar2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1396b(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1396b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0058  */
            /* JADX WARN: Code duplicated, block: B:12:0x00dd A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:13:0x00de  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00de -> B:14:0x00e4). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                /*
                    Method dump skipped, instruction units count: 244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: zii.b.C1396b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballKt$FootballImpl$2$1$4", f = "Football.kt", l = {243}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function0<Unit> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Function0<Unit> function0, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.b = function0;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new c(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = 1;
                    if (hkd.b(1000L, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                this.b.invoke();
                return Unit.a;
            }
        }

        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballKt$FootballImpl$2$1$hitBoard$1", f = "Football.kt", l = {152, 163}, m = "invokeSuspend", v = 2)
        public static final class d extends tje0 implements Function2<v5b, v1b<? super zg4>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ boolean c;
            public final /* synthetic */ long d;
            public final /* synthetic */ ArrayList e;
            public final /* synthetic */ mmd f;
            public final /* synthetic */ ytw<gly> i;
            public final /* synthetic */ ytw<g7f> v;
            public final /* synthetic */ ytw<gly> w;
            public final /* synthetic */ yp40 y;
            public final /* synthetic */ ytw<Boolean> z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(boolean z, long j, ArrayList arrayList, mmd mmdVar, ytw ytwVar, ytw ytwVar2, ytw ytwVar3, yp40 yp40Var, ytw ytwVar4, v1b v1bVar) {
                super(2, v1bVar);
                this.c = z;
                this.d = j;
                this.e = arrayList;
                this.f = mmdVar;
                this.i = ytwVar;
                this.v = ytwVar2;
                this.w = ytwVar3;
                this.y = yp40Var;
                this.z = ytwVar4;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                d dVar = new d(this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                dVar.b = obj;
                return dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super zg4> v1bVar) {
                return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
            
                if (r15 == r0) goto L38;
             */
            /* JADX WARN: Type inference failed for: r11v0, types: [fji] */
            /* JADX WARN: Type inference failed for: r12v0, types: [gji] */
            /* JADX WARN: Type inference failed for: r9v1, types: [iji] */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = r14.b
                    v5b r0 = (defpackage.v5b) r0
                    y5b r0 = defpackage.y5b.a
                    int r1 = r14.a
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1c
                    defpackage.uj50.b(r15)     // Catch: java.lang.Throwable -> L17
                    r13 = r14
                    goto L8b
                L17:
                    r0 = move-exception
                    r15 = r0
                    r13 = r14
                    goto L93
                L1c:
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r14)
                    return r4
                L22:
                    defpackage.uj50.b(r15)     // Catch: java.lang.Throwable -> L17
                    r13 = r14
                    goto L62
                L27:
                    defpackage.uj50.b(r15)
                    ytw<gly> r15 = r14.i
                    zi50$a r1 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L68
                    boolean r1 = r14.c
                    long r5 = r14.d
                    java.util.ArrayList r7 = r14.e
                    mmd r8 = r14.f
                    ytw<g7f> r9 = r14.v
                    ytw<gly> r10 = r14.w
                    if (r1 == 0) goto L71
                    java.lang.Object r15 = r15.getValue()     // Catch: java.lang.Throwable -> L6d
                    gly r15 = (defpackage.gly) r15     // Catch: java.lang.Throwable -> L6d
                    long r1 = r15.a     // Catch: java.lang.Throwable -> L6d
                    r15 = 1112014848(0x42480000, float:50.0)
                    float r15 = r8.C1(r15)     // Catch: java.lang.Throwable -> L68
                    fji r11 = new fji     // Catch: java.lang.Throwable -> L68
                    r11.<init>()     // Catch: java.lang.Throwable -> L68
                    gji r12 = new gji     // Catch: java.lang.Throwable -> L68
                    r12.<init>()     // Catch: java.lang.Throwable -> L68
                    r14.b = r4     // Catch: java.lang.Throwable -> L68
                    r14.a = r3     // Catch: java.lang.Throwable -> L68
                    r13 = r14
                    r10 = r15
                    r8 = r1
                    java.lang.Object r15 = defpackage.zii.m(r5, r7, r8, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L65
                    if (r15 != r0) goto L62
                    goto L8a
                L62:
                    zg4 r15 = (defpackage.zg4) r15     // Catch: java.lang.Throwable -> L65
                    goto L8d
                L65:
                    r0 = move-exception
                L66:
                    r15 = r0
                    goto L93
                L68:
                    r0 = move-exception
                    r13 = r14
                    goto L66
                L6b:
                    r15 = r14
                    goto L93
                L6d:
                    r0 = move-exception
                    r13 = r14
                    r14 = r0
                    goto L6b
                L71:
                    r13 = r14
                    r14 = r8
                    hji r8 = new hji     // Catch: java.lang.Throwable -> L65
                    r15 = 0
                    r8.<init>(r15, r14, r9)     // Catch: java.lang.Throwable -> L65
                    iji r9 = new iji     // Catch: java.lang.Throwable -> L65
                    r9.<init>()     // Catch: java.lang.Throwable -> L65
                    r13.b = r4     // Catch: java.lang.Throwable -> L65
                    r13.a = r2     // Catch: java.lang.Throwable -> L65
                    r10 = r13
                    java.lang.Object r15 = defpackage.zii.l(r5, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L90
                    r13 = r10
                    if (r15 != r0) goto L8b
                L8a:
                    return r0
                L8b:
                    zg4 r15 = (defpackage.zg4) r15     // Catch: java.lang.Throwable -> L65
                L8d:
                    zi50$a r14 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L65
                    goto L9b
                L90:
                    r0 = move-exception
                    r13 = r10
                    goto L66
                L93:
                    zi50$a r14 = defpackage.zi50.b
                    zi50$b r14 = new zi50$b
                    r14.<init>(r15)
                    r15 = r14
                L9b:
                    java.lang.Throwable r14 = defpackage.zi50.a(r15)
                    if (r14 == 0) goto Lb9
                    yp40 r14 = r13.y
                    r14.a = r3
                    ytw<java.lang.Boolean> r14 = r13.z
                    java.lang.Object r0 = r14.getValue()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    r0 = r0 ^ r3
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    r14.setValue(r0)
                Lb9:
                    boolean r14 = r15 instanceof zi50.b
                    if (r14 == 0) goto Lbe
                    goto Lbf
                Lbe:
                    r4 = r15
                Lbf:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: zii.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballKt$FootballImpl$2$1$hitBoard$2", f = "Football.kt", l = {178}, m = "invokeSuspend", v = 2)
        public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ gzg0<Float> b;
            public final /* synthetic */ ytw<g7f> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(gzg0<Float> gzg0Var, ytw<g7f> ytwVar, v1b<? super e> v1bVar) {
                super(2, v1bVar);
                this.b = gzg0Var;
                this.c = ytwVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new e(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    ytw<g7f> ytwVar = this.c;
                    float fE = zii.e(ytwVar);
                    zii.k(fE);
                    zii.k(60.0f);
                    jji jjiVar = new jji(ytwVar, 0);
                    this.a = 1;
                    if (sje0.c(fE, 60.0f, 0.0f, this.b, jjiVar, this, 4) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a(LhMGMAwwhzjwfz.HeiUUnHDGKt);
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(mmd mmdVar, wf00<Integer, zg4> wf00Var, Function1<? super zg4, Unit> function1, float f, lx30.Companion companion, ytw<Boolean> ytwVar, ytw<g7f> ytwVar2, ytw<gly> ytwVar3, ytw<gly> ytwVar4, ytw<Boolean> ytwVar5, Function0<Unit> function0, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.y = mmdVar;
            this.z = wf00Var;
            this.A = function1;
            this.B = f;
            this.C = companion;
            this.D = ytwVar;
            this.E = ytwVar2;
            this.F = ytwVar3;
            this.G = ytwVar4;
            this.H = ytwVar5;
            this.I = function0;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, v1bVar);
            bVar.w = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0171  */
        /* JADX WARN: Code duplicated, block: B:36:0x0178  */
        /* JADX WARN: Code duplicated, block: B:62:0x035f  */
        /* JADX WARN: Code duplicated, block: B:63:0x0362  */
        /* JADX WARN: Code duplicated, block: B:73:0x0167 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:0x0194 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:? A[LOOP:2: B:35:0x0176->B:75:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x03cb, code lost:
        
            if (defpackage.up1.b(r13, r35) == r8) goto L66;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r25v0 */
        /* JADX WARN: Type inference failed for: r3v58, types: [T, gam] */
        /* JADX WARN: Type inference failed for: r9v23, types: [int] */
        /* JADX WARN: Type inference failed for: r9v42 */
        /* JADX WARN: Type inference failed for: r9v44 */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                Method dump skipped, instruction units count: 977
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zii.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c implements PointerInputEventHandler {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ ytw<Boolean> c;
        public final /* synthetic */ ytw<gly> d;
        public final /* synthetic */ ytw<gly> e;
        public final /* synthetic */ ytw<gly> f;
        public final /* synthetic */ isw g;

        public c(boolean z, Function0<Unit> function0, ytw<Boolean> ytwVar, ytw<gly> ytwVar2, ytw<gly> ytwVar3, ytw<gly> ytwVar4, isw iswVar) {
            this.a = z;
            this.b = function0;
            this.c = ytwVar;
            this.d = ytwVar2;
            this.e = ytwVar3;
            this.f = ytwVar4;
            this.g = iswVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
            final boolean z = this.a;
            final Function0<Unit> function0 = this.b;
            final ytw<Boolean> ytwVar = this.c;
            Function0 function1 = new Function0() { // from class: kji
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    if (!z) {
                        return Unit.a;
                    }
                    ytw ytwVar2 = ytwVar;
                    ytwVar2.setValue(Boolean.valueOf(!((Boolean) ytwVar2.getValue()).booleanValue()));
                    function0.invoke();
                    return Unit.a;
                }
            };
            final ytw<gly> ytwVar2 = this.d;
            final ytw<gly> ytwVar3 = this.e;
            final ytw<gly> ytwVar4 = this.f;
            final isw iswVar = this.g;
            return y8f.e(u020Var, new f8f(0), function1, new g8f(0), new Function2() { // from class: lji
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    m020 m020Var = (m020) obj;
                    gly glyVar = (gly) obj2;
                    m020Var.getClass();
                    if (!z) {
                        return Unit.a;
                    }
                    m020Var.a();
                    ytw ytwVar5 = ytwVar2;
                    zii.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (glyVar.a >> 32)) + Float.intBitsToFloat((int) (zii.c(ytwVar5) >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (glyVar.a & 4294967295L)) + Float.intBitsToFloat((int) (((gly) ytwVar5.getValue()).a & 4294967295L)))) & 4294967295L), ytwVar5);
                    long j = ((gly) ytwVar5.getValue()).a;
                    ytw ytwVar6 = ytwVar3;
                    long jE = gly.e(j, ((gly) ytwVar6.getValue()).a);
                    int i = (int) (jE >> 32);
                    if (Math.abs(Float.intBitsToFloat(i)) > 1.0f || Math.abs(Float.intBitsToFloat((int) (jE & 4294967295L))) > 1.0f) {
                        gly glyVar2 = (gly) ytwVar5.getValue();
                        long j2 = glyVar2.a;
                        ytwVar6.setValue(glyVar2);
                        ytwVar4.setValue(new gly(jE));
                        iswVar.A((float) Math.toDegrees(((double) ((float) Math.atan2(Float.intBitsToFloat((int) (jE & 4294967295L)), Float.intBitsToFloat(i)))) - Math.atan2(-1.0d, 0.0d)));
                    }
                    return Unit.a;
                }
            }, v1bVar);
        }
    }

    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballKt$FootballImpl$5$1$1", f = "Football.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ ytw<u7n> b;
        public final /* synthetic */ Resources c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, ytw<u7n> ytwVar, Resources resources, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = ytwVar;
            this.c = resources;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Resources resources = this.c;
            boolean z = this.a;
            ytw<u7n> ytwVar = this.b;
            if (z) {
                u7n value = ytwVar.getValue();
                if (value != null) {
                    resources.getClass();
                    p28.a(zbn.a(value, resources));
                }
            } else {
                u7n value2 = ytwVar.getValue();
                if (value2 != null) {
                    resources.getClass();
                    p28.b(zbn.a(value2, resources));
                }
            }
            return Unit.a;
        }
    }

    public static final void a(final float f, final wf00<Integer, zg4> wf00Var, final boolean z, final Function0<Unit> function0, final Function1<? super zg4, Unit> function1, final Function0<Unit> function2, androidx.compose.runtime.a aVar, final int i) {
        wf00Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-105694256);
        int i2 = i | (bVarI.c(f) ? 4 : 2) | (bVarI.A(wf00Var) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            androidx.compose.ui.d dVarE = j.e(androidx.compose.ui.d.a.b, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            b(f, wf00Var, z, function0, function1, function2, bVarI, (i2 & 57344) | (i2 & 14) | 64 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | 196608);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, wf00Var, z, function0, function1, function2, i) { // from class: qii
                public final /* synthetic */ float a;
                public final /* synthetic */ wf00 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(196673);
                    zii.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:111:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:119:0x0306  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x0201  */
    /* JADX WARN: Code duplicated, block: B:85:0x0225  */
    /* JADX WARN: Code duplicated, block: B:86:0x0227  */
    /* JADX WARN: Code duplicated, block: B:89:0x022e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0230  */
    /* JADX WARN: Code duplicated, block: B:96:0x0241  */
    /* JADX WARN: Code duplicated, block: B:99:0x027c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final float f, final wf00<Integer, zg4> wf00Var, final boolean z, final Function0<Unit> function0, final Function1<? super zg4, Unit> function1, final Function0<Unit> function2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        wf00<Integer, zg4> wf00Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ytw ytwVar;
        Object bVar2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        ytw ytwVar2;
        final ytw ytwVar3;
        ytw ytwVar4;
        Object objY;
        int i2;
        boolean z6;
        boolean z7;
        boolean z8;
        Object cVar;
        boolean z9;
        isw iswVar;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        Object objY2;
        final ytw ytwVar5;
        Resources resources;
        boolean z10;
        boolean zA;
        Object objY3;
        Object objY4;
        androidx.compose.runtime.b bVarI = aVar.i(-1646666608);
        int i3 = i | (bVarI.c(f) ? 4 : 2) | (bVarI.A(wf00Var) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            float fB = mla.b(135.0f, bVarI);
            float fB2 = mla.b((f - 70.0f) - 90.0f, bVarI);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY5 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (objY5 == c0042a2) {
                objY5 = lx30.INSTANCE;
                bVarI.r(objY5);
            }
            lx30.Companion companion = (lx30.Companion) objY5;
            Object objY6 = bVarI.y();
            if (objY6 == c0042a2) {
                objY6 = m.b(new g7f(90.0f));
                bVarI.r(objY6);
            }
            ytw ytwVar6 = (ytw) objY6;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a2) {
                objY7 = m.b(new gly((((long) Float.floatToRawIntBits(fB2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fB)) << 32)));
                bVarI.r(objY7);
            }
            ytw ytwVar7 = (ytw) objY7;
            Object objY8 = bVarI.y();
            if (objY8 == c0042a2) {
                objY8 = m.b(new gly((((long) Float.floatToRawIntBits(-1.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)));
                bVarI.r(objY8);
            }
            ytw ytwVar8 = (ytw) objY8;
            Object objY9 = bVarI.y();
            if (objY9 == c0042a2) {
                objY9 = m.b(new gly((((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB2)) & 4294967295L)));
                bVarI.r(objY9);
            }
            ytw ytwVar9 = (ytw) objY9;
            Object objY10 = bVarI.y();
            if (objY10 == c0042a2) {
                objY10 = m.b(Boolean.FALSE);
                bVarI.r(objY10);
            }
            ytw ytwVar10 = (ytw) objY10;
            gzg0 gzg0VarE = yi0.e(300, 0, xkf.d, 2);
            Object objY11 = bVarI.y();
            if (objY11 == c0042a2) {
                objY11 = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(objY11);
            }
            isw iswVar2 = (isw) objY11;
            Boolean bool = (Boolean) ytwVar10.getValue();
            bool.getClass();
            boolean zC = bVarI.c(fB) | bVarI.M(gzg0VarE) | bVarI.c(fB2);
            Object objY12 = bVarI.y();
            if (zC || objY12 == c0042a2) {
                objY12 = new a(ytwVar9, fB, gzg0VarE, fB2, null);
                bVarI.r(objY12);
            }
            xvf.e(bVarI, bool, (Function2) objY12);
            Object objY13 = bVarI.y();
            if (objY13 == c0042a2) {
                objY13 = m.b(Boolean.FALSE);
                bVarI.r(objY13);
            }
            ytw ytwVar11 = (ytw) objY13;
            Boolean bool2 = (Boolean) ytwVar11.getValue();
            bool2.getClass();
            boolean zM = bVarI.M(mmdVar);
            if ((i3 & 112) != 32) {
                wf00Var2 = wf00Var;
                if (!bVarI.A(wf00Var2)) {
                    z2 = false;
                }
                boolean z11 = zM | z2;
                if ((i3 & 57344) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z12 = z11 | z3;
                if ((i3 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z12 | z4;
                Object objY14 = bVarI.y();
                if (!z5 || objY14 == c0042a2) {
                    ytwVar = ytwVar8;
                    c0042a = c0042a2;
                    ytwVar2 = ytwVar6;
                    wf00<Integer, zg4> wf00Var3 = wf00Var2;
                    ytwVar3 = ytwVar9;
                    bVar2 = new b(mmdVar, wf00Var3, function1, f, companion, ytwVar11, ytwVar2, ytwVar3, ytwVar, ytwVar10, function2, null);
                    ytwVar4 = ytwVar11;
                    bVarI.r(bVar2);
                } else {
                    ytwVar = ytwVar8;
                    bVar2 = objY14;
                    ytwVar4 = ytwVar11;
                    ytwVar2 = ytwVar6;
                    c0042a = c0042a2;
                    ytwVar3 = ytwVar9;
                }
                xvf.e(bVarI, bool2, (Function2) bVar2);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new Function1() { // from class: rii
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((mmd) obj).getClass();
                            ytw ytwVar12 = ytwVar3;
                            int iB = ycv.b(Float.intBitsToFloat((int) (zii.c(ytwVar12) >> 32)));
                            return new iwo((((long) ycv.b(Float.intBitsToFloat((int) (((gly) ytwVar12.getValue()).a & 4294967295L)))) & 4294967295L) | (((long) iB) << 32));
                        }
                    };
                    bVarI.r(objY);
                }
                androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarR = j.r(g.b(aVar3, (Function1) objY), e(ytwVar2));
                Boolean boolValueOf = Boolean.valueOf(z);
                i2 = i3 & 896;
                if (i2 == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i3 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z7 | z6;
                Object objY15 = bVarI.y();
                if (!z8 || objY15 == c0042a) {
                    z9 = z;
                    iswVar = iswVar2;
                    cVar = new c(z9, function0, ytwVar4, ytwVar3, ytwVar7, ytwVar, iswVar);
                    bVarI.r(cVar);
                } else {
                    cVar = objY15;
                    iswVar = iswVar2;
                    z9 = z;
                }
                androidx.compose.ui.d dVarA = wje0.a(dVarR, boolValueOf, (PointerInputEventHandler) cVar);
                aiv aivVarC = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = m.b(null);
                    bVarI.r(objY2);
                }
                ytwVar5 = (ytw) objY2;
                resources = ((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)).getResources();
                u7n u7nVar = (u7n) ytwVar5.getValue();
                Boolean boolValueOf2 = Boolean.valueOf(z9);
                if (i2 == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zA = bVarI.A(resources) | z10;
                objY3 = bVarI.y();
                if (zA || objY3 == c0042a) {
                    objY3 = new d(z9, ytwVar5, resources, null);
                    bVarI.r(objY3);
                }
                xvf.g(u7nVar, boolValueOf2, (Function2) objY3, bVarI);
                androidx.compose.ui.d dVarA2 = p1a.a(j.e(aVar3, 1.0f), iswVar.j());
                ctt.a aVar4 = ctt.b;
                objY4 = bVarI.y();
                if (objY4 == c0042a) {
                    objY4 = new Function1() { // from class: sii
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            b01.b.d dVar = (b01.b.d) obj;
                            dVar.getClass();
                            ytwVar5.setValue(dVar.b.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                bVar = bVarI;
                h9n.a(nw90.b("https://s.sporty.net/cms/football_33378df44d.gif", (Function1) objY4, bVarI, 196608), "Football", dVarA2, null, null, 0.0f, null, bVar, 48, 120);
                bVar.X(true);
            } else {
                wf00Var2 = wf00Var;
            }
            z2 = true;
            boolean z13 = zM | z2;
            if ((i3 & 57344) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z14 = z13 | z3;
            if ((i3 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z14 | z4;
            Object objY16 = bVarI.y();
            if (z5) {
                ytwVar = ytwVar8;
                c0042a = c0042a2;
                ytwVar2 = ytwVar6;
                wf00<Integer, zg4> wf00Var4 = wf00Var2;
                ytwVar3 = ytwVar9;
                bVar2 = new b(mmdVar, wf00Var4, function1, f, companion, ytwVar11, ytwVar2, ytwVar3, ytwVar, ytwVar10, function2, null);
                ytwVar4 = ytwVar11;
                bVarI.r(bVar2);
            } else {
                ytwVar = ytwVar8;
                c0042a = c0042a2;
                ytwVar2 = ytwVar6;
                wf00<Integer, zg4> wf00Var5 = wf00Var2;
                ytwVar3 = ytwVar9;
                bVar2 = new b(mmdVar, wf00Var5, function1, f, companion, ytwVar11, ytwVar2, ytwVar3, ytwVar, ytwVar10, function2, null);
                ytwVar4 = ytwVar11;
                bVarI.r(bVar2);
            }
            xvf.e(bVarI, bool2, (Function2) bVar2);
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = new Function1() { // from class: rii
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((mmd) obj).getClass();
                        ytw ytwVar12 = ytwVar3;
                        int iB = ycv.b(Float.intBitsToFloat((int) (zii.c(ytwVar12) >> 32)));
                        return new iwo((((long) ycv.b(Float.intBitsToFloat((int) (((gly) ytwVar12.getValue()).a & 4294967295L)))) & 4294967295L) | (((long) iB) << 32));
                    }
                };
                bVarI.r(objY);
            }
            androidx.compose.ui.d.a aVar5 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarR2 = j.r(g.b(aVar5, (Function1) objY), e(ytwVar2));
            Boolean boolValueOf3 = Boolean.valueOf(z);
            i2 = i3 & 896;
            if (i2 == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i3 & 7168) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z7 | z6;
            Object objY17 = bVarI.y();
            if (z8) {
                z9 = z;
                iswVar = iswVar2;
                cVar = new c(z9, function0, ytwVar4, ytwVar3, ytwVar7, ytwVar, iswVar);
                bVarI.r(cVar);
            } else {
                z9 = z;
                iswVar = iswVar2;
                cVar = new c(z9, function0, ytwVar4, ytwVar3, ytwVar7, ytwVar, iswVar);
                bVarI.r(cVar);
            }
            androidx.compose.ui.d dVarA3 = wje0.a(dVarR2, boolValueOf3, (PointerInputEventHandler) cVar);
            aiv aivVarC2 = g75.c(ht.a.a, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA3);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            ytwVar5 = (ytw) objY2;
            resources = ((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)).getResources();
            u7n u7nVar2 = (u7n) ytwVar5.getValue();
            Boolean boolValueOf4 = Boolean.valueOf(z9);
            if (i2 == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            zA = bVarI.A(resources) | z10;
            objY3 = bVarI.y();
            if (zA) {
                objY3 = new d(z9, ytwVar5, resources, null);
                bVarI.r(objY3);
            } else {
                objY3 = new d(z9, ytwVar5, resources, null);
                bVarI.r(objY3);
            }
            xvf.g(u7nVar2, boolValueOf4, (Function2) objY3, bVarI);
            androidx.compose.ui.d dVarA4 = p1a.a(j.e(aVar5, 1.0f), iswVar.j());
            ctt.a aVar6 = ctt.b;
            objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new Function1() { // from class: sii
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        b01.b.d dVar = (b01.b.d) obj;
                        dVar.getClass();
                        ytwVar5.setValue(dVar.b.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            bVar = bVarI;
            h9n.a(nw90.b("https://s.sporty.net/cms/football_33378df44d.gif", (Function1) objY4, bVarI, 196608), "Football", dVarA4, null, null, 0.0f, null, bVar, 48, 120);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, wf00Var, z, function0, function1, function2, i) { // from class: tii
                public final /* synthetic */ float a;
                public final /* synthetic */ wf00 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(196673);
                    zii.b(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final long c(ytw<gly> ytwVar) {
        return ytwVar.getValue().a;
    }

    public static final void d(long j, ytw ytwVar) {
        ytwVar.setValue(new gly(j));
    }

    public static final float e(ytw<g7f> ytwVar) {
        return ytwVar.getValue().a;
    }

    public static final gh4 f(long j, List list) {
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    int i = (int) (j >> 32);
                    float fAbs = Math.abs(Float.intBitsToFloat(i) - Float.intBitsToFloat((int) (((gh4) next).b >> 32)));
                    do {
                        Object next2 = it.next();
                        float fAbs2 = Math.abs(Float.intBitsToFloat(i) - Float.intBitsToFloat((int) (((gh4) next2).b >> 32)));
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            next = next2;
                            fAbs = fAbs2;
                        }
                    } while (it.hasNext());
                }
                return (gh4) next;
            }
            lrh0.a();
        }
        return null;
    }

    public static final float g(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat4 = fIntBitsToFloat2 - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (fIntBitsToFloat4 * fIntBitsToFloat4) / ((fIntBitsToFloat - fIntBitsToFloat3) * 4.0f);
    }

    public static final Pair h(float f, long j, long j2) {
        double d2 = f;
        double dIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        double dIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        double dIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        double dIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        if (dIntBitsToFloat == dIntBitsToFloat3) {
            dIntBitsToFloat += 0.1d;
        }
        double d3 = dIntBitsToFloat2 - d2;
        double dSqrt = Math.sqrt(d3 / (dIntBitsToFloat4 - d2));
        double d4 = dIntBitsToFloat3 * dSqrt;
        double d5 = (dIntBitsToFloat + d4) / (1.0d + dSqrt);
        double d6 = (dIntBitsToFloat - d4) / (1.0d - dSqrt);
        if (Math.abs(d5) > Double.MAX_VALUE || Math.abs(d6) > Double.MAX_VALUE ? Math.abs(d5) > Double.MAX_VALUE : Math.abs(d5 - dIntBitsToFloat) >= Math.abs(d6 - dIntBitsToFloat)) {
            d5 = d6;
        }
        double d7 = dIntBitsToFloat - d5;
        return new Pair(Double.valueOf(d3 / (d7 * d7)), Double.valueOf(d5));
    }

    public static final float i(float f, float f2, long j) {
        return Float.intBitsToFloat((int) (4294967295L & j)) - ((float) Math.sqrt((f2 - Float.intBitsToFloat((int) (j >> 32))) * (4.0f * f)));
    }

    /* JADX WARN: Failed to calculate best type for var: r0v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v2 ??, new type: java.lang.Number
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v25 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v27 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r21v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r31v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r31v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v6 ??, new type: java.lang.Number
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v11 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v14 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v15 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v16 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r31v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r31v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final java.lang.Object j(defpackage.lx30.Companion r26, defpackage.gam r27, long r28, defpackage.dji r30, float r31, float r32, defpackage.eji r33, defpackage.x1b r34) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zii.j(lx30$a, gam, long, dji, float, float, eji, x1b):java.lang.Object");
    }

    public static final void k(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            ib5.a("NaN Value");
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object l(long j, ArrayList arrayList, final hji hjiVar, final iji ijiVar, x1b x1bVar) {
        oji ojiVar;
        gh4 gh4Var;
        long jB = j;
        if (x1bVar instanceof oji) {
            ojiVar = (oji) x1bVar;
            int i = ojiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ojiVar.c = i - Integer.MIN_VALUE;
            } else {
                ojiVar = new oji(x1bVar);
            }
        } else {
            ojiVar = new oji(x1bVar);
        }
        oji ojiVar2 = ojiVar;
        Object obj = ojiVar2.b;
        y5b y5bVar = y5b.a;
        int i2 = ojiVar2.c;
        if (i2 == 0) {
            uj50.b(obj);
            int i3 = 0;
            gzg0 gzg0VarE = yi0.e(150, 0, xkf.d, 2);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                if (Float.intBitsToFloat((int) (((gh4) obj2).b & 4294967295L)) > Float.intBitsToFloat((int) (jB & 4294967295L))) {
                    arrayList2.add(obj2);
                }
            }
            final gh4 gh4VarF = f(jB, CollectionsKt.r0(arrayList2, new mji()));
            gh4VarF.getClass();
            long j2 = gh4VarF.b;
            int i4 = (int) (j2 >> 32);
            int i5 = (int) (jB >> 32);
            if (Float.intBitsToFloat(i4) == Float.intBitsToFloat(i5)) {
                jB = gly.b(Float.intBitsToFloat(i5) + 1.0f, 0.0f, 2, jB);
            }
            final float fG = g(jB, j2);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
            k(fIntBitsToFloat);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i4);
            k(fIntBitsToFloat2);
            Function2 function2 = new Function2() { // from class: vii
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    float fFloatValue = ((Float) obj3).floatValue();
                    ((Float) obj4).getClass();
                    float fFloatValue2 = ((Number) hjiVar.invoke()).floatValue() / 2.0f;
                    float f = fFloatValue - fFloatValue2;
                    float fI = zii.i(fG, fFloatValue, gh4VarF.b) - fFloatValue2;
                    if (!Float.isNaN(f) && !Float.isNaN(fI)) {
                        ijiVar.invoke(new gly((((long) Float.floatToRawIntBits(fI)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
                    }
                    return Unit.a;
                }
            };
            ojiVar2.a = gh4VarF;
            ojiVar2.c = 1;
            if (sje0.c(fIntBitsToFloat, fIntBitsToFloat2, 0.0f, gzg0VarE, function2, ojiVar2, 4) == y5bVar) {
                return y5bVar;
            }
            gh4Var = gh4VarF;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gh4Var = ojiVar2.a;
            uj50.b(obj);
        }
        return gh4Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v6, types: [m2g] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    public static final Object m(long j, ArrayList arrayList, long j2, float f, final fji fjiVar, final gji gjiVar, x1b x1bVar) {
        pji pjiVar;
        int i;
        gh4 gh4Var;
        Object objPrevious;
        Object obj;
        long jB = j;
        if (x1bVar instanceof pji) {
            pjiVar = (pji) x1bVar;
            int i2 = pjiVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pjiVar.c = i2 - Integer.MIN_VALUE;
            } else {
                pjiVar = new pji(x1bVar);
            }
        } else {
            pjiVar = new pji(x1bVar);
        }
        Object obj2 = pjiVar.b;
        y5b y5bVar = y5b.a;
        int i3 = pjiVar.c;
        if (i3 == 0) {
            uj50.b(obj2);
            int i4 = 0;
            gzg0 gzg0VarE = yi0.e(300, 0, xkf.d, 2);
            long j3 = 4294967295L;
            int i5 = (int) (j2 & 4294967295L);
            float fAbs = Math.abs(Float.intBitsToFloat(i5));
            if (Float.intBitsToFloat(i5) <= 0.0f && fAbs >= 50.0f) {
                i = fAbs < 100.0f ? 1 : 0;
            } else {
                i = 2;
            }
            ?? arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                long j4 = j3;
                Object obj3 = arrayList.get(i6);
                i6++;
                if (((gh4) obj3).a.f == i) {
                    arrayList2.add(obj3);
                }
                j3 = j4;
            }
            long j5 = j3;
            int i7 = (int) (jB & j5);
            if (Float.intBitsToFloat((int) (((gh4) CollectionsKt.T(arrayList2)).b & j5)) > Float.intBitsToFloat(i7)) {
                List listA0 = CollectionsKt.A0(f.n(0, i));
                ListIterator listIterator = listA0.listIterator(listA0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    int iIntValue = ((Number) objPrevious).intValue();
                    int size2 = arrayList.size();
                    int i8 = i4;
                    do {
                        if (i8 >= size2) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i8);
                        i8++;
                    } while (((gh4) obj).a.f != iIntValue);
                    gh4 gh4Var2 = (gh4) obj;
                    if (gh4Var2 == null || Float.intBitsToFloat((int) (gh4Var2.b & j5)) >= Float.intBitsToFloat(i7)) {
                        gh4Var2 = null;
                    }
                    if (gh4Var2 != null) {
                        break;
                    }
                    i4 = 0;
                }
                Integer num = (Integer) objPrevious;
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    arrayList2 = new ArrayList();
                    int size3 = arrayList.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj4 = arrayList.get(i9);
                        i9++;
                        if (((gh4) obj4).a.f == iIntValue2) {
                            arrayList2.add(obj4);
                        }
                    }
                } else {
                    arrayList2 = m2g.a;
                }
            }
            gh4 gh4VarF = f(jB, arrayList2);
            if (gh4VarF == null) {
                ib5.a("Can't find target!!");
                return null;
            }
            long j6 = gh4VarF.b;
            int i10 = (int) (j6 >> 32);
            int i11 = (int) (jB >> 32);
            if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
                jB = gly.b(Float.intBitsToFloat(i11) + 1.0f, 0.0f, 2, jB);
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 & j5)) - f;
            Pair pairH = h(fIntBitsToFloat, jB, j6);
            final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((float) ((Number) pairH.b).doubleValue())) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j5);
            final double dDoubleValue = ((Number) pairH.a).doubleValue();
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB >> 32));
            k(fIntBitsToFloat2);
            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
            k(fIntBitsToFloat3);
            Function2 function2 = new Function2() { // from class: xii
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    float fFloatValue = ((Float) obj5).floatValue();
                    ((Float) obj6).getClass();
                    float fFloatValue2 = ((Number) fjiVar.invoke()).floatValue() / 2.0f;
                    float f2 = fFloatValue - fFloatValue2;
                    float f3 = (float) dDoubleValue;
                    long j7 = jFloatToRawIntBits;
                    float fIntBitsToFloat4 = fFloatValue - Float.intBitsToFloat((int) (j7 >> 32));
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (j7 & 4294967295L)) + ((f3 * fIntBitsToFloat4) * fIntBitsToFloat4)) - fFloatValue2;
                    if (!Float.isNaN(f2) && !Float.isNaN(fIntBitsToFloat5)) {
                        gjiVar.invoke(new gly((((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32)));
                    }
                    return Unit.a;
                }
            };
            pjiVar.a = gh4VarF;
            pjiVar.c = 1;
            if (sje0.c(fIntBitsToFloat2, fIntBitsToFloat3, 0.0f, gzg0VarE, function2, pjiVar, 4) == y5bVar) {
                return y5bVar;
            }
            gh4Var = gh4VarF;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gh4Var = pjiVar.a;
            uj50.b(obj2);
        }
        return gh4Var.a;
    }
}
