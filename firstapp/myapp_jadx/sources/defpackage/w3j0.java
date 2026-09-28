package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.core.model.welcomereward.NonFtdRewardType;
import com.sporty.android.core.model.welcomereward.NonFtdTaskType;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class w3j0 {

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((n27) this.receiver).d();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((n27) this.receiver).d();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((n27) this.receiver).d();
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardScreenKt$TaskItem$1$1", f = "WelcomeRewardScreen.kt", l = {692, 693, 694, 699, 700, 702, 703, 712, 713, 714, 722}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ wd0<Float, ij0> d;
        public final /* synthetic */ w5f0 e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ Function0<Unit> v;
        public final /* synthetic */ ytw<Boolean> w;

        @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardScreenKt$TaskItem$1$1$1", f = "WelcomeRewardScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ wd0<Float, ij0> b;
            public final /* synthetic */ wd0<Float, ij0> c;

            /* JADX INFO: renamed from: w3j0$d$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardScreenKt$TaskItem$1$1$1$1", f = "WelcomeRewardScreen.kt", l = {724}, m = "invokeSuspend", v = 2)
            public static final class C1237a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ wd0<Float, ij0> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1237a(wd0<Float, ij0> wd0Var, v1b<? super C1237a> v1bVar) {
                    super(2, v1bVar);
                    this.b = wd0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C1237a(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C1237a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        Float f = new Float(1.0f);
                        gzg0 gzg0VarE = yi0.e(260, 0, c1j0.b, 2);
                        this.a = 1;
                        if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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

            @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardScreenKt$TaskItem$1$1$1$2", f = "WelcomeRewardScreen.kt", l = {733}, m = "invokeSuspend", v = 2)
            public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ wd0<Float, ij0> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(wd0<Float, ij0> wd0Var, v1b<? super b> v1bVar) {
                    super(2, v1bVar);
                    this.b = wd0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new b(this.b, v1bVar);
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
                        Float f = new Float(1.0f);
                        gzg0 gzg0VarE = yi0.e(180, 0, c1j0.a, 2);
                        this.a = 1;
                        if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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
            public a(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
                this.c = wd0Var2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, this.c, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super c9p> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                ej5.c(v5bVar, null, null, new C1237a(this.b, null), 3);
                return ej5.c(v5bVar, null, null, new b(this.c, null), 3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, wd0<Float, ij0> wd0Var3, w5f0 w5f0Var, boolean z, boolean z2, Function0<Unit> function0, ytw<Boolean> ytwVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = wd0Var2;
            this.d = wd0Var3;
            this.e = w5f0Var;
            this.f = z;
            this.i = z2;
            this.v = function0;
            this.w = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0083  */
        /* JADX WARN: Code duplicated, block: B:26:0x0093  */
        /* JADX WARN: Code duplicated, block: B:28:0x0097 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:32:0x009e  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:48:0x0100 A[PHI: r8 r10
          0x0100: PHI (r8v2 float) = (r8v1 float), (r8v3 float) binds: [B:46:0x00fd, B:10:0x003e] A[DONT_GENERATE, DONT_INLINE]
          0x0100: PHI (r10v2 wd0<java.lang.Float, ij0>) = (r10v1 wd0<java.lang.Float, ij0>), (r10v3 wd0<java.lang.Float, ij0>) binds: [B:46:0x00fd, B:10:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:51:0x0115 A[PHI: r8 r10
          0x0115: PHI (r8v4 float) = (r8v2 float), (r8v5 float) binds: [B:49:0x0112, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x0115: PHI (r10v4 wd0<java.lang.Float, ij0>) = (r10v2 wd0<java.lang.Float, ij0>), (r10v5 wd0<java.lang.Float, ij0>) binds: [B:49:0x0112, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:54:0x0125 A[PHI: r8 r10
          0x0125: PHI (r8v6 float) = (r8v4 float), (r8v7 float) binds: [B:52:0x0122, B:8:0x0030] A[DONT_GENERATE, DONT_INLINE]
          0x0125: PHI (r10v6 wd0<java.lang.Float, ij0>) = (r10v4 wd0<java.lang.Float, ij0>), (r10v7 wd0<java.lang.Float, ij0>) binds: [B:52:0x0122, B:8:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:57:0x0143 A[PHI: r10
          0x0143: PHI (r10v8 wd0<java.lang.Float, ij0>) = (r10v6 wd0<java.lang.Float, ij0>), (r10v9 wd0<java.lang.Float, ij0>) binds: [B:55:0x0140, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0151, code lost:
        
            if (defpackage.w5b.d(r0, r18) == r7) goto L59;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: w3j0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardScreenKt$TaskItem$2$1", f = "WelcomeRewardScreen.kt", l = {747, 749, 750}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ w5f0 c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(wd0<Float, ij0> wd0Var, w5f0 w5f0Var, boolean z, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = w5f0Var;
            this.d = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
        
            if (defpackage.wd0.a(r13.b, r7, r8, null, null, r13, 12) == r0) goto L24;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r13.a
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 1065353216(0x3f800000, float:1.0)
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L16
                defpackage.uj50.b(r14)
                goto La0
            L16:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r13)
                r13 = 0
                return r13
            L1d:
                defpackage.uj50.b(r14)
                goto L4d
            L21:
                defpackage.uj50.b(r14)
                goto L38
            L25:
                defpackage.uj50.b(r14)
                java.lang.Float r14 = new java.lang.Float
                r14.<init>(r5)
                r13.a = r4
                wd0<java.lang.Float, ij0> r1 = r13.b
                java.lang.Object r14 = r1.f(r13, r14)
                if (r14 != r0) goto L38
                goto L9f
            L38:
                w5f0 r14 = r13.c
                boolean r14 = r14.a
                if (r14 != 0) goto La0
                boolean r14 = r13.d
                if (r14 == 0) goto La0
                r13.a = r3
                r3 = 450(0x1c2, double:2.223E-321)
                java.lang.Object r14 = defpackage.hkd.b(r3, r13)
                if (r14 != r0) goto L4d
                goto L9f
            L4d:
                java.lang.Float r7 = new java.lang.Float
                r7.<init>(r5)
                hpp r8 = new hpp
                hpp$b r14 = new hpp$b
                r14.<init>()
                r1 = 420(0x1a4, float:5.89E-43)
                r14.a = r1
                java.lang.Float r3 = java.lang.Float.valueOf(r5)
                r4 = 0
                hpp$a r4 = r14.a(r4, r3)
                f4c r5 = defpackage.c1j0.a
                r4.b = r5
                r4 = 1065445491(0x3f816873, float:1.011)
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r6 = 168(0xa8, float:2.35E-43)
                hpp$a r4 = r14.a(r6, r4)
                r4.b = r5
                r4 = 1065269330(0x3f7eb852, float:0.995)
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                r6 = 294(0x126, float:4.12E-43)
                hpp$a r4 = r14.a(r6, r4)
                r4.b = r5
                r14.a(r1, r3)
                kotlin.Unit r1 = kotlin.Unit.a
                r8.<init>(r14)
                r13.a = r2
                wd0<java.lang.Float, ij0> r6 = r13.b
                r9 = 0
                r10 = 0
                r12 = 12
                r11 = r13
                java.lang.Object r13 = defpackage.wd0.a(r6, r7, r8, r9, r10, r11, r12)
                if (r13 != r0) goto La0
            L9f:
                return r0
            La0:
                kotlin.Unit r13 = kotlin.Unit.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: w3j0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardScreenKt$WelcomeRewardContent$1$1", f = "WelcomeRewardScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Function1<j4j0, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super j4j0, Unit> function1, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.a = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new f(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.invoke(j4j0.f.a);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final List<w5f0> list, final String str, final dup dupVar, final List<ds50> list2, final UiText uiText, final UiText uiText2, final boolean z, final Function1<? super j4j0, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        boolean z2;
        List list3;
        int i2;
        final n27 n27Var;
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(-926595706);
        int i4 = i | (bVarI.M(list) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(dupVar) ? 256 : 128) | (bVarI.M(list2) ? 2048 : 1024) | (bVarI.M(uiText) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(uiText2) ? 131072 : 65536) | (bVarI.b(z) ? 1048576 : 524288) | (bVarI.A(function1) ? 8388608 : 4194304);
        if (bVarI.q(i4 & 1, (4793491 & i4) != 4793490)) {
            androidx.compose.runtime.d dVar = kna.h;
            mmd mmdVar = (mmd) bVarI.O(dVar);
            float f2 = ((cjb0) bVarI.O(ejb0.a)).h;
            final float fC1 = mmdVar.C1(f2);
            boolean z3 = (i4 & 29360128) == 8388608;
            Object objY = bVarI.y();
            boolean z4 = z3;
            Object obj = androidx.compose.runtime.a.C0041a.a;
            if (z4 || objY == obj) {
                objY = new gap(function1, 1);
                bVarI.r(objY);
            }
            int i5 = i4 & 14;
            int i6 = i4 >> 6;
            int i7 = i6 & 112;
            int i8 = i4 >> 12;
            int i9 = i5 | i7 | (i8 & 896);
            mmd mmdVar2 = (mmd) bVarI.O(dVar);
            ytw ytwVarC = m.c((Function0) objY, bVarI);
            Object objY2 = bVarI.y();
            if (objY2 == obj) {
                objY2 = new up6(1);
                bVarI.r(objY2);
            }
            Object objA0 = CollectionsKt.a0(list, "|", null, null, (Function1) objY2, 30);
            if (list.isEmpty()) {
                z2 = false;
            } else {
                if (!list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((w5f0) it.next()).a) {
                                z2 = false;
                            }
                        }
                    }
                }
                z2 = true;
            }
            boolean z5 = z2 && !z;
            if (z2 && z) {
                list3 = m2g.a;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    Iterator it3 = it2;
                    if (((w5f0) next).a) {
                        arrayList.add(next);
                    }
                    it2 = it3;
                }
                ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(((w5f0) arrayList.get(i10)).b);
                }
                list3 = arrayList2;
            }
            if (list2 == null || !list2.isEmpty()) {
                Iterator<T> it4 = list2.iterator();
                i2 = 0;
                while (it4.hasNext()) {
                    if (((ds50) it4.next()).e && (i2 = i2 + 1) < 0) {
                        kotlin.collections.b.p();
                        throw null;
                    }
                }
            } else {
                i2 = 0;
            }
            boolean zM = bVarI.M(objA0) | ((((i9 & 896) ^ 384) > 256 && bVarI.b(z)) || (i9 & 384) == 256) | bVarI.d(i2);
            Object objY3 = bVarI.y();
            if (zM || objY3 == obj) {
                objY3 = new n27(list3, z2, z5, z2 && z);
                bVarI.r(objY3);
            }
            n27 n27Var2 = (n27) objY3;
            ytw ytwVar = n27Var2.f;
            ytw ytwVar2 = n27Var2.g;
            osw oswVar = n27Var2.d;
            List<NonFtdTaskType> list4 = n27Var2.a;
            Boolean bool = (Boolean) ((x5a0) ytwVar).getValue();
            bool.getClass();
            Object[] objArr = {bool, Boolean.valueOf(n27Var2.b()), objA0, Integer.valueOf(i2)};
            boolean zM2 = bVarI.M(n27Var2) | bVarI.M(mmdVar2) | bVarI.d(i2) | bVarI.M(ytwVarC);
            Object objY4 = bVarI.y();
            if (zM2 || objY4 == obj) {
                objY4 = new e4j0(n27Var2, mmdVar2, i2, ytwVarC, null);
                n27Var = n27Var2;
                bVarI.r(objY4);
            } else {
                n27Var = n27Var2;
            }
            xvf.h(objArr, (Function2) objY4, bVarI);
            int iOrdinal = ((((Boolean) ((x5a0) n27Var.f).getValue()).booleanValue() && !((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue() && n27Var.b()) ? q27.b : ((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue() ? q27.c : q27.a).ordinal();
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            n54.a aVar3 = ht.a.m;
            int i11 = 3;
            if (iOrdinal == 0) {
                bVarI.N(-452992914);
                androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
                i78 i78VarA = g78.a(new kw0.i(f2, true, new hw0()), aVar3, bVarI, 0);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                NonFtdTaskType nonFtdTaskType = (NonFtdTaskType) CollectionsKt.V(((u5a0) oswVar).D(), list4);
                Set<NonFtdTaskType> setC = n27Var.c();
                boolean z6 = !n27Var.b && ((Boolean) ((x5a0) n27Var.e).getValue()).booleanValue();
                boolean zM3 = bVarI.M(n27Var);
                Object objY5 = bVarI.y();
                if (zM3 || objY5 == obj) {
                    objY5 = new c(0, n27Var, n27.class, "onCompletionAnimationFinished", "onCompletionAnimationFinished()V", 0);
                    bVarI.r(objY5);
                }
                Function0 function0 = (Function0) ((chp) objY5);
                boolean zM4 = bVarI.M(n27Var);
                Object objY6 = bVarI.y();
                if (zM4 || objY6 == obj) {
                    objY6 = new Function1() { // from class: b3j0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i12 = (int) (((jxo) obj2).a & 4294967295L);
                            u5a0 u5a0Var = (u5a0) n27Var.j;
                            if (u5a0Var.D() != i12) {
                                u5a0Var.k(i12);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY6);
                }
                b(list, str, dupVar, uiText2, nonFtdTaskType, setC, z6, function0, function1, w.a(aVar2, (Function1) objY6), bVarI, (i4 & 1022) | (i6 & 7168) | ((i4 << 3) & 234881024), 0);
                boolean zA = n27Var.a();
                boolean zM5 = bVarI.M(n27Var);
                Object objY7 = bVarI.y();
                if (zM5 || objY7 == obj) {
                    objY7 = new Function1() { // from class: c3j0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i12 = (int) (((jxo) obj2).a & 4294967295L);
                            u5a0 u5a0Var = (u5a0) n27Var.k;
                            if (u5a0Var.D() != i12) {
                                u5a0Var.k(i12);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY7);
                }
                androidx.compose.runtime.b bVar2 = bVarI;
                f(w.a(aVar2, (Function1) objY7), list2, uiText, function1, zA, false, bVar2, (i6 & 896) | i7 | 196608 | (i8 & 7168));
                bVar2.X(true);
                bVar2.X(false);
                Unit unit = Unit.a;
                bVar = bVar2;
            } else if (iOrdinal == 1) {
                bVarI.N(-456970276);
                androidx.compose.ui.d dVarI = j.i(j.g(aVar2, 1.0f), mmdVar.v1(((u5a0) n27Var.k).D() + ((u5a0) n27Var.j).D() + fC1));
                aiv aivVarC = g75.c(ht.a.a, false);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarI);
                yka.k.getClass();
                tsr.a aVar5 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                NonFtdTaskType nonFtdTaskType2 = (NonFtdTaskType) CollectionsKt.V(((u5a0) oswVar).D(), list4);
                Set<NonFtdTaskType> setC2 = n27Var.c();
                boolean zM6 = bVarI.M(n27Var);
                Object objY8 = bVarI.y();
                if (zM6 || objY8 == obj) {
                    objY8 = new a(0, n27Var, n27.class, "onCompletionAnimationFinished", "onCompletionAnimationFinished()V", 0);
                    bVarI.r(objY8);
                }
                Function0 function2 = (Function0) ((chp) objY8);
                boolean zM7 = bVarI.M(n27Var);
                Object objY9 = bVarI.y();
                if (zM7 || objY9 == obj) {
                    objY9 = new xuj(n27Var, 1);
                    bVarI.r(objY9);
                }
                androidx.compose.ui.d dVarA = w.a(aVar2, (Function1) objY9);
                boolean zM8 = bVarI.M(n27Var);
                Object objY10 = bVarI.y();
                if (zM8 || objY10 == obj) {
                    objY10 = new sb20(n27Var, 2);
                    bVarI.r(objY10);
                }
                b(list, str, dupVar, uiText2, nonFtdTaskType2, setC2, false, function2, function1, androidx.compose.ui.graphics.a.a(dVarA, (Function1) objY10), bVarI, i5 | 1572864 | (i4 & 112) | (i4 & 896) | (i6 & 7168) | ((i4 << 3) & 234881024), 0);
                boolean zA2 = n27Var.a();
                boolean zM9 = bVarI.M(n27Var);
                Object objY11 = bVarI.y();
                if (zM9 || objY11 == obj) {
                    i3 = 1;
                    objY11 = new tb20(n27Var, i3);
                    bVarI.r(objY11);
                } else {
                    i3 = 1;
                }
                androidx.compose.ui.d dVarA2 = w.a(aVar2, (Function1) objY11);
                boolean zM10 = bVarI.M(n27Var) | bVarI.c(fC1);
                Object objY12 = bVarI.y();
                if (zM10 || objY12 == obj) {
                    objY12 = new Function1() { // from class: z2j0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            a7l a7lVar = (a7l) obj2;
                            a7lVar.getClass();
                            n27 n27Var3 = n27Var;
                            a7lVar.f((1.0f - n27Var3.l.d().floatValue()) * (((u5a0) n27Var3.j).D() + fC1));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY12);
                }
                androidx.compose.runtime.b bVar3 = bVarI;
                f(androidx.compose.ui.graphics.a.a(dVarA2, (Function1) objY12), list2, uiText, function1, zA2, false, bVar3, (i6 & 896) | i7 | 196608 | (i8 & 7168));
                bVar3.X(i3);
                bVar3.X(false);
                Unit unit2 = Unit.a;
                bVar = bVar3;
            } else {
                if (iOrdinal != 2) {
                    throw igf0.a(bVarI, -1400213648, false);
                }
                bVarI.N(-454658699);
                androidx.compose.ui.d dVarG2 = j.g(aVar2, 1.0f);
                i78 i78VarA2 = g78.a(new kw0.i(f2, true, new hw0()), aVar3, bVarI, 0);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarG2);
                yka.k.getClass();
                tsr.a aVar6 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, yka.a.f);
                hlh0.a(bVarI, ne00VarS3, yka.a.e);
                yka.a.C1350a c1350a3 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a3);
                }
                hlh0.a(bVarI, dVarC3, yka.a.d);
                boolean zA3 = n27Var.a();
                boolean zBooleanValue = ((Boolean) ((x5a0) n27Var.h).getValue()).booleanValue();
                boolean zM11 = bVarI.M(n27Var);
                Object objY13 = bVarI.y();
                if (zM11 || objY13 == obj) {
                    objY13 = new hp6(n27Var, i11);
                    bVarI.r(objY13);
                }
                f(w.a(aVar2, (Function1) objY13), list2, uiText, function1, zA3, zBooleanValue, bVarI, (i6 & 1008) | (i8 & 7168));
                NonFtdTaskType nonFtdTaskType3 = (NonFtdTaskType) CollectionsKt.V(((u5a0) oswVar).D(), list4);
                Set<NonFtdTaskType> setC3 = n27Var.c();
                boolean zM12 = bVarI.M(n27Var);
                Object objY14 = bVarI.y();
                if (zM12 || objY14 == obj) {
                    objY14 = new b(0, n27Var, n27.class, "onCompletionAnimationFinished", "onCompletionAnimationFinished()V", 0);
                    bVarI.r(objY14);
                }
                Function0 function3 = (Function0) ((chp) objY14);
                boolean zM13 = bVarI.M(n27Var);
                Object objY15 = bVarI.y();
                if (zM13 || objY15 == obj) {
                    objY15 = new Function1() { // from class: a3j0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i12 = (int) (((jxo) obj2).a & 4294967295L);
                            u5a0 u5a0Var = (u5a0) n27Var.j;
                            if (u5a0Var.D() != i12) {
                                u5a0Var.k(i12);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY15);
                }
                androidx.compose.ui.d dVarA3 = w.a(aVar2, (Function1) objY15);
                boolean zM14 = bVarI.M(n27Var);
                Object objY16 = bVarI.y();
                if (zM14 || objY16 == obj) {
                    objY16 = new sf1(n27Var, 2);
                    bVarI.r(objY16);
                }
                b(list, str, dupVar, uiText2, nonFtdTaskType3, setC3, false, function3, function1, androidx.compose.ui.graphics.a.a(dVarA3, (Function1) objY16), bVarI, i5 | 1572864 | (i4 & 112) | (i4 & 896) | (i6 & 7168) | ((i4 << 3) & 234881024), 0);
                bVarI.X(true);
                bVarI.X(false);
                Unit unit3 = Unit.a;
                bVar = bVarI;
            }
        } else {
            bVarI.G();
            bVar = bVarI;
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(list, str, dupVar, list2, uiText, uiText2, z, function1, i) { // from class: x2j0
                public final /* synthetic */ List a;
                public final /* synthetic */ String b;
                public final /* synthetic */ dup c;
                public final /* synthetic */ List d;
                public final /* synthetic */ UiText e;
                public final /* synthetic */ UiText f;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ Function1 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(1);
                    w3j0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final List<w5f0> list, final String str, dup dupVar, final UiText uiText, final NonFtdTaskType nonFtdTaskType, Set<? extends NonFtdTaskType> set, final boolean z, final Function0<Unit> function0, final Function1<? super j4j0, Unit> function1, androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final androidx.compose.ui.d dVar2;
        int i3;
        Set<? extends NonFtdTaskType> set2;
        final dup dupVar2 = dupVar;
        androidx.compose.runtime.b bVarI = aVar.i(1119269574);
        int i4 = (bVarI.M(list) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= bVarI.M(str) ? 32 : 16;
        }
        int i5 = i4 | (bVarI.M(dupVar2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i5 |= bVarI.M(uiText) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= bVarI.d(nonFtdTaskType == null ? -1 : nonFtdTaskType.ordinal()) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= bVarI.M(set) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= bVarI.b(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= bVarI.A(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i5 |= bVarI.A(function1) ? 67108864 : 33554432;
        }
        int i6 = i2 & 512;
        if (i6 != 0) {
            i3 = i5 | 805306368;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i3 = i5 | (bVarI.M(dVar2) ? 536870912 : 268435456);
        }
        int i7 = i3;
        if (bVarI.q(i7 & 1, (i7 & 306783379) != 306783378)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVar3 = i6 != 0 ? aVar2 : dVar2;
            androidx.compose.ui.d dVarH = h.h(j.g(dVar3, 1.0f), fjb0.d(bVarI).g, 0.0f, 2);
            androidx.compose.ui.d dVar4 = dVar3;
            kw0.i iVar = new kw0.i(fjb0.d(bVarI).d, true, new hw0());
            n54.a aVar3 = ht.a.m;
            i78 i78VarA = g78.a(iVar, aVar3, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar5 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar5);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            kw0.g gVar = kw0.g;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(gVar, bVar2, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar5);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d160 d160VarA2 = b160.a(new kw0.i(fjb0.d(bVarI).d, true, new hw0()), bVar2, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar5);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            g(cb40.a(R.string.wap_home__challenge, new Object[0], bVarI), bVarI, 0);
            c(uiText, true, bVarI, ((i7 >> 9) & 14) | 48, 0);
            bVarI.X(true);
            int i8 = i7 >> 3;
            lkf0.d(str, g3w.h(aVar2, "welcomeRewardProgressIndicator"), fjb0.b(bVarI).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).o, bVarI, (i8 & 14) | 48, 0, 131064);
            bVarI.X(true);
            androidx.compose.ui.d dVarF = h.f(ls7.a(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f).n(androidx.compose.ui.draw.a.a(aVar2, new xvj(3))), fjb0.b(bVarI).b1, j060.c(fjb0.c(bVarI).d)), j060.c(fjb0.c(bVarI).d)), fjb0.d(bVarI).e);
            i78 i78VarA2 = g78.a(new kw0.i(fjb0.d(bVarI).e, true, new hw0()), aVar3, bVarI, 0);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarF);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar5);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            Iterator itA = yt1.a(bVarI, dVarC4, cVar, 453108059, list);
            while (itA.hasNext()) {
                w5f0 w5f0Var = (w5f0) itA.next();
                NonFtdTaskType nonFtdTaskType2 = w5f0Var.b;
                int i9 = i7 >> 6;
                i(w5f0Var, dupVar, nonFtdTaskType2 == nonFtdTaskType, set.contains(nonFtdTaskType2), !w5f0Var.a && z, function0, function1, bVarI, (i8 & 112) | (458752 & i9) | (i9 & 3670016));
            }
            dupVar2 = dupVar;
            set2 = set;
            bVarI.X(false);
            bVarI.X(true);
            if (dupVar2 instanceof dup.a) {
                bVarI.N(-737026238);
                h(((dup.a) dupVar2).a.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), bVarI, 0);
                bVarI.X(false);
            } else {
                bVarI.N(-736949358);
                bVarI.X(false);
            }
            bVarI.X(true);
            dVar2 = dVar4;
        } else {
            set2 = set;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Set<? extends NonFtdTaskType> set3 = set2;
            eVarZ.d = new Function2() { // from class: g3j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w3j0.b(list, str, dupVar2, uiText, nonFtdTaskType, set3, z, function0, function1, dVar2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0196  */
    /* JADX WARN: Code duplicated, block: B:53:0x019f  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void c(final UiText uiText, boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final boolean z2;
        boolean z3;
        androidx.compose.runtime.e eVarZ;
        final boolean z4;
        qyd0 qyd0Var;
        long j;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        androidx.compose.runtime.e eVarZ2;
        androidx.compose.runtime.b bVarI = aVar.i(-758133677);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(uiText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i4 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (uiText == null) {
                    eVarZ2 = bVarI.Z();
                    if (eVarZ2 != null) {
                        eVarZ2.d = new Function2() { // from class: o3j0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i | 1);
                                w3j0.c(uiText, z4, (a) obj, iA, i2);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                qyd0 qyd0Var2 = ejb0.a;
                kw0.i iVar = new kw0.i(((cjb0) bVarI.O(qyd0Var2)).c, true, new iw0(ht.a.n));
                if (z4) {
                    bVarI.N(1673036075);
                    qyd0Var = oib0.a;
                    j = ((lib0) bVarI.O(qyd0Var)).T;
                    bVarI.X(false);
                } else {
                    bVarI.N(1673109390);
                    qyd0Var = oib0.a;
                    j = ((lib0) bVarI.O(qyd0Var)).d1;
                    bVarI.X(false);
                }
                qyd0 qyd0Var3 = qyd0Var;
                i060 i060VarC = j060.c(((zib0) bVarI.O(ajb0.a)).c);
                androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarF = h.f(androidx.compose.foundation.a.b(aVar3, j, i060VarC), ((cjb0) bVarI.O(qyd0Var2)).c);
                d160 d160VarA = b160.a(iVar, ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarF);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                h6n.b(erz.a(R.drawable.icon_mission_timer, 0, bVarI), null, j.r(aVar3, 12.0f), ((lib0) bVarI.O(qyd0Var3)).o, bVarI, 432, 0);
                lkf0.d(uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) bVarI.O(qyd0Var3)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).q, bVarI, 0, 0, 131066);
                bVarI = bVarI;
                bVarI.X(true);
                z2 = z4;
            } else {
                bVarI.G();
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: p3j0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iA = qj40.a(i | 1);
                        w3j0.c(uiText, z2, (a) obj, iA, i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            if (i4 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            if (uiText == null) {
                eVarZ2 = bVarI.Z();
                if (eVarZ2 != null) {
                    eVarZ2.d = new Function2() { // from class: o3j0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(i | 1);
                            w3j0.c(uiText, z4, (a) obj, iA, i2);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            qyd0 qyd0Var4 = ejb0.a;
            kw0.i iVar2 = new kw0.i(((cjb0) bVarI.O(qyd0Var4)).c, true, new iw0(ht.a.n));
            if (z4) {
                bVarI.N(1673036075);
                qyd0Var = oib0.a;
                j = ((lib0) bVarI.O(qyd0Var)).T;
                bVarI.X(false);
            } else {
                bVarI.N(1673109390);
                qyd0Var = oib0.a;
                j = ((lib0) bVarI.O(qyd0Var)).d1;
                bVarI.X(false);
            }
            qyd0 qyd0Var5 = qyd0Var;
            i060 i060VarC2 = j060.c(((zib0) bVarI.O(ajb0.a)).c);
            androidx.compose.ui.d.a aVar4 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarF2 = h.f(androidx.compose.foundation.a.b(aVar4, j, i060VarC2), ((cjb0) bVarI.O(qyd0Var4)).c);
            d160 d160VarA2 = b160.a(iVar2, ht.a.k, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarF2);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            h6n.b(erz.a(R.drawable.icon_mission_timer, 0, bVarI), null, j.r(aVar4, 12.0f), ((lib0) bVarI.O(qyd0Var5)).o, bVarI, 432, 0);
            lkf0.d(uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) bVarI.O(qyd0Var5)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).q, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
            z2 = z4;
        } else {
            bVarI.G();
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: p3j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    w3j0.c(uiText, z2, (a) obj, iA, i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0115  */
    /* JADX WARN: Code duplicated, block: B:103:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x0122  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0132  */
    /* JADX WARN: Code duplicated, block: B:111:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0140 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x0145  */
    /* JADX WARN: Code duplicated, block: B:119:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x0156  */
    /* JADX WARN: Code duplicated, block: B:124:0x017d  */
    /* JADX WARN: Code duplicated, block: B:125:0x017f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0187  */
    /* JADX WARN: Code duplicated, block: B:129:0x0189  */
    /* JADX WARN: Code duplicated, block: B:132:0x0191  */
    /* JADX WARN: Code duplicated, block: B:133:0x0193  */
    /* JADX WARN: Code duplicated, block: B:136:0x019b  */
    /* JADX WARN: Code duplicated, block: B:137:0x019d  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:153:0x0243  */
    /* JADX WARN: Code duplicated, block: B:154:0x0245  */
    /* JADX WARN: Code duplicated, block: B:157:0x024f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0251  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0268  */
    /* JADX WARN: Code duplicated, block: B:170:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x0276  */
    /* JADX WARN: Code duplicated, block: B:176:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:177:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:180:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:182:0x02de  */
    /* JADX WARN: Code duplicated, block: B:185:0x0307  */
    /* JADX WARN: Code duplicated, block: B:188:0x0313  */
    /* JADX WARN: Code duplicated, block: B:191:0x031f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0330  */
    /* JADX WARN: Code duplicated, block: B:197:0x033c  */
    /* JADX WARN: Code duplicated, block: B:200:0x035a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x035c  */
    /* JADX WARN: Code duplicated, block: B:204:0x036c  */
    /* JADX WARN: Code duplicated, block: B:207:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x0384  */
    /* JADX WARN: Code duplicated, block: B:211:0x03b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:219:0x03e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:220:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:223:0x0430 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x0432  */
    /* JADX WARN: Code duplicated, block: B:227:0x0461  */
    /* JADX WARN: Code duplicated, block: B:230:0x0472  */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:99:0x0113  */
    public static final void d(final boolean z, boolean z2, boolean z3, long j, final String str, NonFtdRewardType nonFtdRewardType, final gr50 gr50Var, final Function1 function1, final op8 op8Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z5;
        final NonFtdRewardType nonFtdRewardType2;
        androidx.compose.runtime.b bVar;
        final boolean z6;
        final boolean z7;
        final long j2;
        androidx.compose.runtime.e eVarZ;
        boolean z8;
        boolean z9;
        long j3;
        int i8;
        boolean z10;
        Object objY;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        wd0 wd0Var;
        boolean z11;
        Object objY2;
        float f2;
        wd0 wd0Var2;
        final boolean z12;
        boolean z13;
        boolean z14;
        Object[] objArr;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objY3;
        wd0 wd0Var3;
        wd0 wd0Var4;
        Object[] objArr2;
        int i9;
        androidx.compose.runtime.a.C0041a.C0042a c0042a2;
        boolean z20;
        androidx.compose.ui.d.a aVar2;
        boolean zA;
        Object objY4;
        androidx.compose.runtime.a.C0041a.C0042a c0042a3;
        qyd0 qyd0Var;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        Object objY5;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        mmd mmdVar;
        Object objY6;
        niv nivVar;
        Object objY7;
        nwa nwaVar;
        Object objY8;
        ytw ytwVar;
        Object objY9;
        twa twaVar;
        Object objY10;
        ytw ytwVar2;
        boolean zD;
        Object objY11;
        Object objY12;
        boolean zA2;
        Object objY13;
        boolean zA3;
        Object objY14;
        boolean zA4;
        Object objY15;
        int i10;
        int i11;
        boolean zA5;
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.b bVarI = aVar.i(-1514182225);
        if ((i & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                z4 = z2;
                i3 |= bVarI.b(z4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    if (bVarI.b(z3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    if (bVarI.e(j)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) != 0) {
                    if (bVarI.M(str)) {
                        i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i14 = 8192;
                    }
                    i3 |= i14;
                }
                if ((i & 196608) == 0) {
                    if (bVarI.d(nonFtdRewardType.ordinal())) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i3 |= i13;
                }
                if ((1572864 & i) == 0) {
                    if ((i & 2097152) == 0) {
                        zA5 = bVarI.M(gr50Var);
                    } else {
                        zA5 = bVarI.A(gr50Var);
                    }
                    if (zA5) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((12582912 & i) == 0) {
                    if (bVarI.A(function1)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
                if ((100663296 & i) != 0) {
                    if (bVarI.A(op8Var)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((i3 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bVarI.q(i3 & 1, z5)) {
                    if (i15 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z3;
                    }
                    if (i6 != 0) {
                        j3 = 0;
                    } else {
                        j3 = j;
                    }
                    i8 = i3 & 458752;
                    if (i8 == 131072) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objY = bVarI.y();
                    c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (z10 || objY == c0042a) {
                        objY = ee0.a(1.0f);
                        bVarI.r(objY);
                    }
                    wd0Var = (wd0) objY;
                    if (i8 == 131072) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objY2 = bVarI.y();
                    if (z11 || objY2 == c0042a) {
                        if (z || z8) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.0f;
                        }
                        objY2 = ee0.a(f2);
                        bVarI.r(objY2);
                    }
                    wd0Var2 = (wd0) objY2;
                    if (z || z8) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    z13 = z8;
                    z14 = z9;
                    objArr = new Object[]{Boolean.valueOf(z), Boolean.valueOf(z8), Boolean.valueOf(z9), Long.valueOf(j3)};
                    boolean zA6 = bVarI.A(wd0Var) | bVarI.A(wd0Var2);
                    if ((i3 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z25 = zA6 | z15;
                    if ((i3 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z26 = z25 | z16;
                    if ((i3 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z27 = z26 | z17;
                    if ((i3 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z27 | z18;
                    objY3 = bVarI.y();
                    if (!z19 || objY3 == c0042a) {
                        wd0Var3 = wd0Var2;
                        wd0Var4 = wd0Var;
                        objArr2 = objArr;
                        i9 = i3;
                        c0042a2 = c0042a;
                        x3j0 x3j0Var = new x3j0(wd0Var4, wd0Var3, z, z13, z14, j3, null);
                        z20 = z14;
                        bVarI.r(x3j0Var);
                        objY3 = x3j0Var;
                    } else {
                        wd0Var3 = wd0Var2;
                        wd0Var4 = wd0Var;
                        objArr2 = objArr;
                        z20 = z14;
                        i9 = i3;
                        c0042a2 = c0042a;
                    }
                    xvf.h(objArr2, (Function2) objY3, bVarI);
                    aVar2 = androidx.compose.ui.d.a.b;
                    androidx.compose.ui.d dVarG = j.g(aVar2, r36);
                    zA = bVarI.A(wd0Var4);
                    objY4 = bVarI.y();
                    int i16 = 3;
                    if (zA) {
                        c0042a3 = c0042a2;
                    } else {
                        c0042a3 = c0042a2;
                        if (objY4 == c0042a3) {
                        }
                        androidx.compose.ui.d dVarN = androidx.compose.ui.graphics.a.a(dVarG, (Function1) objY4).n(androidx.compose.ui.draw.a.a(aVar2, new xvj(i16)));
                        qyd0Var = oib0.a;
                        long j4 = ((lib0) bVarI.O(qyd0Var)).b1;
                        qyd0 qyd0Var2 = ajb0.a;
                        androidx.compose.ui.d dVarA = ls7.a(androidx.compose.foundation.a.b(dVarN, j4, j060.c(((zib0) bVarI.O(qyd0Var2)).d)), j060.c(((zib0) bVarI.O(qyd0Var2)).d));
                        if ((i9 & 29360128) == 8388608) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        boolean zB = z21 | bVarI.b(z12);
                        if (i8 == 131072) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        boolean z28 = zB | z22;
                        if ((i9 & 3670016) != 1048576 || ((i9 & 2097152) != 0 && bVarI.A(gr50Var))) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        z24 = z28 | z23;
                        objY5 = bVarI.y();
                        if (!z24 || objY5 == c0042a3) {
                            nonFtdRewardType2 = nonFtdRewardType;
                            objY5 = new Function0() { // from class: h3j0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                                    return Unit.a;
                                }
                            };
                            bVarI.r(objY5);
                        } else {
                            nonFtdRewardType2 = nonFtdRewardType;
                        }
                        androidx.compose.ui.d dVarH = g3w.h(androidx.compose.foundation.d.d(dVarA, false, null, null, (Function0) objY5, 15), "welcomeReward");
                        aiv aivVarC = g75.c(ht.a.a, false);
                        iHashCode = Long.hashCode(bVarI.T);
                        ne00 ne00VarS = bVarI.S();
                        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
                        yka.k.getClass();
                        aVar3 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar3);
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
                        androidx.compose.ui.d dVarG2 = j.g(aVar2, 1.0f);
                        bVarI.N(-1003410150);
                        bVarI.N(212064437);
                        bVarI.X(false);
                        mmdVar = (mmd) bVarI.O(kna.h);
                        objY6 = bVarI.y();
                        if (objY6 == c0042a3) {
                            objY6 = rzj.a(mmdVar, bVarI);
                        }
                        nivVar = (niv) objY6;
                        objY7 = bVarI.y();
                        if (objY7 == c0042a3) {
                            objY7 = pzj.a(bVarI);
                        }
                        nwaVar = (nwa) objY7;
                        objY8 = bVarI.y();
                        if (objY8 == c0042a3) {
                            objY8 = m.b(Boolean.FALSE);
                            bVarI.r(objY8);
                        }
                        ytwVar = (ytw) objY8;
                        objY9 = bVarI.y();
                        if (objY9 == c0042a3) {
                            objY9 = qzj.a(nwaVar, bVarI);
                        }
                        twaVar = (twa) objY9;
                        objY10 = bVarI.y();
                        if (objY10 == c0042a3) {
                            objY10 = m.a(Unit.a, epx.a);
                            bVarI.r(objY10);
                        }
                        ytwVar2 = (ytw) objY10;
                        zD = bVarI.d(257) | bVarI.A(nivVar);
                        objY11 = bVarI.y();
                        if (zD || objY11 == c0042a3) {
                            objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                            bVarI.r(objY11);
                        }
                        aiv aivVar = (aiv) objY11;
                        objY12 = bVarI.y();
                        if (objY12 == c0042a3) {
                            objY12 = new b4j0(ytwVar, twaVar);
                            bVarI.r(objY12);
                        }
                        Function0 function0 = (Function0) objY12;
                        zA2 = bVarI.A(nivVar);
                        objY13 = bVarI.y();
                        if (zA2 || objY13 == c0042a3) {
                            objY13 = new c4j0(nivVar);
                            bVarI.r(objY13);
                        }
                        lsr.a(xa80.b(dVarG2, false, (Function1) objY13), pp8.b(1200550679, new d4j0(ytwVar2, nwaVar, function0, str, op8Var), bVarI), aivVar, bVarI, 48);
                        bVarI.X(false);
                        if (z || z13 || ((Number) wd0Var3.d()).floatValue() > 0.0f) {
                            bVarI.N(-234944392);
                            androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.d.a;
                            androidx.compose.ui.d dVarF = dVar.f(aVar2);
                            zA3 = bVarI.A(wd0Var3);
                            objY14 = bVarI.y();
                            if (zA3 || objY14 == c0042a3) {
                                objY14 = new lq6(wd0Var3, 2);
                                bVarI.r(objY14);
                            }
                            g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                            crz crzVarA = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                            long j5 = ((lib0) bVarI.O(qyd0Var)).a0;
                            androidx.compose.ui.d dVarR = j.r(dVar.b(aVar2, ht.a.e), 16.0f);
                            zA4 = bVarI.A(wd0Var3);
                            objY15 = bVarI.y();
                            if (zA4 || objY15 == c0042a3) {
                                objY15 = new fta(wd0Var3, 3);
                                bVarI.r(objY15);
                            }
                            bVar = bVarI;
                            h6n.b(crzVarA, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR, (Function1) objY15), "welcomeRewardLock"), j5, bVar, 48, 0);
                            bVar.X(false);
                        } else {
                            bVarI.N(-234309171);
                            bVarI.X(false);
                            bVar = bVarI;
                        }
                        bVar.X(true);
                        z6 = z20;
                        z7 = z13;
                        j2 = j3;
                    }
                    objY4 = new xp6(wd0Var4, i16);
                    bVarI.r(objY4);
                    androidx.compose.ui.d dVarN2 = androidx.compose.ui.graphics.a.a(dVarG, (Function1) objY4).n(androidx.compose.ui.draw.a.a(aVar2, new xvj(i16)));
                    qyd0Var = oib0.a;
                    long j6 = ((lib0) bVarI.O(qyd0Var)).b1;
                    qyd0 qyd0Var3 = ajb0.a;
                    androidx.compose.ui.d dVarA2 = ls7.a(androidx.compose.foundation.a.b(dVarN2, j6, j060.c(((zib0) bVarI.O(qyd0Var3)).d)), j060.c(((zib0) bVarI.O(qyd0Var3)).d));
                    if ((i9 & 29360128) == 8388608) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    boolean zB2 = z21 | bVarI.b(z12);
                    if (i8 == 131072) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    boolean z29 = zB2 | z22;
                    if ((i9 & 3670016) != 1048576) {
                        z23 = true;
                    } else {
                        z23 = true;
                    }
                    z24 = z29 | z23;
                    objY5 = bVarI.y();
                    if (z24) {
                        nonFtdRewardType2 = nonFtdRewardType;
                        objY5 = new Function0() { // from class: h3j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    } else {
                        nonFtdRewardType2 = nonFtdRewardType;
                        objY5 = new Function0() { // from class: h3j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    androidx.compose.ui.d dVarH2 = g3w.h(androidx.compose.foundation.d.d(dVarA2, false, null, null, (Function0) objY5, 15), "welcomeReward");
                    aiv aivVarC2 = g75.c(ht.a.a, false);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarH2);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
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
                    androidx.compose.ui.d dVarG3 = j.g(aVar2, 1.0f);
                    bVarI.N(-1003410150);
                    bVarI.N(212064437);
                    bVarI.X(false);
                    mmdVar = (mmd) bVarI.O(kna.h);
                    objY6 = bVarI.y();
                    if (objY6 == c0042a3) {
                        objY6 = rzj.a(mmdVar, bVarI);
                    }
                    nivVar = (niv) objY6;
                    objY7 = bVarI.y();
                    if (objY7 == c0042a3) {
                        objY7 = pzj.a(bVarI);
                    }
                    nwaVar = (nwa) objY7;
                    objY8 = bVarI.y();
                    if (objY8 == c0042a3) {
                        objY8 = m.b(Boolean.FALSE);
                        bVarI.r(objY8);
                    }
                    ytwVar = (ytw) objY8;
                    objY9 = bVarI.y();
                    if (objY9 == c0042a3) {
                        objY9 = qzj.a(nwaVar, bVarI);
                    }
                    twaVar = (twa) objY9;
                    objY10 = bVarI.y();
                    if (objY10 == c0042a3) {
                        objY10 = m.a(Unit.a, epx.a);
                        bVarI.r(objY10);
                    }
                    ytwVar2 = (ytw) objY10;
                    zD = bVarI.d(257) | bVarI.A(nivVar);
                    objY11 = bVarI.y();
                    if (zD) {
                        objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                        bVarI.r(objY11);
                    } else {
                        objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                        bVarI.r(objY11);
                    }
                    aiv aivVar2 = (aiv) objY11;
                    objY12 = bVarI.y();
                    if (objY12 == c0042a3) {
                        objY12 = new b4j0(ytwVar, twaVar);
                        bVarI.r(objY12);
                    }
                    Function0 function2 = (Function0) objY12;
                    zA2 = bVarI.A(nivVar);
                    objY13 = bVarI.y();
                    if (zA2) {
                        objY13 = new c4j0(nivVar);
                        bVarI.r(objY13);
                    } else {
                        objY13 = new c4j0(nivVar);
                        bVarI.r(objY13);
                    }
                    lsr.a(xa80.b(dVarG3, false, (Function1) objY13), pp8.b(1200550679, new d4j0(ytwVar2, nwaVar, function2, str, op8Var), bVarI), aivVar2, bVarI, 48);
                    bVarI.X(false);
                    if (z) {
                        bVarI.N(-234944392);
                        androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                        androidx.compose.ui.d dVarF2 = dVar2.f(aVar2);
                        zA3 = bVarI.A(wd0Var3);
                        objY14 = bVarI.y();
                        if (zA3) {
                            objY14 = new lq6(wd0Var3, 2);
                            bVarI.r(objY14);
                        } else {
                            objY14 = new lq6(wd0Var3, 2);
                            bVarI.r(objY14);
                        }
                        g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF2, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                        crz crzVarA2 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                        long j7 = ((lib0) bVarI.O(qyd0Var)).a0;
                        androidx.compose.ui.d dVarR2 = j.r(dVar2.b(aVar2, ht.a.e), 16.0f);
                        zA4 = bVarI.A(wd0Var3);
                        objY15 = bVarI.y();
                        if (zA4) {
                            objY15 = new fta(wd0Var3, 3);
                            bVarI.r(objY15);
                        } else {
                            objY15 = new fta(wd0Var3, 3);
                            bVarI.r(objY15);
                        }
                        bVar = bVarI;
                        h6n.b(crzVarA2, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR2, (Function1) objY15), "welcomeRewardLock"), j7, bVar, 48, 0);
                        bVar.X(false);
                    } else {
                        bVarI.N(-234944392);
                        androidx.compose.foundation.layout.d dVar3 = androidx.compose.foundation.layout.d.a;
                        androidx.compose.ui.d dVarF3 = dVar3.f(aVar2);
                        zA3 = bVarI.A(wd0Var3);
                        objY14 = bVarI.y();
                        if (zA3) {
                            objY14 = new lq6(wd0Var3, 2);
                            bVarI.r(objY14);
                        } else {
                            objY14 = new lq6(wd0Var3, 2);
                            bVarI.r(objY14);
                        }
                        g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF3, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                        crz crzVarA3 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                        long j8 = ((lib0) bVarI.O(qyd0Var)).a0;
                        androidx.compose.ui.d dVarR3 = j.r(dVar3.b(aVar2, ht.a.e), 16.0f);
                        zA4 = bVarI.A(wd0Var3);
                        objY15 = bVarI.y();
                        if (zA4) {
                            objY15 = new fta(wd0Var3, 3);
                            bVarI.r(objY15);
                        } else {
                            objY15 = new fta(wd0Var3, 3);
                            bVarI.r(objY15);
                        }
                        bVar = bVarI;
                        h6n.b(crzVarA3, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR3, (Function1) objY15), "welcomeRewardLock"), j8, bVar, 48, 0);
                        bVar.X(false);
                    }
                    bVar.X(true);
                    z6 = z20;
                    z7 = z13;
                    j2 = j3;
                } else {
                    nonFtdRewardType2 = nonFtdRewardType;
                    bVar = bVarI;
                    bVar.G();
                    z6 = z3;
                    z7 = z4;
                    j2 = j;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    final NonFtdRewardType nonFtdRewardType3 = nonFtdRewardType2;
                    eVarZ.d = new Function2() { // from class: i3j0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            w3j0.d(z, z7, z6, j2, str, nonFtdRewardType3, gr50Var, function1, op8Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 384;
            i6 = i2 & 8;
            if (i6 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (bVarI.e(j)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) != 0) {
                if (bVarI.M(str)) {
                    i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i14 = 8192;
                }
                i3 |= i14;
            }
            if ((i & 196608) == 0) {
                if (bVarI.d(nonFtdRewardType.ordinal())) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i3 |= i13;
            }
            if ((1572864 & i) == 0) {
                if ((i & 2097152) == 0) {
                    zA5 = bVarI.M(gr50Var);
                } else {
                    zA5 = bVarI.A(gr50Var);
                }
                if (zA5) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((12582912 & i) == 0) {
                if (bVarI.A(function1)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((100663296 & i) != 0) {
                if (bVarI.A(op8Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            if ((i3 & 38347923) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bVarI.q(i3 & 1, z5)) {
                if (i15 != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z3;
                }
                if (i6 != 0) {
                    j3 = 0;
                } else {
                    j3 = j;
                }
                i8 = i3 & 458752;
                if (i8 == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objY = bVarI.y();
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (z10) {
                    objY = ee0.a(1.0f);
                    bVarI.r(objY);
                } else {
                    objY = ee0.a(1.0f);
                    bVarI.r(objY);
                }
                wd0Var = (wd0) objY;
                if (i8 == 131072) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objY2 = bVarI.y();
                if (z11) {
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    objY2 = ee0.a(f2);
                    bVarI.r(objY2);
                } else {
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    objY2 = ee0.a(f2);
                    bVarI.r(objY2);
                }
                wd0Var2 = (wd0) objY2;
                if (z) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                z13 = z8;
                z14 = z9;
                objArr = new Object[]{Boolean.valueOf(z), Boolean.valueOf(z8), Boolean.valueOf(z9), Long.valueOf(j3)};
                boolean zA7 = bVarI.A(wd0Var) | bVarI.A(wd0Var2);
                if ((i3 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z210 = zA7 | z15;
                if ((i3 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z211 = z210 | z16;
                if ((i3 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z212 = z211 | z17;
                if ((i3 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z212 | z18;
                objY3 = bVarI.y();
                if (z19) {
                    wd0Var3 = wd0Var2;
                    wd0Var4 = wd0Var;
                    objArr2 = objArr;
                    i9 = i3;
                    c0042a2 = c0042a;
                    x3j0 x3j0Var2 = new x3j0(wd0Var4, wd0Var3, z, z13, z14, j3, null);
                    z20 = z14;
                    bVarI.r(x3j0Var2);
                    objY3 = x3j0Var2;
                } else {
                    wd0Var3 = wd0Var2;
                    wd0Var4 = wd0Var;
                    objArr2 = objArr;
                    i9 = i3;
                    c0042a2 = c0042a;
                    x3j0 x3j0Var3 = new x3j0(wd0Var4, wd0Var3, z, z13, z14, j3, null);
                    z20 = z14;
                    bVarI.r(x3j0Var3);
                    objY3 = x3j0Var3;
                }
                xvf.h(objArr2, (Function2) objY3, bVarI);
                aVar2 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarG4 = j.g(aVar2, r36);
                zA = bVarI.A(wd0Var4);
                objY4 = bVarI.y();
                int i17 = 3;
                if (zA) {
                    c0042a3 = c0042a2;
                    if (objY4 == c0042a3) {
                    }
                    androidx.compose.ui.d dVarN3 = androidx.compose.ui.graphics.a.a(dVarG4, (Function1) objY4).n(androidx.compose.ui.draw.a.a(aVar2, new xvj(i17)));
                    qyd0Var = oib0.a;
                    long j9 = ((lib0) bVarI.O(qyd0Var)).b1;
                    qyd0 qyd0Var4 = ajb0.a;
                    androidx.compose.ui.d dVarA3 = ls7.a(androidx.compose.foundation.a.b(dVarN3, j9, j060.c(((zib0) bVarI.O(qyd0Var4)).d)), j060.c(((zib0) bVarI.O(qyd0Var4)).d));
                    if ((i9 & 29360128) == 8388608) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    boolean zB3 = z21 | bVarI.b(z12);
                    if (i8 == 131072) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    boolean z213 = zB3 | z22;
                    if ((i9 & 3670016) != 1048576) {
                        z23 = true;
                    } else {
                        z23 = true;
                    }
                    z24 = z213 | z23;
                    objY5 = bVarI.y();
                    if (z24) {
                        nonFtdRewardType2 = nonFtdRewardType;
                        objY5 = new Function0() { // from class: h3j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    } else {
                        nonFtdRewardType2 = nonFtdRewardType;
                        objY5 = new Function0() { // from class: h3j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    androidx.compose.ui.d dVarH3 = g3w.h(androidx.compose.foundation.d.d(dVarA3, false, null, null, (Function0) objY5, 15), "welcomeReward");
                    aiv aivVarC3 = g75.c(ht.a.a, false);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS3 = bVarI.S();
                    androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarH3);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC3, yka.a.f);
                    hlh0.a(bVarI, ne00VarS3, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC3, yka.a.d);
                    androidx.compose.ui.d dVarG5 = j.g(aVar2, 1.0f);
                    bVarI.N(-1003410150);
                    bVarI.N(212064437);
                    bVarI.X(false);
                    mmdVar = (mmd) bVarI.O(kna.h);
                    objY6 = bVarI.y();
                    if (objY6 == c0042a3) {
                        objY6 = rzj.a(mmdVar, bVarI);
                    }
                    nivVar = (niv) objY6;
                    objY7 = bVarI.y();
                    if (objY7 == c0042a3) {
                        objY7 = pzj.a(bVarI);
                    }
                    nwaVar = (nwa) objY7;
                    objY8 = bVarI.y();
                    if (objY8 == c0042a3) {
                        objY8 = m.b(Boolean.FALSE);
                        bVarI.r(objY8);
                    }
                    ytwVar = (ytw) objY8;
                    objY9 = bVarI.y();
                    if (objY9 == c0042a3) {
                        objY9 = qzj.a(nwaVar, bVarI);
                    }
                    twaVar = (twa) objY9;
                    objY10 = bVarI.y();
                    if (objY10 == c0042a3) {
                        objY10 = m.a(Unit.a, epx.a);
                        bVarI.r(objY10);
                    }
                    ytwVar2 = (ytw) objY10;
                    zD = bVarI.d(257) | bVarI.A(nivVar);
                    objY11 = bVarI.y();
                    if (zD) {
                        objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                        bVarI.r(objY11);
                    } else {
                        objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                        bVarI.r(objY11);
                    }
                    aiv aivVar3 = (aiv) objY11;
                    objY12 = bVarI.y();
                    if (objY12 == c0042a3) {
                        objY12 = new b4j0(ytwVar, twaVar);
                        bVarI.r(objY12);
                    }
                    Function0 function3 = (Function0) objY12;
                    zA2 = bVarI.A(nivVar);
                    objY13 = bVarI.y();
                    if (zA2) {
                        objY13 = new c4j0(nivVar);
                        bVarI.r(objY13);
                    } else {
                        objY13 = new c4j0(nivVar);
                        bVarI.r(objY13);
                    }
                    lsr.a(xa80.b(dVarG5, false, (Function1) objY13), pp8.b(1200550679, new d4j0(ytwVar2, nwaVar, function3, str, op8Var), bVarI), aivVar3, bVarI, 48);
                    bVarI.X(false);
                    if (z) {
                        bVarI.N(-234944392);
                        androidx.compose.foundation.layout.d dVar4 = androidx.compose.foundation.layout.d.a;
                        androidx.compose.ui.d dVarF4 = dVar4.f(aVar2);
                        zA3 = bVarI.A(wd0Var3);
                        objY14 = bVarI.y();
                        if (zA3) {
                            objY14 = new lq6(wd0Var3, 2);
                            bVarI.r(objY14);
                        } else {
                            objY14 = new lq6(wd0Var3, 2);
                            bVarI.r(objY14);
                        }
                        g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF4, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                        crz crzVarA4 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                        long j10 = ((lib0) bVarI.O(qyd0Var)).a0;
                        androidx.compose.ui.d dVarR4 = j.r(dVar4.b(aVar2, ht.a.e), 16.0f);
                        zA4 = bVarI.A(wd0Var3);
                        objY15 = bVarI.y();
                        if (zA4) {
                            objY15 = new fta(wd0Var3, 3);
                            bVarI.r(objY15);
                        } else {
                            objY15 = new fta(wd0Var3, 3);
                            bVarI.r(objY15);
                        }
                        bVar = bVarI;
                        h6n.b(crzVarA4, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR4, (Function1) objY15), "welcomeRewardLock"), j10, bVar, 48, 0);
                        bVar.X(false);
                    } else {
                        bVarI.N(-234944392);
                        androidx.compose.foundation.layout.d dVar5 = androidx.compose.foundation.layout.d.a;
                        androidx.compose.ui.d dVarF5 = dVar5.f(aVar2);
                        zA3 = bVarI.A(wd0Var3);
                        objY14 = bVarI.y();
                        if (zA3) {
                            objY14 = new lq6(wd0Var3, 2);
                            bVarI.r(objY14);
                        } else {
                            objY14 = new lq6(wd0Var3, 2);
                            bVarI.r(objY14);
                        }
                        g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF5, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                        crz crzVarA5 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                        long j11 = ((lib0) bVarI.O(qyd0Var)).a0;
                        androidx.compose.ui.d dVarR5 = j.r(dVar5.b(aVar2, ht.a.e), 16.0f);
                        zA4 = bVarI.A(wd0Var3);
                        objY15 = bVarI.y();
                        if (zA4) {
                            objY15 = new fta(wd0Var3, 3);
                            bVarI.r(objY15);
                        } else {
                            objY15 = new fta(wd0Var3, 3);
                            bVarI.r(objY15);
                        }
                        bVar = bVarI;
                        h6n.b(crzVarA5, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR5, (Function1) objY15), "welcomeRewardLock"), j11, bVar, 48, 0);
                        bVar.X(false);
                    }
                    bVar.X(true);
                    z6 = z20;
                    z7 = z13;
                    j2 = j3;
                } else {
                    c0042a3 = c0042a2;
                }
                objY4 = new xp6(wd0Var4, i17);
                bVarI.r(objY4);
                androidx.compose.ui.d dVarN4 = androidx.compose.ui.graphics.a.a(dVarG4, (Function1) objY4).n(androidx.compose.ui.draw.a.a(aVar2, new xvj(i17)));
                qyd0Var = oib0.a;
                long j12 = ((lib0) bVarI.O(qyd0Var)).b1;
                qyd0 qyd0Var5 = ajb0.a;
                androidx.compose.ui.d dVarA4 = ls7.a(androidx.compose.foundation.a.b(dVarN4, j12, j060.c(((zib0) bVarI.O(qyd0Var5)).d)), j060.c(((zib0) bVarI.O(qyd0Var5)).d));
                if ((i9 & 29360128) == 8388608) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean zB4 = z21 | bVarI.b(z12);
                if (i8 == 131072) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z214 = zB4 | z22;
                if ((i9 & 3670016) != 1048576) {
                    z23 = true;
                } else {
                    z23 = true;
                }
                z24 = z214 | z23;
                objY5 = bVarI.y();
                if (z24) {
                    nonFtdRewardType2 = nonFtdRewardType;
                    objY5 = new Function0() { // from class: h3j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                } else {
                    nonFtdRewardType2 = nonFtdRewardType;
                    objY5 = new Function0() { // from class: h3j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                androidx.compose.ui.d dVarH4 = g3w.h(androidx.compose.foundation.d.d(dVarA4, false, null, null, (Function0) objY5, 15), "welcomeReward");
                aiv aivVarC4 = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarH4);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC4, yka.a.f);
                hlh0.a(bVarI, ne00VarS4, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC4, yka.a.d);
                androidx.compose.ui.d dVarG6 = j.g(aVar2, 1.0f);
                bVarI.N(-1003410150);
                bVarI.N(212064437);
                bVarI.X(false);
                mmdVar = (mmd) bVarI.O(kna.h);
                objY6 = bVarI.y();
                if (objY6 == c0042a3) {
                    objY6 = rzj.a(mmdVar, bVarI);
                }
                nivVar = (niv) objY6;
                objY7 = bVarI.y();
                if (objY7 == c0042a3) {
                    objY7 = pzj.a(bVarI);
                }
                nwaVar = (nwa) objY7;
                objY8 = bVarI.y();
                if (objY8 == c0042a3) {
                    objY8 = m.b(Boolean.FALSE);
                    bVarI.r(objY8);
                }
                ytwVar = (ytw) objY8;
                objY9 = bVarI.y();
                if (objY9 == c0042a3) {
                    objY9 = qzj.a(nwaVar, bVarI);
                }
                twaVar = (twa) objY9;
                objY10 = bVarI.y();
                if (objY10 == c0042a3) {
                    objY10 = m.a(Unit.a, epx.a);
                    bVarI.r(objY10);
                }
                ytwVar2 = (ytw) objY10;
                zD = bVarI.d(257) | bVarI.A(nivVar);
                objY11 = bVarI.y();
                if (zD) {
                    objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                    bVarI.r(objY11);
                } else {
                    objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                    bVarI.r(objY11);
                }
                aiv aivVar4 = (aiv) objY11;
                objY12 = bVarI.y();
                if (objY12 == c0042a3) {
                    objY12 = new b4j0(ytwVar, twaVar);
                    bVarI.r(objY12);
                }
                Function0 function4 = (Function0) objY12;
                zA2 = bVarI.A(nivVar);
                objY13 = bVarI.y();
                if (zA2) {
                    objY13 = new c4j0(nivVar);
                    bVarI.r(objY13);
                } else {
                    objY13 = new c4j0(nivVar);
                    bVarI.r(objY13);
                }
                lsr.a(xa80.b(dVarG6, false, (Function1) objY13), pp8.b(1200550679, new d4j0(ytwVar2, nwaVar, function4, str, op8Var), bVarI), aivVar4, bVarI, 48);
                bVarI.X(false);
                if (z) {
                    bVarI.N(-234944392);
                    androidx.compose.foundation.layout.d dVar6 = androidx.compose.foundation.layout.d.a;
                    androidx.compose.ui.d dVarF6 = dVar6.f(aVar2);
                    zA3 = bVarI.A(wd0Var3);
                    objY14 = bVarI.y();
                    if (zA3) {
                        objY14 = new lq6(wd0Var3, 2);
                        bVarI.r(objY14);
                    } else {
                        objY14 = new lq6(wd0Var3, 2);
                        bVarI.r(objY14);
                    }
                    g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF6, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                    crz crzVarA6 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                    long j13 = ((lib0) bVarI.O(qyd0Var)).a0;
                    androidx.compose.ui.d dVarR6 = j.r(dVar6.b(aVar2, ht.a.e), 16.0f);
                    zA4 = bVarI.A(wd0Var3);
                    objY15 = bVarI.y();
                    if (zA4) {
                        objY15 = new fta(wd0Var3, 3);
                        bVarI.r(objY15);
                    } else {
                        objY15 = new fta(wd0Var3, 3);
                        bVarI.r(objY15);
                    }
                    bVar = bVarI;
                    h6n.b(crzVarA6, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR6, (Function1) objY15), "welcomeRewardLock"), j13, bVar, 48, 0);
                    bVar.X(false);
                } else {
                    bVarI.N(-234944392);
                    androidx.compose.foundation.layout.d dVar7 = androidx.compose.foundation.layout.d.a;
                    androidx.compose.ui.d dVarF7 = dVar7.f(aVar2);
                    zA3 = bVarI.A(wd0Var3);
                    objY14 = bVarI.y();
                    if (zA3) {
                        objY14 = new lq6(wd0Var3, 2);
                        bVarI.r(objY14);
                    } else {
                        objY14 = new lq6(wd0Var3, 2);
                        bVarI.r(objY14);
                    }
                    g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF7, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                    crz crzVarA7 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                    long j14 = ((lib0) bVarI.O(qyd0Var)).a0;
                    androidx.compose.ui.d dVarR7 = j.r(dVar7.b(aVar2, ht.a.e), 16.0f);
                    zA4 = bVarI.A(wd0Var3);
                    objY15 = bVarI.y();
                    if (zA4) {
                        objY15 = new fta(wd0Var3, 3);
                        bVarI.r(objY15);
                    } else {
                        objY15 = new fta(wd0Var3, 3);
                        bVarI.r(objY15);
                    }
                    bVar = bVarI;
                    h6n.b(crzVarA7, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR7, (Function1) objY15), "welcomeRewardLock"), j14, bVar, 48, 0);
                    bVar.X(false);
                }
                bVar.X(true);
                z6 = z20;
                z7 = z13;
                j2 = j3;
            } else {
                nonFtdRewardType2 = nonFtdRewardType;
                bVar = bVarI;
                bVar.G();
                z6 = z3;
                z7 = z4;
                j2 = j;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                final NonFtdRewardType nonFtdRewardType4 = nonFtdRewardType2;
                eVarZ.d = new Function2() { // from class: i3j0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        w3j0.d(z, z7, z6, j2, str, nonFtdRewardType4, gr50Var, function1, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        z4 = z2;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                if (bVarI.b(z3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (bVarI.e(j)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) != 0) {
                if (bVarI.M(str)) {
                    i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i14 = 8192;
                }
                i3 |= i14;
            }
            if ((i & 196608) == 0) {
                if (bVarI.d(nonFtdRewardType.ordinal())) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i3 |= i13;
            }
            if ((1572864 & i) == 0) {
                if ((i & 2097152) == 0) {
                    zA5 = bVarI.M(gr50Var);
                } else {
                    zA5 = bVarI.A(gr50Var);
                }
                if (zA5) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((12582912 & i) == 0) {
                if (bVarI.A(function1)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
            if ((100663296 & i) != 0) {
                if (bVarI.A(op8Var)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            if ((i3 & 38347923) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bVarI.q(i3 & 1, z5)) {
                if (i15 != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z3;
                }
                if (i6 != 0) {
                    j3 = 0;
                } else {
                    j3 = j;
                }
                i8 = i3 & 458752;
                if (i8 == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objY = bVarI.y();
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (z10) {
                    objY = ee0.a(1.0f);
                    bVarI.r(objY);
                } else {
                    objY = ee0.a(1.0f);
                    bVarI.r(objY);
                }
                wd0Var = (wd0) objY;
                if (i8 == 131072) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objY2 = bVarI.y();
                if (z11) {
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    objY2 = ee0.a(f2);
                    bVarI.r(objY2);
                } else {
                    if (z) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    objY2 = ee0.a(f2);
                    bVarI.r(objY2);
                }
                wd0Var2 = (wd0) objY2;
                if (z) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                z13 = z8;
                z14 = z9;
                objArr = new Object[]{Boolean.valueOf(z), Boolean.valueOf(z8), Boolean.valueOf(z9), Long.valueOf(j3)};
                boolean zA8 = bVarI.A(wd0Var) | bVarI.A(wd0Var2);
                if ((i3 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z215 = zA8 | z15;
                if ((i3 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z216 = z215 | z16;
                if ((i3 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z217 = z216 | z17;
                if ((i3 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z217 | z18;
                objY3 = bVarI.y();
                if (z19) {
                    wd0Var3 = wd0Var2;
                    wd0Var4 = wd0Var;
                    objArr2 = objArr;
                    i9 = i3;
                    c0042a2 = c0042a;
                    x3j0 x3j0Var4 = new x3j0(wd0Var4, wd0Var3, z, z13, z14, j3, null);
                    z20 = z14;
                    bVarI.r(x3j0Var4);
                    objY3 = x3j0Var4;
                } else {
                    wd0Var3 = wd0Var2;
                    wd0Var4 = wd0Var;
                    objArr2 = objArr;
                    i9 = i3;
                    c0042a2 = c0042a;
                    x3j0 x3j0Var5 = new x3j0(wd0Var4, wd0Var3, z, z13, z14, j3, null);
                    z20 = z14;
                    bVarI.r(x3j0Var5);
                    objY3 = x3j0Var5;
                }
                xvf.h(objArr2, (Function2) objY3, bVarI);
                aVar2 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarG7 = j.g(aVar2, r36);
                zA = bVarI.A(wd0Var4);
                objY4 = bVarI.y();
                int i18 = 3;
                if (zA) {
                    c0042a3 = c0042a2;
                    if (objY4 == c0042a3) {
                    }
                    androidx.compose.ui.d dVarN5 = androidx.compose.ui.graphics.a.a(dVarG7, (Function1) objY4).n(androidx.compose.ui.draw.a.a(aVar2, new xvj(i18)));
                    qyd0Var = oib0.a;
                    long j15 = ((lib0) bVarI.O(qyd0Var)).b1;
                    qyd0 qyd0Var6 = ajb0.a;
                    androidx.compose.ui.d dVarA5 = ls7.a(androidx.compose.foundation.a.b(dVarN5, j15, j060.c(((zib0) bVarI.O(qyd0Var6)).d)), j060.c(((zib0) bVarI.O(qyd0Var6)).d));
                    if ((i9 & 29360128) == 8388608) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    boolean zB5 = z21 | bVarI.b(z12);
                    if (i8 == 131072) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    boolean z218 = zB5 | z22;
                    if ((i9 & 3670016) != 1048576) {
                        z23 = true;
                    } else {
                        z23 = true;
                    }
                    z24 = z218 | z23;
                    objY5 = bVarI.y();
                    if (z24) {
                        nonFtdRewardType2 = nonFtdRewardType;
                        objY5 = new Function0() { // from class: h3j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    } else {
                        nonFtdRewardType2 = nonFtdRewardType;
                        objY5 = new Function0() { // from class: h3j0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY5);
                    }
                    androidx.compose.ui.d dVarH5 = g3w.h(androidx.compose.foundation.d.d(dVarA5, false, null, null, (Function0) objY5, 15), "welcomeReward");
                    aiv aivVarC5 = g75.c(ht.a.a, false);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS5 = bVarI.S();
                    androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarH5);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC5, yka.a.f);
                    hlh0.a(bVarI, ne00VarS5, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC5, yka.a.d);
                    androidx.compose.ui.d dVarG8 = j.g(aVar2, 1.0f);
                    bVarI.N(-1003410150);
                    bVarI.N(212064437);
                    bVarI.X(false);
                    mmdVar = (mmd) bVarI.O(kna.h);
                    objY6 = bVarI.y();
                    if (objY6 == c0042a3) {
                        objY6 = rzj.a(mmdVar, bVarI);
                    }
                    nivVar = (niv) objY6;
                    objY7 = bVarI.y();
                    if (objY7 == c0042a3) {
                        objY7 = pzj.a(bVarI);
                    }
                    nwaVar = (nwa) objY7;
                    objY8 = bVarI.y();
                    if (objY8 == c0042a3) {
                        objY8 = m.b(Boolean.FALSE);
                        bVarI.r(objY8);
                    }
                    ytwVar = (ytw) objY8;
                    objY9 = bVarI.y();
                    if (objY9 == c0042a3) {
                        objY9 = qzj.a(nwaVar, bVarI);
                    }
                    twaVar = (twa) objY9;
                    objY10 = bVarI.y();
                    if (objY10 == c0042a3) {
                        objY10 = m.a(Unit.a, epx.a);
                        bVarI.r(objY10);
                    }
                    ytwVar2 = (ytw) objY10;
                    zD = bVarI.d(257) | bVarI.A(nivVar);
                    objY11 = bVarI.y();
                    if (zD) {
                        objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                        bVarI.r(objY11);
                    } else {
                        objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                        bVarI.r(objY11);
                    }
                    aiv aivVar5 = (aiv) objY11;
                    objY12 = bVarI.y();
                    if (objY12 == c0042a3) {
                        objY12 = new b4j0(ytwVar, twaVar);
                        bVarI.r(objY12);
                    }
                    Function0 function5 = (Function0) objY12;
                    zA2 = bVarI.A(nivVar);
                    objY13 = bVarI.y();
                    if (zA2) {
                        objY13 = new c4j0(nivVar);
                        bVarI.r(objY13);
                    } else {
                        objY13 = new c4j0(nivVar);
                        bVarI.r(objY13);
                    }
                    lsr.a(xa80.b(dVarG8, false, (Function1) objY13), pp8.b(1200550679, new d4j0(ytwVar2, nwaVar, function5, str, op8Var), bVarI), aivVar5, bVarI, 48);
                    bVarI.X(false);
                    if (z) {
                        bVarI.N(-234944392);
                        androidx.compose.foundation.layout.d dVar8 = androidx.compose.foundation.layout.d.a;
                        androidx.compose.ui.d dVarF8 = dVar8.f(aVar2);
                        zA3 = bVarI.A(wd0Var3);
                        objY14 = bVarI.y();
                        if (zA3) {
                            objY14 = new lq6(wd0Var3, 2);
                            bVarI.r(objY14);
                        } else {
                            objY14 = new lq6(wd0Var3, 2);
                            bVarI.r(objY14);
                        }
                        g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF8, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                        crz crzVarA8 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                        long j16 = ((lib0) bVarI.O(qyd0Var)).a0;
                        androidx.compose.ui.d dVarR8 = j.r(dVar8.b(aVar2, ht.a.e), 16.0f);
                        zA4 = bVarI.A(wd0Var3);
                        objY15 = bVarI.y();
                        if (zA4) {
                            objY15 = new fta(wd0Var3, 3);
                            bVarI.r(objY15);
                        } else {
                            objY15 = new fta(wd0Var3, 3);
                            bVarI.r(objY15);
                        }
                        bVar = bVarI;
                        h6n.b(crzVarA8, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR8, (Function1) objY15), "welcomeRewardLock"), j16, bVar, 48, 0);
                        bVar.X(false);
                    } else {
                        bVarI.N(-234944392);
                        androidx.compose.foundation.layout.d dVar9 = androidx.compose.foundation.layout.d.a;
                        androidx.compose.ui.d dVarF9 = dVar9.f(aVar2);
                        zA3 = bVarI.A(wd0Var3);
                        objY14 = bVarI.y();
                        if (zA3) {
                            objY14 = new lq6(wd0Var3, 2);
                            bVarI.r(objY14);
                        } else {
                            objY14 = new lq6(wd0Var3, 2);
                            bVarI.r(objY14);
                        }
                        g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF9, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                        crz crzVarA9 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                        long j17 = ((lib0) bVarI.O(qyd0Var)).a0;
                        androidx.compose.ui.d dVarR9 = j.r(dVar9.b(aVar2, ht.a.e), 16.0f);
                        zA4 = bVarI.A(wd0Var3);
                        objY15 = bVarI.y();
                        if (zA4) {
                            objY15 = new fta(wd0Var3, 3);
                            bVarI.r(objY15);
                        } else {
                            objY15 = new fta(wd0Var3, 3);
                            bVarI.r(objY15);
                        }
                        bVar = bVarI;
                        h6n.b(crzVarA9, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR9, (Function1) objY15), "welcomeRewardLock"), j17, bVar, 48, 0);
                        bVar.X(false);
                    }
                    bVar.X(true);
                    z6 = z20;
                    z7 = z13;
                    j2 = j3;
                } else {
                    c0042a3 = c0042a2;
                }
                objY4 = new xp6(wd0Var4, i18);
                bVarI.r(objY4);
                androidx.compose.ui.d dVarN6 = androidx.compose.ui.graphics.a.a(dVarG7, (Function1) objY4).n(androidx.compose.ui.draw.a.a(aVar2, new xvj(i18)));
                qyd0Var = oib0.a;
                long j18 = ((lib0) bVarI.O(qyd0Var)).b1;
                qyd0 qyd0Var7 = ajb0.a;
                androidx.compose.ui.d dVarA6 = ls7.a(androidx.compose.foundation.a.b(dVarN6, j18, j060.c(((zib0) bVarI.O(qyd0Var7)).d)), j060.c(((zib0) bVarI.O(qyd0Var7)).d));
                if ((i9 & 29360128) == 8388608) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean zB6 = z21 | bVarI.b(z12);
                if (i8 == 131072) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z219 = zB6 | z22;
                if ((i9 & 3670016) != 1048576) {
                    z23 = true;
                } else {
                    z23 = true;
                }
                z24 = z219 | z23;
                objY5 = bVarI.y();
                if (z24) {
                    nonFtdRewardType2 = nonFtdRewardType;
                    objY5 = new Function0() { // from class: h3j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                } else {
                    nonFtdRewardType2 = nonFtdRewardType;
                    objY5 = new Function0() { // from class: h3j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                androidx.compose.ui.d dVarH6 = g3w.h(androidx.compose.foundation.d.d(dVarA6, false, null, null, (Function0) objY5, 15), "welcomeReward");
                aiv aivVarC6 = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS6 = bVarI.S();
                androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(bVarI, dVarH6);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC6, yka.a.f);
                hlh0.a(bVarI, ne00VarS6, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC6, yka.a.d);
                androidx.compose.ui.d dVarG9 = j.g(aVar2, 1.0f);
                bVarI.N(-1003410150);
                bVarI.N(212064437);
                bVarI.X(false);
                mmdVar = (mmd) bVarI.O(kna.h);
                objY6 = bVarI.y();
                if (objY6 == c0042a3) {
                    objY6 = rzj.a(mmdVar, bVarI);
                }
                nivVar = (niv) objY6;
                objY7 = bVarI.y();
                if (objY7 == c0042a3) {
                    objY7 = pzj.a(bVarI);
                }
                nwaVar = (nwa) objY7;
                objY8 = bVarI.y();
                if (objY8 == c0042a3) {
                    objY8 = m.b(Boolean.FALSE);
                    bVarI.r(objY8);
                }
                ytwVar = (ytw) objY8;
                objY9 = bVarI.y();
                if (objY9 == c0042a3) {
                    objY9 = qzj.a(nwaVar, bVarI);
                }
                twaVar = (twa) objY9;
                objY10 = bVarI.y();
                if (objY10 == c0042a3) {
                    objY10 = m.a(Unit.a, epx.a);
                    bVarI.r(objY10);
                }
                ytwVar2 = (ytw) objY10;
                zD = bVarI.d(257) | bVarI.A(nivVar);
                objY11 = bVarI.y();
                if (zD) {
                    objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                    bVarI.r(objY11);
                } else {
                    objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                    bVarI.r(objY11);
                }
                aiv aivVar6 = (aiv) objY11;
                objY12 = bVarI.y();
                if (objY12 == c0042a3) {
                    objY12 = new b4j0(ytwVar, twaVar);
                    bVarI.r(objY12);
                }
                Function0 function6 = (Function0) objY12;
                zA2 = bVarI.A(nivVar);
                objY13 = bVarI.y();
                if (zA2) {
                    objY13 = new c4j0(nivVar);
                    bVarI.r(objY13);
                } else {
                    objY13 = new c4j0(nivVar);
                    bVarI.r(objY13);
                }
                lsr.a(xa80.b(dVarG9, false, (Function1) objY13), pp8.b(1200550679, new d4j0(ytwVar2, nwaVar, function6, str, op8Var), bVarI), aivVar6, bVarI, 48);
                bVarI.X(false);
                if (z) {
                    bVarI.N(-234944392);
                    androidx.compose.foundation.layout.d dVar10 = androidx.compose.foundation.layout.d.a;
                    androidx.compose.ui.d dVarF10 = dVar10.f(aVar2);
                    zA3 = bVarI.A(wd0Var3);
                    objY14 = bVarI.y();
                    if (zA3) {
                        objY14 = new lq6(wd0Var3, 2);
                        bVarI.r(objY14);
                    } else {
                        objY14 = new lq6(wd0Var3, 2);
                        bVarI.r(objY14);
                    }
                    g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF10, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                    crz crzVarA10 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                    long j19 = ((lib0) bVarI.O(qyd0Var)).a0;
                    androidx.compose.ui.d dVarR10 = j.r(dVar10.b(aVar2, ht.a.e), 16.0f);
                    zA4 = bVarI.A(wd0Var3);
                    objY15 = bVarI.y();
                    if (zA4) {
                        objY15 = new fta(wd0Var3, 3);
                        bVarI.r(objY15);
                    } else {
                        objY15 = new fta(wd0Var3, 3);
                        bVarI.r(objY15);
                    }
                    bVar = bVarI;
                    h6n.b(crzVarA10, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR10, (Function1) objY15), "welcomeRewardLock"), j19, bVar, 48, 0);
                    bVar.X(false);
                } else {
                    bVarI.N(-234944392);
                    androidx.compose.foundation.layout.d dVar11 = androidx.compose.foundation.layout.d.a;
                    androidx.compose.ui.d dVarF11 = dVar11.f(aVar2);
                    zA3 = bVarI.A(wd0Var3);
                    objY14 = bVarI.y();
                    if (zA3) {
                        objY14 = new lq6(wd0Var3, 2);
                        bVarI.r(objY14);
                    } else {
                        objY14 = new lq6(wd0Var3, 2);
                        bVarI.r(objY14);
                    }
                    g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF11, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                    crz crzVarA11 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                    long j110 = ((lib0) bVarI.O(qyd0Var)).a0;
                    androidx.compose.ui.d dVarR11 = j.r(dVar11.b(aVar2, ht.a.e), 16.0f);
                    zA4 = bVarI.A(wd0Var3);
                    objY15 = bVarI.y();
                    if (zA4) {
                        objY15 = new fta(wd0Var3, 3);
                        bVarI.r(objY15);
                    } else {
                        objY15 = new fta(wd0Var3, 3);
                        bVarI.r(objY15);
                    }
                    bVar = bVarI;
                    h6n.b(crzVarA11, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR11, (Function1) objY15), "welcomeRewardLock"), j110, bVar, 48, 0);
                    bVar.X(false);
                }
                bVar.X(true);
                z6 = z20;
                z7 = z13;
                j2 = j3;
            } else {
                nonFtdRewardType2 = nonFtdRewardType;
                bVar = bVarI;
                bVar.G();
                z6 = z3;
                z7 = z4;
                j2 = j;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                final NonFtdRewardType nonFtdRewardType5 = nonFtdRewardType2;
                eVarZ.d = new Function2() { // from class: i3j0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        w3j0.d(z, z7, z6, j2, str, nonFtdRewardType5, gr50Var, function1, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (bVarI.e(j)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i & 24576) != 0) {
            if (bVarI.M(str)) {
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i14 = 8192;
            }
            i3 |= i14;
        }
        if ((i & 196608) == 0) {
            if (bVarI.d(nonFtdRewardType.ordinal())) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i3 |= i13;
        }
        if ((1572864 & i) == 0) {
            if ((i & 2097152) == 0) {
                zA5 = bVarI.M(gr50Var);
            } else {
                zA5 = bVarI.A(gr50Var);
            }
            if (zA5) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i3 |= i12;
        }
        if ((12582912 & i) == 0) {
            if (bVarI.A(function1)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((100663296 & i) != 0) {
            if (bVarI.A(op8Var)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i3 |= i10;
        }
        if ((i3 & 38347923) != 38347922) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (bVarI.q(i3 & 1, z5)) {
            if (i15 != 0) {
                z8 = false;
            } else {
                z8 = z4;
            }
            if (i4 != 0) {
                z9 = false;
            } else {
                z9 = z3;
            }
            if (i6 != 0) {
                j3 = 0;
            } else {
                j3 = j;
            }
            i8 = i3 & 458752;
            if (i8 == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            objY = bVarI.y();
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z10) {
                objY = ee0.a(1.0f);
                bVarI.r(objY);
            } else {
                objY = ee0.a(1.0f);
                bVarI.r(objY);
            }
            wd0Var = (wd0) objY;
            if (i8 == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            objY2 = bVarI.y();
            if (z11) {
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 1.0f;
                }
                objY2 = ee0.a(f2);
                bVarI.r(objY2);
            } else {
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 1.0f;
                }
                objY2 = ee0.a(f2);
                bVarI.r(objY2);
            }
            wd0Var2 = (wd0) objY2;
            if (z) {
                z12 = false;
            } else {
                z12 = false;
            }
            z13 = z8;
            z14 = z9;
            objArr = new Object[]{Boolean.valueOf(z), Boolean.valueOf(z8), Boolean.valueOf(z9), Long.valueOf(j3)};
            boolean zA9 = bVarI.A(wd0Var) | bVarI.A(wd0Var2);
            if ((i3 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z2110 = zA9 | z15;
            if ((i3 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z2111 = z2110 | z16;
            if ((i3 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z2112 = z2111 | z17;
            if ((i3 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z2112 | z18;
            objY3 = bVarI.y();
            if (z19) {
                wd0Var3 = wd0Var2;
                wd0Var4 = wd0Var;
                objArr2 = objArr;
                i9 = i3;
                c0042a2 = c0042a;
                x3j0 x3j0Var6 = new x3j0(wd0Var4, wd0Var3, z, z13, z14, j3, null);
                z20 = z14;
                bVarI.r(x3j0Var6);
                objY3 = x3j0Var6;
            } else {
                wd0Var3 = wd0Var2;
                wd0Var4 = wd0Var;
                objArr2 = objArr;
                i9 = i3;
                c0042a2 = c0042a;
                x3j0 x3j0Var7 = new x3j0(wd0Var4, wd0Var3, z, z13, z14, j3, null);
                z20 = z14;
                bVarI.r(x3j0Var7);
                objY3 = x3j0Var7;
            }
            xvf.h(objArr2, (Function2) objY3, bVarI);
            aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG10 = j.g(aVar2, r36);
            zA = bVarI.A(wd0Var4);
            objY4 = bVarI.y();
            int i19 = 3;
            if (zA) {
                c0042a3 = c0042a2;
                if (objY4 == c0042a3) {
                }
                androidx.compose.ui.d dVarN7 = androidx.compose.ui.graphics.a.a(dVarG10, (Function1) objY4).n(androidx.compose.ui.draw.a.a(aVar2, new xvj(i19)));
                qyd0Var = oib0.a;
                long j111 = ((lib0) bVarI.O(qyd0Var)).b1;
                qyd0 qyd0Var8 = ajb0.a;
                androidx.compose.ui.d dVarA7 = ls7.a(androidx.compose.foundation.a.b(dVarN7, j111, j060.c(((zib0) bVarI.O(qyd0Var8)).d)), j060.c(((zib0) bVarI.O(qyd0Var8)).d));
                if ((i9 & 29360128) == 8388608) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean zB7 = z21 | bVarI.b(z12);
                if (i8 == 131072) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z2113 = zB7 | z22;
                if ((i9 & 3670016) != 1048576) {
                    z23 = true;
                } else {
                    z23 = true;
                }
                z24 = z2113 | z23;
                objY5 = bVarI.y();
                if (z24) {
                    nonFtdRewardType2 = nonFtdRewardType;
                    objY5 = new Function0() { // from class: h3j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                } else {
                    nonFtdRewardType2 = nonFtdRewardType;
                    objY5 = new Function0() { // from class: h3j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                androidx.compose.ui.d dVarH7 = g3w.h(androidx.compose.foundation.d.d(dVarA7, false, null, null, (Function0) objY5, 15), "welcomeReward");
                aiv aivVarC7 = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS7 = bVarI.S();
                androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(bVarI, dVarH7);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC7, yka.a.f);
                hlh0.a(bVarI, ne00VarS7, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC7, yka.a.d);
                androidx.compose.ui.d dVarG11 = j.g(aVar2, 1.0f);
                bVarI.N(-1003410150);
                bVarI.N(212064437);
                bVarI.X(false);
                mmdVar = (mmd) bVarI.O(kna.h);
                objY6 = bVarI.y();
                if (objY6 == c0042a3) {
                    objY6 = rzj.a(mmdVar, bVarI);
                }
                nivVar = (niv) objY6;
                objY7 = bVarI.y();
                if (objY7 == c0042a3) {
                    objY7 = pzj.a(bVarI);
                }
                nwaVar = (nwa) objY7;
                objY8 = bVarI.y();
                if (objY8 == c0042a3) {
                    objY8 = m.b(Boolean.FALSE);
                    bVarI.r(objY8);
                }
                ytwVar = (ytw) objY8;
                objY9 = bVarI.y();
                if (objY9 == c0042a3) {
                    objY9 = qzj.a(nwaVar, bVarI);
                }
                twaVar = (twa) objY9;
                objY10 = bVarI.y();
                if (objY10 == c0042a3) {
                    objY10 = m.a(Unit.a, epx.a);
                    bVarI.r(objY10);
                }
                ytwVar2 = (ytw) objY10;
                zD = bVarI.d(257) | bVarI.A(nivVar);
                objY11 = bVarI.y();
                if (zD) {
                    objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                    bVarI.r(objY11);
                } else {
                    objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                    bVarI.r(objY11);
                }
                aiv aivVar7 = (aiv) objY11;
                objY12 = bVarI.y();
                if (objY12 == c0042a3) {
                    objY12 = new b4j0(ytwVar, twaVar);
                    bVarI.r(objY12);
                }
                Function0 function7 = (Function0) objY12;
                zA2 = bVarI.A(nivVar);
                objY13 = bVarI.y();
                if (zA2) {
                    objY13 = new c4j0(nivVar);
                    bVarI.r(objY13);
                } else {
                    objY13 = new c4j0(nivVar);
                    bVarI.r(objY13);
                }
                lsr.a(xa80.b(dVarG11, false, (Function1) objY13), pp8.b(1200550679, new d4j0(ytwVar2, nwaVar, function7, str, op8Var), bVarI), aivVar7, bVarI, 48);
                bVarI.X(false);
                if (z) {
                    bVarI.N(-234944392);
                    androidx.compose.foundation.layout.d dVar12 = androidx.compose.foundation.layout.d.a;
                    androidx.compose.ui.d dVarF12 = dVar12.f(aVar2);
                    zA3 = bVarI.A(wd0Var3);
                    objY14 = bVarI.y();
                    if (zA3) {
                        objY14 = new lq6(wd0Var3, 2);
                        bVarI.r(objY14);
                    } else {
                        objY14 = new lq6(wd0Var3, 2);
                        bVarI.r(objY14);
                    }
                    g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF12, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                    crz crzVarA12 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                    long j112 = ((lib0) bVarI.O(qyd0Var)).a0;
                    androidx.compose.ui.d dVarR12 = j.r(dVar12.b(aVar2, ht.a.e), 16.0f);
                    zA4 = bVarI.A(wd0Var3);
                    objY15 = bVarI.y();
                    if (zA4) {
                        objY15 = new fta(wd0Var3, 3);
                        bVarI.r(objY15);
                    } else {
                        objY15 = new fta(wd0Var3, 3);
                        bVarI.r(objY15);
                    }
                    bVar = bVarI;
                    h6n.b(crzVarA12, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR12, (Function1) objY15), "welcomeRewardLock"), j112, bVar, 48, 0);
                    bVar.X(false);
                } else {
                    bVarI.N(-234944392);
                    androidx.compose.foundation.layout.d dVar13 = androidx.compose.foundation.layout.d.a;
                    androidx.compose.ui.d dVarF13 = dVar13.f(aVar2);
                    zA3 = bVarI.A(wd0Var3);
                    objY14 = bVarI.y();
                    if (zA3) {
                        objY14 = new lq6(wd0Var3, 2);
                        bVarI.r(objY14);
                    } else {
                        objY14 = new lq6(wd0Var3, 2);
                        bVarI.r(objY14);
                    }
                    g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF13, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                    crz crzVarA13 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                    long j113 = ((lib0) bVarI.O(qyd0Var)).a0;
                    androidx.compose.ui.d dVarR13 = j.r(dVar13.b(aVar2, ht.a.e), 16.0f);
                    zA4 = bVarI.A(wd0Var3);
                    objY15 = bVarI.y();
                    if (zA4) {
                        objY15 = new fta(wd0Var3, 3);
                        bVarI.r(objY15);
                    } else {
                        objY15 = new fta(wd0Var3, 3);
                        bVarI.r(objY15);
                    }
                    bVar = bVarI;
                    h6n.b(crzVarA13, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR13, (Function1) objY15), "welcomeRewardLock"), j113, bVar, 48, 0);
                    bVar.X(false);
                }
                bVar.X(true);
                z6 = z20;
                z7 = z13;
                j2 = j3;
            } else {
                c0042a3 = c0042a2;
            }
            objY4 = new xp6(wd0Var4, i19);
            bVarI.r(objY4);
            androidx.compose.ui.d dVarN8 = androidx.compose.ui.graphics.a.a(dVarG10, (Function1) objY4).n(androidx.compose.ui.draw.a.a(aVar2, new xvj(i19)));
            qyd0Var = oib0.a;
            long j114 = ((lib0) bVarI.O(qyd0Var)).b1;
            qyd0 qyd0Var9 = ajb0.a;
            androidx.compose.ui.d dVarA8 = ls7.a(androidx.compose.foundation.a.b(dVarN8, j114, j060.c(((zib0) bVarI.O(qyd0Var9)).d)), j060.c(((zib0) bVarI.O(qyd0Var9)).d));
            if ((i9 & 29360128) == 8388608) {
                z21 = true;
            } else {
                z21 = false;
            }
            boolean zB8 = z21 | bVarI.b(z12);
            if (i8 == 131072) {
                z22 = true;
            } else {
                z22 = false;
            }
            boolean z2114 = zB8 | z22;
            if ((i9 & 3670016) != 1048576) {
                z23 = true;
            } else {
                z23 = true;
            }
            z24 = z2114 | z23;
            objY5 = bVarI.y();
            if (z24) {
                nonFtdRewardType2 = nonFtdRewardType;
                objY5 = new Function0() { // from class: h3j0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            } else {
                nonFtdRewardType2 = nonFtdRewardType;
                objY5 = new Function0() { // from class: h3j0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(new j4j0.b(z12, nonFtdRewardType2, gr50Var));
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            }
            androidx.compose.ui.d dVarH8 = g3w.h(androidx.compose.foundation.d.d(dVarA8, false, null, null, (Function0) objY5, 15), "welcomeReward");
            aiv aivVarC8 = g75.c(ht.a.a, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS8 = bVarI.S();
            androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(bVarI, dVarH8);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC8, yka.a.f);
            hlh0.a(bVarI, ne00VarS8, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC8, yka.a.d);
            androidx.compose.ui.d dVarG12 = j.g(aVar2, 1.0f);
            bVarI.N(-1003410150);
            bVarI.N(212064437);
            bVarI.X(false);
            mmdVar = (mmd) bVarI.O(kna.h);
            objY6 = bVarI.y();
            if (objY6 == c0042a3) {
                objY6 = rzj.a(mmdVar, bVarI);
            }
            nivVar = (niv) objY6;
            objY7 = bVarI.y();
            if (objY7 == c0042a3) {
                objY7 = pzj.a(bVarI);
            }
            nwaVar = (nwa) objY7;
            objY8 = bVarI.y();
            if (objY8 == c0042a3) {
                objY8 = m.b(Boolean.FALSE);
                bVarI.r(objY8);
            }
            ytwVar = (ytw) objY8;
            objY9 = bVarI.y();
            if (objY9 == c0042a3) {
                objY9 = qzj.a(nwaVar, bVarI);
            }
            twaVar = (twa) objY9;
            objY10 = bVarI.y();
            if (objY10 == c0042a3) {
                objY10 = m.a(Unit.a, epx.a);
                bVarI.r(objY10);
            }
            ytwVar2 = (ytw) objY10;
            zD = bVarI.d(257) | bVarI.A(nivVar);
            objY11 = bVarI.y();
            if (zD) {
                objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                bVarI.r(objY11);
            } else {
                objY11 = new a4j0(ytwVar2, nivVar, twaVar, ytwVar);
                bVarI.r(objY11);
            }
            aiv aivVar8 = (aiv) objY11;
            objY12 = bVarI.y();
            if (objY12 == c0042a3) {
                objY12 = new b4j0(ytwVar, twaVar);
                bVarI.r(objY12);
            }
            Function0 function8 = (Function0) objY12;
            zA2 = bVarI.A(nivVar);
            objY13 = bVarI.y();
            if (zA2) {
                objY13 = new c4j0(nivVar);
                bVarI.r(objY13);
            } else {
                objY13 = new c4j0(nivVar);
                bVarI.r(objY13);
            }
            lsr.a(xa80.b(dVarG12, false, (Function1) objY13), pp8.b(1200550679, new d4j0(ytwVar2, nwaVar, function8, str, op8Var), bVarI), aivVar8, bVarI, 48);
            bVarI.X(false);
            if (z) {
                bVarI.N(-234944392);
                androidx.compose.foundation.layout.d dVar14 = androidx.compose.foundation.layout.d.a;
                androidx.compose.ui.d dVarF14 = dVar14.f(aVar2);
                zA3 = bVarI.A(wd0Var3);
                objY14 = bVarI.y();
                if (zA3) {
                    objY14 = new lq6(wd0Var3, 2);
                    bVarI.r(objY14);
                } else {
                    objY14 = new lq6(wd0Var3, 2);
                    bVarI.r(objY14);
                }
                g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF14, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                crz crzVarA14 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                long j115 = ((lib0) bVarI.O(qyd0Var)).a0;
                androidx.compose.ui.d dVarR14 = j.r(dVar14.b(aVar2, ht.a.e), 16.0f);
                zA4 = bVarI.A(wd0Var3);
                objY15 = bVarI.y();
                if (zA4) {
                    objY15 = new fta(wd0Var3, 3);
                    bVarI.r(objY15);
                } else {
                    objY15 = new fta(wd0Var3, 3);
                    bVarI.r(objY15);
                }
                bVar = bVarI;
                h6n.b(crzVarA14, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR14, (Function1) objY15), "welcomeRewardLock"), j115, bVar, 48, 0);
                bVar.X(false);
            } else {
                bVarI.N(-234944392);
                androidx.compose.foundation.layout.d dVar15 = androidx.compose.foundation.layout.d.a;
                androidx.compose.ui.d dVarF15 = dVar15.f(aVar2);
                zA3 = bVarI.A(wd0Var3);
                objY14 = bVarI.y();
                if (zA3) {
                    objY14 = new lq6(wd0Var3, 2);
                    bVarI.r(objY14);
                } else {
                    objY14 = new lq6(wd0Var3, 2);
                    bVarI.r(objY14);
                }
                g75.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(dVarF15, (Function1) objY14), r58.d(2988121637L), zk40.a), bVarI, 0);
                crz crzVarA15 = erz.a(R.drawable.ic_lock_unify, 0, bVarI);
                long j116 = ((lib0) bVarI.O(qyd0Var)).a0;
                androidx.compose.ui.d dVarR15 = j.r(dVar15.b(aVar2, ht.a.e), 16.0f);
                zA4 = bVarI.A(wd0Var3);
                objY15 = bVarI.y();
                if (zA4) {
                    objY15 = new fta(wd0Var3, 3);
                    bVarI.r(objY15);
                } else {
                    objY15 = new fta(wd0Var3, 3);
                    bVarI.r(objY15);
                }
                bVar = bVarI;
                h6n.b(crzVarA15, null, g3w.h(androidx.compose.ui.graphics.a.a(dVarR15, (Function1) objY15), "welcomeRewardLock"), j116, bVar, 48, 0);
                bVar.X(false);
            }
            bVar.X(true);
            z6 = z20;
            z7 = z13;
            j2 = j3;
        } else {
            nonFtdRewardType2 = nonFtdRewardType;
            bVar = bVarI;
            bVar.G();
            z6 = z3;
            z7 = z4;
            j2 = j;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            final NonFtdRewardType nonFtdRewardType6 = nonFtdRewardType2;
            eVarZ.d = new Function2() { // from class: i3j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w3j0.d(z, z7, z6, j2, str, nonFtdRewardType6, gr50Var, function1, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(1855563027);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarE, ((lib0) bVarI.O(qyd0Var)).b1, zk40.a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
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
            q330.a(j.r(aVar2, 46.0f), ((lib0) bVarI.O(qyd0Var)).a0, 4.0f, 0L, 0, 0.0f, bVarI, 390, 56);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new r3j0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(final androidx.compose.ui.d dVar, final List list, final UiText uiText, final Function1 function1, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        boolean z3;
        androidx.compose.runtime.b bVar;
        or50.a aVar2;
        long jMax;
        androidx.compose.runtime.b bVarI = aVar.i(1345258402);
        int i2 = (i & 6) == 0 ? (bVarI.M(dVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(list) : bVarI.A(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(uiText) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            z3 = z2;
            i2 |= bVarI.b(z3) ? 131072 : 65536;
        } else {
            z3 = z2;
        }
        boolean z4 = false;
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            androidx.compose.ui.d dVarG = j.g(dVar, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            androidx.compose.ui.d dVarH = h.h(dVarG, ((cjb0) bVarI.O(qyd0Var)).g, 0.0f, 2);
            i78 i78VarA = g78.a(new kw0.i(((cjb0) bVarI.O(qyd0Var)).d, true, new hw0()), ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            boolean z5 = (i2 & 112) == 32 || ((i2 & 64) != 0 && bVarI.M(list));
            Object objY = bVarI.y();
            if (z5 || objY == androidx.compose.runtime.a.C0041a.a) {
                ngs ngsVar = new ngs(list.size());
                Iterator it = list.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    ds50 ds50Var = (ds50) it.next();
                    ngsVar.add(Integer.valueOf(i3));
                    if (ds50Var.e) {
                        i3++;
                    }
                }
                objY = kotlin.collections.a.a(ngsVar);
                bVarI.r(objY);
            }
            List list2 = (List) objY;
            androidx.compose.ui.d dVarG2 = j.g(androidx.compose.ui.d.a.b, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(((cjb0) bVarI.O(ejb0.a)).d, true, new hw0()), ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG2);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            g(cb40.a(R.string.wap_home__rewards_to_unlock, new Object[0], bVarI), bVarI, 0);
            c(uiText, false, bVarI, (i2 >> 6) & 14, 2);
            boolean z6 = true;
            bVarI.X(true);
            bVarI.N(1788290711);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                final ds50 ds50Var2 = (ds50) obj;
                boolean z7 = ds50Var2.e;
                int iIntValue = ((Number) list2.get(i4)).intValue();
                if (iIntValue <= 0) {
                    f4c f4cVar = c1j0.a;
                    jMax = 0;
                    aVar2 = null;
                } else {
                    long j = iIntValue;
                    f4c f4cVar2 = c1j0.a;
                    aVar2 = null;
                    jMax = j * (Math.max(320L, 370L) + 180);
                }
                String str = ds50Var2.c;
                NonFtdRewardType nonFtdRewardType = ds50Var2.d;
                or50 or50Var = ds50Var2.f;
                or50.a aVar5 = or50Var instanceof or50.a ? (or50.a) or50Var : aVar2;
                gr50 gr50Var = new gr50(aVar5 != null ? aVar5.a : aVar2);
                op8 op8VarB = pp8.b(-516900673, new Function2() { // from class: d3j0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        a aVar6 = (a) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            kw0.i iVar = new kw0.i(fjb0.d(aVar6).d, true, new hw0());
                            float f2 = fjb0.d(aVar6).e;
                            float f3 = fjb0.d(aVar6).e;
                            float f4 = fjb0.d(aVar6).e;
                            d.a aVar7 = d.a.b;
                            d dVarJ = h.j(aVar7, f2, f3, 0.0f, f4, 4);
                            i78 i78VarA2 = g78.a(iVar, ht.a.m, aVar6, 0);
                            int iHashCode3 = Long.hashCode(aVar6.m());
                            ne00 ne00VarO = aVar6.o();
                            d dVarC3 = c.c(aVar6, dVarJ);
                            yka.k.getClass();
                            tsr.a aVar8 = yka.a.b;
                            if (aVar6.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar6.D();
                            if (aVar6.g()) {
                                aVar6.F(aVar8);
                            } else {
                                aVar6.p();
                            }
                            yka.a.b bVar2 = yka.a.f;
                            hlh0.a(aVar6, i78VarA2, bVar2);
                            yka.a.d dVar2 = yka.a.e;
                            hlh0.a(aVar6, ne00VarO, dVar2);
                            yka.a.C1350a c1350a3 = yka.a.g;
                            if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                                j3c.a(iHashCode3, aVar6, iHashCode3, c1350a3);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar6, dVarC3, cVar);
                            ds50 ds50Var3 = ds50Var2;
                            ResourceUiText resourceUiText = ds50Var3.a;
                            or50 or50Var2 = ds50Var3.f;
                            qyd0 qyd0Var2 = AndroidCompositionLocals_androidKt.b;
                            lkf0.d(resourceUiText.g((Context) aVar6.O(qyd0Var2)), null, fjb0.b(aVar6).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar6).m, aVar6, 0, 0, 131066);
                            lkf0.d(ds50Var3.b.g((Context) aVar6.O(qyd0Var2)), null, fjb0.b(aVar6).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar6).o, aVar6, 0, 0, 131066);
                            a aVar9 = aVar6;
                            boolean z8 = or50Var2 instanceof or50.d;
                            n54.b bVar3 = ht.a.k;
                            n54.a aVar10 = ht.a.n;
                            if (z8) {
                                aVar9.N(72405569);
                                d160 d160VarA2 = b160.a(new kw0.i(fjb0.d(aVar9).d, true, new iw0(aVar10)), bVar3, aVar9, 48);
                                int iHashCode4 = Long.hashCode(aVar9.m());
                                ne00 ne00VarO2 = aVar9.o();
                                d.a aVar11 = aVar7;
                                d dVarC4 = c.c(aVar9, aVar11);
                                if (aVar9.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar9.D();
                                if (aVar9.g()) {
                                    aVar9.F(aVar8);
                                } else {
                                    aVar9.p();
                                }
                                hlh0.a(aVar9, d160VarA2, bVar2);
                                hlh0.a(aVar9, ne00VarO2, dVar2);
                                if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode4))) {
                                    j3c.a(iHashCode4, aVar9, iHashCode4, c1350a3);
                                }
                                hlh0.a(aVar9, dVarC4, cVar);
                                aVar9.N(-600405199);
                                for (jx30 jx30Var : ((or50.d) or50Var2).a) {
                                    String str2 = jx30Var.a.g((Context) aVar9.O(AndroidCompositionLocals_androidKt.b)) + " " + jx30Var.b + "%";
                                    imf0 imf0Var = ((ijb0) aVar9.O(kjb0.a)).m;
                                    qyd0 qyd0Var3 = oib0.a;
                                    long j2 = ((lib0) aVar9.O(qyd0Var3)).o;
                                    d dVarB = androidx.compose.foundation.a.b(aVar11, ((lib0) aVar9.O(qyd0Var3)).d1, j060.c(((zib0) aVar9.O(ajb0.a)).c));
                                    qyd0 qyd0Var4 = ejb0.a;
                                    a aVar12 = aVar9;
                                    lkf0.d(str2, h.g(dVarB, ((cjb0) aVar9.O(qyd0Var4)).d, ((cjb0) aVar9.O(qyd0Var4)).c), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar12, 0, 0, 131064);
                                    aVar9 = aVar12;
                                    aVar11 = aVar11;
                                }
                                aVar9.H();
                                aVar9.s();
                                aVar9.H();
                            } else if (or50Var2 instanceof or50.b) {
                                aVar9.N(73905721);
                                d dVarG3 = h.g(androidx.compose.foundation.a.b(aVar7, fjb0.b(aVar9).d1, j060.c(fjb0.c(aVar9).c)), fjb0.d(aVar9).d, fjb0.d(aVar9).c);
                                d160 d160VarA3 = b160.a(new kw0.i(fjb0.d(aVar9).c, true, new iw0(aVar10)), bVar3, aVar9, 48);
                                int iHashCode5 = Long.hashCode(aVar9.m());
                                ne00 ne00VarO3 = aVar9.o();
                                d dVarC5 = c.c(aVar9, dVarG3);
                                if (aVar9.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar9.D();
                                if (aVar9.g()) {
                                    aVar9.F(aVar8);
                                } else {
                                    aVar9.p();
                                }
                                hlh0.a(aVar9, d160VarA3, bVar2);
                                hlh0.a(aVar9, ne00VarO3, dVar2);
                                if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode5))) {
                                    j3c.a(iHashCode5, aVar9, iHashCode5, c1350a3);
                                }
                                hlh0.a(aVar9, dVarC5, cVar);
                                h9n.a(erz.a(R.drawable.mission_coin, 0, aVar9), null, j.r(aVar7, 16.0f), null, null, 0.0f, null, aVar9, 432, 120);
                                lkf0.d(((or50.b) or50Var2).a, null, fjb0.b(aVar9).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(aVar9).o, aVar9, 0, 0, 131066);
                                aVar9 = aVar9;
                                aVar9.s();
                                aVar9.H();
                            } else if (or50Var2 instanceof or50.a) {
                                aVar9.N(75424907);
                                aVar9.H();
                            } else {
                                if (!Intrinsics.g(or50Var2, or50.c.a)) {
                                    throw rg.a(1664903094, aVar9);
                                }
                                aVar9.N(75471531);
                                aVar9.H();
                            }
                            aVar9.s();
                        } else {
                            aVar6.G();
                        }
                        return Unit.a;
                    }
                }, bVarI);
                int i6 = i2 >> 9;
                int i7 = (i6 & 896) | (i6 & 112) | 100663296 | ((i2 << 12) & 29360128);
                androidx.compose.runtime.b bVar2 = bVarI;
                long j2 = jMax;
                z6 = true;
                d(z7, z, z3, j2, str, nonFtdRewardType, gr50Var, function1, op8VarB, bVar2, i7, 0);
                z3 = z2;
                list2 = list2;
                z4 = false;
                bVarI = bVar2;
                i4 = i5;
            }
            bVar = bVarI;
            bVar.X(z4);
            bVar.X(z6);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: e3j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    w3j0.f(dVar, list, uiText, function1, z, z2, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final String str, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(349878294);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVar = bVarI;
            lkf0.d(str, null, ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVar, i2 & 14, 0, 131066);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i) { // from class: w2j0
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    w3j0.g(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final String str, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-332830855);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(ls7.a(j.g(aVar2, 1.0f), j060.c(((zib0) bVarI.O(ajb0.a)).c)), c68.a(R.color.neutral_grey_300, bVarI), zk40.a);
            qyd0 qyd0Var = ejb0.a;
            androidx.compose.ui.d dVarG = h.g(dVarB, ((cjb0) bVarI.O(qyd0Var)).f, ((cjb0) bVarI.O(qyd0Var)).e);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            crz crzVarA = erz.a(R.drawable.ic_exclamation_circle, 0, bVarI);
            qyd0 qyd0Var2 = oib0.a;
            h6n.b(crzVarA, null, j.r(aVar2, 20.0f), ((lib0) bVarI.O(qyd0Var2)).W, bVarI, 432, 0);
            ty0.a(bVarI, j.w(aVar2, ((cjb0) bVarI.O(qyd0Var)).d));
            lkf0.d(str, null, ((lib0) bVarI.O(qyd0Var2)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, i2 & 14, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i) { // from class: q3j0
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    w3j0.h(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:201:0x046c  */
    /* JADX WARN: Code duplicated, block: B:202:0x0470  */
    /* JADX WARN: Code duplicated, block: B:207:0x048b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0528  */
    /* JADX WARN: Code duplicated, block: B:213:0x053f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0551  */
    /* JADX WARN: Code duplicated, block: B:218:0x056a  */
    /* JADX WARN: Code duplicated, block: B:219:0x057c  */
    /* JADX WARN: Instruction removed from duplicated block: B:218:0x056a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:219:0x057c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(w5f0 w5f0Var, final dup dupVar, final boolean z, final boolean z2, final boolean z3, final Function0<Unit> function0, Function1<? super j4j0, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final w5f0 w5f0Var2;
        androidx.compose.runtime.b bVar;
        long j;
        boolean z4;
        long jC;
        long j2;
        long j3;
        Object dVar;
        boolean z5;
        wd0 wd0Var;
        int i3;
        final wd0 wd0Var2;
        ytw ytwVar;
        wd0 wd0Var3;
        int iHashCode;
        final wd0 wd0Var4;
        String str;
        boolean zA;
        Object objY;
        final Function1<? super j4j0, Unit> function2 = function1;
        NonFtdTaskType nonFtdTaskType = w5f0Var.b;
        androidx.compose.runtime.b bVarI = aVar.i(-806736512);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(w5f0Var) : bVarI.A(w5f0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(dupVar) : bVarI.A(dupVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.b(z3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function0) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= bVarI.A(function2) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (i2 & 599187) != 599186)) {
            boolean z6 = w5f0Var.a;
            int i4 = i2 & 896;
            int i5 = i2 & 7168;
            boolean zD = (i5 == 2048) | bVarI.d(nonFtdTaskType.ordinal()) | bVarI.b(z6) | (i4 == 256);
            Object objY2 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zD || objY2 == c0042a) {
                objY2 = nvc.a((!z6 || z || z2) ? false : true, bVarI);
            }
            ytw ytwVar2 = (ytw) objY2;
            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                bVarI.N(1150099415);
                j = fjb0.b(bVarI).F;
                bVarI.X(false);
            } else {
                bVarI.N(1150148054);
                j = fjb0.b(bVarI).J;
                bVarI.X(false);
            }
            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                bVarI.N(1150242852);
                jC = j58.c(0.2f, fjb0.b(bVarI).F);
                z4 = false;
                bVarI.X(false);
            } else {
                z4 = false;
                bVarI.N(1150309409);
                bVarI.X(false);
                jC = j58.l;
            }
            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                bVarI.N(1150390071);
                j2 = fjb0.b(bVarI).q;
                bVarI.X(false);
            } else {
                bVarI.N(1150438617);
                j2 = fjb0.b(bVarI).o;
                bVarI.X(z4);
            }
            long j4 = j2;
            int i6 = ((Boolean) ytwVar2.getValue()).booleanValue() ? R.drawable.ic__successful : R.drawable.icon_arrow1_right;
            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                bVarI.N(1150682928);
                j3 = fjb0.b(bVarI).S;
                bVarI.X(false);
            } else {
                bVarI.N(1150738294);
                j3 = fjb0.b(bVarI).T;
                bVarI.X(false);
            }
            long j5 = j3;
            boolean zD2 = bVarI.d(nonFtdTaskType.ordinal());
            Object objY3 = bVarI.y();
            if (zD2 || objY3 == c0042a) {
                objY3 = ee0.a(1.0f);
                bVarI.r(objY3);
            }
            final wd0 wd0Var5 = (wd0) objY3;
            boolean zD3 = bVarI.d(nonFtdTaskType.ordinal());
            Object objY4 = bVarI.y();
            if (zD3 || objY4 == c0042a) {
                objY4 = ee0.a(1.0f);
                bVarI.r(objY4);
            }
            wd0 wd0Var6 = (wd0) objY4;
            boolean zD4 = bVarI.d(nonFtdTaskType.ordinal());
            Object objY5 = bVarI.y();
            if (zD4 || objY5 == c0042a) {
                objY5 = ee0.a(1.0f);
                bVarI.r(objY5);
            }
            wd0 wd0Var7 = (wd0) objY5;
            boolean zD5 = bVarI.d(nonFtdTaskType.ordinal());
            Object objY6 = bVarI.y();
            if (zD5 || objY6 == c0042a) {
                objY6 = ee0.a(1.0f);
                bVarI.r(objY6);
            }
            wd0 wd0Var8 = (wd0) objY6;
            final boolean z7 = !Intrinsics.g(dupVar, dup.b.a);
            int i7 = i6;
            Object[] objArr = {nonFtdTaskType, Boolean.valueOf(z6), Boolean.valueOf(z), Boolean.valueOf(z2)};
            int i8 = i2 & 14;
            boolean zA2 = (i4 == 256) | bVarI.A(wd0Var6) | bVarI.A(wd0Var7) | bVarI.A(wd0Var8) | bVarI.M(ytwVar2) | (i8 == 4 || ((i2 & 8) != 0 && bVarI.A(w5f0Var))) | (i5 == 2048) | ((i2 & 458752) == 131072);
            Object objY7 = bVarI.y();
            if (zA2 || objY7 == c0042a) {
                z5 = z6;
                wd0Var = wd0Var7;
                i3 = 4;
                wd0Var2 = wd0Var6;
                dVar = new d(wd0Var2, wd0Var, wd0Var8, w5f0Var, z, z2, function0, ytwVar2, null);
                w5f0Var2 = w5f0Var;
                ytwVar = ytwVar2;
                bVarI.r(dVar);
            } else {
                dVar = objY7;
                z5 = z6;
                ytwVar = ytwVar2;
                wd0Var = wd0Var7;
                i3 = 4;
                w5f0Var2 = w5f0Var;
                wd0Var2 = wd0Var6;
            }
            xvf.h(objArr, (Function2) dVar, bVarI);
            Boolean boolValueOf = Boolean.valueOf(z5);
            Boolean boolValueOf2 = Boolean.valueOf(z3);
            boolean zA3 = bVarI.A(r31) | (i8 == i3 || ((i2 & 8) != 0 && bVarI.A(w5f0Var2))) | ((i2 & 57344) == 16384);
            Object objY8 = bVarI.y();
            if (zA3 || objY8 == c0042a) {
                objY8 = new e(r31, w5f0Var2, z3, null);
                bVarI.r(objY8);
            }
            xvf.f(nonFtdTaskType, boolValueOf, boolValueOf2, (Function2) objY8, bVarI);
            androidx.compose.ui.d dVarA = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(dVarA, 1.0f);
            boolean zA4 = bVarI.A(wd0Var2) | bVarI.A(r31);
            Object objY9 = bVarI.y();
            if (zA4 || objY9 == c0042a) {
                objY9 = new Function1() { // from class: j3j0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.b(((Number) wd0Var2.d()).floatValue());
                        wd0 wd0Var9 = wd0Var5;
                        a7lVar.k(((Number) wd0Var9.d()).floatValue());
                        a7lVar.v(((Number) wd0Var9.d()).floatValue());
                        return Unit.a;
                    }
                };
                bVarI.r(objY9);
            }
            androidx.compose.ui.d dVarA2 = d35.a(androidx.compose.foundation.a.b(ls7.a(androidx.compose.ui.graphics.a.a(dVarG, (Function1) objY9), j060.c(fjb0.c(bVarI).d)), jC, zk40.a), fjb0.a(bVarI).a, j, j060.c(fjb0.c(bVarI).d));
            boolean zB = ((i2 & 3670016) == 1048576) | (i8 == i3 || ((i2 & 8) != 0 && bVarI.A(w5f0Var2))) | bVarI.b(z7);
            Object objY10 = bVarI.y();
            if (zB || objY10 == c0042a) {
                function2 = function1;
                objY10 = new Function0() { // from class: k3j0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        w5f0 w5f0Var3 = w5f0Var2;
                        function2.invoke(new j4j0.c(w5f0Var3.a, w5f0Var3.b, z7));
                        return Unit.a;
                    }
                };
                bVarI.r(objY10);
            } else {
                function2 = function1;
            }
            androidx.compose.ui.d dVarG2 = h.g(androidx.compose.foundation.d.d(dVarA2, false, null, null, (Function0) objY10, 15), fw20.a(R.dimen.space_small, bVarI), fw20.a(R.dimen.space_x_small, bVarI));
            kw0.g gVar = kw0.g;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(gVar, bVar2, bVarI, 54);
            final wd0 wd0Var9 = wd0Var;
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG2);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar3);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                wd0Var3 = wd0Var8;
            } else {
                wd0Var3 = wd0Var8;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                LayoutWeightElement layoutWeightElementA = yy.a(bVarI, dVarC, cVar, 1.0f, true);
                d160 d160VarA2 = b160.a(kw0.a, bVar2, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, layoutWeightElementA);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar3);
                hlh0.a(bVarI, ne00VarS2, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                bVar = bVarI;
                h6n.b(erz.a(w5f0Var2.d, 0, bVarI), null, g3w.h(j.r(dVarA, 20.0f), "id_task_" + nonFtdTaskType), j4, bVar, 48, 0);
                ty0.a(bVar, j.w(dVarA, fjb0.d(bVar).d));
                wd0Var4 = wd0Var3;
                lkf0.d(w5f0Var2.c.g((Context) bVar.O(AndroidCompositionLocals_androidKt.b)), null, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVar).k, bVar, 0, 0, 131066);
                bVar.X(true);
                crz crzVarA = erz.a(i7, 0, bVar);
                androidx.compose.ui.d dVarR = j.r(dVarA, 20.0f);
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVar.N(1877545611);
                    zA = bVar.A(wd0Var4) | bVar.A(wd0Var9);
                    objY = bVar.y();
                    if (zA || objY == c0042a) {
                        objY = new Function1() { // from class: m3j0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                a7l a7lVar = (a7l) obj;
                                a7lVar.getClass();
                                a7lVar.b(((Number) wd0Var4.d()).floatValue());
                                wd0 wd0Var10 = wd0Var9;
                                a7lVar.k(((Number) wd0Var10.d()).floatValue());
                                a7lVar.v(((Number) wd0Var10.d()).floatValue());
                                return Unit.a;
                            }
                        };
                        bVar.r(objY);
                    }
                    dVarA = androidx.compose.ui.graphics.a.a(dVarA, (Function1) objY);
                    bVar.X(false);
                } else {
                    bVar.N(1877825262);
                    bVar.X(false);
                }
                androidx.compose.ui.d dVarN = dVarR.n(dVarA);
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    str = nonFtdTaskType + "_ic_check";
                } else {
                    str = nonFtdTaskType + "_icon_arrow_right";
                }
                h6n.b(crzVarA, null, g3w.h(dVarN, str), j5, bVar, 48, 0);
                bVar.X(true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            LayoutWeightElement layoutWeightElementA2 = yy.a(bVarI, dVarC, cVar2, 1.0f, true);
            d160 d160VarA3 = b160.a(kw0.a, bVar2, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, layoutWeightElementA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar3);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            bVar = bVarI;
            h6n.b(erz.a(w5f0Var2.d, 0, bVarI), null, g3w.h(j.r(dVarA, 20.0f), "id_task_" + nonFtdTaskType), j4, bVar, 48, 0);
            ty0.a(bVar, j.w(dVarA, fjb0.d(bVar).d));
            wd0Var4 = wd0Var3;
            lkf0.d(w5f0Var2.c.g((Context) bVar.O(AndroidCompositionLocals_androidKt.b)), null, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVar).k, bVar, 0, 0, 131066);
            bVar.X(true);
            crz crzVarA2 = erz.a(i7, 0, bVar);
            androidx.compose.ui.d dVarR2 = j.r(dVarA, 20.0f);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVar.N(1877545611);
                zA = bVar.A(wd0Var4) | bVar.A(wd0Var9);
                objY = bVar.y();
                if (zA) {
                    objY = new Function1() { // from class: m3j0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.b(((Number) wd0Var4.d()).floatValue());
                            wd0 wd0Var10 = wd0Var9;
                            a7lVar.k(((Number) wd0Var10.d()).floatValue());
                            a7lVar.v(((Number) wd0Var10.d()).floatValue());
                            return Unit.a;
                        }
                    };
                    bVar.r(objY);
                } else {
                    objY = new Function1() { // from class: m3j0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.b(((Number) wd0Var4.d()).floatValue());
                            wd0 wd0Var10 = wd0Var9;
                            a7lVar.k(((Number) wd0Var10.d()).floatValue());
                            a7lVar.v(((Number) wd0Var10.d()).floatValue());
                            return Unit.a;
                        }
                    };
                    bVar.r(objY);
                }
                dVarA = androidx.compose.ui.graphics.a.a(dVarA, (Function1) objY);
                bVar.X(false);
            } else {
                bVar.N(1877825262);
                bVar.X(false);
            }
            androidx.compose.ui.d dVarN2 = dVarR2.n(dVarA);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                str = nonFtdTaskType + "_ic_check";
            } else {
                str = nonFtdTaskType + "_icon_arrow_right";
            }
            h6n.b(crzVarA2, null, g3w.h(dVarN2, str), j5, bVar, 48, 0);
            bVar.X(true);
        } else {
            w5f0Var2 = w5f0Var;
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final w5f0 w5f0Var3 = w5f0Var2;
            final Function1<? super j4j0, Unit> function3 = function2;
            eVarZ.d = new Function2() { // from class: n3j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w3j0.i(w5f0Var3, dupVar, z, z2, z3, function0, function3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final List<? extends tcf0> list, final Function1<? super j4j0, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z;
        char c2;
        androidx.compose.runtime.b bVarI = aVar.i(1386321882);
        char c3 = ' ';
        int i3 = (bVarI.M(list) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        boolean z2 = true;
        boolean z3 = false;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            androidx.compose.ui.d dVarG = j.g(androidx.compose.ui.d.a.b, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            androidx.compose.ui.d dVarH = h.h(dVarG, ((cjb0) bVarI.O(qyd0Var)).g, 0.0f, 2);
            i78 i78VarA = g78.a(new kw0.i(((cjb0) bVarI.O(qyd0Var)).d, true, new hw0()), ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            g(cb40.a(R.string.common_helps__t_and_c, new Object[0], bVarI), bVarI, 0);
            bVarI.N(1051948885);
            for (tcf0 tcf0Var : list) {
                if (tcf0Var instanceof tcf0.b) {
                    bVarI.N(-875270240);
                    ResourceUiText resourceUiText = ((tcf0.b) tcf0Var).a;
                    resourceUiText.getClass();
                    String strG = resourceUiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                    qyd0 qyd0Var2 = oib0.a;
                    i2 = i3;
                    z = z3;
                    nj5.a(null, ((lib0) bVarI.O(qyd0Var2)).q, strG, ((ijb0) bVarI.O(kjb0.a)).k, null, new j58(((lib0) bVarI.O(qyd0Var2)).q), 0.0f, null, null, bVarI, 0, 465);
                    bVarI.X(z);
                    c2 = ' ';
                } else {
                    i2 = i3;
                    z = z3;
                    if (!(tcf0Var instanceof tcf0.a)) {
                        throw igf0.a(bVarI, 2049973799, z);
                    }
                    bVarI.N(-874922327);
                    tcf0.a aVar3 = (tcf0.a) tcf0Var;
                    ResourceUiText resourceUiText2 = aVar3.a;
                    resourceUiText2.getClass();
                    qyd0 qyd0Var3 = AndroidCompositionLocals_androidKt.b;
                    String strG2 = resourceUiText2.g((Context) bVarI.O(qyd0Var3));
                    ResourceUiText resourceUiText3 = aVar3.b;
                    resourceUiText3.getClass();
                    String strG3 = resourceUiText3.g((Context) bVarI.O(qyd0Var3));
                    strG2.getClass();
                    strG3.getClass();
                    bVarI.N(-288303074);
                    nk0.b bVar = new nk0.b((Object) null);
                    bVar.g(strG2);
                    bVar.g(" ");
                    bVar.k("tag_target", strG3);
                    qyd0 qyd0Var4 = oib0.a;
                    int iL = bVar.l(new ora0(((lib0) bVarI.O(qyd0Var4)).q, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, yef0.c, (ix80) null, 61438));
                    try {
                        bVar.g(strG3);
                        Unit unit = Unit.a;
                        bVar.i(iL);
                        bVar.h();
                        nk0 nk0VarM = bVar.m();
                        bVarI.X(z);
                        long j = ((lib0) bVarI.O(qyd0Var4)).q;
                        long j2 = ((lib0) bVarI.O(qyd0Var4)).q;
                        imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).k;
                        j58 j58Var = new j58(j2);
                        boolean z4 = (i2 & 112) == 32 ? true : z;
                        Object objY = bVarI.y();
                        if (z4 || objY == androidx.compose.runtime.a.C0041a.a) {
                            objY = new pn6(function1, 1);
                            bVarI.r(objY);
                        }
                        c2 = ' ';
                        nj5.a(null, j, null, imf0Var, nk0VarM, j58Var, 0.0f, (Function0) objY, "tag_target", bVarI, 100663296, 69);
                        bVarI.X(z);
                    } catch (Throwable th) {
                        bVar.i(iL);
                        throw th;
                    }
                }
                z3 = z;
                c3 = c2;
                z2 = true;
                i3 = i2;
            }
            bVarI.X(z3);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, list, function1) { // from class: u2j0
                public final /* synthetic */ List a;
                public final /* synthetic */ Function1 b;

                {
                    this.a = list;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    w3j0.j(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(878943395);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            androidx.compose.ui.d dVarJ = h.j(dVarG, ((cjb0) bVarI.O(qyd0Var)).g, ((cjb0) bVarI.O(qyd0Var)).g, ((cjb0) bVarI.O(qyd0Var)).g, 0.0f, 8);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            mw90.a("https://s.sporty.net/cms/welcome_reward_fade_fcef711b46.png", "image", j.w(aVar2, 200.0f), null, null, null, null, bVarI, 438, 2040);
            ty0.a(bVarI, j.i(aVar2, ((cjb0) bVarI.O(qyd0Var)).g));
            lkf0.d(cb40.a(R.string.wap_home__welcome_reward_title, new Object[0], bVarI), null, ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).c, bVarI, 0, 0, 130042);
            bVarI = bVarI;
            iib0.a(aVar2, ((cjb0) bVarI.O(qyd0Var)).i, bVarI, true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new y7y(i);
        }
    }

    public static final void l(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-428703579);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            odd0.d(v8j0.c(androidx.compose.ui.d.a.b), cb40.a(R.string.wap_home__welcome_rewards, new Object[0], bVarI), ((lib0) bVarI.O(oib0.a)).b1, null, null, null, pp8.b(-1024437458, new zta(function0, i3), bVarI), bVarI, 1572864, 56);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: v3j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    w3j0.l(function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(final m4j0 m4j0Var, final tmz tmzVar, final Function1<? super j4j0, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(1215799375);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(m4j0Var) : bVarI.A(m4j0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(tmzVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Unit unit = Unit.a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new f(function1, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, unit, (Function2) objY);
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.e(androidx.compose.ui.d.a.b, 1.0f), ((lib0) bVarI.O(oib0.a)).b1, zk40.a);
            boolean z2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && bVarI.A(m4j0Var))) | (i3 == 256);
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: t3j0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        szr.h(szrVar, null, w0a.a, 3);
                        final m4j0 m4j0Var2 = m4j0Var;
                        final Function1 function2 = function1;
                        szr.h(szrVar, null, new op8(-2113806141, new gaj() { // from class: s2j0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    aiv aivVarC = g75.c(ht.a.a, false);
                                    int iHashCode = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO = aVar2.o();
                                    d.a aVar3 = d.a.b;
                                    d dVarC = c.c(aVar2, aVar3);
                                    yka.k.getClass();
                                    tsr.a aVar4 = yka.a.b;
                                    if (aVar2.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar2.D();
                                    if (aVar2.g()) {
                                        aVar2.F(aVar4);
                                    } else {
                                        aVar2.p();
                                    }
                                    yka.a.b bVar = yka.a.f;
                                    hlh0.a(aVar2, aivVarC, bVar);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar2, ne00VarO, dVar);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar2, dVarC, cVar);
                                    d dVarF = androidx.compose.foundation.layout.d.a.f(aVar3);
                                    Object objY3 = aVar2.y();
                                    if (objY3 == a.C0041a.a) {
                                        objY3 = new v2j0();
                                        aVar2.r(objY3);
                                    }
                                    mw90.a("https://s.sporty.net/cms/coupon_area_e4aeaaa355.png", "image", androidx.compose.ui.graphics.a.a(dVarF, (Function1) objY3), null, null, d0b.a.d, null, aVar2, 1572918, 1976);
                                    d dVarE = j.e(aVar3, 1.0f);
                                    qyd0 qyd0Var = ejb0.a;
                                    d dVarJ = h.j(dVarE, 0.0f, 0.0f, 0.0f, ((cjb0) aVar2.O(qyd0Var)).i, 7);
                                    i78 i78VarA = g78.a(new kw0.i(((cjb0) aVar2.O(qyd0Var)).h, true, new hw0()), ht.a.n, aVar2, 48);
                                    int iHashCode2 = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO2 = aVar2.o();
                                    d dVarC2 = c.c(aVar2, dVarJ);
                                    if (aVar2.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar2.D();
                                    if (aVar2.g()) {
                                        aVar2.F(aVar4);
                                    } else {
                                        aVar2.p();
                                    }
                                    hlh0.a(aVar2, i78VarA, bVar);
                                    hlh0.a(aVar2, ne00VarO2, dVar);
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar2, dVarC2, cVar);
                                    m4j0 m4j0Var3 = m4j0Var2;
                                    w3j0.a(m4j0Var3.a, m4j0Var3.b, m4j0Var3.d, m4j0Var3.c, m4j0Var3.f, m4j0Var3.g, m4j0Var3.h, function2, aVar2, 0);
                                    aVar2.s();
                                    aVar2.s();
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        szr.h(szrVar, null, new op8(-1212738206, new gaj() { // from class: t2j0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((gwr) obj2).getClass();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    w3j0.j(m4j0Var2.e, function2, aVar2, 0);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, true), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            aur.a(dVarB, null, tmzVar, false, null, null, null, false, null, (Function1) objY2, bVarI, (i2 << 3) & 896, 506);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: u3j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    w3j0.m(m4j0Var, tmzVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void n(final r4j0 r4j0Var, final Function1<? super j4j0, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        r4j0Var.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-2054251594);
        int i2 = (bVarI.M(r4j0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d dVarC = c9j.c(androidx.compose.ui.d.a.b, AnalyticsEvent.FS_ATTRIBUTE_DATA_OP, AnalyticsParam.DATA_WELCOME_REWARDS_CLOSE);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new r2j0();
                bVarI.r(objY);
            }
            bVar = bVarI;
            hy60.a(xa80.b(dVarC, false, (Function1) objY), pp8.b(1385786482, new Function2() { // from class: y2j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final Function1 function2 = function1;
                        boolean zM = aVar2.M(function2);
                        Object objY2 = aVar2.y();
                        if (zM || objY2 == a.C0041a.a) {
                            objY2 = new Function0() { // from class: s3j0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function2.invoke(j4j0.d.a);
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        }
                        w3j0.l((Function0) objY2, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, 0, 0L, 0L, null, pp8.b(32810695, new gaj() { // from class: f3j0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tmz tmzVar = (tmz) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        r4j0.a aVar3 = r4j0.a.a;
                        r4j0 r4j0Var2 = r4j0Var;
                        if (Intrinsics.g(r4j0Var2, aVar3)) {
                            aVar2.N(-1789043956);
                            w3j0.e(0, aVar2);
                            aVar2.H();
                        } else {
                            if (!(r4j0Var2 instanceof r4j0.b)) {
                                throw rg.a(1466307910, aVar2);
                            }
                            aVar2.N(-1788946399);
                            w3j0.m(((r4j0.b) r4j0Var2).a, tmzVar, function1, aVar2, (iIntValue << 3) & 112);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 805306416, 508);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: l3j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    w3j0.n(r4j0Var, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
