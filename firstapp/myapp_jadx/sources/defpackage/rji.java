package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.loyalty.RewardShowOffData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class rji {

    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballLoadingKt$FootballLoading$1$1$1", f = "FootballLoading.kt", l = {41}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ smi.b b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ Function0<Unit> d;
        public final /* synthetic */ Function0<Unit> e;
        public final /* synthetic */ Context f;

        /* JADX INFO: renamed from: rji$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballLoadingKt$FootballLoading$1$1$1$result$1", f = "FootballLoading.kt", l = {52}, m = "invokeSuspend", v = 2)
        public static final class C1055a extends tje0 implements Function2<v5b, v1b<? super List<? extends dbn>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ smi.b d;

            /* JADX INFO: renamed from: rji$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballLoadingKt$FootballLoading$1$1$1$result$1$1$1", f = "FootballLoading.kt", l = {49}, m = "invokeSuspend", v = 2)
            public static final class C1056a extends tje0 implements Function2<v5b, v1b<? super dbn>, Object> {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ Context c;
                public final /* synthetic */ ctt d;
                public final /* synthetic */ smi.b e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1056a(Context context, ctt cttVar, smi.b bVar, v1b<? super C1056a> v1bVar) {
                    super(2, v1bVar);
                    this.c = context;
                    this.d = cttVar;
                    this.e = bVar;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C1056a c1056a = new C1056a(this.c, this.d, this.e, v1bVar);
                    c1056a.b = obj;
                    return c1056a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super dbn> v1bVar) {
                    return ((C1056a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    Object bVar;
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    try {
                        if (i == 0) {
                            uj50.b(obj);
                            Context context = this.c;
                            ctt cttVar = this.d;
                            smi.b bVar2 = this.e;
                            zi50.a aVar = zi50.b;
                            nan.a aVar2 = new nan.a(context);
                            aVar2.c = cttVar.a(bVar2.a);
                            nan nanVarA = aVar2.a();
                            m9n m9nVarA = qw90.a(context);
                            this.b = null;
                            this.a = 1;
                            obj = m9nVarA.b(nanVarA, this);
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
                        bVar = (dbn) obj;
                        zi50.a aVar3 = zi50.b;
                    } catch (Throwable th) {
                        zi50.a aVar4 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                    if (bVar instanceof zi50.b) {
                        return null;
                    }
                    return bVar;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1055a(Context context, smi.b bVar, v1b<? super C1055a> v1bVar) {
                super(2, v1bVar);
                this.c = context;
                this.d = bVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1055a c1055a = new C1055a(this.c, this.d, v1bVar);
                c1055a.b = obj;
                return c1055a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super List<? extends dbn>> v1bVar) {
                return ((C1055a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                uag uagVar = ctt.d;
                ArrayList arrayList = new ArrayList(l48.r(uagVar, 10));
                q3.b bVar = new q3.b();
                while (bVar.hasNext()) {
                    arrayList.add(ej5.a(v5bVar, null, new C1056a(this.c, (ctt) bVar.next(), this.d, null), 3));
                }
                this.b = null;
                this.a = 1;
                Object objA = up1.a(arrayList, this);
                return objA == y5bVar ? y5bVar : objA;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(smi.b bVar, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, Context context, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = bVar;
            this.c = function0;
            this.d = function1;
            this.e = function2;
            this.f = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, v1bVar);
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
                smi.b bVar = this.b;
                if (bVar.b) {
                    this.c.invoke();
                }
                odd oddVar = zu7.f;
                C1055a c1055a = new C1055a(this.f, bVar, null);
                this.a = 1;
                obj = ej5.d(oddVar, c1055a, this);
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
            List list = (List) obj;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!(((dbn) it.next()) instanceof dfe0)) {
                        this.e.invoke();
                    }
                }
                this.d.invoke();
            } else {
                this.d.invoke();
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballLoadingKt$FootballLoading$1$2$1", f = "FootballLoading.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ smi.b a;
        public final /* synthetic */ Function2<kp7, RewardShowOffData, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(smi.b bVar, Function2<? super kp7, ? super RewardShowOffData, Unit> function2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.a = bVar;
            this.b = function2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            RewardShowOffData rewardShowOffData;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            smi.b bVar = this.a;
            kp7 kp7Var = bVar.c;
            if (kp7Var != null && (rewardShowOffData = bVar.d) != null) {
                this.b.invoke(kp7Var, rewardShowOffData);
            }
            return Unit.a;
        }
    }

    public static final void a(final smi.b bVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function2<? super kp7, ? super RewardShowOffData, Unit> function3, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Function0<Unit> function4;
        Function0<Unit> function5;
        androidx.compose.runtime.b bVar2;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(596653718);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function4 = function0;
            i2 |= bVarI.A(function4) ? 32 : 16;
        } else {
            function4 = function0;
        }
        if ((i & 384) == 0) {
            function5 = function1;
            i2 |= bVarI.A(function5) ? 256 : 128;
        } else {
            function5 = function1;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Unit unit = Unit.a;
            int i4 = i3 & 14;
            boolean zA = (i4 == 4) | ((i3 & 112) == 32) | bVarI.A(context) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                a aVar4 = new a(bVar, function4, function5, function2, context, null);
                bVarI.r(aVar4);
                objY = aVar4;
            }
            xvf.e(bVarI, unit, (Function2) objY);
            kp7 kp7Var = bVar.c;
            RewardShowOffData rewardShowOffData = bVar.d;
            boolean z = (i4 == 4) | ((57344 & i3) == 16384);
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new b(bVar, function3, null);
                bVarI.r(objY2);
            }
            xvf.g(kp7Var, rewardShowOffData, (Function2) objY2, bVarI);
            q330.a(j.r(aVar2, 46.0f), j58.f, 4.0f, 0L, 0, 0.0f, bVarI, 438, 56);
            bVar2 = bVarI;
            bVar2.X(true);
        } else {
            bVar2 = bVarI;
            bVar2.G();
        }
        e eVarZ = bVar2.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qji
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rji.a(bVar, function0, function1, function2, function3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
